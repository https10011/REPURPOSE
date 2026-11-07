package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class tc implements w71 {
    public static final tc a = new tc();
    public static final oa0 b = oa0.a("requestTimeMs");
    public static final oa0 c = oa0.a("requestUptimeMs");
    public static final oa0 d = oa0.a("clientInfo");
    public static final oa0 e = oa0.a("logSource");
    public static final oa0 f = oa0.a("logSourceName");
    public static final oa0 g = oa0.a("logEvent");
    public static final oa0 h = oa0.a("qosTier");

    @Override // defpackage.e60
    public final void a(Object obj, Object obj2) {
        c01 c01Var = (c01) obj;
        x71 x71Var = (x71) obj2;
        x71Var.e(b, ((vd) c01Var).a);
        vd vdVar = (vd) c01Var;
        x71Var.e(c, vdVar.b);
        x71Var.a(d, vdVar.c);
        x71Var.a(e, vdVar.d);
        x71Var.a(f, vdVar.e);
        x71Var.a(g, vdVar.f);
        x71Var.a(h, he1.a);
    }
}
