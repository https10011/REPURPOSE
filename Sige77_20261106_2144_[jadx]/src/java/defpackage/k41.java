package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class k41 implements zl1 {
    public final d1 a;
    public final u22 b;
    public final x80 c;

    public k41(u22 u22Var, x80 x80Var, d1 d1Var) {
        this.b = u22Var;
        x80Var.getClass();
        this.c = x80Var;
        this.a = d1Var;
    }

    @Override // defpackage.zl1
    public final int a(sh0 sh0Var) {
        this.b.getClass();
        return sh0Var.unknownFields.hashCode();
    }

    @Override // defpackage.zl1
    public final void b(Object obj, Object obj2) {
        cm1.k(this.b, obj, obj2);
    }

    @Override // defpackage.zl1
    public final void c(Object obj, wa waVar) {
        this.c.getClass();
        y00.n(obj);
        throw null;
    }

    @Override // defpackage.zl1
    public final void d(Object obj) {
        this.b.getClass();
        t22 t22Var = ((sh0) obj).unknownFields;
        if (t22Var.e) {
            t22Var.e = false;
        }
        this.c.getClass();
        y00.n(obj);
        throw null;
    }

    @Override // defpackage.zl1
    public final int e(sh0 sh0Var) {
        this.b.getClass();
        t22 t22Var = sh0Var.unknownFields;
        int i = t22Var.d;
        if (i != -1) {
            return i;
        }
        int iF = 0;
        for (int i2 = 0; i2 < t22Var.a; i2++) {
            int i3 = t22Var.b[i2] >>> 3;
            iF += un.f(3, (qj) t22Var.c[i2]) + un.i(i3) + un.h(2) + (un.h(1) * 2);
        }
        t22Var.d = iF;
        return iF;
    }

    @Override // defpackage.zl1
    public final void f(Object obj, we weVar, w80 w80Var) {
        this.b.getClass();
        u22.a(obj);
        this.c.getClass();
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.zl1
    public final boolean g(Object obj) {
        this.c.getClass();
        y00.n(obj);
        throw null;
    }

    @Override // defpackage.zl1
    public final boolean h(sh0 sh0Var, sh0 sh0Var2) {
        this.b.getClass();
        return sh0Var.unknownFields.equals(sh0Var2.unknownFields);
    }

    @Override // defpackage.zl1
    public final sh0 i() {
        d1 d1Var = this.a;
        return d1Var instanceof sh0 ? ((sh0) d1Var).i() : ((qh0) ((sh0) d1Var).c(5)).d();
    }
}
