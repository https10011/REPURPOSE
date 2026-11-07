package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class i71 {
    public final Bundle a;
    public IconCompat b;
    public final boolean c;
    public final boolean d;
    public final int e;
    public final CharSequence f;
    public final PendingIntent g;

    public i71(String str, PendingIntent pendingIntent) {
        IconCompat iconCompatB = IconCompat.b(2131230879);
        Bundle bundle = new Bundle();
        this.d = true;
        this.b = iconCompatB;
        if (iconCompatB.d() == 2) {
            this.e = iconCompatB.c();
        }
        this.f = m71.b(str);
        this.g = pendingIntent;
        this.a = bundle;
        this.c = true;
        this.d = true;
    }
}
