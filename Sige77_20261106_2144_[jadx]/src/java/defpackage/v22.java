package defpackage;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class v22 extends ys {
    public static final v22 c = new v22();

    @Override // defpackage.ys
    public final void e(CoroutineContext coroutineContext, Runnable runnable) {
        sz.d.c.b(runnable, true);
    }

    @Override // defpackage.ys
    public final ys j(int i) {
        g93.l(i);
        return i >= pw1.d ? this : super.j(i);
    }

    @Override // defpackage.ys
    public final String toString() {
        return "Dispatchers.IO";
    }
}
