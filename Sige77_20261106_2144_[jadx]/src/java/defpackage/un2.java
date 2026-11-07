package defpackage;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class un2 {
    public static final un2 c = new un2();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final wa a = new wa(1);

    public final yn2 a(Class cls) {
        yn2 pn2Var;
        ConcurrentHashMap concurrentHashMap = this.b;
        Object obj = concurrentHashMap.get(cls);
        if (obj != null) {
            return (yn2) obj;
        }
        wa waVar = this.a;
        waVar.getClass();
        qh1 qh1Var = zn2.a;
        if (!dm2.class.isAssignableFrom(cls)) {
            int i = yk2.a;
        }
        wn2 wn2VarZzc = ((gk1) waVar.b).zzc(cls);
        if ((wn2VarZzc.d & 2) == 2) {
            int i2 = yk2.a;
            qh1 qh1Var2 = zn2.a;
            vl0 vl0Var = wl2.a;
            pn2Var = new pn2(qh1Var2, wn2VarZzc.a);
        } else {
            int i3 = yk2.a;
            int i4 = qn2.a;
            int i5 = cn2.a;
            qh1 qh1Var3 = zn2.a;
            vl0 vl0Var2 = wn2VarZzc.a() + (-1) != 1 ? wl2.a : null;
            int i6 = hn2.a;
            pn2Var = on2.x(wn2VarZzc, qh1Var3, vl0Var2);
        }
        yn2 yn2Var = (yn2) concurrentHashMap.putIfAbsent(cls, pn2Var);
        return yn2Var != null ? yn2Var : pn2Var;
    }
}
