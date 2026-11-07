package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class xn1 extends m40 {
    public static final wn1 i;
    public static final wn1 j;
    public final u40 h;

    static {
        wn1 wn1Var = new wn1(new BigInteger(1, cm0.a("02F40E7E2221F295DE297117B7F3D62F5C6A97FFCB8CEFF1CD6BA8CE4A9A18AD84FFABBD8EFA59332BE7AD6756A66E294AFD185A78FF12AA520E4DE739BACA0C7FFEFF7F2955727A")));
        i = wn1Var;
        j = (wn1) wn1Var.W();
    }

    public xn1() {
        super(571, 2, 5, 10);
        this.h = new u40(this, null, null, false, 18);
        this.b = new wn1(BigInteger.valueOf(1L));
        this.c = i;
        this.d = new BigInteger(1, cm0.a("03FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFE661CE18FF55987308059B186823851EC7DD9CA1161DE93D5174D66E8382E9BB2FE84E47"));
        this.e = BigInteger.valueOf(2L);
        this.f = 6;
    }

    @Override // defpackage.m40
    public final m40 a() {
        return new xn1();
    }

    @Override // defpackage.m40
    public final t40 c(r93 r93Var, r93 r93Var2, boolean z) {
        return new u40(this, r93Var, r93Var2, z, 18);
    }

    @Override // defpackage.m40
    public final r93 f(BigInteger bigInteger) {
        return new wn1(bigInteger);
    }

    @Override // defpackage.m40
    public final int g() {
        return 571;
    }

    @Override // defpackage.m40
    public final t40 h() {
        return this.h;
    }

    @Override // defpackage.m40
    public final boolean j(int i2) {
        return i2 == 6;
    }
}
