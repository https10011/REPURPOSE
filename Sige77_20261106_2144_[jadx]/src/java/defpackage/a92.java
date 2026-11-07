package defpackage;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class a92 extends h92 {
    public static Field g;
    public static boolean h;
    public static Constructor i;
    public static boolean j;
    public WindowInsets e;
    public nq0 f;

    public a92() {
        this.e = j();
    }

    private static WindowInsets j() {
        if (!h) {
            try {
                g = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e);
            }
            h = true;
        }
        Field field = g;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException e2) {
                Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e2);
            }
        }
        if (!j) {
            try {
                i = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e3) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e3);
            }
            j = true;
        }
        Constructor constructor = i;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e4) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e4);
            }
        }
        return null;
    }

    @Override // defpackage.h92
    public u92 b() {
        a();
        u92 u92VarH = u92.h(null, this.e);
        nq0[] nq0VarArr = this.b;
        r92 r92Var = u92VarH.a;
        r92Var.t(nq0VarArr);
        r92Var.v(this.f);
        r92Var.s(null);
        r92Var.x(this.c);
        r92Var.y(this.d);
        return u92VarH;
    }

    @Override // defpackage.h92
    public void f(nq0 nq0Var) {
        this.f = nq0Var;
    }

    @Override // defpackage.h92
    public void h(nq0 nq0Var) {
        WindowInsets windowInsets = this.e;
        if (windowInsets != null) {
            this.e = windowInsets.replaceSystemWindowInsets(nq0Var.a, nq0Var.b, nq0Var.c, nq0Var.d);
        }
    }

    public a92(u92 u92Var) {
        super(u92Var);
        this.e = u92Var.g();
    }
}
