package defpackage;

import java.io.Serializable;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class qr3 implements uh3 {
    public final int a;
    public final Object b;
    public final Serializable c;
    public final Serializable d;

    public qr3(String str, SecretKeySpec secretKeySpec) throws GeneralSecurityException {
        rr3 rr3Var = new rr3(this);
        this.b = rr3Var;
        if (!ck1.g(2)) {
            tv2.f("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
            throw null;
        }
        this.c = str;
        this.d = secretKeySpec;
        if (secretKeySpec.getEncoded().length < 16) {
            throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        }
        switch (str) {
            case "HMACSHA1":
                this.a = 20;
                break;
            case "HMACSHA224":
                this.a = 28;
                break;
            case "HMACSHA256":
                this.a = 32;
                break;
            case "HMACSHA384":
                this.a = 48;
                break;
            case "HMACSHA512":
                this.a = 64;
                break;
            default:
                throw new NoSuchAlgorithmException("unknown Hmac algorithm: ".concat(str));
        }
        rr3Var.get();
    }

    public byte[] a(byte[] bArr) {
        qr3 qr3Var = (qr3) this.b;
        byte[] bArr2 = (byte[]) this.d;
        int length = bArr2.length;
        byte[] bArr3 = (byte[]) this.c;
        int i = this.a;
        return length > 0 ? nj2.d0(bArr3, qr3Var.b(nj2.d0(bArr, bArr2), i)) : nj2.d0(bArr3, qr3Var.b(bArr, i));
    }

    @Override // defpackage.uh3
    public byte[] b(byte[] bArr, int i) throws InvalidAlgorithmParameterException {
        rr3 rr3Var = (rr3) this.b;
        if (i > this.a) {
            throw new InvalidAlgorithmParameterException("tag size too big");
        }
        ((Mac) rr3Var.get()).update(bArr);
        return Arrays.copyOf(((Mac) rr3Var.get()).doFinal(), i);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r1v1, types: [byte[], java.io.Serializable] */
    public qr3(qr3 qr3Var, int i) throws InvalidAlgorithmParameterException {
        this.b = qr3Var;
        this.a = i;
        this.c = new byte[0];
        this.d = new byte[0];
        if (i >= 10) {
            qr3Var.b(new byte[0], i);
            return;
        }
        throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
    }
}
