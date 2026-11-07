package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class ar1 extends gs {
    public Object a;
    public h61 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ dr1 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ar1(dr1 dr1Var, gs gsVar) {
        super(gsVar);
        this.d = dr1Var;
    }

    @Override // defpackage.ze
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.b(null, this);
    }
}
