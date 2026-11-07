package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class d60 {
    public final k60 a;
    public final byte[] b;

    public d60(k60 k60Var, byte[] bArr) {
        if (k60Var == null) {
            uq1.h("encoding is null");
            throw null;
        }
        if (bArr == null) {
            uq1.h("bytes is null");
            throw null;
        }
        this.a = k60Var;
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d60)) {
            return false;
        }
        d60 d60Var = (d60) obj;
        if (this.a.equals(d60Var.a)) {
            return Arrays.equals(this.b, d60Var.b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.a + ", bytes=[...]}";
    }
}
