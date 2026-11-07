package defpackage;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class u53 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hx2 b;
    public final /* synthetic */ AppMeasurementDynamiteService c;

    public /* synthetic */ u53(AppMeasurementDynamiteService appMeasurementDynamiteService, hx2 hx2Var, int i) {
        this.a = i;
        this.b = hx2Var;
        this.c = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = false;
        switch (this.a) {
            case 0:
                lc3 lc3VarO = this.c.a.o();
                hx2 hx2Var = this.b;
                lc3VarO.D();
                lc3VarO.F();
                lc3VarO.S(new gc(lc3VarO, lc3VarO.U(false), hx2Var, 13));
                break;
            default:
                AppMeasurementDynamiteService appMeasurementDynamiteService = this.c;
                qf3 qf3Var = appMeasurementDynamiteService.a.w;
                y53.j(qf3Var);
                y53 y53Var = appMeasurementDynamiteService.a;
                if (y53Var.l0 != null && y53Var.l0.booleanValue()) {
                    z = true;
                }
                qf3Var.v0(this.b, z);
                break;
        }
    }
}
