package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class ix extends gs {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ jx c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ix(jx jxVar, fs fsVar) {
        super(fsVar);
        this.c = jxVar;
    }

    @Override // defpackage.ze
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.a(null, this);
    }
}
