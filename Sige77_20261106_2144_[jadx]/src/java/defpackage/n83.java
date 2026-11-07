package defpackage;

import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class n83 extends v93 {
    public static final Set g;
    public final j83 a;
    public final i83 b;
    public final l83 c;
    public final k83 d;
    public final dx2 e;
    public final tr3 f;

    static {
        try {
            g = (Set) new r41(21).mo5zza();
        } catch (Exception e) {
            throw new xp(10, e);
        }
    }

    public n83(j83 j83Var, i83 i83Var, l83 l83Var, dx2 dx2Var, k83 k83Var, tr3 tr3Var) {
        this.a = j83Var;
        this.b = i83Var;
        this.c = l83Var;
        this.e = dx2Var;
        this.d = k83Var;
        this.f = tr3Var;
    }

    public static qp0 b() {
        qp0 qp0Var = new qp0();
        qp0Var.a = null;
        qp0Var.b = null;
        qp0Var.c = null;
        qp0Var.d = null;
        qp0Var.e = k83.d;
        qp0Var.f = null;
        return qp0Var;
    }

    @Override // defpackage.dx2
    public final boolean a() {
        return this.d != k83.d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n83)) {
            return false;
        }
        n83 n83Var = (n83) obj;
        return n83Var.a == this.a && n83Var.b == this.b && n83Var.c == this.c && Objects.equals(n83Var.e, this.e) && n83Var.d == this.d && Objects.equals(n83Var.f, this.f);
    }

    public final int hashCode() {
        return Objects.hash(n83.class, this.a, this.b, this.c, this.e, this.d, this.f);
    }

    public final String toString() {
        return String.format("EciesParameters(curveType=%s, hashType=%s, pointFormat=%s, demParameters=%s, variant=%s, salt=%s)", this.a, this.b, this.c, this.e, this.d, this.f);
    }
}
