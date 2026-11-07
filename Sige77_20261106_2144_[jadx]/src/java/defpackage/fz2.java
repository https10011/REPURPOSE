package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class fz2 extends my2 {
    public final int a;
    public final int b;
    public final int c;
    public final dz2 d;

    public fz2(int i, int i2, int i3, dz2 dz2Var) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = dz2Var;
    }

    public static ud2 b() {
        ud2 ud2Var = new ud2();
        ud2Var.a = null;
        ud2Var.b = null;
        ud2Var.c = null;
        ud2Var.d = dz2.e;
        return ud2Var;
    }

    @Override // defpackage.dx2
    public final boolean a() {
        return this.d != dz2.e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fz2)) {
            return false;
        }
        fz2 fz2Var = (fz2) obj;
        return fz2Var.a == this.a && fz2Var.b == this.b && fz2Var.c == this.c && fz2Var.d == this.d;
    }

    public final int hashCode() {
        return Objects.hash(fz2.class, Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), this.d);
    }

    public final String toString() {
        return "AesEax Parameters (variant: " + String.valueOf(this.d) + ", " + this.b + "-byte IV, " + this.c + "-byte tag, and " + this.a + "-byte key)";
    }
}
