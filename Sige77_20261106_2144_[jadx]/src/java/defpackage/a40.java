package defpackage;

import android.view.View;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class a40 extends bj0 {
    public final /* synthetic */ int j;

    public /* synthetic */ a40(int i) {
        this.j = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.bj0
    public final float o(zp1 zp1Var) {
        switch (this.j) {
            case 0:
                return ((View) zp1Var).getAlpha();
            case 1:
                return ((View) zp1Var).getScaleX();
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                return ((View) zp1Var).getScaleY();
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                return ((View) zp1Var).getRotation();
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                return ((View) zp1Var).getRotationX();
            default:
                return ((View) zp1Var).getRotationY();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.bj0
    public final void s(zp1 zp1Var, float f) {
        switch (this.j) {
            case 0:
                ((View) zp1Var).setAlpha(f);
                break;
            case 1:
                ((View) zp1Var).setScaleX(f);
                break;
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                ((View) zp1Var).setScaleY(f);
                break;
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                ((View) zp1Var).setRotation(f);
                break;
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                ((View) zp1Var).setRotationX(f);
                break;
            default:
                ((View) zp1Var).setRotationY(f);
                break;
        }
    }
}
