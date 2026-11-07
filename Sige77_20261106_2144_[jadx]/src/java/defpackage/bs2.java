package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class bs2 implements Cloneable {
    public final cs2 a;
    public cs2 b;

    public bs2(cs2 cs2Var) {
        this.a = cs2Var;
        if (cs2Var.s()) {
            e.g("Default instance must be immutable.");
            throw null;
        }
        this.b = cs2Var.p();
    }

    public static void c(Object obj, Object obj2) {
        at2 at2Var = at2.c;
        at2Var.getClass();
        at2Var.a(obj.getClass()).g(obj, obj2);
    }

    public final Object clone() {
        bs2 bs2Var = (bs2) this.a.d(5);
        boolean zS = this.b.s();
        cs2 cs2Var = this.b;
        if (zS) {
            cs2Var.q();
            cs2Var = this.b;
        }
        bs2Var.b = cs2Var;
        return bs2Var;
    }

    public final cs2 d() {
        boolean zS = this.b.s();
        cs2 cs2Var = this.b;
        if (zS) {
            cs2Var.q();
            cs2Var = this.b;
        }
        cs2Var.getClass();
        if (cs2.n(cs2Var, true)) {
            return cs2Var;
        }
        throw new it2();
    }

    public final void f() {
        if (this.b.s()) {
            return;
        }
        g();
    }

    public final void g() {
        cs2 cs2VarP = this.a.p();
        c(cs2VarP, this.b);
        this.b = cs2VarP;
    }
}
