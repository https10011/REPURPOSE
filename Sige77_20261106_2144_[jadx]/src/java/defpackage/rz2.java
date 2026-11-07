package defpackage;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class rz2 {
    public static final rz2 c;
    public static final rz2 d;
    public static final rz2 e;
    public static final rz2 f;
    public static final rz2 g;
    public static final rz2 h;
    public final /* synthetic */ int a;
    public final String b;

    static {
        int i = 0;
        c = new rz2("TINK", i);
        d = new rz2("CRUNCHY", i);
        e = new rz2("NO_PREFIX", i);
        int i2 = 1;
        f = new rz2("TINK", i2);
        g = new rz2("CRUNCHY", i2);
        h = new rz2("NO_PREFIX", i2);
    }

    public /* synthetic */ rz2(String str, int i) {
        this.a = i;
        this.b = str;
    }

    public byte[] a(int i, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        gr3 gr3Var = cr3.c.a;
        String str = this.b;
        Mac mac = (Mac) gr3Var.zza(str);
        if (i > mac.getMacLength() * 255) {
            tv2.f("size too large");
            return null;
        }
        byte[] bArr3 = new byte[i];
        mac.init(new SecretKeySpec(bArr, str));
        byte[] bArrDoFinal = new byte[0];
        int i2 = 1;
        int length = 0;
        while (true) {
            mac.update(bArrDoFinal);
            mac.update(bArr2);
            mac.update((byte) i2);
            bArrDoFinal = mac.doFinal();
            if (bArrDoFinal.length + length >= i) {
                System.arraycopy(bArrDoFinal, 0, bArr3, length, i - length);
                return bArr3;
            }
            System.arraycopy(bArrDoFinal, 0, bArr3, length, bArrDoFinal.length);
            length += bArrDoFinal.length;
            i2++;
        }
    }

    public byte[] b(byte[] bArr, byte[] bArr2) throws InvalidKeyException {
        gr3 gr3Var = cr3.c.a;
        String str = this.b;
        Mac mac = (Mac) gr3Var.zza(str);
        if (bArr2 == null || bArr2.length == 0) {
            mac.init(new SecretKeySpec(new byte[mac.getMacLength()], str));
        } else {
            mac.init(new SecretKeySpec(bArr2, str));
        }
        return mac.doFinal(bArr);
    }

    public String toString() {
        int i = this.a;
        String str = this.b;
        switch (i) {
            case 0:
            case 1:
                return str;
            default:
                return super.toString();
        }
    }
}
