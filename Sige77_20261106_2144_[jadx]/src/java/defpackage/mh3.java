package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class mh3 {
    public static final rc2 a;
    public static final rc2 b;
    public static final gf3 c;
    public static final cf3 d;
    public static final hd3 e;
    public static final ad3 f;

    static {
        tr3 tr3VarC = kg3.c("type.googleapis.com/google.crypto.tink.HmacKey");
        hd2 hd2VarD = rc2.D();
        hd2VarD.l(ip3.RAW, yg3.e);
        hd2VarD.l(ip3.TINK, yg3.b);
        hd2VarD.l(ip3.LEGACY, yg3.d);
        hd2VarD.l(ip3.CRUNCHY, yg3.c);
        a = hd2VarD.k();
        hd2 hd2VarD2 = rc2.D();
        hd2VarD2.l(bm3.SHA1, zg3.b);
        hd2VarD2.l(bm3.SHA224, zg3.c);
        hd2VarD2.l(bm3.SHA256, zg3.d);
        hd2VarD2.l(bm3.SHA384, zg3.e);
        hd2VarD2.l(bm3.SHA512, zg3.f);
        b = hd2VarD2.k();
        c = new gf3(ah3.class, new ba0(23));
        d = new cf3(tr3VarC, new xn(23));
        e = new hd3(rg3.class, new br0(23));
        f = new ad3(tr3VarC, new op0(23));
    }
}
