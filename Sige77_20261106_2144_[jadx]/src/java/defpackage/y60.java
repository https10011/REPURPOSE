package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class y60 implements pi1 {
    public final boolean a;
    public final boolean b;
    public final pi1 c;
    public final s60 d;
    public final hv0 e;
    public int f;
    public boolean i;

    public y60(pi1 pi1Var, boolean z, boolean z2, hv0 hv0Var, s60 s60Var) {
        am2.p(pi1Var, "Argument must not be null");
        this.c = pi1Var;
        this.a = z;
        this.b = z2;
        this.e = hv0Var;
        am2.p(s60Var, "Argument must not be null");
        this.d = s60Var;
    }

    public final synchronized void a() {
        if (this.i) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        this.f++;
    }

    @Override // defpackage.pi1
    public final int b() {
        return this.c.b();
    }

    public final void c() {
        boolean z;
        synchronized (this) {
            int i = this.f;
            if (i <= 0) {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
            z = true;
            int i2 = i - 1;
            this.f = i2;
            if (i2 != 0) {
                z = false;
            }
        }
        if (z) {
            this.d.e(this.e, this);
        }
    }

    @Override // defpackage.pi1
    public final Class d() {
        return this.c.d();
    }

    @Override // defpackage.pi1
    public final synchronized void e() {
        if (this.f > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.i) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.i = true;
        if (this.b) {
            this.c.e();
        }
    }

    @Override // defpackage.pi1
    public final Object get() {
        return this.c.get();
    }

    public final synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.a + ", listener=" + this.d + ", key=" + this.e + ", acquired=" + this.f + ", isRecycled=" + this.i + ", resource=" + this.c + '}';
    }
}
