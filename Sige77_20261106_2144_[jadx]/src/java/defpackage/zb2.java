package defpackage;

import java.util.HashMap;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class zb2 {
    public static final char[] c = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'j', 'k', 'm', 'n', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    public static final HashMap d = new HashMap();
    public long a;
    public byte b;

    static {
        for (int i = 0; i < 32; i++) {
            d.put(Character.valueOf(c[i]), Integer.valueOf(i));
        }
    }

    public static zb2 a(double d2, double d3, int i) {
        if (i > 12) {
            e.g("A geohash can only be 12 character long.");
            return null;
        }
        int i2 = i * 5;
        if (i2 > 60) {
            i2 = 60;
        }
        zb2 zb2Var = new zb2();
        zb2Var.a = 0L;
        zb2Var.b = (byte) 0;
        int iMin = Math.min(i2, 64);
        double[] dArr = {-90.0d, 90.0d};
        double[] dArr2 = {-180.0d, 180.0d};
        boolean z = true;
        while (zb2Var.b < iMin) {
            if (z) {
                zb2Var.b(d3, dArr2);
            } else {
                zb2Var.b(d2, dArr);
            }
            z = !z;
        }
        zb2Var.a <<= 64 - iMin;
        return zb2Var;
    }

    public final void b(double d2, double[] dArr) {
        double d3 = (dArr[0] + dArr[1]) / 2.0d;
        byte b = this.b;
        if (d2 >= d3) {
            this.b = (byte) (b + 1);
            this.a = (this.a << 1) | 1;
            dArr[0] = d3;
        } else {
            this.b = (byte) (b + 1);
            this.a <<= 1;
            dArr[1] = d3;
        }
    }
}
