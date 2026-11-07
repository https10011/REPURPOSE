package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class xd0 {
    public static final xd0 a;
    public static final xd0 b;
    public static final xd0 c;
    public static final /* synthetic */ xd0[] d;

    static {
        xd0 xd0Var = new xd0("SUCCESS", 0);
        a = xd0Var;
        xd0 xd0Var2 = new xd0("SERVER_ERROR", 1);
        b = xd0Var2;
        xd0 xd0Var3 = new xd0("NO_CONNECTIVITY", 2);
        c = xd0Var3;
        d = new xd0[]{xd0Var, xd0Var2, xd0Var3, new xd0("UNKNOWN_ERROR", 3)};
    }

    public static xd0 valueOf(String str) {
        return (xd0) Enum.valueOf(xd0.class, str);
    }

    public static xd0[] values() {
        return (xd0[]) d.clone();
    }
}
