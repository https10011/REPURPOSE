package defpackage;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class wy0 implements View.OnTouchListener {
    public static final int e0 = ViewConfiguration.getTapTimeout();
    public final float[] W;
    public final float[] X;
    public boolean Y;
    public boolean Z;
    public final gd a;
    public boolean a0;
    public final AccelerateInterpolator b;
    public boolean b0;
    public final o30 c;
    public boolean c0;
    public i4 d;
    public final o30 d0;
    public final float[] e;
    public final float[] f;
    public final int i;
    public final int v;
    public final float[] w;

    public wy0(o30 o30Var) {
        gd gdVar = new gd();
        gdVar.e = Long.MIN_VALUE;
        gdVar.g = -1L;
        gdVar.f = 0L;
        this.a = gdVar;
        this.b = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.e = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.w = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.W = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.X = fArr5;
        this.c = o30Var;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f2 = ((int) ((1575.0f * f) + 0.5f)) / 1000.0f;
        fArr5[0] = f2;
        fArr5[1] = f2;
        float f3 = ((int) ((f * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f3;
        fArr4[1] = f3;
        this.i = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.v = e0;
        gdVar.a = 500;
        gdVar.b = 500;
        this.d0 = o30Var;
    }

    public static float b(float f, float f2, float f3) {
        if (f > f3) {
            return f3;
        }
        return f < f2 ? f2 : f;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:13:0x003c  */
    /* JADX WARN: Code duplicated, block: B:15:0x004b  */
    /* JADX WARN: Code duplicated, block: B:17:0x0051  */
    public final float a(float f, float f2, float f3, int i) {
        float fB;
        float interpolation;
        float fB2 = b(this.e[i] * f2, 0.0f, this.f[i]);
        float fC = c(f2 - f, fB2) - c(f, fB2);
        AccelerateInterpolator accelerateInterpolator = this.b;
        if (fC >= 0.0f) {
            if (fC > 0.0f) {
                interpolation = accelerateInterpolator.getInterpolation(fC);
            } else {
                fB = 0.0f;
            }
            if (fB == 0.0f) {
                return 0.0f;
            }
            float f4 = this.w[i];
            float f5 = this.W[i];
            float f6 = this.X[i];
            float f7 = f4 * f3;
            return fB > 0.0f ? b(fB * f7, f5, f6) : -b((-fB) * f7, f5, f6);
        }
        interpolation = -accelerateInterpolator.getInterpolation(-fC);
        fB = b(interpolation, -1.0f, 1.0f);
        if (fB == 0.0f) {
            return 0.0f;
        }
        float f8 = this.w[i];
        float f9 = this.W[i];
        float f10 = this.X[i];
        float f11 = f8 * f3;
        if (fB > 0.0f) {
        }
    }

    public final float c(float f, float f2) {
        if (f2 != 0.0f) {
            int i = this.i;
            if (i == 0 || i == 1) {
                if (f < f2) {
                    if (f >= 0.0f) {
                        return 1.0f - (f / f2);
                    }
                    if (this.b0 && i == 1) {
                        return 1.0f;
                    }
                }
            } else if (i == 2 && f < 0.0f) {
                return f / (-f2);
            }
        }
        return 0.0f;
    }

    public final void d() {
        int i = 0;
        if (this.Z) {
            this.b0 = false;
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        gd gdVar = this.a;
        int i2 = (int) (jCurrentAnimationTimeMillis - gdVar.e);
        int i3 = gdVar.b;
        if (i2 > i3) {
            i = i3;
        } else if (i2 >= 0) {
            i = i2;
        }
        gdVar.i = i;
        gdVar.h = gdVar.a(jCurrentAnimationTimeMillis);
        gdVar.g = jCurrentAnimationTimeMillis;
    }

    public final boolean e() {
        o30 o30Var;
        int count;
        gd gdVar = this.a;
        float f = gdVar.d;
        int iAbs = (int) (f / Math.abs(f));
        Math.abs(gdVar.c);
        if (iAbs != 0 && (count = (o30Var = this.d0).getCount()) != 0) {
            int childCount = o30Var.getChildCount();
            int firstVisiblePosition = o30Var.getFirstVisiblePosition();
            int i = firstVisiblePosition + childCount;
            if (iAbs <= 0 ? !(iAbs >= 0 || (firstVisiblePosition <= 0 && o30Var.getChildAt(0).getTop() >= 0)) : !(i >= count && o30Var.getChildAt(childCount - 1).getBottom() <= o30Var.getHeight())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0014, code lost:
    
        if (r0 != 3) goto L29;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouch(android.view.View r9, android.view.MotionEvent r10) {
        /*
            r8 = this;
            boolean r0 = r8.c0
            r1 = 0
            if (r0 != 0) goto L7
            goto L7c
        L7:
            int r0 = r10.getActionMasked()
            r2 = 2
            r3 = 1
            if (r0 == 0) goto L1b
            if (r0 == r3) goto L17
            if (r0 == r2) goto L1f
            r9 = 3
            if (r0 == r9) goto L17
            goto L7c
        L17:
            r8.d()
            return r1
        L1b:
            r8.a0 = r3
            r8.Y = r1
        L1f:
            float r0 = r10.getX()
            int r4 = r9.getWidth()
            float r4 = (float) r4
            o30 r5 = r8.c
            int r6 = r5.getWidth()
            float r6 = (float) r6
            float r0 = r8.a(r0, r4, r6, r1)
            float r10 = r10.getY()
            int r9 = r9.getHeight()
            float r9 = (float) r9
            int r4 = r5.getHeight()
            float r4 = (float) r4
            float r9 = r8.a(r10, r9, r4, r3)
            gd r10 = r8.a
            r10.c = r0
            r10.d = r9
            boolean r9 = r8.b0
            if (r9 != 0) goto L7c
            boolean r9 = r8.e()
            if (r9 == 0) goto L7c
            i4 r9 = r8.d
            if (r9 != 0) goto L60
            i4 r9 = new i4
            r9.<init>(r8, r2)
            r8.d = r9
        L60:
            r8.b0 = r3
            r8.Z = r3
            boolean r9 = r8.Y
            if (r9 != 0) goto L75
            int r9 = r8.v
            if (r9 <= 0) goto L75
            i4 r10 = r8.d
            long r6 = (long) r9
            java.util.WeakHashMap r9 = defpackage.x52.a
            r5.postOnAnimationDelayed(r10, r6)
            goto L7a
        L75:
            i4 r9 = r8.d
            r9.run()
        L7a:
            r8.Y = r3
        L7c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wy0.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
