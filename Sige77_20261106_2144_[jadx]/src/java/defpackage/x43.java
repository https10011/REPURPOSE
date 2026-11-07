package defpackage;

import java.util.HashMap;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final /* synthetic */ class x43 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f53 b;
    public final /* synthetic */ String c;

    public /* synthetic */ x43(f53 f53Var, String str, int i) {
        this.a = i;
        this.b = f53Var;
        this.c = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.a;
        String str = this.c;
        f53 f53Var = this.b;
        switch (i) {
            case 0:
                return new c83(new x43(f53Var, str, 1));
            case 1:
                bu2 bu2Var = f53Var.b.c;
                if3.T(bu2Var);
                q33 q33VarI0 = bu2Var.I0(str);
                HashMap map = new HashMap();
                map.put("platform", "android");
                map.put("package_name", str);
                ((y53) f53Var.a).d.K();
                map.put("gmp_version", 161000L);
                if (q33VarI0 != null) {
                    String strO = q33VarI0.O();
                    if (strO != null) {
                        map.put("app_version", strO);
                    }
                    map.put("app_version_int", Long.valueOf(q33VarI0.Q()));
                    map.put("dynamite_version", Long.valueOf(q33VarI0.b()));
                }
                return map;
            default:
                dc2 dc2Var = new dc2(f53Var, str, false);
                ac3 ac3Var = new ac3("internal.remoteConfig", 0);
                ac3Var.b.put("getValue", new c83(ac3Var, dc2Var));
                return ac3Var;
        }
    }
}
