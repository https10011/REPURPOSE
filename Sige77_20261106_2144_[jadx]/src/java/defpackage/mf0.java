package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class mf0 implements kr1 {
    public final kr1 a;

    public mf0(kr1 kr1Var) {
        kr1Var.getClass();
        this.a = kr1Var;
    }

    @Override // defpackage.kr1, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.a.close();
    }

    @Override // defpackage.kr1
    public final vx1 d() {
        return this.a.d();
    }

    @Override // defpackage.kr1
    public void f(ji jiVar, long j) {
        this.a.f(jiVar, j);
    }

    @Override // defpackage.kr1, java.io.Flushable
    public void flush() {
        this.a.flush();
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.a + ')';
    }
}
