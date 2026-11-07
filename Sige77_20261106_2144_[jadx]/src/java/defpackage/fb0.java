package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class fb0 extends gs {
    public gb0 a;
    public Object b;
    public Object c;
    public qb0 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ gb0 f;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fb0(gb0 gb0Var, gs gsVar) {
        super(gsVar);
        this.f = gb0Var;
    }

    @Override // defpackage.ze
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.i |= Integer.MIN_VALUE;
        return this.f.b(null, this);
    }
}
