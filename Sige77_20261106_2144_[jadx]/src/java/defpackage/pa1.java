package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class pa1 extends yx0 {
    public final /* synthetic */ qa1 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pa1(qa1 qa1Var, Context context) {
        super(context);
        this.q = qa1Var;
    }

    @Override // defpackage.yx0
    public final float d(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }

    @Override // defpackage.yx0
    public final int e(int i) {
        return Math.min(100, super.e(i));
    }

    @Override // defpackage.yx0
    public final void h(View view, fg1 fg1Var) {
        qa1 qa1Var = this.q;
        int[] iArrA = qa1Var.a(qa1Var.a.getLayoutManager(), view);
        int i = iArrA[0];
        int i2 = iArrA[1];
        int iCeil = (int) Math.ceil(((double) e(Math.max(Math.abs(i), Math.abs(i2)))) / 0.3356d);
        if (iCeil > 0) {
            fg1Var.a = i;
            fg1Var.b = i2;
            fg1Var.c = iCeil;
            fg1Var.e = this.j;
            fg1Var.f = true;
        }
    }
}
