package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class yz0 implements pi1, o90 {
    public static final ac2 e = gb2.I(20, new mo1(7));
    public final ut1 a = new ut1();
    public pi1 b;
    public boolean c;
    public boolean d;

    public final synchronized void a() {
        this.a.a();
        if (!this.c) {
            throw new IllegalStateException("Already unlocked");
        }
        this.c = false;
        if (this.d) {
            e();
        }
    }

    @Override // defpackage.pi1
    public final int b() {
        return this.b.b();
    }

    @Override // defpackage.o90
    public final ut1 c() {
        return this.a;
    }

    @Override // defpackage.pi1
    public final Class d() {
        return this.b.d();
    }

    @Override // defpackage.pi1
    public final synchronized void e() {
        this.a.a();
        this.d = true;
        if (!this.c) {
            this.b.e();
            this.b = null;
            e.b(this);
        }
    }

    @Override // defpackage.pi1
    public final Object get() {
        return this.b.get();
    }
}
