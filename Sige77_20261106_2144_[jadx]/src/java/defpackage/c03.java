package defpackage;

import com.appsflyer.internal.d;
import java.util.Objects;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class c03 extends my2 {
    public final String a;
    public final vy2 b;

    public c03(String str, vy2 vy2Var) {
        this.a = str;
        this.b = vy2Var;
    }

    @Override // defpackage.dx2
    public final boolean a() {
        return this.b != vy2.i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c03) {
            c03 c03Var = (c03) obj;
            return c03Var.a.equals(this.a) && c03Var.b == this.b;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(c03.class, this.a, this.b);
    }

    public final String toString() {
        return d.a("LegacyKmsAead Parameters (keyUri: ", this.a, ", variant: ", String.valueOf(this.b), ")");
    }
}
