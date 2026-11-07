package defpackage;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import java.util.Iterator;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class f63 implements cv2 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public f63(int i, byte[] bArr, byte[] bArr2) {
        this.a = i;
        switch (i) {
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                this.b = new r53(bArr, 1);
                this.c = bArr2;
                break;
            default:
                this.b = new r53(bArr, 0);
                this.c = bArr2;
                break;
        }
    }

    public byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length < 28) {
            tv2.f("ciphertext too short");
            return null;
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, 12);
        return ((r53) this.b).s(ByteBuffer.wrap(bArr, 12, bArr.length - 12), bArrCopyOf, bArr2);
    }

    public byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length < 40) {
            tv2.f("ciphertext too short");
            return null;
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, 24);
        return ((r53) this.b).s(ByteBuffer.wrap(bArr, 24, bArr.length - 24), bArrCopyOf, bArr2);
    }

    @Override // defpackage.cv2
    public final byte[] g(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int i = this.a;
        Object obj = this.c;
        byte[] bArrG = null;
        switch (i) {
            case 0:
                Iterator it = ((jf3) obj).a(bArr).iterator();
                while (it.hasNext()) {
                    try {
                        bArrG = ((c63) it.next()).a.g(bArr, bArr2);
                        return bArrG;
                    } catch (GeneralSecurityException unused) {
                    }
                }
                tv2.f("decryption failed");
                return bArrG;
            case 1:
                byte[] bArr3 = (byte[]) obj;
                if (bArr == null) {
                    uq1.h("ciphertext is null");
                    return null;
                }
                if (bArr.length < bArr3.length + 28) {
                    tv2.f("ciphertext too short");
                    return null;
                }
                if (!kg3.b(bArr3, bArr)) {
                    tv2.f("Decryption failed (OutputPrefix mismatch).");
                    return null;
                }
                AlgorithmParameterSpec algorithmParameterSpecA = g33.a(bArr, bArr3.length, 12);
                Cipher cipherB = g33.b();
                cipherB.init(2, (SecretKeySpec) this.b, algorithmParameterSpecA);
                if (bArr2 != null && bArr2.length != 0) {
                    cipherB.updateAAD(bArr2);
                }
                return cipherB.doFinal(bArr, bArr3.length + 12, (bArr.length - bArr3.length) - 12);
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                byte[] bArr4 = (byte[]) obj;
                if (bArr4.length == 0) {
                    return a(bArr, bArr2);
                }
                if (kg3.b(bArr4, bArr)) {
                    return a(Arrays.copyOfRange(bArr, bArr4.length, bArr.length), bArr2);
                }
                tv2.f("Decryption failed (OutputPrefix mismatch).");
                return null;
            default:
                byte[] bArr5 = (byte[]) obj;
                if (bArr5.length == 0) {
                    return b(bArr, bArr2);
                }
                if (kg3.b(bArr5, bArr)) {
                    return b(Arrays.copyOfRange(bArr, bArr5.length, bArr.length), bArr2);
                }
                tv2.f("Decryption failed (OutputPrefix mismatch).");
                return null;
        }
    }

    @Override // defpackage.cv2
    public final byte[] h(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                byte[] bArrH = ((c63) obj2).a.h(bArr, bArr2);
                int length = bArr.length;
                return bArrH;
            case 1:
                byte[] bArr3 = (byte[]) obj;
                if (bArr == null) {
                    uq1.h("plaintext is null");
                    return null;
                }
                byte[] bArrA = xf3.a(12);
                AlgorithmParameterSpec algorithmParameterSpecA = g33.a(bArrA, 0, bArrA.length);
                Cipher cipherB = g33.b();
                cipherB.init(1, (SecretKeySpec) obj2, algorithmParameterSpecA);
                if (bArr2 != null && bArr2.length != 0) {
                    cipherB.updateAAD(bArr2);
                }
                int outputSize = cipherB.getOutputSize(bArr.length);
                if (outputSize > 2147483635 - bArr3.length) {
                    tv2.f("plaintext too long");
                    return null;
                }
                byte[] bArrCopyOf = Arrays.copyOf(bArr3, bArr3.length + 12 + outputSize);
                System.arraycopy(bArrA, 0, bArrCopyOf, bArr3.length, 12);
                if (cipherB.doFinal(bArr, 0, bArr.length, bArrCopyOf, bArr3.length + 12) == outputSize) {
                    return bArrCopyOf;
                }
                tv2.f("not enough data written");
                return null;
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArr.length + 28);
                byte[] bArrA2 = xf3.a(12);
                byteBufferAllocate.put(bArrA2);
                ((r53) obj2).r(byteBufferAllocate, bArrA2, bArr, bArr2);
                byte[] bArrArray = byteBufferAllocate.array();
                byte[] bArr4 = (byte[]) obj;
                return bArr4.length == 0 ? bArrArray : nj2.d0(bArr4, bArrArray);
            default:
                ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(bArr.length + 40);
                byte[] bArrA3 = xf3.a(24);
                byteBufferAllocate2.put(bArrA3);
                ((r53) obj2).r(byteBufferAllocate2, bArrA3, bArr, bArr2);
                byte[] bArrArray2 = byteBufferAllocate2.array();
                byte[] bArr5 = (byte[]) obj;
                return bArr5.length == 0 ? bArrArray2 : nj2.d0(bArr5, bArrArray2);
        }
    }

    public f63(c63 c63Var, jf3 jf3Var) {
        this.a = 0;
        this.b = c63Var;
        this.c = jf3Var;
    }

    public f63(byte[] bArr, tr3 tr3Var) throws GeneralSecurityException {
        this.a = 1;
        if (ck1.g(2)) {
            this.b = g33.c(bArr);
            this.c = tr3Var.b();
        } else {
            tv2.f("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
            throw null;
        }
    }
}
