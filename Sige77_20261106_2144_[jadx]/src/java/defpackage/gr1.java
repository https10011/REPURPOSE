package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class gr1 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public gr1(w93 w93Var, boolean z) {
        this.b = z;
        Objects.requireNonNull(w93Var);
        this.c = w93Var;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0055  */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                hr1 hr1Var = (hr1) this.c;
                boolean z = this.b;
                d42.b();
                hc hcVar = hr1Var.a;
                boolean z2 = hcVar.a;
                hcVar.a = z;
                if (z2 != z) {
                    ((fr1) hcVar.b).a(z);
                }
                break;
            default:
                w93 w93Var = (w93) this.c;
                y53 y53Var = (y53) w93Var.a;
                boolean zA = y53Var.a();
                boolean z3 = false;
                boolean z4 = y53Var.l0 != null && y53Var.l0.booleanValue();
                boolean z5 = this.b;
                y53Var.l0 = Boolean.valueOf(z5);
                if (z4 == z5) {
                    c33 c33Var = y53Var.f;
                    y53.l(c33Var);
                    c33Var.a0.b(Boolean.valueOf(z5), "Default data collection state already set to");
                }
                if (y53Var.a() != zA) {
                    boolean zA2 = y53Var.a();
                    if (y53Var.l0 != null && y53Var.l0.booleanValue()) {
                        z3 = true;
                    }
                    if (zA2 != z3) {
                        c33 c33Var2 = y53Var.f;
                        y53.l(c33Var2);
                        c33Var2.X.c(Boolean.valueOf(z5), Boolean.valueOf(zA), "Default data collection is different than actual status");
                    }
                } else {
                    c33 c33Var3 = y53Var.f;
                    y53.l(c33Var3);
                    c33Var3.X.c(Boolean.valueOf(z5), Boolean.valueOf(zA), "Default data collection is different than actual status");
                }
                w93Var.W();
                break;
        }
    }

    public gr1(hr1 hr1Var, boolean z) {
        this.c = hr1Var;
        this.b = z;
    }
}
