package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class f23 extends my2 {
    public final rz2 a;

    public f23(rz2 rz2Var) {
        this.a = rz2Var;
    }

    @Override // defpackage.dx2
    public final boolean a() {
        return this.a != rz2.h;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof f23) && ((f23) obj).a == this.a;
    }

    public final int hashCode() {
        return Objects.hash(f23.class, this.a);
    }

    public final String toString() {
        return ts.k("XChaCha20Poly1305 Parameters (variant: ", String.valueOf(this.a), ")");
    }
}
