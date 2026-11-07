package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class gm extends bt0 {
    public final pk v;

    public gm(pk pkVar) {
        this.v = pkVar;
    }

    @Override // defpackage.bt0
    public final boolean q() {
        return true;
    }

    @Override // defpackage.bt0
    public final void r(Throwable th) {
        boolean zO;
        lt0 lt0VarP = p();
        pk pkVar = this.v;
        Throwable thQ = pkVar.q(lt0VarP);
        if (pkVar.y()) {
            fs fsVar = pkVar.d;
            fsVar.getClass();
            zO = ((f20) fsVar).o(thQ);
        } else {
            zO = false;
        }
        if (zO) {
            return;
        }
        pkVar.n(thQ);
        if (pkVar.y()) {
            return;
        }
        pkVar.o();
    }
}
