package defpackage;

import java.util.Hashtable;
import java.util.Vector;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class hv {
    public static final Hashtable a;
    public static final Hashtable b;
    public static final Hashtable c;
    public static final Hashtable d;
    public static final Vector e;

    static {
        l lVar = new l(11);
        l lVar2 = new l(22);
        l lVar3 = new l(26);
        l lVar4 = new l(27);
        l lVar5 = new l(28);
        l lVar6 = new l(29);
        gv gvVar = new gv(0);
        gv gvVar2 = new gv(1);
        gv gvVar3 = new gv(2);
        l lVar7 = new l(1);
        l lVar8 = new l(2);
        l lVar9 = new l(3);
        l lVar10 = new l(4);
        l lVar11 = new l(5);
        l lVar12 = new l(6);
        l lVar13 = new l(7);
        l lVar14 = new l(8);
        l lVar15 = new l(9);
        l lVar16 = new l(10);
        l lVar17 = new l(12);
        l lVar18 = new l(13);
        l lVar19 = new l(14);
        l lVar20 = new l(15);
        l lVar21 = new l(16);
        l lVar22 = new l(17);
        l lVar23 = new l(18);
        l lVar24 = new l(19);
        l lVar25 = new l(20);
        l lVar26 = new l(21);
        l lVar27 = new l(23);
        l lVar28 = new l(24);
        l lVar29 = new l(25);
        Hashtable hashtable = new Hashtable();
        a = hashtable;
        b = new Hashtable();
        c = new Hashtable();
        d = new Hashtable();
        Vector vector = new Vector();
        e = vector;
        vector.addElement("curve25519");
        hashtable.put(ju1.a("curve25519"), lVar);
        b("secp128r1", tk1.t, lVar2);
        b("secp160k1", tk1.i, lVar3);
        b("secp160r1", tk1.h, lVar4);
        b("secp160r2", tk1.v, lVar5);
        b("secp192k1", tk1.w, lVar6);
        q qVar = tk1.F;
        b("secp192r1", qVar, gvVar);
        b("secp224k1", tk1.x, gvVar2);
        q qVar2 = tk1.y;
        b("secp224r1", qVar2, gvVar3);
        b("secp256k1", tk1.j, lVar7);
        q qVar3 = tk1.G;
        b("secp256r1", qVar3, lVar8);
        q qVar4 = tk1.z;
        b("secp384r1", qVar4, lVar9);
        q qVar5 = tk1.A;
        b("secp521r1", qVar5, lVar10);
        b("sect113r1", tk1.d, lVar11);
        b("sect113r2", tk1.e, lVar12);
        b("sect131r1", tk1.n, lVar13);
        b("sect131r2", tk1.o, lVar14);
        q qVar6 = tk1.a;
        b("sect163k1", qVar6, lVar15);
        b("sect163r1", tk1.b, lVar16);
        q qVar7 = tk1.k;
        b("sect163r2", qVar7, lVar17);
        b("sect193r1", tk1.p, lVar18);
        b("sect193r2", tk1.q, lVar19);
        q qVar8 = tk1.r;
        b("sect233k1", qVar8, lVar20);
        q qVar9 = tk1.s;
        b("sect233r1", qVar9, lVar21);
        b("sect239k1", tk1.c, lVar22);
        q qVar10 = tk1.l;
        b("sect283k1", qVar10, lVar23);
        q qVar11 = tk1.m;
        b("sect283r1", qVar11, lVar24);
        q qVar12 = tk1.B;
        b("sect409k1", qVar12, lVar25);
        q qVar13 = tk1.C;
        b("sect409r1", qVar13, lVar26);
        q qVar14 = tk1.D;
        b("sect571k1", qVar14, lVar27);
        q qVar15 = tk1.E;
        b("sect571r1", qVar15, lVar28);
        b("sm2p256v1", hh0.a, lVar29);
        a(qVar7, "B-163");
        a(qVar9, "B-233");
        a(qVar11, "B-283");
        a(qVar13, "B-409");
        a(qVar15, "B-571");
        a(qVar6, "K-163");
        a(qVar8, "K-233");
        a(qVar10, "K-283");
        a(qVar12, "K-409");
        a(qVar14, "K-571");
        a(qVar, "P-192");
        a(qVar2, "P-224");
        a(qVar3, "P-256");
        a(qVar4, "P-384");
        a(qVar5, "P-521");
    }

    public static void a(q qVar, String str) {
        Object obj = c.get(qVar);
        if (obj == null) {
            uq1.n();
            return;
        }
        String strA = ju1.a(str);
        b.put(strA, qVar);
        a.put(strA, obj);
    }

    public static void b(String str, q qVar, wa2 wa2Var) {
        e.addElement(str);
        d.put(qVar, str);
        c.put(qVar, wa2Var);
        String strA = ju1.a(str);
        b.put(strA, qVar);
        a.put(strA, wa2Var);
    }
}
