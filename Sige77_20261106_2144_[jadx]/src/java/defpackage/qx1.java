package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class qx1 implements ci1, xh1 {
    public final ci1 a;
    public final Object b;
    public volatile er1 c;
    public volatile xh1 d;
    public int e = 3;
    public int f = 3;
    public boolean g;

    public qx1(Object obj, ci1 ci1Var) {
        this.b = obj;
        this.a = ci1Var;
    }

    @Override // defpackage.ci1, defpackage.xh1
    public final boolean a() {
        boolean z;
        synchronized (this.b) {
            try {
                z = this.d.a() || this.c.a();
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // defpackage.xh1
    public final boolean b(xh1 xh1Var) {
        if (!(xh1Var instanceof qx1)) {
            return false;
        }
        qx1 qx1Var = (qx1) xh1Var;
        if (this.c == null) {
            if (qx1Var.c != null) {
                return false;
            }
        } else if (!this.c.b(qx1Var.c)) {
            return false;
        }
        if (this.d == null) {
            return qx1Var.d == null;
        }
        return this.d.b(qx1Var.d);
    }

    @Override // defpackage.ci1
    public final boolean c(xh1 xh1Var) {
        boolean z;
        synchronized (this.b) {
            try {
                ci1 ci1Var = this.a;
                z = (ci1Var == null || ci1Var.c(this)) && xh1Var.equals(this.c) && this.e != 2;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // defpackage.xh1
    public final void clear() {
        synchronized (this.b) {
            this.g = false;
            this.e = 3;
            this.f = 3;
            this.d.clear();
            this.c.clear();
        }
    }

    @Override // defpackage.ci1
    public final boolean d(xh1 xh1Var) {
        boolean z;
        synchronized (this.b) {
            try {
                ci1 ci1Var = this.a;
                z = (ci1Var == null || ci1Var.d(this)) && xh1Var.equals(this.c) && !a();
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // defpackage.ci1
    public final void e(xh1 xh1Var) {
        synchronized (this.b) {
            try {
                if (!xh1Var.equals(this.c)) {
                    this.f = 5;
                    return;
                }
                this.e = 5;
                ci1 ci1Var = this.a;
                if (ci1Var != null) {
                    ci1Var.e(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.ci1
    public final boolean f(xh1 xh1Var) {
        boolean z;
        synchronized (this.b) {
            try {
                ci1 ci1Var = this.a;
                z = (ci1Var == null || ci1Var.f(this)) && (xh1Var.equals(this.c) || this.e != 4);
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // defpackage.ci1
    public final void g(xh1 xh1Var) {
        synchronized (this.b) {
            try {
                if (xh1Var.equals(this.d)) {
                    this.f = 4;
                    return;
                }
                this.e = 4;
                ci1 ci1Var = this.a;
                if (ci1Var != null) {
                    ci1Var.g(this);
                }
                if (!y00.f(this.f)) {
                    this.d.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [ci1] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    @Override // defpackage.ci1
    public final ci1 getRoot() {
        ?? root;
        synchronized (this.b) {
            try {
                ci1 ci1Var = this.a;
                this = this;
                if (ci1Var != null) {
                    root = ci1Var.getRoot();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return root;
    }

    @Override // defpackage.xh1
    public final boolean h() {
        boolean z;
        synchronized (this.b) {
            z = this.e == 3;
        }
        return z;
    }

    @Override // defpackage.xh1
    public final void i() {
        synchronized (this.b) {
            try {
                if (!y00.f(this.f)) {
                    this.f = 2;
                    this.d.i();
                }
                if (!y00.f(this.e)) {
                    this.e = 2;
                    this.c.i();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.xh1
    public final boolean isRunning() {
        boolean z;
        synchronized (this.b) {
            z = true;
            if (this.e != 1) {
                z = false;
            }
        }
        return z;
    }

    @Override // defpackage.xh1
    public final void j() {
        synchronized (this.b) {
            try {
                this.g = true;
                try {
                    if (this.e != 4 && this.f != 1) {
                        this.f = 1;
                        this.d.j();
                    }
                    if (this.g && this.e != 1) {
                        this.e = 1;
                        this.c.j();
                    }
                    this.g = false;
                } catch (Throwable th) {
                    this.g = false;
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // defpackage.xh1
    public final boolean k() {
        boolean z;
        synchronized (this.b) {
            z = this.e == 4;
        }
        return z;
    }
}
