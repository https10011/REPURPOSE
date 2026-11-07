package defpackage;

import android.os.Build;
import java.nio.charset.Charset;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class g33 {
    public static final xv1 a = new xv1(5);

    public static AlgorithmParameterSpec a(byte[] bArr, int i, int i2) {
        Charset charset = kg3.a;
        Integer numValueOf = !Objects.equals(System.getProperty("java.vendor"), "The Android Project") ? null : Integer.valueOf(Build.VERSION.SDK_INT);
        return (numValueOf == null || numValueOf.intValue() > 19) ? new GCMParameterSpec(128, bArr, i, i2) : new IvParameterSpec(bArr, i, i2);
    }

    public static Cipher b() {
        return (Cipher) a.get();
    }

    public static SecretKeySpec c(byte[] bArr) {
        dw0.H(bArr.length);
        return new SecretKeySpec(bArr, "AES");
    }
}
