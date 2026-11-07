package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Xml;
import android.widget.ImageView;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class q8 implements sk0 {
    public int a;
    public Object b;
    public Object c;

    public q8() {
        this.b = Collections.synchronizedMap(new mb(0));
        this.a = 0;
    }

    public static int a(File file) throws Throwable {
        String strB = ga.b(file);
        int i = 0;
        int i2 = 0;
        while (true) {
            int iIndexOf = strB.indexOf(";", i);
            if (iIndexOf == -1) {
                return i2;
            }
            i2++;
            i = iIndexOf + 1;
        }
    }

    public static q8 d(Resources resources, int i, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        float f;
        float f2;
        Shader.TileMode tileMode;
        Shader radialGradient;
        Shader.TileMode tileMode2;
        XmlResourceParser xml = resources.getXml(i);
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        name.getClass();
        if (!name.equals("gradient")) {
            if (name.equals("selector")) {
                ColorStateList colorStateListB = ro.b(resources, xml, attributeSetAsAttributeSet, theme);
                return new q8(null, colorStateListB, colorStateListB.getDefaultColor());
            }
            throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
        }
        String name2 = xml.getName();
        if (!name2.equals("gradient")) {
            throw new XmlPullParserException(xml.getPositionDescription() + ": invalid gradient color tag " + name2);
        }
        TypedArray typedArrayT = ye1.t(resources, theme, attributeSetAsAttributeSet, re1.e);
        float f3 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startX") != null ? typedArrayT.getFloat(8, 0.0f) : 0.0f;
        float f4 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startY") != null ? typedArrayT.getFloat(9, 0.0f) : 0.0f;
        float f5 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endX") != null ? typedArrayT.getFloat(10, 0.0f) : 0.0f;
        float f6 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endY") != null ? typedArrayT.getFloat(11, 0.0f) : 0.0f;
        float f7 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerX") != null ? typedArrayT.getFloat(3, 0.0f) : 0.0f;
        float f8 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerY") != null ? typedArrayT.getFloat(4, 0.0f) : 0.0f;
        int i2 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "type") != null ? typedArrayT.getInt(2, 0) : 0;
        int color = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startColor") != null ? typedArrayT.getColor(0, 0) : 0;
        boolean z = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null;
        int color2 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null ? typedArrayT.getColor(7, 0) : 0;
        int color3 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endColor") != null ? typedArrayT.getColor(1, 0) : 0;
        int i3 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "tileMode") != null ? typedArrayT.getInt(6, 0) : 0;
        float f9 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "gradientRadius") != null ? typedArrayT.getFloat(5, 0.0f) : 0.0f;
        typedArrayT.recycle();
        int depth = xml.getDepth() + 1;
        ArrayList arrayList = new ArrayList(20);
        float f10 = f9;
        ArrayList arrayList2 = new ArrayList(20);
        while (true) {
            int next2 = xml.next();
            f = f5;
            if (next2 == 1) {
                f2 = f6;
                break;
            }
            int depth2 = xml.getDepth();
            f2 = f6;
            if (depth2 < depth && next2 == 3) {
                break;
            }
            if (next2 == 2 && depth2 <= depth && xml.getName().equals("item")) {
                TypedArray typedArrayT2 = ye1.t(resources, theme, attributeSetAsAttributeSet, re1.f);
                boolean zHasValue = typedArrayT2.hasValue(0);
                boolean zHasValue2 = typedArrayT2.hasValue(1);
                if (!zHasValue || !zHasValue2) {
                    throw new XmlPullParserException(xml.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
                }
                int color4 = typedArrayT2.getColor(0, 0);
                float f11 = typedArrayT2.getFloat(1, 0.0f);
                typedArrayT2.recycle();
                arrayList2.add(Integer.valueOf(color4));
                arrayList.add(Float.valueOf(f11));
            }
            f5 = f;
            f6 = f2;
        }
        yd2 yd2Var = arrayList2.size() > 0 ? new yd2(arrayList2, arrayList) : null;
        if (yd2Var == null) {
            yd2Var = z ? new yd2(color, color2, color3) : new yd2(color, color3);
        }
        if (i2 != 1) {
            if (i2 != 2) {
                int[] iArr = (int[]) yd2Var.b;
                float[] fArr = (float[]) yd2Var.c;
                if (i3 != 1) {
                    tileMode2 = i3 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR;
                } else {
                    tileMode2 = Shader.TileMode.REPEAT;
                }
                radialGradient = new LinearGradient(f3, f4, f, f2, iArr, fArr, tileMode2);
            } else {
                radialGradient = new SweepGradient(f7, f8, (int[]) yd2Var.b, (float[]) yd2Var.c);
            }
        } else {
            if (f10 <= 0.0f) {
                throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
            }
            int[] iArr2 = (int[]) yd2Var.b;
            float[] fArr2 = (float[]) yd2Var.c;
            if (i3 != 1) {
                tileMode = i3 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR;
            } else {
                tileMode = Shader.TileMode.REPEAT;
            }
            radialGradient = new RadialGradient(f7, f8, f10, iArr2, fArr2, tileMode);
        }
        return new q8(radialGradient, null, 0);
    }

    public void b() {
        cy1 cy1Var;
        ImageView imageView = (ImageView) this.b;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            i30.a(drawable);
        }
        if (drawable == null || (cy1Var = (cy1) this.c) == null) {
            return;
        }
        m8.e(drawable, cy1Var, imageView.getDrawableState());
    }

    public lh1 c(boolean z) {
        so0 so0Var;
        so0 so0Var2;
        if (z && (so0Var2 = (so0) this.c) != null) {
            throw so0Var2.a();
        }
        lh1 lh1VarB = lh1.b(this.a, (Object[]) this.b, this);
        if (!z || (so0Var = (so0) this.c) == null) {
            return lh1VarB;
        }
        throw so0Var.a();
    }

    public boolean e() {
        ColorStateList colorStateList;
        return ((Shader) this.b) == null && (colorStateList = (ColorStateList) this.c) != null && colorStateList.isStateful();
    }

    @Override // defpackage.sk0
    public void f(HashMap map) {
        ff2.A((String) this.b, this.a, (pd2) this.c, map.toString());
    }

    public void g(AttributeSet attributeSet, int i) {
        int resourceId;
        ImageView imageView = (ImageView) this.b;
        Context context = imageView.getContext();
        int[] iArr = we1.f;
        p11 p11VarK = p11.k(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) p11VarK.c;
        x52.m(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) p11VarK.c, i);
        try {
            Drawable drawable = imageView.getDrawable();
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = gu2.u(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                i30.a(drawable);
            }
            if (typedArray.hasValue(2)) {
                imageView.setImageTintList(p11VarK.e(2));
            }
            if (typedArray.hasValue(3)) {
                imageView.setImageTintMode(i30.b(typedArray.getInt(3, -1), null));
            }
        } finally {
            p11VarK.m();
        }
    }

    public void h(Object obj, Object obj2) {
        int i = (this.a + 1) * 2;
        Object[] objArr = (Object[]) this.b;
        if (i > objArr.length) {
            this.b = Arrays.copyOf(objArr, vn0.c(objArr.length, i));
        }
        if (obj == null) {
            String strValueOf = String.valueOf(obj2);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 24);
            sb.append("null key in entry: null=");
            sb.append(strValueOf);
            throw new NullPointerException(sb.toString());
        }
        if (obj2 == null) {
            String strValueOf2 = String.valueOf(obj);
            StringBuilder sb2 = new StringBuilder(strValueOf2.length() + 26);
            sb2.append("null value in entry: ");
            sb2.append(strValueOf2);
            sb2.append("=null");
            throw new NullPointerException(sb2.toString());
        }
        Object[] objArr2 = (Object[]) this.b;
        int i2 = this.a;
        int i3 = i2 * 2;
        objArr2[i3] = obj;
        objArr2[i3 + 1] = obj2;
        this.a = i2 + 1;
    }

    public void i(lh1 lh1Var) {
        wo0 wo0VarEntrySet = lh1Var.entrySet();
        int i = (((ih1) wo0VarEntrySet).f + this.a) * 2;
        Object[] objArr = (Object[]) this.b;
        if (i > objArr.length) {
            this.b = Arrays.copyOf(objArr, vn0.c(objArr.length, i));
        }
        bs0 it = ((ih1) wo0VarEntrySet).iterator();
        while (true) {
            no0 no0Var = (no0) it;
            if (!no0Var.hasNext()) {
                return;
            }
            Map.Entry entry = (Map.Entry) no0Var.next();
            h(entry.getKey(), entry.getValue());
        }
    }

    public void j(String str, pw0 pw0Var) {
        Map map = (Map) this.b;
        if (map.containsKey(str)) {
            e.g(y00.l(new StringBuilder(str.length() + 59), "LifecycleCallback with tag ", str, " already added to this fragment."));
            return;
        }
        map.put(str, pw0Var);
        if (this.a > 0) {
            new th2(Looper.getMainLooper(), 4).post(new gc((Object) this, (Object) pw0Var, str, 5));
        }
    }

    public void k(Bundle bundle) {
        this.a = 1;
        this.c = bundle;
        for (Map.Entry entry : ((Map) this.b).entrySet()) {
            ((pw0) entry.getValue()).onCreate(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    public void l(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : ((Map) this.b).entrySet()) {
            Bundle bundle2 = new Bundle();
            ((pw0) entry.getValue()).onSaveInstanceState(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    public q8(ImageView imageView) {
        this.a = 0;
        this.b = imageView;
    }

    public q8(Shader shader, ColorStateList colorStateList, int i) {
        this.b = shader;
        this.c = colorStateList;
        this.a = i;
    }

    public q8(int i) {
        this.b = new Object[i * 2];
        this.a = 0;
    }
}
