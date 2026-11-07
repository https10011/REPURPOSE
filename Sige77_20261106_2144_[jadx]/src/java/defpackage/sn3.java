package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public abstract class sn3 {
    public static final pn3 d = new pn3();
    public final sn3 a;
    public final wq1 b;
    public boolean c = false;

    public /* synthetic */ sn3(sn3 sn3Var, wq1 wq1Var) {
        if (sn3Var != null) {
            yv2.h(sn3Var.c);
        }
        this.a = sn3Var;
        this.b = wq1Var;
    }

    public static sn3 a(sn3 sn3Var, sn3 sn3Var2) {
        sn3Var.getClass();
        sn3 sn3Var3 = rn3.e;
        if (sn3Var == sn3Var3) {
            return sn3Var2;
        }
        sn3Var2.getClass();
        if (sn3Var2 == sn3Var3) {
            return sn3Var;
        }
        wo0<sn3> wo0VarI = wo0.i(2, sn3Var, sn3Var2);
        if (wo0VarI.isEmpty()) {
            return sn3Var3;
        }
        if (wo0VarI.size() == 1) {
            return (sn3) wo0VarI.iterator().next();
        }
        int i = 0;
        for (sn3 sn3Var4 : wo0VarI) {
            do {
                i += sn3Var4.b.c;
                sn3Var4 = sn3Var4.a;
            } while (sn3Var4 != null);
        }
        if (i == 0) {
            return rn3.e;
        }
        wq1 wq1Var = new wq1(i);
        for (sn3 sn3Var5 : wo0VarI) {
            do {
                int i2 = 0;
                while (true) {
                    wq1 wq1Var2 = sn3Var5.b;
                    if (i2 >= wq1Var2.c) {
                        break;
                    }
                    yv2.i(wq1Var.put((pn3) wq1Var2.f(i2), wq1Var2.j(i2)) == null, "Duplicate bindings: %s", wq1Var2.f(i2));
                    i2++;
                }
                sn3Var5 = sn3Var5.a;
            } while (sn3Var5 != null);
        }
        return new rn3(null, wq1Var).b();
    }

    public final sn3 b() {
        if (this.c) {
            uq1.q("Already frozen");
            return null;
        }
        this.c = true;
        sn3 sn3Var = this.a;
        return (sn3Var == null || !this.b.isEmpty()) ? this : sn3Var;
    }

    public final boolean c() {
        if (this.b.containsKey(d)) {
            return true;
        }
        sn3 sn3Var = this.a;
        return sn3Var != null && sn3Var.c();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpanExtras<");
        for (sn3 sn3Var = this; sn3Var != null; sn3Var = sn3Var.a) {
            for (int i = 0; i < sn3Var.b.c; i++) {
                sb.append("[");
                sb.append(this.b.j(i));
                sb.append("], ");
            }
        }
        sb.append(">");
        return sb.toString();
    }
}
