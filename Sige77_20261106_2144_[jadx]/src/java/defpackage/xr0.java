package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class xr0 extends bt0 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater w = AtomicIntegerFieldUpdater.newUpdater(xr0.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile = 0;
    public final Function1 v;

    public xr0(Function1 function1) {
        this.v = function1;
    }

    @Override // defpackage.bt0
    public final boolean q() {
        return true;
    }

    @Override // defpackage.bt0
    public final void r(Throwable th) {
        if (w.compareAndSet(this, 0, 1)) {
            this.v.invoke(th);
        }
    }
}
