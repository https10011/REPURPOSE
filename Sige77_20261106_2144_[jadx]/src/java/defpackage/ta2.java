package defpackage;

import java.util.Hashtable;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public abstract class ta2 {
    public static final Hashtable a;
    public static final Hashtable b;
    public static final Hashtable c;

    static {
        sa2 sa2Var = new sa2(2);
        sa2 sa2Var2 = new sa2(7);
        sa2 sa2Var3 = new sa2(8);
        sa2 sa2Var4 = new sa2(9);
        sa2 sa2Var5 = new sa2(10);
        sa2 sa2Var6 = new sa2(11);
        sa2 sa2Var7 = new sa2(12);
        sa2 sa2Var8 = new sa2(13);
        sa2 sa2Var9 = new sa2(14);
        rk1 rk1Var = new rk1(22);
        rk1 rk1Var2 = new rk1(23);
        rk1 rk1Var3 = new rk1(24);
        rk1 rk1Var4 = new rk1(25);
        rk1 rk1Var5 = new rk1(26);
        rk1 rk1Var6 = new rk1(27);
        rk1 rk1Var7 = new rk1(28);
        rk1 rk1Var8 = new rk1(29);
        sa2 sa2Var10 = new sa2(0);
        sa2 sa2Var11 = new sa2(1);
        sa2 sa2Var12 = new sa2(3);
        sa2 sa2Var13 = new sa2(4);
        sa2 sa2Var14 = new sa2(5);
        sa2 sa2Var15 = new sa2(6);
        a = new Hashtable();
        b = new Hashtable();
        c = new Hashtable();
        a("prime192v1", ya2.F, sa2Var);
        a("prime192v2", ya2.G, sa2Var2);
        a("prime192v3", ya2.H, sa2Var3);
        a("prime239v1", ya2.I, sa2Var4);
        a("prime239v2", ya2.J, sa2Var5);
        a("prime239v3", ya2.K, sa2Var6);
        a("prime256v1", ya2.L, sa2Var7);
        a("c2pnb163v1", ya2.n, sa2Var8);
        a("c2pnb163v2", ya2.o, sa2Var9);
        a("c2pnb163v3", ya2.p, rk1Var);
        a("c2pnb176w1", ya2.q, rk1Var2);
        a("c2tnb191v1", ya2.r, rk1Var3);
        a("c2tnb191v2", ya2.s, rk1Var4);
        a("c2tnb191v3", ya2.t, rk1Var5);
        a("c2pnb208w1", ya2.u, rk1Var6);
        a("c2tnb239v1", ya2.x, rk1Var7);
        a("c2tnb239v2", ya2.y, rk1Var8);
        a("c2tnb239v3", ya2.z, sa2Var10);
        a("c2pnb272w1", ya2.A, sa2Var11);
        a("c2pnb304w1", ya2.B, sa2Var12);
        a("c2tnb359v1", ya2.C, sa2Var13);
        a("c2pnb368w1", ya2.D, sa2Var14);
        a("c2tnb431r1", ya2.E, sa2Var15);
    }

    public static void a(String str, q qVar, wa2 wa2Var) {
        a.put(str, qVar);
        c.put(qVar, str);
        b.put(qVar, wa2Var);
    }
}
