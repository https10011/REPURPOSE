package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class n1 extends zi0 {
    @Override // defpackage.zi0
    public final boolean c(p1 p1Var, l1 l1Var, l1 l1Var2) {
        synchronized (p1Var) {
            try {
                if (p1Var.b != l1Var) {
                    return false;
                }
                p1Var.b = l1Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.zi0
    public final boolean d(p1 p1Var, Object obj, Object obj2) {
        synchronized (p1Var) {
            try {
                if (p1Var.a != obj) {
                    return false;
                }
                p1Var.a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.zi0
    public final boolean e(p1 p1Var, o1 o1Var, o1 o1Var2) {
        synchronized (p1Var) {
            try {
                if (p1Var.c != o1Var) {
                    return false;
                }
                p1Var.c = o1Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.zi0
    public final void s(o1 o1Var, o1 o1Var2) {
        o1Var.b = o1Var2;
    }

    @Override // defpackage.zi0
    public final void t(o1 o1Var, Thread thread) {
        o1Var.a = thread;
    }
}
