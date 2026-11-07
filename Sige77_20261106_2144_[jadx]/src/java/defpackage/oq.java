package defpackage;

import android.os.Build;
import android.os.StrictMode;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.Collections;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final /* synthetic */ class oq implements zd1 {
    public final /* synthetic */ int a;

    @Override // defpackage.zd1
    public final Object get() {
        switch (this.a) {
            case 0:
                return Collections.EMPTY_SET;
            case 1:
                wv0 wv0Var = ExecutorsRegistrar.a;
                StrictMode.ThreadPolicy.Builder builderDetectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
                builderDetectNetwork.detectResourceMismatches();
                if (Build.VERSION.SDK_INT >= 26) {
                    builderDetectNetwork.detectUnbufferedIo();
                }
                return new n00(Executors.newFixedThreadPool(4, new pv("Firebase Background", 10, builderDetectNetwork.penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.d.get());
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                wv0 wv0Var2 = ExecutorsRegistrar.a;
                return new n00(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new pv("Firebase Lite", 0, new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.d.get());
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                wv0 wv0Var3 = ExecutorsRegistrar.a;
                return new n00(Executors.newCachedThreadPool(new pv("Firebase Blocking", 11, null)), (ScheduledExecutorService) ExecutorsRegistrar.d.get());
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                wv0 wv0Var4 = ExecutorsRegistrar.a;
                return Executors.newSingleThreadScheduledExecutor(new pv("Firebase Scheduler", 0, null));
            default:
                return null;
        }
    }
}
