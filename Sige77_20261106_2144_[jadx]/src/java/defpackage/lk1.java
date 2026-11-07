package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class lk1 extends d42 {
    @Override // defpackage.d42
    public final void l(yp1 yp1Var, float f, float f2) {
        float f3 = f2 * f;
        yp1Var.d(f3, 180.0f, 90.0f);
        float f4 = f3 * 2.0f;
        up1 up1Var = new up1(0.0f, 0.0f, f4, f4);
        up1Var.f = 180.0f;
        up1Var.g = 90.0f;
        yp1Var.f.add(up1Var);
        sp1 sp1Var = new sp1(up1Var);
        yp1Var.a(180.0f);
        yp1Var.g.add(sp1Var);
        yp1Var.d = 270.0f;
        float f5 = (0.0f + f4) * 0.5f;
        float f6 = (f4 - 0.0f) / 2.0f;
        yp1Var.b = (((float) Math.cos(Math.toRadians(270.0d))) * f6) + f5;
        yp1Var.c = (f6 * ((float) Math.sin(Math.toRadians(270.0d)))) + f5;
    }
}
