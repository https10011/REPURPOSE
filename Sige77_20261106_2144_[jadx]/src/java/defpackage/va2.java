package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class va2 extends p implements ya2 {
    public static final BigInteger i = BigInteger.valueOf(1);
    public final xa2 a;
    public final m40 b;
    public final ua2 c;
    public final BigInteger d;
    public final BigInteger e;
    public final byte[] f;

    public va2(m40 m40Var, ua2 ua2Var, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        int[] iArr;
        this.b = m40Var;
        this.c = ua2Var;
        this.d = bigInteger;
        this.e = bigInteger2;
        this.f = bArr;
        zb0 zb0Var = m40Var.a;
        if (zb0Var.a() == 1) {
            BigInteger bigIntegerB = zb0Var.b();
            xa2 xa2Var = new xa2();
            xa2Var.a = ya2.j;
            xa2Var.b = new o(bigIntegerB);
            this.a = xa2Var;
            return;
        }
        if (zb0Var.a() <= 1 || !zb0Var.b().equals(l40.c) || !(zb0Var instanceof wh0)) {
            e.g("'curve' is of an unsupported type");
            throw null;
        }
        int[] iArr2 = ((wh0) zb0Var).b.a;
        if (iArr2 == null) {
            iArr = null;
        } else {
            iArr = new int[iArr2.length];
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
        }
        if (iArr.length == 3) {
            this.a = new xa2(iArr[2], iArr[1], 0, 0);
        } else if (iArr.length == 5) {
            this.a = new xa2(iArr[4], iArr[1], iArr[2], iArr[3]);
        } else {
            e.g("Only trinomial and pentomial curves are supported");
            throw null;
        }
    }

    @Override // defpackage.p
    public final r a() {
        gk1 gk1Var = new gk1(2);
        gk1Var.k(new o(i));
        gk1Var.k(this.a);
        ua2 ua2Var = new ua2();
        ua2Var.d = null;
        m40 m40Var = this.b;
        ua2Var.b = m40Var;
        ua2Var.c = this.f;
        if (m40Var.a.a() == 1) {
            ua2Var.d = ya2.j;
        } else {
            zb0 zb0Var = m40Var.a;
            if (zb0Var.a() <= 1 || !zb0Var.b().equals(l40.c) || !(zb0Var instanceof wh0)) {
                e.g("This type of ECCurve is not implemented");
                return null;
            }
            ua2Var.d = ya2.k;
        }
        gk1Var.k(ua2Var);
        gk1Var.k(this.c);
        gk1Var.k(new o(this.d));
        BigInteger bigInteger = this.e;
        if (bigInteger != null) {
            gk1Var.k(new o(bigInteger));
        }
        return new bw(gk1Var);
    }
}
