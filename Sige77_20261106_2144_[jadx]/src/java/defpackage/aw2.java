package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class aw2 {
    public final ud2 a;
    public ep1 b;
    public final p11 c;
    public final yd2 d;

    public aw2() {
        ud2 ud2Var = new ud2(13);
        this.a = ud2Var;
        this.b = ((ep1) ud2Var.b).K();
        this.c = new p11();
        this.d = new yd2(13);
        final int i = 1;
        Callable callable = new Callable(this) { // from class: wi2
            public final /* synthetic */ aw2 b;

            {
                this.b = this;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                int i2 = i;
                aw2 aw2Var = this.b;
                switch (i2) {
                    case 0:
                        return new c83(aw2Var.c);
                    default:
                        return new c83(aw2Var.d);
                }
            }
        };
        xw xwVar = (xw) ud2Var.d;
        xwVar.a.put("internal.registerCallback", callable);
        final int i2 = 0;
        xwVar.a.put("internal.eventLogger", new Callable(this) { // from class: wi2
            public final /* synthetic */ aw2 b;

            {
                this.b = this;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                int i3 = i2;
                aw2 aw2Var = this.b;
                switch (i3) {
                    case 0:
                        return new c83(aw2Var.c);
                    default:
                        return new c83(aw2Var.d);
                }
            }
        });
    }

    public final boolean a(fj2 fj2Var) throws ey2 {
        p11 p11Var = this.c;
        try {
            p11Var.b = fj2Var;
            p11Var.c = fj2Var.clone();
            ((ArrayList) p11Var.d).clear();
            ((ep1) this.a.c).O("runtime.counter", new ep2(Double.valueOf(0.0d)));
            this.d.C(this.b.K(), p11Var);
            return (((fj2) p11Var.c).equals((fj2) p11Var.b) && ((ArrayList) p11Var.d).isEmpty()) ? false : true;
        } catch (Throwable th) {
            throw new ey2(th);
        }
    }

    public final void b(e73 e73Var) throws ey2 {
        dq2 dq2Var;
        try {
            ud2 ud2Var = this.a;
            this.b = ((ep1) ud2Var.b).K();
            if (ud2Var.m(this.b, (h73[]) e73Var.t().toArray(new h73[0])) instanceof go2) {
                throw new IllegalStateException("Program loading failed");
            }
            for (z63 z63Var : e73Var.u().t()) {
                List listU = z63Var.u();
                String strT = z63Var.t();
                Iterator it = listU.iterator();
                while (it.hasNext()) {
                    qt2 qt2VarM = ud2Var.m(this.b, (h73) it.next());
                    if (!(qt2VarM instanceof hs2)) {
                        throw new IllegalArgumentException("Invalid rule definition");
                    }
                    ep1 ep1Var = this.b;
                    if (ep1Var.N(strT)) {
                        qt2 qt2VarQ = ep1Var.Q(strT);
                        if (!(qt2VarQ instanceof dq2)) {
                            throw new IllegalStateException("Invalid function name: ".concat(String.valueOf(strT)));
                        }
                        dq2Var = (dq2) qt2VarQ;
                    } else {
                        dq2Var = null;
                    }
                    if (dq2Var == null) {
                        throw new IllegalStateException("Rule function is undefined: ".concat(String.valueOf(strT)));
                    }
                    dq2Var.g(this.b, Collections.singletonList(qt2VarM));
                }
            }
        } catch (Throwable th) {
            throw new ey2(th);
        }
    }
}
