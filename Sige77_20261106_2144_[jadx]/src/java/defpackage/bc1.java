package defpackage;

import android.content.SharedPreferences;
import android.view.View;
import com.hjq.toast.BuildConfig;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class bc1 {
    public static SharedPreferences c;
    public static final bc1 a = new bc1();
    public static final LinkedHashMap b = new LinkedHashMap();
    public static final AtomicBoolean d = new AtomicBoolean(false);

    public static final void a(String str, String str2) {
        if (mt.a.contains(bc1.class)) {
            return;
        }
        try {
            str2.getClass();
            if (!d.get()) {
                a.c();
            }
            LinkedHashMap linkedHashMap = b;
            linkedHashMap.put(str, str2);
            SharedPreferences sharedPreferences = c;
            if (sharedPreferences == null) {
                Intrinsics.throwUninitializedPropertyAccessException("shardPreferences");
                sharedPreferences = null;
            }
            sharedPreferences.edit().putString("SUGGESTED_EVENTS_HISTORY", h42.B(w11.h(linkedHashMap))).apply();
        } catch (Throwable th) {
            mt.a(bc1.class, th);
        }
    }

    public static final String b(View view, String str) {
        if (mt.a.contains(bc1.class)) {
            return null;
        }
        try {
            str.getClass();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("text", str);
                JSONArray jSONArray = new JSONArray();
                while (view != null) {
                    jSONArray.put(view.getClass().getSimpleName());
                    view = g62.i(view);
                }
                jSONObject.put("classname", jSONArray);
            } catch (JSONException unused) {
            }
            return h42.H(jSONObject.toString());
        } catch (Throwable th) {
            mt.a(bc1.class, th);
            return null;
        }
    }

    public final void c() {
        String str = BuildConfig.FLAVOR;
        if (mt.a.contains(this)) {
            return;
        }
        try {
            AtomicBoolean atomicBoolean = d;
            if (atomicBoolean.get()) {
                return;
            }
            SharedPreferences sharedPreferences = i90.a().getSharedPreferences("com.facebook.internal.SUGGESTED_EVENTS_HISTORY", 0);
            sharedPreferences.getClass();
            c = sharedPreferences;
            LinkedHashMap linkedHashMap = b;
            String string = sharedPreferences.getString("SUGGESTED_EVENTS_HISTORY", BuildConfig.FLAVOR);
            if (string != null) {
                str = string;
            }
            linkedHashMap.putAll(h42.A(str));
            atomicBoolean.set(true);
        } catch (Throwable th) {
            mt.a(this, th);
        }
    }
}
