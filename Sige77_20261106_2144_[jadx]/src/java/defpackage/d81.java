package defpackage;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class d81 extends l02 {
    public static final c81 c = new c81(1);
    public final uk0 a;
    public final int b;

    public d81(uk0 uk0Var, int i) {
        this.a = uk0Var;
        this.b = i;
    }

    @Override // defpackage.l02
    public final Object b(au0 au0Var) throws IOException {
        Object arrayList;
        Serializable arrayList2;
        int iR = au0Var.R();
        int iV = ts.v(iR);
        if (iV == 0) {
            au0Var.a();
            arrayList = new ArrayList();
        } else if (iV != 2) {
            arrayList = null;
        } else {
            au0Var.b();
            arrayList = new fy0(true);
        }
        if (arrayList == null) {
            return d(iR, au0Var);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (au0Var.p()) {
                String strB = arrayList instanceof Map ? au0Var.B() : null;
                int iR2 = au0Var.R();
                int iV2 = ts.v(iR2);
                if (iV2 == 0) {
                    au0Var.a();
                    arrayList2 = new ArrayList();
                } else if (iV2 != 2) {
                    arrayList2 = null;
                } else {
                    au0Var.b();
                    arrayList2 = new fy0(true);
                }
                boolean z = arrayList2 != null;
                if (arrayList2 == null) {
                    arrayList2 = d(iR2, au0Var);
                }
                if (arrayList instanceof List) {
                    ((List) arrayList).add(arrayList2);
                } else {
                    ((Map) arrayList).put(strB, arrayList2);
                }
                if (z) {
                    arrayDeque.addLast(arrayList);
                    arrayList = arrayList2;
                }
            } else {
                if (arrayList instanceof List) {
                    au0Var.j();
                } else {
                    au0Var.l();
                }
                if (arrayDeque.isEmpty()) {
                    return arrayList;
                }
                arrayList = arrayDeque.removeLast();
            }
        }
    }

    @Override // defpackage.l02
    public final void c(eu0 eu0Var, Object obj) throws IOException {
        if (obj == null) {
            eu0Var.p();
            return;
        }
        Class<?> cls = obj.getClass();
        uk0 uk0Var = this.a;
        uk0Var.getClass();
        l02 l02VarB = uk0Var.b(new s12(cls));
        if (!(l02VarB instanceof d81)) {
            l02VarB.c(eu0Var, obj);
        } else {
            eu0Var.e();
            eu0Var.l();
        }
    }

    public final Serializable d(int i, au0 au0Var) throws IOException {
        int iV = ts.v(i);
        if (iV == 5) {
            return au0Var.M();
        }
        if (iV == 6) {
            return ck1.d(this.b, au0Var);
        }
        if (iV == 7) {
            return Boolean.valueOf(au0Var.t());
        }
        if (iV == 8) {
            au0Var.D();
            return null;
        }
        uq1.q("Unexpected token: ".concat(y00.p(i)));
        return null;
    }
}
