package defpackage;

import android.app.BroadcastOptions;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.SystemClock;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class jd3 extends fu2 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jd3(Object obj, j73 j73Var, int i) {
        super(j73Var);
        this.e = i;
        this.f = obj;
    }

    @Override // defpackage.fu2
    public final void a() {
        int i = this.e;
        Object obj = this.f;
        switch (i) {
            case 0:
                pd3 pd3Var = (pd3) obj;
                td3 td3Var = pd3Var.d;
                td3Var.D();
                y53 y53Var = (y53) td3Var.a;
                y53Var.X.getClass();
                pd3Var.a(false, false, SystemClock.elapsedRealtime());
                xx2 xx2Var = y53Var.a0;
                y53.i(xx2Var);
                y53Var.X.getClass();
                xx2Var.H(SystemClock.elapsedRealtime());
                break;
            case 1:
                de3 de3Var = (de3) obj;
                de3Var.J();
                c33 c33Var = ((y53) de3Var.a).f;
                y53.l(c33Var);
                c33Var.a0.a("Starting upload from DelayedRunnable");
                de3Var.b.q();
                break;
            default:
                if3 if3Var = (if3) obj;
                if3Var.e().D();
                String str = (String) if3Var.d0.pollFirst();
                if (str != null) {
                    if3Var.g().getClass();
                    if3Var.v0 = SystemClock.elapsedRealtime();
                    if3Var.d().a0.b(str, "Sending trigger URI notification to app");
                    Intent intent = new Intent();
                    intent.setAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                    intent.setPackage(str);
                    Context context = if3Var.Y.a;
                    if (Build.VERSION.SDK_INT < 34) {
                        context.sendBroadcast(intent);
                    } else {
                        context.sendBroadcast(intent, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
                    }
                }
                if3Var.H();
                break;
        }
    }
}
