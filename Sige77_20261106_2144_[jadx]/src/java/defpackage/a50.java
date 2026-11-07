package defpackage;

import android.os.Build;
import java.util.ArrayList;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class a50 extends kv {
    public final /* synthetic */ b50 k;

    public a50(b50 b50Var) {
        this.k = b50Var;
    }

    @Override // defpackage.kv
    public final void U(Throwable th) {
        this.k.a.d(th);
    }

    @Override // defpackage.kv
    public final void V(ud2 ud2Var) {
        b50 b50Var = this.k;
        b50Var.c = ud2Var;
        ud2 ud2Var2 = b50Var.c;
        f50 f50Var = b50Var.a;
        b50Var.b = new ac2(ud2Var2, f50Var.g, f50Var.i, Build.VERSION.SDK_INT >= 34 ? i50.a() : d42.m());
        f50 f50Var2 = b50Var.a;
        ArrayList arrayList = new ArrayList();
        f50Var2.a.writeLock().lock();
        try {
            f50Var2.c = 1;
            arrayList.addAll(f50Var2.b);
            f50Var2.b.clear();
            f50Var2.a.writeLock().unlock();
            f50Var2.d.post(new hk(arrayList, f50Var2.c, (Throwable) null));
        } catch (Throwable th) {
            f50Var2.a.writeLock().unlock();
            throw th;
        }
    }
}
