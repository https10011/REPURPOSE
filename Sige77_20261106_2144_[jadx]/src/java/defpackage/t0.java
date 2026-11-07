package defpackage;

import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class t0 extends xi0 {
    public static final Unsafe h;
    public static final long i;
    public static final long j;
    public static final long k;
    public static final long l;
    public static final long m;

    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (PrivilegedActionException e) {
                sm0.m("Could not initialize intrinsics", e.getCause());
                return;
            }
        } catch (SecurityException unused) {
            unsafe = (Unsafe) AccessController.doPrivileged(new s0());
        }
        try {
            j = unsafe.objectFieldOffset(v0.class.getDeclaredField("c"));
            i = unsafe.objectFieldOffset(v0.class.getDeclaredField("b"));
            k = unsafe.objectFieldOffset(v0.class.getDeclaredField("a"));
            l = unsafe.objectFieldOffset(u0.class.getDeclaredField("a"));
            m = unsafe.objectFieldOffset(u0.class.getDeclaredField("b"));
            h = unsafe;
        } catch (Exception e2) {
            Object obj = mx1.a;
            if (e2 instanceof RuntimeException) {
                throw ((RuntimeException) e2);
            }
            sm0.n(e2);
        }
    }

    @Override // defpackage.xi0
    public final boolean c(v0 v0Var, j0 j0Var, j0 j0Var2) {
        return q0.a(h, v0Var, i, j0Var, j0Var2);
    }

    @Override // defpackage.xi0
    public final boolean d(v0 v0Var, Object obj, Object obj2) {
        return r0.a(h, v0Var, k, obj, obj2);
    }

    @Override // defpackage.xi0
    public final boolean e(v0 v0Var, u0 u0Var, u0 u0Var2) {
        return p0.a(h, v0Var, j, u0Var, u0Var2);
    }

    @Override // defpackage.xi0
    public final j0 h(v0 v0Var) {
        j0 j0Var;
        j0 j0Var2 = j0.d;
        do {
            j0Var = v0Var.b;
            if (j0Var2 == j0Var) {
                break;
            }
        } while (!c(v0Var, j0Var, j0Var2));
        return j0Var;
    }

    @Override // defpackage.xi0
    public final u0 i(v0 v0Var) {
        u0 u0Var;
        u0 u0Var2 = u0.c;
        do {
            u0Var = v0Var.c;
            if (u0Var2 == u0Var) {
                break;
            }
        } while (!e(v0Var, u0Var, u0Var2));
        return u0Var;
    }

    @Override // defpackage.xi0
    public final void u(u0 u0Var, u0 u0Var2) {
        h.putObject(u0Var, m, u0Var2);
    }

    @Override // defpackage.xi0
    public final void v(u0 u0Var, Thread thread) {
        h.putObject(u0Var, l, thread);
    }
}
