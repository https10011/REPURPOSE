package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class e52 extends l82 {
    public z00 k;
    public zg l;

    @Override // defpackage.v00
    public final void a(v00 v00Var) {
        float f;
        float f2;
        float f3;
        int i;
        if (ts.v(this.j) == 3) {
            qr qrVar = this.b;
            l(qrVar.I, qrVar.K, 1);
            return;
        }
        s10 s10Var = this.e;
        if (s10Var.c && !s10Var.j && this.d == 3) {
            qr qrVar2 = this.b;
            int i2 = qrVar2.r;
            if (i2 == 2) {
                qr qrVar3 = qrVar2.S;
                if (qrVar3 != null) {
                    s10 s10Var2 = qrVar3.e.e;
                    if (s10Var2.j) {
                        s10Var.d((int) ((s10Var2.g * qrVar2.y) + 0.5f));
                    }
                }
            } else if (i2 == 3) {
                s10 s10Var3 = qrVar2.d.e;
                if (s10Var3.j) {
                    int i3 = qrVar2.W;
                    if (i3 != -1) {
                        if (i3 == 0) {
                            f3 = s10Var3.g * qrVar2.V;
                            i = (int) (f3 + 0.5f);
                        } else if (i3 != 1) {
                            i = 0;
                        } else {
                            f = s10Var3.g;
                            f2 = qrVar2.V;
                        }
                        s10Var.d(i);
                    } else {
                        f = s10Var3.g;
                        f2 = qrVar2.V;
                    }
                    f3 = f / f2;
                    i = (int) (f3 + 0.5f);
                    s10Var.d(i);
                }
            }
        }
        z00 z00Var = this.h;
        boolean z = z00Var.c;
        ArrayList arrayList = z00Var.l;
        if (z) {
            z00 z00Var2 = this.i;
            boolean z2 = z00Var2.c;
            ArrayList arrayList2 = z00Var2.l;
            if (z2) {
                if (z00Var.j && z00Var2.j && s10Var.j) {
                    return;
                }
                if (!s10Var.j && this.d == 3) {
                    qr qrVar4 = this.b;
                    if (qrVar4.q == 0 && !qrVar4.v()) {
                        z00 z00Var3 = (z00) arrayList.get(0);
                        z00 z00Var4 = (z00) arrayList2.get(0);
                        int i4 = z00Var3.g + z00Var.f;
                        int i5 = z00Var4.g + z00Var2.f;
                        z00Var.d(i4);
                        z00Var2.d(i5);
                        s10Var.d(i5 - i4);
                        return;
                    }
                }
                if (!s10Var.j && this.d == 3 && this.a == 1 && arrayList.size() > 0 && arrayList2.size() > 0) {
                    z00 z00Var5 = (z00) arrayList.get(0);
                    int i6 = (((z00) arrayList2.get(0)).g + z00Var2.f) - (z00Var5.g + z00Var.f);
                    int i7 = s10Var.m;
                    if (i6 < i7) {
                        s10Var.d(i6);
                    } else {
                        s10Var.d(i7);
                    }
                }
                if (s10Var.j && arrayList.size() > 0 && arrayList2.size() > 0) {
                    z00 z00Var6 = (z00) arrayList.get(0);
                    z00 z00Var7 = (z00) arrayList2.get(0);
                    int i8 = z00Var6.g;
                    int i9 = z00Var.f + i8;
                    int i10 = z00Var7.g;
                    int i11 = z00Var2.f + i10;
                    float f4 = this.b.d0;
                    if (z00Var6 == z00Var7) {
                        f4 = 0.5f;
                    } else {
                        i8 = i9;
                        i10 = i11;
                    }
                    z00Var.d((int) ((((i10 - i8) - s10Var.g) * f4) + i8 + 0.5f));
                    z00Var2.d(z00Var.g + s10Var.g);
                }
            }
        }
    }

    @Override // defpackage.l82
    public final void d() {
        qr qrVar;
        qr qrVar2;
        qr qrVar3;
        qr qrVar4;
        z00 z00Var = this.k;
        qr qrVar5 = this.b;
        boolean z = qrVar5.a;
        s10 s10Var = this.e;
        if (z) {
            s10Var.d(qrVar5.k());
        }
        boolean z2 = s10Var.j;
        ArrayList arrayList = s10Var.k;
        ArrayList arrayList2 = s10Var.l;
        z00 z00Var2 = this.i;
        z00 z00Var3 = this.h;
        if (!z2) {
            qr qrVar6 = this.b;
            this.d = qrVar6.o0[1];
            if (qrVar6.D) {
                this.l = new zg(this);
            }
            int i = this.d;
            if (i != 3) {
                if (i == 4 && (qrVar4 = this.b.S) != null && qrVar4.o0[1] == 1) {
                    int iK = (qrVar4.k() - this.b.I.e()) - this.b.K.e();
                    l82.b(z00Var3, qrVar4.e.h, this.b.I.e());
                    l82.b(z00Var2, qrVar4.e.i, -this.b.K.e());
                    s10Var.d(iK);
                    return;
                }
                if (i == 1) {
                    s10Var.d(this.b.k());
                }
            }
        } else if (this.d == 4 && (qrVar2 = (qrVar = this.b).S) != null && qrVar2.o0[1] == 1) {
            l82.b(z00Var3, qrVar2.e.h, qrVar.I.e());
            l82.b(z00Var2, qrVar2.e.i, -this.b.K.e());
            return;
        }
        boolean z3 = s10Var.j;
        if (z3) {
            qr qrVar7 = this.b;
            if (qrVar7.a) {
                cr[] crVarArr = qrVar7.P;
                cr crVar = crVarArr[2];
                cr crVar2 = crVar.f;
                if (crVar2 != null && crVarArr[3].f != null) {
                    boolean zV = qrVar7.v();
                    qr qrVar8 = this.b;
                    if (zV) {
                        z00Var3.f = qrVar8.P[2].e();
                        z00Var2.f = -this.b.P[3].e();
                    } else {
                        z00 z00VarH = l82.h(qrVar8.P[2]);
                        if (z00VarH != null) {
                            l82.b(z00Var3, z00VarH, this.b.P[2].e());
                        }
                        z00 z00VarH2 = l82.h(this.b.P[3]);
                        if (z00VarH2 != null) {
                            l82.b(z00Var2, z00VarH2, -this.b.P[3].e());
                        }
                        z00Var3.b = true;
                        z00Var2.b = true;
                    }
                    qr qrVar9 = this.b;
                    if (qrVar9.D) {
                        l82.b(z00Var, z00Var3, qrVar9.Z);
                        return;
                    }
                    return;
                }
                if (crVar2 != null) {
                    z00 z00VarH3 = l82.h(crVar);
                    if (z00VarH3 != null) {
                        l82.b(z00Var3, z00VarH3, this.b.P[2].e());
                        l82.b(z00Var2, z00Var3, s10Var.g);
                        qr qrVar10 = this.b;
                        if (qrVar10.D) {
                            l82.b(z00Var, z00Var3, qrVar10.Z);
                            return;
                        }
                        return;
                    }
                    return;
                }
                cr crVar3 = crVarArr[3];
                if (crVar3.f != null) {
                    z00 z00VarH4 = l82.h(crVar3);
                    if (z00VarH4 != null) {
                        l82.b(z00Var2, z00VarH4, -this.b.P[3].e());
                        l82.b(z00Var3, z00Var2, -s10Var.g);
                    }
                    qr qrVar11 = this.b;
                    if (qrVar11.D) {
                        l82.b(z00Var, z00Var3, qrVar11.Z);
                        return;
                    }
                    return;
                }
                cr crVar4 = crVarArr[4];
                if (crVar4.f != null) {
                    z00 z00VarH5 = l82.h(crVar4);
                    if (z00VarH5 != null) {
                        l82.b(z00Var, z00VarH5, 0);
                        l82.b(z00Var3, z00Var, -this.b.Z);
                        l82.b(z00Var2, z00Var3, s10Var.g);
                        return;
                    }
                    return;
                }
                if ((qrVar7 instanceof bm0) || qrVar7.S == null || qrVar7.i(7).f != null) {
                    return;
                }
                qr qrVar12 = this.b;
                l82.b(z00Var3, qrVar12.S.e.h, qrVar12.p());
                l82.b(z00Var2, z00Var3, s10Var.g);
                qr qrVar13 = this.b;
                if (qrVar13.D) {
                    l82.b(z00Var, z00Var3, qrVar13.Z);
                    return;
                }
                return;
            }
        }
        if (z3 || this.d != 3) {
            s10Var.b(this);
        } else {
            qr qrVar14 = this.b;
            int i2 = qrVar14.r;
            if (i2 == 2) {
                qr qrVar15 = qrVar14.S;
                if (qrVar15 != null) {
                    s10 s10Var2 = qrVar15.e.e;
                    arrayList2.add(s10Var2);
                    s10Var2.k.add(s10Var);
                    s10Var.b = true;
                    arrayList.add(z00Var3);
                    arrayList.add(z00Var2);
                }
            } else if (i2 == 3 && !qrVar14.v()) {
                qr qrVar16 = this.b;
                if (qrVar16.q != 3) {
                    s10 s10Var3 = qrVar16.d.e;
                    arrayList2.add(s10Var3);
                    s10Var3.k.add(s10Var);
                    s10Var.b = true;
                    arrayList.add(z00Var3);
                    arrayList.add(z00Var2);
                }
            }
        }
        qr qrVar17 = this.b;
        cr[] crVarArr2 = qrVar17.P;
        cr crVar5 = crVarArr2[2];
        cr crVar6 = crVar5.f;
        if (crVar6 != null && crVarArr2[3].f != null) {
            boolean zV2 = qrVar17.v();
            qr qrVar18 = this.b;
            if (zV2) {
                z00Var3.f = qrVar18.P[2].e();
                z00Var2.f = -this.b.P[3].e();
            } else {
                z00 z00VarH6 = l82.h(qrVar18.P[2]);
                z00 z00VarH7 = l82.h(this.b.P[3]);
                if (z00VarH6 != null) {
                    z00VarH6.b(this);
                }
                if (z00VarH7 != null) {
                    z00VarH7.b(this);
                }
                this.j = 4;
            }
            if (this.b.D) {
                c(z00Var, z00Var3, 1, this.l);
            }
        } else if (crVar6 != null) {
            z00 z00VarH8 = l82.h(crVar5);
            if (z00VarH8 != null) {
                l82.b(z00Var3, z00VarH8, this.b.P[2].e());
                c(z00Var2, z00Var3, 1, s10Var);
                if (this.b.D) {
                    c(z00Var, z00Var3, 1, this.l);
                }
                if (this.d == 3) {
                    qr qrVar19 = this.b;
                    if (qrVar19.V > 0.0f) {
                        gm0 gm0Var = qrVar19.d;
                        if (gm0Var.d == 3) {
                            gm0Var.e.k.add(s10Var);
                            arrayList2.add(this.b.d.e);
                            s10Var.a = this;
                        }
                    }
                }
            }
        } else {
            cr crVar7 = crVarArr2[3];
            if (crVar7.f != null) {
                z00 z00VarH9 = l82.h(crVar7);
                if (z00VarH9 != null) {
                    l82.b(z00Var2, z00VarH9, -this.b.P[3].e());
                    c(z00Var3, z00Var2, -1, s10Var);
                    if (this.b.D) {
                        c(z00Var, z00Var3, 1, this.l);
                    }
                }
            } else {
                cr crVar8 = crVarArr2[4];
                if (crVar8.f != null) {
                    z00 z00VarH10 = l82.h(crVar8);
                    if (z00VarH10 != null) {
                        l82.b(z00Var, z00VarH10, 0);
                        c(z00Var3, z00Var, -1, this.l);
                        c(z00Var2, z00Var3, 1, s10Var);
                    }
                } else if (!(qrVar17 instanceof bm0) && (qrVar3 = qrVar17.S) != null) {
                    l82.b(z00Var3, qrVar3.e.h, qrVar17.p());
                    c(z00Var2, z00Var3, 1, s10Var);
                    if (this.b.D) {
                        c(z00Var, z00Var3, 1, this.l);
                    }
                    if (this.d == 3) {
                        qr qrVar20 = this.b;
                        if (qrVar20.V > 0.0f) {
                            gm0 gm0Var2 = qrVar20.d;
                            if (gm0Var2.d == 3) {
                                gm0Var2.e.k.add(s10Var);
                                arrayList2.add(this.b.d.e);
                                s10Var.a = this;
                            }
                        }
                    }
                }
            }
        }
        if (arrayList2.size() == 0) {
            s10Var.c = true;
        }
    }

    @Override // defpackage.l82
    public final void e() {
        z00 z00Var = this.h;
        if (z00Var.j) {
            this.b.Y = z00Var.g;
        }
    }

    @Override // defpackage.l82
    public final void f() {
        this.c = null;
        this.h.c();
        this.i.c();
        this.k.c();
        this.e.c();
        this.g = false;
    }

    @Override // defpackage.l82
    public final boolean k() {
        return this.d != 3 || this.b.r == 0;
    }

    public final void m() {
        this.g = false;
        z00 z00Var = this.h;
        z00Var.c();
        z00Var.j = false;
        z00 z00Var2 = this.i;
        z00Var2.c();
        z00Var2.j = false;
        z00 z00Var3 = this.k;
        z00Var3.c();
        z00Var3.j = false;
        this.e.j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.b.g0;
    }
}
