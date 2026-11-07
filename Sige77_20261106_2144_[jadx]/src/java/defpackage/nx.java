package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class nx extends gs {
    public yx a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ yx d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nx(yx yxVar, gs gsVar) {
        super(gsVar);
        this.d = yxVar;
    }

    @Override // defpackage.ze
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.i(this);
    }
}
