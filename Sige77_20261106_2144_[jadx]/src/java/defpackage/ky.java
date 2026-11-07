package defpackage;

import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class ky {
    public final Class a;
    public final List b;
    public final bj1 c;
    public final yb1 d;
    public final String e;

    public ky(Class cls, Class cls2, Class cls3, List list, bj1 bj1Var, yb1 yb1Var) {
        this.a = cls;
        this.b = list;
        this.c = bj1Var;
        this.d = yb1Var;
        this.e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    public final pi1 a(int i, int i2, f6 f6Var, vw vwVar, da1 da1Var) {
        pi1 pi1VarA;
        fz1 fz1Var;
        int iH;
        vi1 vi1VarP;
        pi1 pi1Var;
        boolean z;
        boolean z2;
        Object hwVar;
        String str;
        yb1 yb1Var = this.d;
        List list = (List) yb1Var.h();
        am2.p(list, "Argument must not be null");
        List list2 = list;
        try {
            pi1 pi1VarB = b(vwVar, i, i2, da1Var, list2);
            yb1Var.b(list2);
            jy jyVar = (jy) f6Var.c;
            int i3 = f6Var.b;
            hy hyVar = jyVar.a;
            Class<?> cls = pi1VarB.get().getClass();
            if (i3 != 4) {
                fz1 fz1VarE = hyVar.e(cls);
                fz1Var = fz1VarE;
                pi1VarA = fz1VarE.a(jyVar.v, pi1VarB, jyVar.Y, jyVar.Z);
            } else {
                pi1VarA = pi1VarB;
                fz1Var = null;
            }
            if (!pi1VarB.equals(pi1VarA)) {
                pi1VarB.e();
            }
            if (hyVar.c.a().d.p(pi1VarA.d()) != null) {
                vi1VarP = hyVar.c.a().d.p(pi1VarA.d());
                if (vi1VarP == null) {
                    throw new eh1(pi1VarA.d());
                }
                iH = vi1VarP.h(jyVar.b0);
            } else {
                iH = 3;
                vi1VarP = null;
            }
            hv0 hv0Var = jyVar.j0;
            ArrayList arrayListB = hyVar.b();
            int size = arrayListB.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size) {
                    pi1Var = null;
                    z = false;
                    break;
                }
                pi1Var = null;
                if (((d51) arrayListB.get(i4)).a.equals(hv0Var)) {
                    z = true;
                    break;
                }
                i4++;
            }
            switch (jyVar.a0.a) {
                default:
                    if (((!z && i3 == 3) || i3 == 1) && iH == 2) {
                        z2 = true;
                        break;
                    }
                case 0:
                case 1:
                    z2 = false;
                    break;
            }
            if (z2) {
                if (vi1VarP == null) {
                    throw new eh1(pi1VarA.get().getClass());
                }
                int iV = ts.v(iH);
                if (iV == 0) {
                    hwVar = new hw(jyVar.j0, jyVar.w);
                } else {
                    if (iV != 1) {
                        if (iH == 1) {
                            str = "SOURCE";
                        } else if (iH != 2) {
                            str = iH != 3 ? "null" : "NONE";
                        } else {
                            str = "TRANSFORMED";
                        }
                        e.g("Unknown strategy: ".concat(str));
                        return pi1Var;
                    }
                    hwVar = new ri1(hyVar.c.a, jyVar.j0, jyVar.w, jyVar.Y, jyVar.Z, fz1Var, cls, jyVar.b0);
                }
                yz0 yz0Var = (yz0) yz0.e.h();
                yz0Var.d = false;
                yz0Var.c = true;
                yz0Var.b = pi1VarA;
                ac2 ac2Var = jyVar.f;
                ac2Var.b = hwVar;
                ac2Var.c = vi1VarP;
                ac2Var.d = yz0Var;
                pi1VarA = yz0Var;
            }
            return this.c.f(pi1VarA, da1Var);
        } catch (Throwable th) {
            yb1Var.b(list2);
            throw th;
        }
    }

    public final pi1 b(vw vwVar, int i, int i2, da1 da1Var, List list) throws ej0 {
        List list2 = this.b;
        int size = list2.size();
        pi1 pi1VarA = null;
        for (int i3 = 0; i3 < size; i3++) {
            si1 si1Var = (si1) list2.get(i3);
            try {
                if (si1Var.b(vwVar.v(), da1Var)) {
                    pi1VarA = si1Var.a(vwVar.v(), i, i2, da1Var);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Log.v("DecodePath", "Failed to decode data for " + si1Var, e);
                }
                list.add(e);
            }
            if (pi1VarA != null) {
                break;
            }
        }
        if (pi1VarA != null) {
            return pi1VarA;
        }
        throw new ej0(this.e, new ArrayList(list));
    }

    public final String toString() {
        return "DecodePath{ dataClass=" + this.a + ", decoders=" + this.b + ", transcoder=" + this.c + '}';
    }
}
