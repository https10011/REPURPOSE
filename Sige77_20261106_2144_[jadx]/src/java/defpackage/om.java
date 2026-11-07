package defpackage;

import android.R;
import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import com.google.android.material.chip.Chip;
import com.hjq.toast.BuildConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class om extends k2 {
    public static final Rect o = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
    public static final vl0 p = new vl0(5);
    public static final nk1 q = new nk1(5);
    public final AccessibilityManager h;
    public final Chip i;
    public t80 j;
    public final /* synthetic */ Chip n;
    public final Rect d = new Rect();
    public final Rect e = new Rect();
    public final Rect f = new Rect();
    public final int[] g = new int[2];
    public int k = Integer.MIN_VALUE;
    public int l = Integer.MIN_VALUE;
    public int m = Integer.MIN_VALUE;

    public om(Chip chip, Chip chip2) {
        this.n = chip;
        this.i = chip2;
        this.h = (AccessibilityManager) chip2.getContext().getSystemService("accessibility");
        chip2.setFocusable(true);
        WeakHashMap weakHashMap = x52.a;
        if (chip2.getImportantForAccessibility() == 0) {
            chip2.setImportantForAccessibility(1);
        }
    }

    @Override // defpackage.k2
    public final ri2 b(View view) {
        if (this.j == null) {
            this.j = new t80(this);
        }
        return this.j;
    }

    @Override // defpackage.k2
    public final void d(View view, x2 x2Var) {
        AccessibilityNodeInfo accessibilityNodeInfo = x2Var.a;
        this.a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        Chip chip = this.n;
        pm pmVar = chip.e;
        accessibilityNodeInfo.setCheckable(pmVar != null && pmVar.N0);
        accessibilityNodeInfo.setClickable(chip.isClickable());
        x2Var.i(chip.getAccessibilityClassName());
        x2Var.k(chip.getText());
    }

    public final boolean j(int i) {
        if (this.l != i) {
            return false;
        }
        this.l = Integer.MIN_VALUE;
        o(i, false);
        q(i, 8);
        return true;
    }

    public final x2 k(int i) {
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
        x2 x2Var = new x2(accessibilityNodeInfoObtain);
        accessibilityNodeInfoObtain.setEnabled(true);
        accessibilityNodeInfoObtain.setFocusable(true);
        x2Var.i("android.view.View");
        Rect rect = o;
        accessibilityNodeInfoObtain.setBoundsInParent(rect);
        accessibilityNodeInfoObtain.setBoundsInScreen(rect);
        Chip chip = this.i;
        accessibilityNodeInfoObtain.setParent(chip);
        AccessibilityNodeInfo accessibilityNodeInfo = x2Var.a;
        CharSequence charSequence = BuildConfig.FLAVOR;
        if (i == 1) {
            Chip chip2 = this.n;
            CharSequence closeIconContentDescription = chip2.getCloseIconContentDescription();
            if (closeIconContentDescription != null) {
                accessibilityNodeInfo.setContentDescription(closeIconContentDescription);
            } else {
                CharSequence text = chip2.getText();
                Context context = chip2.getContext();
                if (!TextUtils.isEmpty(text)) {
                    charSequence = text;
                }
                accessibilityNodeInfo.setContentDescription(context.getString(2131886286, charSequence).trim());
            }
            accessibilityNodeInfo.setBoundsInParent(Chip.a(chip2));
            x2Var.b(r2.e);
            accessibilityNodeInfo.setEnabled(chip2.isEnabled());
            x2Var.i(Button.class.getName());
        } else {
            accessibilityNodeInfo.setContentDescription(BuildConfig.FLAVOR);
            accessibilityNodeInfo.setBoundsInParent(Chip.m0);
        }
        if (x2Var.g() == null && accessibilityNodeInfoObtain.getContentDescription() == null) {
            uq1.m("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
            return null;
        }
        Rect rect2 = this.e;
        x2Var.f(rect2);
        if (rect2.equals(rect)) {
            uq1.m("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
            return null;
        }
        int actions = accessibilityNodeInfoObtain.getActions();
        if ((actions & 64) != 0) {
            uq1.m("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            return null;
        }
        if ((actions & 128) != 0) {
            uq1.m("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            return null;
        }
        accessibilityNodeInfoObtain.setPackageName(chip.getContext().getPackageName());
        x2Var.b = i;
        accessibilityNodeInfoObtain.setSource(chip, i);
        if (this.k == i) {
            accessibilityNodeInfoObtain.setAccessibilityFocused(true);
            x2Var.a(128);
        } else {
            accessibilityNodeInfoObtain.setAccessibilityFocused(false);
            x2Var.a(64);
        }
        boolean z = this.l == i;
        if (z) {
            x2Var.a(2);
        } else if (accessibilityNodeInfoObtain.isFocusable()) {
            x2Var.a(1);
        }
        accessibilityNodeInfoObtain.setFocused(z);
        int[] iArr = this.g;
        chip.getLocationOnScreen(iArr);
        Rect rect3 = this.d;
        accessibilityNodeInfoObtain.getBoundsInScreen(rect3);
        if (rect3.equals(rect)) {
            x2Var.f(rect3);
            rect3.offset(iArr[0] - chip.getScrollX(), iArr[1] - chip.getScrollY());
        }
        Rect rect4 = this.f;
        if (chip.getLocalVisibleRect(rect4)) {
            rect4.offset(iArr[0] - chip.getScrollX(), iArr[1] - chip.getScrollY());
            if (rect3.intersect(rect4)) {
                accessibilityNodeInfoObtain.setBoundsInScreen(rect3);
                if (!rect3.isEmpty() && chip.getWindowVisibility() == 0) {
                    Object parent = chip.getParent();
                    while (parent instanceof View) {
                        View view = (View) parent;
                        if (view.getAlpha() > 0.0f && view.getVisibility() == 0) {
                            parent = view.getParent();
                        }
                    }
                    if (parent != null) {
                        accessibilityNodeInfo.setVisibleToUser(true);
                    }
                }
            }
        }
        return x2Var;
    }

    public final void l(ArrayList arrayList) {
        pm pmVar;
        arrayList.add(0);
        Rect rect = Chip.m0;
        Chip chip = this.n;
        if (!chip.c() || (pmVar = chip.e) == null || !pmVar.H0 || chip.v == null) {
            return;
        }
        arrayList.add(1);
    }

    /* JADX WARN: Code duplicated, block: B:67:0x0145  */
    public final boolean m(int i, Rect rect) {
        int i2;
        Object obj;
        x2 x2Var;
        ArrayList arrayList = new ArrayList();
        l(arrayList);
        ks1 ks1Var = new ks1();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            ks1Var.f(((Integer) arrayList.get(i3)).intValue(), k(((Integer) arrayList.get(i3)).intValue()));
        }
        int i4 = this.l;
        int i5 = Integer.MIN_VALUE;
        x2 x2Var2 = i4 == Integer.MIN_VALUE ? null : (x2) ks1Var.d(i4);
        vl0 vl0Var = p;
        nk1 nk1Var = q;
        Chip chip = this.i;
        int i6 = -1;
        if (i == 1 || i == 2) {
            WeakHashMap weakHashMap = x52.a;
            boolean z = chip.getLayoutDirection() == 1;
            nk1Var.getClass();
            int i7 = ks1Var.c;
            ArrayList arrayList2 = new ArrayList(i7);
            for (int i8 = 0; i8 < i7; i8++) {
                arrayList2.add((x2) ks1Var.b[i8]);
            }
            Collections.sort(arrayList2, new yd0(z, vl0Var));
            if (i == 1) {
                i2 = 0;
                int size = arrayList2.size();
                if (x2Var2 != null) {
                    size = arrayList2.indexOf(x2Var2);
                }
                int i9 = size - 1;
                obj = i9 >= 0 ? arrayList2.get(i9) : null;
            } else {
                if (i != 2) {
                    e.g("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
                    return false;
                }
                int size2 = arrayList2.size();
                int iLastIndexOf = (x2Var2 == null ? -1 : arrayList2.lastIndexOf(x2Var2)) + 1;
                obj = iLastIndexOf < size2 ? arrayList2.get(iLastIndexOf) : null;
                i2 = 0;
            }
            x2Var = (x2) obj;
        } else {
            if (i != 17 && i != 33 && i != 66 && i != 130) {
                e.g("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                return false;
            }
            Rect rect2 = new Rect();
            int i10 = this.l;
            if (i10 != Integer.MIN_VALUE) {
                n(i10).f(rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                int width = chip.getWidth();
                int height = chip.getHeight();
                if (i == 17) {
                    rect2.set(width, 0, width, height);
                } else if (i == 33) {
                    rect2.set(0, height, width, height);
                } else if (i == 66) {
                    rect2.set(-1, 0, -1, height);
                } else {
                    if (i != 130) {
                        e.g("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        return false;
                    }
                    rect2.set(0, -1, width, -1);
                }
            }
            Rect rect3 = new Rect(rect2);
            if (i == 17) {
                rect3.offset(rect2.width() + 1, 0);
            } else if (i == 33) {
                rect3.offset(0, rect2.height() + 1);
            } else if (i == 66) {
                rect3.offset(-(rect2.width() + 1), 0);
            } else {
                if (i != 130) {
                    e.g("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    return false;
                }
                rect3.offset(0, -(rect2.height() + 1));
            }
            nk1Var.getClass();
            int i11 = ks1Var.c;
            Rect rect4 = new Rect();
            x2Var = null;
            for (int i12 = 0; i12 < i11; i12++) {
                x2 x2Var3 = (x2) ks1Var.b[i12];
                if (x2Var3 != x2Var2) {
                    vl0Var.getClass();
                    x2Var3.f(rect4);
                    if (y21.j(i, rect2, rect4)) {
                        if (!y21.j(i, rect2, rect3) || y21.b(i, rect2, rect4, rect3)) {
                            rect3.set(rect4);
                            x2Var = x2Var3;
                        } else if (!y21.b(i, rect2, rect3, rect4)) {
                            int iK = y21.k(i, rect2, rect4);
                            int iL = y21.l(i, rect2, rect4);
                            int i13 = (iL * iL) + (iK * 13 * iK);
                            int iK2 = y21.k(i, rect2, rect3);
                            int iL2 = y21.l(i, rect2, rect3);
                            if (i13 < (iL2 * iL2) + (iK2 * 13 * iK2)) {
                                rect3.set(rect4);
                                x2Var = x2Var3;
                            }
                        }
                    }
                }
            }
            i2 = 0;
        }
        x2 x2Var4 = x2Var;
        if (x2Var4 != null) {
            int i14 = ks1Var.c;
            for (int i15 = i2; i15 < i14; i15++) {
                if (ks1Var.b[i15] == x2Var4) {
                    i6 = i15;
                    break;
                }
            }
            i5 = ks1Var.a[i6];
        }
        return p(i5);
    }

    public final x2 n(int i) {
        if (i != -1) {
            return k(i);
        }
        View view = this.i;
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(view);
        x2 x2Var = new x2(accessibilityNodeInfoObtain);
        WeakHashMap weakHashMap = x52.a;
        view.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoObtain);
        ArrayList arrayList = new ArrayList();
        l(arrayList);
        if (accessibilityNodeInfoObtain.getChildCount() > 0 && arrayList.size() > 0) {
            uq1.m("Views cannot have both real and virtual children");
            return null;
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            x2Var.a.addChild(view, ((Integer) arrayList.get(i2)).intValue());
        }
        return x2Var;
    }

    public final void o(int i, boolean z) {
        Chip chip = this.n;
        if (i == 1) {
            chip.c0 = z;
        }
        pm pmVar = chip.e;
        boolean z2 = chip.c0;
        boolean zS = false;
        if (pmVar.I0 != null) {
            zS = pmVar.S(z2 ? new int[]{R.attr.state_pressed, R.attr.state_enabled} : pm.C1);
        }
        if (zS) {
            chip.refreshDrawableState();
        }
    }

    public final boolean p(int i) {
        int i2;
        Chip chip = this.i;
        if ((!chip.isFocused() && !chip.requestFocus()) || (i2 = this.l) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            j(i2);
        }
        if (i == Integer.MIN_VALUE) {
            return false;
        }
        this.l = i;
        o(i, true);
        q(i, 8);
        return true;
    }

    public final void q(int i, int i2) {
        View view;
        ViewParent parent;
        AccessibilityEvent accessibilityEventObtain;
        if (i == Integer.MIN_VALUE || !this.h.isEnabled() || (parent = (view = this.i).getParent()) == null) {
            return;
        }
        if (i != -1) {
            accessibilityEventObtain = AccessibilityEvent.obtain(i2);
            x2 x2VarN = n(i);
            accessibilityEventObtain.getText().add(x2VarN.g());
            AccessibilityNodeInfo accessibilityNodeInfo = x2VarN.a;
            accessibilityEventObtain.setContentDescription(accessibilityNodeInfo.getContentDescription());
            accessibilityEventObtain.setScrollable(accessibilityNodeInfo.isScrollable());
            accessibilityEventObtain.setPassword(accessibilityNodeInfo.isPassword());
            accessibilityEventObtain.setEnabled(accessibilityNodeInfo.isEnabled());
            accessibilityEventObtain.setChecked(accessibilityNodeInfo.isChecked());
            if (accessibilityEventObtain.getText().isEmpty() && accessibilityEventObtain.getContentDescription() == null) {
                uq1.m("Callbacks must add text or a content description in populateEventForVirtualViewId()");
                return;
            } else {
                accessibilityEventObtain.setClassName(accessibilityNodeInfo.getClassName());
                accessibilityEventObtain.setSource(view, i);
                accessibilityEventObtain.setPackageName(view.getContext().getPackageName());
            }
        } else {
            accessibilityEventObtain = AccessibilityEvent.obtain(i2);
            view.onInitializeAccessibilityEvent(accessibilityEventObtain);
        }
        parent.requestSendAccessibilityEvent(view, accessibilityEventObtain);
    }
}
