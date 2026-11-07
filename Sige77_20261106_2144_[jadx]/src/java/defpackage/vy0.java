package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public class vy0 implements oq1 {
    public static final Method n0;
    public static final Method o0;
    public boolean W;
    public boolean X;
    public final Context a;
    public xu a0;
    public ListAdapter b;
    public View b0;
    public o30 c;
    public AdapterView.OnItemClickListener c0;
    public AdapterView.OnItemSelectedListener d0;
    public int f;
    public int i;
    public final Handler i0;
    public Rect k0;
    public boolean l0;
    public final s8 m0;
    public boolean w;
    public final int d = -2;
    public int e = -2;
    public final int v = 1002;
    public int Y = 0;
    public final int Z = Integer.MAX_VALUE;
    public final sy0 e0 = new sy0(this, 1);
    public final uy0 f0 = new uy0(this, 0);
    public final ty0 g0 = new ty0(this);
    public final sy0 h0 = new sy0(this, 0);
    public final Rect j0 = new Rect();

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                n0 = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                o0 = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public vy0(Context context, AttributeSet attributeSet, int i, int i2) {
        int resourceId;
        this.a = context;
        this.i0 = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, we1.o, i, 0);
        this.f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.i = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.w = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        s8 s8Var = new s8(context, attributeSet, i, 0);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, we1.s, i, 0);
        if (typedArrayObtainStyledAttributes2.hasValue(2)) {
            s8Var.setOverlapAnchor(typedArrayObtainStyledAttributes2.getBoolean(2, false));
        }
        s8Var.setBackgroundDrawable((!typedArrayObtainStyledAttributes2.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes2.getDrawable(0) : gu2.u(context, resourceId));
        typedArrayObtainStyledAttributes2.recycle();
        this.m0 = s8Var;
        s8Var.setInputMethodMode(1);
    }

    @Override // defpackage.oq1
    public final boolean a() {
        return this.m0.isShowing();
    }

    public final int b() {
        return this.f;
    }

    @Override // defpackage.oq1
    public final void c() {
        int i;
        int iMakeMeasureSpec;
        int paddingBottom;
        o30 o30Var;
        o30 o30Var2 = this.c;
        Context context = this.a;
        s8 s8Var = this.m0;
        if (o30Var2 == null) {
            o30 o30VarQ = q(!this.l0, context);
            this.c = o30VarQ;
            o30VarQ.setAdapter(this.b);
            this.c.setOnItemClickListener(this.c0);
            this.c.setFocusable(true);
            this.c.setFocusableInTouchMode(true);
            this.c.setOnItemSelectedListener(new py0(this, 0));
            this.c.setOnScrollListener(this.g0);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.d0;
            if (onItemSelectedListener != null) {
                this.c.setOnItemSelectedListener(onItemSelectedListener);
            }
            s8Var.setContentView(this.c);
        }
        Drawable background = s8Var.getBackground();
        Rect rect = this.j0;
        if (background != null) {
            background.getPadding(rect);
            int i2 = rect.top;
            i = rect.bottom + i2;
            if (!this.w) {
                this.i = -i2;
            }
        } else {
            rect.setEmpty();
            i = 0;
        }
        int iA = qy0.a(s8Var, this.b0, this.i, s8Var.getInputMethodMode() == 2);
        int i3 = this.d;
        if (i3 == -1) {
            paddingBottom = iA + i;
        } else {
            int i4 = this.e;
            if (i4 != -2) {
                iMakeMeasureSpec = i4 != -1 ? View.MeasureSpec.makeMeasureSpec(i4, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824);
            } else {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE);
            }
            int iA2 = this.c.a(iMakeMeasureSpec, iA);
            paddingBottom = iA2 + (iA2 > 0 ? this.c.getPaddingBottom() + this.c.getPaddingTop() + i : 0);
        }
        boolean z = s8Var.getInputMethodMode() == 2;
        s8Var.setWindowLayoutType(this.v);
        if (s8Var.isShowing()) {
            if (this.b0.isAttachedToWindow()) {
                int width = this.e;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = this.b0.getWidth();
                }
                if (i3 == -1) {
                    i3 = z ? paddingBottom : -1;
                    int i5 = this.e;
                    if (z) {
                        s8Var.setWidth(i5 == -1 ? -1 : 0);
                        s8Var.setHeight(0);
                    } else {
                        s8Var.setWidth(i5 == -1 ? -1 : 0);
                        s8Var.setHeight(-1);
                    }
                } else if (i3 == -2) {
                    i3 = paddingBottom;
                }
                s8Var.setOutsideTouchable(true);
                View view = this.b0;
                int i6 = width;
                int i7 = this.f;
                int i8 = this.i;
                int i9 = i6 < 0 ? -1 : i6;
                if (i3 < 0) {
                    i3 = -1;
                }
                s8Var.update(view, i7, i8, i9, i3);
                return;
            }
            return;
        }
        int width2 = this.e;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = this.b0.getWidth();
        }
        if (i3 == -1) {
            i3 = -1;
        } else if (i3 == -2) {
            i3 = paddingBottom;
        }
        s8Var.setWidth(width2);
        s8Var.setHeight(i3);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = n0;
            if (method != null) {
                try {
                    method.invoke(s8Var, Boolean.TRUE);
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            ry0.b(s8Var, true);
        }
        s8Var.setOutsideTouchable(true);
        s8Var.setTouchInterceptor(this.f0);
        if (this.X) {
            s8Var.setOverlapAnchor(this.W);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = o0;
            if (method2 != null) {
                try {
                    method2.invoke(s8Var, this.k0);
                } catch (Exception e) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e);
                }
            }
        } else {
            ry0.a(s8Var, this.k0);
        }
        s8Var.showAsDropDown(this.b0, this.f, this.i, this.Y);
        this.c.setSelection(-1);
        if ((!this.l0 || this.c.isInTouchMode()) && (o30Var = this.c) != null) {
            o30Var.setListSelectionHidden(true);
            o30Var.requestLayout();
        }
        if (this.l0) {
            return;
        }
        this.i0.post(this.h0);
    }

    public final Drawable d() {
        return this.m0.getBackground();
    }

    @Override // defpackage.oq1
    public final void dismiss() {
        s8 s8Var = this.m0;
        s8Var.dismiss();
        s8Var.setContentView(null);
        this.c = null;
        this.i0.removeCallbacks(this.e0);
    }

    public final void g(Drawable drawable) {
        this.m0.setBackgroundDrawable(drawable);
    }

    @Override // defpackage.oq1
    public final o30 h() {
        return this.c;
    }

    public final void i(int i) {
        this.i = i;
        this.w = true;
    }

    public final void l(int i) {
        this.f = i;
    }

    public final int n() {
        if (this.w) {
            return this.i;
        }
        return 0;
    }

    public void p(ListAdapter listAdapter) {
        xu xuVar = this.a0;
        if (xuVar == null) {
            this.a0 = new xu(this, 1);
        } else {
            ListAdapter listAdapter2 = this.b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(xuVar);
            }
        }
        this.b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.a0);
        }
        o30 o30Var = this.c;
        if (o30Var != null) {
            o30Var.setAdapter(this.b);
        }
    }

    public o30 q(boolean z, Context context) {
        return new o30(z, context);
    }

    public final void r(int i) {
        Drawable background = this.m0.getBackground();
        if (background == null) {
            this.e = i;
            return;
        }
        Rect rect = this.j0;
        background.getPadding(rect);
        this.e = rect.left + rect.right + i;
    }
}
