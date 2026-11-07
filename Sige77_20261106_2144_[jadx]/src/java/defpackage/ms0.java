package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class ms0 extends mv1 implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ fc1 b;
    public final /* synthetic */ Long c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ms0(fc1 fc1Var, Long l, fs fsVar) {
        super(2, fsVar);
        this.b = fc1Var;
        this.c = l;
    }

    @Override // defpackage.ze
    public final fs create(Object obj, fs fsVar) {
        ms0 ms0Var = new ms0(this.b, this.c, fsVar);
        ms0Var.a = obj;
        return ms0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ms0) create((d61) obj, (fs) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.ze
    public final Object invokeSuspend(Object obj) {
        ft ftVar = ft.a;
        zi0.B(obj);
        ((d61) this.a).c(this.b, this.c);
        return Unit.a;
    }
}
