package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public class ov1 {
    public static final ov1[] i = {new ov1(false, 3, 5, 8, 8, 1, 3, 5), new ov1(false, 5, 7, 10, 10, 1, 5, 7), new ov1(true, 5, 7, 16, 6, 1, 5, 7), new ov1(false, 8, 10, 12, 12, 1, 8, 10), new ov1(true, 10, 11, 14, 6, 2, 10, 11), new ov1(false, 12, 12, 14, 14, 1, 12, 12), new ov1(true, 16, 14, 24, 10, 1, 16, 14), new ov1(false, 18, 14, 16, 16, 1, 18, 14), new ov1(false, 22, 18, 18, 18, 1, 22, 18), new ov1(true, 22, 18, 16, 10, 2, 22, 18), new ov1(false, 30, 20, 20, 20, 1, 30, 20), new ov1(true, 32, 24, 16, 14, 2, 32, 24), new ov1(false, 36, 24, 22, 22, 1, 36, 24), new ov1(false, 44, 28, 24, 24, 1, 44, 28), new ov1(true, 49, 28, 22, 14, 2, 49, 28), new ov1(false, 62, 36, 14, 14, 4, 62, 36), new ov1(false, 86, 42, 16, 16, 4, 86, 42), new ov1(false, 114, 48, 18, 18, 4, 114, 48), new ov1(false, 144, 56, 20, 20, 4, 144, 56), new ov1(false, 174, 68, 22, 22, 4, 174, 68), new ov1(false, 204, 84, 24, 24, 4, 102, 42), new ov1(false, 280, 112, 14, 14, 16, 140, 56), new ov1(false, 368, 144, 16, 16, 16, 92, 36), new ov1(false, 456, 192, 18, 18, 16, 114, 48), new ov1(false, 576, 224, 20, 20, 16, 144, 56), new ov1(false, 696, 272, 22, 22, 16, 174, 68), new ov1(false, 816, 336, 24, 24, 16, 136, 56), new ov1(false, 1050, 408, 18, 18, 36, 175, 68), new ov1(false, 1304, 496, 20, 20, 36, 163, 62), new ow(false, 1558, 620, 22, 22, 36, -1, 62)};
    public final boolean a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;

    public ov1(boolean z, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.a = z;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
        this.g = i7;
        this.h = i8;
    }

    public static ov1 e(int i2, pv1 pv1Var) {
        for (int i3 = 0; i3 < 30; i3++) {
            ov1 ov1Var = i[i3];
            if (!(pv1Var == pv1.b && ov1Var.a) && ((pv1Var != pv1.c || ov1Var.a) && i2 <= ov1Var.b)) {
                return ov1Var;
            }
        }
        e.g("Can't find a symbol arrangement that matches the message. Data codewords: ".concat(String.valueOf(i2)));
        return null;
    }

    public int a(int i2) {
        return this.g;
    }

    public final int b() {
        int i2 = this.f;
        int i3 = 1;
        if (i2 != 1) {
            i3 = 2;
            if (i2 != 2 && i2 != 4) {
                if (i2 == 16) {
                    return 4;
                }
                if (i2 == 36) {
                    return 6;
                }
                uq1.q("Cannot handle this number of data regions");
                return 0;
            }
        }
        return i3;
    }

    public int c() {
        return this.b / this.g;
    }

    public final int d() {
        int i2 = this.f;
        if (i2 == 1 || i2 == 2) {
            return 1;
        }
        if (i2 == 4) {
            return 2;
        }
        if (i2 == 16) {
            return 4;
        }
        if (i2 == 36) {
            return 6;
        }
        uq1.q("Cannot handle this number of data regions");
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a ? "Rectangular Symbol:" : "Square Symbol:");
        sb.append(" data region ");
        int i2 = this.d;
        sb.append(i2);
        sb.append('x');
        int i3 = this.e;
        sb.append(i3);
        sb.append(", symbol size ");
        sb.append((b() * i2) + (b() << 1));
        sb.append('x');
        sb.append((d() * i3) + (d() << 1));
        sb.append(", symbol data size ");
        sb.append(b() * i2);
        sb.append('x');
        sb.append(d() * i3);
        sb.append(", codewords ");
        sb.append(this.b);
        sb.append('+');
        sb.append(this.c);
        return sb.toString();
    }
}
