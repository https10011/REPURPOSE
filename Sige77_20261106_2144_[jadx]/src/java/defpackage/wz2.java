package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class wz2 extends my2 {
    public final qv2 a;

    public wz2(qv2 qv2Var) {
        this.a = qv2Var;
    }

    @Override // defpackage.dx2
    public final boolean a() {
        return this.a != qv2.v;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof wz2) && ((wz2) obj).a == this.a;
    }

    public final int hashCode() {
        return Objects.hash(wz2.class, this.a);
    }

    public final String toString() {
        return ts.k("ChaCha20Poly1305 Parameters (variant: ", String.valueOf(this.a), ")");
    }
}
