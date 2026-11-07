package defpackage;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class xz0 {
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;
    public final int a;
    public final boolean b;
    public final int c;
    public final /* synthetic */ AtomicReferenceArray d;
    public static final /* synthetic */ AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(xz0.class, Object.class, "_next$volatile");
    public static final /* synthetic */ long h = fe3.a.objectFieldOffset(xz0.class.getDeclaredField("_next$volatile"));
    public static final /* synthetic */ AtomicLongFieldUpdater f = AtomicLongFieldUpdater.newUpdater(xz0.class, "_state$volatile");
    public static final vy2 g = new vy2("REMOVE_FROZEN", 4);

    public xz0(int i, boolean z) {
        this.a = i;
        this.b = z;
        int i2 = i - 1;
        this.c = i2;
        this.d = new AtomicReferenceArray(i);
        if (i2 > 1073741823) {
            uq1.q("Check failed.");
            throw null;
        }
        if ((i & i2) == 0) {
            return;
        }
        uq1.q("Check failed.");
        throw null;
    }

    public final int a(Object obj) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f;
            long j = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j) != 0) {
                return (2305843009213693952L & j) != 0 ? 2 : 1;
            }
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            int i3 = this.c;
            if (((i2 + 2) & i3) == (i & i3)) {
                return 1;
            }
            boolean z = this.b;
            AtomicReferenceArray atomicReferenceArray = this.d;
            if (z || atomicReferenceArray.get(i2 & i3) == null) {
                xz0 xz0Var = this;
                if (f.compareAndSet(xz0Var, j, ((-1152921503533105153L) & j) | (((long) ((i2 + 1) & 1073741823)) << 30))) {
                    atomicReferenceArray.set(i2 & i3, obj);
                    xz0 xz0VarD = xz0Var;
                    while ((atomicLongFieldUpdater.get(xz0VarD) & 1152921504606846976L) != 0) {
                        xz0VarD = xz0VarD.d();
                        AtomicReferenceArray atomicReferenceArray2 = xz0VarD.d;
                        int i4 = xz0VarD.c & i2;
                        Object obj2 = atomicReferenceArray2.get(i4);
                        if ((obj2 instanceof wz0) && ((wz0) obj2).a == i2) {
                            atomicReferenceArray2.set(i4, obj);
                        } else {
                            xz0VarD = null;
                        }
                        if (xz0VarD == null) {
                            return 0;
                        }
                    }
                    return 0;
                }
                this = xz0Var;
            } else {
                int i5 = this.a;
                if (i5 < 1024 || ((i2 - i) & 1073741823) > (i5 >> 1)) {
                    return 1;
                }
            }
        }
    }

    public final xz0 b(long j) {
        xz0 xz0Var;
        while (true) {
            e.getClass();
            Unsafe unsafe = fe3.a;
            long j2 = h;
            xz0 xz0Var2 = (xz0) unsafe.getObjectVolatile(this, j2);
            if (xz0Var2 != null) {
                return xz0Var2;
            }
            xz0 xz0Var3 = new xz0(this.a * 2, this.b);
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            while (true) {
                int i3 = this.c;
                int i4 = i & i3;
                if (i4 == (i3 & i2)) {
                    break;
                }
                Object wz0Var = this.d.get(i4);
                if (wz0Var == null) {
                    wz0Var = new wz0(i);
                }
                xz0Var3.d.set(xz0Var3.c & i, wz0Var);
                i++;
            }
            f.set(xz0Var3, (-1152921504606846977L) & j);
            while (true) {
                Unsafe unsafe2 = fe3.a;
                xz0Var = this;
                if (unsafe2.compareAndSwapObject(xz0Var, h, (Object) null, xz0Var3) || unsafe2.getObjectVolatile(xz0Var, j2) != null) {
                    break;
                }
                this = xz0Var;
            }
            this = xz0Var;
        }
    }

    public final boolean c() {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f;
            long j = atomicLongFieldUpdater.get(this);
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
            xz0 xz0Var = this;
            if (atomicLongFieldUpdater.compareAndSet(xz0Var, j, 2305843009213693952L | j)) {
                return true;
            }
            this = xz0Var;
        }
    }

    public final xz0 d() {
        long j;
        xz0 xz0Var;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f;
            j = atomicLongFieldUpdater.get(this);
            if ((j & 1152921504606846976L) != 0) {
                xz0Var = this;
                break;
            }
            long j2 = 1152921504606846976L | j;
            xz0Var = this;
            if (atomicLongFieldUpdater.compareAndSet(xz0Var, j, j2)) {
                j = j2;
                break;
            }
            this = xz0Var;
        }
        return xz0Var.b(j);
    }

    public final Object e() {
        xz0 xz0VarD = this;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f;
            long j = atomicLongFieldUpdater.get(xz0VarD);
            if ((j & 1152921504606846976L) != 0) {
                return g;
            }
            int i = (int) (j & 1073741823);
            int i2 = xz0VarD.c;
            int i3 = i & i2;
            if ((((int) ((1152921503533105152L & j) >> 30)) & i2) != i3) {
                AtomicReferenceArray atomicReferenceArray = xz0VarD.d;
                Object obj = atomicReferenceArray.get(i3);
                boolean z = xz0VarD.b;
                if (obj == null) {
                    if (z) {
                    }
                } else if (!(obj instanceof wz0)) {
                    long j2 = (i + 1) & 1073741823;
                    if (f.compareAndSet(xz0VarD, j, (j & (-1073741824)) | j2)) {
                        atomicReferenceArray.set(i3, null);
                        return obj;
                    }
                    xz0VarD = this;
                    if (z) {
                        while (true) {
                            long j3 = atomicLongFieldUpdater.get(xz0VarD);
                            int i4 = (int) (j3 & 1073741823);
                            if ((j3 & 1152921504606846976L) != 0) {
                                xz0VarD = xz0VarD.d();
                            } else {
                                xz0 xz0Var = xz0VarD;
                                if (f.compareAndSet(xz0Var, j3, (j3 & (-1073741824)) | j2)) {
                                    xz0Var.d.set(i4 & xz0Var.c, null);
                                    xz0VarD = null;
                                } else {
                                    xz0VarD = xz0Var;
                                }
                            }
                            if (xz0VarD == null) {
                                return obj;
                            }
                        }
                    }
                }
            }
            return null;
        }
    }
}
