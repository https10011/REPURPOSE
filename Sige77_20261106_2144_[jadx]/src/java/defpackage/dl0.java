package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class dl0 extends l82 {
    @Override // defpackage.v00
    public final void a(v00 v00Var) {
        z00 z00Var = this.h;
        if (z00Var.c && !z00Var.j) {
            z00Var.d((int) ((((z00) z00Var.l.get(0)).g * ((cl0) this.b).p0) + 0.5f));
        }
    }

    @Override // defpackage.l82
    public final void d() {
        qr qrVar = this.b;
        cl0 cl0Var = (cl0) qrVar;
        int i = cl0Var.q0;
        int i2 = cl0Var.r0;
        int i3 = cl0Var.t0;
        z00 z00Var = this.h;
        if (i3 == 1) {
            if (i != -1) {
                z00Var.l.add(qrVar.S.d.h);
                this.b.S.d.h.k.add(z00Var);
                z00Var.f = i;
            } else if (i2 != -1) {
                z00Var.l.add(qrVar.S.d.i);
                this.b.S.d.i.k.add(z00Var);
                z00Var.f = -i2;
            } else {
                z00Var.b = true;
                z00Var.l.add(qrVar.S.d.i);
                this.b.S.d.i.k.add(z00Var);
            }
            m(this.b.d.h);
            m(this.b.d.i);
            return;
        }
        if (i != -1) {
            z00Var.l.add(qrVar.S.e.h);
            this.b.S.e.h.k.add(z00Var);
            z00Var.f = i;
        } else if (i2 != -1) {
            z00Var.l.add(qrVar.S.e.i);
            this.b.S.e.i.k.add(z00Var);
            z00Var.f = -i2;
        } else {
            z00Var.b = true;
            z00Var.l.add(qrVar.S.e.i);
            this.b.S.e.i.k.add(z00Var);
        }
        m(this.b.e.h);
        m(this.b.e.i);
    }

    @Override // defpackage.l82
    public final void e() {
        qr qrVar = this.b;
        int i = ((cl0) qrVar).t0;
        z00 z00Var = this.h;
        if (i == 1) {
            qrVar.X = z00Var.g;
        } else {
            qrVar.Y = z00Var.g;
        }
    }

    @Override // defpackage.l82
    public final void f() {
        this.h.c();
    }

    @Override // defpackage.l82
    public final boolean k() {
        return false;
    }

    public final void m(z00 z00Var) {
        z00 z00Var2 = this.h;
        z00Var2.k.add(z00Var);
        z00Var.l.add(z00Var2);
    }
}
