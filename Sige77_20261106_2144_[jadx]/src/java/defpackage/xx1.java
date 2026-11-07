package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class xx1 extends em1 implements Runnable {
    public final long i;

    public xx1(long j, gs gsVar) {
        super(gsVar, gsVar.getContext());
        this.i = j;
    }

    @Override // defpackage.lt0
    public final String F() {
        return super.F() + "(timeMillis=" + this.i + ')';
    }

    @Override // java.lang.Runnable
    public final void run() {
        x91.u(this.e);
        j(new wx1("Timed out waiting for " + this.i + " ms", this));
    }
}
