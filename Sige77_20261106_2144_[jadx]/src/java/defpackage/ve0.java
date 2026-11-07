package defpackage;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public abstract class ve0 {
    public static final y41 a = new y41();
    public static final Unsafe b;
    public static final long c;

    static {
        Unsafe unsafe = y22.a;
        b = unsafe;
        try {
            c = unsafe.objectFieldOffset(y41.class.getDeclaredField("a"));
        } catch (Exception e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void a() {
        b.putIntVolatile(a, c, 0);
    }

    public static void b() {
        b.putOrderedInt(a, c, 0);
    }
}
