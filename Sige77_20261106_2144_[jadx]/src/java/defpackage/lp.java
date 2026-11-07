package defpackage;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class lp extends df0 implements Runnable, mp {
    public qp i;
    public bv1 v;

    @Override // defpackage.df0
    public final boolean e() {
        run();
        return false;
    }

    @Override // defpackage.df0
    public final /* bridge */ /* synthetic */ Object i() {
        return null;
    }

    @Override // defpackage.df0, java.lang.Runnable
    public final void run() {
        bv1 bv1Var;
        qp qpVar = this.i;
        if (qpVar == null || (bv1Var = this.v) == null) {
            return;
        }
        this.i = null;
        this.v = null;
        if (qpVar.a == null) {
            try {
                Object obj = bv1Var.get();
                Unsafe unsafe = qp.f;
                long j = qp.i;
                if (obj == null) {
                    obj = qp.c;
                }
                fp.a(unsafe, qpVar, j, obj);
            } catch (Throwable th) {
                th = th;
                Unsafe unsafe2 = qp.f;
                long j2 = qp.i;
                if (!(th instanceof wp)) {
                    th = new wp(th);
                }
                gp.a(unsafe2, qpVar, j2, new kp(th));
            }
        }
        qpVar.f();
    }
}
