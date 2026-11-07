package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Message;
import android.os.SystemClock;
import android.security.keystore.KeyGenParameterSpec;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.c;
import androidx.fragment.app.e;
import com.fm.openinstall.listener.AppInstallListener;
import com.fm.openinstall.listener.AppWakeUpListener;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.internal.firebase-auth-api.zzahd;
import com.hjq.toast.BuildConfig;
import java.io.IOException;
import java.io.OutputStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.UnrecoverableEntryException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicLong;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class dc2 implements Callback, mn2, uu2 {
    public static dc2 c;
    public static volatile dc2 d;
    public static final Object e = new Object();
    public Object a;
    public Object b;

    public dc2(int i) {
        switch (i) {
            case oc1.BYTES_FIELD_NUMBER /* 8 */:
                this.a = new qp0(4);
                break;
            default:
                this.a = aw0.a(va.e);
                break;
        }
    }

    public static void K(ac2 ac2Var, Mac mac) {
        byte[] bArr = (byte[]) ac2Var.b;
        byte[] bArr2 = (byte[]) ac2Var.c;
        int length = bArr.length;
        int length2 = bArr2.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, length + length2);
        System.arraycopy(bArr2, 0, bArrCopyOf, length, length2);
        byte[] bArrDoFinal = mac.doFinal(bArrCopyOf);
        bArrDoFinal.getClass();
        if (!MessageDigest.isEqual(bArrDoFinal, (byte[]) ac2Var.d)) {
            throw new SecurityException("Cipher text has been tampered with.");
        }
    }

    public static synchronized dc2 a(Context context) {
        try {
            if (c == null) {
                dc2 dc2Var = new dc2();
                dc2Var.b = context.getApplicationContext();
                c = dc2Var;
            }
        } catch (Throwable th) {
            throw th;
        }
        return c;
    }

    public void A(boolean z) {
        Fragment fragment = ((e) this.b).w;
        if (fragment != null) {
            fragment.k().m.A(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.a).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                ur.a();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public void B(boolean z) {
        Fragment fragment = ((e) this.b).w;
        if (fragment != null) {
            fragment.k().m.B(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.a).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                ur.a();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public void C(boolean z) {
        Fragment fragment = ((e) this.b).w;
        if (fragment != null) {
            fragment.k().m.C(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.a).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                ur.a();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public void D(boolean z) {
        Fragment fragment = ((e) this.b).w;
        if (fragment != null) {
            fragment.k().m.D(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.a).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                ur.a();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public String E(Context context, String str) {
        String strS;
        context.getClass();
        str.getClass();
        synchronized (this) {
            try {
                I(context);
                try {
                    SecretKey secretKeyF = F();
                    Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
                    cipher.init(1, secretKeyF);
                    byte[] bytes = str.getBytes(Charsets.UTF_8);
                    bytes.getClass();
                    byte[] bArrDoFinal = cipher.doFinal(bytes);
                    bArrDoFinal.getClass();
                    byte[] iv = cipher.getIV();
                    iv.getClass();
                    Mac mac = (Mac) this.b;
                    if (mac == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("hmac");
                        mac = null;
                    }
                    byte[] iv2 = cipher.getIV();
                    iv2.getClass();
                    int length = bArrDoFinal.length;
                    int length2 = iv2.length;
                    byte[] bArrCopyOf = Arrays.copyOf(bArrDoFinal, length + length2);
                    System.arraycopy(iv2, 0, bArrCopyOf, length, length2);
                    byte[] bArrDoFinal2 = mac.doFinal(bArrCopyOf);
                    bArrDoFinal2.getClass();
                    strS = CollectionsKt.s(jo.d(bArrDoFinal, iv, bArrDoFinal2), ";", (String) null, (String) null, sm.b, 30);
                } catch (Exception e2) {
                    throw new m60("Failed to encrypt", e2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return strS;
    }

    public SecretKey F() throws NoSuchAlgorithmException, KeyStoreException, NoSuchProviderException, UnrecoverableEntryException, InvalidAlgorithmParameterException {
        if (H().containsAlias("com.linecorp.android.security.encryption.StringAesCipher")) {
            KeyStore.Entry entry = H().getEntry("com.linecorp.android.security.encryption.StringAesCipher", null);
            entry.getClass();
            SecretKey secretKey = ((KeyStore.SecretKeyEntry) entry).getSecretKey();
            secretKey.getClass();
            return secretKey;
        }
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
        KeyGenParameterSpec keyGenParameterSpecBuild = new KeyGenParameterSpec.Builder("com.linecorp.android.security.encryption.StringAesCipher", 3).setKeySize(256).setBlockModes("CBC").setEncryptionPaddings("PKCS7Padding").build();
        keyGenParameterSpecBuild.getClass();
        keyGenerator.init(keyGenParameterSpecBuild);
        SecretKey secretKeyGenerateKey = keyGenerator.generateKey();
        secretKeyGenerateKey.getClass();
        return secretKeyGenerateKey;
    }

    public SecretKey G() throws NoSuchAlgorithmException, KeyStoreException, NoSuchProviderException, UnrecoverableEntryException, InvalidAlgorithmParameterException {
        if (H().containsAlias("com.linecorp.android.security.encryption.StringAesCipher.INTEGRITY_KEY")) {
            KeyStore.Entry entry = H().getEntry("com.linecorp.android.security.encryption.StringAesCipher.INTEGRITY_KEY", null);
            entry.getClass();
            SecretKey secretKey = ((KeyStore.SecretKeyEntry) entry).getSecretKey();
            secretKey.getClass();
            return secretKey;
        }
        KeyGenerator keyGenerator = KeyGenerator.getInstance("HmacSHA256", "AndroidKeyStore");
        KeyGenParameterSpec keyGenParameterSpecBuild = new KeyGenParameterSpec.Builder("com.linecorp.android.security.encryption.StringAesCipher.INTEGRITY_KEY", 12).build();
        keyGenParameterSpecBuild.getClass();
        keyGenerator.init(keyGenParameterSpecBuild);
        SecretKey secretKeyGenerateKey = keyGenerator.generateKey();
        secretKeyGenerateKey.getClass();
        return secretKeyGenerateKey;
    }

    public KeyStore H() {
        Object value = ((uv1) this.a).getValue();
        value.getClass();
        return (KeyStore) value;
    }

    public void I(Context context) {
        context.getClass();
        if (((Mac) this.b) != null) {
            return;
        }
        synchronized (this) {
            F();
            SecretKey secretKeyG = G();
            Mac mac = Mac.getInstance("HmacSHA256");
            mac.init(secretKeyG);
            this.b = mac;
            Unit unit = Unit.a;
        }
    }

    public void J(ge0 ge0Var) {
        r6 r6Var = (r6) this.b;
        ri2 ri2Var = (ri2) this.a;
        int i = ge0Var.b;
        if (i != 0) {
            r6Var.execute(new hk(ri2Var, i, 0));
        } else {
            r6Var.execute(new bh0(6, ri2Var, ge0Var.a));
        }
    }

    public void L(ArrayList arrayList) {
        OutputStream outputStream = (OutputStream) rq0.v(arrayList);
        if (outputStream instanceof gi3) {
            this.b = (gi3) outputStream;
            this.a = (OutputStream) arrayList.get(0);
        }
    }

    public void M(go3 go3Var) throws IOException {
        if (((SharedPreferences.Editor) this.a).putString((String) this.b, r93.q0(go3Var.c())).commit()) {
            return;
        }
        uq1.o("Failed to write to SharedPreferences");
    }

    public synchronized void N(int i, int i2, long j, long j2) {
        AtomicLong atomicLong = (AtomicLong) this.b;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = atomicLong.get();
        StringBuilder sb = new StringBuilder(String.valueOf(j3).length() + 14);
        sb.append("shouldSendLog ");
        sb.append(j3);
        Log.i("AdvertisingIdClient", sb.toString());
        if (atomicLong.get() == -1 || jElapsedRealtime - atomicLong.get() > 1800000) {
            jr0 jr0Var = (jr0) this.a;
            if (jr0Var != null) {
                jr0Var.c(new TelemetryData(0, Arrays.asList(new MethodInvocation(35401, i, 0, j, j2, (String) null, (String) null, 0, i2)))).addOnFailureListener(new jm(this, jElapsedRealtime, 1));
            }
        }
    }

    public void b(Call call, Response response) {
        ak akVar = (ak) this.a;
        l81 l81Var = (l81) this.b;
        try {
            try {
                akVar.n(l81Var, l81Var.f(response));
            } catch (Throwable th) {
                ta.F(th);
                th.printStackTrace();
            }
        } catch (Throwable th2) {
            ta.F(th2);
            try {
                akVar.r(l81Var, th2);
            } catch (Throwable th3) {
                ta.F(th3);
                th3.printStackTrace();
            }
        }
    }

    public void c(Call call, IOException iOException) {
        try {
            ((ak) this.a).r((l81) this.b, iOException);
        } catch (Throwable th) {
            ta.F(th);
            th.printStackTrace();
        }
    }

    @Override // defpackage.uu2
    public ep1 d(qt2 qt2Var) {
        ep1 ep1VarK = ((ep1) this.a).K();
        String str = (String) this.b;
        ep1VarK.P(str, qt2Var);
        ((HashMap) ep1VarK.e).put(str, Boolean.TRUE);
        return ep1VarK;
    }

    public void e(int i, String str) {
        Context context = (Context) this.b;
        if (context == null) {
            return;
        }
        if (((SharedPreferences) this.a) == null) {
            this.a = k(context);
        }
        SharedPreferences sharedPreferences = (SharedPreferences) this.a;
        if (sharedPreferences == null) {
            return;
        }
        try {
            sharedPreferences.edit().putInt(str, i).apply();
        } catch (Exception e2) {
            cc2.c(Log.getStackTraceString(e2));
        }
    }

    public void f(Uri uri, AppWakeUpListener appWakeUpListener) {
        if (g93.i) {
            g93.b("decodeWakeUp", new Object[0]);
        }
        System.currentTimeMillis();
        new ie2((qp0) this.a, uri, appWakeUpListener).n();
        System.currentTimeMillis();
    }

    public void g(String str) throws Exception {
        Context context = (Context) this.b;
        if (context == null) {
            throw new Exception("context is null");
        }
        if (((SharedPreferences) this.a) == null) {
            this.a = k(context);
        }
        if (((SharedPreferences) this.a) == null) {
            throw new Exception("sp is null");
        }
        synchronized (nk1.class) {
        }
        if (!zi0.b.g()) {
            throw new Exception("keystore encrypt error");
        }
        String str2 = new String(Base64.encode(new ep1(6, false).l(str), 2));
        if (TextUtils.isEmpty(str2)) {
            throw new Exception("rsaCrypter encrypt error");
        }
        SharedPreferences.Editor editorEdit = ((SharedPreferences) this.a).edit();
        editorEdit.putString("athena_ea", str2);
        editorEdit.apply();
    }

    public void h(String str, long j, Map map) {
        if (g93.i) {
            g93.b("reportEffectPoint", new Object[0]);
        }
        p11 p11Var = (p11) this.b;
        p11Var.getClass();
        if (TextUtils.isEmpty(str) || str.indexOf(44) >= 0 || str.indexOf(59) >= 0) {
            if (g93.i) {
                g93.g("传入的效果点名称包含不支持的字符 %s", str);
            }
        } else {
            if (map != null && map.size() > 10) {
                if (g93.i) {
                    g93.j("传入的效果点附加参数超过限制", new Object[0]);
                    return;
                }
                return;
            }
            uf2 uf2Var = new uf2(2, str, Long.valueOf(System.currentTimeMillis()), Long.valueOf(j), map);
            hg2 hg2Var = (hg2) p11Var.d;
            hg2Var.getClass();
            Message messageObtain = Message.obtain();
            messageObtain.what = 21;
            messageObtain.obj = uf2Var;
            hg2Var.sendMessage(messageObtain);
        }
    }

    public void i(boolean z, int i, AppInstallListener appInstallListener) {
        if (g93.i) {
            g93.b("getInstallData", new Object[0]);
        }
        System.currentTimeMillis();
        he2 he2Var = new he2((qp0) this.a, z, appInstallListener);
        he2Var.d = i;
        he2Var.n();
        System.currentTimeMillis();
    }

    public int j(String str) {
        Context context = (Context) this.b;
        if (context != null) {
            if (((SharedPreferences) this.a) == null) {
                this.a = k(context);
            }
            SharedPreferences sharedPreferences = (SharedPreferences) this.a;
            if (sharedPreferences != null) {
                try {
                    return sharedPreferences.getInt(str, 0);
                } catch (Exception e2) {
                    cc2.c(e2.getMessage());
                    return -1;
                }
            }
        }
        return -1;
    }

    public SharedPreferences k(Context context) {
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences("tcrypto", 0);
            this.a = sharedPreferences;
            return sharedPreferences;
        } catch (Exception e2) {
            cc2.c(e2.getMessage());
            return null;
        }
    }

    public void l(String str, String str2) {
        Context context = (Context) this.b;
        if (context == null) {
            return;
        }
        if (((SharedPreferences) this.a) == null) {
            this.a = k(context);
        }
        SharedPreferences sharedPreferences = (SharedPreferences) this.a;
        if (sharedPreferences == null) {
            return;
        }
        try {
            sharedPreferences.edit().putString(str, str2).apply();
        } catch (Exception e2) {
            cc2.c(Log.getStackTraceString(e2));
        }
    }

    public String m() throws Exception {
        Context context = (Context) this.b;
        if (context == null) {
            throw new Exception("context is null");
        }
        if (((SharedPreferences) this.a) == null) {
            this.a = k(context);
        }
        if (((SharedPreferences) this.a) == null) {
            throw new Exception("sp is null");
        }
        synchronized (nk1.class) {
        }
        if (!zi0.b.g()) {
            throw new Exception("keystore decrypt error");
        }
        String string = ((SharedPreferences) this.a).getString("athena_ea", BuildConfig.FLAVOR);
        if (TextUtils.isEmpty(string) || string.contains("_")) {
            return BuildConfig.FLAVOR;
        }
        String str = new String(new ep1(6, false).k(Base64.decode(string, 2)));
        if (TextUtils.isEmpty(str)) {
            throw new Exception("rsaCrypter decrypt error");
        }
        return str;
    }

    public String n(String str) {
        Context context = (Context) this.b;
        if (context != null) {
            if (((SharedPreferences) this.a) == null) {
                this.a = k(context);
            }
            SharedPreferences sharedPreferences = (SharedPreferences) this.a;
            if (sharedPreferences != null) {
                try {
                    return sharedPreferences.getString(str, BuildConfig.FLAVOR);
                } catch (Exception e2) {
                    cc2.c(Log.getStackTraceString(e2));
                    return BuildConfig.FLAVOR;
                }
            }
        }
        return BuildConfig.FLAVOR;
    }

    public String o(Context context, String str) {
        String str2;
        context.getClass();
        str.getClass();
        synchronized (this) {
            try {
                try {
                    SecretKey secretKeyF = F();
                    ac2 ac2VarN = gb2.n(str);
                    Mac mac = (Mac) this.b;
                    if (mac == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("hmac");
                        mac = null;
                    }
                    K(ac2VarN, mac);
                    IvParameterSpec ivParameterSpec = new IvParameterSpec((byte[]) ac2VarN.c);
                    Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
                    cipher.init(2, secretKeyF, ivParameterSpec);
                    byte[] bArrDoFinal = cipher.doFinal((byte[]) ac2VarN.b);
                    bArrDoFinal.getClass();
                    str2 = new String(bArrDoFinal, Charsets.UTF_8);
                } catch (Exception e2) {
                    throw new m60("Failed to decrypt", e2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    public void p(boolean z) {
        Fragment fragment = ((e) this.b).w;
        if (fragment != null) {
            fragment.k().m.p(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.a).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                ur.a();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public void q(boolean z) {
        e eVar = (e) this.b;
        c cVar = eVar.u.Y;
        Fragment fragment = eVar.w;
        if (fragment != null) {
            fragment.k().m.q(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.a).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                ur.a();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public void r(boolean z) {
        Fragment fragment = ((e) this.b).w;
        if (fragment != null) {
            fragment.k().m.r(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.a).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                ur.a();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    @Override // defpackage.mn2
    public void s(an2 an2Var) {
        rd2 rd2Var = (rd2) this.a;
        oo2 oo2Var = (oo2) an2Var;
        if (!TextUtils.isEmpty(oo2Var.f)) {
            rd2Var.z(new p11(oo2Var.f, oo2Var.e, (Object) null, 15));
        } else {
            ((ox1) this.b).z(new zzahd(oo2Var.b, oo2Var.a, Long.valueOf(oo2Var.d)), null, null, Boolean.valueOf(oo2Var.c), null, rd2Var, this);
        }
    }

    public void t(boolean z) {
        Fragment fragment = ((e) this.b).w;
        if (fragment != null) {
            fragment.k().m.t(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.a).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                ur.a();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public void u(boolean z) {
        Fragment fragment = ((e) this.b).w;
        if (fragment != null) {
            fragment.k().m.u(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.a).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                ur.a();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public void v(boolean z) {
        Fragment fragment = ((e) this.b).w;
        if (fragment != null) {
            fragment.k().m.v(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.a).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                ur.a();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public void w(boolean z) {
        e eVar = (e) this.b;
        c cVar = eVar.u.Y;
        Fragment fragment = eVar.w;
        if (fragment != null) {
            fragment.k().m.w(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.a).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                ur.a();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public void x(boolean z) {
        Fragment fragment = ((e) this.b).w;
        if (fragment != null) {
            fragment.k().m.x(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.a).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                ur.a();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public void y(boolean z) {
        Fragment fragment = ((e) this.b).w;
        if (fragment != null) {
            fragment.k().m.y(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.a).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                ur.a();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public void z(boolean z) {
        Fragment fragment = ((e) this.b).w;
        if (fragment != null) {
            fragment.k().m.z(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.a).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                ur.a();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    @Override // defpackage.mn2
    public void zza(String str) {
        ((rd2) this.a).a(kv.m0(str));
    }

    public /* synthetic */ dc2(Object obj, Object obj2, boolean z) {
        this.b = obj;
        this.a = obj2;
    }

    public /* synthetic */ dc2(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }
}
