package defpackage;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class dm2 extends wk2 {
    public static final /* synthetic */ int zzd = 0;
    private static final Map zze = new ConcurrentHashMap();
    private int zzb;
    protected ho2 zzc;

    public dm2() {
        this.zza = 0;
        this.zzb = -1;
        this.zzc = ho2.f;
    }

    public static dm2 e(dm2 dm2Var, byte[] bArr, vl2 vl2Var) throws xm2 {
        int length = bArr.length;
        if (length != 0) {
            dm2 dm2VarI = dm2Var.i();
            try {
                yn2 yn2VarA = un2.c.a(dm2VarI.getClass());
                yn2VarA.h(dm2VarI, bArr, 0, length, new zk2(vl2Var));
                yn2VarA.f(dm2VarI);
                dm2Var = dm2VarI;
            } catch (eo2 e) {
                throw e.a();
            } catch (IndexOutOfBoundsException unused) {
                tv2.i("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                return null;
            } catch (xm2 e2) {
                if (e2.a) {
                    throw new xm2(e2.getMessage(), e2);
                }
                throw e2;
            } catch (IOException e3) {
                if (e3.getCause() instanceof xm2) {
                    throw ((xm2) e3.getCause());
                }
                throw new xm2(e3.getMessage(), e3);
            }
        }
        r(dm2Var);
        return dm2Var;
    }

    public static dm2 n(Class cls) {
        Map map = zze;
        dm2 dm2Var = (dm2) map.get(cls);
        if (dm2Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                dm2Var = (dm2) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (dm2Var != null) {
            return dm2Var;
        }
        dm2 dm2Var2 = (dm2) ((dm2) no2.d(cls)).s(6);
        if (dm2Var2 != null) {
            map.put(cls, dm2Var2);
            return dm2Var2;
        }
        uq1.n();
        return null;
    }

    public static void o(Class cls, dm2 dm2Var) {
        dm2Var.h();
        zze.put(cls, dm2Var);
    }

    public static Object p(Method method, dm2 dm2Var, Object... objArr) {
        try {
            return method.invoke(dm2Var, objArr);
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

    public static final boolean q(dm2 dm2Var, boolean z) {
        byte bByteValue = ((Byte) dm2Var.s(1)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zZzl = un2.c.a(dm2Var.getClass()).zzl(dm2Var);
        if (z) {
            dm2Var.s(2);
        }
        return zZzl;
    }

    public static void r(dm2 dm2Var) throws xm2 {
        if (dm2Var != null && !q(dm2Var, true)) {
            throw new eo2().a();
        }
    }

    @Override // defpackage.wk2
    public final int c(yn2 yn2Var) {
        if (g()) {
            int iC = yn2Var.c(this);
            if (iC >= 0) {
                return iC;
            }
            uq1.b(String.valueOf(iC).length() + 42, iC);
            return 0;
        }
        int i = this.zzb & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int iC2 = yn2Var.c(this);
        if (iC2 >= 0) {
            this.zzb = (this.zzb & Integer.MIN_VALUE) | iC2;
            return iC2;
        }
        uq1.b(String.valueOf(iC2).length() + 42, iC2);
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return un2.c.a(getClass()).d(this, (dm2) obj);
    }

    public final void f(tl2 tl2Var) {
        yn2 yn2VarA = un2.c.a(getClass());
        wa waVar = tl2Var.a;
        if (waVar == null) {
            waVar = new wa(tl2Var);
        }
        yn2VarA.a(this, waVar);
    }

    public final boolean g() {
        return (this.zzb & Integer.MIN_VALUE) != 0;
    }

    public final void h() {
        this.zzb &= Integer.MAX_VALUE;
    }

    public final int hashCode() {
        if (g()) {
            return un2.c.a(getClass()).g(this);
        }
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int iG = un2.c.a(getClass()).g(this);
        this.zza = iG;
        return iG;
    }

    public final dm2 i() {
        return (dm2) s(4);
    }

    public final bm2 j() {
        return (bm2) s(5);
    }

    public final bm2 k() {
        bm2 bm2Var = (bm2) s(5);
        bm2Var.h(this);
        return bm2Var;
    }

    public final void l() {
        this.zzb = (this.zzb & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    public final int m() {
        if (g()) {
            int iC = un2.c.a(getClass()).c(this);
            if (iC >= 0) {
                return iC;
            }
            uq1.b(String.valueOf(iC).length() + 42, iC);
            return 0;
        }
        int i = this.zzb & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int iC2 = un2.c.a(getClass()).c(this);
        if (iC2 >= 0) {
            this.zzb = (this.zzb & Integer.MIN_VALUE) | iC2;
            return iC2;
        }
        uq1.b(String.valueOf(iC2).length() + 42, iC2);
        return 0;
    }

    public abstract Object s(int i);

    public final String toString() {
        String string = super.toString();
        char[] cArr = nn2.a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        nn2.b(this, sb, 0);
        return sb.toString();
    }
}
