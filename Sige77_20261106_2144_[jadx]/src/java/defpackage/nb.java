package defpackage;

import com.hjq.toast.BuildConfig;
import java.util.ArrayList;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public class nb {
    public final gb d;
    public as1 a = null;
    public float b = 0.0f;
    public final ArrayList c = new ArrayList();
    public boolean e = false;

    public nb(ac2 ac2Var) {
        this.d = new gb(this, ac2Var);
    }

    public final void a(zx0 zx0Var, int i) {
        as1 as1VarJ = zx0Var.j(i);
        gb gbVar = this.d;
        gbVar.g(as1VarJ, 1.0f);
        gbVar.g(zx0Var.j(i), -1.0f);
    }

    public final void b(as1 as1Var, as1 as1Var2, as1 as1Var3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.b = i;
        }
        gb gbVar = this.d;
        if (z) {
            gbVar.g(as1Var, 1.0f);
            gbVar.g(as1Var2, -1.0f);
            gbVar.g(as1Var3, -1.0f);
        } else {
            gbVar.g(as1Var, -1.0f);
            gbVar.g(as1Var2, 1.0f);
            gbVar.g(as1Var3, 1.0f);
        }
    }

    public final void c(as1 as1Var, as1 as1Var2, as1 as1Var3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.b = i;
        }
        gb gbVar = this.d;
        if (z) {
            gbVar.g(as1Var, 1.0f);
            gbVar.g(as1Var2, -1.0f);
            gbVar.g(as1Var3, 1.0f);
        } else {
            gbVar.g(as1Var, -1.0f);
            gbVar.g(as1Var2, 1.0f);
            gbVar.g(as1Var3, -1.0f);
        }
    }

    public as1 d(boolean[] zArr) {
        return f(zArr, null);
    }

    public boolean e() {
        return this.a == null && this.b == 0.0f && this.d.d() == 0;
    }

    public final as1 f(boolean[] zArr, as1 as1Var) {
        int i;
        gb gbVar = this.d;
        int iD = gbVar.d();
        as1 as1Var2 = null;
        float f = 0.0f;
        for (int i2 = 0; i2 < iD; i2++) {
            float f2 = gbVar.f(i2);
            if (f2 < 0.0f) {
                as1 as1VarE = gbVar.e(i2);
                if ((zArr == null || !zArr[as1VarE.b]) && as1VarE != as1Var && (((i = as1VarE.Y) == 3 || i == 4) && f2 < f)) {
                    f = f2;
                    as1Var2 = as1VarE;
                }
            }
        }
        return as1Var2;
    }

    public final void g(as1 as1Var) {
        as1 as1Var2 = this.a;
        gb gbVar = this.d;
        if (as1Var2 != null) {
            gbVar.g(as1Var2, -1.0f);
            this.a.c = -1;
            this.a = null;
        }
        float fH = gbVar.h(as1Var, true) * (-1.0f);
        this.a = as1Var;
        if (fH == 1.0f) {
            return;
        }
        this.b /= fH;
        int i = gbVar.h;
        for (int i2 = 0; i != -1 && i2 < gbVar.a; i2++) {
            float[] fArr = gbVar.g;
            fArr[i] = fArr[i] / fH;
            i = gbVar.f[i];
        }
    }

    public final void h(zx0 zx0Var, as1 as1Var, boolean z) {
        if (as1Var.f) {
            gb gbVar = this.d;
            float fC = gbVar.c(as1Var);
            this.b = (as1Var.e * fC) + this.b;
            gbVar.h(as1Var, z);
            if (z) {
                as1Var.b(this);
            }
            if (gbVar.d() == 0) {
                this.e = true;
                zx0Var.a = true;
            }
        }
    }

    public void i(zx0 zx0Var, nb nbVar, boolean z) {
        gb gbVar = this.d;
        gbVar.getClass();
        float fC = gbVar.c(nbVar.a);
        gbVar.h(nbVar.a, z);
        gb gbVar2 = nbVar.d;
        int iD = gbVar2.d();
        for (int i = 0; i < iD; i++) {
            as1 as1VarE = gbVar2.e(i);
            gbVar.a(as1VarE, gbVar2.c(as1VarE) * fC, z);
        }
        this.b = (nbVar.b * fC) + this.b;
        if (z) {
            nbVar.a.b(this);
        }
        if (this.a == null || gbVar.d() != 0) {
            return;
        }
        this.e = true;
        zx0Var.a = true;
    }

    public String toString() {
        boolean z;
        String strConcat = (this.a == null ? "0" : BuildConfig.FLAVOR + this.a).concat(" = ");
        if (this.b != 0.0f) {
            StringBuilder sbM = ts.m(strConcat);
            sbM.append(this.b);
            strConcat = sbM.toString();
            z = true;
        } else {
            z = false;
        }
        gb gbVar = this.d;
        int iD = gbVar.d();
        for (int i = 0; i < iD; i++) {
            as1 as1VarE = gbVar.e(i);
            if (as1VarE != null) {
                float f = gbVar.f(i);
                if (f != 0.0f) {
                    String string = as1VarE.toString();
                    if (z) {
                        if (f > 0.0f) {
                            strConcat = strConcat.concat(" + ");
                        } else {
                            strConcat = strConcat.concat(" - ");
                            f *= -1.0f;
                        }
                    } else if (f < 0.0f) {
                        strConcat = strConcat.concat("- ");
                        f *= -1.0f;
                    }
                    strConcat = f == 1.0f ? strConcat.concat(string) : strConcat + f + " " + string;
                    z = true;
                }
            }
        }
        return !z ? strConcat.concat("0.0") : strConcat;
    }
}
