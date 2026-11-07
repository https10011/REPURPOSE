package defpackage;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class l13 extends iy2 {
    public final s13 f;
    public final ox1 g;
    public final tr3 h;
    public final Integer i;

    public l13(s13 s13Var, ox1 ox1Var, tr3 tr3Var, Integer num) {
        this.f = s13Var;
        this.g = ox1Var;
        this.h = tr3Var;
        this.i = num;
    }

    public static l13 I(s13 s13Var, ox1 ox1Var, Integer num) throws GeneralSecurityException {
        tr3 tr3VarB;
        tr3 tr3Var = (tr3) ox1Var.a;
        nz2 nz2Var = s13Var.a;
        nz2 nz2Var2 = nz2.i;
        if (nz2Var != nz2Var2 && num == null) {
            throw new GeneralSecurityException(ts.k("For given Variant ", String.valueOf(nz2Var), " the value of idRequirement must be non-null"));
        }
        if (nz2Var == nz2Var2 && num != null) {
            tv2.f("For given Variant NO_PREFIX the value of idRequirement must be null");
            return null;
        }
        if (tr3Var.a.length != 32) {
            throw new GeneralSecurityException(ck1.r(tr3Var.a.length, "XAesGcmKey key must be constructed with key of length 32 bytes, not "));
        }
        if (nz2Var == nz2Var2) {
            tr3VarB = we3.a;
        } else {
            if (nz2Var != nz2.f) {
                uq1.q("Unknown Variant: ".concat(String.valueOf(nz2Var)));
                return null;
            }
            tr3VarB = we3.b(num.intValue());
        }
        return new l13(s13Var, ox1Var, tr3VarB, num);
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
