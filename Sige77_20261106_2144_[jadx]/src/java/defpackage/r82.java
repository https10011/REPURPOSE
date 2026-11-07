package defpackage;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class r82 extends j3 implements p3 {
    public static final AccelerateInterpolator y = new AccelerateInterpolator();
    public static final DecelerateInterpolator z = new DecelerateInterpolator();
    public Context a;
    public Context b;
    public ActionBarOverlayLayout c;
    public ActionBarContainer d;
    public my e;
    public ActionBarContextView f;
    public final View g;
    public boolean h;
    public q82 i;
    public q82 j;
    public f91 k;
    public boolean l;
    public final ArrayList m;
    public int n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public z62 s;
    public boolean t;
    public boolean u;
    public final p82 v;
    public final p82 w;
    public final kj0 x;

    public r82(Activity activity, boolean z2) {
        new ArrayList();
        this.m = new ArrayList();
        this.n = 0;
        this.o = true;
        this.r = true;
        this.v = new p82(this, 0);
        this.w = new p82(this, 1);
        this.x = new kj0(this, 23);
        View decorView = activity.getWindow().getDecorView();
        q(decorView);
        if (z2) {
            return;
        }
        this.g = decorView.findViewById(R.id.content);
    }

    @Override // defpackage.j3
    public final boolean b() {
        ky1 ky1Var;
        my myVar = this.e;
        if (myVar == null || (ky1Var = ((qy1) myVar).a.C0) == null || ky1Var.b == null) {
            return false;
        }
        ky1 ky1Var2 = ((qy1) myVar).a.C0;
        o31 o31Var = ky1Var2 == null ? null : ky1Var2.b;
        if (o31Var == null) {
            return true;
        }
        o31Var.collapseActionView();
        return true;
    }

    @Override // defpackage.j3
    public final void c(boolean z2) {
        if (z2 == this.l) {
            return;
        }
        this.l = z2;
        ArrayList arrayList = this.m;
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        ur.a();
    }

    @Override // defpackage.j3
    public final int d() {
        return ((qy1) this.e).b;
    }

    @Override // defpackage.j3
    public final Context e() {
        if (this.b == null) {
            TypedValue typedValue = new TypedValue();
            this.a.getTheme().resolveAttribute(2130968589, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.b = new ContextThemeWrapper(this.a, i);
            } else {
                this.b = this.a;
            }
        }
        return this.b;
    }

    @Override // defpackage.j3
    public final void g() {
        r(this.a.getResources().getBoolean(2131034112));
    }

    @Override // defpackage.j3
    public final boolean i(int i, KeyEvent keyEvent) {
        i31 i31Var;
        q82 q82Var = this.i;
        if (q82Var == null || (i31Var = q82Var.d) == null) {
            return false;
        }
        i31Var.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
        return i31Var.performShortcut(i, keyEvent, 0);
    }

    @Override // defpackage.j3
    public final void l(boolean z2) {
        if (this.h) {
            return;
        }
        int i = z2 ? 4 : 0;
        qy1 qy1Var = (qy1) this.e;
        int i2 = qy1Var.b;
        this.h = true;
        qy1Var.a((i & 4) | (i2 & (-5)));
    }

    @Override // defpackage.j3
    public final void m(boolean z2) {
        z62 z62Var;
        this.t = z2;
        if (z2 || (z62Var = this.s) == null) {
            return;
        }
        z62Var.a();
    }

    @Override // defpackage.j3
    public final void n(CharSequence charSequence) {
        qy1 qy1Var = (qy1) this.e;
        if (qy1Var.g) {
            return;
        }
        Toolbar toolbar = qy1Var.a;
        qy1Var.h = charSequence;
        if ((qy1Var.b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (qy1Var.g) {
                x52.o(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // defpackage.j3
    public final e4 o(f91 f91Var) {
        q82 q82Var = this.i;
        if (q82Var != null) {
            q82Var.a();
        }
        this.c.setHideOnContentScrollEnabled(false);
        this.f.e();
        q82 q82Var2 = new q82(this, this.f.getContext(), f91Var);
        i31 i31Var = q82Var2.d;
        i31Var.w();
        try {
            boolean zC = ((d4) q82Var2.e.b).c(q82Var2, i31Var);
            i31Var.v();
            if (!zC) {
                return null;
            }
            this.i = q82Var2;
            q82Var2.i();
            this.f.c(q82Var2);
            p(true);
            return q82Var2;
        } catch (Throwable th) {
            i31Var.v();
            throw th;
        }
    }

    public final void p(boolean z2) {
        y62 y62VarI;
        y62 y62VarI2;
        boolean z3 = this.q;
        if (z2) {
            if (!z3) {
                this.q = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.c;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                s(false);
            }
        } else if (z3) {
            this.q = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.c;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            s(false);
        }
        boolean zIsLaidOut = this.d.isLaidOut();
        my myVar = this.e;
        if (!zIsLaidOut) {
            if (z2) {
                ((qy1) myVar).a.setVisibility(4);
                this.f.setVisibility(0);
                return;
            } else {
                ((qy1) myVar).a.setVisibility(0);
                this.f.setVisibility(8);
                return;
            }
        }
        if (z2) {
            qy1 qy1Var = (qy1) myVar;
            y62VarI = x52.a(qy1Var.a);
            y62VarI.a(0.0f);
            y62VarI.c(100L);
            y62VarI.d(new py1(qy1Var, 4));
            y62VarI2 = this.f.i(0, 200L);
        } else {
            qy1 qy1Var2 = (qy1) myVar;
            y62 y62VarA = x52.a(qy1Var2.a);
            y62VarA.a(1.0f);
            y62VarA.c(200L);
            y62VarA.d(new py1(qy1Var2, 0));
            y62VarI = this.f.i(8, 100L);
            y62VarI2 = y62VarA;
        }
        z62 z62Var = new z62();
        ArrayList arrayList = z62Var.a;
        arrayList.add(y62VarI);
        View view = (View) y62VarI.a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) y62VarI2.a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(y62VarI2);
        z62Var.b();
    }

    public final void q(View view) {
        my wrapper;
        ActionBarOverlayLayout actionBarOverlayLayoutFindViewById = view.findViewById(2131296433);
        this.c = actionBarOverlayLayoutFindViewById;
        if (actionBarOverlayLayoutFindViewById != null) {
            actionBarOverlayLayoutFindViewById.setActionBarVisibilityCallback(this);
        }
        Toolbar toolbarFindViewById = view.findViewById(2131296308);
        if (toolbarFindViewById instanceof my) {
            wrapper = (my) toolbarFindViewById;
        } else {
            if (!(toolbarFindViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(toolbarFindViewById != null ? toolbarFindViewById.getClass().getSimpleName() : "null"));
            }
            wrapper = toolbarFindViewById.getWrapper();
        }
        this.e = wrapper;
        this.f = view.findViewById(2131296316);
        ActionBarContainer actionBarContainerFindViewById = view.findViewById(2131296310);
        this.d = actionBarContainerFindViewById;
        my myVar = this.e;
        if (myVar == null || this.f == null || actionBarContainerFindViewById == null) {
            uq1.q(r82.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
            return;
        }
        Context context = ((qy1) myVar).a.getContext();
        this.a = context;
        if ((((qy1) this.e).b & 4) != 0) {
            this.h = true;
        }
        int i = context.getApplicationInfo().targetSdkVersion;
        this.e.getClass();
        r(context.getResources().getBoolean(2131034112));
        TypedArray typedArrayObtainStyledAttributes = this.a.obtainStyledAttributes(null, we1.a, 2130968584, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout = this.c;
            if (!actionBarOverlayLayout.i) {
                uq1.q("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
                return;
            } else {
                this.u = true;
                actionBarOverlayLayout.setHideOnContentScrollEnabled(true);
            }
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer = this.d;
            WeakHashMap weakHashMap = x52.a;
            actionBarContainer.setElevation(dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void r(boolean z2) {
        if (z2) {
            this.d.setTabContainer((im1) null);
            ((qy1) this.e).getClass();
        } else {
            ((qy1) this.e).getClass();
            this.d.setTabContainer((im1) null);
        }
        this.e.getClass();
        ((qy1) this.e).a.setCollapsible(false);
        this.c.setHasNonEmbeddedTabs(false);
    }

    public final void s(boolean z2) {
        boolean z3 = this.q || !this.p;
        boolean z4 = this.r;
        kj0 kj0Var = this.x;
        View view = this.g;
        if (!z3) {
            if (z4) {
                this.r = false;
                z62 z62Var = this.s;
                if (z62Var != null) {
                    z62Var.a();
                }
                int i = this.n;
                p82 p82Var = this.v;
                if (i != 0 || (!this.t && !z2)) {
                    p82Var.a();
                    return;
                }
                this.d.setAlpha(1.0f);
                this.d.setTransitioning(true);
                z62 z62Var2 = new z62();
                float f = -this.d.getHeight();
                if (z2) {
                    int[] iArr = {0, 0};
                    this.d.getLocationInWindow(iArr);
                    f -= iArr[1];
                }
                y62 y62VarA = x52.a(this.d);
                y62VarA.e(f);
                View view2 = (View) y62VarA.a.get();
                if (view2 != null) {
                    view2.animate().setUpdateListener(kj0Var != null ? new r30(kj0Var, view2) : null);
                }
                boolean z5 = z62Var2.e;
                ArrayList arrayList = z62Var2.a;
                if (!z5) {
                    arrayList.add(y62VarA);
                }
                if (this.o && view != null) {
                    y62 y62VarA2 = x52.a(view);
                    y62VarA2.e(f);
                    if (!z62Var2.e) {
                        arrayList.add(y62VarA2);
                    }
                }
                boolean z6 = z62Var2.e;
                if (!z6) {
                    z62Var2.c = y;
                }
                if (!z6) {
                    z62Var2.b = 250L;
                }
                if (!z6) {
                    z62Var2.d = p82Var;
                }
                this.s = z62Var2;
                z62Var2.b();
                return;
            }
            return;
        }
        if (z4) {
            return;
        }
        this.r = true;
        z62 z62Var3 = this.s;
        if (z62Var3 != null) {
            z62Var3.a();
        }
        this.d.setVisibility(0);
        int i2 = this.n;
        p82 p82Var2 = this.w;
        if (i2 == 0 && (this.t || z2)) {
            this.d.setTranslationY(0.0f);
            float f2 = -this.d.getHeight();
            if (z2) {
                int[] iArr2 = {0, 0};
                this.d.getLocationInWindow(iArr2);
                f2 -= iArr2[1];
            }
            this.d.setTranslationY(f2);
            z62 z62Var4 = new z62();
            y62 y62VarA3 = x52.a(this.d);
            y62VarA3.e(0.0f);
            View view3 = (View) y62VarA3.a.get();
            if (view3 != null) {
                view3.animate().setUpdateListener(kj0Var != null ? new r30(kj0Var, view3) : null);
            }
            boolean z7 = z62Var4.e;
            ArrayList arrayList2 = z62Var4.a;
            if (!z7) {
                arrayList2.add(y62VarA3);
            }
            if (this.o && view != null) {
                view.setTranslationY(f2);
                y62 y62VarA4 = x52.a(view);
                y62VarA4.e(0.0f);
                if (!z62Var4.e) {
                    arrayList2.add(y62VarA4);
                }
            }
            boolean z8 = z62Var4.e;
            if (!z8) {
                z62Var4.c = z;
            }
            if (!z8) {
                z62Var4.b = 250L;
            }
            if (!z8) {
                z62Var4.d = p82Var2;
            }
            this.s = z62Var4;
            z62Var4.b();
        } else {
            this.d.setAlpha(1.0f);
            this.d.setTranslationY(0.0f);
            if (this.o && view != null) {
                view.setTranslationY(0.0f);
            }
            p82Var2.a();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.c;
        if (actionBarOverlayLayout != null) {
            WeakHashMap weakHashMap = x52.a;
            actionBarOverlayLayout.requestApplyInsets();
        }
    }

    public r82(Dialog dialog) {
        new ArrayList();
        this.m = new ArrayList();
        this.n = 0;
        this.o = true;
        this.r = true;
        this.v = new p82(this, 0);
        this.w = new p82(this, 1);
        this.x = new kj0(this, 23);
        q(dialog.getWindow().getDecorView());
    }
}
