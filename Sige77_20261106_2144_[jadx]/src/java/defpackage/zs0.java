package defpackage;

import android.app.job.JobParameters;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.widget.EditText;
import com.facebook.AccessToken;
import com.facebook.login.i;
import com.fm.openinstall.model.AppData;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.hjq.toast.BuildConfig;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Timer;
import java.util.concurrent.CountDownLatch;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Charsets;
import prod.apptest.com.AppTestApp;
import prod.apptest.com.activity.X5_Activity;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final /* synthetic */ class zs0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ zs0(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        String string = null;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                int i2 = JobInfoSchedulerService.a;
                ((JobInfoSchedulerService) obj2).jobFinished((JobParameters) obj, false);
                break;
            case 1:
                i iVar = (i) obj2;
                Bundle bundle = (Bundle) obj;
                if (!mt.a.contains(i.class)) {
                    try {
                        iVar.b.q("fb_mobile_login_heartbeat", bundle);
                    } catch (Throwable th) {
                        mt.a(i.class, th);
                        return;
                    }
                    break;
                }
                break;
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                View view = (View) obj2;
                x41 x41Var = (x41) obj;
                if (!mt.a.contains(x41.class)) {
                    try {
                        if (view instanceof EditText) {
                            x41Var.b(view);
                        }
                    } catch (Throwable th2) {
                        mt.a(x41.class, th2);
                        return;
                    }
                    break;
                }
                break;
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                ((xi0) obj2).r((Typeface) obj);
                break;
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                ((gg) ((cu) obj2)).b((fi0) obj);
                break;
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                i62 i62Var = (i62) obj2;
                h62 h62Var = (h62) obj;
                try {
                    if (!mt.a.contains(i62.class)) {
                        try {
                            Timer timer = i62Var.c;
                            if (timer != null) {
                                timer.cancel();
                            }
                            i62Var.d = null;
                            Timer timer2 = new Timer();
                            timer2.scheduleAtFixedRate(h62Var, 0L, 1000L);
                            i62Var.c = timer2;
                        } catch (Exception e) {
                            Log.e(i62.e, "Error scheduling indexing job", e);
                            return;
                        }
                        break;
                    }
                } catch (Throwable th3) {
                    mt.a(i62.class, th3);
                    return;
                }
                break;
            case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                String str = (String) obj2;
                i62 i62Var2 = (i62) obj;
                if (!mt.a.contains(i62.class)) {
                    try {
                        str.getClass();
                        byte[] bytes = str.getBytes(Charsets.UTF_8);
                        bytes.getClass();
                        try {
                            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                            messageDigest.getClass();
                            messageDigest.update(bytes);
                            byte[] bArrDigest = messageDigest.digest();
                            StringBuilder sb = new StringBuilder();
                            bArrDigest.getClass();
                            for (byte b : bArrDigest) {
                                sb.append(Integer.toHexString((b >> 4) & 15));
                                sb.append(Integer.toHexString(b & 15));
                            }
                            string = sb.toString();
                        } catch (NoSuchAlgorithmException unused) {
                        }
                        Date date = AccessToken.Y;
                        AccessToken accessTokenT = aj0.t();
                        if (string == null || !Intrinsics.areEqual(string, i62Var2.d)) {
                            String str2 = i62.e;
                            i62Var2.b(ga.c(str, accessTokenT, i90.b()), string);
                        }
                    } catch (Throwable th4) {
                        mt.a(i62.class, th4);
                        return;
                    }
                    break;
                }
                break;
            case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                String str3 = (String) obj;
                str3.getClass();
                HashSet hashSet = t62.e;
                op0.w((String) obj2, str3, new float[0]);
                break;
            case oc1.BYTES_FIELD_NUMBER /* 8 */:
                boolean z = X5_Activity.V0;
                WebView webView = ((X5_Activity) obj2).o0;
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                webView.loadUrl(String.format("javascript:(function() { var e = new CustomEvent('openinstall-init',{detail:%s}); document.dispatchEvent(e)})()", Arrays.copyOf(new Object[]{((AppData) obj).getData()}, 1)));
                break;
            default:
                X5_Activity x5_Activity = (X5_Activity) obj2;
                x5_Activity.U0 = false;
                AppTestApp appTestApp = AppTestApp.w;
                appTestApp.getClass();
                appTestApp.f(BuildConfig.FLAVOR, false);
                x5_Activity.T0 = BuildConfig.FLAVOR;
                x5_Activity.D((CountDownLatch) obj);
                x5_Activity.z0.d();
                break;
        }
    }
}
