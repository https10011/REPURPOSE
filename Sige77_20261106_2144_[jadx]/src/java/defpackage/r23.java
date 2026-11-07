package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class r23 extends jf {
    @Override // defpackage.jf
    public final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        return iInterfaceQueryLocalInterface instanceof n13 ? (n13) iInterfaceQueryLocalInterface : new i13(iBinder);
    }

    @Override // defpackage.jf
    public final int i() {
        return 12451000;
    }

    @Override // defpackage.jf
    public final String m() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    @Override // defpackage.jf
    public final String n() {
        return "com.google.android.gms.measurement.START";
    }
}
