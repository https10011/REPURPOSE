package defpackage;

import java.security.AccessControlContext;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public class ff0 extends Thread {
    public final xe0 a;
    public final we0 b;

    public ff0(xe0 xe0Var, ClassLoader classLoader, ThreadGroup threadGroup, AccessControlContext accessControlContext) {
        super(threadGroup, "aForkJoinWorkerThread");
        super.setContextClassLoader(classLoader);
        zv1.e(this, accessControlContext);
        zv1.a(this);
        this.a = xe0Var;
        this.b = xe0Var.t(this);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        xe0 xe0Var = this.a;
        we0 we0Var = this.b;
        if (we0Var.h == null) {
            try {
                xe0Var.w(we0Var);
                th = null;
            } catch (Throwable th) {
                th = th;
            }
            xe0Var.i(this, th);
        }
    }

    public ff0(xe0 xe0Var, ClassLoader classLoader) {
        super("aForkJoinWorkerThread");
        zv1.d(this, classLoader);
        this.a = xe0Var;
        this.b = xe0Var.t(this);
    }

    public void a() {
    }
}
