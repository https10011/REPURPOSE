package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class nd0 extends gs {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ yd2 c;
    public yd2 d;
    public id0 e;
    public cl1 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nd0(yd2 yd2Var, gs gsVar) {
        super(gsVar);
        this.c = yd2Var;
    }

    @Override // defpackage.ze
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.A(null, this);
    }
}
