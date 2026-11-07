package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import android.util.StateSet;
import java.util.BitSet;
import java.util.Objects;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public class r21 extends Drawable implements zp1 {
    public static final Paint s0;
    public static final q21[] t0;
    public final Path W;
    public final RectF X;
    public final RectF Y;
    public final Region Z;
    public final gk1 a;
    public final Region a0;
    public p21 b;
    public final Paint b0;
    public final xp1[] c;
    public final Paint c0;
    public final xp1[] d;
    public final np1 d0;
    public final BitSet e;
    public final kj0 e0;
    public boolean f;
    public final qp1 f0;
    public PorterDuffColorFilter g0;
    public PorterDuffColorFilter h0;
    public boolean i;
    public int i0;
    public final RectF j0;
    public final boolean k0;
    public boolean l0;
    public op1 m0;
    public ss1 n0;
    public final rs1[] o0;
    public float[] p0;
    public float[] q0;
    public ab r0;
    public final Matrix v;
    public final Path w;

    static {
        Paint paint = new Paint(1);
        s0 = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        t0 = new q21[4];
        int i = 0;
        while (true) {
            q21[] q21VarArr = t0;
            if (i >= q21VarArr.length) {
                return;
            }
            q21VarArr[i] = new q21(i);
            i++;
        }
    }

    public r21(p21 p21Var) {
        this.a = new gk1(this, 13);
        this.c = new xp1[4];
        this.d = new xp1[4];
        this.e = new BitSet(8);
        this.v = new Matrix();
        this.w = new Path();
        this.W = new Path();
        this.X = new RectF();
        this.Y = new RectF();
        this.Z = new Region();
        this.a0 = new Region();
        Paint paint = new Paint(1);
        this.b0 = paint;
        Paint paint2 = new Paint(1);
        this.c0 = paint2;
        this.d0 = new np1();
        this.f0 = Looper.getMainLooper().getThread() == Thread.currentThread() ? pp1.a : new qp1();
        this.j0 = new RectF();
        this.k0 = true;
        this.l0 = true;
        this.o0 = new rs1[4];
        this.b = p21Var;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        r();
        p(getState());
        this.e0 = new kj0(this, 15);
    }

    public static float b(RectF rectF, op1 op1Var, float[] fArr) {
        if (fArr == null) {
            if (op1Var.f(rectF)) {
                return op1Var.e.a(rectF);
            }
            return -1.0f;
        }
        if (fArr.length > 1) {
            float f = fArr[0];
            for (int i = 1; i < fArr.length; i++) {
                if (fArr[i] != f) {
                    return -1.0f;
                }
            }
        }
        if (op1Var.e()) {
            return fArr[0];
        }
        return -1.0f;
    }

    public final void a(RectF rectF, Path path) {
        p21 p21Var = this.b;
        this.f0.a(p21Var.a, this.p0, p21Var.j, rectF, this.e0, path);
        if (this.b.i != 1.0f) {
            Matrix matrix = this.v;
            matrix.reset();
            float f = this.b.i;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.j0, true);
    }

    public final int c(int i) {
        int i2;
        p21 p21Var = this.b;
        float f = p21Var.n + 0.0f + p21Var.m;
        z40 z40Var = p21Var.c;
        if (z40Var == null || !z40Var.a || so.e(i, 255) != z40Var.d) {
            return i;
        }
        float f2 = z40Var.e;
        float fMin = (f2 <= 0.0f || f <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p(f / f2)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int iAlpha = Color.alpha(i);
        int iP = qt.p(fMin, so.e(i, 255), z40Var.b);
        if (fMin > 0.0f && (i2 = z40Var.c) != 0) {
            iP = so.c(so.e(i2, z40.f), iP);
        }
        return so.e(iP, iAlpha);
    }

    public final void d(Canvas canvas) {
        if (this.e.cardinality() > 0) {
            Log.w("r21", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i = this.b.p;
        Path path = this.w;
        np1 np1Var = this.d0;
        if (i != 0) {
            canvas.drawPath(path, np1Var.a);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            xp1 xp1Var = this.c[i2];
            int i3 = this.b.o;
            Matrix matrix = xp1.b;
            xp1Var.a(matrix, np1Var, i3, canvas);
            this.d[i2].a(matrix, np1Var, this.b.o, canvas);
        }
        if (this.k0) {
            int iSin = (int) (Math.sin(Math.toRadians(0.0d)) * ((double) this.b.p));
            int iCos = (int) (Math.cos(Math.toRadians(0.0d)) * ((double) this.b.p));
            canvas.translate(-iSin, -iCos);
            canvas.drawPath(path, s0);
            canvas.translate(iSin, iCos);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0097  */
    /* JADX WARN: Code duplicated, block: B:32:0x009d  */
    /* JADX WARN: Code duplicated, block: B:36:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:37:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:39:0x00f9 A[ADDED_TO_REGION] */
    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Paint paint;
        int iWidth;
        PorterDuffColorFilter porterDuffColorFilter = this.g0;
        Paint paint2 = this.b0;
        paint2.setColorFilter(porterDuffColorFilter);
        int alpha = paint2.getAlpha();
        int i = this.b.l;
        paint2.setAlpha(((i + (i >>> 7)) * alpha) >>> 8);
        PorterDuffColorFilter porterDuffColorFilter2 = this.h0;
        Paint paint3 = this.c0;
        paint3.setColorFilter(porterDuffColorFilter2);
        paint3.setStrokeWidth(this.b.k);
        int alpha2 = paint3.getAlpha();
        int i2 = this.b.l;
        paint3.setAlpha(((i2 + (i2 >>> 7)) * alpha2) >>> 8);
        Paint.Style style = this.b.q;
        if (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) {
            boolean z = this.f;
            paint = paint2;
            Path path = this.w;
            if (z) {
                a(g(), path);
                this.f = false;
            }
            p21 p21Var = this.b;
            p21Var.getClass();
            if (p21Var.o > 0 && !p21Var.a.f(g())) {
                float[] fArr = this.p0;
                if (fArr != null) {
                    int i3 = 1;
                    if (fArr.length > 1) {
                        float f = fArr[0];
                        while (true) {
                            if (i3 < fArr.length) {
                                if (fArr[i3] == f) {
                                    i3++;
                                }
                            } else if (!this.b.a.e()) {
                            }
                            if (!path.isConvex()) {
                                canvas.save();
                                canvas.translate((int) (Math.sin(Math.toRadians(0.0d)) * ((double) this.b.p)), (int) (Math.cos(Math.toRadians(0.0d)) * ((double) this.b.p)));
                                if (!this.k0) {
                                    RectF rectF = this.j0;
                                    iWidth = (int) (rectF.width() - getBounds().width());
                                    int iHeight = (int) (rectF.height() - getBounds().height());
                                    if (iWidth >= 0) {
                                    }
                                    uq1.q("Invalid shadow bounds. Check that the treatments result in a valid path.");
                                    return;
                                }
                                d(canvas);
                                canvas.restore();
                            }
                        }
                    } else if (!this.b.a.e()) {
                        if (!path.isConvex() && Build.VERSION.SDK_INT < 29) {
                            canvas.save();
                            canvas.translate((int) (Math.sin(Math.toRadians(0.0d)) * ((double) this.b.p)), (int) (Math.cos(Math.toRadians(0.0d)) * ((double) this.b.p)));
                            if (!this.k0) {
                                d(canvas);
                                canvas.restore();
                            } else {
                                RectF rectF2 = this.j0;
                                iWidth = (int) (rectF2.width() - getBounds().width());
                                int iHeight2 = (int) (rectF2.height() - getBounds().height());
                                if (iWidth >= 0 || iHeight2 < 0) {
                                    uq1.q("Invalid shadow bounds. Check that the treatments result in a valid path.");
                                    return;
                                }
                                Bitmap bitmapCreateBitmap = Bitmap.createBitmap((this.b.o * 2) + ((int) rectF2.width()) + iWidth, (this.b.o * 2) + ((int) rectF2.height()) + iHeight2, Bitmap.Config.ARGB_8888);
                                Canvas canvas2 = new Canvas(bitmapCreateBitmap);
                                float f2 = (getBounds().left - this.b.o) - iWidth;
                                float f3 = (getBounds().top - this.b.o) - iHeight2;
                                canvas2.translate(-f2, -f3);
                                d(canvas2);
                                canvas.drawBitmap(bitmapCreateBitmap, f2, f3, (Paint) null);
                                bitmapCreateBitmap.recycle();
                                canvas.restore();
                            }
                        }
                    }
                } else if (!path.isConvex()) {
                    canvas.save();
                    canvas.translate((int) (Math.sin(Math.toRadians(0.0d)) * ((double) this.b.p)), (int) (Math.cos(Math.toRadians(0.0d)) * ((double) this.b.p)));
                    if (!this.k0) {
                        RectF rectF3 = this.j0;
                        iWidth = (int) (rectF3.width() - getBounds().width());
                        int iHeight3 = (int) (rectF3.height() - getBounds().height());
                        if (iWidth >= 0) {
                        }
                        uq1.q("Invalid shadow bounds. Check that the treatments result in a valid path.");
                        return;
                    }
                    d(canvas);
                    canvas.restore();
                }
            }
            e(canvas, paint, path, this.b.a, this.p0, g());
        } else {
            paint = paint2;
        }
        if (j()) {
            if (this.i) {
                op1 op1Var = this.b.a;
                qf2 qf2VarG = op1Var.g();
                ss ssVar = op1Var.e;
                gk1 gk1Var = this.a;
                qf2VarG.e = gk1Var.l(ssVar);
                qf2VarG.f = gk1Var.l(op1Var.f);
                qf2VarG.h = gk1Var.l(op1Var.h);
                qf2VarG.g = gk1Var.l(op1Var.g);
                this.m0 = qf2VarG.c();
                float[] fArr2 = this.p0;
                if (fArr2 != null) {
                    if (this.q0 == null) {
                        this.q0 = new float[fArr2.length];
                    }
                    float fI = i();
                    int i4 = 0;
                    while (true) {
                        float[] fArr3 = this.p0;
                        if (i4 >= fArr3.length) {
                            break;
                        }
                        this.q0[i4] = Math.max(0.0f, fArr3[i4] - fI);
                        i4++;
                    }
                } else {
                    this.q0 = null;
                }
                op1 op1Var2 = this.m0;
                float[] fArr4 = this.q0;
                float f4 = this.b.j;
                RectF rectFG = g();
                RectF rectF4 = this.Y;
                rectF4.set(rectFG);
                float fI2 = i();
                rectF4.inset(fI2, fI2);
                this.f0.a(op1Var2, fArr4, f4, rectF4, null, this.W);
                this.i = false;
            }
            f(canvas);
        }
        paint.setAlpha(alpha);
        paint3.setAlpha(alpha2);
    }

    public final void e(Canvas canvas, Paint paint, Path path, op1 op1Var, float[] fArr, RectF rectF) {
        float fB = b(rectF, op1Var, fArr);
        if (fB < 0.0f) {
            canvas.drawPath(path, paint);
        } else {
            float f = fB * this.b.j;
            canvas.drawRoundRect(rectF, f, f, paint);
        }
    }

    public void f(Canvas canvas) {
        op1 op1Var = this.m0;
        float[] fArr = this.q0;
        RectF rectFG = g();
        RectF rectF = this.Y;
        rectF.set(rectFG);
        float fI = i();
        rectF.inset(fI, fI);
        e(canvas, this.c0, this.W, op1Var, fArr, rectF);
    }

    public final RectF g() {
        Rect bounds = getBounds();
        RectF rectF = this.X;
        rectF.set(bounds);
        return rectF;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.b.l;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.b;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        this.b.getClass();
        RectF rectFG = g();
        if (rectFG.isEmpty()) {
            return;
        }
        float fB = b(rectFG, this.b.a, this.p0);
        if (fB >= 0.0f) {
            outline.setRoundRect(getBounds(), fB * this.b.j);
            return;
        }
        boolean z = this.f;
        Path path = this.w;
        if (z) {
            a(rectFG, path);
            this.f = false;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            h30.a(outline, path);
            return;
        }
        if (i >= 29) {
            try {
                g30.a(outline, path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            g30.a(outline, path);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.b.h;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.Z;
        region.set(bounds);
        RectF rectFG = g();
        Path path = this.w;
        a(rectFG, path);
        Region region2 = this.a0;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public final float h() {
        float[] fArr = this.p0;
        if (fArr != null) {
            return (((fArr[3] + fArr[2]) - fArr[1]) - fArr[0]) / 2.0f;
        }
        RectF rectFG = g();
        op1 op1Var = this.b.a;
        qp1 qp1Var = this.f0;
        qp1Var.getClass();
        float fA = op1Var.e.a(rectFG);
        op1 op1Var2 = this.b.a;
        qp1Var.getClass();
        float fA2 = op1Var2.h.a(rectFG) + fA;
        op1 op1Var3 = this.b.a;
        qp1Var.getClass();
        float fA3 = fA2 - op1Var3.g.a(rectFG);
        op1 op1Var4 = this.b.a;
        qp1Var.getClass();
        return (fA3 - op1Var4.f.a(rectFG)) / 2.0f;
    }

    public final float i() {
        if (j()) {
            return this.c0.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.f = true;
        this.i = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.b.f;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        this.b.getClass();
        ColorStateList colorStateList2 = this.b.e;
        if (colorStateList2 != null && colorStateList2.isStateful()) {
            return true;
        }
        ColorStateList colorStateList3 = this.b.d;
        if (colorStateList3 != null && colorStateList3.isStateful()) {
            return true;
        }
        qt1 qt1Var = this.b.b;
        return qt1Var != null && qt1Var.d();
    }

    public final boolean j() {
        Paint.Style style = this.b.q;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.c0.getStrokeWidth() > 0.0f;
    }

    public final void k(Context context) {
        this.b.c = new z40(context);
        s();
    }

    public final void l(ss1 ss1Var) {
        if (this.n0 == ss1Var) {
            return;
        }
        this.n0 = ss1Var;
        int i = 0;
        while (true) {
            rs1[] rs1VarArr = this.o0;
            if (i >= rs1VarArr.length) {
                q(getState(), true);
                invalidateSelf();
                return;
            }
            if (rs1VarArr[i] == null) {
                rs1VarArr[i] = new rs1(this, t0[i]);
            }
            rs1 rs1Var = rs1VarArr[i];
            ss1 ss1Var2 = new ss1();
            float f = (float) ss1Var.b;
            if (f < 0.0f) {
                e.g("Damping ratio must be non-negative");
                return;
            }
            ss1Var2.b = f;
            ss1Var2.c = false;
            double d = ss1Var.a;
            float f2 = (float) (d * d);
            if (f2 <= 0.0f) {
                e.g("Spring stiffness constant must be positive.");
                return;
            }
            ss1Var2.a = Math.sqrt(f2);
            ss1Var2.c = false;
            rs1Var.j = ss1Var2;
            i++;
        }
    }

    public final void m(float f) {
        p21 p21Var = this.b;
        if (p21Var.n != f) {
            p21Var.n = f;
            s();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.b = new p21(this.b);
        return this;
    }

    public final void n(ColorStateList colorStateList) {
        p21 p21Var = this.b;
        if (p21Var.d != colorStateList) {
            p21Var.d = colorStateList;
            onStateChange(getState());
        }
    }

    public final void o(qt1 qt1Var) {
        p21 p21Var = this.b;
        if (p21Var.b != qt1Var) {
            p21Var.b = qt1Var;
            q(getState(), true);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f = true;
        this.i = true;
        super.onBoundsChange(rect);
        if (this.b.b != null && !rect.isEmpty()) {
            q(getState(), this.l0);
        }
        this.l0 = rect.isEmpty();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        if (this.b.b != null) {
            q(iArr, false);
        }
        boolean z = p(iArr) || r();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    public final boolean p(int[] iArr) {
        boolean z;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.b.d == null || color2 == (colorForState2 = this.b.d.getColorForState(iArr, (color2 = (paint2 = this.b0).getColor())))) {
            z = false;
        } else {
            paint2.setColor(colorForState2);
            z = true;
        }
        if (this.b.e == null || color == (colorForState = this.b.e.getColorForState(iArr, (color = (paint = this.c0).getColor())))) {
            return z;
        }
        paint.setColor(colorForState);
        return true;
    }

    public final void q(int[] iArr, boolean z) {
        op1 op1VarC;
        ss ssVar;
        int i;
        RectF rectFG = g();
        if (this.b.b == null || rectFG.isEmpty()) {
            return;
        }
        boolean z2 = z | (this.n0 == null);
        if (this.p0 == null) {
            this.p0 = new float[4];
        }
        qt1 qt1Var = this.b.b;
        op1[] op1VarArr = qt1Var.d;
        int i2 = qt1Var.a;
        int[][] iArr2 = qt1Var.c;
        ot1 ot1Var = qt1Var.h;
        ot1 ot1Var2 = qt1Var.g;
        ot1 ot1Var3 = qt1Var.f;
        ot1 ot1Var4 = qt1Var.e;
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                i3 = -1;
                break;
            } else if (StateSet.stateSetMatches(iArr2[i3], iArr)) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 < 0) {
            int[] iArr3 = StateSet.WILD_CARD;
            int i4 = 0;
            while (true) {
                if (i4 >= i2) {
                    i = -1;
                    break;
                } else {
                    if (StateSet.stateSetMatches(iArr2[i4], iArr3)) {
                        i = i4;
                        break;
                    }
                    i4++;
                }
            }
            i3 = i;
        }
        if (ot1Var4 == null && ot1Var3 == null && ot1Var2 == null && ot1Var == null) {
            op1VarC = op1VarArr[i3];
        } else {
            qf2 qf2VarG = op1VarArr[i3].g();
            if (ot1Var4 != null) {
                qf2VarG.e = ot1Var4.c(iArr);
            }
            if (ot1Var3 != null) {
                qf2VarG.f = ot1Var3.c(iArr);
            }
            if (ot1Var2 != null) {
                qf2VarG.h = ot1Var2.c(iArr);
            }
            if (ot1Var != null) {
                qf2VarG.g = ot1Var.c(iArr);
            }
            op1VarC = qf2VarG.c();
        }
        int i5 = 0;
        while (i5 < 4) {
            this.f0.getClass();
            if (i5 == 1) {
                ssVar = op1VarC.g;
            } else if (i5 != 2) {
                ssVar = i5 != 3 ? op1VarC.f : op1VarC.e;
            } else {
                ssVar = op1VarC.h;
            }
            float fA = ssVar.a(rectFG);
            if (z2) {
                this.p0[i5] = fA;
            }
            rs1[] rs1VarArr = this.o0;
            rs1 rs1Var = rs1VarArr[i5];
            if (rs1Var != null) {
                rs1Var.a(fA);
                if (z2) {
                    rs1VarArr[i5].d();
                }
            }
            i5++;
        }
        if (z2) {
            invalidateSelf();
        }
    }

    public final boolean r() {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = this.g0;
        PorterDuffColorFilter porterDuffColorFilter3 = this.h0;
        p21 p21Var = this.b;
        ColorStateList colorStateList = p21Var.f;
        PorterDuff.Mode mode = p21Var.g;
        if (colorStateList == null || mode == null) {
            int color = this.b0.getColor();
            int iC = c(color);
            this.i0 = iC;
            porterDuffColorFilter = iC != color ? new PorterDuffColorFilter(iC, PorterDuff.Mode.SRC_IN) : null;
        } else {
            int iC2 = c(colorStateList.getColorForState(getState(), 0));
            this.i0 = iC2;
            porterDuffColorFilter = new PorterDuffColorFilter(iC2, mode);
        }
        this.g0 = porterDuffColorFilter;
        this.b.getClass();
        this.h0 = null;
        this.b.getClass();
        return (Objects.equals(porterDuffColorFilter2, this.g0) && Objects.equals(porterDuffColorFilter3, this.h0)) ? false : true;
    }

    public final void s() {
        p21 p21Var = this.b;
        float f = p21Var.n + 0.0f;
        p21Var.o = (int) Math.ceil(0.75f * f);
        this.b.p = (int) Math.ceil(f * 0.25f);
        r();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        p21 p21Var = this.b;
        if (p21Var.l != i) {
            p21Var.l = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.b.getClass();
        super.invalidateSelf();
    }

    @Override // defpackage.zp1
    public final void setShapeAppearanceModel(op1 op1Var) {
        p21 p21Var = this.b;
        p21Var.a = op1Var;
        p21Var.b = null;
        this.p0 = null;
        this.q0 = null;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.b.f = colorStateList;
        r();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        p21 p21Var = this.b;
        if (p21Var.g != mode) {
            p21Var.g = mode;
            r();
            super.invalidateSelf();
        }
    }

    public r21(Context context, AttributeSet attributeSet, int i, int i2) {
        this(op1.c(context, attributeSet, i, i2).c());
    }

    public r21(op1 op1Var) {
        this(new p21(op1Var));
    }

    public r21() {
        this(new op1());
    }
}
