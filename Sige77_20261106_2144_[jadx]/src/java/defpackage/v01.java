package defpackage;

import android.util.Log;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.NavigableMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class v01 {
    public final f91 a = new f91(5);
    public final u01 b = new u01(0);
    public final HashMap c = new HashMap();
    public final HashMap d = new HashMap();
    public final int e;
    public int f;

    public v01(int i) {
        this.e = i;
    }

    public final void a(int i, Class cls) {
        NavigableMap navigableMapF = f(cls);
        Integer num = (Integer) navigableMapF.get(Integer.valueOf(i));
        if (num != null) {
            if (num.intValue() == 1) {
                navigableMapF.remove(Integer.valueOf(i));
                return;
            } else {
                navigableMapF.put(Integer.valueOf(i), Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i + ", this: " + this);
    }

    public final void b(int i) {
        while (this.f > i) {
            Object objM = this.a.m();
            am2.o(objM);
            aj ajVarD = d(objM.getClass());
            this.f -= ajVarD.b() * ajVarD.a(objM);
            a(ajVarD.a(objM), objM.getClass());
            if (Log.isLoggable(ajVarD.c(), 2)) {
                Log.v(ajVarD.c(), "evicted: " + ajVarD.a(objM));
            }
        }
    }

    public final synchronized Object c(int i, Class cls) {
        t01 t01Var;
        int i2;
        try {
            Integer num = (Integer) f(cls).ceilingKey(Integer.valueOf(i));
            boolean z = num != null && ((i2 = this.f) == 0 || this.e / i2 >= 2 || num.intValue() <= i * 8);
            u01 u01Var = this.b;
            if (z) {
                int iIntValue = num.intValue();
                xb1 xb1VarF = (xb1) ((ArrayDeque) u01Var.a).poll();
                if (xb1VarF == null) {
                    xb1VarF = u01Var.F();
                }
                t01Var = (t01) xb1VarF;
                t01Var.b = iIntValue;
                t01Var.c = cls;
            } else {
                xb1 xb1VarF2 = (xb1) ((ArrayDeque) u01Var.a).poll();
                if (xb1VarF2 == null) {
                    xb1VarF2 = u01Var.F();
                }
                t01Var = (t01) xb1VarF2;
                t01Var.b = i;
                t01Var.c = cls;
            }
        } catch (Throwable th) {
            throw th;
        }
        return e(t01Var, cls);
    }

    public final aj d(Class cls) {
        aj ajVar;
        HashMap map = this.d;
        aj ajVar2 = (aj) map.get(cls);
        if (ajVar2 != null) {
            return ajVar2;
        }
        if (cls.equals(int[].class)) {
            ajVar = new aj(1);
        } else {
            if (!cls.equals(byte[].class)) {
                e.g("No array pool found for: ".concat(cls.getSimpleName()));
                return null;
            }
            ajVar = new aj(0);
        }
        map.put(cls, ajVar);
        return ajVar;
    }

    public final Object e(t01 t01Var, Class cls) {
        aj ajVarD = d(cls);
        Object objH = this.a.h(t01Var);
        if (objH != null) {
            this.f -= ajVarD.b() * ajVarD.a(objH);
            a(ajVarD.a(objH), cls);
        }
        if (objH != null) {
            return objH;
        }
        if (Log.isLoggable(ajVarD.c(), 2)) {
            Log.v(ajVarD.c(), "Allocated " + t01Var.b + " bytes");
        }
        int i = t01Var.b;
        switch (ajVarD.a) {
            case 0:
                return new byte[i];
            default:
                return new int[i];
        }
    }

    public final NavigableMap f(Class cls) {
        HashMap map = this.c;
        NavigableMap navigableMap = (NavigableMap) map.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        map.put(cls, treeMap);
        return treeMap;
    }

    public final synchronized void g(Object obj) {
        Class<?> cls = obj.getClass();
        aj ajVarD = d(cls);
        int iA = ajVarD.a(obj);
        int iB = ajVarD.b() * iA;
        if (iB <= this.e / 2) {
            u01 u01Var = this.b;
            xb1 xb1VarF = (xb1) ((ArrayDeque) u01Var.a).poll();
            if (xb1VarF == null) {
                xb1VarF = u01Var.F();
            }
            t01 t01Var = (t01) xb1VarF;
            t01Var.b = iA;
            t01Var.c = cls;
            this.a.l(t01Var, obj);
            NavigableMap navigableMapF = f(cls);
            Integer num = (Integer) navigableMapF.get(Integer.valueOf(t01Var.b));
            Integer numValueOf = Integer.valueOf(t01Var.b);
            int iIntValue = 1;
            if (num != null) {
                iIntValue = 1 + num.intValue();
            }
            navigableMapF.put(numValueOf, Integer.valueOf(iIntValue));
            this.f += iB;
            b(this.e);
        }
    }
}
