package defpackage;

import android.os.Handler;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class nc2 implements Runnable {
    public final Handler a;
    public Thread b;

    public nc2(Handler handler) {
        this.a = handler;
    }

    public abstract void a();

    public final String b() {
        return "Task-Athena-" + c();
    }

    public abstract String c();

    @Override // java.lang.Runnable
    public final void run() {
        Thread threadCurrentThread = Thread.currentThread();
        this.b = threadCurrentThread;
        String name = threadCurrentThread.getName();
        this.b.setName(b());
        try {
            a();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            hd2.a().e(this);
            this.b.setName(name);
        }
    }
}
