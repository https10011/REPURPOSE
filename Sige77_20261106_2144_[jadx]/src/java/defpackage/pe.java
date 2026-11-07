package defpackage;

import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class pe implements gg0 {
    public final ArrayList a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public boolean h;
    public String i;
    public int j;
    public CharSequence k;
    public int l;
    public CharSequence m;
    public ArrayList n;
    public ArrayList o;
    public boolean p;
    public final e q;
    public boolean r;
    public int s;

    public pe(e eVar) {
        eVar.E();
        wf0 wf0Var = eVar.u;
        if (wf0Var != null) {
            wf0Var.Y.getClassLoader();
        }
        this.a = new ArrayList();
        this.h = true;
        this.p = false;
        this.s = -1;
        this.q = eVar;
    }

    @Override // defpackage.gg0
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (e.H(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.g) {
            return true;
        }
        e eVar = this.q;
        if (eVar.d == null) {
            eVar.d = new ArrayList();
        }
        eVar.d.add(this);
        return true;
    }

    public final void b(qg0 qg0Var) {
        this.a.add(qg0Var);
        qg0Var.d = this.b;
        qg0Var.e = this.c;
        qg0Var.f = this.d;
        qg0Var.g = this.e;
    }

    public final void c(int i) {
        if (this.g) {
            if (e.H(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            ArrayList arrayList = this.a;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                qg0 qg0Var = (qg0) arrayList.get(i2);
                Fragment fragment = qg0Var.b;
                if (fragment != null) {
                    fragment.d0 += i;
                    if (e.H(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + qg0Var.b + " to " + qg0Var.b.d0);
                    }
                }
            }
        }
    }

    public final int d(boolean z) {
        if (this.r) {
            uq1.q("commit already called");
            return 0;
        }
        if (e.H(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new g01());
            f("  ", printWriter, true);
            printWriter.close();
        }
        this.r = true;
        boolean z2 = this.g;
        e eVar = this.q;
        if (z2) {
            this.s = eVar.i.getAndIncrement();
        } else {
            this.s = -1;
        }
        eVar.w(this, z);
        return this.s;
    }

    public final void e(int i, Fragment fragment, String str, int i2) {
        String str2 = fragment.z0;
        if (str2 != null) {
            og0.d(fragment, str2);
        }
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = fragment.k0;
            if (str3 != null && !str.equals(str3)) {
                StringBuilder sb = new StringBuilder("Can't change tag of fragment ");
                sb.append(fragment);
                sb.append(": was ");
                uq1.q(y00.l(sb, fragment.k0, " now ", str));
                return;
            }
            fragment.k0 = str;
        }
        if (i != 0) {
            if (i == -1) {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            }
            int i3 = fragment.i0;
            if (i3 != 0 && i3 != i) {
                StringBuilder sb2 = new StringBuilder("Can't change container ID of fragment ");
                sb2.append(fragment);
                int i4 = fragment.i0;
                sb2.append(": was ");
                sb2.append(i4);
                sb2.append(" now ");
                sb2.append(i);
                throw new IllegalStateException(sb2.toString());
            }
            fragment.i0 = i;
            fragment.j0 = i;
        }
        b(new qg0(i2, fragment));
        fragment.e0 = this.q;
    }

    public final void f(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.i);
            printWriter.print(" mIndex=");
            printWriter.print(this.s);
            printWriter.print(" mCommitted=");
            printWriter.println(this.r);
            if (this.f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f));
            }
            if (this.b != 0 || this.c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.c));
            }
            if (this.d != 0 || this.e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.e));
            }
            if (this.j != 0 || this.k != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.j));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.k);
            }
            if (this.l != 0 || this.m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.l));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.m);
            }
        }
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            qg0 qg0Var = (qg0) arrayList.get(i);
            switch (qg0Var.a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                    str2 = "REPLACE";
                    break;
                case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                    str2 = "REMOVE";
                    break;
                case oc1.LONG_FIELD_NUMBER /* 4 */:
                    str2 = "HIDE";
                    break;
                case oc1.STRING_FIELD_NUMBER /* 5 */:
                    str2 = "SHOW";
                    break;
                case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                    str2 = "DETACH";
                    break;
                case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                    str2 = "ATTACH";
                    break;
                case oc1.BYTES_FIELD_NUMBER /* 8 */:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + qg0Var.a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(qg0Var.b);
            if (z) {
                if (qg0Var.d != 0 || qg0Var.e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(qg0Var.d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(qg0Var.e));
                }
                if (qg0Var.f != 0 || qg0Var.g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(qg0Var.f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(qg0Var.g));
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.s >= 0) {
            sb.append(" #");
            sb.append(this.s);
        }
        if (this.i != null) {
            sb.append(" ");
            sb.append(this.i);
        }
        sb.append("}");
        return sb.toString();
    }
}
