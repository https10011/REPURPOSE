package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import androidx.appcompat.widget.b;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class f9 extends vy0 implements g9 {
    public CharSequence p0;
    public c9 q0;
    public final Rect r0;
    public int s0;
    public final /* synthetic */ b t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f9(b bVar, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130969690, 0);
        this.t0 = bVar;
        this.r0 = new Rect();
        this.b0 = bVar;
        this.l0 = true;
        this.m0.setFocusable(true);
        this.c0 = new d9(this, 0);
    }

    @Override // defpackage.g9
    public final void f(CharSequence charSequence) {
        this.p0 = charSequence;
    }

    @Override // defpackage.g9
    public final void k(int i) {
        this.s0 = i;
    }

    @Override // defpackage.g9
    public final void m(int i, int i2) {
        ViewTreeObserver viewTreeObserver;
        s8 s8Var = this.m0;
        boolean zIsShowing = s8Var.isShowing();
        s();
        s8Var.setInputMethodMode(2);
        c();
        o30 o30Var = this.c;
        o30Var.setChoiceMode(1);
        o30Var.setTextDirection(i);
        o30Var.setTextAlignment(i2);
        b bVar = this.t0;
        int selectedItemPosition = bVar.getSelectedItemPosition();
        o30 o30Var2 = this.c;
        if (s8Var.isShowing() && o30Var2 != null) {
            o30Var2.setListSelectionHidden(false);
            o30Var2.setSelection(selectedItemPosition);
            if (o30Var2.getChoiceMode() != 0) {
                o30Var2.setItemChecked(selectedItemPosition, true);
            }
        }
        if (zIsShowing || (viewTreeObserver = bVar.getViewTreeObserver()) == null) {
            return;
        }
        z8 z8Var = new z8(this, 1);
        viewTreeObserver.addOnGlobalLayoutListener(z8Var);
        s8Var.setOnDismissListener(new e9(this, z8Var));
    }

    @Override // defpackage.g9
    public final CharSequence o() {
        return this.p0;
    }

    @Override // defpackage.vy0, defpackage.g9
    public final void p(ListAdapter listAdapter) {
        super.p(listAdapter);
        this.q0 = (c9) listAdapter;
    }

    public final void s() {
        int i;
        s8 s8Var = this.m0;
        Drawable background = s8Var.getBackground();
        b bVar = this.t0;
        Rect rect = bVar.v;
        if (background != null) {
            background.getPadding(rect);
            boolean z = f72.a;
            i = bVar.getLayoutDirection() == 1 ? rect.right : -rect.left;
        } else {
            i = 0;
            rect.right = 0;
            rect.left = 0;
        }
        int paddingLeft = bVar.getPaddingLeft();
        int paddingRight = bVar.getPaddingRight();
        int width = bVar.getWidth();
        int i2 = bVar.i;
        if (i2 == -2) {
            int iA = bVar.a(this.q0, s8Var.getBackground());
            int i3 = (bVar.getContext().getResources().getDisplayMetrics().widthPixels - rect.left) - rect.right;
            if (iA > i3) {
                iA = i3;
            }
            r(Math.max(iA, (width - paddingLeft) - paddingRight));
        } else if (i2 == -1) {
            r((width - paddingLeft) - paddingRight);
        } else {
            r(i2);
        }
        boolean z2 = f72.a;
        this.f = bVar.getLayoutDirection() == 1 ? (((width - paddingRight) - this.e) - this.s0) + i : paddingLeft + this.s0 + i;
    }
}
