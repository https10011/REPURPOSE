package defpackage;

import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class f80 extends AtomicReference implements Executor, Runnable {
    public static final /* synthetic */ int e = 0;
    public md2 a;
    public Executor b;
    public Runnable c;
    public Thread d;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (get() == e80.b) {
            this.b = null;
            this.a = null;
            return;
        }
        this.d = Thread.currentThread();
        try {
            md2 md2Var = this.a;
            Objects.requireNonNull(md2Var);
            ac2 ac2Var = (ac2) md2Var.b;
            if (((Thread) ac2Var.b) == this.d) {
                this.a = null;
                if (((Runnable) ac2Var.c) != null) {
                    throw new IllegalStateException();
                }
                ac2Var.c = runnable;
                Executor executor = this.b;
                Objects.requireNonNull(executor);
                ac2Var.d = executor;
                this.b = null;
            } else {
                Executor executor2 = this.b;
                Objects.requireNonNull(executor2);
                this.b = null;
                this.c = runnable;
                executor2.execute(this);
            }
            this.d = null;
        } catch (Throwable th) {
            this.d = null;
            throw th;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Executor executor;
        Thread threadCurrentThread = Thread.currentThread();
        if (threadCurrentThread != this.d) {
            Runnable runnable = this.c;
            Objects.requireNonNull(runnable);
            this.c = null;
            runnable.run();
            return;
        }
        ac2 ac2Var = new ac2(23);
        ac2Var.b = threadCurrentThread;
        md2 md2Var = this.a;
        Objects.requireNonNull(md2Var);
        md2Var.b = ac2Var;
        this.a = null;
        try {
            Runnable runnable2 = this.c;
            Objects.requireNonNull(runnable2);
            this.c = null;
            runnable2.run();
            while (true) {
                Runnable runnable3 = (Runnable) ac2Var.c;
                if (runnable3 == null || (executor = (Executor) ac2Var.d) == null) {
                    break;
                }
                ac2Var.c = null;
                ac2Var.d = null;
                executor.execute(runnable3);
            }
            ac2Var.b = null;
        } catch (Throwable th) {
            ac2Var.b = null;
            throw th;
        }
    }
}
