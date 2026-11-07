package defpackage;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class wh3 implements uh3 {
    public static final xv1 d = new xv1(8);
    public final SecretKeySpec a;
    public final byte[] b;
    public final byte[] c;

    public wh3(byte[] bArr) throws GeneralSecurityException {
        dw0.H(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.a = secretKeySpec;
        if (!ck1.i(1)) {
            tv2.f("Can not use AES-CMAC in FIPS-mode.");
            throw null;
        }
        Cipher cipher = (Cipher) d.get();
        cipher.init(1, secretKeySpec);
        byte[] bArrG = zi0.G(cipher.doFinal(new byte[16]));
        this.b = bArrG;
        this.c = zi0.G(bArrG);
    }

    @Override // defpackage.uh3
    public final byte[] b(byte[] bArr, int i) throws GeneralSecurityException {
        byte[] bArrC0;
        if (i > 16) {
            throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
        }
        if (!ck1.i(1)) {
            tv2.f("Can not use AES-CMAC in FIPS-mode.");
            return null;
        }
        Cipher cipher = (Cipher) d.get();
        cipher.init(1, this.a);
        int length = bArr.length;
        int i2 = length == 0 ? 1 : ((length - 1) / 16) + 1;
        if ((i2 << 4) == bArr.length) {
            bArrC0 = nj2.b0(bArr, (i2 - 1) << 4, this.b, 16);
        } else {
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, (i2 - 1) << 4, bArr.length);
            if (bArrCopyOfRange.length >= 16) {
                e.g("x must be smaller than a block.");
                return null;
            }
            byte[] bArrCopyOf = Arrays.copyOf(bArrCopyOfRange, 16);
            bArrCopyOf[bArrCopyOfRange.length] = -128;
            bArrC0 = nj2.c0(bArrCopyOf, this.c);
        }
        byte[] bArr2 = new byte[16];
        byte[] bArr3 = new byte[16];
        for (int i3 = 0; i3 < i2 - 1; i3++) {
            int i4 = i3 << 4;
            for (int i5 = 0; i5 < 16; i5++) {
                bArr3[i5] = (byte) (bArr2[i5] ^ bArr[i5 + i4]);
            }
            if (cipher.doFinal(bArr3, 0, 16, bArr2) != 16) {
                uq1.q("Cipher didn't write full block");
                return null;
            }
        }
        for (int i6 = 0; i6 < 16; i6++) {
            bArr3[i6] = (byte) (bArr2[i6] ^ bArrC0[i6]);
        }
        if (cipher.doFinal(bArr3, 0, 16, bArr2) == 16) {
            return 16 == i ? bArr2 : Arrays.copyOf(bArr2, i);
        }
        uq1.q("Cipher didn't write full block");
        return null;
    }
}
