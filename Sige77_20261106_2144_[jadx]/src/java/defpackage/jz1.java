package defpackage;

import androidx.lifecycle.b;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class jz1 {
    public static final c31 a(b bVar, yg0 yg0Var) {
        Object obj;
        c31 c31Var = new c31();
        kl1 kl1Var = new kl1();
        c31Var.l = kl1Var;
        iz1 iz1Var = new iz1(new us(2, c31Var, yg0Var));
        b31 b31Var = new b31(bVar, iz1Var);
        hl1 hl1VarA = kl1Var.a(bVar);
        if (hl1VarA != null) {
            obj = hl1VarA.b;
        } else {
            hl1 hl1Var = new hl1(bVar, b31Var);
            kl1Var.d++;
            hl1 hl1Var2 = kl1Var.b;
            if (hl1Var2 == null) {
                kl1Var.a = hl1Var;
                kl1Var.b = hl1Var;
            } else {
                hl1Var2.c = hl1Var;
                hl1Var.d = hl1Var2;
                kl1Var.b = hl1Var;
            }
            obj = null;
        }
        b31 b31Var2 = (b31) obj;
        if (b31Var2 != null && b31Var2.b != iz1Var) {
            e.g("This source was already added with the different observer");
            return null;
        }
        if (b31Var2 == null && ((b) c31Var).c > 0) {
            bVar.f(b31Var);
        }
        return c31Var;
    }
}
