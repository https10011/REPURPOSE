package defpackage;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class r03 extends iy2 {
    public final p03 f;
    public final tr3 g;
    public final Integer h;

    public r03(p03 p03Var, tr3 tr3Var, Integer num) {
        this.f = p03Var;
        this.g = tr3Var;
        this.h = num;
    }

    public static r03 I(p03 p03Var, Integer num) throws GeneralSecurityException {
        tr3 tr3VarB;
        dz2 dz2Var = p03Var.a;
        if (dz2Var == dz2.i) {
            if (num != null) {
                tv2.f("For given Variant NO_PREFIX the value of idRequirement must be null");
                return null;
            }
            tr3VarB = we3.a;
        } else {
            if (dz2Var != dz2.f) {
                throw new GeneralSecurityException("Unknown Variant: ".concat(String.valueOf(dz2Var)));
            }
            if (num == null) {
                tv2.f("For given Variant TINK the value of idRequirement must be non-null");
                return null;
            }
            tr3VarB = we3.b(num.intValue());
        }
        return new r03(p03Var, tr3VarB, num);
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
