package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.function.Supplier;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class s60 {
    public static final boolean h = Log.isLoggable("Engine", 2);
    public final xw a;
    public final j10 b;
    public final b11 c;
    public final qq d;
    public final ci e;
    public final q8 f;
    public final ud2 g;

    public s60(b11 b11Var, pv2 pv2Var, hj0 hj0Var, hj0 hj0Var2, hj0 hj0Var3, hj0 hj0Var4) {
        this.c = b11Var;
        bk0 bk0Var = new bk0(pv2Var);
        ud2 ud2Var = new ud2(2);
        this.g = ud2Var;
        synchronized (this) {
            synchronized (ud2Var) {
                ud2Var.c = this;
            }
        }
        this.b = new j10(5);
        this.a = new xw(2);
        qq qqVar = new qq();
        qqVar.i = gb2.I(150, new gk1(qqVar, 10));
        qqVar.a = hj0Var;
        qqVar.b = hj0Var2;
        qqVar.c = hj0Var3;
        qqVar.d = hj0Var4;
        qqVar.e = this;
        qqVar.f = this;
        this.d = qqVar;
        q8 q8Var = new q8();
        q8Var.c = gb2.I(150, new wa(q8Var, 11));
        q8Var.b = bk0Var;
        this.f = q8Var;
        ci ciVar = new ci();
        ciVar.b = new Handler(Looper.getMainLooper(), new of(2));
        this.e = ciVar;
        b11Var.d = this;
    }

    public static void c(String str, long j, x60 x60Var) {
        Log.v("Engine", str + " in " + e01.a(j) + "ms, key: " + x60Var);
    }

    public static void f(pi1 pi1Var) {
        if (pi1Var instanceof y60) {
            ((y60) pi1Var).c();
        } else {
            e.g("Cannot release anything but an EngineResource");
        }
    }

    public final ac2 a(cj0 cj0Var, Object obj, hv0 hv0Var, int i, int i2, Class cls, Class cls2, vc1 vc1Var, x10 x10Var, uj ujVar, boolean z, boolean z2, da1 da1Var, boolean z3, boolean z4, er1 er1Var, iz2 iz2Var) {
        long jElapsedRealtimeNanos;
        if (h) {
            int i3 = e01.b;
            jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        } else {
            jElapsedRealtimeNanos = 0;
        }
        this.b.getClass();
        x60 x60Var = new x60(obj, hv0Var, i, i2, ujVar, cls, cls2, da1Var);
        synchronized (this) {
            try {
                y60 y60VarB = b(x60Var, z3, jElapsedRealtimeNanos);
                if (y60VarB == null) {
                    return g(cj0Var, obj, hv0Var, i, i2, cls, cls2, vc1Var, x10Var, ujVar, z, z2, da1Var, z3, z4, er1Var, iz2Var, x60Var, jElapsedRealtimeNanos);
                }
                er1Var.g(y60VarB, 5);
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final y60 b(x60 x60Var, boolean z, long j) {
        y60 y60Var;
        Object obj;
        s60 s60Var;
        x60 x60Var2;
        y60 y60Var2;
        if (z) {
            ud2 ud2Var = this.g;
            synchronized (ud2Var) {
                j4 j4Var = (j4) ((HashMap) ud2Var.d).get(x60Var);
                if (j4Var == null) {
                    y60Var = null;
                } else {
                    y60Var = (y60) j4Var.get();
                    if (y60Var == null) {
                        ud2Var.f(j4Var);
                    }
                }
            }
            if (y60Var != null) {
                y60Var.a();
            }
            if (y60Var != null) {
                if (h) {
                    c("Loaded resource from active resources", j, x60Var);
                }
                return y60Var;
            }
            b11 b11Var = this.c;
            synchronized (b11Var) {
                y01 y01Var = (y01) b11Var.a.remove(x60Var);
                if (y01Var == null) {
                    obj = null;
                } else {
                    b11Var.c -= (long) y01Var.b;
                    obj = y01Var.a;
                }
            }
            pi1 pi1Var = (pi1) obj;
            if (pi1Var == null) {
                s60Var = this;
                x60Var2 = x60Var;
                y60Var2 = null;
            } else if (pi1Var instanceof y60) {
                y60Var2 = (y60) pi1Var;
                s60Var = this;
                x60Var2 = x60Var;
            } else {
                s60Var = this;
                x60Var2 = x60Var;
                y60Var2 = new y60(pi1Var, true, true, x60Var2, s60Var);
            }
            if (y60Var2 != null) {
                y60Var2.a();
                s60Var.g.c(x60Var2, y60Var2);
            }
            if (y60Var2 != null) {
                if (h) {
                    c("Loaded resource from cache", j, x60Var2);
                }
                return y60Var2;
            }
        }
        return null;
    }

    public final synchronized void d(w60 w60Var, x60 x60Var, y60 y60Var) {
        if (y60Var != null) {
            try {
                if (y60Var.a) {
                    this.g.c(x60Var, y60Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        xw xwVar = this.a;
        xwVar.getClass();
        w60Var.getClass();
        HashMap map = xwVar.a;
        if (w60Var == map.get(x60Var)) {
            map.remove(x60Var);
        }
    }

    public final void e(hv0 hv0Var, y60 y60Var) {
        ud2 ud2Var = this.g;
        synchronized (ud2Var) {
            j4 j4Var = (j4) ((HashMap) ud2Var.d).remove(hv0Var);
            if (j4Var != null) {
                j4Var.c = null;
                j4Var.clear();
            }
        }
        if (y60Var.a) {
        } else {
            this.e.c(y60Var, false);
        }
    }

    public final ac2 g(cj0 cj0Var, Object obj, hv0 hv0Var, int i, int i2, Class cls, Class cls2, vc1 vc1Var, x10 x10Var, Map map, boolean z, boolean z2, da1 da1Var, boolean z3, boolean z4, er1 er1Var, Executor executor, x60 x60Var, long j) {
        hj0 hj0Var;
        w60 w60Var = (w60) this.a.a.get(x60Var);
        if (w60Var != null) {
            w60Var.a(er1Var, executor);
            if (h) {
                c("Added to existing load", j, x60Var);
            }
            return new ac2(this, er1Var, w60Var);
        }
        w60 w60Var2 = (w60) ((ac2) this.d.i).h();
        synchronized (w60Var2) {
            w60Var2.X = x60Var;
            w60Var2.Y = z3;
            w60Var2.Z = z4;
        }
        q8 q8Var = this.f;
        jy jyVar = (jy) ((ac2) q8Var.c).h();
        int i3 = q8Var.a;
        q8Var.a = i3 + 1;
        hy hyVar = jyVar.a;
        bk0 bk0Var = jyVar.d;
        hyVar.c = cj0Var;
        hyVar.d = obj;
        hyVar.n = hv0Var;
        hyVar.e = i;
        hyVar.f = i2;
        hyVar.p = x10Var;
        hyVar.g = cls;
        hyVar.h = bk0Var;
        hyVar.k = cls2;
        hyVar.o = vc1Var;
        hyVar.i = da1Var;
        hyVar.j = map;
        hyVar.q = z;
        hyVar.r = z2;
        jyVar.v = cj0Var;
        jyVar.w = hv0Var;
        jyVar.W = vc1Var;
        jyVar.X = x60Var;
        jyVar.Y = i;
        jyVar.Z = i2;
        jyVar.a0 = x10Var;
        jyVar.b0 = da1Var;
        jyVar.c0 = w60Var2;
        jyVar.d0 = i3;
        jyVar.s0 = 1;
        jyVar.f0 = obj;
        jyVar.g0 = cj0Var.h;
        jyVar.h0 = (Supplier) da1Var.c(jy.u0);
        xw xwVar = this.a;
        xwVar.getClass();
        xwVar.a.put(x60Var, w60Var2);
        w60Var2.a(er1Var, executor);
        synchronized (w60Var2) {
            w60Var2.g0 = jyVar;
            int iH = jyVar.h(1);
            if (iH == 2 || iH == 3) {
                hj0Var = w60Var2.i;
            } else {
                hj0Var = w60Var2.Z ? w60Var2.w : w60Var2.v;
            }
            hj0Var.execute(jyVar);
        }
        if (h) {
            c("Started new load", j, x60Var);
        }
        return new ac2(this, er1Var, w60Var2);
    }
}
