package defpackage;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class ds implements et {
    public final CoroutineContext a;

    public ds(CoroutineContext coroutineContext) {
        this.a = coroutineContext;
    }

    @Override // defpackage.et
    public final CoroutineContext b() {
        return this.a;
    }

    public final String toString() {
        return "CoroutineScope(coroutineContext=" + this.a + ')';
    }
}
