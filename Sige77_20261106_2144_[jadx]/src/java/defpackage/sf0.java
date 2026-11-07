package defpackage;

import androidx.activity.result.a;
import androidx.fragment.app.Fragment;
import com.facebook.login.h;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class sf0 extends uf0 {
    public final /* synthetic */ ri2 a;
    public final /* synthetic */ AtomicReference b;
    public final /* synthetic */ k5 c;
    public final /* synthetic */ ab d;
    public final /* synthetic */ h e;

    public sf0(h hVar, ri2 ri2Var, AtomicReference atomicReference, k5 k5Var, ab abVar) {
        this.e = hVar;
        this.a = ri2Var;
        this.b = atomicReference;
        this.c = k5Var;
        this.d = abVar;
    }

    @Override // defpackage.uf0
    public final void a() {
        StringBuilder sb = new StringBuilder("fragment_");
        h hVar = this.e;
        sb.append(((Fragment) hVar).e);
        sb.append("_rq#");
        sb.append(((Fragment) hVar).G0.getAndIncrement());
        this.b.set(((a) this.a.apply(null)).d(sb.toString(), hVar, this.c, this.d));
    }
}
