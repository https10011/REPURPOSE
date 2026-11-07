package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Pair;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public abstract class ra {
    public static final HashMap a = w11.c(new Pair(qa.a, "MOBILE_APP_INSTALL"), new Pair(qa.b, "CUSTOM_APP_EVENTS"));

    public static final JSONObject a(qa qaVar, nc ncVar, String str, boolean z, Context context) throws JSONException {
        String strB;
        context.getClass();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("event", a.get(qaVar));
        if (!k6.c) {
            Log.w("k6", "initStore should have been called before calling setUserID");
            k6.a();
        }
        ReentrantReadWriteLock reentrantReadWriteLock = k6.a;
        reentrantReadWriteLock.readLock().lock();
        try {
            String str2 = k6.b;
            reentrantReadWriteLock.readLock().unlock();
            if (str2 != null) {
                jSONObject.put("app_user_id", str2);
            }
            da0 da0Var = da0.ServiceUpdateCompliance;
            if (!fa0.b(da0Var)) {
                jSONObject.put("anon_id", str);
            }
            jSONObject.put("application_tracking_enabled", !z);
            i90 i90Var = i90.a;
            jSONObject.put("advertiser_id_collection_enabled", x32.b());
            String string = null;
            if (ncVar != null) {
                if (fa0.b(da0Var) && (Build.VERSION.SDK_INT < 31 || !h42.w(context) || !ncVar.e)) {
                    jSONObject.put("anon_id", str);
                }
                if (ncVar.c != null && (!fa0.b(da0Var) || Build.VERSION.SDK_INT < 31 || !h42.w(context) || !ncVar.e)) {
                    jSONObject.put("attribution", ncVar.c);
                }
                if (ncVar.a() != null) {
                    jSONObject.put("advertiser_id", ncVar.a());
                    jSONObject.put("advertiser_tracking_enabled", !ncVar.e);
                }
                if (!ncVar.e) {
                    t32 t32Var = t32.a;
                    if (mt.a.contains(t32.class)) {
                        strB = null;
                    } else {
                        try {
                            if (!t32.c.get()) {
                                t32Var.b();
                            }
                            HashMap map = new HashMap();
                            map.putAll(t32.d);
                            map.putAll(t32Var.a());
                            strB = h42.B(map);
                        } catch (Throwable th) {
                            mt.a(t32.class, th);
                            strB = null;
                        }
                    }
                    if (strB.length() != 0) {
                        jSONObject.put("ud", strB);
                    }
                }
                String str3 = ncVar.d;
                if (str3 != null) {
                    jSONObject.put("installer_package", str3);
                }
            }
            wa waVarB = wa.c.b();
            if (waVarB != null && !mt.a.contains(waVarB)) {
                try {
                    string = waVarB.d().getString("campaign_ids", null);
                } catch (Throwable th2) {
                    mt.a(waVarB, th2);
                }
            }
            if (string != null) {
                jSONObject.put("campaign_ids", string);
            }
            try {
                h42.G(jSONObject, context);
            } catch (Exception e) {
                gp1 gp1Var = i01.c;
                e.toString();
                synchronized (i90.b) {
                }
            }
            JSONObject jSONObjectN = h42.n();
            if (jSONObjectN != null) {
                Iterator<String> itKeys = jSONObjectN.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    jSONObject.put(next, jSONObjectN.get(next));
                }
            }
            jSONObject.put("application_package_name", context.getPackageName());
            return jSONObject;
        } catch (Throwable th3) {
            k6.a.readLock().unlock();
            throw th3;
        }
    }
}
