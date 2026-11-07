package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class q93 {
    public static final xn3 a;

    static {
        byte[] bArr = new byte[0];
        xn3 xn3Var = hy2.a;
        xk3 xk3Var = xk3.UNCOMPRESSED;
        ip3 ip3Var = ip3.TINK;
        a = a(xk3Var, xn3Var, ip3Var, bArr);
        a(xk3.COMPRESSED, xn3Var, ip3.RAW, bArr);
        a(xk3Var, hy2.c, ip3Var, bArr);
    }

    public static xn3 a(xk3 xk3Var, xn3 xn3Var, ip3 ip3Var, byte[] bArr) {
        zk3 zk3VarT = al3.t();
        ol3 ol3VarT = ql3.t();
        ol3VarT.f();
        ((ql3) ol3VarT.b).zze = tl3.NIST_P256.zza();
        ol3VarT.f();
        ((ql3) ol3VarT.b).zzf = bm3.SHA256.zza();
        nr2 nr2VarE = jr2.e(bArr, 0, bArr.length);
        ol3VarT.f();
        ql3.u((ql3) ol3VarT.b, nr2VarE);
        ql3 ql3Var = (ql3) ol3VarT.d();
        vk3 vk3VarT = wk3.t();
        vk3VarT.f();
        wk3.u((wk3) vk3VarT.b, xn3Var);
        wk3 wk3Var = (wk3) vk3VarT.d();
        cl3 cl3VarY = el3.y();
        cl3VarY.f();
        el3.w((el3) cl3VarY.b, ql3Var);
        cl3VarY.f();
        el3.u((el3) cl3VarY.b, wk3Var);
        cl3VarY.f();
        ((el3) cl3VarY.b).zzh = xk3Var.zza();
        el3 el3Var = (el3) cl3VarY.d();
        zk3VarT.f();
        al3.v((al3) zk3VarT.b, el3Var);
        al3 al3Var = (al3) zk3VarT.d();
        vn3 vn3VarT = xn3.t();
        nf3 nf3Var = f83.a;
        vn3VarT.i("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey");
        vn3VarT.h(ip3Var);
        vn3VarT.j(al3Var.b());
        return (xn3) vn3VarT.d();
    }
}
