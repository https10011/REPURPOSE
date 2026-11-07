package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class q11 {
    public final p11 a;

    public q11(da2 da2Var, da2 da2Var2, oc1 oc1Var) {
        this.a = new p11(da2Var, da2Var2, oc1Var, 0);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0109  */
    /* JADX WARN: Code duplicated, block: B:41:0x0112  */
    /* JADX WARN: Code duplicated, block: B:43:0x0116  */
    /* JADX WARN: Code duplicated, block: B:44:0x0128  */
    /* JADX WARN: Code duplicated, block: B:45:0x013a  */
    /* JADX WARN: Code duplicated, block: B:47:0x0143  */
    /* JADX WARN: Code duplicated, block: B:49:0x014c  */
    /* JADX WARN: Code duplicated, block: B:50:0x015a  */
    /* JADX WARN: Code duplicated, block: B:51:0x0167  */
    /* JADX WARN: Code duplicated, block: B:53:0x016b  */
    /* JADX WARN: Code duplicated, block: B:55:0x017a  */
    /* JADX WARN: Code duplicated, block: B:56:0x0183  */
    /* JADX WARN: Code duplicated, block: B:57:0x0191  */
    /* JADX WARN: Code duplicated, block: B:58:0x019b  */
    /* JADX WARN: Code duplicated, block: B:60:0x019f  */
    /* JADX WARN: Code duplicated, block: B:61:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:62:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:63:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:64:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:65:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:66:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:67:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:68:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:69:0x01f6  */
    public static int a(p11 p11Var, Object obj, Object obj2) {
        int iJ;
        int size;
        int i;
        int i2;
        da2 da2Var;
        int iH;
        int size2;
        int i3;
        da2 da2Var2 = (da2) p11Var.b;
        int i4 = qa0.c;
        int iJ2 = 1;
        int iH2 = un.h(1);
        aa2 aa2Var = da2.d;
        if (da2Var2 == aa2Var) {
            iH2 *= 2;
        }
        switch (da2Var2.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                iJ = 8;
                i2 = iJ + iH2;
                da2Var = (da2) p11Var.c;
                iH = un.h(2);
                if (da2Var == aa2Var) {
                    iH *= 2;
                }
                switch (da2Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 1:
                        ((Float) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                        iJ2 = un.j(((Long) obj2).longValue());
                        return iJ2 + iH + i2;
                    case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                        iJ2 = un.j(((Long) obj2).longValue());
                        return iJ2 + iH + i2;
                    case oc1.LONG_FIELD_NUMBER /* 4 */:
                        iJ2 = un.j(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case oc1.STRING_FIELD_NUMBER /* 5 */:
                        ((Long) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                        ((Integer) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                        ((Boolean) obj2).getClass();
                        return iJ2 + iH + i2;
                    case oc1.BYTES_FIELD_NUMBER /* 8 */:
                        if (obj2 instanceof qj) {
                            size2 = ((qj) obj2).size();
                            i3 = un.i(size2);
                            iJ2 = i3 + size2;
                        } else {
                            iJ2 = un.g((String) obj2);
                        }
                        return iJ2 + iH + i2;
                    case 9:
                        iJ2 = ((sh0) ((d1) obj2)).a(null);
                        return iJ2 + iH + i2;
                    case 10:
                        size2 = ((sh0) ((d1) obj2)).a(null);
                        i3 = un.i(size2);
                        iJ2 = i3 + size2;
                        return iJ2 + iH + i2;
                    case 11:
                        if (obj2 instanceof qj) {
                            size2 = ((qj) obj2).size();
                            i3 = un.i(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            i3 = un.i(size2);
                        }
                        iJ2 = i3 + size2;
                        return iJ2 + iH + i2;
                    case 12:
                        iJ2 = un.i(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 13:
                        iJ2 = un.j(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 14:
                        ((Integer) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 15:
                        ((Long) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 16:
                        int iIntValue = ((Integer) obj2).intValue();
                        iJ2 = un.i((iIntValue >> 31) ^ (iIntValue << 1));
                        return iJ2 + iH + i2;
                    case 17:
                        long jLongValue = ((Long) obj2).longValue();
                        iJ2 = un.j((jLongValue >> 63) ^ (jLongValue << 1));
                        return iJ2 + iH + i2;
                    default:
                        uq1.m("There is no way to get here, but the compiler thinks otherwise.");
                        return 0;
                }
            case 1:
                ((Float) obj).getClass();
                iJ = 4;
                i2 = iJ + iH2;
                da2Var = (da2) p11Var.c;
                iH = un.h(2);
                if (da2Var == aa2Var) {
                    iH *= 2;
                }
                switch (da2Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 1:
                        ((Float) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                        iJ2 = un.j(((Long) obj2).longValue());
                        return iJ2 + iH + i2;
                    case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                        iJ2 = un.j(((Long) obj2).longValue());
                        return iJ2 + iH + i2;
                    case oc1.LONG_FIELD_NUMBER /* 4 */:
                        iJ2 = un.j(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case oc1.STRING_FIELD_NUMBER /* 5 */:
                        ((Long) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                        ((Integer) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                        ((Boolean) obj2).getClass();
                        return iJ2 + iH + i2;
                    case oc1.BYTES_FIELD_NUMBER /* 8 */:
                        if (obj2 instanceof qj) {
                            size2 = ((qj) obj2).size();
                            i3 = un.i(size2);
                            iJ2 = i3 + size2;
                        } else {
                            iJ2 = un.g((String) obj2);
                        }
                        return iJ2 + iH + i2;
                    case 9:
                        iJ2 = ((sh0) ((d1) obj2)).a(null);
                        return iJ2 + iH + i2;
                    case 10:
                        size2 = ((sh0) ((d1) obj2)).a(null);
                        i3 = un.i(size2);
                        iJ2 = i3 + size2;
                        return iJ2 + iH + i2;
                    case 11:
                        if (obj2 instanceof qj) {
                            size2 = ((qj) obj2).size();
                            i3 = un.i(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            i3 = un.i(size2);
                        }
                        iJ2 = i3 + size2;
                        return iJ2 + iH + i2;
                    case 12:
                        iJ2 = un.i(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 13:
                        iJ2 = un.j(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 14:
                        ((Integer) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 15:
                        ((Long) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 16:
                        int iIntValue2 = ((Integer) obj2).intValue();
                        iJ2 = un.i((iIntValue2 >> 31) ^ (iIntValue2 << 1));
                        return iJ2 + iH + i2;
                    case 17:
                        long jLongValue2 = ((Long) obj2).longValue();
                        iJ2 = un.j((jLongValue2 >> 63) ^ (jLongValue2 << 1));
                        return iJ2 + iH + i2;
                    default:
                        uq1.m("There is no way to get here, but the compiler thinks otherwise.");
                        return 0;
                }
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                iJ = un.j(((Long) obj).longValue());
                i2 = iJ + iH2;
                da2Var = (da2) p11Var.c;
                iH = un.h(2);
                if (da2Var == aa2Var) {
                    iH *= 2;
                }
                switch (da2Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 1:
                        ((Float) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                        iJ2 = un.j(((Long) obj2).longValue());
                        return iJ2 + iH + i2;
                    case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                        iJ2 = un.j(((Long) obj2).longValue());
                        return iJ2 + iH + i2;
                    case oc1.LONG_FIELD_NUMBER /* 4 */:
                        iJ2 = un.j(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case oc1.STRING_FIELD_NUMBER /* 5 */:
                        ((Long) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                        ((Integer) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                        ((Boolean) obj2).getClass();
                        return iJ2 + iH + i2;
                    case oc1.BYTES_FIELD_NUMBER /* 8 */:
                        if (obj2 instanceof qj) {
                            size2 = ((qj) obj2).size();
                            i3 = un.i(size2);
                            iJ2 = i3 + size2;
                        } else {
                            iJ2 = un.g((String) obj2);
                        }
                        return iJ2 + iH + i2;
                    case 9:
                        iJ2 = ((sh0) ((d1) obj2)).a(null);
                        return iJ2 + iH + i2;
                    case 10:
                        size2 = ((sh0) ((d1) obj2)).a(null);
                        i3 = un.i(size2);
                        iJ2 = i3 + size2;
                        return iJ2 + iH + i2;
                    case 11:
                        if (obj2 instanceof qj) {
                            size2 = ((qj) obj2).size();
                            i3 = un.i(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            i3 = un.i(size2);
                        }
                        iJ2 = i3 + size2;
                        return iJ2 + iH + i2;
                    case 12:
                        iJ2 = un.i(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 13:
                        iJ2 = un.j(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 14:
                        ((Integer) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 15:
                        ((Long) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 16:
                        int iIntValue3 = ((Integer) obj2).intValue();
                        iJ2 = un.i((iIntValue3 >> 31) ^ (iIntValue3 << 1));
                        return iJ2 + iH + i2;
                    case 17:
                        long jLongValue3 = ((Long) obj2).longValue();
                        iJ2 = un.j((jLongValue3 >> 63) ^ (jLongValue3 << 1));
                        return iJ2 + iH + i2;
                    default:
                        uq1.m("There is no way to get here, but the compiler thinks otherwise.");
                        return 0;
                }
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                iJ = un.j(((Long) obj).longValue());
                i2 = iJ + iH2;
                da2Var = (da2) p11Var.c;
                iH = un.h(2);
                if (da2Var == aa2Var) {
                    iH *= 2;
                }
                switch (da2Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 1:
                        ((Float) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                        iJ2 = un.j(((Long) obj2).longValue());
                        return iJ2 + iH + i2;
                    case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                        iJ2 = un.j(((Long) obj2).longValue());
                        return iJ2 + iH + i2;
                    case oc1.LONG_FIELD_NUMBER /* 4 */:
                        iJ2 = un.j(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case oc1.STRING_FIELD_NUMBER /* 5 */:
                        ((Long) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                        ((Integer) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                        ((Boolean) obj2).getClass();
                        return iJ2 + iH + i2;
                    case oc1.BYTES_FIELD_NUMBER /* 8 */:
                        if (obj2 instanceof qj) {
                            size2 = ((qj) obj2).size();
                            i3 = un.i(size2);
                            iJ2 = i3 + size2;
                        } else {
                            iJ2 = un.g((String) obj2);
                        }
                        return iJ2 + iH + i2;
                    case 9:
                        iJ2 = ((sh0) ((d1) obj2)).a(null);
                        return iJ2 + iH + i2;
                    case 10:
                        size2 = ((sh0) ((d1) obj2)).a(null);
                        i3 = un.i(size2);
                        iJ2 = i3 + size2;
                        return iJ2 + iH + i2;
                    case 11:
                        if (obj2 instanceof qj) {
                            size2 = ((qj) obj2).size();
                            i3 = un.i(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            i3 = un.i(size2);
                        }
                        iJ2 = i3 + size2;
                        return iJ2 + iH + i2;
                    case 12:
                        iJ2 = un.i(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 13:
                        iJ2 = un.j(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 14:
                        ((Integer) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 15:
                        ((Long) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 16:
                        int iIntValue4 = ((Integer) obj2).intValue();
                        iJ2 = un.i((iIntValue4 >> 31) ^ (iIntValue4 << 1));
                        return iJ2 + iH + i2;
                    case 17:
                        long jLongValue4 = ((Long) obj2).longValue();
                        iJ2 = un.j((jLongValue4 >> 63) ^ (jLongValue4 << 1));
                        return iJ2 + iH + i2;
                    default:
                        uq1.m("There is no way to get here, but the compiler thinks otherwise.");
                        return 0;
                }
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                iJ = un.j(((Integer) obj).intValue());
                i2 = iJ + iH2;
                da2Var = (da2) p11Var.c;
                iH = un.h(2);
                if (da2Var == aa2Var) {
                    iH *= 2;
                }
                switch (da2Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 1:
                        ((Float) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                        iJ2 = un.j(((Long) obj2).longValue());
                        return iJ2 + iH + i2;
                    case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                        iJ2 = un.j(((Long) obj2).longValue());
                        return iJ2 + iH + i2;
                    case oc1.LONG_FIELD_NUMBER /* 4 */:
                        iJ2 = un.j(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case oc1.STRING_FIELD_NUMBER /* 5 */:
                        ((Long) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                        ((Integer) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                        ((Boolean) obj2).getClass();
                        return iJ2 + iH + i2;
                    case oc1.BYTES_FIELD_NUMBER /* 8 */:
                        if (obj2 instanceof qj) {
                            size2 = ((qj) obj2).size();
                            i3 = un.i(size2);
                            iJ2 = i3 + size2;
                        } else {
                            iJ2 = un.g((String) obj2);
                        }
                        return iJ2 + iH + i2;
                    case 9:
                        iJ2 = ((sh0) ((d1) obj2)).a(null);
                        return iJ2 + iH + i2;
                    case 10:
                        size2 = ((sh0) ((d1) obj2)).a(null);
                        i3 = un.i(size2);
                        iJ2 = i3 + size2;
                        return iJ2 + iH + i2;
                    case 11:
                        if (obj2 instanceof qj) {
                            size2 = ((qj) obj2).size();
                            i3 = un.i(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            i3 = un.i(size2);
                        }
                        iJ2 = i3 + size2;
                        return iJ2 + iH + i2;
                    case 12:
                        iJ2 = un.i(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 13:
                        iJ2 = un.j(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 14:
                        ((Integer) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 15:
                        ((Long) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 16:
                        int iIntValue5 = ((Integer) obj2).intValue();
                        iJ2 = un.i((iIntValue5 >> 31) ^ (iIntValue5 << 1));
                        return iJ2 + iH + i2;
                    case 17:
                        long jLongValue5 = ((Long) obj2).longValue();
                        iJ2 = un.j((jLongValue5 >> 63) ^ (jLongValue5 << 1));
                        return iJ2 + iH + i2;
                    default:
                        uq1.m("There is no way to get here, but the compiler thinks otherwise.");
                        return 0;
                }
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                ((Long) obj).getClass();
                iJ = 8;
                i2 = iJ + iH2;
                da2Var = (da2) p11Var.c;
                iH = un.h(2);
                if (da2Var == aa2Var) {
                    iH *= 2;
                }
                switch (da2Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 1:
                        ((Float) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                        iJ2 = un.j(((Long) obj2).longValue());
                        return iJ2 + iH + i2;
                    case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                        iJ2 = un.j(((Long) obj2).longValue());
                        return iJ2 + iH + i2;
                    case oc1.LONG_FIELD_NUMBER /* 4 */:
                        iJ2 = un.j(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case oc1.STRING_FIELD_NUMBER /* 5 */:
                        ((Long) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                        ((Integer) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                        ((Boolean) obj2).getClass();
                        return iJ2 + iH + i2;
                    case oc1.BYTES_FIELD_NUMBER /* 8 */:
                        if (obj2 instanceof qj) {
                            size2 = ((qj) obj2).size();
                            i3 = un.i(size2);
                            iJ2 = i3 + size2;
                        } else {
                            iJ2 = un.g((String) obj2);
                        }
                        return iJ2 + iH + i2;
                    case 9:
                        iJ2 = ((sh0) ((d1) obj2)).a(null);
                        return iJ2 + iH + i2;
                    case 10:
                        size2 = ((sh0) ((d1) obj2)).a(null);
                        i3 = un.i(size2);
                        iJ2 = i3 + size2;
                        return iJ2 + iH + i2;
                    case 11:
                        if (obj2 instanceof qj) {
                            size2 = ((qj) obj2).size();
                            i3 = un.i(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            i3 = un.i(size2);
                        }
                        iJ2 = i3 + size2;
                        return iJ2 + iH + i2;
                    case 12:
                        iJ2 = un.i(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 13:
                        iJ2 = un.j(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 14:
                        ((Integer) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 15:
                        ((Long) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 16:
                        int iIntValue6 = ((Integer) obj2).intValue();
                        iJ2 = un.i((iIntValue6 >> 31) ^ (iIntValue6 << 1));
                        return iJ2 + iH + i2;
                    case 17:
                        long jLongValue6 = ((Long) obj2).longValue();
                        iJ2 = un.j((jLongValue6 >> 63) ^ (jLongValue6 << 1));
                        return iJ2 + iH + i2;
                    default:
                        uq1.m("There is no way to get here, but the compiler thinks otherwise.");
                        return 0;
                }
            case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                ((Integer) obj).getClass();
                iJ = 4;
                i2 = iJ + iH2;
                da2Var = (da2) p11Var.c;
                iH = un.h(2);
                if (da2Var == aa2Var) {
                    iH *= 2;
                }
                switch (da2Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 1:
                        ((Float) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                        iJ2 = un.j(((Long) obj2).longValue());
                        return iJ2 + iH + i2;
                    case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                        iJ2 = un.j(((Long) obj2).longValue());
                        return iJ2 + iH + i2;
                    case oc1.LONG_FIELD_NUMBER /* 4 */:
                        iJ2 = un.j(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case oc1.STRING_FIELD_NUMBER /* 5 */:
                        ((Long) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                        ((Integer) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                        ((Boolean) obj2).getClass();
                        return iJ2 + iH + i2;
                    case oc1.BYTES_FIELD_NUMBER /* 8 */:
                        if (obj2 instanceof qj) {
                            size2 = ((qj) obj2).size();
                            i3 = un.i(size2);
                            iJ2 = i3 + size2;
                        } else {
                            iJ2 = un.g((String) obj2);
                        }
                        return iJ2 + iH + i2;
                    case 9:
                        iJ2 = ((sh0) ((d1) obj2)).a(null);
                        return iJ2 + iH + i2;
                    case 10:
                        size2 = ((sh0) ((d1) obj2)).a(null);
                        i3 = un.i(size2);
                        iJ2 = i3 + size2;
                        return iJ2 + iH + i2;
                    case 11:
                        if (obj2 instanceof qj) {
                            size2 = ((qj) obj2).size();
                            i3 = un.i(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            i3 = un.i(size2);
                        }
                        iJ2 = i3 + size2;
                        return iJ2 + iH + i2;
                    case 12:
                        iJ2 = un.i(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 13:
                        iJ2 = un.j(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 14:
                        ((Integer) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 15:
                        ((Long) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 16:
                        int iIntValue7 = ((Integer) obj2).intValue();
                        iJ2 = un.i((iIntValue7 >> 31) ^ (iIntValue7 << 1));
                        return iJ2 + iH + i2;
                    case 17:
                        long jLongValue7 = ((Long) obj2).longValue();
                        iJ2 = un.j((jLongValue7 >> 63) ^ (jLongValue7 << 1));
                        return iJ2 + iH + i2;
                    default:
                        uq1.m("There is no way to get here, but the compiler thinks otherwise.");
                        return 0;
                }
            case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                ((Boolean) obj).getClass();
                iJ = 1;
                i2 = iJ + iH2;
                da2Var = (da2) p11Var.c;
                iH = un.h(2);
                if (da2Var == aa2Var) {
                    iH *= 2;
                }
                switch (da2Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 1:
                        ((Float) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                        iJ2 = un.j(((Long) obj2).longValue());
                        return iJ2 + iH + i2;
                    case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                        iJ2 = un.j(((Long) obj2).longValue());
                        return iJ2 + iH + i2;
                    case oc1.LONG_FIELD_NUMBER /* 4 */:
                        iJ2 = un.j(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case oc1.STRING_FIELD_NUMBER /* 5 */:
                        ((Long) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                        ((Integer) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                        ((Boolean) obj2).getClass();
                        return iJ2 + iH + i2;
                    case oc1.BYTES_FIELD_NUMBER /* 8 */:
                        if (obj2 instanceof qj) {
                            size2 = ((qj) obj2).size();
                            i3 = un.i(size2);
                            iJ2 = i3 + size2;
                        } else {
                            iJ2 = un.g((String) obj2);
                        }
                        return iJ2 + iH + i2;
                    case 9:
                        iJ2 = ((sh0) ((d1) obj2)).a(null);
                        return iJ2 + iH + i2;
                    case 10:
                        size2 = ((sh0) ((d1) obj2)).a(null);
                        i3 = un.i(size2);
                        iJ2 = i3 + size2;
                        return iJ2 + iH + i2;
                    case 11:
                        if (obj2 instanceof qj) {
                            size2 = ((qj) obj2).size();
                            i3 = un.i(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            i3 = un.i(size2);
                        }
                        iJ2 = i3 + size2;
                        return iJ2 + iH + i2;
                    case 12:
                        iJ2 = un.i(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 13:
                        iJ2 = un.j(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 14:
                        ((Integer) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 15:
                        ((Long) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 16:
                        int iIntValue8 = ((Integer) obj2).intValue();
                        iJ2 = un.i((iIntValue8 >> 31) ^ (iIntValue8 << 1));
                        return iJ2 + iH + i2;
                    case 17:
                        long jLongValue8 = ((Long) obj2).longValue();
                        iJ2 = un.j((jLongValue8 >> 63) ^ (jLongValue8 << 1));
                        return iJ2 + iH + i2;
                    default:
                        uq1.m("There is no way to get here, but the compiler thinks otherwise.");
                        return 0;
                }
            case oc1.BYTES_FIELD_NUMBER /* 8 */:
                if (obj instanceof qj) {
                    size = ((qj) obj).size();
                    i = un.i(size);
                    iJ = size + i;
                } else {
                    iJ = un.g((String) obj);
                }
                i2 = iJ + iH2;
                da2Var = (da2) p11Var.c;
                iH = un.h(2);
                if (da2Var == aa2Var) {
                    iH *= 2;
                }
                switch (da2Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 1:
                        ((Float) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                        iJ2 = un.j(((Long) obj2).longValue());
                        return iJ2 + iH + i2;
                    case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                        iJ2 = un.j(((Long) obj2).longValue());
                        return iJ2 + iH + i2;
                    case oc1.LONG_FIELD_NUMBER /* 4 */:
                        iJ2 = un.j(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case oc1.STRING_FIELD_NUMBER /* 5 */:
                        ((Long) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                        ((Integer) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                        ((Boolean) obj2).getClass();
                        return iJ2 + iH + i2;
                    case oc1.BYTES_FIELD_NUMBER /* 8 */:
                        if (obj2 instanceof qj) {
                            size2 = ((qj) obj2).size();
                            i3 = un.i(size2);
                            iJ2 = i3 + size2;
                        } else {
                            iJ2 = un.g((String) obj2);
                        }
                        return iJ2 + iH + i2;
                    case 9:
                        iJ2 = ((sh0) ((d1) obj2)).a(null);
                        return iJ2 + iH + i2;
                    case 10:
                        size2 = ((sh0) ((d1) obj2)).a(null);
                        i3 = un.i(size2);
                        iJ2 = i3 + size2;
                        return iJ2 + iH + i2;
                    case 11:
                        if (obj2 instanceof qj) {
                            size2 = ((qj) obj2).size();
                            i3 = un.i(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            i3 = un.i(size2);
                        }
                        iJ2 = i3 + size2;
                        return iJ2 + iH + i2;
                    case 12:
                        iJ2 = un.i(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 13:
                        iJ2 = un.j(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 14:
                        ((Integer) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 15:
                        ((Long) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 16:
                        int iIntValue9 = ((Integer) obj2).intValue();
                        iJ2 = un.i((iIntValue9 >> 31) ^ (iIntValue9 << 1));
                        return iJ2 + iH + i2;
                    case 17:
                        long jLongValue9 = ((Long) obj2).longValue();
                        iJ2 = un.j((jLongValue9 >> 63) ^ (jLongValue9 << 1));
                        return iJ2 + iH + i2;
                    default:
                        uq1.m("There is no way to get here, but the compiler thinks otherwise.");
                        return 0;
                }
            case 9:
                iJ = ((sh0) ((d1) obj)).a(null);
                i2 = iJ + iH2;
                da2Var = (da2) p11Var.c;
                iH = un.h(2);
                if (da2Var == aa2Var) {
                    iH *= 2;
                }
                switch (da2Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 1:
                        ((Float) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                        iJ2 = un.j(((Long) obj2).longValue());
                        return iJ2 + iH + i2;
                    case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                        iJ2 = un.j(((Long) obj2).longValue());
                        return iJ2 + iH + i2;
                    case oc1.LONG_FIELD_NUMBER /* 4 */:
                        iJ2 = un.j(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case oc1.STRING_FIELD_NUMBER /* 5 */:
                        ((Long) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                        ((Integer) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                        ((Boolean) obj2).getClass();
                        return iJ2 + iH + i2;
                    case oc1.BYTES_FIELD_NUMBER /* 8 */:
                        if (obj2 instanceof qj) {
                            size2 = ((qj) obj2).size();
                            i3 = un.i(size2);
                            iJ2 = i3 + size2;
                        } else {
                            iJ2 = un.g((String) obj2);
                        }
                        return iJ2 + iH + i2;
                    case 9:
                        iJ2 = ((sh0) ((d1) obj2)).a(null);
                        return iJ2 + iH + i2;
                    case 10:
                        size2 = ((sh0) ((d1) obj2)).a(null);
                        i3 = un.i(size2);
                        iJ2 = i3 + size2;
                        return iJ2 + iH + i2;
                    case 11:
                        if (obj2 instanceof qj) {
                            size2 = ((qj) obj2).size();
                            i3 = un.i(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            i3 = un.i(size2);
                        }
                        iJ2 = i3 + size2;
                        return iJ2 + iH + i2;
                    case 12:
                        iJ2 = un.i(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 13:
                        iJ2 = un.j(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 14:
                        ((Integer) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 15:
                        ((Long) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 16:
                        int iIntValue10 = ((Integer) obj2).intValue();
                        iJ2 = un.i((iIntValue10 >> 31) ^ (iIntValue10 << 1));
                        return iJ2 + iH + i2;
                    case 17:
                        long jLongValue10 = ((Long) obj2).longValue();
                        iJ2 = un.j((jLongValue10 >> 63) ^ (jLongValue10 << 1));
                        return iJ2 + iH + i2;
                    default:
                        uq1.m("There is no way to get here, but the compiler thinks otherwise.");
                        return 0;
                }
            case 10:
                size = ((sh0) ((d1) obj)).a(null);
                i = un.i(size);
                iJ = size + i;
                i2 = iJ + iH2;
                da2Var = (da2) p11Var.c;
                iH = un.h(2);
                if (da2Var == aa2Var) {
                    iH *= 2;
                }
                switch (da2Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 1:
                        ((Float) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                        iJ2 = un.j(((Long) obj2).longValue());
                        return iJ2 + iH + i2;
                    case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                        iJ2 = un.j(((Long) obj2).longValue());
                        return iJ2 + iH + i2;
                    case oc1.LONG_FIELD_NUMBER /* 4 */:
                        iJ2 = un.j(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case oc1.STRING_FIELD_NUMBER /* 5 */:
                        ((Long) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                        ((Integer) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                        ((Boolean) obj2).getClass();
                        return iJ2 + iH + i2;
                    case oc1.BYTES_FIELD_NUMBER /* 8 */:
                        if (obj2 instanceof qj) {
                            size2 = ((qj) obj2).size();
                            i3 = un.i(size2);
                            iJ2 = i3 + size2;
                        } else {
                            iJ2 = un.g((String) obj2);
                        }
                        return iJ2 + iH + i2;
                    case 9:
                        iJ2 = ((sh0) ((d1) obj2)).a(null);
                        return iJ2 + iH + i2;
                    case 10:
                        size2 = ((sh0) ((d1) obj2)).a(null);
                        i3 = un.i(size2);
                        iJ2 = i3 + size2;
                        return iJ2 + iH + i2;
                    case 11:
                        if (obj2 instanceof qj) {
                            size2 = ((qj) obj2).size();
                            i3 = un.i(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            i3 = un.i(size2);
                        }
                        iJ2 = i3 + size2;
                        return iJ2 + iH + i2;
                    case 12:
                        iJ2 = un.i(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 13:
                        iJ2 = un.j(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 14:
                        ((Integer) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 15:
                        ((Long) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 16:
                        int iIntValue11 = ((Integer) obj2).intValue();
                        iJ2 = un.i((iIntValue11 >> 31) ^ (iIntValue11 << 1));
                        return iJ2 + iH + i2;
                    case 17:
                        long jLongValue11 = ((Long) obj2).longValue();
                        iJ2 = un.j((jLongValue11 >> 63) ^ (jLongValue11 << 1));
                        return iJ2 + iH + i2;
                    default:
                        uq1.m("There is no way to get here, but the compiler thinks otherwise.");
                        return 0;
                }
            case 11:
                if (obj instanceof qj) {
                    size = ((qj) obj).size();
                    i = un.i(size);
                } else {
                    size = ((byte[]) obj).length;
                    i = un.i(size);
                }
                iJ = size + i;
                i2 = iJ + iH2;
                da2Var = (da2) p11Var.c;
                iH = un.h(2);
                if (da2Var == aa2Var) {
                    iH *= 2;
                }
                switch (da2Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 1:
                        ((Float) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                        iJ2 = un.j(((Long) obj2).longValue());
                        return iJ2 + iH + i2;
                    case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                        iJ2 = un.j(((Long) obj2).longValue());
                        return iJ2 + iH + i2;
                    case oc1.LONG_FIELD_NUMBER /* 4 */:
                        iJ2 = un.j(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case oc1.STRING_FIELD_NUMBER /* 5 */:
                        ((Long) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                        ((Integer) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                        ((Boolean) obj2).getClass();
                        return iJ2 + iH + i2;
                    case oc1.BYTES_FIELD_NUMBER /* 8 */:
                        if (obj2 instanceof qj) {
                            size2 = ((qj) obj2).size();
                            i3 = un.i(size2);
                            iJ2 = i3 + size2;
                        } else {
                            iJ2 = un.g((String) obj2);
                        }
                        return iJ2 + iH + i2;
                    case 9:
                        iJ2 = ((sh0) ((d1) obj2)).a(null);
                        return iJ2 + iH + i2;
                    case 10:
                        size2 = ((sh0) ((d1) obj2)).a(null);
                        i3 = un.i(size2);
                        iJ2 = i3 + size2;
                        return iJ2 + iH + i2;
                    case 11:
                        if (obj2 instanceof qj) {
                            size2 = ((qj) obj2).size();
                            i3 = un.i(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            i3 = un.i(size2);
                        }
                        iJ2 = i3 + size2;
                        return iJ2 + iH + i2;
                    case 12:
                        iJ2 = un.i(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 13:
                        iJ2 = un.j(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 14:
                        ((Integer) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 15:
                        ((Long) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 16:
                        int iIntValue12 = ((Integer) obj2).intValue();
                        iJ2 = un.i((iIntValue12 >> 31) ^ (iIntValue12 << 1));
                        return iJ2 + iH + i2;
                    case 17:
                        long jLongValue12 = ((Long) obj2).longValue();
                        iJ2 = un.j((jLongValue12 >> 63) ^ (jLongValue12 << 1));
                        return iJ2 + iH + i2;
                    default:
                        uq1.m("There is no way to get here, but the compiler thinks otherwise.");
                        return 0;
                }
            case 12:
                iJ = un.i(((Integer) obj).intValue());
                i2 = iJ + iH2;
                da2Var = (da2) p11Var.c;
                iH = un.h(2);
                if (da2Var == aa2Var) {
                    iH *= 2;
                }
                switch (da2Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 1:
                        ((Float) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                        iJ2 = un.j(((Long) obj2).longValue());
                        return iJ2 + iH + i2;
                    case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                        iJ2 = un.j(((Long) obj2).longValue());
                        return iJ2 + iH + i2;
                    case oc1.LONG_FIELD_NUMBER /* 4 */:
                        iJ2 = un.j(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case oc1.STRING_FIELD_NUMBER /* 5 */:
                        ((Long) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                        ((Integer) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                        ((Boolean) obj2).getClass();
                        return iJ2 + iH + i2;
                    case oc1.BYTES_FIELD_NUMBER /* 8 */:
                        if (obj2 instanceof qj) {
                            size2 = ((qj) obj2).size();
                            i3 = un.i(size2);
                            iJ2 = i3 + size2;
                        } else {
                            iJ2 = un.g((String) obj2);
                        }
                        return iJ2 + iH + i2;
                    case 9:
                        iJ2 = ((sh0) ((d1) obj2)).a(null);
                        return iJ2 + iH + i2;
                    case 10:
                        size2 = ((sh0) ((d1) obj2)).a(null);
                        i3 = un.i(size2);
                        iJ2 = i3 + size2;
                        return iJ2 + iH + i2;
                    case 11:
                        if (obj2 instanceof qj) {
                            size2 = ((qj) obj2).size();
                            i3 = un.i(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            i3 = un.i(size2);
                        }
                        iJ2 = i3 + size2;
                        return iJ2 + iH + i2;
                    case 12:
                        iJ2 = un.i(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 13:
                        iJ2 = un.j(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 14:
                        ((Integer) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 15:
                        ((Long) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 16:
                        int iIntValue13 = ((Integer) obj2).intValue();
                        iJ2 = un.i((iIntValue13 >> 31) ^ (iIntValue13 << 1));
                        return iJ2 + iH + i2;
                    case 17:
                        long jLongValue13 = ((Long) obj2).longValue();
                        iJ2 = un.j((jLongValue13 >> 63) ^ (jLongValue13 << 1));
                        return iJ2 + iH + i2;
                    default:
                        uq1.m("There is no way to get here, but the compiler thinks otherwise.");
                        return 0;
                }
            case 13:
                iJ = un.j(((Integer) obj).intValue());
                i2 = iJ + iH2;
                da2Var = (da2) p11Var.c;
                iH = un.h(2);
                if (da2Var == aa2Var) {
                    iH *= 2;
                }
                switch (da2Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 1:
                        ((Float) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                        iJ2 = un.j(((Long) obj2).longValue());
                        return iJ2 + iH + i2;
                    case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                        iJ2 = un.j(((Long) obj2).longValue());
                        return iJ2 + iH + i2;
                    case oc1.LONG_FIELD_NUMBER /* 4 */:
                        iJ2 = un.j(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case oc1.STRING_FIELD_NUMBER /* 5 */:
                        ((Long) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                        ((Integer) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                        ((Boolean) obj2).getClass();
                        return iJ2 + iH + i2;
                    case oc1.BYTES_FIELD_NUMBER /* 8 */:
                        if (obj2 instanceof qj) {
                            size2 = ((qj) obj2).size();
                            i3 = un.i(size2);
                            iJ2 = i3 + size2;
                        } else {
                            iJ2 = un.g((String) obj2);
                        }
                        return iJ2 + iH + i2;
                    case 9:
                        iJ2 = ((sh0) ((d1) obj2)).a(null);
                        return iJ2 + iH + i2;
                    case 10:
                        size2 = ((sh0) ((d1) obj2)).a(null);
                        i3 = un.i(size2);
                        iJ2 = i3 + size2;
                        return iJ2 + iH + i2;
                    case 11:
                        if (obj2 instanceof qj) {
                            size2 = ((qj) obj2).size();
                            i3 = un.i(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            i3 = un.i(size2);
                        }
                        iJ2 = i3 + size2;
                        return iJ2 + iH + i2;
                    case 12:
                        iJ2 = un.i(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 13:
                        iJ2 = un.j(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 14:
                        ((Integer) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 15:
                        ((Long) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 16:
                        int iIntValue14 = ((Integer) obj2).intValue();
                        iJ2 = un.i((iIntValue14 >> 31) ^ (iIntValue14 << 1));
                        return iJ2 + iH + i2;
                    case 17:
                        long jLongValue14 = ((Long) obj2).longValue();
                        iJ2 = un.j((jLongValue14 >> 63) ^ (jLongValue14 << 1));
                        return iJ2 + iH + i2;
                    default:
                        uq1.m("There is no way to get here, but the compiler thinks otherwise.");
                        return 0;
                }
            case 14:
                ((Integer) obj).getClass();
                iJ = 4;
                i2 = iJ + iH2;
                da2Var = (da2) p11Var.c;
                iH = un.h(2);
                if (da2Var == aa2Var) {
                    iH *= 2;
                }
                switch (da2Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 1:
                        ((Float) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                        iJ2 = un.j(((Long) obj2).longValue());
                        return iJ2 + iH + i2;
                    case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                        iJ2 = un.j(((Long) obj2).longValue());
                        return iJ2 + iH + i2;
                    case oc1.LONG_FIELD_NUMBER /* 4 */:
                        iJ2 = un.j(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case oc1.STRING_FIELD_NUMBER /* 5 */:
                        ((Long) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                        ((Integer) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                        ((Boolean) obj2).getClass();
                        return iJ2 + iH + i2;
                    case oc1.BYTES_FIELD_NUMBER /* 8 */:
                        if (obj2 instanceof qj) {
                            size2 = ((qj) obj2).size();
                            i3 = un.i(size2);
                            iJ2 = i3 + size2;
                        } else {
                            iJ2 = un.g((String) obj2);
                        }
                        return iJ2 + iH + i2;
                    case 9:
                        iJ2 = ((sh0) ((d1) obj2)).a(null);
                        return iJ2 + iH + i2;
                    case 10:
                        size2 = ((sh0) ((d1) obj2)).a(null);
                        i3 = un.i(size2);
                        iJ2 = i3 + size2;
                        return iJ2 + iH + i2;
                    case 11:
                        if (obj2 instanceof qj) {
                            size2 = ((qj) obj2).size();
                            i3 = un.i(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            i3 = un.i(size2);
                        }
                        iJ2 = i3 + size2;
                        return iJ2 + iH + i2;
                    case 12:
                        iJ2 = un.i(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 13:
                        iJ2 = un.j(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 14:
                        ((Integer) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 15:
                        ((Long) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 16:
                        int iIntValue15 = ((Integer) obj2).intValue();
                        iJ2 = un.i((iIntValue15 >> 31) ^ (iIntValue15 << 1));
                        return iJ2 + iH + i2;
                    case 17:
                        long jLongValue15 = ((Long) obj2).longValue();
                        iJ2 = un.j((jLongValue15 >> 63) ^ (jLongValue15 << 1));
                        return iJ2 + iH + i2;
                    default:
                        uq1.m("There is no way to get here, but the compiler thinks otherwise.");
                        return 0;
                }
            case 15:
                ((Long) obj).getClass();
                iJ = 8;
                i2 = iJ + iH2;
                da2Var = (da2) p11Var.c;
                iH = un.h(2);
                if (da2Var == aa2Var) {
                    iH *= 2;
                }
                switch (da2Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 1:
                        ((Float) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                        iJ2 = un.j(((Long) obj2).longValue());
                        return iJ2 + iH + i2;
                    case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                        iJ2 = un.j(((Long) obj2).longValue());
                        return iJ2 + iH + i2;
                    case oc1.LONG_FIELD_NUMBER /* 4 */:
                        iJ2 = un.j(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case oc1.STRING_FIELD_NUMBER /* 5 */:
                        ((Long) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                        ((Integer) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                        ((Boolean) obj2).getClass();
                        return iJ2 + iH + i2;
                    case oc1.BYTES_FIELD_NUMBER /* 8 */:
                        if (obj2 instanceof qj) {
                            size2 = ((qj) obj2).size();
                            i3 = un.i(size2);
                            iJ2 = i3 + size2;
                        } else {
                            iJ2 = un.g((String) obj2);
                        }
                        return iJ2 + iH + i2;
                    case 9:
                        iJ2 = ((sh0) ((d1) obj2)).a(null);
                        return iJ2 + iH + i2;
                    case 10:
                        size2 = ((sh0) ((d1) obj2)).a(null);
                        i3 = un.i(size2);
                        iJ2 = i3 + size2;
                        return iJ2 + iH + i2;
                    case 11:
                        if (obj2 instanceof qj) {
                            size2 = ((qj) obj2).size();
                            i3 = un.i(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            i3 = un.i(size2);
                        }
                        iJ2 = i3 + size2;
                        return iJ2 + iH + i2;
                    case 12:
                        iJ2 = un.i(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 13:
                        iJ2 = un.j(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 14:
                        ((Integer) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 15:
                        ((Long) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 16:
                        int iIntValue16 = ((Integer) obj2).intValue();
                        iJ2 = un.i((iIntValue16 >> 31) ^ (iIntValue16 << 1));
                        return iJ2 + iH + i2;
                    case 17:
                        long jLongValue16 = ((Long) obj2).longValue();
                        iJ2 = un.j((jLongValue16 >> 63) ^ (jLongValue16 << 1));
                        return iJ2 + iH + i2;
                    default:
                        uq1.m("There is no way to get here, but the compiler thinks otherwise.");
                        return 0;
                }
            case 16:
                int iIntValue17 = ((Integer) obj).intValue();
                iJ = un.i((iIntValue17 >> 31) ^ (iIntValue17 << 1));
                i2 = iJ + iH2;
                da2Var = (da2) p11Var.c;
                iH = un.h(2);
                if (da2Var == aa2Var) {
                    iH *= 2;
                }
                switch (da2Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 1:
                        ((Float) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                        iJ2 = un.j(((Long) obj2).longValue());
                        return iJ2 + iH + i2;
                    case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                        iJ2 = un.j(((Long) obj2).longValue());
                        return iJ2 + iH + i2;
                    case oc1.LONG_FIELD_NUMBER /* 4 */:
                        iJ2 = un.j(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case oc1.STRING_FIELD_NUMBER /* 5 */:
                        ((Long) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                        ((Integer) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                        ((Boolean) obj2).getClass();
                        return iJ2 + iH + i2;
                    case oc1.BYTES_FIELD_NUMBER /* 8 */:
                        if (obj2 instanceof qj) {
                            size2 = ((qj) obj2).size();
                            i3 = un.i(size2);
                            iJ2 = i3 + size2;
                        } else {
                            iJ2 = un.g((String) obj2);
                        }
                        return iJ2 + iH + i2;
                    case 9:
                        iJ2 = ((sh0) ((d1) obj2)).a(null);
                        return iJ2 + iH + i2;
                    case 10:
                        size2 = ((sh0) ((d1) obj2)).a(null);
                        i3 = un.i(size2);
                        iJ2 = i3 + size2;
                        return iJ2 + iH + i2;
                    case 11:
                        if (obj2 instanceof qj) {
                            size2 = ((qj) obj2).size();
                            i3 = un.i(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            i3 = un.i(size2);
                        }
                        iJ2 = i3 + size2;
                        return iJ2 + iH + i2;
                    case 12:
                        iJ2 = un.i(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 13:
                        iJ2 = un.j(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 14:
                        ((Integer) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 15:
                        ((Long) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 16:
                        int iIntValue18 = ((Integer) obj2).intValue();
                        iJ2 = un.i((iIntValue18 >> 31) ^ (iIntValue18 << 1));
                        return iJ2 + iH + i2;
                    case 17:
                        long jLongValue17 = ((Long) obj2).longValue();
                        iJ2 = un.j((jLongValue17 >> 63) ^ (jLongValue17 << 1));
                        return iJ2 + iH + i2;
                    default:
                        uq1.m("There is no way to get here, but the compiler thinks otherwise.");
                        return 0;
                }
            case 17:
                long jLongValue18 = ((Long) obj).longValue();
                iJ = un.j((jLongValue18 >> 63) ^ (jLongValue18 << 1));
                i2 = iJ + iH2;
                da2Var = (da2) p11Var.c;
                iH = un.h(2);
                if (da2Var == aa2Var) {
                    iH *= 2;
                }
                switch (da2Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 1:
                        ((Float) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                        iJ2 = un.j(((Long) obj2).longValue());
                        return iJ2 + iH + i2;
                    case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                        iJ2 = un.j(((Long) obj2).longValue());
                        return iJ2 + iH + i2;
                    case oc1.LONG_FIELD_NUMBER /* 4 */:
                        iJ2 = un.j(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case oc1.STRING_FIELD_NUMBER /* 5 */:
                        ((Long) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                        ((Integer) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                        ((Boolean) obj2).getClass();
                        return iJ2 + iH + i2;
                    case oc1.BYTES_FIELD_NUMBER /* 8 */:
                        if (obj2 instanceof qj) {
                            size2 = ((qj) obj2).size();
                            i3 = un.i(size2);
                            iJ2 = i3 + size2;
                        } else {
                            iJ2 = un.g((String) obj2);
                        }
                        return iJ2 + iH + i2;
                    case 9:
                        iJ2 = ((sh0) ((d1) obj2)).a(null);
                        return iJ2 + iH + i2;
                    case 10:
                        size2 = ((sh0) ((d1) obj2)).a(null);
                        i3 = un.i(size2);
                        iJ2 = i3 + size2;
                        return iJ2 + iH + i2;
                    case 11:
                        if (obj2 instanceof qj) {
                            size2 = ((qj) obj2).size();
                            i3 = un.i(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            i3 = un.i(size2);
                        }
                        iJ2 = i3 + size2;
                        return iJ2 + iH + i2;
                    case 12:
                        iJ2 = un.i(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 13:
                        iJ2 = un.j(((Integer) obj2).intValue());
                        return iJ2 + iH + i2;
                    case 14:
                        ((Integer) obj2).getClass();
                        iJ2 = 4;
                        return iJ2 + iH + i2;
                    case 15:
                        ((Long) obj2).getClass();
                        iJ2 = 8;
                        return iJ2 + iH + i2;
                    case 16:
                        int iIntValue19 = ((Integer) obj2).intValue();
                        iJ2 = un.i((iIntValue19 >> 31) ^ (iIntValue19 << 1));
                        return iJ2 + iH + i2;
                    case 17:
                        long jLongValue19 = ((Long) obj2).longValue();
                        iJ2 = un.j((jLongValue19 >> 63) ^ (jLongValue19 << 1));
                        return iJ2 + iH + i2;
                    default:
                        uq1.m("There is no way to get here, but the compiler thinks otherwise.");
                        return 0;
                }
            default:
                uq1.m("There is no way to get here, but the compiler thinks otherwise.");
                return 0;
        }
    }
}
