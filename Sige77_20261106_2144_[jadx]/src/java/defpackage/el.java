package defpackage;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.util.Log;
import java.security.MessageDigest;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class el extends oh {
    public static final byte[] b = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(hv0.a);

    @Override // defpackage.hv0
    public final void b(MessageDigest messageDigest) {
        messageDigest.update(b);
    }

    @Override // defpackage.oh
    public final Bitmap c(mh mhVar, Bitmap bitmap, int i, int i2) {
        Paint paint = hz1.a;
        if (bitmap.getWidth() > i || bitmap.getHeight() > i2) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "requested target size too big for input, fit centering instead");
            }
            return hz1.b(mhVar, bitmap, i, i2);
        }
        if (Log.isLoggable("TransformationUtils", 2)) {
            Log.v("TransformationUtils", "requested target size larger or equal to input, returning input");
        }
        return bitmap;
    }

    @Override // defpackage.hv0
    public final boolean equals(Object obj) {
        return obj instanceof el;
    }

    @Override // defpackage.hv0
    public final int hashCode() {
        return -670243078;
    }
}
