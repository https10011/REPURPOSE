package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class cb extends jw {
    public static volatile cb i;
    public final c00 h = new c00();

    public static cb G() {
        if (i != null) {
            return i;
        }
        synchronized (cb.class) {
            try {
                if (i == null) {
                    i = new cb();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i;
    }
}
