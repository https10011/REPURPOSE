package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class nf0 implements ds1 {
    public final ds1 a;

    public nf0(ds1 ds1Var) {
        ds1Var.getClass();
        this.a = ds1Var;
    }

    @Override // defpackage.ds1
    public long F(ji jiVar, long j) {
        jiVar.getClass();
        return this.a.F(jiVar, j);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.a.close();
    }

    @Override // defpackage.ds1
    public final vx1 d() {
        return this.a.d();
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.a + ')';
    }
}
