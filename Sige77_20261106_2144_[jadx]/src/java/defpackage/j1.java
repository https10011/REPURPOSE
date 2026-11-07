package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class j1 {
    public static final j1 c;
    public static final j1 d;
    public final boolean a;
    public final Throwable b;

    static {
        if (p1.d) {
            d = null;
            c = null;
        } else {
            d = new j1(null, false);
            c = new j1(null, true);
        }
    }

    public j1(Throwable th, boolean z) {
        this.a = z;
        this.b = th;
    }
}
