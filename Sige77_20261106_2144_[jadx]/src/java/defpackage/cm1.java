package defpackage;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class cm1 {
    public static final Class a;
    public static final u22 b;
    public static final u22 c;

    static {
        Class<?> cls;
        Class<?> cls2;
        td1 td1Var = td1.c;
        u22 u22Var = null;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        a = cls;
        try {
            td1 td1Var2 = td1.c;
            try {
                cls2 = Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
            } catch (Throwable unused2) {
                cls2 = null;
            }
            if (cls2 != null) {
                u22Var = (u22) cls2.getConstructor(null).newInstance(null);
            }
        } catch (Throwable unused3) {
        }
        b = u22Var;
        c = new u22();
    }

    public static int a(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof vq0) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iJ = 0;
        for (int i = 0; i < size; i++) {
            iJ += un.j(((Integer) list.get(i)).intValue());
        }
        return iJ;
    }

    public static int b(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (un.h(i) + 4) * size;
    }

    public static int c(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (un.h(i) + 8) * size;
    }

    public static int d(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof vq0) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iJ = 0;
        for (int i = 0; i < size; i++) {
            iJ += un.j(((Integer) list.get(i)).intValue());
        }
        return iJ;
    }

    public static int e(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof q01) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iJ = 0;
        for (int i = 0; i < size; i++) {
            iJ += un.j(((Long) list.get(i)).longValue());
        }
        return iJ;
    }

    public static int f(List list) {
        int size = list.size();
        if (size != 0) {
            if (!(list instanceof vq0)) {
                int i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    int iIntValue = ((Integer) list.get(i2)).intValue();
                    i += un.i((iIntValue >> 31) ^ (iIntValue << 1));
                }
                return i;
            }
            y00.n(list);
            if (size > 0) {
                throw null;
            }
        }
        return 0;
    }

    public static int g(List list) {
        int size = list.size();
        if (size != 0) {
            if (!(list instanceof q01)) {
                int iJ = 0;
                for (int i = 0; i < size; i++) {
                    long jLongValue = ((Long) list.get(i)).longValue();
                    iJ += un.j((jLongValue >> 63) ^ (jLongValue << 1));
                }
                return iJ;
            }
            y00.n(list);
            if (size > 0) {
                throw null;
            }
        }
        return 0;
    }

    public static int h(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof vq0) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += un.i(((Integer) list.get(i2)).intValue());
        }
        return i;
    }

    public static int i(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof q01) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iJ = 0;
        for (int i = 0; i < size; i++) {
            iJ += un.j(((Long) list.get(i)).longValue());
        }
        return iJ;
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
    public static void k(u22 u22Var, Object obj, Object obj2) {
        u22Var.getClass();
        sh0 sh0Var = (sh0) obj;
        t22 t22Var = sh0Var.unknownFields;
        t22 t22Var2 = ((sh0) obj2).unknownFields;
        t22 t22Var3 = t22.f;
        if (!t22Var3.equals(t22Var2)) {
            if (t22Var3.equals(t22Var)) {
                int i = t22Var.a + t22Var2.a;
                int[] iArrCopyOf = Arrays.copyOf(t22Var.b, i);
                System.arraycopy(t22Var2.b, 0, iArrCopyOf, t22Var.a, t22Var2.a);
                Object[] objArrCopyOf = Arrays.copyOf(t22Var.c, i);
                System.arraycopy(t22Var2.c, 0, objArrCopyOf, t22Var.a, t22Var2.a);
                t22Var = new t22(i, iArrCopyOf, objArrCopyOf, true);
            } else {
                t22Var.getClass();
                if (!t22Var2.equals(t22Var3)) {
                    if (!t22Var.e) {
                        uq1.k();
                        return;
                    }
                    int i2 = t22Var.a + t22Var2.a;
                    t22Var.a(i2);
                    System.arraycopy(t22Var2.b, 0, t22Var.b, t22Var.a, t22Var2.a);
                    System.arraycopy(t22Var2.c, 0, t22Var.c, t22Var.a, t22Var2.a);
                    t22Var.a = i2;
                }
            }
        }
        sh0Var.unknownFields = t22Var;
    }

    public static boolean l(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void m(int i, List list, wa waVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        un unVar = (un) waVar.b;
        if (list instanceof yh) {
            ur.a();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                unVar.o(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        unVar.B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).getClass();
            Logger logger = un.f;
            i3++;
        }
        unVar.D(i3);
        while (i2 < list.size()) {
            unVar.m(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public static void n(int i, List list, wa waVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        un unVar = (un) waVar.b;
        if (list instanceof s20) {
            ur.a();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                double dDoubleValue = ((Double) list.get(i2)).doubleValue();
                unVar.getClass();
                unVar.t(i, Double.doubleToRawLongBits(dDoubleValue));
                i2++;
            }
            return;
        }
        unVar.B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            Logger logger = un.f;
            i3 += 8;
        }
        unVar.D(i3);
        while (i2 < list.size()) {
            unVar.u(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    public static void o(int i, List list, wa waVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        un unVar = (un) waVar.b;
        if (list instanceof vq0) {
            ur.a();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                unVar.v(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        unVar.B(i, 2);
        int iJ = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iJ += un.j(((Integer) list.get(i3)).intValue());
        }
        unVar.D(iJ);
        while (i2 < list.size()) {
            unVar.w(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void p(int i, List list, wa waVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        un unVar = (un) waVar.b;
        if (list instanceof vq0) {
            ur.a();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                unVar.r(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        unVar.B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            Logger logger = un.f;
            i3 += 4;
        }
        unVar.D(i3);
        while (i2 < list.size()) {
            unVar.s(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void q(int i, List list, wa waVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        un unVar = (un) waVar.b;
        if (list instanceof q01) {
            ur.a();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                unVar.t(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        unVar.B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            Logger logger = un.f;
            i3 += 8;
        }
        unVar.D(i3);
        while (i2 < list.size()) {
            unVar.u(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void r(int i, List list, wa waVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        un unVar = (un) waVar.b;
        if (list instanceof dd0) {
            ur.a();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                float fFloatValue = ((Float) list.get(i2)).floatValue();
                unVar.getClass();
                unVar.r(i, Float.floatToRawIntBits(fFloatValue));
                i2++;
            }
            return;
        }
        unVar.B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).getClass();
            Logger logger = un.f;
            i3 += 4;
        }
        unVar.D(i3);
        while (i2 < list.size()) {
            unVar.s(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    public static void s(int i, List list, wa waVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        un unVar = (un) waVar.b;
        if (list instanceof vq0) {
            ur.a();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                unVar.v(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        unVar.B(i, 2);
        int iJ = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iJ += un.j(((Integer) list.get(i3)).intValue());
        }
        unVar.D(iJ);
        while (i2 < list.size()) {
            unVar.w(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void t(int i, List list, wa waVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        un unVar = (un) waVar.b;
        if (list instanceof q01) {
            ur.a();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                unVar.E(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        unVar.B(i, 2);
        int iJ = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iJ += un.j(((Long) list.get(i3)).longValue());
        }
        unVar.D(iJ);
        while (i2 < list.size()) {
            unVar.F(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void u(int i, List list, wa waVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        un unVar = (un) waVar.b;
        if (list instanceof vq0) {
            ur.a();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                unVar.r(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        unVar.B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            Logger logger = un.f;
            i3 += 4;
        }
        unVar.D(i3);
        while (i2 < list.size()) {
            unVar.s(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void v(int i, List list, wa waVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        un unVar = (un) waVar.b;
        if (list instanceof q01) {
            ur.a();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                unVar.t(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        unVar.B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            Logger logger = un.f;
            i3 += 8;
        }
        unVar.D(i3);
        while (i2 < list.size()) {
            unVar.u(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void w(int i, List list, wa waVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        un unVar = (un) waVar.b;
        if (list instanceof vq0) {
            ur.a();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                int iIntValue = ((Integer) list.get(i2)).intValue();
                unVar.C(i, (iIntValue >> 31) ^ (iIntValue << 1));
                i2++;
            }
            return;
        }
        unVar.B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            int iIntValue2 = ((Integer) list.get(i4)).intValue();
            i3 += un.i((iIntValue2 >> 31) ^ (iIntValue2 << 1));
        }
        unVar.D(i3);
        while (i2 < list.size()) {
            int iIntValue3 = ((Integer) list.get(i2)).intValue();
            unVar.D((iIntValue3 >> 31) ^ (iIntValue3 << 1));
            i2++;
        }
    }

    public static void x(int i, List list, wa waVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        un unVar = (un) waVar.b;
        if (list instanceof q01) {
            ur.a();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                long jLongValue = ((Long) list.get(i2)).longValue();
                unVar.E(i, (jLongValue >> 63) ^ (jLongValue << 1));
                i2++;
            }
            return;
        }
        unVar.B(i, 2);
        int iJ = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            long jLongValue2 = ((Long) list.get(i3)).longValue();
            iJ += un.j((jLongValue2 >> 63) ^ (jLongValue2 << 1));
        }
        unVar.D(iJ);
        while (i2 < list.size()) {
            long jLongValue3 = ((Long) list.get(i2)).longValue();
            unVar.F((jLongValue3 >> 63) ^ (jLongValue3 << 1));
            i2++;
        }
    }

    public static void y(int i, List list, wa waVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        un unVar = (un) waVar.b;
        if (list instanceof vq0) {
            ur.a();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                unVar.C(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        unVar.B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += un.i(((Integer) list.get(i4)).intValue());
        }
        unVar.D(i3);
        while (i2 < list.size()) {
            unVar.D(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void z(int i, List list, wa waVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        un unVar = (un) waVar.b;
        if (list instanceof q01) {
            ur.a();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                unVar.E(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        unVar.B(i, 2);
        int iJ = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iJ += un.j(((Long) list.get(i3)).longValue());
        }
        unVar.D(iJ);
        while (i2 < list.size()) {
            unVar.F(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static Object j(Object obj, int i, cr0 cr0Var, Object obj2, u22 u22Var) {
        return obj2;
    }
}
