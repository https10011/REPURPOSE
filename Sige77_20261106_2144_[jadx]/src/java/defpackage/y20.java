package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class y20 {
    public static final y20 b = new y20(2);
    public static final y20 c = new y20(0);
    public static final y20 d;
    public static final y20 e;
    public static final y20 f;
    public static final z91 g;
    public static final boolean h;
    public final /* synthetic */ int a;

    static {
        y20 y20Var = new y20(1);
        d = y20Var;
        e = new y20(3);
        f = y20Var;
        g = z91.a(y20Var, "com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy");
        h = true;
    }

    public /* synthetic */ y20(int i) {
        this.a = i;
    }

    public final int a(int i, int i2, int i3, int i4) {
        switch (this.a) {
            case 0:
                if (b(i, i2, i3, i4) == 1.0f) {
                    return 2;
                }
                return b.a(i, i2, i3, i4);
            case 1:
                return 2;
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                return h ? 2 : 1;
            default:
                return 2;
        }
    }

    public final float b(int i, int i2, int i3, int i4) {
        switch (this.a) {
            case 0:
                return Math.min(1.0f, b.b(i, i2, i3, i4));
            case 1:
                return Math.max(i3 / i, i4 / i2);
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                if (h) {
                    return Math.min(i3 / i, i4 / i2);
                }
                int iMax = Math.max(i2 / i4, i / i3);
                if (iMax == 0) {
                    return 1.0f;
                }
                return 1.0f / Integer.highestOneBit(iMax);
            default:
                return 1.0f;
        }
    }
}
