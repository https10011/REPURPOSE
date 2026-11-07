package defpackage;

import android.app.Dialog;
import android.view.View;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class p10 extends gb2 {
    public final /* synthetic */ rf0 X;
    public final /* synthetic */ q10 Y;

    public p10(q10 q10Var, rf0 rf0Var) {
        this.Y = q10Var;
        this.X = rf0Var;
    }

    @Override // defpackage.gb2
    public final View x(int i) {
        rf0 rf0Var = this.X;
        if (rf0Var.y()) {
            return rf0Var.x(i);
        }
        Dialog dialog = this.Y.V0;
        if (dialog != null) {
            return dialog.findViewById(i);
        }
        return null;
    }

    @Override // defpackage.gb2
    public final boolean y() {
        return this.X.y() || this.Y.Z0;
    }
}
