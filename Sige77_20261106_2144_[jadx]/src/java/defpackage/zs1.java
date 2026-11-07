package defpackage;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class zs1 implements fs, gt {
    public final fs a;
    public final CoroutineContext b;

    public zs1(fs fsVar, CoroutineContext coroutineContext) {
        this.a = fsVar;
        this.b = coroutineContext;
    }

    @Override // defpackage.gt
    public final gt getCallerFrame() {
        fs fsVar = this.a;
        if (fsVar instanceof gt) {
            return (gt) fsVar;
        }
        return null;
    }

    @Override // defpackage.fs
    public final CoroutineContext getContext() {
        return this.b;
    }

    @Override // defpackage.fs
    public final void resumeWith(Object obj) {
        this.a.resumeWith(obj);
    }
}
