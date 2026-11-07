package defpackage;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract /* synthetic */ class q0 {
    public static /* synthetic */ boolean a(Unsafe unsafe, v0 v0Var, long j, j0 j0Var, j0 j0Var2) {
        while (!unsafe.compareAndSwapObject(v0Var, j, j0Var, j0Var2)) {
            if (unsafe.getObject(v0Var, j) != j0Var) {
                return false;
            }
        }
        return true;
    }
}
