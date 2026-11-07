package defpackage;

import com.appsflyer.internal.d;
import java.util.Objects;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class yy2 extends my2 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final vy2 e;
    public final wy2 f;

    public yy2(int i, int i2, int i3, int i4, vy2 vy2Var, wy2 wy2Var) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = vy2Var;
        this.f = wy2Var;
    }

    public static qp0 b() {
        qp0 qp0Var = new qp0();
        qp0Var.a = null;
        qp0Var.b = null;
        qp0Var.c = null;
        qp0Var.d = null;
        qp0Var.e = null;
        qp0Var.f = vy2.e;
        return qp0Var;
    }

    @Override // defpackage.dx2
    public final boolean a() {
        return this.e != vy2.e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof yy2)) {
            return false;
        }
        yy2 yy2Var = (yy2) obj;
        return yy2Var.a == this.a && yy2Var.b == this.b && yy2Var.c == this.c && yy2Var.d == this.d && yy2Var.e == this.e && yy2Var.f == this.f;
    }

    public final int hashCode() {
        return Objects.hash(yy2.class, Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d), this.e, this.f);
    }

    public final String toString() {
        StringBuilder sbB = d.b("AesCtrHmacAead Parameters (variant: ", String.valueOf(this.e), ", hashType: ", String.valueOf(this.f), ", ");
        sbB.append(this.c);
        sbB.append("-byte IV, and ");
        sbB.append(this.d);
        sbB.append("-byte tags, and ");
        sbB.append(this.a);
        sbB.append("-byte AES key, and ");
        sbB.append(this.b);
        sbB.append("-byte HMAC key)");
        return sbB.toString();
    }
}
