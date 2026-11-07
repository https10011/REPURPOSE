package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class lx extends gs {
    public Object a;
    public yx b;
    public cp c;
    public /* synthetic */ Object d;
    public final /* synthetic */ yx e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lx(yx yxVar, gs gsVar) {
        super(gsVar);
        this.e = yxVar;
    }

    @Override // defpackage.ze
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return yx.c(this.e, null, this);
    }
}
