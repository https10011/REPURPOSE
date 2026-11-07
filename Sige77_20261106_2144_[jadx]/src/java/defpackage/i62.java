package defpackage;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.hjq.toast.BuildConfig;
import java.lang.ref.WeakReference;
import java.util.Set;
import java.util.Timer;
import java.util.concurrent.RejectedExecutionException;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class i62 {
    public static final String e;
    public final WeakReference b;
    public Timer c;
    public String d = null;
    public final Handler a = new Handler(Looper.getMainLooper());

    static {
        String canonicalName = i62.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = BuildConfig.FLAVOR;
        }
        e = canonicalName;
    }

    public i62(Activity activity) {
        this.b = new WeakReference(activity);
    }

    public static final String a() {
        if (mt.a.contains(i62.class)) {
            return null;
        }
        try {
            return e;
        } catch (Throwable th) {
            mt.a(i62.class, th);
            return null;
        }
    }

    public final void b(mk0 mk0Var, String str) {
        String str2 = e;
        Set set = mt.a;
        if (set.contains(this) || mk0Var == null) {
            return;
        }
        try {
            pk0 pk0VarC = mk0Var.c();
            try {
                JSONObject jSONObject = pk0VarC.b;
                if (jSONObject == null) {
                    Log.e(str2, "Error sending UI component tree to Facebook: " + pk0VarC.c);
                    return;
                }
                if (Intrinsics.areEqual("true", jSONObject.optString("success"))) {
                    gp1 gp1Var = i01.c;
                    synchronized (i90.b) {
                    }
                    this.d = str;
                }
                if (jSONObject.has("is_app_indexing_enabled")) {
                    boolean z = jSONObject.getBoolean("is_app_indexing_enabled");
                    if (set.contains(zn.class)) {
                        return;
                    }
                    try {
                        zn.g.set(z);
                    } catch (Throwable th) {
                        mt.a(zn.class, th);
                    }
                }
            } catch (JSONException e2) {
                Log.e(str2, "Error decoding server response.", e2);
            }
        } catch (Throwable th2) {
            mt.a(this, th2);
        }
    }

    public final void c() {
        if (mt.a.contains(this)) {
            return;
        }
        try {
            try {
                i90.c().execute(new zs0(5, this, new h62(this)));
            } catch (RejectedExecutionException e2) {
                Log.e(e, "Error scheduling indexing job", e2);
            }
        } catch (Throwable th) {
            mt.a(this, th);
        }
    }
}
