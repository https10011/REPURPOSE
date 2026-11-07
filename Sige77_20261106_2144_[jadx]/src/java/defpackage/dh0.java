package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class dh0 {
    public static z a(ListenableFuture listenableFuture, Class cls, bc bcVar, Executor executor) {
        int i = b0.Y;
        z zVar = new z(listenableFuture, cls, bcVar);
        listenableFuture.a(zVar, gb2.C(executor, zVar));
        return zVar;
    }

    public static Object b(Future future) {
        Object obj;
        if (!future.isDone()) {
            uq1.q(ga.s("Future was expected to be done: %s", future));
            return null;
        }
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public static tn0 c(Exception exc) {
        tn0 tn0Var = new tn0();
        tn0Var.m(exc);
        return tn0Var;
    }

    public static un0 d(Object obj) {
        return obj == null ? un0.b : new un0(obj);
    }

    public static ListenableFuture e(ListenableFuture listenableFuture) {
        if (listenableFuture.isDone()) {
            return listenableFuture;
        }
        ch0 ch0Var = new ch0();
        ch0Var.v = listenableFuture;
        listenableFuture.a(ch0Var, t10.a);
        return ch0Var;
    }

    public static s1 f(ListenableFuture listenableFuture, vg0 vg0Var, Executor executor) {
        int i = t1.X;
        s1 s1Var = new s1(listenableFuture, vg0Var);
        listenableFuture.a(s1Var, gb2.C(executor, s1Var));
        return s1Var;
    }

    public static r1 g(ListenableFuture listenableFuture, bc bcVar, Executor executor) {
        int i = t1.X;
        executor.getClass();
        r1 r1Var = new r1(listenableFuture, bcVar);
        listenableFuture.a(r1Var, gb2.C(executor, r1Var));
        return r1Var;
    }
}
