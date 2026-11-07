package defpackage;

import android.app.Notification;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class l71 extends lo2 {
    public CharSequence b;

    @Override // defpackage.lo2
    public final void j(o71 o71Var) {
        new Notification.BigTextStyle(o71Var.b).setBigContentTitle(null).bigText(this.b);
    }

    @Override // defpackage.lo2
    public final String k() {
        return "androidx.core.app.NotificationCompat$BigTextStyle";
    }
}
