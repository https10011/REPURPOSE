package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public class uz0 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(uz0.class, Object.class, "_next$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater b;
    public static final /* synthetic */ AtomicReferenceFieldUpdater c;
    public static final /* synthetic */ long d;
    public static final /* synthetic */ long e;
    public static final /* synthetic */ long f;
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    static {
        Unsafe unsafe = fe3.a;
        d = unsafe.objectFieldOffset(uz0.class.getDeclaredField("_next$volatile"));
        b = AtomicReferenceFieldUpdater.newUpdater(uz0.class, Object.class, "_prev$volatile");
        e = unsafe.objectFieldOffset(uz0.class.getDeclaredField("_prev$volatile"));
        c = AtomicReferenceFieldUpdater.newUpdater(uz0.class, Object.class, "_removedRef$volatile");
        f = unsafe.objectFieldOffset(uz0.class.getDeclaredField("_removedRef$volatile"));
    }

    public static uz0 h(uz0 uz0Var) {
        while (uz0Var.m()) {
            b.getClass();
            uz0Var = (uz0) fe3.a.getObjectVolatile(uz0Var, e);
        }
        return uz0Var;
    }

    public final boolean d(uz0 uz0Var, int i) {
        uz0 uz0VarL;
        do {
            uz0VarL = l();
            if (uz0VarL instanceof ky0) {
                return (((ky0) uz0VarL).i & i) == 0 && uz0VarL.d(uz0Var, i);
            }
        } while (!uz0VarL.e(uz0Var, this));
        return true;
    }

    public final boolean e(uz0 uz0Var, uz0 uz0Var2) {
        b.getClass();
        Unsafe unsafe = fe3.a;
        unsafe.putObjectVolatile(uz0Var, e, this);
        a.getClass();
        long j = d;
        unsafe.putObjectVolatile(uz0Var, j, uz0Var2);
        while (true) {
            Unsafe unsafe2 = fe3.a;
            uz0 uz0Var3 = this;
            uz0 uz0Var4 = uz0Var;
            uz0 uz0Var5 = uz0Var2;
            if (unsafe2.compareAndSwapObject(uz0Var3, d, uz0Var5, uz0Var4)) {
                uz0Var4.i(uz0Var5);
                return true;
            }
            if (unsafe2.getObjectVolatile(uz0Var3, j) != uz0Var5) {
                return false;
            }
            this = uz0Var3;
            uz0Var2 = uz0Var5;
            uz0Var = uz0Var4;
        }
    }

    public final void f(f71 f71Var) {
        uz0 uz0Var;
        f71 f71Var2;
        b.getClass();
        Unsafe unsafe = fe3.a;
        unsafe.putObjectVolatile(f71Var, e, this);
        a.getClass();
        long j = d;
        unsafe.putObjectVolatile(f71Var, j, this);
        while (this.j() == this) {
            while (true) {
                Unsafe unsafe2 = fe3.a;
                uz0Var = this;
                f71Var2 = f71Var;
                if (unsafe2.compareAndSwapObject(uz0Var, d, this, f71Var2)) {
                    f71Var2.i(uz0Var);
                    return;
                } else {
                    if (unsafe2.getObjectVolatile(uz0Var, j) != uz0Var) {
                        break;
                    }
                    this = uz0Var;
                    f71Var = f71Var2;
                }
            }
            this = uz0Var;
            f71Var = f71Var2;
        }
    }

    public final uz0 g() {
        while (true) {
            b.getClass();
            Unsafe unsafe = fe3.a;
            long j = e;
            uz0 uz0Var = (uz0) unsafe.getObjectVolatile(this, j);
            uz0 uz0Var2 = null;
            uz0 uz0Var3 = uz0Var;
            while (true) {
                a.getClass();
                if (uz0Var3 == null) {
                    ur.a();
                    return null;
                }
                Unsafe unsafe2 = fe3.a;
                long j2 = d;
                Object objectVolatile = unsafe2.getObjectVolatile(uz0Var3, j2);
                if (objectVolatile == this) {
                    if (uz0Var != uz0Var3) {
                        while (true) {
                            Unsafe unsafe3 = fe3.a;
                            uz0 uz0Var4 = this;
                            boolean zCompareAndSwapObject = unsafe3.compareAndSwapObject(uz0Var4, e, uz0Var, uz0Var3);
                            uz0 uz0Var5 = uz0Var;
                            this = uz0Var4;
                            if (!zCompareAndSwapObject) {
                                if (unsafe3.getObjectVolatile(this, j) != uz0Var5) {
                                    break;
                                }
                                this = this;
                                uz0Var = uz0Var5;
                            }
                        }
                    }
                    return uz0Var3;
                }
                uz0Var = uz0Var;
                this = this;
                if (this.m()) {
                    return null;
                }
                if (!(objectVolatile instanceof th1)) {
                    objectVolatile.getClass();
                    uz0Var2 = uz0Var3;
                    uz0Var3 = (uz0) objectVolatile;
                } else if (uz0Var2 != null) {
                    uz0 uz0Var6 = ((th1) objectVolatile).a;
                    while (true) {
                        uz0 uz0Var7 = uz0Var3;
                        Unsafe unsafe4 = fe3.a;
                        boolean zCompareAndSwapObject2 = unsafe4.compareAndSwapObject(uz0Var2, d, uz0Var7, uz0Var6);
                        uz0Var3 = uz0Var7;
                        if (zCompareAndSwapObject2) {
                            uz0Var3 = uz0Var2;
                            uz0Var2 = null;
                            break;
                        }
                        if (unsafe4.getObjectVolatile(uz0Var2, j2) != uz0Var3) {
                            break;
                        }
                    }
                } else {
                    if (uz0Var3 == null) {
                        ur.a();
                        return null;
                    }
                    uz0Var3 = (uz0) unsafe2.getObjectVolatile(uz0Var3, j);
                }
            }
            this = this;
        }
    }

    public final void i(uz0 uz0Var) {
        uz0 uz0Var2;
        while (true) {
            b.getClass();
            if (uz0Var == null) {
                ur.a();
                return;
            }
            Unsafe unsafe = fe3.a;
            long j = e;
            uz0 uz0Var3 = (uz0) unsafe.getObjectVolatile(uz0Var, j);
            if (this.j() != uz0Var) {
                return;
            }
            while (true) {
                if (uz0Var == null) {
                    ur.a();
                    return;
                }
                Unsafe unsafe2 = fe3.a;
                uz0Var2 = this;
                uz0 uz0Var4 = uz0Var;
                if (unsafe2.compareAndSwapObject(uz0Var4, e, uz0Var3, uz0Var2)) {
                    if (uz0Var2.m()) {
                        uz0Var4.g();
                        return;
                    }
                    return;
                } else {
                    if (uz0Var4 == null) {
                        ur.a();
                        return;
                    }
                    uz0Var = uz0Var4;
                    if (unsafe2.getObjectVolatile(uz0Var4, j) != uz0Var3) {
                        break;
                    } else {
                        this = uz0Var2;
                    }
                }
            }
            this = uz0Var2;
        }
    }

    public final Object j() {
        a.getClass();
        return fe3.a.getObjectVolatile(this, d);
    }

    public final uz0 k() {
        Object objJ = j();
        th1 th1Var = objJ instanceof th1 ? (th1) objJ : null;
        if (th1Var != null) {
            return th1Var.a;
        }
        objJ.getClass();
        return (uz0) objJ;
    }

    public final uz0 l() {
        uz0 uz0VarG = g();
        if (uz0VarG != null) {
            return uz0VarG;
        }
        b.getClass();
        return h((uz0) fe3.a.getObjectVolatile(this, e));
    }

    public boolean m() {
        return j() instanceof th1;
    }

    public final uz0 n() {
        uz0 uz0Var;
        while (true) {
            Object objJ = this.j();
            if (objJ instanceof th1) {
                return ((th1) objJ).a;
            }
            if (objJ == this) {
                return (uz0) objJ;
            }
            objJ.getClass();
            uz0 uz0Var2 = (uz0) objJ;
            th1 th1VarO = uz0Var2.o();
            while (true) {
                a.getClass();
                Unsafe unsafe = fe3.a;
                long j = d;
                uz0Var = this;
                if (unsafe.compareAndSwapObject(uz0Var, j, objJ, th1VarO)) {
                    uz0Var2.g();
                    return null;
                }
                if (unsafe.getObjectVolatile(uz0Var, j) != objJ) {
                    break;
                }
                this = uz0Var;
            }
            this = uz0Var;
        }
    }

    public final th1 o() {
        c.getClass();
        Unsafe unsafe = fe3.a;
        long j = f;
        th1 th1Var = (th1) unsafe.getObjectVolatile(this, j);
        if (th1Var != null) {
            return th1Var;
        }
        th1 th1Var2 = new th1(this);
        unsafe.putObjectVolatile(this, j, th1Var2);
        return th1Var2;
    }

    public String toString() {
        return new tz0(this, qt.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", 1) + '@' + qt.j(this);
    }
}
