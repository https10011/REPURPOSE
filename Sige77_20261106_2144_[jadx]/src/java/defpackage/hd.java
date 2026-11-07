package defpackage;

import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class hd extends pz1 {
    public ArrayList n0;
    public boolean o0;
    public int p0;
    public boolean q0;
    public int r0;

    @Override // defpackage.pz1
    public final void A(View view) {
        super.A(view);
        int size = this.n0.size();
        for (int i = 0; i < size; i++) {
            ((pz1) this.n0.get(i)).A(view);
        }
    }

    @Override // defpackage.pz1
    public final pz1 B(nz1 nz1Var) {
        super.B(nz1Var);
        return this;
    }

    @Override // defpackage.pz1
    public final void C(View view) {
        super.C(view);
        int size = this.n0.size();
        for (int i = 0; i < size; i++) {
            ((pz1) this.n0.get(i)).C(view);
        }
    }

    @Override // defpackage.pz1
    public final void D() {
        ArrayList arrayList;
        if (this.n0.isEmpty()) {
            K();
            o();
            return;
        }
        wz1 wz1Var = new wz1();
        wz1Var.b = this;
        ArrayList arrayList2 = this.n0;
        int size = arrayList2.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            ((pz1) obj).c(wz1Var);
        }
        this.p0 = this.n0.size();
        if (this.o0) {
            ArrayList arrayList3 = this.n0;
            int size2 = arrayList3.size();
            while (i < size2) {
                Object obj2 = arrayList3.get(i);
                i++;
                ((pz1) obj2).D();
            }
            return;
        }
        int i3 = 1;
        while (true) {
            int size3 = this.n0.size();
            arrayList = this.n0;
            if (i3 >= size3) {
                break;
            }
            ((pz1) arrayList.get(i3 - 1)).c(new wz1((pz1) this.n0.get(i3)));
            i3++;
        }
        pz1 pz1Var = (pz1) arrayList.get(0);
        if (pz1Var != null) {
            pz1Var.D();
        }
    }

    @Override // defpackage.pz1
    public final void E(long j) {
        ArrayList arrayList;
        this.c = j;
        if (j < 0 || (arrayList = this.n0) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((pz1) this.n0.get(i)).E(j);
        }
    }

    @Override // defpackage.pz1
    public final void F(y21 y21Var) {
        this.r0 |= 8;
        int size = this.n0.size();
        for (int i = 0; i < size; i++) {
            ((pz1) this.n0.get(i)).F(y21Var);
        }
    }

    @Override // defpackage.pz1
    public final void G(TimeInterpolator timeInterpolator) {
        this.r0 |= 1;
        ArrayList arrayList = this.n0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((pz1) this.n0.get(i)).G(timeInterpolator);
            }
        }
        this.d = timeInterpolator;
    }

    @Override // defpackage.pz1
    public final void H(mo1 mo1Var) {
        super.H(mo1Var);
        this.r0 |= 4;
        if (this.n0 != null) {
            for (int i = 0; i < this.n0.size(); i++) {
                ((pz1) this.n0.get(i)).H(mo1Var);
            }
        }
    }

    @Override // defpackage.pz1
    public final void I() {
        this.r0 |= 2;
        int size = this.n0.size();
        for (int i = 0; i < size; i++) {
            ((pz1) this.n0.get(i)).I();
        }
    }

    @Override // defpackage.pz1
    public final void J(long j) {
        this.b = j;
    }

    @Override // defpackage.pz1
    public final String L(String str) {
        String strL = super.L(str);
        for (int i = 0; i < this.n0.size(); i++) {
            strL = strL + "\n" + ((pz1) this.n0.get(i)).L(str.concat("  "));
        }
        return strL;
    }

    public final void M(pz1 pz1Var) {
        this.n0.add(pz1Var);
        pz1Var.w = this;
        long j = this.c;
        if (j >= 0) {
            pz1Var.E(j);
        }
        if ((this.r0 & 1) != 0) {
            pz1Var.G(this.d);
        }
        if ((this.r0 & 2) != 0) {
            pz1Var.I();
        }
        if ((this.r0 & 4) != 0) {
            pz1Var.H(this.i0);
        }
        if ((this.r0 & 8) != 0) {
            pz1Var.F(null);
        }
    }

    @Override // defpackage.pz1
    public final void cancel() {
        super.cancel();
        int size = this.n0.size();
        for (int i = 0; i < size; i++) {
            ((pz1) this.n0.get(i)).cancel();
        }
    }

    @Override // defpackage.pz1
    public final void f(zz1 zz1Var) {
        View view = zz1Var.b;
        if (x(view)) {
            ArrayList arrayList = this.n0;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                pz1 pz1Var = (pz1) obj;
                if (pz1Var.x(view)) {
                    pz1Var.f(zz1Var);
                    zz1Var.c.add(pz1Var);
                }
            }
        }
    }

    @Override // defpackage.pz1
    public final void h(zz1 zz1Var) {
        int size = this.n0.size();
        for (int i = 0; i < size; i++) {
            ((pz1) this.n0.get(i)).h(zz1Var);
        }
    }

    @Override // defpackage.pz1
    public final void i(zz1 zz1Var) {
        View view = zz1Var.b;
        if (x(view)) {
            ArrayList arrayList = this.n0;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                pz1 pz1Var = (pz1) obj;
                if (pz1Var.x(view)) {
                    pz1Var.i(zz1Var);
                    zz1Var.c.add(pz1Var);
                }
            }
        }
    }

    @Override // defpackage.pz1
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final pz1 clone() {
        hd hdVar = (hd) super.clone();
        hdVar.n0 = new ArrayList();
        int size = this.n0.size();
        for (int i = 0; i < size; i++) {
            pz1 pz1VarClone = ((pz1) this.n0.get(i)).clone();
            hdVar.n0.add(pz1VarClone);
            pz1VarClone.w = hdVar;
        }
        return hdVar;
    }

    @Override // defpackage.pz1
    public final void n(ViewGroup viewGroup, ud2 ud2Var, ud2 ud2Var2, ArrayList arrayList, ArrayList arrayList2) {
        long j = this.b;
        int size = this.n0.size();
        for (int i = 0; i < size; i++) {
            pz1 pz1Var = (pz1) this.n0.get(i);
            if (j > 0 && (this.o0 || i == 0)) {
                long j2 = pz1Var.b;
                if (j2 > 0) {
                    pz1Var.J(j2 + j);
                } else {
                    pz1Var.J(j);
                }
            }
            pz1Var.n(viewGroup, ud2Var, ud2Var2, arrayList, arrayList2);
        }
    }
}
