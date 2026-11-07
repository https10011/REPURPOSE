package defpackage;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract /* synthetic */ class gp {
    public static /* synthetic */ boolean a(Unsafe unsafe, qp qpVar, long j, kp kpVar) {
        while (true) {
            Unsafe unsafe2 = unsafe;
            qp qpVar2 = qpVar;
            long j2 = j;
            kp kpVar2 = kpVar;
            if (unsafe2.compareAndSwapObject(qpVar2, j2, (Object) null, kpVar2)) {
                return true;
            }
            if (unsafe2.getObject(qpVar2, j2) != null) {
                return false;
            }
            unsafe = unsafe2;
            qpVar = qpVar2;
            j = j2;
            kpVar = kpVar2;
        }
    }
}
