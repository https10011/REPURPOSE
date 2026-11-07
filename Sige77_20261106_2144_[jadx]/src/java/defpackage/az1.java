package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class az1 implements Runnable {
    public static final Object i = new Object();
    public static Boolean v;
    public static Boolean w;
    public final /* synthetic */ int a;
    public final long b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public az1(yy1 yy1Var, Context context, e2 e2Var, long j) {
        this.a = 0;
        this.f = yy1Var;
        this.c = context;
        this.b = j;
        this.d = e2Var;
        this.e = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    public static boolean a(Context context) {
        boolean zBooleanValue;
        synchronized (i) {
            try {
                Boolean bool = w;
                Boolean boolValueOf = Boolean.valueOf(bool == null ? b(context, "android.permission.ACCESS_NETWORK_STATE", bool) : bool.booleanValue());
                w = boolValueOf;
                zBooleanValue = boolValueOf.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return zBooleanValue;
    }

    public static boolean b(Context context, String str, Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z = context.checkCallingOrSelfPermission(str) == 0;
        if (!z && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: " + str + ". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return z;
    }

    public static boolean c(Context context) {
        boolean zBooleanValue;
        synchronized (i) {
            try {
                Boolean bool = v;
                Boolean boolValueOf = Boolean.valueOf(bool == null ? b(context, "android.permission.WAKE_LOCK", bool) : bool.booleanValue());
                v = boolValueOf;
                zBooleanValue = boolValueOf.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return zBooleanValue;
    }

    public synchronized boolean d() {
        NetworkInfo activeNetworkInfo;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) ((Context) this.c).getSystemService("connectivity");
            activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        } catch (Throwable th) {
            throw th;
        }
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zC;
        int i2 = this.a;
        long j = this.b;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.f;
        Object obj4 = this.c;
        switch (i2) {
            case 0:
                yy1 yy1Var = (yy1) obj3;
                PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) obj;
                Context context = (Context) obj4;
                if (c(context)) {
                    wakeLock.acquire(180000L);
                }
                try {
                    yy1Var.d(true);
                    if (!((e2) obj2).d()) {
                        yy1Var.d(false);
                        if (!zC) {
                            return;
                        }
                    } else if (!a(context) || d()) {
                        if (yy1Var.e()) {
                            yy1Var.d(false);
                        } else {
                            yy1Var.f(j);
                        }
                        if (!zC) {
                            return;
                        }
                    } else {
                        new zy1(this, this).a();
                        if (!zC) {
                            return;
                        }
                    }
                } catch (IOException e) {
                    Log.e("FirebaseMessaging", "Failed to sync topics. Won't retry sync. " + e.getMessage());
                    yy1Var.d(false);
                    if (!zC) {
                        return;
                    }
                } finally {
                    if (c(context)) {
                        try {
                            wakeLock.release();
                        } catch (RuntimeException unused) {
                            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                        }
                        break;
                    }
                }
                try {
                    return;
                } catch (RuntimeException unused2) {
                    return;
                }
            case 1:
                String str = (String) obj2;
                g73 g73Var = (g73) obj3;
                String str2 = (String) obj4;
                if (str2 == null) {
                    if3 if3Var = g73Var.a;
                    if3Var.e().D();
                    String str3 = if3Var.t0;
                    if (str3 == null || str3.equals(str)) {
                        if3Var.t0 = str;
                        if3Var.s0 = null;
                        return;
                    }
                    return;
                }
                ja3 ja3Var = new ja3(j, (String) obj, str2);
                if3 if3Var2 = g73Var.a;
                if3Var2.e().D();
                String str4 = if3Var2.t0;
                if (str4 != null) {
                    str4.equals(str);
                }
                if3Var2.t0 = str;
                if3Var2.s0 = ja3Var;
                return;
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                ((w93) obj3).P(this.b, this.e, (String) obj4, (String) obj2);
                return;
            default:
                Bundle bundle = (Bundle) obj4;
                bundle.remove("screen_name");
                bundle.remove("screen_class");
                ua3 ua3Var = (ua3) obj3;
                qf3 qf3Var = ((y53) ua3Var.a).w;
                y53.j(qf3Var);
                ua3Var.K((ja3) obj2, (ja3) obj, this.b, true, qf3Var.O("screen_view", bundle, null, false));
                return;
        }
    }

    public az1(ua3 ua3Var, Bundle bundle, ja3 ja3Var, ja3 ja3Var2, long j) {
        this.a = 3;
        this.c = bundle;
        this.d = ja3Var;
        this.e = ja3Var2;
        this.b = j;
        Objects.requireNonNull(ua3Var);
        this.f = ua3Var;
    }

    public /* synthetic */ az1(Object obj, String str, String str2, Object obj2, long j, int i2) {
        this.a = i2;
        this.c = str;
        this.d = str2;
        this.e = obj2;
        this.b = j;
        this.f = obj;
    }
}
