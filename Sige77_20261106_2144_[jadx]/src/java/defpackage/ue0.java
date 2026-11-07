package defpackage;

import java.security.AccessControlContext;
import java.security.AccessController;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class ue0 implements te0 {
    public static final AccessControlContext a = xe0.b(xe0.Y, new RuntimePermission("enableContextClassLoaderOverride"), new RuntimePermission("modifyThreadGroup"), new RuntimePermission("getClassLoader"), new RuntimePermission("setContextClassLoader"));

    @Override // defpackage.te0
    public final ff0 a(xe0 xe0Var) {
        return (ff0) AccessController.doPrivileged(new re0(xe0Var, 1), a);
    }
}
