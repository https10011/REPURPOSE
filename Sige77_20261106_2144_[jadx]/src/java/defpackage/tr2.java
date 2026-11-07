package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public abstract class tr2 {
    public static final boolean b = nt2.d;
    public pv2 a;

    public static int n(int i, jr2 jr2Var) {
        int iT = t(i << 3);
        int iB = jr2Var.b();
        return ck1.w(iB, iB, iT);
    }

    public static int r(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public static int s(int i) {
        return t(i << 3);
    }

    public static int t(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public abstract void a(byte b2);

    public abstract void b(int i);

    public abstract void c(int i, int i2);

    public abstract void d(int i, long j);

    public abstract void e(int i, String str);

    public abstract void f(int i, jr2 jr2Var);

    public abstract void g(int i, boolean z);

    public abstract void h(long j);

    public abstract void i(byte[] bArr, int i, int i2);

    public abstract void j(int i);

    public abstract void k(int i, int i2);

    public abstract void l(int i, long j);

    public abstract void m(long j);

    public abstract void o(int i);

    public abstract void p(int i, int i2);

    public abstract void q(int i, int i2);
}
