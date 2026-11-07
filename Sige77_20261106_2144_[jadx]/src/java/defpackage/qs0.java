package defpackage;

import java.io.IOException;
import java.io.Serializable;
import java.time.ZoneId;
import java.time.ZoneOffset;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class qs0 implements q12 {
    public static final os0 a = new os0(new String[]{"seconds", "nanos"}, 2);
    public static final os0 b = new os0(new String[]{"seconds", "nanos"}, 3);
    public static final os0 c = new os0(new String[]{"year", "month", "day"}, 4);
    public static final os0 d = new os0(new String[]{"hour", "minute", "second", "nano"}, 5);
    public static final os0 e = new os0(new String[]{"month", "day"}, 6);
    public static final os0 f = new os0(new String[]{"years", "months", "days"}, 7);
    public static final os0 g = new os0(new String[]{"year"}, 0);
    public static final os0 h = new os0(new String[]{"year", "month"}, 1);
    public static final k02 i = new a().a();
    public static final b j = new b();

    public class a extends l02 {
        @Override // defpackage.l02
        public final Object b(au0 au0Var) throws IOException {
            au0Var.b();
            String strM = null;
            Integer numValueOf = null;
            while (au0Var.R() != 4) {
                String strB = au0Var.B();
                if (strB.equals("totalSeconds")) {
                    numValueOf = Integer.valueOf(au0Var.x());
                } else if (strB.equals("id")) {
                    strM = au0Var.M();
                } else {
                    au0Var.X();
                }
            }
            au0Var.l();
            if (strM != null) {
                return ZoneId.of(strM);
            }
            if (numValueOf != null) {
                return ZoneOffset.ofTotalSeconds(numValueOf.intValue());
            }
            throw new wt0("Missing id or totalSeconds field; at path ".concat(au0Var.n(true)), 4);
        }

        @Override // defpackage.l02
        public final void c(eu0 eu0Var, Object obj) throws IOException {
            ZoneId zoneIdL = ps0.l(obj);
            if (ps0.r(zoneIdL)) {
                eu0Var.e();
                eu0Var.m("totalSeconds");
                eu0Var.x(ps0.n(zoneIdL).getTotalSeconds());
                eu0Var.l();
                return;
            }
            eu0Var.e();
            eu0Var.m("id");
            eu0Var.B(zoneIdL.getId());
            eu0Var.l();
        }
    }

    public class b implements m02 {
        @Override // defpackage.m02
        public final l02 c(uk0 uk0Var, s12 s12Var) {
            Class cls = s12Var.a;
            if (!cls.getName().startsWith("java.time.")) {
                return null;
            }
            if (cls == ps0.d()) {
                return qs0.a;
            }
            if (cls == ps0.x()) {
                return qs0.b;
            }
            if (cls == z20.i()) {
                return qs0.c;
            }
            if (cls == z20.B()) {
                return qs0.d;
            }
            if (cls == ps0.y()) {
                return qs0.b(uk0Var);
            }
            if (cls == ps0.z()) {
                return qs0.e;
            }
            if (cls == ps0.A()) {
                return new ho(qs0.b(uk0Var), uk0Var.b(new s12(z20.C())), 1).a();
            }
            if (cls == ps0.B()) {
                os0 os0Var = qs0.a;
                Class clsB = z20.B();
                uk0Var.getClass();
                return new ts0(uk0Var.b(new s12(clsB)), uk0Var.b(new s12(z20.C())), 1).a();
            }
            if (cls == ps0.C()) {
                return qs0.f;
            }
            if (cls == ps0.D()) {
                return qs0.g;
            }
            if (cls == ps0.s()) {
                return qs0.h;
            }
            if (cls == z20.D() || cls == z20.C()) {
                return qs0.i;
            }
            if (cls == ps0.w()) {
                return new rs0(qs0.b(uk0Var), uk0Var.b(new s12(z20.C())), uk0Var.b(new s12(z20.D())), 0).a();
            }
            return null;
        }
    }

    public static void a(Serializable serializable, String str, au0 au0Var) {
        if (serializable != null) {
            return;
        }
        StringBuilder sbN = ts.n("Missing ", str, " field; at path ");
        sbN.append(au0Var.n(true));
        throw new wt0(sbN.toString(), 4);
    }

    public static k02 b(uk0 uk0Var) {
        Class clsI = z20.i();
        uk0Var.getClass();
        return new ts0(uk0Var.b(new s12(clsI)), uk0Var.b(new s12(z20.B())), 0).a();
    }
}
