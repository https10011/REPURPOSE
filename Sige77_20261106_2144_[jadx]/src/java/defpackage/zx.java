package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class zx implements f51 {
    public final /* synthetic */ int a;
    public final Object b;

    public zx(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new pv2(15);
                break;
            default:
                this.b = new vl0(4);
                break;
        }
    }

    @Override // defpackage.f51
    public final e51 a(ep1 ep1Var) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return new cj((vl0) obj, 1);
            default:
                return new mm0((pv2) obj);
        }
    }
}
