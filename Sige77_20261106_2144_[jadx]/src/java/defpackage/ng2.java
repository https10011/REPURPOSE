package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.Feature;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class ng2 extends nj0 {
    @Override // defpackage.jf
    public final IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientNotificationTelemetryService");
        return iInterfaceQueryLocalInterface instanceof nh2 ? (nh2) iInterfaceQueryLocalInterface : new nh2(iBinder, "com.google.android.gms.common.internal.service.IClientNotificationTelemetryService", 1);
    }

    @Override // defpackage.jf
    public final Feature[] f() {
        return zi0.e;
    }

    @Override // defpackage.jf
    public final int i() {
        return 253600000;
    }

    @Override // defpackage.jf
    public final String m() {
        return "com.google.android.gms.common.internal.service.IClientNotificationTelemetryService";
    }

    @Override // defpackage.jf
    public final String n() {
        return "com.google.android.gms.common.telemetry.notification.service.START";
    }

    @Override // defpackage.jf
    public final boolean o() {
        return true;
    }
}
