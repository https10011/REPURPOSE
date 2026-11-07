package defpackage;

import java.security.PrivilegedAction;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class qe0 implements PrivilegedAction {
    public final /* synthetic */ int a;

    @Override // java.security.PrivilegedAction
    public final Object run() {
        switch (this.a) {
            case 0:
                return new xe0();
            case 1:
                ThreadGroup threadGroup = Thread.currentThread().getThreadGroup();
                while (true) {
                    ThreadGroup parent = threadGroup.getParent();
                    if (parent == null) {
                        return new ThreadGroup(threadGroup, "InnocuousForkJoinWorkerThreadGroup");
                    }
                    threadGroup = parent;
                }
                break;
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                return System.getProperty("line.separator");
            default:
                return Boolean.valueOf(Boolean.getBoolean("java.util.secureRandomSeed"));
        }
    }
}
