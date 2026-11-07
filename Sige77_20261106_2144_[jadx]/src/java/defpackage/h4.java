package defpackage;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class h4 implements ThreadFactory {
    public static final /* synthetic */ h4 b = new h4(4);
    public final /* synthetic */ int a;

    public /* synthetic */ h4(int i) {
        this.a = i;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.a) {
            case 0:
                return new Thread(new g4(runnable, 0), "glide-active-resources");
            case 1:
                return new fj0(runnable);
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                return new di1(runnable);
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                Thread thread = new Thread(runnable, "Athena Dispatcher");
                thread.setDaemon(false);
                return thread;
            default:
                Object obj = y93.j;
                return new Thread(runnable, "ProcessStablePhenotypeFlag");
        }
    }
}
