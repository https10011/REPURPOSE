package defpackage;

import java.security.AccessControlContext;
import java.security.AccessController;
import java.security.ProtectionDomain;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class ef0 extends ff0 {
    public static final ThreadGroup c = (ThreadGroup) AccessController.doPrivileged(new qe0(1));
    public static final AccessControlContext d = new AccessControlContext(new ProtectionDomain[]{new ProtectionDomain(null, null)});

    @Override // defpackage.ff0
    public final void a() {
        zv1.a(this);
    }

    @Override // java.lang.Thread
    public final void setContextClassLoader(ClassLoader classLoader) {
        if (classLoader != null && ClassLoader.getSystemClassLoader() != classLoader) {
            throw new SecurityException("setContextClassLoader");
        }
    }

    @Override // java.lang.Thread
    public final void setUncaughtExceptionHandler(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
    }
}
