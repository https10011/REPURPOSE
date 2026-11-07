package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class cd0 extends nf0 {
    public final long b;
    public final boolean c;
    public long d;

    public cd0(ds1 ds1Var, long j, boolean z) {
        super(ds1Var);
        this.b = j;
        this.c = z;
    }

    @Override // defpackage.nf0, defpackage.ds1
    public final long F(ji jiVar, long j) throws IOException {
        jiVar.getClass();
        long j2 = this.d;
        long j3 = this.b;
        if (j2 > j3) {
            j = 0;
        } else if (this.c) {
            long j4 = j3 - j2;
            if (j4 == 0) {
                return -1L;
            }
            j = Math.min(j, j4);
        }
        long jF = this.a.F(jiVar, j);
        if (jF != -1) {
            this.d += jF;
        }
        long j5 = this.d;
        if ((j5 >= j3 || jF != -1) && j5 <= j3) {
            return jF;
        }
        if (jF > 0 && j5 > j3) {
            long j6 = jiVar.b - (j5 - j3);
            ji jiVar2 = new ji();
            jiVar2.R(jiVar);
            jiVar.f(jiVar2, j6);
            jiVar2.i();
        }
        throw new IOException("expected " + j3 + " bytes but got " + this.d);
    }
}
