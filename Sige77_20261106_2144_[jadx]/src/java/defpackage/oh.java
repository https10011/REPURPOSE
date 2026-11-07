package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.a;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class oh implements fz1 {
    @Override // defpackage.fz1
    public final pi1 a(Context context, pi1 pi1Var, int i, int i2) {
        if (!d42.z(i, i2)) {
            throw new IllegalArgumentException("Cannot apply transformation on width: " + i + " or height: " + i2 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
        }
        mh mhVar = a.a(context).a;
        Bitmap bitmap = (Bitmap) pi1Var.get();
        if (i == Integer.MIN_VALUE) {
            i = bitmap.getWidth();
        }
        if (i2 == Integer.MIN_VALUE) {
            i2 = bitmap.getHeight();
        }
        Bitmap bitmapC = c(mhVar, bitmap, i, i2);
        return bitmap.equals(bitmapC) ? pi1Var : nh.c(mhVar, bitmapC);
    }

    public abstract Bitmap c(mh mhVar, Bitmap bitmap, int i, int i2);
}
