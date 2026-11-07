package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class vh2 extends nj0 {
    public final sw1 A;

    public vh2(Context context, Looper looper, uy1 uy1Var, sw1 sw1Var, rg2 rg2Var, rg2 rg2Var2) {
        super(context, looper, 270, uy1Var, rg2Var, rg2Var2, 0);
        this.A = sw1Var;
    }

    @Override // defpackage.jf
    public final IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return iInterfaceQueryLocalInterface instanceof qh2 ? (qh2) iInterfaceQueryLocalInterface : new qh2(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService", 1);
    }

    @Override // defpackage.jf
    public final Feature[] f() {
        return zi0.e;
    }

    @Override // defpackage.jf
    public final Bundle h() {
        sw1 sw1Var = this.A;
        sw1Var.getClass();
        Bundle bundle = new Bundle();
        String str = sw1Var.a;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    @Override // defpackage.jf
    public final int i() {
        return 203400000;
    }

    @Override // defpackage.jf
    public final String m() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // defpackage.jf
    public final String n() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // defpackage.jf
    public final boolean o() {
        return true;
    }
}
