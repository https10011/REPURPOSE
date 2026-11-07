package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class ex2 extends lb2 implements hx2 {
    public ex2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IBundleReceiver", 4);
    }

    @Override // defpackage.hx2
    public final void k(Bundle bundle) {
        Parcel parcelF = F();
        fv2.b(parcelF, bundle);
        G(parcelF, 1);
    }
}
