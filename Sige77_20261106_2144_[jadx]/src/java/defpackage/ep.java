package defpackage;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract /* synthetic */ class ep {
    public static /* synthetic */ boolean a(Unsafe unsafe, qp qpVar, long j, np npVar, np npVar2) {
        while (!unsafe.compareAndSwapObject(qpVar, j, npVar, npVar2)) {
            if (unsafe.getObject(qpVar, j) != npVar) {
                return false;
            }
        }
        return true;
    }
}
