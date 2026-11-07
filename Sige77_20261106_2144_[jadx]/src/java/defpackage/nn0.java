package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.Feature;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class nn0 extends nj0 {
    @Override // defpackage.jf
    public final IInterface b(IBinder iBinder) {
        iBinder.getClass();
        int i = cn0.b;
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
        return iInterfaceQueryLocalInterface instanceof dn0 ? (dn0) iInterfaceQueryLocalInterface : new bn0(iBinder);
    }

    @Override // defpackage.jf
    public final Feature[] f() {
        return gb2.f;
    }

    @Override // defpackage.jf
    public final int i() {
        return 17895000;
    }

    @Override // defpackage.jf
    public final String m() {
        return "com.google.android.gms.identitycredentials.internal.IIdentityCredentialService";
    }

    @Override // defpackage.jf
    public final String n() {
        return "com.google.android.gms.identitycredentials.service.START";
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
