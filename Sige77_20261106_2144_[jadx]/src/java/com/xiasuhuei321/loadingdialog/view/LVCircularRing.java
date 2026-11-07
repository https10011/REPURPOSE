package com.xiasuhuei321.loadingdialog.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public class LVCircularRing extends View {
    public float a;
    public float b;
    public float c;
    public final Paint d;
    public int e;
    public final Paint f;
    public ValueAnimator i;

    public LVCircularRing(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.a = 0.0f;
        this.b = 0.0f;
        this.c = 0.0f;
        this.e = Color.argb(100, 255, 255, 255);
        Paint paint = new Paint();
        this.d = paint;
        paint.setAntiAlias(true);
        Paint paint2 = this.d;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        this.d.setColor(this.e);
        this.d.setStrokeWidth(8.0f);
        Paint paint3 = new Paint();
        this.f = paint3;
        paint3.setAntiAlias(true);
        this.f.setStyle(style);
        this.f.setStrokeWidth(8.0f);
        this.f.setColor(this.e);
    }

    public final void a() {
        if (this.i != null) {
            clearAnimation();
            this.i.setRepeatCount(1);
            this.i.cancel();
            this.i.end();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int i = this.e;
        Paint paint = this.f;
        paint.setColor(i);
        float f = this.a;
        canvas.drawCircle(f / 2.0f, f / 2.0f, (f / 2.0f) - this.b, paint);
        this.d.setColor(-1);
        float f2 = this.b;
        float f3 = this.a;
        canvas.drawArc(new RectF(f2, f2, f3 - f2, f3 - f2), this.c, 100.0f, false, this.d);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (getMeasuredWidth() > getHeight()) {
            this.a = getMeasuredHeight();
        } else {
            this.a = getMeasuredWidth();
        }
        this.b = 5.0f;
    }

    public void setColor(int i) {
        this.e = i;
        this.d.setColor(i);
        this.f.setColor(i);
    }
}
