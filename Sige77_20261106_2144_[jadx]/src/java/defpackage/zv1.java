package defpackage;

import java.security.AccessControlContext;
import java.security.AccessController;
import java.security.SecureRandom;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public abstract class zv1 {
    public static final Unsafe a;
    public static final boolean b;
    public static final long c;
    public static final long d;
    public static final long e;
    public static final long f;
    public static final xv1 g;
    public static final AtomicInteger h;
    public static final AtomicLong i;

    static {
        String property;
        Unsafe unsafe = y22.a;
        a = unsafe;
        try {
            boolean z = b("com.ibm.misc.JarVersion") && (property = System.getProperty("java.class.version", "45")) != null && property.length() >= 2 && "52".compareTo(property.substring(0, 2)) > 0;
            boolean zB = b("android.util.DisplayMetrics") ? true : b("org.robovm.rt.bro.Bro");
            b = zB;
            if (zB) {
                c = 0L;
                d = 0L;
                e = 0L;
                f = 0L;
            } else {
                c = unsafe.objectFieldOffset(Thread.class.getDeclaredField("threadLocals"));
                d = unsafe.objectFieldOffset(Thread.class.getDeclaredField("inheritableThreadLocals"));
                e = unsafe.objectFieldOffset(Thread.class.getDeclaredField(z ? "accessControlContext" : "inheritedAccessControlContext"));
                f = unsafe.objectFieldOffset(Thread.class.getDeclaredField("contextClassLoader"));
            }
            g = new xv1(0);
            h = new AtomicInteger();
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j = (jCurrentTimeMillis ^ (jCurrentTimeMillis >>> 33)) * (-49064778989728563L);
            long j2 = (j ^ (j >>> 33)) * (-4265267296055464877L);
            long jNanoTime = System.nanoTime();
            long j3 = (jNanoTime ^ (jNanoTime >>> 33)) * (-49064778989728563L);
            long j4 = ((j3 >>> 33) ^ j3) * (-4265267296055464877L);
            i = new AtomicLong((j2 ^ (j2 >>> 33)) ^ (j4 ^ (j4 >>> 33)));
            if (((Boolean) AccessController.doPrivileged(new qe0(3))).booleanValue()) {
                byte[] seed = SecureRandom.getSeed(8);
                long j5 = ((long) seed[0]) & 255;
                for (int i2 = 1; i2 < 8; i2++) {
                    j5 = (j5 << 8) | (((long) seed[i2]) & 255);
                }
                i.set(j5);
            }
        } catch (Exception e2) {
            throw new ExceptionInInitializerError(e2);
        }
    }

    public static final void a(ff0 ff0Var) {
        if (b) {
            return;
        }
        Unsafe unsafe = a;
        unsafe.putObject(ff0Var, c, (Object) null);
        unsafe.putObject(ff0Var, d, (Object) null);
    }

    public static boolean b(String str) {
        Class<?> cls;
        try {
            cls = Class.forName(str, false, zv1.class.getClassLoader());
        } catch (Throwable unused) {
            cls = null;
        }
        return cls != null;
    }

    public static final int c() {
        int i2;
        xv1 xv1Var = g;
        int i3 = ((yv1) xv1Var.get()).b;
        if (i3 != 0) {
            int i4 = i3 ^ (i3 << 13);
            int i5 = i4 ^ (i4 >>> 17);
            i2 = i5 ^ (i5 << 5);
        } else {
            long andAdd = i.getAndAdd(-4942790177534073029L);
            long j = (andAdd ^ (andAdd >>> 33)) * (-49064778989728563L);
            i2 = (int) (((j ^ (j >>> 33)) * (-4265267296055464877L)) >>> 32);
            if (i2 == 0) {
                i2 = 1;
            }
        }
        ((yv1) xv1Var.get()).b = i2;
        return i2;
    }

    public static final void d(ff0 ff0Var, ClassLoader classLoader) {
        if (b) {
            return;
        }
        a.putObject(ff0Var, f, classLoader);
    }

    public static final void e(ff0 ff0Var, AccessControlContext accessControlContext) {
        if (b) {
            return;
        }
        a.putOrderedObject(ff0Var, e, accessControlContext);
    }
}
