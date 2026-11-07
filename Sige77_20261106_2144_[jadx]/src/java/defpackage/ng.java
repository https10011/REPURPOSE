package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final /* synthetic */ class ng implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qg b;

    public /* synthetic */ ng(qg qgVar, int i) {
        this.a = i;
        this.b = qgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        qg qgVar = this.b;
        switch (i) {
            case 0:
                qgVar.a.o0.clearCache(true);
                break;
            case 1:
                qgVar.a.o0.clearHistory();
                break;
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                qgVar.a.o0.clearFormData();
                break;
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                qgVar.a.o0.clearCache(true);
                break;
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                qgVar.a.o0.clearHistory();
                break;
            default:
                qgVar.a.o0.clearFormData();
                break;
        }
    }
}
