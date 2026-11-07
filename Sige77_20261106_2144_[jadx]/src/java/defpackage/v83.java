package defpackage;

import com.appsflyer.internal.d;
import java.util.Objects;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class v83 extends v93 {
    public final t83 a;
    public final r83 b;
    public final q83 c;
    public final s83 d;

    public v83(t83 t83Var, r83 r83Var, q83 q83Var, s83 s83Var) {
        this.a = t83Var;
        this.b = r83Var;
        this.c = q83Var;
        this.d = s83Var;
    }

    public static ep1 b() {
        ep1 ep1Var = new ep1(15, false);
        ep1Var.b = null;
        ep1Var.c = null;
        ep1Var.d = null;
        ep1Var.e = s83.d;
        return ep1Var;
    }

    @Override // defpackage.dx2
    public final boolean a() {
        return this.d != s83.d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof v83)) {
            return false;
        }
        v83 v83Var = (v83) obj;
        return this.a == v83Var.a && this.b == v83Var.b && this.c == v83Var.c && this.d == v83Var.d;
    }

    public final int hashCode() {
        return Objects.hash(v83.class, this.a, this.b, this.c, this.d);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.d);
        String strValueOf2 = String.valueOf(this.a);
        String strValueOf3 = String.valueOf(this.b);
        String strValueOf4 = String.valueOf(this.c);
        StringBuilder sbB = d.b("HPKE Parameters (Variant: ", strValueOf, ", KemId: ", strValueOf2, ", KdfId: ");
        sbB.append(strValueOf3);
        sbB.append(", AeadId: ");
        sbB.append(strValueOf4);
        sbB.append(")");
        return sbB.toString();
    }
}
