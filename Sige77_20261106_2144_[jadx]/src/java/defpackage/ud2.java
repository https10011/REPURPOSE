package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.SparseArray;
import com.appsflyer.internal.d;
import com.fm.openinstall.Configuration;
import com.google.android.gms.internal.firebase-auth-api.zzahd;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.firebase.auth.EmailAuthCredential;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import com.google.firebase.auth.TotpMultiFactorInfo;
import com.google.firebase.auth.internal.zzad;
import com.google.firebase.auth.internal.zzaf;
import com.google.firebase.auth.internal.zzz;
import com.google.firebase.auth.zzao;
import java.lang.ref.ReferenceQueue;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Unit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class ud2 implements m90, mn2, Continuation, ac {
    public static volatile ud2 e;
    public Object a;
    public Object b;
    public Object c;
    public Object d;

    public ud2(int i) {
        int i2 = 0;
        switch (i) {
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                this.a = new zb1(10);
                this.b = new wq1(0);
                this.c = new ArrayList();
                this.d = new HashSet();
                break;
            case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                this.a = new mb(0);
                this.b = new SparseArray();
                this.c = new s01();
                this.d = new mb(0);
                break;
            case 13:
                f91 f91Var = new f91(10);
                this.a = f91Var;
                ep1 ep1Var = new ep1((ep1) null, f91Var);
                this.c = ep1Var;
                this.b = ep1Var.K();
                xw xwVar = new xw(3);
                this.d = xwVar;
                ep1Var.O("require", new ym3(xwVar));
                xwVar.a.put("internal.platform", hz2.b);
                ep1Var.O("runtime.counter", new ep2(Double.valueOf(0.0d)));
                break;
            case 15:
                this.d = new HashMap();
                this.a = new HashMap();
                this.b = new HashMap();
                this.c = new HashMap();
                break;
            default:
                ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new h4(i2));
                this.d = new HashMap();
                this.b = new ReferenceQueue();
                this.a = executorServiceNewSingleThreadExecutor;
                executorServiceNewSingleThreadExecutor.execute(new i4(this, i2));
                break;
        }
    }

    public static String e(String str, String str2) {
        return d.a("https://", str, "/api/v2_5/android/", (String) ue2.j.b, str2);
    }

    public void A() {
        this.c = 16;
    }

    public ce2 a(String str, String str2) {
        ce2 ce2VarD = d(e("api2." + yi0.f[yi0.v], str), str2, false);
        if (ce2VarD.e()) {
            yi0.v = (yi0.v + 1) % 2;
        }
        return ce2VarD;
    }

    public ce2 b(String str, String str2, boolean z) {
        ce2 ce2VarD = d(e("stat2." + yi0.f[yi0.v], str), str2, z);
        if (ce2VarD.e()) {
            yi0.v = (yi0.v + 1) % 2;
        }
        return ce2VarD;
    }

    public synchronized void c(hv0 hv0Var, y60 y60Var) {
        j4 j4Var = (j4) ((HashMap) this.d).put(hv0Var, new j4(hv0Var, y60Var, (ReferenceQueue) this.b));
        if (j4Var != null) {
            j4Var.c = null;
            j4Var.clear();
        }
    }

    @Override // defpackage.ac
    public ListenableFuture call() {
        rk3 rk3Var = (rk3) this.a;
        int i = 0;
        fk3 fk3Var = new fk3(rk3Var, i);
        ListenableFuture listenableFuture = (ListenableFuture) this.b;
        t10 t10Var = t10.a;
        r1 r1VarG = dh0.g(listenableFuture, fk3Var, t10Var);
        r1 r1VarG2 = dh0.g(r1VarG, (bg3) this.c, (Executor) this.d);
        kk3 kk3Var = new kk3(rk3Var, r1VarG, r1VarG2, i);
        int i2 = to3.a;
        return dh0.g(r1VarG2, new bg3(4, vm3.a(), kk3Var), t10Var);
    }

    public ce2 d(String str, String str2, boolean z) {
        HashMap map;
        String str3;
        String strA;
        synchronized (this) {
            try {
                if (((HashMap) this.d) == null) {
                    this.d = new HashMap();
                    qf2 qf2VarF = ((qp0) this.c).f();
                    ue2 ue2Var = ue2.j;
                    if (((Configuration) ue2Var.d) == null) {
                        ue2Var.d = Configuration.getDefault();
                    }
                    Configuration configuration = (Configuration) ue2Var.d;
                    if (Configuration.isPresent(configuration.getSerialNumber())) {
                        ((HashMap) this.d).put("sN", configuration.getSerialNumber());
                    } else {
                        if (((Boolean) ue2Var.f) == null) {
                            ue2Var.f = Boolean.TRUE;
                        }
                        if (((Boolean) ue2Var.f).booleanValue()) {
                            ((HashMap) this.d).put("sN", qf2VarF.b());
                        }
                    }
                    boolean zIsPresent = Configuration.isPresent(configuration.getAndroidId());
                    HashMap map2 = (HashMap) this.d;
                    if (zIsPresent) {
                        str3 = "andI";
                        strA = configuration.getAndroidId();
                    } else {
                        str3 = "andI";
                        strA = qf2VarF.a();
                    }
                    map2.put(str3, strA);
                    ((HashMap) this.d).put("Pk", (String) qf2VarF.c);
                    ((HashMap) this.d).put("cF", qf2VarF.d());
                    ((HashMap) this.d).put("ver", (String) qf2VarF.d);
                    ((HashMap) this.d).put("verI", String.valueOf((Integer) qf2VarF.l));
                    ((HashMap) this.d).put("apV", "2.8.2");
                }
                map = (HashMap) this.d;
            } catch (Throwable th) {
                throw th;
            }
        }
        HashMap map3 = new HashMap(map);
        qp0 qp0Var = (qp0) this.c;
        lf2 lf2Var = (lf2) qp0Var.e;
        map3.put("iI", TextUtils.isEmpty(lf2Var.f) ? ((rb2) qp0Var.j().a).b((String) ue2.j.b) : lf2Var.f);
        map3.put("ts", String.valueOf(System.currentTimeMillis()));
        String strI = i(map3);
        HashMap map4 = new HashMap();
        if (TextUtils.isEmpty(str2)) {
            ((u41) this.a).getClass();
            return u41.a(str, strI, null, map4);
        }
        byte[] bytes = str2.getBytes(vb2.a);
        if (z) {
            map4.put("content-type", "text/plain;charset=utf-8");
            map4.put("content-length", String.valueOf(bytes.length));
        }
        ((u41) this.a).getClass();
        return u41.a(str, strI, bytes, map4);
    }

    public void f(j4 j4Var) {
        pi1 pi1Var;
        synchronized (this) {
            ((HashMap) this.d).remove(j4Var.a);
            if (j4Var.b && (pi1Var = j4Var.c) != null) {
                ((s60) this.c).e(j4Var.a, new y60(pi1Var, true, false, j4Var.a, (s60) this.c));
            }
        }
    }

    public void g(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            uq1.m("This graph contains cyclic dependencies");
            return;
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) ((wq1) this.b).get(obj);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                g(arrayList2.get(i), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    @Override // defpackage.yd1
    public Object get() {
        return new ep1(8, (Executor) ((yd1) this.a).get(), (bl1) ((yd1) this.b).get(), (ac2) ((p11) this.c).get(), (bl1) ((yd1) this.d).get());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005e, code lost:
    
        if (r8 == r2) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006d, code lost:
    
        if (r8 == r2) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object h(defpackage.gs r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.d
            yx r0 = (defpackage.yx) r0
            boolean r1 = r8 instanceof defpackage.zw
            if (r1 == 0) goto L17
            r1 = r8
            zw r1 = (defpackage.zw) r1
            int r2 = r1.d
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.d = r2
            goto L1c
        L17:
            zw r1 = new zw
            r1.<init>(r7, r8)
        L1c:
            java.lang.Object r8 = r1.b
            ft r2 = defpackage.ft.a
            int r3 = r1.d
            r4 = 0
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L3d
            if (r3 == r6) goto L37
            if (r3 != r5) goto L31
            ud2 r7 = r1.a
            defpackage.zi0.B(r8)
            goto L61
        L31:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.uq1.q(r7)
            return r4
        L37:
            ud2 r7 = r1.a
            defpackage.zi0.B(r8)
            goto L70
        L3d:
            defpackage.zi0.B(r8)
            java.lang.Object r8 = r7.c
            java.util.List r8 = (java.util.List) r8
            if (r8 == 0) goto L64
            boolean r8 = r8.isEmpty()
            if (r8 == 0) goto L4d
            goto L64
        L4d:
            dr1 r8 = r0.h()
            cx r3 = new cx
            r3.<init>(r0, r7, r4)
            r1.a = r7
            r1.d = r5
            java.lang.Object r8 = r8.b(r3, r1)
            if (r8 != r2) goto L61
            goto L6f
        L61:
            dw r8 = (defpackage.dw) r8
            goto L72
        L64:
            r1.a = r7
            r1.d = r6
            r8 = 0
            java.lang.Object r8 = defpackage.yx.g(r0, r8, r1)
            if (r8 != r2) goto L70
        L6f:
            return r2
        L70:
            dw r8 = (defpackage.dw) r8
        L72:
            java.lang.Object r7 = r7.d
            yx r7 = (defpackage.yx) r7
            wa r7 = r7.v
            r7.o(r8)
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ud2.h(gs):java.lang.Object");
    }

    public String i(Map map) {
        hs1 hs1Var = (hs1) this.b;
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (str != null && value != null) {
                hs1Var.getClass();
                String str2 = TextUtils.isEmpty(str) ? null : (String) ((HashMap) hs1Var.b).get(str);
                if (!TextUtils.isEmpty(str2)) {
                    if (value instanceof String) {
                        String strG = hs1Var.g((String) value);
                        if (!TextUtils.isEmpty(strG)) {
                            ts.r(sb, str2, "=", strG, "&");
                        }
                    } else if (value instanceof List) {
                        Iterator it = ((List) value).iterator();
                        while (it.hasNext()) {
                            String strG2 = hs1Var.g((String) it.next());
                            if (!TextUtils.isEmpty(strG2)) {
                                ts.r(sb, str2, "=", strG2, "&");
                            }
                        }
                    }
                }
            }
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object j(gs gsVar) throws Throwable {
        qk1 qk1Var;
        h61 h61Var;
        f61 f61Var;
        Throwable th;
        f61 f61Var2;
        ud2 ud2Var;
        if (gsVar instanceof qk1) {
            qk1Var = (qk1) gsVar;
            int i = qk1Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                qk1Var.e = i - Integer.MIN_VALUE;
            } else {
                qk1Var = new qk1(this, gsVar);
            }
        } else {
            qk1Var = new qk1(this, gsVar);
        }
        Object obj = qk1Var.c;
        ft ftVar = ft.a;
        int i2 = qk1Var.e;
        try {
            if (i2 == 0) {
                zi0.B(obj);
                if (!(((cp) this.b).x() instanceof up0)) {
                    return Unit.a;
                }
                h61Var = (h61) this.a;
                qk1Var.a = this;
                qk1Var.b = h61Var;
                qk1Var.e = 1;
                if (h61Var.d(qk1Var) != ftVar) {
                }
                f61Var = h61Var;
                return ftVar;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    uq1.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                f61Var2 = qk1Var.b;
                ud2Var = qk1Var.a;
                try {
                    zi0.B(obj);
                    f61Var2 = f61Var2;
                    cp cpVar = (cp) ud2Var.b;
                    Unit unit = Unit.a;
                    cpVar.D(unit);
                    ((h61) f61Var2).g(null);
                    return unit;
                } catch (Throwable th2) {
                    th = th2;
                    ((h61) f61Var2).g(null);
                    throw th;
                }
            }
            f61 f61Var3 = qk1Var.b;
            ud2 ud2Var2 = qk1Var.a;
            zi0.B(obj);
            f61Var = f61Var3;
            this = ud2Var2;
            f61Var = h61Var;
            if (!(((cp) this.b).x() instanceof up0)) {
                Unit unit2 = Unit.a;
                ((h61) f61Var).g(null);
                return unit2;
            }
            qk1Var.a = this;
            qk1Var.b = f61Var;
            qk1Var.e = 2;
            if (this.h(qk1Var) != ftVar) {
                ud2Var = this;
                f61Var2 = f61Var;
                cp cpVar2 = (cp) ud2Var.b;
                Unit unit3 = Unit.a;
                cpVar2.D(unit3);
                ((h61) f61Var2).g(null);
                return unit3;
            }
            f61Var = h61Var;
            return ftVar;
        } catch (Throwable th3) {
            f61 f61Var4 = f61Var;
            th = th3;
            f61Var2 = f61Var4;
            ((h61) f61Var2).g(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00fe A[Catch: NumberFormatException | JSONException -> 0x010b, NumberFormatException | JSONException -> 0x010b, TRY_LEAVE, TryCatch #0 {NumberFormatException | JSONException -> 0x010b, blocks: (B:10:0x0031, B:24:0x0065, B:24:0x0065, B:26:0x0072, B:26:0x0072, B:28:0x0084, B:28:0x0084, B:29:0x008d, B:29:0x008d, B:51:0x00fe, B:51:0x00fe, B:33:0x009a, B:33:0x009a, B:35:0x00a7, B:35:0x00a7, B:37:0x00b9, B:37:0x00b9, B:38:0x00c2, B:38:0x00c2, B:42:0x00ce, B:42:0x00ce, B:46:0x00de, B:46:0x00de, B:50:0x00f2, B:50:0x00f2), top: B:63:0x0031, outer: #1 }] */
    public Bundle k() {
        h43 h43Var = (h43) this.d;
        if (((Bundle) this.c) == null) {
            String str = (String) this.a;
            SharedPreferences sharedPreferencesI = h43Var.I();
            y53 y53Var = (y53) h43Var.a;
            String string = sharedPreferencesI.getString(str, null);
            if (string != null) {
                try {
                    Bundle bundle = new Bundle();
                    JSONArray jSONArray = new JSONArray(string);
                    for (int i = 0; i < jSONArray.length(); i++) {
                        try {
                            JSONObject jSONObject = jSONArray.getJSONObject(i);
                            String string2 = jSONObject.getString("n");
                            String string3 = jSONObject.getString("t");
                            int iHashCode = string3.hashCode();
                            if (iHashCode != 100) {
                                if (iHashCode != 108) {
                                    if (iHashCode != 115) {
                                        if (iHashCode != 3352) {
                                            if (iHashCode == 3445 && string3.equals("la")) {
                                                hq2.a();
                                                if (y53Var.d.P(null, h13.P0)) {
                                                    JSONArray jSONArray2 = new JSONArray(jSONObject.getString("v"));
                                                    int length = jSONArray2.length();
                                                    long[] jArr = new long[length];
                                                    for (int i2 = 0; i2 < length; i2++) {
                                                        jArr[i2] = jSONArray2.optLong(i2);
                                                    }
                                                    bundle.putLongArray(string2, jArr);
                                                }
                                            } else {
                                                c33 c33Var = y53Var.f;
                                                y53.l(c33Var);
                                                c33Var.f.b(string3, "Unrecognized persisted bundle type. Type");
                                            }
                                        } else if (string3.equals("ia")) {
                                            hq2.a();
                                            if (y53Var.d.P(null, h13.P0)) {
                                                JSONArray jSONArray3 = new JSONArray(jSONObject.getString("v"));
                                                int length2 = jSONArray3.length();
                                                int[] iArr = new int[length2];
                                                for (int i3 = 0; i3 < length2; i3++) {
                                                    iArr[i3] = jSONArray3.optInt(i3);
                                                }
                                                bundle.putIntArray(string2, iArr);
                                            }
                                        } else {
                                            c33 c33Var2 = y53Var.f;
                                            y53.l(c33Var2);
                                            c33Var2.f.b(string3, "Unrecognized persisted bundle type. Type");
                                        }
                                    } else if (string3.equals("s")) {
                                        bundle.putString(string2, jSONObject.getString("v"));
                                    } else {
                                        c33 c33Var3 = y53Var.f;
                                        y53.l(c33Var3);
                                        c33Var3.f.b(string3, "Unrecognized persisted bundle type. Type");
                                    }
                                } else if (string3.equals("l")) {
                                    bundle.putLong(string2, Long.parseLong(jSONObject.getString("v")));
                                } else {
                                    c33 c33Var4 = y53Var.f;
                                    y53.l(c33Var4);
                                    c33Var4.f.b(string3, "Unrecognized persisted bundle type. Type");
                                }
                            } else if (string3.equals("d")) {
                                bundle.putDouble(string2, Double.parseDouble(jSONObject.getString("v")));
                            } else {
                                c33 c33Var5 = y53Var.f;
                                y53.l(c33Var5);
                                c33Var5.f.b(string3, "Unrecognized persisted bundle type. Type");
                            }
                        } catch (NumberFormatException | JSONException unused) {
                            c33 c33Var6 = y53Var.f;
                            y53.l(c33Var6);
                            c33Var6.f.a("Error reading value from SharedPreferences. Value dropped");
                        }
                    }
                    this.c = bundle;
                } catch (JSONException unused2) {
                    c33 c33Var7 = y53Var.f;
                    y53.l(c33Var7);
                    c33Var7.f.a("Error loading bundle from SharedPreferences. Values will be lost");
                }
            }
            if (((Bundle) this.c) == null) {
                this.c = (Bundle) this.b;
            }
        }
        Bundle bundle2 = (Bundle) this.c;
        gu2.o(bundle2);
        return new Bundle(bundle2);
    }

    public zzad l(JSONObject jSONObject) {
        JSONArray jSONArray;
        JSONArray jSONArray2;
        zzaf zzafVarA;
        try {
            String string = jSONObject.getString("cachedTokenState");
            String string2 = jSONObject.getString("applicationName");
            boolean z = jSONObject.getBoolean("anonymous");
            String string3 = jSONObject.getString("version");
            String str = string3 != null ? string3 : "2";
            JSONArray jSONArray3 = jSONObject.getJSONArray("userInfos");
            int length = jSONArray3.length();
            if (length == 0) {
                return null;
            }
            ArrayList arrayList = new ArrayList(length);
            for (int i = 0; i < length; i++) {
                arrayList.add(zzz.R(jSONArray3.getString(i)));
            }
            zzad zzadVar = new zzad(hc0.e(string2), arrayList);
            if (!TextUtils.isEmpty(string)) {
                zzadVar.a = zzahd.R(string);
            }
            if (!z) {
                zzadVar.v = Boolean.FALSE;
            }
            zzadVar.i = str;
            if (jSONObject.has("userMetadata") && (zzafVarA = zzaf.a(jSONObject.getJSONObject("userMetadata"))) != null) {
                zzadVar.w = zzafVarA;
            }
            if (jSONObject.has("userMultiFactorInfo") && (jSONArray2 = jSONObject.getJSONArray("userMultiFactorInfo")) != null) {
                ArrayList arrayList2 = new ArrayList();
                for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                    JSONObject jSONObject2 = new JSONObject(jSONArray2.getString(i2));
                    String strOptString = jSONObject2.optString("factorIdKey");
                    arrayList2.add("phone".equals(strOptString) ? PhoneMultiFactorInfo.T(jSONObject2) : Objects.equals(strOptString, "totp") ? TotpMultiFactorInfo.T(jSONObject2) : null);
                }
                zzadVar.c0(arrayList2);
            }
            if (jSONObject.has("passkeyInfo") && (jSONArray = jSONObject.getJSONArray("passkeyInfo")) != null) {
                ArrayList arrayList3 = new ArrayList();
                for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                    arrayList3.add(zzao.R(new JSONObject(jSONArray.getString(i3))));
                }
                zzadVar.Z = arrayList3;
            }
            return zzadVar;
        } catch (ArrayIndexOutOfBoundsException e2) {
            e = e2;
            Log.wtf(((h01) this.d).a, e);
            return null;
        } catch (IllegalArgumentException e3) {
            e = e3;
            Log.wtf(((h01) this.d).a, e);
            return null;
        } catch (JSONException e4) {
            e = e4;
            Log.wtf(((h01) this.d).a, e);
            return null;
        } catch (vr3 e5) {
            e = e5;
            Log.wtf(((h01) this.d).a, e);
            return null;
        }
    }

    public qt2 m(ep1 ep1Var, h73... h73VarArr) {
        qt2 qt2VarK = qt2.O;
        for (h73 h73Var : h73VarArr) {
            qt2VarK = z32.K(h73Var);
            gu2.l0((ep1) this.c);
            if ((qt2VarK instanceof rt2) || (qt2VarK instanceof et2)) {
                qt2VarK = ((f91) this.a).t(ep1Var, qt2VarK);
            }
        }
        return qt2VarK;
    }

    public fz2 n() throws GeneralSecurityException {
        Integer num = (Integer) this.a;
        if (num == null) {
            tv2.f("Key size is not set");
            return null;
        }
        if (((Integer) this.b) == null) {
            tv2.f("IV size is not set");
            return null;
        }
        if (((dz2) this.d) == null) {
            tv2.f("Variant is not set");
            return null;
        }
        if (((Integer) this.c) != null) {
            return new fz2(num.intValue(), ((Integer) this.b).intValue(), ((Integer) this.c).intValue(), (dz2) this.d);
        }
        tv2.f("Tag size is not set");
        return null;
    }

    public void o(int i) throws GeneralSecurityException {
        if (i != 12 && i != 16) {
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes", Integer.valueOf(i)));
        }
        this.b = Integer.valueOf(i);
    }

    public void p(String str, String str2) {
        String strEncodeToString;
        f91 f91VarP = f91.p((Context) this.a, (String) this.b);
        f91VarP.getClass();
        gu2.o(str2);
        ox1 ox1Var = (ox1) f91VarP.c;
        String str3 = null;
        if (ox1Var == null) {
            Log.e("FirebearStorageCryptoHelper", "KeysetManager failed to initialize - unable to encrypt data");
        } else {
            try {
                synchronized (ox1Var) {
                    try {
                        yd2 yd2VarT = ((ox1) f91VarP.c).t();
                        kv.o0();
                        strEncodeToString = Base64.encodeToString(((cv2) yd2VarT.p(ye1.f, cv2.class)).h(str2.getBytes(StandardCharsets.UTF_8), null), 2);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                str3 = strEncodeToString;
            } catch (GeneralSecurityException e2) {
                Log.e("FirebearStorageCryptoHelper", "Exception encountered while encrypting bytes:\n" + e2.getMessage());
            }
        }
        if (str3 != null) {
            ((SharedPreferences) this.c).edit().putString(str, "ENCRYPTED:".concat(str3)).apply();
        }
    }

    public void q(ad3 ad3Var) throws GeneralSecurityException {
        ad3Var.getClass();
        fg3 fg3Var = new fg3(wf3.class, ad3Var.a);
        HashMap map = (HashMap) this.a;
        if (!map.containsKey(fg3Var)) {
            map.put(fg3Var, ad3Var);
            return;
        }
        ad3 ad3Var2 = (ad3) map.get(fg3Var);
        if (!ad3Var2.equals(ad3Var) || ad3Var != ad3Var2) {
            throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(String.valueOf(fg3Var)));
        }
    }

    public void r(hd3 hd3Var) throws GeneralSecurityException {
        hg3 hg3Var = new hg3(hd3Var.a, wf3.class);
        HashMap map = (HashMap) this.d;
        if (!map.containsKey(hg3Var)) {
            map.put(hg3Var, hd3Var);
            return;
        }
        hd3 hd3Var2 = (hd3) map.get(hg3Var);
        if (!hd3Var2.equals(hd3Var) || hd3Var != hd3Var2) {
            throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(String.valueOf(hg3Var)));
        }
    }

    @Override // defpackage.mn2
    public void s(an2 an2Var) {
        ((ox1) this.d).B(new mo2((EmailAuthCredential) this.a, ((zzahd) an2Var).b, (String) this.b), (rd2) this.c);
    }

    public void t(cf3 cf3Var) throws GeneralSecurityException {
        cf3Var.getClass();
        fg3 fg3Var = new fg3(vf3.class, cf3Var.a);
        HashMap map = (HashMap) this.c;
        if (!map.containsKey(fg3Var)) {
            map.put(fg3Var, cf3Var);
            return;
        }
        cf3 cf3Var2 = (cf3) map.get(fg3Var);
        if (!cf3Var2.equals(cf3Var) || cf3Var != cf3Var2) {
            throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(String.valueOf(fg3Var)));
        }
    }

    public Object then(Task task) {
        qp0 qp0Var;
        qp0 qp0Var2;
        RecaptchaAction recaptchaAction = (RecaptchaAction) this.a;
        FirebaseAuth firebaseAuth = (FirebaseAuth) this.b;
        String str = (String) this.c;
        wa waVar = (wa) this.d;
        if (task.isSuccessful()) {
            return Tasks.forResult(task.getResult());
        }
        Exception exception = task.getException();
        gu2.o(exception);
        SparseArray sparseArray = jm2.a;
        if (!(exception instanceof lc0 ? ((lc0) exception).b.endsWith("MISSING_RECAPTCHA_TOKEN") : false)) {
            Log.e("RecaptchaCallWrapper", "Initial task failed for action " + String.valueOf(recaptchaAction) + "with exception - " + exception.getMessage());
            return Tasks.forException(exception);
        }
        if (Log.isLoggable("RecaptchaCallWrapper", 4)) {
            Log.i("RecaptchaCallWrapper", "Falling back to recaptcha enterprise flow for action ".concat(String.valueOf(recaptchaAction)));
        }
        synchronized (firebaseAuth) {
            qp0Var = firebaseAuth.j;
        }
        if (qp0Var == null) {
            hc0 hc0Var = firebaseAuth.a;
            op0 op0Var = new op0(12);
            qp0 qp0Var3 = new qp0();
            qp0Var3.a = new Object();
            qp0Var3.b = new HashMap();
            qp0Var3.d = hc0Var;
            qp0Var3.e = firebaseAuth;
            qp0Var3.f = op0Var;
            synchronized (firebaseAuth) {
                firebaseAuth.j = qp0Var3;
            }
        }
        synchronized (firebaseAuth) {
            qp0Var2 = firebaseAuth.j;
        }
        return qp0Var2.o(str, Boolean.FALSE, recaptchaAction).continueWithTask(waVar).continueWithTask(new ep1(11, str, qp0Var2, recaptchaAction, waVar));
    }

    public void u(gf3 gf3Var) throws GeneralSecurityException {
        hg3 hg3Var = new hg3(gf3Var.a, vf3.class);
        HashMap map = (HashMap) this.b;
        if (!map.containsKey(hg3Var)) {
            map.put(hg3Var, gf3Var);
            return;
        }
        gf3 gf3Var2 = (gf3) map.get(hg3Var);
        if (!gf3Var2.equals(gf3Var) || gf3Var != gf3Var2) {
            throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(String.valueOf(hg3Var)));
        }
    }

    public void v(pq3 pq3Var, Object obj, lr3 lr3Var) {
        or3 or3Var = (or3) ((HashMap) this.d).get(pq3Var);
        if (or3Var != null) {
            or3Var.a(pq3Var, obj, lr3Var);
        } else {
            ((or3) this.b).a(pq3Var, obj, lr3Var);
        }
    }

    public void w(int i) throws InvalidAlgorithmParameterException {
        if (i != 16 && i != 24 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
        }
        this.a = Integer.valueOf(i);
    }

    public void x(Bundle bundle) {
        h43 h43Var = (h43) this.d;
        Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        SharedPreferences sharedPreferencesI = h43Var.I();
        y53 y53Var = (y53) h43Var.a;
        SharedPreferences.Editor editorEdit = sharedPreferencesI.edit();
        int size = bundle2.size();
        String str = (String) this.a;
        if (size == 0) {
            editorEdit.remove(str);
        } else {
            JSONArray jSONArray = new JSONArray();
            for (String str2 : bundle2.keySet()) {
                Object obj = bundle2.get(str2);
                if (obj != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("n", str2);
                        hq2.a();
                        if (y53Var.d.P(null, h13.P0)) {
                            if (obj instanceof String) {
                                jSONObject.put("v", obj.toString());
                                jSONObject.put("t", "s");
                            } else if (obj instanceof Long) {
                                jSONObject.put("v", obj.toString());
                                jSONObject.put("t", "l");
                            } else if (obj instanceof int[]) {
                                jSONObject.put("v", Arrays.toString((int[]) obj));
                                jSONObject.put("t", "ia");
                            } else if (obj instanceof long[]) {
                                jSONObject.put("v", Arrays.toString((long[]) obj));
                                jSONObject.put("t", "la");
                            } else if (obj instanceof Double) {
                                jSONObject.put("v", obj.toString());
                                jSONObject.put("t", "d");
                            } else {
                                c33 c33Var = y53Var.f;
                                y53.l(c33Var);
                                c33Var.f.b(obj.getClass(), "Cannot serialize bundle value to SharedPreferences. Type");
                            }
                            jSONArray.put(jSONObject);
                        } else {
                            jSONObject.put("v", obj.toString());
                            if (obj instanceof String) {
                                jSONObject.put("t", "s");
                            } else if (obj instanceof Long) {
                                jSONObject.put("t", "l");
                            } else if (obj instanceof Double) {
                                jSONObject.put("t", "d");
                            } else {
                                c33 c33Var2 = y53Var.f;
                                y53.l(c33Var2);
                                c33Var2.f.b(obj.getClass(), "Cannot serialize bundle value to SharedPreferences. Type");
                            }
                            jSONArray.put(jSONObject);
                        }
                    } catch (JSONException e2) {
                        c33 c33Var3 = y53Var.f;
                        y53.l(c33Var3);
                        c33Var3.f.b(e2, "Cannot serialize bundle value to SharedPreferences");
                    }
                }
            }
            editorEdit.putString(str, jSONArray.toString());
        }
        editorEdit.apply();
        this.c = bundle2;
    }

    public void y(pq3 pq3Var, Iterator it, lr3 lr3Var) {
        pr3 pr3Var = (pr3) ((HashMap) this.a).get(pq3Var);
        if (pr3Var != null) {
            pr3Var.a(pq3Var, it, lr3Var);
            return;
        }
        pr3 pr3Var2 = (pr3) this.c;
        if (pr3Var2 != null && !((HashMap) this.d).containsKey(pq3Var)) {
            pr3Var2.a(pq3Var, it, lr3Var);
        } else {
            while (it.hasNext()) {
                v(pq3Var, it.next(), lr3Var);
            }
        }
    }

    public String z(String str) {
        String str2;
        String string = ((SharedPreferences) this.c).getString(str, null);
        if (string == null) {
            return null;
        }
        if (!string.startsWith("ENCRYPTED:")) {
            return string;
        }
        f91 f91VarP = f91.p((Context) this.a, (String) this.b);
        String strSubstring = string.substring(10);
        f91VarP.getClass();
        ox1 ox1Var = (ox1) f91VarP.c;
        if (ox1Var == null) {
            Log.e("FirebearStorageCryptoHelper", "KeysetManager failed to initialize - unable to decrypt data");
            return null;
        }
        try {
            synchronized (ox1Var) {
                yd2 yd2VarT = ((ox1) f91VarP.c).t();
                kv.o0();
                str2 = new String(((cv2) yd2VarT.p(ye1.f, cv2.class)).g(Base64.decode(strSubstring, 2), null), StandardCharsets.UTF_8);
            }
            return str2;
        } catch (IllegalArgumentException | GeneralSecurityException e2) {
            Log.e("FirebearStorageCryptoHelper", "Exception encountered while decrypting bytes:\n" + e2.getMessage());
            return null;
        }
    }

    @Override // defpackage.mn2
    public void zza(String str) {
        ((rd2) this.c).a(kv.m0(str));
    }

    public ud2(h43 h43Var, String str) {
        this.d = h43Var;
        gu2.l(str);
        this.a = str;
        this.b = new Bundle();
    }

    public /* synthetic */ ud2(Object obj, Object obj2, Object obj3, Object obj4) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
    }

    public ud2(cg3 cg3Var) {
        this.d = new HashMap(cg3Var.a);
        this.a = new HashMap(cg3Var.b);
        this.b = new HashMap(cg3Var.c);
        this.c = new HashMap(cg3Var.d);
    }

    public ud2(Typeface typeface, t41 t41Var) {
        int i;
        int i2;
        int i3;
        int i4;
        this.d = typeface;
        this.a = t41Var;
        this.c = new v41(1024);
        int iA = t41Var.a(6);
        if (iA != 0) {
            int i5 = iA + t41Var.a;
            i = ((ByteBuffer) t41Var.d).getInt(((ByteBuffer) t41Var.d).getInt(i5) + i5);
        } else {
            i = 0;
        }
        this.b = new char[i * 2];
        int iA2 = t41Var.a(6);
        if (iA2 != 0) {
            int i6 = iA2 + t41Var.a;
            i2 = ((ByteBuffer) t41Var.d).getInt(((ByteBuffer) t41Var.d).getInt(i6) + i6);
        } else {
            i2 = 0;
        }
        for (int i7 = 0; i7 < i2; i7++) {
            b22 b22Var = new b22(this, i7);
            s41 s41VarB = b22Var.b();
            int iA3 = s41VarB.a(4);
            Character.toChars(iA3 != 0 ? ((ByteBuffer) s41VarB.d).getInt(iA3 + s41VarB.a) : 0, (char[]) this.b, i7 * 2);
            s41 s41VarB2 = b22Var.b();
            int iA4 = s41VarB2.a(16);
            if (iA4 != 0) {
                int i8 = iA4 + s41VarB2.a;
                i3 = ((ByteBuffer) s41VarB2.d).getInt(((ByteBuffer) s41VarB2.d).getInt(i8) + i8);
            } else {
                i3 = 0;
            }
            r93.l("invalid metadata codepoint length", i3 > 0);
            v41 v41Var = (v41) this.c;
            s41 s41VarB3 = b22Var.b();
            int iA5 = s41VarB3.a(16);
            if (iA5 != 0) {
                int i9 = iA5 + s41VarB3.a;
                i4 = ((ByteBuffer) s41VarB3.d).getInt(((ByteBuffer) s41VarB3.d).getInt(i9) + i9);
            } else {
                i4 = 0;
            }
            v41Var.a(b22Var, 0, i4 - 1);
        }
    }
}
