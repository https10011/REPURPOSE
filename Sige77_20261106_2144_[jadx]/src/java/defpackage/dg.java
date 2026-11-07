package defpackage;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.c;
import com.appsflyer.internal.AFa1tSDK;
import com.appsflyer.internal.AFd1wSDK;
import com.appsflyer.internal.AFi1aSDK;
import com.appsflyer.internal.AFj1rSDK;
import com.facebook.FacebookRequestError;
import com.facebook.login.CustomTabLoginMethodHandler;
import com.facebook.login.LoginClient;
import com.facebook.login.NativeAppLoginMethodHandler;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.IOException;
import java.lang.reflect.Proxy;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Logger;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final /* synthetic */ class dg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ dg(tz tzVar, ge geVar, uq1 uq1Var, od odVar) {
        this.a = 4;
        this.b = tzVar;
        this.c = geVar;
        this.d = odVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                c cVar = (yg) this.b;
                ProgressDialog progressDialog = (ProgressDialog) this.c;
                String str = (String) this.d;
                int i = yg.MODE_SONIC_WITH_OFFLINE_CACHE;
                new x20(progressDialog, cVar, str).run();
                return;
            case 1:
                CustomTabLoginMethodHandler customTabLoginMethodHandler = (CustomTabLoginMethodHandler) this.b;
                LoginClient.Request request = (LoginClient.Request) this.c;
                Bundle bundle = (Bundle) this.d;
                try {
                    customTabLoginMethodHandler.j(bundle, request);
                    customTabLoginMethodHandler.v(request, bundle, (d90) null);
                    return;
                } catch (d90 e) {
                    customTabLoginMethodHandler.v(request, (Bundle) null, e);
                    return;
                }
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                f91 f91Var = (f91) this.b;
                ak akVar = (ak) this.c;
                gj1 gj1Var = (gj1) this.d;
                ny nyVar = (ny) f91Var.c;
                if (nyVar.b.e()) {
                    akVar.r(nyVar, new IOException("Canceled"));
                    return;
                } else {
                    akVar.n(nyVar, gj1Var);
                    return;
                }
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                ((ak) this.c).r((ny) ((f91) this.b).c, (Throwable) this.d);
                return;
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                tz tzVar = (tz) this.b;
                ge geVar = (ge) this.c;
                String str2 = geVar.a;
                od odVar = (od) this.d;
                tzVar.getClass();
                Logger logger = tz.f;
                try {
                    c02 c02VarA = tzVar.c.a(str2);
                    if (c02VarA == null) {
                        String str3 = "Transport backend '" + str2 + "' is not registered";
                        logger.warning(str3);
                        new IllegalArgumentException(str3);
                    } else {
                        tzVar.e.l(new rz(tzVar, geVar, ((cl) c02VarA).a(odVar), 0));
                    }
                    return;
                } catch (Exception e2) {
                    logger.warning("Error scheduling event " + e2.getMessage());
                    return;
                }
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                a00 a00Var = (a00) this.b;
                View view = (View) this.c;
                wz wzVar = (wz) this.d;
                a00Var.a.endViewTransition(view);
                wzVar.h();
                return;
            case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                gk1 gk1Var = (gk1) this.b;
                kv kvVar = (kv) this.c;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.d;
                try {
                    de0 de0VarQ = rq0.q((Context) gk1Var.b);
                    if (de0VarQ == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    ce0 ce0Var = (ce0) ((e50) de0VarQ.b);
                    synchronized (ce0Var.d) {
                        ce0Var.f = threadPoolExecutor;
                        break;
                    }
                    ((e50) de0VarQ.b).d(new g50(kvVar, threadPoolExecutor));
                    return;
                } catch (Throwable th) {
                    kvVar.U(th);
                    threadPoolExecutor.shutdown();
                    return;
                }
            case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                z60 z60Var = (z60) this.b;
                Intent intent = (Intent) this.c;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.d;
                try {
                    z60Var.handleIntent(intent);
                    return;
                } finally {
                    taskCompletionSource.setResult((Object) null);
                }
            case oc1.BYTES_FIELD_NUMBER /* 8 */:
                kp0 kp0Var = (kp0) this.b;
                rp0 rp0Var = (rp0) this.c;
                Runnable runnable = (Runnable) this.d;
                if (mt.a.contains(kp0.class)) {
                    return;
                }
                try {
                    Class cls = kp0Var.f;
                    sp0.s(kp0Var.b, kp0Var.j, kp0Var.d(), rp0Var.a, Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new ip0(kp0Var, rp0Var, runnable)));
                    return;
                } catch (Throwable th2) {
                    mt.a(kp0.class, th2);
                    return;
                }
            case 9:
                lp0 lp0Var = (lp0) this.b;
                rp0 rp0Var2 = (rp0) this.c;
                Runnable runnable2 = (Runnable) this.d;
                if (mt.a.contains(lp0.class)) {
                    return;
                }
                try {
                    Class cls2 = lp0Var.o;
                    sp0.s(lp0Var.b, lp0Var.q, lp0Var.d(), lp0Var.g(rp0Var2), Proxy.newProxyInstance(cls2.getClassLoader(), new Class[]{cls2}, new fd(lp0Var, new Object[]{rp0Var2, runnable2}, 2)));
                    return;
                } catch (Throwable th3) {
                    mt.a(lp0.class, th3);
                    return;
                }
            case 10:
                NativeAppLoginMethodHandler nativeAppLoginMethodHandler = (NativeAppLoginMethodHandler) this.b;
                LoginClient.Request request2 = (LoginClient.Request) this.c;
                Bundle bundle2 = (Bundle) this.d;
                try {
                    nativeAppLoginMethodHandler.j(bundle2, request2);
                    nativeAppLoginMethodHandler.u(bundle2, request2);
                    return;
                } catch (j90 e3) {
                    FacebookRequestError facebookRequestError = e3.b;
                    nativeAppLoginMethodHandler.s(request2, facebookRequestError.d, facebookRequestError.a(), String.valueOf(facebookRequestError.b));
                    return;
                } catch (d90 e4) {
                    nativeAppLoginMethodHandler.s(request2, (String) null, e4.getMessage(), (String) null);
                    return;
                }
            case 11:
                AFa1tSDK.g((AFa1tSDK) this.b, (Context) this.c, (Intent) this.d);
                return;
            case 12:
                AFd1wSDK.a((AFd1wSDK) this.b, (Throwable) this.c, (String) this.d);
                return;
            default:
                AFj1rSDK.e((AFj1rSDK) this.b, (AFi1aSDK) this.c, (Runnable) this.d);
                return;
        }
    }

    public /* synthetic */ dg(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
