package defpackage;

import com.hjq.toast.BuildConfig;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class or2 extends sn {
    public final byte[] d;
    public int e;
    public int f;
    public int g;
    public final int h;
    public int i;
    public int j;

    public or2(byte[] bArr, int i, int i2) {
        super(2);
        this.j = Integer.MAX_VALUE;
        this.d = bArr;
        this.e = i2 + i;
        this.g = i;
        this.h = i;
    }

    @Override // defpackage.sn
    public final float G() {
        return Float.intBitsToFloat(e0());
    }

    @Override // defpackage.sn
    public final int H(int i) throws ks2 {
        if (i < 0) {
            throw ks2.e();
        }
        int iJ = J() + i;
        if (iJ < 0) {
            throw new ks2("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i2 = this.j;
        if (iJ > i2) {
            throw ks2.g();
        }
        this.j = iJ;
        h0();
        return i2;
    }

    @Override // defpackage.sn
    public final int J() {
        return this.g - this.h;
    }

    @Override // defpackage.sn
    public final void K(int i) throws ks2 {
        if (this.i != i) {
            throw new ks2("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // defpackage.sn
    public final int L() {
        return j0();
    }

    @Override // defpackage.sn
    public final void M(int i) {
        this.j = i;
        h0();
    }

    @Override // defpackage.sn
    public final int N() {
        return e0();
    }

    @Override // defpackage.sn
    public final int O() {
        return j0();
    }

    @Override // defpackage.sn
    public final int P() {
        return e0();
    }

    @Override // defpackage.sn
    public final int Q() {
        int iK0 = k0();
        return (-(iK0 & 1)) ^ (iK0 >>> 1);
    }

    @Override // defpackage.sn
    public final int R() throws ks2 {
        if (b0()) {
            this.i = 0;
            return 0;
        }
        int iK0 = k0();
        this.i = iK0;
        if ((iK0 >>> 3) != 0) {
            return iK0;
        }
        throw ks2.b();
    }

    @Override // defpackage.sn
    public final int S() {
        return k0();
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

    /* JADX WARN: Code duplicated, block: B:15:0x002f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0031 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0033  */
    /* JADX WARN: Code duplicated, block: B:24:0x0043  */
    /* JADX WARN: Code duplicated, block: B:26:0x0048  */
    @Override // defpackage.sn
    public final nr2 Y() throws ks2 {
        byte[] bArrCopyOfRange;
        int iK0 = k0();
        byte[] bArr = this.d;
        if (iK0 > 0) {
            int i = this.e;
            int i2 = this.g;
            if (iK0 <= i - i2) {
                nr2 nr2VarI = jr2.i(bArr, i2, iK0);
                this.g += iK0;
                return nr2VarI;
            }
        }
        if (iK0 == 0) {
            return jr2.b;
        }
        if (iK0 > 0) {
            int i3 = this.e;
            int i4 = this.g;
            if (iK0 <= i3 - i4) {
                int i5 = iK0 + i4;
                this.g = i5;
                bArrCopyOfRange = Arrays.copyOfRange(bArr, i4, i5);
            } else {
                if (iK0 <= 0) {
                    throw ks2.g();
                }
                if (iK0 == 0) {
                    throw ks2.e();
                }
                bArrCopyOfRange = ds2.a;
            }
        } else {
            if (iK0 <= 0) {
                throw ks2.g();
            }
            if (iK0 == 0) {
                throw ks2.e();
            }
            bArrCopyOfRange = ds2.a;
        }
        nr2 nr2Var = jr2.b;
        return bArrCopyOfRange.length == 0 ? jr2.b : new nr2(bArrCopyOfRange);
    }

    @Override // defpackage.sn
    public final String Z() throws ks2 {
        int iK0 = k0();
        if (iK0 > 0) {
            int i = this.e;
            int i2 = this.g;
            if (iK0 <= i - i2) {
                String str = new String(this.d, i2, iK0, StandardCharsets.UTF_8);
                this.g += iK0;
                return str;
            }
        }
        if (iK0 == 0) {
            return BuildConfig.FLAVOR;
        }
        if (iK0 < 0) {
            throw ks2.e();
        }
        throw ks2.g();
    }

    @Override // defpackage.sn
    public final String a0() throws ks2 {
        int iK0 = k0();
        if (iK0 > 0) {
            int i = this.e;
            int i2 = this.g;
            if (iK0 <= i - i2) {
                String strH = z32.H(this.d, i2, iK0);
                this.g += iK0;
                return strH;
            }
        }
        if (iK0 == 0) {
            return BuildConfig.FLAVOR;
        }
        if (iK0 <= 0) {
            throw ks2.e();
        }
        throw ks2.g();
    }

    @Override // defpackage.sn
    public final boolean b0() {
        return this.g == this.e;
    }

    @Override // defpackage.sn
    public final boolean c0() {
        return g0() != 0;
    }

    public final int d0() {
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
        return (int) i0();
    }

    public final int e0() throws ks2 {
        int i = this.g;
        if (this.e - i < 4) {
            throw ks2.g();
        }
        this.g = i + 4;
        byte[] bArr = this.d;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public final long f0() throws ks2 {
        int i = this.g;
        if (this.e - i < 8) {
            throw ks2.g();
        }
        this.g = i + 8;
        byte[] bArr = this.d;
        return ((((long) bArr[i + 1]) & 255) << 8) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
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
                this.g = i4;
                return j;
            }
        }
        return i0();
    }

    public final void h0() {
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

    public final long i0() throws ks2 {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            int i2 = this.g;
            if (i2 == this.e) {
                throw ks2.g();
            }
            this.g = i2 + 1;
            byte b = this.d[i2];
            j |= ((long) (b & 127)) << i;
            if ((b & 128) == 0) {
                return j;
            }
        }
        throw ks2.d();
    }

    public final int j0() {
        return d0();
    }

    public final int k0() {
        return d0();
    }

    @Override // defpackage.sn
    public final double z() {
        return Double.longBitsToDouble(f0());
    }
}
