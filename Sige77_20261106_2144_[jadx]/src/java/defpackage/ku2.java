package defpackage;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class ku2 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ FirebaseAnalytics b;

    public /* synthetic */ ku2(FirebaseAnalytics firebaseAnalytics, int i) {
        this.a = i;
        this.b = firebaseAnalytics;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.a;
        FirebaseAnalytics firebaseAnalytics = this.b;
        switch (i) {
            case 0:
                b03 b03Var = firebaseAnalytics.a;
                b03Var.getClass();
                xw2 xw2Var = new xw2();
                b03Var.a(new ez2(b03Var, xw2Var, 5));
                return xw2Var.d(120000L);
            default:
                b03 b03Var2 = firebaseAnalytics.a;
                b03Var2.getClass();
                xw2 xw2Var2 = new xw2();
                b03Var2.a(new ez2(b03Var2, xw2Var2, 6));
                return (Long) xw2.D(xw2Var2.e(120000L), Long.class);
        }
    }
}
