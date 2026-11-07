package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class g21 {
    public final MaterialButton a;
    public op1 b;
    public qt1 c;
    public ss1 d;
    public ab e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public PorterDuff.Mode l;
    public ColorStateList m;
    public ColorStateList n;
    public ColorStateList o;
    public r21 p;
    public boolean t;
    public RippleDrawable v;
    public int w;
    public boolean q = false;
    public boolean r = false;
    public boolean s = false;
    public boolean u = true;

    public g21(MaterialButton materialButton, op1 op1Var) {
        this.a = materialButton;
        this.b = op1Var;
    }

    public final r21 a(boolean z) {
        RippleDrawable rippleDrawable = this.v;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (r21) ((LayerDrawable) ((InsetDrawable) this.v.getDrawable(0)).getDrawable()).getDrawable(!z ? 1 : 0);
    }

    public final void b(int i, int i2) {
        MaterialButton materialButton = this.a;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = materialButton.getPaddingEnd();
        int paddingBottom = materialButton.getPaddingBottom();
        int i3 = this.h;
        int i4 = this.i;
        this.i = i2;
        this.h = i;
        if (!this.r) {
            c();
        }
        materialButton.setPaddingRelative(paddingStart, (paddingTop + i) - i3, paddingEnd, (paddingBottom + i2) - i4);
    }

    public final void c() {
        r21 r21Var = new r21(this.b);
        qt1 qt1Var = this.c;
        if (qt1Var != null) {
            r21Var.o(qt1Var);
        }
        ss1 ss1Var = this.d;
        if (ss1Var != null) {
            r21Var.l(ss1Var);
        }
        ab abVar = this.e;
        if (abVar != null) {
            r21Var.r0 = abVar;
        }
        MaterialButton materialButton = this.a;
        r21Var.k(materialButton.getContext());
        r21Var.setTintList(this.m);
        PorterDuff.Mode mode = this.l;
        if (mode != null) {
            r21Var.setTintMode(mode);
        }
        float f = this.k;
        ColorStateList colorStateList = this.n;
        r21Var.b.k = f;
        r21Var.invalidateSelf();
        p21 p21Var = r21Var.b;
        if (p21Var.e != colorStateList) {
            p21Var.e = colorStateList;
            r21Var.onStateChange(r21Var.getState());
        }
        r21 r21Var2 = new r21(this.b);
        qt1 qt1Var2 = this.c;
        if (qt1Var2 != null) {
            r21Var2.o(qt1Var2);
        }
        ss1 ss1Var2 = this.d;
        if (ss1Var2 != null) {
            r21Var2.l(ss1Var2);
        }
        r21Var2.setTint(0);
        float f2 = this.k;
        int iH = this.q ? qt.h(materialButton, 2130968879) : 0;
        r21Var2.b.k = f2;
        r21Var2.invalidateSelf();
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(iH);
        p21 p21Var2 = r21Var2.b;
        if (p21Var2.e != colorStateListValueOf) {
            p21Var2.e = colorStateListValueOf;
            r21Var2.onStateChange(r21Var2.getState());
        }
        r21 r21Var3 = new r21(this.b);
        this.p = r21Var3;
        qt1 qt1Var3 = this.c;
        if (qt1Var3 != null) {
            r21Var3.o(qt1Var3);
        }
        ss1 ss1Var3 = this.d;
        if (ss1Var3 != null) {
            this.p.l(ss1Var3);
        }
        this.p.setTint(-1);
        RippleDrawable rippleDrawable = new RippleDrawable(fk1.a(this.o), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{r21Var2, r21Var}), this.f, this.h, this.g, this.i), this.p);
        this.v = rippleDrawable;
        materialButton.setInternalBackground(rippleDrawable);
        r21 r21VarA = a(false);
        if (r21VarA != null) {
            r21VarA.m(this.w);
            r21VarA.setState(materialButton.getDrawableState());
        }
    }

    public final void d() {
        zp1 zp1Var;
        r21 r21VarA = a(false);
        if (r21VarA != null) {
            qt1 qt1Var = this.c;
            if (qt1Var != null) {
                r21VarA.o(qt1Var);
            } else {
                r21VarA.setShapeAppearanceModel(this.b);
            }
            ss1 ss1Var = this.d;
            if (ss1Var != null) {
                r21VarA.l(ss1Var);
            }
        }
        r21 r21VarA2 = a(true);
        if (r21VarA2 != null) {
            qt1 qt1Var2 = this.c;
            if (qt1Var2 != null) {
                r21VarA2.o(qt1Var2);
            } else {
                r21VarA2.setShapeAppearanceModel(this.b);
            }
            ss1 ss1Var2 = this.d;
            if (ss1Var2 != null) {
                r21VarA2.l(ss1Var2);
            }
        }
        RippleDrawable rippleDrawable = this.v;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 1) {
            zp1Var = null;
        } else {
            int numberOfLayers = this.v.getNumberOfLayers();
            RippleDrawable rippleDrawable2 = this.v;
            zp1Var = numberOfLayers > 2 ? (zp1) rippleDrawable2.getDrawable(2) : (zp1) rippleDrawable2.getDrawable(1);
        }
        if (zp1Var != null) {
            zp1Var.setShapeAppearanceModel(this.b);
            if (zp1Var instanceof r21) {
                r21 r21Var = (r21) zp1Var;
                qt1 qt1Var3 = this.c;
                if (qt1Var3 != null) {
                    r21Var.o(qt1Var3);
                }
                ss1 ss1Var3 = this.d;
                if (ss1Var3 != null) {
                    r21Var.l(ss1Var3);
                }
            }
        }
    }

    public final void e() {
        r21 r21VarA = a(false);
        r21 r21VarA2 = a(true);
        if (r21VarA != null) {
            float f = this.k;
            ColorStateList colorStateList = this.n;
            r21VarA.b.k = f;
            r21VarA.invalidateSelf();
            p21 p21Var = r21VarA.b;
            if (p21Var.e != colorStateList) {
                p21Var.e = colorStateList;
                r21VarA.onStateChange(r21VarA.getState());
            }
            if (r21VarA2 != null) {
                float f2 = this.k;
                int iH = this.q ? qt.h(this.a, 2130968879) : 0;
                r21VarA2.b.k = f2;
                r21VarA2.invalidateSelf();
                ColorStateList colorStateListValueOf = ColorStateList.valueOf(iH);
                p21 p21Var2 = r21VarA2.b;
                if (p21Var2.e != colorStateListValueOf) {
                    p21Var2.e = colorStateListValueOf;
                    r21VarA2.onStateChange(r21VarA2.getState());
                }
            }
        }
    }
}
