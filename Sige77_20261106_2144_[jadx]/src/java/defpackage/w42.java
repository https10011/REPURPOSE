package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import java.io.IOException;
import java.util.ArrayDeque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class w42 extends n42 {
    public static final PorterDuff.Mode W = PorterDuff.Mode.SRC_IN;
    public u42 b;
    public PorterDuffColorFilter c;
    public ColorFilter d;
    public boolean e;
    public boolean f;
    public final float[] i;
    public final Matrix v;
    public final Rect w;

    public w42() {
        this.f = true;
        this.i = new float[9];
        this.v = new Matrix();
        this.w = new Rect();
        u42 u42Var = new u42();
        u42Var.c = null;
        u42Var.d = W;
        u42Var.b = new t42();
        this.b = u42Var;
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.a;
        if (drawable == null) {
            return false;
        }
        drawable.canApplyTheme();
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.w;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.d;
        if (colorFilter == null) {
            colorFilter = this.c;
        }
        Matrix matrix = this.v;
        canvas.getMatrix(matrix);
        float[] fArr = this.i;
        matrix.getValues(fArr);
        float fAbs = Math.abs(fArr[0]);
        float fAbs2 = Math.abs(fArr[4]);
        float fAbs3 = Math.abs(fArr[1]);
        float fAbs4 = Math.abs(fArr[3]);
        if (fAbs3 != 0.0f || fAbs4 != 0.0f) {
            fAbs = 1.0f;
            fAbs2 = 1.0f;
        }
        int iWidth = (int) (rect.width() * fAbs);
        int iHeight = (int) (rect.height() * fAbs2);
        int iMin = Math.min(2048, iWidth);
        int iMin2 = Math.min(2048, iHeight);
        if (iMin <= 0 || iMin2 <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(rect.left, rect.top);
        if (isAutoMirrored() && getLayoutDirection() == 1) {
            canvas.translate(rect.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        rect.offsetTo(0, 0);
        u42 u42Var = this.b;
        Bitmap bitmap = u42Var.f;
        if (bitmap == null || iMin != bitmap.getWidth() || iMin2 != u42Var.f.getHeight()) {
            u42Var.f = Bitmap.createBitmap(iMin, iMin2, Bitmap.Config.ARGB_8888);
            u42Var.k = true;
        }
        boolean z = this.f;
        u42 u42Var2 = this.b;
        if (!z) {
            u42Var2.f.eraseColor(0);
            Canvas canvas2 = new Canvas(u42Var2.f);
            t42 t42Var = u42Var2.b;
            t42Var.a(t42Var.g, t42.p, canvas2, iMin, iMin2);
        } else if (u42Var2.k || u42Var2.g != u42Var2.c || u42Var2.h != u42Var2.d || u42Var2.j != u42Var2.e || u42Var2.i != u42Var2.b.getRootAlpha()) {
            u42 u42Var3 = this.b;
            u42Var3.f.eraseColor(0);
            Canvas canvas3 = new Canvas(u42Var3.f);
            t42 t42Var2 = u42Var3.b;
            t42Var2.a(t42Var2.g, t42.p, canvas3, iMin, iMin2);
            u42 u42Var4 = this.b;
            u42Var4.g = u42Var4.c;
            u42Var4.h = u42Var4.d;
            u42Var4.i = u42Var4.b.getRootAlpha();
            u42Var4.j = u42Var4.e;
            u42Var4.k = false;
        }
        u42 u42Var5 = this.b;
        if (u42Var5.b.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (u42Var5.l == null) {
                Paint paint2 = new Paint();
                u42Var5.l = paint2;
                paint2.setFilterBitmap(true);
            }
            u42Var5.l.setAlpha(u42Var5.b.getRootAlpha());
            u42Var5.l.setColorFilter(colorFilter);
            paint = u42Var5.l;
        }
        canvas.drawBitmap(u42Var5.f, (Rect) null, rect, paint);
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.a;
        return drawable != null ? drawable.getAlpha() : this.b.b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return this.b.getChangingConfigurations() | super.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.a;
        return drawable != null ? drawable.getColorFilter() : this.d;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.a != null) {
            return new v42(this.a.getConstantState());
        }
        this.b.a = getChangingConfigurations();
        return this.b;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.a;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.b.b.i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.a;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.b.b.h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int i;
        char c;
        int i2;
        Paint.Cap cap;
        Paint.Join join;
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        u42 u42Var = this.b;
        u42Var.b = new t42();
        TypedArray typedArrayT = ye1.t(resources, theme, attributeSet, d42.d);
        u42 u42Var2 = this.b;
        t42 t42Var = u42Var2.b;
        int i3 = !ye1.l(xmlPullParser, "tintMode") ? -1 : typedArrayT.getInt(6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        if (i3 == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (i3 != 5) {
            if (i3 != 9) {
                switch (i3) {
                    case 14:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case 15:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case 16:
                        mode = PorterDuff.Mode.ADD;
                        break;
                }
            } else {
                mode = PorterDuff.Mode.SRC_ATOP;
            }
        }
        u42Var2.d = mode;
        ColorStateList colorStateListA = null;
        int i4 = 1;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "tint") != null) {
            TypedValue typedValue = new TypedValue();
            typedArrayT.getValue(1, typedValue);
            int i5 = typedValue.type;
            if (i5 == 2) {
                throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
            }
            if (i5 < 28 || i5 > 31) {
                Resources resources2 = typedArrayT.getResources();
                int resourceId = typedArrayT.getResourceId(1, 0);
                ThreadLocal threadLocal = ro.a;
                try {
                    colorStateListA = ro.a(resources2, resources2.getXml(resourceId), theme);
                } catch (Exception e) {
                    Log.e("CSLCompat", "Failed to inflate ColorStateList.", e);
                }
            } else {
                colorStateListA = ColorStateList.valueOf(typedValue.data);
            }
        }
        ColorStateList colorStateList = colorStateListA;
        if (colorStateList != null) {
            u42Var2.c = colorStateList;
        }
        boolean z = u42Var2.e;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "autoMirrored") != null) {
            z = typedArrayT.getBoolean(5, z);
        }
        u42Var2.e = z;
        float f = t42Var.j;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportWidth") != null) {
            f = typedArrayT.getFloat(7, f);
        }
        t42Var.j = f;
        float f2 = t42Var.k;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportHeight") != null) {
            f2 = typedArrayT.getFloat(8, f2);
        }
        t42Var.k = f2;
        if (t42Var.j <= 0.0f) {
            throw new XmlPullParserException(typedArrayT.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f2 <= 0.0f) {
            throw new XmlPullParserException(typedArrayT.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        t42Var.h = typedArrayT.getDimension(3, t42Var.h);
        float dimension = typedArrayT.getDimension(2, t42Var.i);
        t42Var.i = dimension;
        if (t42Var.h <= 0.0f) {
            throw new XmlPullParserException(typedArrayT.getPositionDescription() + "<vector> tag requires width > 0");
        }
        if (dimension <= 0.0f) {
            throw new XmlPullParserException(typedArrayT.getPositionDescription() + "<vector> tag requires height > 0");
        }
        float alpha = t42Var.getAlpha();
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "alpha") != null) {
            alpha = typedArrayT.getFloat(4, alpha);
        }
        t42Var.setAlpha(alpha);
        String string = typedArrayT.getString(0);
        if (string != null) {
            t42Var.m = string;
            t42Var.o.put(string, t42Var);
        }
        typedArrayT.recycle();
        u42Var.a = getChangingConfigurations();
        u42Var.k = true;
        u42 u42Var3 = this.b;
        t42 t42Var2 = u42Var3.b;
        ArrayDeque arrayDeque = new ArrayDeque();
        q42 q42Var = t42Var2.g;
        mb mbVar = t42Var2.o;
        arrayDeque.push(q42Var);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z2 = true;
        while (eventType != i4 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                q42 q42Var2 = (q42) arrayDeque.peek();
                i = depth;
                if ("path".equals(name)) {
                    p42 p42Var = new p42();
                    p42Var.e = 0.0f;
                    p42Var.g = 1.0f;
                    p42Var.h = 1.0f;
                    p42Var.i = 0.0f;
                    p42Var.j = 1.0f;
                    p42Var.k = 0.0f;
                    Paint.Cap cap2 = Paint.Cap.BUTT;
                    p42Var.l = cap2;
                    Paint.Join join2 = Paint.Join.MITER;
                    p42Var.m = join2;
                    p42Var.n = 4.0f;
                    TypedArray typedArrayT2 = ye1.t(resources, theme, attributeSet, d42.f);
                    if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                        String string2 = typedArrayT2.getString(0);
                        if (string2 != null) {
                            p42Var.b = string2;
                        }
                        String string3 = typedArrayT2.getString(2);
                        if (string3 != null) {
                            p42Var.a = x91.n(string3);
                        }
                        p42Var.f = ye1.j(typedArrayT2, xmlPullParser, theme, "fillColor", 1);
                        float f3 = p42Var.h;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillAlpha") != null) {
                            f3 = typedArrayT2.getFloat(12, f3);
                        }
                        p42Var.h = f3;
                        int i6 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineCap") != null ? typedArrayT2.getInt(8, -1) : -1;
                        Paint.Cap cap3 = p42Var.l;
                        if (i6 == 0) {
                            cap = cap2;
                        } else if (i6 != 1) {
                            cap = i6 != 2 ? cap3 : Paint.Cap.SQUARE;
                        } else {
                            cap = Paint.Cap.ROUND;
                        }
                        p42Var.l = cap;
                        int i7 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineJoin") != null ? typedArrayT2.getInt(9, -1) : -1;
                        Paint.Join join3 = p42Var.m;
                        if (i7 == 0) {
                            join = join2;
                        } else if (i7 != 1) {
                            join = i7 != 2 ? join3 : Paint.Join.BEVEL;
                        } else {
                            join = Paint.Join.ROUND;
                        }
                        p42Var.m = join;
                        float f4 = p42Var.n;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeMiterLimit") != null) {
                            f4 = typedArrayT2.getFloat(10, f4);
                        }
                        p42Var.n = f4;
                        p42Var.d = ye1.j(typedArrayT2, xmlPullParser, theme, "strokeColor", 3);
                        float f5 = p42Var.g;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeAlpha") != null) {
                            f5 = typedArrayT2.getFloat(11, f5);
                        }
                        p42Var.g = f5;
                        float f6 = p42Var.e;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeWidth") != null) {
                            f6 = typedArrayT2.getFloat(4, f6);
                        }
                        p42Var.e = f6;
                        float f7 = p42Var.j;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathEnd") != null) {
                            f7 = typedArrayT2.getFloat(6, f7);
                        }
                        p42Var.j = f7;
                        float f8 = p42Var.k;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathOffset") != null) {
                            f8 = typedArrayT2.getFloat(7, f8);
                        }
                        p42Var.k = f8;
                        float f9 = p42Var.i;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathStart") != null) {
                            f9 = typedArrayT2.getFloat(5, f9);
                        }
                        p42Var.i = f9;
                        int i8 = p42Var.c;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillType") != null) {
                            i8 = typedArrayT2.getInt(13, i8);
                        }
                        p42Var.c = i8;
                    }
                    typedArrayT2.recycle();
                    q42Var2.b.add(p42Var);
                    if (p42Var.getPathName() != null) {
                        mbVar.put(p42Var.getPathName(), p42Var);
                    }
                    u42Var3.a = u42Var3.a;
                    z2 = false;
                    c = '\b';
                } else {
                    c = '\b';
                    if ("clip-path".equals(name)) {
                        o42 o42Var = new o42();
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                            TypedArray typedArrayT3 = ye1.t(resources, theme, attributeSet, d42.g);
                            String string4 = typedArrayT3.getString(0);
                            if (string4 != null) {
                                o42Var.b = string4;
                            }
                            String string5 = typedArrayT3.getString(1);
                            if (string5 != null) {
                                o42Var.a = x91.n(string5);
                            }
                            o42Var.c = !ye1.l(xmlPullParser, "fillType") ? 0 : typedArrayT3.getInt(2, 0);
                            typedArrayT3.recycle();
                        }
                        q42Var2.b.add(o42Var);
                        if (o42Var.getPathName() != null) {
                            mbVar.put(o42Var.getPathName(), o42Var);
                        }
                        u42Var3.a = u42Var3.a;
                    } else if ("group".equals(name)) {
                        q42 q42Var3 = new q42();
                        TypedArray typedArrayT4 = ye1.t(resources, theme, attributeSet, d42.e);
                        float f10 = q42Var3.c;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "rotation") != null) {
                            f10 = typedArrayT4.getFloat(5, f10);
                        }
                        q42Var3.c = f10;
                        q42Var3.d = typedArrayT4.getFloat(1, q42Var3.d);
                        q42Var3.e = typedArrayT4.getFloat(2, q42Var3.e);
                        float f11 = q42Var3.f;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleX") != null) {
                            f11 = typedArrayT4.getFloat(3, f11);
                        }
                        q42Var3.f = f11;
                        float f12 = q42Var3.g;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleY") != null) {
                            f12 = typedArrayT4.getFloat(4, f12);
                        }
                        q42Var3.g = f12;
                        float f13 = q42Var3.h;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateX") != null) {
                            f13 = typedArrayT4.getFloat(6, f13);
                        }
                        q42Var3.h = f13;
                        float f14 = q42Var3.i;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateY") != null) {
                            f14 = typedArrayT4.getFloat(7, f14);
                        }
                        q42Var3.i = f14;
                        String string6 = typedArrayT4.getString(0);
                        if (string6 != null) {
                            q42Var3.k = string6;
                        }
                        q42Var3.c();
                        typedArrayT4.recycle();
                        q42Var2.b.add(q42Var3);
                        arrayDeque.push(q42Var3);
                        if (q42Var3.getGroupName() != null) {
                            mbVar.put(q42Var3.getGroupName(), q42Var3);
                        }
                        u42Var3.a = u42Var3.a;
                    }
                }
                i2 = 1;
            } else {
                i = depth;
                c = '\b';
                i2 = 1;
                if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                    arrayDeque.pop();
                }
            }
            eventType = xmlPullParser.next();
            i4 = i2;
            depth = i;
        }
        if (z2) {
            throw new XmlPullParserException("no path defined");
        }
        this.c = a(u42Var.c, u42Var.d);
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.a;
        return drawable != null ? drawable.isAutoMirrored() : this.b.e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        u42 u42Var = this.b;
        if (u42Var == null) {
            return false;
        }
        t42 t42Var = u42Var.b;
        if (t42Var.n == null) {
            t42Var.n = Boolean.valueOf(t42Var.g.a());
        }
        if (t42Var.n.booleanValue()) {
            return true;
        }
        ColorStateList colorStateList = this.b.c;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.e && super.mutate() == this) {
            u42 u42Var = this.b;
            u42 u42Var2 = new u42();
            u42Var2.c = null;
            u42Var2.d = W;
            if (u42Var != null) {
                u42Var2.a = u42Var.a;
                t42 t42Var = new t42(u42Var.b);
                u42Var2.b = t42Var;
                if (u42Var.b.e != null) {
                    t42Var.e = new Paint(u42Var.b.e);
                }
                if (u42Var.b.d != null) {
                    u42Var2.b.d = new Paint(u42Var.b.d);
                }
                u42Var2.c = u42Var.c;
                u42Var2.d = u42Var.d;
                u42Var2.e = u42Var.e;
            }
            this.b = u42Var2;
            this.e = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z;
        PorterDuff.Mode mode;
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        u42 u42Var = this.b;
        ColorStateList colorStateList = u42Var.c;
        if (colorStateList == null || (mode = u42Var.d) == null) {
            z = false;
        } else {
            this.c = a(colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        t42 t42Var = u42Var.b;
        if (t42Var.n == null) {
            t42Var.n = Boolean.valueOf(t42Var.g.a());
        }
        if (t42Var.n.booleanValue()) {
            boolean zB = u42Var.b.g.b(iArr);
            u42Var.k |= zB;
            if (zB) {
                invalidateSelf();
                return true;
            }
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.b.b.getRootAlpha() != i) {
            this.b.b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
        } else {
            this.b.e = z;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.d = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setTint(i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
            return;
        }
        u42 u42Var = this.b;
        if (u42Var.c != colorStateList) {
            u42Var.c = colorStateList;
            this.c = a(colorStateList, u42Var.d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setTintMode(mode);
            return;
        }
        u42 u42Var = this.b;
        if (u42Var.d != mode) {
            u42Var.d = mode;
            this.c = a(u42Var.c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.a;
        return drawable != null ? drawable.setVisible(z, z2) : super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    public w42(u42 u42Var) {
        this.f = true;
        this.i = new float[9];
        this.v = new Matrix();
        this.w = new Rect();
        this.b = u42Var;
        this.c = a(u42Var.c, u42Var.d);
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }
}
