package defpackage;

import com.hjq.toast.BuildConfig;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class ji implements ri, qi, Cloneable, ByteChannel {
    public yn1 a;
    public long b;

    public final short A() throws EOFException {
        short s = readShort();
        return (short) (((s & 255) << 8) | ((65280 & s) >>> 8));
    }

    public final String B(long j, Charset charset) throws EOFException {
        charset.getClass();
        if (j < 0 || j > 2147483647L) {
            e.d(ck1.t("byteCount: ", j));
            return null;
        }
        if (this.b < j) {
            throw new EOFException();
        }
        if (j == 0) {
            return BuildConfig.FLAVOR;
        }
        yn1 yn1Var = this.a;
        yn1Var.getClass();
        int i = yn1Var.b;
        if (((long) i) + j > yn1Var.c) {
            return new String(t(j), charset);
        }
        int i2 = (int) j;
        String str = new String(yn1Var.a, i, i2, charset);
        int i3 = yn1Var.b + i2;
        yn1Var.b = i3;
        this.b -= j;
        if (i3 == yn1Var.c) {
            this.a = yn1Var.a();
            ao1.a(yn1Var);
        }
        return str;
    }

    public final String C() {
        return B(this.b, Charsets.UTF_8);
    }

    public final int D() throws EOFException {
        int i;
        int i2;
        int i3;
        if (this.b == 0) {
            throw new EOFException();
        }
        byte bN = n(0L);
        if ((bN & 128) == 0) {
            i = bN & 127;
            i3 = 0;
            i2 = 1;
        } else if ((bN & 224) == 192) {
            i = bN & 31;
            i2 = 2;
            i3 = 128;
        } else if ((bN & 240) == 224) {
            i = bN & 15;
            i2 = 3;
            i3 = 2048;
        } else {
            if ((bN & 248) != 240) {
                skip(1L);
                return 65533;
            }
            i = bN & 7;
            i2 = 4;
            i3 = 65536;
        }
        long j = i2;
        if (this.b < j) {
            StringBuilder sbU = ck1.u(i2, "size < ", ": ");
            sbU.append(this.b);
            sbU.append(" (to read code point prefixed 0x");
            sbU.append(kv.k0(bN));
            sbU.append(')');
            throw new EOFException(sbU.toString());
        }
        for (int i4 = 1; i4 < i2; i4++) {
            long j2 = i4;
            byte bN2 = n(j2);
            if ((bN2 & 192) != 128) {
                skip(j2);
                return 65533;
            }
            i = (i << 6) | (bN2 & 63);
        }
        skip(j);
        if (i > 1114111) {
            return 65533;
        }
        if ((55296 > i || i >= 57344) && i >= i3) {
            return i;
        }
        return 65533;
    }

    @Override // defpackage.ds1
    public final long F(ji jiVar, long j) {
        jiVar.getClass();
        if (j < 0) {
            e.d(ck1.t("byteCount < 0: ", j));
            return 0L;
        }
        long j2 = this.b;
        if (j2 == 0) {
            return -1L;
        }
        if (j > j2) {
            j = j2;
        }
        jiVar.f(this, j);
        return j;
    }

    @Override // defpackage.ri
    public final String G(long j) throws EOFException {
        if (j < 0) {
            e.d(ck1.t("limit < 0: ", j));
            return null;
        }
        long j2 = j != Long.MAX_VALUE ? j + 1 : Long.MAX_VALUE;
        long jP = p((byte) 10, 0L, j2);
        if (jP != -1) {
            return b.b(this, jP);
        }
        if (j2 < this.b && n(j2 - 1) == 13 && n(j2) == 10) {
            return b.b(this, j2);
        }
        ji jiVar = new ji();
        m(jiVar, 0L, Math.min(32L, this.b));
        throw new EOFException("\\n not found: limit=" + Math.min(this.b, j) + " content=" + jiVar.k(jiVar.b).e() + (char) 8230);
    }

    @Override // defpackage.qi
    public final /* bridge */ /* synthetic */ qi H(byte[] bArr, int i) {
        write(bArr, 0, i);
        return this;
    }

    public final rj I(int i) {
        if (i == 0) {
            return rj.d;
        }
        kv.l(this.b, 0L, i);
        yn1 yn1Var = this.a;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            yn1Var.getClass();
            int i5 = yn1Var.c;
            int i6 = yn1Var.b;
            if (i5 == i6) {
                e.b("s.limit == s.pos");
                return null;
            }
            i3 += i5 - i6;
            i4++;
            yn1Var = yn1Var.f;
        }
        byte[][] bArr = new byte[i4][];
        int[] iArr = new int[i4 * 2];
        yn1 yn1Var2 = this.a;
        int i7 = 0;
        while (i2 < i) {
            yn1Var2.getClass();
            bArr[i7] = yn1Var2.a;
            i2 += yn1Var2.c - yn1Var2.b;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = yn1Var2.b;
            yn1Var2.d = true;
            i7++;
            yn1Var2 = yn1Var2.f;
        }
        return new bo1(bArr, iArr);
    }

    @Override // defpackage.ri
    public final void J(long j) throws EOFException {
        if (this.b < j) {
            throw new EOFException();
        }
    }

    @Override // defpackage.qi
    public final /* bridge */ /* synthetic */ qi K(String str) {
        Y(str);
        return this;
    }

    @Override // defpackage.qi
    public final /* bridge */ /* synthetic */ qi L(long j) {
        T(j);
        return this;
    }

    public final yn1 M(int i) {
        if (i < 1 || i > 8192) {
            e.g("unexpected capacity");
            return null;
        }
        yn1 yn1Var = this.a;
        if (yn1Var == null) {
            yn1 yn1VarB = ao1.b();
            this.a = yn1VarB;
            yn1VarB.g = yn1VarB;
            yn1VarB.f = yn1VarB;
            return yn1VarB;
        }
        yn1 yn1Var2 = yn1Var.g;
        yn1Var2.getClass();
        if (yn1Var2.c + i <= 8192 && yn1Var2.e) {
            return yn1Var2;
        }
        yn1 yn1VarB2 = ao1.b();
        yn1Var2.b(yn1VarB2);
        return yn1VarB2;
    }

    public final void N(rj rjVar) {
        rjVar.getClass();
        rjVar.s(this, rjVar.d());
    }

    @Override // defpackage.ri
    public final long O() throws EOFException {
        int i;
        if (this.b == 0) {
            throw new EOFException();
        }
        int i2 = 0;
        boolean z = false;
        long j = 0;
        do {
            yn1 yn1Var = this.a;
            yn1Var.getClass();
            byte[] bArr = yn1Var.a;
            int i3 = yn1Var.b;
            int i4 = yn1Var.c;
            while (i3 < i4) {
                byte b = bArr[i3];
                if (b >= 48 && b <= 57) {
                    i = b - 48;
                } else if (b >= 97 && b <= 102) {
                    i = b - 87;
                } else {
                    if (b < 65 || b > 70) {
                        if (i2 == 0) {
                            throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(kv.k0(b)));
                        }
                        z = true;
                        break;
                    }
                    i = b - 55;
                }
                if (((-1152921504606846976L) & j) != 0) {
                    ji jiVar = new ji();
                    jiVar.U(j);
                    jiVar.S(b);
                    throw new NumberFormatException("Number too large: ".concat(jiVar.C()));
                }
                j = (j << 4) | ((long) i);
                i3++;
                i2++;
            }
            if (i3 == i4) {
                this.a = yn1Var.a();
                ao1.a(yn1Var);
            } else {
                yn1Var.b = i3;
            }
            if (z) {
                break;
            }
        } while (this.a != null);
        this.b -= (long) i2;
        return j;
    }

    @Override // defpackage.ri
    public final String P(Charset charset) {
        charset.getClass();
        return B(this.b, charset);
    }

    @Override // defpackage.ri
    public final InputStream Q() {
        return new hi(this, 0);
    }

    public final long R(ds1 ds1Var) {
        ds1Var.getClass();
        long j = 0;
        while (true) {
            long jF = ds1Var.F(this, 8192L);
            if (jF == -1) {
                return j;
            }
            j += jF;
        }
    }

    public final void S(int i) {
        yn1 yn1VarM = M(1);
        byte[] bArr = yn1VarM.a;
        int i2 = yn1VarM.c;
        yn1VarM.c = i2 + 1;
        bArr[i2] = (byte) i;
        this.b++;
    }

    public final void T(long j) {
        boolean z;
        if (j == 0) {
            S(48);
            return;
        }
        if (j < 0) {
            j = -j;
            if (j < 0) {
                Y("-9223372036854775808");
                return;
            }
            z = true;
        } else {
            z = false;
        }
        byte[] bArr = b.a;
        int iNumberOfLeadingZeros = ((64 - Long.numberOfLeadingZeros(j)) * 10) >>> 5;
        int i = iNumberOfLeadingZeros + (j > b.b[iNumberOfLeadingZeros] ? 1 : 0);
        if (z) {
            i++;
        }
        yn1 yn1VarM = M(i);
        byte[] bArr2 = yn1VarM.a;
        int i2 = yn1VarM.c + i;
        while (j != 0) {
            i2--;
            bArr2[i2] = b.a[(int) (j % 10)];
            j /= 10;
        }
        if (z) {
            bArr2[i2 - 1] = 45;
        }
        yn1VarM.c += i;
        this.b += (long) i;
    }

    public final void U(long j) {
        if (j == 0) {
            S(48);
            return;
        }
        long j2 = (j >>> 1) | j;
        long j3 = j2 | (j2 >>> 2);
        long j4 = j3 | (j3 >>> 4);
        long j5 = j4 | (j4 >>> 8);
        long j6 = j5 | (j5 >>> 16);
        long j7 = j6 | (j6 >>> 32);
        long j8 = j7 - ((j7 >>> 1) & 6148914691236517205L);
        long j9 = ((j8 >>> 2) & 3689348814741910323L) + (j8 & 3689348814741910323L);
        long j10 = ((j9 >>> 4) + j9) & 1085102592571150095L;
        long j11 = j10 + (j10 >>> 8);
        long j12 = j11 + (j11 >>> 16);
        int i = (int) ((((j12 & 63) + ((j12 >>> 32) & 63)) + 3) / 4);
        yn1 yn1VarM = M(i);
        byte[] bArr = yn1VarM.a;
        int i2 = yn1VarM.c;
        for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
            bArr[i3] = b.a[(int) (15 & j)];
            j >>>= 4;
        }
        yn1VarM.c += i;
        this.b += (long) i;
    }

    public final void V(int i) {
        yn1 yn1VarM = M(4);
        byte[] bArr = yn1VarM.a;
        int i2 = yn1VarM.c;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        bArr[i2 + 1] = (byte) ((i >>> 16) & 255);
        bArr[i2 + 2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 3] = (byte) (i & 255);
        yn1VarM.c = i2 + 4;
        this.b += 4;
    }

    public final void W(int i) {
        yn1 yn1VarM = M(2);
        byte[] bArr = yn1VarM.a;
        int i2 = yn1VarM.c;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 1] = (byte) (i & 255);
        yn1VarM.c = i2 + 2;
        this.b += 2;
    }

    public final void X(int i, int i2, String str) {
        char cCharAt;
        str.getClass();
        if (i < 0) {
            e.d(ck1.r(i, "beginIndex < 0: "));
            return;
        }
        if (i2 < i) {
            e.d(ts.i("endIndex < beginIndex: ", i2, i, " < "));
            return;
        }
        if (i2 > str.length()) {
            StringBuilder sbU = ck1.u(i2, "endIndex > string.length: ", " > ");
            sbU.append(str.length());
            throw new IllegalArgumentException(sbU.toString().toString());
        }
        while (i < i2) {
            char cCharAt2 = str.charAt(i);
            if (cCharAt2 < 128) {
                yn1 yn1VarM = M(1);
                byte[] bArr = yn1VarM.a;
                int i3 = yn1VarM.c - i;
                int iMin = Math.min(i2, 8192 - i3);
                int i4 = i + 1;
                bArr[i + i3] = (byte) cCharAt2;
                while (true) {
                    i = i4;
                    if (i >= iMin || (cCharAt = str.charAt(i)) >= 128) {
                        break;
                    }
                    i4 = i + 1;
                    bArr[i + i3] = (byte) cCharAt;
                }
                int i5 = yn1VarM.c;
                int i6 = (i3 + i) - i5;
                yn1VarM.c = i5 + i6;
                this.b += (long) i6;
            } else {
                if (cCharAt2 < 2048) {
                    yn1 yn1VarM2 = M(2);
                    byte[] bArr2 = yn1VarM2.a;
                    int i7 = yn1VarM2.c;
                    bArr2[i7] = (byte) ((cCharAt2 >> 6) | 192);
                    bArr2[i7 + 1] = (byte) ((cCharAt2 & '?') | 128);
                    yn1VarM2.c = i7 + 2;
                    this.b += 2;
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    yn1 yn1VarM3 = M(3);
                    byte[] bArr3 = yn1VarM3.a;
                    int i8 = yn1VarM3.c;
                    bArr3[i8] = (byte) ((cCharAt2 >> '\f') | 224);
                    bArr3[i8 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
                    bArr3[i8 + 2] = (byte) ((cCharAt2 & '?') | 128);
                    yn1VarM3.c = i8 + 3;
                    this.b += 3;
                } else {
                    int i9 = i + 1;
                    char cCharAt3 = i9 < i2 ? str.charAt(i9) : (char) 0;
                    if (cCharAt2 > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
                        S(63);
                        i = i9;
                    } else {
                        int i10 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        yn1 yn1VarM4 = M(4);
                        byte[] bArr4 = yn1VarM4.a;
                        int i11 = yn1VarM4.c;
                        bArr4[i11] = (byte) ((i10 >> 18) | 240);
                        bArr4[i11 + 1] = (byte) (((i10 >> 12) & 63) | 128);
                        bArr4[i11 + 2] = (byte) (((i10 >> 6) & 63) | 128);
                        bArr4[i11 + 3] = (byte) ((i10 & 63) | 128);
                        yn1VarM4.c = i11 + 4;
                        this.b += 4;
                        i += 2;
                    }
                }
                i++;
            }
        }
    }

    public final void Y(String str) {
        str.getClass();
        X(0, str.length(), str);
    }

    public final void Z(int i) {
        if (i < 128) {
            S(i);
            return;
        }
        if (i < 2048) {
            yn1 yn1VarM = M(2);
            byte[] bArr = yn1VarM.a;
            int i2 = yn1VarM.c;
            bArr[i2] = (byte) ((i >> 6) | 192);
            bArr[i2 + 1] = (byte) ((i & 63) | 128);
            yn1VarM.c = i2 + 2;
            this.b += 2;
            return;
        }
        if (55296 <= i && i < 57344) {
            S(63);
            return;
        }
        if (i < 65536) {
            yn1 yn1VarM2 = M(3);
            byte[] bArr2 = yn1VarM2.a;
            int i3 = yn1VarM2.c;
            bArr2[i3] = (byte) ((i >> 12) | 224);
            bArr2[i3 + 1] = (byte) (((i >> 6) & 63) | 128);
            bArr2[i3 + 2] = (byte) ((i & 63) | 128);
            yn1VarM2.c = i3 + 3;
            this.b += 3;
            return;
        }
        if (i > 1114111) {
            e.g("Unexpected code point: 0x".concat(kv.l0(i)));
            return;
        }
        yn1 yn1VarM3 = M(4);
        byte[] bArr3 = yn1VarM3.a;
        int i4 = yn1VarM3.c;
        bArr3[i4] = (byte) ((i >> 18) | 240);
        bArr3[i4 + 1] = (byte) (((i >> 12) & 63) | 128);
        bArr3[i4 + 2] = (byte) (((i >> 6) & 63) | 128);
        bArr3[i4 + 3] = (byte) ((i & 63) | 128);
        yn1VarM3.c = i4 + 4;
        this.b += 4;
    }

    @Override // defpackage.ds1
    public final vx1 d() {
        return vx1.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ji)) {
            return false;
        }
        long j = this.b;
        ji jiVar = (ji) obj;
        if (j != jiVar.b) {
            return false;
        }
        if (j == 0) {
            return true;
        }
        yn1 yn1Var = this.a;
        yn1Var.getClass();
        yn1 yn1Var2 = jiVar.a;
        yn1Var2.getClass();
        int i = yn1Var.b;
        int i2 = yn1Var2.b;
        long j2 = 0;
        while (j2 < this.b) {
            long jMin = Math.min(yn1Var.c - i, yn1Var2.c - i2);
            long j3 = 0;
            while (j3 < jMin) {
                int i3 = i + 1;
                int i4 = i2 + 1;
                if (yn1Var.a[i] != yn1Var2.a[i2]) {
                    return false;
                }
                j3++;
                i = i3;
                i2 = i4;
            }
            if (i == yn1Var.c) {
                yn1Var = yn1Var.f;
                yn1Var.getClass();
                i = yn1Var.b;
            }
            if (i2 == yn1Var2.c) {
                yn1Var2 = yn1Var2.f;
                yn1Var2.getClass();
                i2 = yn1Var2.b;
            }
            j2 += jMin;
        }
        return true;
    }

    @Override // defpackage.kr1
    public final void f(ji jiVar, long j) {
        yn1 yn1VarB;
        jiVar.getClass();
        if (jiVar == this) {
            e.g("source == this");
            return;
        }
        kv.l(jiVar.b, 0L, j);
        while (j > 0) {
            yn1 yn1Var = jiVar.a;
            yn1Var.getClass();
            int i = yn1Var.c;
            yn1 yn1Var2 = jiVar.a;
            yn1Var2.getClass();
            long j2 = i - yn1Var2.b;
            int i2 = 0;
            if (j < j2) {
                yn1 yn1Var3 = this.a;
                yn1 yn1Var4 = yn1Var3 != null ? yn1Var3.g : null;
                if (yn1Var4 != null && yn1Var4.e) {
                    if ((((long) yn1Var4.c) + j) - ((long) (yn1Var4.d ? 0 : yn1Var4.b)) <= 8192) {
                        yn1 yn1Var5 = jiVar.a;
                        yn1Var5.getClass();
                        yn1Var5.d(yn1Var4, (int) j);
                        jiVar.b -= j;
                        this.b += j;
                        return;
                    }
                }
                yn1 yn1Var6 = jiVar.a;
                yn1Var6.getClass();
                int i3 = (int) j;
                if (i3 <= 0 || i3 > yn1Var6.c - yn1Var6.b) {
                    e.g("byteCount out of range");
                    return;
                }
                if (i3 >= 1024) {
                    yn1VarB = yn1Var6.c();
                } else {
                    yn1VarB = ao1.b();
                    byte[] bArr = yn1Var6.a;
                    byte[] bArr2 = yn1VarB.a;
                    int i4 = yn1Var6.b;
                    ub.b(0, i4, i4 + i3, bArr, bArr2);
                }
                yn1VarB.c = yn1VarB.b + i3;
                yn1Var6.b += i3;
                yn1 yn1Var7 = yn1Var6.g;
                yn1Var7.getClass();
                yn1Var7.b(yn1VarB);
                jiVar.a = yn1VarB;
            }
            yn1 yn1Var8 = jiVar.a;
            yn1Var8.getClass();
            long j3 = yn1Var8.c - yn1Var8.b;
            jiVar.a = yn1Var8.a();
            yn1 yn1Var9 = this.a;
            if (yn1Var9 == null) {
                this.a = yn1Var8;
                yn1Var8.g = yn1Var8;
                yn1Var8.f = yn1Var8;
            } else {
                yn1 yn1Var10 = yn1Var9.g;
                yn1Var10.getClass();
                yn1Var10.b(yn1Var8);
                yn1 yn1Var11 = yn1Var8.g;
                if (yn1Var11 == yn1Var8) {
                    uq1.q("cannot compact");
                    return;
                }
                yn1Var11.getClass();
                if (yn1Var11.e) {
                    int i5 = yn1Var8.c - yn1Var8.b;
                    yn1 yn1Var12 = yn1Var8.g;
                    yn1Var12.getClass();
                    int i6 = 8192 - yn1Var12.c;
                    yn1 yn1Var13 = yn1Var8.g;
                    yn1Var13.getClass();
                    if (!yn1Var13.d) {
                        yn1 yn1Var14 = yn1Var8.g;
                        yn1Var14.getClass();
                        i2 = yn1Var14.b;
                    }
                    if (i5 <= i6 + i2) {
                        yn1 yn1Var15 = yn1Var8.g;
                        yn1Var15.getClass();
                        yn1Var8.d(yn1Var15, i5);
                        yn1Var8.a();
                        ao1.a(yn1Var8);
                    }
                }
            }
            jiVar.b -= j3;
            this.b += j3;
            j -= j3;
        }
    }

    @Override // defpackage.qi
    public final /* bridge */ /* synthetic */ qi g(rj rjVar) {
        N(rjVar);
        return this;
    }

    @Override // defpackage.qi
    public final /* bridge */ /* synthetic */ qi h(long j) {
        U(j);
        return this;
    }

    public final int hashCode() {
        yn1 yn1Var = this.a;
        if (yn1Var == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = yn1Var.c;
            for (int i3 = yn1Var.b; i3 < i2; i3++) {
                i = (i * 31) + yn1Var.a[i3];
            }
            yn1Var = yn1Var.f;
            yn1Var.getClass();
        } while (yn1Var != this.a);
        return i;
    }

    public final void i() throws EOFException {
        skip(this.b);
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public final ji clone() {
        ji jiVar = new ji();
        if (this.b == 0) {
            return jiVar;
        }
        yn1 yn1Var = this.a;
        yn1Var.getClass();
        yn1 yn1VarC = yn1Var.c();
        jiVar.a = yn1VarC;
        yn1VarC.g = yn1VarC;
        yn1VarC.f = yn1VarC;
        for (yn1 yn1Var2 = yn1Var.f; yn1Var2 != yn1Var; yn1Var2 = yn1Var2.f) {
            yn1 yn1Var3 = yn1VarC.g;
            yn1Var3.getClass();
            yn1Var2.getClass();
            yn1Var3.b(yn1Var2.c());
        }
        jiVar.b = this.b;
        return jiVar;
    }

    @Override // defpackage.ri
    public final rj k(long j) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            e.d(ck1.t("byteCount: ", j));
            return null;
        }
        if (this.b < j) {
            throw new EOFException();
        }
        if (j < 4096) {
            return new rj(t(j));
        }
        rj rjVarI = I((int) j);
        skip(j);
        return rjVarI;
    }

    public final long l() {
        long j = this.b;
        if (j == 0) {
            return 0L;
        }
        yn1 yn1Var = this.a;
        yn1Var.getClass();
        yn1 yn1Var2 = yn1Var.g;
        yn1Var2.getClass();
        int i = yn1Var2.c;
        return (i >= 8192 || !yn1Var2.e) ? j : j - ((long) (i - yn1Var2.b));
    }

    public final void m(ji jiVar, long j, long j2) {
        jiVar.getClass();
        long j3 = j;
        kv.l(this.b, j3, j2);
        if (j2 == 0) {
            return;
        }
        jiVar.b += j2;
        yn1 yn1Var = this.a;
        while (true) {
            yn1Var.getClass();
            long j4 = yn1Var.c - yn1Var.b;
            if (j3 < j4) {
                break;
            }
            j3 -= j4;
            yn1Var = yn1Var.f;
        }
        long j5 = j2;
        while (j5 > 0) {
            yn1Var.getClass();
            yn1 yn1VarC = yn1Var.c();
            int i = yn1VarC.b + ((int) j3);
            yn1VarC.b = i;
            yn1VarC.c = Math.min(i + ((int) j5), yn1VarC.c);
            yn1 yn1Var2 = jiVar.a;
            if (yn1Var2 == null) {
                yn1VarC.g = yn1VarC;
                yn1VarC.f = yn1VarC;
                jiVar.a = yn1VarC;
            } else {
                yn1 yn1Var3 = yn1Var2.g;
                yn1Var3.getClass();
                yn1Var3.b(yn1VarC);
            }
            j5 -= (long) (yn1VarC.c - yn1VarC.b);
            yn1Var = yn1Var.f;
            j3 = 0;
        }
    }

    public final byte n(long j) {
        kv.l(this.b, j, 1L);
        yn1 yn1Var = this.a;
        yn1Var.getClass();
        long j2 = this.b;
        if (j2 - j < j) {
            while (j2 > j) {
                yn1Var = yn1Var.g;
                yn1Var.getClass();
                j2 -= (long) (yn1Var.c - yn1Var.b);
            }
            return yn1Var.a[(int) ((((long) yn1Var.b) + j) - j2)];
        }
        long j3 = 0;
        while (true) {
            int i = yn1Var.c;
            int i2 = yn1Var.b;
            long j4 = ((long) (i - i2)) + j3;
            if (j4 > j) {
                return yn1Var.a[(int) ((((long) i2) + j) - j3)];
            }
            yn1Var = yn1Var.f;
            yn1Var.getClass();
            j3 = j4;
        }
    }

    @Override // defpackage.ri
    public final boolean o(long j) {
        return this.b >= j;
    }

    public final long p(byte b, long j, long j2) {
        yn1 yn1Var;
        long j3 = 0;
        if (0 > j || j > j2) {
            throw new IllegalArgumentException(("size=" + this.b + " fromIndex=" + j + " toIndex=" + j2).toString());
        }
        long j4 = this.b;
        if (j2 > j4) {
            j2 = j4;
        }
        if (j == j2 || (yn1Var = this.a) == null) {
            return -1L;
        }
        if (j4 - j < j) {
            while (j4 > j) {
                yn1Var = yn1Var.g;
                yn1Var.getClass();
                j4 -= (long) (yn1Var.c - yn1Var.b);
            }
            while (j4 < j2) {
                byte[] bArr = yn1Var.a;
                int iMin = (int) Math.min(yn1Var.c, (((long) yn1Var.b) + j2) - j4);
                for (int i = (int) ((((long) yn1Var.b) + j) - j4); i < iMin; i++) {
                    if (bArr[i] == b) {
                        return ((long) (i - yn1Var.b)) + j4;
                    }
                }
                j4 += (long) (yn1Var.c - yn1Var.b);
                yn1Var = yn1Var.f;
                yn1Var.getClass();
                j = j4;
            }
            return -1L;
        }
        while (true) {
            long j5 = ((long) (yn1Var.c - yn1Var.b)) + j3;
            if (j5 > j) {
                break;
            }
            yn1Var = yn1Var.f;
            yn1Var.getClass();
            j3 = j5;
        }
        while (j3 < j2) {
            byte[] bArr2 = yn1Var.a;
            int iMin2 = (int) Math.min(yn1Var.c, (((long) yn1Var.b) + j2) - j3);
            for (int i2 = (int) ((((long) yn1Var.b) + j) - j3); i2 < iMin2; i2++) {
                if (bArr2[i2] == b) {
                    return ((long) (i2 - yn1Var.b)) + j3;
                }
            }
            j3 += (long) (yn1Var.c - yn1Var.b);
            yn1Var = yn1Var.f;
            yn1Var.getClass();
            j = j3;
        }
        return -1L;
    }

    public final long q(rj rjVar) {
        int i;
        int i2;
        rjVar.getClass();
        rjVar.getClass();
        yn1 yn1Var = this.a;
        if (yn1Var == null) {
            return -1L;
        }
        long j = this.b;
        long j2 = 0;
        if (j < 0) {
            while (j > 0) {
                yn1Var = yn1Var.g;
                yn1Var.getClass();
                j -= (long) (yn1Var.c - yn1Var.b);
            }
            if (rjVar.d() == 2) {
                byte bI = rjVar.i(0);
                byte bI2 = rjVar.i(1);
                while (j < this.b) {
                    byte[] bArr = yn1Var.a;
                    i = (int) ((((long) yn1Var.b) + j2) - j);
                    int i3 = yn1Var.c;
                    while (true) {
                        if (i >= i3) {
                            j2 = ((long) (yn1Var.c - yn1Var.b)) + j;
                            yn1Var = yn1Var.f;
                            yn1Var.getClass();
                            j = j2;
                        } else {
                            byte b = bArr[i];
                            if (b == bI || b == bI2) {
                                i2 = yn1Var.b;
                            } else {
                                i++;
                            }
                        }
                    }
                }
                return -1L;
            }
            byte[] bArrH = rjVar.h();
            while (j < this.b) {
                byte[] bArr2 = yn1Var.a;
                i = (int) ((((long) yn1Var.b) + j2) - j);
                int i4 = yn1Var.c;
                while (true) {
                    if (i < i4) {
                        byte b2 = bArr2[i];
                        int length = bArrH.length;
                        int i5 = 0;
                        while (true) {
                            if (i5 >= length) {
                                i++;
                            } else if (b2 == bArrH[i5]) {
                                i2 = yn1Var.b;
                            } else {
                                i5++;
                            }
                        }
                    } else {
                        j2 = ((long) (yn1Var.c - yn1Var.b)) + j;
                        yn1Var = yn1Var.f;
                        yn1Var.getClass();
                        j = j2;
                    }
                }
            }
            return -1L;
        }
        j = 0;
        while (true) {
            long j3 = ((long) (yn1Var.c - yn1Var.b)) + j;
            if (j3 > 0) {
                break;
            }
            yn1Var = yn1Var.f;
            yn1Var.getClass();
            j = j3;
        }
        if (rjVar.d() == 2) {
            byte bI3 = rjVar.i(0);
            byte bI4 = rjVar.i(1);
            while (j < this.b) {
                byte[] bArr3 = yn1Var.a;
                i = (int) ((((long) yn1Var.b) + j2) - j);
                int i6 = yn1Var.c;
                while (true) {
                    if (i >= i6) {
                        j2 = ((long) (yn1Var.c - yn1Var.b)) + j;
                        yn1Var = yn1Var.f;
                        yn1Var.getClass();
                        j = j2;
                    } else {
                        byte b3 = bArr3[i];
                        if (b3 == bI3 || b3 == bI4) {
                            i2 = yn1Var.b;
                        } else {
                            i++;
                        }
                    }
                }
            }
            return -1L;
        }
        byte[] bArrH2 = rjVar.h();
        while (j < this.b) {
            byte[] bArr4 = yn1Var.a;
            i = (int) ((((long) yn1Var.b) + j2) - j);
            int i7 = yn1Var.c;
            while (true) {
                if (i < i7) {
                    byte b4 = bArr4[i];
                    int length2 = bArrH2.length;
                    int i8 = 0;
                    while (true) {
                        if (i8 >= length2) {
                            i++;
                        } else if (b4 == bArrH2[i8]) {
                            i2 = yn1Var.b;
                        } else {
                            i8++;
                        }
                    }
                } else {
                    j2 = ((long) (yn1Var.c - yn1Var.b)) + j;
                    yn1Var = yn1Var.f;
                    yn1Var.getClass();
                    j = j2;
                }
            }
        }
        return -1L;
        return ((long) (i - i2)) + j;
    }

    @Override // defpackage.ri
    public final long r(ji jiVar) {
        long j = this.b;
        if (j > 0) {
            jiVar.f(this, j);
        }
        return j;
    }

    public final int read(byte[] bArr, int i, int i2) {
        bArr.getClass();
        kv.l(bArr.length, i, i2);
        yn1 yn1Var = this.a;
        if (yn1Var == null) {
            return -1;
        }
        int iMin = Math.min(i2, yn1Var.c - yn1Var.b);
        byte[] bArr2 = yn1Var.a;
        int i3 = yn1Var.b;
        ub.b(i, i3, i3 + iMin, bArr2, bArr);
        int i4 = yn1Var.b + iMin;
        yn1Var.b = i4;
        this.b -= (long) iMin;
        if (i4 == yn1Var.c) {
            this.a = yn1Var.a();
            ao1.a(yn1Var);
        }
        return iMin;
    }

    @Override // defpackage.ri
    public final byte readByte() throws EOFException {
        if (this.b == 0) {
            throw new EOFException();
        }
        yn1 yn1Var = this.a;
        yn1Var.getClass();
        int i = yn1Var.b;
        int i2 = yn1Var.c;
        int i3 = i + 1;
        byte b = yn1Var.a[i];
        this.b--;
        if (i3 != i2) {
            yn1Var.b = i3;
            return b;
        }
        this.a = yn1Var.a();
        ao1.a(yn1Var);
        return b;
    }

    @Override // defpackage.ri
    public final int readInt() throws EOFException {
        if (this.b < 4) {
            throw new EOFException();
        }
        yn1 yn1Var = this.a;
        yn1Var.getClass();
        int i = yn1Var.b;
        int i2 = yn1Var.c;
        if (i2 - i < 4) {
            return (readByte() & 255) | ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8);
        }
        byte[] bArr = yn1Var.a;
        int i3 = i + 3;
        int i4 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24) | ((bArr[i + 2] & 255) << 8);
        int i5 = i + 4;
        int i6 = (bArr[i3] & 255) | i4;
        this.b -= 4;
        if (i5 != i2) {
            yn1Var.b = i5;
            return i6;
        }
        this.a = yn1Var.a();
        ao1.a(yn1Var);
        return i6;
    }

    @Override // defpackage.ri
    public final short readShort() throws EOFException {
        if (this.b < 2) {
            throw new EOFException();
        }
        yn1 yn1Var = this.a;
        yn1Var.getClass();
        int i = yn1Var.b;
        int i2 = yn1Var.c;
        if (i2 - i < 2) {
            return (short) ((readByte() & 255) | ((readByte() & 255) << 8));
        }
        byte[] bArr = yn1Var.a;
        int i3 = i + 1;
        int i4 = (bArr[i] & 255) << 8;
        int i5 = i + 2;
        int i6 = (bArr[i3] & 255) | i4;
        this.b -= 2;
        if (i5 == i2) {
            this.a = yn1Var.a();
            ao1.a(yn1Var);
        } else {
            yn1Var.b = i5;
        }
        return (short) i6;
    }

    @Override // defpackage.ri
    public final void skip(long j) throws EOFException {
        while (j > 0) {
            yn1 yn1Var = this.a;
            if (yn1Var == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j, yn1Var.c - yn1Var.b);
            long j2 = iMin;
            this.b -= j2;
            j -= j2;
            int i = yn1Var.b + iMin;
            yn1Var.b = i;
            if (i == yn1Var.c) {
                this.a = yn1Var.a();
                ao1.a(yn1Var);
            }
        }
    }

    public final byte[] t(long j) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            e.d(ck1.t("byteCount: ", j));
            return null;
        }
        if (this.b < j) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) j];
        int i = 0;
        while (i < bArr.length) {
            int i2 = read(bArr, i, bArr.length - i);
            if (i2 == -1) {
                throw new EOFException();
            }
            i += i2;
        }
        return bArr;
    }

    public final String toString() {
        long j = this.b;
        if (j <= 2147483647L) {
            return I((int) j).toString();
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.b).toString());
    }

    @Override // defpackage.ri
    public final String u() {
        return G(Long.MAX_VALUE);
    }

    @Override // defpackage.ri
    public final boolean v() {
        return this.b == 0;
    }

    public final void write(byte[] bArr, int i, int i2) {
        bArr.getClass();
        long j = i2;
        kv.l(bArr.length, i, j);
        int i3 = i2 + i;
        while (i < i3) {
            yn1 yn1VarM = M(1);
            int iMin = Math.min(i3 - i, 8192 - yn1VarM.c);
            int i4 = i + iMin;
            ub.b(yn1VarM.c, i, i4, bArr, yn1VarM.a);
            yn1VarM.c += iMin;
            i = i4;
        }
        this.b += j;
    }

    @Override // defpackage.qi
    public final /* bridge */ /* synthetic */ qi writeByte(int i) {
        S(i);
        return this;
    }

    @Override // defpackage.qi
    public final /* bridge */ /* synthetic */ qi writeInt(int i) {
        V(i);
        return this;
    }

    @Override // defpackage.qi
    public final /* bridge */ /* synthetic */ qi writeShort(int i) {
        W(i);
        return this;
    }

    public final long x() throws EOFException {
        long j;
        byte b;
        long j2 = 0;
        if (this.b == 0) {
            throw new EOFException();
        }
        int i = 0;
        boolean z = false;
        long j3 = 0;
        long j4 = -7;
        boolean z2 = false;
        loop0: while (true) {
            yn1 yn1Var = this.a;
            yn1Var.getClass();
            byte[] bArr = yn1Var.a;
            int i2 = yn1Var.b;
            int i3 = yn1Var.c;
            while (true) {
                if (i2 >= i3) {
                    j = j2;
                    break;
                }
                b = bArr[i2];
                if (b >= 48 && b <= 57) {
                    int i4 = 48 - b;
                    if (j3 < -922337203685477580L) {
                        break loop0;
                    }
                    j = j2;
                    if (j3 == -922337203685477580L && i4 < j4) {
                        break loop0;
                    }
                    j3 = (j3 * 10) + ((long) i4);
                } else {
                    j = j2;
                    if (b != 45 || i != 0) {
                        z2 = true;
                        break;
                    }
                    j4--;
                    z = true;
                }
                i2++;
                i++;
                j2 = j;
            }
            if (i2 == i3) {
                this.a = yn1Var.a();
                ao1.a(yn1Var);
            } else {
                yn1Var.b = i2;
            }
            if (z2 || this.a == null) {
                long j5 = this.b - ((long) i);
                this.b = j5;
                if (i >= (z ? 2 : 1)) {
                    return z ? j3 : -j3;
                }
                if (j5 == j) {
                    throw new EOFException();
                }
                throw new NumberFormatException((z ? "Expected a digit" : "Expected a digit or '-'") + " but was 0x" + kv.k0(n(j)));
            }
            j2 = j;
        }
        ji jiVar = new ji();
        jiVar.T(j3);
        jiVar.S(b);
        if (!z) {
            jiVar.readByte();
        }
        throw new NumberFormatException("Number too large: ".concat(jiVar.C()));
    }

    @Override // defpackage.ri
    public final int z(ca1 ca1Var) throws EOFException {
        ca1Var.getClass();
        int iC = b.c(this, ca1Var, false);
        if (iC == -1) {
            return -1;
        }
        skip(ca1Var.b[iC].d());
        return iC;
    }

    @Override // defpackage.ri, defpackage.qi
    public final ji c() {
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, defpackage.kr1
    public final void close() {
    }

    @Override // defpackage.qi, defpackage.kr1, java.io.Flushable
    public final void flush() {
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        int iRemaining = byteBuffer.remaining();
        int i = iRemaining;
        while (i > 0) {
            yn1 yn1VarM = M(1);
            int iMin = Math.min(i, 8192 - yn1VarM.c);
            byteBuffer.get(yn1VarM.a, yn1VarM.c, iMin);
            i -= iMin;
            yn1VarM.c += iMin;
        }
        this.b += (long) iRemaining;
        return iRemaining;
    }

    @Override // defpackage.qi
    public final qi write(byte[] bArr) {
        bArr.getClass();
        write(bArr, 0, bArr.length);
        return this;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        yn1 yn1Var = this.a;
        if (yn1Var == null) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), yn1Var.c - yn1Var.b);
        byteBuffer.put(yn1Var.a, yn1Var.b, iMin);
        int i = yn1Var.b + iMin;
        yn1Var.b = i;
        this.b -= (long) iMin;
        if (i == yn1Var.c) {
            this.a = yn1Var.a();
            ao1.a(yn1Var);
        }
        return iMin;
    }
}
