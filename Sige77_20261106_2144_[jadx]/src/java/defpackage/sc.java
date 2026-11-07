package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class sc implements w71 {
    public static final sc a = new sc();
    public static final oa0 b = oa0.a("eventTimeMs");
    public static final oa0 c = oa0.a("eventCode");
    public static final oa0 d = oa0.a("eventUptimeMs");
    public static final oa0 e = oa0.a("sourceExtension");
    public static final oa0 f = oa0.a("sourceExtensionJsonProto3");
    public static final oa0 g = oa0.a("timezoneOffsetSeconds");
    public static final oa0 h = oa0.a("networkConnectionInfo");

    @Override // defpackage.e60
    public final void a(Object obj, Object obj2) {
        zz0 zz0Var = (zz0) obj;
        x71 x71Var = (x71) obj2;
        x71Var.e(b, ((ud) zz0Var).a);
        ud udVar = (ud) zz0Var;
        x71Var.a(c, udVar.b);
        x71Var.e(d, udVar.c);
        x71Var.a(e, udVar.d);
        x71Var.a(f, udVar.e);
        x71Var.e(g, udVar.f);
        x71Var.a(h, udVar.g);
    }
}
