package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class yr0 extends bt0 {
    public final Function1 v;

    public yr0(Function1 function1) {
        this.v = function1;
    }

    @Override // defpackage.bt0
    public final boolean q() {
        return false;
    }

    @Override // defpackage.bt0
    public final void r(Throwable th) {
        this.v.invoke(th);
    }
}
