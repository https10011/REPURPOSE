package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class qq1 {
    public static final qq1 a;
    public static final /* synthetic */ qq1[] b;

    /* JADX INFO: Fake field, exist only in values array */
    qq1 EF0;

    static {
        qq1 qq1Var = new qq1("HmacSHA1", 0);
        qq1 qq1Var2 = new qq1("HmacSHA256", 1);
        qq1 qq1Var3 = new qq1("HmacMD5", 2);
        a = qq1Var3;
        b = new qq1[]{qq1Var, qq1Var2, qq1Var3};
    }

    public static qq1 valueOf(String str) {
        return (qq1) Enum.valueOf(qq1.class, str);
    }

    public static qq1[] values() {
        return (qq1[]) b.clone();
    }
}
