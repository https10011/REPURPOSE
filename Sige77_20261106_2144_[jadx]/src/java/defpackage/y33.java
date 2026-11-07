package defpackage;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class y33 implements cv2 {
    public static final byte[] d = r93.p0("7a806c");
    public static final byte[] e = r93.p0("46bb91c3c5");
    public static final byte[] f = r93.p0("36864200e0eaf5284d884a0e77d31646");
    public static final byte[] g = r93.p0("bae8e37fc83441b16034566b");
    public static final byte[] h = r93.p0("af60eb711bd85bc1e4d3e0a462e074eea428a8");
    public final vl0 a;
    public final SecretKeySpec b;
    public final byte[] c;

    public y33(byte[] bArr, byte[] bArr2, vl0 vl0Var) throws InvalidAlgorithmParameterException {
        this.c = bArr2;
        dw0.H(bArr.length);
        this.b = new SecretKeySpec(bArr, "AES");
        this.a = vl0Var;
    }

    public static boolean a(Cipher cipher) {
        try {
            byte[] bArr = g;
            cipher.init(2, new SecretKeySpec(f, "AES"), new GCMParameterSpec(128, bArr, 0, bArr.length));
            cipher.updateAAD(e);
            byte[] bArr2 = h;
            return MessageDigest.isEqual(cipher.doFinal(bArr2, 0, bArr2.length), d);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    @Override // defpackage.cv2
    public final byte[] g(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        byte[] bArr3 = this.c;
        if (length < bArr3.length + 28) {
            tv2.f("ciphertext too short");
            return null;
        }
        if (!kg3.b(bArr3, bArr)) {
            tv2.f("Decryption failed (OutputPrefix mismatch).");
            return null;
        }
        this.a.getClass();
        Cipher cipherY = vl0.y();
        cipherY.init(2, this.b, new GCMParameterSpec(128, bArr, bArr3.length, 12));
        if (bArr2 != null && bArr2.length != 0) {
            cipherY.updateAAD(bArr2);
        }
        return cipherY.doFinal(bArr, bArr3.length + 12, (bArr.length - bArr3.length) - 12);
    }

    @Override // defpackage.cv2
    public final byte[] h(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        this.a.getClass();
        Cipher cipherY = vl0.y();
        int length = bArr.length;
        byte[] bArr3 = this.c;
        if (length > 2147483619 - bArr3.length) {
            tv2.f("plaintext too long");
            return null;
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr3, bArr3.length + 12 + bArr.length + 16);
        byte[] bArrA = xf3.a(12);
        System.arraycopy(bArrA, 0, bArrCopyOf, bArr3.length, 12);
        cipherY.init(1, this.b, new GCMParameterSpec(128, bArrA, 0, bArrA.length));
        if (bArr2 != null && bArr2.length != 0) {
            cipherY.updateAAD(bArr2);
        }
        int iDoFinal = cipherY.doFinal(bArr, 0, bArr.length, bArrCopyOf, bArr3.length + 12);
        if (iDoFinal == bArr.length + 16) {
            return bArrCopyOf;
        }
        throw new GeneralSecurityException(ts.g(iDoFinal - bArr.length, "encryption failed; AES-GCM-SIV tag must be 16 bytes, but got only ", " bytes"));
    }
}
