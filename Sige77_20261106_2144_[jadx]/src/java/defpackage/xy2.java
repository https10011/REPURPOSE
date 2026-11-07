package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class xy2 extends uz2 {
    public final /* synthetic */ long e;
    public final /* synthetic */ b03 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xy2(b03 b03Var, long j) {
        super(b03Var, true);
        this.e = j;
        Objects.requireNonNull(b03Var);
        this.f = b03Var;
    }

    @Override // defpackage.uz2
    public final void a() {
        bx2 bx2Var = this.f.e;
        gu2.o(bx2Var);
        bx2Var.setSessionTimeoutDuration(this.e);
    }
}
