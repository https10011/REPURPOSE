package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class tj2 extends xj2 {
    public static final tj2 b = new tj2(yj2.a);
    public final AtomicReference a;

    public tj2(xj2 xj2Var) {
        this.a = new AtomicReference(xj2Var);
    }

    @Override // defpackage.xj2
    public final void a(String str, Level level, boolean z) {
        ((xj2) this.a.get()).a(str, level, z);
    }

    @Override // defpackage.xj2
    public final ek2 b() {
        return ((xj2) this.a.get()).b();
    }

    @Override // defpackage.xj2
    public final g93 c() {
        return ((xj2) this.a.get()).c();
    }
}
