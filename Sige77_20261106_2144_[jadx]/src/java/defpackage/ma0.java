package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.hjq.toast.BuildConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class ma0 {
    public static final ma0 a = new ma0();
    public static final List b = jo.d("supports_implicit_sdk_logging", "gdpv4_nux_content", "gdpv4_nux_enabled", "android_dialog_configs", "android_sdk_error_categories", "app_events_session_timeout", "app_events_feature_bitmask", "auto_event_mapping_android", "seamless_login", "smart_login_bookmark_icon_url", "smart_login_menu_icon_url", "restrictive_data_filter_params", "aam_rules", "suggested_events_setting", "protected_mode_rules", "auto_log_app_events_default", "auto_log_app_events_enabled", "app_events_config.os_version(" + Build.VERSION.RELEASE + ')');
    public static final ConcurrentHashMap c = new ConcurrentHashMap();
    public static final AtomicReference d = new AtomicReference(la0.a);
    public static final ConcurrentLinkedQueue e = new ConcurrentLinkedQueue();
    public static volatile boolean f;

    public static JSONObject a() {
        Bundle bundle = new Bundle();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(b);
        bundle.putString("fields", TextUtils.join(",", arrayList));
        String str = mk0.j;
        mk0 mk0VarO = vl0.o(null, "app", null);
        mk0VarO.i = true;
        mk0VarO.d = bundle;
        JSONObject jSONObject = mk0VarO.c().d;
        return jSONObject == null ? new JSONObject() : jSONObject;
    }

    public static final ja0 b(String str) {
        return (ja0) c.get(str);
    }

    public static final HashMap c() {
        JSONObject jSONObject;
        Context contextA = i90.a();
        String strB = i90.b();
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String string = contextA.getSharedPreferences("com.facebook.internal.preferences.APP_SETTINGS", 0).getString(String.format("com.facebook.internal.APP_SETTINGS.%s", Arrays.copyOf(new Object[]{strB}, 1)), null);
        if (!h42.x(string)) {
            if (string != null) {
                try {
                    jSONObject = new JSONObject(string);
                } catch (JSONException unused) {
                    i90 i90Var = i90.a;
                    jSONObject = null;
                }
                if (jSONObject != null) {
                    return h(jSONObject);
                }
            } else {
                uq1.q("Required value was null.");
            }
        }
        return null;
    }

    public static final void d() {
        la0 la0Var;
        la0 la0Var2;
        Context contextA = i90.a();
        String strB = i90.b();
        boolean zX = h42.x(strB);
        la0 la0Var3 = la0.d;
        ma0 ma0Var = a;
        AtomicReference atomicReference = d;
        if (zX) {
            atomicReference.set(la0Var3);
            ma0Var.j();
            return;
        }
        if (c.containsKey(strB)) {
            atomicReference.set(la0.c);
            ma0Var.j();
            return;
        }
        do {
            la0Var = la0.a;
            la0Var2 = la0.b;
            if (atomicReference.compareAndSet(la0Var, la0Var2)) {
            }
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            i90.c().execute(new ga0(contextA, String.format("com.facebook.internal.APP_SETTINGS.%s", Arrays.copyOf(new Object[]{strB}, 1)), strB));
        } while (atomicReference.get() == la0Var);
        while (!atomicReference.compareAndSet(la0Var3, la0Var2)) {
            if (atomicReference.get() != la0Var3) {
                ma0Var.j();
                return;
            }
        }
        StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
        i90.c().execute(new ga0(contextA, String.format("com.facebook.internal.APP_SETTINGS.%s", Arrays.copyOf(new Object[]{strB}, 1)), strB));
    }

    /* JADX WARN: Code duplicated, block: B:52:0x0125  */
    public static ja0 e(String str, JSONObject jSONObject) {
        ac2 ac2Var;
        String strOptString;
        JSONArray jSONArray;
        Long lValueOf;
        JSONArray jSONArrayOptJSONArray;
        String str2;
        ia0 ia0Var;
        str.getClass();
        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("android_sdk_error_categories");
        xn xnVar = ac2.W;
        String str3 = "name";
        ia0 ia0Var2 = null;
        if (jSONArrayOptJSONArray2 == null) {
            ac2Var = null;
        } else {
            int length = jSONArrayOptJSONArray2.length();
            HashMap mapS = null;
            HashMap mapS2 = null;
            HashMap mapS3 = null;
            String strOptString2 = null;
            String strOptString3 = null;
            String strOptString4 = null;
            int i = 0;
            while (i < length) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray2.optJSONObject(i);
                if (jSONObjectOptJSONObject == null || (strOptString = jSONObjectOptJSONObject.optString("name")) == null) {
                    jSONArray = jSONArrayOptJSONArray2;
                } else {
                    jSONArray = jSONArrayOptJSONArray2;
                    if (strOptString.equalsIgnoreCase("other")) {
                        strOptString2 = jSONObjectOptJSONObject.optString("recovery_message", null);
                        mapS = xn.s(jSONObjectOptJSONObject);
                    } else if (strOptString.equalsIgnoreCase("transient")) {
                        strOptString3 = jSONObjectOptJSONObject.optString("recovery_message", null);
                        mapS2 = xn.s(jSONObjectOptJSONObject);
                    } else if (strOptString.equalsIgnoreCase("login_recoverable")) {
                        strOptString4 = jSONObjectOptJSONObject.optString("recovery_message", null);
                        mapS3 = xn.s(jSONObjectOptJSONObject);
                    }
                }
                i++;
                jSONArrayOptJSONArray2 = jSONArray;
            }
            ac2Var = new ac2(mapS, mapS2, mapS3, strOptString2, strOptString3, strOptString4);
        }
        if (ac2Var == null) {
            ac2Var = xnVar.h();
        }
        ac2 ac2Var2 = ac2Var;
        int iOptInt = jSONObject.optInt("app_events_feature_bitmask", 0);
        boolean z = (iOptInt & 8) != 0;
        boolean z2 = (iOptInt & 16) != 0;
        boolean z3 = (iOptInt & 32) != 0;
        JSONArray jSONArrayOptJSONArray3 = jSONObject.optJSONArray("auto_event_mapping_android");
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("app_events_config");
        boolean zOptBoolean = jSONObject.optBoolean("supports_implicit_sdk_logging", false);
        String strOptString5 = jSONObject.optString("gdpv4_nux_content", BuildConfig.FLAVOR);
        strOptString5.getClass();
        jSONObject.optBoolean("gdpv4_nux_enabled", false);
        int iOptInt2 = jSONObject.optInt("app_events_session_timeout", 60);
        EnumSet enumSet = ur1.b;
        long jOptLong = jSONObject.optLong("seamless_login");
        EnumSet enumSetNoneOf = EnumSet.noneOf(ur1.class);
        for (ur1 ur1Var : ur1.b) {
            if ((ur1Var.a & jOptLong) != 0) {
                enumSetNoneOf.add(ur1Var);
            }
        }
        enumSetNoneOf.getClass();
        JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("android_dialog_configs");
        HashMap map = new HashMap();
        if (jSONObjectOptJSONObject3 != null && (jSONArrayOptJSONArray = jSONObjectOptJSONObject3.optJSONArray("data")) != null) {
            int length2 = jSONArrayOptJSONArray.length();
            int i2 = 0;
            while (i2 < length2) {
                JSONObject jSONObjectOptJSONObject4 = jSONArrayOptJSONArray.optJSONObject(i2);
                jSONObjectOptJSONObject4.getClass();
                String strOptString6 = jSONObjectOptJSONObject4.optString(str3);
                if (h42.x(strOptString6)) {
                    str2 = str3;
                    ia0Var = ia0Var2;
                } else {
                    strOptString6.getClass();
                    List listB = StringsKt.B(strOptString6, new String[]{"|"}, 0, 6);
                    if (listB.size() != 2) {
                        str2 = str3;
                        ia0Var = ia0Var2;
                    } else {
                        String str4 = (String) CollectionsKt.p(listB);
                        String str5 = (String) CollectionsKt.t(listB);
                        if (h42.x(str4) || h42.x(str5)) {
                            str2 = str3;
                            ia0Var = null;
                        } else {
                            String strOptString7 = jSONObjectOptJSONObject4.optString("url");
                            if (!h42.x(strOptString7)) {
                                Uri.parse(strOptString7);
                            }
                            JSONArray jSONArrayOptJSONArray4 = jSONObjectOptJSONObject4.optJSONArray("versions");
                            if (jSONArrayOptJSONArray4 != null) {
                                int length3 = jSONArrayOptJSONArray4.length();
                                int[] iArr = new int[length3];
                                int i3 = 0;
                                while (i3 < length3) {
                                    int i4 = -1;
                                    String str6 = str3;
                                    int iOptInt3 = jSONArrayOptJSONArray4.optInt(i3, -1);
                                    if (iOptInt3 == -1) {
                                        String strOptString8 = jSONArrayOptJSONArray4.optString(i3);
                                        if (!h42.x(strOptString8)) {
                                            try {
                                                strOptString8.getClass();
                                                i4 = Integer.parseInt(strOptString8);
                                            } catch (NumberFormatException unused) {
                                                i90 i90Var = i90.a;
                                            }
                                            iOptInt3 = i4;
                                        }
                                    }
                                    iArr[i3] = iOptInt3;
                                    i3++;
                                    str3 = str6;
                                }
                            }
                            str2 = str3;
                            ia0Var = new ia0(str4, str5);
                        }
                    }
                }
                if (ia0Var != null) {
                    String str7 = ia0Var.a;
                    Map map2 = (Map) map.get(str7);
                    if (map2 == null) {
                        map2 = new HashMap();
                        map.put(str7, map2);
                    }
                    map2.put(ia0Var.b, ia0Var);
                }
                i2++;
                str3 = str2;
                ia0Var2 = null;
            }
        }
        String strOptString9 = jSONObject.optString("smart_login_bookmark_icon_url");
        strOptString9.getClass();
        String strOptString10 = jSONObject.optString("smart_login_menu_icon_url");
        strOptString10.getClass();
        String strOptString11 = jSONObject.optString("sdk_update_message");
        strOptString11.getClass();
        String strOptString12 = jSONObject.optString("aam_rules");
        String strOptString13 = jSONObject.optString("suggested_events_setting");
        String strOptString14 = jSONObject.optString("restrictive_data_filter_params");
        JSONArray jSONArrayI = i("standard_params", jSONObject.optJSONObject("protected_mode_rules"));
        JSONArray jSONArrayI2 = i("maca_rules", jSONObject.optJSONObject("protected_mode_rules"));
        HashMap mapH = h(jSONObject);
        JSONArray jSONArrayI3 = i("blocklist_events", jSONObject.optJSONObject("protected_mode_rules"));
        JSONArray jSONArrayI4 = i("redacted_events", jSONObject.optJSONObject("protected_mode_rules"));
        JSONArray jSONArrayI5 = i("sensitive_params", jSONObject.optJSONObject("protected_mode_rules"));
        JSONArray jSONArrayI6 = i("standard_params_schema", jSONObject.optJSONObject("protected_mode_rules"));
        JSONArray jSONArrayI7 = i("standard_params_blocked", jSONObject.optJSONObject("protected_mode_rules"));
        ArrayList arrayListF = f("fb_currency", jSONObjectOptJSONObject2);
        ArrayList arrayListF2 = f("_valueToSum", jSONObjectOptJSONObject2);
        ArrayList arrayListG = g(jSONObjectOptJSONObject2, false);
        ArrayList arrayListG2 = g(jSONObjectOptJSONObject2, true);
        JSONObject jSONObjectOptJSONObject5 = jSONObject.optJSONObject("app_events_config");
        if (jSONObjectOptJSONObject5 != null) {
            try {
                lValueOf = Long.valueOf(jSONObjectOptJSONObject5.optLong("iap_manual_and_auto_log_dedup_window_millis"));
            } catch (Exception unused2) {
                lValueOf = null;
            }
        } else {
            lValueOf = null;
        }
        ja0 ja0Var = new ja0(zOptBoolean, strOptString5, iOptInt2, enumSetNoneOf, map, z, ac2Var2, strOptString9, strOptString10, z2, z3, jSONArrayOptJSONArray3, strOptString11, strOptString12, strOptString13, strOptString14, jSONArrayI, jSONArrayI2, mapH, jSONArrayI3, jSONArrayI4, jSONArrayI5, jSONArrayI6, jSONArrayI7, arrayListF, arrayListF2, arrayListG, arrayListG2, lValueOf);
        c.put(str, ja0Var);
        return ja0Var;
    }

    public static ArrayList f(String str, JSONObject jSONObject) {
        JSONArray jSONArray;
        if (jSONObject != null) {
            try {
                jSONArray = jSONObject.getJSONArray("iap_manual_and_auto_log_dedup_keys");
            } catch (Exception unused) {
            }
        } else {
            jSONArray = null;
        }
        if (jSONArray != null) {
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                if (Intrinsics.areEqual(jSONObject2.getString("key"), "prod_keys")) {
                    JSONArray jSONArray2 = jSONObject2.getJSONArray("value");
                    int length2 = jSONArray2.length();
                    for (int i2 = 0; i2 < length2; i2++) {
                        JSONObject jSONObject3 = jSONArray2.getJSONObject(i2);
                        if (Intrinsics.areEqual(jSONObject3.getString("key"), str)) {
                            JSONArray jSONArray3 = jSONObject3.getJSONArray("value");
                            ArrayList arrayList = new ArrayList();
                            int length3 = jSONArray3.length();
                            for (int i3 = 0; i3 < length3; i3++) {
                                arrayList.add(jSONArray3.getJSONObject(i3).getString("value"));
                            }
                            ArrayList arrayList2 = new ArrayList();
                            arrayList2.addAll(arrayList);
                            return arrayList2;
                        }
                    }
                }
            }
        }
        return null;
    }

    public static ArrayList g(JSONObject jSONObject, boolean z) {
        JSONArray jSONArray;
        if (jSONObject != null) {
            try {
                jSONArray = jSONObject.getJSONArray("iap_manual_and_auto_log_dedup_keys");
            } catch (Exception unused) {
            }
        } else {
            jSONArray = null;
        }
        if (jSONArray == null) {
            return null;
        }
        int length = jSONArray.length();
        ArrayList arrayList = null;
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            String string = jSONObject2.getString("key");
            if ((!Intrinsics.areEqual(string, "prod_keys") || !z) && (!Intrinsics.areEqual(string, "test_keys") || z)) {
                JSONArray jSONArray2 = jSONObject2.getJSONArray("value");
                int length2 = jSONArray2.length();
                for (int i2 = 0; i2 < length2; i2++) {
                    JSONObject jSONObject3 = jSONArray2.getJSONObject(i2);
                    String string2 = jSONObject3.getString("key");
                    if (!Intrinsics.areEqual(string2, "_valueToSum") && !Intrinsics.areEqual(string2, "fb_currency")) {
                        JSONArray jSONArray3 = jSONObject3.getJSONArray("value");
                        ArrayList arrayList2 = new ArrayList();
                        int length3 = jSONArray3.length();
                        for (int i3 = 0; i3 < length3; i3++) {
                            try {
                                arrayList2.add(jSONArray3.getJSONObject(i3).getString("value"));
                            } catch (Exception unused2) {
                                return null;
                            }
                        }
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(new Pair(string2, arrayList2));
                    }
                }
            }
        }
        return arrayList;
    }

    public static HashMap h(JSONObject jSONObject) {
        HashMap map = new HashMap();
        if (!jSONObject.isNull("auto_log_app_events_default")) {
            try {
                map.put("auto_log_app_events_default", Boolean.valueOf(jSONObject.getBoolean("auto_log_app_events_default")));
            } catch (JSONException unused) {
                i90 i90Var = i90.a;
            }
        }
        if (!jSONObject.isNull("auto_log_app_events_enabled")) {
            try {
                map.put("auto_log_app_events_enabled", Boolean.valueOf(jSONObject.getBoolean("auto_log_app_events_enabled")));
            } catch (JSONException unused2) {
                i90 i90Var2 = i90.a;
            }
        }
        if (map.isEmpty()) {
            return null;
        }
        return map;
    }

    public static JSONArray i(String str, JSONObject jSONObject) {
        if (jSONObject != null) {
            return jSONObject.optJSONArray(str);
        }
        return null;
    }

    public static final ja0 k(String str, boolean z) {
        str.getClass();
        if (!z) {
            ConcurrentHashMap concurrentHashMap = c;
            if (concurrentHashMap.containsKey(str)) {
                return (ja0) concurrentHashMap.get(str);
            }
        }
        ja0 ja0VarE = e(str, a());
        if (Intrinsics.areEqual(str, i90.b())) {
            d.set(la0.c);
            a.j();
        }
        return ja0VarE;
    }

    public final synchronized void j() {
        la0 la0Var = (la0) d.get();
        if (la0.a != la0Var && la0.b != la0Var) {
            ja0 ja0Var = (ja0) c.get(i90.b());
            Handler handler = new Handler(Looper.getMainLooper());
            if (la0.d == la0Var) {
                while (true) {
                    ConcurrentLinkedQueue concurrentLinkedQueue = e;
                    if (concurrentLinkedQueue.isEmpty()) {
                        return;
                    } else {
                        handler.post(new ka0((sa) concurrentLinkedQueue.poll()));
                    }
                }
            } else {
                while (true) {
                    ConcurrentLinkedQueue concurrentLinkedQueue2 = e;
                    if (concurrentLinkedQueue2.isEmpty()) {
                        return;
                    } else {
                        handler.post(new ka0((sa) concurrentLinkedQueue2.poll(), ja0Var));
                    }
                }
            }
        }
    }
}
