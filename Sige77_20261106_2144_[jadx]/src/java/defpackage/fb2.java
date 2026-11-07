package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import kotlin.text.d;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class fb2 {
    public static final LinkedHashMap a(ArrayList arrayList) {
        String str = jb1.b;
        jb1 jb1VarH = br0.h("/");
        LinkedHashMap linkedHashMapE = w11.e(new Pair(jb1VarH, new bb2(jb1VarH, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, 65532)));
        for (bb2 bb2Var : CollectionsKt.x(arrayList, new rs(8))) {
            if (((bb2) linkedHashMapE.put(bb2Var.a, bb2Var)) == null) {
                while (true) {
                    jb1 jb1Var = bb2Var.a;
                    jb1 jb1VarB = jb1Var.b();
                    if (jb1VarB == null) {
                        break;
                    }
                    bb2 bb2Var2 = (bb2) linkedHashMapE.get(jb1VarB);
                    if (bb2Var2 != null) {
                        bb2Var2.q.add(jb1Var);
                        break;
                    }
                    bb2 bb2Var3 = new bb2(jb1VarB, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, 65532);
                    linkedHashMapE.put(jb1VarB, bb2Var3);
                    bb2Var3.q.add(jb1Var);
                    bb2Var = bb2Var3;
                }
            }
        }
        return linkedHashMapE;
    }

    public static final String b(int i) {
        String string = Integer.toString(i, CharsKt.c());
        string.getClass();
        return "0x".concat(string);
    }

    public static final bb2 c(final mf1 mf1Var) throws IOException {
        int iB = mf1Var.b();
        if (iB != 33639248) {
            throw new IOException("bad zip: expected " + b(33639248) + " but was " + b(iB));
        }
        mf1Var.skip(4L);
        short sI = mf1Var.i();
        int i = sI & 65535;
        if ((sI & 1) != 0) {
            uq1.o("unsupported zip: general purpose bit flag=".concat(b(i)));
            return null;
        }
        int i2 = mf1Var.i() & 65535;
        int i3 = mf1Var.i() & 65535;
        int i4 = mf1Var.i() & 65535;
        long jB = ((long) mf1Var.b()) & 4294967295L;
        final Ref.LongRef longRef = new Ref.LongRef();
        longRef.element = ((long) mf1Var.b()) & 4294967295L;
        final Ref.LongRef longRef2 = new Ref.LongRef();
        longRef2.element = ((long) mf1Var.b()) & 4294967295L;
        int i5 = mf1Var.i() & 65535;
        int i6 = mf1Var.i() & 65535;
        int i7 = mf1Var.i() & 65535;
        mf1Var.skip(8L);
        final Ref.LongRef longRef3 = new Ref.LongRef();
        longRef3.element = ((long) mf1Var.b()) & 4294967295L;
        String strJ = mf1Var.j(i5);
        if (StringsKt.s(strJ, (char) 0)) {
            uq1.o("bad zip: filename contains 0x00");
            return null;
        }
        long j = longRef2.element == 4294967295L ? 8L : 0L;
        if (longRef.element == 4294967295L) {
            j += 8;
        }
        if (longRef3.element == 4294967295L) {
            j += 8;
        }
        final long j2 = j;
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        final Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        d(mf1Var, i6, new Function2() { // from class: eb2
            public final Object invoke(Object obj, Object obj2) throws IOException {
                int iIntValue = ((Integer) obj).intValue();
                long jLongValue = ((Long) obj2).longValue();
                mf1 mf1Var2 = mf1Var;
                if (iIntValue == 1) {
                    Ref.BooleanRef booleanRef2 = booleanRef;
                    if (booleanRef2.element) {
                        uq1.o("bad zip: zip64 extra repeated");
                        return null;
                    }
                    booleanRef2.element = true;
                    if (jLongValue < j2) {
                        uq1.o("bad zip: zip64 extra too short");
                        return null;
                    }
                    Ref.LongRef longRef4 = longRef2;
                    long jE = longRef4.element;
                    if (jE == 4294967295L) {
                        jE = mf1Var2.e();
                    }
                    longRef4.element = jE;
                    Ref.LongRef longRef5 = longRef;
                    longRef5.element = longRef5.element == 4294967295L ? mf1Var2.e() : 0L;
                    Ref.LongRef longRef6 = longRef3;
                    longRef6.element = longRef6.element == 4294967295L ? mf1Var2.e() : 0L;
                } else if (iIntValue == 10) {
                    if (jLongValue < 4) {
                        uq1.o("bad zip: NTFS extra too short");
                        return null;
                    }
                    mf1Var2.skip(4L);
                    fb2.d(mf1Var2, (int) (jLongValue - 4), new db2(objectRef, mf1Var2, objectRef2, objectRef3));
                }
                return Unit.a;
            }
        });
        if (j2 > 0 && !booleanRef.element) {
            uq1.o("bad zip: zip64 extra required but absent");
            return null;
        }
        String strJ2 = mf1Var.j(i7);
        String str = jb1.b;
        return new bb2(br0.h("/").d(strJ), d.d(strJ, "/", false), strJ2, jB, longRef.element, longRef2.element, i2, longRef3.element, i4, i3, (Long) objectRef.element, (Long) objectRef2.element, (Long) objectRef3.element, 57344);
    }

    public static final void d(mf1 mf1Var, int i, Function2 function2) throws IOException {
        ji jiVar = mf1Var.b;
        long j = i;
        while (j != 0) {
            if (j < 4) {
                uq1.o("bad zip: truncated header in extra field");
                return;
            }
            int i2 = mf1Var.i() & 65535;
            long jI = ((long) mf1Var.i()) & 65535;
            long j2 = j - 4;
            if (j2 < jI) {
                uq1.o("bad zip: truncated value in extra field");
                return;
            }
            mf1Var.J(jI);
            long j3 = jiVar.b;
            function2.invoke(Integer.valueOf(i2), Long.valueOf(jI));
            long j4 = (jiVar.b + jI) - j3;
            if (j4 < 0) {
                uq1.o(ck1.r(i2, "unsupported zip: too many bytes processed for "));
                return;
            } else {
                if (j4 > 0) {
                    jiVar.skip(j4);
                }
                j = j2 - jI;
            }
        }
    }

    public static final bb2 e(mf1 mf1Var, bb2 bb2Var) {
        int iB = mf1Var.b();
        if (iB != 67324752) {
            throw new IOException("bad zip: expected " + b(67324752) + " but was " + b(iB));
        }
        mf1Var.skip(2L);
        short sI = mf1Var.i();
        int i = sI & 65535;
        if ((sI & 1) != 0) {
            uq1.o("unsupported zip: general purpose bit flag=".concat(b(i)));
            return null;
        }
        mf1Var.skip(18L);
        long jI = ((long) mf1Var.i()) & 65535;
        int i2 = mf1Var.i() & 65535;
        mf1Var.skip(jI);
        if (bb2Var == null) {
            mf1Var.skip(i2);
            return null;
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
        d(mf1Var, i2, new db2(mf1Var, objectRef, objectRef2, objectRef3));
        return new bb2(bb2Var.a, bb2Var.b, bb2Var.c, bb2Var.d, bb2Var.e, bb2Var.f, bb2Var.g, bb2Var.h, bb2Var.i, bb2Var.j, bb2Var.k, bb2Var.l, bb2Var.m, (Integer) objectRef.element, (Integer) objectRef2.element, (Integer) objectRef3.element);
    }
}
