package defpackage;

import android.app.Service;
import android.content.Intent;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final /* synthetic */ class xc3 implements Runnable {
    public final /* synthetic */ ox1 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ c33 c;
    public final /* synthetic */ Intent d;

    public /* synthetic */ xc3(ox1 ox1Var, int i, c33 c33Var, Intent intent) {
        this.a = ox1Var;
        this.b = i;
        this.c = c33Var;
        this.d = intent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Service service = (Service) this.a.a;
        sc3 sc3Var = (sc3) service;
        int i = this.b;
        if (sc3Var.zza(i)) {
            this.c.a0.b(Integer.valueOf(i), "Local AppMeasurementService processed last upload request. StartId");
            c33 c33Var = y53.r(service, null, null, null).f;
            y53.l(c33Var);
            c33Var.a0.a("Completed wakeful intent.");
            sc3Var.a(this.d);
        }
    }
}
