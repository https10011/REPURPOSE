package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class px0 {
    public static final px0 a;
    public static final /* synthetic */ px0[] b;

    /* JADX INFO: Fake field, exist only in values array */
    px0 EF0;

    static {
        px0 px0Var = new px0("email", 0);
        px0 px0Var2 = new px0("qrCode", 1);
        a = px0Var2;
        b = new px0[]{px0Var, px0Var2};
    }

    public static px0 valueOf(String str) {
        return (px0) Enum.valueOf(px0.class, str);
    }

    public static px0[] values() {
        return (px0[]) b.clone();
    }
}
