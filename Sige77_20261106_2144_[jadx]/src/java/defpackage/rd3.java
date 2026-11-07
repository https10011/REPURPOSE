package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class rd3 extends zd3 {
    public volatile long e;
    public final long f;

    public rd3(String str, bk0 bk0Var, long j) {
        super(str, bk0Var);
        this.f = j;
    }

    @Override // defpackage.zd3
    public final /* synthetic */ Object a() {
        return Long.valueOf(this.f);
    }

    @Override // defpackage.zd3
    public final /* synthetic */ Object b(String str) {
        return Long.valueOf(Long.parseLong(str));
    }

    @Override // defpackage.zd3
    public final /* synthetic */ Object c(Object obj) {
        return (Long) obj;
    }

    @Override // defpackage.zd3
    public final /* synthetic */ Object d() {
        return Long.valueOf(this.e);
    }

    @Override // defpackage.zd3
    public final /* synthetic */ void e(Object obj) {
        this.e = ((Long) obj).longValue();
    }
}
