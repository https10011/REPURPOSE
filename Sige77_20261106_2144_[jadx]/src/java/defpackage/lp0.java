package defpackage;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.json.JSONObject;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class lp0 implements fp0 {
    public static lp0 I;
    public final Method A;
    public final Method B;
    public final Method C;
    public final Method D;
    public final Method E;
    public final Method F;
    public final Object a;
    public final Class b;
    public final Class c;
    public final Class d;
    public final Class e;
    public final Class f;
    public final Class g;
    public final Class h;
    public final Class i;
    public final Class j;
    public final Class k;
    public final Class l;
    public final Class m;
    public final Class n;
    public final Class o;
    public final Method p;
    public final Method q;
    public final Method r;
    public final Method s;
    public final Method t;
    public final Method u;
    public final Method v;
    public final Method w;
    public final Method x;
    public final Method y;
    public final Method z;
    public static final jp0 G = new jp0(1);
    public static final AtomicBoolean H = new AtomicBoolean(false);
    public static final ConcurrentHashMap J = new ConcurrentHashMap();
    public static final ConcurrentHashMap K = new ConcurrentHashMap();
    public static final ConcurrentHashMap L = new ConcurrentHashMap();

    public lp0(Object obj, Class cls, Class cls2, Class cls3, Class cls4, Class cls5, Class cls6, Class cls7, Class cls8, Class cls9, Class cls10, Class cls11, Class cls12, Class cls13, Class cls14, Method method, Method method2, Method method3, Method method4, Method method5, Method method6, Method method7, Method method8, Method method9, Method method10, Method method11, Method method12, Method method13, Method method14, Method method15, Method method16, Method method17) {
        this.a = obj;
        this.b = cls;
        this.c = cls2;
        this.d = cls3;
        this.e = cls4;
        this.f = cls5;
        this.g = cls6;
        this.h = cls7;
        this.i = cls8;
        this.j = cls9;
        this.k = cls10;
        this.l = cls11;
        this.m = cls12;
        this.n = cls13;
        this.o = cls14;
        this.p = method;
        this.q = method2;
        this.r = method3;
        this.s = method4;
        this.t = method5;
        this.u = method6;
        this.v = method7;
        this.w = method8;
        this.x = method9;
        this.y = method10;
        this.z = method11;
        this.A = method12;
        this.B = method13;
        this.C = method14;
        this.D = method15;
        this.E = method16;
        this.F = method17;
    }

    public static final String b() {
        if (mt.a.contains(lp0.class)) {
            return null;
        }
        return "lp0";
    }

    @Override // defpackage.fp0
    public final void a(rp0 rp0Var, Runnable runnable) {
        if (mt.a.contains(this)) {
            return;
        }
        try {
            c(new dg(this, rp0Var, runnable, 9));
        } catch (Throwable th) {
            mt.a(this, th);
        }
    }

    public final void c(Runnable runnable) {
        if (mt.a.contains(this)) {
            return;
        }
        try {
            if (H.get()) {
                runnable.run();
            } else {
                l(runnable);
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

    public final String e(String str) {
        if (!mt.a.contains(this)) {
            try {
                Matcher matcher = new Regex("jsonString='(.*?)'").a.matcher(str);
                matcher.getClass();
                p11 p11Var = !matcher.find(0) ? null : new p11(matcher, str);
                if (p11Var != null) {
                    Collection collectionI = p11Var.i();
                    return (String) (1 < ((d0) collectionI).a() ? ((y11) collectionI).get(1) : null);
                }
            } catch (Throwable th) {
                mt.a(this, th);
                return null;
            }
        }
        return null;
    }

    public final Object f(rp0 rp0Var, ArrayList arrayList) {
        Class cls = this.j;
        Class cls2 = this.l;
        if (!mt.a.contains(this)) {
            try {
                if (!arrayList.isEmpty()) {
                    ArrayList arrayList2 = new ArrayList();
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        Object objS = sp0.s(cls2, this.A, sp0.s(cls2, this.C, sp0.s(cls2, this.B, sp0.s(this.f, this.z, null, new Object[0]), (String) obj), rp0Var.a), new Object[0]);
                        if (objS != null) {
                            arrayList2.add(objS);
                        }
                    }
                    return sp0.s(cls, this.x, sp0.s(cls, this.y, sp0.s(this.h, this.w, null, new Object[0]), arrayList2), new Object[0]);
                }
            } catch (Throwable th) {
                mt.a(this, th);
                return null;
            }
        }
        return null;
    }

    public final Object g(rp0 rp0Var) {
        Class cls = this.k;
        if (mt.a.contains(this)) {
            return null;
        }
        try {
            return sp0.s(cls, this.s, sp0.s(cls, this.t, sp0.s(this.i, this.r, null, new Object[0]), rp0Var.a), new Object[0]);
        } catch (Throwable th) {
            mt.a(this, th);
            return null;
        }
    }

    public final void h(Object[] objArr, Object[] objArr2) {
        if (mt.a.contains(this) || objArr2 == null) {
            return;
        }
        try {
            if (objArr2.length == 0) {
                return;
            }
            if (Intrinsics.areEqual(sp0.s(this.g, this.F, objArr2[0], new Object[0]), 0)) {
                H.set(true);
                if (objArr.length == 0) {
                    return;
                }
                Object obj = objArr[0];
                if (obj instanceof Runnable) {
                    ((Runnable) obj).run();
                }
            }
        } catch (Throwable th) {
            mt.a(this, th);
        }
    }

    public final void i(Object[] objArr, Object[] objArr2) {
        String strE;
        if (mt.a.contains(this)) {
            return;
        }
        try {
            Object objK = wb.k(0, objArr);
            Object objK2 = objArr2 != null ? wb.k(1, objArr2) : null;
            if (objK2 != null && (objK2 instanceof List)) {
                Iterator it = ((List) objK2).iterator();
                while (it.hasNext()) {
                    try {
                        Object objS = sp0.s(this.d, this.D, it.next(), new Object[0]);
                        String str = objS instanceof String ? (String) objS : null;
                        if (str != null && (strE = e(str)) != null) {
                            JSONObject jSONObject = new JSONObject(strE);
                            if (jSONObject.has("productId")) {
                                String string = jSONObject.getString("productId");
                                ConcurrentHashMap concurrentHashMap = L;
                                string.getClass();
                                concurrentHashMap.put(string, jSONObject);
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
                if (objK == null || !(objK instanceof Runnable)) {
                    return;
                }
                ((Runnable) objK).run();
            }
        } catch (Throwable th) {
            mt.a(this, th);
        }
    }

    public final void j(Object[] objArr, Object[] objArr2) {
        Throwable th;
        Object objK;
        if (mt.a.contains(this)) {
            return;
        }
        try {
            Object objK2 = wb.k(0, objArr);
            if (objK2 != null && (objK2 instanceof rp0)) {
                Object objK3 = wb.k(1, objArr);
                if (objK3 instanceof Runnable) {
                    if (objArr2 != null) {
                        try {
                            objK = wb.k(1, objArr2);
                        } catch (Throwable th2) {
                            th = th2;
                            this = this;
                        }
                    } else {
                        objK = null;
                    }
                    if (objK != null && (objK instanceof List)) {
                        ArrayList arrayList = new ArrayList();
                        Iterator it = ((List) objK).iterator();
                        while (it.hasNext()) {
                            try {
                                Object objS = sp0.s(this.e, this.u, it.next(), new Object[0]);
                                String str = objS instanceof String ? (String) objS : null;
                                if (str != null) {
                                    JSONObject jSONObject = new JSONObject(str);
                                    if (jSONObject.has("productId")) {
                                        String string = jSONObject.getString("productId");
                                        if (!L.containsKey(string)) {
                                            string.getClass();
                                            arrayList.add(string);
                                        }
                                        if (objK2 == rp0.INAPP) {
                                            ConcurrentHashMap concurrentHashMap = J;
                                            string.getClass();
                                            concurrentHashMap.put(string, jSONObject);
                                        } else {
                                            ConcurrentHashMap concurrentHashMap2 = K;
                                            string.getClass();
                                            concurrentHashMap2.put(string, jSONObject);
                                        }
                                    }
                                }
                            } catch (Exception unused) {
                            }
                        }
                        if (arrayList.isEmpty()) {
                            try {
                                ((Runnable) objK3).run();
                                return;
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        } else {
                            rp0 rp0Var = (rp0) objK2;
                            Runnable runnable = (Runnable) objK3;
                            try {
                                try {
                                    if (mt.a.contains(this)) {
                                        return;
                                    }
                                    try {
                                        this = this;
                                        try {
                                            this.c(new gp0(1, arrayList, this, runnable, rp0Var));
                                            return;
                                        } catch (Throwable th4) {
                                            th = th4;
                                            try {
                                                mt.a(this, th);
                                                return;
                                            } catch (Throwable th5) {
                                                th = th5;
                                                th = th;
                                                mt.a(this, th);
                                            }
                                        }
                                    } catch (Throwable th6) {
                                        th = th6;
                                        this = this;
                                    }
                                } catch (Throwable th7) {
                                    th = th7;
                                    this = this;
                                }
                            } catch (Throwable th8) {
                                th = th8;
                                this = this;
                            }
                        }
                    }
                    return;
                }
                return;
                th = th;
                mt.a(this, th);
            }
        } catch (Throwable th9) {
            th = th9;
        }
    }

    public final void k(Object[] objArr, Object[] objArr2) {
        Throwable th;
        Object objK;
        if (mt.a.contains(this)) {
            return;
        }
        try {
            Object objK2 = wb.k(0, objArr);
            if (objK2 != null && (objK2 instanceof rp0)) {
                Object objK3 = wb.k(1, objArr);
                if (objK3 instanceof Runnable) {
                    if (objArr2 != null) {
                        try {
                            objK = wb.k(1, objArr2);
                        } catch (Throwable th2) {
                            th = th2;
                            this = this;
                        }
                    } else {
                        objK = null;
                    }
                    if (objK != null && (objK instanceof List)) {
                        ArrayList arrayList = new ArrayList();
                        Iterator it = ((List) objK).iterator();
                        while (it.hasNext()) {
                            Object objS = sp0.s(this.c, this.p, it.next(), new Object[0]);
                            String str = objS instanceof String ? (String) objS : null;
                            if (str != null) {
                                JSONObject jSONObject = new JSONObject(str);
                                if (jSONObject.has("productId")) {
                                    String string = jSONObject.getString("productId");
                                    if (!L.containsKey(string)) {
                                        string.getClass();
                                        arrayList.add(string);
                                    }
                                    if (objK2 == rp0.INAPP) {
                                        ConcurrentHashMap concurrentHashMap = J;
                                        string.getClass();
                                        concurrentHashMap.put(string, jSONObject);
                                    } else {
                                        ConcurrentHashMap concurrentHashMap2 = K;
                                        string.getClass();
                                        concurrentHashMap2.put(string, jSONObject);
                                    }
                                }
                            }
                        }
                        if (arrayList.isEmpty()) {
                            try {
                                ((Runnable) objK3).run();
                                return;
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        } else {
                            rp0 rp0Var = (rp0) objK2;
                            Runnable runnable = (Runnable) objK3;
                            try {
                                try {
                                    if (mt.a.contains(this)) {
                                        return;
                                    }
                                    try {
                                        this = this;
                                        try {
                                            this.c(new gp0(1, arrayList, this, runnable, rp0Var));
                                            return;
                                        } catch (Throwable th4) {
                                            th = th4;
                                            try {
                                                mt.a(this, th);
                                                return;
                                            } catch (Throwable th5) {
                                                th = th5;
                                                th = th;
                                                mt.a(this, th);
                                            }
                                        }
                                    } catch (Throwable th6) {
                                        th = th6;
                                        this = this;
                                    }
                                } catch (Throwable th7) {
                                    th = th7;
                                    this = this;
                                }
                            } catch (Throwable th8) {
                                th = th8;
                                this = this;
                            }
                        }
                    }
                    return;
                }
                return;
                th = th;
                mt.a(this, th);
            }
        } catch (Throwable th9) {
            th = th9;
        }
    }

    public final void l(Runnable runnable) {
        Class cls = this.m;
        if (mt.a.contains(this)) {
            return;
        }
        try {
            sp0.s(this.b, this.E, d(), Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new fd(this, new Object[]{runnable}, 2)));
        } catch (Throwable th) {
            mt.a(this, th);
        }
    }
}
