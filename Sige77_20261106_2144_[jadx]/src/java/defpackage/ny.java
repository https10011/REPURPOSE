package defpackage;

import java.util.concurrent.Executor;
import okhttp3.Request;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class ny implements wj {
    public final Executor a;
    public final wj b;

    public ny(Executor executor, wj wjVar) {
        this.a = executor;
        this.b = wjVar;
    }

    @Override // defpackage.wj
    public final gj1 a() {
        return this.b.a();
    }

    @Override // defpackage.wj
    public final Request b() {
        return this.b.b();
    }

    @Override // defpackage.wj
    public final void cancel() {
        this.b.cancel();
    }

    @Override // defpackage.wj
    public final wj clone() {
        return new ny(this.a, this.b.clone());
    }

    @Override // defpackage.wj
    public final boolean e() {
        return this.b.e();
    }

    @Override // defpackage.wj
    public final void w(ak akVar) {
        this.b.w(new f91(3, this, akVar));
    }
}
