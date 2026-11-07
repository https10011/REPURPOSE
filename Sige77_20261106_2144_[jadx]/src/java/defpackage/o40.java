package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class o40 extends m40 {
    public BigInteger h;
    public BigInteger i;
    public cv j;

    public o40(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5) {
        super(bigInteger);
        this.h = bigInteger;
        int iBitLength = bigInteger.bitLength();
        this.i = (iBitLength < 96 || bigInteger.shiftRight(iBitLength + (-64)).longValue() != -1) ? null : l40.b.shiftLeft(iBitLength).subtract(bigInteger);
        this.j = new cv((m40) this, (r93) null, (r93) null, false);
        this.b = f(bigInteger2);
        this.c = f(bigInteger3);
        this.d = bigInteger4;
        this.e = bigInteger5;
        this.f = 4;
    }

    @Override // defpackage.m40
    public final m40 a() {
        BigInteger bigInteger = this.h;
        BigInteger bigInteger2 = this.i;
        r93 r93Var = this.b;
        r93 r93Var2 = this.c;
        BigInteger bigInteger3 = this.d;
        BigInteger bigInteger4 = this.e;
        o40 o40Var = new o40(bigInteger);
        o40Var.h = bigInteger;
        o40Var.i = bigInteger2;
        o40Var.j = new cv((m40) o40Var, (r93) null, (r93) null, false);
        o40Var.b = r93Var;
        o40Var.c = r93Var2;
        o40Var.d = bigInteger3;
        o40Var.e = bigInteger4;
        o40Var.f = 4;
        return o40Var;
    }

    @Override // defpackage.m40
    public final t40 c(r93 r93Var, r93 r93Var2, boolean z) {
        return new cv(this, r93Var, r93Var2, z);
    }

    @Override // defpackage.m40
    public final r93 f(BigInteger bigInteger) {
        return new q40(this.h, this.i, bigInteger);
    }

    @Override // defpackage.m40
    public final int g() {
        return this.h.bitLength();
    }

    @Override // defpackage.m40
    public final t40 h() {
        return this.j;
    }

    @Override // defpackage.m40
    public final t40 i(t40 t40Var) {
        int i;
        return (this == t40Var.a || this.f != 2 || t40Var.f() || !((i = t40Var.a.f) == 2 || i == 3 || i == 4)) ? super.i(t40Var) : new cv(this, f(t40Var.b.g0()), f(t40Var.c.g0()), new r93[]{f(t40Var.d[0].g0())}, t40Var.e, 1);
    }

    @Override // defpackage.m40
    public final boolean j(int i) {
        return i == 0 || i == 1 || i == 2 || i == 4;
    }
}
