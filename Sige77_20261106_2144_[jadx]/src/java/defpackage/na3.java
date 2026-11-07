package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class na3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ua3 b;

    public na3(ua3 ua3Var, int i) {
        this.a = i;
        switch (i) {
            case 1:
                Objects.requireNonNull(ua3Var);
                this.b = ua3Var;
                break;
            default:
                Objects.requireNonNull(ua3Var);
                this.b = ua3Var;
                break;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        ua3 ua3Var = this.b;
        switch (i) {
            case 0:
                ua3Var.e = ua3Var.W;
                break;
            default:
                ua3Var.W = null;
                break;
        }
    }
}
