package defpackage;

import android.app.ActivityManager;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.SystemClock;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.profileinstaller.ProfileInstallReceiver;
import com.facebook.login.h;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.zab;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.common.util.concurrent.ListenableFuture;
import com.hjq.toast.BuildConfig;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwsHeader;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.SigningKeyResolver;
import io.jsonwebtoken.security.SecurityException;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.security.Key;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.InvalidKeySpecException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public class ri2 implements px1, ak, m90, yg0, hj1, SigningKeyResolver, gd1, j52, c4, sk0, ph1, mn2, ac {
    public static ri2 b;
    public static final String[] c = {"_data"};
    public Object a;

    public ri2(int i) {
        switch (i) {
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                this.a = new HashMap();
                break;
            case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                this.a = new Bundle();
                break;
            case 11:
                this.a = new ArrayList();
                break;
            case 12:
                this.a = new r41(9);
                break;
            case 24:
                this.a = new ArrayList();
                break;
            default:
                if (Build.VERSION.SDK_INT < 26) {
                    this.a = new y2(this);
                } else {
                    this.a = new z2(this);
                }
                break;
        }
    }

    public static synchronized ri2 v(Context context) {
        ri2 ri2Var;
        String strE;
        Context applicationContext = context.getApplicationContext();
        synchronized (ri2.class) {
            ri2Var = b;
            if (ri2Var == null) {
                ri2Var = new ri2();
                yt1 yt1VarA = yt1.a(applicationContext);
                ri2Var.a = yt1VarA;
                yt1VarA.b();
                String strE2 = yt1VarA.e("defaultGoogleSignInAccount");
                if (!TextUtils.isEmpty(strE2) && (strE = yt1VarA.e(yt1.f("googleSignInOptions", strE2))) != null) {
                    try {
                        GoogleSignInOptions.R(strE);
                    } catch (JSONException unused) {
                    }
                }
                b = ri2Var;
            }
        }
        return ri2Var;
        return ri2Var;
    }

    public static ri2 x(JSONArray jSONArray) throws JSONException {
        op2 op2Var;
        if (jSONArray == null || jSONArray.length() == 0) {
            return new ri2(new ArrayList());
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            if (jSONObject == null) {
                op2Var = new op2();
            } else {
                String strA = ku1.a(jSONObject.optString("federatedId"));
                String strA2 = ku1.a(jSONObject.optString("displayName"));
                String strA3 = ku1.a(jSONObject.optString("photoUrl"));
                String strA4 = ku1.a(jSONObject.optString("providerId"));
                String strA5 = ku1.a(jSONObject.optString("phoneNumber"));
                String strA6 = ku1.a(jSONObject.optString("email"));
                op2 op2Var2 = new op2();
                op2Var2.a = strA;
                op2Var2.b = strA2;
                op2Var2.c = strA3;
                op2Var2.d = strA4;
                op2Var2.e = null;
                op2Var2.f = strA5;
                op2Var2.g = strA6;
                op2Var = op2Var2;
            }
            arrayList.add(op2Var);
        }
        return new ri2(arrayList);
    }

    public void A(long j, long j2) {
        td3 td3Var = (td3) this.a;
        td3Var.D();
        y53 y53Var = (y53) td3Var.a;
        if (y53Var.a()) {
            h43 h43Var = y53Var.e;
            y53.j(h43Var);
            h43Var.c0.b(j);
            y53Var.X.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            c33 c33Var = y53Var.f;
            y53.l(c33Var);
            c33Var.a0.b(Long.valueOf(jElapsedRealtime), "Session started, time");
            long j3 = j / 1000;
            Long lValueOf = Long.valueOf(j3);
            w93 w93Var = y53Var.Z;
            y53.k(w93Var);
            w93Var.P(j, lValueOf, "auto", "_sid");
            y53.j(h43Var);
            h43Var.d0.b(j3);
            h43Var.Y.b(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", j3);
            y53.k(w93Var);
            w93Var.M(j, j2, bundle, "auto", "_s");
            String strJ = h43Var.i0.j();
            if (TextUtils.isEmpty(strJ)) {
                return;
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString("_ffr", strJ);
            y53.k(w93Var);
            w93Var.M(j, j2, bundle2, "auto", "_ssr");
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0024 A[Catch: all -> 0x0050, TryCatch #0 {, blocks: (B:3:0x0001, B:11:0x001a, B:12:0x001e, B:14:0x0024, B:16:0x0036, B:17:0x0040, B:19:0x0046, B:10:0x0017, B:7:0x000b), top: B:27:0x0001, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x0046 A[Catch: all -> 0x0050, LOOP:1: B:17:0x0040->B:19:0x0046, LOOP_END, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:11:0x001a, B:12:0x001e, B:14:0x0024, B:16:0x0036, B:17:0x0040, B:19:0x0046, B:10:0x0017, B:7:0x000b), top: B:27:0x0001, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0036 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x001e A[SYNTHETIC] */
    public synchronized void a(ob1 ob1Var) {
        fp1 fp1VarK;
        Iterator it;
        Set<Map.Entry> set = null;
        if (mt.a.contains(ob1Var)) {
            for (Map.Entry entry : set) {
                fp1VarK = k((w1) entry.getKey());
                if (fp1VarK != null) {
                    it = ((List) entry.getValue()).iterator();
                    while (it.hasNext()) {
                        fp1VarK.a((z9) it.next());
                    }
                }
            }
        } else {
            try {
                Set setEntrySet = ob1Var.a.entrySet();
                setEntrySet.getClass();
                set = setEntrySet;
            } catch (Throwable th) {
                mt.a(ob1Var, th);
            }
            while (r4.hasNext()) {
                fp1VarK = k((w1) entry.getKey());
                if (fp1VarK != null) {
                    it = ((List) entry.getValue()).iterator();
                    while (it.hasNext()) {
                        fp1VarK.a((z9) it.next());
                    }
                }
            }
        }
        throw th;
    }

    @Override // defpackage.ph1
    public void accept(Object obj, Object obj2) {
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        nh2 nh2Var = (nh2) ((ng2) obj).l();
        zab zabVar = (zab) this.a;
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(nh2Var.c);
        int i = yg2.a;
        parcelObtain.writeInt(1);
        zabVar.writeToParcel(parcelObtain, 0);
        try {
            nh2Var.b.transact(1, parcelObtain, null, 1);
            parcelObtain.recycle();
            taskCompletionSource.setResult((Object) null);
        } catch (Throwable th) {
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // defpackage.yg0
    public Object apply(Object obj) {
        h hVar = (h) this.a;
        wf0 wf0Var = ((Fragment) hVar).f0;
        return wf0Var != null ? wf0Var.b0.getActivityResultRegistry() : hVar.I().getActivityResultRegistry();
    }

    public x2 b(int i) {
        return null;
    }

    @Override // defpackage.hj1
    public Object c(InputStream inputStream) throws IOException {
        try {
            return new JSONObject(((r41) this.a).c(inputStream));
        } catch (JSONException e) {
            throw new IOException(e);
        }
    }

    @Override // defpackage.ac
    public ListenableFuture call() {
        h02 h02Var = new h02((Callable) this.a);
        t10.a.execute(h02Var);
        return h02Var;
    }

    public x2 d(int i) {
        return null;
    }

    @Override // defpackage.j52
    public int e() {
        xf1 xf1Var = (xf1) this.a;
        return xf1Var.o - xf1Var.D();
    }

    @Override // defpackage.sk0
    public void f(HashMap map) {
        ((ff2) this.a).g = map.toString();
    }

    @Override // defpackage.j52
    public int g(View view) {
        return (view.getTop() - ((yf1) view.getLayoutParams()).b.top) - ((ViewGroup.MarginLayoutParams) ((yf1) view.getLayoutParams())).topMargin;
    }

    @Override // defpackage.yd1
    public Object get() {
        return new ac2((Context) ((qq0) this.a).a, new br0(10), new k42(9), 14);
    }

    public synchronized int h() {
        int i;
        int size;
        i = 0;
        for (fp1 fp1Var : ((HashMap) this.a).values()) {
            synchronized (fp1Var) {
                if (!mt.a.contains(fp1Var)) {
                    try {
                        size = fp1Var.c.size();
                    } catch (Throwable th) {
                        mt.a(fp1Var, th);
                        size = 0;
                    }
                }
                size = 0;
            }
            i += size;
        }
        return i;
    }

    @Override // defpackage.px1
    public Cursor i(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        return ((ContentResolver) this.a).query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, c, "kind = 1 AND video_id = ?", new String[]{lastPathSegment}, null);
    }

    @Override // defpackage.gd1
    public void j() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    public synchronized fp1 k(w1 w1Var) {
        Context contextA;
        nc ncVarT;
        fp1 fp1Var = (fp1) ((HashMap) this.a).get(w1Var);
        if (fp1Var == null && (ncVarT = kv.t((contextA = i90.a()))) != null) {
            fp1Var = new fp1(ncVarT, yv2.w(contextA));
        }
        if (fp1Var == null) {
            return null;
        }
        ((HashMap) this.a).put(w1Var, fp1Var);
        return fp1Var;
    }

    @Override // defpackage.gd1
    public void l(int i, Object obj) {
        String str;
        switch (i) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                str = "RESULT_NOT_WRITABLE";
                break;
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                str = "RESULT_IO_EXCEPTION";
                break;
            case oc1.BYTES_FIELD_NUMBER /* 8 */:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = BuildConfig.FLAVOR;
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i == 6 || i == 7 || i == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
        ((ProfileInstallReceiver) this.a).setResultCode(i);
    }

    @Override // defpackage.j52
    public View m(int i) {
        return ((xf1) this.a).u(i);
    }

    @Override // defpackage.ak
    public void n(wj wjVar, gj1 gj1Var) {
        ((rp) this.a).complete(gj1Var);
    }

    @Override // defpackage.j52
    public int o() {
        return ((xf1) this.a).G();
    }

    @Override // defpackage.j52
    public int p(View view) {
        return view.getBottom() + ((yf1) view.getLayoutParams()).b.bottom + ((ViewGroup.MarginLayoutParams) ((yf1) view.getLayoutParams())).bottomMargin;
    }

    public synchronized Set q() {
        Set setKeySet;
        setKeySet = ((HashMap) this.a).keySet();
        setKeySet.getClass();
        return setKeySet;
    }

    @Override // defpackage.ak
    public void r(wj wjVar, Throwable th) {
        ((rp) this.a).completeExceptionally(th);
    }

    @Override // io.jsonwebtoken.SigningKeyResolver
    public Key resolveSigningKey(JwsHeader jwsHeader, Claims claims) {
        return u(jwsHeader);
    }

    @Override // defpackage.mn2
    public /* synthetic */ void s(an2 an2Var) {
        ((rd2) this.a).o((kp2) an2Var);
    }

    public boolean t(int i, int i2, Bundle bundle) {
        return false;
    }

    public ECPublicKey u(JwsHeader jwsHeader) {
        ix0 ix0VarA;
        is0 is0Var;
        mx0 mx0Var = (mx0) this.a;
        ix0 ix0VarA2 = mx0Var.a();
        if (ix0VarA2.d()) {
            Uri uri = Uri.parse(((u91) ix0VarA2.c()).d);
            vl vlVar = mx0Var.b;
            Map map = Collections.EMPTY_MAP;
            ix0VarA = vlVar.a(uri, map, map, mx0.h);
            if (!ix0VarA.d()) {
                Log.e("LineAuthApiClient", "getJWKSet failed: " + ix0VarA);
            }
        } else {
            ix0VarA = ix0.a(ix0VarA2.a, ix0VarA2.c);
        }
        if (!ix0VarA.d()) {
            Log.e("OpenIdSignKeyResolver", "failed to get LINE JSON Web Key Set [JWK] document.");
            return null;
        }
        js0 js0Var = (js0) ix0VarA.c();
        String keyId = jwsHeader.getKeyId();
        ArrayList arrayList = js0Var.a;
        int size = arrayList.size();
        int i = 0;
        do {
            if (i >= size) {
                is0Var = null;
                break;
            }
            Object obj = arrayList.get(i);
            i++;
            is0Var = (is0) obj;
        } while (!TextUtils.equals(is0Var.d, keyId));
        if (is0Var == null) {
            Log.e("OpenIdSignKeyResolver", "failed to find Key by Id: " + keyId);
            return null;
        }
        String algorithm = jwsHeader.getAlgorithm();
        if (!SignatureAlgorithm.forName(algorithm).isEllipticCurve()) {
            throw new SecurityException("Unsupported signature algorithm '" + algorithm + '\'');
        }
        String str = is0Var.f;
        String str2 = is0Var.e;
        BigInteger bigInteger = new BigInteger(1, Base64.decode(str, 8));
        BigInteger bigInteger2 = new BigInteger(1, Base64.decode(is0Var.g, 8));
        try {
            KeyFactory keyFactory = KeyFactory.getInstance("EC");
            ECPoint eCPoint = new ECPoint(bigInteger, bigInteger2);
            r40 r40VarQ = z32.q(str2);
            return (ECPublicKey) keyFactory.generatePublic(new ECPublicKeySpec(eCPoint, new s40(r40VarQ.a, r40VarQ.b, r40VarQ.c)));
        } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
            Log.e("OpenIdSignKeyResolver", "failed to generate EC Public Key from JWK: " + is0Var, e);
            return null;
        }
    }

    public synchronized void w() {
        yt1 yt1Var = (yt1) this.a;
        ReentrantLock reentrantLock = yt1Var.a;
        reentrantLock.lock();
        try {
            yt1Var.b.edit().clear().apply();
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public void y() {
        td3 td3Var = (td3) this.a;
        td3Var.D();
        y53 y53Var = (y53) td3Var.a;
        h43 h43Var = y53Var.e;
        y53.j(h43Var);
        y53Var.X.getClass();
        if (h43Var.N(System.currentTimeMillis())) {
            h43 h43Var2 = y53Var.e;
            y53.j(h43Var2);
            h43Var2.Y.b(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                c33 c33Var = y53Var.f;
                y53.l(c33Var);
                c33Var.a0.a("Detected application was in foreground");
                A(System.currentTimeMillis(), y53Var.d.P(null, h13.e1) ? SystemClock.elapsedRealtime() : 0L);
            }
        }
    }

    public void z(long j, long j2) {
        td3 td3Var = (td3) this.a;
        td3Var.D();
        td3Var.I();
        y53 y53Var = (y53) td3Var.a;
        h43 h43Var = y53Var.e;
        y53.j(h43Var);
        if (h43Var.N(j)) {
            y53.j(h43Var);
            h43Var.Y.b(true);
            y53Var.q().J();
        }
        y53.j(h43Var);
        h43Var.c0.b(j);
        if (h43Var.Y.a()) {
            A(j, j2);
        }
    }

    @Override // defpackage.mn2
    public void zza(String str) {
        ((rd2) this.a).a(kv.m0(str));
    }

    @Override // io.jsonwebtoken.SigningKeyResolver
    public Key resolveSigningKey(JwsHeader jwsHeader, String str) {
        return u(jwsHeader);
    }

    public ri2(ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            this.a = Collections.unmodifiableList(arrayList);
        } else {
            this.a = Collections.EMPTY_LIST;
        }
    }

    public /* synthetic */ ri2(Object obj) {
        this.a = obj;
    }
}
