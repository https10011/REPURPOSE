package defpackage;

import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import kotlin.text.CharsKt;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class mf1 implements ri {
    public final ds1 a;
    public final ji b;
    public boolean c;

    public mf1(ds1 ds1Var) {
        ds1Var.getClass();
        this.a = ds1Var;
        this.b = new ji();
    }

    @Override // defpackage.ds1
    public final long F(ji jiVar, long j) {
        jiVar.getClass();
        if (j < 0) {
            e.d(ck1.t("byteCount < 0: ", j));
            return 0L;
        }
        if (this.c) {
            uq1.q("closed");
            return 0L;
        }
        ji jiVar2 = this.b;
        if (jiVar2.b == 0) {
            if (j == 0) {
                return 0L;
            }
            if (this.a.F(jiVar2, 8192L) == -1) {
                return -1L;
            }
        }
        return jiVar2.F(jiVar, Math.min(j, jiVar2.b));
    }

    @Override // defpackage.ri
    public final String G(long j) throws EOFException {
        if (j < 0) {
            e.d(ck1.t("limit < 0: ", j));
            return null;
        }
        long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
        long jA = a((byte) 10, 0L, j2);
        ji jiVar = this.b;
        if (jA != -1) {
            return b.b(jiVar, jA);
        }
        if (j2 < Long.MAX_VALUE && o(j2) && jiVar.n(j2 - 1) == 13 && o(j2 + 1) && jiVar.n(j2) == 10) {
            return b.b(jiVar, j2);
        }
        ji jiVar2 = new ji();
        jiVar.m(jiVar2, 0L, Math.min(32L, jiVar.b));
        throw new EOFException("\\n not found: limit=" + Math.min(jiVar.b, j) + " content=" + jiVar2.k(jiVar2.b).e() + (char) 8230);
    }

    @Override // defpackage.ri
    public final void J(long j) {
        if (!o(j)) {
            throw new EOFException();
        }
    }

    @Override // defpackage.ri
    public final long O() {
        ji jiVar;
        J(1L);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            boolean zO = o(i2);
            jiVar = this.b;
            if (!zO) {
                break;
            }
            byte bN = jiVar.n(i);
            if ((bN < 48 || bN > 57) && ((bN < 97 || bN > 102) && (bN < 65 || bN > 70))) {
                if (i != 0) {
                    break;
                }
                String string = Integer.toString(bN, CharsKt.c());
                string.getClass();
                throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(string));
            }
            i = i2;
        }
        return jiVar.O();
    }

    @Override // defpackage.ri
    public final String P(Charset charset) {
        charset.getClass();
        ds1 ds1Var = this.a;
        ji jiVar = this.b;
        jiVar.R(ds1Var);
        return jiVar.B(jiVar.b, charset);
    }

    @Override // defpackage.ri
    public final InputStream Q() {
        return new hi(this, 1);
    }

    public final long a(byte b, long j, long j2) {
        if (this.c) {
            uq1.q("closed");
            return 0L;
        }
        if (0 > j2) {
            e.d(ck1.t("fromIndex=0 toIndex=", j2));
            return 0L;
        }
        long jMax = 0;
        while (jMax < j2) {
            ji jiVar = this.b;
            byte b2 = b;
            long j3 = j2;
            long jP = jiVar.p(b2, jMax, j3);
            if (jP != -1) {
                return jP;
            }
            long j4 = jiVar.b;
            if (j4 >= j3 || this.a.F(jiVar, 8192L) == -1) {
                break;
            }
            jMax = Math.max(jMax, j4);
            b = b2;
            j2 = j3;
        }
        return -1L;
    }

    public final int b() {
        J(4L);
        return kv.Z(this.b.readInt());
    }

    @Override // defpackage.ri, defpackage.qi
    public final ji c() {
        return this.b;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (this.c) {
            return;
        }
        this.c = true;
        this.a.close();
        this.b.i();
    }

    @Override // defpackage.ds1
    public final vx1 d() {
        return this.a.d();
    }

    public final long e() throws EOFException {
        char c;
        char c2;
        long j;
        J(8L);
        ji jiVar = this.b;
        if (jiVar.b < 8) {
            throw new EOFException();
        }
        yn1 yn1Var = jiVar.a;
        yn1Var.getClass();
        int i = yn1Var.b;
        int i2 = yn1Var.c;
        if (i2 - i < 8) {
            j = ((((long) jiVar.readInt()) & 4294967295L) << 32) | (4294967295L & ((long) jiVar.readInt()));
            c = 24;
            c2 = '(';
        } else {
            byte[] bArr = yn1Var.a;
            c = 24;
            c2 = '(';
            int i3 = i + 7;
            long j2 = ((((long) bArr[i]) & 255) << 56) | ((((long) bArr[i + 1]) & 255) << 48) | ((((long) bArr[i + 2]) & 255) << 40) | ((((long) bArr[i + 3]) & 255) << 32) | ((((long) bArr[i + 4]) & 255) << 24) | ((((long) bArr[i + 5]) & 255) << 16) | ((((long) bArr[i + 6]) & 255) << 8);
            int i4 = i + 8;
            long j3 = j2 | (((long) bArr[i3]) & 255);
            jiVar.b -= 8;
            if (i4 == i2) {
                jiVar.a = yn1Var.a();
                ao1.a(yn1Var);
            } else {
                yn1Var.b = i4;
            }
            j = j3;
        }
        return ((j & 255) << 56) | (((-72057594037927936L) & j) >>> 56) | ((71776119061217280L & j) >>> c2) | ((280375465082880L & j) >>> c) | ((1095216660480L & j) >>> 8) | ((4278190080L & j) << 8) | ((16711680 & j) << c) | ((65280 & j) << c2);
    }

    public final short i() {
        J(2L);
        return this.b.A();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.c;
    }

    public final String j(long j) {
        J(j);
        return this.b.B(j, Charsets.UTF_8);
    }

    @Override // defpackage.ri
    public final rj k(long j) {
        J(j);
        return this.b.k(j);
    }

    @Override // defpackage.ri
    public final boolean o(long j) {
        ji jiVar;
        if (j < 0) {
            e.d(ck1.t("byteCount < 0: ", j));
            return false;
        }
        if (this.c) {
            uq1.q("closed");
            return false;
        }
        do {
            jiVar = this.b;
            if (jiVar.b >= j) {
                return true;
            }
        } while (this.a.F(jiVar, 8192L) != -1);
        return false;
    }

    @Override // defpackage.ri
    public final long r(ji jiVar) {
        ji jiVar2;
        long j = 0;
        while (true) {
            ds1 ds1Var = this.a;
            jiVar2 = this.b;
            if (ds1Var.F(jiVar2, 8192L) == -1) {
                break;
            }
            long jL = jiVar2.l();
            if (jL > 0) {
                j += jL;
                jiVar.f(jiVar2, jL);
            }
        }
        long j2 = jiVar2.b;
        if (j2 <= 0) {
            return j;
        }
        long j3 = j + j2;
        jiVar.f(jiVar2, j2);
        return j3;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        ji jiVar = this.b;
        if (jiVar.b == 0 && this.a.F(jiVar, 8192L) == -1) {
            return -1;
        }
        return jiVar.read(byteBuffer);
    }

    @Override // defpackage.ri
    public final byte readByte() {
        J(1L);
        return this.b.readByte();
    }

    @Override // defpackage.ri
    public final int readInt() {
        J(4L);
        return this.b.readInt();
    }

    @Override // defpackage.ri
    public final short readShort() {
        J(2L);
        return this.b.readShort();
    }

    @Override // defpackage.ri
    public final void skip(long j) {
        if (this.c) {
            uq1.q("closed");
            return;
        }
        while (j > 0) {
            ji jiVar = this.b;
            if (jiVar.b == 0 && this.a.F(jiVar, 8192L) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j, jiVar.b);
            jiVar.skip(jMin);
            j -= jMin;
        }
    }

    public final String toString() {
        return "buffer(" + this.a + ')';
    }

    @Override // defpackage.ri
    public final String u() {
        return G(Long.MAX_VALUE);
    }

    @Override // defpackage.ri
    public final boolean v() {
        if (this.c) {
            uq1.q("closed");
            return false;
        }
        ji jiVar = this.b;
        return jiVar.v() && this.a.F(jiVar, 8192L) == -1;
    }

    @Override // defpackage.ri
    public final int z(ca1 ca1Var) throws EOFException {
        ji jiVar;
        ca1Var.getClass();
        if (this.c) {
            uq1.q("closed");
            return 0;
        }
        do {
            jiVar = this.b;
            int iC = b.c(jiVar, ca1Var, true);
            if (iC != -2) {
                if (iC == -1) {
                    break;
                }
                jiVar.skip(ca1Var.b[iC].d());
                return iC;
            }
        } while (this.a.F(jiVar, 8192L) != -1);
        return -1;
    }
}
