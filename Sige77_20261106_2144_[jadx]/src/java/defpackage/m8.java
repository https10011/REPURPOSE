package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class m8 {
    public static final PorterDuff.Mode b = PorterDuff.Mode.SRC_IN;
    public static m8 c;
    public aj1 a;

    public static synchronized m8 a() {
        try {
            if (c == null) {
                d();
            }
        } catch (Throwable th) {
            throw th;
        }
        return c;
    }

    public static synchronized PorterDuffColorFilter c(int i, PorterDuff.Mode mode) {
        return aj1.e(i, mode);
    }

    public static synchronized void d() {
        if (c == null) {
            m8 m8Var = new m8();
            c = m8Var;
            m8Var.a = aj1.b();
            aj1 aj1Var = c.a;
            qp0 qp0Var = new qp0(1);
            synchronized (aj1Var) {
                aj1Var.e = qp0Var;
            }
        }
    }

    public static void e(Drawable drawable, cy1 cy1Var, int[] iArr) {
        PorterDuff.Mode mode = aj1.f;
        int[] state = drawable.getState();
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z = cy1Var.d;
        if (!z && !cy1Var.c) {
            drawable.clearColorFilter();
            return;
        }
        PorterDuffColorFilter porterDuffColorFilterE = null;
        ColorStateList colorStateList = z ? cy1Var.a : null;
        PorterDuff.Mode mode2 = cy1Var.c ? cy1Var.b : aj1.f;
        if (colorStateList != null && mode2 != null) {
            porterDuffColorFilterE = aj1.e(colorStateList.getColorForState(iArr, 0), mode2);
        }
        drawable.setColorFilter(porterDuffColorFilterE);
    }

    public final synchronized Drawable b(Context context, int i) {
        return this.a.c(context, i);
    }
}
