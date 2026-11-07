package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class l82 implements v00 {
    public int a;
    public qr b;
    public pk1 c;
    public int d;
    public final s10 e = new s10(this);
    public int f = 0;
    public boolean g = false;
    public final z00 h = new z00(this);
    public final z00 i = new z00(this);
    public int j = 1;

    public l82(qr qrVar) {
        this.b = qrVar;
    }

    public static void b(z00 z00Var, z00 z00Var2, int i) {
        z00Var.l.add(z00Var2);
        z00Var.f = i;
        z00Var2.k.add(z00Var);
    }

    public static z00 h(cr crVar) {
        cr crVar2 = crVar.f;
        if (crVar2 == null) {
            return null;
        }
        qr qrVar = crVar2.d;
        int iV = ts.v(crVar2.e);
        if (iV == 1) {
            return qrVar.d.h;
        }
        if (iV == 2) {
            return qrVar.e.h;
        }
        if (iV == 3) {
            return qrVar.d.i;
        }
        if (iV == 4) {
            return qrVar.e.i;
        }
        if (iV != 5) {
            return null;
        }
        return qrVar.e.k;
    }

    public static z00 i(cr crVar, int i) {
        cr crVar2 = crVar.f;
        if (crVar2 == null) {
            return null;
        }
        qr qrVar = crVar2.d;
        l82 l82Var = i == 0 ? qrVar.d : qrVar.e;
        int iV = ts.v(crVar2.e);
        if (iV == 1 || iV == 2) {
            return l82Var.h;
        }
        if (iV == 3 || iV == 4) {
            return l82Var.i;
        }
        return null;
    }

    public final void c(z00 z00Var, z00 z00Var2, int i, s10 s10Var) {
        z00Var.l.add(z00Var2);
        z00Var.l.add(this.e);
        z00Var.h = i;
        z00Var.i = s10Var;
        z00Var2.k.add(z00Var);
        s10Var.k.add(z00Var);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i, int i2) {
        qr qrVar = this.b;
        if (i2 == 0) {
            int i3 = qrVar.u;
            int iMax = Math.max(qrVar.t, i);
            if (i3 > 0) {
                iMax = Math.min(i3, i);
            }
            if (iMax != i) {
                return iMax;
            }
        } else {
            int i4 = qrVar.x;
            int iMax2 = Math.max(qrVar.w, i);
            if (i4 > 0) {
                iMax2 = Math.min(i4, i);
            }
            if (iMax2 != i) {
                return iMax2;
            }
        }
        return i;
    }

    public long j() {
        s10 s10Var = this.e;
        if (s10Var.j) {
            return s10Var.g;
        }
        return 0L;
    }

    public abstract boolean k();

    /* JADX WARN: Code duplicated, block: B:28:0x0054 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x0056  */
    /* JADX WARN: Code duplicated, block: B:32:0x005e  */
    /* JADX WARN: Code duplicated, block: B:34:0x0064  */
    /* JADX WARN: Code duplicated, block: B:35:0x0069  */
    public final void l(cr crVar, cr crVar2, int i) {
        s10 s10Var;
        float f;
        int i2;
        int i3;
        z00 z00VarH = h(crVar);
        z00 z00VarH2 = h(crVar2);
        if (z00VarH.j && z00VarH2.j) {
            int iE = crVar.e() + z00VarH.g;
            int iE2 = z00VarH2.g - crVar2.e();
            int i4 = iE2 - iE;
            s10 s10Var2 = this.e;
            if (!s10Var2.j && this.d == 3) {
                int i5 = this.a;
                if (i5 == 0) {
                    s10Var2.d(g(i4, i));
                } else if (i5 == 1) {
                    s10Var2.d(Math.min(g(s10Var2.m, i), i4));
                } else if (i5 == 2) {
                    qr qrVar = this.b;
                    qr qrVar2 = qrVar.S;
                    if (qrVar2 != null) {
                        s10 s10Var3 = (i == 0 ? qrVar2.d : qrVar2.e).e;
                        if (s10Var3.j) {
                            s10Var2.d(g((int) ((s10Var3.g * (i == 0 ? qrVar.v : qrVar.y)) + 0.5f), i));
                        }
                    }
                } else if (i5 == 3) {
                    qr qrVar3 = this.b;
                    l82 l82Var = qrVar3.d;
                    if (l82Var.d == 3 && l82Var.a == 3) {
                        e52 e52Var = qrVar3.e;
                        if (e52Var.d != 3 || e52Var.a != 3) {
                            if (i == 0) {
                                l82Var = qrVar3.e;
                            }
                            s10Var = l82Var.e;
                            if (s10Var.j) {
                                f = qrVar3.V;
                                i2 = s10Var.g;
                                if (i == 1) {
                                    i3 = (int) ((i2 / f) + 0.5f);
                                } else {
                                    i3 = (int) ((f * i2) + 0.5f);
                                }
                                s10Var2.d(i3);
                            }
                        }
                    } else {
                        if (i == 0) {
                            l82Var = qrVar3.e;
                        }
                        s10Var = l82Var.e;
                        if (s10Var.j) {
                            f = qrVar3.V;
                            i2 = s10Var.g;
                            if (i == 1) {
                                i3 = (int) ((i2 / f) + 0.5f);
                            } else {
                                i3 = (int) ((f * i2) + 0.5f);
                            }
                            s10Var2.d(i3);
                        }
                    }
                }
            }
            if (s10Var2.j) {
                int i6 = s10Var2.g;
                z00 z00Var = this.i;
                z00 z00Var2 = this.h;
                if (i6 == i4) {
                    z00Var2.d(iE);
                    z00Var.d(iE2);
                    return;
                }
                qr qrVar4 = this.b;
                float f2 = i == 0 ? qrVar4.c0 : qrVar4.d0;
                if (z00VarH == z00VarH2) {
                    iE = z00VarH.g;
                    iE2 = z00VarH2.g;
                    f2 = 0.5f;
                }
                z00Var2.d((int) ((((iE2 - iE) - i6) * f2) + iE + 0.5f));
                z00Var.d(z00Var2.g + s10Var2.g);
            }
        }
    }
}
