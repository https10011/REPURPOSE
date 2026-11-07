package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class rl3 {
    public final cd3 a;
    public final vl2 b;

    public rl3(cd3 cd3Var, vl2 vl2Var) {
        this.a = cd3Var;
        if (vl2Var != null) {
            this.b = vl2Var;
        } else {
            uq1.h("Null extensionRegistryLite");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof rl3)) {
            return false;
        }
        rl3 rl3Var = (rl3) obj;
        return this.a.equals(rl3Var.a) && this.b.equals(rl3Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        String string = this.a.toString();
        int length = string.length();
        String string2 = this.b.toString();
        StringBuilder sb = new StringBuilder(length + 53 + string2.length() + 1);
        ts.r(sb, "ProtoSerializer{defaultValue=", string, ", extensionRegistryLite=", string2);
        sb.append("}");
        return sb.toString();
    }
}
