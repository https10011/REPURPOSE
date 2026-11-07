package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class py1 extends jw {
    public final /* synthetic */ int h;
    public boolean i;
    public int j;
    public final /* synthetic */ Object k;

    public py1(z62 z62Var) {
        this.h = 1;
        this.k = z62Var;
        this.i = false;
        this.j = 0;
    }

    @Override // defpackage.a72
    public final void a() {
        int i = this.h;
        Object obj = this.k;
        switch (i) {
            case 0:
                if (!this.i) {
                    ((qy1) obj).a.setVisibility(this.j);
                }
                break;
            default:
                int i2 = this.j + 1;
                this.j = i2;
                z62 z62Var = (z62) obj;
                if (i2 == z62Var.a.size()) {
                    a72 a72Var = z62Var.d;
                    if (a72Var != null) {
                        a72Var.a();
                    }
                    this.j = 0;
                    this.i = false;
                    z62Var.e = false;
                }
                break;
        }
    }

    @Override // defpackage.jw, defpackage.a72
    public void b() {
        switch (this.h) {
            case 0:
                this.i = true;
                break;
        }
    }

    @Override // defpackage.jw, defpackage.a72
    public final void c() {
        int i = this.h;
        Object obj = this.k;
        switch (i) {
            case 0:
                ((qy1) obj).a.setVisibility(0);
                break;
            default:
                if (!this.i) {
                    this.i = true;
                    a72 a72Var = ((z62) obj).d;
                    if (a72Var != null) {
                        a72Var.c();
                    }
                    break;
                }
                break;
        }
    }

    public py1(qy1 qy1Var, int i) {
        this.h = 0;
        this.k = qy1Var;
        this.j = i;
        this.i = false;
    }
}
