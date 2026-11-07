package defpackage;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public abstract class sx2 {
    public static final /* synthetic */ int a = 0;

    static {
        Charset.forName("UTF-8");
    }

    public static lo3 a(go3 go3Var) {
        ko3 ko3VarV = lo3.v();
        int iZ = go3Var.z();
        ko3VarV.f();
        ((lo3) ko3VarV.b).zze = iZ;
        for (eo3 eo3Var : go3Var.B()) {
            io3 io3VarX = jo3.x();
            String strA = eo3Var.y().A();
            io3VarX.f();
            jo3.u((jo3) io3VarX.b, strA);
            int iZ2 = eo3Var.z();
            io3VarX.f();
            ((jo3) io3VarX.b).zzf = ck1.h(iZ2);
            ip3 ip3VarB = eo3Var.B();
            io3VarX.f();
            ((jo3) io3VarX.b).zzh = ip3VarB.zza();
            int iT = eo3Var.t();
            io3VarX.f();
            ((jo3) io3VarX.b).zzg = iT;
            jo3 jo3Var = (jo3) io3VarX.d();
            ko3VarV.f();
            lo3.u((lo3) ko3VarV.b, jo3Var);
        }
        return (lo3) ko3VarV.d();
    }
}
