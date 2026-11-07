package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class l0 implements Runnable {
    public final v0 a;
    public final ListenableFuture b;

    public l0(v0 v0Var, ListenableFuture listenableFuture) {
        this.a = v0Var;
        this.b = listenableFuture;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.a != this) {
            return;
        }
        if (v0.f.d(this.a, this, v0.h(this.b))) {
            v0.e(this.a);
        }
    }
}
