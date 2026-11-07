package com.xiasuhuei321.loadingdialog.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import defpackage.e;
import defpackage.mz0;
import defpackage.ts;
import defpackage.yb0;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public class WrongDiaView extends View {
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

    public WrongDiaView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.c = 0;
        this.d = 0.0f;
        this.a0 = 0;
        this.b0 = true;
        this.c0 = 1;
        this.d0 = 0;
        this.e0 = 0;
        this.b = context;
        Paint paint = new Paint();
        this.e = paint;
        paint.setAntiAlias(true);
        this.e.setStyle(Paint.Style.STROKE);
        this.e.setColor(-1);
        this.e.setStrokeWidth(8.0f);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        yb0 yb0Var;
        if (!this.b0) {
            canvas.drawArc(this.f, 0.0f, 360.0f, false, this.e);
            int i = this.c;
            int i2 = (i * 3) / 10;
            float f = i2;
            float f2 = ((i * 2) / 5) + i2;
            canvas.drawLine(f, f, f2, f2, this.e);
            float f3 = ((this.c * 2) / 5) + i2;
            canvas.drawLine(f3, f, f, f3, this.e);
            yb0 yb0Var2 = this.a;
            if (yb0Var2 != null) {
                ((mz0) yb0Var2).b(this);
                return;
            }
            return;
        }
        int i3 = this.e0;
        if (i3 < 100) {
            this.e0 = i3 + this.c0;
        }
        canvas.drawArc(this.f, 235.0f, (this.e0 * 360) / 100, false, this.e);
        int i4 = this.c;
        int i5 = (i4 * 3) / 10;
        int i6 = (i4 * 7) / 10;
        if (this.e0 == 100) {
            int i7 = this.i;
            if (i7 + i5 <= i6) {
                int i8 = this.c0;
                this.i = i7 + i8;
                this.v += i8;
            }
            float f4 = i5;
            canvas.drawLine(f4, f4, this.i + i5, this.v + i5, this.e);
            int i9 = this.i;
            int i10 = (this.c * 2) / 5;
            if (i9 == i10) {
                this.i = i9 + 1;
                this.v++;
            }
            if (this.i >= i10) {
                int i11 = this.W;
                if (i6 - i11 >= i5) {
                    int i12 = this.w;
                    int i13 = this.c0;
                    this.w = i12 - i13;
                    this.W = i11 + i13;
                }
            }
            canvas.drawLine(i6, f4, this.w + i6, this.W + i5, this.e);
            if (i6 - this.W < i5) {
                if (this.d0 == 0 && this.a0 == 0 && (yb0Var = this.a) != null) {
                    ((mz0) yb0Var).b(this);
                    this.d0++;
                }
                int i14 = this.a0 - 1;
                this.a0 = i14;
                if (i14 < 0) {
                    return;
                }
                this.i = 0;
                this.w = 0;
                this.v = 0;
                this.W = 0;
                this.e0 = 0;
                invalidate();
            }
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
            e.g(ts.g(i, "how can u set this speed??  ", "  do not use reflect to use this method!u can see the LoadingDialog class for how toset the speed"));
        }
    }
}
