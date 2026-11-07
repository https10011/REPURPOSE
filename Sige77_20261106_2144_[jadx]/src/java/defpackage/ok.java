package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final /* synthetic */ class ok implements xg0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ok(h61 h61Var, g61 g61Var) {
        this.a = 1;
        this.b = h61Var;
    }

    @Override // defpackage.xg0
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                ((c0) obj4).invoke((Throwable) obj);
                break;
            case 1:
                h61 h61Var = (h61) obj4;
                h61.i.set(h61Var, null);
                h61Var.g(null);
                break;
            default:
                ((go1) obj4).b();
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ ok(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }
}
