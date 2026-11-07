package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class fd0 {
    public int a;
    public cr d;
    public cr e;
    public cr f;
    public cr g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int q;
    public final /* synthetic */ hd0 r;
    public qr b = null;
    public int c = 0;
    public int l = 0;
    public int m = 0;
    public int n = 0;
    public int o = 0;
    public int p = 0;

    public fd0(hd0 hd0Var, int i, cr crVar, cr crVar2, cr crVar3, cr crVar4, int i2) {
        this.r = hd0Var;
        this.a = i;
        this.d = crVar;
        this.e = crVar2;
        this.f = crVar3;
        this.g = crVar4;
        this.h = hd0Var.v0;
        this.i = hd0Var.r0;
        this.j = hd0Var.w0;
        this.k = hd0Var.s0;
        this.q = i2;
    }

    public final void a(qr qrVar) {
        int i = this.a;
        int i2 = this.q;
        hd0 hd0Var = this.r;
        if (i == 0) {
            int iP = hd0Var.P(qrVar, i2);
            if (qrVar.o0[0] == 3) {
                this.p++;
                iP = 0;
            }
            this.l = iP + (qrVar.f0 != 8 ? hd0Var.O0 : 0) + this.l;
            int iO = hd0Var.O(qrVar, this.q);
            if (this.b == null || this.c < iO) {
                this.b = qrVar;
                this.c = iO;
                this.m = iO;
            }
        } else {
            int iP2 = hd0Var.P(qrVar, i2);
            int iO2 = hd0Var.O(qrVar, this.q);
            if (qrVar.o0[1] == 3) {
                this.p++;
                iO2 = 0;
            }
            this.m = iO2 + (qrVar.f0 != 8 ? hd0Var.P0 : 0) + this.m;
            if (this.b == null || this.c < iP2) {
                this.b = qrVar;
                this.c = iP2;
                this.l = iP2;
            }
        }
        this.o++;
    }

    public final void b(int i, boolean z, boolean z2) {
        hd0 hd0Var;
        int i2;
        qr qrVar;
        char c;
        int i3;
        int i4;
        int i5;
        int i6 = this.o;
        int i7 = 0;
        while (true) {
            hd0Var = this.r;
            if (i7 >= i6 || (i5 = this.n + i7) >= hd0Var.a1) {
                break;
            }
            qr qrVar2 = hd0Var.Z0[i5];
            if (qrVar2 != null) {
                qrVar2.A();
            }
            i7++;
        }
        if (i6 == 0 || this.b == null) {
            return;
        }
        boolean z3 = z2 && i == 0;
        int i8 = -1;
        int i9 = -1;
        for (int i10 = 0; i10 < i6; i10++) {
            int i11 = this.n + (z ? (i6 - 1) - i10 : i10);
            if (i11 >= hd0Var.a1) {
                break;
            }
            if (hd0Var.Z0[i11].f0 == 0) {
                if (i8 == -1) {
                    i8 = i10;
                }
                i9 = i10;
            }
        }
        int i12 = this.a;
        qr qrVar3 = this.b;
        if (i12 != 0) {
            qrVar3.h0 = hd0Var.C0;
            cr crVar = qrVar3.H;
            cr crVar2 = qrVar3.J;
            int i13 = this.h;
            if (i > 0) {
                i13 += hd0Var.O0;
            }
            if (z) {
                crVar2.a(this.f, i13);
                if (z2) {
                    crVar.a(this.d, this.j);
                }
                if (i > 0) {
                    this.f.d.H.a(crVar2, 0);
                }
            } else {
                crVar.a(this.d, i13);
                if (z2) {
                    crVar2.a(this.f, this.j);
                }
                if (i > 0) {
                    this.d.d.J.a(crVar, 0);
                }
            }
            qr qrVar4 = null;
            int i14 = 0;
            while (i14 < i6) {
                int i15 = this.n + i14;
                if (i15 >= hd0Var.a1) {
                    return;
                }
                qr qrVar5 = hd0Var.Z0[i15];
                if (i14 == 0) {
                    qrVar5.f(qrVar5.I, this.e, this.i);
                    int i16 = hd0Var.D0;
                    float f = hd0Var.J0;
                    if (this.n == 0) {
                        int i17 = hd0Var.F0;
                        i2 = -1;
                        if (i17 != -1) {
                            f = hd0Var.L0;
                        }
                        i16 = i17;
                        qrVar5.i0 = i16;
                        qrVar5.d0 = f;
                    } else {
                        i2 = -1;
                    }
                    if (z2 && (i17 = hd0Var.H0) != i2) {
                        f = hd0Var.N0;
                        i16 = i17;
                    }
                    qrVar5.i0 = i16;
                    qrVar5.d0 = f;
                }
                if (i14 == i6 - 1) {
                    qrVar5.f(qrVar5.K, this.g, this.k);
                }
                if (qrVar4 != null) {
                    cr crVar3 = qrVar4.K;
                    cr crVar4 = qrVar5.I;
                    crVar4.a(crVar3, hd0Var.P0);
                    if (i14 == i8) {
                        int i18 = this.i;
                        if (crVar4.h()) {
                            crVar4.h = i18;
                        }
                    }
                    crVar3.a(crVar4, 0);
                    if (i14 == i9 + 1) {
                        int i19 = this.k;
                        if (crVar3.h()) {
                            crVar3.h = i19;
                        }
                    }
                }
                if (qrVar5 != qrVar3) {
                    int i20 = hd0Var.Q0;
                    if (z) {
                        if (i20 == 0) {
                            qrVar5.J.a(crVar2, 0);
                        } else if (i20 == 1) {
                            qrVar5.H.a(crVar, 0);
                        } else if (i20 == 2) {
                            qrVar5.H.a(crVar, 0);
                            qrVar5.J.a(crVar2, 0);
                        }
                    } else if (i20 == 0) {
                        qrVar5.H.a(crVar, 0);
                    } else if (i20 == 1) {
                        qrVar5.J.a(crVar2, 0);
                    } else if (i20 == 2) {
                        if (z3) {
                            qrVar5.H.a(this.d, this.h);
                            qrVar5.J.a(this.f, this.j);
                        } else {
                            qrVar5.H.a(crVar, 0);
                            qrVar5.J.a(crVar2, 0);
                        }
                    }
                }
                i14++;
                qrVar4 = qrVar5;
            }
            return;
        }
        qrVar3.i0 = hd0Var.D0;
        cr crVar5 = qrVar3.K;
        cr crVar6 = qrVar3.I;
        int i21 = this.i;
        if (i > 0) {
            i21 += hd0Var.P0;
        }
        crVar6.a(this.e, i21);
        if (z2) {
            crVar5.a(this.g, this.k);
        }
        if (i > 0) {
            this.e.d.K.a(crVar6, 0);
        }
        if (hd0Var.R0 != 3 || qrVar3.D) {
            qrVar = qrVar3;
            break;
        }
        int i22 = 0;
        while (true) {
            if (i22 < i6) {
                int i23 = this.n + (z ? (i6 - 1) - i22 : i22);
                if (i23 < hd0Var.a1) {
                    qrVar = hd0Var.Z0[i23];
                    if (qrVar.D) {
                        break;
                    } else {
                        i22++;
                    }
                }
            }
            qrVar = qrVar3;
            break;
        }
        int i24 = 0;
        qr qrVar6 = null;
        while (i24 < i6) {
            int i25 = z ? (i6 - 1) - i24 : i24;
            int i26 = this.n + i25;
            if (i26 >= hd0Var.a1) {
                return;
            }
            qr qrVar7 = hd0Var.Z0[i26];
            if (i24 == 0) {
                qrVar7.f(qrVar7.H, this.d, this.h);
            }
            if (i25 == 0) {
                int i27 = hd0Var.C0;
                float f2 = hd0Var.I0;
                if (z) {
                    f2 = 1.0f - f2;
                }
                if (this.n == 0) {
                    int i28 = hd0Var.E0;
                    i3 = -1;
                    if (i28 != -1) {
                        f2 = hd0Var.K0;
                        if (z) {
                            f2 = 1.0f - f2;
                        }
                    }
                    i4 = i28;
                    qrVar7.h0 = i4;
                    qrVar7.c0 = f2;
                } else {
                    i3 = -1;
                }
                if (!z2 || (i28 = hd0Var.G0) == i3) {
                    i4 = i27;
                } else {
                    float f3 = hd0Var.M0;
                    if (z) {
                        f3 = 1.0f - f3;
                    }
                    f2 = f3;
                    i4 = i28;
                }
                qrVar7.h0 = i4;
                qrVar7.c0 = f2;
            }
            if (i24 == i6 - 1) {
                qrVar7.f(qrVar7.J, this.f, this.j);
            }
            if (qrVar6 != null) {
                cr crVar7 = qrVar6.J;
                cr crVar8 = qrVar7.H;
                crVar8.a(crVar7, hd0Var.O0);
                if (i24 == i8) {
                    int i29 = this.h;
                    if (crVar8.h()) {
                        crVar8.h = i29;
                    }
                }
                crVar7.a(crVar8, 0);
                if (i24 == i9 + 1) {
                    int i30 = this.j;
                    if (crVar7.h()) {
                        crVar7.h = i30;
                    }
                }
            }
            if (qrVar7 != qrVar3) {
                int i31 = hd0Var.R0;
                c = 3;
                if (i31 == 3 && qrVar.D && qrVar7 != qrVar && qrVar7.D) {
                    qrVar7.L.a(qrVar.L, 0);
                } else if (i31 == 0) {
                    qrVar7.I.a(crVar6, 0);
                } else if (i31 == 1) {
                    qrVar7.K.a(crVar5, 0);
                } else if (z3) {
                    qrVar7.I.a(this.e, this.i);
                    qrVar7.K.a(this.g, this.k);
                } else {
                    qrVar7.I.a(crVar6, 0);
                    qrVar7.K.a(crVar5, 0);
                }
            } else {
                c = 3;
            }
            i24++;
            qrVar6 = qrVar7;
        }
    }

    public final int c() {
        int i = this.a;
        int i2 = this.m;
        return i == 1 ? i2 - this.r.P0 : i2;
    }

    public final int d() {
        int i = this.a;
        int i2 = this.l;
        return i == 0 ? i2 - this.r.O0 : i2;
    }

    public final void e(int i) {
        hd0 hd0Var;
        int i2;
        int i3 = this.p;
        if (i3 == 0) {
            return;
        }
        int i4 = this.o;
        int i5 = i / i3;
        int i6 = 0;
        while (true) {
            hd0Var = this.r;
            if (i6 >= i4 || (i2 = this.n + i6) >= hd0Var.a1) {
                break;
            }
            qr qrVar = hd0Var.Z0[i2];
            if (this.a == 0) {
                if (qrVar != null) {
                    int[] iArr = qrVar.o0;
                    if (iArr[0] == 3 && qrVar.q == 0) {
                        hd0Var.Q(1, i5, iArr[1], qrVar.k(), qrVar);
                    }
                }
            } else if (qrVar != null) {
                int[] iArr2 = qrVar.o0;
                if (iArr2[1] == 3 && qrVar.r == 0) {
                    int i7 = i5;
                    hd0Var.Q(iArr2[0], qrVar.n(), 1, i7, qrVar);
                    i5 = i7;
                }
            }
            i6++;
        }
        this.l = 0;
        this.m = 0;
        this.b = null;
        this.c = 0;
        int i8 = this.o;
        for (int i9 = 0; i9 < i8; i9++) {
            int i10 = this.n + i9;
            if (i10 >= hd0Var.a1) {
                return;
            }
            qr qrVar2 = hd0Var.Z0[i10];
            if (this.a == 0) {
                int iN = qrVar2.n();
                int i11 = hd0Var.O0;
                if (qrVar2.f0 == 8) {
                    i11 = 0;
                }
                this.l = iN + i11 + this.l;
                int iO = hd0Var.O(qrVar2, this.q);
                if (this.b == null || this.c < iO) {
                    this.b = qrVar2;
                    this.c = iO;
                    this.m = iO;
                }
            } else {
                int iP = hd0Var.P(qrVar2, this.q);
                int iO2 = hd0Var.O(qrVar2, this.q);
                int i12 = hd0Var.P0;
                if (qrVar2.f0 == 8) {
                    i12 = 0;
                }
                this.m = iO2 + i12 + this.m;
                if (this.b == null || this.c < iP) {
                    this.b = qrVar2;
                    this.c = iP;
                    this.l = iP;
                }
            }
        }
    }

    public final void f(int i, cr crVar, cr crVar2, cr crVar3, cr crVar4, int i2, int i3, int i4, int i5, int i6) {
        this.a = i;
        this.d = crVar;
        this.e = crVar2;
        this.f = crVar3;
        this.g = crVar4;
        this.h = i2;
        this.i = i3;
        this.j = i4;
        this.k = i5;
        this.q = i6;
    }
}
