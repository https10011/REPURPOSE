package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class fq1 extends gs {
    public gq1 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ gq1 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fq1(gq1 gq1Var, gs gsVar) {
        super(gsVar);
        this.c = gq1Var;
    }

    @Override // defpackage.ze
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(null, this);
    }
}
