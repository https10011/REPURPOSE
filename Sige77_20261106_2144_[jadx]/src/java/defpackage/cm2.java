package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class cm2 implements rn2 {
    public final dm2 a;

    static {
        vl2 vl2Var = vl2.b;
        int i = yk2.a;
    }

    public cm2(dm2 dm2Var) {
        this.a = dm2Var;
    }

    public final dm2 a(InputStream inputStream, vl2 vl2Var) throws xm2 {
        ll2 ll2VarH = ll2.h(inputStream, 4096);
        int i = dm2.zzd;
        dm2 dm2VarI = this.a.i();
        try {
            yn2 yn2VarA = un2.c.a(dm2VarI.getClass());
            we weVar = ll2VarH.c;
            if (weVar == null) {
                weVar = new we(ll2VarH);
            }
            yn2VarA.e(dm2VarI, weVar, vl2Var);
            yn2VarA.f(dm2VarI);
            ll2VarH.m(0);
            if (dm2.q(dm2VarI, true)) {
                return dm2VarI;
            }
            throw new eo2().a();
        } catch (eo2 e) {
            throw e.a();
        } catch (xm2 e2) {
            if (e2.a) {
                throw new xm2(e2.getMessage(), e2);
            }
            throw e2;
        } catch (IOException e3) {
            if (e3.getCause() instanceof xm2) {
                throw ((xm2) e3.getCause());
            }
            throw new xm2(e3.getMessage(), e3);
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof xm2) {
                throw ((xm2) e4.getCause());
            }
            throw e4;
        }
    }
}
