package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import java.util.List;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class u82 extends y82 {
    public static final PathInterpolator e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);
    public static final t90 f = new t90();
    public static final DecelerateInterpolator g = new DecelerateInterpolator(1.5f);
    public static final AccelerateInterpolator h = new AccelerateInterpolator(1.5f);

    public static void e(View view) {
        e2 e2VarJ = j(view);
        if (e2VarJ != null) {
            ((View) e2VarJ.d).setTranslationY(0.0f);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                e(viewGroup.getChildAt(i));
            }
        }
    }

    public static void f(View view, u92 u92Var, boolean z) {
        e2 e2VarJ = j(view);
        if (e2VarJ != null) {
            e2VarJ.c = u92Var;
            if (!z) {
                View view2 = (View) e2VarJ.d;
                int[] iArr = (int[]) e2VarJ.e;
                view2.getLocationOnScreen(iArr);
                z = true;
                e2VarJ.a = iArr[1];
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                f(viewGroup.getChildAt(i), u92Var, z);
            }
        }
    }

    public static void g(View view, u92 u92Var, List list) {
        e2 e2VarJ = j(view);
        if (e2VarJ != null) {
            e2VarJ.e(u92Var, list);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                g(viewGroup.getChildAt(i), u92Var, list);
            }
        }
    }

    public static void h(View view, vf3 vf3Var) {
        e2 e2VarJ = j(view);
        if (e2VarJ != null) {
            View view2 = (View) e2VarJ.d;
            int[] iArr = (int[]) e2VarJ.e;
            view2.getLocationOnScreen(iArr);
            int i = e2VarJ.a - iArr[1];
            e2VarJ.b = i;
            view2.setTranslationY(i);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                h(viewGroup.getChildAt(i2), vf3Var);
            }
        }
    }

    public static WindowInsets i(View view, WindowInsets windowInsets) {
        return view.getTag(2131296791) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
    }

    public static e2 j(View view) {
        Object tag = view.getTag(2131296800);
        if (tag instanceof t82) {
            return ((t82) tag).a;
        }
        return null;
    }
}
