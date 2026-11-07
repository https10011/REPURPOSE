package defpackage;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class kp0 implements fp0 {
    public static kp0 m;
    public final Object a;
    public final Class b;
    public final Class c;
    public final Class d;
    public final Class e;
    public final Class f;
    public final Method g;
    public final Method h;
    public final Method i;
    public final Method j;
    public final qp0 k;
    public static final xn l = new xn(7);
    public static final AtomicBoolean n = new AtomicBoolean(false);
    public static final ConcurrentHashMap o = new ConcurrentHashMap();
    public static final ConcurrentHashMap p = new ConcurrentHashMap();
    public static final ConcurrentHashMap q = new ConcurrentHashMap();

    public kp0(Object obj, Class cls, Class cls2, Class cls3, Class cls4, Class cls5, Method method, Method method2, Method method3, Method method4, qp0 qp0Var) {
        this.a = obj;
        this.b = cls;
        this.c = cls2;
        this.d = cls3;
        this.e = cls4;
        this.f = cls5;
        this.g = method;
        this.h = method2;
        this.i = method3;
        this.j = method4;
        this.k = qp0Var;
    }

    public static final String b() {
        if (mt.a.contains(kp0.class)) {
            return null;
        }
        return "kp0";
    }

    @Override // defpackage.fp0
    public final void a(rp0 rp0Var, Runnable runnable) {
        if (mt.a.contains(this)) {
            return;
        }
        try {
            c(new dg(this, rp0Var, runnable, 8));
        } catch (Throwable th) {
            mt.a(this, th);
        }
    }

    public final void c(Runnable runnable) {
        if (mt.a.contains(this)) {
            return;
        }
        try {
            if (n.get()) {
                runnable.run();
            } else {
                e(runnable);
            }
        } catch (Throwable th) {
            mt.a(this, th);
        }
    }

    public final Object d() {
        if (mt.a.contains(this)) {
            return null;
        }
        try {
            return this.a;
        } catch (Throwable th) {
            mt.a(this, th);
            return null;
        }
    }

    public final void e(Runnable runnable) {
        Method methodO;
        Class cls = this.b;
        if (mt.a.contains(this)) {
            return;
        }
        try {
            Class clsJ = sp0.j("com.android.billingclient.api.BillingClientStateListener");
            if (clsJ == null || (methodO = sp0.o(cls, "startConnection", clsJ)) == null) {
                return;
            }
            sp0.s(cls, methodO, d(), Proxy.newProxyInstance(clsJ.getClassLoader(), new Class[]{clsJ}, new hp0(runnable)));
        } catch (Throwable th) {
            mt.a(this, th);
        }
    }
}
