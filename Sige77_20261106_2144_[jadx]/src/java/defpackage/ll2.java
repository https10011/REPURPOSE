package defpackage;

import java.io.InputStream;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class ll2 {
    public int a;
    public int b;
    public we c;

    public static ll2 h(InputStream inputStream, int i) {
        if (i <= 0) {
            e.g("bufferSize must be > 0");
            return null;
        }
        if (inputStream != null) {
            return new kl2(inputStream, i);
        }
        il2 il2Var = new il2(sm2.a);
        try {
            il2Var.a(0);
            return il2Var;
        } catch (xm2 e) {
            sm0.s(e);
            return null;
        }
    }

    public static int j(int i) {
        return (i >>> 1) ^ (-(i & 1));
    }

    public static long k(long j) {
        return (j >>> 1) ^ (-(1 & j));
    }

    public abstract int A();

    public abstract int B();

    public abstract int C();

    public abstract long D();

    public abstract int E();

    public abstract long F();

    public abstract int G();

    public abstract long H();

    public abstract int a(int i);

    public abstract void b(int i);

    public abstract int c();

    public abstract boolean d();

    public abstract int e();

    public abstract int f(byte[] bArr, int i, int i2);

    public abstract void g(int i);

    public final void i() throws xm2 {
        boolean zN;
        do {
            int iL = l();
            if (iL == 0) {
                return;
            }
            int i = this.a;
            int i2 = this.b;
            if (i + i2 >= 100) {
                tv2.i("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
                return;
            } else {
                this.b = i2 + 1;
                zN = n(iL);
                this.b--;
            }
        } while (zN);
    }

    public abstract int l();

    public abstract void m(int i);

    public abstract boolean n(int i);

    public abstract double o();

    public abstract float p();

    public abstract long q();

    public abstract long r();

    public abstract int s();

    public abstract long t();

    public abstract int u();

    public abstract boolean v();

    public abstract String w();

    public abstract String x();

    public abstract gl2 y();

    public abstract byte[] z();
}
