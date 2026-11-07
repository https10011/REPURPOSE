package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;
import com.hjq.toast.BuildConfig;
import com.transsion.athena.data.TrackData;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class id2 implements Application.ActivityLifecycleCallbacks {
    public long X;
    public int b;
    public i4 d;
    public long v;
    public final Handler a = new Handler(Looper.getMainLooper());
    public boolean c = true;
    public long e = 0;
    public int f = 0;
    public String i = null;
    public int w = 0;
    public final LinkedList W = new LinkedList();

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        nj2.l = new WeakReference(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        WeakReference weakReference = nj2.l;
        if (weakReference != null) {
            weakReference.clear();
            nj2.l = null;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        Window window;
        String strValueOf;
        if (activity == null || (window = activity.getWindow()) == null) {
            return;
        }
        WindowManager.LayoutParams attributes = window.getAttributes();
        int i = 1;
        if (attributes.width == 1 && attributes.height == 1) {
            return;
        }
        try {
            String simpleName = activity.getClass().getSimpleName();
            if (ze2.r) {
                int i2 = this.w + 1;
                this.w = i2;
                LinkedList linkedList = this.W;
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                ad2 ad2Var = new ad2();
                ad2Var.a = i2;
                ad2Var.b = simpleName;
                ad2Var.c = jElapsedRealtime;
                linkedList.addLast(ad2Var);
            }
            int i3 = this.b + 1;
            this.b = i3;
            if (i3 <= 1) {
                this.v = SystemClock.elapsedRealtime();
                if (this.c) {
                    try {
                        strValueOf = UUID.randomUUID().toString();
                    } catch (Exception unused) {
                        strValueOf = String.valueOf(System.currentTimeMillis());
                    }
                    ze2.q = strValueOf;
                    this.e = System.currentTimeMillis();
                    try {
                        Uri referrer = activity.getReferrer();
                        if (referrer != null) {
                            this.i = referrer.getAuthority();
                        }
                        Intent intent = activity.getIntent();
                        String str = this.i;
                        String str2 = sc2.a;
                        if (intent != null) {
                            Set<String> categories = intent.getCategories();
                            if (!"android.intent.action.MAIN".equals(intent.getAction()) || categories == null || !categories.contains("android.intent.category.LAUNCHER")) {
                                i = TextUtils.isEmpty(str) ? 0 : 2;
                            }
                        }
                        this.f = i;
                        if (TextUtils.equals(this.i, activity.getPackageName())) {
                            this.f = 3;
                        }
                    } catch (Exception e) {
                        cc2.c(Log.getStackTraceString(e));
                    }
                    for (Integer num : qd2.b) {
                        if (num.intValue() != 9999) {
                            TrackData trackData = new TrackData();
                            trackData.b(0, "purl", simpleName);
                            hc.g(num.intValue()).i("page_enter", trackData, num.intValue());
                        }
                    }
                }
            }
            this.c = false;
            i4 i4Var = this.d;
            if (i4Var != null) {
                this.a.removeCallbacks(i4Var);
                this.d = null;
            }
        } catch (Exception e2) {
            cc2.c(Log.getStackTraceString(e2));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        Window window;
        Bundle bundleExtra;
        if (activity == null || (window = activity.getWindow()) == null) {
            return;
        }
        WindowManager.LayoutParams attributes = window.getAttributes();
        if (attributes.width == 1 && attributes.height == 1) {
            return;
        }
        try {
            if (ze2.r && this.W.size() > 0) {
                String simpleName = activity.getClass().getSimpleName();
                for (ad2 ad2Var : this.W) {
                    if (simpleName.equals(ad2Var.b)) {
                        long jElapsedRealtime = SystemClock.elapsedRealtime() - ad2Var.c;
                        TrackData trackData = new TrackData();
                        trackData.e("s_id", ze2.q);
                        trackData.e("url", ad2Var.b);
                        trackData.a(ad2Var.a, 0, "no");
                        if (jElapsedRealtime <= 0) {
                            jElapsedRealtime = 0;
                        }
                        trackData.d("t", jElapsedRealtime);
                        trackData.b(0, "ext", BuildConfig.FLAVOR);
                        if (activity.getIntent() != null && (bundleExtra = activity.getIntent().getBundleExtra("athena")) != null) {
                            trackData.c("ext", 0, bundleExtra);
                        }
                        hc.g(this.X).i("page_view", trackData, this.X);
                        this.W.remove(ad2Var);
                        break;
                    }
                }
            }
            int i = this.b - 1;
            this.b = i;
            if (i == 0) {
                long jElapsedRealtime2 = SystemClock.elapsedRealtime() - this.v;
                if (jElapsedRealtime2 > 1000 && jElapsedRealtime2 < 86400000) {
                    for (Integer num : qd2.b) {
                        if (num.intValue() != 9999) {
                            TrackData trackData2 = new TrackData();
                            trackData2.e("s_id", ze2.q);
                            trackData2.a(this.f, 0, "s_t");
                            trackData2.e("pkg", this.f == 2 ? this.i : BuildConfig.FLAVOR);
                            trackData2.d("s_s", this.e);
                            trackData2.d("t", jElapsedRealtime2);
                            hc.g(num.intValue()).i("app_active", trackData2, num.intValue());
                        }
                    }
                }
                i4 i4Var = this.d;
                if (i4Var != null) {
                    this.a.removeCallbacks(i4Var);
                }
                Handler handler = this.a;
                i4 i4Var2 = new i4(this, 23);
                this.d = i4Var2;
                handler.postDelayed(i4Var2, ze2.o);
                if (hc.f == 0 && hc.e != null && hc.e.d() != null) {
                    Message messageObtain = Message.obtain();
                    messageObtain.what = 600;
                    hc.e.d().c(messageObtain, 100L);
                }
            }
        } catch (Exception e) {
            cc2.c(Log.getStackTraceString(e));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
