package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class lv0 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wj b;

    public /* synthetic */ lv0(wj wjVar, int i) {
        this.a = i;
        this.b = wjVar;
    }

    public final Object invoke(Object obj) {
        int i = this.a;
        wj wjVar = this.b;
        switch (i) {
            case 0:
                wjVar.cancel();
                break;
            case 1:
                wjVar.cancel();
                break;
            default:
                wjVar.cancel();
                break;
        }
        return Unit.a;
    }
}
