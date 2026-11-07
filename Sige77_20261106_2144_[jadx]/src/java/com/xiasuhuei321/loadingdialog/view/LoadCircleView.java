package com.xiasuhuei321.loadingdialog.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public class LoadCircleView extends View {
    public final Context a;
    public final Paint b;
    public int c;
    public int d;

    public LoadCircleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.c = 0;
        this.d = 0;
        this.a = context;
        Paint paint = new Paint();
        this.b = paint;
        paint.setAntiAlias(true);
        this.b.setStyle(Paint.Style.STROKE);
        this.b.setStrokeWidth(8.0f);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i = this.c;
        int i2 = i >> 1;
        int i3 = (i >> 1) - 8;
        int i4 = 0;
        if (this.d >= 12) {
            this.d = 0;
        }
        while (true) {
            int i5 = this.d;
            if (i4 >= 12) {
                this.d = i5 + 1;
                postInvalidateDelayed(50L);
                return;
            }
            int i6 = i5 + 4;
            Paint paint = this.b;
            if (i4 < i6 && i4 >= i5) {
                paint.setColor(-7829368);
            } else if (i5 <= 8 || i4 >= i5 - 8) {
                paint.setColor(-1);
            } else {
                paint.setColor(-7829368);
            }
            float f = i2;
            Canvas canvas2 = canvas;
            canvas2.drawLine(f, (float) ((((double) i3) * 0.5d) + ((double) i2)), f, i3 * 2, this.b);
            canvas2.rotate(30.0f, f, f);
            i4++;
            canvas = canvas2;
        }
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
            this.c = (int) ((50.0f * this.a.getResources().getDisplayMetrics().density) + 0.5f);
        }
        int i3 = this.c;
        setMeasuredDimension(i3, i3);
    }
}
