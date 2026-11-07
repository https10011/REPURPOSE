package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class op1 {
    public d42 a = new lk1();
    public d42 b = new lk1();
    public d42 c = new lk1();
    public d42 d = new lk1();
    public ss e = new y(0.0f);
    public ss f = new y(0.0f);
    public ss g = new y(0.0f);
    public ss h = new y(0.0f);
    public w40 i;
    public w40 j;
    public w40 k;
    public w40 l;

    public op1() {
        int i = 0;
        this.i = new w40(i);
        this.j = new w40(i);
        this.k = new w40(i);
        this.l = new w40(i);
    }

    public static qf2 a(int i, int i2, Context context) {
        return b(context, i, i2, new y(0.0f));
    }

    public static qf2 b(Context context, int i, int i2, y yVar) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
        if (i2 != 0) {
            contextThemeWrapper.getTheme().applyStyle(i2, true);
        }
        TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(ue1.A);
        try {
            int i3 = typedArrayObtainStyledAttributes.getInt(0, 0);
            int i4 = typedArrayObtainStyledAttributes.getInt(3, i3);
            int i5 = typedArrayObtainStyledAttributes.getInt(4, i3);
            int i6 = typedArrayObtainStyledAttributes.getInt(2, i3);
            int i7 = typedArrayObtainStyledAttributes.getInt(1, i3);
            ss ssVarD = d(typedArrayObtainStyledAttributes, 5, yVar);
            ss ssVarD2 = d(typedArrayObtainStyledAttributes, 8, ssVarD);
            ss ssVarD3 = d(typedArrayObtainStyledAttributes, 9, ssVarD);
            ss ssVarD4 = d(typedArrayObtainStyledAttributes, 7, ssVarD);
            ss ssVarD5 = d(typedArrayObtainStyledAttributes, 6, ssVarD);
            qf2 qf2Var = new qf2();
            qf2Var.a = yi0.g(i4);
            qf2Var.e = ssVarD2;
            qf2Var.b = yi0.g(i5);
            qf2Var.f = ssVarD3;
            qf2Var.c = yi0.g(i6);
            qf2Var.g = ssVarD4;
            qf2Var.d = yi0.g(i7);
            qf2Var.h = ssVarD5;
            return qf2Var;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static qf2 c(Context context, AttributeSet attributeSet, int i, int i2) {
        y yVar = new y(0.0f);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ue1.t, i, i2);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        return b(context, resourceId, resourceId2, yVar);
    }

    public static ss d(TypedArray typedArray, int i, ss ssVar) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i);
        if (typedValuePeekValue != null) {
            int i2 = typedValuePeekValue.type;
            if (i2 == 5) {
                return new y(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i2 == 6) {
                return new oh1(typedValuePeekValue.getFraction(1.0f, 1.0f));
            }
        }
        return ssVar;
    }

    public final boolean e() {
        return (this.b instanceof lk1) && (this.a instanceof lk1) && (this.c instanceof lk1) && (this.d instanceof lk1);
    }

    public final boolean f(RectF rectF) {
        boolean z = this.l.getClass().equals(w40.class) && this.j.getClass().equals(w40.class) && this.i.getClass().equals(w40.class) && this.k.getClass().equals(w40.class);
        float fA = this.e.a(rectF);
        return z && ((this.f.a(rectF) > fA ? 1 : (this.f.a(rectF) == fA ? 0 : -1)) == 0 && (this.h.a(rectF) > fA ? 1 : (this.h.a(rectF) == fA ? 0 : -1)) == 0 && (this.g.a(rectF) > fA ? 1 : (this.g.a(rectF) == fA ? 0 : -1)) == 0) && e();
    }

    public final qf2 g() {
        qf2 qf2Var = new qf2();
        qf2Var.a = this.a;
        qf2Var.b = this.b;
        qf2Var.c = this.c;
        qf2Var.d = this.d;
        qf2Var.e = this.e;
        qf2Var.f = this.f;
        qf2Var.g = this.g;
        qf2Var.h = this.h;
        qf2Var.i = this.i;
        qf2Var.j = this.j;
        qf2Var.k = this.k;
        qf2Var.l = this.l;
        return qf2Var;
    }

    public final String toString() {
        return "[" + this.e + ", " + this.f + ", " + this.g + ", " + this.h + "]";
    }
}
