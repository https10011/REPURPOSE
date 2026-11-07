package defpackage;

import android.content.ClipData;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import androidx.activity.result.ActivityResult;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import com.adjust.sdk.Adjust;
import com.adjust.sdk.AdjustSessionSuccess;
import com.adjust.sdk.OnAdidReadListener;
import com.adjust.sdk.OnGoogleAdIdReadListener;
import com.adjust.sdk.OnSessionTrackingSucceededListener;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.appsflyer.internal.d;
import com.bumptech.glide.a;
import com.fm.openinstall.listener.AppInstallListener;
import com.fm.openinstall.model.AppData;
import com.fm.openinstall.model.Error;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.hjq.toast.BuildConfig;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.ScheduledFuture;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import kotlin.text.StringsKt;
import okhttp3.EventListener;
import prod.apptest.com.AppTestApp;
import prod.apptest.com.activity.X5_Activity;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final /* synthetic */ class ab implements OnSessionTrackingSucceededListener, OnGoogleAdIdReadListener, bv1, v71, OnSuccessListener, ca0, ij0, gx0, h5, qk, tv1, OnCompleteListener, AppInstallListener, EventListener.Factory {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ab(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.tv1
    public Object a() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 19:
                bl1 bl1Var = (bl1) ((ue2) obj).i;
                SQLiteDatabase sQLiteDatabaseA = bl1Var.a();
                sQLiteDatabaseA.beginTransaction();
                try {
                    sQLiteDatabaseA.compileStatement("DELETE FROM log_event_dropped").execute();
                    sQLiteDatabaseA.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + bl1Var.b.b()).execute();
                    sQLiteDatabaseA.setTransactionSuccessful();
                    return null;
                } finally {
                    sQLiteDatabaseA.endTransaction();
                }
            default:
                ep1 ep1Var = (ep1) obj;
                Iterator it = ((Iterable) ((bl1) ep1Var.c).e(new sm0(27))).iterator();
                while (it.hasNext()) {
                    ((ac2) ep1Var.d).N((ge) it.next(), 1, false);
                }
                return null;
        }
    }

    @Override // defpackage.h5
    public void b(Object obj) {
        ((us) this.b).invoke((ActivityResult) obj);
    }

    @Override // defpackage.gx0
    public ix0 c(er0 er0Var) {
        jw1 jw1Var = ((hx0) this.b).c;
        return jw1Var.b.a(g93.i(jw1Var.a, "openchat/v1", "terms/agreement"), jw1.a(er0Var), Collections.EMPTY_MAP, jw1.d);
    }

    public bl d(ac2 ac2Var) throws IOException {
        cl clVar = (cl) this.b;
        URL url = (URL) ac2Var.b;
        String strS = d42.s("CctTransportBackend");
        if (Log.isLoggable(strS, 4)) {
            Log.i(strS, String.format("Making request to: %s", url));
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(clVar.g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", "datatransport/3.1.9 android/");
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = (String) ac2Var.d;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    ox1 ox1Var = clVar.a;
                    kd kdVar = (kd) ac2Var.c;
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(gZIPOutputStream));
                    tt0 tt0Var = (tt0) ox1Var.a;
                    du0 du0Var = new du0(bufferedWriter, tt0Var.a, tt0Var.b, tt0Var.c, tt0Var.d);
                    du0Var.f(kdVar);
                    du0Var.h();
                    du0Var.b.flush();
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    Integer numValueOf = Integer.valueOf(responseCode);
                    String strS2 = d42.s("CctTransportBackend");
                    if (Log.isLoggable(strS2, 4)) {
                        Log.i(strS2, String.format("Status Code: %d", numValueOf));
                    }
                    d42.g("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
                    d42.g("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new bl(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                    if (responseCode != 200) {
                        return new bl(responseCode, null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream gZIPInputStream = "gzip".equals(httpURLConnection.getHeaderField("Content-Encoding")) ? new GZIPInputStream(inputStream) : inputStream;
                        try {
                            bl blVar = new bl(responseCode, null, wd.a(new BufferedReader(new InputStreamReader(gZIPInputStream))).a);
                            if (gZIPInputStream != null) {
                                gZIPInputStream.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return blVar;
                        } catch (Throwable th) {
                            if (gZIPInputStream == null) {
                                throw th;
                            }
                            try {
                                gZIPInputStream.close();
                                throw th;
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                                throw th;
                            }
                        }
                    } catch (Throwable th3) {
                        if (inputStream == null) {
                            throw th3;
                        }
                        try {
                            inputStream.close();
                            throw th3;
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                            throw th3;
                        }
                    }
                } catch (Throwable th5) {
                    try {
                        gZIPOutputStream.close();
                        throw th5;
                    } catch (Throwable th6) {
                        th5.addSuppressed(th6);
                        throw th5;
                    }
                }
            } catch (Throwable th7) {
                if (outputStream == null) {
                    throw th7;
                }
                try {
                    outputStream.close();
                    throw th7;
                } catch (Throwable th8) {
                    th7.addSuppressed(th8);
                    throw th7;
                }
            }
        } catch (ConnectException e) {
            e = e;
            d42.h(e, "CctTransportBackend", "Couldn't open connection, returning with 500");
            return new bl(500, null, 0L);
        } catch (UnknownHostException e2) {
            e = e2;
            d42.h(e, "CctTransportBackend", "Couldn't open connection, returning with 500");
            return new bl(500, null, 0L);
        } catch (IOException e3) {
            e = e3;
            d42.h(e, "CctTransportBackend", "Couldn't encode request, returning with 400");
            return new bl(400, null, 0L);
        } catch (l60 e4) {
            e = e4;
            d42.h(e, "CctTransportBackend", "Couldn't encode request, returning with 400");
            return new bl(400, null, 0L);
        }
    }

    @Override // defpackage.v71
    public Object e() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                Constructor constructor = (Constructor) obj;
                try {
                    return constructor.newInstance(null);
                } catch (IllegalAccessException e) {
                    ta taVar = rg1.a;
                    sm0.m("Unexpected IllegalAccessException occurred (Gson 2.14.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
                    return null;
                } catch (InstantiationException e2) {
                    throw new RuntimeException("Failed to invoke constructor '" + rg1.b(constructor) + "' with no args", e2);
                } catch (InvocationTargetException e3) {
                    sm0.m("Failed to invoke constructor '" + rg1.b(constructor) + "' with no args", e3.getCause());
                    return null;
                }
            default:
                Class cls = (Class) obj;
                try {
                    return d32.a.a(cls);
                } catch (Exception e4) {
                    throw new RuntimeException("Unable to create instance of " + cls + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e4);
                }
        }
    }

    @Override // defpackage.ca0
    public void f(boolean z) {
        String str = (String) this.b;
        if (z) {
            try {
                k70 k70Var = new k70(str);
                if ((k70Var.b == null || k70Var.c == null) ? false : true) {
                    zi0.C(k70Var.a, k70Var.toString());
                }
            } catch (Exception unused) {
            }
        }
    }

    public boolean g(pv2 pv2Var, int i, Bundle bundle) {
        InstallReferrerStateListener yrVar;
        o8 o8Var = (o8) this.b;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 25 && (i & 1) != 0) {
            try {
                ((jq0) pv2Var.a).e();
                Parcelable parcelable = (Parcelable) ((jq0) pv2Var.a).c();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception e) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e);
                return false;
            }
        }
        jq0 jq0Var = (jq0) pv2Var.a;
        ClipData clipData = new ClipData(jq0Var.a(), new ClipData.Item(jq0Var.d()));
        if (i2 >= 31) {
            yrVar = new gk1(clipData, 2);
        } else {
            yrVar = new yr();
            yrVar.b = clipData;
            yrVar.c = 2;
        }
        yrVar.e(jq0Var.g());
        yrVar.setExtras(bundle);
        return x52.j(o8Var, yrVar.build()) == null;
    }

    @Override // defpackage.bv1, defpackage.ij0
    public Object get() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                try {
                    return ((rm) obj).d();
                } catch (InterruptedException unused) {
                    return null;
                }
            case 10:
                return new d5((a) obj);
            default:
                try {
                    return ((zq1) obj).c();
                } catch (InterruptedException unused2) {
                    return null;
                }
        }
    }

    @Override // defpackage.qk
    public void onCancel() {
        ((ms1) this.b).a();
    }

    public void onComplete(Task task) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 20:
                qt.e((Intent) obj);
                break;
            case 21:
                ((ga2) obj).b.trySetResult((Object) null);
                break;
            default:
                ((ScheduledFuture) obj).cancel(false);
                break;
        }
    }

    public void onGoogleAdIdRead(final String str) {
        final mg mgVar = (mg) this.b;
        Adjust.getAdid(new OnAdidReadListener() { // from class: kg
            public final void onAdidRead(String str2) {
                String str3 = AppTestApp.f0;
                String str4 = str;
                if (ea.o(str4)) {
                    str4 = BuildConfig.FLAVOR;
                }
                if (ea.o(str2)) {
                    str2 = BuildConfig.FLAVOR;
                }
                mgVar.a.o0.loadUrl(ts.l(d.b("javascript:(function() { var e = new CustomEvent('adjust-init',{detail:{ad_app_token:'", str3, "',gps_adid:'", str4, "',ad_id:'"), str2, "'}}); document.dispatchEvent(e)})()"));
            }
        });
    }

    @Override // com.fm.openinstall.listener.AppInstallListener
    public void onInstallFinish(AppData appData, Error error) {
        X5_Activity x5_Activity = (X5_Activity) this.b;
        boolean z = X5_Activity.V0;
        if (error == null && appData != null) {
            new Handler(Looper.getMainLooper()).postDelayed(new zs0(8, x5_Activity, appData), 5000L);
        }
    }

    public void onSessionTrackingSucceeded(AdjustSessionSuccess adjustSessionSuccess) {
        AppTestApp appTestApp = (AppTestApp) this.b;
        String str = AppTestApp.e;
        if ((adjustSessionSuccess != null ? adjustSessionSuccess.adid : null) != null) {
            String str2 = adjustSessionSuccess.adid;
            str2.getClass();
            if (StringsKt.w(str2)) {
                return;
            }
            new Handler(Looper.getMainLooper()).postDelayed(new x4(9, appTestApp, adjustSessionSuccess), 5000L);
        }
    }

    public void onSuccess(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                ((fu) obj2).invoke(obj);
                break;
            case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                CredentialProviderPlayServicesImpl.$r8$lambda$wNyRQU4FRR3qZkFIXqBcIQRWXcc((tu) obj2, obj);
                break;
            default:
                ((ai0) obj2).invoke(obj);
                break;
        }
    }
}
