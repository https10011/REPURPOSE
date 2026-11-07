package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public abstract class zn2 {
    public static final qh1 a;

    static {
        int i = yk2.a;
        a = new qh1(2);
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:17)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:3)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:14)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:101)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:74)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:21)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.a(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at pw0.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:44)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:32)
     */
    public static void b(Object obj, Object obj2) {
        dm2 dm2Var = (dm2) obj;
        ho2 ho2Var = dm2Var.zzc;
        ho2 ho2Var2 = ((dm2) obj2).zzc;
        ho2 ho2Var3 = ho2.f;
        if (!ho2Var3.equals(ho2Var2)) {
            if (ho2Var3.equals(ho2Var)) {
                int i = ho2Var.a + ho2Var2.a;
                int[] iArrCopyOf = Arrays.copyOf(ho2Var.b, i);
                System.arraycopy(ho2Var2.b, 0, iArrCopyOf, ho2Var.a, ho2Var2.a);
                Object[] objArrCopyOf = Arrays.copyOf(ho2Var.c, i);
                System.arraycopy(ho2Var2.c, 0, objArrCopyOf, ho2Var.a, ho2Var2.a);
                ho2Var = new ho2(i, iArrCopyOf, objArrCopyOf, true);
            } else {
                ho2Var.getClass();
                if (!ho2Var2.equals(ho2Var3)) {
                    if (!ho2Var.e) {
                        uq1.k();
                        return;
                    }
                    int i2 = ho2Var.a + ho2Var2.a;
                    ho2Var.e(i2);
                    System.arraycopy(ho2Var2.b, 0, ho2Var.b, ho2Var.a, ho2Var2.a);
                    System.arraycopy(ho2Var2.c, 0, ho2Var.c, ho2Var.a, ho2Var2.a);
                    ho2Var.a = i2;
                }
            }
        }
        dm2Var.zzc = ho2Var;
    }

    public static Object c(Object obj, int i, um2 um2Var, qk2 qk2Var, Object obj2, qh1 qh1Var) {
        if (qk2Var == null) {
            return obj2;
        }
        if (um2Var == null) {
            Iterator it = um2Var.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next()).intValue();
                if (!qk2Var.a(iIntValue)) {
                    if (obj2 == null) {
                        qh1Var.getClass();
                        obj2 = qh1.v(obj);
                    }
                    qh1Var.getClass();
                    ((ho2) obj2).d(i << 3, Long.valueOf(iIntValue));
                    it.remove();
                }
            }
            return obj2;
        }
        int size = um2Var.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Integer num = (Integer) um2Var.get(i3);
            int iIntValue2 = num.intValue();
            if (qk2Var.a(iIntValue2)) {
                if (i3 != i2) {
                    um2Var.set(i2, num);
                }
                i2++;
            } else {
                if (obj2 == null) {
                    qh1Var.getClass();
                    obj2 = qh1.v(obj);
                }
                qh1Var.getClass();
                ((ho2) obj2).d(i << 3, Long.valueOf(iIntValue2));
            }
        }
        if (i2 != size) {
            um2Var.subList(i2, size).clear();
        }
        return obj2;
    }

    public static void d(int i, List list, wa waVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        tl2 tl2Var = (tl2) waVar.b;
        if (list instanceof ul2) {
            ur.a();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                tl2Var.i(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        tl2Var.d(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            i3 += 8;
        }
        tl2Var.r(i3);
        while (i2 < list.size()) {
            tl2Var.u(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    public static void e(int i, List list, wa waVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        tl2 tl2Var = (tl2) waVar.b;
        if (list instanceof zl2) {
            ur.a();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                tl2Var.g(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        tl2Var.d(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).getClass();
            i3 += 4;
        }
        tl2Var.r(i3);
        while (i2 < list.size()) {
            tl2Var.s(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    public static void f(int i, List list, wa waVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        tl2 tl2Var = (tl2) waVar.b;
        int i2 = 0;
        if (!(list instanceof dn2)) {
            if (!z) {
                while (i2 < list.size()) {
                    tl2Var.h(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            tl2Var.d(i, 2);
            int iB = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iB += tl2.b(((Long) list.get(i3)).longValue());
            }
            tl2Var.r(iB);
            while (i2 < list.size()) {
                tl2Var.t(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        dn2 dn2Var = (dn2) list;
        if (!z) {
            while (i2 < dn2Var.c) {
                tl2Var.h(i, dn2Var.b(i2));
                i2++;
            }
            return;
        }
        tl2Var.d(i, 2);
        int iB2 = 0;
        for (int i4 = 0; i4 < dn2Var.c; i4++) {
            iB2 += tl2.b(dn2Var.b(i4));
        }
        tl2Var.r(iB2);
        while (i2 < dn2Var.c) {
            tl2Var.t(dn2Var.b(i2));
            i2++;
        }
    }

    public static void g(int i, List list, wa waVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        tl2 tl2Var = (tl2) waVar.b;
        int i2 = 0;
        if (!(list instanceof dn2)) {
            if (!z) {
                while (i2 < list.size()) {
                    tl2Var.h(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            tl2Var.d(i, 2);
            int iB = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iB += tl2.b(((Long) list.get(i3)).longValue());
            }
            tl2Var.r(iB);
            while (i2 < list.size()) {
                tl2Var.t(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        dn2 dn2Var = (dn2) list;
        if (!z) {
            while (i2 < dn2Var.c) {
                tl2Var.h(i, dn2Var.b(i2));
                i2++;
            }
            return;
        }
        tl2Var.d(i, 2);
        int iB2 = 0;
        for (int i4 = 0; i4 < dn2Var.c; i4++) {
            iB2 += tl2.b(dn2Var.b(i4));
        }
        tl2Var.r(iB2);
        while (i2 < dn2Var.c) {
            tl2Var.t(dn2Var.b(i2));
            i2++;
        }
    }

    public static void h(int i, List list, wa waVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        tl2 tl2Var = (tl2) waVar.b;
        int i2 = 0;
        if (!(list instanceof dn2)) {
            if (!z) {
                while (i2 < list.size()) {
                    long jLongValue = ((Long) list.get(i2)).longValue();
                    tl2Var.h(i, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                    i2++;
                }
                return;
            }
            tl2Var.d(i, 2);
            int iB = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                long jLongValue2 = ((Long) list.get(i3)).longValue();
                iB += tl2.b((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
            }
            tl2Var.r(iB);
            while (i2 < list.size()) {
                long jLongValue3 = ((Long) list.get(i2)).longValue();
                tl2Var.t((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
                i2++;
            }
            return;
        }
        dn2 dn2Var = (dn2) list;
        if (!z) {
            while (i2 < dn2Var.c) {
                long jB = dn2Var.b(i2);
                tl2Var.h(i, (jB >> 63) ^ (jB + jB));
                i2++;
            }
            return;
        }
        tl2Var.d(i, 2);
        int iB2 = 0;
        for (int i4 = 0; i4 < dn2Var.c; i4++) {
            long jB2 = dn2Var.b(i4);
            iB2 += tl2.b((jB2 >> 63) ^ (jB2 + jB2));
        }
        tl2Var.r(iB2);
        while (i2 < dn2Var.c) {
            long jB3 = dn2Var.b(i2);
            tl2Var.t((jB3 >> 63) ^ (jB3 + jB3));
            i2++;
        }
    }

    public static void i(int i, List list, wa waVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        tl2 tl2Var = (tl2) waVar.b;
        int i2 = 0;
        if (!(list instanceof dn2)) {
            if (!z) {
                while (i2 < list.size()) {
                    tl2Var.i(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            tl2Var.d(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                i3 += 8;
            }
            tl2Var.r(i3);
            while (i2 < list.size()) {
                tl2Var.u(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        dn2 dn2Var = (dn2) list;
        if (!z) {
            while (i2 < dn2Var.c) {
                tl2Var.i(i, dn2Var.b(i2));
                i2++;
            }
            return;
        }
        tl2Var.d(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < dn2Var.c; i6++) {
            dn2Var.b(i6);
            i5 += 8;
        }
        tl2Var.r(i5);
        while (i2 < dn2Var.c) {
            tl2Var.u(dn2Var.b(i2));
            i2++;
        }
    }

    public static void j(int i, List list, wa waVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        tl2 tl2Var = (tl2) waVar.b;
        int i2 = 0;
        if (!(list instanceof dn2)) {
            if (!z) {
                while (i2 < list.size()) {
                    tl2Var.i(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            tl2Var.d(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                i3 += 8;
            }
            tl2Var.r(i3);
            while (i2 < list.size()) {
                tl2Var.u(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        dn2 dn2Var = (dn2) list;
        if (!z) {
            while (i2 < dn2Var.c) {
                tl2Var.i(i, dn2Var.b(i2));
                i2++;
            }
            return;
        }
        tl2Var.d(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < dn2Var.c; i6++) {
            dn2Var.b(i6);
            i5 += 8;
        }
        tl2Var.r(i5);
        while (i2 < dn2Var.c) {
            tl2Var.u(dn2Var.b(i2));
            i2++;
        }
    }

    public static void k(int i, List list, wa waVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        tl2 tl2Var = (tl2) waVar.b;
        int i2 = 0;
        if (!(list instanceof fm2)) {
            if (!z) {
                while (i2 < list.size()) {
                    tl2Var.e(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            tl2Var.d(i, 2);
            int iB = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iB += tl2.b(((Integer) list.get(i3)).intValue());
            }
            tl2Var.r(iB);
            while (i2 < list.size()) {
                tl2Var.q(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        fm2 fm2Var = (fm2) list;
        if (!z) {
            while (i2 < fm2Var.c) {
                tl2Var.e(i, fm2Var.c(i2));
                i2++;
            }
            return;
        }
        tl2Var.d(i, 2);
        int iB2 = 0;
        for (int i4 = 0; i4 < fm2Var.c; i4++) {
            iB2 += tl2.b(fm2Var.c(i4));
        }
        tl2Var.r(iB2);
        while (i2 < fm2Var.c) {
            tl2Var.q(fm2Var.c(i2));
            i2++;
        }
    }

    public static void l(int i, List list, wa waVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        tl2 tl2Var = (tl2) waVar.b;
        int i2 = 0;
        if (!(list instanceof fm2)) {
            if (!z) {
                while (i2 < list.size()) {
                    tl2Var.f(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            tl2Var.d(i, 2);
            int iA = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iA += tl2.a(((Integer) list.get(i3)).intValue());
            }
            tl2Var.r(iA);
            while (i2 < list.size()) {
                tl2Var.r(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        fm2 fm2Var = (fm2) list;
        if (!z) {
            while (i2 < fm2Var.c) {
                tl2Var.f(i, fm2Var.c(i2));
                i2++;
            }
            return;
        }
        tl2Var.d(i, 2);
        int iA2 = 0;
        for (int i4 = 0; i4 < fm2Var.c; i4++) {
            iA2 += tl2.a(fm2Var.c(i4));
        }
        tl2Var.r(iA2);
        while (i2 < fm2Var.c) {
            tl2Var.r(fm2Var.c(i2));
            i2++;
        }
    }

    public static void m(int i, List list, wa waVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        tl2 tl2Var = (tl2) waVar.b;
        int i2 = 0;
        if (!(list instanceof fm2)) {
            if (!z) {
                while (i2 < list.size()) {
                    int iIntValue = ((Integer) list.get(i2)).intValue();
                    tl2Var.f(i, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i2++;
                }
                return;
            }
            tl2Var.d(i, 2);
            int iA = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                int iIntValue2 = ((Integer) list.get(i3)).intValue();
                iA += tl2.a((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            tl2Var.r(iA);
            while (i2 < list.size()) {
                int iIntValue3 = ((Integer) list.get(i2)).intValue();
                tl2Var.r((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i2++;
            }
            return;
        }
        fm2 fm2Var = (fm2) list;
        if (!z) {
            while (i2 < fm2Var.c) {
                int iC = fm2Var.c(i2);
                tl2Var.f(i, (iC >> 31) ^ (iC + iC));
                i2++;
            }
            return;
        }
        tl2Var.d(i, 2);
        int iA2 = 0;
        for (int i4 = 0; i4 < fm2Var.c; i4++) {
            int iC2 = fm2Var.c(i4);
            iA2 += tl2.a((iC2 >> 31) ^ (iC2 + iC2));
        }
        tl2Var.r(iA2);
        while (i2 < fm2Var.c) {
            int iC3 = fm2Var.c(i2);
            tl2Var.r((iC3 >> 31) ^ (iC3 + iC3));
            i2++;
        }
    }

    public static void n(int i, List list, wa waVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        tl2 tl2Var = (tl2) waVar.b;
        int i2 = 0;
        if (!(list instanceof fm2)) {
            if (!z) {
                while (i2 < list.size()) {
                    tl2Var.g(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            tl2Var.d(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            tl2Var.r(i3);
            while (i2 < list.size()) {
                tl2Var.s(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        fm2 fm2Var = (fm2) list;
        if (!z) {
            while (i2 < fm2Var.c) {
                tl2Var.g(i, fm2Var.c(i2));
                i2++;
            }
            return;
        }
        tl2Var.d(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < fm2Var.c; i6++) {
            fm2Var.c(i6);
            i5 += 4;
        }
        tl2Var.r(i5);
        while (i2 < fm2Var.c) {
            tl2Var.s(fm2Var.c(i2));
            i2++;
        }
    }

    public static void o(int i, List list, wa waVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        tl2 tl2Var = (tl2) waVar.b;
        int i2 = 0;
        if (!(list instanceof fm2)) {
            if (!z) {
                while (i2 < list.size()) {
                    tl2Var.g(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            tl2Var.d(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            tl2Var.r(i3);
            while (i2 < list.size()) {
                tl2Var.s(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        fm2 fm2Var = (fm2) list;
        if (!z) {
            while (i2 < fm2Var.c) {
                tl2Var.g(i, fm2Var.c(i2));
                i2++;
            }
            return;
        }
        tl2Var.d(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < fm2Var.c; i6++) {
            fm2Var.c(i6);
            i5 += 4;
        }
        tl2Var.r(i5);
        while (i2 < fm2Var.c) {
            tl2Var.s(fm2Var.c(i2));
            i2++;
        }
    }

    public static void p(int i, List list, wa waVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        tl2 tl2Var = (tl2) waVar.b;
        int i2 = 0;
        if (!(list instanceof fm2)) {
            if (!z) {
                while (i2 < list.size()) {
                    tl2Var.e(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            tl2Var.d(i, 2);
            int iB = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iB += tl2.b(((Integer) list.get(i3)).intValue());
            }
            tl2Var.r(iB);
            while (i2 < list.size()) {
                tl2Var.q(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        fm2 fm2Var = (fm2) list;
        if (!z) {
            while (i2 < fm2Var.c) {
                tl2Var.e(i, fm2Var.c(i2));
                i2++;
            }
            return;
        }
        tl2Var.d(i, 2);
        int iB2 = 0;
        for (int i4 = 0; i4 < fm2Var.c; i4++) {
            iB2 += tl2.b(fm2Var.c(i4));
        }
        tl2Var.r(iB2);
        while (i2 < fm2Var.c) {
            tl2Var.q(fm2Var.c(i2));
            i2++;
        }
    }

    public static void q(int i, List list, wa waVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        tl2 tl2Var = (tl2) waVar.b;
        if (list instanceof al2) {
            ur.a();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                tl2Var.j(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        tl2Var.d(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).getClass();
            i3++;
        }
        tl2Var.r(i3);
        while (i2 < list.size()) {
            tl2Var.p(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public static int r(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof dn2)) {
            int iB = 0;
            while (i < size) {
                iB += tl2.b(((Long) list.get(i)).longValue());
                i++;
            }
            return iB;
        }
        dn2 dn2Var = (dn2) list;
        int iB2 = 0;
        while (i < size) {
            iB2 += tl2.b(dn2Var.b(i));
            i++;
        }
        return iB2;
    }

    public static int s(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof dn2)) {
            int iB = 0;
            while (i < size) {
                iB += tl2.b(((Long) list.get(i)).longValue());
                i++;
            }
            return iB;
        }
        dn2 dn2Var = (dn2) list;
        int iB2 = 0;
        while (i < size) {
            iB2 += tl2.b(dn2Var.b(i));
            i++;
        }
        return iB2;
    }

    public static int t(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof dn2)) {
            int iB = 0;
            while (i < size) {
                long jLongValue = ((Long) list.get(i)).longValue();
                iB += tl2.b((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i++;
            }
            return iB;
        }
        dn2 dn2Var = (dn2) list;
        int iB2 = 0;
        while (i < size) {
            long jB = dn2Var.b(i);
            iB2 += tl2.b((jB >> 63) ^ (jB + jB));
            i++;
        }
        return iB2;
    }

    public static int u(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof fm2)) {
            int iB = 0;
            while (i < size) {
                iB += tl2.b(((Integer) list.get(i)).intValue());
                i++;
            }
            return iB;
        }
        fm2 fm2Var = (fm2) list;
        int iB2 = 0;
        while (i < size) {
            iB2 += tl2.b(fm2Var.c(i));
            i++;
        }
        return iB2;
    }

    public static int v(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof fm2)) {
            int iB = 0;
            while (i < size) {
                iB += tl2.b(((Integer) list.get(i)).intValue());
                i++;
            }
            return iB;
        }
        fm2 fm2Var = (fm2) list;
        int iB2 = 0;
        while (i < size) {
            iB2 += tl2.b(fm2Var.c(i));
            i++;
        }
        return iB2;
    }

    public static int w(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof fm2)) {
            int iA = 0;
            while (i < size) {
                iA += tl2.a(((Integer) list.get(i)).intValue());
                i++;
            }
            return iA;
        }
        fm2 fm2Var = (fm2) list;
        int iA2 = 0;
        while (i < size) {
            iA2 += tl2.a(fm2Var.c(i));
            i++;
        }
        return iA2;
    }

    public static int x(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof fm2)) {
            int iA = 0;
            while (i < size) {
                int iIntValue = ((Integer) list.get(i)).intValue();
                iA += tl2.a((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i++;
            }
            return iA;
        }
        fm2 fm2Var = (fm2) list;
        int iA2 = 0;
        while (i < size) {
            int iC = fm2Var.c(i);
            iA2 += tl2.a((iC >> 31) ^ (iC + iC));
            i++;
        }
        return iA2;
    }

    public static int y(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (tl2.a(i << 3) + 4) * size;
    }

    public static int z(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (tl2.a(i << 3) + 8) * size;
    }
}
