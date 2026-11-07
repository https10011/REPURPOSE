package defpackage;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController;
import androidx.core.widget.NestedScrollView;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class g6 extends lq implements DialogInterface, r7 {
    public k8 d;
    public final l8 e;
    public final e6 f;

    /* JADX WARN: Type inference failed for: r2v2, types: [l8] */
    public g6(ContextThemeWrapper contextThemeWrapper, int i) {
        int i2;
        int iF = f(contextThemeWrapper, i);
        if (iF == 0) {
            TypedValue typedValue = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(2130969001, typedValue, true);
            i2 = typedValue.resourceId;
        } else {
            i2 = iF;
        }
        super(contextThemeWrapper, i2);
        this.e = new iv0() { // from class: l8
            @Override // defpackage.iv0
            public final boolean superDispatchKeyEvent(KeyEvent keyEvent) {
                return this.a.h(keyEvent);
            }
        };
        y7 y7VarD = d();
        if (iF == 0) {
            TypedValue typedValue2 = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(2130969001, typedValue2, true);
            iF = typedValue2.resourceId;
        }
        ((k8) y7VarD).G0 = iF;
        y7VarD.e();
        this.f = new e6(getContext(), this, getWindow());
    }

    public static int f(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(2130968621, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // defpackage.lq, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        b();
        k8 k8Var = (k8) d();
        k8Var.x();
        ((ViewGroup) k8Var.n0.findViewById(R.id.content)).addView(view, layoutParams);
        k8Var.Z.a(k8Var.Y.getCallback());
    }

    public final Button c(int i) {
        e6 e6Var = this.f;
        if (i == -3) {
            return e6Var.m;
        }
        if (i == -2) {
            return e6Var.j;
        }
        if (i == -1) {
            return e6Var.g;
        }
        e6Var.getClass();
        return null;
    }

    public final y7 d() {
        if (this.d == null) {
            x7 x7Var = y7.a;
            this.d = new k8(getContext(), getWindow(), this, this);
        }
        return this.d;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        d().f();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return nj2.v(this.e, getWindow().getDecorView(), this, keyEvent);
    }

    public final void e(Bundle bundle) {
        d().a();
        super.onCreate(bundle);
        d().e();
    }

    @Override // android.app.Dialog
    public final View findViewById(int i) {
        k8 k8Var = (k8) d();
        k8Var.x();
        return k8Var.Y.findViewById(i);
    }

    public final void g(CharSequence charSequence) {
        super.setTitle(charSequence);
        d().m(charSequence);
    }

    public final boolean h(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        d().b();
    }

    @Override // defpackage.lq, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        int i;
        ListAdapter listAdapter;
        View viewFindViewById;
        e(bundle);
        e6 e6Var = this.f;
        e6Var.b.setContentView(e6Var.y);
        Context context = e6Var.a;
        Window window = e6Var.c;
        View viewFindViewById2 = window.findViewById(2131296685);
        View viewFindViewById3 = viewFindViewById2.findViewById(2131296827);
        View viewFindViewById4 = viewFindViewById2.findViewById(2131296417);
        View viewFindViewById5 = viewFindViewById2.findViewById(2131296374);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById2.findViewById(2131296426);
        window.setFlags(131072, 131072);
        viewGroup.setVisibility(8);
        View viewFindViewById6 = viewGroup.findViewById(2131296827);
        View viewFindViewById7 = viewGroup.findViewById(2131296417);
        View viewFindViewById8 = viewGroup.findViewById(2131296374);
        ViewGroup viewGroupA = e6.a(viewFindViewById6, viewFindViewById3);
        ViewGroup viewGroupA2 = e6.a(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupA3 = e6.a(viewFindViewById8, viewFindViewById5);
        NestedScrollView nestedScrollViewFindViewById = window.findViewById(2131296723);
        e6Var.p = nestedScrollViewFindViewById;
        nestedScrollViewFindViewById.setFocusable(false);
        e6Var.p.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroupA2.findViewById(R.id.message);
        e6Var.u = textView;
        if (textView != null) {
            CharSequence charSequence = e6Var.e;
            if (charSequence != null) {
                textView.setText(charSequence);
            } else {
                textView.setVisibility(8);
                e6Var.p.removeView(e6Var.u);
                if (e6Var.f != null) {
                    ViewGroup viewGroup2 = (ViewGroup) e6Var.p.getParent();
                    int iIndexOfChild = viewGroup2.indexOfChild(e6Var.p);
                    viewGroup2.removeViewAt(iIndexOfChild);
                    viewGroup2.addView((View) e6Var.f, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
                } else {
                    viewGroupA2.setVisibility(8);
                }
            }
        }
        Button button = (Button) viewGroupA3.findViewById(R.id.button1);
        e6Var.g = button;
        l3 l3Var = e6Var.E;
        button.setOnClickListener(l3Var);
        boolean zIsEmpty = TextUtils.isEmpty(e6Var.h);
        Button button2 = e6Var.g;
        if (zIsEmpty) {
            button2.setVisibility(8);
            i = 0;
        } else {
            button2.setText(e6Var.h);
            e6Var.g.setVisibility(0);
            i = 1;
        }
        Button button3 = (Button) viewGroupA3.findViewById(R.id.button2);
        e6Var.j = button3;
        button3.setOnClickListener(l3Var);
        boolean zIsEmpty2 = TextUtils.isEmpty(e6Var.k);
        Button button4 = e6Var.j;
        if (zIsEmpty2) {
            button4.setVisibility(8);
        } else {
            button4.setText(e6Var.k);
            e6Var.j.setVisibility(0);
            i |= 2;
        }
        Button button5 = (Button) viewGroupA3.findViewById(R.id.button3);
        e6Var.m = button5;
        button5.setOnClickListener(l3Var);
        boolean zIsEmpty3 = TextUtils.isEmpty(e6Var.n);
        Button button6 = e6Var.m;
        if (zIsEmpty3) {
            button6.setVisibility(8);
        } else {
            button6.setText(e6Var.n);
            e6Var.m.setVisibility(0);
            i |= 4;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(2130968619, typedValue, true);
        if (typedValue.data != 0) {
            if (i == 1) {
                Button button7 = e6Var.g;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button7.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button7.setLayoutParams(layoutParams);
            } else if (i == 2) {
                Button button8 = e6Var.j;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button8.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button8.setLayoutParams(layoutParams2);
            } else if (i == 4) {
                Button button9 = e6Var.m;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button9.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button9.setLayoutParams(layoutParams3);
            }
        }
        if (i == 0) {
            viewGroupA3.setVisibility(8);
        }
        if (e6Var.v != null) {
            viewGroupA.addView(e6Var.v, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(2131296823).setVisibility(8);
        } else {
            e6Var.s = (ImageView) window.findViewById(R.id.icon);
            if (TextUtils.isEmpty(e6Var.d) || !e6Var.C) {
                window.findViewById(2131296823).setVisibility(8);
                e6Var.s.setVisibility(8);
                viewGroupA.setVisibility(8);
            } else {
                TextView textView2 = (TextView) window.findViewById(2131296331);
                e6Var.t = textView2;
                textView2.setText(e6Var.d);
                int i2 = e6Var.q;
                if (i2 != 0) {
                    e6Var.s.setImageResource(i2);
                } else {
                    Drawable drawable = e6Var.r;
                    if (drawable != null) {
                        e6Var.s.setImageDrawable(drawable);
                    } else {
                        e6Var.t.setPadding(e6Var.s.getPaddingLeft(), e6Var.s.getPaddingTop(), e6Var.s.getPaddingRight(), e6Var.s.getPaddingBottom());
                        e6Var.s.setVisibility(8);
                    }
                }
            }
        }
        boolean z = viewGroup.getVisibility() != 8;
        int i3 = (viewGroupA == null || viewGroupA.getVisibility() == 8) ? 0 : 1;
        boolean z2 = viewGroupA3.getVisibility() != 8;
        if (!z2 && (viewFindViewById = viewGroupA2.findViewById(2131296804)) != null) {
            viewFindViewById.setVisibility(0);
        }
        if (i3 != 0) {
            NestedScrollView nestedScrollView = e6Var.p;
            if (nestedScrollView != null) {
                nestedScrollView.setClipToPadding(true);
            }
            View viewFindViewById9 = (e6Var.e == null && e6Var.f == null) ? null : viewGroupA.findViewById(2131296822);
            if (viewFindViewById9 != null) {
                viewFindViewById9.setVisibility(0);
            }
        } else {
            View viewFindViewById10 = viewGroupA2.findViewById(2131296805);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        }
        AlertController.RecycleListView recycleListView = e6Var.f;
        if (recycleListView != null && (!z2 || i3 == 0)) {
            recycleListView.setPadding(recycleListView.getPaddingLeft(), i3 != 0 ? recycleListView.getPaddingTop() : recycleListView.a, recycleListView.getPaddingRight(), z2 ? recycleListView.getPaddingBottom() : recycleListView.b);
        }
        if (!z) {
            NestedScrollView nestedScrollView2 = e6Var.f;
            if (nestedScrollView2 == null) {
                nestedScrollView2 = e6Var.p;
            }
            if (nestedScrollView2 != null) {
                int i4 = z2 ? 2 : 0;
                View viewFindViewById11 = window.findViewById(2131296722);
                View viewFindViewById12 = window.findViewById(2131296721);
                WeakHashMap weakHashMap = x52.a;
                nestedScrollView2.setScrollIndicators(i3 | i4, 3);
                if (viewFindViewById11 != null) {
                    viewGroupA2.removeView(viewFindViewById11);
                }
                if (viewFindViewById12 != null) {
                    viewGroupA2.removeView(viewFindViewById12);
                }
            }
        }
        AlertController.RecycleListView recycleListView2 = e6Var.f;
        if (recycleListView2 == null || (listAdapter = e6Var.w) == null) {
            return;
        }
        recycleListView2.setAdapter(listAdapter);
        int i5 = e6Var.x;
        if (i5 > -1) {
            recycleListView2.setItemChecked(i5, true);
            recycleListView2.setSelection(i5);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f.p;
        if (nestedScrollView == null || !nestedScrollView.i(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f.p;
        if (nestedScrollView == null || !nestedScrollView.i(keyEvent)) {
            return super.onKeyUp(i, keyEvent);
        }
        return true;
    }

    @Override // defpackage.lq, android.app.Dialog
    public final void onStop() {
        super.onStop();
        k8 k8Var = (k8) d();
        k8Var.B();
        j3 j3Var = k8Var.b0;
        if (j3Var != null) {
            j3Var.m(false);
        }
    }

    @Override // defpackage.r7
    public final e4 onWindowStartingSupportActionMode(d4 d4Var) {
        return null;
    }

    @Override // defpackage.lq, android.app.Dialog
    public final void setContentView(int i) {
        b();
        d().j(i);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i) {
        super.setTitle(i);
        d().m(getContext().getString(i));
    }

    @Override // defpackage.lq, android.app.Dialog
    public final void setContentView(View view) {
        b();
        d().k(view);
    }

    @Override // defpackage.lq, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        b();
        d().l(view, layoutParams);
    }

    @Override // android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        g(charSequence);
        e6 e6Var = this.f;
        e6Var.d = charSequence;
        TextView textView = e6Var.t;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    @Override // defpackage.r7
    public final void onSupportActionModeFinished(e4 e4Var) {
    }

    @Override // defpackage.r7
    public final void onSupportActionModeStarted(e4 e4Var) {
    }
}
