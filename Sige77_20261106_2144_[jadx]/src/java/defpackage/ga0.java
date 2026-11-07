package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import kotlin.jvm.internal.StringCompanionObject;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final /* synthetic */ class ga0 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Context b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    public /* synthetic */ ga0(Context context, String str, String str2) {
        this.b = context;
        this.c = str;
        this.d = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        JSONObject jSONObject;
        final int i = 0;
        switch (this.a) {
            case 0:
                String str = this.c;
                Context context = this.b;
                String str2 = this.d;
                ha0 ha0Var = ha0.a;
                JSONObject jSONObjectA = ha0.a();
                if (jSONObjectA.length() != 0) {
                    ha0.e(str, jSONObjectA);
                    context.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).edit().putString(str2, jSONObjectA.toString()).apply();
                    ha0.e = Long.valueOf(System.currentTimeMillis());
                }
                ha0.f();
                ha0.b.set(false);
                return;
            default:
                Context context2 = this.b;
                String str3 = this.c;
                String str4 = this.d;
                ma0 ma0Var = ma0.a;
                context2.getClass();
                SharedPreferences sharedPreferences = context2.getSharedPreferences("com.facebook.internal.preferences.APP_SETTINGS", 0);
                ja0 ja0VarE = null;
                String string = sharedPreferences.getString(str3, null);
                if (!h42.x(string)) {
                    if (string == null) {
                        uq1.q("Required value was null.");
                        return;
                    }
                    try {
                        jSONObject = new JSONObject(string);
                    } catch (JSONException unused) {
                        i90 i90Var = i90.a;
                        jSONObject = null;
                    }
                    if (jSONObject != null) {
                        ja0VarE = ma0.e(str4, jSONObject);
                    }
                    break;
                }
                JSONObject jSONObjectA2 = ma0.a();
                ma0.e(str4, jSONObjectA2);
                sharedPreferences.edit().putString(str3, jSONObjectA2.toString()).apply();
                final int i2 = 1;
                if (ja0VarE != null) {
                    String str5 = ja0VarE.i;
                    if (!ma0.f && str5 != null && str5.length() > 0) {
                        ma0.f = true;
                        Log.w("ma0", str5);
                    }
                }
                ha0 ha0Var2 = ha0.a;
                JSONObject jSONObjectA3 = ha0.a();
                Context contextA = i90.a();
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                contextA.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).edit().putString(String.format("com.facebook.internal.APP_GATEKEEPERS.%s", Arrays.copyOf(new Object[]{str4}, 1)), jSONObjectA3.toString()).apply();
                ha0.e(str4, jSONObjectA3);
                ox1 ox1Var = ie.a;
                Context contextA2 = i90.a();
                final String strB = i90.b();
                if (x32.c()) {
                    if (contextA2 instanceof Application) {
                        Application application = (Application) contextA2;
                        String str6 = pa.c;
                        if (!i90.q.get()) {
                            throw new d90("The Facebook sdk must be initialized before calling activateApp");
                        }
                        if (!k6.c) {
                            if (pa.b() == null) {
                                qh1.s();
                            }
                            ScheduledThreadPoolExecutor scheduledThreadPoolExecutorB = pa.b();
                            if (scheduledThreadPoolExecutorB == null) {
                                uq1.q("Required value was null.");
                                return;
                            }
                            scheduledThreadPoolExecutorB.execute(new g(4));
                        }
                        t32 t32Var = t32.a;
                        if (!mt.a.contains(t32.class)) {
                            try {
                                if (!t32.c.get()) {
                                    t32.a.b();
                                    break;
                                }
                            } catch (Throwable th) {
                                mt.a(t32.class, th);
                            }
                        }
                        Set set = mt.a;
                        if (!set.contains(i90.class)) {
                            try {
                                final Context applicationContext = application.getApplicationContext();
                                if (applicationContext != null) {
                                    if (!ha0.b("app_events_killswitch", i90.b(), false)) {
                                        i90.c().execute(new Runnable() { // from class: h90
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i) {
                                                    case 0:
                                                        Context context3 = applicationContext;
                                                        String str7 = strB;
                                                        i90 i90Var2 = i90.a;
                                                        if (mt.a.contains(i90Var2)) {
                                                            return;
                                                        }
                                                        try {
                                                            nc ncVarT = kv.t(context3);
                                                            SharedPreferences sharedPreferences2 = context3.getSharedPreferences("com.facebook.sdk.attributionTracking", 0);
                                                            String strConcat = str7.concat("ping");
                                                            long j = sharedPreferences2.getLong(strConcat, 0L);
                                                            try {
                                                                JSONObject jSONObjectA4 = ra.a(qa.a, ncVarT, yv2.w(context3), i90.f(context3), context3);
                                                                String str8 = pa.c;
                                                                String strQ = qh1.q();
                                                                if (strQ != null) {
                                                                    jSONObjectA4.put("install_referrer", strQ);
                                                                }
                                                                StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                                                                String str9 = String.format("%s/activities", Arrays.copyOf(new Object[]{str7}, 1));
                                                                i90.t.getClass();
                                                                String str10 = mk0.j;
                                                                mk0 mk0VarP = vl0.p(null, str9, jSONObjectA4, null);
                                                                if (j == 0 && mk0VarP.c().c == null) {
                                                                    SharedPreferences.Editor editorEdit = sharedPreferences2.edit();
                                                                    editorEdit.putLong(strConcat, System.currentTimeMillis());
                                                                    editorEdit.apply();
                                                                    gp1 gp1Var = i01.c;
                                                                    synchronized (i90.b) {
                                                                    }
                                                                    return;
                                                                }
                                                                return;
                                                            } catch (JSONException e) {
                                                                throw new d90("An error occurred while publishing install.", e);
                                                            }
                                                        } catch (Exception unused2) {
                                                            return;
                                                        } catch (Throwable th2) {
                                                            mt.a(i90Var2, th2);
                                                            return;
                                                        }
                                                    default:
                                                        Context context4 = applicationContext;
                                                        String str11 = strB;
                                                        Set set2 = mt.a;
                                                        if (set2.contains(b91.class)) {
                                                            return;
                                                        }
                                                        try {
                                                            SharedPreferences sharedPreferences3 = context4.getSharedPreferences("com.facebook.sdk.attributionTracking", 0);
                                                            String strConcat2 = str11.concat("pingForOnDevice");
                                                            if (sharedPreferences3.getLong(strConcat2, 0L) == 0) {
                                                                sh1 sh1Var = sh1.b;
                                                                if (!set2.contains(sh1.class)) {
                                                                    try {
                                                                        sh1.b.h(str11, x50.a, 1);
                                                                    } catch (Throwable th3) {
                                                                        mt.a(sh1.class, th3);
                                                                    }
                                                                    break;
                                                                }
                                                                SharedPreferences.Editor editorEdit2 = sharedPreferences3.edit();
                                                                editorEdit2.putLong(strConcat2, System.currentTimeMillis());
                                                                editorEdit2.apply();
                                                                return;
                                                            }
                                                            return;
                                                        } catch (Throwable th4) {
                                                            mt.a(b91.class, th4);
                                                            return;
                                                        }
                                                }
                                            }
                                        });
                                    }
                                    if (fa0.b(da0.OnDeviceEventProcessing) && b91.a() && !set.contains(b91.class)) {
                                        try {
                                            final Context contextA3 = i90.a();
                                            if (contextA3 != null) {
                                                i90.c().execute(new Runnable() { // from class: h90
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        switch (i2) {
                                                            case 0:
                                                                Context context3 = contextA3;
                                                                String str7 = strB;
                                                                i90 i90Var2 = i90.a;
                                                                if (mt.a.contains(i90Var2)) {
                                                                    return;
                                                                }
                                                                try {
                                                                    nc ncVarT = kv.t(context3);
                                                                    SharedPreferences sharedPreferences2 = context3.getSharedPreferences("com.facebook.sdk.attributionTracking", 0);
                                                                    String strConcat = str7.concat("ping");
                                                                    long j = sharedPreferences2.getLong(strConcat, 0L);
                                                                    try {
                                                                        JSONObject jSONObjectA4 = ra.a(qa.a, ncVarT, yv2.w(context3), i90.f(context3), context3);
                                                                        String str8 = pa.c;
                                                                        String strQ = qh1.q();
                                                                        if (strQ != null) {
                                                                            jSONObjectA4.put("install_referrer", strQ);
                                                                        }
                                                                        StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                                                                        String str9 = String.format("%s/activities", Arrays.copyOf(new Object[]{str7}, 1));
                                                                        i90.t.getClass();
                                                                        String str10 = mk0.j;
                                                                        mk0 mk0VarP = vl0.p(null, str9, jSONObjectA4, null);
                                                                        if (j == 0 && mk0VarP.c().c == null) {
                                                                            SharedPreferences.Editor editorEdit = sharedPreferences2.edit();
                                                                            editorEdit.putLong(strConcat, System.currentTimeMillis());
                                                                            editorEdit.apply();
                                                                            gp1 gp1Var = i01.c;
                                                                            synchronized (i90.b) {
                                                                            }
                                                                            return;
                                                                        }
                                                                        return;
                                                                    } catch (JSONException e) {
                                                                        throw new d90("An error occurred while publishing install.", e);
                                                                    }
                                                                } catch (Exception unused2) {
                                                                    return;
                                                                } catch (Throwable th2) {
                                                                    mt.a(i90Var2, th2);
                                                                    return;
                                                                }
                                                            default:
                                                                Context context4 = contextA3;
                                                                String str11 = strB;
                                                                Set set2 = mt.a;
                                                                if (set2.contains(b91.class)) {
                                                                    return;
                                                                }
                                                                try {
                                                                    SharedPreferences sharedPreferences3 = context4.getSharedPreferences("com.facebook.sdk.attributionTracking", 0);
                                                                    String strConcat2 = str11.concat("pingForOnDevice");
                                                                    if (sharedPreferences3.getLong(strConcat2, 0L) == 0) {
                                                                        sh1 sh1Var = sh1.b;
                                                                        if (!set2.contains(sh1.class)) {
                                                                            try {
                                                                                sh1.b.h(str11, x50.a, 1);
                                                                            } catch (Throwable th3) {
                                                                                mt.a(sh1.class, th3);
                                                                            }
                                                                            break;
                                                                        }
                                                                        SharedPreferences.Editor editorEdit2 = sharedPreferences3.edit();
                                                                        editorEdit2.putLong(strConcat2, System.currentTimeMillis());
                                                                        editorEdit2.apply();
                                                                        return;
                                                                    }
                                                                    return;
                                                                } catch (Throwable th4) {
                                                                    mt.a(b91.class, th4);
                                                                    return;
                                                                }
                                                        }
                                                    }
                                                });
                                            }
                                        } catch (Throwable th2) {
                                            mt.a(b91.class, th2);
                                        }
                                    }
                                    break;
                                }
                            } catch (Throwable th3) {
                                mt.a(i90.class, th3);
                            }
                        }
                        e5.c(application, strB);
                        if (fa0.b(da0.GPSPACAProcessing)) {
                            ia1 ia1Var = ia1.a;
                            if (!mt.a.contains(ia1Var)) {
                                try {
                                    if (!ia1.d) {
                                        ia1.a();
                                    }
                                    if (ia1.c) {
                                        ia1Var.b(strB, "fb_mobile_app_install");
                                        break;
                                    }
                                } catch (Throwable th4) {
                                    mt.a(ia1Var, th4);
                                }
                            }
                        }
                        if (fa0.b(da0.GPSARATriggers)) {
                            ek0.a.d(strB, new z9("unknown", "MOBILE_INSTALL_EVENT", null, null, false, e5.k == 0, e5.b(), null));
                        }
                    } else {
                        Log.w("ie", "Automatic logging of basic events will not happen, because FacebookSdk.getApplicationContext() returns object that is not instance of android.app.Application. Make sure you call FacebookSdk.sdkInitialize() from Application class and pass application context.");
                    }
                }
                ma0.d.set(ma0.c.containsKey(str4) ? la0.c : la0.d);
                ma0Var.j();
                return;
        }
    }

    public /* synthetic */ ga0(String str, Context context, String str2) {
        this.c = str;
        this.b = context;
        this.d = str2;
    }
}
