package defpackage;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class ht1 extends t31 implements PopupWindow.OnDismissListener, View.OnKeyListener {
    public PopupWindow.OnDismissListener X;
    public View Y;
    public View Z;
    public a41 a0;
    public final Context b;
    public ViewTreeObserver b0;
    public final i31 c;
    public boolean c0;
    public final f31 d;
    public boolean d0;
    public final boolean e;
    public int e0;
    public final int f;
    public boolean g0;
    public final int i;
    public final z31 v;
    public final z8 w = new z8(this, 3);
    public final xk W = new xk(this, 5);
    public int f0 = 0;

    public ht1(Context context, i31 i31Var, View view, int i, boolean z) {
        this.b = context;
        this.c = i31Var;
        this.e = z;
        this.d = new f31(i31Var, LayoutInflater.from(context), z, 2131492883);
        this.i = i;
        Resources resources = context.getResources();
        this.f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(2131165207));
        this.Y = view;
        this.v = new z31(context, null, i, 0);
        i31Var.b(this, context);
    }

    @Override // defpackage.oq1
    public final boolean a() {
        return !this.c0 && this.v.m0.isShowing();
    }

    @Override // defpackage.oq1
    public final void c() {
        View view;
        if (a()) {
            return;
        }
        if (this.c0 || (view = this.Y) == null) {
            uq1.q("StandardMenuPopup cannot be used without an anchor");
            return;
        }
        this.Z = view;
        z31 z31Var = this.v;
        s8 s8Var = z31Var.m0;
        s8 s8Var2 = z31Var.m0;
        s8Var.setOnDismissListener(this);
        z31Var.c0 = this;
        z31Var.l0 = true;
        s8Var2.setFocusable(true);
        View view2 = this.Z;
        boolean z = this.b0 == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.b0 = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this.w);
        }
        view2.addOnAttachStateChangeListener(this.W);
        z31Var.b0 = view2;
        z31Var.Y = this.f0;
        boolean z2 = this.d0;
        Context context = this.b;
        f31 f31Var = this.d;
        if (!z2) {
            this.e0 = t31.m(f31Var, context, this.f);
            this.d0 = true;
        }
        z31Var.r(this.e0);
        s8Var2.setInputMethodMode(2);
        Rect rect = this.a;
        z31Var.k0 = rect != null ? new Rect(rect) : null;
        z31Var.c();
        o30 o30Var = z31Var.c;
        o30Var.setOnKeyListener(this);
        if (this.g0) {
            i31 i31Var = this.c;
            if (i31Var.m != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(2131492882, (ViewGroup) o30Var, false);
                TextView textView = (TextView) frameLayout.findViewById(R.id.title);
                if (textView != null) {
                    textView.setText(i31Var.m);
                }
                frameLayout.setEnabled(false);
                o30Var.addHeaderView(frameLayout, null, false);
            }
        }
        z31Var.p(f31Var);
        z31Var.c();
    }

    @Override // defpackage.b41
    public final void d(a41 a41Var) {
        this.a0 = a41Var;
    }

    @Override // defpackage.oq1
    public final void dismiss() {
        if (a()) {
            this.v.dismiss();
        }
    }

    @Override // defpackage.b41
    public final void f(i31 i31Var, boolean z) {
        if (i31Var != this.c) {
            return;
        }
        dismiss();
        a41 a41Var = this.a0;
        if (a41Var != null) {
            a41Var.f(i31Var, z);
        }
    }

    @Override // defpackage.b41
    public final void g() {
        this.d0 = false;
        f31 f31Var = this.d;
        if (f31Var != null) {
            f31Var.notifyDataSetChanged();
        }
    }

    @Override // defpackage.oq1
    public final o30 h() {
        return this.v.c;
    }

    @Override // defpackage.b41
    public final boolean j(tu1 tu1Var) {
        boolean z;
        if (tu1Var.hasVisibleItems()) {
            v31 v31Var = new v31(this.b, tu1Var, this.Z, this.e, this.i, 0);
            a41 a41Var = this.a0;
            v31Var.h = a41Var;
            t31 t31Var = v31Var.i;
            if (t31Var != null) {
                t31Var.d(a41Var);
            }
            int size = tu1Var.f.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    z = false;
                    break;
                }
                MenuItem item = tu1Var.getItem(i);
                if (item.isVisible() && item.getIcon() != null) {
                    z = true;
                    break;
                }
                i++;
            }
            v31Var.g = z;
            t31 t31Var2 = v31Var.i;
            if (t31Var2 != null) {
                t31Var2.o(z);
            }
            v31Var.j = this.X;
            this.X = null;
            this.c.c(false);
            z31 z31Var = this.v;
            int width = z31Var.f;
            int iN = z31Var.n();
            if ((Gravity.getAbsoluteGravity(this.f0, this.Y.getLayoutDirection()) & 7) == 5) {
                width += this.Y.getWidth();
            }
            if (!v31Var.b()) {
                if (v31Var.e != null) {
                    v31Var.d(width, iN, true, true);
                }
            }
            a41 a41Var2 = this.a0;
            if (a41Var2 != null) {
                a41Var2.y(tu1Var);
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.b41
    public final boolean k() {
        return false;
    }

    @Override // defpackage.t31
    public final void n(View view) {
        this.Y = view;
    }

    @Override // defpackage.t31
    public final void o(boolean z) {
        this.d.c = z;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.c0 = true;
        this.c.c(true);
        ViewTreeObserver viewTreeObserver = this.b0;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.b0 = this.Z.getViewTreeObserver();
            }
            this.b0.removeGlobalOnLayoutListener(this.w);
            this.b0 = null;
        }
        this.Z.removeOnAttachStateChangeListener(this.W);
        PopupWindow.OnDismissListener onDismissListener = this.X;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // defpackage.t31
    public final void p(int i) {
        this.f0 = i;
    }

    @Override // defpackage.t31
    public final void q(int i) {
        this.v.f = i;
    }

    @Override // defpackage.t31
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.X = onDismissListener;
    }

    @Override // defpackage.t31
    public final void s(boolean z) {
        this.g0 = z;
    }

    @Override // defpackage.t31
    public final void t(int i) {
        this.v.i(i);
    }

    @Override // defpackage.t31
    public final void l(i31 i31Var) {
    }
}
