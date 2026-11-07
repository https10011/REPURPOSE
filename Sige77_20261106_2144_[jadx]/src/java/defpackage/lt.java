package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class lt implements Thread.UncaughtExceptionHandler {
    public static final k42 b = new k42(4);
    public static lt c;
    public final Thread.UncaughtExceptionHandler a;

    public lt(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.a = uncaughtExceptionHandler;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        thread.getClass();
        th.getClass();
        Throwable th2 = null;
        loop0: for (Throwable cause = th; cause != null && cause != th2; cause = cause.getCause()) {
            StackTraceElement[] stackTrace = cause.getStackTrace();
            stackTrace.getClass();
            for (StackTraceElement stackTraceElement : stackTrace) {
                stackTraceElement.getClass();
                if (zi0.q(stackTraceElement)) {
                    xi0.g(th);
                    yi0.c(th, sq0.d).b();
                    break loop0;
                }
            }
            th2 = cause;
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.a;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }
}
