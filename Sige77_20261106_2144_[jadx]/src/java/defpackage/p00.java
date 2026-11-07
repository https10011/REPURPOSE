package defpackage;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class p00 extends p1 implements ScheduledFuture {
    public final ScheduledFuture v;

    public p00(o00 o00Var) {
        this.v = o00Var.b(new ox1(this));
    }

    @Override // defpackage.p1
    public final void c() {
        ScheduledFuture scheduledFuture = this.v;
        Object obj = this.a;
        scheduledFuture.cancel((obj instanceof j1) && ((j1) obj).a);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.v.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.v.getDelay(timeUnit);
    }
}
