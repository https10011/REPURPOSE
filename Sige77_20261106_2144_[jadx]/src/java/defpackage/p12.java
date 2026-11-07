package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class p12 extends l02 {
    public final /* synthetic */ int a;
    public final boolean b;

    public /* synthetic */ p12(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    @Override // defpackage.l02
    public final Object b(au0 au0Var) throws IOException {
        switch (this.a) {
            case 0:
                if (au0Var.R() != 9) {
                    return Double.valueOf(au0Var.w());
                }
                au0Var.D();
                return null;
            default:
                if (au0Var.R() != 9) {
                    return Float.valueOf((float) au0Var.w());
                }
                au0Var.D();
                return null;
        }
    }

    @Override // defpackage.l02
    public final void c(eu0 eu0Var, Object obj) throws IOException {
        int i = this.a;
        boolean z = this.b;
        switch (i) {
            case 0:
                Number number = (Number) obj;
                if (number == null) {
                    eu0Var.p();
                    return;
                }
                double dDoubleValue = number.doubleValue();
                if (z) {
                    r12.a(dDoubleValue);
                }
                eu0Var.D();
                if (eu0Var.v == 1 || !(Double.isNaN(dDoubleValue) || Double.isInfinite(dDoubleValue))) {
                    eu0Var.a();
                    eu0Var.a.append((CharSequence) Double.toString(dDoubleValue));
                    return;
                } else {
                    throw new IllegalArgumentException("Numeric values must be finite, but was " + dDoubleValue);
                }
            default:
                Number numberValueOf = (Number) obj;
                if (numberValueOf == null) {
                    eu0Var.p();
                    return;
                }
                float fFloatValue = numberValueOf.floatValue();
                if (z) {
                    r12.a(fFloatValue);
                }
                if (!(numberValueOf instanceof Float)) {
                    numberValueOf = Float.valueOf(fFloatValue);
                }
                eu0Var.A(numberValueOf);
                return;
        }
    }
}
