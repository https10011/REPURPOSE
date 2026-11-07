package defpackage;

import java.io.IOException;
import java.util.GregorianCalendar;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.zip.Inflater;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class cb2 extends hb0 {
    public static final jb1 f;
    public final jb1 c;
    public final hb0 d;
    public final LinkedHashMap e;

    static {
        String str = jb1.b;
        f = br0.h("/");
    }

    public cb2(jb1 jb1Var, hb0 hb0Var, LinkedHashMap linkedHashMap) {
        this.c = jb1Var;
        this.d = hb0Var;
        this.e = linkedHashMap;
    }

    @Override // defpackage.hb0
    public final kr1 a(jb1 jb1Var) throws IOException {
        jb1Var.getClass();
        throw new IOException("zip file systems are read-only");
    }

    @Override // defpackage.hb0
    public final void b(jb1 jb1Var, jb1 jb1Var2) throws IOException {
        jb1Var.getClass();
        jb1Var2.getClass();
        throw new IOException("zip file systems are read-only");
    }

    @Override // defpackage.hb0
    public final void e(jb1 jb1Var) throws IOException {
        jb1Var.getClass();
        throw new IOException("zip file systems are read-only");
    }

    @Override // defpackage.hb0
    public final void i(jb1 jb1Var) throws IOException {
        jb1Var.getClass();
        throw new IOException("zip file systems are read-only");
    }

    @Override // defpackage.hb0
    public final List l(jb1 jb1Var) throws IOException {
        jb1 jb1Var2 = f;
        jb1Var2.getClass();
        bb2 bb2Var = (bb2) this.e.get(d.b(jb1Var2, jb1Var, true));
        if (bb2Var == null) {
            uq1.g(jb1Var, "not a directory: ");
            return null;
        }
        List listB = CollectionsKt.B(bb2Var.q);
        listB.getClass();
        return listB;
    }

    /* JADX WARN: Code duplicated, block: B:59:0x00cf  */
    @Override // defpackage.hb0
    public final x00 n(jb1 jb1Var) throws Throwable {
        Long lValueOf;
        Long lValueOf2;
        Long l;
        Long lValueOf3;
        Throwable th;
        Throwable th2;
        jb1Var.getClass();
        jb1 jb1Var2 = f;
        jb1Var2.getClass();
        bb2 bb2VarE = (bb2) this.e.get(d.b(jb1Var2, jb1Var, true));
        if (bb2VarE == null) {
            return null;
        }
        long j = bb2VarE.h;
        if (j != -1) {
            fu0 fu0VarP = this.d.p(this.c);
            try {
                mf1 mf1Var = new mf1(fu0VarP.a(j));
                try {
                    bb2VarE = fb2.e(mf1Var, bb2VarE);
                    bb2VarE.getClass();
                    try {
                        mf1Var.close();
                        th2 = null;
                    } catch (Throwable th3) {
                        th2 = th3;
                    }
                } catch (Throwable th4) {
                    try {
                        mf1Var.close();
                    } catch (Throwable th5) {
                        a80.a(th4, th5);
                    }
                    th2 = th4;
                    bb2VarE = null;
                }
                if (th2 != null) {
                    throw th2;
                }
                try {
                    fu0VarP.close();
                    th = null;
                } catch (Throwable th6) {
                    th = th6;
                }
            } catch (Throwable th7) {
                if (fu0VarP != null) {
                    try {
                        fu0VarP.close();
                    } catch (Throwable th8) {
                        a80.a(th7, th8);
                    }
                }
                th = th7;
                bb2VarE = null;
            }
            if (th != null) {
                throw th;
            }
        }
        boolean z = bb2VarE.b;
        boolean z2 = !z;
        Long lValueOf4 = z ? null : Long.valueOf(bb2VarE.f);
        Long l2 = bb2VarE.m;
        if (l2 != null) {
            lValueOf = Long.valueOf((l2.longValue() / 10000) - 11644473600000L);
        } else {
            Integer num = bb2VarE.p;
            lValueOf = num != null ? Long.valueOf(((long) num.intValue()) * 1000) : null;
        }
        Long l3 = bb2VarE.k;
        if (l3 != null) {
            lValueOf2 = Long.valueOf((l3.longValue() / 10000) - 11644473600000L);
        } else {
            Integer num2 = bb2VarE.n;
            if (num2 != null) {
                lValueOf2 = Long.valueOf(((long) num2.intValue()) * 1000);
            } else {
                int i = bb2VarE.j;
                if (i != -1) {
                    int i2 = bb2VarE.i;
                    if (i == -1) {
                        lValueOf2 = null;
                    } else {
                        int i3 = (i >> 11) & 31;
                        int i4 = (i >> 5) & 63;
                        int i5 = (i & 31) << 1;
                        GregorianCalendar gregorianCalendar = new GregorianCalendar();
                        gregorianCalendar.set(14, 0);
                        gregorianCalendar.set(((i2 >> 9) & 127) + 1980, ((i2 >> 5) & 15) - 1, i2 & 31, i3, i4, i5);
                        lValueOf2 = Long.valueOf(gregorianCalendar.getTime().getTime());
                    }
                } else {
                    lValueOf2 = null;
                }
            }
        }
        Long l4 = bb2VarE.l;
        if (l4 == null) {
            Integer num3 = bb2VarE.o;
            if (num3 != null) {
                lValueOf3 = Long.valueOf(((long) num3.intValue()) * 1000);
            } else {
                l = null;
            }
            return new x00(z2, z, null, lValueOf4, lValueOf, lValueOf2, l);
        }
        lValueOf3 = Long.valueOf((l4.longValue() / 10000) - 11644473600000L);
        l = lValueOf3;
        return new x00(z2, z, null, lValueOf4, lValueOf, lValueOf2, l);
    }

    @Override // defpackage.hb0
    public final fu0 p(jb1 jb1Var) {
        throw new UnsupportedOperationException("not implemented yet!");
    }

    @Override // defpackage.hb0
    public final kr1 q(jb1 jb1Var) throws IOException {
        jb1Var.getClass();
        throw new IOException("zip file systems are read-only");
    }

    @Override // defpackage.hb0
    public final ds1 s(jb1 jb1Var) throws Throwable {
        Throwable th;
        mf1 mf1Var;
        jb1Var.getClass();
        jb1 jb1Var2 = f;
        jb1Var2.getClass();
        bb2 bb2Var = (bb2) this.e.get(d.b(jb1Var2, jb1Var, true));
        if (bb2Var == null) {
            ur.b(jb1Var, "no such file: ");
            return null;
        }
        long j = bb2Var.f;
        fu0 fu0VarP = this.d.p(this.c);
        try {
            mf1Var = new mf1(fu0VarP.a(bb2Var.h));
            try {
                fu0VarP.close();
                th = null;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            if (fu0VarP != null) {
                try {
                    fu0VarP.close();
                } catch (Throwable th4) {
                    a80.a(th3, th4);
                }
            }
            th = th3;
            mf1Var = null;
        }
        if (th != null) {
            throw th;
        }
        mf1Var.getClass();
        fb2.e(mf1Var, null);
        if (bb2Var.g == 0) {
            return new cd0(mf1Var, j, true);
        }
        return new cd0(new aq0(new mf1(new cd0(mf1Var, bb2Var.e, true)), new Inflater(true)), j, false);
    }
}
