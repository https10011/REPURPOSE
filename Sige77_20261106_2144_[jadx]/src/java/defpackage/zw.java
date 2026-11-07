package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class zw extends gs {
    public ud2 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ ud2 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zw(ud2 ud2Var, gs gsVar) {
        super(gsVar);
        this.c = ud2Var;
    }

    @Override // defpackage.ze
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.h(this);
    }
}
