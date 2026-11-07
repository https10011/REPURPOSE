package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class aq0 implements ds1 {
    public final mf1 a;
    public final Inflater b;
    public int c;
    public boolean d;

    public aq0(mf1 mf1Var, Inflater inflater) {
        this.a = mf1Var;
        this.b = inflater;
    }

    @Override // defpackage.ds1
    public final long F(ji jiVar, long j) throws IOException {
        long j2;
        jiVar.getClass();
        while (j >= 0) {
            if (this.d) {
                uq1.q("closed");
                return 0L;
            }
            mf1 mf1Var = this.a;
            Inflater inflater = this.b;
            if (j == 0) {
                j2 = 0;
            } else {
                try {
                    yn1 yn1VarM = jiVar.M(1);
                    int iMin = (int) Math.min(j, 8192 - yn1VarM.c);
                    if (inflater.needsInput() && !mf1Var.v()) {
                        yn1 yn1Var = mf1Var.b.a;
                        yn1Var.getClass();
                        int i = yn1Var.c;
                        int i2 = yn1Var.b;
                        int i3 = i - i2;
                        this.c = i3;
                        inflater.setInput(yn1Var.a, i2, i3);
                    }
                    int iInflate = inflater.inflate(yn1VarM.a, yn1VarM.c, iMin);
                    int i4 = this.c;
                    if (i4 != 0) {
                        int remaining = i4 - inflater.getRemaining();
                        this.c -= remaining;
                        mf1Var.skip(remaining);
                    }
                    if (iInflate > 0) {
                        yn1VarM.c += iInflate;
                        j2 = iInflate;
                        jiVar.b += j2;
                    } else {
                        if (yn1VarM.b == yn1VarM.c) {
                            jiVar.a = yn1VarM.a();
                            ao1.a(yn1VarM);
                        }
                        j2 = 0;
                    }
                } catch (DataFormatException e) {
                    throw new IOException(e);
                }
            }
            if (j2 > 0) {
                return j2;
            }
            if (inflater.finished() || inflater.needsDictionary()) {
                return -1L;
            }
            if (mf1Var.v()) {
                throw new EOFException("source exhausted prematurely");
            }
        }
        e.d(ck1.t("byteCount < 0: ", j));
        return 0L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.d) {
            return;
        }
        this.b.end();
        this.d = true;
        this.a.close();
    }

    @Override // defpackage.ds1
    public final vx1 d() {
        return this.a.a.d();
    }
}
