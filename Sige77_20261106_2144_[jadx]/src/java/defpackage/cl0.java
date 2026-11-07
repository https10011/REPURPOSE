package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class cl0 extends qr {
    public float p0 = -1.0f;
    public int q0 = -1;
    public int r0 = -1;
    public cr s0 = this.I;
    public int t0 = 0;
    public boolean u0;

    public cl0() {
        this.Q.clear();
        this.Q.add(this.s0);
        int length = this.P.length;
        for (int i = 0; i < length; i++) {
            this.P[i] = this.s0;
        }
    }

    @Override // defpackage.qr
    public final void L(zx0 zx0Var, boolean z) {
        if (this.S == null) {
            return;
        }
        cr crVar = this.s0;
        zx0Var.getClass();
        int iN = zx0.n(crVar);
        if (this.t0 == 1) {
            this.X = iN;
            this.Y = 0;
            G(this.S.k());
            J(0);
            return;
        }
        this.X = 0;
        this.Y = iN;
        J(this.S.n());
        G(0);
    }

    public final void M(int i) {
        this.s0.l(i);
        this.u0 = true;
    }

    public final void N(int i) {
        if (this.t0 == i) {
            return;
        }
        this.t0 = i;
        ArrayList arrayList = this.Q;
        arrayList.clear();
        if (this.t0 == 1) {
            this.s0 = this.H;
        } else {
            this.s0 = this.I;
        }
        arrayList.add(this.s0);
        cr[] crVarArr = this.P;
        int length = crVarArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            crVarArr[i2] = this.s0;
        }
    }

    @Override // defpackage.qr
    public final void b(zx0 zx0Var, boolean z) {
        rr rrVar = (rr) this.S;
        if (rrVar == null) {
            return;
        }
        Object objI = rrVar.i(2);
        Object objI2 = rrVar.i(4);
        qr qrVar = this.S;
        boolean z2 = qrVar != null && qrVar.o0[0] == 2;
        if (this.t0 == 0) {
            objI = rrVar.i(3);
            objI2 = rrVar.i(5);
            qr qrVar2 = this.S;
            z2 = qrVar2 != null && qrVar2.o0[1] == 2;
        }
        if (this.u0) {
            cr crVar = this.s0;
            if (crVar.c) {
                as1 as1VarK = zx0Var.k(crVar);
                zx0Var.d(as1VarK, this.s0.d());
                if (this.q0 != -1) {
                    if (z2) {
                        zx0Var.f(zx0Var.k(objI2), as1VarK, 0, 5);
                    }
                } else if (this.r0 != -1 && z2) {
                    as1 as1VarK2 = zx0Var.k(objI2);
                    zx0Var.f(as1VarK, zx0Var.k(objI), 0, 5);
                    zx0Var.f(as1VarK2, as1VarK, 0, 5);
                }
                this.u0 = false;
                return;
            }
        }
        if (this.q0 != -1) {
            as1 as1VarK3 = zx0Var.k(this.s0);
            zx0Var.e(as1VarK3, zx0Var.k(objI), this.q0, 8);
            if (z2) {
                zx0Var.f(zx0Var.k(objI2), as1VarK3, 0, 5);
                return;
            }
            return;
        }
        if (this.r0 != -1) {
            as1 as1VarK4 = zx0Var.k(this.s0);
            as1 as1VarK5 = zx0Var.k(objI2);
            zx0Var.e(as1VarK4, as1VarK5, -this.r0, 8);
            if (z2) {
                zx0Var.f(as1VarK4, zx0Var.k(objI), 0, 5);
                zx0Var.f(as1VarK5, as1VarK4, 0, 5);
                return;
            }
            return;
        }
        if (this.p0 != -1.0f) {
            as1 as1VarK6 = zx0Var.k(this.s0);
            as1 as1VarK7 = zx0Var.k(objI2);
            float f = this.p0;
            nb nbVarL = zx0Var.l();
            nbVarL.d.g(as1VarK6, -1.0f);
            nbVarL.d.g(as1VarK7, f);
            zx0Var.c(nbVarL);
        }
    }

    @Override // defpackage.qr
    public final boolean c() {
        return true;
    }

    @Override // defpackage.qr
    public final cr i(int i) {
        int iV = ts.v(i);
        if (iV != 1) {
            if (iV != 2) {
                if (iV != 3) {
                    if (iV != 4) {
                        return null;
                    }
                }
            }
            if (this.t0 == 0) {
                return this.s0;
            }
            return null;
        }
        if (this.t0 == 1) {
            return this.s0;
        }
        return null;
    }

    @Override // defpackage.qr
    public final boolean x() {
        return this.u0;
    }

    @Override // defpackage.qr
    public final boolean y() {
        return this.u0;
    }
}
