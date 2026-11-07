package defpackage;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class ee2 {
    public static final ThreadPoolExecutor a;
    public static final ThreadPoolExecutor b;

    static {
        b00 b00Var = new b00(1);
        fe2 fe2Var = new fe2();
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(30);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 10, 10L, timeUnit, linkedBlockingQueue, b00Var, fe2Var);
        a = threadPoolExecutor;
        ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(3, 10, 10L, timeUnit, new LinkedBlockingQueue(30), b00Var, fe2Var);
        b = threadPoolExecutor2;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor2.allowCoreThreadTimeOut(true);
    }
}
