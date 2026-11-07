package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class dd implements w71 {
    public static final dd a = new dd();
    public static final oa0 b = new oa0("currentCacheSizeBytes", ts.p(ts.o(sd1.class, new fc(1))));
    public static final oa0 c = new oa0("maxCacheSizeBytes", ts.p(ts.o(sd1.class, new fc(2))));

    @Override // defpackage.e60
    public final void a(Object obj, Object obj2) {
        zt1 zt1Var = (zt1) obj;
        x71 x71Var = (x71) obj2;
        x71Var.e(b, zt1Var.a);
        x71Var.e(c, zt1Var.b);
    }
}
