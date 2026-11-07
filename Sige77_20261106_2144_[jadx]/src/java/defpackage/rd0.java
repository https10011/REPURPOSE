package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class rd0 extends gs {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ f91 c;
    public td0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rd0(f91 f91Var, gs gsVar) {
        super(gsVar);
        this.c = f91Var;
    }

    @Override // defpackage.ze
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.A(null, this);
    }
}
