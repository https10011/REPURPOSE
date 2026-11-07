package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class h80 extends g80 implements h00 {
    public final Executor c;

    public h80(Executor executor) {
        this.c = executor;
        if (executor instanceof ScheduledThreadPoolExecutor) {
            ((ScheduledThreadPoolExecutor) executor).setRemoveOnCancelPolicy(true);
        }
    }

    @Override // defpackage.h00
    public final void a(long j, pk pkVar) {
        Executor executor = this.c;
        ScheduledFuture<?> scheduledFutureSchedule = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            bh0 bh0Var = new bh0(14, this, pkVar);
            CoroutineContext coroutineContext = pkVar.e;
            try {
                scheduledFutureSchedule = scheduledExecutorService.schedule(bh0Var, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e);
                ws0 ws0Var = (ws0) coroutineContext.get(k42.c);
                if (ws0Var != null) {
                    ws0Var.cancel(cancellationException);
                }
            }
        }
        if (scheduledFutureSchedule != null) {
            pkVar.x(new jk(scheduledFutureSchedule, 0));
        } else {
            vy.Y.a(j, pkVar);
        }
    }

    @Override // defpackage.h00
    public final n20 b(long j, xx1 xx1Var, CoroutineContext coroutineContext) {
        Executor executor = this.c;
        ScheduledFuture<?> scheduledFutureSchedule = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFutureSchedule = scheduledExecutorService.schedule(xx1Var, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e);
                ws0 ws0Var = (ws0) coroutineContext.get(k42.c);
                if (ws0Var != null) {
                    ws0Var.cancel(cancellationException);
                }
            }
        }
        return scheduledFutureSchedule != null ? new m20(scheduledFutureSchedule) : vy.Y.b(j, xx1Var, coroutineContext);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.c;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    @Override // defpackage.ys
    public final void e(CoroutineContext coroutineContext, Runnable runnable) {
        try {
            this.c.execute(runnable);
        } catch (RejectedExecutionException e) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e);
            ws0 ws0Var = (ws0) coroutineContext.get(k42.c);
            if (ws0Var != null) {
                ws0Var.cancel(cancellationException);
            }
            sz szVar = i20.a;
            fz.c.e(coroutineContext, runnable);
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof h80) && ((h80) obj).c == this.c;
    }

    public final int hashCode() {
        return System.identityHashCode(this.c);
    }

    @Override // defpackage.ys
    public final String toString() {
        return this.c.toString();
    }
}
