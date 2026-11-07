package defpackage;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.internal.measurement.zzdb;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class y53 implements j73 {
    public static volatile y53 s0;
    public final p23 W;
    public final r41 X;
    public final ua3 Y;
    public final w93 Z;
    public final Context a;
    public final xx2 a0;
    public final boolean b;
    public final da3 b0;
    public final nk1 c;
    public final String c0;
    public final is2 d;
    public m23 d0;
    public final h43 e;
    public lc3 e0;
    public final c33 f;
    public qu2 f0;
    public e23 g0;
    public fa3 h0;
    public final t53 i;
    public Boolean j0;
    public long k0;
    public volatile Boolean l0;
    public volatile boolean m0;
    public int n0;
    public int o0;
    public final long q0;
    public final long r0;
    public final td3 v;
    public final qf3 w;
    public boolean i0 = false;
    public final AtomicInteger p0 = new AtomicInteger(0);

    public y53(u73 u73Var) {
        Context applicationContext;
        long jCurrentTimeMillis;
        long jElapsedRealtime;
        boolean z = false;
        Context context = u73Var.a;
        nk1 nk1Var = new nk1(10);
        this.c = nk1Var;
        ye1.h = nk1Var;
        this.a = context;
        this.b = u73Var.e;
        this.l0 = u73Var.b;
        this.c0 = u73Var.h;
        boolean z2 = true;
        this.m0 = true;
        int i = 2;
        if (ka3.b == null && context != null) {
            Object obj = ka3.a;
            synchronized (obj) {
                try {
                    if (ka3.b == null) {
                        synchronized (obj) {
                            try {
                                l93 l93Var = ka3.b;
                                Context applicationContext2 = context.getApplicationContext();
                                if (applicationContext2 == null) {
                                    applicationContext2 = context;
                                }
                                if (l93Var == null || l93Var.a != applicationContext2) {
                                    if (l93Var != null) {
                                        Iterator it = n93.a.values().iterator();
                                        if (it.hasNext()) {
                                            if (it.next() != null) {
                                                throw new ClassCastException();
                                            }
                                            throw null;
                                        }
                                        sa3.a();
                                    }
                                    ka3.b = new l93(applicationContext2, ia.j(new na1(applicationContext2, i)));
                                    ka3.c.incrementAndGet();
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        this.X = r41.d;
        u83 u83Var = new u83(context, null, z73.a, f7.g, oj0.c);
        String strConcat = "com.google.android.gms.measurement#".concat(String.valueOf(context.getPackageName()));
        ei eiVarB = ei.b();
        eiVarB.d = new rd2(9, strConcat, new String[0]);
        u83Var.b(0, eiVarB.a());
        AtomicReference atomicReference = y93.k;
        if (atomicReference.get() == null) {
            try {
                applicationContext = context.getApplicationContext();
            } catch (NullPointerException unused) {
                y93.b();
                ta.P(Level.WARNING, (Executor) y93.m.get(), null, "context.getApplicationContext() yielded NullPointerException", new Object[0]);
                applicationContext = null;
            }
            if (applicationContext != null) {
                while (!atomicReference.compareAndSet(null, applicationContext) && atomicReference.get() == null) {
                }
            }
        }
        Long l = u73Var.f;
        if (l != null) {
            jCurrentTimeMillis = l.longValue();
        } else {
            this.X.getClass();
            jCurrentTimeMillis = System.currentTimeMillis();
        }
        this.q0 = jCurrentTimeMillis;
        Long l2 = u73Var.g;
        if (l2 != null) {
            jElapsedRealtime = l2.longValue();
        } else {
            this.X.getClass();
            jElapsedRealtime = SystemClock.elapsedRealtime();
        }
        this.r0 = jElapsedRealtime;
        is2 is2Var = new is2(this);
        is2Var.d = br0.v;
        this.d = is2Var;
        h43 h43Var = new h43(this);
        h43Var.H();
        this.e = h43Var;
        c33 c33Var = new c33(this);
        c33Var.H();
        this.f = c33Var;
        qf3 qf3Var = new qf3(this);
        qf3Var.H();
        this.w = qf3Var;
        this.W = new p23(new t73(u73Var, this));
        this.a0 = new xx2(this);
        ua3 ua3Var = new ua3(this);
        ua3Var.G();
        this.Y = ua3Var;
        w93 w93Var = new w93(this);
        w93Var.G();
        this.Z = w93Var;
        td3 td3Var = new td3(this);
        td3Var.G();
        this.v = td3Var;
        da3 da3Var = new da3(this);
        da3Var.H();
        this.b0 = da3Var;
        t53 t53Var = new t53(this);
        t53Var.H();
        this.i = t53Var;
        zzdb zzdbVar = u73Var.d;
        if (zzdbVar != null && zzdbVar.b != 0) {
            z2 = false;
        }
        if (this.a.getApplicationContext() instanceof Application) {
            k(w93Var);
            if (((y53) w93Var.a).a.getApplicationContext() instanceof Application) {
                Application application = (Application) ((y53) w93Var.a).a.getApplicationContext();
                if (w93Var.c == null) {
                    w93Var.c = new aa0(w93Var, i);
                }
                if (z2) {
                    application.unregisterActivityLifecycleCallbacks(w93Var.c);
                    application.registerActivityLifecycleCallbacks(w93Var.c);
                    c33 c33Var2 = ((y53) w93Var.a).f;
                    l(c33Var2);
                    c33Var2.a0.a("Registered activity lifecycle callback");
                }
            }
        } else {
            l(c33Var);
            c33Var.w.a("Application context is not an Application");
        }
        t53Var.N(new bh0(27, this, u73Var, z));
    }

    public static final void i(f03 f03Var) {
        if (f03Var != null) {
            return;
        }
        uq1.q("Component not created");
    }

    public static final void j(lo2 lo2Var) {
        if (lo2Var != null) {
            return;
        }
        uq1.q("Component not created");
    }

    public static final void k(k13 k13Var) {
        if (k13Var == null) {
            uq1.q("Component not created");
        } else {
            if (k13Var.b) {
                return;
            }
            uq1.q("Component not initialized: ".concat(String.valueOf(k13Var.getClass())));
        }
    }

    public static final void l(i73 i73Var) {
        if (i73Var == null) {
            uq1.q("Component not created");
        } else {
            if (i73Var.b) {
                return;
            }
            uq1.q("Component not initialized: ".concat(String.valueOf(i73Var.getClass())));
        }
    }

    public static y53 r(Context context, zzdb zzdbVar, Long l, Long l2) {
        Bundle bundle;
        if (zzdbVar != null) {
            Bundle bundle2 = zzdbVar.d;
            zzdbVar = new zzdb(zzdbVar.a, zzdbVar.b, zzdbVar.c, bundle2, (String) null);
        }
        gu2.o(context);
        gu2.o(context.getApplicationContext());
        if (s0 == null) {
            synchronized (y53.class) {
                try {
                    if (s0 == null) {
                        s0 = new y53(new u73(context, zzdbVar, l, l2));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else if (zzdbVar != null && (bundle = zzdbVar.d) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            gu2.o(s0);
            s0.l0 = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled"));
        }
        gu2.o(s0);
        return s0;
    }

    public final boolean a() {
        return c() == 0;
    }

    @Override // defpackage.j73
    public final nk1 b() {
        return this.c;
    }

    public final int c() {
        t53 t53Var = this.i;
        l(t53Var);
        t53Var.D();
        is2 is2Var = this.d;
        if (is2Var.S()) {
            return 1;
        }
        l(t53Var);
        t53Var.D();
        if (!this.m0) {
            return 8;
        }
        h43 h43Var = this.e;
        j(h43Var);
        h43Var.D();
        Boolean boolValueOf = h43Var.I().contains("measurement_enabled") ? Boolean.valueOf(h43Var.I().getBoolean("measurement_enabled", true)) : null;
        if (boolValueOf != null) {
            return boolValueOf.booleanValue() ? 0 : 3;
        }
        nk1 nk1Var = ((y53) is2Var.a).c;
        Boolean boolR = is2Var.R("firebase_analytics_collection_enabled");
        if (boolR != null) {
            return boolR.booleanValue() ? 0 : 4;
        }
        return (this.l0 == null || this.l0.booleanValue()) ? 0 : 7;
    }

    @Override // defpackage.j73
    public final c33 d() {
        c33 c33Var = this.f;
        l(c33Var);
        return c33Var;
    }

    @Override // defpackage.j73
    public final t53 e() {
        t53 t53Var = this.i;
        l(t53Var);
        return t53Var;
    }

    @Override // defpackage.j73
    public final Context f() {
        return this.a;
    }

    @Override // defpackage.j73
    public final r41 g() {
        return this.X;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0035  */
    /* JADX WARN: Code duplicated, block: B:24:0x0074  */
    /* JADX WARN: Code duplicated, block: B:27:0x007d  */
    public final boolean h() {
        qf3 qf3Var;
        Context context;
        boolean z = false;
        if (!this.i0) {
            uq1.q("AppMeasurement is not initialized");
            return false;
        }
        t53 t53Var = this.i;
        l(t53Var);
        t53Var.D();
        Boolean bool = this.j0;
        r41 r41Var = this.X;
        if (bool == null || this.k0 == 0) {
            r41Var.getClass();
            this.k0 = SystemClock.elapsedRealtime();
            qf3Var = this.w;
            j(qf3Var);
            if (qf3Var.h0("android.permission.INTERNET") && qf3Var.h0("android.permission.ACCESS_NETWORK_STATE")) {
                context = this.a;
                if (la2.a(context).c() || this.d.H() || (qf3.z0(context) && qf3.Z(context))) {
                    z = true;
                }
            }
            this.j0 = Boolean.valueOf(z);
            if (z) {
                this.j0 = Boolean.valueOf(qf3Var.K(q().L()));
            }
        } else if (!bool.booleanValue()) {
            r41Var.getClass();
            if (Math.abs(SystemClock.elapsedRealtime() - this.k0) > 1000) {
                r41Var.getClass();
                this.k0 = SystemClock.elapsedRealtime();
                qf3Var = this.w;
                j(qf3Var);
                if (qf3Var.h0("android.permission.INTERNET")) {
                    context = this.a;
                    if (la2.a(context).c()) {
                        z = true;
                    } else {
                        z = true;
                    }
                }
                this.j0 = Boolean.valueOf(z);
                if (z) {
                    this.j0 = Boolean.valueOf(qf3Var.K(q().L()));
                }
            }
        }
        return this.j0.booleanValue();
    }

    public final p23 m() {
        return this.W;
    }

    public final m23 n() {
        k(this.d0);
        return this.d0;
    }

    public final lc3 o() {
        k(this.e0);
        return this.e0;
    }

    public final qu2 p() {
        l(this.f0);
        return this.f0;
    }

    public final e23 q() {
        k(this.g0);
        return this.g0;
    }
}
