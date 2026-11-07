package defpackage;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract /* synthetic */ class oe0 {
    public static /* synthetic */ boolean a(Unsafe unsafe, Object obj, long j, df0 df0Var) {
        while (true) {
            Unsafe unsafe2 = unsafe;
            Object obj2 = obj;
            long j2 = j;
            df0 df0Var2 = df0Var;
            if (unsafe2.compareAndSwapObject(obj2, j2, df0Var2, (Object) null)) {
                return true;
            }
            if (unsafe2.getObject(obj2, j2) != df0Var2) {
                return false;
            }
            unsafe = unsafe2;
            obj = obj2;
            j = j2;
            df0Var = df0Var2;
        }
    }
}
