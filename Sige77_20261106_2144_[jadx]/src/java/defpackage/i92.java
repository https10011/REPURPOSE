package defpackage;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class i92 extends r92 {
    public static boolean m;
    public static Method n;
    public static Class o;
    public static Field p;
    public static Field q;
    public final WindowInsets c;
    public nq0[] d;
    public nq0 e;
    public u92 f;
    public nq0 g;
    public int h;
    public int i;
    public int j;
    public Rect[][] k;
    public Rect[][] l;

    public i92(u92 u92Var, WindowInsets windowInsets) {
        super(u92Var);
        this.e = null;
        this.k = new Rect[10][];
        this.l = new Rect[10][];
        this.c = windowInsets;
    }

    private static List<Rect> A(Rect[][] rectArr, int i) {
        Rect[] rectArr2;
        Rect[] rectArr3 = null;
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0 && (rectArr2 = rectArr[yi0.l(i2)]) != null) {
                if (rectArr3 == null) {
                    rectArr3 = rectArr2;
                } else {
                    Rect[] rectArr4 = new Rect[rectArr3.length + rectArr2.length];
                    System.arraycopy(rectArr3, 0, rectArr4, 0, rectArr3.length);
                    System.arraycopy(rectArr2, 0, rectArr4, rectArr3.length, rectArr2.length);
                    rectArr3 = rectArr4;
                }
            }
        }
        return rectArr3 == null ? Collections.EMPTY_LIST : Arrays.asList(rectArr3);
    }

    private Rect[] B(nq0 nq0Var) {
        ArrayList arrayList = new ArrayList();
        int i = nq0Var.a;
        int i2 = nq0Var.d;
        int i3 = nq0Var.c;
        int i4 = nq0Var.b;
        if (i != 0) {
            arrayList.add(new Rect(0, 0, nq0Var.a, this.i));
        }
        if (i4 != 0) {
            arrayList.add(new Rect(0, 0, this.j, i4));
        }
        if (i3 != 0) {
            int i5 = this.j;
            arrayList.add(new Rect(i5 - i3, 0, i5, this.i));
        }
        if (i2 != 0) {
            int i6 = this.i;
            arrayList.add(new Rect(0, i6 - i2, this.j, i6));
        }
        return (Rect[]) arrayList.toArray(new Rect[arrayList.size()]);
    }

    private nq0 C(int i, boolean z) {
        nq0 nq0VarA = nq0.e;
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                nq0VarA = nq0.a(nq0VarA, D(i2, z));
            }
        }
        return nq0VarA;
    }

    private nq0 F() {
        u92 u92Var = this.f;
        return u92Var != null ? u92Var.a.j() : nq0.e;
    }

    private nq0 G(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            sm0.h("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
            return null;
        }
        if (!m) {
            H();
        }
        Method method = n;
        if (method != null && o != null && p != null) {
            try {
                Object objInvoke = method.invoke(view, null);
                if (objInvoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) p.get(q.get(objInvoke));
                if (rect != null) {
                    return nq0.b(rect.left, rect.top, rect.right, rect.bottom);
                }
                return null;
            } catch (ReflectiveOperationException e) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
            }
        }
        return null;
    }

    private static void H() {
        try {
            n = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            o = cls;
            p = cls.getDeclaredField("mVisibleInsets");
            q = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            p.setAccessible(true);
            q.setAccessible(true);
        } catch (ReflectiveOperationException e) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
        }
        m = true;
    }

    public static boolean J(int i, int i2) {
        return (i & 6) == (i2 & 6);
    }

    private l20 z(View view) {
        Display display;
        if (view == null || (display = view.getDisplay()) == null) {
            return null;
        }
        Point point = new Point();
        display.getRealSize(point);
        if (this.a.a.r()) {
            return l20.a(point.x, point.y, true, 0, 0, 0, 0);
        }
        kk1 kk1VarZ = am2.z(display, 0);
        kk1 kk1VarZ2 = am2.z(display, 1);
        kk1 kk1VarZ3 = am2.z(display, 2);
        kk1 kk1VarZ4 = am2.z(display, 3);
        return l20.a(point.x, point.y, false, kk1VarZ != null ? kk1VarZ.b : 0, kk1VarZ2 != null ? kk1VarZ2.b : 0, kk1VarZ3 != null ? kk1VarZ3.b : 0, kk1VarZ4 != null ? kk1VarZ4.b : 0);
    }

    public nq0 D(int i, boolean z) {
        nq0 nq0VarJ;
        int i2;
        nq0 nq0Var = nq0.e;
        if (i != 1) {
            if (i != 2) {
                if (i == 8) {
                    nq0[] nq0VarArr = this.d;
                    nq0VarJ = nq0VarArr != null ? nq0VarArr[yi0.l(8)] : null;
                    if (nq0VarJ != null) {
                        return nq0VarJ;
                    }
                    nq0 nq0VarL = l();
                    nq0 nq0VarF = F();
                    int i3 = nq0VarL.d;
                    if (i3 > nq0VarF.d) {
                        return nq0.b(0, 0, 0, i3);
                    }
                    nq0 nq0Var2 = this.g;
                    if (nq0Var2 != null && !nq0Var2.equals(nq0Var) && (i2 = this.g.d) > nq0VarF.d) {
                        return nq0.b(0, 0, 0, i2);
                    }
                } else {
                    if (i == 16) {
                        return k();
                    }
                    if (i == 32) {
                        return i();
                    }
                    if (i == 64) {
                        return m();
                    }
                    if (i == 128) {
                        u92 u92Var = this.f;
                        j20 j20VarG = u92Var != null ? u92Var.a.g() : g();
                        if (j20VarG != null) {
                            int i4 = Build.VERSION.SDK_INT;
                            return nq0.b(i4 >= 28 ? cs.g(j20VarG.a) : 0, i4 >= 28 ? cs.i(j20VarG.a) : 0, i4 >= 28 ? cs.h(j20VarG.a) : 0, i4 >= 28 ? cs.f(j20VarG.a) : 0);
                        }
                    }
                }
            } else {
                if (z) {
                    nq0 nq0VarF2 = F();
                    nq0 nq0VarJ2 = j();
                    return nq0.b(Math.max(nq0VarF2.a, nq0VarJ2.a), 0, Math.max(nq0VarF2.c, nq0VarJ2.c), Math.max(nq0VarF2.d, nq0VarJ2.d));
                }
                if ((this.h & 2) == 0) {
                    nq0 nq0VarL2 = l();
                    u92 u92Var2 = this.f;
                    nq0VarJ = u92Var2 != null ? u92Var2.a.j() : null;
                    int iMin = nq0VarL2.d;
                    if (nq0VarJ != null) {
                        iMin = Math.min(iMin, nq0VarJ.d);
                    }
                    return nq0.b(nq0VarL2.a, 0, nq0VarL2.c, iMin);
                }
            }
        } else {
            if (z) {
                return nq0.b(0, Math.max(F().b, l().b), 0, 0);
            }
            if ((this.h & 4) == 0) {
                return nq0.b(0, l().b, 0, 0);
            }
        }
        return nq0Var;
    }

    public nq0 E(int i) {
        return C(i, true);
    }

    public void I(nq0 nq0Var) {
        this.g = nq0Var;
    }

    @Override // defpackage.r92
    public void d(View view) {
        this.j = view.getWidth();
        this.i = view.getHeight();
        nq0 nq0VarG = G(view);
        if (nq0VarG == null) {
            nq0VarG = nq0.e;
        }
        I(nq0VarG);
    }

    @Override // defpackage.r92
    public List<Rect> e(int i) {
        return A(this.k, i);
    }

    @Override // defpackage.r92
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        i92 i92Var = (i92) obj;
        return Objects.equals(this.g, i92Var.g) && J(this.h, i92Var.h);
    }

    @Override // defpackage.r92
    public List<Rect> f(int i) {
        return A(this.l, i);
    }

    @Override // defpackage.r92
    public nq0 h(int i) {
        return C(i, false);
    }

    @Override // defpackage.r92
    public final nq0 l() {
        if (this.e == null) {
            WindowInsets windowInsets = this.c;
            this.e = nq0.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.e;
    }

    @Override // defpackage.r92
    public void n(View view) {
        z(view);
    }

    @Override // defpackage.r92
    public void o() {
        for (int i = 1; i <= 512; i <<= 1) {
            int iL = yi0.l(i);
            this.k[iL] = B(h(i));
            if (i != 8) {
                this.l[iL] = B(E(i));
            }
        }
    }

    @Override // defpackage.r92
    public u92 p(int i, int i2, int i3, int i4) {
        h92 b92Var;
        u92 u92VarH = u92.h(null, this.c);
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 36) {
            b92Var = new g92(u92VarH);
        } else if (i5 >= 35) {
            b92Var = new f92(u92VarH);
        } else if (i5 >= 34) {
            b92Var = new e92(u92VarH);
        } else if (i5 >= 31) {
            b92Var = new d92(u92VarH);
        } else if (i5 >= 30) {
            b92Var = new c92(u92VarH);
        } else {
            b92Var = i5 >= 29 ? new b92(u92VarH) : new a92(u92VarH);
        }
        b92Var.h(u92.e(l(), i, i2, i3, i4));
        b92Var.f(u92.e(j(), i, i2, i3, i4));
        return b92Var.b();
    }

    @Override // defpackage.r92
    public boolean r() {
        return this.c.isRound();
    }

    @Override // defpackage.r92
    public void t(nq0[] nq0VarArr) {
        this.d = nq0VarArr;
    }

    @Override // defpackage.r92
    public void u(u92 u92Var) {
        this.f = u92Var;
    }

    @Override // defpackage.r92
    public void w(int i) {
        this.h = i;
    }

    @Override // defpackage.r92
    public void x(Rect[][] rectArr) {
        Objects.requireNonNull(rectArr);
        this.k = (Rect[][]) rectArr.clone();
    }

    @Override // defpackage.r92
    public void y(Rect[][] rectArr) {
        Objects.requireNonNull(rectArr);
        this.l = (Rect[][]) rectArr.clone();
    }

    @Override // defpackage.r92
    public void s(l20 l20Var) {
    }
}
