package defpackage;

import android.animation.Animator;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowId;
import java.util.ArrayList;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class tz1 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public pz1 a;
    public ViewGroup b;

    /* JADX WARN: Code duplicated, block: B:101:0x0216  */
    /* JADX WARN: Code duplicated, block: B:102:0x0222  */
    /* JADX WARN: Code duplicated, block: B:106:0x0234  */
    /* JADX WARN: Code duplicated, block: B:133:0x01e0 A[EDGE_INSN: B:133:0x01e0->B:89:0x01e0 BREAK  A[LOOP:1: B:18:0x0084->B:88:0x01d9], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:14:0x004c  */
    /* JADX WARN: Code duplicated, block: B:163:0x0200 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:16:0x0053 A[LOOP:0: B:15:0x0051->B:16:0x0053, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:20:0x0089  */
    /* JADX WARN: Code duplicated, block: B:22:0x008d  */
    /* JADX WARN: Code duplicated, block: B:24:0x0090  */
    /* JADX WARN: Code duplicated, block: B:26:0x0093  */
    /* JADX WARN: Code duplicated, block: B:29:0x009a  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:44:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:46:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:48:0x010b  */
    /* JADX WARN: Code duplicated, block: B:61:0x014e  */
    /* JADX WARN: Code duplicated, block: B:63:0x015d  */
    /* JADX WARN: Code duplicated, block: B:76:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:78:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:92:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:94:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:99:0x0208  */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ArrayList arrayList;
        int i;
        ud2 ud2Var;
        ud2 ud2Var2;
        mb mbVar;
        mb mbVar2;
        int i2;
        int[] iArr;
        boolean z;
        int i3;
        int i4;
        mb mbVarR;
        int i5;
        Animator animator;
        mz1 mz1Var;
        zz1 zz1Var;
        zz1 zz1Var2;
        int i6;
        boolean z2;
        int i7;
        View view;
        zz1 zz1Var3;
        mb mbVar3;
        int i8;
        int i9;
        View view2;
        View view3;
        SparseArray sparseArray;
        int size;
        int i10;
        View view4;
        View view5;
        s01 s01Var;
        int iH;
        int i11;
        View view6;
        boolean z3;
        int size2;
        int i12;
        pz1 pz1Var = this.a;
        ViewGroup viewGroup = this.b;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        boolean z4 = true;
        if (!uz1.c.remove(viewGroup)) {
            return true;
        }
        mb mbVarB = uz1.b();
        ArrayList arrayList2 = (ArrayList) mbVarB.get(viewGroup);
        if (arrayList2 != null) {
            arrayList = arrayList2.size() > 0 ? new ArrayList(arrayList2) : null;
            arrayList2.add(pz1Var);
            pz1Var.c(new sz1(this, mbVarB));
            i = 0;
            pz1Var.j(viewGroup, false);
            if (arrayList != null) {
                size2 = arrayList.size();
                i12 = 0;
                while (i12 < size2) {
                    Object obj = arrayList.get(i12);
                    i12++;
                    ((pz1) obj).C(viewGroup);
                }
            }
            pz1Var.X = new ArrayList();
            pz1Var.Y = new ArrayList();
            ud2Var = pz1Var.i;
            ud2Var2 = pz1Var.v;
            mbVar = new mb((mb) ud2Var.a);
            mbVar2 = new mb((mb) ud2Var2.a);
            i2 = 0;
            while (true) {
                iArr = pz1Var.W;
                if (i2 < iArr.length) {
                    break;
                }
                i6 = iArr[i2];
                if (i6 != z4) {
                    z2 = z4;
                    for (i7 = mbVar.c - 1; i7 >= 0; i7--) {
                        view = (View) mbVar.f(i7);
                        if (view == null && pz1Var.x(view) && (zz1Var3 = (zz1) mbVar2.remove(view)) != null && pz1Var.x(zz1Var3.b)) {
                            pz1Var.X.add((zz1) mbVar.h(i7));
                            pz1Var.Y.add(zz1Var3);
                        }
                    }
                } else if (i6 != 2) {
                    z2 = z4;
                    mbVar3 = (mb) ud2Var.d;
                    mb mbVar4 = (mb) ud2Var2.d;
                    i8 = mbVar3.c;
                    for (i9 = 0; i9 < i8; i9++) {
                        view2 = (View) mbVar3.j(i9);
                        if (view2 == null && pz1Var.x(view2) && (view3 = (View) mbVar4.get(mbVar3.f(i9))) != null && pz1Var.x(view3)) {
                            zz1 zz1Var4 = (zz1) mbVar.get(view2);
                            zz1 zz1Var5 = (zz1) mbVar2.get(view3);
                            if (zz1Var4 != null && zz1Var5 != null) {
                                pz1Var.X.add(zz1Var4);
                                pz1Var.Y.add(zz1Var5);
                                mbVar.remove(view2);
                                mbVar2.remove(view3);
                            }
                        }
                    }
                } else if (i6 != 3) {
                    if (i6 == 4) {
                        s01Var = (s01) ud2Var.c;
                        s01 s01Var2 = (s01) ud2Var2.c;
                        iH = s01Var.h();
                        i11 = i;
                        while (i11 < iH) {
                            view6 = (View) s01Var.i(i11);
                            if (view6 == null && pz1Var.x(view6)) {
                                boolean z5 = z4;
                                View view7 = (View) s01Var2.d(s01Var.f(i11));
                                if (view7 == null || !pz1Var.x(view7)) {
                                    z3 = z5;
                                } else {
                                    zz1 zz1Var6 = (zz1) mbVar.get(view6);
                                    zz1 zz1Var7 = (zz1) mbVar2.get(view7);
                                    if (zz1Var6 == null || zz1Var7 == null) {
                                        z3 = z5;
                                    } else {
                                        z3 = z5;
                                        pz1Var.X.add(zz1Var6);
                                        pz1Var.Y.add(zz1Var7);
                                        mbVar.remove(view6);
                                        mbVar2.remove(view7);
                                    }
                                }
                            } else {
                                z3 = z4;
                            }
                            i11++;
                            z4 = z3;
                        }
                    }
                    z2 = z4;
                } else {
                    z2 = z4;
                    sparseArray = (SparseArray) ud2Var.b;
                    SparseArray sparseArray2 = (SparseArray) ud2Var2.b;
                    size = sparseArray.size();
                    for (i10 = 0; i10 < size; i10++) {
                        view4 = (View) sparseArray.valueAt(i10);
                        if (view4 == null && pz1Var.x(view4) && (view5 = (View) sparseArray2.get(sparseArray.keyAt(i10))) != null && pz1Var.x(view5)) {
                            zz1 zz1Var8 = (zz1) mbVar.get(view4);
                            zz1 zz1Var9 = (zz1) mbVar2.get(view5);
                            if (zz1Var8 != null && zz1Var9 != null) {
                                pz1Var.X.add(zz1Var8);
                                pz1Var.Y.add(zz1Var9);
                                mbVar.remove(view4);
                                mbVar2.remove(view5);
                            }
                        }
                    }
                }
                i2++;
                z4 = z2;
                i = 0;
            }
            z = z4;
            for (i3 = 0; i3 < mbVar.c; i3++) {
                zz1Var2 = (zz1) mbVar.j(i3);
                if (pz1Var.x(zz1Var2.b)) {
                    pz1Var.X.add(zz1Var2);
                    pz1Var.Y.add(null);
                }
            }
            for (i4 = 0; i4 < mbVar2.c; i4++) {
                zz1Var = (zz1) mbVar2.j(i4);
                if (pz1Var.x(zz1Var.b)) {
                    pz1Var.Y.add(zz1Var);
                    pz1Var.X.add(null);
                }
            }
            mbVarR = pz1.r();
            int i13 = mbVarR.c;
            WindowId windowId = viewGroup.getWindowId();
            i5 = i13 - 1;
            while (i5 >= 0) {
                animator = (Animator) mbVarR.f(i5);
                if (animator == null && (mz1Var = (mz1) mbVarR.get(animator)) != null) {
                    pz1 pz1Var2 = mz1Var.e;
                    View view8 = mz1Var.a;
                    if (view8 != null && windowId.equals(mz1Var.d)) {
                        zz1 zz1Var10 = mz1Var.c;
                        boolean z6 = z;
                        zz1 zz1VarU = pz1Var.u(view8, z6);
                        zz1 zz1VarP = pz1Var.p(view8, z6);
                        if (zz1VarU == null && zz1VarP == null) {
                            zz1VarP = (zz1) ((mb) pz1Var.v.a).get(view8);
                        }
                        if ((zz1VarU != null || zz1VarP != null) && pz1Var2.v(zz1Var10, zz1VarP)) {
                            pz1Var2.q().getClass();
                            if (animator.isRunning() || animator.isStarted()) {
                                animator.cancel();
                            } else {
                                mbVarR.remove(animator);
                            }
                        }
                    }
                }
                i5--;
                z = true;
            }
            pz1Var.n(viewGroup, pz1Var.i, pz1Var.v, pz1Var.X, pz1Var.Y);
            pz1Var.D();
            return true;
        }
        arrayList2 = new ArrayList();
        mbVarB.put(viewGroup, arrayList2);
        arrayList2.add(pz1Var);
        pz1Var.c(new sz1(this, mbVarB));
        i = 0;
        pz1Var.j(viewGroup, false);
        if (arrayList != null) {
            size2 = arrayList.size();
            i12 = 0;
            while (i12 < size2) {
                Object obj2 = arrayList.get(i12);
                i12++;
                ((pz1) obj2).C(viewGroup);
            }
        }
        pz1Var.X = new ArrayList();
        pz1Var.Y = new ArrayList();
        ud2Var = pz1Var.i;
        ud2Var2 = pz1Var.v;
        mbVar = new mb((mb) ud2Var.a);
        mbVar2 = new mb((mb) ud2Var2.a);
        i2 = 0;
        while (true) {
            iArr = pz1Var.W;
            if (i2 < iArr.length) {
                break;
                break;
            }
            i6 = iArr[i2];
            if (i6 != z4) {
                z2 = z4;
                while (i7 >= 0) {
                    view = (View) mbVar.f(i7);
                    if (view == null) {
                    }
                }
            } else if (i6 != 2) {
                z2 = z4;
                mbVar3 = (mb) ud2Var.d;
                mb mbVar5 = (mb) ud2Var2.d;
                i8 = mbVar3.c;
                while (i9 < i8) {
                    view2 = (View) mbVar3.j(i9);
                    if (view2 == null) {
                    }
                }
            } else if (i6 != 3) {
                if (i6 == 4) {
                    s01Var = (s01) ud2Var.c;
                    s01 s01Var3 = (s01) ud2Var2.c;
                    iH = s01Var.h();
                    i11 = i;
                    while (i11 < iH) {
                        view6 = (View) s01Var.i(i11);
                        if (view6 == null) {
                            z3 = z4;
                        } else {
                            z3 = z4;
                        }
                        i11++;
                        z4 = z3;
                    }
                }
                z2 = z4;
            } else {
                z2 = z4;
                sparseArray = (SparseArray) ud2Var.b;
                SparseArray sparseArray3 = (SparseArray) ud2Var2.b;
                size = sparseArray.size();
                while (i10 < size) {
                    view4 = (View) sparseArray.valueAt(i10);
                    if (view4 == null) {
                    }
                }
            }
            i2++;
            z4 = z2;
            i = 0;
        }
        z = z4;
        while (i3 < mbVar.c) {
            zz1Var2 = (zz1) mbVar.j(i3);
            if (pz1Var.x(zz1Var2.b)) {
                pz1Var.X.add(zz1Var2);
                pz1Var.Y.add(null);
            }
        }
        while (i4 < mbVar2.c) {
            zz1Var = (zz1) mbVar2.j(i4);
            if (pz1Var.x(zz1Var.b)) {
                pz1Var.Y.add(zz1Var);
                pz1Var.X.add(null);
            }
        }
        mbVarR = pz1.r();
        int i14 = mbVarR.c;
        WindowId windowId2 = viewGroup.getWindowId();
        i5 = i14 - 1;
        while (i5 >= 0) {
            animator = (Animator) mbVarR.f(i5);
            if (animator == null) {
            }
            i5--;
            z = true;
        }
        pz1Var.n(viewGroup, pz1Var.i, pz1Var.v, pz1Var.X, pz1Var.Y);
        pz1Var.D();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ViewGroup viewGroup = this.b;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        uz1.c.remove(viewGroup);
        ArrayList arrayList = (ArrayList) uz1.b().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((pz1) obj).C(viewGroup);
            }
        }
        this.a.k(true);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
