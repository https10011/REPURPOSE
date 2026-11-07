package prod.apptest.com.activity;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import android.widget.TextView;
import com.fm.openinstall.OpenInstall;
import com.hjq.toast.BuildConfig;
import com.hjq.toast.ToastUtils;
import defpackage.ab;
import defpackage.b6;
import defpackage.bg;
import defpackage.cf1;
import defpackage.df1;
import defpackage.ea;
import defpackage.f6;
import defpackage.ga;
import defpackage.j10;
import defpackage.kv;
import defpackage.mz0;
import defpackage.oc1;
import defpackage.ox1;
import defpackage.qp;
import defpackage.qt;
import defpackage.ra2;
import defpackage.rm;
import defpackage.sf;
import defpackage.v92;
import defpackage.w92;
import defpackage.x92;
import defpackage.xe0;
import defpackage.y00;
import defpackage.y92;
import defpackage.yg;
import defpackage.zi0;
import defpackage.zq1;
import java.util.Date;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import prod.apptest.com.AppTestApp;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lprod/apptest/com/activity/X5_Activity;", "Lyg;", "<init>", "()V", "app_release"}, k = 1, mv = {oc1.FLOAT_FIELD_NUMBER, oc1.FLOAT_FIELD_NUMBER, 0}, xi = 48)
public final class X5_Activity extends yg {
    public static boolean V0;
    public String T0;
    public boolean U0;

    public static Uri C(Uri uri, String str, String str2) {
        if (str2 == null) {
            return uri;
        }
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        Uri.Builder builderClearQuery = uri.buildUpon().clearQuery();
        boolean z = false;
        for (String str3 : queryParameterNames) {
            builderClearQuery.appendQueryParameter(str3, Intrinsics.areEqual(str3, str) ? str2 : uri.getQueryParameter(str3));
            if (Intrinsics.areEqual(str3, str)) {
                z = true;
            }
        }
        if (!z) {
            builderClearQuery.appendQueryParameter(str, str2);
        }
        Uri uriBuild = builderClearQuery.build();
        uriBuild.getClass();
        return uriBuild;
    }

    public static String E(String str, String str2) {
        if (!AppTestApp.c0) {
            str = y00.k(str, "/m/index.html");
        }
        Uri uriC = Uri.parse(str);
        String str3 = AppTestApp.d0;
        if (str3 != null && (!StringsKt.w(str3))) {
            String str4 = AppTestApp.d0;
            str4.getClass();
            uriC = C(uriC, "affiliateCode", str4);
        }
        String str5 = AppTestApp.i0;
        if (str5 != null && (!StringsKt.w(str5))) {
            String str6 = AppTestApp.i0;
            str6.getClass();
            uriC = C(uriC, "fbPixelId", str6);
        }
        String str7 = AppTestApp.j0;
        if (str7 != null && (!StringsKt.w(str7))) {
            String str8 = AppTestApp.j0;
            str8.getClass();
            uriC = C(uriC, "tid", str8);
        }
        if (ea.q(str2) && !Intrinsics.areEqual(str2, "0")) {
            uriC = C(uriC, "gaid", str2);
        }
        if (ea.q(AppTestApp.k0) && !Intrinsics.areEqual(AppTestApp.k0, "0")) {
            uriC = C(uriC, "snowBallAppId", AppTestApp.k0);
        }
        String string = uriC.toString();
        string.getClass();
        return string;
    }

    @Override // defpackage.yg
    public final boolean B() {
        return true;
    }

    public final void D(CountDownLatch countDownLatch) {
        if (AppTestApp.c0) {
            zq1 zq1Var = new zq1(this, countDownLatch);
            ra2 ra2Var = new ra2(this, countDownLatch, 0);
            Activity activityA = zq1Var.a();
            if (activityA != null) {
                ToastUtils.show(activityA.getResources().getText(2131886433));
            }
            ab abVar = new ab(zq1Var, 16);
            Executor executor = zq1.d;
            if (qp.d || executor != xe0.Z) {
                executor.getClass();
            } else {
                executor = qp.e;
            }
            qp.b(executor, abVar).h(ra2Var, zq1.e);
            return;
        }
        rm rmVar = new rm(this, countDownLatch);
        ra2 ra2Var2 = new ra2(this, countDownLatch, 1);
        Activity activityA2 = rmVar.a();
        if (activityA2 != null) {
            ToastUtils.show(activityA2.getResources().getText(2131886433));
        }
        ab abVar2 = new ab(rmVar, 3);
        Executor executor2 = rm.e;
        if (qp.d || executor2 != xe0.Z) {
            executor2.getClass();
        } else {
            executor2 = qp.e;
        }
        qp.b(executor2, abVar2).h(ra2Var2, rm.f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void F(CountDownLatch countDownLatch) {
        if (isFinishing() || this.U0) {
            return;
        }
        int i = 1;
        this.U0 = true;
        new j10((ContextWrapper) this);
        String strValueOf = String.valueOf(j10.b);
        String strSubstring = strValueOf.substring(0, 4);
        String strSubstring2 = strValueOf.substring(strValueOf.length() - 4);
        IntRange intRange = new IntRange(100, 10000, 1);
        cf1 cf1Var = df1.a;
        cf1Var.getClass();
        try {
            String str = ga.w(cf1Var, intRange) + "-" + strSubstring + "-" + strSubstring2;
            qt.q("user retry test line, trackId: ".concat(str));
            Resources resources = getResources();
            f6 f6Var = new f6((Context) this);
            b6 b6Var = (b6) f6Var.c;
            b6Var.c = R.drawable.ic_delete;
            b6Var.e = resources.getString(2131886340);
            b6Var.g = resources.getString(2131886195) + " (" + str + ")";
            b6Var.n = false;
            bg bgVar = new bg(this, countDownLatch, i);
            b6Var.h = b6Var.a.getText(2131886369);
            b6Var.i = bgVar;
            f6Var.a().show();
        } catch (IllegalArgumentException e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }

    @Override // defpackage.yg
    public final int h() {
        return 2131492895;
    }

    @Override // defpackage.yg
    public final int i() {
        return 2131296506;
    }

    @Override // defpackage.yg
    public final boolean l() {
        return AppTestApp.c0;
    }

    @Override // defpackage.yg
    public final boolean m() {
        return true;
    }

    @Override // defpackage.yg
    public final boolean n() {
        return true;
    }

    @Override // defpackage.yg
    public final boolean o() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.yg, defpackage.p7
    public final void onConfigurationChanged(Configuration configuration) {
        zi0 w92Var;
        configuration.getClass();
        super.onConfigurationChanged(configuration);
        Window window = getWindow();
        ox1 ox1Var = new ox1(getWindow().getDecorView());
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            w92Var = new y92(window, ox1Var);
        } else if (i >= 30) {
            w92Var = new x92(window, ox1Var);
        } else {
            w92Var = i >= 26 ? new w92(window, ox1Var) : new v92(window, ox1Var);
        }
        if (configuration.orientation == 2) {
            w92Var.p(519);
            w92Var.z();
        } else {
            w92Var.A(519);
        }
        q();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.yg
    public final void onCreate(Bundle bundle) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        AppTestApp appTestApp = AppTestApp.w;
        appTestApp.getClass();
        SharedPreferences sharedPreferences = appTestApp.b;
        sharedPreferences.getClass();
        this.T0 = sharedPreferences.getString(AppTestApp.i, BuildConfig.FLAVOR);
        D(countDownLatch);
        super.onCreate(bundle);
        countDownLatch.countDown();
        if (ea.q(this.T0)) {
            AppTestApp appTestApp2 = AppTestApp.w;
            appTestApp2.getClass();
            SharedPreferences sharedPreferences2 = appTestApp2.b;
            sharedPreferences2.getClass();
            long j = sharedPreferences2.getLong(AppTestApp.v, -1L);
            long time = new Date().getTime();
            String strE = null;
            if (j == -1 || time - j >= 86400000) {
                this.T0 = null;
            } else {
                String str = this.T0;
                if (str != null) {
                    AppTestApp appTestApp3 = AppTestApp.w;
                    appTestApp3.getClass();
                    strE = E(str, appTestApp3.b());
                }
                this.n0 = false;
                this.A0 = strE;
                k();
            }
        }
        if (Intrinsics.areEqual("0", AppTestApp.g0)) {
            return;
        }
        kv.E("OpenInstall.init");
        OpenInstall.init(getApplicationContext());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.yg
    public final void p(boolean z) {
        NetworkInfo activeNetworkInfo;
        this.z0.a();
        Resources resources = getResources();
        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService("connectivity");
        if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnectedOrConnecting()) {
            V0 = false;
            this.o0.post(new sf(this, 16));
            F(new CountDownLatch(0));
        }
        if (V0) {
            return;
        }
        if (!z) {
            this.o0.post(new sf(this, 16));
            F(new CountDownLatch(0));
            return;
        }
        V0 = true;
        ToastUtils.show(resources.getText(2131886209));
        mz0 mz0Var = this.z0;
        mz0Var.j = 2L;
        CharSequence text = getResources().getText(2131886271);
        text.getClass();
        mz0Var.g = (String) text;
        mz0Var.a.a();
        mz0Var.c();
        mz0Var.e.setDrawDynamic(mz0Var.i);
        mz0Var.e.setVisibility(0);
        String str = mz0Var.g;
        TextView textView = mz0Var.d;
        if (str == null) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            mz0Var.d.setText(mz0Var.g);
        }
        getWindow().setBackgroundDrawableResource(2131100651);
        if (Intrinsics.areEqual("0", AppTestApp.g0)) {
            return;
        }
        OpenInstall.getInstall(new ab(this, 24));
    }

    @Override // defpackage.yg
    public final boolean u() {
        return false;
    }

    @Override // defpackage.yg
    public final boolean y() {
        return true;
    }
}
