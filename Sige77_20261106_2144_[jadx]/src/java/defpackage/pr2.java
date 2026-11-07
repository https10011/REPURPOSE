package defpackage;

import com.hjq.toast.BuildConfig;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class pr2 extends sn {
    public final ByteArrayInputStream d;
    public final byte[] e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;

    public pr2(ByteArrayInputStream byteArrayInputStream) {
        super(2);
        this.k = Integer.MAX_VALUE;
        byte[] bArr = ds2.a;
        this.d = byteArrayInputStream;
        this.e = new byte[4096];
        this.f = 0;
        this.h = 0;
        this.j = 0;
    }

    @Override // defpackage.sn
    public final float G() {
        return Float.intBitsToFloat(o0());
    }

    @Override // defpackage.sn
    public final int H(int i) throws ks2 {
        if (i < 0) {
            throw ks2.e();
        }
        int i2 = this.j + this.h + i;
        if (i2 < 0) {
            throw new ks2("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i3 = this.k;
        if (i2 > i3) {
            throw ks2.g();
        }
        this.k = i2;
        h0();
        return i3;
    }

    @Override // defpackage.sn
    public final int J() {
        return this.j + this.h;
    }

    @Override // defpackage.sn
    public final void K(int i) throws ks2 {
        if (this.i != i) {
            throw new ks2("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // defpackage.sn
    public final int L() {
        return e0();
    }

    @Override // defpackage.sn
    public final void M(int i) {
        this.k = i;
        h0();
    }

    @Override // defpackage.sn
    public final int N() {
        return o0();
    }

    @Override // defpackage.sn
    public final int O() {
        return e0();
    }

    @Override // defpackage.sn
    public final int P() {
        return o0();
    }

    @Override // defpackage.sn
    public final int Q() {
        int iE0 = e0();
        return (-(iE0 & 1)) ^ (iE0 >>> 1);
    }

    @Override // defpackage.sn
    public final int R() throws ks2 {
        if (b0()) {
            this.i = 0;
            return 0;
        }
        int iE0 = e0();
        this.i = iE0;
        if ((iE0 >>> 3) != 0) {
            return iE0;
        }
        throw ks2.b();
    }

    @Override // defpackage.sn
    public final int S() {
        return e0();
    }

    @Override // defpackage.sn
    public final long T() {
        return f0();
    }

    @Override // defpackage.sn
    public final long U() {
        return g0();
    }

    @Override // defpackage.sn
    public final long V() {
        return f0();
    }

    @Override // defpackage.sn
    public final long W() {
        return sn.B(g0());
    }

    @Override // defpackage.sn
    public final long X() {
        return g0();
    }

    @Override // defpackage.sn
    public final nr2 Y() throws IOException {
        int iE0 = e0();
        int i = this.f;
        int i2 = this.h;
        int i3 = i - i2;
        byte[] bArr = this.e;
        if (iE0 <= i3 && iE0 > 0) {
            nr2 nr2VarI = jr2.i(bArr, i2, iE0);
            this.h += iE0;
            return nr2VarI;
        }
        if (iE0 == 0) {
            return jr2.b;
        }
        if (iE0 < 0) {
            throw ks2.e();
        }
        byte[] bArrM0 = m0(iE0);
        if (bArrM0 != null) {
            return jr2.i(bArrM0, 0, bArrM0.length);
        }
        int i4 = this.h;
        int i5 = this.f;
        int length = i5 - i4;
        this.j += i5;
        this.h = 0;
        this.f = 0;
        ArrayList arrayListI0 = i0(iE0 - length);
        byte[] bArr2 = new byte[iE0];
        System.arraycopy(bArr, i4, bArr2, 0, length);
        int size = arrayListI0.size();
        int i6 = 0;
        while (i6 < size) {
            Object obj = arrayListI0.get(i6);
            i6++;
            byte[] bArr3 = (byte[]) obj;
            System.arraycopy(bArr3, 0, bArr2, length, bArr3.length);
            length += bArr3.length;
        }
        try {
            nr2 nr2Var = jr2.b;
            return iE0 == 0 ? jr2.b : new nr2(bArr2);
        } catch (ks2 e) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
        }
    }

    @Override // defpackage.sn
    public final String Z() throws ks2 {
        int iE0 = e0();
        byte[] bArr = this.e;
        if (iE0 > 0) {
            int i = this.f;
            int i2 = this.h;
            if (iE0 <= i - i2) {
                String str = new String(bArr, i2, iE0, StandardCharsets.UTF_8);
                this.h += iE0;
                return str;
            }
        }
        if (iE0 == 0) {
            return BuildConfig.FLAVOR;
        }
        if (iE0 < 0) {
            throw ks2.e();
        }
        if (iE0 > this.f) {
            return new String(d0(iE0), StandardCharsets.UTF_8);
        }
        j0(iE0);
        String str2 = new String(bArr, this.h, iE0, StandardCharsets.UTF_8);
        this.h += iE0;
        return str2;
    }

    @Override // defpackage.sn
    public final String a0() throws IOException {
        int iE0 = e0();
        int i = this.h;
        int i2 = this.f;
        int i3 = i2 - i;
        byte[] bArrD0 = this.e;
        if (iE0 <= i3 && iE0 > 0) {
            this.h = i + iE0;
        } else {
            if (iE0 == 0) {
                return BuildConfig.FLAVOR;
            }
            if (iE0 < 0) {
                throw ks2.e();
            }
            i = 0;
            if (iE0 <= i2) {
                j0(iE0);
                this.h = iE0;
            } else {
                bArrD0 = d0(iE0);
            }
        }
        return z32.H(bArrD0, i, iE0);
    }

    @Override // defpackage.sn
    public final boolean b0() {
        return this.h == this.f && !l0(1);
    }

    @Override // defpackage.sn
    public final boolean c0() {
        return g0() != 0;
    }

    public final byte[] d0(int i) throws IOException {
        byte[] bArrM0 = m0(i);
        if (bArrM0 != null) {
            return bArrM0;
        }
        int i2 = this.h;
        int i3 = this.f;
        int length = i3 - i2;
        this.j += i3;
        this.h = 0;
        this.f = 0;
        ArrayList arrayListI0 = i0(i - length);
        byte[] bArr = new byte[i];
        System.arraycopy(this.e, i2, bArr, 0, length);
        int size = arrayListI0.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayListI0.get(i4);
            i4++;
            byte[] bArr2 = (byte[]) obj;
            System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
            length += bArr2.length;
        }
        return bArr;
    }

    public final int e0() {
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
        return (int) n0();
    }

    public final long f0() throws ks2 {
        int i = this.h;
        if (this.f - i < 8) {
            j0(8);
            i = this.h;
        }
        this.h = i + 8;
        byte[] bArr = this.e;
        return ((((long) bArr[i + 1]) & 255) << 8) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    public final long g0() {
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
                                j2 = 266354560;
                            } else {
                                i8 = i + 6;
                                long j7 = j6 ^ (((long) bArr[i4]) << 35);
                                if (j7 < 0) {
                                    j3 = -34093383808L;
                                } else {
                                    i4 = i + 7;
                                    j6 = j7 ^ (((long) bArr[i8]) << 42);
                                    if (j6 >= 0) {
                                        j2 = 4363953127296L;
                                    } else {
                                        i8 = i + 8;
                                        j7 = j6 ^ (((long) bArr[i4]) << 49);
                                        if (j7 < 0) {
                                            j3 = -558586000294016L;
                                        } else {
                                            i4 = i + 9;
                                            j6 = j7 ^ (((long) bArr[i8]) << 56);
                                            if (j6 >= 0) {
                                                j2 = 71499008037633920L;
                                            } else {
                                                int i10 = i + 10;
                                                long j8 = (((long) bArr[i4]) << 63) ^ j6;
                                                if (j8 >= 0) {
                                                    j = j8 ^ (-9151873028817141888L);
                                                    i4 = i10;
                                                }
                                            }
                                        }
                                    }
                                }
                                j4 = j3 ^ j7;
                            }
                            j = j2 ^ j6;
                        }
                        i4 = i8;
                        j = j4;
                    }
                }
                this.h = i4;
                return j;
            }
        }
        return n0();
    }

    public final void h0() {
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

    public final ArrayList i0(int i) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int iMin = Math.min(i, 4096);
            byte[] bArr = new byte[iMin];
            int i2 = 0;
            while (i2 < iMin) {
                try {
                    int i3 = this.d.read(bArr, i2, iMin - i2);
                    if (i3 == -1) {
                        throw ks2.g();
                    }
                    this.j += i3;
                    i2 += i3;
                } catch (ks2 e) {
                    e.a = true;
                    throw e;
                }
            }
            i -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final void j0(int i) throws ks2 {
        if (l0(i)) {
            return;
        }
        if (i <= (Integer.MAX_VALUE - this.j) - this.h) {
            throw ks2.g();
        }
        throw new ks2("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
    }

    public final void k0(int i) throws ks2 {
        ByteArrayInputStream byteArrayInputStream = this.d;
        int i2 = this.f;
        int i3 = this.h;
        int i4 = i2 - i3;
        if (i <= i4 && i >= 0) {
            this.h = i3 + i;
            return;
        }
        if (i < 0) {
            throw ks2.e();
        }
        int i5 = this.j;
        int i6 = i5 + i3;
        int i7 = i6 + i;
        int i8 = this.k;
        if (i7 > i8) {
            k0((i8 - i5) - i3);
            throw ks2.g();
        }
        this.j = i6;
        this.f = 0;
        this.h = 0;
        while (i4 < i) {
            long j = i - i4;
            try {
                try {
                    long jSkip = byteArrayInputStream.skip(j);
                    if (jSkip >= 0 && jSkip <= j) {
                        if (jSkip == 0) {
                            break;
                        } else {
                            i4 += (int) jSkip;
                        }
                    } else {
                        throw new IllegalStateException(String.valueOf(byteArrayInputStream.getClass()) + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                    }
                } catch (ks2 e) {
                    e.a = true;
                    throw e;
                }
            } catch (Throwable th) {
                this.j += i4;
                h0();
                throw th;
            }
        }
        this.j += i4;
        h0();
        if (i4 >= i) {
            return;
        }
        int i9 = this.f;
        int i10 = i9 - this.h;
        this.h = i9;
        j0(1);
        while (true) {
            int i11 = i - i10;
            int i12 = this.f;
            if (i11 <= i12) {
                this.h = i11;
                return;
            } else {
                i10 += i12;
                this.h = i12;
                j0(1);
            }
        }
    }

    public final boolean l0(int i) throws IOException {
        ByteArrayInputStream byteArrayInputStream = this.d;
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
                int i7 = byteArrayInputStream.read(bArr, i6, Math.min(bArr.length - i6, (Integer.MAX_VALUE - this.j) - i6));
                if (i7 == 0 || i7 < -1 || i7 > bArr.length) {
                    throw new IllegalStateException(String.valueOf(byteArrayInputStream.getClass()) + "#read(byte[]) returned invalid result: " + i7 + "\nThe InputStream implementation is buggy.");
                }
                if (i7 > 0) {
                    this.f += i7;
                    h0();
                    if (this.f >= i || l0(i)) {
                        return true;
                    }
                }
            } catch (ks2 e) {
                e.a = true;
                throw e;
            }
        }
        return false;
    }

    public final byte[] m0(int i) throws IOException {
        if (i == 0) {
            return ds2.a;
        }
        if (i < 0) {
            throw ks2.e();
        }
        int i2 = this.j;
        int i3 = this.h;
        int i4 = i2 + i3 + i;
        if (i4 - Integer.MAX_VALUE > 0) {
            throw new ks2("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i5 = this.k;
        if (i4 > i5) {
            k0((i5 - i2) - i3);
            throw ks2.g();
        }
        int i6 = this.f - i3;
        int i7 = i - i6;
        ByteArrayInputStream byteArrayInputStream = this.d;
        if (i7 >= 4096) {
            try {
                if (i7 > byteArrayInputStream.available()) {
                    return null;
                }
            } catch (ks2 e) {
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
                int i8 = byteArrayInputStream.read(bArr, i6, i - i6);
                if (i8 == -1) {
                    throw ks2.g();
                }
                this.j += i8;
                i6 += i8;
            } catch (ks2 e2) {
                e2.a = true;
                throw e2;
            }
        }
        return bArr;
    }

    public final long n0() throws ks2 {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            if (this.h == this.f) {
                j0(1);
            }
            int i2 = this.h;
            this.h = i2 + 1;
            byte b = this.e[i2];
            j |= ((long) (b & 127)) << i;
            if ((b & 128) == 0) {
                return j;
            }
        }
        throw ks2.d();
    }

    public final int o0() throws ks2 {
        int i = this.h;
        if (this.f - i < 4) {
            j0(4);
            i = this.h;
        }
        this.h = i + 4;
        byte[] bArr = this.e;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    @Override // defpackage.sn
    public final double z() {
        return Double.longBitsToDouble(f0());
    }
}
