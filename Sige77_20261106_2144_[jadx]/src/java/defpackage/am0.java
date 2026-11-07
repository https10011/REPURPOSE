package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class am0 extends l82 {
    @Override // defpackage.v00
    public final void a(v00 v00Var) {
        ye yeVar = (ye) this.b;
        int i = yeVar.r0;
        z00 z00Var = this.h;
        ArrayList arrayList = z00Var.l;
        int size = arrayList.size();
        int i2 = 0;
        int i3 = -1;
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            int i5 = ((z00) obj).g;
            if (i3 == -1 || i5 < i3) {
                i3 = i5;
            }
            if (i2 < i5) {
                i2 = i5;
            }
        }
        if (i == 0 || i == 2) {
            z00Var.d(i3 + yeVar.t0);
        } else {
            z00Var.d(i2 + yeVar.t0);
        }
    }

    @Override // defpackage.l82
    public final void d() {
        qr qrVar = this.b;
        if (qrVar instanceof ye) {
            z00 z00Var = this.h;
            z00Var.b = true;
            ArrayList arrayList = z00Var.l;
            ye yeVar = (ye) qrVar;
            int i = yeVar.r0;
            boolean z = yeVar.s0;
            int i2 = 0;
            if (i == 0) {
                z00Var.e = 4;
                while (i2 < yeVar.q0) {
                    qr qrVar2 = yeVar.p0[i2];
                    if (z || qrVar2.f0 != 8) {
                        z00 z00Var2 = qrVar2.d.h;
                        z00Var2.k.add(z00Var);
                        arrayList.add(z00Var2);
                    }
                    i2++;
                }
                m(this.b.d.h);
                m(this.b.d.i);
                return;
            }
            if (i == 1) {
                z00Var.e = 5;
                while (i2 < yeVar.q0) {
                    qr qrVar3 = yeVar.p0[i2];
                    if (z || qrVar3.f0 != 8) {
                        z00 z00Var3 = qrVar3.d.i;
                        z00Var3.k.add(z00Var);
                        arrayList.add(z00Var3);
                    }
                    i2++;
                }
                m(this.b.d.h);
                m(this.b.d.i);
                return;
            }
            if (i == 2) {
                z00Var.e = 6;
                while (i2 < yeVar.q0) {
                    qr qrVar4 = yeVar.p0[i2];
                    if (z || qrVar4.f0 != 8) {
                        z00 z00Var4 = qrVar4.e.h;
                        z00Var4.k.add(z00Var);
                        arrayList.add(z00Var4);
                    }
                    i2++;
                }
                m(this.b.e.h);
                m(this.b.e.i);
                return;
            }
            if (i != 3) {
                return;
            }
            z00Var.e = 7;
            while (i2 < yeVar.q0) {
                qr qrVar5 = yeVar.p0[i2];
                if (z || qrVar5.f0 != 8) {
                    z00 z00Var5 = qrVar5.e.i;
                    z00Var5.k.add(z00Var);
                    arrayList.add(z00Var5);
                }
                i2++;
            }
            m(this.b.e.h);
            m(this.b.e.i);
        }
    }

    @Override // defpackage.l82
    public final void e() {
        qr qrVar = this.b;
        if (qrVar instanceof ye) {
            int i = ((ye) qrVar).r0;
            z00 z00Var = this.h;
            if (i == 0 || i == 1) {
                qrVar.X = z00Var.g;
            } else {
                qrVar.Y = z00Var.g;
            }
        }
    }

    @Override // defpackage.l82
    public final void f() {
        this.c = null;
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
