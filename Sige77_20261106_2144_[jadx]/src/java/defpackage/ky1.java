package defpackage;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class ky1 implements b41 {
    public i31 a;
    public o31 b;
    public final /* synthetic */ Toolbar c;

    public ky1(Toolbar toolbar) {
        this.c = toolbar;
    }

    @Override // defpackage.b41
    public final boolean b(o31 o31Var) {
        Toolbar toolbar = this.c;
        KeyEvent.Callback callback = toolbar.w;
        if (callback instanceof fo) {
            ((fo) callback).onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.w);
        toolbar.removeView(toolbar.v);
        toolbar.w = null;
        ArrayList arrayList = toolbar.u0;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.b = null;
        toolbar.requestLayout();
        o31Var.C = false;
        o31Var.n.p(false);
        toolbar.w();
        return true;
    }

    @Override // defpackage.b41
    public final boolean e(o31 o31Var) {
        Toolbar toolbar = this.c;
        toolbar.c();
        ViewParent parent = toolbar.v.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.v);
            }
            toolbar.addView(toolbar.v);
        }
        View actionView = o31Var.getActionView();
        toolbar.w = actionView;
        this.b = o31Var;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.w);
            }
            ly1 ly1VarH = Toolbar.h();
            ly1VarH.a = (toolbar.d0 & 112) | 8388611;
            ly1VarH.b = 2;
            toolbar.w.setLayoutParams(ly1VarH);
            toolbar.addView(toolbar.w);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            ActionMenuView childAt = toolbar.getChildAt(childCount);
            if (((ly1) childAt.getLayoutParams()).b != 2 && childAt != toolbar.a) {
                toolbar.removeViewAt(childCount);
                toolbar.u0.add(childAt);
            }
        }
        toolbar.requestLayout();
        o31Var.C = true;
        o31Var.n.p(false);
        KeyEvent.Callback callback = toolbar.w;
        if (callback instanceof fo) {
            ((fo) callback).onActionViewExpanded();
        }
        toolbar.w();
        return true;
    }

    @Override // defpackage.b41
    public final void g() {
        if (this.b != null) {
            i31 i31Var = this.a;
            if (i31Var != null) {
                int size = i31Var.f.size();
                for (int i = 0; i < size; i++) {
                    if (this.a.getItem(i) == this.b) {
                        return;
                    }
                }
            }
            b(this.b);
        }
    }

    @Override // defpackage.b41
    public final void i(Context context, i31 i31Var) {
        o31 o31Var;
        i31 i31Var2 = this.a;
        if (i31Var2 != null && (o31Var = this.b) != null) {
            i31Var2.d(o31Var);
        }
        this.a = i31Var;
    }

    @Override // defpackage.b41
    public final boolean j(tu1 tu1Var) {
        return false;
    }

    @Override // defpackage.b41
    public final boolean k() {
        return false;
    }

    @Override // defpackage.b41
    public final void f(i31 i31Var, boolean z) {
    }
}
