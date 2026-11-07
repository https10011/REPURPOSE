package defpackage;

import java.security.GeneralSecurityException;
import java.util.Objects;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class s13 extends my2 {
    public final nz2 a;
    public final int b;

    public s13(nz2 nz2Var, int i) {
        this.a = nz2Var;
        this.b = i;
    }

    public static s13 b(nz2 nz2Var, int i) throws GeneralSecurityException {
        if (i >= 8 && i <= 12) {
            return new s13(nz2Var, i);
        }
        tv2.f("Salt size must be between 8 and 12 bytes");
        return null;
    }

    @Override // defpackage.dx2
    public final boolean a() {
        return this.a != nz2.i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof s13)) {
            return false;
        }
        s13 s13Var = (s13) obj;
        return s13Var.a == this.a && s13Var.b == this.b;
    }

    public final int hashCode() {
        return Objects.hash(s13.class, this.a, Integer.valueOf(this.b));
    }

    public final String toString() {
        return "X-AES-GCM Parameters (variant: " + String.valueOf(this.a) + "salt_size_bytes: " + this.b + ")";
    }
}
