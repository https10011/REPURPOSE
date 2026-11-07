package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class sb2 extends fg2 {
    public final /* synthetic */ int i;
    public final /* synthetic */ Object v;

    public /* synthetic */ sb2(Object obj, int i) {
        this.i = i;
        this.v = obj;
    }

    @Override // defpackage.fg2
    public final void b() {
        switch (this.i) {
            case 0:
                yb2 yb2Var = (yb2) ((wb2) this.v).b;
                yb2Var.b.b("unlinkToDeath", new Object[0]);
                yb2Var.n.asBinder().unlinkToDeath(yb2Var.k, 0);
                yb2Var.n = null;
                yb2Var.g = false;
                return;
            default:
                synchronized (((yb2) this.v).f) {
                    try {
                        if (((yb2) this.v).l.get() > 0 && ((yb2) this.v).l.decrementAndGet() > 0) {
                            ((yb2) this.v).b.b("Leaving the connection open for other ongoing calls.", new Object[0]);
                            return;
                        }
                        yb2 yb2Var2 = (yb2) this.v;
                        if (yb2Var2.n != null) {
                            yb2Var2.b.b("Unbind from service.", new Object[0]);
                            yb2 yb2Var3 = (yb2) this.v;
                            yb2Var3.a.unbindService(yb2Var3.m);
                            yb2 yb2Var4 = (yb2) this.v;
                            yb2Var4.g = false;
                            yb2Var4.n = null;
                            yb2Var4.m = null;
                        }
                        ((yb2) this.v).e();
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
        }
    }
}
