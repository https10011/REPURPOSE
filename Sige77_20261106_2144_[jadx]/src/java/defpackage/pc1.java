package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class pc1 {
    public static final pc1 a;
    public static final /* synthetic */ pc1[] b;

    /* JADX INFO: Fake field, exist only in values array */
    pc1 EF0;

    static {
        pc1 pc1Var = new pc1("SRGB", 0);
        pc1 pc1Var2 = new pc1("DISPLAY_P3", 1);
        a = pc1Var2;
        b = new pc1[]{pc1Var, pc1Var2};
    }

    public static pc1 valueOf(String str) {
        return (pc1) Enum.valueOf(pc1.class, str);
    }

    public static pc1[] values() {
        return (pc1[]) b.clone();
    }
}
