package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class fl0 implements ds1 {
    public byte a;
    public final mf1 b;
    public final Inflater c;
    public final aq0 d;
    public final CRC32 e;

    public fl0(ds1 ds1Var) {
        ds1Var.getClass();
        mf1 mf1Var = new mf1(ds1Var);
        this.b = mf1Var;
        Inflater inflater = new Inflater(true);
        this.c = inflater;
        this.d = new aq0(mf1Var, inflater);
        this.e = new CRC32();
    }

    public static void a(int i, int i2, String str) throws IOException {
        if (i2 == i) {
            return;
        }
        throw new IOException(str + ": actual 0x" + StringsKt.z(kv.l0(i2)) + " != expected 0x" + StringsKt.z(kv.l0(i)));
    }

    @Override // defpackage.ds1
    public final long F(ji jiVar, long j) throws IOException {
        fl0 fl0Var = this;
        jiVar.getClass();
        if (j < 0) {
            e.d(ck1.t("byteCount < 0: ", j));
            return 0L;
        }
        if (j == 0) {
            return 0L;
        }
        byte b = fl0Var.a;
        CRC32 crc32 = fl0Var.e;
        mf1 mf1Var = fl0Var.b;
        if (b == 0) {
            mf1Var.J(10L);
            ji jiVar2 = mf1Var.b;
            byte bN = jiVar2.n(3L);
            boolean z = ((bN >> 1) & 1) == 1;
            if (z) {
                fl0Var.b(jiVar2, 0L, 10L);
            }
            a(8075, mf1Var.readShort(), "ID1ID2");
            mf1Var.skip(8L);
            if (((bN >> 2) & 1) == 1) {
                mf1Var.J(2L);
                if (z) {
                    b(jiVar2, 0L, 2L);
                }
                long jA = jiVar2.A() & 65535;
                mf1Var.J(jA);
                if (z) {
                    b(jiVar2, 0L, jA);
                }
                mf1Var.skip(jA);
            }
            if (((bN >> 3) & 1) == 1) {
                long jA2 = mf1Var.a((byte) 0, 0L, Long.MAX_VALUE);
                if (jA2 == -1) {
                    throw new EOFException();
                }
                if (z) {
                    b(jiVar2, 0L, jA2 + 1);
                }
                mf1Var.skip(jA2 + 1);
            }
            if (((bN >> 4) & 1) == 1) {
                long jA3 = mf1Var.a((byte) 0, 0L, Long.MAX_VALUE);
                if (jA3 == -1) {
                    throw new EOFException();
                }
                if (z) {
                    fl0Var = this;
                    fl0Var.b(jiVar2, 0L, jA3 + 1);
                } else {
                    fl0Var = this;
                }
                mf1Var.skip(jA3 + 1);
            } else {
                fl0Var = this;
            }
            if (z) {
                a(mf1Var.i(), (short) crc32.getValue(), "FHCRC");
                crc32.reset();
            }
            fl0Var.a = (byte) 1;
        }
        if (fl0Var.a == 1) {
            long j2 = jiVar.b;
            long jF = fl0Var.d.F(jiVar, j);
            if (jF != -1) {
                fl0Var.b(jiVar, j2, jF);
                return jF;
            }
            fl0Var.a = (byte) 2;
        }
        if (fl0Var.a == 2) {
            a(mf1Var.b(), (int) crc32.getValue(), "CRC");
            a(mf1Var.b(), (int) fl0Var.c.getBytesWritten(), "ISIZE");
            fl0Var.a = (byte) 3;
            if (!mf1Var.v()) {
                uq1.o("gzip finished without exhausting source");
                return 0L;
            }
        }
        return -1L;
    }

    public final void b(ji jiVar, long j, long j2) {
        yn1 yn1Var = jiVar.a;
        yn1Var.getClass();
        while (true) {
            int i = yn1Var.c;
            int i2 = yn1Var.b;
            if (j < i - i2) {
                break;
            }
            j -= (long) (i - i2);
            yn1Var = yn1Var.f;
            yn1Var.getClass();
        }
        while (j2 > 0) {
            int i3 = (int) (((long) yn1Var.b) + j);
            int iMin = (int) Math.min(yn1Var.c - i3, j2);
            this.e.update(yn1Var.a, i3, iMin);
            j2 -= (long) iMin;
            yn1Var = yn1Var.f;
            yn1Var.getClass();
            j = 0;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.d.close();
    }

    @Override // defpackage.ds1
    public final vx1 d() {
        return this.b.a.d();
    }
}
