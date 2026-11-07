package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class oz2 extends my2 {
    public final int a;
    public final int b;
    public final int c;
    public final nz2 d;

    public oz2(int i, int i2, int i3, nz2 nz2Var) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = nz2Var;
    }

    public static ep1 b() {
        ep1 ep1Var = new ep1(13, false);
        ep1Var.b = null;
        ep1Var.c = null;
        ep1Var.d = null;
        ep1Var.e = nz2.e;
        return ep1Var;
    }

    @Override // defpackage.dx2
    public final boolean a() {
        return this.d != nz2.e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof oz2)) {
            return false;
        }
        oz2 oz2Var = (oz2) obj;
        return oz2Var.a == this.a && oz2Var.b == this.b && oz2Var.c == this.c && oz2Var.d == this.d;
    }

    public final int hashCode() {
        return Objects.hash(oz2.class, Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), this.d);
    }

    public final String toString() {
        return "AesGcm Parameters (variant: " + String.valueOf(this.d) + ", " + this.b + "-byte IV, " + this.c + "-byte tag, and " + this.a + "-byte key)";
    }
}
