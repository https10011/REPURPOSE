package defpackage;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class te3 {
    public static final te3 b;
    public final AtomicReference a = new AtomicReference(new cg3(new ud2(15)));

    static {
        try {
            te3 te3Var = new te3();
            te3Var.f(new hd3(qd3.class, new gp1(22)));
            b = te3Var;
        } catch (Exception e) {
            throw new xp(10, e);
        }
    }

    public final zi0 a(wf3 wf3Var) {
        cg3 cg3Var = (cg3) this.a.get();
        cg3Var.getClass();
        fg3 fg3Var = new fg3(wf3.class, (tr3) wf3Var.d);
        HashMap map = cg3Var.b;
        if (map.containsKey(fg3Var)) {
            return ((ad3) map.get(fg3Var)).b.o(wf3Var);
        }
        throw new GeneralSecurityException(ts.k("No Key Parser for requested key type ", String.valueOf(fg3Var), " available"));
    }

    public final dx2 b(vf3 vf3Var) {
        cg3 cg3Var = (cg3) this.a.get();
        cg3Var.getClass();
        fg3 fg3Var = new fg3(vf3.class, (tr3) vf3Var.b);
        HashMap map = cg3Var.d;
        if (map.containsKey(fg3Var)) {
            return ((cf3) map.get(fg3Var)).b.k(vf3Var);
        }
        throw new GeneralSecurityException(ts.k("No Parameters Parser for requested key type ", String.valueOf(fg3Var), " available"));
    }

    public final eg3 c(zi0 zi0Var) throws GeneralSecurityException {
        cg3 cg3Var = (cg3) this.a.get();
        cg3Var.getClass();
        hg3 hg3Var = new hg3(zi0Var.getClass(), wf3.class);
        HashMap map = cg3Var.a;
        if (map.containsKey(hg3Var)) {
            return ((hd3) map.get(hg3Var)).b.g(zi0Var);
        }
        throw new GeneralSecurityException(ts.k("No Key serializer for ", String.valueOf(hg3Var), " available"));
    }

    public final eg3 d(dx2 dx2Var) throws GeneralSecurityException {
        cg3 cg3Var = (cg3) this.a.get();
        cg3Var.getClass();
        hg3 hg3Var = new hg3(dx2Var.getClass(), vf3.class);
        HashMap map = cg3Var.c;
        if (map.containsKey(hg3Var)) {
            return ((gf3) map.get(hg3Var)).b.c(dx2Var);
        }
        throw new GeneralSecurityException(ts.k("No Key Format serializer for ", String.valueOf(hg3Var), " available"));
    }

    public final synchronized void e(ad3 ad3Var) {
        ud2 ud2Var = new ud2((cg3) this.a.get());
        ud2Var.q(ad3Var);
        this.a.set(new cg3(ud2Var));
    }

    public final synchronized void f(hd3 hd3Var) {
        ud2 ud2Var = new ud2((cg3) this.a.get());
        ud2Var.r(hd3Var);
        this.a.set(new cg3(ud2Var));
    }

    public final synchronized void g(cf3 cf3Var) {
        ud2 ud2Var = new ud2((cg3) this.a.get());
        ud2Var.t(cf3Var);
        this.a.set(new cg3(ud2Var));
    }

    public final synchronized void h(gf3 gf3Var) {
        ud2 ud2Var = new ud2((cg3) this.a.get());
        ud2Var.u(gf3Var);
        this.a.set(new cg3(ud2Var));
    }
}
