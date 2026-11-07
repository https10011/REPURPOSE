package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class ji2 extends nj0 {
    public final ki2 A;

    public ji2(Context context, Looper looper, uy1 uy1Var, ki2 ki2Var, rg2 rg2Var, rg2 rg2Var2) {
        super(context, looper, 68, uy1Var, rg2Var, rg2Var2, 0);
        ki2Var = ki2Var == null ? ki2.c : ki2Var;
        nl1 nl1Var = new nl1();
        nl1Var.b = Boolean.FALSE;
        nl1Var.b = Boolean.valueOf(ki2Var.a);
        nl1Var.a = ki2Var.b;
        nl1Var.a = ai2.a();
        this.A = new ki2(nl1Var);
    }

    @Override // defpackage.jf
    public final IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        return iInterfaceQueryLocalInterface instanceof mi2 ? (mi2) iInterfaceQueryLocalInterface : new mi2(iBinder, "com.google.android.gms.auth.api.credentials.internal.ICredentialsService", 2);
    }

    @Override // defpackage.jf
    public final Bundle h() {
        ki2 ki2Var = this.A;
        ki2Var.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("consumer_package", null);
        bundle.putBoolean("force_save_dialog", ki2Var.a);
        bundle.putString("log_session_id", ki2Var.b);
        return bundle;
    }

    @Override // defpackage.jf
    public final int i() {
        return 12800000;
    }

    @Override // defpackage.jf
    public final String m() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    @Override // defpackage.jf
    public final String n() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }
}
