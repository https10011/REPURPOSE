package defpackage;

import java.util.Hashtable;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class i61 {
    public static final Hashtable a = new Hashtable();
    public static final Hashtable b = new Hashtable();

    static {
        a(tk1.E, "B-571");
        a(tk1.C, "B-409");
        a(tk1.m, "B-283");
        a(tk1.s, "B-233");
        a(tk1.k, "B-163");
        a(tk1.D, "K-571");
        a(tk1.B, "K-409");
        a(tk1.l, "K-283");
        a(tk1.r, "K-233");
        a(tk1.a, "K-163");
        a(tk1.A, "P-521");
        a(tk1.z, "P-384");
        a(tk1.G, "P-256");
        a(tk1.y, "P-224");
        a(tk1.F, "P-192");
    }

    public static void a(q qVar, String str) {
        a.put(str, qVar);
        b.put(qVar, str);
    }
}
