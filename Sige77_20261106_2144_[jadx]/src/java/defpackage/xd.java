package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class xd extends y61 {
    public final x61 a;
    public final w61 b;

    public xd(x61 x61Var, w61 w61Var) {
        this.a = x61Var;
        this.b = w61Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof y61) {
            y61 y61Var = (y61) obj;
            x61 x61Var = this.a;
            if (x61Var != null ? x61Var.equals(((xd) y61Var).a) : ((xd) y61Var).a == null) {
                w61 w61Var = this.b;
                if (w61Var != null ? w61Var.equals(((xd) y61Var).b) : ((xd) y61Var).b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        x61 x61Var = this.a;
        int iHashCode = ((x61Var == null ? 0 : x61Var.hashCode()) ^ 1000003) * 1000003;
        w61 w61Var = this.b;
        return iHashCode ^ (w61Var != null ? w61Var.hashCode() : 0);
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.a + ", mobileSubtype=" + this.b + "}";
    }
}
