package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class qq0 implements m90 {
    public final Object a;

    public /* synthetic */ qq0(Object obj) {
        this.a = obj;
    }

    public Object a() {
        if (sp0.f == null) {
            sp0.f = new nc0(4);
        }
        synchronized (sp0.e) {
        }
        throw new IllegalStateException("Must call PhenotypeContext.setContext() first");
    }

    @Override // defpackage.yd1
    public Object get() {
        return this.a;
    }
}
