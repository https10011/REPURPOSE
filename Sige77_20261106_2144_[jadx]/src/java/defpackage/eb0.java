package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class eb0 extends gs {
    public gb0 a;
    public cb0 b;
    public boolean c;
    public /* synthetic */ Object d;
    public final /* synthetic */ gb0 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eb0(gb0 gb0Var, gs gsVar) {
        super(gsVar);
        this.e = gb0Var;
    }

    @Override // defpackage.ze
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a(null, this);
    }
}
