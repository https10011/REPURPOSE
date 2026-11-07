package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.google.android.material.chip.Chip;
import com.hjq.toast.BuildConfig;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class pm extends r21 implements Drawable.Callback {
    public static final int[] C1 = {R.attr.state_enabled};
    public static final ShapeDrawable D1 = new ShapeDrawable(new OvalShape());
    public ColorStateList A0;
    public int A1;
    public CharSequence B0;
    public boolean B1;
    public boolean C0;
    public Drawable D0;
    public ColorStateList E0;
    public float F0;
    public boolean G0;
    public boolean H0;
    public Drawable I0;
    public RippleDrawable J0;
    public ColorStateList K0;
    public float L0;
    public SpannableStringBuilder M0;
    public boolean N0;
    public boolean O0;
    public Drawable P0;
    public ColorStateList Q0;
    public s51 R0;
    public s51 S0;
    public float T0;
    public float U0;
    public float V0;
    public float W0;
    public float X0;
    public float Y0;
    public float Z0;
    public float a1;
    public final Context b1;
    public final Paint c1;
    public final Paint.FontMetrics d1;
    public final RectF e1;
    public final PointF f1;
    public final Path g1;
    public final xw1 h1;
    public int i1;
    public int j1;
    public int k1;
    public int l1;
    public int m1;
    public int n1;
    public boolean o1;
    public int p1;
    public int q1;
    public ColorFilter r1;
    public PorterDuffColorFilter s1;
    public ColorStateList t1;
    public ColorStateList u0;
    public PorterDuff.Mode u1;
    public ColorStateList v0;
    public int[] v1;
    public float w0;
    public ColorStateList w1;
    public float x0;
    public WeakReference x1;
    public ColorStateList y0;
    public TextUtils.TruncateAt y1;
    public float z0;
    public boolean z1;

    public pm(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130968790, 2131952775);
        this.x0 = -1.0f;
        this.c1 = new Paint(1);
        this.d1 = new Paint.FontMetrics();
        this.e1 = new RectF();
        this.f1 = new PointF();
        this.g1 = new Path();
        this.q1 = 255;
        this.u1 = PorterDuff.Mode.SRC_IN;
        this.x1 = new WeakReference(null);
        k(context);
        this.b1 = context;
        xw1 xw1Var = new xw1(this);
        this.h1 = xw1Var;
        this.B0 = BuildConfig.FLAVOR;
        xw1Var.a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = C1;
        setState(iArr);
        S(iArr);
        this.z1 = true;
        D1.setTint(-1);
    }

    public static void b0(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public static boolean y(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    public static boolean z(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    public final void A() {
        Chip chip = (Chip) this.x1.get();
        if (chip != null) {
            chip.b(chip.f0);
            chip.requestLayout();
            chip.invalidateOutline();
        }
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00a0  */
    public final boolean B(int[] iArr, int[] iArr2) {
        int colorForState;
        boolean z;
        boolean z2;
        ColorStateList colorStateList;
        boolean zOnStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList2 = this.u0;
        int iC = c(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.i1) : 0);
        boolean state = true;
        if (this.i1 != iC) {
            this.i1 = iC;
            zOnStateChange = true;
        }
        ColorStateList colorStateList3 = this.v0;
        int iC2 = c(colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.j1) : 0);
        if (this.j1 != iC2) {
            this.j1 = iC2;
            zOnStateChange = true;
        }
        int iC3 = so.c(iC2, iC);
        if ((this.k1 != iC3) | (this.b.d == null)) {
            this.k1 = iC3;
            n(ColorStateList.valueOf(iC3));
            zOnStateChange = true;
        }
        ColorStateList colorStateList4 = this.y0;
        int colorForState2 = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.l1) : 0;
        if (this.l1 != colorForState2) {
            this.l1 = colorForState2;
            zOnStateChange = true;
        }
        if (this.w1 != null) {
            int[] iArr3 = fk1.a;
            boolean z3 = false;
            boolean z4 = false;
            for (int i : iArr) {
                if (i == 16842910) {
                    z3 = true;
                } else if (i == 16842908 || i == 16842919 || i == 16843623) {
                    z4 = true;
                }
            }
            if (z3 && z4) {
                colorForState = this.w1.getColorForState(iArr, this.m1);
            } else {
                colorForState = 0;
            }
        } else {
            colorForState = 0;
        }
        if (this.m1 != colorForState) {
            this.m1 = colorForState;
        }
        vw1 vw1Var = this.h1.f;
        int colorForState3 = (vw1Var == null || (colorStateList = vw1Var.k) == null) ? 0 : colorStateList.getColorForState(iArr, this.n1);
        if (this.n1 != colorForState3) {
            this.n1 = colorForState3;
            zOnStateChange = true;
        }
        int[] state2 = getState();
        if (state2 == null) {
            z = false;
            break;
        }
        int length = state2.length;
        int i2 = 0;
        while (true) {
            if (i2 < length) {
                if (state2[i2] == 16842912) {
                    if (this.N0) {
                        z = true;
                        break;
                    }
                } else {
                    i2++;
                }
            }
            z = false;
            break;
        }
        if (this.o1 == z || this.P0 == null) {
            z2 = false;
        } else {
            float fV = v();
            this.o1 = z;
            if (fV != v()) {
                zOnStateChange = true;
                z2 = true;
            } else {
                z2 = false;
                zOnStateChange = true;
            }
        }
        ColorStateList colorStateList5 = this.t1;
        int colorForState4 = colorStateList5 != null ? colorStateList5.getColorForState(iArr, this.p1) : 0;
        if (this.p1 != colorForState4) {
            this.p1 = colorForState4;
            ColorStateList colorStateList6 = this.t1;
            PorterDuff.Mode mode = this.u1;
            this.s1 = (colorStateList6 == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList6.getColorForState(getState(), 0), mode);
        } else {
            state = zOnStateChange;
        }
        if (z(this.D0)) {
            state |= this.D0.setState(iArr);
        }
        if (z(this.P0)) {
            state |= this.P0.setState(iArr);
        }
        if (z(this.I0)) {
            int[] iArr4 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr4, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr4, iArr.length, iArr2.length);
            state |= this.I0.setState(iArr4);
        }
        if (z(this.J0)) {
            state |= this.J0.setState(iArr2);
        }
        if (state) {
            invalidateSelf();
        }
        if (z2) {
            A();
        }
        return state;
    }

    public final void C() {
        A();
        invalidateSelf();
    }

    public final void D(boolean z) {
        if (this.N0 != z) {
            this.N0 = z;
            float fV = v();
            if (!z && this.o1) {
                this.o1 = false;
            }
            float fV2 = v();
            invalidateSelf();
            if (fV != fV2) {
                A();
            }
        }
    }

    public final void E(Drawable drawable) {
        if (this.P0 != drawable) {
            float fV = v();
            this.P0 = drawable;
            float fV2 = v();
            b0(this.P0);
            t(this.P0);
            invalidateSelf();
            if (fV != fV2) {
                A();
            }
        }
    }

    public final void F(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.Q0 != colorStateList) {
            this.Q0 = colorStateList;
            if (this.O0 && (drawable = this.P0) != null && this.N0) {
                drawable.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void G(boolean z) {
        if (this.O0 != z) {
            boolean zY = Y();
            this.O0 = z;
            boolean zY2 = Y();
            if (zY != zY2) {
                Drawable drawable = this.P0;
                if (zY2) {
                    t(drawable);
                } else {
                    b0(drawable);
                }
                invalidateSelf();
                A();
            }
        }
    }

    public final void H(float f) {
        if (this.x0 != f) {
            this.x0 = f;
            qf2 qf2VarG = this.b.a.g();
            qf2VarG.e = new y(f);
            qf2VarG.f = new y(f);
            qf2VarG.g = new y(f);
            qf2VarG.h = new y(f);
            setShapeAppearanceModel(qf2VarG.c());
        }
    }

    public final void I(Drawable drawable) {
        Drawable drawable2 = this.D0;
        if (drawable2 == null) {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float fV = v();
            this.D0 = drawable != null ? drawable.mutate() : null;
            float fV2 = v();
            b0(drawable2);
            if (Z()) {
                t(this.D0);
            }
            invalidateSelf();
            if (fV != fV2) {
                A();
            }
        }
    }

    public final void J(float f) {
        if (this.F0 != f) {
            float fV = v();
            this.F0 = f;
            float fV2 = v();
            invalidateSelf();
            if (fV != fV2) {
                A();
            }
        }
    }

    public final void K(ColorStateList colorStateList) {
        this.G0 = true;
        if (this.E0 != colorStateList) {
            this.E0 = colorStateList;
            if (Z()) {
                this.D0.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void L(boolean z) {
        if (this.C0 != z) {
            boolean Z = Z();
            this.C0 = z;
            boolean Z2 = Z();
            if (Z != Z2) {
                Drawable drawable = this.D0;
                if (Z2) {
                    t(drawable);
                } else {
                    b0(drawable);
                }
                invalidateSelf();
                A();
            }
        }
    }

    public final void M(ColorStateList colorStateList) {
        if (this.y0 != colorStateList) {
            this.y0 = colorStateList;
            if (this.B1) {
                p21 p21Var = this.b;
                if (p21Var.e != colorStateList) {
                    p21Var.e = colorStateList;
                    onStateChange(getState());
                }
            }
            onStateChange(getState());
        }
    }

    public final void N(float f) {
        if (this.z0 != f) {
            this.z0 = f;
            this.c1.setStrokeWidth(f);
            if (this.B1) {
                this.b.k = f;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    public final void O(Drawable drawable) {
        Drawable drawable2 = this.I0;
        if (drawable2 == null) {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float fW = w();
            this.I0 = drawable != null ? drawable.mutate() : null;
            this.J0 = new RippleDrawable(fk1.a(this.A0), this.I0, D1);
            float fW2 = w();
            b0(drawable2);
            if (a0()) {
                t(this.I0);
            }
            invalidateSelf();
            if (fW != fW2) {
                A();
            }
        }
    }

    public final void P(float f) {
        if (this.Z0 != f) {
            this.Z0 = f;
            invalidateSelf();
            if (a0()) {
                A();
            }
        }
    }

    public final void Q(float f) {
        if (this.L0 != f) {
            this.L0 = f;
            invalidateSelf();
            if (a0()) {
                A();
            }
        }
    }

    public final void R(float f) {
        if (this.Y0 != f) {
            this.Y0 = f;
            invalidateSelf();
            if (a0()) {
                A();
            }
        }
    }

    public final boolean S(int[] iArr) {
        if (Arrays.equals(this.v1, iArr)) {
            return false;
        }
        this.v1 = iArr;
        if (a0()) {
            return B(getState(), iArr);
        }
        return false;
    }

    public final void T(ColorStateList colorStateList) {
        if (this.K0 != colorStateList) {
            this.K0 = colorStateList;
            if (a0()) {
                this.I0.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void U(boolean z) {
        if (this.H0 != z) {
            boolean zA0 = a0();
            this.H0 = z;
            boolean zA1 = a0();
            if (zA0 != zA1) {
                Drawable drawable = this.I0;
                if (zA1) {
                    t(drawable);
                } else {
                    b0(drawable);
                }
                invalidateSelf();
                A();
            }
        }
    }

    public final void V(float f) {
        if (this.V0 != f) {
            float fV = v();
            this.V0 = f;
            float fV2 = v();
            invalidateSelf();
            if (fV != fV2) {
                A();
            }
        }
    }

    public final void W(float f) {
        if (this.U0 != f) {
            float fV = v();
            this.U0 = f;
            float fV2 = v();
            invalidateSelf();
            if (fV != fV2) {
                A();
            }
        }
    }

    public final void X(ColorStateList colorStateList) {
        if (this.A0 != colorStateList) {
            this.A0 = colorStateList;
            this.w1 = null;
            onStateChange(getState());
        }
    }

    public final boolean Y() {
        return this.O0 && this.P0 != null && this.o1;
    }

    public final boolean Z() {
        return this.C0 && this.D0 != null;
    }

    public final boolean a0() {
        return this.H0 && this.I0 != null;
    }

    /* JADX WARN: Failed to calculate best type for var: r0v12 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v12 ??, new type: float
    	at uv1.l(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:3)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:74)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:80)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.a(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at zn3.accept(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:12)
    	at java.util.ArrayList.forEach(ArrayList.java:1621)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:20)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:14)
    Caused by: java.lang.NullPointerException: Attempt to invoke virtual method 'jadx.core.dex.instructions.args.ArgType jadx.core.dex.instructions.args.Typed.getType()' on a null object reference
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:13)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:27)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.u(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at ho3.update(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:53)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:39)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:24)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	... 9 more
     */
    /* JADX WARN: Failed to calculate best type for var: r0v13 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v13 ??, new type: float
    	at uv1.l(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:3)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:74)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:80)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.a(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at zn3.accept(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:12)
    	at java.util.ArrayList.forEach(ArrayList.java:1621)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:20)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:14)
    Caused by: java.lang.NullPointerException: Attempt to invoke virtual method 'jadx.core.dex.instructions.args.ArgType jadx.core.dex.instructions.args.Typed.getType()' on a null object reference
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:13)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:27)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.u(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at ho3.update(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:53)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:39)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:24)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	... 9 more
     */
    /* JADX WARN: Failed to calculate best type for var: r0v14 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v14 ??, new type: float
    	at uv1.l(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:3)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:74)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:80)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.a(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at zn3.accept(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:12)
    	at java.util.ArrayList.forEach(ArrayList.java:1621)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:20)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:14)
    Caused by: java.lang.NullPointerException: Attempt to invoke virtual method 'jadx.core.dex.instructions.args.ArgType jadx.core.dex.instructions.args.Typed.getType()' on a null object reference
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:13)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:27)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.u(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at ho3.update(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:53)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:39)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:24)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	... 9 more
     */
    /* JADX WARN: Failed to calculate best type for var: r11v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v0 ??, new type: android.graphics.RectF
    	at uv1.l(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:3)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:74)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:80)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:29)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:24)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:22)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.k(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at pw0.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:29)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:32)
    Caused by: java.lang.NullPointerException: Attempt to invoke virtual method 'jadx.core.dex.instructions.args.ArgType jadx.core.dex.instructions.args.Typed.getType()' on a null object reference
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:13)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:27)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.u(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at ho3.update(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:53)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:39)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:24)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	... 8 more
     */
    /* JADX WARN: Failed to calculate best type for var: r11v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v0 ??, new type: android.graphics.RectF
    	at uv1.l(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:3)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:74)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:80)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.a(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at zn3.accept(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:12)
    	at java.util.ArrayList.forEach(ArrayList.java:1621)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:20)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:14)
    Caused by: java.lang.NullPointerException: Attempt to invoke virtual method 'jadx.core.dex.instructions.args.ArgType jadx.core.dex.instructions.args.Typed.getType()' on a null object reference
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:13)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:27)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.u(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at ho3.update(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:53)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:39)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:24)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	... 9 more
     */
    /* JADX WARN: Failed to calculate best type for var: r1v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v1 ??, new type: android.graphics.Canvas
    	at uv1.l(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:3)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:74)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:80)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:29)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:24)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:22)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.k(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at pw0.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:29)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:32)
    Caused by: java.lang.NullPointerException: Attempt to invoke virtual method 'jadx.core.dex.instructions.args.ArgType jadx.core.dex.instructions.args.Typed.getType()' on a null object reference
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:13)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:27)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.u(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at ho3.update(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:53)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:39)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:24)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	... 8 more
     */
    /* JADX WARN: Failed to calculate best type for var: r1v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v1 ??, new type: android.graphics.Canvas
    	at uv1.l(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:3)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:74)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:80)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.a(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at zn3.accept(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:12)
    	at java.util.ArrayList.forEach(ArrayList.java:1621)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:20)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:14)
    Caused by: java.lang.NullPointerException: Attempt to invoke virtual method 'jadx.core.dex.instructions.args.ArgType jadx.core.dex.instructions.args.Typed.getType()' on a null object reference
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:13)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:27)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.u(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at ho3.update(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:53)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:39)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:24)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	... 9 more
     */
    /* JADX WARN: Failed to calculate best type for var: r1v10 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v10 ??, new type: android.graphics.Canvas
    	at uv1.l(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:3)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:74)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:80)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.a(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at zn3.accept(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:12)
    	at java.util.ArrayList.forEach(ArrayList.java:1621)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:20)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:14)
    Caused by: java.lang.NullPointerException: Attempt to invoke virtual method 'jadx.core.dex.instructions.args.ArgType jadx.core.dex.instructions.args.Typed.getType()' on a null object reference
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:13)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:27)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.u(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at ho3.update(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:53)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:39)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:24)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	... 9 more
     */
    /* JADX WARN: Failed to calculate best type for var: r1v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v2 ??, new type: android.graphics.Canvas
    	at uv1.l(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:3)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:74)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:80)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:29)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:24)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:22)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.k(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at pw0.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:29)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:32)
    Caused by: java.lang.NullPointerException: Attempt to invoke virtual method 'jadx.core.dex.instructions.args.ArgType jadx.core.dex.instructions.args.Typed.getType()' on a null object reference
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:13)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:27)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.u(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at ho3.update(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:53)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:39)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:24)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	... 8 more
     */
    /* JADX WARN: Failed to calculate best type for var: r1v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v3 ??, new type: android.graphics.Canvas
    	at uv1.l(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:3)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:74)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:80)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:29)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:24)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:22)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.k(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at pw0.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:29)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:32)
    Caused by: java.lang.NullPointerException: Attempt to invoke virtual method 'jadx.core.dex.instructions.args.ArgType jadx.core.dex.instructions.args.Typed.getType()' on a null object reference
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:13)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:27)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.u(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at ho3.update(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:53)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:39)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:24)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	... 8 more
     */
    /* JADX WARN: Failed to calculate best type for var: r1v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v5 ??, new type: android.graphics.Canvas
    	at uv1.l(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:3)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:74)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:80)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.a(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at zn3.accept(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:12)
    	at java.util.ArrayList.forEach(ArrayList.java:1621)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:20)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:14)
    Caused by: java.lang.NullPointerException: Attempt to invoke virtual method 'jadx.core.dex.instructions.args.ArgType jadx.core.dex.instructions.args.Typed.getType()' on a null object reference
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:13)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:27)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.u(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at ho3.update(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:53)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:39)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:24)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	... 9 more
     */
    /* JADX WARN: Failed to calculate best type for var: r22v0 'this'  ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r22v0 'this'  ??, new type: pm
    	at uv1.l(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:3)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:74)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:80)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.a(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at zn3.accept(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:12)
    	at java.util.ArrayList.forEach(ArrayList.java:1621)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:20)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:14)
    Caused by: java.lang.NullPointerException: Attempt to invoke virtual method 'jadx.core.dex.instructions.args.ArgType jadx.core.dex.instructions.args.Typed.getType()' on a null object reference
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:13)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:27)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.u(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at ho3.update(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:53)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:39)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:24)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	... 9 more
     */
    /* JADX WARN: Failed to calculate best type for var: r2v10 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v10 ??, new type: float
    	at uv1.l(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:3)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:74)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:80)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.a(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at zn3.accept(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:12)
    	at java.util.ArrayList.forEach(ArrayList.java:1621)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:20)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:14)
    Caused by: java.lang.NullPointerException: Attempt to invoke virtual method 'jadx.core.dex.instructions.args.ArgType jadx.core.dex.instructions.args.Typed.getType()' on a null object reference
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:13)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:27)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.u(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at ho3.update(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:53)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:39)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:24)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	... 9 more
     */
    /* JADX WARN: Failed to calculate best type for var: r3v13 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v13 ??, new type: android.graphics.drawable.RippleDrawable
    	at uv1.l(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:3)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:74)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:80)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:29)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:24)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:22)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.k(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at pw0.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:29)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:32)
    Caused by: java.lang.NullPointerException: Attempt to invoke virtual method 'jadx.core.dex.instructions.args.ArgType jadx.core.dex.instructions.args.Typed.getType()' on a null object reference
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:13)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:27)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.u(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at ho3.update(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:53)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:39)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:24)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	... 8 more
     */
    /* JADX WARN: Failed to calculate best type for var: r3v14 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v14 ??, new type: float
    	at uv1.l(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:3)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:74)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:80)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.a(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at zn3.accept(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:12)
    	at java.util.ArrayList.forEach(ArrayList.java:1621)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:20)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:14)
    Caused by: java.lang.NullPointerException: Attempt to invoke virtual method 'jadx.core.dex.instructions.args.ArgType jadx.core.dex.instructions.args.Typed.getType()' on a null object reference
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:13)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:27)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.u(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at ho3.update(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:53)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:39)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:24)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	... 9 more
     */
    /* JADX WARN: Failed to calculate best type for var: r3v55 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v55 ??, new type: android.graphics.drawable.Drawable
    	at uv1.l(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:3)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:74)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:80)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.a(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at zn3.accept(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:12)
    	at java.util.ArrayList.forEach(ArrayList.java:1621)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:20)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:14)
    Caused by: java.lang.NullPointerException: Attempt to invoke virtual method 'jadx.core.dex.instructions.args.ArgType jadx.core.dex.instructions.args.Typed.getType()' on a null object reference
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:13)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:27)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.u(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at ho3.update(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:53)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:39)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:24)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	... 9 more
     */
    /* JADX WARN: Failed to calculate best type for var: r3v57 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v57 ??, new type: android.graphics.drawable.Drawable
    	at uv1.l(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:3)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:74)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:80)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.a(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at zn3.accept(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:12)
    	at java.util.ArrayList.forEach(ArrayList.java:1621)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:20)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:14)
    Caused by: java.lang.NullPointerException: Attempt to invoke virtual method 'jadx.core.dex.instructions.args.ArgType jadx.core.dex.instructions.args.Typed.getType()' on a null object reference
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:13)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:27)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.u(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at ho3.update(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:53)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:39)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:24)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	... 9 more
     */
    /* JADX WARN: Failed to calculate best type for var: r7v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v0 ??, new type: android.graphics.Rect
    	at uv1.l(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:3)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:74)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:80)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:29)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:24)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:22)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.k(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at pw0.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:29)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:32)
    Caused by: java.lang.NullPointerException: Attempt to invoke virtual method 'jadx.core.dex.instructions.args.ArgType jadx.core.dex.instructions.args.Typed.getType()' on a null object reference
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:13)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:27)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.u(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at ho3.update(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:53)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:39)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:24)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	... 8 more
     */
    /* JADX WARN: Failed to calculate best type for var: r7v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v0 ??, new type: android.graphics.Rect
    	at uv1.l(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:3)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:74)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:80)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.a(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at zn3.accept(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:12)
    	at java.util.ArrayList.forEach(ArrayList.java:1621)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:20)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:14)
    Caused by: java.lang.NullPointerException: Attempt to invoke virtual method 'jadx.core.dex.instructions.args.ArgType jadx.core.dex.instructions.args.Typed.getType()' on a null object reference
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:13)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:27)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.u(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at ho3.update(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:53)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:39)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:24)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	... 9 more
     */
    /* JADX WARN: Failed to set immutable type for var: r22v0 'this'  ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r22v0 'this'  ??, new type: pm
    	at uv1.l(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:3)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:74)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:3)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:9)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.c(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at zn3.accept(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:16)
    	at java.util.ArrayList.forEach(ArrayList.java:1621)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:11)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:14)
    Caused by: java.lang.NullPointerException: Attempt to invoke virtual method 'jadx.core.dex.instructions.args.ArgType jadx.core.dex.instructions.args.Typed.getType()' on a null object reference
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:13)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:27)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.u(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at ho3.update(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:53)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:39)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:24)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	... 8 more
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v13 ??, new type: android.graphics.drawable.LayerDrawable
        	at uv1.l(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:3)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:74)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderAllow(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:3)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryWiderObjects(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:112)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:39)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:22)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.k(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
        	at pw0.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:29)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:32)
        Caused by: java.lang.NullPointerException: Attempt to invoke virtual method 'jadx.core.dex.instructions.args.ArgType jadx.core.dex.instructions.args.Typed.getType()' on a null object reference
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:13)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:27)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.u(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
        	at ho3.update(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:53)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:39)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:24)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
        	... 7 more
        */
    @Override // defpackage.r21, android.graphics.drawable.Drawable
    public final void draw(android.graphics.Canvas r23) {
        /*
            Method dump skipped, instruction units count: 726
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pm.draw(android.graphics.Canvas):void");
    }

    @Override // defpackage.r21, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.q1;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.r1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.w0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        float fV = v() + this.T0 + this.W0;
        String string = this.B0.toString();
        xw1 xw1Var = this.h1;
        if (xw1Var.d) {
            xw1Var.a(string);
        }
        return Math.min(Math.round(w() + xw1Var.c + fV + this.X0 + this.a1), this.A1);
    }

    @Override // defpackage.r21, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // defpackage.r21, android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Outline outline2;
        if (this.B1) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline2 = outline;
            outline2.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.w0, this.x0);
        } else {
            outline.setRoundRect(bounds, this.x0);
            outline2 = outline;
        }
        outline2.setAlpha(this.q1 / 255.0f);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // defpackage.r21, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        if (y(this.u0) || y(this.v0) || y(this.y0)) {
            return true;
        }
        vw1 vw1Var = this.h1.f;
        if (vw1Var == null || (colorStateList = vw1Var.k) == null || !colorStateList.isStateful()) {
            return (this.O0 && this.P0 != null && this.N0) || z(this.D0) || z(this.P0) || y(this.t1);
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        boolean zOnLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (Z()) {
            zOnLayoutDirectionChanged |= this.D0.setLayoutDirection(i);
        }
        if (Y()) {
            zOnLayoutDirectionChanged |= this.P0.setLayoutDirection(i);
        }
        if (a0()) {
            zOnLayoutDirectionChanged |= this.I0.setLayoutDirection(i);
        }
        if (!zOnLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        boolean zOnLevelChange = super.onLevelChange(i);
        if (Z()) {
            zOnLevelChange |= this.D0.setLevel(i);
        }
        if (Y()) {
            zOnLevelChange |= this.P0.setLevel(i);
        }
        if (a0()) {
            zOnLevelChange |= this.I0.setLevel(i);
        }
        if (zOnLevelChange) {
            invalidateSelf();
        }
        return zOnLevelChange;
    }

    @Override // defpackage.r21, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        if (this.B1) {
            super.onStateChange(iArr);
        }
        return B(iArr, this.v1);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // defpackage.r21, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.q1 != i) {
            this.q1 = i;
            invalidateSelf();
        }
    }

    @Override // defpackage.r21, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.r1 != colorFilter) {
            this.r1 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // defpackage.r21, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.t1 != colorStateList) {
            this.t1 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // defpackage.r21, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        if (this.u1 != mode) {
            this.u1 = mode;
            ColorStateList colorStateList = this.t1;
            this.s1 = (colorStateList == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (Z()) {
            visible |= this.D0.setVisible(z, z2);
        }
        if (Y()) {
            visible |= this.P0.setVisible(z, z2);
        }
        if (a0()) {
            visible |= this.I0.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public final void t(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        drawable.setLayoutDirection(getLayoutDirection());
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.I0) {
            if (drawable.isStateful()) {
                drawable.setState(this.v1);
            }
            drawable.setTintList(this.K0);
            return;
        }
        Drawable drawable2 = this.D0;
        if (drawable == drawable2 && this.G0) {
            drawable2.setTintList(this.E0);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    public final void u(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (Z() || Y()) {
            float f = this.T0 + this.U0;
            Drawable drawable = this.o1 ? this.P0 : this.D0;
            float intrinsicWidth = this.F0;
            if (intrinsicWidth <= 0.0f && drawable != null) {
                intrinsicWidth = drawable.getIntrinsicWidth();
            }
            if (getLayoutDirection() == 0) {
                float f2 = rect.left + f;
                rectF.left = f2;
                rectF.right = f2 + intrinsicWidth;
            } else {
                float f3 = rect.right - f;
                rectF.right = f3;
                rectF.left = f3 - intrinsicWidth;
            }
            Drawable drawable2 = this.o1 ? this.P0 : this.D0;
            float fCeil = this.F0;
            if (fCeil <= 0.0f && drawable2 != null) {
                fCeil = (float) Math.ceil(qt.f(this.b1, 24));
                if (drawable2.getIntrinsicHeight() <= fCeil) {
                    fCeil = drawable2.getIntrinsicHeight();
                }
            }
            float fExactCenterY = rect.exactCenterY() - (fCeil / 2.0f);
            rectF.top = fExactCenterY;
            rectF.bottom = fExactCenterY + fCeil;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public final float v() {
        if (!Z() && !Y()) {
            return 0.0f;
        }
        float f = this.U0;
        Drawable drawable = this.o1 ? this.P0 : this.D0;
        float intrinsicWidth = this.F0;
        if (intrinsicWidth <= 0.0f && drawable != null) {
            intrinsicWidth = drawable.getIntrinsicWidth();
        }
        return intrinsicWidth + f + this.V0;
    }

    public final float w() {
        if (a0()) {
            return this.Y0 + this.L0 + this.Z0;
        }
        return 0.0f;
    }

    public final float x() {
        if (!this.B1) {
            return this.x0;
        }
        float[] fArr = this.p0;
        return fArr != null ? fArr[3] : this.b.a.e.a(g());
    }
}
