package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.measurement.zzdd;
import java.util.ArrayDeque;
import java.util.Objects;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class aa0 implements Application.ActivityLifecycleCallbacks {
    public final /* synthetic */ int a;
    public final Object b;

    public aa0() {
        this.a = 0;
        this.b = new ArrayDeque(10);
    }

    public void a(Intent intent) {
        ArrayDeque arrayDeque = (ArrayDeque) this.b;
        Bundle bundle = null;
        try {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                String string = extras.getString("google.message_id");
                if (string == null) {
                    string = extras.getString("message_id");
                }
                if (!TextUtils.isEmpty(string)) {
                    if (arrayDeque.contains(string)) {
                        return;
                    } else {
                        arrayDeque.add(string);
                    }
                }
                bundle = extras.getBundle("gcm.n.analytics_data");
            }
        } catch (RuntimeException e) {
            Log.w("FirebaseMessaging", "Failed trying to get analytics data from Intent extras.", e);
        }
        if (bundle == null ? false : "1".equals(bundle.getString("google.c.a.e"))) {
            if (bundle != null) {
                if ("1".equals(bundle.getString("google.c.a.tc"))) {
                    i6 i6Var = (i6) hc0.d().b(i6.class);
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Received event with track-conversion=true. Setting user property and reengagement event");
                    }
                    if (i6Var != null) {
                        String string2 = bundle.getString("google.c.a.c_id");
                        j6 j6Var = (j6) i6Var;
                        if (!ew2.b.contains("fcm")) {
                            b03 b03Var = j6Var.a.a;
                            b03Var.a(new jy2(b03Var, "fcm", "_ln", (Object) string2, true));
                        }
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("source", "Firebase");
                        bundle2.putString("medium", "notification");
                        bundle2.putString("campaign", string2);
                        j6Var.a("_cmp", bundle2);
                    } else {
                        Log.w("FirebaseMessaging", "Unable to set user property for conversion tracking:  analytics library is missing");
                    }
                } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Received event with track-conversion=false. Do not set user property");
                }
            }
            sp0.u("_no", bundle);
        }
    }

    public void j(zzdd zzddVar, Bundle bundle) {
        ua3 ua3Var;
        y53 y53Var;
        Uri uri;
        w93 w93Var = (w93) this.b;
        try {
            try {
                y53 y53Var2 = (y53) w93Var.a;
                c33 c33Var = y53Var2.f;
                y53.l(c33Var);
                c33Var.a0.a("onActivityCreated");
                Intent intent = zzddVar.c;
                if (intent != null) {
                    Uri data = intent.getData();
                    if (data == null || !data.isHierarchical()) {
                        Bundle extras = intent.getExtras();
                        if (extras != null) {
                            String string = extras.getString("com.android.vending.referral_url");
                            if (!TextUtils.isEmpty(string)) {
                                data = Uri.parse(string);
                                uri = data;
                            }
                        }
                        uri = null;
                    } else {
                        uri = data;
                    }
                    if (uri != null && uri.isHierarchical()) {
                        y53.j(y53Var2.w);
                        String str = qf3.G0(intent) ? "gs" : "auto";
                        String queryParameter = uri.getQueryParameter("referrer");
                        boolean z = bundle == null;
                        t53 t53Var = y53Var2.i;
                        y53.l(t53Var);
                        t53Var.N(new d83(this, z, uri, str, queryParameter));
                        y53Var = (y53) w93Var.a;
                    }
                    ua3Var = y53Var.Y;
                }
                y53Var = (y53) w93Var.a;
            } catch (RuntimeException e) {
                c33 c33Var2 = ((y53) w93Var.a).f;
                y53.l(c33Var2);
                c33Var2.f.b(e, "Throwable caught in onActivityCreated");
            }
            ua3Var = y53Var.Y;
        } finally {
            ua3Var = ((y53) w93Var.a).Y;
            y53.k(ua3Var);
            ua3Var.L(zzddVar, bundle);
        }
    }

    public void k(zzdd zzddVar) {
        ua3 ua3Var = ((y53) ((w93) this.b).a).Y;
        y53.k(ua3Var);
        synchronized (ua3Var.Y) {
            try {
                if (Objects.equals(ua3Var.i, zzddVar)) {
                    ua3Var.i = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (((y53) ua3Var.a).d.T()) {
            ua3Var.f.remove(Integer.valueOf(zzddVar.a));
        }
    }

    public void l(zzdd zzddVar) {
        y53 y53Var = (y53) ((w93) this.b).a;
        ua3 ua3Var = y53Var.Y;
        y53.k(ua3Var);
        synchronized (ua3Var.Y) {
            ua3Var.X = false;
            ua3Var.v = true;
        }
        y53 y53Var2 = (y53) ua3Var.a;
        y53Var2.X.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (y53Var2.d.T()) {
            ja3 ja3VarO = ua3Var.O(zzddVar);
            ua3Var.d = ua3Var.c;
            ua3Var.c = null;
            t53 t53Var = y53Var2.i;
            y53.l(t53Var);
            t53Var.N(new oa3(ua3Var, ja3VarO, jElapsedRealtime));
        } else {
            ua3Var.c = null;
            t53 t53Var2 = y53Var2.i;
            y53.l(t53Var2);
            t53Var2.N(new cw2(ua3Var, jElapsedRealtime));
        }
        td3 td3Var = y53Var.v;
        y53.k(td3Var);
        y53 y53Var3 = (y53) td3Var.a;
        y53Var3.X.getClass();
        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
        t53 t53Var3 = y53Var3.i;
        y53.l(t53Var3);
        t53Var3.N(new bd3(td3Var, jElapsedRealtime2, 1));
    }

    public void m(zzdd zzddVar) {
        y53 y53Var = (y53) ((w93) this.b).a;
        td3 td3Var = y53Var.v;
        y53.k(td3Var);
        y53 y53Var2 = (y53) td3Var.a;
        y53Var2.X.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        t53 t53Var = y53Var2.i;
        y53.l(t53Var);
        t53Var.N(new bd3(td3Var, jElapsedRealtime, 0));
        ua3 ua3Var = y53Var.Y;
        y53.k(ua3Var);
        Object obj = ua3Var.Y;
        synchronized (obj) {
            try {
                ua3Var.X = true;
                if (!Objects.equals(zzddVar, ua3Var.i)) {
                    synchronized (obj) {
                        ua3Var.i = zzddVar;
                        ua3Var.v = false;
                        y53 y53Var3 = (y53) ua3Var.a;
                        if (y53Var3.d.T()) {
                            ua3Var.w = null;
                            t53 t53Var2 = y53Var3.i;
                            y53.l(t53Var2);
                            t53Var2.N(new na3(ua3Var, 1));
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        y53 y53Var4 = (y53) ua3Var.a;
        if (!y53Var4.d.T()) {
            ua3Var.c = ua3Var.w;
            t53 t53Var3 = y53Var4.i;
            y53.l(t53Var3);
            t53Var3.N(new na3(ua3Var, 0));
            return;
        }
        ua3Var.M(zzddVar.b, ua3Var.O(zzddVar), false);
        xx2 xx2Var = ((y53) ua3Var.a).a0;
        y53.i(xx2Var);
        y53 y53Var5 = (y53) xx2Var.a;
        y53Var5.X.getClass();
        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
        t53 t53Var4 = y53Var5.i;
        y53.l(t53Var4);
        t53Var4.N(new cw2(xx2Var, jElapsedRealtime2));
    }

    public void n(zzdd zzddVar, Bundle bundle) {
        ja3 ja3Var;
        ua3 ua3Var = ((y53) ((w93) this.b).a).Y;
        y53.k(ua3Var);
        if (!((y53) ua3Var.a).d.T() || bundle == null || (ja3Var = (ja3) ua3Var.f.get(Integer.valueOf(zzddVar.a))) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong("id", ja3Var.c);
        bundle2.putString("name", ja3Var.a);
        bundle2.putString("referrer_name", ja3Var.b);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        switch (this.a) {
            case 0:
                Intent intent = activity.getIntent();
                if (intent != null) {
                    int i = 25;
                    if (Build.VERSION.SDK_INT > 25) {
                        a(intent);
                    } else {
                        new Handler(Looper.getMainLooper()).post(new x4(i, this, intent));
                    }
                    break;
                }
                break;
            case 1:
                ((b03) this.b).a(new zy2(this, bundle, activity));
                break;
            default:
                j(zzdd.R(activity), bundle);
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                ((b03) this.b).a(new xz2(this, activity, 4));
                break;
            default:
                k(zzdd.R(activity));
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                ((b03) this.b).a(new xz2(this, activity, 2));
                break;
            default:
                l(zzdd.R(activity));
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                ((b03) this.b).a(new xz2(this, activity, 1));
                break;
            default:
                m(zzdd.R(activity));
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                xw2 xw2Var = new xw2();
                ((b03) this.b).a(new zy2(this, activity, xw2Var));
                Bundle bundleE = xw2Var.e(50L);
                if (bundleE != null) {
                    bundle.putAll(bundleE);
                }
                break;
            default:
                n(zzdd.R(activity), bundle);
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        switch (this.a) {
            case 1:
                ((b03) this.b).a(new xz2(this, activity, 0));
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        switch (this.a) {
            case 1:
                ((b03) this.b).a(new xz2(this, activity, 3));
                break;
        }
    }

    public /* synthetic */ aa0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    private final void b(Activity activity) {
    }

    private final void c(Activity activity) {
    }

    private final void d(Activity activity) {
    }

    private final void f(Activity activity) {
    }

    private final void g(Activity activity) {
    }

    private final void h(Activity activity) {
    }

    private final void i(Activity activity) {
    }

    private final void e(Activity activity, Bundle bundle) {
    }
}
