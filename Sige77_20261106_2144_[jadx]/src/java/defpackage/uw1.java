package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class uw1 extends xi0 {
    public final /* synthetic */ Context h;
    public final /* synthetic */ TextPaint i;
    public final /* synthetic */ xi0 j;
    public final /* synthetic */ vw1 k;

    public uw1(vw1 vw1Var, Context context, TextPaint textPaint, xi0 xi0Var) {
        this.k = vw1Var;
        this.h = context;
        this.i = textPaint;
        this.j = xi0Var;
    }

    @Override // defpackage.xi0
    public final void q(int i) {
        this.j.q(i);
    }

    @Override // defpackage.xi0
    public final void s(Typeface typeface, boolean z) {
        this.k.f(this.h, this.i, typeface);
        this.j.s(typeface, z);
    }
}
