package defpackage;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class q41 {
    public final rd2 a;
    public final ac2 b;
    public final HashMap c;

    public q41(Context context, ac2 ac2Var) {
        rd2 rd2Var = new rd2(context, 3);
        this.c = new HashMap();
        this.a = rd2Var;
        this.b = ac2Var;
    }

    public final synchronized c02 a(String str) {
        if (this.c.containsKey(str)) {
            return (c02) this.c.get(str);
        }
        CctBackendFactory cctBackendFactoryE = this.a.e(str);
        if (cctBackendFactoryE == null) {
            return null;
        }
        ac2 ac2Var = this.b;
        c02 c02VarCreate = cctBackendFactoryE.create(new md((Context) ac2Var.b, (hn) ac2Var.c, (hn) ac2Var.d, str));
        this.c.put(str, c02VarCreate);
        return c02VarCreate;
    }
}
