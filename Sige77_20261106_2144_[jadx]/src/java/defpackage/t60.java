package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class t60 implements Runnable {
    public final /* synthetic */ int a;
    public final er1 b;
    public final /* synthetic */ w60 c;

    public /* synthetic */ t60(w60 w60Var, er1 er1Var, int i) {
        this.a = i;
        this.c = w60Var;
        this.b = er1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                er1 er1Var = this.b;
                er1Var.b.a();
                synchronized (er1Var.c) {
                    synchronized (this.c) {
                        try {
                            if (this.c.a.a.contains(new u60(this.b, ye1.b))) {
                                w60 w60Var = this.c;
                                er1 er1Var2 = this.b;
                                w60Var.getClass();
                                try {
                                    er1Var2.f(w60Var.d0, 5);
                                } catch (Throwable th) {
                                    throw new bk(th);
                                }
                            }
                            this.c.b();
                        } catch (Throwable th2) {
                            throw th2;
                        }
                        break;
                    }
                }
                return;
            default:
                er1 er1Var3 = this.b;
                er1Var3.b.a();
                synchronized (er1Var3.c) {
                    synchronized (this.c) {
                        try {
                            if (this.c.a.a.contains(new u60(this.b, ye1.b))) {
                                this.c.f0.a();
                                w60 w60Var2 = this.c;
                                er1 er1Var4 = this.b;
                                w60Var2.getClass();
                                try {
                                    er1Var4.g(w60Var2.f0, w60Var2.b0);
                                    this.c.g(this.b);
                                } catch (Throwable th3) {
                                    throw new bk(th3);
                                }
                            }
                            this.c.b();
                        } catch (Throwable th4) {
                            throw th4;
                        }
                    }
                }
                return;
        }
    }
}
