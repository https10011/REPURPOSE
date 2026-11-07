package defpackage;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class z13 extends iy2 {
    public final f23 f;
    public final ox1 g;
    public final tr3 h;
    public final Integer i;

    public z13(f23 f23Var, ox1 ox1Var, tr3 tr3Var, Integer num) {
        this.f = f23Var;
        this.g = ox1Var;
        this.h = tr3Var;
        this.i = num;
    }

    public static z13 I(rz2 rz2Var, ox1 ox1Var, Integer num) throws GeneralSecurityException {
        tr3 tr3VarB;
        tr3 tr3Var = (tr3) ox1Var.a;
        rz2 rz2Var2 = rz2.h;
        if (rz2Var != rz2Var2 && num == null) {
            throw new GeneralSecurityException(ts.k("For given Variant ", String.valueOf(rz2Var), " the value of idRequirement must be non-null"));
        }
        if (rz2Var == rz2Var2 && num != null) {
            tv2.f("For given Variant NO_PREFIX the value of idRequirement must be null");
            return null;
        }
        if (tr3Var.a.length != 32) {
            throw new GeneralSecurityException(ck1.r(tr3Var.a.length, "XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not "));
        }
        f23 f23Var = new f23(rz2Var);
        if (rz2Var == rz2Var2) {
            tr3VarB = we3.a;
        } else if (rz2Var == rz2.g) {
            tr3VarB = we3.a(num.intValue());
        } else {
            if (rz2Var != rz2.f) {
                uq1.q("Unknown Variant: ".concat(String.valueOf(rz2Var)));
                return null;
            }
            tr3VarB = we3.b(num.intValue());
        }
        return new z13(f23Var, ox1Var, tr3VarB, num);
    }

    @Override // defpackage.zi0
    public final /* synthetic */ dx2 E() {
        return this.f;
    }

    @Override // defpackage.zi0
    public final Integer F() {
        return this.i;
    }

    @Override // defpackage.iy2
    public final tr3 H() {
        return this.h;
    }
}
