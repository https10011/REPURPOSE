package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class ea2 {
    public static final /* synthetic */ ea2[] W;
    public static final ea2 a;
    public static final ea2 b;
    public static final ea2 c;
    public static final ea2 d;
    public static final ea2 e;
    public static final ea2 f;
    public static final ea2 i;
    public static final ea2 v;
    public static final ea2 w;

    static {
        ea2 ea2Var = new ea2("INT", 0);
        a = ea2Var;
        ea2 ea2Var2 = new ea2("LONG", 1);
        b = ea2Var2;
        ea2 ea2Var3 = new ea2("FLOAT", 2);
        c = ea2Var3;
        ea2 ea2Var4 = new ea2("DOUBLE", 3);
        d = ea2Var4;
        ea2 ea2Var5 = new ea2("BOOLEAN", 4);
        e = ea2Var5;
        ea2 ea2Var6 = new ea2("STRING", 5);
        f = ea2Var6;
        qj qjVar = qj.c;
        ea2 ea2Var7 = new ea2("BYTE_STRING", 6);
        i = ea2Var7;
        ea2 ea2Var8 = new ea2("ENUM", 7);
        v = ea2Var8;
        ea2 ea2Var9 = new ea2("MESSAGE", 8);
        w = ea2Var9;
        W = new ea2[]{ea2Var, ea2Var2, ea2Var3, ea2Var4, ea2Var5, ea2Var6, ea2Var7, ea2Var8, ea2Var9};
    }

    public static ea2 valueOf(String str) {
        return (ea2) Enum.valueOf(ea2.class, str);
    }

    public static ea2[] values() {
        return (ea2[]) W.clone();
    }
}
