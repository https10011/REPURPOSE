package defpackage;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public class vt0 extends l02 {
    public static final vt0 a = new vt0();

    private vt0() {
    }

    public static ut0 d(int i, au0 au0Var) throws IOException {
        int iV = ts.v(i);
        if (iV == 5) {
            return new zt0(au0Var.M());
        }
        if (iV == 6) {
            return new zt0(new uv0(au0Var.M()));
        }
        if (iV == 7) {
            return new zt0(Boolean.valueOf(au0Var.t()));
        }
        if (iV == 8) {
            au0Var.D();
            return xt0.a;
        }
        uq1.q("Unexpected token: ".concat(y00.p(i)));
        return null;
    }

    public static void e(eu0 eu0Var, ut0 ut0Var) throws IOException {
        if (ut0Var == null || (ut0Var instanceof xt0)) {
            eu0Var.p();
            return;
        }
        if (ut0Var instanceof zt0) {
            zt0 zt0Var = (zt0) ut0Var;
            Serializable serializable = zt0Var.a;
            if (serializable instanceof Number) {
                eu0Var.A(zt0Var.b());
                return;
            } else if (serializable instanceof Boolean) {
                eu0Var.C(serializable instanceof Boolean ? ((Boolean) serializable).booleanValue() : Boolean.parseBoolean(zt0Var.c()));
                return;
            } else {
                eu0Var.B(zt0Var.c());
                return;
            }
        }
        boolean z = ut0Var instanceof pt0;
        if (z) {
            eu0Var.b();
            if (!z) {
                ur.c(ut0Var, "Not a JSON Array: ");
                return;
            }
            ArrayList arrayList = ((pt0) ut0Var).a;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                e(eu0Var, (ut0) obj);
            }
            eu0Var.j();
            return;
        }
        boolean z2 = ut0Var instanceof yt0;
        if (!z2) {
            uq1.l(ut0Var.getClass(), "Couldn't write ");
            return;
        }
        eu0Var.e();
        if (!z2) {
            ur.c(ut0Var, "Not a JSON Object: ");
            return;
        }
        Iterator it = ((dy0) ((yt0) ut0Var).a.entrySet()).iterator();
        while (((cy0) it).hasNext()) {
            ey0 ey0VarB = ((cy0) it).b();
            eu0Var.m((String) ey0VarB.getKey());
            e(eu0Var, (ut0) ey0VarB.getValue());
        }
        eu0Var.l();
    }

    @Override // defpackage.l02
    public final Object b(au0 au0Var) throws IOException {
        ut0 pt0Var;
        ut0 pt0Var2;
        int iR = au0Var.R();
        int iV = ts.v(iR);
        if (iV == 0) {
            au0Var.a();
            pt0Var = new pt0();
        } else if (iV != 2) {
            pt0Var = null;
        } else {
            au0Var.b();
            pt0Var = new yt0();
        }
        if (pt0Var == null) {
            return d(iR, au0Var);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (au0Var.p()) {
                String strB = pt0Var instanceof yt0 ? au0Var.B() : null;
                int iR2 = au0Var.R();
                int iV2 = ts.v(iR2);
                if (iV2 == 0) {
                    au0Var.a();
                    pt0Var2 = new pt0();
                } else if (iV2 != 2) {
                    pt0Var2 = null;
                } else {
                    au0Var.b();
                    pt0Var2 = new yt0();
                }
                boolean z = pt0Var2 != null;
                if (pt0Var2 == null) {
                    pt0Var2 = d(iR2, au0Var);
                }
                if (pt0Var instanceof pt0) {
                    ((pt0) pt0Var).a.add(pt0Var2);
                } else {
                    ((yt0) pt0Var).a.put(strB, pt0Var2);
                }
                if (z) {
                    arrayDeque.addLast(pt0Var);
                    pt0Var = pt0Var2;
                }
            } else {
                if (pt0Var instanceof pt0) {
                    au0Var.j();
                } else {
                    au0Var.l();
                }
                if (arrayDeque.isEmpty()) {
                    return pt0Var;
                }
                pt0Var = (ut0) arrayDeque.removeLast();
            }
        }
    }

    @Override // defpackage.l02
    public final /* bridge */ /* synthetic */ void c(eu0 eu0Var, Object obj) throws IOException {
        e(eu0Var, (ut0) obj);
    }
}
