package defpackage;

import android.util.Base64;
import com.hjq.toast.BuildConfig;
import java.net.URL;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.Ref;
import kotlin.text.Charsets;
import kotlin.text.d;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class h81 {
    public static final PublicKey a(String str) throws InvalidKeySpecException {
        byte[] bArrDecode = Base64.decode(d.g(d.g(d.g(str, "\n", BuildConfig.FLAVOR), "-----BEGIN PUBLIC KEY-----", BuildConfig.FLAVOR), "-----END PUBLIC KEY-----", BuildConfig.FLAVOR), 0);
        bArrDecode.getClass();
        PublicKey publicKeyGeneratePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(bArrDecode));
        publicKeyGeneratePublic.getClass();
        return publicKeyGeneratePublic;
    }

    public static final String b(String str) {
        str.getClass();
        URL url = new URL("https", "www." + i90.s, "/.well-known/oauth/openid/keys/");
        ReentrantLock reentrantLock = new ReentrantLock();
        Condition conditionNewCondition = reentrantLock.newCondition();
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        i90.c().execute(new d80(url, objectRef, str, reentrantLock, conditionNewCondition, 1));
        reentrantLock.lock();
        try {
            conditionNewCondition.await(5000L, TimeUnit.MILLISECONDS);
            return (String) objectRef.element;
        } finally {
            reentrantLock.unlock();
        }
    }

    public static final boolean c(PublicKey publicKey, String str, String str2) {
        publicKey.getClass();
        str2.getClass();
        try {
            Signature signature = Signature.getInstance("SHA256withRSA");
            signature.initVerify(publicKey);
            byte[] bytes = str.getBytes(Charsets.UTF_8);
            bytes.getClass();
            signature.update(bytes);
            byte[] bArrDecode = Base64.decode(str2, 8);
            bArrDecode.getClass();
            return signature.verify(bArrDecode);
        } catch (Exception unused) {
            return false;
        }
    }
}
