package defpackage;

import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class bo1 extends rj {
    public final transient byte[][] e;
    public final transient int[] f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bo1(byte[][] bArr, int[] iArr) {
        super(rj.d.a);
        bArr.getClass();
        this.e = bArr;
        this.f = iArr;
    }

    private final Object writeReplace() {
        return u();
    }

    @Override // defpackage.rj
    public final String a() {
        throw null;
    }

    @Override // defpackage.rj
    public final rj c(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        byte[][] bArr = this.e;
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr = this.f;
            int i3 = iArr[length + i];
            int i4 = iArr[i];
            messageDigest.update(bArr[i], i3, i4 - i2);
            i++;
            i2 = i4;
        }
        byte[] bArrDigest = messageDigest.digest();
        bArrDigest.getClass();
        return new rj(bArrDigest);
    }

    @Override // defpackage.rj
    public final int d() {
        return this.f[this.e.length - 1];
    }

    @Override // defpackage.rj
    public final String e() {
        return u().e();
    }

    @Override // defpackage.rj
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rj) {
            rj rjVar = (rj) obj;
            if (rjVar.d() == d() && l(0, rjVar, d())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.rj
    public final int f(byte[] bArr, int i) {
        bArr.getClass();
        return u().f(bArr, i);
    }

    @Override // defpackage.rj
    public final byte[] h() {
        return t();
    }

    @Override // defpackage.rj
    public final int hashCode() {
        int i = this.b;
        if (i != 0) {
            return i;
        }
        byte[][] bArr = this.e;
        int length = bArr.length;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i2 < length) {
            int[] iArr = this.f;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            byte[] bArr2 = bArr[i2];
            int i7 = (i6 - i4) + i5;
            while (i5 < i7) {
                i3 = (i3 * 31) + bArr2[i5];
                i5++;
            }
            i2++;
            i4 = i6;
        }
        this.b = i3;
        return i3;
    }

    @Override // defpackage.rj
    public final byte i(int i) {
        byte[][] bArr = this.e;
        int length = bArr.length - 1;
        int[] iArr = this.f;
        kv.l(iArr[length], i, 1L);
        int iA = f.a(this, i);
        return bArr[iA][(i - (iA == 0 ? 0 : iArr[iA - 1])) + iArr[bArr.length + iA]];
    }

    @Override // defpackage.rj
    public final int j(byte[] bArr) {
        bArr.getClass();
        return u().j(bArr);
    }

    @Override // defpackage.rj
    public final boolean l(int i, rj rjVar, int i2) {
        rjVar.getClass();
        if (i >= 0 && i <= d() - i2) {
            int i3 = i2 + i;
            int iA = f.a(this, i);
            int i4 = 0;
            while (i < i3) {
                int[] iArr = this.f;
                int i5 = iA == 0 ? 0 : iArr[iA - 1];
                int i6 = iArr[iA] - i5;
                byte[][] bArr = this.e;
                int i7 = iArr[bArr.length + iA];
                int iMin = Math.min(i3, i6 + i5) - i;
                if (rjVar.m(i4, bArr[iA], (i - i5) + i7, iMin)) {
                    i4 += iMin;
                    i += iMin;
                    iA++;
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.rj
    public final boolean m(int i, byte[] bArr, int i2, int i3) {
        bArr.getClass();
        if (i < 0 || i > d() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int i4 = i3 + i;
        int iA = f.a(this, i);
        while (i < i4) {
            int[] iArr = this.f;
            int i5 = iA == 0 ? 0 : iArr[iA - 1];
            int i6 = iArr[iA] - i5;
            byte[][] bArr2 = this.e;
            int i7 = iArr[bArr2.length + iA];
            int iMin = Math.min(i4, i6 + i5) - i;
            if (!kv.k((i - i5) + i7, i2, iMin, bArr2[iA], bArr)) {
                return false;
            }
            i2 += iMin;
            i += iMin;
            iA++;
        }
        return true;
    }

    @Override // defpackage.rj
    public final String n(Charset charset) {
        charset.getClass();
        return u().n(charset);
    }

    @Override // defpackage.rj
    public final rj o(int i, int i2) {
        if (i2 == -1234567890) {
            i2 = d();
        }
        if (i < 0) {
            e.d(ts.g(i, "beginIndex=", " < 0"));
            return null;
        }
        if (i2 > d()) {
            StringBuilder sbU = ck1.u(i2, "endIndex=", " > length(");
            sbU.append(d());
            sbU.append(')');
            throw new IllegalArgumentException(sbU.toString().toString());
        }
        int i3 = i2 - i;
        if (i3 < 0) {
            e.d(ts.i("endIndex=", i2, i, " < beginIndex="));
            return null;
        }
        if (i == 0 && i2 == d()) {
            return this;
        }
        if (i == i2) {
            return rj.d;
        }
        int iA = f.a(this, i);
        int iA2 = f.a(this, i2 - 1);
        byte[][] bArr = this.e;
        byte[][] bArr2 = (byte[][]) ub.g(bArr, iA, iA2 + 1);
        int[] iArr = new int[bArr2.length * 2];
        int[] iArr2 = this.f;
        if (iA <= iA2) {
            int i4 = iA;
            int i5 = 0;
            while (true) {
                iArr[i5] = Math.min(iArr2[i4] - i, i3);
                int i6 = i5 + 1;
                iArr[i5 + bArr2.length] = iArr2[bArr.length + i4];
                if (i4 == iA2) {
                    break;
                }
                i4++;
                i5 = i6;
            }
        }
        int i7 = iA != 0 ? iArr2[iA - 1] : 0;
        int length = bArr2.length;
        iArr[length] = (i - i7) + iArr[length];
        return new bo1(bArr2, iArr);
    }

    @Override // defpackage.rj
    public final rj q() {
        return u().q();
    }

    @Override // defpackage.rj
    public final void s(ji jiVar, int i) {
        int iA = f.a(this, 0);
        int i2 = 0;
        while (i2 < i) {
            int[] iArr = this.f;
            int i3 = iA == 0 ? 0 : iArr[iA - 1];
            int i4 = iArr[iA] - i3;
            byte[][] bArr = this.e;
            int i5 = iArr[bArr.length + iA];
            int iMin = Math.min(i, i4 + i3) - i2;
            int i6 = (i2 - i3) + i5;
            yn1 yn1Var = new yn1(bArr[iA], i6, i6 + iMin, true, false);
            yn1 yn1Var2 = jiVar.a;
            if (yn1Var2 == null) {
                yn1Var.g = yn1Var;
                yn1Var.f = yn1Var;
                jiVar.a = yn1Var;
            } else {
                yn1 yn1Var3 = yn1Var2.g;
                yn1Var3.getClass();
                yn1Var3.b(yn1Var);
            }
            i2 += iMin;
            iA++;
        }
        jiVar.b += (long) i;
    }

    public final byte[] t() {
        byte[] bArr = new byte[d()];
        byte[][] bArr2 = this.e;
        int length = bArr2.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int[] iArr = this.f;
            int i4 = iArr[length + i];
            int i5 = iArr[i];
            int i6 = i5 - i2;
            ub.b(i3, i4, i4 + i6, bArr2[i], bArr);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }

    @Override // defpackage.rj
    public final String toString() {
        return u().toString();
    }

    public final rj u() {
        return new rj(t());
    }
}
