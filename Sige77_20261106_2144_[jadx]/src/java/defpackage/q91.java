package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class q91 extends gs {
    public /* synthetic */ Object a;
    public final /* synthetic */ r91 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q91(r91 r91Var, gs gsVar) {
        super(gsVar);
        this.b = r91Var;
    }

    @Override // defpackage.ze
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return r91.e(this.b, null, this);
    }
}
