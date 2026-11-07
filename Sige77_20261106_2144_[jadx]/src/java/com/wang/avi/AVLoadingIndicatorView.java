package com.wang.avi;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import defpackage.s;
import defpackage.ue;
import defpackage.ve1;
import defpackage.wp0;
import java.util.HashMap;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public class AVLoadingIndicatorView extends View {
    public static final ue W;
    public final s a;
    public final s b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public wp0 i;
    public int v;
    public boolean w;

    static {
        ue ueVar = new ue();
        ueVar.a = new HashMap();
        ueVar.c = 255;
        ueVar.d = wp0.i;
        Paint paint = new Paint();
        ueVar.f = paint;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        ueVar.v = new float[]{1.0f, 1.0f, 1.0f};
        W = ueVar;
    }

    public AVLoadingIndicatorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new s(this, 0);
        this.b = new s(this, 1);
        this.c = 24;
        this.d = 48;
        this.e = 24;
        this.f = 48;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ve1.a, 0, 2131951616);
        this.c = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, this.c);
        this.d = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, this.d);
        this.e = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, this.e);
        this.f = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, this.f);
        String string = typedArrayObtainStyledAttributes.getString(1);
        this.v = typedArrayObtainStyledAttributes.getColor(0, -1);
        setIndicator(string);
        if (this.i == null) {
            setIndicator(W);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void a() {
        if (getVisibility() != 0) {
            return;
        }
        if (this.i != null) {
            this.w = true;
        }
        postInvalidate();
    }

    @Override // android.view.View
    public final void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        wp0 wp0Var = this.i;
        if (wp0Var != null) {
            wp0Var.setHotspot(f, f2);
        }
    }

    @Override // android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        wp0 wp0Var = this.i;
        if (wp0Var == null || !wp0Var.isStateful()) {
            return;
        }
        this.i.setState(drawableState);
    }

    public wp0 getIndicator() {
        return this.i;
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        if (!verifyDrawable(drawable)) {
            super.invalidateDrawable(drawable);
            return;
        }
        Rect bounds = drawable.getBounds();
        int paddingLeft = getPaddingLeft() + getScrollX();
        int paddingTop = getPaddingTop() + getScrollY();
        invalidate(bounds.left + paddingLeft, bounds.top + paddingTop, bounds.right + paddingLeft, bounds.bottom + paddingTop);
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a();
        removeCallbacks(this.a);
        removeCallbacks(this.b);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        wp0 wp0Var = this.i;
        if (wp0Var != null) {
            wp0Var.stop();
            this.w = false;
        }
        postInvalidate();
        super.onDetachedFromWindow();
        removeCallbacks(this.a);
        removeCallbacks(this.b);
    }

    @Override // android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        wp0 wp0Var = this.i;
        if (wp0Var != null) {
            int iSave = canvas.save();
            canvas.translate(getPaddingLeft(), getPaddingTop());
            wp0Var.draw(canvas);
            canvas.restoreToCount(iSave);
            if (this.w) {
                wp0Var.start();
                this.w = false;
            }
        }
    }

    @Override // android.view.View
    public final synchronized void onMeasure(int i, int i2) {
        int iMax;
        int iMax2;
        try {
            wp0 wp0Var = this.i;
            if (wp0Var != null) {
                iMax2 = Math.max(this.c, Math.min(this.d, wp0Var.getIntrinsicWidth()));
                iMax = Math.max(this.e, Math.min(this.f, wp0Var.getIntrinsicHeight()));
            } else {
                iMax = 0;
                iMax2 = 0;
            }
            int[] drawableState = getDrawableState();
            wp0 wp0Var2 = this.i;
            if (wp0Var2 != null && wp0Var2.isStateful()) {
                this.i.setState(drawableState);
            }
            setMeasuredDimension(View.resolveSizeAndState(getPaddingLeft() + getPaddingRight() + iMax2, i, 0), View.resolveSizeAndState(getPaddingTop() + getPaddingBottom() + iMax, i2, 0));
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int i5;
        int paddingLeft = i - (getPaddingLeft() + getPaddingRight());
        int paddingBottom = i2 - (getPaddingBottom() + getPaddingTop());
        wp0 wp0Var = this.i;
        if (wp0Var != null) {
            float intrinsicWidth = wp0Var.getIntrinsicWidth() / this.i.getIntrinsicHeight();
            float f = paddingLeft;
            float f2 = paddingBottom;
            float f3 = f / f2;
            int i6 = 0;
            if (intrinsicWidth == f3) {
                i5 = 0;
            } else if (f3 > intrinsicWidth) {
                int i7 = (int) (f2 * intrinsicWidth);
                int i8 = (paddingLeft - i7) / 2;
                i6 = i8;
                paddingLeft = i7 + i8;
                i5 = 0;
            } else {
                int i9 = (int) ((1.0f / intrinsicWidth) * f);
                int i10 = (paddingBottom - i9) / 2;
                int i11 = i9 + i10;
                i5 = i10;
                paddingBottom = i11;
            }
            this.i.setBounds(i6, i5, paddingLeft, paddingBottom);
        }
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i != 8 && i != 4) {
            a();
            return;
        }
        wp0 wp0Var = this.i;
        if (wp0Var != null) {
            wp0Var.stop();
            this.w = false;
        }
        postInvalidate();
    }

    public void setIndicator(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        if (!str.contains(".")) {
            sb.append(getClass().getPackage().getName());
            sb.append(".indicators.");
        }
        sb.append(str);
        try {
            setIndicator((wp0) Class.forName(sb.toString()).newInstance());
        } catch (ClassNotFoundException unused) {
            Log.e("AVLoadingIndicatorView", "Didn't find your class , check the name again !");
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e2) {
            e2.printStackTrace();
        }
    }

    public void setIndicatorColor(int i) {
        this.v = i;
        this.i.f.setColor(i);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        if (getVisibility() != i) {
            super.setVisibility(i);
            if (i != 8 && i != 4) {
                a();
                return;
            }
            wp0 wp0Var = this.i;
            if (wp0Var != null) {
                wp0Var.stop();
                this.w = false;
            }
            postInvalidate();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.i || super.verifyDrawable(drawable);
    }

    public void setIndicator(wp0 wp0Var) {
        wp0 wp0Var2 = this.i;
        if (wp0Var2 != wp0Var) {
            if (wp0Var2 != null) {
                wp0Var2.setCallback(null);
                unscheduleDrawable(this.i);
            }
            this.i = wp0Var;
            setIndicatorColor(this.v);
            if (wp0Var != null) {
                wp0Var.setCallback(this);
            }
            postInvalidate();
        }
    }
}
