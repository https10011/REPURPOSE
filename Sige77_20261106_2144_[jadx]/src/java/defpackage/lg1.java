package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class lg1 extends k2 {
    public final mg1 d;
    public final WeakHashMap e = new WeakHashMap();

    public lg1(mg1 mg1Var) {
        this.d = mg1Var;
    }

    @Override // defpackage.k2
    public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
        k2 k2Var = (k2) this.e.get(view);
        return k2Var != null ? k2Var.a(view, accessibilityEvent) : this.a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // defpackage.k2
    public final ri2 b(View view) {
        k2 k2Var = (k2) this.e.get(view);
        return k2Var != null ? k2Var.b(view) : super.b(view);
    }

    @Override // defpackage.k2
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        k2 k2Var = (k2) this.e.get(view);
        if (k2Var != null) {
            k2Var.c(view, accessibilityEvent);
        } else {
            super.c(view, accessibilityEvent);
        }
    }

    @Override // defpackage.k2
    public final void d(View view, x2 x2Var) {
        AccessibilityNodeInfo accessibilityNodeInfo = x2Var.a;
        mg1 mg1Var = this.d;
        RecyclerView recyclerView = mg1Var.d;
        RecyclerView recyclerView2 = mg1Var.d;
        boolean zK = recyclerView.K();
        View.AccessibilityDelegate accessibilityDelegate = this.a;
        if (zK || recyclerView2.getLayoutManager() == null) {
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            return;
        }
        recyclerView2.getLayoutManager().W(view, x2Var);
        k2 k2Var = (k2) this.e.get(view);
        if (k2Var != null) {
            k2Var.d(view, x2Var);
        } else {
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        }
    }

    @Override // defpackage.k2
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        k2 k2Var = (k2) this.e.get(view);
        if (k2Var != null) {
            k2Var.e(view, accessibilityEvent);
        } else {
            super.e(view, accessibilityEvent);
        }
    }

    @Override // defpackage.k2
    public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        k2 k2Var = (k2) this.e.get(viewGroup);
        return k2Var != null ? k2Var.f(viewGroup, view, accessibilityEvent) : this.a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // defpackage.k2
    public final boolean g(View view, int i, Bundle bundle) {
        mg1 mg1Var = this.d;
        RecyclerView recyclerView = mg1Var.d;
        RecyclerView recyclerView2 = mg1Var.d;
        if (recyclerView.K() || recyclerView2.getLayoutManager() == null) {
            return super.g(view, i, bundle);
        }
        k2 k2Var = (k2) this.e.get(view);
        if (k2Var != null) {
            if (k2Var.g(view, i, bundle)) {
                return true;
            }
        } else if (super.g(view, i, bundle)) {
            return true;
        }
        dg1 dg1Var = recyclerView2.getLayoutManager().b.b;
        return false;
    }

    @Override // defpackage.k2
    public final void h(View view, int i) {
        k2 k2Var = (k2) this.e.get(view);
        if (k2Var != null) {
            k2Var.h(view, i);
        } else {
            super.h(view, i);
        }
    }

    @Override // defpackage.k2
    public final void i(View view, AccessibilityEvent accessibilityEvent) {
        k2 k2Var = (k2) this.e.get(view);
        if (k2Var != null) {
            k2Var.i(view, accessibilityEvent);
        } else {
            super.i(view, accessibilityEvent);
        }
    }
}
