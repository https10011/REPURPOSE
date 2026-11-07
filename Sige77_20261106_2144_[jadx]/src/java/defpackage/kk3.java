package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final /* synthetic */ class kk3 implements bc {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ kk3(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // defpackage.bc
    public final ListenableFuture apply(Object obj) {
        switch (this.a) {
            case 0:
                rk3 rk3Var = (rk3) this.b;
                ListenableFuture listenableFuture = (r1) this.c;
                ListenableFuture listenableFuture2 = (r1) this.d;
                if (dh0.b(listenableFuture).equals(dh0.b(listenableFuture2))) {
                    return dh0.d(obj);
                }
                bg3 bg3Var = new bg3(2, rk3Var, listenableFuture2);
                int i = to3.a;
                r1 r1VarG = dh0.g(listenableFuture2, new bg3(4, vm3.a(), bg3Var), rk3Var.d);
                synchronized (rk3Var.h) {
                    break;
                }
                return r1VarG;
            default:
                tj3 tj3Var = (tj3) this.b;
                return tj3Var.c.a((bg3) this.c, (Executor) this.d);
        }
    }
}
