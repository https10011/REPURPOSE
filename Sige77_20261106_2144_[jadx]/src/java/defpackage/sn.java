package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class sn {
    public final /* synthetic */ int a;
    public int b;
    public Object c;

    public sn(jr3 jr3Var, int i) {
        this.a = 1;
        if (jr3Var == null) {
            e.g("format options cannot be null");
            throw null;
        }
        if (i < 0) {
            e.g(ck1.s(i, "invalid index: ", new StringBuilder(String.valueOf(i).length() + 15)));
            throw null;
        }
        this.b = i;
        this.c = jr3Var;
    }

    public static long B(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    public static or2 D(byte[] bArr, int i, int i2) {
        or2 or2Var = new or2(bArr, i, i2);
        try {
            or2Var.H(i2);
            return or2Var;
        } catch (ks2 e) {
            sm0.s(e);
            return null;
        }
    }

    public abstract int A();

    public ByteBuffer C(byte[] bArr, int i) {
        int[] iArrF = F(g53.d(bArr), i);
        int[] iArr = (int[]) iArrF.clone();
        g53.b(iArr);
        for (int i2 = 0; i2 < iArrF.length; i2++) {
            iArrF[i2] = iArrF[i2] + iArr[i2];
        }
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.asIntBuffer().put(iArrF, 0, 16);
        return byteBufferOrder;
    }

    public void E(byte[] bArr, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) throws GeneralSecurityException {
        if (bArr.length != A()) {
            throw new GeneralSecurityException(ck1.r(A(), "The nonce length (in bytes) must be "));
        }
        int iRemaining = byteBuffer2.remaining();
        int i = iRemaining / 64;
        int i2 = i + 1;
        for (int i3 = 0; i3 < i2; i3++) {
            ByteBuffer byteBufferC = C(bArr, this.b + i3);
            if (i3 == i) {
                nj2.a0(byteBuffer, byteBuffer2, byteBufferC, iRemaining % 64);
            } else {
                nj2.a0(byteBuffer, byteBuffer2, byteBufferC, 64);
            }
        }
    }

    public abstract int[] F(int[] iArr, int i);

    public abstract float G();

    public abstract int H(int i);

    public abstract void I(o50 o50Var, Object obj);

    public abstract int J();

    public abstract void K(int i);

    public abstract int L();

    public abstract void M(int i);

    public abstract int N();

    public abstract int O();

    public abstract int P();

    public abstract int Q();

    public abstract int R();

    public abstract int S();

    public abstract long T();

    public abstract long U();

    public abstract long V();

    public abstract long W();

    public abstract long X();

    public abstract nr2 Y();

    public abstract String Z();

    public abstract void a(int i);

    public abstract String a0();

    public abstract int b();

    public abstract boolean b0();

    public abstract boolean c();

    public abstract boolean c0();

    public abstract void d(int i);

    public abstract int e(int i);

    public abstract boolean f();

    public abstract qj g();

    public abstract double h();

    public abstract int i();

    public abstract int j();

    public abstract long k();

    public abstract float l();

    public abstract int m();

    public abstract long n();

    public abstract int o();

    public abstract long p();

    public abstract int q();

    public abstract long r();

    public abstract String s();

    public abstract String t();

    public String toString() {
        switch (this.a) {
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                return String.format("%s(0x%04x)", (String) this.c, Integer.valueOf(this.b));
            default:
                return super.toString();
        }
    }

    public abstract int u();

    public abstract int v();

    public abstract long w();

    public abstract boolean x(int i);

    public void y() throws ur0 {
        boolean zX;
        do {
            int iU = u();
            if (iU == 0) {
                return;
            }
            int i = this.b;
            if (i >= 100) {
                throw new ur0("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            }
            this.b = i + 1;
            zX = x(iU);
            this.b--;
        } while (zX);
    }

    public abstract double z();

    public /* synthetic */ sn(int i) {
        this.a = i;
    }

    public sn(String str, int i) {
        this.a = 4;
        this.c = str;
        this.b = i;
    }

    public sn(byte[] bArr, int i) throws InvalidKeyException {
        this.a = 3;
        if (bArr.length == 32) {
            this.c = g53.d(bArr);
            this.b = i;
            return;
        }
        throw new InvalidKeyException("The key length in bytes must be 32.");
    }
}
