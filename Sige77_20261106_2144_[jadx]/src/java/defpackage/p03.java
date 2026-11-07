package defpackage;

import com.appsflyer.internal.d;
import java.util.Objects;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class p03 extends my2 {
    public final dz2 a;
    public final String b;
    public final wy2 c;
    public final my2 d;

    public p03(dz2 dz2Var, String str, wy2 wy2Var, my2 my2Var) {
        this.a = dz2Var;
        this.b = str;
        this.c = wy2Var;
        this.d = my2Var;
    }

    @Override // defpackage.dx2
    public final boolean a() {
        return this.a != dz2.i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p03) {
            p03 p03Var = (p03) obj;
            return p03Var.c == this.c && p03Var.d.equals(this.d) && p03Var.b.equals(this.b) && p03Var.a == this.a;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(p03.class, this.b, this.c, this.d, this.a);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.c);
        String strValueOf2 = String.valueOf(this.d);
        String strValueOf3 = String.valueOf(this.a);
        StringBuilder sbB = d.b("LegacyKmsEnvelopeAead Parameters (kekUri: ", this.b, ", dekParsingStrategy: ", strValueOf, ", dekParametersForNewKeys: ");
        sbB.append(strValueOf2);
        sbB.append(", variant: ");
        sbB.append(strValueOf3);
        sbB.append(")");
        return sbB.toString();
    }
}
