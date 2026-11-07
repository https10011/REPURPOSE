package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class la0 {
    public static final la0 a;
    public static final la0 b;
    public static final la0 c;
    public static final la0 d;
    public static final /* synthetic */ la0[] e;

    static {
        la0 la0Var = new la0("NOT_LOADED", 0);
        a = la0Var;
        la0 la0Var2 = new la0("LOADING", 1);
        b = la0Var2;
        la0 la0Var3 = new la0("SUCCESS", 2);
        c = la0Var3;
        la0 la0Var4 = new la0("ERROR", 3);
        d = la0Var4;
        e = new la0[]{la0Var, la0Var2, la0Var3, la0Var4};
    }

    public static la0 valueOf(String str) {
        return (la0) Enum.valueOf(la0.class, str);
    }

    public static la0[] values() {
        return (la0[]) e.clone();
    }
}
