package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class nm0 {
    public static final nm0 a;
    public static final nm0 b;
    public static final /* synthetic */ nm0[] c;

    static {
        nm0 nm0Var = new nm0("GET", 0);
        a = nm0Var;
        nm0 nm0Var2 = new nm0("POST", 1);
        b = nm0Var2;
        c = new nm0[]{nm0Var, nm0Var2, new nm0("DELETE", 2)};
    }

    public static nm0 valueOf(String str) {
        return (nm0) Enum.valueOf(nm0.class, str);
    }

    public static nm0[] values() {
        return (nm0[]) c.clone();
    }
}
