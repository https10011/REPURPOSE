package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import com.hjq.toast.BuildConfig;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.RequestBody;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class xn implements ls, bj1, bj, qz1, ln2, hv2, yc3, ff3, ed3, ze3 {
    public final /* synthetic */ int a;
    public static final xn b = new xn(0);
    public static final xn c = new xn(1);
    public static final xn d = new xn(2);
    public static final /* synthetic */ xn e = new xn(12);
    public static final /* synthetic */ xn f = new xn(13);
    public static final /* synthetic */ xn i = new xn(14);
    public static final /* synthetic */ xn v = new xn(15);
    public static final /* synthetic */ xn w = new xn(16);
    public static final /* synthetic */ xn W = new xn(17);
    public static final /* synthetic */ xn X = new xn(18);
    public static final /* synthetic */ xn Y = new xn(19);

    public /* synthetic */ xn(int i2) {
        this.a = i2;
    }

    public static final ac2 d(JSONObject jSONObject) throws JSONException {
        String strOptString;
        JSONArray jSONArray = jSONObject.getJSONObject("permissions").getJSONArray("data");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int length = jSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i2);
            String strOptString2 = jSONObjectOptJSONObject.optString("permission");
            strOptString2.getClass();
            if (strOptString2.length() != 0 && !Intrinsics.areEqual(strOptString2, "installed") && (strOptString = jSONObjectOptJSONObject.optString("status")) != null) {
                int iHashCode = strOptString.hashCode();
                if (iHashCode != -1309235419) {
                    if (iHashCode != 280295099) {
                        if (iHashCode == 568196142 && strOptString.equals("declined")) {
                            arrayList2.add(strOptString2);
                        }
                    } else if (strOptString.equals("granted")) {
                        arrayList.add(strOptString2);
                    }
                } else if (strOptString.equals("expired")) {
                    arrayList3.add(strOptString2);
                }
            }
        }
        ac2 ac2Var = new ac2(18);
        ac2Var.b = arrayList;
        ac2Var.c = arrayList2;
        ac2Var.d = arrayList3;
        return ac2Var;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001a A[Catch: all -> 0x0020, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0003, B:13:0x001a, B:11:0x0014, B:8:0x0010), top: B:91:0x0003, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x0157  */
    /* JADX WARN: Code duplicated, block: B:70:0x0163  */
    /* JADX WARN: Code duplicated, block: B:97:0x0179 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x018c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static kp0 e(Context context) {
        qp0 qp0VarM;
        qp0 qp0Var;
        Class cls;
        Class cls2;
        Class cls3;
        Object objS;
        kp0 kp0Var;
        Object objS2;
        Object objS3;
        synchronized (qp0.i) {
            if (mt.a.contains(qp0.class)) {
                qp0VarM = null;
                if (qp0VarM == null) {
                    qp0VarM = ba0.m();
                }
                qp0Var = qp0VarM;
            } else {
                try {
                    qp0VarM = qp0.v;
                } catch (Throwable th) {
                    mt.a(qp0.class, th);
                    qp0VarM = null;
                }
                if (qp0VarM == null) {
                    qp0VarM = ba0.m();
                }
                qp0Var = qp0VarM;
            }
            throw th;
        }
        if (qp0Var == null) {
            return null;
        }
        Class clsJ = sp0.j("com.android.billingclient.api.BillingClient");
        Class clsJ2 = sp0.j("com.android.billingclient.api.Purchase");
        Class clsJ3 = sp0.j("com.android.billingclient.api.Purchase$PurchasesResult");
        Class clsJ4 = sp0.j("com.android.billingclient.api.SkuDetails");
        Class clsJ5 = sp0.j("com.android.billingclient.api.PurchaseHistoryRecord");
        Class clsJ6 = sp0.j("com.android.billingclient.api.SkuDetailsResponseListener");
        Class clsJ7 = sp0.j("com.android.billingclient.api.PurchaseHistoryResponseListener");
        if (clsJ == null || clsJ3 == null || clsJ2 == null || clsJ4 == null || clsJ6 == null || clsJ5 == null || clsJ7 == null) {
            Log.w(kp0.b(), "Failed to create Google Play billing library wrapper for in-app purchase auto-logging");
            return null;
        }
        Method methodO = sp0.o(clsJ, "queryPurchases", String.class);
        Method methodO2 = sp0.o(clsJ3, "getPurchasesList", new Class[0]);
        Method methodO3 = sp0.o(clsJ2, "getOriginalJson", new Class[0]);
        Method methodO4 = sp0.o(clsJ4, "getOriginalJson", new Class[0]);
        Method methodO5 = sp0.o(clsJ5, "getOriginalJson", new Class[0]);
        if (mt.a.contains(qp0Var)) {
            cls = null;
        } else {
            try {
                cls = (Class) qp0Var.a;
            } catch (Throwable th2) {
                mt.a(qp0Var, th2);
                cls = null;
            }
        }
        Method methodO6 = sp0.o(clsJ, "querySkuDetailsAsync", cls, clsJ6);
        Method methodO7 = sp0.o(clsJ, "queryPurchaseHistoryAsync", String.class, clsJ7);
        if (methodO == null || methodO2 == null || methodO3 == null || methodO4 == null || methodO5 == null || methodO6 == null || methodO7 == null) {
            Log.w(kp0.b(), "Failed to create Google Play billing library wrapper for in-app purchase auto-logging");
            return null;
        }
        Class clsJ8 = sp0.j("com.android.billingclient.api.BillingClient$Builder");
        Class clsJ9 = sp0.j("com.android.billingclient.api.PurchasesUpdatedListener");
        if (clsJ8 != null && clsJ9 != null) {
            Method methodO8 = sp0.o(clsJ, "newBuilder", Context.class);
            Method methodO9 = sp0.o(clsJ8, "enablePendingPurchases", new Class[0]);
            Method methodO10 = sp0.o(clsJ8, "setListener", clsJ9);
            cls2 = clsJ4;
            Method methodO11 = sp0.o(clsJ8, "build", new Class[0]);
            if (methodO8 != null && methodO9 != null && methodO10 != null && methodO11 != null && (objS2 = sp0.s(clsJ, methodO8, null, context)) != null) {
                clsJ = clsJ;
                cls3 = clsJ5;
                Object objS4 = sp0.s(clsJ8, methodO10, objS2, Proxy.newProxyInstance(clsJ9.getClassLoader(), new Class[]{clsJ9}, new jp0(0)));
                objS = (objS4 == null || (objS3 = sp0.s(clsJ8, methodO9, objS4, new Object[0])) == null) ? null : sp0.s(clsJ8, methodO11, objS3, new Object[0]);
            }
            if (objS == null) {
                Log.w(kp0.b(), "Failed to build a Google Play billing library wrapper for in-app purchase auto-logging");
                return null;
            }
            kp0Var = new kp0(objS, clsJ, cls2, cls3, clsJ6, clsJ7, methodO4, methodO5, methodO6, methodO7, qp0Var);
            if (!mt.a.contains(kp0.class)) {
                try {
                    kp0.m = kp0Var;
                } catch (Throwable th3) {
                    mt.a(kp0.class, th3);
                }
            }
            if (!mt.a.contains(kp0.class)) {
                try {
                    return kp0.m;
                } catch (Throwable th4) {
                    mt.a(kp0.class, th4);
                }
            }
            return null;
        }
        cls2 = clsJ4;
        cls3 = clsJ5;
        if (objS == null) {
            Log.w(kp0.b(), "Failed to build a Google Play billing library wrapper for in-app purchase auto-logging");
            return null;
        }
        kp0Var = new kp0(objS, clsJ, cls2, cls3, clsJ6, clsJ7, methodO4, methodO5, methodO6, methodO7, qp0Var);
        if (!mt.a.contains(kp0.class)) {
            kp0.m = kp0Var;
        }
        if (!mt.a.contains(kp0.class)) {
            return kp0.m;
        }
        return null;
    }

    public static ac2 l() {
        return new ac2(null, w11.c(new Pair(2, (Object) null), new Pair(4, (Object) null), new Pair(9, (Object) null), new Pair(17, (Object) null), new Pair(341, (Object) null)), w11.c(new Pair(102, (Object) null), new Pair(190, (Object) null), new Pair(412, (Object) null)), null, null, null);
    }

    public static ConcurrentHashMap m() {
        if (mt.a.contains(kp0.class)) {
            return null;
        }
        try {
            return kp0.o;
        } catch (Throwable th) {
            mt.a(kp0.class, th);
            return null;
        }
    }

    public static ConcurrentHashMap p() {
        if (mt.a.contains(kp0.class)) {
            return null;
        }
        try {
            return kp0.q;
        } catch (Throwable th) {
            mt.a(kp0.class, th);
            return null;
        }
    }

    public static ConcurrentHashMap q() {
        if (mt.a.contains(kp0.class)) {
            return null;
        }
        try {
            return kp0.p;
        } catch (Throwable th) {
            mt.a(kp0.class, th);
            return null;
        }
    }

    public static final void r(n70 n70Var, View view, View view2) {
        if (mt.a.contains(xn.class)) {
            return;
        }
        try {
            n70Var.getClass();
            String str = n70Var.a;
            mo1 mo1Var = co.f;
            Bundle bundleL = mo1.l(n70Var, view, view2);
            b.t(bundleL);
            i90.c().execute(new x4(12, str, bundleL));
        } catch (Throwable th) {
            mt.a(xn.class, th);
        }
    }

    public static HashMap s(JSONObject jSONObject) {
        int iOptInt;
        HashSet hashSet;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("items");
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() == 0) {
            return null;
        }
        HashMap map = new HashMap();
        int length = jSONArrayOptJSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i2);
            if (jSONObjectOptJSONObject != null && (iOptInt = jSONObjectOptJSONObject.optInt("code")) != 0) {
                JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray("subcodes");
                if (jSONArrayOptJSONArray2 == null || jSONArrayOptJSONArray2.length() <= 0) {
                    hashSet = null;
                } else {
                    hashSet = new HashSet();
                    int length2 = jSONArrayOptJSONArray2.length();
                    for (int i3 = 0; i3 < length2; i3++) {
                        int iOptInt2 = jSONArrayOptJSONArray2.optInt(i3);
                        if (iOptInt2 != 0) {
                            hashSet.add(Integer.valueOf(iOptInt2));
                        }
                    }
                }
                map.put(Integer.valueOf(iOptInt), hashSet);
            }
        }
        return map;
    }

    @Override // defpackage.bj
    public Class a() {
        return ByteBuffer.class;
    }

    @Override // defpackage.qz1
    public oz1 b(int i2) {
        return d71.a;
    }

    @Override // defpackage.ff3
    public vf3 c(dx2 dx2Var) throws GeneralSecurityException {
        r73 r73Var = (r73) dx2Var;
        vn3 vn3VarT = xn3.t();
        vn3VarT.i("type.googleapis.com/google.crypto.tink.AesSivKey");
        mk3 mk3VarX = nk3.x();
        int i2 = r73Var.a;
        mk3VarX.f();
        ((nk3) mk3VarX.b).zze = i2;
        vn3VarT.j(((nk3) mk3VarX.d()).b());
        q73 q73Var = r73Var.b;
        Map map = y73.e;
        if (!map.containsKey(q73Var)) {
            throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(q73Var)));
        }
        vn3VarT.h((ip3) map.get(q73Var));
        return vf3.f((xn3) vn3VarT.d());
    }

    @Override // defpackage.ed3
    public wf3 g(zi0 zi0Var) {
        w83 w83Var = (w83) zi0Var;
        return wf3.d("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey", ha3.c(w83Var).b(), 4, (ip3) ha3.g.E(w83Var.f.d), w83Var.j);
    }

    public synchronized ac2 h() {
        ac2 ac2Var;
        try {
            if (ac2.X == null) {
                ac2.X = l();
            }
            ac2Var = ac2.X;
            ac2Var.getClass();
        } catch (Throwable th) {
            throw th;
        }
        return ac2Var;
    }

    @Override // defpackage.ls
    public Object i(Object obj) {
        return (RequestBody) obj;
    }

    @Override // defpackage.bj
    public Object j(byte[] bArr) {
        return ByteBuffer.wrap(bArr);
    }

    @Override // defpackage.ze3
    public dx2 k(vf3 vf3Var) throws GeneralSecurityException {
        xn3 xn3Var = (xn3) vf3Var.c;
        if (!xn3Var.B().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            e.g(ts.j("Wrong type URL in call to HmacProtoSerialization.parseParameters: ", xn3Var.B()));
            return null;
        }
        try {
            fm3 fm3VarU = fm3.u(xn3Var.A(), wr2.b);
            if (fm3VarU.x() != 0) {
                throw new GeneralSecurityException(ck1.r(fm3VarU.x(), "Parsing HmacParameters failed: unknown Version "));
            }
            ep1 ep1VarB = ah3.b();
            ep1VarB.b = Integer.valueOf(fm3VarU.t());
            ep1VarB.c = Integer.valueOf(fm3VarU.A().t());
            ep1VarB.d = (zg3) mh3.b.F(fm3VarU.A().w());
            ep1VarB.e = (yg3) mh3.a.F(xn3Var.z());
            return ep1VarB.F();
        } catch (ks2 e2) {
            throw new GeneralSecurityException("Parsing HmacParameters failed: ", e2);
        }
    }

    public co n() {
        co coVar;
        co coVar2 = co.w;
        if (coVar2 != null) {
            return coVar2;
        }
        synchronized (this) {
            coVar = co.w;
            if (coVar == null) {
                co coVarX = co.x(i90.a());
                coVarX.getClass();
                x1 x1Var = new x1(0);
                coVarX.getClass();
                co coVar3 = new co();
                coVar3.a = coVarX;
                coVar3.b = x1Var;
                coVar3.d = new AtomicBoolean(false);
                coVar3.e = new Date(0L);
                co.w = coVar3;
                coVar = coVar3;
            }
        }
        return coVar;
    }

    @Override // defpackage.yc3
    public zi0 o(wf3 wf3Var) throws GeneralSecurityException {
        if (!((String) wf3Var.c).equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            e.g("Wrong type URL in call to AesGcmSivProtoSerialization.parseKey");
            return null;
        }
        try {
            ak3 ak3VarU = ak3.u((jr2) wf3Var.e, wr2.b);
            if (ak3VarU.t() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            nl1 nl1VarB = sz2.b();
            nl1VarB.o(ak3VarU.x().b());
            nl1VarB.a = c43.a((ip3) wf3Var.f);
            sz2 sz2VarN = nl1VarB.n();
            p11 p11Var = new p11(29);
            p11Var.c = null;
            p11Var.d = null;
            p11Var.b = sz2VarN;
            p11Var.c = new ox1(tr3.a(ak3VarU.x().o()));
            p11Var.d = (Integer) wf3Var.i;
            return p11Var.r();
        } catch (ks2 unused) {
            tv2.f("Parsing AesGcmSivKey failed");
            return null;
        }
    }

    public void t(Bundle bundle) {
        Locale locale;
        if (mt.a.contains(this)) {
            return;
        }
        try {
            String string = bundle.getString("_valueToSum");
            if (string != null) {
                double dDoubleValue = 0.0d;
                try {
                    Matcher matcher = Pattern.compile("[-+]*\\d+([.,]\\d+)*([.,]\\d+)?", 8).matcher(string);
                    if (matcher.find()) {
                        String strGroup = matcher.group(0);
                        try {
                            locale = i90.a().getResources().getConfiguration().locale;
                        } catch (Exception unused) {
                            locale = null;
                        }
                        if (locale == null) {
                            locale = Locale.getDefault();
                            locale.getClass();
                        }
                        dDoubleValue = NumberFormat.getNumberInstance(locale).parse(strGroup).doubleValue();
                    }
                } catch (ParseException unused2) {
                }
                bundle.putDouble("_valueToSum", dDoubleValue);
            }
            bundle.putString("_is_fb_codeless", "1");
        } catch (Throwable th) {
            mt.a(this, th);
        }
    }

    @Override // defpackage.hv2
    /* JADX INFO: renamed from: zza */
    public Object mo5zza() {
        switch (this.a) {
            case 12:
                List list = h13.a;
                return (String) lp2.a.get();
            case 13:
                List list2 = h13.a;
                vo2.b.get();
                return (Long) xo2.a.z("measurement.sgtm.batch.retry_interval", 1800000L, 41).get();
            case 14:
                List list3 = h13.a;
                vo2.b.get();
                return (Long) xo2.a.z("measurement.upload.stale_data_deletion_interval", 86400000L, 53).get();
            case 15:
                List list4 = h13.a;
                fq2.b.get();
                return (Long) gq2.a.z("measurement.test.long_flag", -1L, 4).get();
            case 16:
                List list5 = h13.a;
                vo2.b.get();
                return (String) xo2.a.E(32, "measurement.rb.attribution.app_allowlist", BuildConfig.FLAVOR).get();
            case 17:
                List list6 = h13.a;
                return (Boolean) tp2.a.get();
            case 18:
                List list7 = h13.a;
                hq2.b.get();
                return (Boolean) iq2.a.r(1, "measurement.rb.attribution.client2", true).get();
            default:
                return new Boolean(((Boolean) rq2.a.get()).booleanValue());
        }
    }

    @Override // defpackage.ln2
    public boolean zzb(Class cls) {
        return false;
    }

    @Override // defpackage.ln2
    public wn2 zzc(Class cls) {
        throw new IllegalStateException("This should never be called.");
    }

    @Override // defpackage.bj1
    public pi1 f(pi1 pi1Var, da1 da1Var) {
        return pi1Var;
    }
}
