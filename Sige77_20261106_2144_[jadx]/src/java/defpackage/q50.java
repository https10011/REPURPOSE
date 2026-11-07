package defpackage;

import android.text.InputFilter;
import android.widget.TextView;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class q50 extends ea {
    public final p50 i;

    public q50(TextView textView) {
        this.i = new p50(textView);
    }

    @Override // defpackage.ea
    public final InputFilter[] j(InputFilter[] inputFilterArr) {
        return !(f50.k != null) ? inputFilterArr : this.i.j(inputFilterArr);
    }

    @Override // defpackage.ea
    public final boolean p() {
        return this.i.k;
    }

    @Override // defpackage.ea
    public final void y(boolean z) {
        if (f50.k != null) {
            this.i.y(z);
        }
    }

    @Override // defpackage.ea
    public final void z(boolean z) {
        boolean z2 = f50.k != null;
        p50 p50Var = this.i;
        if (z2) {
            p50Var.z(z);
        } else {
            p50Var.k = z;
        }
    }
}
