package defpackage;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class l72 extends k72 {
    @Override // defpackage.k72
    public final void I(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // defpackage.k72
    public final void J(View view, int i) {
        view.setTransitionVisibility(i);
    }

    @Override // defpackage.k72
    public final void K(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // defpackage.k72
    public final void L(ViewGroup viewGroup, Matrix matrix) {
        viewGroup.transformMatrixToLocal(matrix);
    }

    @Override // defpackage.xi0
    public final float n(View view) {
        return view.getTransitionAlpha();
    }

    @Override // defpackage.xi0
    public final void w(View view, float f) {
        view.setTransitionAlpha(f);
    }
}
