package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class lo0 {
    public static final long a;
    public static final boolean b;
    public static final Object c;
    public static final do0 d;
    public static final do0 e;
    public static final jo0 f;
    public static final go0 g;

    static {
        long jNanoTime = (int) ((System.nanoTime() * 2611923443488327891L) >> 16);
        a = 4294967295L & jNanoTime;
        b = (jNanoTime & 1) == 0;
        c = new Object();
        d = new do0(new Object[0], false);
        e = new do0(new Object[0], true);
        f = new jo0(new Object[0]);
        g = new go0(new Object[0]);
    }
}
