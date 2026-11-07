package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.firebase.messaging.FirebaseMessaging;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final /* synthetic */ class xy1 implements Callable {
    public final /* synthetic */ Context a;
    public final /* synthetic */ ScheduledThreadPoolExecutor b;
    public final /* synthetic */ FirebaseMessaging c;
    public final /* synthetic */ e2 d;
    public final /* synthetic */ qp0 e;

    public /* synthetic */ xy1(Context context, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor, FirebaseMessaging firebaseMessaging, e2 e2Var, qp0 qp0Var) {
        this.a = context;
        this.b = scheduledThreadPoolExecutor;
        this.c = firebaseMessaging;
        this.d = e2Var;
        this.e = qp0Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        wy1 wy1Var;
        Context context = this.a;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.b;
        FirebaseMessaging firebaseMessaging = this.c;
        e2 e2Var = this.d;
        qp0 qp0Var = this.e;
        synchronized (wy1.class) {
            try {
                WeakReference weakReference = wy1.b;
                wy1 wy1Var2 = weakReference != null ? (wy1) weakReference.get() : null;
                if (wy1Var2 == null) {
                    SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
                    wy1Var = new wy1();
                    synchronized (wy1Var) {
                        wy1Var.a = co.t(sharedPreferences, scheduledThreadPoolExecutor);
                    }
                    wy1.b = new WeakReference(wy1Var);
                } else {
                    wy1Var = wy1Var2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return new yy1(firebaseMessaging, e2Var, wy1Var, qp0Var, context, scheduledThreadPoolExecutor);
    }
}
