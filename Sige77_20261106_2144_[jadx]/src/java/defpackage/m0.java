package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class m0 extends xi0 {
    @Override // defpackage.xi0
    public final boolean c(v0 v0Var, j0 j0Var, j0 j0Var2) {
        synchronized (v0Var) {
            try {
                if (v0Var.b != j0Var) {
                    return false;
                }
                v0Var.b = j0Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.xi0
    public final boolean d(v0 v0Var, Object obj, Object obj2) {
        synchronized (v0Var) {
            try {
                if (v0Var.a != obj) {
                    return false;
                }
                v0Var.a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.xi0
    public final boolean e(v0 v0Var, u0 u0Var, u0 u0Var2) {
        synchronized (v0Var) {
            try {
                if (v0Var.c != u0Var) {
                    return false;
                }
                v0Var.c = u0Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.xi0
    public final j0 h(v0 v0Var) {
        j0 j0Var;
        j0 j0Var2 = j0.d;
        synchronized (v0Var) {
            try {
                j0Var = v0Var.b;
                if (j0Var != j0Var2) {
                    v0Var.b = j0Var2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return j0Var;
    }

    @Override // defpackage.xi0
    public final u0 i(v0 v0Var) {
        u0 u0Var;
        u0 u0Var2 = u0.c;
        synchronized (v0Var) {
            try {
                u0Var = v0Var.c;
                if (u0Var != u0Var2) {
                    v0Var.c = u0Var2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return u0Var;
    }

    @Override // defpackage.xi0
    public final void u(u0 u0Var, u0 u0Var2) {
        u0Var.b = u0Var2;
    }

    @Override // defpackage.xi0
    public final void v(u0 u0Var, Thread thread) {
        u0Var.a = thread;
    }
}
