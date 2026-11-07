package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class uc1 {
    public static final uc1 a;
    public static final uc1 b;
    public static final uc1 c;
    public static final /* synthetic */ uc1[] d;

    static {
        uc1 uc1Var = new uc1("DEFAULT", 0);
        a = uc1Var;
        uc1 uc1Var2 = new uc1("VERY_LOW", 1);
        b = uc1Var2;
        uc1 uc1Var3 = new uc1("HIGHEST", 2);
        c = uc1Var3;
        d = new uc1[]{uc1Var, uc1Var2, uc1Var3};
    }

    public static uc1 valueOf(String str) {
        return (uc1) Enum.valueOf(uc1.class, str);
    }

    public static uc1[] values() {
        return (uc1[]) d.clone();
    }
}
