package defpackage;

import com.google.android.material.button.MaterialButton;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class q21 extends bj0 {
    public final int j;

    public q21(int i) {
        this.j = i;
    }

    @Override // defpackage.bj0
    public final float o(zp1 zp1Var) {
        float[] fArr = ((r21) zp1Var).p0;
        if (fArr != null) {
            return fArr[this.j];
        }
        return 0.0f;
    }

    @Override // defpackage.bj0
    public final void s(zp1 zp1Var, float f) {
        r21 r21Var = (r21) zp1Var;
        float[] fArr = r21Var.p0;
        if (fArr != null) {
            int i = this.j;
            if (fArr[i] != f) {
                fArr[i] = f;
                ab abVar = r21Var.r0;
                if (abVar != null) {
                    float fH = r21Var.h();
                    MaterialButton materialButton = (MaterialButton) abVar.b;
                    int i2 = (int) (fH * 0.11f);
                    if (materialButton.n0 != i2) {
                        materialButton.n0 = i2;
                        materialButton.j();
                        materialButton.invalidate();
                    }
                }
                r21Var.invalidateSelf();
            }
        }
    }
}
