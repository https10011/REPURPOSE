package defpackage;

import androidx.lifecycle.b;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class hz0 extends b {
    public final hi2 l;
    public ww0 m;
    public iz0 n;

    public hz0(hi2 hi2Var) {
        this.l = hi2Var;
        if (hi2Var.a == null) {
            hi2Var.a = this;
        } else {
            uq1.q("There is already a listener registered");
            throw null;
        }
    }

    public final void g() {
        hi2 hi2Var = this.l;
        hi2Var.b = true;
        hi2Var.d = false;
        hi2Var.c = false;
        hi2Var.i.drainPermits();
        hi2Var.c();
    }

    public final void h() {
        this.l.b = false;
    }

    public final void i(g81 g81Var) {
        super.i(g81Var);
        this.m = null;
        this.n = null;
    }

    public final void k() {
        ww0 ww0Var = this.m;
        iz0 iz0Var = this.n;
        if (ww0Var == null || iz0Var == null) {
            return;
        }
        super.i(iz0Var);
        e(ww0Var, iz0Var);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append("LoaderInfo{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" #0 : ");
        Class<?> cls = this.l.getClass();
        sb.append(cls.getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(cls)));
        sb.append("}}");
        return sb.toString();
    }
}
