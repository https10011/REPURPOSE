package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class r73 extends dx2 {
    public final int a;
    public final q73 b;

    public r73(int i, q73 q73Var) {
        this.a = i;
        this.b = q73Var;
    }

    public static rc2 b() {
        rc2 rc2Var = new rc2(11);
        rc2Var.b = null;
        rc2Var.c = q73.d;
        return rc2Var;
    }

    @Override // defpackage.dx2
    public final boolean a() {
        return this.b != q73.d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof r73)) {
            return false;
        }
        r73 r73Var = (r73) obj;
        return r73Var.a == this.a && r73Var.b == this.b;
    }

    public final int hashCode() {
        return Objects.hash(r73.class, Integer.valueOf(this.a), this.b);
    }

    public final String toString() {
        return "AesSiv Parameters (variant: " + String.valueOf(this.b) + ", " + this.a + "-byte key)";
    }
}
