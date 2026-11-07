package defpackage;

import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class j63 implements cv2 {
    public final byte[] a;
    public final int b;
    public final uh3 c;

    public j63(byte[] bArr, tr3 tr3Var, int i) {
        this.c = z32.J(th3.H(qh3.b(bArr.length), new ox1(tr3.a(bArr))));
        this.a = tr3Var.b();
        this.b = i;
    }

    public final byte[] a(byte[] bArr) throws GeneralSecurityException {
        byte[] bArr2 = {0, 1, 88, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        byte[] bArr3 = {0, 2, 88, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        if (bArr.length > 12 || bArr.length < 8) {
            tv2.f("invalid salt size");
            return null;
        }
        System.arraycopy(bArr, 0, bArr2, 4, bArr.length);
        System.arraycopy(bArr, 0, bArr3, 4, bArr.length);
        byte[] bArr4 = new byte[32];
        uh3 uh3Var = this.c;
        System.arraycopy(uh3Var.b(bArr2, 16), 0, bArr4, 0, 16);
        System.arraycopy(uh3Var.b(bArr3, 16), 0, bArr4, 16, 16);
        return bArr4;
    }

    @Override // defpackage.cv2
    public final byte[] g(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            uq1.h("ciphertext is null");
            return null;
        }
        int length = bArr.length;
        byte[] bArr3 = this.a;
        int length2 = bArr3.length;
        int i = this.b;
        if (length < length2 + i + 28) {
            tv2.f("ciphertext too short");
            return null;
        }
        if (!kg3.b(bArr3, bArr)) {
            tv2.f("Decryption failed (OutputPrefix mismatch).");
            return null;
        }
        int length3 = bArr3.length + i;
        byte[] bArrA = a(Arrays.copyOfRange(bArr, bArr3.length, length3));
        if (!ck1.g(2)) {
            tv2.f("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
            return null;
        }
        SecretKeySpec secretKeySpecC = g33.c(bArrA);
        int i2 = length3 + 12;
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, length3, i2);
        if (bArrCopyOfRange.length != 12) {
            tv2.f("iv is wrong size");
            return null;
        }
        if (bArr.length < length3 + 28) {
            tv2.f("ciphertext too short");
            return null;
        }
        AlgorithmParameterSpec algorithmParameterSpecA = g33.a(bArrCopyOfRange, 0, bArrCopyOfRange.length);
        Cipher cipherB = g33.b();
        cipherB.init(2, secretKeySpecC, algorithmParameterSpecA);
        if (bArr2 != null && bArr2.length != 0) {
            cipherB.updateAAD(bArr2);
        }
        return cipherB.doFinal(bArr, i2, bArr.length - i2);
    }

    @Override // defpackage.cv2
    public final byte[] h(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            uq1.h("plaintext is null");
            return null;
        }
        int i = this.b;
        int i2 = i + 12;
        byte[] bArrA = xf3.a(i2);
        byte[] bArrCopyOf = Arrays.copyOf(bArrA, i);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArrA, i, i2);
        byte[] bArrA2 = a(bArrCopyOf);
        if (!ck1.g(2)) {
            tv2.f("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
            return null;
        }
        SecretKeySpec secretKeySpecC = g33.c(bArrA2);
        byte[] bArr3 = this.a;
        int length = bArr3.length + i + bArrCopyOfRange.length;
        if (bArrCopyOfRange.length != 12) {
            tv2.f("iv is wrong size");
            return null;
        }
        AlgorithmParameterSpec algorithmParameterSpecA = g33.a(bArrCopyOfRange, 0, bArrCopyOfRange.length);
        Cipher cipherB = g33.b();
        cipherB.init(1, secretKeySpecC, algorithmParameterSpecA);
        if (bArr2 != null && bArr2.length != 0) {
            cipherB.updateAAD(bArr2);
        }
        int outputSize = cipherB.getOutputSize(bArr.length);
        if (outputSize > Integer.MAX_VALUE - length) {
            tv2.f("plaintext too long");
            return null;
        }
        byte[] bArr4 = new byte[length + outputSize];
        if (cipherB.doFinal(bArr, 0, bArr.length, bArr4, length) != outputSize) {
            tv2.f("not enough data written");
            return null;
        }
        System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
        System.arraycopy(bArrA, 0, bArr4, bArr3.length, bArrA.length);
        return bArr4;
    }
}
