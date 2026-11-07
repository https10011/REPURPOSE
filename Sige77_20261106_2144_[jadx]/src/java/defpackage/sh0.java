package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class sh0 extends d1 {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, sh0> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected t22 unknownFields;

    public sh0() {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = t22.f;
    }

    public static sh0 d(Class cls) {
        sh0 sh0Var = defaultInstanceMap.get(cls);
        if (sh0Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                sh0Var = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (sh0Var != null) {
            return sh0Var;
        }
        sh0 sh0Var2 = (sh0) ((sh0) i32.d(cls)).c(6);
        if (sh0Var2 != null) {
            defaultInstanceMap.put(cls, sh0Var2);
            return sh0Var2;
        }
        uq1.n();
        return null;
    }

    public static Object e(Method method, sh0 sh0Var, Object... objArr) {
        try {
            return method.invoke(sh0Var, objArr);
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

    public static final boolean f(sh0 sh0Var, boolean z) {
        byte bByteValue = ((Byte) sh0Var.c(1)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        td1 td1Var = td1.c;
        td1Var.getClass();
        boolean zG = td1Var.a(sh0Var.getClass()).g(sh0Var);
        if (z) {
            sh0Var.c(2);
        }
        return zG;
    }

    public static void j(Class cls, sh0 sh0Var) {
        sh0Var.h();
        defaultInstanceMap.put(cls, sh0Var);
    }

    @Override // defpackage.d1
    public final int a(zl1 zl1Var) {
        int iE;
        int iE2;
        if (g()) {
            if (zl1Var == null) {
                td1 td1Var = td1.c;
                td1Var.getClass();
                iE2 = td1Var.a(getClass()).e(this);
            } else {
                iE2 = zl1Var.e(this);
            }
            if (iE2 >= 0) {
                return iE2;
            }
            uq1.q(ck1.r(iE2, "serialized size must be non-negative, was "));
            return 0;
        }
        int i = this.memoizedSerializedSize;
        if ((i & Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i & Integer.MAX_VALUE;
        }
        if (zl1Var == null) {
            td1 td1Var2 = td1.c;
            td1Var2.getClass();
            iE = td1Var2.a(getClass()).e(this);
        } else {
            iE = zl1Var.e(this);
        }
        k(iE);
        return iE;
    }

    @Override // defpackage.d1
    public final void b(un unVar) {
        td1 td1Var = td1.c;
        td1Var.getClass();
        zl1 zl1VarA = td1Var.a(getClass());
        wa waVar = unVar.a;
        if (waVar == null) {
            waVar = new wa(unVar);
        }
        zl1VarA.c(this, waVar);
    }

    public abstract Object c(int i);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        td1 td1Var = td1.c;
        td1Var.getClass();
        return td1Var.a(getClass()).h(this, (sh0) obj);
    }

    public final boolean g() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    public final void h() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    public final int hashCode() {
        if (g()) {
            td1 td1Var = td1.c;
            td1Var.getClass();
            return td1Var.a(getClass()).a(this);
        }
        if (this.memoizedHashCode == 0) {
            td1 td1Var2 = td1.c;
            td1Var2.getClass();
            this.memoizedHashCode = td1Var2.a(getClass()).a(this);
        }
        return this.memoizedHashCode;
    }

    public final sh0 i() {
        return (sh0) c(4);
    }

    public final void k(int i) {
        if (i < 0) {
            uq1.q(ck1.r(i, "serialized size must be non-negative, was "));
        } else {
            this.memoizedSerializedSize = (i & Integer.MAX_VALUE) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
        }
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = i41.a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        i41.c(this, sb, 0);
        return sb.toString();
    }
}
