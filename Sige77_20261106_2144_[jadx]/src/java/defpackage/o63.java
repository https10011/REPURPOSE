package defpackage;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.Provider;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class o63 implements cv2 {
    public final byte[] a;
    public final byte[] b;
    public final Provider c;

    public o63(byte[] bArr, byte[] bArr2, Provider provider) throws GeneralSecurityException {
        if (!ck1.i(1)) {
            tv2.f("Can not use ChaCha20Poly1305 in FIPS-mode.");
            throw null;
        }
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.a = bArr;
        this.b = bArr2;
        this.c = provider;
    }

    @Override // defpackage.cv2
    public final byte[] g(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            uq1.h("ciphertext is null");
            return null;
        }
        int length = bArr.length;
        byte[] bArr3 = this.b;
        if (length < bArr3.length + 40) {
            tv2.f("ciphertext too short");
            return null;
        }
        if (!kg3.b(bArr3, bArr)) {
            tv2.f("Decryption failed (OutputPrefix mismatch).");
            return null;
        }
        byte[] bArr4 = new byte[24];
        System.arraycopy(bArr, bArr3.length, bArr4, 0, 24);
        SecretKeySpec secretKeySpec = new SecretKeySpec(g53.c(this.a, bArr4), "ChaCha20");
        byte[] bArr5 = new byte[12];
        System.arraycopy(bArr4, 16, bArr5, 4, 8);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr5);
        byte[] bArr6 = n43.d;
        Cipher cipher = Cipher.getInstance("ChaCha20-Poly1305", this.c);
        cipher.init(2, secretKeySpec, ivParameterSpec);
        if (bArr2 != null && bArr2.length != 0) {
            cipher.updateAAD(bArr2);
        }
        return cipher.doFinal(bArr, bArr3.length + 24, (bArr.length - bArr3.length) - 24);
    }

    @Override // defpackage.cv2
    public final byte[] h(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            uq1.h("plaintext is null");
            return null;
        }
        byte[] bArrA = xf3.a(24);
        SecretKeySpec secretKeySpec = new SecretKeySpec(g53.c(this.a, bArrA), "ChaCha20");
        byte[] bArr3 = new byte[12];
        System.arraycopy(bArrA, 16, bArr3, 4, 8);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr3);
        byte[] bArr4 = n43.d;
        Cipher cipher = Cipher.getInstance("ChaCha20-Poly1305", this.c);
        cipher.init(1, secretKeySpec, ivParameterSpec);
        if (bArr2 != null && bArr2.length != 0) {
            cipher.updateAAD(bArr2);
        }
        int outputSize = cipher.getOutputSize(bArr.length);
        byte[] bArr5 = this.b;
        if (outputSize > 2147483623 - bArr5.length) {
            tv2.f("plaintext too long");
            return null;
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr5, bArr5.length + 24 + outputSize);
        System.arraycopy(bArrA, 0, bArrCopyOf, bArr5.length, 24);
        if (cipher.doFinal(bArr, 0, bArr.length, bArrCopyOf, bArr5.length + 24) == outputSize) {
            return bArrCopyOf;
        }
        tv2.f("not enough data written");
        return null;
    }
}
