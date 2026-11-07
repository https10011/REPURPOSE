package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class j01 {
    public static final j01 a;
    public static final j01 b;
    public static final /* synthetic */ j01[] c;

    /* JADX INFO: Fake field, exist only in values array */
    j01 EF0;

    static {
        j01 j01Var = new j01("REQUESTS", 0);
        j01 j01Var2 = new j01("INCLUDE_ACCESS_TOKENS", 1);
        j01 j01Var3 = new j01("INCLUDE_RAW_RESPONSES", 2);
        j01 j01Var4 = new j01("CACHE", 3);
        j01 j01Var5 = new j01("APP_EVENTS", 4);
        a = j01Var5;
        j01 j01Var6 = new j01("DEVELOPER_ERRORS", 5);
        b = j01Var6;
        c = new j01[]{j01Var, j01Var2, j01Var3, j01Var4, j01Var5, j01Var6, new j01("GRAPH_API_DEBUG_WARNING", 6), new j01("GRAPH_API_DEBUG_INFO", 7)};
    }

    public static j01 valueOf(String str) {
        return (j01) Enum.valueOf(j01.class, str);
    }

    public static j01[] values() {
        return (j01[]) c.clone();
    }
}
