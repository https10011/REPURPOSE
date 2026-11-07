package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class w8 extends SeekBar {
    public final x8 a;

    public w8(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130969633);
        gx1.a(this, getContext());
        x8 x8Var = new x8(this);
        this.a = x8Var;
        x8Var.k(attributeSet, 2130969633);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        x8 x8Var = this.a;
        w8 w8Var = x8Var.i;
        Drawable drawable = x8Var.v;
        if (drawable != null && drawable.isStateful() && drawable.setState(w8Var.getDrawableState())) {
            w8Var.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.a.v;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.a.w(canvas);
    }
}
