package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class hr1 extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ hc a;

    public hr1(hc hcVar) {
        this.a = hcVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        d42.t().post(new gr1(this, true));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        d42.t().post(new gr1(this, false));
    }
}
