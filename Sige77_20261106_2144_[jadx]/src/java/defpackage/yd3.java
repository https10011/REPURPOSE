package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class yd3 {
    public static final yd3 a;
    public static final yd3 b;
    public static final /* synthetic */ yd3[] c;

    static {
        yd3 yd3Var = new yd3("CONSENT", 0);
        a = yd3Var;
        yd3 yd3Var2 = new yd3("LEGITIMATE_INTEREST", 1);
        yd3 yd3Var3 = new yd3("FLEXIBLE_CONSENT", 2);
        yd3 yd3Var4 = new yd3("FLEXIBLE_LEGITIMATE_INTEREST", 3);
        b = yd3Var4;
        c = new yd3[]{yd3Var, yd3Var2, yd3Var3, yd3Var4};
    }

    public static yd3[] values() {
        return (yd3[]) c.clone();
    }
}
