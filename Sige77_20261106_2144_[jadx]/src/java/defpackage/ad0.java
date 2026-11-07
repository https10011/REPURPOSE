package defpackage;

import android.graphics.Bitmap;
import java.security.MessageDigest;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class ad0 extends oh {
    public static final byte[] b = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(hv0.a);

    @Override // defpackage.hv0
    public final void b(MessageDigest messageDigest) {
        messageDigest.update(b);
    }

    @Override // defpackage.oh
    public final Bitmap c(mh mhVar, Bitmap bitmap, int i, int i2) {
        return hz1.b(mhVar, bitmap, i, i2);
    }

    @Override // defpackage.hv0
    public final boolean equals(Object obj) {
        return obj instanceof ad0;
    }

    @Override // defpackage.hv0
    public final int hashCode() {
        return 1572326941;
    }
}
