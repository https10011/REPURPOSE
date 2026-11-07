package defpackage;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class xq3 implements cv2 {
    public final jq3 a;
    public final qr3 b;
    public final int c;
    public final byte[] d;

    public xq3(jq3 jq3Var, qr3 qr3Var, int i, byte[] bArr) {
        this.a = jq3Var;
        this.b = qr3Var;
        this.c = i;
        this.d = bArr;
    }

    public static xq3 a(oy2 oy2Var) {
        byte[] bArrB = ((tr3) oy2Var.g.a).b();
        yy2 yy2Var = oy2Var.f;
        jq3 jq3Var = new jq3(bArrB, yy2Var.c);
        qr3 qr3Var = new qr3("HMAC".concat(String.valueOf(yy2Var.f)), new SecretKeySpec(((tr3) oy2Var.h.a).b(), "HMAC"));
        int i = yy2Var.d;
        return new xq3(jq3Var, new qr3(qr3Var, i), i, oy2Var.i.b());
    }

    @Override // defpackage.cv2
    public final byte[] g(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        byte[] bArr3 = this.d;
        int length2 = bArr3.length;
        int i = this.c;
        if (length < length2 + i) {
            tv2.f("Decryption failed (ciphertext too short).");
            return null;
        }
        if (!kg3.b(bArr3, bArr)) {
            tv2.f("Decryption failed (OutputPrefix mismatch).");
            return null;
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, bArr3.length, bArr.length - i);
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, bArr.length - i, bArr.length);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        if (!MessageDigest.isEqual(this.b.a(nj2.d0(bArr2, bArrCopyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8))), bArrCopyOfRange2)) {
            tv2.f("invalid MAC");
            return null;
        }
        int length3 = bArrCopyOfRange.length;
        jq3 jq3Var = this.a;
        int i2 = jq3Var.b;
        if (length3 < i2) {
            tv2.f("ciphertext too short");
            return null;
        }
        byte[] bArr4 = new byte[i2];
        System.arraycopy(bArrCopyOfRange, 0, bArr4, 0, i2);
        int length4 = bArrCopyOfRange.length;
        int i3 = jq3Var.b;
        byte[] bArr5 = new byte[length4 - i3];
        jq3Var.a(bArrCopyOfRange, i3, bArrCopyOfRange.length - i3, bArr5, 0, bArr4, false);
        return bArr5;
    }

    @Override // defpackage.cv2
    public final byte[] h(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        jq3 jq3Var = this.a;
        int i = jq3Var.b;
        int i2 = Integer.MAX_VALUE - i;
        if (length > i2) {
            throw new GeneralSecurityException(ck1.r(i2, "plaintext length can not exceed "));
        }
        byte[] bArr3 = new byte[bArr.length + i];
        byte[] bArrA = xf3.a(i);
        System.arraycopy(bArrA, 0, bArr3, 0, i);
        jq3Var.a(bArr, 0, bArr.length, bArr3, jq3Var.b, bArrA, true);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        return nj2.d0(this.d, bArr3, this.b.a(nj2.d0(bArr2, bArr3, Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8))));
    }
}
