package defpackage;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class cs2 extends yq2 {
    private static final Map<Class<?>, cs2> zzc = new ConcurrentHashMap();
    protected jt2 zzb;
    private int zzd;

    public cs2() {
        this.zza = 0;
        this.zzd = -1;
        this.zzb = jt2.f;
    }

    public static Object e(Method method, cs2 cs2Var, Object... objArr) {
        try {
            return method.invoke(cs2Var, objArr);
        } catch (IllegalAccessException e) {
            sm0.m("Couldn't use Java reflection to implement protocol message reflection.", e);
            return null;
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            sm0.m("Unexpected exception thrown by generated accessor method.", cause);
            return null;
        }
    }

    public static cs2 f(Class cls) {
        Map<Class<?>, cs2> map = zzc;
        cs2 cs2Var = map.get(cls);
        if (cs2Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                cs2Var = map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (cs2Var != null) {
            return cs2Var;
        }
        cs2 cs2Var2 = (cs2) ((cs2) nt2.a(cls)).d(6);
        if (cs2Var2 != null) {
            map.put(cls, cs2Var2);
            return cs2Var2;
        }
        uq1.n();
        return null;
    }

    public static cs2 g(cs2 cs2Var, sn snVar, wr2 wr2Var) throws ks2 {
        cs2 cs2VarP = cs2Var.p();
        try {
            at2 at2Var = at2.c;
            at2Var.getClass();
            ct2 ct2VarA = at2Var.a(cs2VarP.getClass());
            we weVar = (we) snVar.c;
            if (weVar == null) {
                weVar = new we(snVar, false);
            }
            ct2VarA.c(cs2VarP, weVar, wr2Var);
            ct2VarA.f(cs2VarP);
            return cs2VarP;
        } catch (it2 e) {
            throw new ks2(e.getMessage());
        } catch (IOException e2) {
            if (e2.getCause() instanceof ks2) {
                throw ((ks2) e2.getCause());
            }
            throw new ks2(e2.getMessage(), e2);
        } catch (RuntimeException e3) {
            if (e3.getCause() instanceof ks2) {
                throw ((ks2) e3.getCause());
            }
            throw e3;
        } catch (ks2 e4) {
            if (e4.a) {
                throw new ks2(e4.getMessage(), e4);
            }
            throw e4;
        }
    }

    public static cs2 h(cs2 cs2Var, jr2 jr2Var, wr2 wr2Var) throws ks2 {
        or2 or2VarM = jr2Var.m();
        cs2 cs2VarG = g(cs2Var, or2VarM, wr2Var);
        or2VarM.K(0);
        l(cs2VarG);
        return cs2VarG;
    }

    public static cs2 i(cs2 cs2Var, byte[] bArr, wr2 wr2Var) throws ks2 {
        int length = bArr.length;
        if (length != 0) {
            cs2 cs2VarP = cs2Var.p();
            try {
                at2 at2Var = at2.c;
                at2Var.getClass();
                ct2 ct2VarA = at2Var.a(cs2VarP.getClass());
                zk2 zk2Var = new zk2();
                wr2Var.getClass();
                ct2VarA.i(cs2VarP, bArr, 0, length, zk2Var);
                ct2VarA.f(cs2VarP);
                cs2Var = cs2VarP;
            } catch (it2 e) {
                throw new ks2(e.getMessage());
            } catch (ks2 e2) {
                if (e2.a) {
                    throw new ks2(e2.getMessage(), e2);
                }
                throw e2;
            } catch (IOException e3) {
                if (e3.getCause() instanceof ks2) {
                    throw ((ks2) e3.getCause());
                }
                throw new ks2(e3.getMessage(), e3);
            } catch (IndexOutOfBoundsException unused) {
                throw ks2.g();
            }
        }
        l(cs2Var);
        return cs2Var;
    }

    public static void j(Class cls, cs2 cs2Var) {
        cs2Var.r();
        zzc.put(cls, cs2Var);
    }

    public static void l(cs2 cs2Var) throws ks2 {
        if (cs2Var != null && !n(cs2Var, true)) {
            throw new ks2(new it2().getMessage());
        }
    }

    public static final boolean n(cs2 cs2Var, boolean z) {
        byte bByteValue = ((Byte) cs2Var.d(1)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        at2 at2Var = at2.c;
        at2Var.getClass();
        boolean zB = at2Var.a(cs2Var.getClass()).b(cs2Var);
        if (z) {
            cs2Var.d(2);
        }
        return zB;
    }

    @Override // defpackage.yq2
    public final int a(ct2 ct2Var) {
        int iH;
        int iH2;
        if (s()) {
            if (ct2Var == null) {
                at2 at2Var = at2.c;
                at2Var.getClass();
                iH2 = at2Var.a(getClass()).h(this);
            } else {
                iH2 = ct2Var.h(this);
            }
            if (iH2 >= 0) {
                return iH2;
            }
            uq1.q(ck1.r(iH2, "serialized size must be non-negative, was "));
            return 0;
        }
        int i = this.zzd;
        if ((i & Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i & Integer.MAX_VALUE;
        }
        if (ct2Var == null) {
            at2 at2Var2 = at2.c;
            at2Var2.getClass();
            iH = at2Var2.a(getClass()).h(this);
        } else {
            iH = ct2Var.h(this);
        }
        m(iH);
        return iH;
    }

    public abstract Object d(int i);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        at2 at2Var = at2.c;
        at2Var.getClass();
        return at2Var.a(getClass()).a(this, (cs2) obj);
    }

    public final int hashCode() {
        if (s()) {
            at2 at2Var = at2.c;
            at2Var.getClass();
            return at2Var.a(getClass()).e(this);
        }
        if (this.zza == 0) {
            at2 at2Var2 = at2.c;
            at2Var2.getClass();
            this.zza = at2Var2.a(getClass()).e(this);
        }
        return this.zza;
    }

    public final void k(tr2 tr2Var) {
        at2 at2Var = at2.c;
        at2Var.getClass();
        ct2 ct2VarA = at2Var.a(getClass());
        pv2 pv2Var = tr2Var.a;
        if (pv2Var == null) {
            pv2Var = new pv2();
            byte[] bArr = ds2.a;
            if (tr2Var == null) {
                uq1.h("output");
                throw null;
            }
            pv2Var.a = tr2Var;
            tr2Var.a = pv2Var;
        }
        ct2VarA.d(this, pv2Var);
    }

    public final void m(int i) {
        if (i < 0) {
            uq1.q(ck1.r(i, "serialized size must be non-negative, was "));
        } else {
            this.zzd = (i & Integer.MAX_VALUE) | (this.zzd & Integer.MIN_VALUE);
        }
    }

    public final bs2 o() {
        return (bs2) d(5);
    }

    public final cs2 p() {
        return (cs2) d(4);
    }

    public final void q() {
        at2 at2Var = at2.c;
        at2Var.getClass();
        at2Var.a(getClass()).f(this);
        r();
    }

    public final void r() {
        this.zzd &= Integer.MAX_VALUE;
    }

    public final boolean s() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = ws2.a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        ws2.c(this, sb, 0);
        return sb.toString();
    }
}
