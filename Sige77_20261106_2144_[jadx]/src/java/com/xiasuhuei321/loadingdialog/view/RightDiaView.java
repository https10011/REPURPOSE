package com.xiasuhuei321.loadingdialog.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import defpackage.ck1;
import defpackage.e;
import defpackage.mz0;
import defpackage.yb0;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public class RightDiaView extends View {
    public int W;
    public yb0 a;
    public int a0;
    public final Context b;
    public boolean b0;
    public int c;
    public int c0;
    public float d;
    public int d0;
    public final Paint e;
    public int e0;
    public RectF f;
    public int i;
    public int v;
    public int w;

    public RightDiaView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.c = 0;
        this.d = 0.0f;
        this.a0 = 0;
        this.b0 = true;
        this.c0 = 1;
        this.d0 = 0;
        this.e0 = 0;
        Paint paint = new Paint();
        this.e = paint;
        paint.setAntiAlias(true);
        this.e.setStyle(Paint.Style.STROKE);
        this.e.setColor(-1);
        this.e.setStrokeWidth(8.0f);
        this.b = context;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        yb0 yb0Var;
        int i;
        int i2;
        if (!this.b0) {
            canvas.drawArc(this.f, 0.0f, 360.0f, false, this.e);
            int i3 = this.c;
            int i4 = i3 / 2;
            int i5 = i4 - (i3 / 5);
            int i6 = i4 - 8;
            int i7 = i6 / 3;
            int i8 = i5 + i7;
            int i9 = i4 + i7;
            canvas.drawLine(i5, i4, i8, i9, this.e);
            canvas.drawLine(i8 - 1, i9 - 4, i5 + i6, i4 - i7, this.e);
            yb0 yb0Var2 = this.a;
            if (yb0Var2 != null) {
                ((mz0) yb0Var2).b(this);
                return;
            }
            return;
        }
        int i10 = this.d0;
        if (i10 < 100) {
            this.d0 = i10 + this.c0;
        }
        canvas.drawArc(this.f, 235.0f, (this.d0 * 360) / 100, false, this.e);
        int i11 = this.c;
        int i12 = i11 / 2;
        int i13 = i12 - (i11 / 5);
        int i14 = i12 - 8;
        if (this.d0 == 100) {
            int i15 = this.i;
            int i16 = i14 / 3;
            if (i15 < i16) {
                int i17 = this.c0;
                this.i = i15 + i17;
                this.v += i17;
            }
            canvas.drawLine(i13, i12, this.i + i13, this.v + i12, this.e);
            int i18 = this.i;
            if (i18 >= i16 && this.w == 0 && this.W == 0) {
                this.w = i18;
                int i19 = this.v;
                this.W = i19;
                int i20 = this.c0;
                this.i = i18 + i20;
                this.v = i19 + i20;
            }
            int i21 = this.i;
            if (i21 >= i16 && (i = this.w) <= i14 && (i2 = this.W) <= i12 - i16) {
                int i22 = this.c0;
                this.w = i + i22;
                this.W = i2 - i22;
            }
            canvas.drawLine((i21 + i13) - 1, (this.v + i12) - 4, i13 + this.w, i12 + this.W, this.e);
        }
        if (this.w > i14 && this.d0 >= 100 && this.i != i14 / 3) {
            if (this.e0 == 0 && this.a0 == 0 && (yb0Var = this.a) != null) {
                ((mz0) yb0Var).b(this);
                this.e0++;
            }
            int i23 = this.a0 - 1;
            this.a0 = i23;
            if (i23 < 0) {
                return;
            }
            this.i = 0;
            this.w = 0;
            this.v = 0;
            this.W = 0;
            this.d0 = 0;
            invalidate();
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode != Integer.MIN_VALUE && mode2 != Integer.MIN_VALUE) {
            if (size < size2) {
                size = size2;
            }
            this.c = size;
        } else if (mode == Integer.MIN_VALUE && mode2 != Integer.MIN_VALUE) {
            this.c = size2;
        } else if (mode != Integer.MIN_VALUE) {
            this.c = size;
        } else {
            this.c = (int) ((80.0f * this.b.getResources().getDisplayMetrics().density) + 0.5f);
        }
        int i3 = this.c;
        setMeasuredDimension(i3, i3);
        this.d = 8.0f;
        float f = this.d;
        float f2 = this.c - f;
        this.f = new RectF(f, f, f2, f2);
    }

    public void setDrawColor(int i) {
        this.e.setColor(i);
    }

    public void setDrawDynamic(boolean z) {
        this.b0 = z;
    }

    public void setOnDrawFinishListener(yb0 yb0Var) {
        this.a = yb0Var;
    }

    public void setRepeatTime(int i) {
        if (this.b0) {
            this.a0 = i;
        }
    }

    public void setSpeed(int i) {
        if (i > 0 || i < 3) {
            this.c0 = i;
        } else {
            e.g(ck1.r(i, "support speed >0 & < 3, the speed you set is: "));
        }
    }
}
