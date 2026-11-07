package defpackage;

import android.view.View;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class vx0 {
    public c50 a;
    public int b;
    public int c;
    public boolean d;
    public boolean e;

    public vx0() {
        c();
    }

    public final void a() {
        boolean z = this.d;
        c50 c50Var = this.a;
        this.c = z ? c50Var.g() : c50Var.k();
    }

    public final void b(View view, int i) {
        c50 c50Var = this.a;
        int iL = Integer.MIN_VALUE == c50Var.a ? 0 : c50Var.l() - c50Var.a;
        if (iL >= 0) {
            boolean z = this.d;
            c50 c50Var2 = this.a;
            if (z) {
                int iB = c50Var2.b(view);
                c50 c50Var3 = this.a;
                this.c = (Integer.MIN_VALUE != c50Var3.a ? c50Var3.l() - c50Var3.a : 0) + iB;
            } else {
                this.c = c50Var2.e(view);
            }
            this.b = i;
            return;
        }
        this.b = i;
        boolean z2 = this.d;
        c50 c50Var4 = this.a;
        if (!z2) {
            int iE = c50Var4.e(view);
            int iK = iE - this.a.k();
            this.c = iE;
            if (iK > 0) {
                int iG = (this.a.g() - Math.min(0, (this.a.g() - iL) - this.a.b(view))) - (this.a.c(view) + iE);
                if (iG < 0) {
                    this.c -= Math.min(iK, -iG);
                    return;
                }
                return;
            }
            return;
        }
        int iG2 = (c50Var4.g() - iL) - this.a.b(view);
        this.c = this.a.g() - iG2;
        if (iG2 > 0) {
            int iC = this.c - this.a.c(view);
            int iK2 = this.a.k();
            int iMin = iC - (Math.min(this.a.e(view) - iK2, 0) + iK2);
            if (iMin < 0) {
                this.c = Math.min(iG2, -iMin) + this.c;
            }
        }
    }

    public final void c() {
        this.b = -1;
        this.c = Integer.MIN_VALUE;
        this.d = false;
        this.e = false;
    }

    public final String toString() {
        return "AnchorInfo{mPosition=" + this.b + ", mCoordinate=" + this.c + ", mLayoutFromEnd=" + this.d + ", mValid=" + this.e + '}';
    }
}
