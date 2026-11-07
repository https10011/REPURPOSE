package defpackage;

import android.app.Activity;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import com.hjq.toast.BuildConfig;
import java.lang.ref.WeakReference;
import java.util.Set;
import java.util.TimerTask;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class h62 extends TimerTask {
    public final /* synthetic */ i62 a;

    public h62(i62 i62Var) {
        this.a = i62Var;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        WeakReference weakReference;
        try {
            boolean zContains = mt.a.contains(i62.class);
            Handler handler = null;
            i62 i62Var = this.a;
            if (zContains) {
                weakReference = null;
            } else {
                try {
                    weakReference = i62Var.b;
                } catch (Throwable th) {
                    mt.a(i62.class, th);
                    weakReference = null;
                }
            }
            Activity activity = (Activity) weakReference.get();
            View viewK = ga.k(activity);
            if (activity != null && viewK != null) {
                String simpleName = activity.getClass().getSimpleName();
                zn znVar = zn.a;
                boolean z = false;
                if (!mt.a.contains(zn.class)) {
                    try {
                        z = zn.g.get();
                    } catch (Throwable th2) {
                        mt.a(zn.class, th2);
                    }
                }
                if (z) {
                    FutureTask futureTask = new FutureTask(new a20(viewK));
                    if (!mt.a.contains(i62.class)) {
                        try {
                            handler = i62Var.a;
                        } catch (Throwable th3) {
                            mt.a(i62.class, th3);
                        }
                    }
                    handler.post(futureTask);
                    String str = BuildConfig.FLAVOR;
                    try {
                        str = (String) futureTask.get(1L, TimeUnit.SECONDS);
                    } catch (Exception e) {
                        Log.e(i62.a(), "Failed to take screenshot.", e);
                    }
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("screenname", simpleName);
                        jSONObject.put("screenshot", str);
                        JSONArray jSONArray = new JSONArray();
                        jSONArray.put(g62.d(viewK));
                        jSONObject.put("view", jSONArray);
                    } catch (JSONException unused) {
                        Log.e(i62.a(), "Failed to create JSONObject");
                    }
                    String string = jSONObject.toString();
                    string.getClass();
                    Set set = mt.a;
                    if (set.contains(i62.class)) {
                        return;
                    }
                    try {
                        if (set.contains(i62Var)) {
                            return;
                        }
                        try {
                            i90.c().execute(new zs0(6, string, i62Var));
                            return;
                        } catch (Throwable th4) {
                            mt.a(i62Var, th4);
                            return;
                        }
                    } catch (Throwable th5) {
                        mt.a(i62.class, th5);
                        return;
                    }
                    Log.e(i62.a(), "UI Component tree indexing failure!", e);
                }
            }
        } catch (Exception e2) {
            Log.e(i62.a(), "UI Component tree indexing failure!", e2);
        }
    }
}
