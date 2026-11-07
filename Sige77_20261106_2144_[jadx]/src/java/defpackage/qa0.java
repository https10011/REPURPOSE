package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class qa0 {
    public static final /* synthetic */ int c = 0;
    public final rr1 a = rr1.f();
    public boolean b;

    static {
        new qa0(0);
    }

    public qa0(int i) {
        a();
        a();
    }

    public static void b(un unVar, da2 da2Var, int i, Object obj) {
        if (da2Var == da2.d) {
            unVar.B(i, 3);
            ((d1) obj).b(unVar);
            unVar.B(i, 4);
        }
        unVar.B(i, da2Var.b);
        switch (da2Var.ordinal()) {
            case 0:
                unVar.u(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                unVar.s(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                unVar.F(((Long) obj).longValue());
                break;
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                unVar.F(((Long) obj).longValue());
                break;
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                unVar.w(((Integer) obj).intValue());
                break;
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                unVar.u(((Long) obj).longValue());
                break;
            case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                unVar.s(((Integer) obj).intValue());
                break;
            case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                unVar.m(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case oc1.BYTES_FIELD_NUMBER /* 8 */:
                if (!(obj instanceof qj)) {
                    unVar.A((String) obj);
                } else {
                    unVar.q((qj) obj);
                }
                break;
            case 9:
                ((d1) obj).b(unVar);
                break;
            case 10:
                d1 d1Var = (d1) obj;
                unVar.D(((sh0) d1Var).a(null));
                d1Var.b(unVar);
                break;
            case 11:
                if (!(obj instanceof qj)) {
                    byte[] bArr = (byte[]) obj;
                    int length = bArr.length;
                    unVar.D(length);
                    unVar.n(bArr, 0, length);
                } else {
                    unVar.q((qj) obj);
                }
                break;
            case 12:
                unVar.D(((Integer) obj).intValue());
                break;
            case 13:
                unVar.w(((Integer) obj).intValue());
                break;
            case 14:
                unVar.s(((Integer) obj).intValue());
                break;
            case 15:
                unVar.u(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                unVar.D((iIntValue >> 31) ^ (iIntValue << 1));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                unVar.F((jLongValue >> 63) ^ (jLongValue << 1));
                break;
        }
    }

    public final void a() {
        if (this.b) {
            return;
        }
        rr1 rr1Var = this.a;
        int size = rr1Var.a.size();
        for (int i = 0; i < size; i++) {
            Map.Entry entryC = rr1Var.c(i);
            if (entryC.getValue() instanceof sh0) {
                sh0 sh0Var = (sh0) entryC.getValue();
                sh0Var.getClass();
                td1 td1Var = td1.c;
                td1Var.getClass();
                td1Var.a(sh0Var.getClass()).d(sh0Var);
                sh0Var.h();
            }
        }
        if (!rr1Var.c) {
            if (rr1Var.a.size() > 0) {
                rr1Var.c(0).getKey().getClass();
                ur.a();
                return;
            } else {
                Iterator it = rr1Var.d().iterator();
                if (it.hasNext()) {
                    ((Map.Entry) it.next()).getKey().getClass();
                    ur.a();
                    return;
                }
            }
        }
        if (!rr1Var.c) {
            rr1Var.b = rr1Var.b.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(rr1Var.b);
            rr1Var.e = rr1Var.e.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(rr1Var.e);
            rr1Var.c = true;
        }
        this.b = true;
    }

    public final Object clone() {
        qa0 qa0Var = new qa0();
        rr1 rr1Var = this.a;
        if (rr1Var.a.size() > 0) {
            Map.Entry entryC = rr1Var.c(0);
            if (entryC.getKey() != null) {
                ur.a();
                return null;
            }
            entryC.getValue();
            throw null;
        }
        Iterator it = rr1Var.d().iterator();
        if (!it.hasNext()) {
            return qa0Var;
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
        if (obj instanceof qa0) {
            return this.a.equals(((qa0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public qa0() {
    }
}
