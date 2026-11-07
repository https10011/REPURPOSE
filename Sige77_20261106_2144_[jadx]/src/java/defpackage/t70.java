package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class t70 extends v70 {
    public final pk c;
    public final /* synthetic */ x70 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t70(x70 x70Var, long j, pk pkVar) {
        super(j);
        this.d = x70Var;
        this.c = pkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.E(this.d, Unit.a);
    }

    @Override // defpackage.v70
    public final String toString() {
        return super.toString() + this.c;
    }
}
