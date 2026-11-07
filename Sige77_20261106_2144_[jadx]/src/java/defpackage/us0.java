package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class us0 {
    public static final us0 W;
    public static final /* synthetic */ us0[] X;
    public static final us0 a;
    public static final us0 b;
    public static final us0 c;
    public static final us0 d;
    public static final us0 e;
    public static final us0 f;
    public static final us0 i;
    public static final us0 v;
    public static final us0 w;

    static {
        us0 us0Var = new us0("VOID", 0);
        a = us0Var;
        us0 us0Var2 = new us0("INT", 1);
        b = us0Var2;
        us0 us0Var3 = new us0("LONG", 2);
        c = us0Var3;
        us0 us0Var4 = new us0("FLOAT", 3);
        d = us0Var4;
        us0 us0Var5 = new us0("DOUBLE", 4);
        e = us0Var5;
        us0 us0Var6 = new us0("BOOLEAN", 5);
        f = us0Var6;
        us0 us0Var7 = new us0("STRING", 6);
        i = us0Var7;
        qj qjVar = qj.c;
        us0 us0Var8 = new us0("BYTE_STRING", 7);
        v = us0Var8;
        us0 us0Var9 = new us0("ENUM", 8);
        w = us0Var9;
        us0 us0Var10 = new us0("MESSAGE", 9);
        W = us0Var10;
        X = new us0[]{us0Var, us0Var2, us0Var3, us0Var4, us0Var5, us0Var6, us0Var7, us0Var8, us0Var9, us0Var10};
    }

    public static us0 valueOf(String str) {
        return (us0) Enum.valueOf(us0.class, str);
    }

    public static us0[] values() {
        return (us0[]) X.clone();
    }
}
