package defpackage;

import java.math.BigInteger;
import java.util.Hashtable;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public abstract class sk1 {
    public static final Hashtable a;
    public static final Hashtable b;
    public static final Hashtable c;

    static {
        gv gvVar = new gv(15);
        gv gvVar2 = new gv(26);
        rk1 rk1Var = new rk1(1);
        rk1 rk1Var2 = new rk1(2);
        rk1 rk1Var3 = new rk1(3);
        rk1 rk1Var4 = new rk1(4);
        rk1 rk1Var5 = new rk1(5);
        rk1 rk1Var6 = new rk1(6);
        rk1 rk1Var7 = new rk1(7);
        gv gvVar3 = new gv(5);
        gv gvVar4 = new gv(6);
        gv gvVar5 = new gv(7);
        gv gvVar6 = new gv(8);
        gv gvVar7 = new gv(9);
        gv gvVar8 = new gv(10);
        gv gvVar9 = new gv(11);
        gv gvVar10 = new gv(12);
        gv gvVar11 = new gv(13);
        gv gvVar12 = new gv(14);
        gv gvVar13 = new gv(16);
        gv gvVar14 = new gv(17);
        gv gvVar15 = new gv(18);
        gv gvVar16 = new gv(19);
        gv gvVar17 = new gv(20);
        gv gvVar18 = new gv(21);
        gv gvVar19 = new gv(22);
        gv gvVar20 = new gv(23);
        gv gvVar21 = new gv(24);
        gv gvVar22 = new gv(25);
        gv gvVar23 = new gv(27);
        gv gvVar24 = new gv(28);
        gv gvVar25 = new gv(29);
        rk1 rk1Var8 = new rk1(0);
        a = new Hashtable();
        b = new Hashtable();
        c = new Hashtable();
        b("secp112r1", tk1.f, gvVar);
        b("secp112r2", tk1.g, gvVar2);
        b("secp128r1", tk1.t, rk1Var);
        b("secp128r2", tk1.u, rk1Var2);
        b("secp160k1", tk1.i, rk1Var3);
        b("secp160r1", tk1.h, rk1Var4);
        b("secp160r2", tk1.v, rk1Var5);
        b("secp192k1", tk1.w, rk1Var6);
        b("secp192r1", tk1.F, rk1Var7);
        b("secp224k1", tk1.x, gvVar3);
        b("secp224r1", tk1.y, gvVar4);
        b("secp256k1", tk1.j, gvVar5);
        b("secp256r1", tk1.G, gvVar6);
        b("secp384r1", tk1.z, gvVar7);
        b("secp521r1", tk1.A, gvVar8);
        b("sect113r1", tk1.d, gvVar9);
        b("sect113r2", tk1.e, gvVar10);
        b("sect131r1", tk1.n, gvVar11);
        b("sect131r2", tk1.o, gvVar12);
        b("sect163k1", tk1.a, gvVar13);
        b("sect163r1", tk1.b, gvVar14);
        b("sect163r2", tk1.k, gvVar15);
        b("sect193r1", tk1.p, gvVar16);
        b("sect193r2", tk1.q, gvVar17);
        b("sect233k1", tk1.r, gvVar18);
        b("sect233r1", tk1.s, gvVar19);
        b("sect239k1", tk1.c, gvVar20);
        b("sect283k1", tk1.l, gvVar21);
        b("sect283r1", tk1.m, gvVar22);
        b("sect409k1", tk1.B, gvVar23);
        b("sect409r1", tk1.C, gvVar24);
        b("sect571k1", tk1.D, gvVar25);
        b("sect571r1", tk1.E, rk1Var8);
    }

    public static BigInteger a(String str) {
        return new BigInteger(1, cm0.a(str));
    }

    public static void b(String str, q qVar, wa2 wa2Var) {
        a.put(str, qVar);
        c.put(qVar, str);
        b.put(qVar, wa2Var);
    }
}
