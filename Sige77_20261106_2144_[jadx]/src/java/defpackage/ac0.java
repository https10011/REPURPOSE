package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class ac0 {
    public static final tc1 a = new tc1(BigInteger.valueOf(2));
    public static final tc1 b = new tc1(BigInteger.valueOf(3));

    public static wh0 a(int[] iArr) {
        if (iArr[0] != 0) {
            e.g("Irreducible polynomials in GF(2) must have constant term");
            return null;
        }
        for (int i = 1; i < iArr.length; i++) {
            if (iArr[i] <= iArr[i - 1]) {
                e.g("Polynomial exponents must be montonically increasing");
                return null;
            }
        }
        return new wh0(a, new fh0(iArr));
    }
}
