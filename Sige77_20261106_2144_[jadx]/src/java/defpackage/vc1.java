package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class vc1 {
    public static final vc1 a;
    public static final vc1 b;
    public static final vc1 c;
    public static final vc1 d;
    public static final /* synthetic */ vc1[] e;

    static {
        vc1 vc1Var = new vc1("IMMEDIATE", 0);
        a = vc1Var;
        vc1 vc1Var2 = new vc1("HIGH", 1);
        b = vc1Var2;
        vc1 vc1Var3 = new vc1("NORMAL", 2);
        c = vc1Var3;
        vc1 vc1Var4 = new vc1("LOW", 3);
        d = vc1Var4;
        e = new vc1[]{vc1Var, vc1Var2, vc1Var3, vc1Var4};
    }

    public static vc1 valueOf(String str) {
        return (vc1) Enum.valueOf(vc1.class, str);
    }

    public static vc1[] values() {
        return (vc1[]) e.clone();
    }
}
