package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class fd3 extends zd3 {
    public volatile boolean e;
    public final boolean f;

    public fd3(String str, bk0 bk0Var, boolean z) {
        super(str, bk0Var);
        this.f = z;
    }

    @Override // defpackage.zd3
    public final /* synthetic */ Object a() {
        return Boolean.valueOf(this.f);
    }

    @Override // defpackage.zd3
    public final /* synthetic */ Object b(String str) {
        return Boolean.valueOf(Boolean.parseBoolean(str));
    }

    @Override // defpackage.zd3
    public final /* synthetic */ Object c(Object obj) {
        return (Boolean) obj;
    }

    @Override // defpackage.zd3
    public final /* synthetic */ Object d() {
        return Boolean.valueOf(this.e);
    }

    @Override // defpackage.zd3
    public final /* synthetic */ void e(Object obj) {
        this.e = ((Boolean) obj).booleanValue();
    }
}
