package defpackage;

import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class e53 implements Closeable {
    public final ByteArrayInputStream a;
    public c53 b;
    public final byte[] c = new byte[8];
    public final z10 d = new z10(1);

    public e53(ByteArrayInputStream byteArrayInputStream) {
        this.a = byteArrayInputStream;
    }

    public final long a() {
        n((byte) -128);
        m();
        long jL = l();
        if (jL < 0) {
            sm0.h("the maximum supported array length is 9223372036854775807");
            return 0L;
        }
        if (jL > 0) {
            this.d.a.push(Long.valueOf(jL));
        }
        return jL;
    }

    public final long b() {
        boolean z;
        i();
        byte b = this.b.a;
        if (b == 0) {
            z = true;
        } else {
            if (b != 32) {
                uq1.q(ck1.r((b >> 5) & 7, "expected major type 0 or 1 but found "));
                return 0L;
            }
            z = false;
        }
        long jL = l();
        if (jL >= 0) {
            return z ? jL : ~jL;
        }
        sm0.h("the maximum supported unsigned/negative integer is 9223372036854775807");
        return 0L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.a.close();
        this.d.a();
    }

    public final long e() {
        n((byte) -96);
        m();
        long jL = l();
        if (jL < 0 || jL > 4611686018427387903L) {
            sm0.h("the maximum supported map length is 4611686018427387903L");
            return 0L;
        }
        if (jL > 0) {
            this.d.a.push(Long.valueOf(jL + jL));
        }
        return jL;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0089  */
    /* JADX WARN: Code duplicated, block: B:53:0x00cb  */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x008b, code lost:
    
        if (r0 != (-2)) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.c53 i() {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e53.i():c53");
    }

    public final boolean j() {
        n((byte) -32);
        if (this.b.b > 24) {
            uq1.q("expected simple value");
            return false;
        }
        int iL = (int) l();
        if (iL == 20) {
            return false;
        }
        if (iL == 21) {
            return true;
        }
        uq1.q("expected FALSE or TRUE");
        return false;
    }

    public final long l() throws IOException {
        c53 c53Var = this.b;
        byte b = c53Var.b;
        if (b < 24) {
            long j = b;
            this.b = null;
            return j;
        }
        if (b == 24) {
            int i = this.a.read();
            if (i == -1) {
                throw new EOFException();
            }
            this.b = null;
            return ((long) i) & 255;
        }
        byte[] bArr = this.c;
        if (b == 25) {
            p(bArr, 2);
            return ((((long) bArr[0]) & 255) << 8) | (((long) bArr[1]) & 255);
        }
        if (b == 26) {
            p(bArr, 4);
            return ((((long) bArr[0]) & 255) << 24) | ((((long) bArr[1]) & 255) << 16) | ((((long) bArr[2]) & 255) << 8) | (((long) bArr[3]) & 255);
        }
        if (b != 27) {
            uq1.o(ts.i("invalid additional information ", b, (c53Var.a >> 5) & 7, " for major type "));
            return 0L;
        }
        p(bArr, 8);
        long j2 = bArr[0];
        long j3 = bArr[1];
        long j4 = bArr[2];
        long j5 = bArr[3];
        return (((long) bArr[7]) & 255) | ((j3 & 255) << 48) | ((j2 & 255) << 56) | ((j4 & 255) << 40) | ((j5 & 255) << 32) | ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8);
    }

    public final void m() {
        i();
        byte b = this.b.b;
        if (b != 31) {
            return;
        }
        uq1.q(ck1.r(b, "expected definite length but found "));
    }

    public final void n(byte b) {
        i();
        byte b2 = this.b.a;
        if (b2 == b) {
            return;
        }
        uq1.q(ts.i("expected major type ", (b >> 5) & 7, (b2 >> 5) & 7, " but found "));
    }

    public final void p(byte[] bArr, int i) throws IOException {
        int i2 = 0;
        while (i2 != i) {
            int i3 = this.a.read(bArr, i2, i - i2);
            if (i3 == -1) {
                throw new EOFException();
            }
            i2 += i3;
        }
        this.b = null;
    }

    public final byte[] q() {
        m();
        long jL = l();
        if (jL < 0 || jL > 2147483647L) {
            sm0.h("the maximum supported byte/text string length is 2147483647 bytes");
            return null;
        }
        if (this.a.available() < jL) {
            throw new EOFException();
        }
        int i = (int) jL;
        byte[] bArr = new byte[i];
        p(bArr, i);
        return bArr;
    }
}
