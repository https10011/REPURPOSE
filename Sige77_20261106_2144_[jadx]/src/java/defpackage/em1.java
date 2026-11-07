package defpackage;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public class em1 extends e0 implements gt {
    public final fs f;

    public em1(fs fsVar, CoroutineContext coroutineContext) {
        super(coroutineContext, true);
        this.f = fsVar;
    }

    @Override // defpackage.lt0
    public final boolean C() {
        return true;
    }

    @Override // defpackage.lt0
    public void g(Object obj) {
        yi0.o(sr0.b(this.f), r93.T(obj));
    }

    @Override // defpackage.gt
    public final gt getCallerFrame() {
        fs fsVar = this.f;
        if (fsVar instanceof gt) {
            return (gt) fsVar;
        }
        return null;
    }

    @Override // defpackage.lt0
    public void h(Object obj) {
        this.f.resumeWith(r93.T(obj));
    }
}
