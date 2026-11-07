package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.io.StringReader;
import java.io.Writer;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class uk0 {
    public final ThreadLocal a;
    public final ConcurrentHashMap b;
    public final ir1 c;
    public final ot0 d;
    public final List e;
    public final boolean f;
    public final if0 g;
    public final int h;
    public final List i;
    public final List j;
    public final List k;

    public uk0(vk0 vk0Var) {
        this.a = new ThreadLocal();
        this.b = new ConcurrentHashMap();
        c80 c80Var = vk0Var.a;
        HashMap map = new HashMap(vk0Var.b);
        this.f = vk0Var.g;
        this.g = vk0Var.h;
        this.h = vk0Var.m;
        boolean z = vk0Var.i;
        this.i = vk0.b(vk0Var.c);
        this.j = vk0.b(vk0Var.d);
        List listB = vk0.b(vk0Var.j);
        this.k = listB;
        if (vk0Var == vk0.s) {
            this.c = vk0.q;
            this.d = vk0.r;
            this.e = vk0.t;
        } else {
            ir1 ir1Var = new ir1(map, z, listB);
            this.c = ir1Var;
            ot0 ot0Var = new ot0(ir1Var);
            this.d = ot0Var;
            this.e = vk0Var.a(ir1Var, ot0Var);
        }
    }

    public final Object a(String str, Type type) {
        s12 s12Var = new s12(type);
        Object obj = null;
        if (str == null) {
            return null;
        }
        au0 au0Var = new au0(new StringReader(str));
        int i = this.h;
        int i2 = i == 0 ? 2 : i;
        if (i2 == 0) {
            throw null;
        }
        au0Var.b0 = i2;
        boolean z = true;
        if (i != 0) {
            if (i == 0) {
                throw null;
            }
            au0Var.b0 = i;
        } else if (i2 == 2) {
            au0Var.b0 = 1;
        }
        try {
            try {
                try {
                    try {
                        au0Var.R();
                        z = false;
                        l02 l02VarB = b(s12Var);
                        Class cls = s12Var.a;
                        Object objB = l02VarB.b(au0Var);
                        Class clsE = z32.E(cls);
                        if (objB != null && !clsE.isInstance(objB)) {
                            throw new ClassCastException("Type adapter '" + l02VarB + "' returned wrong type; requested " + cls + " but got instance of " + objB.getClass() + "\nVerify that the adapter was registered for the correct type.");
                        }
                        if (i2 == 0) {
                            throw null;
                        }
                        au0Var.b0 = i2;
                        obj = objB;
                        if (obj != null) {
                            try {
                                if (au0Var.R() != 10) {
                                    throw new wt0("JSON document was not fully consumed.", 4);
                                }
                            } catch (f11 e) {
                                throw new wt0(4, e);
                            } catch (IOException e2) {
                                throw new wt0(4, e2);
                            }
                        }
                        return obj;
                    } catch (IOException e3) {
                        throw new wt0(4, e3);
                    }
                } catch (IllegalStateException e4) {
                    throw new wt0(4, e4);
                }
            } catch (EOFException e5) {
                if (!z) {
                    throw new wt0(4, e5);
                }
                if (i2 == 0) {
                    throw null;
                }
                au0Var.b0 = i2;
            } catch (AssertionError e6) {
                throw new AssertionError("AssertionError (GSON 2.14.0): " + e6.getMessage(), e6);
            }
        } catch (Throwable th) {
            if (i2 == 0) {
                throw null;
            }
            au0Var.b0 = i2;
            throw th;
        }
    }

    public final l02 b(s12 s12Var) {
        boolean z;
        ConcurrentHashMap concurrentHashMap = this.b;
        l02 l02Var = (l02) concurrentHashMap.get(s12Var);
        if (l02Var != null) {
            return l02Var;
        }
        ThreadLocal threadLocal = this.a;
        Map map = (Map) threadLocal.get();
        if (map == null) {
            map = new HashMap();
            threadLocal.set(map);
            z = true;
        } else {
            l02 l02Var2 = (l02) map.get(s12Var);
            if (l02Var2 != null) {
                return l02Var2;
            }
            z = false;
        }
        try {
            tk0 tk0Var = new tk0();
            map.put(s12Var, tk0Var);
            Iterator it = this.e.iterator();
            l02 l02VarC = null;
            while (it.hasNext()) {
                l02VarC = ((m02) it.next()).c(this, s12Var);
                if (l02VarC != null) {
                    if (tk0Var.a != null) {
                        throw new AssertionError("Delegate is already set");
                    }
                    tk0Var.a = l02VarC;
                    map.put(s12Var, l02VarC);
                    break;
                }
            }
            if (z) {
                threadLocal.remove();
            }
            if (l02VarC == null) {
                ur.g(s12Var, "GSON (2.14.0) cannot handle ");
                return null;
            }
            if (z) {
                concurrentHashMap.putAll(map);
            }
            return l02VarC;
        } catch (Throwable th) {
            if (z) {
                threadLocal.remove();
            }
            throw th;
        }
    }

    public final eu0 c(Writer writer) {
        eu0 eu0Var = new eu0(writer);
        eu0Var.s(this.g);
        eu0Var.w = this.f;
        int i = this.h;
        if (i == 0) {
            i = 2;
        }
        eu0Var.t(i);
        eu0Var.X = false;
        return eu0Var;
    }

    public final String d(Object obj) {
        if (obj != null) {
            return e(obj, obj.getClass());
        }
        StringBuilder sb = new StringBuilder();
        try {
            f(c(new g01(sb)));
            return sb.toString();
        } catch (IOException e) {
            throw new wt0(4, e);
        }
    }

    public final String e(Object obj, Type type) {
        StringBuilder sb = new StringBuilder();
        try {
            g(obj, type, c(new g01(sb)));
            return sb.toString();
        } catch (IOException e) {
            throw new wt0(4, e);
        }
    }

    public final void f(eu0 eu0Var) {
        xt0 xt0Var = xt0.a;
        int i = eu0Var.v;
        boolean z = eu0Var.w;
        boolean z2 = eu0Var.X;
        eu0Var.w = this.f;
        eu0Var.X = false;
        int i2 = this.h;
        if (i2 != 0) {
            eu0Var.t(i2);
        } else if (i == 2) {
            eu0Var.v = 1;
        }
        try {
            try {
                vt0.a.getClass();
                vt0.e(eu0Var, xt0Var);
                eu0Var.t(i);
                eu0Var.w = z;
                eu0Var.X = z2;
            } catch (IOException e) {
                throw new wt0(4, e);
            } catch (AssertionError e2) {
                throw new AssertionError("AssertionError (GSON 2.14.0): " + e2.getMessage(), e2);
            }
        } catch (Throwable th) {
            eu0Var.t(i);
            eu0Var.w = z;
            eu0Var.X = z2;
            throw th;
        }
    }

    public final void g(Object obj, Type type, eu0 eu0Var) {
        l02 l02VarB = b(new s12(type));
        int i = eu0Var.v;
        int i2 = this.h;
        if (i2 != 0) {
            eu0Var.t(i2);
        } else if (i == 2) {
            eu0Var.v = 1;
        }
        boolean z = eu0Var.w;
        boolean z2 = eu0Var.X;
        eu0Var.w = this.f;
        eu0Var.X = false;
        try {
            try {
                l02VarB.c(eu0Var, obj);
                eu0Var.t(i);
                eu0Var.w = z;
                eu0Var.X = z2;
            } catch (IOException e) {
                throw new wt0(4, e);
            } catch (AssertionError e2) {
                throw new AssertionError("AssertionError (GSON 2.14.0): " + e2.getMessage(), e2);
            }
        } catch (Throwable th) {
            eu0Var.t(i);
            eu0Var.w = z;
            eu0Var.X = z2;
            throw th;
        }
    }

    public final String toString() {
        return "{serializeNulls:false,factories:" + this.e + ",instanceCreators:" + this.c + "}";
    }

    public uk0() {
        this(vk0.s);
    }
}
