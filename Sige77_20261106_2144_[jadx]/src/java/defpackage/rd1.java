package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class rd1 {
    public static final rd1 a;
    public static final /* synthetic */ rd1[] b;

    static {
        rd1 rd1Var = new rd1("DEFAULT", 0);
        a = rd1Var;
        b = new rd1[]{rd1Var, new rd1("SIGNED", 1), new rd1("FIXED", 2)};
    }

    public static rd1 valueOf(String str) {
        return (rd1) Enum.valueOf(rd1.class, str);
    }

    public static rd1[] values() {
        return (rd1[]) b.clone();
    }
}
