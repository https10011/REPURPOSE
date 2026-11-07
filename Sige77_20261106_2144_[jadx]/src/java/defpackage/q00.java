package defpackage;

import android.os.Handler;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class q00 extends mv1 implements Function2 {
    public final /* synthetic */ nl1 a;
    public final /* synthetic */ boolean b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q00(nl1 nl1Var, boolean z, fs fsVar) {
        super(2, fsVar);
        this.a = nl1Var;
        this.b = z;
    }

    @Override // defpackage.ze
    public final fs create(Object obj, fs fsVar) {
        return new q00(this.a, this.b, fsVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((q00) create((et) obj, (fs) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.ze
    public final Object invokeSuspend(Object obj) {
        ft ftVar = ft.a;
        zi0.B(obj);
        ((Handler) this.a.a).sendEmptyMessage(this.b ? 1 : 0);
        return Unit.a;
    }
}
