package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class u92 {
    public static final u92 b;
    public final r92 a;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            b = o92.w;
        } else if (i >= 30) {
            b = m92.v;
        } else {
            b = r92.b;
        }
    }

    public u92(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            this.a = new q92(this, windowInsets);
            return;
        }
        if (i >= 34) {
            this.a = new o92(this, windowInsets);
            return;
        }
        if (i >= 31) {
            this.a = new n92(this, windowInsets);
            return;
        }
        if (i >= 30) {
            this.a = new m92(this, windowInsets);
            return;
        }
        if (i >= 29) {
            this.a = new l92(this, windowInsets);
        } else if (i >= 28) {
            this.a = new k92(this, windowInsets);
        } else {
            this.a = new j92(this, windowInsets);
        }
    }

    public static nq0 e(nq0 nq0Var, int i, int i2, int i3, int i4) {
        int iMax = Math.max(0, nq0Var.a - i);
        int iMax2 = Math.max(0, nq0Var.b - i2);
        int iMax3 = Math.max(0, nq0Var.c - i3);
        int iMax4 = Math.max(0, nq0Var.d - i4);
        return (iMax == i && iMax2 == i2 && iMax3 == i3 && iMax4 == i4) ? nq0Var : nq0.b(iMax, iMax2, iMax3, iMax4);
    }

    public static u92 h(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        u92 u92Var = new u92(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap weakHashMap = x52.a;
            u92 u92VarA = q52.a(view);
            r92 r92Var = u92Var.a;
            r92Var.u(u92VarA);
            View rootView = view.getRootView();
            r92Var.d(rootView);
            r92Var.n(rootView);
            r92Var.o();
            r92Var.w(view.getWindowSystemUiVisibility());
        }
        return u92Var;
    }

    public final int a() {
        return this.a.l().d;
    }

    public final int b() {
        return this.a.l().a;
    }

    public final int c() {
        return this.a.l().c;
    }

    public final int d() {
        return this.a.l().b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof u92) {
            return Objects.equals(this.a, ((u92) obj).a);
        }
        return false;
    }

    public final u92 f(int i, int i2, int i3, int i4) {
        h92 b92Var;
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 36) {
            b92Var = new g92(this);
        } else if (i5 >= 35) {
            b92Var = new f92(this);
        } else if (i5 >= 34) {
            b92Var = new e92(this);
        } else if (i5 >= 31) {
            b92Var = new d92(this);
        } else if (i5 >= 30) {
            b92Var = new c92(this);
        } else {
            b92Var = i5 >= 29 ? new b92(this) : new a92(this);
        }
        b92Var.h(nq0.b(i, i2, i3, i4));
        return b92Var.b();
    }

    public final WindowInsets g() {
        r92 r92Var = this.a;
        if (r92Var instanceof i92) {
            return ((i92) r92Var).c;
        }
        return null;
    }

    public final int hashCode() {
        r92 r92Var = this.a;
        if (r92Var == null) {
            return 0;
        }
        return r92Var.hashCode();
    }

    public u92() {
        this.a = new r92(this);
    }
}
