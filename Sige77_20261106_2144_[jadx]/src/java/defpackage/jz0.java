package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public class jz0 extends l62 {
    public static final qh1 f = new qh1(7);
    public final ks1 d = new ks1();
    public boolean e = false;

    @Override // defpackage.l62
    public final void b() {
        ks1 ks1Var = this.d;
        int i = ks1Var.c;
        for (int i2 = 0; i2 < i; i2++) {
            hz0 hz0Var = (hz0) ks1Var.b[i2];
            hi2 hi2Var = hz0Var.l;
            hi2Var.a();
            hi2Var.c = true;
            iz0 iz0Var = hz0Var.n;
            if (iz0Var != null) {
                hz0Var.i(iz0Var);
            }
            hz0 hz0Var2 = hi2Var.a;
            if (hz0Var2 == null) {
                uq1.q("No listener register");
                return;
            }
            if (hz0Var2 != hz0Var) {
                e.g("Attempting to unregister the wrong listener");
                return;
            }
            hi2Var.a = null;
            if (iz0Var != null) {
                boolean z = iz0Var.b;
            }
            hi2Var.d = true;
            hi2Var.b = false;
            hi2Var.c = false;
            hi2Var.e = false;
        }
        int i3 = ks1Var.c;
        Object[] objArr = ks1Var.b;
        for (int i4 = 0; i4 < i3; i4++) {
            objArr[i4] = null;
        }
        ks1Var.c = 0;
    }
}
