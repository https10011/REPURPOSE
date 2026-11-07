package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class w60 implements o90 {
    public static final k42 i0 = new k42(5);
    public x60 X;
    public boolean Y;
    public boolean Z;
    public pi1 a0;
    public int b0;
    public final s60 c;
    public boolean c0;
    public final yb1 d;
    public ej0 d0;
    public boolean e0;
    public final s60 f;
    public y60 f0;
    public jy g0;
    public volatile boolean h0;
    public final hj0 i;
    public final hj0 v;
    public final hj0 w;
    public final v60 a = new v60(new ArrayList(2));
    public final ut1 b = new ut1();
    public final AtomicInteger W = new AtomicInteger();
    public final k42 e = i0;

    public w60(hj0 hj0Var, hj0 hj0Var2, hj0 hj0Var3, hj0 hj0Var4, s60 s60Var, s60 s60Var2, ac2 ac2Var) {
        this.i = hj0Var;
        this.v = hj0Var2;
        this.w = hj0Var4;
        this.f = s60Var;
        this.c = s60Var2;
        this.d = ac2Var;
    }

    public final synchronized void a(er1 er1Var, Executor executor) {
        try {
            this.b.a();
            this.a.a.add(new u60(er1Var, executor));
            int i = 1;
            if (this.c0) {
                d(1);
                executor.execute(new t60(this, er1Var, i));
            } else if (this.e0) {
                d(1);
                executor.execute(new t60(this, er1Var, 0));
            } else {
                am2.n("Cannot add callbacks to a cancelled EngineJob", !this.h0);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void b() {
        y60 y60Var;
        synchronized (this) {
            try {
                this.b.a();
                am2.n("Not yet complete!", e());
                int iDecrementAndGet = this.W.decrementAndGet();
                am2.n("Can't decrement below 0", iDecrementAndGet >= 0);
                if (iDecrementAndGet == 0) {
                    y60Var = this.f0;
                    f();
                } else {
                    y60Var = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (y60Var != null) {
            y60Var.c();
        }
    }

    @Override // defpackage.o90
    public final ut1 c() {
        return this.b;
    }

    public final synchronized void d(int i) {
        y60 y60Var;
        am2.n("Not yet complete!", e());
        if (this.W.getAndAdd(i) == 0 && (y60Var = this.f0) != null) {
            y60Var.a();
        }
    }

    public final boolean e() {
        return this.e0 || this.c0 || this.h0;
    }

    public final synchronized void f() {
        boolean zA;
        if (this.X == null) {
            throw new IllegalArgumentException();
        }
        this.a.a.clear();
        this.X = null;
        this.f0 = null;
        this.a0 = null;
        this.e0 = false;
        this.h0 = false;
        this.c0 = false;
        jy jyVar = this.g0;
        iy iyVar = jyVar.i;
        synchronized (iyVar) {
            iyVar.a = true;
            zA = iyVar.a();
        }
        if (zA) {
            jyVar.k();
        }
        this.g0 = null;
        this.d0 = null;
        this.b0 = 0;
        this.d.b(this);
    }

    public final synchronized void g(er1 er1Var) {
        try {
            this.b.a();
            this.a.a.remove(new u60(er1Var, ye1.b));
            if (this.a.a.isEmpty()) {
                if (!e()) {
                    this.h0 = true;
                    jy jyVar = this.g0;
                    jyVar.p0 = true;
                    nw nwVar = jyVar.n0;
                    if (nwVar != null) {
                        nwVar.cancel();
                    }
                    s60 s60Var = this.f;
                    x60 x60Var = this.X;
                    synchronized (s60Var) {
                        xw xwVar = s60Var.a;
                        xwVar.getClass();
                        HashMap map = xwVar.a;
                        if (this == map.get(x60Var)) {
                            map.remove(x60Var);
                        }
                    }
                }
                if (this.c0 || this.e0) {
                    if (this.W.get() == 0) {
                        f();
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
