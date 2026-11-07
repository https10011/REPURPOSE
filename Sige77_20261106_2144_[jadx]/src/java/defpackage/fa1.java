package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class fa1 extends c50 {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fa1(xf1 xf1Var, int i) {
        super(xf1Var);
        this.d = i;
    }

    @Override // defpackage.c50
    public final int b(View view) {
        int right;
        int i;
        int i2 = this.d;
        Object obj = this.b;
        switch (i2) {
            case 0:
                yf1 yf1Var = (yf1) view.getLayoutParams();
                ((xf1) obj).getClass();
                right = view.getRight() + ((yf1) view.getLayoutParams()).b.right;
                i = ((ViewGroup.MarginLayoutParams) yf1Var).rightMargin;
                break;
            default:
                yf1 yf1Var2 = (yf1) view.getLayoutParams();
                ((xf1) obj).getClass();
                right = view.getBottom() + ((yf1) view.getLayoutParams()).b.bottom;
                i = ((ViewGroup.MarginLayoutParams) yf1Var2).bottomMargin;
                break;
        }
        return right + i;
    }

    @Override // defpackage.c50
    public final int c(View view) {
        int iA;
        int i;
        int i2 = this.d;
        Object obj = this.b;
        switch (i2) {
            case 0:
                yf1 yf1Var = (yf1) view.getLayoutParams();
                ((xf1) obj).getClass();
                iA = xf1.A(view) + ((ViewGroup.MarginLayoutParams) yf1Var).leftMargin;
                i = ((ViewGroup.MarginLayoutParams) yf1Var).rightMargin;
                break;
            default:
                yf1 yf1Var2 = (yf1) view.getLayoutParams();
                ((xf1) obj).getClass();
                iA = xf1.z(view) + ((ViewGroup.MarginLayoutParams) yf1Var2).topMargin;
                i = ((ViewGroup.MarginLayoutParams) yf1Var2).bottomMargin;
                break;
        }
        return iA + i;
    }

    @Override // defpackage.c50
    public final int d(View view) {
        int iZ;
        int i;
        int i2 = this.d;
        Object obj = this.b;
        switch (i2) {
            case 0:
                yf1 yf1Var = (yf1) view.getLayoutParams();
                ((xf1) obj).getClass();
                iZ = xf1.z(view) + ((ViewGroup.MarginLayoutParams) yf1Var).topMargin;
                i = ((ViewGroup.MarginLayoutParams) yf1Var).bottomMargin;
                break;
            default:
                yf1 yf1Var2 = (yf1) view.getLayoutParams();
                ((xf1) obj).getClass();
                iZ = xf1.A(view) + ((ViewGroup.MarginLayoutParams) yf1Var2).leftMargin;
                i = ((ViewGroup.MarginLayoutParams) yf1Var2).rightMargin;
                break;
        }
        return iZ + i;
    }

    @Override // defpackage.c50
    public final int e(View view) {
        int left;
        int i;
        int i2 = this.d;
        Object obj = this.b;
        switch (i2) {
            case 0:
                yf1 yf1Var = (yf1) view.getLayoutParams();
                ((xf1) obj).getClass();
                left = view.getLeft() - ((yf1) view.getLayoutParams()).b.left;
                i = ((ViewGroup.MarginLayoutParams) yf1Var).leftMargin;
                break;
            default:
                yf1 yf1Var2 = (yf1) view.getLayoutParams();
                ((xf1) obj).getClass();
                left = view.getTop() - ((yf1) view.getLayoutParams()).b.top;
                i = ((ViewGroup.MarginLayoutParams) yf1Var2).topMargin;
                break;
        }
        return left - i;
    }

    @Override // defpackage.c50
    public final int f() {
        switch (this.d) {
            case 0:
                return ((xf1) this.b).n;
            default:
                return ((xf1) this.b).o;
        }
    }

    @Override // defpackage.c50
    public final int g() {
        int i;
        int iF;
        int i2 = this.d;
        Object obj = this.b;
        switch (i2) {
            case 0:
                xf1 xf1Var = (xf1) obj;
                i = xf1Var.n;
                iF = xf1Var.F();
                break;
            default:
                xf1 xf1Var2 = (xf1) obj;
                i = xf1Var2.o;
                iF = xf1Var2.D();
                break;
        }
        return i - iF;
    }

    @Override // defpackage.c50
    public final int h() {
        switch (this.d) {
            case 0:
                return ((xf1) this.b).F();
            default:
                return ((xf1) this.b).D();
        }
    }

    @Override // defpackage.c50
    public final int i() {
        switch (this.d) {
            case 0:
                return ((xf1) this.b).l;
            default:
                return ((xf1) this.b).m;
        }
    }

    @Override // defpackage.c50
    public final int j() {
        switch (this.d) {
            case 0:
                return ((xf1) this.b).m;
            default:
                return ((xf1) this.b).l;
        }
    }

    @Override // defpackage.c50
    public final int k() {
        switch (this.d) {
            case 0:
                return ((xf1) this.b).E();
            default:
                return ((xf1) this.b).G();
        }
    }

    @Override // defpackage.c50
    public final int l() {
        int iE;
        int iF;
        int i = this.d;
        Object obj = this.b;
        switch (i) {
            case 0:
                xf1 xf1Var = (xf1) obj;
                iE = xf1Var.n - xf1Var.E();
                iF = xf1Var.F();
                break;
            default:
                xf1 xf1Var2 = (xf1) obj;
                iE = xf1Var2.o - xf1Var2.G();
                iF = xf1Var2.D();
                break;
        }
        return iE - iF;
    }

    @Override // defpackage.c50
    public final int m(View view) {
        int i = this.d;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                Rect rect = (Rect) obj;
                ((xf1) obj2).K(rect, view);
                return rect.right;
            default:
                Rect rect2 = (Rect) obj;
                ((xf1) obj2).K(rect2, view);
                return rect2.bottom;
        }
    }

    @Override // defpackage.c50
    public final int n(View view) {
        int i = this.d;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                Rect rect = (Rect) obj;
                ((xf1) obj2).K(rect, view);
                return rect.left;
            default:
                Rect rect2 = (Rect) obj;
                ((xf1) obj2).K(rect2, view);
                return rect2.top;
        }
    }

    @Override // defpackage.c50
    public final void o(int i) {
        switch (this.d) {
            case 0:
                ((xf1) this.b).O(i);
                break;
            default:
                ((xf1) this.b).P(i);
                break;
        }
    }
}
