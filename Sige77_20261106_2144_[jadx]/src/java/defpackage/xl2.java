package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class xl2 {
    public static final /* synthetic */ int c = 0;
    public final ao2 a = new ao2();
    public boolean b;

    static {
        new xl2(0);
    }

    public xl2(int i) {
        a();
        a();
    }

    public static void b(tl2 tl2Var, ro2 ro2Var, int i, Object obj) {
        if (ro2Var == ro2.d) {
            tl2Var.d(i, 3);
            ((dm2) ((wk2) obj)).f(tl2Var);
            tl2Var.d(i, 4);
            return;
        }
        tl2Var.d(i, ro2Var.b);
        so2 so2Var = so2.a;
        switch (ro2Var.ordinal()) {
            case 0:
                tl2Var.u(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                tl2Var.s(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                tl2Var.t(((Long) obj).longValue());
                break;
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                tl2Var.t(((Long) obj).longValue());
                break;
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                tl2Var.q(((Integer) obj).intValue());
                break;
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                tl2Var.u(((Long) obj).longValue());
                break;
            case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                tl2Var.s(((Integer) obj).intValue());
                break;
            case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                tl2Var.p(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case oc1.BYTES_FIELD_NUMBER /* 8 */:
                if (!(obj instanceof hl2)) {
                    tl2Var.v((String) obj);
                } else {
                    tl2Var.m((hl2) obj);
                }
                break;
            case 9:
                ((dm2) ((wk2) obj)).f(tl2Var);
                break;
            case 10:
                tl2Var.o((wk2) obj);
                break;
            case 11:
                if (!(obj instanceof hl2)) {
                    byte[] bArr = (byte[]) obj;
                    tl2Var.n(bArr, bArr.length);
                } else {
                    tl2Var.m((hl2) obj);
                }
                break;
            case 12:
                tl2Var.r(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof hm2)) {
                    tl2Var.q(((Integer) obj).intValue());
                } else {
                    tl2Var.q(((hm2) obj).zza());
                }
                break;
            case 14:
                tl2Var.s(((Integer) obj).intValue());
                break;
            case 15:
                tl2Var.u(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                tl2Var.r((iIntValue >> 31) ^ (iIntValue + iIntValue));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                tl2Var.t((jLongValue >> 63) ^ (jLongValue + jLongValue));
                break;
        }
    }

    public final void a() {
        if (this.b) {
            return;
        }
        ao2 ao2Var = this.a;
        int i = ao2Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = ao2Var.a(i2).b;
            if (obj instanceof dm2) {
                dm2 dm2Var = (dm2) obj;
                un2.c.a(dm2Var.getClass()).f(dm2Var);
                dm2Var.h();
            }
        }
        Iterator it = ao2Var.b().iterator();
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            if (value instanceof dm2) {
                dm2 dm2Var2 = (dm2) value;
                un2.c.a(dm2Var2.getClass()).f(dm2Var2);
                dm2Var2.h();
            }
        }
        if (!ao2Var.d) {
            if (ao2Var.b > 0) {
                ao2Var.a(0).a.getClass();
                ur.a();
                return;
            } else {
                Iterator it2 = ao2Var.b().iterator();
                if (it2.hasNext()) {
                    ((Map.Entry) it2.next()).getKey().getClass();
                    ur.a();
                    return;
                }
            }
        }
        if (!ao2Var.d) {
            ao2Var.c = ao2Var.c.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(ao2Var.c);
            ao2Var.f = ao2Var.f.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(ao2Var.f);
            ao2Var.d = true;
        }
        this.b = true;
    }

    public final Object clone() {
        xl2 xl2Var = new xl2();
        ao2 ao2Var = this.a;
        if (ao2Var.b > 0) {
            ao2Var.a(0).a.getClass();
            ur.a();
            return null;
        }
        Iterator it = ao2Var.b().iterator();
        if (!it.hasNext()) {
            return xl2Var;
        }
        Map.Entry entry = (Map.Entry) it.next();
        if (entry.getKey() != null) {
            ur.a();
            return null;
        }
        entry.getValue();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof xl2) {
            return this.a.equals(((xl2) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public xl2() {
    }
}
