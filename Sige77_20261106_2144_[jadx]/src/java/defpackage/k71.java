package defpackage;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import androidx.core.graphics.drawable.IconCompat;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class k71 extends lo2 {
    public IconCompat b;
    public IconCompat c;
    public boolean d;

    @Override // defpackage.lo2
    public final void j(o71 o71Var) {
        Bitmap bitmapA;
        Notification.Builder builder = o71Var.b;
        Context context = o71Var.a;
        Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle(builder).setBigContentTitle(null);
        IconCompat iconCompat = this.b;
        if (iconCompat != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                j71.a(bigContentTitle, iconCompat.f(context));
            } else if (iconCompat.d() == 1) {
                IconCompat iconCompat2 = this.b;
                int i = iconCompat2.a;
                if (i == -1) {
                    Object obj = iconCompat2.b;
                    bitmapA = obj instanceof Bitmap ? (Bitmap) obj : null;
                } else if (i == 1) {
                    bitmapA = (Bitmap) iconCompat2.b;
                } else {
                    if (i != 5) {
                        ur.c(iconCompat2, "called getBitmap() on ");
                        return;
                    }
                    bitmapA = IconCompat.a((Bitmap) iconCompat2.b, true);
                }
                bigContentTitle = bigContentTitle.bigPicture(bitmapA);
            }
        }
        if (this.d) {
            IconCompat iconCompat3 = this.c;
            if (iconCompat3 == null) {
                bigContentTitle.bigLargeIcon((Bitmap) null);
            } else {
                bigContentTitle.bigLargeIcon(iconCompat3.f(context));
            }
        }
        if (Build.VERSION.SDK_INT >= 31) {
            j71.c(bigContentTitle, false);
            j71.b(bigContentTitle, null);
        }
    }

    @Override // defpackage.lo2
    public final String k() {
        return "androidx.core.app.NotificationCompat$BigPictureStyle";
    }
}
