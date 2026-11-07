package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class mg1 extends k2 {
    public final RecyclerView d;
    public final lg1 e;

    public mg1(RecyclerView recyclerView) {
        this.d = recyclerView;
        lg1 lg1Var = this.e;
        if (lg1Var != null) {
            this.e = lg1Var;
        } else {
            this.e = new lg1(this);
        }
    }

    @Override // defpackage.k2
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || this.d.K()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().U(accessibilityEvent);
        }
    }

    @Override // defpackage.k2
    public final void d(View view, x2 x2Var) {
        AccessibilityNodeInfo accessibilityNodeInfo = x2Var.a;
        this.a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        RecyclerView recyclerView = this.d;
        if (recyclerView.K() || recyclerView.getLayoutManager() == null) {
            return;
        }
        xf1 layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.b;
        dg1 dg1Var = recyclerView2.b;
        hg1 hg1Var = recyclerView2.Q0;
        if (recyclerView2.canScrollVertically(-1) || layoutManager.b.canScrollHorizontally(-1)) {
            x2Var.a(8192);
            x2Var.j(true);
        }
        if (layoutManager.b.canScrollVertically(1) || layoutManager.b.canScrollHorizontally(1)) {
            x2Var.a(4096);
            x2Var.j(true);
        }
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(layoutManager.J(dg1Var, hg1Var), layoutManager.x(dg1Var, hg1Var), false, 0));
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0056 A[PHI: r3
      0x0056: PHI (r3v11 int) = (r3v7 int), (r3v15 int) binds: [B:27:0x0072, B:19:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.k2
    public final boolean g(View view, int i, Bundle bundle) {
        int iG;
        int iE;
        if (super.g(view, i, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.d;
        if (!recyclerView.K() && recyclerView.getLayoutManager() != null) {
            xf1 layoutManager = recyclerView.getLayoutManager();
            RecyclerView recyclerView2 = layoutManager.b;
            dg1 dg1Var = recyclerView2.b;
            if (i == 4096) {
                iG = recyclerView2.canScrollVertically(1) ? (layoutManager.o - layoutManager.G()) - layoutManager.D() : 0;
                if (layoutManager.b.canScrollHorizontally(1)) {
                    iE = (layoutManager.n - layoutManager.E()) - layoutManager.F();
                } else {
                    iE = 0;
                }
            } else if (i != 8192) {
                iG = 0;
                iE = 0;
            } else {
                iG = recyclerView2.canScrollVertically(-1) ? -((layoutManager.o - layoutManager.G()) - layoutManager.D()) : 0;
                if (layoutManager.b.canScrollHorizontally(-1)) {
                    iE = -((layoutManager.n - layoutManager.E()) - layoutManager.F());
                } else {
                    iE = 0;
                }
            }
            if (iG != 0 || iE != 0) {
                layoutManager.b.a0(iE, iG, true);
                return true;
            }
        }
        return false;
    }
}
