package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class sd0 extends gs {
    public td0 a;
    public /* synthetic */ Object b;
    public int c;
    public final /* synthetic */ td0 d;
    public Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sd0(td0 td0Var, fs fsVar) {
        super(fsVar);
        this.d = td0Var;
    }

    @Override // defpackage.ze
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.c |= Integer.MIN_VALUE;
        return this.d.a(null, this);
    }
}
