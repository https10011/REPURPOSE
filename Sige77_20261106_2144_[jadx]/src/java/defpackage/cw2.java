package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class cw2 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ f03 c;

    public cw2(xx2 xx2Var, long j) {
        this.b = j;
        Objects.requireNonNull(xx2Var);
        this.c = xx2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        long j = this.b;
        f03 f03Var = this.c;
        switch (i) {
            case 0:
                ((xx2) f03Var).K(j);
                break;
            default:
                ua3 ua3Var = (ua3) f03Var;
                xx2 xx2Var = ((y53) ua3Var.a).a0;
                y53.i(xx2Var);
                xx2Var.H(j);
                ua3Var.e = null;
                break;
        }
    }

    public cw2(ua3 ua3Var, long j) {
        this.b = j;
        Objects.requireNonNull(ua3Var);
        this.c = ua3Var;
    }
}
