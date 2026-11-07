package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class i81 extends nf0 {
    public final /* synthetic */ j81 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i81(j81 j81Var, ri riVar) {
        super(riVar);
        this.b = j81Var;
    }

    @Override // defpackage.nf0, defpackage.ds1
    public final long F(ji jiVar, long j) throws IOException {
        try {
            return super.F(jiVar, j);
        } catch (IOException e) {
            this.b.f = e;
            throw e;
        }
    }
}
