package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public abstract class x52 {
    public static WeakHashMap a;
    public static Field b;
    public static boolean c;
    public static final int[] d = {2131296272, 2131296273, 2131296284, 2131296295, 2131296298, 2131296299, 2131296300, 2131296301, 2131296302, 2131296303, 2131296274, 2131296275, 2131296276, 2131296277, 2131296278, 2131296279, 2131296280, 2131296281, 2131296282, 2131296283, 2131296285, 2131296286, 2131296287, 2131296288, 2131296289, 2131296290, 2131296291, 2131296292, 2131296293, 2131296294, 2131296296, 2131296297};
    public static final k52 e = new k52();
    public static final m52 f = new m52();

    public static y62 a(View view) {
        if (a == null) {
            a = new WeakHashMap();
        }
        y62 y62Var = (y62) a.get(view);
        if (y62Var != null) {
            return y62Var;
        }
        y62 y62Var2 = new y62(view);
        a.put(view, y62Var2);
        return y62Var2;
    }

    public static u92 b(View view, u92 u92Var) {
        WindowInsets windowInsetsG = u92Var.g();
        if (windowInsetsG != null) {
            WindowInsets windowInsetsA = Build.VERSION.SDK_INT >= 30 ? u52.a(view, windowInsetsG) : n52.a(view, windowInsetsG);
            if (!windowInsetsA.equals(windowInsetsG)) {
                return u92.h(view, windowInsetsA);
            }
        }
        return u92Var;
    }

    public static boolean c(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList = w52.d;
        w52 w52Var = (w52) view.getTag(2131296798);
        if (w52Var == null) {
            w52Var = new w52();
            w52Var.a = null;
            w52Var.b = null;
            w52Var.c = null;
            view.setTag(2131296798, w52Var);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap weakHashMap = w52Var.a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList2 = w52.d;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    try {
                        if (w52Var.a == null) {
                            w52Var.a = new WeakHashMap();
                        }
                        for (int size = arrayList2.size() - 1; size >= 0; size--) {
                            ArrayList arrayList3 = w52.d;
                            View view2 = (View) ((WeakReference) arrayList3.get(size)).get();
                            if (view2 == null) {
                                arrayList3.remove(size);
                            } else {
                                w52Var.a.put(view2, Boolean.TRUE);
                                for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                    w52Var.a.put((View) parent, Boolean.TRUE);
                                }
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        View viewA = w52Var.a(view);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (viewA != null && !KeyEvent.isModifierKey(keyCode)) {
                if (w52Var.b == null) {
                    w52Var.b = new SparseArray();
                }
                w52Var.b.put(keyCode, new WeakReference(viewA));
            }
        }
        return viewA != null;
    }

    public static View.AccessibilityDelegate d(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return t52.a(view);
        }
        if (c) {
            return null;
        }
        if (b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                c = true;
                return null;
            }
        }
        try {
            Object obj = b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            c = true;
            return null;
        }
    }

    public static CharSequence e(View view) {
        Object tag;
        if (Build.VERSION.SDK_INT >= 28) {
            tag = s52.a(view);
        } else {
            tag = view.getTag(2131296789);
            if (!CharSequence.class.isInstance(tag)) {
                tag = null;
            }
        }
        return (CharSequence) tag;
    }

    public static ArrayList f(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(2131296786);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(2131296786, arrayList2);
        return arrayList2;
    }

    public static String[] g(o8 o8Var) {
        return Build.VERSION.SDK_INT >= 31 ? v52.a(o8Var) : (String[]) o8Var.getTag(2131296793);
    }

    public static void h(View view, int i) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z = e(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z ? 32 : 2048);
                accessibilityEventObtain.setContentChangeTypes(i);
                if (z) {
                    accessibilityEventObtain.getText().add(e(view));
                    if (view.getImportantForAccessibility() == 0) {
                        view.setImportantForAccessibility(1);
                    }
                }
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i != 32) {
                if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i);
                        return;
                    } catch (AbstractMethodError e2) {
                        Log.e("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e2);
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.setEventType(32);
            accessibilityEventObtain2.setContentChangeTypes(i);
            accessibilityEventObtain2.setSource(view);
            view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.getText().add(e(view));
            accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
        }
    }

    public static u92 i(View view, u92 u92Var) {
        WindowInsets windowInsetsG = u92Var.g();
        if (windowInsetsG != null) {
            WindowInsets windowInsetsOnApplyWindowInsets = view.onApplyWindowInsets(windowInsetsG);
            if (!windowInsetsOnApplyWindowInsets.equals(windowInsetsG)) {
                return u92.h(view, windowInsetsOnApplyWindowInsets);
            }
        }
        return u92Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static as j(View view, as asVar) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + asVar + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return v52.b(view, asVar);
        }
        ex1 ex1Var = (ex1) view.getTag(2131296792);
        d91 d91Var = e;
        if (ex1Var == null) {
            if (view instanceof d91) {
                d91Var = (d91) view;
            }
            return d91Var.a(asVar);
        }
        as asVarA = ex1.a(view, asVar);
        if (asVarA == null) {
            return null;
        }
        if (view instanceof d91) {
            d91Var = (d91) view;
        }
        return d91Var.a(asVarA);
    }

    public static void k(View view, int i) {
        ArrayList arrayListF = f(view);
        for (int i2 = 0; i2 < arrayListF.size(); i2++) {
            if (((r2) arrayListF.get(i2)).a() == i) {
                arrayListF.remove(i2);
                return;
            }
        }
    }

    public static void l(View view, r2 r2Var, h3 h3Var) {
        k2 k2Var;
        r2 r2Var2 = new r2(null, r2Var.b, null, h3Var, r2Var.c);
        View.AccessibilityDelegate accessibilityDelegateD = d(view);
        if (accessibilityDelegateD == null) {
            k2Var = null;
        } else {
            k2Var = accessibilityDelegateD instanceof j2 ? ((j2) accessibilityDelegateD).a : new k2(accessibilityDelegateD);
        }
        if (k2Var == null) {
            k2Var = new k2();
        }
        n(view, k2Var);
        k(view, r2Var2.a());
        f(view).add(r2Var2);
        h(view, 0);
    }

    public static void m(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            t52.b(view, context, iArr, attributeSet, typedArray, i, 0);
        }
    }

    public static void n(View view, k2 k2Var) {
        if (k2Var == null && (d(view) instanceof j2)) {
            k2Var = new k2();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(k2Var == null ? null : k2Var.b);
    }

    public static void o(View view, CharSequence charSequence) {
        new l52(2131296789, CharSequence.class, 8, 28, 1).f(view, charSequence);
        m52 m52Var = f;
        if (charSequence == null) {
            m52Var.a.remove(view);
            view.removeOnAttachStateChangeListener(m52Var);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(m52Var);
        } else {
            m52Var.a.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(m52Var);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(m52Var);
            }
        }
    }
}
