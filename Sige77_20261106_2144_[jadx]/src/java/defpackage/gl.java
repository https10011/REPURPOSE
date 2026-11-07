package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class gl extends l82 {
    public final ArrayList k;
    public int l;

    public gl(qr qrVar, int i) {
        qr qrVar2;
        super(qrVar);
        ArrayList arrayList = new ArrayList();
        this.k = arrayList;
        this.f = i;
        qr qrVar3 = this.b;
        qr qrVarM = qrVar3.m(i);
        while (true) {
            qrVar2 = qrVar3;
            qrVar3 = qrVarM;
            if (qrVar3 == null) {
                break;
            } else {
                qrVarM = qrVar3.m(this.f);
            }
        }
        this.b = qrVar2;
        int i2 = this.f;
        arrayList.add(i2 == 0 ? qrVar2.d : i2 == 1 ? qrVar2.e : null);
        qr qrVarL = qrVar2.l(this.f);
        while (qrVarL != null) {
            int i3 = this.f;
            arrayList.add(i3 == 0 ? qrVarL.d : i3 == 1 ? qrVarL.e : null);
            qrVarL = qrVarL.l(this.f);
        }
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            l82 l82Var = (l82) obj;
            int i5 = this.f;
            if (i5 == 0) {
                l82Var.b.b = this;
            } else if (i5 == 1) {
                l82Var.b.c = this;
            }
        }
        if (this.f == 0 && ((rr) this.b.S).u0 && arrayList.size() > 1) {
            this.b = ((l82) arrayList.get(arrayList.size() - 1)).b;
        }
        int i6 = this.f;
        qr qrVar4 = this.b;
        this.l = i6 == 0 ? qrVar4.h0 : qrVar4.i0;
    }

    /* JADX WARN: Code duplicated, block: B:293:0x00e8 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:64:0x00da  */
    /* JADX WARN: Code duplicated, block: B:65:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:67:0x00e0 A[ADDED_TO_REGION] */
    @Override // defpackage.v00
    public final void a(v00 v00Var) {
        int i;
        int i2;
        boolean z;
        float f;
        int i3;
        int i4;
        int i5;
        int i6;
        float f2;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        float f3;
        z00 z00Var = this.h;
        if (z00Var.j) {
            z00 z00Var2 = this.i;
            if (z00Var2.j) {
                qr qrVar = this.b.S;
                boolean z2 = qrVar instanceof rr ? ((rr) qrVar).u0 : false;
                int i13 = z00Var2.g - z00Var.g;
                ArrayList arrayList = this.k;
                int size = arrayList.size();
                int i14 = 0;
                while (true) {
                    i = -1;
                    i2 = 8;
                    if (i14 >= size) {
                        i14 = -1;
                        break;
                    } else if (((l82) arrayList.get(i14)).b.f0 != 8) {
                        break;
                    } else {
                        i14++;
                    }
                }
                int i15 = size - 1;
                for (int i16 = i15; i16 >= 0; i16--) {
                    if (((l82) arrayList.get(i16)).b.f0 != 8) {
                        i = i16;
                        break;
                    }
                }
                int i17 = 0;
                while (true) {
                    if (i17 >= 2) {
                        z = z2;
                        f = 0.0f;
                        i3 = 0;
                        i4 = 0;
                        i5 = 0;
                        break;
                    }
                    f = 0.0f;
                    int i18 = 0;
                    i5 = 0;
                    int i19 = 0;
                    int i20 = 0;
                    while (i18 < size) {
                        l82 l82Var = (l82) arrayList.get(i18);
                        qr qrVar2 = l82Var.b;
                        boolean z3 = z2;
                        if (qrVar2.f0 == i2) {
                            i11 = i17;
                        } else {
                            i20++;
                            if (i18 > 0 && i18 >= i14) {
                                i5 += l82Var.h.f;
                            }
                            s10 s10Var = l82Var.e;
                            int i21 = s10Var.g;
                            i11 = i17;
                            boolean z4 = l82Var.d != 3;
                            if (z4) {
                                int i22 = this.f;
                                if (i22 == 0 && !qrVar2.d.e.j) {
                                    return;
                                }
                                if (i22 == 1 && !qrVar2.e.e.j) {
                                    return;
                                }
                            } else {
                                if (l82Var.a == 1 && i11 == 0) {
                                    i12 = s10Var.m;
                                    i19++;
                                } else {
                                    if (s10Var.j) {
                                        i12 = i21;
                                    }
                                    if (z4) {
                                        i5 += i12;
                                    } else {
                                        i19++;
                                        f3 = qrVar2.j0[this.f];
                                        if (f3 >= 0.0f) {
                                            f += f3;
                                        }
                                    }
                                    if (i18 >= i15 && i18 < i) {
                                        i5 += -l82Var.i.f;
                                    }
                                }
                                z4 = true;
                                if (z4) {
                                    i19++;
                                    f3 = qrVar2.j0[this.f];
                                    if (f3 >= 0.0f) {
                                        f += f3;
                                    }
                                } else {
                                    i5 += i12;
                                }
                                if (i18 >= i15) {
                                }
                            }
                            i12 = i21;
                            if (z4) {
                                i19++;
                                f3 = qrVar2.j0[this.f];
                                if (f3 >= 0.0f) {
                                    f += f3;
                                }
                            } else {
                                i5 += i12;
                            }
                            if (i18 >= i15) {
                            }
                        }
                        i18++;
                        z2 = z3;
                        i17 = i11;
                        i2 = 8;
                    }
                    z = z2;
                    int i23 = i17;
                    if (i5 < i13 || i19 == 0) {
                        i3 = i19;
                        i4 = i20;
                        break;
                    } else {
                        i17 = i23 + 1;
                        z2 = z;
                        i2 = 8;
                    }
                }
                int i24 = z00Var.g;
                if (z) {
                    i24 = z00Var2.g;
                }
                float f4 = 0.5f;
                if (i5 > i13) {
                    i24 = z ? i24 + ((int) (((i5 - i13) / 2.0f) + 0.5f)) : i24 - ((int) (((i5 - i13) / 2.0f) + 0.5f));
                }
                if (i3 > 0) {
                    float f5 = i13 - i5;
                    int i25 = (int) ((f5 / i3) + 0.5f);
                    int i26 = 0;
                    int i27 = 0;
                    while (i26 < size) {
                        float f6 = f4;
                        l82 l82Var2 = (l82) arrayList.get(i26);
                        int i28 = i24;
                        qr qrVar3 = l82Var2.b;
                        int i29 = i3;
                        s10 s10Var2 = l82Var2.e;
                        float f7 = f5;
                        int i30 = i25;
                        if (qrVar3.f0 != 8 && l82Var2.d == 3 && !s10Var2.j) {
                            int i31 = f > 0.0f ? (int) (((qrVar3.j0[this.f] * f7) / f) + f6) : i30;
                            if (this.f == 0) {
                                i9 = qrVar3.u;
                                i10 = qrVar3.t;
                            } else {
                                i9 = qrVar3.x;
                                i10 = qrVar3.w;
                            }
                            int iMax = Math.max(i10, l82Var2.a == 1 ? Math.min(i31, s10Var2.m) : i31);
                            if (i9 > 0) {
                                iMax = Math.min(i9, iMax);
                            }
                            if (iMax != i31) {
                                i27++;
                                i31 = iMax;
                            }
                            s10Var2.d(i31);
                        }
                        i26++;
                        i24 = i28;
                        f4 = f6;
                        i3 = i29;
                        f5 = f7;
                        i25 = i30;
                    }
                    i6 = i24;
                    f2 = f4;
                    int i32 = i3;
                    if (i27 > 0) {
                        i3 = i32 - i27;
                        i5 = 0;
                        for (int i33 = 0; i33 < size; i33++) {
                            l82 l82Var3 = (l82) arrayList.get(i33);
                            if (l82Var3.b.f0 != 8) {
                                if (i33 > 0 && i33 >= i14) {
                                    i5 += l82Var3.h.f;
                                }
                                i5 += l82Var3.e.g;
                                if (i33 < i15 && i33 < i) {
                                    i5 += -l82Var3.i.f;
                                }
                            }
                        }
                    } else {
                        i3 = i32;
                    }
                    i8 = 2;
                    if (this.l == 2 && i27 == 0) {
                        i7 = 0;
                        this.l = 0;
                    } else {
                        i7 = 0;
                    }
                } else {
                    i6 = i24;
                    f2 = 0.5f;
                    i7 = 0;
                    i8 = 2;
                }
                if (i5 > i13) {
                    this.l = i8;
                }
                if (i4 > 0 && i3 == 0 && i14 == i) {
                    this.l = i8;
                }
                int i34 = this.l;
                if (i34 == 1) {
                    int i35 = i4 > 1 ? (i13 - i5) / (i4 - 1) : i4 == 1 ? (i13 - i5) / 2 : i7;
                    if (i3 > 0) {
                        i35 = i7;
                    }
                    int i36 = i6;
                    for (int i37 = i7; i37 < size; i37++) {
                        l82 l82Var4 = (l82) arrayList.get(z ? size - (i37 + 1) : i37);
                        qr qrVar4 = l82Var4.b;
                        z00 z00Var3 = l82Var4.i;
                        z00 z00Var4 = l82Var4.h;
                        if (qrVar4.f0 == 8) {
                            z00Var4.d(i36);
                            z00Var3.d(i36);
                        } else {
                            if (i37 > 0) {
                                i36 = z ? i36 - i35 : i36 + i35;
                            }
                            if (i37 > 0 && i37 >= i14) {
                                i36 = z ? i36 - z00Var4.f : i36 + z00Var4.f;
                            }
                            if (z) {
                                z00Var3.d(i36);
                            } else {
                                z00Var4.d(i36);
                            }
                            s10 s10Var3 = l82Var4.e;
                            int i38 = s10Var3.g;
                            if (l82Var4.d == 3 && l82Var4.a == 1) {
                                i38 = s10Var3.m;
                            }
                            i36 = z ? i36 - i38 : i36 + i38;
                            if (z) {
                                z00Var4.d(i36);
                            } else {
                                z00Var3.d(i36);
                            }
                            l82Var4.g = true;
                            if (i37 < i15 && i37 < i) {
                                i36 = z ? i36 - (-z00Var3.f) : i36 + (-z00Var3.f);
                            }
                        }
                    }
                    return;
                }
                if (i34 == 0) {
                    int i39 = (i13 - i5) / (i4 + 1);
                    if (i3 > 0) {
                        i39 = i7;
                    }
                    int i40 = i6;
                    for (int i41 = i7; i41 < size; i41++) {
                        l82 l82Var5 = (l82) arrayList.get(z ? size - (i41 + 1) : i41);
                        qr qrVar5 = l82Var5.b;
                        z00 z00Var5 = l82Var5.i;
                        z00 z00Var6 = l82Var5.h;
                        if (qrVar5.f0 == 8) {
                            z00Var6.d(i40);
                            z00Var5.d(i40);
                        } else {
                            int i42 = z ? i40 - i39 : i40 + i39;
                            if (i41 > 0 && i41 >= i14) {
                                i42 = z ? i42 - z00Var6.f : i42 + z00Var6.f;
                            }
                            if (z) {
                                z00Var5.d(i42);
                            } else {
                                z00Var6.d(i42);
                            }
                            s10 s10Var4 = l82Var5.e;
                            int iMin = s10Var4.g;
                            if (l82Var5.d == 3 && l82Var5.a == 1) {
                                iMin = Math.min(iMin, s10Var4.m);
                            }
                            i40 = z ? i42 - iMin : i42 + iMin;
                            if (z) {
                                z00Var6.d(i40);
                            } else {
                                z00Var5.d(i40);
                            }
                            if (i41 < i15 && i41 < i) {
                                i40 = z ? i40 - (-z00Var5.f) : i40 + (-z00Var5.f);
                            }
                        }
                    }
                    return;
                }
                if (i34 == 2) {
                    int i43 = this.f;
                    qr qrVar6 = this.b;
                    float f8 = i43 == 0 ? qrVar6.c0 : qrVar6.d0;
                    if (z) {
                        f8 = 1.0f - f8;
                    }
                    int i44 = (int) (((i13 - i5) * f8) + f2);
                    if (i44 < 0 || i3 > 0) {
                        i44 = i7;
                    }
                    int i45 = z ? i6 - i44 : i6 + i44;
                    for (int i46 = i7; i46 < size; i46++) {
                        l82 l82Var6 = (l82) arrayList.get(z ? size - (i46 + 1) : i46);
                        qr qrVar7 = l82Var6.b;
                        z00 z00Var7 = l82Var6.i;
                        z00 z00Var8 = l82Var6.h;
                        if (qrVar7.f0 == 8) {
                            z00Var8.d(i45);
                            z00Var7.d(i45);
                        } else {
                            if (i46 > 0 && i46 >= i14) {
                                i45 = z ? i45 - z00Var8.f : i45 + z00Var8.f;
                            }
                            if (z) {
                                z00Var7.d(i45);
                            } else {
                                z00Var8.d(i45);
                            }
                            s10 s10Var5 = l82Var6.e;
                            int i47 = s10Var5.g;
                            if (l82Var6.d == 3 && l82Var6.a == 1) {
                                i47 = s10Var5.m;
                            }
                            i45 = z ? i45 - i47 : i45 + i47;
                            if (z) {
                                z00Var8.d(i45);
                            } else {
                                z00Var7.d(i45);
                            }
                            if (i46 < i15 && i46 < i) {
                                i45 = z ? i45 - (-z00Var7.f) : i45 + (-z00Var7.f);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // defpackage.l82
    public final void d() {
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((l82) obj).d();
        }
        int size2 = arrayList.size();
        if (size2 < 1) {
            return;
        }
        qr qrVar = ((l82) arrayList.get(0)).b;
        qr qrVar2 = ((l82) arrayList.get(size2 - 1)).b;
        int i2 = this.f;
        z00 z00Var = this.i;
        z00 z00Var2 = this.h;
        if (i2 == 0) {
            cr crVar = qrVar.H;
            cr crVar2 = qrVar2.J;
            z00 z00VarI = l82.i(crVar, 0);
            int iE = crVar.e();
            qr qrVarM = m();
            if (qrVarM != null) {
                iE = qrVarM.H.e();
            }
            if (z00VarI != null) {
                l82.b(z00Var2, z00VarI, iE);
            }
            z00 z00VarI2 = l82.i(crVar2, 0);
            int iE2 = crVar2.e();
            qr qrVarN = n();
            if (qrVarN != null) {
                iE2 = qrVarN.J.e();
            }
            if (z00VarI2 != null) {
                l82.b(z00Var, z00VarI2, -iE2);
            }
        } else {
            cr crVar3 = qrVar.I;
            cr crVar4 = qrVar2.K;
            z00 z00VarI3 = l82.i(crVar3, 1);
            int iE3 = crVar3.e();
            qr qrVarM2 = m();
            if (qrVarM2 != null) {
                iE3 = qrVarM2.I.e();
            }
            if (z00VarI3 != null) {
                l82.b(z00Var2, z00VarI3, iE3);
            }
            z00 z00VarI4 = l82.i(crVar4, 1);
            int iE4 = crVar4.e();
            qr qrVarN2 = n();
            if (qrVarN2 != null) {
                iE4 = qrVarN2.K.e();
            }
            if (z00VarI4 != null) {
                l82.b(z00Var, z00VarI4, -iE4);
            }
        }
        z00Var2.a = this;
        z00Var.a = this;
    }

    @Override // defpackage.l82
    public final void e() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.k;
            if (i >= arrayList.size()) {
                return;
            }
            ((l82) arrayList.get(i)).e();
            i++;
        }
    }

    @Override // defpackage.l82
    public final void f() {
        this.c = null;
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((l82) obj).f();
        }
    }

    @Override // defpackage.l82
    public final long j() {
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            l82 l82Var = (l82) arrayList.get(i);
            j = ((long) l82Var.i.f) + l82Var.j() + j + ((long) l82Var.h.f);
        }
        return j;
    }

    @Override // defpackage.l82
    public final boolean k() {
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (!((l82) arrayList.get(i)).k()) {
                return false;
            }
        }
        return true;
    }

    public final qr m() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.k;
            if (i >= arrayList.size()) {
                return null;
            }
            qr qrVar = ((l82) arrayList.get(i)).b;
            if (qrVar.f0 != 8) {
                return qrVar;
            }
            i++;
        }
    }

    public final qr n() {
        ArrayList arrayList = this.k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            qr qrVar = ((l82) arrayList.get(size)).b;
            if (qrVar.f0 != 8) {
                return qrVar;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.f == 0 ? "horizontal : " : "vertical : ");
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            sb.append("<");
            sb.append((l82) obj);
            sb.append("> ");
        }
        return sb.toString();
    }
}
