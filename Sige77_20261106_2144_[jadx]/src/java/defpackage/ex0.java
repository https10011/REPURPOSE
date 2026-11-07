package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class ex0 extends ys implements h00 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater v = AtomicIntegerFieldUpdater.newUpdater(ex0.class, "runningWorkers$volatile");
    public final /* synthetic */ h00 c;
    public final ys d;
    public final int e;
    public final vz0 f;
    public final Object i;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX WARN: Multi-variable type inference failed */
    public ex0(ys ysVar, int i) {
        h00 h00Var = ysVar instanceof h00 ? (h00) ysVar : null;
        this.c = h00Var == null ? wy.a : h00Var;
        this.d = ysVar;
        this.e = i;
        this.f = new vz0();
        this.i = new Object();
    }

    @Override // defpackage.h00
    public final void a(long j, pk pkVar) {
        this.c.a(j, pkVar);
    }

    @Override // defpackage.h00
    public final n20 b(long j, xx1 xx1Var, CoroutineContext coroutineContext) {
        return this.c.b(j, xx1Var, coroutineContext);
    }

    @Override // defpackage.ys
    public final void e(CoroutineContext coroutineContext, Runnable runnable) {
        this.f.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = v;
        if (atomicIntegerFieldUpdater.get(this) < this.e) {
            synchronized (this.i) {
                if (atomicIntegerFieldUpdater.get(this) >= this.e) {
                    return;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
                Runnable runnableL = l();
                if (runnableL == null) {
                    return;
                }
                this.d.e(this, new bh0(11, this, runnableL, false));
            }
        }
    }

    public final Runnable l() {
        while (true) {
            Runnable runnable = (Runnable) this.f.d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.i) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = v;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    @Override // defpackage.ys
    public final String toString() {
        return this.d + ".limitedParallelism(" + this.e + ')';
    }
}
