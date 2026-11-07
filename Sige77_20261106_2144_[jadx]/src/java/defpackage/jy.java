package defpackage;

import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import com.hjq.toast.BuildConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.function.Supplier;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class jy implements mw, Runnable, Comparable, o90 {
    public static final z91 u0 = new z91("glide_thread_priority_override", null, z91.e);
    public vc1 W;
    public x60 X;
    public int Y;
    public int Z;
    public x10 a0;
    public da1 b0;
    public w60 c0;
    public final bk0 d;
    public int d0;
    public final yb1 e;
    public long e0;
    public Object f0;
    public kj0 g0;
    public Supplier h0;
    public Thread i0;
    public hv0 j0;
    public hv0 k0;
    public Object l0;
    public lw m0;
    public volatile nw n0;
    public volatile boolean o0;
    public volatile boolean p0;
    public boolean q0;
    public int r0;
    public int s0;
    public int t0;
    public cj0 v;
    public hv0 w;
    public final hy a = new hy();
    public final ArrayList b = new ArrayList();
    public final ut1 c = new ut1();
    public final ac2 f = new ac2(17);
    public final iy i = new iy();

    public jy(bk0 bk0Var, ac2 ac2Var) {
        this.d = bk0Var;
        this.e = ac2Var;
    }

    @Override // defpackage.mw
    public final void a(hv0 hv0Var, Exception exc, lw lwVar, int i) {
        lwVar.h();
        ej0 ej0Var = new ej0("Fetching data failed", Collections.singletonList(exc));
        Class clsA = lwVar.a();
        ej0Var.b = hv0Var;
        ej0Var.c = i;
        ej0Var.d = clsA;
        this.b.add(ej0Var);
        if (Thread.currentThread() == this.i0) {
            m();
            return;
        }
        this.s0 = 2;
        w60 w60Var = this.c0;
        (w60Var.Z ? w60Var.w : w60Var.v).execute(this);
    }

    @Override // defpackage.mw
    public final void b(hv0 hv0Var, Object obj, lw lwVar, int i, hv0 hv0Var2) {
        this.j0 = hv0Var;
        this.l0 = obj;
        this.m0 = lwVar;
        this.t0 = i;
        this.k0 = hv0Var2;
        this.q0 = hv0Var != this.a.a().get(0);
        if (Thread.currentThread() == this.i0) {
            f();
            return;
        }
        this.s0 = 3;
        w60 w60Var = this.c0;
        (w60Var.Z ? w60Var.w : w60Var.v).execute(this);
    }

    @Override // defpackage.o90
    public final ut1 c() {
        return this.c;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        jy jyVar = (jy) obj;
        int iOrdinal = this.W.ordinal() - jyVar.W.ordinal();
        return iOrdinal == 0 ? this.d0 - jyVar.d0 : iOrdinal;
    }

    public final pi1 d(lw lwVar, Object obj, int i) {
        if (obj == null) {
            lwVar.h();
            return null;
        }
        try {
            int i2 = e01.b;
            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            pi1 pi1VarE = e(i, obj);
            if (Log.isLoggable("DecodeJob", 2)) {
                i(jElapsedRealtimeNanos, "Decoded result " + pi1VarE, null);
            }
            return pi1VarE;
        } finally {
            lwVar.h();
        }
    }

    public final pi1 e(int i, Object obj) {
        Class<?> cls = obj.getClass();
        hy hyVar = this.a;
        ez0 ez0VarC = hyVar.c(cls);
        da1 da1Var = this.b0;
        int i2 = 4;
        if (Build.VERSION.SDK_INT >= 26) {
            boolean z = i == 4 || hyVar.r;
            z91 z91Var = b30.i;
            Boolean bool = (Boolean) da1Var.c(z91Var);
            if (bool == null || (bool.booleanValue() && !z)) {
                da1Var = new da1();
                uj ujVar = this.b0.b;
                uj ujVar2 = da1Var.b;
                ujVar2.g(ujVar);
                ujVar2.put(z91Var, Boolean.valueOf(z));
            }
        }
        da1 da1Var2 = da1Var;
        vw vwVarG = this.v.a().g(obj);
        try {
            return ez0VarC.a(this.Y, this.Z, new f6(this, i, i2), vwVarG, da1Var2);
        } finally {
            vwVarG.h();
        }
    }

    public final void f() {
        pi1 pi1VarD;
        boolean zA;
        Supplier supplier;
        if (Log.isLoggable("DecodeJob", 2)) {
            i(this.e0, "Retrieved data", "data: " + this.l0 + ", cache key: " + this.j0 + ", fetcher: " + this.m0);
        }
        yz0 yz0Var = null;
        if (((Map) this.g0.b).containsKey(aj0.class) && (supplier = this.h0) != null && supplier.get() != null) {
            try {
                Process.setThreadPriority(Process.myTid(), ((Integer) this.h0.get()).intValue());
            } catch (IllegalArgumentException | SecurityException e) {
                this.h0 = null;
                if (Log.isLoggable("DecodeJob", 2)) {
                    Log.v("DecodeJob", "Failed to set thread priority; using default priority for any subsequent jobs.", e);
                }
            }
        }
        try {
            pi1VarD = d(this.m0, this.l0, this.t0);
        } catch (ej0 e2) {
            hv0 hv0Var = this.k0;
            int i = this.t0;
            e2.b = hv0Var;
            e2.c = i;
            e2.d = null;
            this.b.add(e2);
            pi1VarD = null;
        }
        if (pi1VarD == null) {
            m();
            return;
        }
        int i2 = this.t0;
        if (pi1VarD instanceof bq0) {
            ((bq0) pi1VarD).a();
        }
        int i3 = 1;
        if (((yz0) this.f.d) != null) {
            yz0Var = (yz0) yz0.e.h();
            yz0Var.d = false;
            yz0Var.c = true;
            yz0Var.b = pi1VarD;
            pi1VarD = yz0Var;
        }
        if (((Map) this.g0.b).containsKey(aj0.class)) {
            l();
        }
        o();
        w60 w60Var = this.c0;
        synchronized (w60Var) {
            w60Var.a0 = pi1VarD;
            w60Var.b0 = i2;
        }
        synchronized (w60Var) {
            try {
                w60Var.b.a();
                if (w60Var.h0) {
                    w60Var.a0.e();
                    w60Var.f();
                } else {
                    if (w60Var.a.a.isEmpty()) {
                        throw new IllegalStateException("Received a resource without any callbacks to notify");
                    }
                    if (w60Var.c0) {
                        throw new IllegalStateException("Already have resource");
                    }
                    k42 k42Var = w60Var.e;
                    pi1 pi1Var = w60Var.a0;
                    boolean z = w60Var.Y;
                    x60 x60Var = w60Var.X;
                    s60 s60Var = w60Var.c;
                    k42Var.getClass();
                    w60Var.f0 = new y60(pi1Var, z, true, x60Var, s60Var);
                    w60Var.c0 = true;
                    v60 v60Var = w60Var.a;
                    v60Var.getClass();
                    ArrayList arrayList = new ArrayList(v60Var.a);
                    w60Var.d(arrayList.size() + 1);
                    w60Var.f.d(w60Var, w60Var.X, w60Var.f0);
                    int size = arrayList.size();
                    int i4 = 0;
                    while (i4 < size) {
                        Object obj = arrayList.get(i4);
                        i4++;
                        u60 u60Var = (u60) obj;
                        u60Var.b.execute(new t60(w60Var, u60Var.a, i3));
                    }
                    w60Var.b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.r0 = 5;
        try {
            ac2 ac2Var = this.f;
            if (((yz0) ac2Var.d) != null) {
                try {
                    this.d.a().a((hv0) ac2Var.b, new ac2((vi1) ac2Var.c, (yz0) ac2Var.d, this.b0, 16));
                    ((yz0) ac2Var.d).a();
                } catch (Throwable th2) {
                    ((yz0) ac2Var.d).a();
                    throw th2;
                }
            }
            if (yz0Var != null) {
                yz0Var.a();
            }
            iy iyVar = this.i;
            synchronized (iyVar) {
                iyVar.b = true;
                zA = iyVar.a();
            }
            if (zA) {
                k();
            }
        } catch (Throwable th3) {
            if (yz0Var == null) {
                throw th3;
            }
            yz0Var.a();
            throw th3;
        }
    }

    public final nw g() {
        int iV = ts.v(this.r0);
        hy hyVar = this.a;
        if (iV == 1) {
            return new qi1(hyVar, this);
        }
        if (iV == 2) {
            return new gw(hyVar.a(), hyVar, this);
        }
        if (iV == 3) {
            return new fs1(hyVar, this);
        }
        if (iV == 5) {
            return null;
        }
        uq1.q("Unrecognized stage: ".concat(ts.z(this.r0)));
        return null;
    }

    public final int h(int i) {
        int iV = ts.v(i);
        boolean z = false;
        if (iV == 0) {
            switch (this.a0.a) {
                case 0:
                case 1:
                    break;
                default:
                    z = true;
                    break;
            }
            if (z) {
                return 2;
            }
            return h(2);
        }
        if (iV != 1) {
            if (iV == 2) {
                return 4;
            }
            if (iV == 3 || iV == 5) {
                return 6;
            }
            e.g("Unrecognized stage: ".concat(ts.z(i)));
            return 0;
        }
        switch (this.a0.a) {
            case 0:
                break;
            case 1:
            default:
                z = true;
                break;
        }
        if (z) {
            return 3;
        }
        return h(3);
    }

    public final void i(long j, String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" in ");
        sb.append(e01.a(j));
        sb.append(", load key: ");
        sb.append(this.X);
        sb.append(str2 != null ? ", ".concat(str2) : BuildConfig.FLAVOR);
        sb.append(", thread: ");
        sb.append(Thread.currentThread().getName());
        Log.v("DecodeJob", sb.toString());
    }

    public final void j() {
        boolean zA;
        if (((Map) this.g0.b).containsKey(aj0.class)) {
            l();
        }
        o();
        ej0 ej0Var = new ej0("Failed to load resource", new ArrayList(this.b));
        w60 w60Var = this.c0;
        synchronized (w60Var) {
            w60Var.d0 = ej0Var;
        }
        synchronized (w60Var) {
            try {
                w60Var.b.a();
                if (w60Var.h0) {
                    w60Var.f();
                } else {
                    if (w60Var.a.a.isEmpty()) {
                        throw new IllegalStateException("Received an exception without any callbacks to notify");
                    }
                    if (w60Var.e0) {
                        throw new IllegalStateException("Already failed once");
                    }
                    w60Var.e0 = true;
                    x60 x60Var = w60Var.X;
                    v60 v60Var = w60Var.a;
                    v60Var.getClass();
                    ArrayList arrayList = new ArrayList(v60Var.a);
                    w60Var.d(arrayList.size() + 1);
                    w60Var.f.d(w60Var, x60Var, null);
                    int size = arrayList.size();
                    int i = 0;
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj = arrayList.get(i2);
                        i2++;
                        u60 u60Var = (u60) obj;
                        u60Var.b.execute(new t60(w60Var, u60Var.a, i));
                    }
                    w60Var.b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        iy iyVar = this.i;
        synchronized (iyVar) {
            iyVar.c = true;
            zA = iyVar.a();
        }
        if (zA) {
            k();
        }
    }

    public final void k() {
        iy iyVar = this.i;
        synchronized (iyVar) {
            iyVar.b = false;
            iyVar.a = false;
            iyVar.c = false;
        }
        ac2 ac2Var = this.f;
        ac2Var.b = null;
        ac2Var.c = null;
        ac2Var.d = null;
        hy hyVar = this.a;
        hyVar.c = null;
        hyVar.d = null;
        hyVar.n = null;
        hyVar.g = null;
        hyVar.k = null;
        hyVar.i = null;
        hyVar.o = null;
        hyVar.j = null;
        hyVar.p = null;
        hyVar.a.clear();
        hyVar.l = false;
        hyVar.b.clear();
        hyVar.m = false;
        this.o0 = false;
        this.v = null;
        this.w = null;
        this.b0 = null;
        this.W = null;
        this.X = null;
        this.c0 = null;
        this.r0 = 0;
        this.n0 = null;
        this.i0 = null;
        this.j0 = null;
        this.l0 = null;
        this.t0 = 0;
        this.m0 = null;
        this.e0 = 0L;
        this.p0 = false;
        this.f0 = null;
        this.b.clear();
        this.e.b(this);
    }

    public final void l() {
        if (!((Map) this.g0.b).containsKey(aj0.class)) {
            uq1.q("OverrideGlideThreadPriority experiment is not enabled.");
            return;
        }
        Supplier supplier = this.h0;
        if (supplier == null || supplier.get() == null) {
            return;
        }
        try {
            Process.setThreadPriority(Process.myTid(), 9);
        } catch (IllegalArgumentException | SecurityException e) {
            this.h0 = null;
            if (Log.isLoggable("DecodeJob", 2)) {
                Log.v("DecodeJob", "Failed to set thread priority; using default priority for any subsequent jobs.", e);
            }
        }
    }

    public final void m() {
        this.i0 = Thread.currentThread();
        int i = e01.b;
        this.e0 = SystemClock.elapsedRealtimeNanos();
        boolean zD = false;
        while (!this.p0 && this.n0 != null && !(zD = this.n0.d())) {
            this.r0 = h(this.r0);
            this.n0 = g();
            if (this.r0 == 4) {
                this.s0 = 2;
                w60 w60Var = this.c0;
                (w60Var.Z ? w60Var.w : w60Var.v).execute(this);
                return;
            }
        }
        if ((this.r0 == 6 || this.p0) && !zD) {
            j();
        }
    }

    public final void n() {
        String str;
        int iV = ts.v(this.s0);
        if (iV == 0) {
            this.r0 = h(1);
            this.n0 = g();
            m();
        } else {
            if (iV == 1) {
                m();
                return;
            }
            if (iV == 2) {
                f();
                return;
            }
            int i = this.s0;
            if (i == 1) {
                str = "INITIALIZE";
            } else if (i != 2) {
                str = i != 3 ? "null" : "DECODE_DATA";
            } else {
                str = "SWITCH_TO_SOURCE_SERVICE";
            }
            uq1.q("Unrecognized run reason: ".concat(str));
        }
    }

    public final void o() {
        Throwable th;
        this.c.a();
        if (!this.o0) {
            this.o0 = true;
            return;
        }
        if (this.b.isEmpty()) {
            th = null;
        } else {
            ArrayList arrayList = this.b;
            th = (Throwable) arrayList.get(arrayList.size() - 1);
        }
        throw new IllegalStateException("Already notified", th);
    }

    @Override // java.lang.Runnable
    public final void run() {
        lw lwVar = this.m0;
        try {
            try {
                if (this.p0) {
                    j();
                    if (lwVar != null) {
                        lwVar.h();
                        return;
                    }
                    return;
                }
                n();
                if (lwVar != null) {
                    lwVar.h();
                }
            } catch (Throwable th) {
                if (lwVar != null) {
                    lwVar.h();
                }
                throw th;
            }
        } catch (bk e) {
            throw e;
        } catch (Throwable th2) {
            if (Log.isLoggable("DecodeJob", 3)) {
                Log.d("DecodeJob", "DecodeJob threw unexpectedly, isCancelled: " + this.p0 + ", stage: " + ts.z(this.r0), th2);
            }
            if (this.r0 != 5) {
                this.b.add(th2);
                j();
            }
            if (!this.p0) {
                throw th2;
            }
            throw th2;
        }
    }
}
