package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class b11 extends z01 {
    public s60 d;

    @Override // defpackage.z01
    public final int b(Object obj) {
        pi1 pi1Var = (pi1) obj;
        if (pi1Var == null) {
            return 1;
        }
        return pi1Var.b();
    }

    @Override // defpackage.z01
    public final void c(Object obj, Object obj2) {
        pi1 pi1Var = (pi1) obj2;
        s60 s60Var = this.d;
        if (s60Var == null || pi1Var == null) {
            return;
        }
        s60Var.e.c(pi1Var, true);
    }
}
