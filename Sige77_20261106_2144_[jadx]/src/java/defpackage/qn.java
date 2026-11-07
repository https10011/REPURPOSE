package defpackage;

import com.hjq.toast.BuildConfig;
import java.util.Arrays;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class qn extends sn {
    public final byte[] d;
    public int e;
    public int f;
    public int g;
    public final int h;
    public int i;
    public int j;

    public qn(byte[] bArr, int i, int i2, boolean z) {
        super(0);
        this.j = Integer.MAX_VALUE;
        this.d = bArr;
        this.e = i2 + i;
        this.g = i;
        this.h = i;
    }

    @Override // defpackage.sn
    public final void a(int i) throws ur0 {
        if (this.i != i) {
            throw new ur0("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // defpackage.sn
    public final int b() {
        return this.g - this.h;
    }

    @Override // defpackage.sn
    public final boolean c() {
        return this.g == this.e;
    }

    @Override // defpackage.sn
    public final void d(int i) {
        this.j = i;
        i0();
    }

    public final int d0() throws ur0 {
        int i = this.g;
        if (this.e - i < 4) {
            throw ur0.e();
        }
        this.g = i + 4;
        byte[] bArr = this.d;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    @Override // defpackage.sn
    public final int e(int i) {
        if (i < 0) {
            throw ur0.d();
        }
        int iB = b() + i;
        if (iB < 0) {
            throw new ur0("Failed to parse the message.");
        }
        int i2 = this.j;
        if (iB > i2) {
            throw ur0.e();
        }
        this.j = iB;
        i0();
        return i2;
    }

    public final long e0() throws ur0 {
        int i = this.g;
        if (this.e - i < 8) {
            throw ur0.e();
        }
        this.g = i + 8;
        byte[] bArr = this.d;
        return ((((long) bArr[i + 1]) & 255) << 8) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    @Override // defpackage.sn
    public final boolean f() {
        return g0() != 0;
    }

    public final int f0() {
        int i;
        int i2 = this.g;
        int i3 = this.e;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.d;
            byte b = bArr[i2];
            if (b >= 0) {
                this.g = i4;
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
                this.g = i5;
                return i;
            }
        }
        return (int) h0();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0031 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0033  */
    /* JADX WARN: Code duplicated, block: B:20:0x003d  */
    /* JADX WARN: Code duplicated, block: B:22:0x0042  */
    @Override // defpackage.sn
    public final qj g() throws ur0 {
        byte[] bArrCopyOfRange;
        int iF0 = f0();
        byte[] bArr = this.d;
        if (iF0 > 0) {
            int i = this.e;
            int i2 = this.g;
            if (iF0 <= i - i2) {
                qj qjVarC = qj.c(bArr, i2, iF0);
                this.g += iF0;
                return qjVarC;
            }
        }
        if (iF0 == 0) {
            return qj.c;
        }
        if (iF0 > 0) {
            int i3 = this.e;
            int i4 = this.g;
            if (iF0 <= i3 - i4) {
                int i5 = iF0 + i4;
                this.g = i5;
                bArrCopyOfRange = Arrays.copyOfRange(bArr, i4, i5);
            } else {
                if (iF0 <= 0) {
                    throw ur0.e();
                }
                if (iF0 == 0) {
                    throw ur0.d();
                }
                bArrCopyOfRange = dr0.b;
            }
        } else {
            if (iF0 <= 0) {
                throw ur0.e();
            }
            if (iF0 == 0) {
                throw ur0.d();
            }
            bArrCopyOfRange = dr0.b;
        }
        qj qjVar = qj.c;
        return new qj(bArrCopyOfRange);
    }

    public final long g0() {
        long j;
        long j2;
        long j3;
        long j4;
        int i = this.g;
        int i2 = this.e;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.d;
            byte b = bArr[i];
            if (b >= 0) {
                this.g = i3;
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
                this.g = i4;
                return j;
            }
        }
        return h0();
    }

    @Override // defpackage.sn
    public final double h() {
        return Double.longBitsToDouble(e0());
    }

    public final long h0() throws ur0 {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            int i2 = this.g;
            if (i2 == this.e) {
                throw ur0.e();
            }
            this.g = i2 + 1;
            byte b = this.d[i2];
            j |= ((long) (b & 127)) << i;
            if ((b & 128) == 0) {
                return j;
            }
        }
        throw ur0.c();
    }

    @Override // defpackage.sn
    public final int i() {
        return f0();
    }

    public final void i0() {
        int i = this.e + this.f;
        this.e = i;
        int i2 = i - this.h;
        int i3 = this.j;
        if (i2 <= i3) {
            this.f = 0;
            return;
        }
        int i4 = i2 - i3;
        this.f = i4;
        this.e = i - i4;
    }

    @Override // defpackage.sn
    public final int j() {
        return d0();
    }

    public final void j0(int i) throws ur0 {
        if (i >= 0) {
            int i2 = this.e;
            int i3 = this.g;
            if (i <= i2 - i3) {
                this.g = i3 + i;
                return;
            }
        }
        if (i >= 0) {
            throw ur0.e();
        }
        throw ur0.d();
    }

    @Override // defpackage.sn
    public final long k() {
        return e0();
    }

    @Override // defpackage.sn
    public final float l() {
        return Float.intBitsToFloat(d0());
    }

    @Override // defpackage.sn
    public final int m() {
        return f0();
    }

    @Override // defpackage.sn
    public final long n() {
        return g0();
    }

    @Override // defpackage.sn
    public final int o() {
        return d0();
    }

    @Override // defpackage.sn
    public final long p() {
        return e0();
    }

    @Override // defpackage.sn
    public final int q() {
        int iF0 = f0();
        return (-(iF0 & 1)) ^ (iF0 >>> 1);
    }

    @Override // defpackage.sn
    public final long r() {
        long jG0 = g0();
        return (-(jG0 & 1)) ^ (jG0 >>> 1);
    }

    @Override // defpackage.sn
    public final String s() throws ur0 {
        int iF0 = f0();
        if (iF0 > 0) {
            int i = this.e;
            int i2 = this.g;
            if (iF0 <= i - i2) {
                String str = new String(this.d, i2, iF0, dr0.a);
                this.g += iF0;
                return str;
            }
        }
        if (iF0 == 0) {
            return BuildConfig.FLAVOR;
        }
        if (iF0 < 0) {
            throw ur0.d();
        }
        throw ur0.e();
    }

    @Override // defpackage.sn
    public final String t() throws ur0 {
        int iF0 = f0();
        if (iF0 > 0) {
            int i = this.e;
            int i2 = this.g;
            if (iF0 <= i - i2) {
                String strK = b42.a.k(this.d, i2, iF0);
                this.g += iF0;
                return strK;
            }
        }
        if (iF0 == 0) {
            return BuildConfig.FLAVOR;
        }
        if (iF0 <= 0) {
            throw ur0.d();
        }
        throw ur0.e();
    }

    @Override // defpackage.sn
    public final int u() throws ur0 {
        if (c()) {
            this.i = 0;
            return 0;
        }
        int iF0 = f0();
        this.i = iF0;
        if ((iF0 >>> 3) != 0) {
            return iF0;
        }
        throw new ur0("Protocol message contained an invalid tag (zero).");
    }

    @Override // defpackage.sn
    public final int v() {
        return f0();
    }

    @Override // defpackage.sn
    public final long w() {
        return g0();
    }

    @Override // defpackage.sn
    public final boolean x(int i) throws ur0 {
        int i2 = i & 7;
        int i3 = 0;
        if (i2 != 0) {
            if (i2 == 1) {
                j0(8);
                return true;
            }
            if (i2 == 2) {
                j0(f0());
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
            j0(4);
            return true;
        }
        int i4 = this.e - this.g;
        byte[] bArr = this.d;
        if (i4 >= 10) {
            while (i3 < 10) {
                int i5 = this.g;
                this.g = i5 + 1;
                if (bArr[i5] < 0) {
                    i3++;
                }
            }
            throw ur0.c();
        }
        while (i3 < 10) {
            int i6 = this.g;
            if (i6 == this.e) {
                throw ur0.e();
            }
            this.g = i6 + 1;
            if (bArr[i6] < 0) {
                i3++;
            }
        }
        throw ur0.c();
        return true;
    }
}
