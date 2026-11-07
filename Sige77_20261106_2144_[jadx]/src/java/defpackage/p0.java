package defpackage;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract /* synthetic */ class p0 {
    public static /* synthetic */ boolean a(Unsafe unsafe, v0 v0Var, long j, u0 u0Var, u0 u0Var2) {
        while (!unsafe.compareAndSwapObject(v0Var, j, u0Var, u0Var2)) {
            if (unsafe.getObject(v0Var, j) != u0Var) {
                return false;
            }
        }
        return true;
    }
}
