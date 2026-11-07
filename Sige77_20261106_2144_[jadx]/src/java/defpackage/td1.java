package defpackage;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class td1 {
    public static final td1 c = new td1();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final kj0 a = new kj0(1);

    public final zl1 a(Class cls) {
        x80 x80Var;
        zl1 zl1VarW;
        Class cls2;
        dr0.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.b;
        zl1 zl1Var = (zl1) concurrentHashMap.get(cls);
        if (zl1Var != null) {
            return zl1Var;
        }
        kj0 kj0Var = this.a;
        kj0Var.getClass();
        Class cls3 = cm1.a;
        if (!sh0.class.isAssignableFrom(cls) && (cls2 = cm1.a) != null && !cls2.isAssignableFrom(cls)) {
            e.g("Message classes must extend GeneratedMessage or GeneratedMessageLite");
            return null;
        }
        if1 if1VarA = ((g11) kj0Var.b).a(cls);
        if ((if1VarA.d & 2) == 2) {
            if (sh0.class.isAssignableFrom(cls)) {
                zl1VarW = new k41(cm1.c, y80.a, if1VarA.a);
            } else {
                u22 u22Var = cm1.b;
                x80 x80Var2 = y80.b;
                if (x80Var2 == null) {
                    uq1.q("Protobuf runtime is not correctly loaded.");
                    return null;
                }
                zl1VarW = new k41(u22Var, x80Var2, if1VarA.a);
            }
        } else if (sh0.class.isAssignableFrom(cls)) {
            z61 z61Var = a71.b;
            ly0 ly0Var = my0.b;
            u22 u22Var2 = cm1.c;
            x80 x80Var3 = ts.v(if1VarA.a()) != 1 ? y80.a : null;
            s11 s11Var = t11.b;
            if (!(if1VarA instanceof if1)) {
                int[] iArr = j41.n;
                ur.a();
                return null;
            }
            zl1VarW = j41.w(if1VarA, z61Var, ly0Var, u22Var2, x80Var3, s11Var);
        } else {
            z61 z61Var2 = a71.a;
            ly0 ly0Var2 = my0.a;
            u22 u22Var3 = cm1.b;
            if (ts.v(if1VarA.a()) != 1) {
                x80 x80Var4 = y80.b;
                if (x80Var4 == null) {
                    uq1.q("Protobuf runtime is not correctly loaded.");
                    return null;
                }
                x80Var = x80Var4;
            } else {
                x80Var = null;
            }
            s11 s11Var2 = t11.a;
            if (!(if1VarA instanceof if1)) {
                int[] iArr2 = j41.n;
                ur.a();
                return null;
            }
            zl1VarW = j41.w(if1VarA, z61Var2, ly0Var2, u22Var3, x80Var, s11Var2);
        }
        zl1 zl1Var2 = (zl1) concurrentHashMap.putIfAbsent(cls, zl1VarW);
        return zl1Var2 != null ? zl1Var2 : zl1VarW;
    }
}
