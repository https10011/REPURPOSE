package defpackage;

import android.util.Log;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import androidx.fragment.app.f;
import io.jsonwebtoken.JwtParser;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class ms1 {
    public int a;
    public int b;
    public final Fragment c;
    public final ArrayList d;
    public final LinkedHashSet e;
    public boolean f;
    public boolean g;
    public final f h;

    public ms1(int i, int i2, f fVar, rk rkVar) {
        if (i == 0 || i2 == 0) {
            throw null;
        }
        Fragment fragment = fVar.c;
        fragment.getClass();
        if (i == 0 || i2 == 0) {
            throw null;
        }
        fragment.getClass();
        this.a = i;
        this.b = i2;
        this.c = fragment;
        this.d = new ArrayList();
        this.e = new LinkedHashSet();
        rkVar.a(new ab(this, 17));
        this.h = fVar;
    }

    public final void a() {
        LinkedHashSet linkedHashSet = this.e;
        if (this.f) {
            return;
        }
        this.f = true;
        if (linkedHashSet.isEmpty()) {
            b();
            return;
        }
        for (rk rkVar : CollectionsKt.E(linkedHashSet)) {
            synchronized (rkVar) {
                try {
                    if (!rkVar.a) {
                        rkVar.a = true;
                        rkVar.c = true;
                        qk qkVar = rkVar.b;
                        if (qkVar != null) {
                            try {
                                qkVar.onCancel();
                            } catch (Throwable th) {
                                synchronized (rkVar) {
                                    rkVar.c = false;
                                    rkVar.notifyAll();
                                    throw th;
                                }
                            }
                        }
                        synchronized (rkVar) {
                            rkVar.c = false;
                            rkVar.notifyAll();
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final void b() {
        if (!this.g) {
            if (e.H(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.g = true;
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((Runnable) obj).run();
            }
        }
        this.h.k();
    }

    public final void c(int i, int i2) {
        if (i == 0 || i2 == 0) {
            throw null;
        }
        int iV = ts.v(i2);
        Fragment fragment = this.c;
        if (iV == 0) {
            if (this.a != 1) {
                if (e.H(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + fragment + " mFinalState = " + ck1.A(this.a) + " -> " + ck1.A(i) + JwtParser.SEPARATOR_CHAR);
                }
                this.a = i;
                return;
            }
            return;
        }
        if (iV == 1) {
            if (this.a == 1) {
                if (e.H(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + fragment + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + ck1.z(this.b) + " to ADDING.");
                }
                this.a = 2;
                this.b = 2;
                return;
            }
            return;
        }
        if (iV != 2) {
            return;
        }
        if (e.H(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: For fragment " + fragment + " mFinalState = " + ck1.A(this.a) + " -> REMOVED. mLifecycleImpact  = " + ck1.z(this.b) + " to REMOVING.");
        }
        this.a = 1;
        this.b = 3;
    }

    public final void d() {
        int i = this.b;
        f fVar = this.h;
        if (i != 2) {
            if (i == 3) {
                Fragment fragment = fVar.c;
                fragment.getClass();
                View viewK = fragment.K();
                if (e.H(2)) {
                    Log.v("FragmentManager", "Clearing focus " + viewK.findFocus() + " on view " + viewK + " for Fragment " + fragment);
                }
                viewK.clearFocus();
                return;
            }
            return;
        }
        Fragment fragment2 = fVar.c;
        fragment2.getClass();
        View viewFindFocus = fragment2.t0.findFocus();
        if (viewFindFocus != null) {
            fragment2.f().k = viewFindFocus;
            if (e.H(2)) {
                Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + fragment2);
            }
        }
        View viewK2 = this.c.K();
        if (viewK2.getParent() == null) {
            fVar.b();
            viewK2.setAlpha(0.0f);
        }
        if (viewK2.getAlpha() == 0.0f && viewK2.getVisibility() == 0) {
            viewK2.setVisibility(4);
        }
        tf0 tf0Var = fragment2.w0;
        viewK2.setAlpha(tf0Var == null ? 1.0f : tf0Var.j);
    }

    public final String toString() {
        StringBuilder sbN = ts.n("Operation {", Integer.toHexString(System.identityHashCode(this)), "} {finalState = ");
        sbN.append(ck1.A(this.a));
        sbN.append(" lifecycleImpact = ");
        sbN.append(ck1.z(this.b));
        sbN.append(" fragment = ");
        sbN.append(this.c);
        sbN.append('}');
        return sbN.toString();
    }
}
