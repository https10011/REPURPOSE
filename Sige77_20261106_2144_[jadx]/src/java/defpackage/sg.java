package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final /* synthetic */ class sg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ tg b;

    public /* synthetic */ sg(tg tgVar, int i) {
        this.a = i;
        this.b = tgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        tg tgVar = this.b;
        switch (i) {
            case 0:
                yg ygVar = tgVar.a;
                ygVar.D0.setVisibility(8);
                ygVar.y0.cancel();
                break;
            default:
                yg ygVar2 = tgVar.a;
                ygVar2.D0.setVisibility(8);
                ygVar2.y0.cancel();
                break;
        }
    }
}
