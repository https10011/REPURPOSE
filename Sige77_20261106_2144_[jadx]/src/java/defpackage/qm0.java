package defpackage;

import okhttp3.Call;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class qm0 extends rm0 {
    public final yj d;

    public qm0(fi1 fi1Var, Call.Factory factory, ls lsVar, yj yjVar) {
        super(fi1Var, factory, lsVar);
        this.d = yjVar;
    }

    @Override // defpackage.rm0
    public final Object b(l81 l81Var, Object[] objArr) {
        wj wjVar = (wj) this.d.l(l81Var);
        fs fsVar = (fs) objArr[objArr.length - 1];
        try {
            pk pkVar = new pk(1, sr0.b(fsVar));
            pkVar.u();
            pkVar.w(new lv0(wjVar, 2));
            wjVar.w(new gk1(pkVar, 12));
            Object objS = pkVar.s();
            ft ftVar = ft.a;
            return objS;
        } catch (Exception e) {
            am2.X(e, fsVar);
            return ft.a;
        }
    }
}
