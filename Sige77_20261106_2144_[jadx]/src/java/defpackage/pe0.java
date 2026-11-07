package defpackage;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract /* synthetic */ class pe0 {
    public static /* synthetic */ boolean a(Unsafe unsafe, Object obj, long j, Object obj2) {
        while (true) {
            Unsafe unsafe2 = unsafe;
            Object obj3 = obj;
            long j2 = j;
            Object obj4 = obj2;
            if (unsafe2.compareAndSwapObject(obj3, j2, obj4, (Object) null)) {
                return true;
            }
            if (unsafe2.getObject(obj3, j2) != obj4) {
                return false;
            }
            unsafe = unsafe2;
            obj = obj3;
            j = j2;
            obj2 = obj4;
        }
    }
}
