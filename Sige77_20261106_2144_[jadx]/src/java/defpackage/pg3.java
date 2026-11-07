package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class pg3 extends v93 {
    public final int a;
    public final int b;
    public final dz2 c;

    public pg3(int i, int i2, dz2 dz2Var) {
        this.a = i;
        this.b = i2;
        this.c = dz2Var;
    }

    public static u23 b() {
        u23 u23Var = new u23(9);
        u23Var.b = null;
        u23Var.c = null;
        u23Var.d = dz2.X;
        return u23Var;
    }

    @Override // defpackage.dx2
    public final boolean a() {
        return this.c != dz2.X;
    }

    public final int c() {
        dz2 dz2Var = dz2.X;
        int i = this.b;
        dz2 dz2Var2 = this.c;
        if (dz2Var2 == dz2Var) {
            return i;
        }
        if (dz2Var2 == dz2.v) {
            return i + 5;
        }
        if (dz2Var2 == dz2.w) {
            return i + 5;
        }
        if (dz2Var2 == dz2.W) {
            return i + 5;
        }
        uq1.q("Unknown variant");
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof pg3)) {
            return false;
        }
        pg3 pg3Var = (pg3) obj;
        return pg3Var.a == this.a && pg3Var.c() == c() && pg3Var.c == this.c;
    }

    public final int hashCode() {
        return Objects.hash(pg3.class, Integer.valueOf(this.a), Integer.valueOf(this.b), this.c);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder("AES-CMAC Parameters (variant: ");
        sb.append(strValueOf);
        sb.append(", ");
        sb.append(this.b);
        sb.append("-byte tags, and ");
        return ts.h(this.a, "-byte key)", sb);
    }
}
