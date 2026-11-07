package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class jx1 {
    public static final ThreadLocal a = new ThreadLocal();

    public static s70 a() {
        ThreadLocal threadLocal = a;
        s70 s70Var = (s70) threadLocal.get();
        if (s70Var != null) {
            return s70Var;
        }
        th thVar = new th(Thread.currentThread());
        threadLocal.set(thVar);
        return thVar;
    }
}
