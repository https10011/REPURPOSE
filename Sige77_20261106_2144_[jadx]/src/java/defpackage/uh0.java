package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class uh0 {
    public static final uh0 g = new uh0(4201, 4096, 1);
    public static final uh0 h = new uh0(1033, 1024, 1);
    public static final uh0 i = new uh0(67, 64, 1);
    public static final uh0 j = new uh0(19, 16, 1);
    public static final uh0 k = new uh0(285, 256, 0);
    public static final uh0 l = new uh0(301, 256, 1);
    public final int[] a;
    public final int[] b;
    public final vh0 c;
    public final int d;
    public final int e;
    public final int f;

    public uh0(int i2, int i3, int i4) {
        this.e = i2;
        this.d = i3;
        this.f = i4;
        this.a = new int[i3];
        this.b = new int[i3];
        int i5 = 1;
        for (int i6 = 0; i6 < i3; i6++) {
            this.a[i6] = i5;
            i5 <<= 1;
            if (i5 >= i3) {
                i5 = (i5 ^ i2) & (i3 - 1);
            }
        }
        for (int i7 = 0; i7 < i3 - 1; i7++) {
            this.b[this.a[i7]] = i7;
        }
        this.c = new vh0(this, new int[]{0});
    }

    public final int a(int i2, int i3) {
        if (i2 == 0 || i3 == 0) {
            return 0;
        }
        int[] iArr = this.b;
        return this.a[(iArr[i2] + iArr[i3]) % (this.d - 1)];
    }

    public final String toString() {
        return "GF(0x" + Integer.toHexString(this.e) + ',' + this.d + ')';
    }
}
