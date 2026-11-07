package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class sz2 extends my2 {
    public final int a;
    public final rz2 b;

    public sz2(int i, rz2 rz2Var) {
        this.a = i;
        this.b = rz2Var;
    }

    public static nl1 b() {
        nl1 nl1Var = new nl1();
        nl1Var.b = null;
        nl1Var.a = rz2.e;
        return nl1Var;
    }

    @Override // defpackage.dx2
    public final boolean a() {
        return this.b != rz2.e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof sz2)) {
            return false;
        }
        sz2 sz2Var = (sz2) obj;
        return sz2Var.a == this.a && sz2Var.b == this.b;
    }

    public final int hashCode() {
        return Objects.hash(sz2.class, Integer.valueOf(this.a), this.b);
    }

    public final String toString() {
        return "AesGcmSiv Parameters (variant: " + String.valueOf(this.b) + ", " + this.a + "-byte key)";
    }
}
