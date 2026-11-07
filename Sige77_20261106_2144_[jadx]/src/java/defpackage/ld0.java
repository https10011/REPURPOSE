package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class ld0 extends gs {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ md0 c;
    public Object d;
    public id0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ld0(md0 md0Var, gs gsVar) {
        super(gsVar);
        this.c = md0Var;
    }

    @Override // defpackage.ze
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.A(null, this);
    }
}
