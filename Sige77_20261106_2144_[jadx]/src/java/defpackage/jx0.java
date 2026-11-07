package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class jx0 {
    public static final jx0 a;
    public static final jx0 b;
    public static final jx0 c;
    public static final jx0 d;
    public static final jx0 e;
    public static final jx0 f;
    public static final /* synthetic */ jx0[] i;

    static {
        jx0 jx0Var = new jx0("SUCCESS", 0);
        a = jx0Var;
        jx0 jx0Var2 = new jx0("CANCEL", 1);
        b = jx0Var2;
        jx0 jx0Var3 = new jx0("NETWORK_ERROR", 2);
        c = jx0Var3;
        jx0 jx0Var4 = new jx0("SERVER_ERROR", 3);
        d = jx0Var4;
        jx0 jx0Var5 = new jx0("AUTHENTICATION_AGENT_ERROR", 4);
        e = jx0Var5;
        jx0 jx0Var6 = new jx0("INTERNAL_ERROR", 5);
        f = jx0Var6;
        i = new jx0[]{jx0Var, jx0Var2, jx0Var3, jx0Var4, jx0Var5, jx0Var6};
    }

    public static jx0 valueOf(String str) {
        return (jx0) Enum.valueOf(jx0.class, str);
    }

    public static jx0[] values() {
        return (jx0[]) i.clone();
    }
}
