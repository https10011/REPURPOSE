package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class qk1 extends gs {
    public ud2 a;
    public f61 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ ud2 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qk1(ud2 ud2Var, gs gsVar) {
        super(gsVar);
        this.d = ud2Var;
    }

    @Override // defpackage.ze
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.j(this);
    }
}
