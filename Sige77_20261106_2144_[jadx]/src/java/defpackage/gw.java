package defpackage;

import java.io.File;
import java.util.List;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class gw implements nw, kw {
    public final List a;
    public final hy b;
    public final mw c;
    public int d = -1;
    public hv0 e;
    public List f;
    public int i;
    public volatile d51 v;
    public File w;

    public gw(List list, hy hyVar, mw mwVar) {
        this.a = list;
        this.b = hyVar;
        this.c = mwVar;
    }

    @Override // defpackage.kw
    public final void b(Exception exc) {
        this.c.a(this.e, exc, this.v.c, 3);
    }

    @Override // defpackage.kw
    public final void c(Object obj) {
        this.c.b(this.e, obj, this.v.c, 3, this.e);
    }

    @Override // defpackage.nw
    public final void cancel() {
        d51 d51Var = this.v;
        if (d51Var != null) {
            d51Var.c.cancel();
        }
    }

    @Override // defpackage.nw
    public final boolean d() {
        while (true) {
            List list = this.f;
            boolean z = false;
            if (list != null && this.i < list.size()) {
                this.v = null;
                while (!z && this.i < this.f.size()) {
                    List list2 = this.f;
                    int i = this.i;
                    this.i = i + 1;
                    e51 e51Var = (e51) list2.get(i);
                    File file = this.w;
                    hy hyVar = this.b;
                    this.v = e51Var.b(file, hyVar.e, hyVar.f, hyVar.i);
                    if (this.v != null && this.b.c(this.v.c.a()) != null) {
                        this.v.c.i(this.b.o, this);
                        z = true;
                    }
                }
                return z;
            }
            int i2 = this.d + 1;
            this.d = i2;
            if (i2 >= this.a.size()) {
                return false;
            }
            hv0 hv0Var = (hv0) this.a.get(this.d);
            hy hyVar2 = this.b;
            File fileD = hyVar2.h.a().d(new hw(hv0Var, hyVar2.n));
            this.w = fileD;
            if (fileD != null) {
                this.e = hv0Var;
                this.f = this.b.c.a().f(fileD);
                this.i = 0;
            }
        }
    }
}
