package defpackage;

import android.net.Uri;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class gj3 {
    public final Uri a;
    public final cd3 b;
    public final sc1 c;
    public final ro0 d;

    public gj3(Uri uri, cd3 cd3Var, sc1 sc1Var, ro0 ro0Var) {
        this.a = uri;
        this.b = cd3Var;
        this.c = sc1Var;
        this.d = ro0Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gj3)) {
            return false;
        }
        gj3 gj3Var = (gj3) obj;
        return this.a.equals(gj3Var.a) && this.b.equals(gj3Var.b) && this.c.equals(gj3Var.c) && this.d.equals(gj3Var.d);
    }

    public final int hashCode() {
        return ((((((this.d.hashCode() ^ ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003)) * 1000003) ^ j10.e.hashCode()) * 1000003) ^ 1231) * 1000003) ^ 1237;
    }

    public final String toString() {
        String string = this.a.toString();
        int length = string.length();
        String string2 = this.b.toString();
        int length2 = string2.length();
        j10 j10Var = j10.e;
        String strValueOf = String.valueOf(this.c);
        String strValueOf2 = String.valueOf(this.d);
        String string3 = j10Var.toString();
        int length3 = strValueOf.length();
        int length4 = strValueOf2.length();
        StringBuilder sb = new StringBuilder(length + 34 + length2 + 10 + length3 + 13 + length4 + 16 + string3.length() + 32 + String.valueOf(true).length() + 22);
        ts.r(sb, "ProtoDataStoreConfig{uri=", string, ", schema=", string2);
        ts.r(sb, ", handler=", strValueOf, ", migrations=", strValueOf2);
        return y00.l(sb, ", variantConfig=", string3, ", useGeneratedExtensionRegistry=true, enableTracing=false}");
    }
}
