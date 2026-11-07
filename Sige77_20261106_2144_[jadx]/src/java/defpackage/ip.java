package defpackage;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract /* synthetic */ class ip {
    public static /* synthetic */ boolean a(Unsafe unsafe, qp qpVar, long j, Object obj, np npVar) {
        while (!unsafe.compareAndSwapObject(qpVar, j, obj, npVar)) {
            if (unsafe.getObject(qpVar, j) != obj) {
                return false;
            }
        }
        return true;
    }
}
