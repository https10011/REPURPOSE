package defpackage;

import android.graphics.Typeface;
import com.google.android.material.chip.Chip;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class mm extends xi0 {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;

    public /* synthetic */ mm(Object obj, int i) {
        this.h = i;
        this.i = obj;
    }

    @Override // defpackage.xi0
    public final void q(int i) {
        switch (this.h) {
            case 0:
                break;
            default:
                xw1 xw1Var = (xw1) this.i;
                xw1Var.d = true;
                pm pmVar = (pm) xw1Var.e.get();
                if (pmVar != null) {
                    pmVar.C();
                }
                break;
        }
    }

    @Override // defpackage.xi0
    public final void s(Typeface typeface, boolean z) {
        int i = this.h;
        Object obj = this.i;
        switch (i) {
            case 0:
                Chip chip = (Chip) obj;
                pm pmVar = chip.e;
                chip.setText(pmVar.z1 ? pmVar.B0 : chip.getText());
                chip.requestLayout();
                chip.invalidate();
                break;
            default:
                if (!z) {
                    xw1 xw1Var = (xw1) obj;
                    xw1Var.d = true;
                    pm pmVar2 = (pm) xw1Var.e.get();
                    if (pmVar2 != null) {
                        pmVar2.C();
                    }
                    break;
                }
                break;
        }
    }

    private final void I(int i) {
    }
}
