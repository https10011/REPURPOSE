package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class ur2 extends tr2 {
    public final byte[] c;
    public final int d;
    public int e;
    public final ByteArrayOutputStream f;

    public ur2(ByteArrayOutputStream byteArrayOutputStream, int i) {
        this.f = byteArrayOutputStream;
        if (i < 0) {
            e.g("bufferSize must be >= 0");
            throw null;
        }
        int iMax = Math.max(i, 20);
        this.c = new byte[iMax];
        this.d = iMax;
    }

    public final void A(int i) {
        boolean z = tr2.b;
        byte[] bArr = this.c;
        if (z) {
            while (true) {
                int i2 = i & (-128);
                int i3 = this.e;
                if (i2 == 0) {
                    this.e = i3 + 1;
                    nt2.e(bArr, i3, (byte) i);
                    return;
                } else {
                    this.e = i3 + 1;
                    nt2.e(bArr, i3, (byte) (i | 128));
                    i >>>= 7;
                }
            }
        } else {
            while (true) {
                int i4 = i & (-128);
                int i5 = this.e;
                if (i4 == 0) {
                    this.e = i5 + 1;
                    bArr[i5] = (byte) i;
                    return;
                } else {
                    this.e = i5 + 1;
                    bArr[i5] = (byte) (i | 128);
                    i >>>= 7;
                }
            }
        }
    }

    public final void B(int i) throws IOException {
        if (this.d - this.e < i) {
            v();
        }
    }

    @Override // defpackage.tr2
    public final void a(byte b) throws IOException {
        if (this.e == this.d) {
            v();
        }
        int i = this.e;
        this.c[i] = b;
        this.e = i + 1;
    }

    @Override // defpackage.tr2
    public final void b(int i) throws IOException {
        B(4);
        z(i);
    }

    @Override // defpackage.tr2
    public final void c(int i, int i2) throws IOException {
        B(14);
        y(i, 5);
        z(i2);
    }

    @Override // defpackage.tr2
    public final void d(int i, long j) throws IOException {
        B(18);
        y(i, 1);
        w(j);
    }

    @Override // defpackage.tr2
    public final void e(int i, String str) throws IOException {
        p(i, 2);
        int length = str.length() * 3;
        int iT = tr2.t(length);
        int i2 = iT + length;
        int i3 = this.d;
        if (i2 > i3) {
            byte[] bArr = new byte[length];
            int iG = z32.G(str, bArr, 0, length);
            o(iG);
            u(bArr, 0, iG);
            return;
        }
        if (i2 > i3 - this.e) {
            v();
        }
        int iT2 = tr2.t(str.length());
        int i4 = this.e;
        byte[] bArr2 = this.c;
        try {
            if (iT2 != iT) {
                int iF = z32.F(str);
                A(iF);
                this.e = z32.G(str, bArr2, this.e, iF);
            } else {
                int i5 = i4 + iT2;
                this.e = i5;
                int iG2 = z32.G(str, bArr2, i5, i3 - i5);
                this.e = i4;
                A((iG2 - i4) - iT2);
                this.e = iG2;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new tn(e);
        }
    }

    @Override // defpackage.tr2
    public final void f(int i, jr2 jr2Var) throws IOException {
        p(i, 2);
        o(jr2Var.b());
        jr2Var.k(this);
    }

    @Override // defpackage.tr2
    public final void g(int i, boolean z) throws IOException {
        B(11);
        y(i, 0);
        byte b = z ? (byte) 1 : (byte) 0;
        int i2 = this.e;
        this.c[i2] = b;
        this.e = i2 + 1;
    }

    @Override // defpackage.tr2
    public final void h(long j) throws IOException {
        B(8);
        w(j);
    }

    @Override // defpackage.tr2
    public final void i(byte[] bArr, int i, int i2) throws IOException {
        u(bArr, i, i2);
    }

    @Override // defpackage.tr2
    public final void j(int i) throws IOException {
        if (i >= 0) {
            o(i);
        } else {
            m(i);
        }
    }

    @Override // defpackage.tr2
    public final void k(int i, int i2) throws IOException {
        B(20);
        y(i, 0);
        if (i2 >= 0) {
            A(i2);
        } else {
            x(i2);
        }
    }

    @Override // defpackage.tr2
    public final void l(int i, long j) throws IOException {
        B(20);
        y(i, 0);
        x(j);
    }

    @Override // defpackage.tr2
    public final void m(long j) throws IOException {
        B(10);
        x(j);
    }

    @Override // defpackage.tr2
    public final void o(int i) throws IOException {
        B(5);
        A(i);
    }

    @Override // defpackage.tr2
    public final void p(int i, int i2) throws IOException {
        o((i << 3) | i2);
    }

    @Override // defpackage.tr2
    public final void q(int i, int i2) throws IOException {
        B(20);
        y(i, 0);
        A(i2);
    }

    public final void u(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.e;
        int i4 = this.d;
        int i5 = i4 - i3;
        byte[] bArr2 = this.c;
        if (i5 >= i2) {
            System.arraycopy(bArr, i, bArr2, i3, i2);
            this.e += i2;
            return;
        }
        System.arraycopy(bArr, i, bArr2, i3, i5);
        int i6 = i + i5;
        int i7 = i2 - i5;
        this.e = i4;
        v();
        if (i7 > i4) {
            this.f.write(bArr, i6, i7);
        } else {
            System.arraycopy(bArr, i6, bArr2, 0, i7);
            this.e = i7;
        }
    }

    public final void v() throws IOException {
        this.f.write(this.c, 0, this.e);
        this.e = 0;
    }

    public final void w(long j) {
        int i = this.e;
        byte[] bArr = this.c;
        bArr[i] = (byte) j;
        bArr[i + 1] = (byte) (j >> 8);
        bArr[i + 2] = (byte) (j >> 16);
        bArr[i + 3] = (byte) (j >> 24);
        bArr[i + 4] = (byte) (j >> 32);
        bArr[i + 5] = (byte) (j >> 40);
        bArr[i + 6] = (byte) (j >> 48);
        bArr[i + 7] = (byte) (j >> 56);
        this.e = i + 8;
    }

    public final void x(long j) {
        boolean z = tr2.b;
        byte[] bArr = this.c;
        if (z) {
            while (true) {
                long j2 = j & (-128);
                int i = this.e;
                if (j2 == 0) {
                    this.e = i + 1;
                    nt2.e(bArr, i, (byte) j);
                    return;
                } else {
                    this.e = i + 1;
                    nt2.e(bArr, i, (byte) (((int) j) | 128));
                    j >>>= 7;
                }
            }
        } else {
            while (true) {
                long j3 = j & (-128);
                int i2 = this.e;
                if (j3 == 0) {
                    this.e = i2 + 1;
                    bArr[i2] = (byte) j;
                    return;
                } else {
                    this.e = i2 + 1;
                    bArr[i2] = (byte) (((int) j) | 128);
                    j >>>= 7;
                }
            }
        }
    }

    public final void y(int i, int i2) {
        A((i << 3) | i2);
    }

    public final void z(int i) {
        int i2 = this.e;
        byte[] bArr = this.c;
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >> 8);
        bArr[i2 + 2] = (byte) (i >> 16);
        bArr[i2 + 3] = i >> 24;
        this.e = i2 + 4;
    }
}
