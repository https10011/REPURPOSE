package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public class p21 extends Drawable.ConstantState {
    public op1 a;
    public qt1 b;
    public z40 c;
    public ColorStateList d;
    public ColorStateList e;
    public ColorStateList f;
    public PorterDuff.Mode g;
    public Rect h;
    public final float i;
    public float j;
    public float k;
    public int l;
    public float m;
    public float n;
    public int o;
    public int p;
    public final Paint.Style q;

    public p21(p21 p21Var) {
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = PorterDuff.Mode.SRC_IN;
        this.h = null;
        this.i = 1.0f;
        this.j = 1.0f;
        this.l = 255;
        this.m = 0.0f;
        this.n = 0.0f;
        this.o = 0;
        this.p = 0;
        this.q = Paint.Style.FILL_AND_STROKE;
        this.a = p21Var.a;
        this.b = p21Var.b;
        this.c = p21Var.c;
        this.k = p21Var.k;
        this.d = p21Var.d;
        this.e = p21Var.e;
        this.g = p21Var.g;
        this.f = p21Var.f;
        this.l = p21Var.l;
        this.i = p21Var.i;
        this.p = p21Var.p;
        this.j = p21Var.j;
        this.m = p21Var.m;
        this.n = p21Var.n;
        this.o = p21Var.o;
        this.q = p21Var.q;
        if (p21Var.h != null) {
            this.h = new Rect(p21Var.h);
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        r21 r21Var = new r21(this);
        r21Var.f = true;
        r21Var.i = true;
        return r21Var;
    }

    public p21(op1 op1Var) {
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = PorterDuff.Mode.SRC_IN;
        this.h = null;
        this.i = 1.0f;
        this.j = 1.0f;
        this.l = 255;
        this.m = 0.0f;
        this.n = 0.0f;
        this.o = 0;
        this.p = 0;
        this.q = Paint.Style.FILL_AND_STROKE;
        this.a = op1Var;
        this.c = null;
    }
}
