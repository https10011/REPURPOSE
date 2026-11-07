package defpackage;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ScrollView;
import androidx.core.widget.NestedScrollView;
import androidx.viewpager.widget.ViewPager;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class h21 extends k2 {
    public final /* synthetic */ int d;

    public h21(ViewPager viewPager) {
        this.d = 5;
    }

    @Override // defpackage.k2
    public void c(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.d) {
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                super.c(view, accessibilityEvent);
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                accessibilityEvent.setClassName(ScrollView.class.getName());
                accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
                accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
                accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
                accessibilityEvent.setMaxScrollX(nestedScrollView.getScrollX());
                accessibilityEvent.setMaxScrollY(nestedScrollView.getScrollRange());
                break;
            case oc1.LONG_FIELD_NUMBER /* 4 */:
            default:
                super.c(view, accessibilityEvent);
                break;
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                super.c(view, accessibilityEvent);
                accessibilityEvent.setClassName(ViewPager.class.getName());
                accessibilityEvent.setScrollable(false);
                accessibilityEvent.getEventType();
                break;
        }
    }

    @Override // defpackage.k2
    public final void d(View view, x2 x2Var) {
        int scrollRange;
        int i = this.d;
        View.AccessibilityDelegate accessibilityDelegate = this.a;
        switch (i) {
            case 0:
                AccessibilityNodeInfo accessibilityNodeInfo = x2Var.a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                accessibilityNodeInfo.setCollectionInfo(null);
                break;
            case 1:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, x2Var.a);
                x2Var.j(false);
                break;
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                AccessibilityNodeInfo accessibilityNodeInfo2 = x2Var.a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                accessibilityNodeInfo2.setCollectionInfo(null);
                break;
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, x2Var.a);
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                x2Var.i(ScrollView.class.getName());
                if (nestedScrollView.isEnabled() && (scrollRange = nestedScrollView.getScrollRange()) > 0) {
                    x2Var.j(true);
                    if (nestedScrollView.getScrollY() > 0) {
                        x2Var.b(r2.g);
                        x2Var.b(r2.k);
                    }
                    if (nestedScrollView.getScrollY() < scrollRange) {
                        x2Var.b(r2.f);
                        x2Var.b(r2.l);
                    }
                    break;
                }
                break;
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                AccessibilityNodeInfo accessibilityNodeInfo3 = x2Var.a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo3);
                accessibilityNodeInfo3.setVisibleToUser(false);
                break;
            default:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, x2Var.a);
                x2Var.i(ViewPager.class.getName());
                x2Var.j(false);
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x007a  */
    /* JADX WARN: Code duplicated, block: B:33:0x0097  */
    @Override // defpackage.k2
    public boolean g(View view, int i, Bundle bundle) {
        int iMin;
        switch (this.d) {
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                if (super.g(view, i, bundle)) {
                    return true;
                }
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                if (nestedScrollView.isEnabled()) {
                    int height = nestedScrollView.getHeight();
                    Rect rect = new Rect();
                    if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
                        height = rect.height();
                    }
                    if (i == 4096) {
                        iMin = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
                        if (iMin != nestedScrollView.getScrollY()) {
                            nestedScrollView.u(0 - nestedScrollView.getScrollX(), iMin - nestedScrollView.getScrollY(), true);
                            return true;
                        }
                    } else if (i == 8192 || i == 16908344) {
                        int iMax = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                        if (iMax != nestedScrollView.getScrollY()) {
                            nestedScrollView.u(0 - nestedScrollView.getScrollX(), iMax - nestedScrollView.getScrollY(), true);
                            return true;
                        }
                    } else if (i == 16908346) {
                        iMin = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
                        if (iMin != nestedScrollView.getScrollY()) {
                            nestedScrollView.u(0 - nestedScrollView.getScrollX(), iMin - nestedScrollView.getScrollY(), true);
                            return true;
                        }
                    }
                }
                return false;
            case oc1.LONG_FIELD_NUMBER /* 4 */:
            default:
                return super.g(view, i, bundle);
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                return super.g(view, i, bundle);
        }
    }
}
