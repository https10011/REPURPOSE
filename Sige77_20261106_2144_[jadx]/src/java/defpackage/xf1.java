package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class xf1 {
    public ac2 a;
    public RecyclerView b;
    public final hd2 c;
    public final hd2 d;
    public yx0 e;
    public boolean f;
    public boolean g;
    public final boolean h;
    public final boolean i;
    public int j;
    public boolean k;
    public int l;
    public int m;
    public int n;
    public int o;

    public xf1() {
        ox1 ox1Var = new ox1(this);
        ri2 ri2Var = new ri2(this);
        this.c = new hd2(ox1Var);
        this.d = new hd2(ri2Var);
        this.f = false;
        this.g = false;
        this.h = true;
        this.i = true;
    }

    public static int A(View view) {
        Rect rect = ((yf1) view.getLayoutParams()).b;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    public static int H(View view) {
        return ((yf1) view.getLayoutParams()).a.b();
    }

    public static wf1 I(Context context, AttributeSet attributeSet, int i, int i2) {
        wf1 wf1Var = new wf1();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, te1.a, i, i2);
        wf1Var.a = typedArrayObtainStyledAttributes.getInt(0, 1);
        wf1Var.b = typedArrayObtainStyledAttributes.getInt(10, 1);
        wf1Var.c = typedArrayObtainStyledAttributes.getBoolean(9, false);
        wf1Var.d = typedArrayObtainStyledAttributes.getBoolean(11, false);
        typedArrayObtainStyledAttributes.recycle();
        return wf1Var;
    }

    public static boolean M(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (i3 > 0 && i != i3) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i;
        }
        return true;
    }

    public static void N(View view, int i, int i2, int i3, int i4) {
        yf1 yf1Var = (yf1) view.getLayoutParams();
        Rect rect = yf1Var.b;
        view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) yf1Var).leftMargin, i2 + rect.top + ((ViewGroup.MarginLayoutParams) yf1Var).topMargin, (i3 - rect.right) - ((ViewGroup.MarginLayoutParams) yf1Var).rightMargin, (i4 - rect.bottom) - ((ViewGroup.MarginLayoutParams) yf1Var).bottomMargin);
    }

    public static int g(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode != Integer.MIN_VALUE) {
            return mode != 1073741824 ? Math.max(i2, i3) : size;
        }
        return Math.min(size, Math.max(i2, i3));
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001a  */
    /* JADX WARN: Code duplicated, block: B:14:0x0022  */
    /* JADX WARN: Code duplicated, block: B:5:0x0010  */
    public static int w(boolean z, int i, int i2, int i3, int i4) {
        int iMax = Math.max(0, i - i3);
        if (z) {
            if (i4 >= 0) {
                i2 = 1073741824;
            } else if (i4 != -1 || (i2 != Integer.MIN_VALUE && (i2 == 0 || i2 != 1073741824))) {
                i2 = 0;
                i4 = 0;
            } else {
                i4 = iMax;
            }
        } else if (i4 >= 0) {
            i2 = 1073741824;
        } else if (i4 == -1) {
            i4 = iMax;
        } else if (i4 != -2) {
            i2 = 0;
            i4 = 0;
        } else if (i2 == Integer.MIN_VALUE || i2 == 1073741824) {
            i4 = iMax;
            i2 = Integer.MIN_VALUE;
        } else {
            i4 = iMax;
            i2 = 0;
        }
        return View.MeasureSpec.makeMeasureSpec(i4, i2);
    }

    public static int z(View view) {
        Rect rect = ((yf1) view.getLayoutParams()).b;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    public boolean A0() {
        return false;
    }

    public final int B() {
        RecyclerView recyclerView = this.b;
        pf1 adapter = recyclerView != null ? recyclerView.getAdapter() : null;
        if (adapter != null) {
            return adapter.a();
        }
        return 0;
    }

    public final int C() {
        RecyclerView recyclerView = this.b;
        WeakHashMap weakHashMap = x52.a;
        return recyclerView.getLayoutDirection();
    }

    public final int D() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public final int E() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public final int F() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int G() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public int J(dg1 dg1Var, hg1 hg1Var) {
        return -1;
    }

    public final void K(Rect rect, View view) {
        Matrix matrix;
        Rect rect2 = ((yf1) view.getLayoutParams()).b;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.b.W;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public abstract boolean L();

    public void O(int i) {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            int iB = recyclerView.e.B();
            for (int i2 = 0; i2 < iB; i2++) {
                recyclerView.e.A(i2).offsetLeftAndRight(i);
            }
        }
    }

    public void P(int i) {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            int iB = recyclerView.e.B();
            for (int i2 = 0; i2 < iB; i2++) {
                recyclerView.e.A(i2).offsetTopAndBottom(i);
            }
        }
    }

    public abstract void S(RecyclerView recyclerView);

    public abstract View T(View view, int i, dg1 dg1Var, hg1 hg1Var);

    public void U(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.b;
        dg1 dg1Var = recyclerView.b;
        hg1 hg1Var = recyclerView.Q0;
        if (recyclerView == null || accessibilityEvent == null) {
            return;
        }
        boolean z = true;
        if (!recyclerView.canScrollVertically(1) && !this.b.canScrollVertically(-1) && !this.b.canScrollHorizontally(-1) && !this.b.canScrollHorizontally(1)) {
            z = false;
        }
        accessibilityEvent.setScrollable(z);
        pf1 pf1Var = this.b.a0;
        if (pf1Var != null) {
            accessibilityEvent.setItemCount(pf1Var.a());
        }
    }

    public final void W(View view, x2 x2Var) {
        kg1 kg1VarI = RecyclerView.I(view);
        if (kg1VarI == null || kg1VarI.h()) {
            return;
        }
        ac2 ac2Var = this.a;
        if (((ArrayList) ac2Var.d).contains(kg1VarI.a)) {
            return;
        }
        RecyclerView recyclerView = this.b;
        V(recyclerView.b, recyclerView.Q0, view, x2Var);
    }

    public final void b(View view, int i, boolean z) {
        kg1 kg1VarI = RecyclerView.I(view);
        if (z || kg1VarI.h()) {
            wq1 wq1Var = (wq1) this.b.f.a;
            k62 k62VarA = (k62) wq1Var.get(kg1VarI);
            if (k62VarA == null) {
                k62VarA = k62.a();
                wq1Var.put(kg1VarI, k62VarA);
            }
            k62VarA.a |= 1;
        } else {
            this.b.f.g(kg1VarI);
        }
        yf1 yf1Var = (yf1) view.getLayoutParams();
        if (kg1VarI.p() || kg1VarI.i()) {
            if (kg1VarI.i()) {
                kg1VarI.n.k(kg1VarI);
            } else {
                kg1VarI.j &= -33;
            }
            this.a.q(view, i, view.getLayoutParams(), false);
        } else {
            RecyclerView parent = view.getParent();
            RecyclerView recyclerView = this.b;
            ac2 ac2Var = this.a;
            if (parent == recyclerView) {
                jm jmVar = (jm) ac2Var.c;
                int iIndexOfChild = ((RecyclerView) ((wa) ac2Var.b).b).indexOfChild(view);
                int iB = (iIndexOfChild == -1 || jmVar.d(iIndexOfChild)) ? -1 : iIndexOfChild - jmVar.b(iIndexOfChild);
                if (i == -1) {
                    i = this.a.B();
                }
                if (iB == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.b.indexOfChild(view) + this.b.y());
                }
                if (iB != i) {
                    xf1 xf1Var = this.b.b0;
                    View viewU = xf1Var.u(iB);
                    if (viewU == null) {
                        throw new IllegalArgumentException("Cannot move a child from non-existing index:" + iB + xf1Var.b.toString());
                    }
                    xf1Var.u(iB);
                    xf1Var.a.u(iB);
                    yf1 yf1Var2 = (yf1) viewU.getLayoutParams();
                    kg1 kg1VarI2 = RecyclerView.I(viewU);
                    boolean zH = kg1VarI2.h();
                    RecyclerView recyclerView2 = xf1Var.b;
                    if (zH) {
                        wq1 wq1Var2 = (wq1) recyclerView2.f.a;
                        k62 k62VarA2 = (k62) wq1Var2.get(kg1VarI2);
                        if (k62VarA2 == null) {
                            k62VarA2 = k62.a();
                            wq1Var2.put(kg1VarI2, k62VarA2);
                        }
                        k62VarA2.a = 1 | k62VarA2.a;
                    } else {
                        recyclerView2.f.g(kg1VarI2);
                    }
                    xf1Var.a.q(viewU, i, yf1Var2, kg1VarI2.h());
                }
            } else {
                ac2Var.p(view, i, false);
                yf1Var.c = true;
                yx0 yx0Var = this.e;
                if (yx0Var != null && yx0Var.e) {
                    yx0Var.b.getClass();
                    kg1 kg1VarI3 = RecyclerView.I(view);
                    if ((kg1VarI3 != null ? kg1VarI3.b() : -1) == yx0Var.a) {
                        yx0Var.f = view;
                    }
                }
            }
        }
        if (yf1Var.d) {
            kg1VarI.a.invalidate();
            yf1Var.d = false;
        }
    }

    public void c(String str) {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            recyclerView.i(str);
        }
    }

    public abstract void c0(dg1 dg1Var, hg1 hg1Var);

    public abstract boolean d();

    public abstract void d0(hg1 hg1Var);

    public abstract boolean e();

    public boolean f(yf1 yf1Var) {
        return yf1Var != null;
    }

    public Parcelable f0() {
        return null;
    }

    public final void h0(dg1 dg1Var) {
        for (int iV = v() - 1; iV >= 0; iV--) {
            if (!RecyclerView.I(u(iV)).o()) {
                View viewU = u(iV);
                k0(iV);
                dg1Var.g(viewU);
            }
        }
    }

    public final void i0(dg1 dg1Var) {
        ArrayList arrayList;
        int size = dg1Var.a.size();
        int i = size - 1;
        while (true) {
            arrayList = dg1Var.a;
            if (i < 0) {
                break;
            }
            View view = ((kg1) arrayList.get(i)).a;
            kg1 kg1VarI = RecyclerView.I(view);
            if (!kg1VarI.o()) {
                kg1VarI.n(false);
                if (kg1VarI.j()) {
                    this.b.removeDetachedView(view, false);
                }
                uf1 uf1Var = this.b.y0;
                if (uf1Var != null) {
                    uf1Var.d(kg1VarI);
                }
                kg1VarI.n(true);
                kg1 kg1VarI2 = RecyclerView.I(view);
                kg1VarI2.n = null;
                kg1VarI2.o = false;
                kg1VarI2.j &= -33;
                dg1Var.h(kg1VarI2);
            }
            i--;
        }
        arrayList.clear();
        ArrayList arrayList2 = dg1Var.b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.b.invalidate();
        }
    }

    public abstract int j(hg1 hg1Var);

    public final void j0(View view, dg1 dg1Var) {
        ac2 ac2Var = this.a;
        wa waVar = (wa) ac2Var.b;
        int iIndexOfChild = ((RecyclerView) waVar.b).indexOfChild(view);
        if (iIndexOfChild >= 0) {
            if (((jm) ac2Var.c).f(iIndexOfChild)) {
                ac2Var.T(view);
            }
            waVar.m(iIndexOfChild);
        }
        dg1Var.g(view);
    }

    public abstract int k(hg1 hg1Var);

    public final void k0(int i) {
        if (u(i) != null) {
            ac2 ac2Var = this.a;
            int iE = ac2Var.E(i);
            wa waVar = (wa) ac2Var.b;
            View childAt = ((RecyclerView) waVar.b).getChildAt(iE);
            if (childAt == null) {
                return;
            }
            if (((jm) ac2Var.c).f(iE)) {
                ac2Var.T(childAt);
            }
            waVar.m(iE);
        }
    }

    public abstract int l(hg1 hg1Var);

    /* JADX WARN: Code duplicated, block: B:28:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ba  */
    public boolean l0(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        int iE = E();
        int iG = G();
        int iF = this.n - F();
        int iD = this.o - D();
        int left = (view.getLeft() + rect.left) - view.getScrollX();
        int top = (view.getTop() + rect.top) - view.getScrollY();
        int iWidth = rect.width() + left;
        int iHeight = rect.height() + top;
        int i = left - iE;
        int iMin = Math.min(0, i);
        int i2 = top - iG;
        int iMin2 = Math.min(0, i2);
        int i3 = iWidth - iF;
        int iMax = Math.max(0, i3);
        int iMax2 = Math.max(0, iHeight - iD);
        if (C() != 1) {
            if (iMin == 0) {
                iMin = Math.min(i, iMax);
            }
            iMax = iMin;
        } else if (iMax == 0) {
            iMax = Math.max(iMin, i3);
        }
        if (iMin2 == 0) {
            iMin2 = Math.min(i2, iMax2);
        }
        int[] iArr = {iMax, iMin2};
        int i4 = iArr[0];
        int i5 = iArr[1];
        if (z2) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild != null) {
                int iE2 = E();
                int iG2 = G();
                int iF2 = this.n - F();
                int iD2 = this.o - D();
                Rect rect2 = this.b.v;
                y(rect2, focusedChild);
                if (rect2.left - i4 < iF2 && rect2.right - i4 > iE2 && rect2.top - i5 < iD2 && rect2.bottom - i5 > iG2) {
                    if (i4 == 0) {
                    }
                    if (z) {
                        recyclerView.scrollBy(i4, i5);
                        return true;
                    }
                    recyclerView.a0(i4, i5, false);
                    return true;
                }
            }
        } else if (i4 == 0 || i5 != 0) {
            if (z) {
                recyclerView.scrollBy(i4, i5);
                return true;
            }
            recyclerView.a0(i4, i5, false);
            return true;
        }
        return false;
    }

    public abstract int m(hg1 hg1Var);

    public final void m0() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public abstract int n(hg1 hg1Var);

    public abstract int n0(int i, dg1 dg1Var, hg1 hg1Var);

    public abstract int o(hg1 hg1Var);

    public abstract void o0(int i);

    public final void p(dg1 dg1Var) {
        for (int iV = v() - 1; iV >= 0; iV--) {
            View viewU = u(iV);
            kg1 kg1VarI = RecyclerView.I(viewU);
            if (!kg1VarI.o()) {
                if (!kg1VarI.f() || kg1VarI.h() || this.b.a0.b) {
                    u(iV);
                    this.a.u(iV);
                    dg1Var.i(viewU);
                    this.b.f.g(kg1VarI);
                } else {
                    k0(iV);
                    dg1Var.h(kg1VarI);
                }
            }
        }
    }

    public abstract int p0(int i, dg1 dg1Var, hg1 hg1Var);

    public View q(int i) {
        int iV = v();
        for (int i2 = 0; i2 < iV; i2++) {
            View viewU = u(i2);
            kg1 kg1VarI = RecyclerView.I(viewU);
            if (kg1VarI != null && kg1VarI.b() == i && !kg1VarI.o() && (this.b.Q0.g || !kg1VarI.h())) {
                return viewU;
            }
        }
        return null;
    }

    public final void q0(RecyclerView recyclerView) {
        r0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    public abstract yf1 r();

    public final void r0(int i, int i2) {
        this.n = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        this.l = mode;
        if (mode == 0) {
            int[] iArr = RecyclerView.j1;
        }
        this.o = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        this.m = mode2;
        if (mode2 == 0) {
            int[] iArr2 = RecyclerView.j1;
        }
    }

    public yf1 s(Context context, AttributeSet attributeSet) {
        return new yf1(context, attributeSet);
    }

    public void s0(Rect rect, int i, int i2) {
        int iF = F() + E() + rect.width();
        int iD = D() + G() + rect.height();
        RecyclerView recyclerView = this.b;
        WeakHashMap weakHashMap = x52.a;
        RecyclerView.e(this.b, g(i, iF, recyclerView.getMinimumWidth()), g(i2, iD, this.b.getMinimumHeight()));
    }

    public yf1 t(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof yf1) {
            return new yf1((yf1) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new yf1((ViewGroup.MarginLayoutParams) layoutParams) : new yf1(layoutParams);
    }

    public final void t0(int i, int i2) {
        int iV = v();
        if (iV == 0) {
            this.b.n(i, i2);
            return;
        }
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MAX_VALUE;
        int i5 = Integer.MIN_VALUE;
        int i6 = Integer.MAX_VALUE;
        for (int i7 = 0; i7 < iV; i7++) {
            View viewU = u(i7);
            Rect rect = this.b.v;
            y(rect, viewU);
            int i8 = rect.left;
            if (i8 < i6) {
                i6 = i8;
            }
            int i9 = rect.right;
            if (i9 > i3) {
                i3 = i9;
            }
            int i10 = rect.top;
            if (i10 < i4) {
                i4 = i10;
            }
            int i11 = rect.bottom;
            if (i11 > i5) {
                i5 = i11;
            }
        }
        this.b.v.set(i6, i4, i3, i5);
        s0(this.b.v, i, i2);
    }

    public final View u(int i) {
        ac2 ac2Var = this.a;
        if (ac2Var != null) {
            return ac2Var.A(i);
        }
        return null;
    }

    public final void u0(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.b = null;
            this.a = null;
            this.n = 0;
            this.o = 0;
        } else {
            this.b = recyclerView;
            this.a = recyclerView.e;
            this.n = recyclerView.getWidth();
            this.o = recyclerView.getHeight();
        }
        this.l = 1073741824;
        this.m = 1073741824;
    }

    public final int v() {
        ac2 ac2Var = this.a;
        if (ac2Var != null) {
            return ac2Var.B();
        }
        return 0;
    }

    public final boolean v0(View view, int i, int i2, yf1 yf1Var) {
        return (!view.isLayoutRequested() && this.h && M(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) yf1Var).width) && M(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) yf1Var).height)) ? false : true;
    }

    public boolean w0() {
        return false;
    }

    public int x(dg1 dg1Var, hg1 hg1Var) {
        return -1;
    }

    public final boolean x0(View view, int i, int i2, yf1 yf1Var) {
        return (this.h && M(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) yf1Var).width) && M(view.getMeasuredHeight(), i2, ((ViewGroup.MarginLayoutParams) yf1Var).height)) ? false : true;
    }

    public void y(Rect rect, View view) {
        int[] iArr = RecyclerView.j1;
        yf1 yf1Var = (yf1) view.getLayoutParams();
        Rect rect2 = yf1Var.b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) yf1Var).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) yf1Var).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) yf1Var).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) yf1Var).bottomMargin);
    }

    public abstract void y0(RecyclerView recyclerView, int i);

    public final void z0(yx0 yx0Var) {
        yx0 yx0Var2 = this.e;
        if (yx0Var2 != null && yx0Var != yx0Var2 && yx0Var2.e) {
            yx0Var2.i();
        }
        this.e = yx0Var;
        RecyclerView recyclerView = this.b;
        jg1 jg1Var = recyclerView.N0;
        jg1Var.i.removeCallbacks(jg1Var);
        jg1Var.c.abortAnimation();
        if (yx0Var.h) {
            Log.w("RecyclerView", "An instance of " + yx0Var.getClass().getSimpleName() + " was started more than once. Each instance of" + yx0Var.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        yx0Var.b = recyclerView;
        yx0Var.c = this;
        int i = yx0Var.a;
        if (i == -1) {
            e.g("Invalid target position");
            return;
        }
        recyclerView.Q0.a = i;
        yx0Var.e = true;
        yx0Var.d = true;
        yx0Var.f = recyclerView.b0.q(i);
        yx0Var.b.N0.a();
        yx0Var.h = true;
    }

    public void Q() {
    }

    public void Y() {
    }

    public void R(RecyclerView recyclerView) {
    }

    public void e0(Parcelable parcelable) {
    }

    public void g0(int i) {
    }

    public void X(int i, int i2) {
    }

    public void Z(int i, int i2) {
    }

    public void a0(int i, int i2) {
    }

    public void b0(int i, int i2) {
    }

    public void i(int i, we weVar) {
    }

    public void V(dg1 dg1Var, hg1 hg1Var, View view, x2 x2Var) {
    }

    public void h(int i, int i2, hg1 hg1Var, we weVar) {
    }
}
