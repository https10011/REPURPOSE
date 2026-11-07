package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class nj0 extends jf {
    public final Set z;

    /* JADX WARN: Illegal instructions before constructor call */
    public nj0(Context context, Looper looper, int i, uy1 uy1Var, sj0 sj0Var, tj0 tj0Var, int i2) {
        yf3 yf3VarA = yf3.a(context);
        qj0 qj0Var = qj0.e;
        gu2.o(sj0Var);
        gu2.o(tj0Var);
        super(context, looper, yf3VarA, qj0Var, i, new kj0(sj0Var, 24), new ox1(tj0Var), (String) uy1Var.e);
        Set set = (Set) uy1Var.b;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (!set.contains((Scope) it.next())) {
                uq1.q("Expanding scopes is not permitted, use implied scopes instead");
                throw null;
            }
        }
        this.z = set;
    }

    @Override // defpackage.jf
    public final Account e() {
        return null;
    }

    @Override // defpackage.jf
    public final Executor g() {
        return null;
    }

    @Override // defpackage.jf
    public final Set k() {
        return this.z;
    }
}
