package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class p52 {
    public static void a(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(2131296800);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    public static u92 b(View view, u92 u92Var, Rect rect) {
        WindowInsets windowInsetsG = u92Var.g();
        if (windowInsetsG != null) {
            return u92.h(view, view.computeSystemWindowInsets(windowInsetsG, rect));
        }
        rect.setEmpty();
        return u92Var;
    }

    public static void c(View view, s81 s81Var) {
        o52 o52Var = s81Var != null ? new o52(view, s81Var) : null;
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(2131296791, o52Var);
        }
        if (view.getTag(2131296790) != null) {
            return;
        }
        if (o52Var != null) {
            view.setOnApplyWindowInsetsListener(o52Var);
        } else {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(2131296800));
        }
    }
}
