package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class qa1 extends zf1 {
    public RecyclerView a;
    public final vr1 b = new vr1(this);
    public fa1 c;
    public fa1 d;

    public static int b(View view, c50 c50Var) {
        return ((c50Var.c(view) / 2) + c50Var.e(view)) - ((c50Var.l() / 2) + c50Var.k());
    }

    public static View c(xf1 xf1Var, c50 c50Var) {
        int iV = xf1Var.v();
        View view = null;
        if (iV == 0) {
            return null;
        }
        int iL = (c50Var.l() / 2) + c50Var.k();
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < iV; i2++) {
            View viewU = xf1Var.u(i2);
            int iAbs = Math.abs(((c50Var.c(viewU) / 2) + c50Var.e(viewU)) - iL);
            if (iAbs < i) {
                view = viewU;
                i = iAbs;
            }
        }
        return view;
    }

    public final int[] a(xf1 xf1Var, View view) {
        int[] iArr = new int[2];
        if (xf1Var.d()) {
            iArr[0] = b(view, d(xf1Var));
        } else {
            iArr[0] = 0;
        }
        if (xf1Var.e()) {
            iArr[1] = b(view, e(xf1Var));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    public final c50 d(xf1 xf1Var) {
        fa1 fa1Var = this.d;
        if (fa1Var == null || ((xf1) fa1Var.b) != xf1Var) {
            this.d = new fa1(xf1Var, 0);
        }
        return this.d;
    }

    public final c50 e(xf1 xf1Var) {
        fa1 fa1Var = this.c;
        if (fa1Var == null || ((xf1) fa1Var.b) != xf1Var) {
            this.c = new fa1(xf1Var, 1);
        }
        return this.c;
    }

    public final void f() {
        xf1 layoutManager;
        View viewC;
        RecyclerView recyclerView = this.a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null) {
            return;
        }
        if (layoutManager.e()) {
            viewC = c(layoutManager, e(layoutManager));
        } else {
            viewC = layoutManager.d() ? c(layoutManager, d(layoutManager)) : null;
        }
        if (viewC == null) {
            return;
        }
        int[] iArrA = a(layoutManager, viewC);
        int i = iArrA[0];
        if (i == 0 && iArrA[1] == 0) {
            return;
        }
        this.a.a0(i, iArrA[1], false);
    }
}
