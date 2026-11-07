package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public abstract class wp0 extends Drawable implements Animatable {
    public static final Rect i = new Rect();
    public HashMap a;
    public ArrayList b;
    public int c;
    public Rect d;
    public boolean e;
    public Paint f;

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint = this.f;
        ue ueVar = (ue) this;
        float fMin = (Math.min(ueVar.d.width(), ueVar.d.height()) - 8.0f) / 6.0f;
        float f = 2.0f * fMin;
        float fWidth = (ueVar.d.width() / 2) - (f + 4.0f);
        float fHeight = ueVar.d.height() / 2;
        for (int i2 = 0; i2 < 3; i2++) {
            canvas.save();
            float f2 = i2;
            canvas.translate((f2 * 4.0f) + (f * f2) + fWidth, fHeight);
            float f3 = ueVar.v[i2];
            canvas.scale(f3, f3);
            canvas.drawCircle(0.0f, 0.0f, fMin, paint);
            canvas.restore();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.c;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Iterator it = this.b.iterator();
        if (it.hasNext()) {
            return ((ValueAnimator) it.next()).isRunning();
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.d = new Rect(rect.left, rect.top, rect.right, rect.bottom);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i2) {
        this.c = i2;
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        if (!this.e) {
            ue ueVar = (ue) this;
            ArrayList arrayList = new ArrayList();
            int[] iArr = {120, 240, 360};
            for (int i2 = 0; i2 < 3; i2++) {
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.3f, 1.0f);
                valueAnimatorOfFloat.setDuration(750L);
                valueAnimatorOfFloat.setRepeatCount(-1);
                valueAnimatorOfFloat.setStartDelay(iArr[i2]);
                ueVar.a.put(valueAnimatorOfFloat, new te(ueVar, i2));
                arrayList.add(valueAnimatorOfFloat);
            }
            this.b = arrayList;
            this.e = true;
        }
        ArrayList arrayList2 = this.b;
        if (arrayList2 == null) {
            return;
        }
        Iterator it = arrayList2.iterator();
        if (it.hasNext() ? ((ValueAnimator) it.next()).isStarted() : false) {
            return;
        }
        for (int i3 = 0; i3 < this.b.size(); i3++) {
            ValueAnimator valueAnimator = (ValueAnimator) this.b.get(i3);
            ValueAnimator.AnimatorUpdateListener animatorUpdateListener = (ValueAnimator.AnimatorUpdateListener) this.a.get(valueAnimator);
            if (animatorUpdateListener != null) {
                valueAnimator.addUpdateListener(animatorUpdateListener);
            }
            valueAnimator.start();
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        ArrayList arrayList = this.b;
        if (arrayList != null) {
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                ValueAnimator valueAnimator = (ValueAnimator) obj;
                if (valueAnimator != null && valueAnimator.isStarted()) {
                    valueAnimator.removeAllUpdateListeners();
                    valueAnimator.end();
                }
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
