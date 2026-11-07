package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.AppCompatImageView;
import java.util.ArrayList;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class z3 implements b41 {
    public Drawable W;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public final Context a;
    public int a0;
    public Context b;
    public int b0;
    public i31 c;
    public int c0;
    public final LayoutInflater d;
    public boolean d0;
    public a41 e;
    public w3 f0;
    public w3 g0;
    public bh0 h0;
    public x3 i0;
    public e41 v;
    public y3 w;
    public final int f = 2131492867;
    public final int i = 2131492866;
    public final SparseBooleanArray e0 = new SparseBooleanArray();
    public final pv2 j0 = new pv2(this);

    public z3(Context context) {
        this.a = context;
        this.d = LayoutInflater.from(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View a(o31 o31Var, View view, ViewGroup viewGroup) {
        View actionView = o31Var.getActionView();
        if (actionView == null || o31Var.e()) {
            ActionMenuItemView actionMenuItemView = view instanceof d41 ? (d41) view : (d41) this.d.inflate(this.i, viewGroup, false);
            actionMenuItemView.c(o31Var);
            ActionMenuItemView actionMenuItemView2 = actionMenuItemView;
            actionMenuItemView2.setItemInvoker(this.v);
            if (this.i0 == null) {
                this.i0 = new x3(this);
            }
            actionMenuItemView2.setPopupCallback(this.i0);
            actionView = (View) actionMenuItemView;
        }
        actionView.setVisibility(o31Var.C ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof b4)) {
            actionView.setLayoutParams(ActionMenuView.k(layoutParams));
        }
        return actionView;
    }

    @Override // defpackage.b41
    public final boolean b(o31 o31Var) {
        return false;
    }

    public final boolean c() {
        Object obj;
        bh0 bh0Var = this.h0;
        if (bh0Var != null && (obj = this.v) != null) {
            ((View) obj).removeCallbacks(bh0Var);
            this.h0 = null;
            return true;
        }
        w3 w3Var = this.f0;
        if (w3Var == null) {
            return false;
        }
        if (w3Var.b()) {
            w3Var.i.dismiss();
        }
        return true;
    }

    @Override // defpackage.b41
    public final void d(a41 a41Var) {
        throw null;
    }

    @Override // defpackage.b41
    public final boolean e(o31 o31Var) {
        return false;
    }

    @Override // defpackage.b41
    public final void f(i31 i31Var, boolean z) {
        c();
        w3 w3Var = this.g0;
        if (w3Var != null && w3Var.b()) {
            w3Var.i.dismiss();
        }
        a41 a41Var = this.e;
        if (a41Var != null) {
            a41Var.f(i31Var, z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.b41
    public final void g() {
        int i;
        ViewGroup viewGroup = (ViewGroup) this.v;
        ArrayList arrayList = null;
        boolean z = false;
        if (viewGroup != null) {
            i31 i31Var = this.c;
            if (i31Var != null) {
                i31Var.i();
                ArrayList arrayListL = this.c.l();
                int size = arrayListL.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    o31 o31Var = (o31) arrayListL.get(i2);
                    if ((o31Var.x & 32) == 32) {
                        View childAt = viewGroup.getChildAt(i);
                        o31 itemData = childAt instanceof d41 ? ((d41) childAt).getItemData() : null;
                        View viewA = a(o31Var, childAt, viewGroup);
                        if (o31Var != itemData) {
                            viewA.setPressed(false);
                            viewA.jumpDrawablesToCurrentState();
                        }
                        if (viewA != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) viewA.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(viewA);
                            }
                            ((ViewGroup) this.v).addView(viewA, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.w) {
                    i++;
                } else {
                    viewGroup.removeViewAt(i);
                }
            }
        }
        ((View) this.v).requestLayout();
        i31 i31Var2 = this.c;
        if (i31Var2 != null) {
            i31Var2.i();
            ArrayList arrayList2 = i31Var2.i;
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                p31 p31Var = ((o31) arrayList2.get(i3)).A;
            }
        }
        i31 i31Var3 = this.c;
        if (i31Var3 != null) {
            i31Var3.i();
            arrayList = i31Var3.j;
        }
        if (this.Y && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z = !((o31) arrayList.get(0)).C;
            } else if (size3 > 0) {
                z = true;
            }
        }
        AppCompatImageView appCompatImageView = this.w;
        if (z) {
            if (appCompatImageView == null) {
                this.w = new y3(this, this.a);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.w.getParent();
            if (viewGroup3 != this.v) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.w);
                }
                ActionMenuView actionMenuView = this.v;
                AppCompatImageView appCompatImageView2 = this.w;
                actionMenuView.getClass();
                b4 b4VarJ = ActionMenuView.j();
                b4VarJ.a = true;
                actionMenuView.addView(appCompatImageView2, b4VarJ);
            }
        } else if (appCompatImageView != null) {
            Object parent = appCompatImageView.getParent();
            Object obj = this.v;
            if (parent == obj) {
                ((ViewGroup) obj).removeView(this.w);
            }
        }
        this.v.setOverflowReserved(this.Y);
    }

    public final boolean h() {
        w3 w3Var = this.f0;
        return w3Var != null && w3Var.b();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:17)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:3)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:14)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:101)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:74)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:21)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.a(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at pw0.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:44)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:32)
     */
    @Override // defpackage.b41
    public final void i(Context context, i31 i31Var) {
        this.b = context;
        LayoutInflater.from(context);
        this.c = i31Var;
        Resources resources = context.getResources();
        if (!this.Z) {
            this.Y = true;
        }
        int i = 2;
        this.a0 = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        int i3 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i2 > 600 || ((i2 > 960 && i3 > 720) || (i2 > 720 && i3 > 960))) {
            i = 5;
        } else if (i2 >= 500 || ((i2 > 640 && i3 > 480) || (i2 > 480 && i3 > 640))) {
            i = 4;
        } else if (i2 >= 360) {
            i = 3;
        }
        this.c0 = i;
        int measuredWidth = this.a0;
        if (this.Y) {
            if (this.w == null) {
                y3 y3Var = new y3(this, this.a);
                this.w = y3Var;
                if (this.X) {
                    y3Var.setImageDrawable(this.W);
                    this.W = null;
                    this.X = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.w.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.w.getMeasuredWidth();
        } else {
            this.w = null;
        }
        this.b0 = measuredWidth;
        float f = resources.getDisplayMetrics().density;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.b41
    public final boolean j(tu1 tu1Var) {
        boolean z;
        if (tu1Var.hasVisibleItems()) {
            tu1 tu1Var2 = tu1Var;
            while (true) {
                i31 i31Var = tu1Var2.z;
                if (i31Var == this.c) {
                    break;
                }
                tu1Var2 = (tu1) i31Var;
            }
            o31 o31Var = tu1Var2.A;
            ViewGroup viewGroup = (ViewGroup) this.v;
            View view = null;
            view = null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    if ((childAt instanceof d41) && ((d41) childAt).getItemData() == o31Var) {
                        view = childAt;
                        break;
                    }
                }
            }
            if (view != null) {
                tu1Var.A.getClass();
                int size = tu1Var.f.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        z = false;
                        break;
                    }
                    MenuItem item = tu1Var.getItem(i2);
                    if (item.isVisible() && item.getIcon() != null) {
                        z = true;
                        break;
                    }
                    i2++;
                }
                w3 w3Var = new w3(this, this.b, tu1Var, view);
                this.g0 = w3Var;
                w3Var.g = z;
                t31 t31Var = w3Var.i;
                if (t31Var != null) {
                    t31Var.o(z);
                }
                w3 w3Var2 = this.g0;
                if (!w3Var2.b()) {
                    if (w3Var2.e == null) {
                        uq1.q("MenuPopupHelper cannot be used without an anchor");
                        return false;
                    }
                    w3Var2.d(0, 0, false, false);
                }
                a41 a41Var = this.e;
                if (a41Var != null) {
                    a41Var.y(tu1Var);
                }
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.b41
    public final boolean k() {
        int size;
        ArrayList arrayListL;
        int i;
        boolean z;
        z3 z3Var = this;
        i31 i31Var = z3Var.c;
        if (i31Var != null) {
            arrayListL = i31Var.l();
            size = arrayListL.size();
        } else {
            size = 0;
            arrayListL = null;
        }
        int i2 = z3Var.c0;
        int i3 = z3Var.b0;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) z3Var.v;
        int i4 = 0;
        boolean z2 = false;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            i = 2;
            z = true;
            if (i4 >= size) {
                break;
            }
            o31 o31Var = (o31) arrayListL.get(i4);
            int i7 = o31Var.y;
            if ((i7 & 2) == 2) {
                i5++;
            } else if ((i7 & 1) == 1) {
                i6++;
            } else {
                z2 = true;
            }
            if (z3Var.d0 && o31Var.C) {
                i2 = 0;
            }
            i4++;
        }
        if (z3Var.Y && (z2 || i6 + i5 > i2)) {
            i2--;
        }
        int i8 = i2 - i5;
        SparseBooleanArray sparseBooleanArray = z3Var.e0;
        sparseBooleanArray.clear();
        int i9 = 0;
        int i10 = 0;
        while (i9 < size) {
            o31 o31Var2 = (o31) arrayListL.get(i9);
            int i11 = o31Var2.y;
            boolean z3 = (i11 & 2) == i ? z : false;
            int i12 = o31Var2.b;
            if (z3) {
                View viewA = z3Var.a(o31Var2, null, viewGroup);
                viewA.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredWidth = viewA.getMeasuredWidth();
                i3 -= measuredWidth;
                if (i10 == 0) {
                    i10 = measuredWidth;
                }
                if (i12 != 0) {
                    sparseBooleanArray.put(i12, z);
                }
                o31Var2.f(z);
            } else {
                if ((i11 & 1) == z) {
                    boolean z4 = sparseBooleanArray.get(i12);
                    boolean z5 = ((i8 > 0 || z4) && i3 > 0) ? z : false;
                    if (z5) {
                        View viewA2 = z3Var.a(o31Var2, null, viewGroup);
                        viewA2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                        int measuredWidth2 = viewA2.getMeasuredWidth();
                        i3 -= measuredWidth2;
                        if (i10 == 0) {
                            i10 = measuredWidth2;
                        }
                        z5 &= i3 + i10 > 0;
                    }
                    if (z5 && i12 != 0) {
                        sparseBooleanArray.put(i12, true);
                    } else if (z4) {
                        sparseBooleanArray.put(i12, false);
                        for (int i13 = 0; i13 < i9; i13++) {
                            o31 o31Var3 = (o31) arrayListL.get(i13);
                            if (o31Var3.b == i12) {
                                if ((o31Var3.x & 32) == 32) {
                                    i8++;
                                }
                                o31Var3.f(false);
                            }
                        }
                    }
                    if (z5) {
                        i8--;
                    }
                    o31Var2.f(z5);
                } else {
                    o31Var2.f(false);
                }
                i9++;
                i = 2;
                z3Var = this;
                z = true;
            }
            i9++;
            i = 2;
            z3Var = this;
            z = true;
        }
        return z;
    }

    public final boolean l() {
        i31 i31Var;
        boolean z = false;
        if (this.Y && !h() && (i31Var = this.c) != null && this.v != null && this.h0 == null) {
            i31Var.i();
            if (!i31Var.j.isEmpty()) {
                bh0 bh0Var = new bh0(2, this, new w3(this, this.b, this.c, (View) this.w), z);
                this.h0 = bh0Var;
                ((View) this.v).post(bh0Var);
                return true;
            }
        }
        return false;
    }
}
