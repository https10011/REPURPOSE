package defpackage;

import java.math.BigInteger;
import java.util.Hashtable;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class gh0 {
    public static final Hashtable a;
    public static final Hashtable b;

    static {
        gv gvVar = new gv(3);
        gv gvVar2 = new gv(4);
        Hashtable hashtable = new Hashtable();
        a = hashtable;
        Hashtable hashtable2 = new Hashtable();
        b = hashtable2;
        Hashtable hashtable3 = new Hashtable();
        q qVar = hh0.b;
        hashtable.put(ju1.a("wapip192v1"), qVar);
        hashtable3.put(qVar, "wapip192v1");
        hashtable2.put(qVar, gvVar2);
        q qVar2 = hh0.a;
        hashtable.put(ju1.a("sm2p256v1"), qVar2);
        hashtable3.put(qVar2, "sm2p256v1");
        hashtable2.put(qVar2, gvVar);
    }

    public static BigInteger a(String str) {
        return new BigInteger(1, cm0.a(str));
    }
}
