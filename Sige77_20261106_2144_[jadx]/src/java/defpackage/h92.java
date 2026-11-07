package defpackage;

import android.graphics.Rect;
import java.util.List;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class h92 {
    public final u92 a;
    public nq0[] b;
    public final Rect[][] c;
    public final Rect[][] d;

    public h92(u92 u92Var) {
        this.c = new Rect[10][];
        this.d = new Rect[10][];
        this.a = u92Var;
        c(u92Var);
    }

    public final void a() {
        nq0[] nq0VarArr = this.b;
        if (nq0VarArr != null) {
            nq0 nq0VarH = nq0VarArr[0];
            nq0 nq0VarH2 = nq0VarArr[1];
            u92 u92Var = this.a;
            if (nq0VarH2 == null) {
                nq0VarH2 = u92Var.a.h(2);
            }
            if (nq0VarH == null) {
                nq0VarH = u92Var.a.h(1);
            }
            h(nq0.a(nq0VarH, nq0VarH2));
            nq0 nq0Var = this.b[yi0.l(16)];
            if (nq0Var != null) {
                g(nq0Var);
            }
            nq0 nq0Var2 = this.b[yi0.l(32)];
            if (nq0Var2 != null) {
                e(nq0Var2);
            }
            nq0 nq0Var3 = this.b[yi0.l(64)];
            if (nq0Var3 != null) {
                i(nq0Var3);
            }
        }
    }

    public abstract u92 b();

    public void c(u92 u92Var) {
        for (int i = 1; i <= 512; i <<= 1) {
            List<Rect> listE = u92Var.a.e(i);
            int iL = yi0.l(i);
            this.c[iL] = (Rect[]) listE.toArray(new Rect[listE.size()]);
            if (i != 8) {
                List<Rect> listF = u92Var.a.f(i);
                this.d[iL] = (Rect[]) listF.toArray(new Rect[listF.size()]);
            }
        }
    }

    public void d(int i, nq0 nq0Var) {
        if (this.b == null) {
            this.b = new nq0[10];
        }
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                this.b[yi0.l(i2)] = nq0Var;
            }
        }
    }

    public abstract void f(nq0 nq0Var);

    public abstract void h(nq0 nq0Var);

    public h92() {
        this(new u92());
    }

    public void e(nq0 nq0Var) {
    }

    public void g(nq0 nq0Var) {
    }

    public void i(nq0 nq0Var) {
    }
}
