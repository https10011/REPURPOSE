package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class m70 implements ci1, xh1 {
    public final Object a;
    public final ci1 b;
    public volatile xh1 c;
    public volatile xh1 d;
    public int e = 3;
    public int f = 3;

    public m70(Object obj, ci1 ci1Var) {
        this.a = obj;
        this.b = ci1Var;
    }

    @Override // defpackage.ci1, defpackage.xh1
    public final boolean a() {
        boolean z;
        synchronized (this.a) {
            try {
                z = this.c.a() || this.d.a();
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // defpackage.xh1
    public final boolean b(xh1 xh1Var) {
        if (xh1Var instanceof m70) {
            m70 m70Var = (m70) xh1Var;
            if (this.c.b(m70Var.c) && this.d.b(m70Var.d)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ci1
    public final boolean c(xh1 xh1Var) {
        boolean z;
        synchronized (this.a) {
            ci1 ci1Var = this.b;
            z = (ci1Var == null || ci1Var.c(this)) && xh1Var.equals(this.c);
        }
        return z;
    }

    @Override // defpackage.xh1
    public final void clear() {
        synchronized (this.a) {
            try {
                this.e = 3;
                this.c.clear();
                if (this.f != 3) {
                    this.f = 3;
                    this.d.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.ci1
    public final boolean d(xh1 xh1Var) {
        boolean z;
        boolean zEquals;
        int i;
        synchronized (this.a) {
            ci1 ci1Var = this.b;
            z = false;
            if (ci1Var == null || ci1Var.d(this)) {
                if (this.e != 5) {
                    zEquals = xh1Var.equals(this.c);
                } else {
                    zEquals = xh1Var.equals(this.d) && ((i = this.f) == 4 || i == 5);
                }
                if (zEquals) {
                    z = true;
                }
            }
        }
        return z;
    }

    @Override // defpackage.ci1
    public final void e(xh1 xh1Var) {
        synchronized (this.a) {
            try {
                if (xh1Var.equals(this.d)) {
                    this.f = 5;
                    ci1 ci1Var = this.b;
                    if (ci1Var != null) {
                        ci1Var.e(this);
                    }
                    return;
                }
                this.e = 5;
                if (this.f != 1) {
                    this.f = 1;
                    this.d.j();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.ci1
    public final boolean f(xh1 xh1Var) {
        boolean z;
        synchronized (this.a) {
            ci1 ci1Var = this.b;
            z = ci1Var == null || ci1Var.f(this);
        }
        return z;
    }

    @Override // defpackage.ci1
    public final void g(xh1 xh1Var) {
        synchronized (this.a) {
            try {
                if (xh1Var.equals(this.c)) {
                    this.e = 4;
                } else if (xh1Var.equals(this.d)) {
                    this.f = 4;
                }
                ci1 ci1Var = this.b;
                if (ci1Var != null) {
                    ci1Var.g(this);
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
        synchronized (this.a) {
            try {
                ci1 ci1Var = this.b;
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
        synchronized (this.a) {
            try {
                z = this.e == 3 && this.f == 3;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // defpackage.xh1
    public final void i() {
        synchronized (this.a) {
            try {
                if (this.e == 1) {
                    this.e = 2;
                    this.c.i();
                }
                if (this.f == 1) {
                    this.f = 2;
                    this.d.i();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.xh1
    public final boolean isRunning() {
        boolean z;
        synchronized (this.a) {
            try {
                z = true;
                if (this.e != 1 && this.f != 1) {
                    z = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // defpackage.xh1
    public final void j() {
        synchronized (this.a) {
            try {
                if (this.e != 1) {
                    this.e = 1;
                    this.c.j();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.xh1
    public final boolean k() {
        boolean z;
        synchronized (this.a) {
            try {
                z = this.e == 4 || this.f == 4;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }
}
