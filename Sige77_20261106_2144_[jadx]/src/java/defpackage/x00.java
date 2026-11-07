package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class x00 {
    public final /* synthetic */ int a = 0;
    public boolean b;
    public boolean c;
    public Object d;
    public Object e;
    public Serializable f;
    public Serializable g;
    public Object h;
    public Object i;

    public x00(boolean z, boolean z2, jb1 jb1Var, Long l, Long l2, Long l3, Long l4, Map map) {
        map.getClass();
        this.b = z;
        this.c = z2;
        this.d = jb1Var;
        this.e = l;
        this.f = l2;
        this.g = l3;
        this.h = l4;
        this.i = w11.h(map);
    }

    public void a(z00 z00Var, int i, ArrayList arrayList, pk1 pk1Var) {
        l82 l82Var = z00Var.d;
        pk1 pk1Var2 = l82Var.c;
        z00 z00Var2 = l82Var.i;
        z00 z00Var3 = l82Var.h;
        if (pk1Var2 == null) {
            rr rrVar = (rr) this.d;
            if (l82Var == rrVar.d || l82Var == rrVar.e) {
                return;
            }
            if (pk1Var == null) {
                pk1Var = new pk1();
                pk1Var.a = null;
                pk1Var.b = new ArrayList();
                pk1Var.a = l82Var;
                arrayList.add(pk1Var);
            }
            l82Var.c = pk1Var;
            pk1Var.b.add(l82Var);
            ArrayList arrayList2 = z00Var3.k;
            int size = arrayList2.size();
            int i2 = 0;
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList2.get(i3);
                i3++;
                v00 v00Var = (v00) obj;
                if (v00Var instanceof z00) {
                    a((z00) v00Var, i, arrayList, pk1Var);
                }
            }
            ArrayList arrayList3 = z00Var2.k;
            int size2 = arrayList3.size();
            int i4 = 0;
            while (i4 < size2) {
                Object obj2 = arrayList3.get(i4);
                i4++;
                v00 v00Var2 = (v00) obj2;
                if (v00Var2 instanceof z00) {
                    a((z00) v00Var2, i, arrayList, pk1Var);
                }
            }
            if (i == 1 && (l82Var instanceof e52)) {
                ArrayList arrayList4 = ((e52) l82Var).k.k;
                int size3 = arrayList4.size();
                int i5 = 0;
                while (i5 < size3) {
                    Object obj3 = arrayList4.get(i5);
                    i5++;
                    v00 v00Var3 = (v00) obj3;
                    if (v00Var3 instanceof z00) {
                        a((z00) v00Var3, i, arrayList, pk1Var);
                    }
                }
            }
            ArrayList arrayList5 = z00Var3.l;
            int size4 = arrayList5.size();
            int i6 = 0;
            while (i6 < size4) {
                Object obj4 = arrayList5.get(i6);
                i6++;
                a((z00) obj4, i, arrayList, pk1Var);
            }
            ArrayList arrayList6 = z00Var2.l;
            int size5 = arrayList6.size();
            int i7 = 0;
            while (i7 < size5) {
                Object obj5 = arrayList6.get(i7);
                i7++;
                a((z00) obj5, i, arrayList, pk1Var);
            }
            if (i == 1 && (l82Var instanceof e52)) {
                ArrayList arrayList7 = ((e52) l82Var).k.l;
                int size6 = arrayList7.size();
                while (i2 < size6) {
                    Object obj6 = arrayList7.get(i2);
                    i2++;
                    a((z00) obj6, i, arrayList, pk1Var);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:102:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:103:0x01bc A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:107:0x01c7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:108:0x01c9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:109:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:112:0x01de  */
    /* JADX WARN: Code duplicated, block: B:114:0x0207  */
    /* JADX WARN: Code duplicated, block: B:116:0x020a  */
    /* JADX WARN: Code duplicated, block: B:117:0x021f  */
    /* JADX WARN: Code duplicated, block: B:119:0x0224  */
    /* JADX WARN: Code duplicated, block: B:121:0x0228  */
    /* JADX WARN: Code duplicated, block: B:126:0x025f  */
    /* JADX WARN: Code duplicated, block: B:128:0x0269  */
    /* JADX WARN: Code duplicated, block: B:134:0x029a  */
    /* JADX WARN: Code duplicated, block: B:136:0x02a1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:138:0x02a5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:148:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:149:0x0306  */
    /* JADX WARN: Code duplicated, block: B:152:0x0311  */
    /* JADX WARN: Code duplicated, block: B:155:0x0324  */
    /* JADX WARN: Code duplicated, block: B:156:0x0337  */
    /* JADX WARN: Code duplicated, block: B:63:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:69:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d1 A[PHI: r0
      0x00d1: PHI (r0v22 int) = (r0v20 int), (r0v99 int) binds: [B:68:0x00c9, B:62:0x00c0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:72:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:78:0x00ea A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:79:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:82:0x012c  */
    /* JADX WARN: Code duplicated, block: B:84:0x0131  */
    /* JADX WARN: Code duplicated, block: B:85:0x0144  */
    /* JADX WARN: Code duplicated, block: B:87:0x0147  */
    /* JADX WARN: Code duplicated, block: B:89:0x014b  */
    /* JADX WARN: Code duplicated, block: B:95:0x0182  */
    /* JADX WARN: Code duplicated, block: B:97:0x018c  */
    public void b(rr rrVar) {
        int i;
        int i2;
        int iN;
        int iK;
        int i3;
        int iK2;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        float f;
        int i16;
        int i17;
        ArrayList arrayList = rrVar.p0;
        int[] iArr = rrVar.o0;
        int size = arrayList.size();
        char c = 0;
        int i18 = 0;
        while (i18 < size) {
            Object obj = arrayList.get(i18);
            i18++;
            qr qrVar = (qr) obj;
            int[] iArr2 = qrVar.o0;
            cr[] crVarArr = qrVar.P;
            cr crVar = qrVar.K;
            cr crVar2 = qrVar.I;
            cr crVar3 = qrVar.J;
            cr crVar4 = qrVar.H;
            int i19 = iArr2[c];
            int i20 = iArr2[1];
            c = c;
            if (qrVar.f0 == 8) {
                qrVar.a = true;
            } else {
                float f2 = qrVar.v;
                if (f2 < 1.0f && i19 == 3) {
                    qrVar.q = 2;
                }
                float f3 = qrVar.y;
                if (f3 < 1.0f && i20 == 3) {
                    qrVar.r = 2;
                }
                if (qrVar.V > 0.0f) {
                    if (i19 == 3) {
                        i17 = 2;
                        if (i20 == 2 || i20 == 1) {
                            i = 3;
                            qrVar.q = 3;
                        } else {
                            i = 3;
                        }
                    } else {
                        i = 3;
                        i17 = 2;
                    }
                    if (i20 == i && (i19 == i17 || i19 == 1)) {
                        qrVar.r = i;
                    } else if (i19 == i && i20 == i) {
                        if (qrVar.q == 0) {
                            qrVar.q = i;
                        }
                        if (qrVar.r == 0) {
                            qrVar.r = i;
                        }
                    }
                } else {
                    i = 3;
                }
                if (i19 == i && qrVar.q == 1 && (crVar4.f == null || crVar3.f == null)) {
                    i19 = 2;
                }
                if (i20 == 3 && qrVar.r == 1 && (crVar2.f == null || crVar.f == null)) {
                    i20 = 2;
                }
                gm0 gm0Var = qrVar.d;
                gm0Var.d = i19;
                int i21 = qrVar.q;
                gm0Var.a = i21;
                e52 e52Var = qrVar.e;
                e52Var.d = i20;
                ArrayList arrayList2 = arrayList;
                int i22 = qrVar.r;
                e52Var.a = i22;
                if (i19 == 4 || i19 == 1) {
                    if (i20 == 4) {
                        i2 = 1;
                    } else if (i20 != 1) {
                        i4 = 2;
                        if (i20 == 2) {
                            i2 = 1;
                        } else {
                            if (i19 != 3) {
                                i5 = i4;
                                i6 = i20;
                                i7 = 1;
                            } else if (i20 == i4 && i20 != 1) {
                                i5 = i4;
                                i8 = 3;
                                i6 = i20;
                                i7 = 1;
                                if (i6 != i8) {
                                    if (i19 == i5 && i19 != i7) {
                                        i12 = i8;
                                        i9 = i19;
                                        i10 = i5;
                                    } else if (i22 == i8) {
                                        if (i19 == i5) {
                                            f(i5, 0, i5, 0, qrVar);
                                        }
                                        int iN2 = qrVar.n();
                                        f = qrVar.V;
                                        if (qrVar.W == -1) {
                                            f = 1.0f / f;
                                        }
                                        f(i7, iN2, i7, (int) ((iN2 * f) + 0.5f), qrVar);
                                        qrVar.d.e.d(qrVar.n());
                                        qrVar.e.e.d(qrVar.k());
                                        qrVar.a = true;
                                    } else if (i22 == 1) {
                                        f(i19, 0, i5, 0, qrVar);
                                        qrVar.e.e.m = qrVar.k();
                                    } else {
                                        i13 = i5;
                                        i14 = i19;
                                        if (i22 == 2) {
                                            i15 = iArr[1];
                                            if (i15 != i7 || i15 == 4) {
                                                f(i14, qrVar.n(), i7, (int) ((f3 * rrVar.k()) + 0.5f), qrVar);
                                                qrVar.d.e.d(qrVar.n());
                                                qrVar.e.e.d(qrVar.k());
                                                qrVar.a = true;
                                            } else {
                                                i9 = i14;
                                                i10 = i13;
                                                i12 = 3;
                                            }
                                        } else {
                                            i9 = i14;
                                            if (crVarArr[2].f != null || crVarArr[3].f == null) {
                                                f(i13, 0, i6, 0, qrVar);
                                                qrVar.d.e.d(qrVar.n());
                                                qrVar.e.e.d(qrVar.k());
                                                qrVar.a = true;
                                            } else {
                                                i10 = i13;
                                            }
                                        }
                                    }
                                    i7 = i7;
                                    i11 = 1;
                                    if (i9 == i12 && i6 == i12) {
                                        if (i21 != i11 || i22 == i11) {
                                            f(i10, 0, i10, 0, qrVar);
                                            qrVar.d.e.m = qrVar.n();
                                            qrVar.e.e.m = qrVar.k();
                                        } else if (i22 == 2 && i21 == 2 && iArr[c] == i7 && iArr[i11] == i7) {
                                            f(i7, (int) ((f2 * rrVar.n()) + 0.5f), i7, (int) ((f3 * rrVar.k()) + 0.5f), qrVar);
                                            qrVar.d.e.d(qrVar.n());
                                            qrVar.e.e.d(qrVar.k());
                                            qrVar.a = true;
                                        }
                                    }
                                } else {
                                    i9 = i19;
                                    i10 = i5;
                                }
                                i11 = 1;
                                i12 = 3;
                                if (i9 == i12) {
                                    if (i21 != i11) {
                                        f(i10, 0, i10, 0, qrVar);
                                        qrVar.d.e.m = qrVar.n();
                                        qrVar.e.e.m = qrVar.k();
                                    } else {
                                        f(i10, 0, i10, 0, qrVar);
                                        qrVar.d.e.m = qrVar.n();
                                        qrVar.e.e.m = qrVar.k();
                                    }
                                }
                            } else if (i21 == 3) {
                                if (i20 == i4) {
                                    f(i4, 0, i4, 0, qrVar);
                                }
                                int iK3 = qrVar.k();
                                f(1, (int) ((iK3 * qrVar.V) + 0.5f), 1, iK3, qrVar);
                                qrVar.d.e.d(qrVar.n());
                                qrVar.e.e.d(qrVar.k());
                                qrVar.a = true;
                            } else {
                                i5 = i4;
                                if (i21 == 1) {
                                    f(i5, 0, i20, 0, qrVar);
                                    qrVar.d.e.m = qrVar.n();
                                } else if (i21 == 2) {
                                    i16 = iArr[c];
                                    if (i16 != 1 || i16 == 4) {
                                        f(1, (int) ((f2 * rrVar.n()) + 0.5f), i20, qrVar.k(), qrVar);
                                        qrVar.d.e.d(qrVar.n());
                                        qrVar.e.e.d(qrVar.k());
                                        qrVar.a = true;
                                    } else {
                                        i6 = i20;
                                        i7 = 1;
                                    }
                                } else {
                                    i6 = i20;
                                    i7 = 1;
                                    if (crVarArr[c].f != null || crVarArr[1].f == null) {
                                        f(i5, 0, i6, 0, qrVar);
                                        qrVar.d.e.d(qrVar.n());
                                        qrVar.e.e.d(qrVar.k());
                                        qrVar.a = true;
                                    }
                                }
                            }
                            i8 = 3;
                            if (i6 != i8) {
                                i9 = i19;
                                i10 = i5;
                            } else if (i19 == i5) {
                                if (i22 == i8) {
                                    if (i19 == i5) {
                                        f(i5, 0, i5, 0, qrVar);
                                    }
                                    int iN3 = qrVar.n();
                                    f = qrVar.V;
                                    if (qrVar.W == -1) {
                                        f = 1.0f / f;
                                    }
                                    f(i7, iN3, i7, (int) ((iN3 * f) + 0.5f), qrVar);
                                    qrVar.d.e.d(qrVar.n());
                                    qrVar.e.e.d(qrVar.k());
                                    qrVar.a = true;
                                } else if (i22 == 1) {
                                    f(i19, 0, i5, 0, qrVar);
                                    qrVar.e.e.m = qrVar.k();
                                } else {
                                    i13 = i5;
                                    i14 = i19;
                                    if (i22 == 2) {
                                        i15 = iArr[1];
                                        if (i15 != i7) {
                                        }
                                        f(i14, qrVar.n(), i7, (int) ((f3 * rrVar.k()) + 0.5f), qrVar);
                                        qrVar.d.e.d(qrVar.n());
                                        qrVar.e.e.d(qrVar.k());
                                        qrVar.a = true;
                                    } else {
                                        i9 = i14;
                                        if (crVarArr[2].f != null) {
                                        }
                                        f(i13, 0, i6, 0, qrVar);
                                        qrVar.d.e.d(qrVar.n());
                                        qrVar.e.e.d(qrVar.k());
                                        qrVar.a = true;
                                    }
                                }
                            } else if (i22 == i8) {
                                if (i19 == i5) {
                                    f(i5, 0, i5, 0, qrVar);
                                }
                                int iN4 = qrVar.n();
                                f = qrVar.V;
                                if (qrVar.W == -1) {
                                    f = 1.0f / f;
                                }
                                f(i7, iN4, i7, (int) ((iN4 * f) + 0.5f), qrVar);
                                qrVar.d.e.d(qrVar.n());
                                qrVar.e.e.d(qrVar.k());
                                qrVar.a = true;
                            } else if (i22 == 1) {
                                f(i19, 0, i5, 0, qrVar);
                                qrVar.e.e.m = qrVar.k();
                            } else {
                                i13 = i5;
                                i14 = i19;
                                if (i22 == 2) {
                                    i15 = iArr[1];
                                    if (i15 != i7) {
                                    }
                                    f(i14, qrVar.n(), i7, (int) ((f3 * rrVar.k()) + 0.5f), qrVar);
                                    qrVar.d.e.d(qrVar.n());
                                    qrVar.e.e.d(qrVar.k());
                                    qrVar.a = true;
                                } else {
                                    i9 = i14;
                                    if (crVarArr[2].f != null) {
                                    }
                                    f(i13, 0, i6, 0, qrVar);
                                    qrVar.d.e.d(qrVar.n());
                                    qrVar.e.e.d(qrVar.k());
                                    qrVar.a = true;
                                }
                            }
                            i11 = 1;
                            i12 = 3;
                            if (i9 == i12) {
                                if (i21 != i11) {
                                    f(i10, 0, i10, 0, qrVar);
                                    qrVar.d.e.m = qrVar.n();
                                    qrVar.e.e.m = qrVar.k();
                                } else {
                                    f(i10, 0, i10, 0, qrVar);
                                    qrVar.d.e.m = qrVar.n();
                                    qrVar.e.e.m = qrVar.k();
                                }
                            }
                        }
                    } else {
                        i2 = 1;
                    }
                    iN = qrVar.n();
                    if (i19 == 4) {
                        iN = (rrVar.n() - crVar4.g) - crVar3.g;
                        i19 = i2;
                    }
                    iK = qrVar.k();
                    if (i20 == 4) {
                        i3 = i2;
                        iK2 = (rrVar.k() - crVar2.g) - crVar.g;
                    } else {
                        i3 = i20;
                        iK2 = iK;
                    }
                    f(i19, iN, i3, iK2, qrVar);
                    qrVar.d.e.d(qrVar.n());
                    qrVar.e.e.d(qrVar.k());
                    qrVar.a = true;
                } else {
                    i4 = 2;
                    if (i19 == 2) {
                        if (i20 == 4) {
                            i2 = 1;
                        } else if (i20 != 1) {
                            i4 = 2;
                            if (i20 == 2) {
                                i2 = 1;
                            } else {
                                if (i19 != 3) {
                                    if (i20 == i4) {
                                    }
                                    if (i21 == 3) {
                                        if (i20 == i4) {
                                            f(i4, 0, i4, 0, qrVar);
                                        }
                                        int iK4 = qrVar.k();
                                        f(1, (int) ((iK4 * qrVar.V) + 0.5f), 1, iK4, qrVar);
                                        qrVar.d.e.d(qrVar.n());
                                        qrVar.e.e.d(qrVar.k());
                                        qrVar.a = true;
                                    } else {
                                        i5 = i4;
                                        if (i21 == 1) {
                                            f(i5, 0, i20, 0, qrVar);
                                            qrVar.d.e.m = qrVar.n();
                                        } else if (i21 == 2) {
                                            i16 = iArr[c];
                                            if (i16 != 1) {
                                            }
                                            f(1, (int) ((f2 * rrVar.n()) + 0.5f), i20, qrVar.k(), qrVar);
                                            qrVar.d.e.d(qrVar.n());
                                            qrVar.e.e.d(qrVar.k());
                                            qrVar.a = true;
                                        } else {
                                            i6 = i20;
                                            i7 = 1;
                                            if (crVarArr[c].f != null) {
                                            }
                                            f(i5, 0, i6, 0, qrVar);
                                            qrVar.d.e.d(qrVar.n());
                                            qrVar.e.e.d(qrVar.k());
                                            qrVar.a = true;
                                        }
                                    }
                                } else {
                                    i5 = i4;
                                    i6 = i20;
                                    i7 = 1;
                                }
                                i8 = 3;
                                if (i6 != i8) {
                                    i9 = i19;
                                    i10 = i5;
                                } else if (i19 == i5) {
                                    if (i22 == i8) {
                                        if (i19 == i5) {
                                            f(i5, 0, i5, 0, qrVar);
                                        }
                                        int iN5 = qrVar.n();
                                        f = qrVar.V;
                                        if (qrVar.W == -1) {
                                            f = 1.0f / f;
                                        }
                                        f(i7, iN5, i7, (int) ((iN5 * f) + 0.5f), qrVar);
                                        qrVar.d.e.d(qrVar.n());
                                        qrVar.e.e.d(qrVar.k());
                                        qrVar.a = true;
                                    } else if (i22 == 1) {
                                        f(i19, 0, i5, 0, qrVar);
                                        qrVar.e.e.m = qrVar.k();
                                    } else {
                                        i13 = i5;
                                        i14 = i19;
                                        if (i22 == 2) {
                                            i15 = iArr[1];
                                            if (i15 != i7) {
                                            }
                                            f(i14, qrVar.n(), i7, (int) ((f3 * rrVar.k()) + 0.5f), qrVar);
                                            qrVar.d.e.d(qrVar.n());
                                            qrVar.e.e.d(qrVar.k());
                                            qrVar.a = true;
                                        } else {
                                            i9 = i14;
                                            if (crVarArr[2].f != null) {
                                            }
                                            f(i13, 0, i6, 0, qrVar);
                                            qrVar.d.e.d(qrVar.n());
                                            qrVar.e.e.d(qrVar.k());
                                            qrVar.a = true;
                                        }
                                    }
                                } else if (i22 == i8) {
                                    if (i19 == i5) {
                                        f(i5, 0, i5, 0, qrVar);
                                    }
                                    int iN6 = qrVar.n();
                                    f = qrVar.V;
                                    if (qrVar.W == -1) {
                                        f = 1.0f / f;
                                    }
                                    f(i7, iN6, i7, (int) ((iN6 * f) + 0.5f), qrVar);
                                    qrVar.d.e.d(qrVar.n());
                                    qrVar.e.e.d(qrVar.k());
                                    qrVar.a = true;
                                } else if (i22 == 1) {
                                    f(i19, 0, i5, 0, qrVar);
                                    qrVar.e.e.m = qrVar.k();
                                } else {
                                    i13 = i5;
                                    i14 = i19;
                                    if (i22 == 2) {
                                        i15 = iArr[1];
                                        if (i15 != i7) {
                                        }
                                        f(i14, qrVar.n(), i7, (int) ((f3 * rrVar.k()) + 0.5f), qrVar);
                                        qrVar.d.e.d(qrVar.n());
                                        qrVar.e.e.d(qrVar.k());
                                        qrVar.a = true;
                                    } else {
                                        i9 = i14;
                                        if (crVarArr[2].f != null) {
                                        }
                                        f(i13, 0, i6, 0, qrVar);
                                        qrVar.d.e.d(qrVar.n());
                                        qrVar.e.e.d(qrVar.k());
                                        qrVar.a = true;
                                    }
                                }
                                i11 = 1;
                                i12 = 3;
                                if (i9 == i12) {
                                    if (i21 != i11) {
                                        f(i10, 0, i10, 0, qrVar);
                                        qrVar.d.e.m = qrVar.n();
                                        qrVar.e.e.m = qrVar.k();
                                    } else {
                                        f(i10, 0, i10, 0, qrVar);
                                        qrVar.d.e.m = qrVar.n();
                                        qrVar.e.e.m = qrVar.k();
                                    }
                                }
                            }
                        } else {
                            i2 = 1;
                        }
                        iN = qrVar.n();
                        if (i19 == 4) {
                            iN = (rrVar.n() - crVar4.g) - crVar3.g;
                            i19 = i2;
                        }
                        iK = qrVar.k();
                        if (i20 == 4) {
                            i3 = i2;
                            iK2 = (rrVar.k() - crVar2.g) - crVar.g;
                        } else {
                            i3 = i20;
                            iK2 = iK;
                        }
                        f(i19, iN, i3, iK2, qrVar);
                        qrVar.d.e.d(qrVar.n());
                        qrVar.e.e.d(qrVar.k());
                        qrVar.a = true;
                    } else {
                        if (i19 != 3) {
                            if (i20 == i4) {
                            }
                            if (i21 == 3) {
                                if (i20 == i4) {
                                    f(i4, 0, i4, 0, qrVar);
                                }
                                int iK5 = qrVar.k();
                                f(1, (int) ((iK5 * qrVar.V) + 0.5f), 1, iK5, qrVar);
                                qrVar.d.e.d(qrVar.n());
                                qrVar.e.e.d(qrVar.k());
                                qrVar.a = true;
                            } else {
                                i5 = i4;
                                if (i21 == 1) {
                                    f(i5, 0, i20, 0, qrVar);
                                    qrVar.d.e.m = qrVar.n();
                                } else if (i21 == 2) {
                                    i16 = iArr[c];
                                    if (i16 != 1) {
                                    }
                                    f(1, (int) ((f2 * rrVar.n()) + 0.5f), i20, qrVar.k(), qrVar);
                                    qrVar.d.e.d(qrVar.n());
                                    qrVar.e.e.d(qrVar.k());
                                    qrVar.a = true;
                                } else {
                                    i6 = i20;
                                    i7 = 1;
                                    if (crVarArr[c].f != null) {
                                    }
                                    f(i5, 0, i6, 0, qrVar);
                                    qrVar.d.e.d(qrVar.n());
                                    qrVar.e.e.d(qrVar.k());
                                    qrVar.a = true;
                                }
                            }
                        } else {
                            i5 = i4;
                            i6 = i20;
                            i7 = 1;
                        }
                        i8 = 3;
                        if (i6 != i8) {
                            i9 = i19;
                            i10 = i5;
                        } else if (i19 == i5) {
                            if (i22 == i8) {
                                if (i19 == i5) {
                                    f(i5, 0, i5, 0, qrVar);
                                }
                                int iN7 = qrVar.n();
                                f = qrVar.V;
                                if (qrVar.W == -1) {
                                    f = 1.0f / f;
                                }
                                f(i7, iN7, i7, (int) ((iN7 * f) + 0.5f), qrVar);
                                qrVar.d.e.d(qrVar.n());
                                qrVar.e.e.d(qrVar.k());
                                qrVar.a = true;
                            } else if (i22 == 1) {
                                f(i19, 0, i5, 0, qrVar);
                                qrVar.e.e.m = qrVar.k();
                            } else {
                                i13 = i5;
                                i14 = i19;
                                if (i22 == 2) {
                                    i15 = iArr[1];
                                    if (i15 != i7) {
                                    }
                                    f(i14, qrVar.n(), i7, (int) ((f3 * rrVar.k()) + 0.5f), qrVar);
                                    qrVar.d.e.d(qrVar.n());
                                    qrVar.e.e.d(qrVar.k());
                                    qrVar.a = true;
                                } else {
                                    i9 = i14;
                                    if (crVarArr[2].f != null) {
                                    }
                                    f(i13, 0, i6, 0, qrVar);
                                    qrVar.d.e.d(qrVar.n());
                                    qrVar.e.e.d(qrVar.k());
                                    qrVar.a = true;
                                }
                            }
                        } else if (i22 == i8) {
                            if (i19 == i5) {
                                f(i5, 0, i5, 0, qrVar);
                            }
                            int iN8 = qrVar.n();
                            f = qrVar.V;
                            if (qrVar.W == -1) {
                                f = 1.0f / f;
                            }
                            f(i7, iN8, i7, (int) ((iN8 * f) + 0.5f), qrVar);
                            qrVar.d.e.d(qrVar.n());
                            qrVar.e.e.d(qrVar.k());
                            qrVar.a = true;
                        } else if (i22 == 1) {
                            f(i19, 0, i5, 0, qrVar);
                            qrVar.e.e.m = qrVar.k();
                        } else {
                            i13 = i5;
                            i14 = i19;
                            if (i22 == 2) {
                                i15 = iArr[1];
                                if (i15 != i7) {
                                }
                                f(i14, qrVar.n(), i7, (int) ((f3 * rrVar.k()) + 0.5f), qrVar);
                                qrVar.d.e.d(qrVar.n());
                                qrVar.e.e.d(qrVar.k());
                                qrVar.a = true;
                            } else {
                                i9 = i14;
                                if (crVarArr[2].f != null) {
                                }
                                f(i13, 0, i6, 0, qrVar);
                                qrVar.d.e.d(qrVar.n());
                                qrVar.e.e.d(qrVar.k());
                                qrVar.a = true;
                            }
                        }
                        i11 = 1;
                        i12 = 3;
                        if (i9 == i12) {
                            if (i21 != i11) {
                                f(i10, 0, i10, 0, qrVar);
                                qrVar.d.e.m = qrVar.n();
                                qrVar.e.e.m = qrVar.k();
                            } else {
                                f(i10, 0, i10, 0, qrVar);
                                qrVar.d.e.m = qrVar.n();
                                qrVar.e.e.m = qrVar.k();
                            }
                        }
                    }
                }
                arrayList = arrayList2;
            }
        }
    }

    public void c() {
        rr rrVar = (rr) this.d;
        ArrayList arrayList = (ArrayList) this.g;
        ArrayList arrayList2 = (ArrayList) this.f;
        arrayList2.clear();
        rr rrVar2 = (rr) this.e;
        rrVar2.d.f();
        rrVar2.e.f();
        arrayList2.add(rrVar2.d);
        arrayList2.add(rrVar2.e);
        ArrayList arrayList3 = rrVar2.p0;
        int size = arrayList3.size();
        HashSet hashSet = null;
        int i = 0;
        while (i < size) {
            Object obj = arrayList3.get(i);
            i++;
            qr qrVar = (qr) obj;
            if (qrVar instanceof cl0) {
                dl0 dl0Var = new dl0(qrVar);
                qrVar.d.f();
                qrVar.e.f();
                dl0Var.f = ((cl0) qrVar).t0;
                arrayList2.add(dl0Var);
            } else {
                if (qrVar.u()) {
                    if (qrVar.b == null) {
                        qrVar.b = new gl(qrVar, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(qrVar.b);
                } else {
                    arrayList2.add(qrVar.d);
                }
                if (qrVar.v()) {
                    if (qrVar.c == null) {
                        qrVar.c = new gl(qrVar, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(qrVar.c);
                } else {
                    arrayList2.add(qrVar.e);
                }
                if (qrVar instanceof bm0) {
                    arrayList2.add(new am0(qrVar));
                }
            }
        }
        if (hashSet != null) {
            arrayList2.addAll(hashSet);
        }
        int size2 = arrayList2.size();
        int i2 = 0;
        while (i2 < size2) {
            Object obj2 = arrayList2.get(i2);
            i2++;
            ((l82) obj2).f();
        }
        int size3 = arrayList2.size();
        int i3 = 0;
        while (i3 < size3) {
            Object obj3 = arrayList2.get(i3);
            i3++;
            l82 l82Var = (l82) obj3;
            if (l82Var.b != rrVar2) {
                l82Var.d();
            }
        }
        arrayList.clear();
        e(rrVar.d, 0, arrayList);
        e(rrVar.e, 1, arrayList);
        this.b = false;
    }

    public int d(rr rrVar, int i) {
        ArrayList arrayList;
        int i2;
        long j;
        float f;
        long j2;
        ArrayList arrayList2 = (ArrayList) this.g;
        int size = arrayList2.size();
        long j3 = 0;
        int i3 = 0;
        long jMax = 0;
        while (i3 < size) {
            l82 l82Var = ((pk1) arrayList2.get(i3)).a;
            if (!(l82Var instanceof gl) ? !(i != 0 ? (l82Var instanceof e52) : (l82Var instanceof gm0)) : ((gl) l82Var).f != i) {
                z00 z00Var = (i == 0 ? rrVar.d : rrVar.e).h;
                z00 z00Var2 = (i == 0 ? rrVar.d : rrVar.e).i;
                z00 z00Var3 = l82Var.h;
                z00 z00Var4 = l82Var.i;
                boolean zContains = z00Var3.l.contains(z00Var);
                boolean zContains2 = z00Var4.l.contains(z00Var2);
                long j4 = l82Var.j();
                if (zContains && zContains2) {
                    long jB = pk1.b(z00Var3, j3);
                    arrayList = arrayList2;
                    long jA = pk1.a(z00Var4, j3);
                    long j5 = jB - j4;
                    int i4 = z00Var4.f;
                    i2 = i3;
                    if (j5 >= (-i4)) {
                        j5 += (long) i4;
                    }
                    long j6 = z00Var3.f;
                    long j7 = ((-jA) - j4) - j6;
                    if (j7 >= j6) {
                        j7 -= j6;
                    }
                    qr qrVar = l82Var.b;
                    if (i == 0) {
                        f = qrVar.c0;
                    } else if (i == 1) {
                        f = qrVar.d0;
                    } else {
                        qrVar.getClass();
                        f = -1.0f;
                    }
                    if (f > 0.0f) {
                        j2 = (long) ((j5 / (1.0f - f)) + (j7 / f));
                    } else {
                        j2 = 0;
                    }
                    float f2 = j2;
                    j = (((long) z00Var3.f) + ((((long) ((f2 * f) + 0.5f)) + j4) + ((long) (((1.0f - f) * f2) + 0.5f)))) - ((long) z00Var4.f);
                } else {
                    arrayList = arrayList2;
                    i2 = i3;
                    if (zContains) {
                        j = Math.max(pk1.b(z00Var3, z00Var3.f), ((long) z00Var3.f) + j4);
                    } else if (zContains2) {
                        j = Math.max(-pk1.a(z00Var4, z00Var4.f), ((long) (-z00Var4.f)) + j4);
                    } else {
                        j = (l82Var.j() + ((long) z00Var3.f)) - ((long) z00Var4.f);
                    }
                }
            } else {
                arrayList = arrayList2;
                j = j3;
                i2 = i3;
            }
            jMax = Math.max(jMax, j);
            i3 = i2 + 1;
            arrayList2 = arrayList;
            j3 = 0;
        }
        return (int) jMax;
    }

    public void e(l82 l82Var, int i, ArrayList arrayList) {
        z00 z00Var = l82Var.h;
        z00 z00Var2 = l82Var.i;
        ArrayList arrayList2 = z00Var.k;
        int size = arrayList2.size();
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList2.get(i3);
            i3++;
            v00 v00Var = (v00) obj;
            if (v00Var instanceof z00) {
                a((z00) v00Var, i, arrayList, null);
            } else if (v00Var instanceof l82) {
                a(((l82) v00Var).h, i, arrayList, null);
            }
        }
        ArrayList arrayList3 = z00Var2.k;
        int size2 = arrayList3.size();
        int i4 = 0;
        while (i4 < size2) {
            Object obj2 = arrayList3.get(i4);
            i4++;
            v00 v00Var2 = (v00) obj2;
            if (v00Var2 instanceof z00) {
                a((z00) v00Var2, i, arrayList, null);
            } else if (v00Var2 instanceof l82) {
                a(((l82) v00Var2).i, i, arrayList, null);
            }
        }
        if (i == 1) {
            ArrayList arrayList4 = ((e52) l82Var).k.k;
            int size3 = arrayList4.size();
            while (i2 < size3) {
                Object obj3 = arrayList4.get(i2);
                i2++;
                v00 v00Var3 = (v00) obj3;
                if (v00Var3 instanceof z00) {
                    a((z00) v00Var3, i, arrayList, null);
                }
            }
        }
    }

    public void f(int i, int i2, int i3, int i4, qr qrVar) {
        ah ahVar = (ah) this.i;
        ahVar.a = i;
        ahVar.b = i3;
        ahVar.c = i2;
        ahVar.d = i4;
        ((hr) this.h).b(qrVar, ahVar);
        qrVar.J(ahVar.e);
        qrVar.G(ahVar.f);
        qrVar.D = ahVar.h;
        qrVar.D(ahVar.g);
    }

    public void g() {
        zg zgVar;
        x00 x00Var = this;
        ArrayList arrayList = ((rr) x00Var.d).p0;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            qr qrVar = (qr) arrayList.get(i);
            if (!qrVar.a) {
                int[] iArr = qrVar.o0;
                int i3 = iArr[0];
                int i4 = iArr[1];
                int i5 = qrVar.q;
                int i6 = qrVar.r;
                boolean z = i3 == 2 || (i3 == 3 && i5 == 1);
                boolean z2 = i4 == 2 || (i4 == 3 && i6 == 1);
                s10 s10Var = qrVar.d.e;
                boolean z3 = s10Var.j;
                s10 s10Var2 = qrVar.e.e;
                boolean z4 = s10Var2.j;
                boolean z5 = z;
                if (z3 && z4) {
                    x00Var.f(1, s10Var.g, 1, s10Var2.g, qrVar);
                    qrVar.a = true;
                } else if (z3 && z2) {
                    f(1, s10Var.g, 2, s10Var2.g, qrVar);
                    e52 e52Var = qrVar.e;
                    if (i4 == 3) {
                        e52Var.e.m = qrVar.k();
                    } else {
                        e52Var.e.d(qrVar.k());
                        qrVar.a = true;
                    }
                } else if (z4 && z5) {
                    f(2, s10Var.g, 1, s10Var2.g, qrVar);
                    gm0 gm0Var = qrVar.d;
                    if (i3 == 3) {
                        gm0Var.e.m = qrVar.n();
                    } else {
                        gm0Var.e.d(qrVar.n());
                        qrVar.a = true;
                    }
                }
                if (qrVar.a && (zgVar = qrVar.e.l) != null) {
                    zgVar.d(qrVar.Z);
                }
                x00Var = this;
            }
            i = i2;
        }
    }

    public String toString() {
        switch (this.a) {
            case 1:
                Map map = (Map) this.i;
                Long l = (Long) this.h;
                Long l2 = (Long) this.g;
                Long l3 = (Long) this.f;
                Long l4 = (Long) this.e;
                ArrayList arrayList = new ArrayList();
                if (this.b) {
                    arrayList.add("isRegularFile");
                }
                if (this.c) {
                    arrayList.add("isDirectory");
                }
                if (l4 != null) {
                    arrayList.add("byteCount=" + l4.longValue());
                }
                if (l3 != null) {
                    arrayList.add("createdAt=" + l3.longValue());
                }
                if (l2 != null) {
                    arrayList.add("lastModifiedAt=" + l2.longValue());
                }
                if (l != null) {
                    arrayList.add("lastAccessedAt=" + l.longValue());
                }
                if (!map.isEmpty()) {
                    arrayList.add("extras=" + map);
                }
                return CollectionsKt.s(arrayList, ", ", "FileMetadata(", ")", (Function1) null, 56);
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public x00(boolean z, boolean z2, jb1 jb1Var, Long l, Long l2, Long l3, Long l4) {
        y50 y50Var = y50.a;
        y50Var.getClass();
        this(z, z2, jb1Var, l, l2, l3, l4, y50Var);
    }

    public /* synthetic */ x00() {
    }
}
