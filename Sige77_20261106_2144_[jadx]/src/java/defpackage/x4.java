package defpackage;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.view.Window;
import android.webkit.WebView;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.fragment.app.c;
import com.adjust.sdk.ActivityHandler;
import com.adjust.sdk.AdjustConfig;
import com.adjust.sdk.AdjustSessionSuccess;
import com.adjust.sdk.AdjustThirdPartySharing;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.material.datepicker.g;
import com.google.android.material.textfield.TextInputLayout;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.firebase.messaging.FirebaseMessaging;
import com.hjq.toast.BuildConfig;
import com.hjq.toast.ToastUtils;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.StringCompanionObject;
import prod.apptest.com.AppTestApp;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final /* synthetic */ class x4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ x4(ArrayList arrayList, ms1 ms1Var, a00 a00Var) {
        this.a = 23;
        this.b = arrayList;
        this.c = ms1Var;
    }

    /* JADX WARN: Type inference failed for: r1v34, types: [android.content.Context, p7, yg] */
    @Override // java.lang.Runnable
    public final void run() {
        sm0 sm0Var;
        int i = 0;
        switch (this.a) {
            case 0:
                ActivityHandler.U((AdjustThirdPartySharing) this.c, (ActivityHandler) this.b);
                return;
            case 1:
                ActivityHandler.g((ActivityHandler) this.b, (AdjustConfig) this.c);
                return;
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                yo yoVar = (yo) this.b;
                ListenableFuture listenableFuture = (ListenableFuture) this.c;
                try {
                    if (!listenableFuture.isCancelled()) {
                        try {
                            try {
                                dh0.b(listenableFuture);
                            } catch (Throwable th) {
                                yoVar.r(th);
                            }
                        } catch (ExecutionException e) {
                            yoVar.r(e.getCause());
                        }
                        break;
                    } else {
                        yoVar.Y = null;
                        yoVar.cancel(false);
                    }
                    yoVar.q(null);
                    return;
                } catch (Throwable th2) {
                    yoVar.q(null);
                    throw th2;
                }
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                ((yo) this.b).q((wn0) this.c);
                return;
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                x7 x7Var = (x7) this.b;
                try {
                    ((Runnable) this.c).run();
                    return;
                } finally {
                    x7Var.a();
                }
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                w1 w1Var = (w1) this.b;
                z9 z9Var = (z9) this.c;
                if (mt.a.contains(da.class)) {
                    return;
                }
                try {
                    w1Var.getClass();
                    ri2 ri2Var = da.a;
                    synchronized (ri2Var) {
                        fp1 fp1VarK = ri2Var.k(w1Var);
                        if (fp1VarK != null) {
                            fp1VarK.a(z9Var);
                        }
                        break;
                    }
                    String str = pa.c;
                    if (qh1.p() != 2 && da.a.h() > 100) {
                        da.d(5);
                        return;
                    } else {
                        if (da.c == null) {
                            da.c = da.b.schedule(da.d, 15L, TimeUnit.SECONDS);
                            return;
                        }
                        return;
                    }
                } catch (Throwable th3) {
                    mt.a(da.class, th3);
                    return;
                }
            case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                w1 w1Var2 = (w1) this.b;
                fp1 fp1Var = (fp1) this.c;
                if (mt.a.contains(da.class)) {
                    return;
                }
                try {
                    ea.u(w1Var2, fp1Var);
                    return;
                } catch (Throwable th4) {
                    mt.a(da.class, th4);
                    return;
                }
            case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                Integer num = (Integer) this.b;
                List list = (List) this.c;
                list.getClass();
                if (CollectionsKt.n(oa.a, num) || !CollectionsKt.n(oa.b, num)) {
                    return;
                }
                if (oa.e >= 5) {
                    oa.a().clear();
                    oa.e = 0;
                    return;
                } else {
                    oa.a().addAll(0, list);
                    oa.e++;
                    return;
                }
            case oc1.BYTES_FIELD_NUMBER /* 8 */:
                Context context = (Context) this.b;
                pa paVar = (pa) this.c;
                Bundle bundle = new Bundle();
                String[] strArr = {"com.facebook.core.Core", "com.facebook.login.Login", "com.facebook.share.Share", "com.facebook.places.Places", "com.facebook.messenger.Messenger", "com.facebook.applinks.AppLinks", "com.facebook.marketing.Marketing", "com.facebook.gamingservices.GamingServices", "com.facebook.all.All", "com.android.billingclient.api.BillingClient", "com.android.vending.billing.IInAppBillingService"};
                String[] strArr2 = {"core_lib_included", "login_lib_included", "share_lib_included", "places_lib_included", "messenger_lib_included", "applinks_lib_included", "marketing_lib_included", "gamingservices_lib_included", "all_lib_included", "billing_client_lib_included", "billing_service_lib_included"};
                int i2 = 0;
                for (int i3 = 0; i3 < 11; i3++) {
                    String str2 = strArr[i3];
                    String str3 = strArr2[i3];
                    try {
                        Class.forName(str2);
                        bundle.putInt(str3, 1);
                        i2 |= 1 << i3;
                    } catch (ClassNotFoundException unused) {
                    }
                }
                SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
                if (sharedPreferences.getInt("kitsBitmask", 0) != i2) {
                    sharedPreferences.edit().putInt("kitsBitmask", i2).apply();
                    paVar.g("fb_sdk_initialize", bundle);
                    return;
                }
                return;
            case 9:
                AppTestApp appTestApp = (AppTestApp) this.b;
                AdjustSessionSuccess adjustSessionSuccess = (AdjustSessionSuccess) this.c;
                WebView webView = appTestApp.d;
                if (webView != null) {
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    String str4 = AppTestApp.f0;
                    String str5 = adjustSessionSuccess.adid;
                    if (ea.o(str5)) {
                        str5 = BuildConfig.FLAVOR;
                    }
                    webView.loadUrl(String.format("javascript:(function() { var e = new CustomEvent('adjust-init',{detail:{ad_app_token:'%s',ad_id:'%s'}}); document.dispatchEvent(e)})()", Arrays.copyOf(new Object[]{str4, str5}, 2)));
                    return;
                }
                return;
            case 10:
                ?? r1 = (yg) this.b;
                File file = (File) this.c;
                int i4 = yg.MODE_SONIC_WITH_OFFLINE_CACHE;
                r1.sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", Uri.fromFile(file)));
                ToastUtils.show(r1.getResources().getText(2131886372));
                return;
            case 11:
                rg rgVar = (rg) this.b;
                int color = Color.parseColor((String) this.c);
                c cVar = rgVar.a;
                boolean z = (((Color.blue(color) * 15) + ((Color.green(color) * 75) + (Color.red(color) * 38))) >> 7) > 225;
                Window window = cVar.getWindow();
                if ((window.getAttributes().flags & 1024) <= 0) {
                    window.clearFlags(67108864);
                    window.addFlags(Integer.MIN_VALUE);
                    window.setStatusBarColor(color);
                    View viewFindViewById = window.findViewById(R.id.content);
                    if (viewFindViewById != null) {
                        viewFindViewById.setForeground(null);
                    }
                    cx0.a.h(window, z);
                    return;
                }
                return;
            case 12:
                String str6 = (String) this.b;
                Bundle bundle2 = (Bundle) this.c;
                if (mt.a.contains(xn.class)) {
                    return;
                }
                try {
                    str6.getClass();
                    Context contextA = i90.a();
                    contextA.getClass();
                    new pa(contextA, (String) null).d(str6, bundle2);
                    return;
                } catch (Throwable th5) {
                    mt.a(xn.class, th5);
                    return;
                }
            case 13:
                ba1 ba1Var = (ba1) this.b;
                zd1 zd1Var = (zd1) this.c;
                if (ba1Var.b != ba1.d) {
                    uq1.q("provide() can be called only once.");
                    return;
                }
                synchronized (ba1Var) {
                    sm0Var = ba1Var.a;
                    ba1Var.a = null;
                    ba1Var.b = zd1Var;
                    break;
                }
                sm0Var.getClass();
                return;
            case 14:
                bw0 bw0Var = (bw0) this.b;
                zd1 zd1Var2 = (zd1) this.c;
                synchronized (bw0Var) {
                    try {
                        if (bw0Var.b == null) {
                            bw0Var.a.add(zd1Var2);
                        } else {
                            bw0Var.b.add(zd1Var2.get());
                        }
                    } catch (Throwable th6) {
                        throw th6;
                    }
                }
                return;
            case 15:
                ((gg) ((hu) this.b).d()).b((fi0) this.c);
                return;
            case 16:
                ((gg) ((hu) this.b).d()).a(((Ref.ObjectRef) this.c).element);
                return;
            case 17:
                ((gg) ((hu) this.b).d()).a((zh0) this.c);
                return;
            case 18:
                ((gg) ((cu) this.b)).a(this.c);
                return;
            case 19:
                CredentialProviderPlayServicesImpl.$r8$lambda$EfEsA0oxTYc7AqOZZSNy2cLCz-o((cu) this.b, (Ref.ObjectRef) this.c);
                return;
            case 20:
                CredentialProviderPlayServicesImpl.$r8$lambda$AS0yfz0pVQO1Ewzm5zGeHqWtm6I((cu) this.b, (Exception) this.c);
                return;
            case 21:
                pv pvVar = (pv) this.b;
                Runnable runnable = (Runnable) this.c;
                Process.setThreadPriority(pvVar.c);
                StrictMode.ThreadPolicy threadPolicy = pvVar.d;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                runnable.run();
                return;
            case 22:
                g gVar = (g) this.b;
                String str7 = (String) this.c;
                TextInputLayout textInputLayout = gVar.a;
                SimpleDateFormat simpleDateFormat = gVar.c;
                Context context2 = textInputLayout.getContext();
                textInputLayout.setError(context2.getString(2131886301) + "\n" + String.format(context2.getString(2131886303), str7.replace(' ', (char) 160)) + "\n" + String.format(context2.getString(2131886302), simpleDateFormat.format(new Date(y32.f().getTimeInMillis())).replace(' ', (char) 160)));
                gVar.a();
                return;
            case 23:
                ArrayList arrayList = (ArrayList) this.b;
                ms1 ms1Var = (ms1) this.c;
                if (arrayList.contains(ms1Var)) {
                    arrayList.remove(ms1Var);
                    View view = ms1Var.c.t0;
                    int i5 = ms1Var.a;
                    view.getClass();
                    ck1.c(view, i5);
                    return;
                }
                return;
            case 24:
                Callable callable = (Callable) this.b;
                p00 p00Var = (p00) ((ox1) this.c).a;
                try {
                    p00Var.j(callable.call());
                    return;
                } catch (Exception e2) {
                    p00Var.k(e2);
                    return;
                }
            case 25:
                ((aa0) this.b).a((Intent) this.c);
                return;
            case 26:
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.b;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.c;
                try {
                    taskCompletionSource.setResult(firebaseMessaging.a());
                    return;
                } catch (Exception e3) {
                    taskCompletionSource.setException(e3);
                    return;
                }
            case 27:
                String str8 = (String) this.b;
                n72 n72Var = (n72) this.c;
                Log.e("FragmentStrictMode", "Policy violation with PENALTY_DEATH in ".concat(str8), n72Var);
                throw n72Var;
            case 28:
                ArrayList arrayList2 = (ArrayList) this.b;
                ok0 ok0Var = (ok0) this.c;
                ok0Var.getClass();
                int size = arrayList2.size();
                int i6 = 0;
                while (i6 < size) {
                    Object obj = arrayList2.get(i6);
                    i6++;
                    Pair pair = (Pair) obj;
                    ik0 ik0Var = (ik0) pair.first;
                    Object obj2 = pair.second;
                    obj2.getClass();
                    ik0Var.a((pk0) obj2);
                }
                ArrayList arrayList3 = ok0Var.d;
                int size2 = arrayList3.size();
                while (i < size2) {
                    Object obj3 = arrayList3.get(i);
                    i++;
                    ((d2) obj3).a.run();
                }
                return;
            default:
                pn0 pn0Var = (pn0) this.b;
                TaskCompletionSource taskCompletionSource2 = (TaskCompletionSource) this.c;
                try {
                    taskCompletionSource2.setResult(pn0Var.a());
                    return;
                } catch (Exception e4) {
                    taskCompletionSource2.setException(e4);
                    return;
                }
        }
    }

    public /* synthetic */ x4(yo yoVar, ListenableFuture listenableFuture, int i) {
        this.a = 2;
        this.b = yoVar;
        this.c = listenableFuture;
    }

    public /* synthetic */ x4(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
