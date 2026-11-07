package defpackage;

import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class ug2 {
    public static final Set b = Collections.newSetFromMap(new WeakHashMap());
    public final pj0 a;

    public ug2(pj0 pj0Var) {
        this.a = pj0Var;
    }

    public final oi2 a(oi2 oi2Var) {
        boolean z = true;
        if (!((BasePendingResult) oi2Var).i && !((Boolean) BasePendingResult.j.get()).booleanValue()) {
            z = false;
        }
        ((BasePendingResult) oi2Var).i = z;
        pj0 pj0Var = this.a;
        uj0 uj0Var = pj0Var.k;
        uj0Var.getClass();
        zg2 zg2Var = new zg2(new fh2(oi2Var), uj0Var.i.get(), pj0Var);
        th2 th2Var = uj0Var.n;
        th2Var.sendMessage(th2Var.obtainMessage(4, zg2Var));
        return oi2Var;
    }
}
