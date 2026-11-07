package defpackage;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public abstract class ug1 extends l02 {
    public final wg1 a;

    public ug1(wg1 wg1Var) {
        this.a = wg1Var;
    }

    @Override // defpackage.l02
    public final Object b(au0 au0Var) throws IOException {
        if (au0Var.R() == 9) {
            au0Var.D();
            return null;
        }
        Object objD = d();
        Map map = this.a.a;
        try {
            au0Var.b();
            while (au0Var.p()) {
                tg1 tg1Var = (tg1) map.get(au0Var.B());
                if (tg1Var == null) {
                    au0Var.X();
                } else {
                    f(objD, au0Var, tg1Var);
                }
            }
            au0Var.l();
            return e(objD);
        } catch (IllegalAccessException e) {
            ta taVar = rg1.a;
            sm0.m("Unexpected IllegalAccessException occurred (Gson 2.14.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
            return null;
        } catch (IllegalStateException e2) {
            throw new wt0(4, e2);
        }
    }

    @Override // defpackage.l02
    public final void c(eu0 eu0Var, Object obj) throws IOException {
        if (obj == null) {
            eu0Var.p();
            return;
        }
        eu0Var.e();
        try {
            Iterator it = this.a.b.iterator();
            while (it.hasNext()) {
                ((tg1) it.next()).a(eu0Var, obj);
            }
            eu0Var.l();
        } catch (IllegalAccessException e) {
            ta taVar = rg1.a;
            sm0.m("Unexpected IllegalAccessException occurred (Gson 2.14.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
        }
    }

    public abstract Object d();

    public abstract Object e(Object obj);

    public abstract void f(Object obj, au0 au0Var, tg1 tg1Var);
}
