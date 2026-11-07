package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class t40 {
    public static final r93[] g = new r93[0];
    public final m40 a;
    public final r93 b;
    public final r93 c;
    public final r93[] d;
    public boolean e;
    public final /* synthetic */ int f;

    /* JADX WARN: Illegal instructions before constructor call */
    public t40(m40 m40Var, r93 r93Var, r93 r93Var2, int i) {
        r93[] r93VarArr;
        this.f = i;
        int i2 = m40Var == null ? 0 : m40Var.f;
        if (i2 == 0 || i2 == 5) {
            r93VarArr = g;
        } else {
            r93 r93VarF = m40Var.f(l40.b);
            if (i2 == 1 || i2 == 2) {
                r93VarArr = new r93[]{r93VarF};
            } else if (i2 == 3) {
                r93VarArr = new r93[]{r93VarF, r93VarF, r93VarF};
            } else if (i2 != 4) {
                if (i2 != 6) {
                    e.g("unknown coordinate system");
                    throw null;
                }
                r93VarArr = new r93[]{r93VarF};
            } else {
                r93VarArr = new r93[]{r93VarF, m40Var.b};
            }
        }
        this(m40Var, r93Var, r93Var2, r93VarArr);
    }

    public abstract t40 a(t40 t40Var);

    /* JADX WARN: Code duplicated, block: B:72:0x00fa A[RETURN] */
    public final boolean b(t40 t40Var) {
        if (t40Var != null) {
            m40 m40Var = t40Var.a;
            m40 m40Var2 = this.a;
            boolean z = m40Var2 == null;
            boolean z2 = m40Var == null;
            boolean zF = f();
            boolean zF2 = t40Var.f();
            if (zF || zF2) {
                if (zF && zF2 && (z || z2 || m40Var2.e(m40Var))) {
                    return true;
                }
            } else if (!z || !z2) {
                if (z) {
                    t40Var = t40Var.i();
                } else if (z2) {
                    this = i();
                } else if (m40Var2.e(m40Var)) {
                    t40[] t40VarArr = new t40[2];
                    t40VarArr[0] = this;
                    t40VarArr[1] = m40Var2.i(t40Var);
                    for (int i = 0; i < 2; i++) {
                        t40 t40Var2 = t40VarArr[i];
                        if (t40Var2 != null && m40Var2 != t40Var2.a) {
                            e.g("'points' entries must be null or on this curve");
                            return false;
                        }
                    }
                    int i2 = m40Var2.f;
                    if (i2 != 0 && i2 != 5) {
                        r93[] r93VarArr = new r93[2];
                        int[] iArr = new int[2];
                        int i3 = 0;
                        for (int i4 = 0; i4 < 2; i4++) {
                            t40 t40Var3 = t40VarArr[i4];
                            if (t40Var3 != null && !t40Var3.g()) {
                                r93VarArr[i3] = t40Var3.e();
                                iArr[i3] = i4;
                                i3++;
                            }
                        }
                        if (i3 != 0) {
                            r93[] r93VarArr2 = new r93[i3];
                            r93VarArr2[0] = r93VarArr[0];
                            int i5 = 0;
                            while (true) {
                                int i6 = i5 + 1;
                                if (i6 >= i3) {
                                    break;
                                }
                                r93VarArr2[i6] = r93VarArr2[i5].N(r93VarArr[i6]);
                                i5 = i6;
                            }
                            r93 r93VarD = r93VarArr2[i5].D();
                            while (i5 > 0) {
                                int i7 = i5 - 1;
                                r93 r93Var = r93VarArr[i5];
                                r93VarArr[i5] = r93VarArr2[i7].N(r93VarD);
                                r93VarD = r93VarD.N(r93Var);
                                i5 = i7;
                            }
                            r93VarArr[0] = r93VarD;
                            for (int i8 = 0; i8 < i3; i8++) {
                                int i9 = iArr[i8];
                                t40VarArr[i9] = t40VarArr[i9].j(r93VarArr[i8]);
                            }
                        }
                    }
                    this = t40VarArr[0];
                    t40Var = t40VarArr[1];
                }
                if (!this.b.equals(t40Var.b) && this.d().equals(t40Var.d())) {
                    return true;
                }
            } else if (!this.b.equals(t40Var.b)) {
            }
        }
        return false;
    }

    public final int c() {
        m40 m40Var = this.a;
        if (m40Var == null) {
            return 0;
        }
        return m40Var.f;
    }

    public r93 d() {
        return this.c;
    }

    public r93 e() {
        r93[] r93VarArr = this.d;
        if (r93VarArr.length <= 0) {
            return null;
        }
        return r93VarArr[0];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t40) {
            return b((t40) obj);
        }
        return false;
    }

    public final boolean f() {
        if (this.b == null || this.c == null) {
            return true;
        }
        r93[] r93VarArr = this.d;
        return r93VarArr.length > 0 && r93VarArr[0].I();
    }

    public final boolean g() {
        int iC = c();
        return iC == 0 || iC == 5 || f() || this.d[0].F();
    }

    public abstract t40 h();

    public final int hashCode() {
        m40 m40Var = this.a;
        int i = m40Var == null ? 0 : ~m40Var.hashCode();
        if (f()) {
            return i;
        }
        t40 t40VarI = i();
        return (t40VarI.d().hashCode() * 257) ^ (i ^ (t40VarI.b.hashCode() * 17));
    }

    public final t40 i() {
        int iC;
        if (f() || (iC = c()) == 0 || iC == 5) {
            return this;
        }
        r93 r93VarE = e();
        return r93VarE.F() ? this : j(r93VarE.D());
    }

    public final t40 j(r93 r93Var) {
        int iC = c();
        r93 r93Var2 = this.c;
        r93 r93Var3 = this.b;
        m40 m40Var = this.a;
        if (iC != 1) {
            if (iC == 2 || iC == 3 || iC == 4) {
                r93 r93VarX = r93Var.X();
                return m40Var.c(r93Var3.N(r93VarX), r93Var2.N(r93VarX.N(r93Var)), this.e);
            }
            if (iC != 6) {
                uq1.q("not a projective coordinate system");
                return null;
            }
        }
        return m40Var.c(r93Var3.N(r93Var), r93Var2.N(r93Var), this.e);
    }

    public final boolean k() {
        m40 m40Var = this.a;
        BigInteger bigInteger = m40Var.e;
        if (bigInteger != null && !bigInteger.equals(l40.b)) {
            BigInteger bigIntegerAbs = bigInteger.abs();
            t40 t40VarH = m40Var.h();
            int iBitLength = bigIntegerAbs.bitLength();
            if (iBitLength > 0) {
                if (bigIntegerAbs.testBit(0)) {
                    t40VarH = this;
                }
                for (int i = 1; i < iBitLength; i++) {
                    this = this.m();
                    if (bigIntegerAbs.testBit(i)) {
                        t40VarH = t40VarH.a(this);
                    }
                }
            }
            if (bigInteger.signum() < 0) {
                t40VarH = t40VarH.h();
            }
            if (t40VarH.f()) {
                return false;
            }
        }
        return true;
    }

    public final boolean l() {
        r93 r93VarQ;
        r93 r93VarA0;
        int i = this.f;
        m40 m40Var = this.a;
        r93 r93Var = this.c;
        r93 r93Var2 = this.b;
        r93[] r93VarArr = this.d;
        switch (i) {
            case 0:
                r93 r93VarN = m40Var.b;
                r93 r93VarN2 = m40Var.c;
                int i2 = m40Var.f;
                if (i2 != 6) {
                    r93 r93VarN3 = r93Var.d(r93Var2).N(r93Var);
                    if (i2 != 0) {
                        if (i2 != 1) {
                            uq1.q("unsupported coordinate system");
                            return false;
                        }
                        r93 r93Var3 = r93VarArr[0];
                        if (!r93Var3.F()) {
                            r93 r93VarN4 = r93Var3.N(r93Var3.X());
                            r93VarN3 = r93VarN3.N(r93Var3);
                            r93VarN = r93VarN.N(r93Var3);
                            r93VarN2 = r93VarN2.N(r93VarN4);
                        }
                    }
                    return r93VarN3.equals(r93Var2.d(r93VarN).N(r93Var2.X()).d(r93VarN2));
                }
                r93 r93Var4 = r93VarArr[0];
                boolean zF = r93Var4.F();
                if (r93Var2.I()) {
                    r93 r93VarX = r93Var.X();
                    if (!zF) {
                        r93VarN2 = r93VarN2.N(r93Var4.X());
                    }
                    return r93VarX.equals(r93VarN2);
                }
                r93 r93VarX2 = r93Var2.X();
                if (zF) {
                    r93VarQ = y00.m(r93Var, r93Var, r93VarN);
                    r93VarA0 = r93VarX2.X().d(r93VarN2);
                } else {
                    r93 r93VarX3 = r93Var4.X();
                    r93 r93VarX4 = r93VarX3.X();
                    r93VarQ = r93Var.d(r93Var4).Q(r93Var, r93VarN, r93VarX3);
                    r93VarA0 = r93VarX2.a0(r93VarN2, r93VarX4);
                }
                return r93VarQ.N(r93VarX2).equals(r93VarA0);
            default:
                r93 r93VarN5 = m40Var.b;
                r93 r93VarN6 = m40Var.c;
                r93 r93VarX5 = r93Var.X();
                int iC = c();
                if (iC != 0) {
                    if (iC == 1) {
                        r93 r93Var5 = r93VarArr[0];
                        if (!r93Var5.F()) {
                            r93 r93VarX6 = r93Var5.X();
                            r93 r93VarN7 = r93Var5.N(r93VarX6);
                            r93VarX5 = r93VarX5.N(r93Var5);
                            r93VarN5 = r93VarN5.N(r93VarX6);
                            r93VarN6 = r93VarN6.N(r93VarN7);
                        }
                    } else {
                        if (iC != 2 && iC != 3 && iC != 4) {
                            uq1.q("unsupported coordinate system");
                            return false;
                        }
                        r93 r93Var6 = r93VarArr[0];
                        if (!r93Var6.F()) {
                            r93 r93VarX7 = r93Var6.X();
                            r93 r93VarX8 = r93VarX7.X();
                            r93 r93VarN8 = r93VarX7.N(r93VarX8);
                            r93VarN5 = r93VarN5.N(r93VarX8);
                            r93VarN6 = r93VarN6.N(r93VarN8);
                        }
                    }
                }
                return r93VarX5.equals(r93Var2.X().d(r93VarN5).N(r93Var2).d(r93VarN6));
        }
    }

    public abstract t40 m();

    public final String toString() {
        if (f()) {
            return "INF";
        }
        StringBuffer stringBuffer = new StringBuffer("(");
        stringBuffer.append(this.b);
        stringBuffer.append(',');
        stringBuffer.append(this.c);
        int i = 0;
        while (true) {
            r93[] r93VarArr = this.d;
            if (i >= r93VarArr.length) {
                stringBuffer.append(')');
                return stringBuffer.toString();
            }
            stringBuffer.append(',');
            stringBuffer.append(r93VarArr[i]);
            i++;
        }
    }

    public t40(m40 m40Var, r93 r93Var, r93 r93Var2, r93[] r93VarArr) {
        this.a = m40Var;
        this.b = r93Var;
        this.c = r93Var2;
        this.d = r93VarArr;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t40(m40 m40Var, r93 r93Var, r93 r93Var2, r93[] r93VarArr, int i) {
        this(m40Var, r93Var, r93Var2, r93VarArr);
        this.f = i;
    }
}
