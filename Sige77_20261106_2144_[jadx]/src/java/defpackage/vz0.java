package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public class vz0 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(vz0.class, Object.class, "_cur$volatile");
    public static final /* synthetic */ long b = fe3.a.objectFieldOffset(vz0.class.getDeclaredField("_cur$volatile"));
    private volatile /* synthetic */ Object _cur$volatile = new xz0(8, false);

    public final boolean a(Runnable runnable) {
        vz0 vz0Var;
        while (true) {
            a.getClass();
            Unsafe unsafe = fe3.a;
            long j = b;
            xz0 xz0Var = (xz0) unsafe.getObjectVolatile(this, j);
            int iA = xz0Var.a(runnable);
            if (iA == 0) {
                return true;
            }
            if (iA == 1) {
                xz0 xz0VarD = xz0Var.d();
                while (true) {
                    Unsafe unsafe2 = fe3.a;
                    vz0Var = this;
                    if (unsafe2.compareAndSwapObject(vz0Var, b, xz0Var, xz0VarD) || unsafe2.getObjectVolatile(vz0Var, j) != xz0Var) {
                        break;
                    }
                    this = vz0Var;
                }
            } else {
                if (iA == 2) {
                    return false;
                }
                vz0Var = this;
            }
            this = vz0Var;
        }
    }

    public final void b() {
        vz0 vz0Var;
        while (true) {
            a.getClass();
            Unsafe unsafe = fe3.a;
            long j = b;
            xz0 xz0Var = (xz0) unsafe.getObjectVolatile(this, j);
            if (xz0Var.c()) {
                return;
            }
            xz0 xz0VarD = xz0Var.d();
            while (true) {
                Unsafe unsafe2 = fe3.a;
                vz0Var = this;
                if (unsafe2.compareAndSwapObject(vz0Var, b, xz0Var, xz0VarD) || unsafe2.getObjectVolatile(vz0Var, j) != xz0Var) {
                    break;
                } else {
                    this = vz0Var;
                }
            }
            this = vz0Var;
        }
    }

    public final int c() {
        a.getClass();
        xz0 xz0Var = (xz0) fe3.a.getObjectVolatile(this, b);
        xz0Var.getClass();
        long j = xz0.f.get(xz0Var);
        return 1073741823 & (((int) ((j & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j)));
    }

    public final Object d() {
        vz0 vz0Var;
        while (true) {
            a.getClass();
            Unsafe unsafe = fe3.a;
            long j = b;
            xz0 xz0Var = (xz0) unsafe.getObjectVolatile(this, j);
            Object objE = xz0Var.e();
            if (objE != xz0.g) {
                return objE;
            }
            xz0 xz0VarD = xz0Var.d();
            while (true) {
                Unsafe unsafe2 = fe3.a;
                vz0Var = this;
                if (unsafe2.compareAndSwapObject(vz0Var, b, xz0Var, xz0VarD) || unsafe2.getObjectVolatile(vz0Var, j) != xz0Var) {
                    break;
                }
                this = vz0Var;
            }
            this = vz0Var;
        }
    }
}
