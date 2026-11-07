package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class cc implements Runnable {
    public static Handler f;
    public final /* synthetic */ hi2 e;
    public volatile int b = 1;
    public final AtomicBoolean c = new AtomicBoolean();
    public final AtomicBoolean d = new AtomicBoolean();
    public final k51 a = new k51(this, new a20(this, 1));

    public cc(hi2 hi2Var) {
        this.e = hi2Var;
    }

    public final void a(Object obj) {
        Handler handler;
        synchronized (cc.class) {
            try {
                if (f == null) {
                    f = new Handler(Looper.getMainLooper());
                }
                handler = f;
            } catch (Throwable th) {
                throw th;
            }
        }
        handler.post(new bh0(12, this, obj, false));
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.e.b();
    }
}
