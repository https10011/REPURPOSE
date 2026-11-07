package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class xk implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xk(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 1:
                q60 q60Var = (q60) obj;
                AccessibilityManager accessibilityManager = q60Var.j0;
                if (q60Var.k0 != null && accessibilityManager != null && q60Var.isAttachedToWindow()) {
                    accessibilityManager.addTouchExplorationStateChangeListener(q60Var.k0);
                    break;
                }
                break;
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                View view2 = (View) obj;
                view2.removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap = x52.a;
                view2.requestApplyInsets();
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        AccessibilityManager accessibilityManager;
        AccessibilityManager accessibilityManager2;
        AccessibilityManager accessibilityManager3;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                al alVar = (al) obj;
                ViewTreeObserver viewTreeObserver = alVar.k0;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        alVar.k0 = view.getViewTreeObserver();
                    }
                    alVar.k0.removeGlobalOnLayoutListener(alVar.w);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            case 1:
                q60 q60Var = (q60) obj;
                AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = q60Var.k0;
                if (touchExplorationStateChangeListener != null && (accessibilityManager = q60Var.j0) != null) {
                    accessibilityManager.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
                    break;
                }
                break;
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                break;
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior = (HideBottomViewOnScrollBehavior) obj;
                dm0 dm0Var = hideBottomViewOnScrollBehavior.h;
                if (dm0Var != null && (accessibilityManager2 = hideBottomViewOnScrollBehavior.g) != null) {
                    accessibilityManager2.removeTouchExplorationStateChangeListener(dm0Var);
                    hideBottomViewOnScrollBehavior.h = null;
                    break;
                }
                break;
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                HideViewOnScrollBehavior hideViewOnScrollBehavior = (HideViewOnScrollBehavior) obj;
                dm0 dm0Var2 = hideViewOnScrollBehavior.c;
                if (dm0Var2 != null && (accessibilityManager3 = hideViewOnScrollBehavior.b) != null) {
                    accessibilityManager3.removeTouchExplorationStateChangeListener(dm0Var2);
                    hideViewOnScrollBehavior.c = null;
                    break;
                }
                break;
            default:
                ht1 ht1Var = (ht1) obj;
                ViewTreeObserver viewTreeObserver2 = ht1Var.b0;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        ht1Var.b0 = view.getViewTreeObserver();
                    }
                    ht1Var.b0.removeGlobalOnLayoutListener(ht1Var.w);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
        }
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    private final void c(View view) {
    }

    private final void d(View view) {
    }

    private final void e(View view) {
    }
}
