package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class lw0 {
    public static final lw0 a;
    public static final lw0 b;
    public static final lw0 c;
    public static final lw0 d;
    public static final lw0 e;
    public static final /* synthetic */ lw0[] f;

    static {
        lw0 lw0Var = new lw0("DESTROYED", 0);
        a = lw0Var;
        lw0 lw0Var2 = new lw0("INITIALIZED", 1);
        b = lw0Var2;
        lw0 lw0Var3 = new lw0("CREATED", 2);
        c = lw0Var3;
        lw0 lw0Var4 = new lw0("STARTED", 3);
        d = lw0Var4;
        lw0 lw0Var5 = new lw0("RESUMED", 4);
        e = lw0Var5;
        f = new lw0[]{lw0Var, lw0Var2, lw0Var3, lw0Var4, lw0Var5};
    }

    public static lw0 valueOf(String str) {
        return (lw0) Enum.valueOf(lw0.class, str);
    }

    public static lw0[] values() {
        return (lw0[]) f.clone();
    }
}
