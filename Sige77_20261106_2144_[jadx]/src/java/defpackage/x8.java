package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class x8 extends f91 {
    public PorterDuff.Mode W;
    public boolean X;
    public boolean Y;
    public final w8 i;
    public Drawable v;
    public ColorStateList w;

    public x8(w8 w8Var) {
        super(w8Var);
        this.w = null;
        this.W = null;
        this.X = false;
        this.Y = false;
        this.i = w8Var;
    }

    @Override // defpackage.f91
    public final void k(AttributeSet attributeSet, int i) {
        super.k(attributeSet, 2130969633);
        w8 w8Var = this.i;
        Context context = w8Var.getContext();
        int[] iArr = we1.g;
        p11 p11VarK = p11.k(context, attributeSet, iArr, 2130969633);
        TypedArray typedArray = (TypedArray) p11VarK.c;
        x52.m(w8Var, w8Var.getContext(), iArr, attributeSet, (TypedArray) p11VarK.c, 2130969633);
        Drawable drawableG = p11VarK.g(0);
        if (drawableG != null) {
            w8Var.setThumb(drawableG);
        }
        Drawable drawableF = p11VarK.f(1);
        Drawable drawable = this.v;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.v = drawableF;
        if (drawableF != null) {
            drawableF.setCallback(w8Var);
            drawableF.setLayoutDirection(w8Var.getLayoutDirection());
            if (drawableF.isStateful()) {
                drawableF.setState(w8Var.getDrawableState());
            }
            v();
        }
        w8Var.invalidate();
        if (typedArray.hasValue(3)) {
            this.W = i30.b(typedArray.getInt(3, -1), this.W);
            this.Y = true;
        }
        if (typedArray.hasValue(2)) {
            this.w = p11VarK.e(2);
            this.X = true;
        }
        p11VarK.m();
        v();
    }

    public final void v() {
        Drawable drawable = this.v;
        if (drawable != null) {
            if (this.X || this.Y) {
                Drawable drawableMutate = drawable.mutate();
                this.v = drawableMutate;
                if (this.X) {
                    drawableMutate.setTintList(this.w);
                }
                if (this.Y) {
                    this.v.setTintMode(this.W);
                }
                if (this.v.isStateful()) {
                    this.v.setState(this.i.getDrawableState());
                }
            }
        }
    }

    public final void w(Canvas canvas) {
        if (this.v != null) {
            w8 w8Var = this.i;
            int max = w8Var.getMax();
            if (max > 1) {
                int intrinsicWidth = this.v.getIntrinsicWidth();
                int intrinsicHeight = this.v.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.v.setBounds(-i, -i2, i, i2);
                float width = ((w8Var.getWidth() - w8Var.getPaddingLeft()) - w8Var.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(w8Var.getPaddingLeft(), w8Var.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.v.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }
}
