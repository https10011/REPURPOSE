package defpackage;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class a03 extends iy2 {
    public final c03 f;
    public final tr3 g;
    public final Integer h;

    public a03(c03 c03Var, tr3 tr3Var, Integer num) {
        this.f = c03Var;
        this.g = tr3Var;
        this.h = num;
    }

    public static a03 I(c03 c03Var, Integer num) throws GeneralSecurityException {
        tr3 tr3VarA;
        vy2 vy2Var = c03Var.b;
        if (vy2Var == vy2.f) {
            if (num == null) {
                tv2.f("For given Variant TINK the value of idRequirement must be non-null");
                return null;
            }
            tr3VarA = tr3.a(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        } else {
            if (vy2Var != vy2.i) {
                throw new GeneralSecurityException("Unknown Variant: ".concat(String.valueOf(vy2Var)));
            }
            if (num != null) {
                tv2.f("For given Variant NO_PREFIX the value of idRequirement must be null");
                return null;
            }
            tr3VarA = tr3.a(new byte[0]);
        }
        return new a03(c03Var, tr3VarA, num);
    }

    @Override // defpackage.zi0
    public final /* synthetic */ dx2 E() {
        return this.f;
    }

    @Override // defpackage.zi0
    public final Integer F() {
        return this.h;
    }

    @Override // defpackage.iy2
    public final tr3 H() {
        return this.g;
    }
}
