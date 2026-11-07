package defpackage;

import java.util.concurrent.Executor;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class pp extends np {
    public qp W;
    public ra2 X;
    public Executor v;
    public qp w;

    public pp(Executor executor, qp qpVar, qp qpVar2, ra2 ra2Var) {
        this.v = executor;
        this.w = qpVar;
        this.W = qpVar2;
        this.X = ra2Var;
    }

    @Override // defpackage.np
    public final boolean o() {
        return this.w != null;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0039 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x003b  */
    /* JADX WARN: Code duplicated, block: B:24:0x003c A[Catch: all -> 0x004f, TryCatch #0 {all -> 0x004f, blocks: (B:20:0x0031, B:24:0x003c, B:26:0x0042), top: B:52:0x0031 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x0031 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.np
    public final qp p(int i) {
        Object obj;
        qp qpVar;
        ra2 ra2Var;
        Executor executor;
        qp qpVar2 = this.W;
        if (qpVar2 == null || (obj = qpVar2.a) == null || (qpVar = this.w) == null || (ra2Var = this.X) == null) {
            return null;
        }
        if (qpVar.a == null) {
            if (obj instanceof kp) {
                Throwable th = ((kp) obj).a;
                if (th != null) {
                    hp.a(qp.f, qpVar, qp.i, qp.d(obj, th));
                } else {
                    obj = null;
                    if (i <= 0) {
                        executor = this.v;
                        if (b()) {
                            return null;
                        }
                        if (executor == null) {
                            this.v = null;
                            executor.execute(this);
                            return null;
                        }
                    }
                    ra2Var.a(obj);
                    Unsafe unsafe = qp.f;
                    long j = qp.i;
                    kp kpVar = qp.c;
                    jp.a(unsafe, qpVar, j);
                }
            } else {
                if (i <= 0) {
                    try {
                        executor = this.v;
                        if (b()) {
                            return null;
                        }
                        if (executor == null) {
                            this.v = null;
                            executor.execute(this);
                            return null;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        Unsafe unsafe2 = qp.f;
                        long j2 = qp.i;
                        if (!(th instanceof wp)) {
                            th = new wp(th);
                        }
                        gp.a(unsafe2, qpVar, j2, new kp(th));
                    }
                }
                ra2Var.a(obj);
                Unsafe unsafe3 = qp.f;
                long j3 = qp.i;
                kp kpVar2 = qp.c;
                jp.a(unsafe3, qpVar, j3);
            }
        }
        this.W = null;
        this.w = null;
        this.X = null;
        if (qpVar2.b != null) {
            Object obj2 = qpVar2.a;
            if (obj2 == null) {
                qpVar2.c();
            }
            if (i >= 0 && (obj2 != null || qpVar2.a != null)) {
                qpVar2.f();
            }
        }
        if (qpVar.a == null || qpVar.b == null) {
            return null;
        }
        if (i < 0) {
            return qpVar;
        }
        qpVar.f();
        return null;
    }
}
