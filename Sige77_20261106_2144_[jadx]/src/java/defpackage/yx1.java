package defpackage;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.TypeIntrinsics;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public abstract class yx1 {
    public static final Object a(long j, Function2 function2, gs gsVar) {
        Object vpVar;
        Object objE;
        if (j <= 0) {
            throw new wx1("Timed out immediately", null);
        }
        xx1 xx1Var = new xx1(j, gsVar);
        ye1.q(xx1Var, true, new o20(x91.u(xx1Var.f.getContext()).b(xx1Var.i, xx1Var, xx1Var.e)));
        try {
            vpVar = ((Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(function2, 2)).invoke(xx1Var, xx1Var);
        } catch (Throwable th) {
            vpVar = new vp(th, false);
        }
        ft ftVar = ft.a;
        if (vpVar == ftVar || (objE = xx1Var.E(vpVar)) == yv2.b) {
            return ftVar;
        }
        if (objE instanceof vp) {
            Throwable th2 = ((vp) objE).a;
            if (!(th2 instanceof wx1) || ((wx1) th2).a != xx1Var) {
                throw th2;
            }
            if (vpVar instanceof vp) {
                throw ((vp) vpVar).a;
            }
        } else {
            vpVar = yv2.W(objE);
        }
        return vpVar;
    }
}
