package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class p51 extends o0 implements Runnable {
    public final Runnable v;

    public p51(Runnable runnable) {
        runnable.getClass();
        this.v = runnable;
    }

    @Override // defpackage.v0
    public final String j() {
        String strValueOf = String.valueOf(this.v);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 7);
        sb.append("task=[");
        sb.append(strValueOf);
        sb.append("]");
        return sb.toString();
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.v.run();
        } catch (Throwable th) {
            m(th);
            Object obj = mx1.a;
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            if (th instanceof Error) {
                throw ((Error) th);
            }
            sm0.n(th);
        }
    }
}
