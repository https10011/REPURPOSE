package defpackage;

import android.graphics.Insets;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class nq0 {
    public static final nq0 e = new nq0(0, 0, 0, 0);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public nq0(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public static nq0 a(nq0 nq0Var, nq0 nq0Var2) {
        return b(Math.max(nq0Var.a, nq0Var2.a), Math.max(nq0Var.b, nq0Var2.b), Math.max(nq0Var.c, nq0Var2.c), Math.max(nq0Var.d, nq0Var2.d));
    }

    public static nq0 b(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? e : new nq0(i, i2, i3, i4);
    }

    public static nq0 c(Insets insets) {
        return b(insets.left, insets.top, insets.right, insets.bottom);
    }

    public final Insets d() {
        return za.b(this.a, this.b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || nq0.class != obj.getClass()) {
            return false;
        }
        nq0 nq0Var = (nq0) obj;
        return this.d == nq0Var.d && this.a == nq0Var.a && this.c == nq0Var.c && this.b == nq0Var.b;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        return "Insets{left=" + this.a + ", top=" + this.b + ", right=" + this.c + ", bottom=" + this.d + '}';
    }
}
