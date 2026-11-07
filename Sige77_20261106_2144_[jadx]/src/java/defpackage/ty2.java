package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class ty2 extends uz2 {
    public final /* synthetic */ b03 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ty2(b03 b03Var) {
        super(b03Var, true);
        Objects.requireNonNull(b03Var);
        this.e = b03Var;
    }

    @Override // defpackage.uz2
    public final void a() {
        b03 b03Var = this.e;
        long j = b03Var.f;
        bx2 bx2Var = b03Var.e;
        if (j >= 170) {
            gu2.o(bx2Var);
            bx2Var.resetAnalyticsDataWithElapsedTime(this.a, this.b);
        } else {
            gu2.o(bx2Var);
            bx2Var.resetAnalyticsData(this.a);
        }
    }
}
