package defpackage;

import com.hjq.toast.BuildConfig;
import java.util.concurrent.CountDownLatch;
import kotlin.jvm.internal.Intrinsics;
import prod.apptest.com.activity.X5_Activity;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final /* synthetic */ class ra2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ X5_Activity b;
    public final /* synthetic */ CountDownLatch c;

    public /* synthetic */ ra2(X5_Activity x5_Activity, CountDownLatch countDownLatch, int i) {
        this.a = i;
        this.b = x5_Activity;
        this.c = countDownLatch;
    }

    public final void a(Object obj) {
        int i = this.a;
        String str = BuildConfig.FLAVOR;
        CountDownLatch countDownLatch = this.c;
        X5_Activity x5_Activity = this.b;
        sx0 sx0Var = (sx0) obj;
        switch (i) {
            case 0:
                boolean z = X5_Activity.V0;
                sx0Var.getClass();
                String str2 = sx0Var.a;
                if (!Intrinsics.areEqual(str2, "NA")) {
                    str = str2;
                }
                str.getClass();
                String str3 = sx0Var.b;
                if (!ea.o(str)) {
                    if (!Intrinsics.areEqual(str, x5_Activity.T0)) {
                        String strE = X5_Activity.E(str, str3);
                        x5_Activity.n0 = false;
                        x5_Activity.A0 = strE;
                        x5_Activity.k();
                        break;
                    }
                } else {
                    x5_Activity.F(countDownLatch);
                    break;
                }
                break;
            default:
                boolean z2 = X5_Activity.V0;
                sx0Var.getClass();
                String str4 = sx0Var.a;
                if (!Intrinsics.areEqual(str4, "NA")) {
                    str = str4;
                }
                str.getClass();
                String str5 = sx0Var.b;
                if (!ea.o(str)) {
                    if (!Intrinsics.areEqual(str, x5_Activity.T0)) {
                        String strE2 = X5_Activity.E(str, str5);
                        x5_Activity.n0 = false;
                        x5_Activity.A0 = strE2;
                        x5_Activity.k();
                        break;
                    }
                } else {
                    x5_Activity.F(countDownLatch);
                    break;
                }
                break;
        }
    }
}
