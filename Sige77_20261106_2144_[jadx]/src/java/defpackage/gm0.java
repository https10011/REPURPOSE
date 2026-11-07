package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class gm0 extends l82 {
    public static final int[] k = new int[2];

    public static void m(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i5 != -1) {
            if (i5 == 0) {
                iArr[0] = (int) ((i7 * f) + 0.5f);
                iArr[1] = i7;
                return;
            } else {
                if (i5 != 1) {
                    return;
                }
                iArr[0] = i6;
                iArr[1] = (int) ((i6 * f) + 0.5f);
                return;
            }
        }
        int i8 = (int) ((i7 * f) + 0.5f);
        int i9 = (int) ((i6 / f) + 0.5f);
        if (i8 <= i6) {
            iArr[0] = i8;
            iArr[1] = i7;
        } else if (i9 <= i7) {
            iArr[0] = i6;
            iArr[1] = i9;
        }
    }

    /* JADX WARN: Code duplicated, block: B:116:0x0268  */
    /* JADX WARN: Code duplicated, block: B:118:0x0278  */
    /* JADX WARN: Code duplicated, block: B:11:0x0026  */
    @Override // defpackage.v00
    public final void a(v00 v00Var) {
        float f;
        int iG;
        int i;
        int iG2;
        float f2;
        float f3;
        float f4;
        int i2;
        if (ts.v(this.j) == 3) {
            qr qrVar = this.b;
            l(qrVar.H, qrVar.J, 0);
            return;
        }
        s10 s10Var = this.e;
        boolean z = s10Var.j;
        z00 z00Var = this.h;
        z00 z00Var2 = this.i;
        if (z || this.d != 3) {
            f = 0.5f;
        } else {
            qr qrVar2 = this.b;
            int i3 = qrVar2.q;
            if (i3 == 2) {
                f = 0.5f;
                qr qrVar3 = qrVar2.S;
                if (qrVar3 != null) {
                    s10 s10Var2 = qrVar3.d.e;
                    if (s10Var2.j) {
                        s10Var.d((int) ((s10Var2.g * qrVar2.v) + 0.5f));
                    }
                }
            } else if (i3 == 3) {
                int i4 = qrVar2.r;
                if (i4 == 0 || i4 == 3) {
                    e52 e52Var = qrVar2.e;
                    z00 z00Var3 = e52Var.h;
                    z00 z00Var4 = e52Var.i;
                    boolean z2 = qrVar2.H.f != null;
                    boolean z3 = qrVar2.I.f != null;
                    boolean z4 = qrVar2.J.f != null;
                    boolean z5 = qrVar2.K.f != null;
                    f = 0.5f;
                    int i5 = qrVar2.W;
                    if (z2 && z3 && z4 && z5) {
                        float f5 = qrVar2.V;
                        boolean z6 = z00Var3.j;
                        ArrayList arrayList = z00Var3.l;
                        int[] iArr = k;
                        if (z6 && z00Var4.j) {
                            if (z00Var.c && z00Var2.c) {
                                m(iArr, ((z00) z00Var.l.get(0)).g + z00Var.f, ((z00) z00Var2.l.get(0)).g - z00Var2.f, z00Var3.g + z00Var3.f, z00Var4.g - z00Var4.f, f5, i5);
                                s10Var.d(iArr[0]);
                                this.b.e.e.d(iArr[1]);
                                return;
                            }
                            return;
                        }
                        if (z00Var.j && z00Var2.j) {
                            if (!z00Var3.c || !z00Var4.c) {
                                return;
                            }
                            m(iArr, z00Var.g + z00Var.f, z00Var2.g - z00Var2.f, ((z00) arrayList.get(0)).g + z00Var3.f, ((z00) z00Var4.l.get(0)).g - z00Var4.f, f5, i5);
                            s10Var.d(iArr[0]);
                            this.b.e.e.d(iArr[1]);
                        }
                        if (!z00Var.c || !z00Var2.c || !z00Var3.c || !z00Var4.c) {
                            return;
                        }
                        m(iArr, ((z00) z00Var.l.get(0)).g + z00Var.f, ((z00) z00Var2.l.get(0)).g - z00Var2.f, ((z00) arrayList.get(0)).g + z00Var3.f, ((z00) z00Var4.l.get(0)).g - z00Var4.f, f5, i5);
                        s10Var.d(iArr[0]);
                        this.b.e.e.d(iArr[1]);
                    } else if (z2 && z4) {
                        if (!z00Var.c || !z00Var2.c) {
                            return;
                        }
                        float f6 = qrVar2.V;
                        int i6 = ((z00) z00Var.l.get(0)).g + z00Var.f;
                        int i7 = ((z00) z00Var2.l.get(0)).g - z00Var2.f;
                        if (i5 == -1 || i5 == 0) {
                            int iG3 = g(i7 - i6, 0);
                            int i8 = (int) ((iG3 * f6) + 0.5f);
                            int iG4 = g(i8, 1);
                            if (i8 != iG4) {
                                iG3 = (int) ((iG4 / f6) + 0.5f);
                            }
                            s10Var.d(iG3);
                            this.b.e.e.d(iG4);
                        } else if (i5 == 1) {
                            int iG5 = g(i7 - i6, 0);
                            int i9 = (int) ((iG5 / f6) + 0.5f);
                            int iG6 = g(i9, 1);
                            if (i9 != iG6) {
                                iG5 = (int) ((iG6 * f6) + 0.5f);
                            }
                            s10Var.d(iG5);
                            this.b.e.e.d(iG6);
                        }
                    } else if (z3 && z5) {
                        if (!z00Var3.c || !z00Var4.c) {
                            return;
                        }
                        float f7 = qrVar2.V;
                        int i10 = ((z00) z00Var3.l.get(0)).g + z00Var3.f;
                        int i11 = ((z00) z00Var4.l.get(0)).g - z00Var4.f;
                        if (i5 == -1) {
                            iG = g(i11 - i10, 1);
                            i = (int) ((iG / f7) + 0.5f);
                            iG2 = g(i, 0);
                            if (i != iG2) {
                                iG = (int) ((iG2 * f7) + 0.5f);
                            }
                            s10Var.d(iG2);
                            this.b.e.e.d(iG);
                        } else if (i5 == 0) {
                            int iG7 = g(i11 - i10, 1);
                            int i12 = (int) ((iG7 * f7) + 0.5f);
                            int iG8 = g(i12, 0);
                            if (i12 != iG8) {
                                iG7 = (int) ((iG8 / f7) + 0.5f);
                            }
                            s10Var.d(iG8);
                            this.b.e.e.d(iG7);
                        } else if (i5 == 1) {
                            iG = g(i11 - i10, 1);
                            i = (int) ((iG / f7) + 0.5f);
                            iG2 = g(i, 0);
                            if (i != iG2) {
                                iG = (int) ((iG2 * f7) + 0.5f);
                            }
                            s10Var.d(iG2);
                            this.b.e.e.d(iG);
                        }
                    }
                } else {
                    int i13 = qrVar2.W;
                    if (i13 != -1) {
                        if (i13 == 0) {
                            f4 = qrVar2.e.e.g / qrVar2.V;
                            i2 = (int) (f4 + 0.5f);
                        } else if (i13 != 1) {
                            i2 = 0;
                        } else {
                            f2 = qrVar2.e.e.g;
                            f3 = qrVar2.V;
                        }
                        s10Var.d(i2);
                        f = 0.5f;
                    } else {
                        f2 = qrVar2.e.e.g;
                        f3 = qrVar2.V;
                    }
                    f4 = f2 * f3;
                    i2 = (int) (f4 + 0.5f);
                    s10Var.d(i2);
                    f = 0.5f;
                }
            } else {
                f = 0.5f;
            }
        }
        boolean z7 = z00Var.c;
        ArrayList arrayList2 = z00Var.l;
        if (z7) {
            boolean z8 = z00Var2.c;
            ArrayList arrayList3 = z00Var2.l;
            if (z8) {
                if (z00Var.j && z00Var2.j && s10Var.j) {
                    return;
                }
                if (!s10Var.j && this.d == 3) {
                    qr qrVar4 = this.b;
                    if (qrVar4.q == 0 && !qrVar4.u()) {
                        z00 z00Var5 = (z00) arrayList2.get(0);
                        z00 z00Var6 = (z00) arrayList3.get(0);
                        int i14 = z00Var5.g + z00Var.f;
                        int i15 = z00Var6.g + z00Var2.f;
                        z00Var.d(i14);
                        z00Var2.d(i15);
                        s10Var.d(i15 - i14);
                        return;
                    }
                }
                if (!s10Var.j && this.d == 3 && this.a == 1 && arrayList2.size() > 0 && arrayList3.size() > 0) {
                    int iMin = Math.min((((z00) arrayList3.get(0)).g + z00Var2.f) - (((z00) arrayList2.get(0)).g + z00Var.f), s10Var.m);
                    qr qrVar5 = this.b;
                    int i16 = qrVar5.u;
                    int iMax = Math.max(qrVar5.t, iMin);
                    if (i16 > 0) {
                        iMax = Math.min(i16, iMax);
                    }
                    s10Var.d(iMax);
                }
                if (s10Var.j) {
                    z00 z00Var7 = (z00) arrayList2.get(0);
                    z00 z00Var8 = (z00) arrayList3.get(0);
                    int i17 = z00Var7.g;
                    int i18 = z00Var.f + i17;
                    int i19 = z00Var8.g;
                    int i20 = z00Var2.f + i19;
                    float f8 = this.b.c0;
                    if (z00Var7 == z00Var8) {
                        f8 = f;
                    } else {
                        i17 = i18;
                        i19 = i20;
                    }
                    z00Var.d((int) ((((i19 - i17) - s10Var.g) * f8) + i17 + f));
                    z00Var2.d(z00Var.g + s10Var.g);
                }
            }
        }
    }

    @Override // defpackage.l82
    public final void d() {
        qr qrVar;
        qr qrVar2;
        int i;
        qr qrVar3;
        qr qrVar4;
        int i2;
        qr qrVar5 = this.b;
        boolean z = qrVar5.a;
        s10 s10Var = this.e;
        if (z) {
            s10Var.d(qrVar5.n());
        }
        boolean z2 = s10Var.j;
        ArrayList arrayList = s10Var.k;
        ArrayList arrayList2 = s10Var.l;
        z00 z00Var = this.i;
        z00 z00Var2 = this.h;
        if (!z2) {
            qr qrVar6 = this.b;
            int i3 = qrVar6.o0[0];
            this.d = i3;
            if (i3 != 3) {
                if (i3 == 4 && (qrVar4 = qrVar6.S) != null && ((i2 = qrVar4.o0[0]) == 1 || i2 == 4)) {
                    int iN = (qrVar4.n() - this.b.H.e()) - this.b.J.e();
                    l82.b(z00Var2, qrVar4.d.h, this.b.H.e());
                    l82.b(z00Var, qrVar4.d.i, -this.b.J.e());
                    s10Var.d(iN);
                    return;
                }
                if (i3 == 1) {
                    s10Var.d(qrVar6.n());
                }
            }
        } else if (this.d == 4 && (qrVar2 = (qrVar = this.b).S) != null && ((i = qrVar2.o0[0]) == 1 || i == 4)) {
            l82.b(z00Var2, qrVar2.d.h, qrVar.H.e());
            l82.b(z00Var, qrVar2.d.i, -this.b.J.e());
            return;
        }
        if (s10Var.j) {
            qr qrVar7 = this.b;
            if (qrVar7.a) {
                cr[] crVarArr = qrVar7.P;
                cr crVar = crVarArr[0];
                cr crVar2 = crVar.f;
                if (crVar2 != null && crVarArr[1].f != null) {
                    boolean zU = qrVar7.u();
                    qr qrVar8 = this.b;
                    if (zU) {
                        z00Var2.f = qrVar8.P[0].e();
                        z00Var.f = -this.b.P[1].e();
                        return;
                    }
                    z00 z00VarH = l82.h(qrVar8.P[0]);
                    if (z00VarH != null) {
                        l82.b(z00Var2, z00VarH, this.b.P[0].e());
                    }
                    z00 z00VarH2 = l82.h(this.b.P[1]);
                    if (z00VarH2 != null) {
                        l82.b(z00Var, z00VarH2, -this.b.P[1].e());
                    }
                    z00Var2.b = true;
                    z00Var.b = true;
                    return;
                }
                if (crVar2 != null) {
                    z00 z00VarH3 = l82.h(crVar);
                    if (z00VarH3 != null) {
                        l82.b(z00Var2, z00VarH3, this.b.P[0].e());
                        l82.b(z00Var, z00Var2, s10Var.g);
                        return;
                    }
                    return;
                }
                cr crVar3 = crVarArr[1];
                if (crVar3.f != null) {
                    z00 z00VarH4 = l82.h(crVar3);
                    if (z00VarH4 != null) {
                        l82.b(z00Var, z00VarH4, -this.b.P[1].e());
                        l82.b(z00Var2, z00Var, -s10Var.g);
                        return;
                    }
                    return;
                }
                if ((qrVar7 instanceof bm0) || qrVar7.S == null || qrVar7.i(7).f != null) {
                    return;
                }
                qr qrVar9 = this.b;
                l82.b(z00Var2, qrVar9.S.d.h, qrVar9.o());
                l82.b(z00Var, z00Var2, s10Var.g);
                return;
            }
        }
        if (this.d == 3) {
            qr qrVar10 = this.b;
            int i4 = qrVar10.q;
            if (i4 == 2) {
                qr qrVar11 = qrVar10.S;
                if (qrVar11 != null) {
                    s10 s10Var2 = qrVar11.e.e;
                    arrayList2.add(s10Var2);
                    s10Var2.k.add(s10Var);
                    s10Var.b = true;
                    arrayList.add(z00Var2);
                    arrayList.add(z00Var);
                }
            } else if (i4 == 3) {
                if (qrVar10.r == 3) {
                    z00Var2.a = this;
                    z00Var.a = this;
                    e52 e52Var = qrVar10.e;
                    e52Var.h.a = this;
                    e52Var.i.a = this;
                    s10Var.a = this;
                    if (qrVar10.v()) {
                        arrayList2.add(this.b.e.e);
                        this.b.e.e.k.add(s10Var);
                        e52 e52Var2 = this.b.e;
                        e52Var2.e.a = this;
                        arrayList2.add(e52Var2.h);
                        arrayList2.add(this.b.e.i);
                        this.b.e.h.k.add(s10Var);
                        this.b.e.i.k.add(s10Var);
                    } else {
                        boolean zU2 = this.b.u();
                        qr qrVar12 = this.b;
                        if (zU2) {
                            qrVar12.e.e.l.add(s10Var);
                            arrayList.add(this.b.e.e);
                        } else {
                            qrVar12.e.e.l.add(s10Var);
                        }
                    }
                } else {
                    s10 s10Var3 = qrVar10.e.e;
                    arrayList2.add(s10Var3);
                    s10Var3.k.add(s10Var);
                    this.b.e.h.k.add(s10Var);
                    this.b.e.i.k.add(s10Var);
                    s10Var.b = true;
                    arrayList.add(z00Var2);
                    arrayList.add(z00Var);
                    z00Var2.l.add(s10Var);
                    z00Var.l.add(s10Var);
                }
            }
        }
        qr qrVar13 = this.b;
        cr[] crVarArr2 = qrVar13.P;
        cr crVar4 = crVarArr2[0];
        cr crVar5 = crVar4.f;
        if (crVar5 != null && crVarArr2[1].f != null) {
            boolean zU3 = qrVar13.u();
            qr qrVar14 = this.b;
            if (zU3) {
                z00Var2.f = qrVar14.P[0].e();
                z00Var.f = -this.b.P[1].e();
                return;
            }
            z00 z00VarH5 = l82.h(qrVar14.P[0]);
            z00 z00VarH6 = l82.h(this.b.P[1]);
            if (z00VarH5 != null) {
                z00VarH5.b(this);
            }
            if (z00VarH6 != null) {
                z00VarH6.b(this);
            }
            this.j = 4;
            return;
        }
        if (crVar5 != null) {
            z00 z00VarH7 = l82.h(crVar4);
            if (z00VarH7 != null) {
                l82.b(z00Var2, z00VarH7, this.b.P[0].e());
                c(z00Var, z00Var2, 1, s10Var);
                return;
            }
            return;
        }
        cr crVar6 = crVarArr2[1];
        if (crVar6.f != null) {
            z00 z00VarH8 = l82.h(crVar6);
            if (z00VarH8 != null) {
                l82.b(z00Var, z00VarH8, -this.b.P[1].e());
                c(z00Var2, z00Var, -1, s10Var);
                return;
            }
            return;
        }
        if ((qrVar13 instanceof bm0) || (qrVar3 = qrVar13.S) == null) {
            return;
        }
        l82.b(z00Var2, qrVar3.d.h, qrVar13.o());
        c(z00Var, z00Var2, 1, s10Var);
    }

    @Override // defpackage.l82
    public final void e() {
        z00 z00Var = this.h;
        if (z00Var.j) {
            this.b.X = z00Var.g;
        }
    }

    @Override // defpackage.l82
    public final void f() {
        this.c = null;
        this.h.c();
        this.i.c();
        this.e.c();
        this.g = false;
    }

    @Override // defpackage.l82
    public final boolean k() {
        return this.d != 3 || this.b.q == 0;
    }

    public final void n() {
        this.g = false;
        z00 z00Var = this.h;
        z00Var.c();
        z00Var.j = false;
        z00 z00Var2 = this.i;
        z00Var2.c();
        z00Var2.j = false;
        this.e.j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.b.g0;
    }
}
