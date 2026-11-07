package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class l93 {
    public final Context a;
    public final cv1 b;

    public l93(Context context, cv1 cv1Var) {
        this.a = context;
        this.b = cv1Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l93)) {
            return false;
        }
        l93 l93Var = (l93) obj;
        if (!this.a.equals(l93Var.a)) {
            return false;
        }
        cv1 cv1Var = l93Var.b;
        cv1 cv1Var2 = this.b;
        if (cv1Var2 == null) {
            return cv1Var == null;
        }
        return cv1Var2.equals(cv1Var);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        cv1 cv1Var = this.b;
        return (cv1Var == null ? 0 : cv1Var.hashCode()) ^ (iHashCode * 1000003);
    }

    public final String toString() {
        String string = this.a.toString();
        int length = string.length();
        String strValueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(length + 45 + strValueOf.length() + 1);
        ts.r(sb, "FlagsContext{context=", string, ", hermeticFileOverrides=", strValueOf);
        sb.append("}");
        return sb.toString();
    }
}
