package defpackage;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class lq3 implements cv2 {
    public static final xv1 e = new xv1(11);
    public final byte[] a;
    public final uh3 b;
    public final SecretKeySpec c;
    public final int d;

    public lq3(int i, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (!ck1.i(1)) {
            tv2.f("Can not use AES-EAX in FIPS-mode.");
            throw null;
        }
        if (i != 12 && i != 16) {
            e.g("IV size should be either 12 or 16 bytes");
            throw null;
        }
        this.d = i;
        dw0.H(bArr.length);
        this.c = new SecretKeySpec(bArr, "AES");
        this.b = z32.J(th3.H(qh3.b(bArr.length), new ox1(tr3.a(bArr))));
        this.a = bArr2;
    }

    public final byte[] a(int i, byte[] bArr, int i2, int i3) {
        byte[] bArr2 = new byte[i3 + 16];
        bArr2[15] = (byte) i;
        System.arraycopy(bArr, i2, bArr2, 16, i3);
        return this.b.b(bArr2, 16);
    }

    @Override // defpackage.cv2
    public final byte[] g(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        byte[] bArr3 = this.a;
        int length2 = length - bArr3.length;
        int i = this.d;
        int i2 = (length2 - i) - 16;
        if (i2 < 0) {
            tv2.f("ciphertext too short");
            return null;
        }
        if (!kg3.b(bArr3, bArr)) {
            tv2.f("Decryption failed (OutputPrefix mismatch).");
            return null;
        }
        byte[] bArrA = a(0, bArr, bArr3.length, i);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] bArrA2 = a(1, bArr2, 0, bArr2.length);
        byte[] bArrA3 = a(2, bArr, bArr3.length + i, i2);
        int length3 = bArr.length - 16;
        byte b = 0;
        for (int i3 = 0; i3 < 16; i3++) {
            b = (byte) (b | (((bArr[length3 + i3] ^ bArrA2[i3]) ^ bArrA[i3]) ^ bArrA3[i3]));
        }
        if (b != 0) {
            throw new AEADBadTagException("tag mismatch");
        }
        Cipher cipher = (Cipher) e.get();
        cipher.init(1, this.c, new IvParameterSpec(bArrA));
        return cipher.doFinal(bArr, bArr3.length + i, i2);
    }

    @Override // defpackage.cv2
    public final byte[] h(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        byte[] bArr3 = this.a;
        int length2 = Integer.MAX_VALUE - bArr3.length;
        int i = this.d;
        if (length > (length2 - i) - 16) {
            tv2.f("plaintext too long");
            return null;
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr3, bArr3.length + i + bArr.length + 16);
        byte[] bArrA = xf3.a(i);
        System.arraycopy(bArrA, 0, bArrCopyOf, bArr3.length, i);
        byte[] bArrA2 = a(0, bArrA, 0, bArrA.length);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] bArrA3 = a(1, bArr2, 0, bArr2.length);
        Cipher cipher = (Cipher) e.get();
        cipher.init(1, this.c, new IvParameterSpec(bArrA2));
        cipher.doFinal(bArr, 0, bArr.length, bArrCopyOf, bArr3.length + i);
        byte[] bArrA4 = a(2, bArrCopyOf, bArr3.length + i, bArr.length);
        int length3 = bArr3.length + bArr.length + i;
        for (int i2 = 0; i2 < 16; i2++) {
            bArrCopyOf[length3 + i2] = (byte) ((bArrA3[i2] ^ bArrA2[i2]) ^ bArrA4[i2]);
        }
        return bArrCopyOf;
    }
}
