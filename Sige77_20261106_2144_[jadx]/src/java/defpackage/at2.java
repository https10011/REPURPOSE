package defpackage;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class at2 {
    public static final at2 c = new at2();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final gk1 a = new gk1(1);

    public final ct2 a(Class cls) {
        ct2 ct2VarO;
        ConcurrentHashMap concurrentHashMap = this.b;
        Object obj = concurrentHashMap.get(cls);
        if (obj != null) {
            return (ct2) obj;
        }
        gk1 gk1Var = this.a;
        gk1Var.getClass();
        r41 r41Var = rq0.i;
        cs2.class.isAssignableFrom(cls);
        bt2 bt2VarZza = ((wa) gk1Var.b).zza(cls);
        if ((bt2VarZza.d & 2) == 2) {
            ct2VarO = new xs2(bt2VarZza.a);
        } else {
            if (ps2.a[ts.v(bt2VarZza.a())] == 1) {
                r41Var = null;
            }
            ct2VarO = vs2.o(bt2VarZza, r41Var);
        }
        byte[] bArr = ds2.a;
        ct2 ct2Var = (ct2) concurrentHashMap.putIfAbsent(cls, ct2VarO);
        return ct2Var != null ? ct2Var : ct2VarO;
    }
}
