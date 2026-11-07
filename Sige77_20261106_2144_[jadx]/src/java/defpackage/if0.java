package defpackage;

import com.hjq.toast.BuildConfig;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class if0 {
    public static final if0 d = new if0(BuildConfig.FLAVOR, BuildConfig.FLAVOR, false);
    public final String a;
    public final String b;
    public final boolean c;

    static {
        new if0("\n", "  ", true);
    }

    public if0(String str, String str2, boolean z) {
        if (!str.matches("[\r\n]*")) {
            e.g("Only combinations of \\n and \\r are allowed in newline.");
            throw null;
        }
        if (!str2.matches("[ \t]*")) {
            e.g("Only combinations of spaces and tabs are allowed in indent.");
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = z;
    }
}
