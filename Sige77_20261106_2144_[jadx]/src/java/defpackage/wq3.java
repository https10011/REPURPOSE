package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class wq3 {
    public static final wq3 a;
    public static final wq3 b;
    public static final wq3 c;
    public static final /* synthetic */ wq3[] d;

    static {
        wq3 wq3Var = new wq3("NIST_P256", 0);
        a = wq3Var;
        wq3 wq3Var2 = new wq3("NIST_P384", 1);
        b = wq3Var2;
        wq3 wq3Var3 = new wq3("NIST_P521", 2);
        c = wq3Var3;
        d = new wq3[]{wq3Var, wq3Var2, wq3Var3};
    }

    public static wq3[] values() {
        return (wq3[]) d.clone();
    }
}
