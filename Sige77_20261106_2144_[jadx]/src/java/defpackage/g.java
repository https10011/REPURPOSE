package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import android.os.Build;
import android.preference.PreferenceManager;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.text.TextUtils;
import android.util.Log;
import com.appsflyer.internal.AFj1rSDK;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;
import com.hjq.toast.BuildConfig;
import com.transsion.athena.data.TrackData;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final /* synthetic */ class g implements Runnable {
    public final /* synthetic */ int a;

    /* JADX WARN: Code duplicated, block: B:205:0x0304  */
    /* JADX WARN: Code duplicated, block: B:206:0x0307  */
    /* JADX WARN: Code duplicated, block: B:215:0x0339 A[Catch: Exception -> 0x0359, TryCatch #11 {Exception -> 0x0359, blocks: (B:208:0x0319, B:210:0x0329, B:212:0x032f, B:213:0x0333, B:215:0x0339, B:217:0x0345, B:219:0x034b, B:222:0x035b, B:224:0x0361, B:226:0x0367), top: B:325:0x0319 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x010b A[Catch: all -> 0x00d5, Exception -> 0x0133, TryCatch #25 {Exception -> 0x0133, all -> 0x00d5, blocks: (B:58:0x00b8, B:60:0x00c8, B:63:0x00cf, B:67:0x00dc, B:69:0x00e8, B:71:0x00ee, B:87:0x0129, B:82:0x0108, B:83:0x010b, B:86:0x0112, B:66:0x00d7), top: B:350:0x00b8 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x0111  */
    /* JADX WARN: Code duplicated, block: B:86:0x0112 A[Catch: all -> 0x00d5, Exception -> 0x0133, TryCatch #25 {Exception -> 0x0133, all -> 0x00d5, blocks: (B:58:0x00b8, B:60:0x00c8, B:63:0x00cf, B:67:0x00dc, B:69:0x00e8, B:71:0x00ee, B:87:0x0129, B:82:0x0108, B:83:0x010b, B:86:0x0112, B:66:0x00d7), top: B:350:0x00b8 }] */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        FileInputStream fileInputStream;
        String string;
        String strA;
        List<SubscriptionInfo> activeSubscriptionInfoList;
        np0 np0Var;
        Class clsB;
        String str;
        wf3 wf3Var = null;
        setQ = null;
        arrayListA = null;
        arrayListA = null;
        ArrayList arrayListA = null;
        ArrayList arrayListA2 = null;
        FileInputStream fileInputStream2 = null;
        FileInputStream fileInputStream3 = null;
        Set setQ = null;
        wf3Var = null;
        wf3Var = null;
        switch (this.a) {
            case 0:
                if (mt.a.contains(h.class)) {
                    return;
                }
                try {
                    Object systemService = i90.a().getSystemService("activity");
                    systemService.getClass();
                    h.a((ActivityManager) systemService);
                    return;
                } catch (Exception unused) {
                    return;
                } catch (Throwable th) {
                    mt.a(h.class, th);
                    return;
                }
            case 1:
                pp0.d();
                return;
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                if (e5.g == null) {
                    SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(i90.a());
                    long j = defaultSharedPreferences.getLong("com.facebook.appevents.SessionInfo.sessionStartTime", 0L);
                    long j2 = defaultSharedPreferences.getLong("com.facebook.appevents.SessionInfo.sessionEndTime", 0L);
                    String string2 = defaultSharedPreferences.getString("com.facebook.appevents.SessionInfo.sessionId", null);
                    if (j != 0 && j2 != 0 && string2 != null) {
                        wf3 wf3Var2 = new wf3(Long.valueOf(j), Long.valueOf(j2));
                        wf3Var2.b = defaultSharedPreferences.getInt("com.facebook.appevents.SessionInfo.interruptionCount", 0);
                        SharedPreferences defaultSharedPreferences2 = PreferenceManager.getDefaultSharedPreferences(i90.a());
                        wf3Var2.i = defaultSharedPreferences2.contains("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage") ? new es1(0, defaultSharedPreferences2.getString("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage", null), defaultSharedPreferences2.getBoolean("com.facebook.appevents.SourceApplicationInfo.openedByApplink", false)) : null;
                        wf3Var2.f = Long.valueOf(System.currentTimeMillis());
                        UUID uuidFromString = UUID.fromString(string2);
                        uuidFromString.getClass();
                        wf3Var2.e = uuidFromString;
                        wf3Var = wf3Var2;
                    }
                    e5.g = wf3Var;
                    return;
                }
                return;
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                int i = AlarmManagerSchedulerBroadcastReceiver.a;
                return;
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                k6.a();
                return;
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                if (mt.a.contains(da.class)) {
                    return;
                }
                try {
                    da.c = null;
                    String str2 = pa.c;
                    if (qh1.p() != 2) {
                        da.d(2);
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    mt.a(da.class, th2);
                    return;
                }
            case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                if (mt.a.contains(da.class)) {
                    return;
                }
                try {
                    ea.v(da.a);
                    da.a = new ri2(4);
                    return;
                } catch (Throwable th3) {
                    mt.a(da.class, th3);
                    return;
                }
            case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                HashSet hashSet = new HashSet();
                ri2 ri2Var = da.a;
                if (!mt.a.contains(da.class)) {
                    try {
                        setQ = da.a.q();
                    } catch (Throwable th4) {
                        mt.a(da.class, th4);
                    }
                    break;
                }
                Iterator it = setQ.iterator();
                while (it.hasNext()) {
                    hashSet.add(((w1) it.next()).a);
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    ma0.k((String) it2.next(), true);
                }
                return;
            case oc1.BYTES_FIELD_NUMBER /* 8 */:
                if (hc.g > 0) {
                    hc hcVar = hc.e;
                    hcVar.getClass();
                    if (!hc.e()) {
                        cc2.a("Athena SDK isAthenaEnable = false");
                        return;
                    }
                    for (Integer num : qd2.b) {
                        if (num.intValue() != 9999) {
                            hcVar.i("app_launch", null, num.intValue());
                        }
                    }
                    return;
                }
                return;
            case 9:
                hc.e.getClass();
                if (!hc.e()) {
                    cc2.a("Athena SDK isAthenaEnable = false");
                    return;
                }
                TrackData trackData = new TrackData();
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 29) {
                    String str3 = ze2.a;
                    if (hc.h.checkCallingOrSelfPermission("android.permission.READ_PRIVILEGED_PHONE_STATE") == 0) {
                        trackData.e("iid", nj2.b(hc.h, 0));
                        trackData.e("iid2", nj2.b(hc.h, 1));
                    }
                } else {
                    String str4 = ze2.a;
                }
                if (hc.h()) {
                    trackData.e("isd", nj2.m(hc.h, 1));
                    trackData.e("isd2", nj2.m(hc.h, 2));
                }
                if (i2 >= 29 && hc.h.checkCallingOrSelfPermission("android.permission.READ_PRIVILEGED_PHONE_STATE") == 0) {
                    trackData.e("aid", nj2.l(hc.h));
                }
                StringBuilder sb = new StringBuilder();
                try {
                    try {
                        try {
                            fileInputStream = new FileInputStream(new File("proc/rid"));
                            try {
                                byte[] bArr = new byte[1];
                                while (fileInputStream.read(bArr) != -1) {
                                    sb.append(rq0.o(bArr));
                                }
                            } catch (Exception unused2) {
                                fileInputStream2 = fileInputStream;
                                if (fileInputStream2 != null) {
                                    fileInputStream = fileInputStream2;
                                }
                                string = sb.toString();
                                if (TextUtils.isEmpty(string)) {
                                    strA = BuildConfig.FLAVOR;
                                } else {
                                    strA = ia.a(string);
                                }
                                trackData.e("chip", strA);
                                trackData.e("sn", nj2.o());
                                activeSubscriptionInfoList = ((SubscriptionManager) hc.h.getSystemService("telephony_subscription_service")).getActiveSubscriptionInfoList();
                                if (activeSubscriptionInfoList != null) {
                                    while (r0.hasNext()) {
                                        if (subscriptionInfo.getSimSlotIndex() != 0) {
                                        }
                                        if (subscriptionInfo.getSimSlotIndex() != 1) {
                                        }
                                        break;
                                    }
                                }
                                hc.g(9999L).i("device", trackData, 9999L);
                                return;
                            } catch (Throwable th5) {
                                th = th5;
                                fileInputStream3 = fileInputStream;
                                if (fileInputStream3 != null) {
                                    try {
                                        fileInputStream3.close();
                                    } catch (Exception e) {
                                        cc2.c(e.getMessage());
                                    }
                                    break;
                                }
                                throw th;
                            }
                        } catch (Exception unused3) {
                        } catch (Throwable th6) {
                            th = th6;
                        }
                        activeSubscriptionInfoList = ((SubscriptionManager) hc.h.getSystemService("telephony_subscription_service")).getActiveSubscriptionInfoList();
                        if (activeSubscriptionInfoList != null && activeSubscriptionInfoList.size() > 0) {
                            for (SubscriptionInfo subscriptionInfo : activeSubscriptionInfoList) {
                                if (subscriptionInfo.getSimSlotIndex() != 0 && hc.h()) {
                                    trackData.e("isd", nj2.m(hc.h, subscriptionInfo.getSubscriptionId()));
                                } else if (subscriptionInfo.getSimSlotIndex() != 1 && hc.h()) {
                                    trackData.e("isd2", nj2.m(hc.h, subscriptionInfo.getSubscriptionId()));
                                }
                            }
                        }
                    } catch (Exception e2) {
                        cc2.c(e2.getMessage());
                    }
                    fileInputStream.close();
                    break;
                } catch (Exception e3) {
                    cc2.c(e3.getMessage());
                }
                string = sb.toString();
                if (TextUtils.isEmpty(string)) {
                    strA = BuildConfig.FLAVOR;
                } else {
                    strA = ia.a(string);
                }
                trackData.e("chip", strA);
                trackData.e("sn", nj2.o());
                hc.g(9999L).i("device", trackData, 9999L);
                return;
            case 10:
                Context context = hc.h;
                try {
                    if (bj0.i == null) {
                        bj0.i = new nb2();
                    }
                    NetworkRequest networkRequestBuild = new NetworkRequest.Builder().build();
                    ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                    if (connectivityManager != null) {
                        connectivityManager.registerNetworkCallback(networkRequestBuild, bj0.i);
                        return;
                    }
                    return;
                } catch (Exception e4) {
                    b81 b81Var = cc2.a;
                    cc2.c(Log.getStackTraceString(e4));
                    return;
                }
            case 11:
                int i3 = yg.MODE_SONIC_WITH_OFFLINE_CACHE;
                throw null;
            case 12:
                int i4 = yg.MODE_SONIC_WITH_OFFLINE_CACHE;
                throw null;
            case 13:
                int i5 = yg.MODE_SONIC_WITH_OFFLINE_CACHE;
                throw null;
            case 14:
                Context contextA = i90.a();
                ArrayList arrayListF = np0.f(contextA, cp0.g);
                if (arrayListF.isEmpty()) {
                    Object obj = cp0.g;
                    if (!mt.a.contains(np0.class)) {
                        try {
                            contextA.getClass();
                            arrayListA2 = (obj != null && (clsB = (np0Var = np0.a).b(contextA, "com.android.vending.billing.IInAppBillingService")) != null && np0Var.c(clsB, "getPurchaseHistory") != null) ? np0Var.a(np0Var.d(contextA, obj)) : new ArrayList();
                        } catch (Throwable th7) {
                            mt.a(np0.class, th7);
                        }
                    }
                    arrayListF = arrayListA2;
                    break;
                }
                AtomicBoolean atomicBoolean = cp0.a;
                cp0.a(contextA, arrayListF, false);
                return;
            case 15:
                Context contextA2 = i90.a();
                ArrayList arrayListF2 = np0.f(contextA2, cp0.g);
                AtomicBoolean atomicBoolean2 = cp0.a;
                cp0.a(contextA2, arrayListF2, false);
                Object obj2 = cp0.g;
                if (!mt.a.contains(np0.class)) {
                    try {
                        contextA2.getClass();
                        np0 np0Var2 = np0.a;
                        arrayListA = np0Var2.a(np0Var2.e(contextA2, obj2, "subs"));
                    } catch (Throwable th8) {
                        mt.a(np0.class, th8);
                    }
                    break;
                }
                AtomicBoolean atomicBoolean3 = cp0.a;
                cp0.a(contextA2, arrayListA, true);
                return;
            case 16:
                Set set = mt.a;
                if (set.contains(r41.class)) {
                    return;
                }
                try {
                    Context contextA3 = i90.a();
                    contextA3.getClass();
                    nc ncVarT = kv.t(contextA3);
                    if (ncVarT == null || !ncVarT.e) {
                        r41 r41Var = r41.b;
                        if (!set.contains(r41Var)) {
                            try {
                                ja0 ja0VarK = ma0.k(i90.b(), false);
                                if (ja0VarK != null && (str = ja0VarK.j) != null) {
                                    try {
                                        w41.a().clear();
                                        y21.g(new JSONObject(str));
                                        break;
                                    } catch (JSONException unused4) {
                                    }
                                }
                            } catch (Throwable th9) {
                                mt.a(r41Var, th9);
                            }
                        }
                        r41.c = true;
                        return;
                    }
                    return;
                } catch (Throwable th10) {
                    mt.a(r41.class, th10);
                    return;
                }
            case 17:
                j51 j51Var = j51.a;
                Set set2 = mt.a;
                if (set2.contains(j51.class)) {
                    return;
                }
                try {
                    SharedPreferences sharedPreferences = i90.a().getSharedPreferences("com.facebook.internal.MODEL_STORE", 0);
                    String string3 = sharedPreferences.getString("models", null);
                    JSONObject jSONObject = (string3 == null || string3.length() == 0) ? new JSONObject() : new JSONObject(string3);
                    long j3 = sharedPreferences.getLong("model_request_timestamp", 0L);
                    if (!fa0.b(da0.ModelRequest) || jSONObject.length() == 0 || set2.contains(j51Var) || j3 == 0) {
                        jSONObject = j51Var.c();
                        if (jSONObject == null) {
                            return;
                        } else {
                            sharedPreferences.edit().putString("models", jSONObject.toString()).putLong("model_request_timestamp", System.currentTimeMillis()).apply();
                        }
                    } else {
                        try {
                            if (System.currentTimeMillis() - j3 >= 259200000) {
                                jSONObject = j51Var.c();
                                if (jSONObject == null) {
                                    return;
                                } else {
                                    sharedPreferences.edit().putString("models", jSONObject.toString()).putLong("model_request_timestamp", System.currentTimeMillis()).apply();
                                }
                            }
                        } catch (Throwable th11) {
                            mt.a(j51Var, th11);
                        }
                    }
                    j51Var.a(jSONObject);
                    j51Var.b();
                    return;
                } catch (Exception unused5) {
                    return;
                } catch (Throwable th12) {
                    mt.a(j51.class, th12);
                    return;
                }
            case 18:
                if (mt.a.contains(j51.class)) {
                    return;
                }
                try {
                    wu1.a();
                    return;
                } catch (Throwable th13) {
                    mt.a(j51.class, th13);
                    return;
                }
            case 19:
                Set set3 = mt.a;
                if (set3.contains(j51.class)) {
                    return;
                }
                try {
                    if (set3.contains(br0.class)) {
                        return;
                    }
                    try {
                        br0.c = true;
                        br0.d = ha0.b("FBSDKFeatureIntegritySample", i90.b(), false);
                        return;
                    } catch (Throwable th14) {
                        mt.a(br0.class, th14);
                        return;
                    }
                } catch (Throwable th15) {
                    mt.a(j51.class, th15);
                    return;
                }
            case 20:
                AtomicBoolean atomicBoolean4 = l61.c;
                try {
                    if (mt.a.contains(l61.class)) {
                        return;
                    }
                    try {
                        ArrayList arrayList = l61.b;
                        int size = arrayList.size();
                        int i6 = 0;
                        while (i6 < size) {
                            Object obj3 = arrayList.get(i6);
                            i6++;
                            ((k61) obj3).a(true);
                        }
                        atomicBoolean4.set(false);
                        return;
                    } catch (Throwable th16) {
                        atomicBoolean4.set(false);
                        throw th16;
                    }
                } catch (Throwable th17) {
                    mt.a(l61.class, th17);
                    return;
                }
            case 21:
                if (mt.a.contains(wu1.class)) {
                    return;
                }
                try {
                    AtomicBoolean atomicBoolean5 = wu1.b;
                    if (atomicBoolean5.get()) {
                        return;
                    }
                    atomicBoolean5.set(true);
                    wu1.a.b();
                    return;
                } catch (Throwable th18) {
                    mt.a(wu1.class, th18);
                    return;
                }
            default:
                AFj1rSDK.a();
                return;
        }
    }

    public /* synthetic */ g(int i) {
        this.a = i;
    }
}
