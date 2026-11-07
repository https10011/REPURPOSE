package defpackage;

import com.appsflyer.internal.d;
import java.util.Objects;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class ah3 extends v93 {
    public final int a;
    public final int b;
    public final yg3 c;
    public final zg3 d;

    public ah3(int i, int i2, yg3 yg3Var, zg3 zg3Var) {
        this.a = i;
        this.b = i2;
        this.c = yg3Var;
        this.d = zg3Var;
    }

    public static ep1 b() {
        ep1 ep1Var = new ep1(16, false);
        ep1Var.b = null;
        ep1Var.c = null;
        ep1Var.d = null;
        ep1Var.e = yg3.e;
        return ep1Var;
    }

    @Override // defpackage.dx2
    public final boolean a() {
        return this.c != yg3.e;
    }

    public final int c() {
        yg3 yg3Var = yg3.e;
        int i = this.b;
        yg3 yg3Var2 = this.c;
        if (yg3Var2 == yg3Var) {
            return i;
        }
        if (yg3Var2 == yg3.b) {
            return i + 5;
        }
        if (yg3Var2 == yg3.c) {
            return i + 5;
        }
        if (yg3Var2 == yg3.d) {
            return i + 5;
        }
        uq1.q("Unknown variant");
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ah3)) {
            return false;
        }
        ah3 ah3Var = (ah3) obj;
        return ah3Var.a == this.a && ah3Var.c() == c() && ah3Var.c == this.c && ah3Var.d == this.d;
    }

    public final int hashCode() {
        return Objects.hash(ah3.class, Integer.valueOf(this.a), Integer.valueOf(this.b), this.c, this.d);
    }

    public final String toString() {
        StringBuilder sbB = d.b("HMAC Parameters (variant: ", String.valueOf(this.c), ", hashType: ", String.valueOf(this.d), ", ");
        sbB.append(this.b);
        sbB.append("-byte tags, and ");
        sbB.append(this.a);
        sbB.append("-byte key)");
        return sbB.toString();
    }
}
