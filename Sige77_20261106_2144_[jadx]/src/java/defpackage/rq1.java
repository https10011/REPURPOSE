package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class rq1 extends nj0 {
    public final boolean A;
    public final uy1 B;
    public final Bundle C;
    public final Integer D;

    public rq1(Context context, Looper looper, uy1 uy1Var, Bundle bundle, sj0 sj0Var, tj0 tj0Var) {
        super(context, looper, 44, uy1Var, sj0Var, tj0Var, 0);
        this.A = true;
        this.B = uy1Var;
        this.C = bundle;
        this.D = (Integer) uy1Var.i;
    }

    @Override // defpackage.jf
    public final IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof hh2 ? (hh2) iInterfaceQueryLocalInterface : new hh2(iBinder, "com.google.android.gms.signin.internal.ISignInService", 1);
    }

    @Override // defpackage.jf
    public final Bundle h() {
        uy1 uy1Var = this.B;
        boolean zEquals = this.c.getPackageName().equals((String) uy1Var.d);
        Bundle bundle = this.C;
        if (!zEquals) {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", (String) uy1Var.d);
        }
        return bundle;
    }

    @Override // defpackage.jf
    public final int i() {
        return 12451000;
    }

    @Override // defpackage.jf
    public final String m() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // defpackage.jf
    public final String n() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // defpackage.jf
    public final boolean r() {
        return this.A;
    }
}
