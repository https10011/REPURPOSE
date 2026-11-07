package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class dd3 {
    public final dc3 a;
    public final u61 b;

    public dd3(dc3 dc3Var, u61 u61Var) {
        this.a = dc3Var;
        this.b = u61Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dd3) {
            dd3 dd3Var = (dd3) obj;
            dc3 dc3Var = dd3Var.a;
            dc3 dc3Var2 = this.a;
            if (dc3Var2 != null ? dc3Var2 == dc3Var : dc3Var == null) {
                return this.b == dd3Var.b;
            }
        }
        return false;
    }

    public final int hashCode() {
        dc3 dc3Var = this.a;
        return this.b.hashCode() ^ (((dc3Var == null ? 0 : dc3Var.hashCode()) ^ 1000003) * 1000003);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.a);
        String string = this.b.toString();
        StringBuilder sb = new StringBuilder(strValueOf.length() + 52 + string.length() + 1);
        ts.r(sb, "SnapshotBlobAndResult{snapshotBlob=", strValueOf, ", snapshotResult=", string);
        sb.append("}");
        return sb.toString();
    }
}
