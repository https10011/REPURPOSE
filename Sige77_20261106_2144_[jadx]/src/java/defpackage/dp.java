package defpackage;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract /* synthetic */ class dp {
    public static /* synthetic */ boolean a(Unsafe unsafe, np npVar, long j, np npVar2, np npVar3) {
        while (!unsafe.compareAndSwapObject(npVar, j, npVar2, npVar3)) {
            if (unsafe.getObject(npVar, j) != npVar2) {
                return false;
            }
        }
        return true;
    }
}
