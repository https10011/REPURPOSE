package defpackage;

import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class g50 extends kv {
    public final /* synthetic */ kv k;
    public final /* synthetic */ ThreadPoolExecutor l;

    public g50(kv kvVar, ThreadPoolExecutor threadPoolExecutor) {
        this.k = kvVar;
        this.l = threadPoolExecutor;
    }

    @Override // defpackage.kv
    public final void U(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.l;
        try {
            this.k.U(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // defpackage.kv
    public final void V(ud2 ud2Var) {
        ThreadPoolExecutor threadPoolExecutor = this.l;
        try {
            this.k.V(ud2Var);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
