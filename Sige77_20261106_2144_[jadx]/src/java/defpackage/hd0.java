package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class hd0 extends bm0 {
    public ah A0;
    public hr B0;
    public int C0;
    public int D0;
    public int E0;
    public int F0;
    public int G0;
    public int H0;
    public float I0;
    public float J0;
    public float K0;
    public float L0;
    public float M0;
    public float N0;
    public int O0;
    public int P0;
    public int Q0;
    public int R0;
    public int S0;
    public int T0;
    public int U0;
    public ArrayList V0;
    public qr[] W0;
    public qr[] X0;
    public int[] Y0;
    public qr[] Z0;
    public int a1;
    public int r0;
    public int s0;
    public int t0;
    public int u0;
    public int v0;
    public int w0;
    public boolean x0;
    public int y0;
    public int z0;

    @Override // defpackage.bm0
    public final void N() {
        for (int i = 0; i < this.q0; i++) {
            qr qrVar = this.p0[i];
            if (qrVar != null) {
                qrVar.E = true;
            }
        }
    }

    public final int O(qr qrVar, int i) {
        qr qrVar2;
        if (qrVar != null) {
            int[] iArr = qrVar.o0;
            if (iArr[1] == 3) {
                int i2 = qrVar.r;
                if (i2 != 0) {
                    if (i2 == 2) {
                        int i3 = (int) (qrVar.y * i);
                        if (i3 != qrVar.k()) {
                            qrVar.g = true;
                            Q(iArr[0], qrVar.n(), 1, i3, qrVar);
                        }
                        return i3;
                    }
                    qrVar2 = qrVar;
                    if (i2 == 1) {
                        return qrVar2.k();
                    }
                    if (i2 == 3) {
                        return (int) ((qrVar2.n() * qrVar2.V) + 0.5f);
                    }
                }
            } else {
                qrVar2 = qrVar;
            }
            return qrVar2.k();
        }
        return 0;
    }

    public final int P(qr qrVar, int i) {
        qr qrVar2;
        if (qrVar != null) {
            int[] iArr = qrVar.o0;
            if (iArr[0] == 3) {
                int i2 = qrVar.q;
                if (i2 != 0) {
                    if (i2 == 2) {
                        int i3 = (int) (qrVar.v * i);
                        if (i3 != qrVar.n()) {
                            qrVar.g = true;
                            Q(1, i3, iArr[1], qrVar.k(), qrVar);
                        }
                        return i3;
                    }
                    qrVar2 = qrVar;
                    if (i2 == 1) {
                        return qrVar2.n();
                    }
                    if (i2 == 3) {
                        return (int) ((qrVar2.k() * qrVar2.V) + 0.5f);
                    }
                }
            } else {
                qrVar2 = qrVar;
            }
            return qrVar2.n();
        }
        return 0;
    }

    public final void Q(int i, int i2, int i3, int i4, qr qrVar) {
        hr hrVar;
        qr qrVar2;
        ah ahVar = this.A0;
        while (true) {
            hrVar = this.B0;
            if (hrVar != null || (qrVar2 = this.S) == null) {
                break;
            } else {
                this.B0 = ((rr) qrVar2).t0;
            }
        }
        ahVar.a = i;
        ahVar.b = i3;
        ahVar.c = i2;
        ahVar.d = i4;
        hrVar.b(qrVar, ahVar);
        qrVar.J(ahVar.e);
        qrVar.G(ahVar.f);
        qrVar.D = ahVar.h;
        qrVar.D(ahVar.g);
    }

    @Override // defpackage.qr
    public final void b(zx0 zx0Var, boolean z) {
        qr qrVar;
        float f;
        int i;
        ArrayList arrayList = this.V0;
        super.b(zx0Var, z);
        qr qrVar2 = this.S;
        boolean z2 = qrVar2 != null && ((rr) qrVar2).u0;
        int i2 = this.S0;
        if (i2 != 0) {
            if (i2 == 1) {
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    ((fd0) arrayList.get(i3)).b(i3, z2, i3 == size + (-1));
                    i3++;
                }
            } else if (i2 == 2 && this.Y0 != null && this.X0 != null && this.W0 != null) {
                for (int i4 = 0; i4 < this.a1; i4++) {
                    this.Z0[i4].A();
                }
                int[] iArr = this.Y0;
                int i5 = iArr[0];
                int i6 = iArr[1];
                float f2 = this.I0;
                qr qrVar3 = null;
                int i7 = 0;
                while (i7 < i5) {
                    if (z2) {
                        i = (i5 - i7) - 1;
                        f = 1.0f - this.I0;
                    } else {
                        f = f2;
                        i = i7;
                    }
                    qr qrVar4 = this.X0[i];
                    if (qrVar4 != null) {
                        cr crVar = qrVar4.H;
                        if (qrVar4.f0 != 8) {
                            if (i7 == 0) {
                                qrVar4.f(crVar, this.H, this.v0);
                                qrVar4.h0 = this.C0;
                                qrVar4.c0 = f;
                            }
                            if (i7 == i5 - 1) {
                                qrVar4.f(qrVar4.J, this.J, this.w0);
                            }
                            if (i7 > 0 && qrVar3 != null) {
                                cr crVar2 = qrVar3.J;
                                qrVar4.f(crVar, crVar2, this.O0);
                                qrVar3.f(crVar2, crVar, 0);
                            }
                            qrVar3 = qrVar4;
                        }
                    }
                    i7++;
                    f2 = f;
                }
                for (int i8 = 0; i8 < i6; i8++) {
                    qr qrVar5 = this.W0[i8];
                    if (qrVar5 != null) {
                        cr crVar3 = qrVar5.I;
                        if (qrVar5.f0 != 8) {
                            if (i8 == 0) {
                                qrVar5.f(crVar3, this.I, this.r0);
                                qrVar5.i0 = this.D0;
                                qrVar5.d0 = this.J0;
                            }
                            if (i8 == i6 - 1) {
                                qrVar5.f(qrVar5.K, this.K, this.s0);
                            }
                            if (i8 > 0 && qrVar3 != null) {
                                cr crVar4 = qrVar3.K;
                                qrVar5.f(crVar3, crVar4, this.P0);
                                qrVar3.f(crVar4, crVar3, 0);
                            }
                            qrVar3 = qrVar5;
                        }
                    }
                }
                for (int i9 = 0; i9 < i5; i9++) {
                    for (int i10 = 0; i10 < i6; i10++) {
                        int i11 = (i10 * i5) + i9;
                        if (this.U0 == 1) {
                            i11 = (i9 * i6) + i10;
                        }
                        qr[] qrVarArr = this.Z0;
                        if (i11 < qrVarArr.length && (qrVar = qrVarArr[i11]) != null && qrVar.f0 != 8) {
                            qr qrVar6 = this.X0[i9];
                            qr qrVar7 = this.W0[i10];
                            if (qrVar != qrVar6) {
                                qrVar.f(qrVar.H, qrVar6.H, 0);
                                qrVar.f(qrVar.J, qrVar6.J, 0);
                            }
                            if (qrVar != qrVar7) {
                                qrVar.f(qrVar.I, qrVar7.I, 0);
                                qrVar.f(qrVar.K, qrVar7.K, 0);
                            }
                        }
                    }
                }
            }
        } else if (arrayList.size() > 0) {
            ((fd0) arrayList.get(0)).b(0, z2, true);
        }
        this.x0 = false;
    }
}
