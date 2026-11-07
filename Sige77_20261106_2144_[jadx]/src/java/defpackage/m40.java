package defpackage;

import java.math.BigInteger;
import java.util.Random;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class m40 {
    public final zb0 a;
    public r93 b;
    public r93 c;
    public BigInteger d;
    public BigInteger e;
    public int f;
    public final /* synthetic */ int g;

    /* JADX WARN: Illegal instructions before constructor call */
    public m40(int i, int i2, int i3, int i4) {
        wh0 wh0VarA;
        this.g = 0;
        if (i2 == 0) {
            e.g("k1 must be > 0");
            throw null;
        }
        if (i3 == 0) {
            if (i4 != 0) {
                e.g("k3 must be 0 if k2 == 0");
                throw null;
            }
            wh0VarA = ac0.a(new int[]{0, i2, i});
        } else {
            if (i3 <= i2) {
                e.g("k2 must be > k1");
                throw null;
            }
            if (i4 <= i3) {
                e.g("k3 must be > k2");
                throw null;
            }
            wh0VarA = ac0.a(new int[]{0, i2, i3, i4, i});
        }
        this(wh0VarA);
    }

    public abstract m40 a();

    public t40 b(BigInteger bigInteger, BigInteger bigInteger2, boolean z) {
        switch (this.g) {
            case 0:
                r93 r93VarF = f(bigInteger);
                r93 r93VarF2 = f(bigInteger2);
                int i = this.f;
                if (i == 5 || i == 6) {
                    if (!r93VarF.I()) {
                        r93VarF2 = r93VarF2.p(r93VarF).d(r93VarF);
                    } else if (!r93VarF2.X().equals(this.c)) {
                        sm0.a();
                        return null;
                    }
                }
                return c(r93VarF, r93VarF2, z);
            default:
                return c(f(bigInteger), f(bigInteger2), z);
        }
    }

    public abstract t40 c(r93 r93Var, r93 r93Var2, boolean z);

    public final t40 d(byte[] bArr) {
        t40 t40Var;
        t40 t40VarH;
        r93 r93VarD;
        int iG = (g() + 7) / 8;
        byte b = bArr[0];
        t40 t40Var2 = null;
        if (b == 0) {
            t40Var = null;
            if (bArr.length != 1) {
                e.g("Incorrect length for infinity encoding");
                return null;
            }
            t40VarH = h();
        } else if (b == 2 || b == 3) {
            if (bArr.length != iG + 1) {
                e.g("Incorrect length for compressed encoding");
                return null;
            }
            int i = b & 1;
            BigInteger bigIntegerA = eh.a(bArr, 1, iG);
            switch (this.g) {
                case 0:
                    r93 r93VarF = f(bigIntegerA);
                    if (r93VarF.I()) {
                        r93VarD = this.c.W();
                        t40Var = null;
                    } else {
                        r93 r93VarD2 = r93VarF.X().D().N(this.c).d(this.b).d(r93VarF);
                        if (r93VarD2.I()) {
                            t40Var = null;
                        } else {
                            r93 r93VarF2 = f(l40.a);
                            int iG2 = g();
                            Random random = new Random();
                            while (true) {
                                r93 r93VarF3 = f(new BigInteger(iG2, random));
                                r93 r93VarD3 = r93VarD2;
                                int i2 = 1;
                                r93 r93Var = r93VarF2;
                                while (i2 < iG2) {
                                    r93 r93VarX = r93VarD3.X();
                                    r93 r93VarD4 = r93Var.X().d(r93VarX.N(r93VarF3));
                                    r93VarD3 = r93VarX.d(r93VarD2);
                                    i2++;
                                    r93Var = r93VarD4;
                                    t40Var2 = t40Var2;
                                }
                                t40Var = t40Var2;
                                if (r93VarD3.I()) {
                                    r93 r93Var2 = r93Var;
                                    if (r93Var.X().d(r93Var2).I()) {
                                        t40Var2 = t40Var;
                                    } else {
                                        r93VarD2 = r93Var2;
                                    }
                                } else {
                                    r93VarD2 = t40Var;
                                }
                            }
                        }
                        if (r93VarD2 != null) {
                            if (r93VarD2.f0() != (i == 1)) {
                                r93VarD2 = r93VarD2.g();
                            }
                            int i3 = this.f;
                            r93VarD = (i3 == 5 || i3 == 6) ? r93VarD2.d(r93VarF) : r93VarD2.N(r93VarF);
                        } else {
                            r93VarD = t40Var;
                        }
                    }
                    if (r93VarD == null) {
                        e.g("Invalid point compression");
                        t40VarH = t40Var;
                    } else {
                        t40VarH = c(r93VarF, r93VarD, true);
                    }
                    break;
                default:
                    r93 r93VarF4 = f(bigIntegerA);
                    r93 r93VarW = r93VarF4.X().d(this.b).N(r93VarF4).d(this.c).W();
                    if (r93VarW != null) {
                        if (r93VarW.f0() != (i == 1)) {
                            r93VarW = r93VarW.R();
                        }
                        t40VarH = c(r93VarF4, r93VarW, true);
                    } else {
                        e.g("Invalid point compression");
                        t40VarH = null;
                    }
                    t40Var = null;
                    break;
            }
            if (!t40VarH.k()) {
                e.g("Invalid point");
                return t40Var;
            }
        } else {
            if (b != 4) {
                if (b != 6 && b != 7) {
                    uq1.l(Integer.toString(b, 16), "Invalid point encoding 0x");
                    return null;
                }
                if (bArr.length != (iG * 2) + 1) {
                    e.g("Incorrect length for hybrid encoding");
                    return null;
                }
                BigInteger bigIntegerA2 = eh.a(bArr, 1, iG);
                BigInteger bigIntegerA3 = eh.a(bArr, iG + 1, iG);
                if (bigIntegerA3.testBit(0) != (b == 7)) {
                    e.g("Inconsistent Y coordinate in hybrid encoding");
                    return null;
                }
                t40VarH = b(bigIntegerA2, bigIntegerA3, false);
                if (!t40VarH.f() && t40VarH.a != null && (!t40VarH.l() || !t40VarH.k())) {
                    e.g("Invalid point coordinates");
                    return null;
                }
            } else {
                if (bArr.length != (iG * 2) + 1) {
                    e.g("Incorrect length for uncompressed encoding");
                    return null;
                }
                t40VarH = b(eh.a(bArr, 1, iG), eh.a(bArr, iG + 1, iG), false);
                if (!t40VarH.f() && t40VarH.a != null && (!t40VarH.l() || !t40VarH.k())) {
                    e.g("Invalid point coordinates");
                    return null;
                }
            }
            t40Var = null;
        }
        if (b == 0 || !t40VarH.f()) {
            return t40VarH;
        }
        e.g("Invalid infinity encoding");
        return t40Var;
    }

    public final boolean e(m40 m40Var) {
        if (this != m40Var) {
            return m40Var != null && this.a.equals(m40Var.a) && this.b.g0().equals(m40Var.b.g0()) && this.c.g0().equals(m40Var.c.g0());
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof m40) && e((m40) obj);
        }
        return true;
    }

    public abstract r93 f(BigInteger bigInteger);

    public abstract int g();

    public abstract t40 h();

    public final int hashCode() {
        return Integer.rotateLeft(this.c.g0().hashCode(), 16) ^ (this.a.hashCode() ^ Integer.rotateLeft(this.b.g0().hashCode(), 8));
    }

    public t40 i(t40 t40Var) {
        if (this == t40Var.a) {
            return t40Var;
        }
        if (t40Var.f()) {
            return h();
        }
        t40 t40VarI = t40Var.i();
        t40 t40VarB = b(t40VarI.b.g0(), t40VarI.d().g0(), t40VarI.e);
        if (t40VarB.f() || t40VarB.a == null) {
            return t40VarB;
        }
        if (t40VarB.l() && t40VarB.k()) {
            return t40VarB;
        }
        e.g("Invalid point coordinates");
        return null;
    }

    public abstract boolean j(int i);

    /* JADX WARN: Code duplicated, block: B:14:0x0024  */
    /* JADX WARN: Illegal instructions before constructor call */
    public m40(BigInteger bigInteger) {
        tc1 tc1Var;
        this.g = 1;
        tc1 tc1Var2 = ac0.a;
        int iBitLength = bigInteger.bitLength();
        if (bigInteger.signum() > 0 && iBitLength >= 2) {
            if (iBitLength < 3) {
                int iIntValue = bigInteger.intValue();
                if (iIntValue == 2) {
                    tc1Var = ac0.a;
                } else if (iIntValue == 3) {
                    tc1Var = ac0.b;
                } else {
                    tc1Var = new tc1(bigInteger);
                }
            } else {
                tc1Var = new tc1(bigInteger);
            }
            this(tc1Var);
            return;
        }
        e.g("'characteristic' must be >= 2");
        throw null;
    }

    public m40(zb0 zb0Var) {
        this.f = 0;
        this.a = zb0Var;
    }
}
