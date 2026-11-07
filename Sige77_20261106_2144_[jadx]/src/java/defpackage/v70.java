package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public abstract class v70 implements Runnable, Comparable, n20 {
    private volatile Object _heap;
    public long a;
    public int b = -1;

    public v70(long j) {
        this.a = j;
    }

    @Override // defpackage.n20
    public final void a() {
        synchronized (this) {
            try {
                Object obj = this._heap;
                vy2 vy2Var = y21.a;
                if (obj == vy2Var) {
                    return;
                }
                w70 w70Var = obj instanceof w70 ? (w70) obj : null;
                if (w70Var != null) {
                    synchronized (w70Var) {
                        Object obj2 = this._heap;
                        if ((obj2 instanceof kx1 ? (kx1) obj2 : null) != null) {
                            w70Var.b(this.b);
                        }
                    }
                }
                this._heap = vy2Var;
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int c(long j, w70 w70Var, x70 x70Var) {
        synchronized (this) {
            if (this._heap == y21.a) {
                return 2;
            }
            synchronized (w70Var) {
                try {
                    v70[] v70VarArr = w70Var.a;
                    v70 v70Var = v70VarArr != null ? v70VarArr[0] : null;
                    if (x70.w.get(x70Var) != 0) {
                        return 1;
                    }
                    if (v70Var == null) {
                        w70Var.c = j;
                    } else {
                        long j2 = v70Var.a;
                        if (j2 - j < 0) {
                            j = j2;
                        }
                        if (j - w70Var.c > 0) {
                            w70Var.c = j;
                        }
                    }
                    long j3 = this.a;
                    long j4 = w70Var.c;
                    if (j3 - j4 < 0) {
                        this.a = j4;
                    }
                    w70Var.a(this);
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = this.a - ((v70) obj).a;
        if (j > 0) {
            return 1;
        }
        return j < 0 ? -1 : 0;
    }

    public final void d(w70 w70Var) {
        if (this._heap != y21.a) {
            this._heap = w70Var;
        } else {
            e.g("Failed requirement.");
        }
    }

    public String toString() {
        return "Delayed[nanos=" + this.a + ']';
    }
}
