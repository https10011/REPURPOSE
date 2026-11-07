package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.UserManager;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import androidx.fragment.app.f;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.firebase.auth.zzc;
import com.hjq.toast.BuildConfig;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.cert.CertificateException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class ep1 implements wr1, d4, Continuation, ac {
    public static final pr3 W;
    public static ep1 f;
    public static final vi i = new vi(8);
    public static final r22 v = new r22(2);
    public static final or3 w;
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;

    static {
        int i2 = 0;
        w = new or3(i2);
        W = new pr3(i2);
    }

    public ep1(int i2) {
        this.a = i2;
        switch (i2) {
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                or3 or3Var = jw.f;
                this.b = new HashMap();
                this.c = new HashMap();
                this.e = null;
                this.d = or3Var;
                break;
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                this.b = new ArrayList();
                this.c = new HashMap();
                this.d = new HashMap();
                break;
            default:
                this.b = null;
                this.c = null;
                this.d = null;
                this.e = new ArrayDeque();
                break;
        }
    }

    public static synchronized ep1 t() {
        try {
            if (f == null) {
                f = new ep1(0);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f;
    }

    public Bundle A(String str, Bundle bundle) {
        HashMap map = (HashMap) this.d;
        return bundle != null ? (Bundle) map.put(str, bundle) : (Bundle) map.remove(str);
    }

    public qt2 B(qt2 qt2Var) {
        return ((f91) this.c).t(this, qt2Var);
    }

    public oy2 C() throws GeneralSecurityException {
        ox1 ox1Var;
        tr3 tr3VarB;
        yy2 yy2Var = (yy2) this.b;
        if (yy2Var == null) {
            tv2.f("Cannot build without parameters");
            return null;
        }
        ox1 ox1Var2 = (ox1) this.c;
        if (ox1Var2 == null || (ox1Var = (ox1) this.d) == null) {
            tv2.f("Cannot build without key material");
            return null;
        }
        if (yy2Var.a != ((tr3) ox1Var2.a).a.length) {
            tv2.f("AES key size mismatch");
            return null;
        }
        if (yy2Var.b != ((tr3) ox1Var.a).a.length) {
            tv2.f("HMAC key size mismatch");
            return null;
        }
        if (yy2Var.a() && ((Integer) this.e) == null) {
            tv2.f("Cannot create key without ID requirement with parameters with ID requirement");
            return null;
        }
        if (!((yy2) this.b).a() && ((Integer) this.e) != null) {
            tv2.f("Cannot create key with ID requirement with parameters without ID requirement");
            return null;
        }
        vy2 vy2Var = ((yy2) this.b).e;
        if (vy2Var == vy2.e) {
            tr3VarB = we3.a;
        } else if (vy2Var == vy2.d) {
            tr3VarB = we3.a(((Integer) this.e).intValue());
        } else {
            if (vy2Var != vy2.c) {
                uq1.q("Unknown AesCtrHmacAeadParameters.Variant: ".concat(String.valueOf(vy2Var)));
                return null;
            }
            tr3VarB = we3.b(((Integer) this.e).intValue());
        }
        return new oy2((yy2) this.b, (ox1) this.c, (ox1) this.d, tr3VarB, (Integer) this.e);
    }

    public oz2 D() throws GeneralSecurityException {
        Integer num = (Integer) this.b;
        if (num == null) {
            tv2.f("Key size is not set");
            return null;
        }
        if (((nz2) this.e) == null) {
            tv2.f("Variant is not set");
            return null;
        }
        if (((Integer) this.c) == null) {
            tv2.f("IV size is not set");
            return null;
        }
        if (((Integer) this.d) != null) {
            return new oz2(num.intValue(), ((Integer) this.c).intValue(), ((Integer) this.d).intValue(), (nz2) this.e);
        }
        tv2.f("Tag size is not set");
        return null;
    }

    public v83 E() throws GeneralSecurityException {
        t83 t83Var = (t83) this.b;
        if (t83Var == null) {
            tv2.f("HPKE KEM parameter is not set");
            return null;
        }
        r83 r83Var = (r83) this.c;
        if (r83Var == null) {
            tv2.f("HPKE KDF parameter is not set");
            return null;
        }
        q83 q83Var = (q83) this.d;
        if (q83Var == null) {
            tv2.f("HPKE AEAD parameter is not set");
            return null;
        }
        s83 s83Var = (s83) this.e;
        if (s83Var != null) {
            return new v83(t83Var, r83Var, q83Var, s83Var);
        }
        tv2.f("HPKE variant is not set");
        return null;
    }

    public ah3 F() throws GeneralSecurityException {
        Integer num = (Integer) this.b;
        if (num == null) {
            tv2.f("key size is not set");
            return null;
        }
        if (((Integer) this.c) == null) {
            tv2.f("tag size is not set");
            return null;
        }
        if (((zg3) this.d) == null) {
            tv2.f("hash type is not set");
            return null;
        }
        if (((yg3) this.e) == null) {
            tv2.f("variant is not set");
            return null;
        }
        if (num.intValue() < 16) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 16 bytes", (Integer) this.b));
        }
        Integer num2 = (Integer) this.c;
        int iIntValue = num2.intValue();
        zg3 zg3Var = (zg3) this.d;
        if (iIntValue < 10) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", num2));
        }
        if (zg3Var == zg3.b) {
            if (iIntValue > 20) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", num2));
            }
        } else if (zg3Var == zg3.c) {
            if (iIntValue > 28) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", num2));
            }
        } else if (zg3Var == zg3.d) {
            if (iIntValue > 32) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", num2));
            }
        } else if (zg3Var == zg3.e) {
            if (iIntValue > 48) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", num2));
            }
        } else {
            if (zg3Var != zg3.f) {
                tv2.f("unknown hash type; must be SHA256, SHA384 or SHA512");
                return null;
            }
            if (iIntValue > 64) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", num2));
            }
        }
        return new ah3(((Integer) this.b).intValue(), ((Integer) this.c).intValue(), (yg3) this.e, (zg3) this.d);
    }

    public void G() {
        this.c = 12;
    }

    public void H(HttpURLConnection httpURLConnection) {
        wl0 wl0Var;
        String str;
        hc0 hc0Var = (hc0) this.e;
        String strK = y00.k((String) this.b, "/FirebaseCore-Android");
        if (((vf3) this.d) == null) {
            this.d = new vf3((Context) this.c);
        }
        httpURLConnection.setRequestProperty("X-Android-Package", (String) ((vf3) this.d).b);
        httpURLConnection.setRequestProperty("X-Android-Cert", (String) ((vf3) this.d).c);
        httpURLConnection.setRequestProperty("Accept-Language", bj0.M());
        httpURLConnection.setRequestProperty("X-Client-Version", strK);
        httpURLConnection.setRequestProperty("X-Firebase-Locale", null);
        hc0Var.a();
        httpURLConnection.setRequestProperty("X-Firebase-GMPID", hc0Var.c.b);
        sl2 sl2Var = (sl2) hc0Var.b(sl2.class);
        if (sl2Var == null || (wl0Var = (wl0) sl2Var.c.get()) == null) {
            str = null;
        } else {
            try {
                az azVar = (az) wl0Var;
                str = (String) Tasks.await(!((UserManager) azVar.b.getSystemService(UserManager.class)).isUserUnlocked() ? Tasks.forResult(BuildConfig.FLAVOR) : Tasks.call(azVar.e, new zy(azVar, 0)));
            } catch (InterruptedException | ExecutionException e) {
                Log.w("LocalRequestInterceptor", "Unable to get heartbeats: " + e.getMessage());
                str = null;
            }
        }
        httpURLConnection.setRequestProperty("X-Firebase-Client", str);
        sl2 sl2Var2 = (sl2) hc0Var.b(sl2.class);
        if (sl2Var2 != null && sl2Var2.b.get() != null) {
            ur.a();
        } else {
            if (TextUtils.isEmpty(null)) {
                return;
            }
            httpURLConnection.setRequestProperty("X-Firebase-AppCheck", null);
        }
    }

    public qt2 I(lm2 lm2Var) {
        qt2 qt2VarT = qt2.O;
        Iterator itH = lm2Var.h();
        while (itH.hasNext()) {
            qt2VarT = ((f91) this.c).t(this, lm2Var.k(((Integer) itH.next()).intValue()));
            if (qt2VarT instanceof go2) {
                break;
            }
        }
        return qt2VarT;
    }

    public void J(int i2) throws InvalidAlgorithmParameterException {
        if (i2 != 16 && i2 != 24 && i2 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i2)));
        }
        this.b = Integer.valueOf(i2);
    }

    public ep1 K() {
        return new ep1(this, (f91) this.c);
    }

    public void L() {
        this.d = 16;
    }

    public ArrayList M(OutputStream outputStream) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(outputStream);
        ArrayList arrayList2 = (ArrayList) this.d;
        if (!arrayList2.isEmpty()) {
            int i2 = jh3.b;
            ArrayList arrayList3 = new ArrayList();
            Iterator it = arrayList2.iterator();
            if (it.hasNext()) {
                throw y00.i(it);
            }
            jh3 jh3Var = !arrayList3.isEmpty() ? new jh3(outputStream, arrayList3) : null;
            if (jh3Var != null) {
                arrayList.add(jh3Var);
            }
        }
        Iterator it2 = ((ro0) this.c).iterator();
        if (!it2.hasNext()) {
            Collections.reverse(arrayList);
            return arrayList;
        }
        if (it2.next() != null) {
            ur.a();
            return null;
        }
        throw null;
    }

    public boolean N(String str) {
        if (((HashMap) this.d).containsKey(str)) {
            return true;
        }
        ep1 ep1Var = (ep1) this.b;
        if (ep1Var != null) {
            return ep1Var.N(str);
        }
        return false;
    }

    public void O(String str, qt2 qt2Var) {
        ep1 ep1Var;
        HashMap map = (HashMap) this.d;
        if (!map.containsKey(str) && (ep1Var = (ep1) this.b) != null && ep1Var.N(str)) {
            ep1Var.O(str, qt2Var);
        } else {
            if (((HashMap) this.e).containsKey(str)) {
                return;
            }
            if (qt2Var == null) {
                map.remove(str);
            } else {
                map.put(str, qt2Var);
            }
        }
    }

    public void P(String str, qt2 qt2Var) {
        if (((HashMap) this.e).containsKey(str)) {
            return;
        }
        HashMap map = (HashMap) this.d;
        if (qt2Var == null) {
            map.remove(str);
        } else {
            map.put(str, qt2Var);
        }
    }

    public qt2 Q(String str) {
        HashMap map = (HashMap) this.d;
        if (map.containsKey(str)) {
            return (qt2) map.get(str);
        }
        ep1 ep1Var = (ep1) this.b;
        if (ep1Var != null) {
            return ep1Var.Q(str);
        }
        e.g(y00.k(str, " is not defined"));
        return null;
    }

    @Override // defpackage.wr1
    public kr1 a() {
        return (uz) this.e;
    }

    @Override // defpackage.wr1
    public ds1 b() {
        return (vz) this.d;
    }

    @Override // defpackage.d4
    public boolean c(e4 e4Var, Menu menu) {
        ActionMode.Callback callback = (ActionMode.Callback) this.b;
        gv1 gv1VarO = o(e4Var);
        wq1 wq1Var = (wq1) this.e;
        Menu f41Var = (Menu) wq1Var.get(menu);
        if (f41Var == null) {
            f41Var = new f41((Context) this.c, (i31) menu);
            wq1Var.put(menu, f41Var);
        }
        return callback.onCreateActionMode(gv1VarO, f41Var);
    }

    @Override // defpackage.ac
    public ListenableFuture call() {
        kk3 kk3Var = new kk3((tj3) this.b, (bg3) this.d, (Executor) this.e, 1);
        int i2 = to3.a;
        return dh0.g((v0) this.c, new bg3(4, vm3.a(), kk3Var), t10.a);
    }

    @Override // defpackage.wr1
    public void cancel() throws IOException {
        ((Socket) this.b).close();
    }

    @Override // defpackage.d4
    public boolean d(e4 e4Var, MenuItem menuItem) {
        return ((ActionMode.Callback) this.b).onActionItemClicked(o(e4Var), new s31((Context) this.c, (lv1) menuItem));
    }

    @Override // defpackage.d4
    public boolean e(e4 e4Var, Menu menu) {
        ActionMode.Callback callback = (ActionMode.Callback) this.b;
        gv1 gv1VarO = o(e4Var);
        wq1 wq1Var = (wq1) this.e;
        Menu f41Var = (Menu) wq1Var.get(menu);
        if (f41Var == null) {
            f41Var = new f41((Context) this.c, (i31) menu);
            wq1Var.put(menu, f41Var);
        }
        return callback.onPrepareActionMode(gv1VarO, f41Var);
    }

    @Override // defpackage.d4
    public void f(e4 e4Var) {
        ((ActionMode.Callback) this.b).onDestroyActionMode(o(e4Var));
    }

    public void g(Fragment fragment) {
        if (((ArrayList) this.b).contains(fragment)) {
            ur.c(fragment, "Fragment already added: ");
            return;
        }
        synchronized (((ArrayList) this.b)) {
            ((ArrayList) this.b).add(fragment);
        }
        fragment.X = true;
    }

    public synchronized void h(Class cls, Class cls2, f51 f51Var) {
        w51 w51Var = new w51(cls, cls2, f51Var);
        ArrayList arrayList = (ArrayList) this.b;
        arrayList.add(arrayList.size(), w51Var);
    }

    public synchronized e51 i(Class cls, Class cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = (ArrayList) this.b;
            int size = arrayList2.size();
            boolean z = false;
            int i2 = 0;
            while (true) {
                boolean z2 = true;
                if (i2 >= size) {
                    break;
                }
                Object obj = arrayList2.get(i2);
                i2++;
                w51 w51Var = (w51) obj;
                if (((HashSet) this.d).contains(w51Var)) {
                    z = true;
                } else {
                    if (!w51Var.a.isAssignableFrom(cls) || !w51Var.b.isAssignableFrom(cls2)) {
                        z2 = false;
                    }
                    if (z2) {
                        ((HashSet) this.d).add(w51Var);
                        arrayList.add(w51Var.c.a(this));
                        ((HashSet) this.d).remove(w51Var);
                    }
                }
            }
            if (arrayList.size() > 1) {
                vi viVar = (vi) this.c;
                ac2 ac2Var = (ac2) this.e;
                viVar.getClass();
                return new zb(2, arrayList, ac2Var);
            }
            if (arrayList.size() == 1) {
                return (e51) arrayList.get(0);
            }
            if (z) {
                return v;
            }
            throw new eh1("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        } catch (Throwable th) {
            ((HashSet) this.d).clear();
            throw th;
        }
    }

    public synchronized ArrayList j(Class cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            ArrayList arrayList2 = (ArrayList) this.b;
            int size = arrayList2.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList2.get(i2);
                i2++;
                w51 w51Var = (w51) obj;
                if (!((HashSet) this.d).contains(w51Var) && w51Var.a.isAssignableFrom(cls)) {
                    ((HashSet) this.d).add(w51Var);
                    arrayList.add(w51Var.c.a(this));
                    ((HashSet) this.d).remove(w51Var);
                }
            }
        } catch (Throwable th) {
            ((HashSet) this.d).clear();
            throw th;
        }
        return arrayList;
    }

    public byte[] k(byte[] bArr) throws Exception {
        try {
            u();
            if (((Cipher) this.b) == null) {
                Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
                cipher.init(2, (Key) this.d);
                this.b = cipher;
            }
            return ((Cipher) this.b).doFinal(bArr);
        } catch (NoClassDefFoundError unused) {
            throw new Exception("NoClassDefFound...");
        }
    }

    public byte[] l(String str) throws NoSuchPaddingException, NoSuchAlgorithmException, IOException, InvalidKeyException, KeyStoreException, CertificateException {
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        u();
        if (((Cipher) this.c) == null) {
            Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            cipher.init(1, (PublicKey) this.e);
            this.c = cipher;
        }
        return ((Cipher) this.c).doFinal(bytes);
    }

    public Fragment m(String str) {
        f fVar = (f) ((HashMap) this.c).get(str);
        if (fVar != null) {
            return fVar.c;
        }
        return null;
    }

    public Fragment n(String str) {
        for (f fVar : ((HashMap) this.c).values()) {
            if (fVar != null) {
                Fragment fragmentN = fVar.c;
                if (!str.equals(fragmentN.e)) {
                    fragmentN = ((e) fragmentN.g0).c.n(str);
                }
                if (fragmentN != null) {
                    return fragmentN;
                }
            }
        }
        return null;
    }

    public gv1 o(e4 e4Var) {
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            gv1 gv1Var = (gv1) arrayList.get(i2);
            if (gv1Var != null && gv1Var.b == e4Var) {
                return gv1Var;
            }
        }
        gv1 gv1Var2 = new gv1((Context) this.c, e4Var);
        arrayList.add(gv1Var2);
        return gv1Var2;
    }

    public ArrayList p() {
        ArrayList arrayList = new ArrayList();
        for (f fVar : ((HashMap) this.c).values()) {
            if (fVar != null) {
                arrayList.add(fVar);
            }
        }
        return arrayList;
    }

    public ArrayList q() {
        ArrayList arrayList = new ArrayList();
        for (f fVar : ((HashMap) this.c).values()) {
            if (fVar != null) {
                arrayList.add(fVar.c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public synchronized ArrayList r(Class cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) this.b;
        int size = arrayList2.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            w51 w51Var = (w51) obj;
            if (!arrayList.contains(w51Var.b) && w51Var.a.isAssignableFrom(cls)) {
                arrayList.add(w51Var.b);
            }
        }
        return arrayList;
    }

    public List s() {
        ArrayList arrayList;
        if (((ArrayList) this.b).isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (((ArrayList) this.b)) {
            arrayList = new ArrayList((ArrayList) this.b);
        }
        return arrayList;
    }

    public Object then(Task task) {
        String str = (String) this.b;
        if (!task.isSuccessful()) {
            Exception exception = task.getException();
            gu2.o(exception);
            SparseArray sparseArray = jm2.a;
            if (exception instanceof lc0 ? ((lc0) exception).b.endsWith("INVALID_RECAPTCHA_TOKEN") : false) {
                if (Log.isLoggable("RecaptchaCallWrapper", 4)) {
                    Log.i("RecaptchaCallWrapper", "Invalid token - Refreshing Recaptcha Enterprise config and fetching new token for tenant " + str);
                }
                return ((qp0) this.c).o(str, Boolean.TRUE, (RecaptchaAction) this.d).continueWithTask((wa) this.e);
            }
        }
        return task;
    }

    public String toString() {
        switch (this.a) {
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                String string = ((Socket) this.b).toString();
                string.getClass();
                return string;
            default:
                return super.toString();
        }
    }

    public void u() throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
        if (((Key) this.d) == null || ((PublicKey) this.e) == null) {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            if (Build.VERSION.SDK_INT >= 28) {
                this.d = keyStore.getKey("crypto", null);
                this.e = keyStore.getCertificate("crypto").getPublicKey();
            } else {
                KeyStore.PrivateKeyEntry privateKeyEntry = (KeyStore.PrivateKeyEntry) keyStore.getEntry("crypto", null);
                this.d = privateKeyEntry.getPrivateKey();
                this.e = privateKeyEntry.getCertificate().getPublicKey();
            }
        }
    }

    public boolean v(Context context) {
        if (((Boolean) this.d) == null) {
            this.d = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!((Boolean) this.c).booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.d).booleanValue();
    }

    public boolean w(Context context) {
        if (((Boolean) this.c) == null) {
            this.c = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!((Boolean) this.c).booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.c).booleanValue();
    }

    public void x(f fVar) {
        Fragment fragment = fVar.c;
        String str = fragment.e;
        HashMap map = (HashMap) this.c;
        if (map.get(str) != null) {
            return;
        }
        map.put(fragment.e, fVar);
        if (fragment.o0) {
            boolean z = fragment.n0;
            jg0 jg0Var = (jg0) this.e;
            if (z) {
                jg0Var.d(fragment);
            } else {
                jg0Var.g(fragment);
            }
            fragment.o0 = false;
        }
        if (e.H(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + fragment);
        }
    }

    public void y(f fVar) {
        HashMap map = (HashMap) this.c;
        Fragment fragment = fVar.c;
        if (fragment.n0) {
            ((jg0) this.e).g(fragment);
        }
        if (map.get(fragment.e) == fVar && ((f) map.put(fragment.e, null)) != null && e.H(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + fragment);
        }
    }

    public synchronized ArrayList z() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = ((ArrayList) this.b).iterator();
        while (it.hasNext()) {
            w51 w51Var = (w51) it.next();
            if (w51Var.a.isAssignableFrom(jj0.class) && w51Var.b.isAssignableFrom(InputStream.class)) {
                it.remove();
                arrayList.add(w51Var.c);
            }
        }
        return arrayList;
    }

    public /* synthetic */ ep1(int i2, boolean z) {
        this.a = i2;
    }

    public ep1(ud2 ud2Var) {
        this.a = 17;
        this.b = (xi3) ud2Var.a;
        this.c = (ro0) ud2Var.b;
        this.d = (ArrayList) ud2Var.c;
        this.e = (Uri) ud2Var.d;
    }

    public ep1(ep1 ep1Var, f91 f91Var) {
        this.a = 14;
        this.d = new HashMap();
        this.e = new HashMap();
        this.b = ep1Var;
        this.c = f91Var;
    }

    public ep1(Status status, zzc zzcVar, String str, String str2) {
        this.a = 9;
        this.c = status;
        this.d = zzcVar;
        this.b = str;
        this.e = str2;
    }

    public ep1(Context context, hc0 hc0Var, String str) {
        this.a = 10;
        gu2.o(context);
        this.c = context;
        gu2.o(hc0Var);
        this.e = hc0Var;
        this.b = "Android/Fallback/".concat(str);
    }

    public ep1(ac2 ac2Var) {
        this.a = 1;
        this.b = new ArrayList();
        this.d = new HashSet();
        this.e = ac2Var;
        this.c = i;
    }

    public ep1(Socket socket) {
        this.a = 4;
        this.b = socket;
        this.c = new AtomicInteger();
        this.d = new vz(this);
        this.e = new uz(this);
    }

    public /* synthetic */ ep1(int i2, Object obj, Object obj2, Object obj3, Object obj4) {
        this.a = i2;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public ep1(Context context, ActionMode.Callback callback) {
        this.a = 7;
        this.c = context;
        this.b = callback;
        this.d = new ArrayList();
        this.e = new wq1(0);
    }
}
