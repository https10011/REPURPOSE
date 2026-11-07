package defpackage;

import com.bumptech.glide.load.ImageHeaderParser;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract /* synthetic */ class qn0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ImageHeaderParser.ImageType.values().length];
        a = iArr;
        try {
            iArr[ImageHeaderParser.ImageType.WEBP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[ImageHeaderParser.ImageType.WEBP_A.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[ImageHeaderParser.ImageType.ANIMATED_WEBP.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
