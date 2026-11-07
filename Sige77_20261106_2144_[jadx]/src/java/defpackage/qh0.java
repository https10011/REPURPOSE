package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class qh0 implements Cloneable {
    public final sh0 a;
    public sh0 b;

    public qh0(sh0 sh0Var) {
        this.a = sh0Var;
        if (sh0Var.g()) {
            e.g("Default instance must be immutable.");
            throw null;
        }
        this.b = sh0Var.i();
    }

    public final sh0 c() {
        sh0 sh0VarD = d();
        sh0VarD.getClass();
        if (sh0.f(sh0VarD, true)) {
            return sh0VarD;
        }
        throw new o22();
    }

    public final Object clone() {
        qh0 qh0Var = (qh0) this.a.c(5);
        qh0Var.b = d();
        return qh0Var;
    }

    public final sh0 d() {
        boolean zG = this.b.g();
        sh0 sh0Var = this.b;
        if (!zG) {
            return sh0Var;
        }
        sh0Var.getClass();
        td1 td1Var = td1.c;
        td1Var.getClass();
        td1Var.a(sh0Var.getClass()).d(sh0Var);
        sh0Var.h();
        return this.b;
    }

    public final void f() {
        if (this.b.g()) {
            return;
        }
        sh0 sh0VarI = this.a.i();
        sh0 sh0Var = this.b;
        td1 td1Var = td1.c;
        td1Var.getClass();
        td1Var.a(sh0VarI.getClass()).b(sh0VarI, sh0Var);
        this.b = sh0VarI;
    }
}
