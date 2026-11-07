package defpackage;

import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class kn2 extends Exception {
    public final ConnectionResult a;

    public kn2(ConnectionResult connectionResult) {
        gu2.h("ResolvableConnectionException can only be created with a connection result containing a resolution.", (connectionResult.b == 0 || connectionResult.c == null) ? false : true);
        this.a = connectionResult;
    }
}
