package defpackage;

import com.appsflyer.internal.d;
import java.util.Objects;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class xd3 extends dx2 {
    public final vf3 a;

    public xd3(vf3 vf3Var) {
        this.a = vf3Var;
    }

    @Override // defpackage.dx2
    public final boolean a() {
        return ((xn3) this.a.c).z() != ip3.RAW;
    }

    public final boolean equals(Object obj) {
        xn3 xn3Var = (xn3) this.a.c;
        if (!(obj instanceof xd3)) {
            return false;
        }
        vf3 vf3Var = ((xd3) obj).a;
        ip3 ip3VarZ = xn3Var.z();
        xn3 xn3Var2 = (xn3) vf3Var.c;
        return ip3VarZ.equals(xn3Var2.z()) && xn3Var.B().equals(xn3Var2.B()) && xn3Var.A().equals(xn3Var2.A());
    }

    public final int hashCode() {
        vf3 vf3Var = this.a;
        return Objects.hash((xn3) vf3Var.c, (tr3) vf3Var.b);
    }

    public final String toString() {
        String str;
        xn3 xn3Var = (xn3) this.a.c;
        String strB = xn3Var.B();
        int i = be3.a[xn3Var.z().ordinal()];
        if (i == 1) {
            str = "TINK";
        } else if (i == 2) {
            str = "LEGACY";
        } else if (i != 3) {
            str = i != 4 ? "UNKNOWN" : "CRUNCHY";
        } else {
            str = "RAW";
        }
        return d.a("(typeUrl=", strB, ", outputPrefixType=", str, ")");
    }
}
