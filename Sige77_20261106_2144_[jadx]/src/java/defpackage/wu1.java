package defpackage;

import android.app.Activity;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class wu1 {
    public static final wu1 a = new wu1();
    public static final AtomicBoolean b = new AtomicBoolean(false);
    public static final LinkedHashSet c = new LinkedHashSet();
    public static final LinkedHashSet d = new LinkedHashSet();

    public static final synchronized void a() {
        if (mt.a.contains(wu1.class)) {
            return;
        }
        try {
            i90.c().execute(new g(21));
        } catch (Throwable th) {
            mt.a(wu1.class, th);
        }
    }

    public static final void d(Activity activity) {
        Set set = mt.a;
        if (set.contains(wu1.class)) {
            return;
        }
        try {
            if (b.get()) {
                boolean z = false;
                if (!set.contains(ba0.class)) {
                    try {
                        z = ba0.i;
                    } catch (Throwable th) {
                        mt.a(ba0.class, th);
                    }
                }
                if (z) {
                    if (c.isEmpty()) {
                        if (!d.isEmpty()) {
                        }
                    }
                    HashMap map = r62.d;
                    ta.B(activity);
                    return;
                }
            }
            HashMap map2 = r62.d;
            ta.C(activity);
        } catch (Exception unused) {
        } catch (Throwable th2) {
            mt.a(wu1.class, th2);
        }
    }

    public final void b() {
        String str;
        if (mt.a.contains(this)) {
            return;
        }
        try {
            ja0 ja0VarK = ma0.k(i90.b(), false);
            if (ja0VarK != null && (str = ja0VarK.k) != null) {
                c(str);
                if (c.isEmpty() && d.isEmpty()) {
                    return;
                }
                File fileD = j51.d();
                if (fileD == null) {
                    return;
                }
                ba0.r(fileD);
                WeakReference weakReference = e5.l;
                Activity activity = weakReference != null ? (Activity) weakReference.get() : null;
                if (activity != null) {
                    d(activity);
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            mt.a(this, th);
        }
    }

    public final void c(String str) {
        if (mt.a.contains(this)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("production_events")) {
                JSONArray jSONArray = jSONObject.getJSONArray("production_events");
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    LinkedHashSet linkedHashSet = c;
                    String string = jSONArray.getString(i);
                    string.getClass();
                    linkedHashSet.add(string);
                }
            }
            if (jSONObject.has("eligible_for_prediction_events")) {
                JSONArray jSONArray2 = jSONObject.getJSONArray("eligible_for_prediction_events");
                int length2 = jSONArray2.length();
                for (int i2 = 0; i2 < length2; i2++) {
                    LinkedHashSet linkedHashSet2 = d;
                    String string2 = jSONArray2.getString(i2);
                    string2.getClass();
                    linkedHashSet2.add(string2);
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            mt.a(this, th);
        }
    }
}
