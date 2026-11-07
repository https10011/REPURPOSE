package defpackage;

import java.io.EOFException;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class d {
    public static final rj a;
    public static final rj b;
    public static final rj c;
    public static final rj d;
    public static final rj e;

    static {
        rj rjVar = rj.d;
        a = r41.p("/");
        b = r41.p("\\");
        c = r41.p("/\\");
        d = r41.p(".");
        e = r41.p("..");
    }

    public static final int a(jb1 jb1Var) {
        rj rjVar = jb1Var.a;
        if (rjVar.d() != 0) {
            if (rjVar.i(0) != 47) {
                if (rjVar.i(0) == 92) {
                    if (rjVar.d() > 2 && rjVar.i(1) == 92) {
                        rj rjVar2 = b;
                        rjVar2.getClass();
                        int iF = rjVar.f(rjVar2.h(), 2);
                        return iF == -1 ? rjVar.d() : iF;
                    }
                } else if (rjVar.d() > 2 && rjVar.i(1) == 58 && rjVar.i(2) == 92) {
                    char cI = (char) rjVar.i(0);
                    if ('a' <= cI && cI < '{') {
                        return 3;
                    }
                    if ('A' <= cI && cI < '[') {
                        return 3;
                    }
                }
            }
            return 1;
        }
        return -1;
    }

    public static final jb1 b(jb1 jb1Var, jb1 jb1Var2, boolean z) {
        jb1Var2.getClass();
        if (a(jb1Var2) != -1 || jb1Var2.e() != null) {
            return jb1Var2;
        }
        rj rjVarC = c(jb1Var);
        if (rjVarC == null && (rjVarC = c(jb1Var2)) == null) {
            rjVarC = f(jb1.b);
        }
        ji jiVar = new ji();
        jiVar.N(jb1Var.a);
        if (jiVar.b > 0) {
            jiVar.N(rjVarC);
        }
        jiVar.N(jb1Var2.a);
        return d(jiVar, z);
    }

    public static final rj c(jb1 jb1Var) {
        rj rjVar = jb1Var.a;
        rj rjVar2 = a;
        if (rj.g(rjVar, rjVar2) != -1) {
            return rjVar2;
        }
        rj rjVar3 = jb1Var.a;
        rj rjVar4 = b;
        if (rj.g(rjVar3, rjVar4) != -1) {
            return rjVar4;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:124:0x0294  */
    /* JADX WARN: Code duplicated, block: B:226:0x0298 A[SYNTHETIC] */
    public static final jb1 d(ji jiVar, boolean z) throws EOFException {
        jb1 jb1Var;
        int i;
        long j;
        long j2;
        long j3;
        long j4;
        byte b2;
        rj rjVar;
        char cN;
        rj rjVar2;
        rj rjVarK;
        int i2;
        long j5;
        yn1 yn1Var;
        long j6;
        int i3;
        ji jiVar2 = new ji();
        int i4 = 0;
        rj rjVarE = null;
        while (true) {
            rj rjVar3 = a;
            rjVar3.getClass();
            int iD = rjVar3.d();
            long j7 = 1;
            if (iD < 0) {
                j3 = 1;
                j2 = 0;
                jb1Var = null;
                i = 0;
                j = -1;
            } else {
                jb1Var = null;
                i = 0;
                long j8 = iD;
                j = -1;
                if (j8 <= jiVar.b && iD <= rjVar3.d()) {
                    if (iD != 0) {
                        byte[] bArr = b.a;
                        kv.l(rjVar3.d(), 0L, j8);
                        if (iD <= 0) {
                            e.g("byteCount == 0");
                            return null;
                        }
                        long j9 = jiVar.b;
                        long j10 = 1 > j9 ? j9 : 1L;
                        if (0 == j10) {
                            j3 = 1;
                            j2 = 0;
                        } else {
                            j2 = 0;
                            yn1 yn1Var2 = jiVar.a;
                            if (yn1Var2 == null) {
                                j3 = 1;
                            } else {
                                if (j9 < 0) {
                                    while (j9 > 0) {
                                        yn1Var2 = yn1Var2.g;
                                        yn1Var2.getClass();
                                        j9 -= (long) (yn1Var2.c - yn1Var2.b);
                                        j7 = j7;
                                    }
                                    j3 = j7;
                                    byte[] bArrH = rjVar3.h();
                                    byte b3 = bArrH[0];
                                    long j11 = j9;
                                    long jMin = Math.min(j10, (jiVar.b - j8) + j3);
                                    long j12 = 0;
                                    while (true) {
                                        if (j11 < jMin) {
                                            byte[] bArr2 = yn1Var2.a;
                                            long j13 = jMin;
                                            int iMin = (int) Math.min(yn1Var2.c, (((long) yn1Var2.b) + j13) - j11);
                                            for (int i5 = (int) ((((long) yn1Var2.b) + j12) - j11); i5 < iMin; i5++) {
                                                if (bArr2[i5] == b3 && b.a(yn1Var2, i5 + 1, bArrH, 1, iD)) {
                                                    j4 = ((long) (i5 - yn1Var2.b)) + j11;
                                                    break;
                                                }
                                            }
                                            j12 = j11 + ((long) (yn1Var2.c - yn1Var2.b));
                                            yn1Var2 = yn1Var2.f;
                                            yn1Var2.getClass();
                                            j11 = j12;
                                            jMin = j13;
                                        }
                                    }
                                } else {
                                    j3 = 1;
                                    long j14 = 0;
                                    while (true) {
                                        long j15 = ((long) (yn1Var2.c - yn1Var2.b)) + j14;
                                        if (j15 > 0) {
                                            break;
                                        }
                                        yn1Var2 = yn1Var2.f;
                                        yn1Var2.getClass();
                                        j14 = j15;
                                    }
                                    byte[] bArrH2 = rjVar3.h();
                                    byte b4 = bArrH2[0];
                                    long jMin2 = Math.min(j10, (jiVar.b - j8) + 1);
                                    long j16 = 0;
                                    while (true) {
                                        if (j14 < jMin2) {
                                            byte[] bArr3 = yn1Var2.a;
                                            long j17 = j14;
                                            long j18 = jMin2;
                                            int iMin2 = (int) Math.min(yn1Var2.c, (((long) yn1Var2.b) + j18) - j17);
                                            for (int i6 = (int) ((((long) yn1Var2.b) + j16) - j17); i6 < iMin2; i6++) {
                                                if (bArr3[i6] == b4 && b.a(yn1Var2, i6 + 1, bArrH2, 1, iD)) {
                                                    j4 = ((long) (i6 - yn1Var2.b)) + j17;
                                                    break;
                                                }
                                            }
                                            j16 = j17 + ((long) (yn1Var2.c - yn1Var2.b));
                                            yn1Var2 = yn1Var2.f;
                                            yn1Var2.getClass();
                                            j14 = j16;
                                            jMin2 = j18;
                                        }
                                    }
                                }
                                if (j4 == -1) {
                                }
                            }
                        }
                        j4 = -1;
                        if (j4 == -1) {
                        }
                    }
                    b2 = jiVar.readByte();
                    if (rjVarE == null) {
                        rjVarE = e(b2);
                    }
                    i4++;
                } else {
                    j3 = 1;
                    j2 = 0;
                }
            }
            rjVar = b;
            rjVar.getClass();
            int iD2 = rjVar.d();
            if (iD2 < 0) {
                break;
            }
            long j19 = iD2;
            if (j19 > jiVar.b || iD2 > rjVar.d()) {
                break;
            }
            if (iD2 != 0) {
                byte[] bArr4 = b.a;
                kv.l(rjVar.d(), 0L, j19);
                if (iD2 <= 0) {
                    e.g("byteCount == 0");
                    return jb1Var;
                }
                long j20 = jiVar.b;
                long j21 = j3 > j20 ? j20 : j3;
                if (j2 == j21 || (yn1Var = jiVar.a) == null) {
                    j5 = j;
                } else if (j20 < j2) {
                    while (j20 > j2) {
                        yn1Var = yn1Var.g;
                        yn1Var.getClass();
                        j20 -= (long) (yn1Var.c - yn1Var.b);
                    }
                    byte[] bArrH3 = rjVar.h();
                    byte b5 = bArrH3[i];
                    j6 = j20;
                    long jMin3 = Math.min(j21, (jiVar.b - j19) + j3);
                    long j22 = j2;
                    while (true) {
                        if (j6 < jMin3) {
                            byte[] bArr5 = yn1Var.a;
                            long j23 = jMin3;
                            int iMin3 = (int) Math.min(yn1Var.c, (((long) yn1Var.b) + j23) - j6);
                            i3 = (int) ((((long) yn1Var.b) + j22) - j6);
                            while (true) {
                                if (i3 >= iMin3) {
                                    j22 = j6 + ((long) (yn1Var.c - yn1Var.b));
                                    yn1Var = yn1Var.f;
                                    yn1Var.getClass();
                                    j6 = j22;
                                    jMin3 = j23;
                                } else if (bArr5[i3] == b5 && b.a(yn1Var, i3 + 1, bArrH3, 1, iD2)) {
                                    j5 = ((long) (i3 - yn1Var.b)) + j6;
                                } else {
                                    i3++;
                                }
                            }
                        } else {
                            j5 = j;
                        }
                    }
                } else {
                    long j24 = j2;
                    while (true) {
                        long j25 = ((long) (yn1Var.c - yn1Var.b)) + j24;
                        if (j25 > j2) {
                            break;
                        }
                        yn1Var = yn1Var.f;
                        yn1Var.getClass();
                        j24 = j25;
                    }
                    byte[] bArrH4 = rjVar.h();
                    byte b6 = bArrH4[i];
                    j6 = j24;
                    long jMin4 = Math.min(j21, (jiVar.b - j19) + j3);
                    long j26 = j2;
                    while (true) {
                        if (j6 < jMin4) {
                            byte[] bArr6 = yn1Var.a;
                            long j27 = jMin4;
                            int iMin4 = (int) Math.min(yn1Var.c, (((long) yn1Var.b) + j27) - j6);
                            i3 = (int) ((((long) yn1Var.b) + j26) - j6);
                            while (true) {
                                if (i3 >= iMin4) {
                                    j26 = j6 + ((long) (yn1Var.c - yn1Var.b));
                                    yn1Var = yn1Var.f;
                                    yn1Var.getClass();
                                    j6 = j26;
                                    jMin4 = j27;
                                } else if (bArr6[i3] == b6 && b.a(yn1Var, i3 + 1, bArrH4, 1, iD2)) {
                                    j5 = ((long) (i3 - yn1Var.b)) + j6;
                                } else {
                                    i3++;
                                }
                            }
                        } else {
                            j5 = j;
                        }
                    }
                }
                if (j5 == j) {
                    break;
                }
            }
            b2 = jiVar.readByte();
            if (rjVarE == null) {
                rjVarE = e(b2);
            }
            i4++;
        }
        int i7 = (i4 < 2 || !Intrinsics.areEqual(rjVarE, rjVar)) ? i : 1;
        rj rjVar4 = c;
        if (i7 != 0) {
            rjVarE.getClass();
            jiVar2.N(rjVarE);
            jiVar2.N(rjVarE);
        } else if (i4 > 0) {
            rjVarE.getClass();
            jiVar2.N(rjVarE);
        } else {
            long jQ = jiVar.q(rjVar4);
            if (rjVarE == null) {
                rjVarE = jQ == j ? f(jb1.b) : e(jiVar.n(jQ));
            }
            if (Intrinsics.areEqual(rjVarE, rjVar) && jiVar.b >= 2 && jiVar.n(j3) == 58 && (('a' <= (cN = (char) jiVar.n(j2)) && cN < '{') || ('A' <= cN && cN < '['))) {
                if (jQ == 2) {
                    jiVar2.f(jiVar, 3L);
                } else {
                    jiVar2.f(jiVar, 2L);
                }
            }
            Unit unit = Unit.a;
        }
        int i8 = jiVar2.b > 0 ? 1 : i;
        ArrayList arrayList = new ArrayList();
        while (true) {
            boolean zV = jiVar.v();
            rjVar2 = d;
            if (zV) {
                break;
            }
            long jQ2 = jiVar.q(rjVar4);
            if (jQ2 == j) {
                rjVarK = jiVar.k(jiVar.b);
            } else {
                rjVarK = jiVar.k(jQ2);
                jiVar.readByte();
            }
            rj rjVar5 = e;
            if (Intrinsics.areEqual(rjVarK, rjVar5)) {
                if (i8 == 0 || !arrayList.isEmpty()) {
                    if (!z || (i8 == 0 && (arrayList.isEmpty() || Intrinsics.areEqual(CollectionsKt.t(arrayList), rjVar5)))) {
                        arrayList.add(rjVarK);
                    } else {
                        if (i7 != 0) {
                            i2 = 1;
                            if (arrayList.size() != 1) {
                            }
                        } else {
                            i2 = 1;
                        }
                        if (!arrayList.isEmpty()) {
                            arrayList.remove(arrayList.size() - i2);
                        }
                    }
                }
            } else if (!Intrinsics.areEqual(rjVarK, rjVar2) && !Intrinsics.areEqual(rjVarK, rj.d)) {
                arrayList.add(rjVarK);
            }
        }
        int size = arrayList.size();
        for (int i9 = i; i9 < size; i9++) {
            if (i9 > 0) {
                jiVar2.N(rjVarE);
            }
            jiVar2.N((rj) arrayList.get(i9));
        }
        if (jiVar2.b == 0) {
            jiVar2.N(rjVar2);
        }
        return new jb1(jiVar2.k(jiVar2.b));
    }

    public static final rj e(byte b2) {
        if (b2 == 47) {
            return a;
        }
        if (b2 == 92) {
            return b;
        }
        e.g(ck1.r(b2, "not a directory separator: "));
        return null;
    }

    public static final rj f(String str) {
        if (Intrinsics.areEqual(str, "/")) {
            return a;
        }
        if (Intrinsics.areEqual(str, "\\")) {
            return b;
        }
        e.g(ts.j("not a directory separator: ", str));
        return null;
    }
}
