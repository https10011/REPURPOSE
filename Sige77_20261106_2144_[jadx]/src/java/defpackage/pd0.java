package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class pd0 extends gs {
    public qd0 a;
    public Object b;
    public /* synthetic */ Object c;
    public final /* synthetic */ qd0 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pd0(qd0 qd0Var, fs fsVar) {
        super(fsVar);
        this.d = qd0Var;
    }

    @Override // defpackage.ze
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(null, this);
    }
}
