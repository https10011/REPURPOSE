package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class zh2 extends nj0 {
    public final Bundle A;

    public zh2(Context context, Looper looper, uy1 uy1Var, rg2 rg2Var, rg2 rg2Var2) {
        super(context, looper, 212, uy1Var, rg2Var, rg2Var2, 0);
        this.A = new Bundle();
    }

    @Override // defpackage.jf
    public final IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof ti2 ? (ti2) iInterfaceQueryLocalInterface : new ti2(iBinder, "com.google.android.gms.auth.api.identity.internal.ISignInService", 2);
    }

    @Override // defpackage.jf
    public final Feature[] f() {
        return aj0.e;
    }

    @Override // defpackage.jf
    public final Bundle h() {
        return this.A;
    }

    @Override // defpackage.jf
    public final int i() {
        return 17895000;
    }

    @Override // defpackage.jf
    public final String m() {
        return "com.google.android.gms.auth.api.identity.internal.ISignInService";
    }

    @Override // defpackage.jf
    public final String n() {
        return "com.google.android.gms.auth.api.identity.service.signin.START";
    }

    @Override // defpackage.jf
    public final boolean o() {
        return true;
    }

    @Override // defpackage.jf
    public final boolean s() {
        return true;
    }
}
