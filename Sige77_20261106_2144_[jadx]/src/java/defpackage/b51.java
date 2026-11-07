package defpackage;

import java.util.ArrayDeque;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class b51 extends z01 {
    @Override // defpackage.z01
    public final void c(Object obj, Object obj2) {
        c51 c51Var = (c51) obj;
        c51Var.getClass();
        ArrayDeque arrayDeque = c51.b;
        synchronized (arrayDeque) {
            arrayDeque.offer(c51Var);
        }
    }
}
