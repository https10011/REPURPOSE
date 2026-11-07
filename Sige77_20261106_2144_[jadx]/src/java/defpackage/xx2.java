package defpackage;

import android.os.Bundle;
import java.util.Iterator;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class xx2 extends f03 {
    public final mb b;
    public final mb c;
    public long d;

    public xx2(y53 y53Var) {
        super(y53Var);
        this.c = new mb(0);
        this.b = new mb(0);
    }

    public final void F(String str, long j) {
        y53 y53Var = (y53) this.a;
        if (str == null || str.length() == 0) {
            c33 c33Var = y53Var.f;
            y53.l(c33Var);
            c33Var.f.a("Ad unit id must be a non-empty string");
        } else {
            t53 t53Var = y53Var.i;
            y53.l(t53Var);
            t53Var.N(new zi2(this, str, j, 0));
        }
    }

    public final void G(String str, long j) {
        y53 y53Var = (y53) this.a;
        if (str == null || str.length() == 0) {
            c33 c33Var = y53Var.f;
            y53.l(c33Var);
            c33Var.f.a("Ad unit id must be a non-empty string");
        } else {
            t53 t53Var = y53Var.i;
            y53.l(t53Var);
            t53Var.N(new zi2(this, str, j, 1));
        }
    }

    public final void H(long j) {
        ua3 ua3Var = ((y53) this.a).Y;
        y53.k(ua3Var);
        ja3 ja3VarI = ua3Var.I(false);
        mb mbVar = this.b;
        for (String str : (jb) mbVar.keySet()) {
            J(str, j - ((Long) mbVar.get(str)).longValue(), ja3VarI);
        }
        if (!mbVar.isEmpty()) {
            I(j - this.d, ja3VarI);
        }
        K(j);
    }

    public final void I(long j, ja3 ja3Var) {
        y53 y53Var = (y53) this.a;
        if (ja3Var == null) {
            c33 c33Var = y53Var.f;
            y53.l(c33Var);
            c33Var.a0.a("Not logging ad exposure. No active activity");
        } else if (j < 1000) {
            c33 c33Var2 = y53Var.f;
            y53.l(c33Var2);
            c33Var2.a0.b(Long.valueOf(j), "Not logging ad exposure. Less than 1000 ms. exposure");
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("_xt", j);
            qf3.A0(ja3Var, bundle, true);
            w93 w93Var = y53Var.Z;
            y53.k(w93Var);
            w93Var.L("am", "_xa", bundle);
        }
    }

    public final void J(String str, long j, ja3 ja3Var) {
        y53 y53Var = (y53) this.a;
        if (ja3Var == null) {
            c33 c33Var = y53Var.f;
            y53.l(c33Var);
            c33Var.a0.a("Not logging ad unit exposure. No active activity");
        } else {
            if (j < 1000) {
                c33 c33Var2 = y53Var.f;
                y53.l(c33Var2);
                c33Var2.a0.b(Long.valueOf(j), "Not logging ad unit exposure. Less than 1000 ms. exposure");
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str);
            bundle.putLong("_xt", j);
            qf3.A0(ja3Var, bundle, true);
            w93 w93Var = y53Var.Z;
            y53.k(w93Var);
            w93Var.L("am", "_xu", bundle);
        }
    }

    public final void K(long j) {
        mb mbVar = this.b;
        Iterator it = ((jb) mbVar.keySet()).iterator();
        while (it.hasNext()) {
            mbVar.put((String) it.next(), Long.valueOf(j));
        }
        if (mbVar.isEmpty()) {
            return;
        }
        this.d = j;
    }
}
