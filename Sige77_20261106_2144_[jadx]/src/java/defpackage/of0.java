package defpackage;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class of0 extends vx1 {
    public vx1 e;

    public of0(vx1 vx1Var) {
        vx1Var.getClass();
        this.e = vx1Var;
    }

    @Override // defpackage.vx1
    public final vx1 a() {
        return this.e.a();
    }

    @Override // defpackage.vx1
    public final vx1 b() {
        return this.e.b();
    }

    @Override // defpackage.vx1
    public final long c() {
        return this.e.c();
    }

    @Override // defpackage.vx1
    public final vx1 d(long j) {
        return this.e.d(j);
    }

    @Override // defpackage.vx1
    public final boolean e() {
        return this.e.e();
    }

    @Override // defpackage.vx1
    public final void f() throws InterruptedIOException {
        this.e.f();
    }

    @Override // defpackage.vx1
    public final vx1 g(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.e.g(j, timeUnit);
    }
}
