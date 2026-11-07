package defpackage;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.widget.ListView;
import com.hjq.toast.BuildConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class pz1 implements Cloneable {
    public static final Animator[] j0 = new Animator[0];
    public static final int[] k0 = {2, 1, 3, 4};
    public static final mo1 l0 = new mo1(9);
    public static final ThreadLocal m0 = new ThreadLocal();
    public ArrayList X;
    public ArrayList Y;
    public nz1[] Z;
    public final String a = getClass().getName();
    public long b = -1;
    public long c = -1;
    public TimeInterpolator d = null;
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public ud2 i = new ud2(7);
    public ud2 v = new ud2(7);
    public hd w = null;
    public final int[] W = k0;
    public final ArrayList a0 = new ArrayList();
    public Animator[] b0 = j0;
    public int c0 = 0;
    public boolean d0 = false;
    public boolean e0 = false;
    public pz1 f0 = null;
    public ArrayList g0 = null;
    public ArrayList h0 = new ArrayList();
    public mo1 i0 = l0;

    public static void d(ud2 ud2Var, View view, zz1 zz1Var) {
        mb mbVar = (mb) ud2Var.a;
        mb mbVar2 = (mb) ud2Var.d;
        SparseArray sparseArray = (SparseArray) ud2Var.b;
        s01 s01Var = (s01) ud2Var.c;
        mbVar.put(view, zz1Var);
        int id = view.getId();
        if (id >= 0) {
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        WeakHashMap weakHashMap = x52.a;
        String transitionName = view.getTransitionName();
        if (transitionName != null) {
            if (mbVar2.containsKey(transitionName)) {
                mbVar2.put(transitionName, null);
            } else {
                mbVar2.put(transitionName, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (s01Var.a) {
                    int i = s01Var.d;
                    long[] jArr = s01Var.b;
                    Object[] objArr = s01Var.c;
                    int i2 = 0;
                    for (int i3 = 0; i3 < i; i3++) {
                        Object obj = objArr[i3];
                        if (obj != g93.c) {
                            if (i3 != i2) {
                                jArr[i2] = jArr[i3];
                                objArr[i2] = obj;
                                objArr[i3] = null;
                            }
                            i2++;
                        }
                    }
                    s01Var.a = false;
                    s01Var.d = i2;
                }
                if (jw.e(s01Var.d, itemIdAtPosition, s01Var.b) < 0) {
                    view.setHasTransientState(true);
                    s01Var.g(view, itemIdAtPosition);
                    return;
                }
                View view2 = (View) s01Var.d(itemIdAtPosition);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                    s01Var.g(null, itemIdAtPosition);
                }
            }
        }
    }

    public static mb r() {
        ThreadLocal threadLocal = m0;
        mb mbVar = (mb) threadLocal.get();
        if (mbVar != null) {
            return mbVar;
        }
        mb mbVar2 = new mb(0);
        threadLocal.set(mbVar2);
        return mbVar2;
    }

    public static boolean y(zz1 zz1Var, zz1 zz1Var2, String str) {
        Object obj = zz1Var.a.get(str);
        Object obj2 = zz1Var2.a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public void A(View view) {
        if (this.e0) {
            return;
        }
        ArrayList arrayList = this.a0;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.b0);
        this.b0 = j0;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.pause();
        }
        this.b0 = animatorArr;
        z(this, uq1.e);
        this.d0 = true;
    }

    public pz1 B(nz1 nz1Var) {
        pz1 pz1Var;
        ArrayList arrayList = this.g0;
        if (arrayList != null) {
            if (!arrayList.remove(nz1Var) && (pz1Var = this.f0) != null) {
                pz1Var.B(nz1Var);
            }
            if (this.g0.size() == 0) {
                this.g0 = null;
            }
        }
        return this;
    }

    public void C(View view) {
        if (this.d0) {
            if (!this.e0) {
                ArrayList arrayList = this.a0;
                int size = arrayList.size();
                Animator[] animatorArr = (Animator[]) arrayList.toArray(this.b0);
                this.b0 = j0;
                for (int i = size - 1; i >= 0; i--) {
                    Animator animator = animatorArr[i];
                    animatorArr[i] = null;
                    animator.resume();
                }
                this.b0 = animatorArr;
                z(this, uq1.f);
            }
            this.d0 = false;
        }
    }

    public void D() {
        K();
        mb mbVarR = r();
        ArrayList arrayList = this.h0;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            Animator animator = (Animator) obj;
            if (mbVarR.containsKey(animator)) {
                K();
                if (animator != null) {
                    animator.addListener(new lz1(this, mbVarR));
                    long j = this.c;
                    if (j >= 0) {
                        animator.setDuration(j);
                    }
                    long j2 = this.b;
                    if (j2 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j2);
                    }
                    TimeInterpolator timeInterpolator = this.d;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new n3(this, 5));
                    animator.start();
                }
            }
        }
        this.h0.clear();
        o();
    }

    public void E(long j) {
        this.c = j;
    }

    public void G(TimeInterpolator timeInterpolator) {
        this.d = timeInterpolator;
    }

    public void H(mo1 mo1Var) {
        if (mo1Var == null) {
            this.i0 = l0;
        } else {
            this.i0 = mo1Var;
        }
    }

    public void J(long j) {
        this.b = j;
    }

    public final void K() {
        if (this.c0 == 0) {
            z(this, uq1.b);
            this.e0 = false;
        }
        this.c0++;
    }

    public String L(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        if (this.c != -1) {
            sb.append("dur(");
            sb.append(this.c);
            sb.append(") ");
        }
        if (this.b != -1) {
            sb.append("dly(");
            sb.append(this.b);
            sb.append(") ");
        }
        if (this.d != null) {
            sb.append("interp(");
            sb.append(this.d);
            sb.append(") ");
        }
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f;
        if (size > 0 || arrayList2.size() > 0) {
            sb.append("tgts(");
            if (arrayList.size() > 0) {
                for (int i = 0; i < arrayList.size(); i++) {
                    if (i > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList.get(i));
                }
            }
            if (arrayList2.size() > 0) {
                for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                    if (i2 > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList2.get(i2));
                }
            }
            sb.append(")");
        }
        return sb.toString();
    }

    public void c(nz1 nz1Var) {
        if (this.g0 == null) {
            this.g0 = new ArrayList();
        }
        this.g0.add(nz1Var);
    }

    public void cancel() {
        ArrayList arrayList = this.a0;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.b0);
        this.b0 = j0;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.cancel();
        }
        this.b0 = animatorArr;
        z(this, uq1.d);
    }

    public abstract void f(zz1 zz1Var);

    public final void g(View view, boolean z) {
        if (view == null) {
            return;
        }
        view.getId();
        if (view.getParent() instanceof ViewGroup) {
            zz1 zz1Var = new zz1(view);
            if (z) {
                i(zz1Var);
            } else {
                f(zz1Var);
            }
            zz1Var.c.add(this);
            h(zz1Var);
            if (z) {
                d(this.i, view, zz1Var);
            } else {
                d(this.v, view, zz1Var);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                g(viewGroup.getChildAt(i), z);
            }
        }
    }

    public abstract void i(zz1 zz1Var);

    public final void j(ViewGroup viewGroup, boolean z) {
        k(z);
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f;
        if (size <= 0 && arrayList2.size() <= 0) {
            g(viewGroup, z);
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            View viewFindViewById = viewGroup.findViewById(((Integer) arrayList.get(i)).intValue());
            if (viewFindViewById != null) {
                zz1 zz1Var = new zz1(viewFindViewById);
                if (z) {
                    i(zz1Var);
                } else {
                    f(zz1Var);
                }
                zz1Var.c.add(this);
                h(zz1Var);
                if (z) {
                    d(this.i, viewFindViewById, zz1Var);
                } else {
                    d(this.v, viewFindViewById, zz1Var);
                }
            }
        }
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            View view = (View) arrayList2.get(i2);
            zz1 zz1Var2 = new zz1(view);
            if (z) {
                i(zz1Var2);
            } else {
                f(zz1Var2);
            }
            zz1Var2.c.add(this);
            h(zz1Var2);
            if (z) {
                d(this.i, view, zz1Var2);
            } else {
                d(this.v, view, zz1Var2);
            }
        }
    }

    public final void k(boolean z) {
        if (z) {
            ((mb) this.i.a).clear();
            ((SparseArray) this.i.b).clear();
            ((s01) this.i.c).c();
        } else {
            ((mb) this.v.a).clear();
            ((SparseArray) this.v.b).clear();
            ((s01) this.v.c).c();
        }
    }

    @Override // 
    /* JADX INFO: renamed from: l */
    public pz1 clone() {
        try {
            pz1 pz1Var = (pz1) super.clone();
            pz1Var.h0 = new ArrayList();
            pz1Var.i = new ud2(7);
            pz1Var.v = new ud2(7);
            pz1Var.X = null;
            pz1Var.Y = null;
            pz1Var.f0 = this;
            pz1Var.g0 = null;
            return pz1Var;
        } catch (CloneNotSupportedException e) {
            sm0.n(e);
            return null;
        }
    }

    public Animator m(ViewGroup viewGroup, zz1 zz1Var, zz1 zz1Var2) {
        return null;
    }

    public void n(ViewGroup viewGroup, ud2 ud2Var, ud2 ud2Var2, ArrayList arrayList, ArrayList arrayList2) {
        int i;
        int i2;
        View view;
        zz1 zz1Var;
        Animator animator;
        zz1 zz1Var2;
        mb mbVarR = r();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        q().getClass();
        int i3 = 0;
        while (i3 < size) {
            zz1 zz1Var3 = (zz1) arrayList.get(i3);
            zz1 zz1Var4 = (zz1) arrayList2.get(i3);
            if (zz1Var3 != null && !zz1Var3.c.contains(this)) {
                zz1Var3 = null;
            }
            if (zz1Var4 != null && !zz1Var4.c.contains(this)) {
                zz1Var4 = null;
            }
            if ((zz1Var3 != null || zz1Var4 != null) && (zz1Var3 == null || zz1Var4 == null || v(zz1Var3, zz1Var4))) {
                Animator animatorM = m(viewGroup, zz1Var3, zz1Var4);
                if (animatorM != null) {
                    String str = this.a;
                    if (zz1Var4 != null) {
                        view = zz1Var4.b;
                        String[] strArrT = t();
                        if (strArrT != null && strArrT.length > 0) {
                            zz1Var2 = new zz1(view);
                            zz1 zz1Var5 = (zz1) ((mb) ud2Var2.a).get(view);
                            i = size;
                            if (zz1Var5 != null) {
                                int i4 = 0;
                                while (i4 < strArrT.length) {
                                    String str2 = strArrT[i4];
                                    int i5 = i3;
                                    zz1Var2.a.put(str2, zz1Var5.a.get(str2));
                                    i4++;
                                    i3 = i5;
                                    zz1Var5 = zz1Var5;
                                }
                            }
                            i2 = i3;
                            int i6 = mbVarR.c;
                            int i7 = 0;
                            while (true) {
                                if (i7 >= i6) {
                                    animator = animatorM;
                                    break;
                                }
                                mz1 mz1Var = (mz1) mbVarR.get((Animator) mbVarR.f(i7));
                                if (mz1Var.c != null && mz1Var.a == view && mz1Var.b.equals(str) && mz1Var.c.equals(zz1Var2)) {
                                    animator = null;
                                    break;
                                }
                                i7++;
                            }
                        } else {
                            i = size;
                            i2 = i3;
                            animator = animatorM;
                            zz1Var2 = null;
                        }
                        animatorM = animator;
                        zz1Var = zz1Var2;
                    } else {
                        i = size;
                        i2 = i3;
                        view = zz1Var3.b;
                        zz1Var = null;
                    }
                    if (animatorM != null) {
                        WindowId windowId = viewGroup.getWindowId();
                        mz1 mz1Var2 = new mz1();
                        mz1Var2.a = view;
                        mz1Var2.b = str;
                        mz1Var2.c = zz1Var;
                        mz1Var2.d = windowId;
                        mz1Var2.e = this;
                        mz1Var2.f = animatorM;
                        mbVarR.put(animatorM, mz1Var2);
                        this.h0.add(animatorM);
                    }
                }
                i3 = i2 + 1;
                size = i;
            }
            i = size;
            i2 = i3;
            i3 = i2 + 1;
            size = i;
        }
        if (sparseIntArray.size() != 0) {
            for (int i8 = 0; i8 < sparseIntArray.size(); i8++) {
                mz1 mz1Var3 = (mz1) mbVarR.get((Animator) this.h0.get(sparseIntArray.keyAt(i8)));
                mz1Var3.f.setStartDelay(mz1Var3.f.getStartDelay() + (((long) sparseIntArray.valueAt(i8)) - Long.MAX_VALUE));
            }
        }
    }

    public final void o() {
        int i = this.c0 - 1;
        this.c0 = i;
        if (i == 0) {
            z(this, uq1.c);
            for (int i2 = 0; i2 < ((s01) this.i.c).h(); i2++) {
                View view = (View) ((s01) this.i.c).i(i2);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i3 = 0; i3 < ((s01) this.v.c).h(); i3++) {
                View view2 = (View) ((s01) this.v.c).i(i3);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.e0 = true;
        }
    }

    public final zz1 p(View view, boolean z) {
        hd hdVar = this.w;
        if (hdVar != null) {
            return hdVar.p(view, z);
        }
        ArrayList arrayList = z ? this.X : this.Y;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            }
            zz1 zz1Var = (zz1) arrayList.get(i);
            if (zz1Var == null) {
                return null;
            }
            if (zz1Var.b == view) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            return (zz1) (z ? this.Y : this.X).get(i);
        }
        return null;
    }

    public final pz1 q() {
        hd hdVar = this.w;
        return hdVar != null ? hdVar.q() : this;
    }

    public String[] t() {
        return null;
    }

    public final String toString() {
        return L(BuildConfig.FLAVOR);
    }

    public final zz1 u(View view, boolean z) {
        hd hdVar = this.w;
        if (hdVar != null) {
            return hdVar.u(view, z);
        }
        return (zz1) ((mb) (z ? this.i : this.v).a).get(view);
    }

    public boolean v(zz1 zz1Var, zz1 zz1Var2) {
        if (zz1Var != null && zz1Var2 != null) {
            String[] strArrT = t();
            if (strArrT != null) {
                for (String str : strArrT) {
                    if (y(zz1Var, zz1Var2, str)) {
                        return true;
                    }
                }
            } else {
                Iterator it = zz1Var.a.keySet().iterator();
                while (it.hasNext()) {
                    if (y(zz1Var, zz1Var2, (String) it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean x(View view) {
        int id = view.getId();
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f;
        return (size == 0 && arrayList2.size() == 0) || arrayList.contains(Integer.valueOf(id)) || arrayList2.contains(view);
    }

    public final void z(pz1 pz1Var, uq1 uq1Var) {
        pz1 pz1Var2 = this.f0;
        if (pz1Var2 != null) {
            pz1Var2.z(pz1Var, uq1Var);
        }
        ArrayList arrayList = this.g0;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.g0.size();
        nz1[] nz1VarArr = this.Z;
        if (nz1VarArr == null) {
            nz1VarArr = new nz1[size];
        }
        this.Z = null;
        nz1[] nz1VarArr2 = (nz1[]) this.g0.toArray(nz1VarArr);
        for (int i = 0; i < size; i++) {
            nz1 nz1Var = nz1VarArr2[i];
            switch (uq1Var.a) {
                case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                    nz1Var.e(pz1Var);
                    break;
                case oc1.LONG_FIELD_NUMBER /* 4 */:
                    nz1Var.d(pz1Var);
                    break;
                case oc1.STRING_FIELD_NUMBER /* 5 */:
                    nz1Var.f(pz1Var);
                    break;
                case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                    nz1Var.b();
                    break;
                default:
                    nz1Var.c();
                    break;
            }
            nz1VarArr2[i] = null;
        }
        this.Z = nz1VarArr2;
    }

    public void I() {
    }

    public void F(y21 y21Var) {
    }

    public void h(zz1 zz1Var) {
    }
}
