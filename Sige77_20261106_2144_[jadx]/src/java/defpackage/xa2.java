package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class xa2 extends p implements ya2 {
    public q a = ya2.k;
    public r b;

    public xa2(int i, int i2, int i3, int i4) {
        gk1 gk1Var = new gk1(2);
        gk1Var.k(new o(i));
        if (i3 == 0) {
            if (i4 != 0) {
                e.g("inconsistent k values");
                throw null;
            }
            gk1Var.k(ya2.l);
            gk1Var.k(new o(i2));
        } else {
            if (i3 <= i2 || i4 <= i3) {
                e.g("inconsistent k values");
                throw null;
            }
            gk1Var.k(ya2.m);
            gk1 gk1Var2 = new gk1(2);
            gk1Var2.k(new o(i2));
            gk1Var2.k(new o(i3));
            gk1Var2.k(new o(i4));
            gk1Var.k(new bw(gk1Var2));
        }
        this.b = new bw(gk1Var);
    }

    @Override // defpackage.p
    public final r a() {
        gk1 gk1Var = new gk1(2);
        gk1Var.k(this.a);
        gk1Var.k(this.b);
        return new bw(gk1Var);
    }
}
