package defpackage;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class q53 extends Thread {
    public final Object a;
    public final BlockingQueue b;
    public boolean c = false;
    public final /* synthetic */ t53 d;

    public q53(t53 t53Var, String str, BlockingQueue blockingQueue) {
        this.d = t53Var;
        gu2.o(blockingQueue);
        this.a = new Object();
        this.b = blockingQueue;
        setName(str);
    }

    public final void a() {
        t53 t53Var = this.d;
        synchronized (t53Var.w) {
            try {
                if (!this.c) {
                    t53Var.W.release();
                    t53Var.w.notifyAll();
                    if (this == t53Var.c) {
                        t53Var.c = null;
                    } else if (this == t53Var.d) {
                        t53Var.d = null;
                    } else {
                        c33 c33Var = ((y53) t53Var.a).f;
                        y53.l(c33Var);
                        c33Var.f.a("Current scheduler thread is neither worker nor network");
                    }
                    this.c = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean z = false;
        while (!z) {
            try {
                this.d.W.acquire();
                z = true;
            } catch (InterruptedException e) {
                c33 c33Var = ((y53) this.d.a).f;
                y53.l(c33Var);
                c33Var.w.b(e, String.valueOf(getName()).concat(" was interrupted"));
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                BlockingQueue blockingQueue = this.b;
                o53 o53Var = (o53) blockingQueue.poll();
                if (o53Var != null) {
                    Process.setThreadPriority(true != o53Var.b ? 10 : threadPriority);
                    o53Var.run();
                } else {
                    Object obj = this.a;
                    synchronized (obj) {
                        if (blockingQueue.peek() == null) {
                            this.d.getClass();
                            try {
                                obj.wait(30000L);
                            } catch (InterruptedException e2) {
                                c33 c33Var2 = ((y53) this.d.a).f;
                                y53.l(c33Var2);
                                c33Var2.w.b(e2, String.valueOf(getName()).concat(" was interrupted"));
                            }
                        }
                    }
                    synchronized (this.d.w) {
                        if (this.b.peek() == null) {
                            a();
                            a();
                            return;
                        }
                    }
                }
            }
        } catch (Throwable th) {
            a();
            throw th;
        }
    }
}
