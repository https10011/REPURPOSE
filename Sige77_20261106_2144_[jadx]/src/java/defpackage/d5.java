package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.util.Log;
import com.adjust.sdk.Adjust;
import com.bumptech.glide.a;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Timer;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class d5 implements Application.ActivityLifecycleCallbacks {
    public final /* synthetic */ int a;

    public d5(a aVar) {
        this.a = 3;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        switch (this.a) {
            case 0:
                activity.getClass();
                gp1 gp1Var = i01.c;
                String str = e5.a;
                synchronized (i90.b) {
                }
                e5.b.execute(new g(2));
                break;
            case 1:
                activity.getClass();
                break;
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                activity.getClass();
                break;
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                break;
            default:
                activity.getClass();
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        switch (this.a) {
            case 0:
                activity.getClass();
                gp1 gp1Var = i01.c;
                String str = e5.a;
                synchronized (i90.b) {
                }
                zn znVar = zn.a;
                Set set = mt.a;
                if (!set.contains(zn.class)) {
                    try {
                        co coVarI = co.f.i();
                        if (!set.contains(coVarI)) {
                            try {
                                ((HashMap) coVarI.e).remove(Integer.valueOf(activity.hashCode()));
                            } catch (Throwable th) {
                                mt.a(coVarI, th);
                                return;
                            }
                            break;
                        }
                    } catch (Throwable th2) {
                        mt.a(zn.class, th2);
                        return;
                    }
                }
                break;
            case 1:
                activity.getClass();
                break;
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                activity.getClass();
                break;
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                break;
            default:
                activity.getClass();
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x008b A[Catch: all -> 0x0095, TryCatch #0 {all -> 0x0095, blocks: (B:19:0x0048, B:22:0x0051, B:24:0x005e, B:41:0x0088, B:42:0x008b, B:44:0x008f, B:27:0x0065, B:30:0x0070, B:32:0x0074, B:37:0x007c, B:39:0x0080), top: B:50:0x0048, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x008f A[Catch: all -> 0x0095, TRY_LEAVE, TryCatch #0 {all -> 0x0095, blocks: (B:19:0x0048, B:22:0x0051, B:24:0x005e, B:41:0x0088, B:42:0x008b, B:44:0x008f, B:27:0x0065, B:30:0x0070, B:32:0x0074, B:37:0x007c, B:39:0x0080), top: B:50:0x0048, inners: #2 }] */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        SensorManager sensorManager;
        switch (this.a) {
            case 0:
                activity.getClass();
                gp1 gp1Var = i01.c;
                String str = e5.a;
                synchronized (i90.b) {
                }
                AtomicInteger atomicInteger = e5.f;
                int i = 0;
                if (atomicInteger.decrementAndGet() < 0) {
                    atomicInteger.set(0);
                    Log.w(str, "Unexpected activity pause without a matching activity resume. Logging data may be incorrect. Make sure you call activateApp from your Application's onCreate method");
                }
                e5.a();
                long jCurrentTimeMillis = System.currentTimeMillis();
                String strK = h42.k(activity);
                zn znVar = zn.a;
                Set set = mt.a;
                if (!set.contains(zn.class)) {
                    try {
                        if (zn.f.get()) {
                            co.f.i().F(activity);
                            i62 i62Var = zn.d;
                            if (i62Var == null || set.contains(i62Var)) {
                                sensorManager = zn.c;
                                if (sensorManager != null) {
                                    sensorManager.unregisterListener(zn.b);
                                }
                            } else {
                                try {
                                    if (((Activity) i62Var.b.get()) != null) {
                                        try {
                                            Timer timer = i62Var.c;
                                            if (timer != null) {
                                                timer.cancel();
                                            }
                                            i62Var.c = null;
                                        } catch (Exception e) {
                                            Log.e(i62.e, "Error unscheduling indexing job", e);
                                        }
                                        sensorManager = zn.c;
                                        if (sensorManager != null) {
                                            sensorManager.unregisterListener(zn.b);
                                        }
                                    } else {
                                        sensorManager = zn.c;
                                        if (sensorManager != null) {
                                            sensorManager.unregisterListener(zn.b);
                                        }
                                    }
                                } catch (Throwable th) {
                                    mt.a(i62Var, th);
                                }
                            }
                            break;
                        }
                    } catch (Throwable th2) {
                        mt.a(zn.class, th2);
                    }
                }
                e5.b.execute(new c5(strK, jCurrentTimeMillis, i));
                break;
            case 1:
                activity.getClass();
                Adjust.onPause();
                break;
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                activity.getClass();
                break;
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                break;
            default:
                activity.getClass();
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        switch (this.a) {
            case 0:
                activity.getClass();
                gp1 gp1Var = i01.c;
                String str = e5.a;
                synchronized (i90.b) {
                }
                e5.l = new WeakReference(activity);
                e5.f.incrementAndGet();
                e5.a();
                long jCurrentTimeMillis = System.currentTimeMillis();
                e5.j = jCurrentTimeMillis;
                String strK = h42.k(activity);
                j62 j62Var = zn.b;
                zn znVar = zn.a;
                Set set = mt.a;
                if (!set.contains(zn.class)) {
                    try {
                        if (zn.f.get()) {
                            co.f.i().o(activity);
                            Context applicationContext = activity.getApplicationContext();
                            String strB = i90.b();
                            ja0 ja0VarB = ma0.b(strB);
                            if (ja0VarB == null || !ja0VarB.g) {
                                set.contains(znVar);
                            } else {
                                SensorManager sensorManager = (SensorManager) applicationContext.getSystemService("sensor");
                                if (sensorManager != null) {
                                    zn.c = sensorManager;
                                    Sensor defaultSensor = sensorManager.getDefaultSensor(1);
                                    i62 i62Var = new i62(activity);
                                    zn.d = i62Var;
                                    eg egVar = new eg(2, ja0VarB, strB);
                                    if (!set.contains(j62Var)) {
                                        try {
                                            j62Var.a = egVar;
                                        } catch (Throwable th) {
                                            mt.a(j62Var, th);
                                        }
                                    }
                                    sensorManager.registerListener(j62Var, defaultSensor, 2);
                                    if (ja0VarB.g) {
                                        i62Var.c();
                                    }
                                    break;
                                }
                            }
                            mt.a.contains(znVar);
                            break;
                        }
                    } catch (Throwable th2) {
                        mt.a(zn.class, th2);
                    }
                }
                r41 r41Var = r41.b;
                if (!mt.a.contains(r41.class)) {
                    try {
                        if (r41.c) {
                            CopyOnWriteArraySet copyOnWriteArraySet = w41.d;
                            if (!new HashSet(w41.a()).isEmpty()) {
                                HashMap map = x41.e;
                                vl0.w(activity);
                                break;
                            }
                        }
                    } catch (Exception unused) {
                    } catch (Throwable th3) {
                        mt.a(r41.class, th3);
                    }
                }
                wu1.d(activity);
                String str2 = e5.m;
                if (str2 != null) {
                    int i = 1;
                    if (StringsKt.t(str2, "ProxyBillingActivity") && !Intrinsics.areEqual(strK, "ProxyBillingActivity")) {
                        e5.c.execute(new g(i));
                    }
                }
                e5.b.execute(new w4(strK, jCurrentTimeMillis, activity.getApplicationContext()));
                e5.m = strK;
                break;
            case 1:
                activity.getClass();
                Adjust.onResume();
                break;
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                activity.getClass();
                wa waVarB = wa.c.b();
                if (waVarB != null) {
                    waVarB.i(activity);
                }
                break;
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                break;
            default:
                activity.getClass();
                try {
                    i90.c().execute(new g(15));
                } catch (Exception unused2) {
                    return;
                }
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        switch (this.a) {
            case 0:
                activity.getClass();
                bundle.getClass();
                gp1 gp1Var = i01.c;
                String str = e5.a;
                synchronized (i90.b) {
                    break;
                }
                break;
            case 1:
                activity.getClass();
                bundle.getClass();
                break;
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                activity.getClass();
                bundle.getClass();
                break;
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                break;
            default:
                activity.getClass();
                bundle.getClass();
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        switch (this.a) {
            case 0:
                activity.getClass();
                e5.k++;
                gp1 gp1Var = i01.c;
                String str = e5.a;
                synchronized (i90.b) {
                    break;
                }
                break;
            case 1:
                activity.getClass();
                break;
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                activity.getClass();
                wa waVarB = wa.c.b();
                if (waVarB != null) {
                    waVarB.i(activity);
                }
                break;
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                break;
            default:
                activity.getClass();
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        switch (this.a) {
            case 0:
                activity.getClass();
                gp1 gp1Var = i01.c;
                String str = e5.a;
                synchronized (i90.b) {
                }
                String str2 = pa.c;
                ri2 ri2Var = da.a;
                if (!mt.a.contains(da.class)) {
                    try {
                        da.b.execute(new g(6));
                    } catch (Throwable th) {
                        mt.a(da.class, th);
                    }
                }
                e5.k--;
                break;
            case 1:
                activity.getClass();
                break;
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                activity.getClass();
                break;
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                break;
            default:
                activity.getClass();
                try {
                    if (Intrinsics.areEqual(cp0.c, Boolean.TRUE) && Intrinsics.areEqual(activity.getLocalClassName(), "com.android.billingclient.api.ProxyBillingActivity")) {
                        i90.c().execute(new g(14));
                        break;
                    }
                } catch (Exception unused) {
                    return;
                }
                break;
        }
    }

    public /* synthetic */ d5(int i) {
        this.a = i;
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

    private final void a(Activity activity, Bundle bundle) {
    }

    private final void e(Activity activity, Bundle bundle) {
    }
}
