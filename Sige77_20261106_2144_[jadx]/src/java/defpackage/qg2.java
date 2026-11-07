package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class qg2 implements re {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qg2(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.re
    public final void a(boolean z) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                uj0 uj0Var = (uj0) obj;
                uj0Var.n.sendMessage(uj0Var.n.obtainMessage(1, Boolean.valueOf(z)));
                break;
            default:
                ox1 ox1Var = (ox1) obj;
                if (!z) {
                    ox1Var.getClass();
                    ox1Var.getClass();
                } else {
                    ox1Var.getClass();
                    wt2 wt2Var = (wt2) ox1Var.a;
                    wt2Var.c.removeCallbacks(wt2Var.d);
                }
                break;
        }
    }
}
