package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class zx0 {
    public static boolean p = false;
    public static int q = 1000;
    public final wc1 c;
    public nb[] f;
    public final ac2 l;
    public nb o;
    public boolean a = false;
    public int b = 0;
    public int d = 32;
    public int e = 32;
    public boolean g = false;
    public boolean[] h = new boolean[32];
    public int i = 1;
    public int j = 0;
    public int k = 32;
    public as1[] m = new as1[q];
    public int n = 0;

    public zx0() {
        this.f = null;
        this.f = new nb[32];
        s();
        ac2 ac2Var = new ac2(9);
        ac2Var.b = new zb1();
        ac2Var.c = new zb1();
        ac2Var.d = new as1[32];
        this.l = ac2Var;
        wc1 wc1Var = new wc1(ac2Var);
        wc1Var.f = new as1[128];
        wc1Var.g = new as1[128];
        wc1Var.h = 0;
        wc1Var.i = new hd2(wc1Var);
        this.c = wc1Var;
        this.o = new nb(ac2Var);
    }

    public static int n(Object obj) {
        as1 as1Var = ((cr) obj).i;
        if (as1Var != null) {
            return (int) (as1Var.e + 0.5f);
        }
        return 0;
    }

    public final as1 a(int i) {
        zb1 zb1Var = (zb1) this.l.c;
        int i2 = zb1Var.b;
        Object obj = null;
        if (i2 > 0) {
            int i3 = i2 - 1;
            Object[] objArr = zb1Var.a;
            Object obj2 = objArr[i3];
            objArr[i3] = null;
            zb1Var.b = i3;
            obj = obj2;
        }
        as1 as1Var = (as1) obj;
        if (as1Var == null) {
            as1Var = new as1(i);
            as1Var.Y = i;
        } else {
            as1Var.c();
            as1Var.Y = i;
        }
        int i4 = this.n;
        int i5 = q;
        if (i4 >= i5) {
            int i6 = i5 * 2;
            q = i6;
            this.m = (as1[]) Arrays.copyOf(this.m, i6);
        }
        as1[] as1VarArr = this.m;
        int i7 = this.n;
        this.n = i7 + 1;
        as1VarArr[i7] = as1Var;
        return as1Var;
    }

    public final void b(as1 as1Var, as1 as1Var2, int i, float f, as1 as1Var3, as1 as1Var4, int i2, int i3) {
        nb nbVarL = l();
        if (as1Var2 == as1Var3) {
            nbVarL.d.g(as1Var, 1.0f);
            nbVarL.d.g(as1Var4, 1.0f);
            nbVarL.d.g(as1Var2, -2.0f);
        } else {
            gb gbVar = nbVarL.d;
            if (f == 0.5f) {
                gbVar.g(as1Var, 1.0f);
                nbVarL.d.g(as1Var2, -1.0f);
                nbVarL.d.g(as1Var3, -1.0f);
                nbVarL.d.g(as1Var4, 1.0f);
                if (i > 0 || i2 > 0) {
                    nbVarL.b = (-i) + i2;
                }
            } else if (f <= 0.0f) {
                gbVar.g(as1Var, -1.0f);
                nbVarL.d.g(as1Var2, 1.0f);
                nbVarL.b = i;
            } else if (f >= 1.0f) {
                gbVar.g(as1Var4, -1.0f);
                nbVarL.d.g(as1Var3, 1.0f);
                nbVarL.b = -i2;
            } else {
                float f2 = 1.0f - f;
                gbVar.g(as1Var, f2 * 1.0f);
                nbVarL.d.g(as1Var2, f2 * (-1.0f));
                nbVarL.d.g(as1Var3, (-1.0f) * f);
                nbVarL.d.g(as1Var4, 1.0f * f);
                if (i > 0 || i2 > 0) {
                    nbVarL.b = (i2 * f) + ((-i) * f2);
                }
            }
        }
        if (i3 != 8) {
            nbVarL.a(this, i3);
        }
        c(nbVarL);
    }

    /* JADX WARN: Code duplicated, block: B:119:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:75:0x00f5  */
    public final void c(nb nbVar) {
        boolean z;
        boolean z2;
        as1 as1VarF;
        if (this.j + 1 >= this.k || this.i + 1 >= this.e) {
            o();
        }
        if (nbVar.e) {
            z = false;
        } else {
            ArrayList arrayList = nbVar.c;
            if (this.f.length != 0) {
                boolean z3 = false;
                while (!z3) {
                    int iD = nbVar.d.d();
                    for (int i = 0; i < iD; i++) {
                        as1 as1VarE = nbVar.d.e(i);
                        if (as1VarE.c != -1 || as1VarE.f) {
                            arrayList.add(as1VarE);
                        }
                    }
                    int size = arrayList.size();
                    if (size > 0) {
                        for (int i2 = 0; i2 < size; i2++) {
                            as1 as1Var = (as1) arrayList.get(i2);
                            if (as1Var.f) {
                                nbVar.h(this, as1Var, true);
                            } else {
                                nbVar.i(this, this.f[as1Var.c], true);
                            }
                        }
                        arrayList.clear();
                    } else {
                        z3 = true;
                    }
                }
                if (nbVar.a != null && nbVar.d.d() == 0) {
                    nbVar.e = true;
                    this.a = true;
                }
            }
            if (nbVar.e()) {
                return;
            }
            float f = nbVar.b;
            float f2 = 0.0f;
            if (f < 0.0f) {
                nbVar.b = f * (-1.0f);
                gb gbVar = nbVar.d;
                int i3 = gbVar.h;
                for (int i4 = 0; i3 != -1 && i4 < gbVar.a; i4++) {
                    float[] fArr = gbVar.g;
                    fArr[i3] = fArr[i3] * (-1.0f);
                    i3 = gbVar.f[i3];
                }
            }
            int iD2 = nbVar.d.d();
            float f3 = 0.0f;
            float f4 = 0.0f;
            as1 as1Var2 = null;
            as1 as1Var3 = null;
            int i5 = 0;
            boolean z4 = false;
            boolean z5 = false;
            while (i5 < iD2) {
                float f5 = nbVar.d.f(i5);
                as1 as1VarE2 = nbVar.d.e(i5);
                float f6 = f2;
                if (as1VarE2.Y == 1) {
                    if (as1Var2 == null) {
                        if (as1VarE2.X <= 1) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        as1Var2 = as1VarE2;
                        f3 = f5;
                    } else {
                        if (f3 > f5) {
                            if (as1VarE2.X > 1) {
                                z4 = false;
                            }
                            as1Var2 = as1VarE2;
                            f3 = f5;
                        } else if (z4 || as1VarE2.X > 1) {
                        }
                        z4 = true;
                        as1Var2 = as1VarE2;
                        f3 = f5;
                    }
                } else if (as1Var2 == null && f5 < f6) {
                    if (as1Var3 == null) {
                        if (as1VarE2.X <= 1) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        as1Var3 = as1VarE2;
                        f4 = f5;
                    } else {
                        if (f4 > f5) {
                            if (as1VarE2.X > 1) {
                                z5 = false;
                            }
                            as1Var3 = as1VarE2;
                            f4 = f5;
                        } else if (z5 || as1VarE2.X > 1) {
                        }
                        z5 = true;
                        as1Var3 = as1VarE2;
                        f4 = f5;
                    }
                }
                i5++;
                f2 = f6;
            }
            float f7 = f2;
            if (as1Var2 == null) {
                as1Var2 = as1Var3;
            }
            if (as1Var2 == null) {
                z2 = true;
            } else {
                nbVar.g(as1Var2);
                z2 = false;
            }
            if (nbVar.d.d() == 0) {
                nbVar.e = true;
            }
            if (z2) {
                if (this.i + 1 >= this.e) {
                    o();
                }
                as1 as1VarA = a(3);
                int i6 = this.b + 1;
                this.b = i6;
                this.i++;
                as1VarA.b = i6;
                ac2 ac2Var = this.l;
                ((as1[]) ac2Var.d)[i6] = as1VarA;
                nbVar.a = as1VarA;
                int i7 = this.j;
                h(nbVar);
                if (this.j == i7 + 1) {
                    nb nbVar2 = this.o;
                    nbVar2.a = null;
                    nbVar2.d.b();
                    for (int i8 = 0; i8 < nbVar.d.d(); i8++) {
                        nbVar2.d.a(nbVar.d.e(i8), nbVar.d.f(i8), true);
                    }
                    r(this.o);
                    if (as1VarA.c == -1) {
                        if (nbVar.a == as1VarA && (as1VarF = nbVar.f(null, as1VarA)) != null) {
                            nbVar.g(as1VarF);
                        }
                        if (!nbVar.e) {
                            nbVar.a.e(this, nbVar);
                        }
                        ((zb1) ac2Var.b).a(nbVar);
                        this.j--;
                    }
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            as1 as1Var4 = nbVar.a;
            if (as1Var4 == null) {
                return;
            }
            if (as1Var4.Y != 1 && nbVar.b < f7) {
                return;
            }
        }
        if (z) {
            return;
        }
        h(nbVar);
    }

    public final void d(as1 as1Var, int i) {
        int i2 = as1Var.c;
        if (i2 == -1) {
            as1Var.d(this, i);
            for (int i3 = 0; i3 < this.b + 1; i3++) {
                as1 as1Var2 = ((as1[]) this.l.d)[i3];
            }
            return;
        }
        if (i2 == -1) {
            nb nbVarL = l();
            nbVarL.a = as1Var;
            float f = i;
            as1Var.e = f;
            nbVarL.b = f;
            nbVarL.e = true;
            c(nbVarL);
            return;
        }
        nb nbVar = this.f[i2];
        if (nbVar.e) {
            nbVar.b = i;
            return;
        }
        if (nbVar.d.d() == 0) {
            nbVar.e = true;
            nbVar.b = i;
            return;
        }
        nb nbVarL2 = l();
        if (i < 0) {
            nbVarL2.b = i * (-1);
            nbVarL2.d.g(as1Var, 1.0f);
        } else {
            nbVarL2.b = i;
            nbVarL2.d.g(as1Var, -1.0f);
        }
        c(nbVarL2);
    }

    public final void e(as1 as1Var, as1 as1Var2, int i, int i2) {
        if (i2 == 8 && as1Var2.f && as1Var.c == -1) {
            as1Var.d(this, as1Var2.e + i);
            return;
        }
        nb nbVarL = l();
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            nbVarL.b = i;
        }
        gb gbVar = nbVarL.d;
        if (z) {
            gbVar.g(as1Var, 1.0f);
            nbVarL.d.g(as1Var2, -1.0f);
        } else {
            gbVar.g(as1Var, -1.0f);
            nbVarL.d.g(as1Var2, 1.0f);
        }
        if (i2 != 8) {
            nbVarL.a(this, i2);
        }
        c(nbVarL);
    }

    public final void f(as1 as1Var, as1 as1Var2, int i, int i2) {
        nb nbVarL = l();
        as1 as1VarM = m();
        as1VarM.d = 0;
        nbVarL.b(as1Var, as1Var2, as1VarM, i);
        if (i2 != 8) {
            nbVarL.d.g(j(i2), (int) (nbVarL.d.c(as1VarM) * (-1.0f)));
        }
        c(nbVarL);
    }

    public final void g(as1 as1Var, as1 as1Var2, int i, int i2) {
        nb nbVarL = l();
        as1 as1VarM = m();
        as1VarM.d = 0;
        nbVarL.c(as1Var, as1Var2, as1VarM, i);
        if (i2 != 8) {
            nbVarL.d.g(j(i2), (int) (nbVarL.d.c(as1VarM) * (-1.0f)));
        }
        c(nbVarL);
    }

    public final void h(nb nbVar) {
        int i;
        if (nbVar.e) {
            nbVar.a.d(this, nbVar.b);
        } else {
            nb[] nbVarArr = this.f;
            int i2 = this.j;
            nbVarArr[i2] = nbVar;
            as1 as1Var = nbVar.a;
            as1Var.c = i2;
            this.j = i2 + 1;
            as1Var.e(this, nbVar);
        }
        if (this.a) {
            int i3 = 0;
            while (i3 < this.j) {
                if (this.f[i3] == null) {
                    System.out.println("WTF");
                }
                nb nbVar2 = this.f[i3];
                if (nbVar2 != null && nbVar2.e) {
                    nbVar2.a.d(this, nbVar2.b);
                    ((zb1) this.l.b).a(nbVar2);
                    this.f[i3] = null;
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (true) {
                        i = this.j;
                        if (i4 >= i) {
                            break;
                        }
                        nb[] nbVarArr2 = this.f;
                        int i6 = i4 - 1;
                        nb nbVar3 = nbVarArr2[i4];
                        nbVarArr2[i6] = nbVar3;
                        as1 as1Var2 = nbVar3.a;
                        if (as1Var2.c == i4) {
                            as1Var2.c = i6;
                        }
                        i5 = i4;
                        i4++;
                    }
                    if (i5 < i) {
                        this.f[i5] = null;
                    }
                    this.j = i - 1;
                    i3--;
                }
                i3++;
            }
            this.a = false;
        }
    }

    public final void i() {
        for (int i = 0; i < this.j; i++) {
            nb nbVar = this.f[i];
            nbVar.a.e = nbVar.b;
        }
    }

    public final as1 j(int i) {
        if (this.i + 1 >= this.e) {
            o();
        }
        as1 as1VarA = a(4);
        float[] fArr = as1VarA.v;
        int i2 = this.b + 1;
        this.b = i2;
        this.i++;
        as1VarA.b = i2;
        as1VarA.d = i;
        ((as1[]) this.l.d)[i2] = as1VarA;
        wc1 wc1Var = this.c;
        wc1Var.i.b = as1VarA;
        Arrays.fill(fArr, 0.0f);
        fArr[as1VarA.d] = 1.0f;
        wc1Var.j(as1VarA);
        return as1VarA;
    }

    public final as1 k(Object obj) {
        if (obj == null) {
            return null;
        }
        if (this.i + 1 >= this.e) {
            o();
        }
        if (!(obj instanceof cr)) {
            return null;
        }
        cr crVar = (cr) obj;
        as1 as1Var = crVar.i;
        if (as1Var == null) {
            crVar.k();
            as1Var = crVar.i;
        }
        int i = as1Var.b;
        ac2 ac2Var = this.l;
        if (i != -1 && i <= this.b && ((as1[]) ac2Var.d)[i] != null) {
            return as1Var;
        }
        if (i != -1) {
            as1Var.c();
        }
        int i2 = this.b + 1;
        this.b = i2;
        this.i++;
        as1Var.b = i2;
        as1Var.Y = 1;
        ((as1[]) ac2Var.d)[i2] = as1Var;
        return as1Var;
    }

    public final nb l() {
        Object obj;
        ac2 ac2Var = this.l;
        zb1 zb1Var = (zb1) ac2Var.b;
        int i = zb1Var.b;
        if (i > 0) {
            int i2 = i - 1;
            Object[] objArr = zb1Var.a;
            obj = objArr[i2];
            objArr[i2] = null;
            zb1Var.b = i2;
        } else {
            obj = null;
        }
        nb nbVar = (nb) obj;
        if (nbVar == null) {
            return new nb(ac2Var);
        }
        nbVar.a = null;
        nbVar.d.b();
        nbVar.b = 0.0f;
        nbVar.e = false;
        return nbVar;
    }

    public final as1 m() {
        if (this.i + 1 >= this.e) {
            o();
        }
        as1 as1VarA = a(3);
        int i = this.b + 1;
        this.b = i;
        this.i++;
        as1VarA.b = i;
        ((as1[]) this.l.d)[i] = as1VarA;
        return as1VarA;
    }

    public final void o() {
        int i = this.d * 2;
        this.d = i;
        this.f = (nb[]) Arrays.copyOf(this.f, i);
        ac2 ac2Var = this.l;
        ac2Var.d = (as1[]) Arrays.copyOf((as1[]) ac2Var.d, this.d);
        int i2 = this.d;
        this.h = new boolean[i2];
        this.e = i2;
        this.k = i2;
    }

    public final void p() {
        wc1 wc1Var = this.c;
        if (wc1Var.e()) {
            i();
            return;
        }
        if (!this.g) {
            q(wc1Var);
            return;
        }
        for (int i = 0; i < this.j; i++) {
            if (!this.f[i].e) {
                q(wc1Var);
                return;
            }
        }
        i();
    }

    public final void q(wc1 wc1Var) {
        for (int i = 0; i < this.j; i++) {
            nb nbVar = this.f[i];
            int i2 = 1;
            if (nbVar.a.Y != 1) {
                float f = 0.0f;
                if (nbVar.b < 0.0f) {
                    boolean z = false;
                    int i3 = 0;
                    while (!z) {
                        i3 += i2;
                        float f2 = Float.MAX_VALUE;
                        int i4 = -1;
                        int i5 = -1;
                        int i6 = 0;
                        int i7 = 0;
                        while (i6 < this.j) {
                            nb nbVar2 = this.f[i6];
                            if (nbVar2.a.Y != i2 && !nbVar2.e && nbVar2.b < f) {
                                int iD = nbVar2.d.d();
                                int i8 = 0;
                                while (i8 < iD) {
                                    as1 as1VarE = nbVar2.d.e(i8);
                                    float fC = nbVar2.d.c(as1VarE);
                                    if (fC > f) {
                                        for (int i9 = 0; i9 < 9; i9++) {
                                            float f3 = as1VarE.i[i9] / fC;
                                            if ((f3 < f2 && i9 == i7) || i9 > i7) {
                                                i7 = i9;
                                                i5 = as1VarE.b;
                                                i4 = i6;
                                                f2 = f3;
                                            }
                                        }
                                    }
                                    i8++;
                                    f = 0.0f;
                                }
                            }
                            i6++;
                            f = 0.0f;
                            i2 = 1;
                        }
                        if (i4 != -1) {
                            nb nbVar3 = this.f[i4];
                            nbVar3.a.c = -1;
                            nbVar3.g(((as1[]) this.l.d)[i5]);
                            as1 as1Var = nbVar3.a;
                            as1Var.c = i4;
                            as1Var.e(this, nbVar3);
                        } else {
                            z = true;
                        }
                        if (i3 > this.i / 2) {
                            z = true;
                        }
                        f = 0.0f;
                        i2 = 1;
                    }
                    break;
                }
            }
        }
        r(wc1Var);
        i();
    }

    public final void r(nb nbVar) {
        boolean z;
        int i = 0;
        for (int i2 = 0; i2 < this.i; i2++) {
            this.h[i2] = false;
        }
        boolean z2 = false;
        int i3 = 0;
        while (!z2) {
            i3++;
            if (i3 >= this.i * 2) {
                return;
            }
            as1 as1Var = nbVar.a;
            if (as1Var != null) {
                this.h[as1Var.b] = true;
            }
            as1 as1VarD = nbVar.d(this.h);
            if (as1VarD != null) {
                boolean[] zArr = this.h;
                int i4 = as1VarD.b;
                if (zArr[i4]) {
                    return;
                } else {
                    zArr[i4] = true;
                }
            }
            if (as1VarD != null) {
                float f = Float.MAX_VALUE;
                int i5 = i;
                int i6 = -1;
                while (i5 < this.j) {
                    nb nbVar2 = this.f[i5];
                    if (nbVar2.a.Y != 1 && !nbVar2.e) {
                        gb gbVar = nbVar2.d;
                        int i7 = gbVar.h;
                        if (i7 == -1) {
                            z = false;
                            break;
                        }
                        int i8 = i;
                        while (true) {
                            if (i7 == -1 || i8 >= gbVar.a) {
                                z = false;
                                break;
                            } else if (gbVar.e[i7] == as1VarD.b) {
                                z = true;
                                break;
                            } else {
                                i7 = gbVar.f[i7];
                                i8++;
                            }
                        }
                        if (z) {
                            float fC = nbVar2.d.c(as1VarD);
                            if (fC < 0.0f) {
                                float f2 = (-nbVar2.b) / fC;
                                if (f2 < f) {
                                    i6 = i5;
                                    f = f2;
                                }
                            }
                        }
                    }
                    i5++;
                    i = 0;
                }
                if (i6 > -1) {
                    nb nbVar3 = this.f[i6];
                    nbVar3.a.c = -1;
                    nbVar3.g(as1VarD);
                    as1 as1Var2 = nbVar3.a;
                    as1Var2.c = i6;
                    as1Var2.e(this, nbVar3);
                }
            } else {
                z2 = true;
            }
            i = 0;
        }
    }

    public final void s() {
        for (int i = 0; i < this.j; i++) {
            nb nbVar = this.f[i];
            if (nbVar != null) {
                ((zb1) this.l.b).a(nbVar);
            }
            this.f[i] = null;
        }
    }

    public final void t() {
        ac2 ac2Var;
        int i = 0;
        while (true) {
            ac2Var = this.l;
            as1[] as1VarArr = (as1[]) ac2Var.d;
            if (i >= as1VarArr.length) {
                break;
            }
            as1 as1Var = as1VarArr[i];
            if (as1Var != null) {
                as1Var.c();
            }
            i++;
        }
        zb1 zb1Var = (zb1) ac2Var.c;
        as1[] as1VarArr2 = this.m;
        int length = this.n;
        zb1Var.getClass();
        if (length > as1VarArr2.length) {
            length = as1VarArr2.length;
        }
        for (int i2 = 0; i2 < length; i2++) {
            as1 as1Var2 = as1VarArr2[i2];
            int i3 = zb1Var.b;
            Object[] objArr = zb1Var.a;
            if (i3 < objArr.length) {
                objArr[i3] = as1Var2;
                zb1Var.b = i3 + 1;
            }
        }
        this.n = 0;
        Arrays.fill((as1[]) ac2Var.d, (Object) null);
        this.b = 0;
        wc1 wc1Var = this.c;
        wc1Var.h = 0;
        wc1Var.b = 0.0f;
        this.i = 1;
        for (int i4 = 0; i4 < this.j; i4++) {
            nb nbVar = this.f[i4];
        }
        s();
        this.j = 0;
        this.o = new nb(ac2Var);
    }
}
