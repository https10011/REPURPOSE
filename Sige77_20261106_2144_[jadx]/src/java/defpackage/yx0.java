package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public class yx0 {
    public int a = -1;
    public RecyclerView b;
    public xf1 c;
    public boolean d;
    public boolean e;
    public View f;
    public final fg1 g;
    public boolean h;
    public final LinearInterpolator i;
    public final DecelerateInterpolator j;
    public PointF k;
    public final DisplayMetrics l;
    public boolean m;
    public float n;
    public int o;
    public int p;

    public yx0(Context context) {
        fg1 fg1Var = new fg1();
        fg1Var.d = -1;
        fg1Var.f = false;
        fg1Var.g = 0;
        fg1Var.a = 0;
        fg1Var.b = 0;
        fg1Var.c = Integer.MIN_VALUE;
        fg1Var.e = null;
        this.g = fg1Var;
        this.i = new LinearInterpolator();
        this.j = new DecelerateInterpolator();
        this.m = false;
        this.o = 0;
        this.p = 0;
        this.l = context.getResources().getDisplayMetrics();
    }

    public static int a(int i, int i2, int i3, int i4, int i5) {
        if (i5 == -1) {
            return i3 - i;
        }
        if (i5 != 0) {
            if (i5 == 1) {
                return i4 - i2;
            }
            e.g("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
            return 0;
        }
        int i6 = i3 - i;
        if (i6 > 0) {
            return i6;
        }
        int i7 = i4 - i2;
        if (i7 < 0) {
            return i7;
        }
        return 0;
    }

    public int b(View view, int i) {
        xf1 xf1Var = this.c;
        if (xf1Var == null || !xf1Var.d()) {
            return 0;
        }
        yf1 yf1Var = (yf1) view.getLayoutParams();
        return a((view.getLeft() - ((yf1) view.getLayoutParams()).b.left) - ((ViewGroup.MarginLayoutParams) yf1Var).leftMargin, view.getRight() + ((yf1) view.getLayoutParams()).b.right + ((ViewGroup.MarginLayoutParams) yf1Var).rightMargin, xf1Var.E(), xf1Var.n - xf1Var.F(), i);
    }

    public int c(View view, int i) {
        xf1 xf1Var = this.c;
        if (xf1Var == null || !xf1Var.e()) {
            return 0;
        }
        yf1 yf1Var = (yf1) view.getLayoutParams();
        return a((view.getTop() - ((yf1) view.getLayoutParams()).b.top) - ((ViewGroup.MarginLayoutParams) yf1Var).topMargin, view.getBottom() + ((yf1) view.getLayoutParams()).b.bottom + ((ViewGroup.MarginLayoutParams) yf1Var).bottomMargin, xf1Var.G(), xf1Var.o - xf1Var.D(), i);
    }

    public float d(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public int e(int i) {
        float fAbs = Math.abs(i);
        if (!this.m) {
            this.n = d(this.l);
            this.m = true;
        }
        return (int) Math.ceil(fAbs * this.n);
    }

    public PointF f(int i) {
        Object obj = this.c;
        if (obj instanceof gg1) {
            return ((gg1) obj).a(i);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + gg1.class.getCanonicalName());
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00f8  */
    public final void g(int i, int i2) {
        PointF pointFF;
        RecyclerView recyclerView = this.b;
        if (this.a == -1 || recyclerView == null) {
            i();
        }
        if (this.d && this.f == null && this.c != null && (pointFF = f(this.a)) != null) {
            float f = pointFF.x;
            if (f != 0.0f || pointFF.y != 0.0f) {
                recyclerView.Y((int) Math.signum(f), (int) Math.signum(pointFF.y), (int[]) null);
            }
        }
        this.d = false;
        View view = this.f;
        fg1 fg1Var = this.g;
        if (view != null) {
            this.b.getClass();
            kg1 kg1VarI = RecyclerView.I(view);
            if ((kg1VarI != null ? kg1VarI.b() : -1) == this.a) {
                View view2 = this.f;
                hg1 hg1Var = recyclerView.Q0;
                h(view2, fg1Var);
                fg1Var.a(recyclerView);
                i();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.f = null;
            }
        }
        if (this.e) {
            hg1 hg1Var2 = recyclerView.Q0;
            if (this.b.b0.v() == 0) {
                i();
            } else {
                int i3 = this.o;
                int i4 = i3 - i;
                if (i3 * i4 <= 0) {
                    i4 = 0;
                }
                this.o = i4;
                int i5 = this.p;
                int i6 = i5 - i2;
                if (i5 * i6 <= 0) {
                    i6 = 0;
                }
                this.p = i6;
                if (i4 == 0 && i6 == 0) {
                    PointF pointFF2 = f(this.a);
                    if (pointFF2 != null) {
                        float f2 = pointFF2.x;
                        if (f2 == 0.0f && pointFF2.y == 0.0f) {
                            fg1Var.d = this.a;
                            i();
                        } else {
                            float f3 = pointFF2.y;
                            float fSqrt = (float) Math.sqrt((f3 * f3) + (f2 * f2));
                            float f4 = pointFF2.x / fSqrt;
                            pointFF2.x = f4;
                            float f5 = pointFF2.y / fSqrt;
                            pointFF2.y = f5;
                            this.k = pointFF2;
                            this.o = (int) (f4 * 10000.0f);
                            this.p = (int) (f5 * 10000.0f);
                            int iE = e(10000);
                            int i7 = (int) (this.o * 1.2f);
                            int i8 = (int) (this.p * 1.2f);
                            fg1Var.a = i7;
                            fg1Var.b = i8;
                            fg1Var.c = (int) (iE * 1.2f);
                            fg1Var.e = this.i;
                            fg1Var.f = true;
                        }
                    } else {
                        fg1Var.d = this.a;
                        i();
                    }
                }
            }
            boolean z = fg1Var.d >= 0;
            fg1Var.a(recyclerView);
            if (z && this.e) {
                this.d = true;
                recyclerView.N0.a();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0015  */
    public void h(View view, fg1 fg1Var) {
        int i;
        PointF pointF = this.k;
        int i2 = 0;
        if (pointF != null) {
            float f = pointF.x;
            if (f == 0.0f) {
                i = 0;
            } else {
                i = f > 0.0f ? 1 : -1;
            }
        } else {
            i = 0;
        }
        int iB = b(view, i);
        PointF pointF2 = this.k;
        if (pointF2 != null) {
            float f2 = pointF2.y;
            if (f2 != 0.0f) {
                i2 = f2 > 0.0f ? 1 : -1;
            }
        }
        int iC = c(view, i2);
        int iCeil = (int) Math.ceil(((double) e((int) Math.sqrt((iC * iC) + (iB * iB)))) / 0.3356d);
        if (iCeil > 0) {
            fg1Var.a = -iB;
            fg1Var.b = -iC;
            fg1Var.c = iCeil;
            fg1Var.e = this.j;
            fg1Var.f = true;
        }
    }

    public final void i() {
        if (this.e) {
            this.e = false;
            this.p = 0;
            this.o = 0;
            this.k = null;
            this.b.Q0.a = -1;
            this.f = null;
            this.a = -1;
            this.d = false;
            xf1 xf1Var = this.c;
            if (xf1Var.e == this) {
                xf1Var.e = null;
            }
            this.c = null;
            this.b = null;
        }
    }
}
