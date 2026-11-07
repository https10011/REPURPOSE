package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class wc1 extends nb {
    public as1[] f;
    public as1[] g;
    public int h;
    public hd2 i;

    @Override // defpackage.nb
    public final as1 d(boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.h; i2++) {
            as1[] as1VarArr = this.f;
            as1 as1Var = as1VarArr[i2];
            if (!zArr[as1Var.b]) {
                hd2 hd2Var = this.i;
                hd2Var.b = as1Var;
                int i3 = 8;
                if (i != -1) {
                    as1 as1Var2 = as1VarArr[i];
                    while (i3 >= 0) {
                        float f = as1Var2.v[i3];
                        float f2 = ((as1) hd2Var.b).v[i3];
                        if (f2 != f) {
                            if (f2 >= f) {
                                break;
                            }
                            i = i2;
                            break;
                            break;
                        }
                        i3--;
                    }
                } else {
                    while (i3 >= 0) {
                        float f3 = ((as1) hd2Var.b).v[i3];
                        if (f3 > 0.0f) {
                            break;
                        }
                        if (f3 < 0.0f) {
                            i = i2;
                            break;
                        }
                        i3--;
                    }
                }
            }
        }
        if (i == -1) {
            return null;
        }
        return this.f[i];
    }

    @Override // defpackage.nb
    public final boolean e() {
        return this.h == 0;
    }

    @Override // defpackage.nb
    public final void i(zx0 zx0Var, nb nbVar, boolean z) {
        as1 as1Var = nbVar.a;
        if (as1Var == null) {
            return;
        }
        float[] fArr = as1Var.v;
        gb gbVar = nbVar.d;
        int iD = gbVar.d();
        for (int i = 0; i < iD; i++) {
            as1 as1VarE = gbVar.e(i);
            float f = gbVar.f(i);
            hd2 hd2Var = this.i;
            hd2Var.b = as1VarE;
            if (as1VarE.a) {
                boolean z2 = true;
                for (int i2 = 0; i2 < 9; i2++) {
                    float[] fArr2 = ((as1) hd2Var.b).v;
                    float f2 = (fArr[i2] * f) + fArr2[i2];
                    fArr2[i2] = f2;
                    if (Math.abs(f2) < 1.0E-4f) {
                        ((as1) hd2Var.b).v[i2] = 0.0f;
                    } else {
                        z2 = false;
                    }
                }
                if (z2) {
                    ((wc1) hd2Var.c).k((as1) hd2Var.b);
                }
            } else {
                for (int i3 = 0; i3 < 9; i3++) {
                    float f3 = fArr[i3];
                    if (f3 != 0.0f) {
                        float f4 = f3 * f;
                        if (Math.abs(f4) < 1.0E-4f) {
                            f4 = 0.0f;
                        }
                        ((as1) hd2Var.b).v[i3] = f4;
                    } else {
                        ((as1) hd2Var.b).v[i3] = 0.0f;
                    }
                }
                j(as1VarE);
            }
            this.b = (nbVar.b * f) + this.b;
        }
        k(as1Var);
    }

    public final void j(as1 as1Var) {
        int i;
        as1[] as1VarArr;
        int i2 = this.h + 1;
        as1[] as1VarArr2 = this.f;
        if (i2 > as1VarArr2.length) {
            as1[] as1VarArr3 = (as1[]) Arrays.copyOf(as1VarArr2, as1VarArr2.length * 2);
            this.f = as1VarArr3;
            this.g = (as1[]) Arrays.copyOf(as1VarArr3, as1VarArr3.length * 2);
        }
        as1[] as1VarArr4 = this.f;
        int i3 = this.h;
        as1VarArr4[i3] = as1Var;
        int i4 = i3 + 1;
        this.h = i4;
        if (i4 > 1 && as1VarArr4[i3].b > as1Var.b) {
            int i5 = 0;
            while (true) {
                i = this.h;
                as1VarArr = this.g;
                if (i5 >= i) {
                    break;
                }
                as1VarArr[i5] = this.f[i5];
                i5++;
            }
            Arrays.sort(as1VarArr, 0, i, new rs(5));
            for (int i6 = 0; i6 < this.h; i6++) {
                this.f[i6] = this.g[i6];
            }
        }
        as1Var.a = true;
        as1Var.a(this);
    }

    public final void k(as1 as1Var) {
        int i = 0;
        while (i < this.h) {
            if (this.f[i] == as1Var) {
                while (true) {
                    int i2 = this.h;
                    if (i >= i2 - 1) {
                        this.h = i2 - 1;
                        as1Var.a = false;
                        return;
                    } else {
                        as1[] as1VarArr = this.f;
                        int i3 = i + 1;
                        as1VarArr[i] = as1VarArr[i3];
                        i = i3;
                    }
                }
            } else {
                i++;
            }
        }
    }

    @Override // defpackage.nb
    public final String toString() {
        hd2 hd2Var = this.i;
        String str = " goal -> (" + this.b + ") : ";
        for (int i = 0; i < this.h; i++) {
            hd2Var.b = this.f[i];
            str = str + hd2Var + " ";
        }
        return str;
    }
}
