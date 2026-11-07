package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class hy2 {
    public static final xn3 a = a(16);
    public static final xn3 b = a(32);
    public static final xn3 c;

    static {
        c(16);
        c(32);
        c = b(16, 16);
        b(32, 32);
        vn3 vn3VarT = xn3.t();
        nf3 nf3Var = vz2.a;
        vn3VarT.i("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        ip3 ip3Var = ip3.TINK;
        vn3VarT.h(ip3Var);
        vn3 vn3VarT2 = xn3.t();
        nf3 nf3Var2 = u13.a;
        vn3VarT2.i("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        vn3VarT2.h(ip3Var);
    }

    public static xn3 a(int i) {
        wj3 wj3VarX = xj3.x();
        wj3VarX.f();
        ((xj3) wj3VarX.b).zze = i;
        xj3 xj3Var = (xj3) wj3VarX.d();
        vn3 vn3VarT = xn3.t();
        vn3VarT.j(xj3Var.b());
        nf3 nf3Var = mz2.a;
        vn3VarT.i("type.googleapis.com/google.crypto.tink.AesGcmKey");
        vn3VarT.h(ip3.TINK);
        return (xn3) vn3VarT.d();
    }

    public static xn3 b(int i, int i2) {
        bj3 bj3VarW = cj3.w();
        ej3 ej3VarV = fj3.v();
        ej3VarV.f();
        ((fj3) ej3VarV.b).zze = 16;
        fj3 fj3Var = (fj3) ej3VarV.d();
        bj3VarW.f();
        cj3.v((cj3) bj3VarW.b, fj3Var);
        bj3VarW.f();
        ((cj3) bj3VarW.b).zzg = i;
        cj3 cj3Var = (cj3) bj3VarW.d();
        em3 em3VarY = fm3.y();
        im3 im3VarX = km3.x();
        im3VarX.f();
        ((km3) im3VarX.b).zze = bm3.SHA256.zza();
        im3VarX.f();
        ((km3) im3VarX.b).zzf = i2;
        km3 km3Var = (km3) im3VarX.d();
        em3VarY.f();
        fm3.w((fm3) em3VarY.b, km3Var);
        em3VarY.f();
        ((fm3) em3VarY.b).zzg = 32;
        fm3 fm3Var = (fm3) em3VarY.d();
        si3 si3VarT = ui3.t();
        si3VarT.f();
        ui3.v((ui3) si3VarT.b, cj3Var);
        si3VarT.f();
        ui3.w((ui3) si3VarT.b, fm3Var);
        ui3 ui3Var = (ui3) si3VarT.d();
        vn3 vn3VarT = xn3.t();
        vn3VarT.j(ui3Var.b());
        nf3 nf3Var = ry2.a;
        vn3VarT.i("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        vn3VarT.h(ip3.TINK);
        return (xn3) vn3VarT.d();
    }

    public static void c(int i) {
        lj3 lj3VarX = mj3.x();
        lj3VarX.f();
        ((mj3) lj3VarX.b).zzg = i;
        pj3 pj3VarV = qj3.v();
        pj3VarV.f();
        ((qj3) pj3VarV.b).zze = 16;
        qj3 qj3Var = (qj3) pj3VarV.d();
        lj3VarX.f();
        mj3.w((mj3) lj3VarX.b, qj3Var);
        mj3 mj3Var = (mj3) lj3VarX.d();
        vn3 vn3VarT = xn3.t();
        vn3VarT.j(mj3Var.b());
        nf3 nf3Var = cz2.a;
        vn3VarT.i("type.googleapis.com/google.crypto.tink.AesEaxKey");
        vn3VarT.h(ip3.TINK);
    }
}
