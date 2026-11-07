package defpackage;

import java.math.BigInteger;
import java.security.spec.ECField;
import java.security.spec.ECFieldF2m;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class s40 extends ECParameterSpec {
    public s40(m40 m40Var, t40 t40Var, BigInteger bigInteger) {
        int[] iArr;
        ECField eCFieldF2m;
        zb0 zb0Var = m40Var.a;
        if (zb0Var.a() == 1) {
            eCFieldF2m = new ECFieldFp(zb0Var.b());
        } else {
            int[] iArr2 = ((wh0) zb0Var).b.a;
            int i = 0;
            if (iArr2 == null) {
                iArr = null;
            } else {
                iArr = new int[iArr2.length];
                System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            }
            int length = iArr.length;
            int i2 = length - 1;
            int i3 = length - 2;
            if (i3 < 0) {
                StringBuffer stringBuffer = new StringBuffer(1);
                stringBuffer.append(" > ");
                stringBuffer.append(i2);
                throw new IllegalArgumentException(stringBuffer.toString());
            }
            int[] iArr3 = new int[i3];
            if (iArr.length - 1 < i3) {
                System.arraycopy(iArr, 1, iArr3, 0, iArr.length - 1);
            } else {
                System.arraycopy(iArr, 1, iArr3, 0, i3);
            }
            int[] iArr4 = new int[i3];
            while (true) {
                i3--;
                if (i3 < 0) {
                    break;
                }
                iArr4[i3] = iArr3[i];
                i++;
            }
            eCFieldF2m = new ECFieldF2m(iArr2[iArr2.length - 1], iArr4);
        }
        EllipticCurve ellipticCurve = new EllipticCurve(eCFieldF2m, m40Var.b.g0(), m40Var.c.g0(), null);
        t40 t40VarI = t40Var.i();
        if (!t40VarI.g()) {
            uq1.q("point not in normal form");
            throw null;
        }
        BigInteger bigIntegerG0 = t40VarI.b.g0();
        if (t40VarI.g()) {
            super(ellipticCurve, new ECPoint(bigIntegerG0, t40VarI.d().g0()), bigInteger, 1);
        } else {
            uq1.q("point not in normal form");
            throw null;
        }
    }
}
