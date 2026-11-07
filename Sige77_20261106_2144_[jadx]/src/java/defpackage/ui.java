package defpackage;

import android.os.Build;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class ui {
    public static final ui a = new ui();
    public static final int b;
    public static final int c;
    public static final int d;
    public static final int e;

    static {
        int i = Build.VERSION.SDK_INT;
        b = i >= 30 ? ti.a.a(30) : 0;
        c = i >= 30 ? ti.a.a(31) : 0;
        d = i >= 30 ? ti.a.a(33) : 0;
        e = i >= 30 ? ti.a.a(1000000) : 0;
    }

    private ui() {
    }
}
