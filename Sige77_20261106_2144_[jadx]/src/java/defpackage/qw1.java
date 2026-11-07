package defpackage;

import java.util.Hashtable;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class qw1 {
    public static final Hashtable a;
    public static final Hashtable b;
    public static final Hashtable c;

    static {
        rk1 rk1Var = new rk1(13);
        rk1 rk1Var2 = new rk1(14);
        rk1 rk1Var3 = new rk1(15);
        rk1 rk1Var4 = new rk1(16);
        rk1 rk1Var5 = new rk1(17);
        rk1 rk1Var6 = new rk1(18);
        rk1 rk1Var7 = new rk1(19);
        rk1 rk1Var8 = new rk1(20);
        rk1 rk1Var9 = new rk1(21);
        rk1 rk1Var10 = new rk1(8);
        rk1 rk1Var11 = new rk1(9);
        rk1 rk1Var12 = new rk1(10);
        rk1 rk1Var13 = new rk1(11);
        rk1 rk1Var14 = new rk1(12);
        a = new Hashtable();
        b = new Hashtable();
        c = new Hashtable();
        a("brainpoolp160r1", rw1.a, rk1Var);
        a("brainpoolp160t1", rw1.b, rk1Var2);
        a("brainpoolp192r1", rw1.c, rk1Var3);
        a("brainpoolp192t1", rw1.d, rk1Var4);
        a("brainpoolp224r1", rw1.e, rk1Var5);
        a("brainpoolp224t1", rw1.f, rk1Var6);
        a("brainpoolp256r1", rw1.g, rk1Var7);
        a("brainpoolp256t1", rw1.h, rk1Var8);
        a("brainpoolp320r1", rw1.i, rk1Var9);
        a("brainpoolp320t1", rw1.j, rk1Var10);
        a("brainpoolp384r1", rw1.k, rk1Var11);
        a("brainpoolp384t1", rw1.l, rk1Var12);
        a("brainpoolp512r1", rw1.m, rk1Var13);
        a("brainpoolp512t1", rw1.n, rk1Var14);
    }

    public static void a(String str, q qVar, wa2 wa2Var) {
        a.put(str, qVar);
        c.put(qVar, str);
        b.put(qVar, wa2Var);
    }
}
