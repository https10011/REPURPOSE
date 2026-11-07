package defpackage;

import java.util.concurrent.RejectedExecutionException;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class we0 {
    public static final Unsafe k;
    public static final long l;
    public static final int m;
    public static final int n;
    public volatile int a;
    public int b;
    public int c;
    public int d;
    public volatile int e;
    public df0[] h;
    public final xe0 i;
    public final ff0 j;
    public int g = 4096;
    public volatile int f = 4096;

    static {
        Unsafe unsafe = y22.a;
        k = unsafe;
        try {
            l = unsafe.objectFieldOffset(we0.class.getDeclaredField("a"));
            m = unsafe.arrayBaseOffset(df0[].class);
            int iArrayIndexScale = unsafe.arrayIndexScale(df0[].class);
            if (((iArrayIndexScale - 1) & iArrayIndexScale) != 0) {
                throw new ExceptionInInitializerError("array index scale not a power of two");
            }
            n = 31 - Integer.numberOfLeadingZeros(iArrayIndexScale);
        } catch (Exception e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public we0(xe0 xe0Var, ff0 ff0Var) {
        this.i = xe0Var;
        this.j = ff0Var;
    }

    public final void a() {
        int i;
        df0[] df0VarArr = this.h;
        int length = df0VarArr != null ? df0VarArr.length : 0;
        int i2 = length > 0 ? length << 1 : 8192;
        if (i2 < 8192 || i2 > 67108864) {
            throw new RejectedExecutionException("Queue capacity exceeded");
        }
        df0[] df0VarArr2 = new df0[i2];
        this.h = df0VarArr2;
        if (df0VarArr == null || (i = length - 1) <= 0) {
            return;
        }
        int i3 = this.g;
        int i4 = this.f;
        if (i3 - i4 > 0) {
            int i5 = i2 - 1;
            do {
                long j = (((long) (i4 & i)) << n) + ((long) m);
                Unsafe unsafe = k;
                df0 df0Var = (df0) unsafe.getObjectVolatile(df0VarArr, j);
                if (df0Var != null && oe0.a(unsafe, df0VarArr, j, df0Var)) {
                    df0VarArr2[i4 & i5] = df0Var;
                }
                i4++;
            } while (i4 != i3);
            ve0.b();
        }
    }

    public final void b(int i) {
        int i2;
        int length;
        do {
            int i3 = 0;
            while (true) {
                int i4 = this.f;
                int i5 = this.g;
                df0[] df0VarArr = this.h;
                if (df0VarArr == null || (i2 = i4 - i5) >= 0 || (length = df0VarArr.length) <= 0) {
                    return;
                }
                int i6 = i4 + 1;
                df0 df0Var = (df0) xe0.m(df0VarArr, (((long) (i4 & (length - 1))) << n) + ((long) m));
                if (df0Var != null) {
                    this.f = i6;
                    df0Var.c();
                    if (i != 0 && (i3 = i3 + 1) == i) {
                        return;
                    }
                }
            }
        } while (i2 != -1);
    }

    public final void c(int i) {
        int length;
        while (true) {
            int i2 = this.f;
            int i3 = this.g;
            df0[] df0VarArr = this.h;
            if (df0VarArr == null || i2 == i3 || (length = df0VarArr.length) <= 0) {
                return;
            }
            int i4 = i3 - 1;
            df0 df0Var = (df0) xe0.m(df0VarArr, (((long) ((length - 1) & i4)) << n) + ((long) m));
            if (df0Var == null) {
                return;
            }
            this.g = i4;
            ve0.b();
            df0Var.c();
            if (i != 0 && (i = i - 1) == 0) {
                return;
            }
        }
    }

    public final df0 d() {
        int i;
        int length;
        while (true) {
            int i2 = this.f;
            int i3 = this.g;
            df0[] df0VarArr = this.h;
            if (df0VarArr == null || (i = i2 - i3) >= 0 || (length = df0VarArr.length) <= 0) {
                return null;
            }
            long j = (((long) ((length - 1) & i2)) << n) + ((long) m);
            Unsafe unsafe = k;
            df0 df0Var = (df0) unsafe.getObjectVolatile(df0VarArr, j);
            int i4 = i2 + 1;
            if (i2 == this.f) {
                if (df0Var != null) {
                    if (oe0.a(unsafe, df0VarArr, j, df0Var)) {
                        this.f = i4;
                        return df0Var;
                    }
                } else if (i == -1) {
                    return null;
                }
            }
        }
    }

    public final void e(df0 df0Var) {
        int length;
        int i = this.g;
        df0[] df0VarArr = this.h;
        if (df0VarArr == null || (length = df0VarArr.length) <= 0) {
            return;
        }
        long j = (((long) ((length - 1) & i)) << n) + ((long) m);
        xe0 xe0Var = this.i;
        this.g = i + 1;
        k.putOrderedObject(df0VarArr, j, df0Var);
        int i2 = this.f - i;
        if (i2 == 0) {
            ve0.a();
            xe0Var.x();
        } else if (i2 + length == 1) {
            a();
        }
    }

    public final boolean f() {
        return k.compareAndSwapInt(this, l, 0, 1);
    }

    public final void g(df0 df0Var) {
        df0[] df0VarArr;
        int length;
        int i = this.f;
        int i2 = this.g;
        if (i - i2 >= 0 || (df0VarArr = this.h) == null || (length = df0VarArr.length) <= 0) {
            return;
        }
        int i3 = length - 1;
        int i4 = i2 - 1;
        int i5 = i4;
        while (true) {
            long j = ((i5 & i3) << n) + m;
            Unsafe unsafe = k;
            df0 df0Var2 = (df0) unsafe.getObject(df0VarArr, j);
            if (df0Var2 == null) {
                return;
            }
            if (df0Var2 == df0Var) {
                if (oe0.a(unsafe, df0VarArr, j, df0Var2)) {
                    this.g = i4;
                    while (i5 != i4) {
                        int i6 = i5 + 1;
                        int i7 = n;
                        int i8 = m;
                        long j2 = ((i6 & i3) << i7) + i8;
                        Unsafe unsafe2 = k;
                        df0 df0Var3 = (df0) unsafe2.getObject(df0VarArr, j2);
                        unsafe2.putObjectVolatile(df0VarArr, j2, (Object) null);
                        unsafe2.putOrderedObject(df0VarArr, ((i5 & i3) << i7) + i8, df0Var3);
                        i5 = i6;
                    }
                    ve0.b();
                    df0Var2.c();
                    return;
                }
                return;
            }
            i5--;
        }
    }

    public final boolean h(df0 df0Var) {
        int length;
        int i = this.g;
        int i2 = i - 1;
        df0[] df0VarArr = this.h;
        if (df0VarArr != null && (length = df0VarArr.length) > 0) {
            boolean z = true;
            long j = (((long) ((length - 1) & i2)) << n) + ((long) m);
            Unsafe unsafe = k;
            if (((df0) unsafe.getObject(df0VarArr, j)) == df0Var) {
                long j2 = l;
                if (unsafe.compareAndSwapInt(this, j2, 0, 1)) {
                    if (this.g == i && this.h == df0VarArr && oe0.a(unsafe, df0VarArr, j, df0Var)) {
                        this.g = i2;
                    } else {
                        z = false;
                    }
                    unsafe.putOrderedInt(this, j2, 0);
                    return z;
                }
            }
        }
        return false;
    }
}
