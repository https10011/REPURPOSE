package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class ye extends bm0 {
    public int r0;
    public boolean s0;
    public int t0;
    public boolean u0;

    public final boolean O() {
        int i;
        int i2;
        int i3;
        boolean z = true;
        int i4 = 0;
        while (true) {
            i = this.q0;
            if (i4 >= i) {
                break;
            }
            qr qrVar = this.p0[i4];
            if ((this.s0 || qrVar.c()) && ((((i2 = this.r0) == 0 || i2 == 1) && !qrVar.x()) || (((i3 = this.r0) == 2 || i3 == 3) && !qrVar.y()))) {
                z = false;
            }
            i4++;
        }
        if (!z || i <= 0) {
            return false;
        }
        int iMax = 0;
        boolean z2 = false;
        for (int i5 = 0; i5 < this.q0; i5++) {
            qr qrVar2 = this.p0[i5];
            if (this.s0 || qrVar2.c()) {
                if (!z2) {
                    int i6 = this.r0;
                    if (i6 == 0) {
                        iMax = qrVar2.i(2).d();
                    } else if (i6 == 1) {
                        iMax = qrVar2.i(4).d();
                    } else if (i6 == 2) {
                        iMax = qrVar2.i(3).d();
                    } else if (i6 == 3) {
                        iMax = qrVar2.i(5).d();
                    }
                    z2 = true;
                }
                int i7 = this.r0;
                if (i7 == 0) {
                    iMax = Math.min(iMax, qrVar2.i(2).d());
                } else if (i7 == 1) {
                    iMax = Math.max(iMax, qrVar2.i(4).d());
                } else if (i7 == 2) {
                    iMax = Math.min(iMax, qrVar2.i(3).d());
                } else if (i7 == 3) {
                    iMax = Math.max(iMax, qrVar2.i(5).d());
                }
            }
        }
        int i8 = iMax + this.t0;
        int i9 = this.r0;
        if (i9 == 0 || i9 == 1) {
            E(i8, i8);
        } else {
            F(i8, i8);
        }
        this.u0 = true;
        return true;
    }

    public final int P() {
        int i = this.r0;
        if (i == 0 || i == 1) {
            return 0;
        }
        return (i == 2 || i == 3) ? 1 : -1;
    }

    @Override // defpackage.qr
    public final void b(zx0 zx0Var, boolean z) {
        boolean z2;
        int i;
        int i2;
        cr[] crVarArr = this.P;
        cr crVar = this.H;
        crVarArr[0] = crVar;
        int i3 = 2;
        cr crVar2 = this.I;
        crVarArr[2] = crVar2;
        cr crVar3 = this.J;
        crVarArr[1] = crVar3;
        cr crVar4 = this.K;
        crVarArr[3] = crVar4;
        for (cr crVar5 : crVarArr) {
            crVar5.i = zx0Var.k(crVar5);
        }
        int i4 = this.r0;
        if (i4 < 0 || i4 >= 4) {
            return;
        }
        cr crVar6 = crVarArr[i4];
        if (!this.u0) {
            O();
        }
        if (this.u0) {
            this.u0 = false;
            int i5 = this.r0;
            if (i5 == 0 || i5 == 1) {
                zx0Var.d(crVar.i, this.X);
                zx0Var.d(crVar3.i, this.X);
                return;
            } else {
                if (i5 == 2 || i5 == 3) {
                    zx0Var.d(crVar2.i, this.Y);
                    zx0Var.d(crVar4.i, this.Y);
                    return;
                }
                return;
            }
        }
        int i6 = 0;
        while (true) {
            if (i6 >= this.q0) {
                z2 = false;
                break;
            }
            qr qrVar = this.p0[i6];
            if ((this.s0 || qrVar.c()) && ((((i2 = this.r0) == 0 || i2 == 1) && qrVar.o0[0] == 3 && qrVar.H.f != null && qrVar.J.f != null) || ((i2 == 2 || i2 == 3) && qrVar.o0[1] == 3 && qrVar.I.f != null && qrVar.K.f != null))) {
                z2 = true;
                break;
            }
            i6++;
        }
        boolean z3 = crVar.g() || crVar3.g();
        boolean z4 = crVar2.g() || crVar4.g();
        int i7 = !(!z2 && (((i = this.r0) == 0 && z3) || ((i == 2 && z4) || ((i == 1 && z3) || (i == 3 && z4))))) ? 4 : 5;
        int i8 = 0;
        while (i8 < this.q0) {
            qr qrVar2 = this.p0[i8];
            if (this.s0 || qrVar2.c()) {
                as1 as1VarK = zx0Var.k(qrVar2.P[this.r0]);
                cr[] crVarArr2 = qrVar2.P;
                int i9 = this.r0;
                cr crVar7 = crVarArr2[i9];
                crVar7.i = as1VarK;
                cr crVar8 = crVar7.f;
                int i10 = (crVar8 == null || crVar8.d != this) ? 0 : crVar7.g;
                if (i9 == 0 || i9 == i3) {
                    as1 as1Var = crVar6.i;
                    int i11 = this.t0 - i10;
                    nb nbVarL = zx0Var.l();
                    as1 as1VarM = zx0Var.m();
                    as1VarM.d = 0;
                    nbVarL.c(as1Var, as1VarK, as1VarM, i11);
                    zx0Var.c(nbVarL);
                } else {
                    as1 as1Var2 = crVar6.i;
                    int i12 = this.t0 + i10;
                    nb nbVarL2 = zx0Var.l();
                    as1 as1VarM2 = zx0Var.m();
                    as1VarM2.d = 0;
                    nbVarL2.b(as1Var2, as1VarK, as1VarM2, i12);
                    zx0Var.c(nbVarL2);
                }
                zx0Var.e(crVar6.i, as1VarK, this.t0 + i10, i7);
            }
            i8++;
            i3 = 2;
        }
        int i13 = this.r0;
        if (i13 == 0) {
            zx0Var.e(crVar3.i, crVar.i, 0, 8);
            zx0Var.e(crVar.i, this.S.J.i, 0, 4);
            zx0Var.e(crVar.i, this.S.H.i, 0, 0);
            return;
        }
        if (i13 == 1) {
            zx0Var.e(crVar.i, crVar3.i, 0, 8);
            zx0Var.e(crVar.i, this.S.H.i, 0, 4);
            zx0Var.e(crVar.i, this.S.J.i, 0, 0);
        } else if (i13 == 2) {
            zx0Var.e(crVar4.i, crVar2.i, 0, 8);
            zx0Var.e(crVar2.i, this.S.K.i, 0, 4);
            zx0Var.e(crVar2.i, this.S.I.i, 0, 0);
        } else if (i13 == 3) {
            zx0Var.e(crVar2.i, crVar4.i, 0, 8);
            zx0Var.e(crVar2.i, this.S.I.i, 0, 4);
            zx0Var.e(crVar2.i, this.S.K.i, 0, 0);
        }
    }

    @Override // defpackage.qr
    public final boolean c() {
        return true;
    }

    @Override // defpackage.qr
    public final String toString() {
        String strL = ts.l(new StringBuilder("[Barrier] "), this.g0, " {");
        for (int i = 0; i < this.q0; i++) {
            qr qrVar = this.p0[i];
            if (i > 0) {
                strL = strL.concat(", ");
            }
            StringBuilder sbM = ts.m(strL);
            sbM.append(qrVar.g0);
            strL = sbM.toString();
        }
        return strL.concat("}");
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
