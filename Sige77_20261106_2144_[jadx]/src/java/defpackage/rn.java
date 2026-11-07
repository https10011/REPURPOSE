package defpackage;

import com.hjq.toast.BuildConfig;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class rn extends sn {
    public final FileInputStream d;
    public final byte[] e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;

    public rn(FileInputStream fileInputStream) {
        super(0);
        this.k = Integer.MAX_VALUE;
        Charset charset = dr0.a;
        this.d = fileInputStream;
        this.e = new byte[4096];
        this.f = 0;
        this.h = 0;
        this.j = 0;
    }

    @Override // defpackage.sn
    public final void a(int i) throws ur0 {
        if (this.i != i) {
            throw new ur0("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // defpackage.sn
    public final int b() {
        return this.j + this.h;
    }

    @Override // defpackage.sn
    public final boolean c() {
        return this.h == this.f && !o0(1);
    }

    @Override // defpackage.sn
    public final void d(int i) {
        this.k = i;
        l0();
    }

    public final byte[] d0(int i) throws IOException {
        byte[] bArrE0 = e0(i);
        if (bArrE0 != null) {
            return bArrE0;
        }
        int i2 = this.h;
        int i3 = this.f;
        int length = i3 - i2;
        this.j += i3;
        this.h = 0;
        this.f = 0;
        ArrayList arrayListF0 = f0(i - length);
        byte[] bArr = new byte[i];
        System.arraycopy(this.e, i2, bArr, 0, length);
        int size = arrayListF0.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayListF0.get(i4);
            i4++;
            byte[] bArr2 = (byte[]) obj;
            System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
            length += bArr2.length;
        }
        return bArr;
    }

    @Override // defpackage.sn
    public final int e(int i) throws ur0 {
        if (i < 0) {
            throw ur0.d();
        }
        int i2 = this.j + this.h + i;
        if (i2 < 0) {
            throw new ur0("Failed to parse the message.");
        }
        int i3 = this.k;
        if (i2 > i3) {
            throw ur0.e();
        }
        this.k = i2;
        l0();
        return i3;
    }

    public final byte[] e0(int i) throws IOException {
        if (i == 0) {
            return dr0.b;
        }
        if (i < 0) {
            throw ur0.d();
        }
        int i2 = this.j;
        int i3 = this.h;
        int i4 = i2 + i3 + i;
        if (i4 - Integer.MAX_VALUE > 0) {
            throw new ur0("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int i5 = this.k;
        if (i4 > i5) {
            n0((i5 - i2) - i3);
            throw ur0.e();
        }
        int i6 = this.f - i3;
        int i7 = i - i6;
        FileInputStream fileInputStream = this.d;
        if (i7 >= 4096) {
            try {
                if (i7 > fileInputStream.available()) {
                    return null;
                }
            } catch (ur0 e) {
                e.a = true;
                throw e;
            }
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.e, this.h, bArr, 0, i6);
        this.j += this.f;
        this.h = 0;
        this.f = 0;
        while (i6 < i) {
            try {
                int i8 = fileInputStream.read(bArr, i6, i - i6);
                if (i8 == -1) {
                    throw ur0.e();
                }
                this.j += i8;
                i6 += i8;
            } catch (ur0 e2) {
                e2.a = true;
                throw e2;
            }
        }
        return bArr;
    }

    @Override // defpackage.sn
    public final boolean f() {
        return j0() != 0;
    }

    public final ArrayList f0(int i) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int iMin = Math.min(i, 4096);
            byte[] bArr = new byte[iMin];
            int i2 = 0;
            while (i2 < iMin) {
                int i3 = this.d.read(bArr, i2, iMin - i2);
                if (i3 == -1) {
                    throw ur0.e();
                }
                this.j += i3;
                i2 += i3;
            }
            i -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    @Override // defpackage.sn
    public final qj g() throws IOException {
        int iI0 = i0();
        int i = this.f;
        int i2 = this.h;
        int i3 = i - i2;
        byte[] bArr = this.e;
        if (iI0 <= i3 && iI0 > 0) {
            qj qjVarC = qj.c(bArr, i2, iI0);
            this.h += iI0;
            return qjVarC;
        }
        if (iI0 == 0) {
            return qj.c;
        }
        if (iI0 < 0) {
            throw ur0.d();
        }
        byte[] bArrE0 = e0(iI0);
        if (bArrE0 != null) {
            return qj.c(bArrE0, 0, bArrE0.length);
        }
        int i4 = this.h;
        int i5 = this.f;
        int length = i5 - i4;
        this.j += i5;
        this.h = 0;
        this.f = 0;
        ArrayList arrayListF0 = f0(iI0 - length);
        byte[] bArr2 = new byte[iI0];
        System.arraycopy(bArr, i4, bArr2, 0, length);
        int size = arrayListF0.size();
        int i6 = 0;
        while (i6 < size) {
            Object obj = arrayListF0.get(i6);
            i6++;
            byte[] bArr3 = (byte[]) obj;
            System.arraycopy(bArr3, 0, bArr2, length, bArr3.length);
            length += bArr3.length;
        }
        qj qjVar = qj.c;
        return new qj(bArr2);
    }

    public final int g0() throws ur0 {
        int i = this.h;
        if (this.f - i < 4) {
            m0(4);
            i = this.h;
        }
        this.h = i + 4;
        byte[] bArr = this.e;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    @Override // defpackage.sn
    public final double h() {
        return Double.longBitsToDouble(h0());
    }

    public final long h0() throws ur0 {
        int i = this.h;
        if (this.f - i < 8) {
            m0(8);
            i = this.h;
        }
        this.h = i + 8;
        byte[] bArr = this.e;
        return ((((long) bArr[i + 1]) & 255) << 8) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    @Override // defpackage.sn
    public final int i() {
        return i0();
    }

    public final int i0() {
        int i;
        int i2 = this.h;
        int i3 = this.f;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.e;
            byte b = bArr[i2];
            if (b >= 0) {
                this.h = i4;
                return b;
            }
            if (i3 - i4 >= 9) {
                int i5 = i2 + 2;
                int i6 = (bArr[i4] << 7) ^ b;
                if (i6 < 0) {
                    i = i6 ^ (-128);
                } else {
                    int i7 = i2 + 3;
                    int i8 = (bArr[i5] << 14) ^ i6;
                    if (i8 >= 0) {
                        i = i8 ^ 16256;
                    } else {
                        int i9 = i2 + 4;
                        int i10 = i8 ^ (bArr[i7] << 21);
                        if (i10 < 0) {
                            i = (-2080896) ^ i10;
                        } else {
                            i7 = i2 + 5;
                            byte b2 = bArr[i9];
                            int i11 = (i10 ^ (b2 << 28)) ^ 266354560;
                            if (b2 < 0) {
                                i9 = i2 + 6;
                                if (bArr[i7] < 0) {
                                    i7 = i2 + 7;
                                    if (bArr[i9] < 0) {
                                        i9 = i2 + 8;
                                        if (bArr[i7] < 0) {
                                            i7 = i2 + 9;
                                            if (bArr[i9] < 0) {
                                                int i12 = i2 + 10;
                                                if (bArr[i7] >= 0) {
                                                    i5 = i12;
                                                    i = i11;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i11;
                            }
                            i = i11;
                        }
                        i5 = i9;
                    }
                    i5 = i7;
                }
                this.h = i5;
                return i;
            }
        }
        return (int) k0();
    }

    @Override // defpackage.sn
    public final int j() {
        return g0();
    }

    public final long j0() {
        long j;
        long j2;
        long j3;
        long j4;
        int i = this.h;
        int i2 = this.f;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.e;
            byte b = bArr[i];
            if (b >= 0) {
                this.h = i3;
                return b;
            }
            if (i2 - i3 >= 9) {
                int i4 = i + 2;
                int i5 = (bArr[i3] << 7) ^ b;
                if (i5 < 0) {
                    j = i5 ^ (-128);
                } else {
                    int i6 = i + 3;
                    int i7 = (bArr[i4] << 14) ^ i5;
                    if (i7 >= 0) {
                        j = i7 ^ 16256;
                        i4 = i6;
                    } else {
                        int i8 = i + 4;
                        int i9 = i7 ^ (bArr[i6] << 21);
                        if (i9 < 0) {
                            j4 = (-2080896) ^ i9;
                        } else {
                            long j5 = i9;
                            i4 = i + 5;
                            long j6 = j5 ^ (((long) bArr[i8]) << 28);
                            if (j6 >= 0) {
                                j3 = 266354560;
                            } else {
                                i8 = i + 6;
                                long j7 = j6 ^ (((long) bArr[i4]) << 35);
                                if (j7 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    i4 = i + 7;
                                    j6 = j7 ^ (((long) bArr[i8]) << 42);
                                    if (j6 >= 0) {
                                        j3 = 4363953127296L;
                                    } else {
                                        i8 = i + 8;
                                        j7 = j6 ^ (((long) bArr[i4]) << 49);
                                        if (j7 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            i4 = i + 9;
                                            long j8 = (j7 ^ (((long) bArr[i8]) << 56)) ^ 71499008037633920L;
                                            if (j8 < 0) {
                                                int i10 = i + 10;
                                                if (bArr[i4] >= 0) {
                                                    i4 = i10;
                                                }
                                            }
                                            j = j8;
                                        }
                                    }
                                }
                                j4 = j2 ^ j7;
                            }
                            j = j3 ^ j6;
                        }
                        i4 = i8;
                        j = j4;
                    }
                }
                this.h = i4;
                return j;
            }
        }
        return k0();
    }

    @Override // defpackage.sn
    public final long k() {
        return h0();
    }

    public final long k0() throws ur0 {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            if (this.h == this.f) {
                m0(1);
            }
            int i2 = this.h;
            this.h = i2 + 1;
            byte b = this.e[i2];
            j |= ((long) (b & 127)) << i;
            if ((b & 128) == 0) {
                return j;
            }
        }
        throw ur0.c();
    }

    @Override // defpackage.sn
    public final float l() {
        return Float.intBitsToFloat(g0());
    }

    public final void l0() {
        int i = this.f + this.g;
        this.f = i;
        int i2 = this.j + i;
        int i3 = this.k;
        if (i2 <= i3) {
            this.g = 0;
            return;
        }
        int i4 = i2 - i3;
        this.g = i4;
        this.f = i - i4;
    }

    @Override // defpackage.sn
    public final int m() {
        return i0();
    }

    public final void m0(int i) throws ur0 {
        if (o0(i)) {
            return;
        }
        if (i <= (Integer.MAX_VALUE - this.j) - this.h) {
            throw ur0.e();
        }
        throw new ur0("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    @Override // defpackage.sn
    public final long n() {
        return j0();
    }

    public final void n0(int i) throws ur0 {
        int i2 = this.f;
        int i3 = this.h;
        int i4 = i2 - i3;
        if (i <= i4 && i >= 0) {
            this.h = i3 + i;
            return;
        }
        FileInputStream fileInputStream = this.d;
        if (i < 0) {
            throw ur0.d();
        }
        int i5 = this.j;
        int i6 = i5 + i3;
        int i7 = i6 + i;
        int i8 = this.k;
        if (i7 > i8) {
            n0((i8 - i5) - i3);
            throw ur0.e();
        }
        this.j = i6;
        this.f = 0;
        this.h = 0;
        while (i4 < i) {
            long j = i - i4;
            try {
                try {
                    long jSkip = fileInputStream.skip(j);
                    if (jSkip < 0 || jSkip > j) {
                        throw new IllegalStateException(fileInputStream.getClass() + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                    }
                    if (jSkip == 0) {
                        break;
                    } else {
                        i4 += (int) jSkip;
                    }
                } catch (ur0 e) {
                    e.a = true;
                    throw e;
                }
            } catch (Throwable th) {
                this.j += i4;
                l0();
                throw th;
            }
        }
        this.j += i4;
        l0();
        if (i4 >= i) {
            return;
        }
        int i9 = this.f;
        int i10 = i9 - this.h;
        this.h = i9;
        m0(1);
        while (true) {
            int i11 = i - i10;
            int i12 = this.f;
            if (i11 <= i12) {
                this.h = i11;
                return;
            } else {
                i10 += i12;
                this.h = i12;
                m0(1);
            }
        }
    }

    @Override // defpackage.sn
    public final int o() {
        return g0();
    }

    public final boolean o0(int i) throws IOException {
        FileInputStream fileInputStream = this.d;
        int i2 = this.h;
        int i3 = i2 + i;
        int i4 = this.f;
        if (i3 <= i4) {
            uq1.q(ts.g(i, "refillBuffer() called when ", " bytes were already available in buffer"));
            return false;
        }
        int i5 = this.j;
        if (i <= (Integer.MAX_VALUE - i5) - i2 && i5 + i2 + i <= this.k) {
            byte[] bArr = this.e;
            if (i2 > 0) {
                if (i4 > i2) {
                    System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                }
                this.j += i2;
                this.f -= i2;
                this.h = 0;
            }
            int i6 = this.f;
            try {
                int i7 = fileInputStream.read(bArr, i6, Math.min(bArr.length - i6, (Integer.MAX_VALUE - this.j) - i6));
                if (i7 == 0 || i7 < -1 || i7 > bArr.length) {
                    throw new IllegalStateException(fileInputStream.getClass() + "#read(byte[]) returned invalid result: " + i7 + "\nThe InputStream implementation is buggy.");
                }
                if (i7 > 0) {
                    this.f += i7;
                    l0();
                    if (this.f >= i) {
                        return true;
                    }
                    return o0(i);
                }
            } catch (ur0 e) {
                e.a = true;
                throw e;
            }
        }
        return false;
    }

    @Override // defpackage.sn
    public final long p() {
        return h0();
    }

    @Override // defpackage.sn
    public final int q() {
        int iI0 = i0();
        return (-(iI0 & 1)) ^ (iI0 >>> 1);
    }

    @Override // defpackage.sn
    public final long r() {
        long jJ0 = j0();
        return (-(jJ0 & 1)) ^ (jJ0 >>> 1);
    }

    @Override // defpackage.sn
    public final String s() throws ur0 {
        int iI0 = i0();
        byte[] bArr = this.e;
        if (iI0 > 0) {
            int i = this.f;
            int i2 = this.h;
            if (iI0 <= i - i2) {
                String str = new String(bArr, i2, iI0, dr0.a);
                this.h += iI0;
                return str;
            }
        }
        if (iI0 == 0) {
            return BuildConfig.FLAVOR;
        }
        if (iI0 < 0) {
            throw ur0.d();
        }
        if (iI0 > this.f) {
            return new String(d0(iI0), dr0.a);
        }
        m0(iI0);
        String str2 = new String(bArr, this.h, iI0, dr0.a);
        this.h += iI0;
        return str2;
    }

    @Override // defpackage.sn
    public final String t() throws IOException {
        int iI0 = i0();
        int i = this.h;
        int i2 = this.f;
        int i3 = i2 - i;
        byte[] bArrD0 = this.e;
        if (iI0 <= i3 && iI0 > 0) {
            this.h = i + iI0;
        } else {
            if (iI0 == 0) {
                return BuildConfig.FLAVOR;
            }
            if (iI0 < 0) {
                throw ur0.d();
            }
            i = 0;
            if (iI0 <= i2) {
                m0(iI0);
                this.h = iI0;
            } else {
                bArrD0 = d0(iI0);
            }
        }
        return b42.a.k(bArrD0, i, iI0);
    }

    @Override // defpackage.sn
    public final int u() throws ur0 {
        if (c()) {
            this.i = 0;
            return 0;
        }
        int iI0 = i0();
        this.i = iI0;
        if ((iI0 >>> 3) != 0) {
            return iI0;
        }
        throw new ur0("Protocol message contained an invalid tag (zero).");
    }

    @Override // defpackage.sn
    public final int v() {
        return i0();
    }

    @Override // defpackage.sn
    public final long w() {
        return j0();
    }

    @Override // defpackage.sn
    public final boolean x(int i) throws ur0 {
        int i2 = i & 7;
        int i3 = 0;
        if (i2 != 0) {
            if (i2 == 1) {
                n0(8);
                return true;
            }
            if (i2 == 2) {
                n0(i0());
                return true;
            }
            if (i2 == 3) {
                y();
                a(((i >>> 3) << 3) | 4);
                return true;
            }
            if (i2 == 4) {
                return false;
            }
            if (i2 != 5) {
                throw ur0.b();
            }
            n0(4);
            return true;
        }
        int i4 = this.f - this.h;
        byte[] bArr = this.e;
        if (i4 >= 10) {
            while (i3 < 10) {
                int i5 = this.h;
                this.h = i5 + 1;
                if (bArr[i5] < 0) {
                    i3++;
                }
            }
            throw ur0.c();
        }
        while (i3 < 10) {
            if (this.h == this.f) {
                m0(1);
            }
            int i6 = this.h;
            this.h = i6 + 1;
            if (bArr[i6] < 0) {
                i3++;
            }
        }
        throw ur0.c();
        return true;
    }
}
