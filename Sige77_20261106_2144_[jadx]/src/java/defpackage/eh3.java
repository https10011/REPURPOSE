package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class eh3 {
    public static final ah3 a;
    public static final ah3 b;
    public static final pg3 c;

    static {
        zg3 zg3Var = zg3.f;
        zg3 zg3Var2 = zg3.d;
        yg3 yg3Var = yg3.b;
        try {
            ep1 ep1VarB = ah3.b();
            ep1VarB.b = 32;
            ep1VarB.c = 16;
            ep1VarB.e = yg3Var;
            ep1VarB.d = zg3Var2;
            a = ep1VarB.F();
            try {
                ep1 ep1VarB2 = ah3.b();
                ep1VarB2.b = 32;
                ep1VarB2.c = 32;
                ep1VarB2.e = yg3Var;
                ep1VarB2.d = zg3Var2;
                ep1VarB2.F();
                try {
                    ep1 ep1VarB3 = ah3.b();
                    ep1VarB3.b = 64;
                    ep1VarB3.c = 32;
                    ep1VarB3.e = yg3Var;
                    ep1VarB3.d = zg3Var;
                    ep1VarB3.F();
                    try {
                        ep1 ep1VarB4 = ah3.b();
                        ep1VarB4.b = 64;
                        ep1VarB4.c = 64;
                        ep1VarB4.e = yg3Var;
                        ep1VarB4.d = zg3Var;
                        b = ep1VarB4.F();
                        try {
                            u23 u23VarB = pg3.b();
                            u23VarB.i(32);
                            u23VarB.k(16);
                            u23VarB.d = dz2.v;
                            c = u23VarB.g();
                        } catch (Exception e) {
                            throw new xp(10, e);
                        }
                    } catch (Exception e2) {
                        throw new xp(10, e2);
                    }
                } catch (Exception e3) {
                    throw new xp(10, e3);
                }
            } catch (Exception e4) {
                throw new xp(10, e4);
            }
        } catch (Exception e5) {
            throw new xp(10, e5);
        }
    }
}
