package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.hjq.toast.BuildConfig;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class x32 {
    public static final x32 a = new x32();
    public static final AtomicBoolean b = new AtomicBoolean(false);
    public static final AtomicBoolean c = new AtomicBoolean(false);
    public static final w32 d = new w32("com.facebook.sdk.AutoInitEnabled", true);
    public static final w32 e = new w32("com.facebook.sdk.AutoLogAppEventsEnabled", true);
    public static final w32 f = new w32("com.facebook.sdk.AdvertiserIDCollectionEnabled", true);
    public static final w32 g = new w32("auto_event_setup_enabled", false);
    public static final w32 h = new w32("com.facebook.sdk.MonitorEnabled", true);
    public static SharedPreferences i;

    public static final boolean b() {
        if (mt.a.contains(x32.class)) {
            return false;
        }
        try {
            a.e();
            return f.a();
        } catch (Throwable th) {
            mt.a(x32.class, th);
            return false;
        }
    }

    public static final boolean c() {
        if (mt.a.contains(x32.class)) {
            return false;
        }
        try {
            x32 x32Var = a;
            x32Var.e();
            return x32Var.a();
        } catch (Throwable th) {
            mt.a(x32.class, th);
            return false;
        }
    }

    public static final Boolean j() {
        String str = BuildConfig.FLAVOR;
        if (!mt.a.contains(x32.class)) {
            try {
                a.l();
                try {
                    SharedPreferences sharedPreferences = i;
                    if (sharedPreferences == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("userSettingPref");
                        sharedPreferences = null;
                    }
                    String string = sharedPreferences.getString(e.b, BuildConfig.FLAVOR);
                    if (string != null) {
                        str = string;
                    }
                    if (str.length() > 0) {
                        return Boolean.valueOf(new JSONObject(str).getBoolean("value"));
                    }
                } catch (JSONException unused) {
                    i90 i90Var = i90.a;
                }
            } catch (Throwable th) {
                mt.a(x32.class, th);
                return null;
            }
        }
        return null;
    }

    public final boolean a() {
        Set set = mt.a;
        if (set.contains(this)) {
            return false;
        }
        try {
            HashMap mapC = ma0.c();
            if (mapC != null && !mapC.isEmpty()) {
                Boolean bool = (Boolean) mapC.get("auto_log_app_events_enabled");
                Boolean bool2 = (Boolean) mapC.get("auto_log_app_events_default");
                if (bool != null) {
                    return bool.booleanValue();
                }
                Boolean bool3 = null;
                if (!set.contains(this)) {
                    try {
                        Boolean boolJ = j();
                        if (boolJ != null || (boolJ = f()) != null) {
                            bool3 = boolJ;
                        }
                    } catch (Throwable th) {
                        mt.a(this, th);
                    }
                }
                if (bool3 != null) {
                    return bool3.booleanValue();
                }
                if (bool2 != null) {
                    return bool2.booleanValue();
                }
                return true;
            }
            return e.a();
        } catch (Throwable th2) {
            mt.a(this, th2);
            return false;
        }
    }

    public final void d() {
        if (mt.a.contains(this)) {
            return;
        }
        try {
            w32 w32Var = g;
            k(w32Var);
            final long jCurrentTimeMillis = System.currentTimeMillis();
            if (w32Var.c == null || jCurrentTimeMillis - w32Var.d >= 604800000) {
                w32Var.c = null;
                w32Var.d = 0L;
                if (c.compareAndSet(false, true)) {
                    i90.c().execute(new Runnable() { // from class: v32
                        @Override // java.lang.Runnable
                        public final void run() {
                            ja0 ja0VarK;
                            long j = jCurrentTimeMillis;
                            if (mt.a.contains(x32.class)) {
                                return;
                            }
                            try {
                                if (x32.f.a() && (ja0VarK = ma0.k(i90.b(), false)) != null && ja0VarK.g) {
                                    nc ncVarT = kv.t(i90.a());
                                    String strA = (ncVarT == null || ncVarT.a() == null) ? null : ncVarT.a();
                                    if (strA != null) {
                                        Bundle bundle = new Bundle();
                                        bundle.putString("advertiser_id", strA);
                                        bundle.putString("fields", "auto_event_setup_enabled");
                                        String str = mk0.j;
                                        mk0 mk0VarO = vl0.o(null, "app", null);
                                        mk0VarO.d = bundle;
                                        JSONObject jSONObject = mk0VarO.c().b;
                                        if (jSONObject != null) {
                                            w32 w32Var2 = x32.g;
                                            w32Var2.c = Boolean.valueOf(jSONObject.optBoolean("auto_event_setup_enabled", false));
                                            w32Var2.d = j;
                                            x32.a.m(w32Var2);
                                        }
                                    }
                                }
                                x32.c.set(false);
                            } catch (Throwable th) {
                                mt.a(x32.class, th);
                            }
                        }
                    });
                }
            }
        } catch (Throwable th) {
            mt.a(this, th);
        }
    }

    public final void e() {
        Set set = mt.a;
        if (set.contains(this)) {
            return;
        }
        try {
            if (i90.q.get()) {
                if (b.compareAndSet(false, true)) {
                    SharedPreferences sharedPreferences = i90.a().getSharedPreferences("com.facebook.sdk.USER_SETTINGS", 0);
                    sharedPreferences.getClass();
                    i = sharedPreferences;
                    w32[] w32VarArr = {e, f, d};
                    if (!set.contains(this)) {
                        for (int i2 = 0; i2 < 3; i2++) {
                            try {
                                w32 w32Var = w32VarArr[i2];
                                if (w32Var == g) {
                                    d();
                                } else if (w32Var.c == null) {
                                    k(w32Var);
                                    if (w32Var.c == null) {
                                        g(w32Var);
                                    }
                                } else {
                                    m(w32Var);
                                }
                            } catch (Throwable th) {
                                mt.a(this, th);
                                d();
                                i();
                                h();
                            }
                        }
                    }
                    d();
                    i();
                    h();
                }
            }
        } catch (Throwable th2) {
            mt.a(this, th2);
        }
    }

    public final Boolean f() {
        if (!mt.a.contains(this)) {
            try {
                l();
                try {
                    Context contextA = i90.a();
                    ApplicationInfo applicationInfo = contextA.getPackageManager().getApplicationInfo(contextA.getPackageName(), 128);
                    applicationInfo.getClass();
                    Bundle bundle = applicationInfo.metaData;
                    if (bundle != null) {
                        w32 w32Var = e;
                        if (bundle.containsKey(w32Var.b)) {
                            return Boolean.valueOf(applicationInfo.metaData.getBoolean(w32Var.b));
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    i90 i90Var = i90.a;
                }
            } catch (Throwable th) {
                mt.a(this, th);
                return null;
            }
        }
        return null;
    }

    public final void g(w32 w32Var) {
        String str = w32Var.b;
        if (mt.a.contains(this)) {
            return;
        }
        try {
            l();
            try {
                Context contextA = i90.a();
                ApplicationInfo applicationInfo = contextA.getPackageManager().getApplicationInfo(contextA.getPackageName(), 128);
                applicationInfo.getClass();
                Bundle bundle = applicationInfo.metaData;
                if (bundle == null || !bundle.containsKey(str)) {
                    return;
                }
                w32Var.c = Boolean.valueOf(applicationInfo.metaData.getBoolean(str, w32Var.a));
                return;
            } catch (PackageManager.NameNotFoundException unused) {
                i90 i90Var = i90.a;
                return;
            }
        } catch (Throwable th) {
            mt.a(this, th);
        }
        mt.a(this, th);
    }

    public final void h() {
        int i2;
        int i3;
        if (mt.a.contains(this)) {
            return;
        }
        try {
            if (b.get() && i90.q.get()) {
                Context contextA = i90.a();
                int i4 = (d.a() ? 1 : 0) | ((e.a() ? 1 : 0) << 1) | ((f.a() ? 1 : 0) << 2) | ((h.a() ? 1 : 0) << 3);
                SharedPreferences sharedPreferences = i;
                if (sharedPreferences == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("userSettingPref");
                    sharedPreferences = null;
                }
                int i5 = sharedPreferences.getInt("com.facebook.sdk.USER_SETTINGS_BITMASK", 0);
                if (i5 != i4) {
                    SharedPreferences sharedPreferences2 = i;
                    if (sharedPreferences2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("userSettingPref");
                        sharedPreferences2 = null;
                    }
                    sharedPreferences2.edit().putInt("com.facebook.sdk.USER_SETTINGS_BITMASK", i4).apply();
                    try {
                        ApplicationInfo applicationInfo = contextA.getPackageManager().getApplicationInfo(contextA.getPackageName(), 128);
                        applicationInfo.getClass();
                        if (applicationInfo.metaData != null) {
                            String[] strArr = {"com.facebook.sdk.AutoInitEnabled", "com.facebook.sdk.AutoLogAppEventsEnabled", "com.facebook.sdk.AdvertiserIDCollectionEnabled", "com.facebook.sdk.MonitorEnabled"};
                            boolean[] zArr = {true, true, true, true};
                            i2 = 0;
                            i3 = 0;
                            for (int i6 = 0; i6 < 4; i6++) {
                                try {
                                    i3 |= (applicationInfo.metaData.containsKey(strArr[i6]) ? 1 : 0) << i6;
                                    i2 |= (applicationInfo.metaData.getBoolean(strArr[i6], zArr[i6]) ? 1 : 0) << i6;
                                } catch (PackageManager.NameNotFoundException unused) {
                                }
                            }
                        } else {
                            i2 = 0;
                            i3 = 0;
                        }
                    } catch (PackageManager.NameNotFoundException unused2) {
                    }
                    pa paVar = new pa(contextA, (String) null);
                    Bundle bundle = new Bundle();
                    bundle.putInt("usage", i3);
                    bundle.putInt("initial", i2);
                    bundle.putInt("previous", i5);
                    bundle.putInt("current", i4);
                    if (((bundle.getInt("previous") & 2) != 0) || c()) {
                        paVar.g("fb_sdk_settings_changed", bundle);
                    }
                }
            }
        } catch (Throwable th) {
            mt.a(this, th);
        }
    }

    public final void i() {
        if (mt.a.contains(this)) {
            return;
        }
        try {
            Context contextA = i90.a();
            ApplicationInfo applicationInfo = contextA.getPackageManager().getApplicationInfo(contextA.getPackageName(), 128);
            applicationInfo.getClass();
            Bundle bundle = applicationInfo.metaData;
            if (bundle != null) {
                if (!bundle.containsKey("com.facebook.sdk.AdvertiserIDCollectionEnabled")) {
                    Log.w("x32", "You haven't set a value for AdvertiserIDCollectionEnabled. Set the flag to TRUE if you want to collect Advertiser ID for better advertising and analytics results. To request user consent before collecting data, set the flag value to FALSE, then change to TRUE once user consent is received. Learn more: https://developers.facebook.com/docs/app-events/getting-started-app-events-android#disable-auto-events.");
                }
                if (b()) {
                    return;
                }
                Log.w("x32", "The value for AdvertiserIDCollectionEnabled is currently set to FALSE so you're sending app events without collecting Advertiser ID. This can affect the quality of your advertising and analytics results.");
            }
        } catch (PackageManager.NameNotFoundException unused) {
        } catch (Throwable th) {
            mt.a(this, th);
        }
    }

    public final void k(w32 w32Var) {
        String str = BuildConfig.FLAVOR;
        if (mt.a.contains(this)) {
            return;
        }
        try {
            l();
            try {
                SharedPreferences sharedPreferences = i;
                if (sharedPreferences == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("userSettingPref");
                    sharedPreferences = null;
                }
                String string = sharedPreferences.getString(w32Var.b, BuildConfig.FLAVOR);
                if (string != null) {
                    str = string;
                }
                if (str.length() > 0) {
                    JSONObject jSONObject = new JSONObject(str);
                    w32Var.c = Boolean.valueOf(jSONObject.getBoolean("value"));
                    w32Var.d = jSONObject.getLong("last_timestamp");
                    return;
                }
                return;
            } catch (JSONException unused) {
                i90 i90Var = i90.a;
                return;
            }
        } catch (Throwable th) {
            mt.a(this, th);
        }
        mt.a(this, th);
    }

    public final void l() {
        if (mt.a.contains(this)) {
            return;
        }
        try {
            if (b.get()) {
            } else {
                throw new z80("The UserSettingManager has not been initialized successfully");
            }
        } catch (Throwable th) {
            mt.a(this, th);
        }
    }

    public final void m(w32 w32Var) {
        if (mt.a.contains(this)) {
            return;
        }
        try {
            l();
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("value", w32Var.c);
                jSONObject.put("last_timestamp", w32Var.d);
                SharedPreferences sharedPreferences = i;
                if (sharedPreferences == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("userSettingPref");
                    sharedPreferences = null;
                }
                sharedPreferences.edit().putString(w32Var.b, jSONObject.toString()).apply();
                h();
            } catch (Exception unused) {
                i90 i90Var = i90.a;
            }
        } catch (Throwable th) {
            mt.a(this, th);
        }
    }
}
