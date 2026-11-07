package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class lk2 {
    public static final String[] a = {"com.google.common.flogger.util.StackWalkerStackGetter", "com.google.common.flogger.util.JavaLangAccessStackGetter"};
    public static final nk2 b;

    static {
        nk2 nk2Var;
        for (int i = 0; i < 2; i++) {
            nk2Var = null;
            try {
                nk2Var = (nk2) Class.forName(a[i]).asSubclass(nk2.class).getDeclaredConstructor(null).newInstance(null);
            } catch (Throwable unused) {
            }
            if (nk2Var != null) {
                b = nk2Var;
            }
        }
        nk2Var = new nk2();
        b = nk2Var;
    }
}
