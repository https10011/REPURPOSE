package defpackage;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract /* synthetic */ class r0 {
    public static /* synthetic */ boolean a(Unsafe unsafe, v0 v0Var, long j, Object obj, Object obj2) {
        while (!unsafe.compareAndSwapObject(v0Var, j, obj, obj2)) {
            if (unsafe.getObject(v0Var, j) != obj) {
                return false;
            }
        }
        return true;
    }
}
