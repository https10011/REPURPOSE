package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.StringCompanionObject;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class ha0 {
    public static final ha0 a = new ha0();
    public static final AtomicBoolean b = new AtomicBoolean(false);
    public static final ConcurrentLinkedQueue c = new ConcurrentLinkedQueue();
    public static final ConcurrentHashMap d = new ConcurrentHashMap();
    public static volatile Long e;
    public static volatile yq f;

    public static JSONObject a() {
        Bundle bundle = new Bundle();
        bundle.putString("platform", "android");
        i90 i90Var = i90.a;
        bundle.putString("sdk_version", "18.2.3");
        bundle.putString("fields", "gatekeepers");
        String str = mk0.j;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        mk0 mk0VarO = vl0.o(null, String.format("app/%s", Arrays.copyOf(new Object[]{"mobile_sdk_gk"}, 1)), null);
        mk0VarO.d = bundle;
        JSONObject jSONObject = mk0VarO.c().d;
        return jSONObject == null ? new JSONObject() : jSONObject;
    }

    public static final boolean b(String str, String str2, boolean z) {
        HashMap map;
        ConcurrentHashMap concurrentHashMap;
        Boolean bool;
        ha0 ha0Var = a;
        ArrayList arrayList = null;
        d(null);
        if (ha0Var.c(str2) == null) {
            map = new HashMap();
        } else {
            yq yqVar = f;
            if (yqVar != null && (concurrentHashMap = (ConcurrentHashMap) yqVar.a.get(str2)) != null) {
                arrayList = new ArrayList(concurrentHashMap.size());
                Iterator it = concurrentHashMap.entrySet().iterator();
                while (it.hasNext()) {
                    arrayList.add((mh0) ((Map.Entry) it.next()).getValue());
                }
            }
            int i = 0;
            if (arrayList != null) {
                map = new HashMap();
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    mh0 mh0Var = (mh0) obj;
                    map.put(mh0Var.a, Boolean.valueOf(mh0Var.b));
                }
            } else {
                HashMap map2 = new HashMap();
                JSONObject jSONObjectC = ha0Var.c(str2);
                if (jSONObjectC == null) {
                    jSONObjectC = new JSONObject();
                }
                Iterator<String> itKeys = jSONObjectC.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    next.getClass();
                    map2.put(next, Boolean.valueOf(jSONObjectC.optBoolean(next)));
                }
                yq yqVar2 = f;
                if (yqVar2 == null) {
                    yqVar2 = new yq(1);
                }
                ArrayList arrayList2 = new ArrayList(map2.size());
                for (Map.Entry entry : map2.entrySet()) {
                    arrayList2.add(new mh0((String) entry.getKey(), ((Boolean) entry.getValue()).booleanValue()));
                }
                ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
                int size2 = arrayList2.size();
                while (i < size2) {
                    Object obj2 = arrayList2.get(i);
                    i++;
                    mh0 mh0Var2 = (mh0) obj2;
                    concurrentHashMap2.put(mh0Var2.a, mh0Var2);
                }
                yqVar2.a.put(str2, concurrentHashMap2);
                f = yqVar2;
                map = map2;
            }
        }
        return (map.containsKey(str) && (bool = (Boolean) map.get(str)) != null) ? bool.booleanValue() : z;
    }

    public static final synchronized void d(ea0 ea0Var) {
        if (ea0Var != null) {
            try {
                c.add(ea0Var);
            } catch (Throwable th) {
                throw th;
            }
        }
        String strB = i90.b();
        ha0 ha0Var = a;
        Long l = e;
        if (l != null && System.currentTimeMillis() - l.longValue() < 3600000 && ha0Var.c(strB) != null) {
            f();
            return;
        }
        Context contextA = i90.a();
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("com.facebook.internal.APP_GATEKEEPERS.%s", Arrays.copyOf(new Object[]{strB}, 1));
        if (contextA == null) {
            return;
        }
        JSONObject jSONObject = null;
        String string = contextA.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).getString(str, null);
        if (!h42.x(string)) {
            try {
                jSONObject = new JSONObject(string);
            } catch (JSONException unused) {
                i90 i90Var = i90.a;
            }
            if (jSONObject != null) {
                e(strB, jSONObject);
            }
        }
        Executor executorC = i90.c();
        if (b.compareAndSet(false, true)) {
            executorC.execute(new ga0(strB, contextA, str));
        }
    }

    public static final synchronized JSONObject e(String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        try {
            JSONObject jSONObjectC = a.c(str);
            jSONObject2 = jSONObjectC != null ? new JSONObject(jSONObjectC.toString()) : new JSONObject();
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("data");
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray != null ? jSONArrayOptJSONArray.optJSONObject(0) : null;
            if (jSONObjectOptJSONObject == null) {
                jSONObjectOptJSONObject = new JSONObject();
            }
            JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray("gatekeepers");
            if (jSONArrayOptJSONArray2 == null) {
                jSONArrayOptJSONArray2 = new JSONArray();
            }
            int length = jSONArrayOptJSONArray2.length();
            for (int i = 0; i < length; i++) {
                try {
                    JSONObject jSONObject3 = jSONArrayOptJSONArray2.getJSONObject(i);
                    jSONObject2.put(jSONObject3.getString("key"), jSONObject3.getBoolean("value"));
                } catch (JSONException unused) {
                    i90 i90Var = i90.a;
                }
            }
            synchronized (a) {
                d.put(str, jSONObject2);
            }
        } catch (Throwable th) {
            throw th;
        }
        return jSONObject2;
    }

    public static void f() {
        Handler handler = new Handler(Looper.getMainLooper());
        while (true) {
            ConcurrentLinkedQueue concurrentLinkedQueue = c;
            if (concurrentLinkedQueue.isEmpty()) {
                return;
            }
            ea0 ea0Var = (ea0) concurrentLinkedQueue.poll();
            if (ea0Var != null) {
                handler.post(new y1(ea0Var, 17));
            }
        }
    }

    public final synchronized JSONObject c(String str) {
        return (JSONObject) d.get(str);
    }
}
