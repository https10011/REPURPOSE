package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.Log;
import com.hjq.toast.BuildConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class er1 implements xh1 {
    public static final boolean C = Log.isLoggable("GlideRequest", 2);
    public final RuntimeException A;
    public int B;
    public final String a;
    public final ut1 b;
    public final Object c;
    public final ci1 d;
    public final Context e;
    public final cj0 f;
    public final Object g;
    public final Class h;
    public final nf i;
    public final int j;
    public final int k;
    public final vc1 l;
    public final kw1 m;
    public final List n;
    public final qz1 o;
    public final iz2 p;
    public pi1 q;
    public ac2 r;
    public long s;
    public volatile s60 t;
    public Drawable u;
    public Drawable v;
    public Drawable w;
    public int x;
    public int y;
    public boolean z;

    public er1(Context context, cj0 cj0Var, Object obj, Object obj2, Class cls, nf nfVar, int i, int i2, vc1 vc1Var, kw1 kw1Var, ArrayList arrayList, ci1 ci1Var, s60 s60Var, qz1 qz1Var) {
        iz2 iz2Var = ye1.a;
        this.a = C ? String.valueOf(hashCode()) : null;
        this.b = new ut1();
        this.c = obj;
        this.e = context;
        this.f = cj0Var;
        this.g = obj2;
        this.h = cls;
        this.i = nfVar;
        this.j = i;
        this.k = i2;
        this.l = vc1Var;
        this.m = kw1Var;
        this.n = arrayList;
        this.d = ci1Var;
        this.t = s60Var;
        this.o = qz1Var;
        this.p = iz2Var;
        this.B = 1;
        if (this.A == null && ((Map) cj0Var.h.b).containsKey(yi0.class)) {
            this.A = new RuntimeException("Glide request origin trace");
        }
    }

    @Override // defpackage.xh1
    public final boolean a() {
        boolean z;
        synchronized (this.c) {
            z = this.B == 4;
        }
        return z;
    }

    @Override // defpackage.xh1
    public final boolean b(xh1 xh1Var) {
        int i;
        int i2;
        Object obj;
        Class cls;
        nf nfVar;
        vc1 vc1Var;
        int size;
        int i3;
        int i4;
        Object obj2;
        Class cls2;
        nf nfVar2;
        vc1 vc1Var2;
        int size2;
        boolean zEquals;
        boolean zJ;
        if (!(xh1Var instanceof er1)) {
            return false;
        }
        synchronized (this.c) {
            try {
                i = this.j;
                i2 = this.k;
                obj = this.g;
                cls = this.h;
                nfVar = this.i;
                vc1Var = this.l;
                List list = this.n;
                size = list != null ? list.size() : 0;
            } catch (Throwable th) {
                throw th;
            }
        }
        er1 er1Var = (er1) xh1Var;
        synchronized (er1Var.c) {
            try {
                i3 = er1Var.j;
                i4 = er1Var.k;
                obj2 = er1Var.g;
                cls2 = er1Var.h;
                nfVar2 = er1Var.i;
                vc1Var2 = er1Var.l;
                List list2 = er1Var.n;
                size2 = list2 != null ? list2.size() : 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (i == i3 && i2 == i4) {
            if (obj == null) {
                zEquals = obj2 == null;
            } else {
                zEquals = obj.equals(obj2);
            }
            if (zEquals && cls.equals(cls2)) {
                if (nfVar == null) {
                    zJ = nfVar2 == null;
                } else {
                    zJ = nfVar.j(nfVar2);
                }
                if (zJ && vc1Var == vc1Var2 && size == size2) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void c() {
        if (this.z) {
            uq1.q("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
            return;
        }
        this.b.a();
        this.m.c(this);
        ac2 ac2Var = this.r;
        if (ac2Var != null) {
            synchronized (((s60) ac2Var.d)) {
                ((w60) ac2Var.b).g((er1) ac2Var.c);
            }
            this.r = null;
        }
    }

    @Override // defpackage.xh1
    public final void clear() {
        synchronized (this.c) {
            try {
                if (this.z) {
                    throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
                }
                this.b.a();
                if (this.B == 6) {
                    return;
                }
                c();
                pi1 pi1Var = this.q;
                if (pi1Var != null) {
                    this.q = null;
                } else {
                    pi1Var = null;
                }
                ci1 ci1Var = this.d;
                if (ci1Var == null || ci1Var.c(this)) {
                    this.m.i(d());
                }
                this.B = 6;
                if (pi1Var != null) {
                    this.t.getClass();
                    s60.f(pi1Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Drawable d() {
        if (this.v == null) {
            nf nfVar = this.i;
            nfVar.getClass();
            this.v = null;
            int i = nfVar.e;
            if (i > 0) {
                nfVar.getClass();
                Context context = this.e;
                this.v = yv2.z(context, context, i, context.getTheme());
            }
        }
        return this.v;
    }

    public final void e(String str) {
        Log.v("GlideRequest", str + " this: " + this.a);
    }

    public final void f(ej0 ej0Var, int i) {
        Drawable drawableD;
        this.b.a();
        synchronized (this.c) {
            try {
                ej0Var.getClass();
                int i2 = this.f.i;
                if (i2 <= i) {
                    Log.w("Glide", "Load failed for [" + this.g + "] with dimensions [" + this.x + "x" + this.y + "]", ej0Var);
                    if (i2 <= 4) {
                        ej0Var.d();
                    }
                }
                this.r = null;
                this.B = 5;
                ci1 ci1Var = this.d;
                if (ci1Var != null) {
                    ci1Var.e(this);
                }
                boolean z = true;
                this.z = true;
                try {
                    List list = this.n;
                    if (list != null) {
                        Iterator it = list.iterator();
                        if (it.hasNext()) {
                            if (it.next() != null) {
                                throw new ClassCastException();
                            }
                            ci1 ci1Var2 = this.d;
                            if (ci1Var2 == null) {
                                throw null;
                            }
                            ci1Var2.getRoot().a();
                            throw null;
                        }
                    }
                    ci1 ci1Var3 = this.d;
                    if (ci1Var3 != null && !ci1Var3.d(this)) {
                        z = false;
                    }
                    if (z) {
                        if (this.g == null) {
                            if (this.w == null) {
                                this.i.getClass();
                                this.w = null;
                            }
                            drawableD = this.w;
                        } else {
                            drawableD = null;
                        }
                        if (drawableD == null) {
                            if (this.u == null) {
                                nf nfVar = this.i;
                                nfVar.getClass();
                                this.u = null;
                                int i3 = nfVar.d;
                                if (i3 > 0) {
                                    Context context = this.e;
                                    this.i.getClass();
                                    this.u = yv2.z(context, context, i3, context.getTheme());
                                }
                            }
                            drawableD = this.u;
                        }
                        if (drawableD == null) {
                            drawableD = d();
                        }
                        this.m.a(drawableD);
                    }
                    this.z = false;
                } catch (Throwable th) {
                    this.z = false;
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void g(pi1 pi1Var, int i) {
        this.b.a();
        pi1 pi1Var2 = null;
        try {
            synchronized (this.c) {
                try {
                    this.r = null;
                    if (pi1Var == null) {
                        f(new ej0("Expected to receive a Resource<R> with an object of " + this.h + " inside, but instead got null."), 5);
                        return;
                    }
                    Object obj = pi1Var.get();
                    try {
                        if (obj == null || !this.h.isAssignableFrom(obj.getClass())) {
                            this.q = null;
                            StringBuilder sb = new StringBuilder("Expected to receive an object of ");
                            sb.append(this.h);
                            sb.append(" but instead got ");
                            sb.append(obj != null ? obj.getClass() : BuildConfig.FLAVOR);
                            sb.append("{");
                            sb.append(obj);
                            sb.append("} inside Resource{");
                            sb.append(pi1Var);
                            sb.append("}.");
                            sb.append(obj != null ? BuildConfig.FLAVOR : " To indicate failure return a null Resource object, rather than a Resource object containing null data.");
                            f(new ej0(sb.toString()), 5);
                        } else {
                            ci1 ci1Var = this.d;
                            if (ci1Var == null || ci1Var.f(this)) {
                                l(pi1Var, obj, i);
                                return;
                            } else {
                                this.q = null;
                                this.B = 4;
                            }
                        }
                        this.t.getClass();
                        s60.f(pi1Var);
                    } catch (Throwable th) {
                        pi1Var2 = pi1Var;
                        th = th;
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        } catch (Throwable th3) {
            if (pi1Var2 != null) {
                this.t.getClass();
                s60.f(pi1Var2);
            }
            throw th3;
        }
    }

    @Override // defpackage.xh1
    public final boolean h() {
        boolean z;
        synchronized (this.c) {
            z = this.B == 6;
        }
        return z;
    }

    @Override // defpackage.xh1
    public final void i() {
        synchronized (this.c) {
            try {
                if (isRunning()) {
                    clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.xh1
    public final boolean isRunning() {
        boolean z;
        synchronized (this.c) {
            int i = this.B;
            z = i == 2 || i == 3;
        }
        return z;
    }

    @Override // defpackage.xh1
    public final void j() {
        synchronized (this.c) {
            try {
                if (this.z) {
                    throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
                }
                this.b.a();
                int i = e01.b;
                this.s = SystemClock.elapsedRealtimeNanos();
                if (this.g == null) {
                    if (d42.z(this.j, this.k)) {
                        this.x = this.j;
                        this.y = this.k;
                    }
                    if (this.w == null) {
                        this.i.getClass();
                        this.w = null;
                    }
                    f(new ej0("Received null model"), this.w == null ? 5 : 3);
                    return;
                }
                int i2 = this.B;
                if (i2 == 2) {
                    throw new IllegalArgumentException("Cannot restart a running request");
                }
                if (i2 == 4) {
                    g(this.q, 5);
                    return;
                }
                List list = this.n;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (it.next() != null) {
                            throw new ClassCastException();
                        }
                    }
                }
                this.B = 3;
                if (d42.z(this.j, this.k)) {
                    m(this.j, this.k);
                } else {
                    this.m.e(this);
                }
                int i3 = this.B;
                if (i3 == 2 || i3 == 3) {
                    ci1 ci1Var = this.d;
                    if (ci1Var == null || ci1Var.d(this)) {
                        this.m.g(d());
                    }
                }
                if (C) {
                    e("finished run method in " + e01.a(this.s));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.xh1
    public final boolean k() {
        boolean z;
        synchronized (this.c) {
            z = this.B == 4;
        }
        return z;
    }

    public final void l(pi1 pi1Var, Object obj, int i) {
        ci1 ci1Var = this.d;
        if (ci1Var != null) {
            ci1Var.getRoot().a();
        }
        this.B = 4;
        this.q = pi1Var;
        if (this.f.i <= 3) {
            Log.d("Glide", "Finished loading " + obj.getClass().getSimpleName() + " from " + ts.y(i) + " for " + this.g + " with size [" + this.x + "x" + this.y + "] in " + e01.a(this.s) + " ms");
        }
        if (ci1Var != null) {
            ci1Var.g(this);
        }
        this.z = true;
        try {
            List list = this.n;
            if (list != null) {
                Iterator it = list.iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            }
            this.m.d(obj, this.o.b(i));
            this.z = false;
        } catch (Throwable th) {
            this.z = false;
            throw th;
        }
    }

    public final void m(int i, int i2) {
        Object obj;
        int iRound = i;
        this.b.a();
        Object obj2 = this.c;
        synchronized (obj2) {
            try {
                try {
                    boolean z = C;
                    if (z) {
                        e("Got onSizeReady in " + e01.a(this.s));
                    }
                    if (this.B != 3) {
                        return;
                    }
                    this.B = 2;
                    this.i.getClass();
                    if (iRound != Integer.MIN_VALUE) {
                        iRound = Math.round(iRound * 1.0f);
                    }
                    this.x = iRound;
                    this.y = i2 == Integer.MIN_VALUE ? i2 : Math.round(1.0f * i2);
                    if (z) {
                        e("finished setup for calling load in " + e01.a(this.s));
                    }
                    s60 s60Var = this.t;
                    cj0 cj0Var = this.f;
                    Object obj3 = this.g;
                    nf nfVar = this.i;
                    try {
                        try {
                            try {
                                try {
                                    this.r = s60Var.a(cj0Var, obj3, nfVar.w, this.x, this.y, nfVar.a0, this.h, this.l, nfVar.b, nfVar.Z, nfVar.W, nfVar.d0, nfVar.Y, nfVar.f, nfVar.e0, this, this.p);
                                    if (this.B != 2) {
                                        this.r = null;
                                    }
                                    if (z) {
                                        e("finished onSizeReady in " + e01.a(this.s));
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    obj = obj2;
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                obj = obj2;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            obj = obj2;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        obj = obj2;
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
            } catch (Throwable th6) {
                th = th6;
                obj = obj2;
            }
        }
    }

    public final String toString() {
        Object obj;
        Class cls;
        synchronized (this.c) {
            obj = this.g;
            cls = this.h;
        }
        return super.toString() + "[model=" + obj + ", transcodeClass=" + cls + "]";
    }
}
