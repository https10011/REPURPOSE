package defpackage;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final /* synthetic */ class hz2 implements Callable {
    public static final /* synthetic */ hz2 b = new hz2(0);
    public static final /* synthetic */ hz2 c = new hz2(1);
    public final /* synthetic */ int a;

    public /* synthetic */ hz2(int i) {
        this.a = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.a) {
            case 0:
                ac3 ac3Var = new ac3("internal.platform", 4);
                ac3Var.b.put("getVersion", new ac3("getVersion", 3));
                return ac3Var;
            default:
                return null;
        }
    }
}
