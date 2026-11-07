package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public class tk0 extends xo1 {
    public l02 a = null;

    @Override // defpackage.l02
    public final Object b(au0 au0Var) {
        l02 l02Var = this.a;
        if (l02Var != null) {
            return l02Var.b(au0Var);
        }
        uq1.q("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        return null;
    }

    @Override // defpackage.l02
    public final void c(eu0 eu0Var, Object obj) {
        l02 l02Var = this.a;
        if (l02Var != null) {
            l02Var.c(eu0Var, obj);
        } else {
            uq1.q("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        }
    }

    @Override // defpackage.xo1
    public final l02 d() {
        l02 l02Var = this.a;
        if (l02Var != null) {
            return l02Var;
        }
        uq1.q("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        return null;
    }
}
