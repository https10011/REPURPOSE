package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class q43 extends a11 {
    public final /* synthetic */ f53 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q43(f53 f53Var) {
        super(20);
        this.g = f53Var;
    }

    @Override // defpackage.a11
    public final Object a(Object obj) throws Throwable {
        String str = (String) obj;
        gu2.l(str);
        f53 f53Var = this.g;
        f53Var.F();
        gu2.l(str);
        bu2 bu2Var = f53Var.b.c;
        if3.T(bu2Var);
        p11 p11VarM0 = bu2Var.M0(str);
        if (p11VarM0 == null) {
            return null;
        }
        c33 c33Var = ((y53) f53Var.a).f;
        y53.l(c33Var);
        c33Var.a0.b(str, "Populate EES config from database on cache miss. appId");
        f53Var.M(str, f53Var.N((byte[]) p11VarM0.b, str));
        q43 q43Var = f53Var.X;
        q43Var.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        synchronized (q43Var.c) {
            try {
                Set<Map.Entry> setEntrySet = ((LinkedHashMap) q43Var.b.a).entrySet();
                setEntrySet.getClass();
                for (Map.Entry entry : setEntrySet) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return (aw2) linkedHashMap.get(str);
    }
}
