package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public class r92 {
    public static final u92 b;
    public final u92 a;

    static {
        h92 b92Var;
        int i = Build.VERSION.SDK_INT;
        if (i >= 36) {
            b92Var = new g92();
        } else if (i >= 35) {
            b92Var = new f92();
        } else if (i >= 34) {
            b92Var = new e92();
        } else if (i >= 31) {
            b92Var = new d92();
        } else if (i >= 30) {
            b92Var = new c92();
        } else {
            b92Var = i >= 29 ? new b92() : new a92();
        }
        b = b92Var.b().a.a().a.b().a.c();
    }

    public r92(u92 u92Var) {
        this.a = u92Var;
    }

    public u92 a() {
        return this.a;
    }

    public u92 b() {
        return this.a;
    }

    public u92 c() {
        return this.a;
    }

    public List<Rect> e(int i) {
        return Collections.EMPTY_LIST;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r92)) {
            return false;
        }
        r92 r92Var = (r92) obj;
        return r() == r92Var.r() && q() == r92Var.q() && Objects.equals(l(), r92Var.l()) && Objects.equals(j(), r92Var.j()) && Objects.equals(g(), r92Var.g());
    }

    public List<Rect> f(int i) {
        return Collections.EMPTY_LIST;
    }

    public j20 g() {
        return null;
    }

    public nq0 h(int i) {
        return nq0.e;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(r()), Boolean.valueOf(q()), l(), j(), g());
    }

    public nq0 i() {
        return l();
    }

    public nq0 j() {
        return nq0.e;
    }

    public nq0 k() {
        return l();
    }

    public nq0 l() {
        return nq0.e;
    }

    public nq0 m() {
        return l();
    }

    public u92 p(int i, int i2, int i3, int i4) {
        return b;
    }

    public boolean q() {
        return false;
    }

    public boolean r() {
        return false;
    }

    public void o() {
    }

    public void d(View view) {
    }

    public void n(View view) {
    }

    public void s(l20 l20Var) {
    }

    public void t(nq0[] nq0VarArr) {
    }

    public void u(u92 u92Var) {
    }

    public void v(nq0 nq0Var) {
    }

    public void w(int i) {
    }

    public void x(Rect[][] rectArr) {
    }

    public void y(Rect[][] rectArr) {
    }
}
