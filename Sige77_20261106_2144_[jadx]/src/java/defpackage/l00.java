package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final /* synthetic */ class l00 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n00 b;
    public final /* synthetic */ Runnable c;
    public final /* synthetic */ ox1 d;

    public /* synthetic */ l00(n00 n00Var, Runnable runnable, ox1 ox1Var, int i) {
        this.a = i;
        this.b = n00Var;
        this.c = runnable;
        this.d = ox1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        final ox1 ox1Var = this.d;
        final Runnable runnable = this.c;
        n00 n00Var = this.b;
        switch (i) {
            case 0:
                final int i2 = 0;
                n00Var.a.execute(new Runnable() { // from class: j00
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        int i3 = i2;
                        ox1 ox1Var2 = ox1Var;
                        Runnable runnable2 = runnable;
                        switch (i3) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e) {
                                    ((p00) ox1Var2.a).k(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e2) {
                                    ((p00) ox1Var2.a).k(e2);
                                    return;
                                }
                            default:
                                p00 p00Var = (p00) ox1Var2.a;
                                try {
                                    runnable2.run();
                                    p00Var.j(null);
                                    return;
                                } catch (Exception e3) {
                                    p00Var.k(e3);
                                    return;
                                }
                        }
                    }
                });
                break;
            case 1:
                final int i3 = 2;
                n00Var.a.execute(new Runnable() { // from class: j00
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        int i4 = i3;
                        ox1 ox1Var2 = ox1Var;
                        Runnable runnable2 = runnable;
                        switch (i4) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e) {
                                    ((p00) ox1Var2.a).k(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e2) {
                                    ((p00) ox1Var2.a).k(e2);
                                    return;
                                }
                            default:
                                p00 p00Var = (p00) ox1Var2.a;
                                try {
                                    runnable2.run();
                                    p00Var.j(null);
                                    return;
                                } catch (Exception e3) {
                                    p00Var.k(e3);
                                    return;
                                }
                        }
                    }
                });
                break;
            default:
                final int i4 = 1;
                n00Var.a.execute(new Runnable() { // from class: j00
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        int i5 = i4;
                        ox1 ox1Var2 = ox1Var;
                        Runnable runnable2 = runnable;
                        switch (i5) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e) {
                                    ((p00) ox1Var2.a).k(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e2) {
                                    ((p00) ox1Var2.a).k(e2);
                                    return;
                                }
                            default:
                                p00 p00Var = (p00) ox1Var2.a;
                                try {
                                    runnable2.run();
                                    p00Var.j(null);
                                    return;
                                } catch (Exception e3) {
                                    p00Var.k(e3);
                                    return;
                                }
                        }
                    }
                });
                break;
        }
    }
}
