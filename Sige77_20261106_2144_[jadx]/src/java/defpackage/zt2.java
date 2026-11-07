package defpackage;

import com.hjq.toast.BuildConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class zt2 {
    public final ArrayList a = new ArrayList();
    public final /* synthetic */ int b;

    public zt2(int i) {
        this.b = i;
    }

    public static et2 c(ep1 ep1Var, List list) {
        av2 av2Var = av2.ADD;
        gu2.Y("FN", list, 2);
        qt2 qt2VarT = ((f91) ep1Var.c).t(ep1Var, (qt2) list.get(0));
        qt2 qt2VarT2 = ((f91) ep1Var.c).t(ep1Var, (qt2) list.get(1));
        if (!(qt2VarT2 instanceof lm2)) {
            e.g(ts.j("FN requires an ArrayValue of parameter names found ", qt2VarT2.getClass().getCanonicalName()));
            return null;
        }
        List listG = ((lm2) qt2VarT2).g();
        List arrayList = new ArrayList();
        if (list.size() > 2) {
            arrayList = list.subList(2, list.size());
        }
        return new et2(qt2VarT.zzc(), (ArrayList) listG, arrayList, ep1Var);
    }

    public static boolean d(qt2 qt2Var, qt2 qt2Var2) {
        if (qt2Var instanceof qr2) {
            qt2Var = new vt2(qt2Var.zzc());
        }
        if (qt2Var2 instanceof qr2) {
            qt2Var2 = new vt2(qt2Var2.zzc());
        }
        if ((qt2Var instanceof vt2) && (qt2Var2 instanceof vt2)) {
            return ((vt2) qt2Var).a.compareTo(((vt2) qt2Var2).a) < 0;
        }
        double dDoubleValue = qt2Var.zzd().doubleValue();
        double dDoubleValue2 = qt2Var2.zzd().doubleValue();
        return (Double.isNaN(dDoubleValue) || Double.isNaN(dDoubleValue2) || (dDoubleValue == 0.0d && dDoubleValue2 == 0.0d) || ((dDoubleValue == 0.0d && dDoubleValue2 == 0.0d) || Double.compare(dDoubleValue, dDoubleValue2) >= 0)) ? false : true;
    }

    public static qt2 e(uu2 uu2Var, qt2 qt2Var, qt2 qt2Var2) {
        if (qt2Var instanceof Iterable) {
            return g(uu2Var, ((Iterable) qt2Var).iterator(), qt2Var2);
        }
        e.g("Non-iterable type in for...of loop.");
        return null;
    }

    public static boolean f(qt2 qt2Var, qt2 qt2Var2) {
        if (qt2Var.getClass().equals(qt2Var2.getClass())) {
            if ((qt2Var instanceof xt2) || (qt2Var instanceof ss2)) {
                return true;
            }
            if (qt2Var instanceof ep2) {
                return (Double.isNaN(qt2Var.zzd().doubleValue()) || Double.isNaN(qt2Var2.zzd().doubleValue()) || qt2Var.zzd().doubleValue() != qt2Var2.zzd().doubleValue()) ? false : true;
            }
            if (qt2Var instanceof vt2) {
                return qt2Var.zzc().equals(qt2Var2.zzc());
            }
            if (qt2Var instanceof jn2) {
                return qt2Var.zze().equals(qt2Var2.zze());
            }
            return qt2Var == qt2Var2;
        }
        if (((qt2Var instanceof xt2) || (qt2Var instanceof ss2)) && ((qt2Var2 instanceof xt2) || (qt2Var2 instanceof ss2))) {
            return true;
        }
        boolean z = qt2Var instanceof ep2;
        if (z && (qt2Var2 instanceof vt2)) {
            return f(qt2Var, new ep2(qt2Var2.zzd()));
        }
        boolean z2 = qt2Var instanceof vt2;
        if (z2 && (qt2Var2 instanceof ep2)) {
            return f(new ep2(qt2Var.zzd()), qt2Var2);
        }
        if (qt2Var instanceof jn2) {
            return f(new ep2(qt2Var.zzd()), qt2Var2);
        }
        if (qt2Var2 instanceof jn2) {
            return f(qt2Var, new ep2(qt2Var2.zzd()));
        }
        if ((z2 || z) && (qt2Var2 instanceof qr2)) {
            return f(qt2Var, new vt2(qt2Var2.zzc()));
        }
        if ((qt2Var instanceof qr2) && ((qt2Var2 instanceof vt2) || (qt2Var2 instanceof ep2))) {
            return f(new vt2(qt2Var.zzc()), qt2Var2);
        }
        return false;
    }

    public static qt2 g(uu2 uu2Var, Iterator it, qt2 qt2Var) {
        if (it != null) {
            while (it.hasNext()) {
                qt2 qt2VarI = uu2Var.d((qt2) it.next()).I((lm2) qt2Var);
                if (qt2VarI instanceof go2) {
                    go2 go2Var = (go2) qt2VarI;
                    String str = go2Var.b;
                    if ("break".equals(str)) {
                        return qt2.O;
                    }
                    if ("return".equals(str)) {
                        return go2Var;
                    }
                }
            }
        }
        return qt2.O;
    }

    public static boolean h(qt2 qt2Var, qt2 qt2Var2) {
        if (qt2Var instanceof qr2) {
            qt2Var = new vt2(qt2Var.zzc());
        }
        if (qt2Var2 instanceof qr2) {
            qt2Var2 = new vt2(qt2Var2.zzc());
        }
        return (((qt2Var instanceof vt2) && (qt2Var2 instanceof vt2)) || !(Double.isNaN(qt2Var.zzd().doubleValue()) || Double.isNaN(qt2Var2.zzd().doubleValue()))) && !d(qt2Var2, qt2Var);
    }

    /* JADX WARN: Code duplicated, block: B:400:0x0bb6  */
    /* JADX WARN: Code duplicated, block: B:563:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v315 */
    /* JADX WARN: Type inference failed for: r10v320 */
    /* JADX WARN: Type inference failed for: r10v339, types: [lm2] */
    /* JADX WARN: Type inference failed for: r10v346, types: [hs2] */
    /* JADX WARN: Type inference failed for: r10v382 */
    /* JADX WARN: Type inference failed for: r10v383 */
    /* JADX WARN: Type inference failed for: r12v0, types: [ep1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v54, types: [qt2] */
    public final qt2 a(String str, ep1 ep1Var, ArrayList arrayList) {
        boolean zF;
        boolean zF2;
        qt2 qt2Var;
        qt2 qt2VarI;
        xt2 xt2Var;
        go2 go2Var;
        qt2 vt2Var;
        ?? lm2Var;
        String str2;
        int i = 0;
        switch (this.b) {
            case 0:
                av2 av2Var = av2.ADD;
                switch (gu2.f0(str).ordinal()) {
                    case oc1.LONG_FIELD_NUMBER /* 4 */:
                        gu2.W("BITWISE_AND", arrayList, 2);
                        return new ep2(Double.valueOf(gu2.h0(((f91) ep1Var.c).t(ep1Var, (qt2) arrayList.get(0)).zzd().doubleValue()) & gu2.h0(((f91) ep1Var.c).t(ep1Var, (qt2) arrayList.get(1)).zzd().doubleValue())));
                    case oc1.STRING_FIELD_NUMBER /* 5 */:
                        gu2.W("BITWISE_LEFT_SHIFT", arrayList, 2);
                        return new ep2(Double.valueOf(gu2.h0(((f91) ep1Var.c).t(ep1Var, (qt2) arrayList.get(0)).zzd().doubleValue()) << ((int) (((long) gu2.h0(((f91) ep1Var.c).t(ep1Var, (qt2) arrayList.get(1)).zzd().doubleValue())) & 31))));
                    case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                        gu2.W("BITWISE_NOT", arrayList, 1);
                        return new ep2(Double.valueOf(~gu2.h0(((f91) ep1Var.c).t(ep1Var, (qt2) arrayList.get(0)).zzd().doubleValue())));
                    case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                        gu2.W("BITWISE_OR", arrayList, 2);
                        return new ep2(Double.valueOf(gu2.h0(((f91) ep1Var.c).t(ep1Var, (qt2) arrayList.get(0)).zzd().doubleValue()) | gu2.h0(((f91) ep1Var.c).t(ep1Var, (qt2) arrayList.get(1)).zzd().doubleValue())));
                    case oc1.BYTES_FIELD_NUMBER /* 8 */:
                        gu2.W("BITWISE_RIGHT_SHIFT", arrayList, 2);
                        return new ep2(Double.valueOf(gu2.h0(((f91) ep1Var.c).t(ep1Var, (qt2) arrayList.get(0)).zzd().doubleValue()) >> ((int) (((long) gu2.h0(((f91) ep1Var.c).t(ep1Var, (qt2) arrayList.get(1)).zzd().doubleValue())) & 31))));
                    case 9:
                        gu2.W("BITWISE_UNSIGNED_RIGHT_SHIFT", arrayList, 2);
                        return new ep2(Double.valueOf((((long) gu2.h0(((f91) ep1Var.c).t(ep1Var, (qt2) arrayList.get(0)).zzd().doubleValue())) & 4294967295L) >>> ((int) (((long) gu2.h0(((f91) ep1Var.c).t(ep1Var, (qt2) arrayList.get(1)).zzd().doubleValue())) & 31))));
                    case 10:
                        gu2.W("BITWISE_XOR", arrayList, 2);
                        return new ep2(Double.valueOf(gu2.h0(((f91) ep1Var.c).t(ep1Var, (qt2) arrayList.get(0)).zzd().doubleValue()) ^ gu2.h0(((f91) ep1Var.c).t(ep1Var, (qt2) arrayList.get(1)).zzd().doubleValue())));
                    default:
                        b(str);
                        throw null;
                }
            case 1:
                gu2.W(gu2.f0(str).name(), arrayList, 2);
                qt2 qt2VarT = ((f91) ep1Var.c).t(ep1Var, (qt2) arrayList.get(0));
                qt2 qt2VarT2 = ((f91) ep1Var.c).t(ep1Var, (qt2) arrayList.get(1));
                int iOrdinal = gu2.f0(str).ordinal();
                if (iOrdinal != 23) {
                    if (iOrdinal == 48) {
                        zF2 = f(qt2VarT, qt2VarT2);
                    } else if (iOrdinal == 42) {
                        zF = d(qt2VarT, qt2VarT2);
                    } else if (iOrdinal != 43) {
                        switch (iOrdinal) {
                            case 37:
                                zF = d(qt2VarT2, qt2VarT);
                                break;
                            case 38:
                                zF = h(qt2VarT2, qt2VarT);
                                break;
                            case 39:
                                zF = gu2.g0(qt2VarT, qt2VarT2);
                                break;
                            case 40:
                                zF2 = gu2.g0(qt2VarT, qt2VarT2);
                                break;
                            default:
                                b(str);
                                throw null;
                        }
                    } else {
                        zF = h(qt2VarT, qt2VarT2);
                    }
                    zF = !zF2;
                } else {
                    zF = f(qt2VarT, qt2VarT2);
                }
                return zF ? qt2.T : qt2.U;
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                av2 av2Var2 = av2.ADD;
                int iOrdinal2 = gu2.f0(str).ordinal();
                if (iOrdinal2 == 2) {
                    gu2.W("APPLY", arrayList, 3);
                    qt2 qt2Var2 = (qt2) arrayList.get(0);
                    f91 f91Var = (f91) ep1Var.c;
                    f91 f91Var2 = (f91) ep1Var.c;
                    qt2 qt2VarT3 = f91Var.t(ep1Var, qt2Var2);
                    String strZzc = f91Var2.t(ep1Var, (qt2) arrayList.get(1)).zzc();
                    qt2 qt2VarT4 = f91Var2.t(ep1Var, (qt2) arrayList.get(2));
                    if (!(qt2VarT4 instanceof lm2)) {
                        e.g(ts.j("Function arguments for Apply are not a list found ", qt2VarT4.getClass().getCanonicalName()));
                        return null;
                    }
                    if (!strZzc.isEmpty()) {
                        return qt2VarT3.c(strZzc, ep1Var, (ArrayList) ((lm2) qt2VarT4).g());
                    }
                    e.g("Function name for apply is undefined");
                    return null;
                }
                if (iOrdinal2 == 15) {
                    gu2.W("BREAK", arrayList, 0);
                    return qt2.Q;
                }
                if (iOrdinal2 == 25) {
                    return c(ep1Var, arrayList);
                }
                if (iOrdinal2 == 41) {
                    gu2.Y("IF", arrayList, 2);
                    qt2 qt2Var3 = (qt2) arrayList.get(0);
                    f91 f91Var3 = (f91) ep1Var.c;
                    f91 f91Var4 = (f91) ep1Var.c;
                    qt2 qt2VarT5 = f91Var3.t(ep1Var, qt2Var3);
                    qt2 qt2VarT6 = f91Var4.t(ep1Var, (qt2) arrayList.get(1));
                    qt2 qt2VarT7 = arrayList.size() > 2 ? f91Var4.t(ep1Var, (qt2) arrayList.get(2)) : null;
                    xt2 xt2Var2 = qt2.O;
                    if (!qt2VarT5.zze().booleanValue()) {
                        if (qt2VarT7 != null) {
                            qt2VarI = ep1Var.I((lm2) qt2VarT7);
                        } else {
                            qt2Var = xt2Var2;
                        }
                        if (true != (qt2Var instanceof go2)) {
                            return xt2Var2;
                        }
                        return qt2Var;
                    }
                    qt2VarI = ep1Var.I((lm2) qt2VarT6);
                    qt2Var = qt2VarI;
                    if (true != (qt2Var instanceof go2)) {
                        return xt2Var2;
                    }
                    return qt2Var;
                }
                if (iOrdinal2 == 54) {
                    return new lm2(arrayList);
                }
                if (iOrdinal2 == 57) {
                    if (arrayList.isEmpty()) {
                        return qt2.S;
                    }
                    gu2.W("RETURN", arrayList, 1);
                    return new go2("return", ((f91) ep1Var.c).t(ep1Var, (qt2) arrayList.get(0)));
                }
                if (iOrdinal2 != 19) {
                    if (iOrdinal2 == 20) {
                        gu2.Y("DEFINE_FUNCTION", arrayList, 2);
                        et2 et2VarC = c(ep1Var, arrayList);
                        String str3 = et2VarC.a;
                        if (str3 == null) {
                            ep1Var.O(BuildConfig.FLAVOR, et2VarC);
                            return et2VarC;
                        }
                        ep1Var.O(str3, et2VarC);
                        return et2VarC;
                    }
                    if (iOrdinal2 == 60) {
                        gu2.W("SWITCH", arrayList, 3);
                        qt2 qt2Var4 = (qt2) arrayList.get(0);
                        f91 f91Var5 = (f91) ep1Var.c;
                        f91 f91Var6 = (f91) ep1Var.c;
                        qt2 qt2VarT8 = f91Var5.t(ep1Var, qt2Var4);
                        qt2 qt2VarT9 = f91Var6.t(ep1Var, (qt2) arrayList.get(1));
                        qt2 qt2VarT10 = f91Var6.t(ep1Var, (qt2) arrayList.get(2));
                        if (!(qt2VarT9 instanceof lm2)) {
                            e.g("Malformed SWITCH statement, cases are not a list");
                            return null;
                        }
                        if (!(qt2VarT10 instanceof lm2)) {
                            e.g("Malformed SWITCH statement, case statements are not a list");
                            return null;
                        }
                        lm2 lm2Var2 = (lm2) qt2VarT9;
                        lm2 lm2Var3 = (lm2) qt2VarT10;
                        boolean z = false;
                        for (int i2 = 0; i2 < lm2Var2.i(); i2++) {
                            if (z || qt2VarT8.equals(f91Var6.t(ep1Var, lm2Var2.k(i2)))) {
                                qt2 qt2VarT11 = f91Var6.t(ep1Var, lm2Var3.k(i2));
                                if (qt2VarT11 instanceof go2) {
                                    return ((go2) qt2VarT11).b.equals("break") ? qt2.O : qt2VarT11;
                                }
                                z = true;
                            } else {
                                z = false;
                            }
                        }
                        if (lm2Var2.i() + 1 == lm2Var3.i()) {
                            qt2 qt2VarT12 = f91Var6.t(ep1Var, lm2Var3.k(lm2Var2.i()));
                            if (qt2VarT12 instanceof go2) {
                                String str4 = ((go2) qt2VarT12).b;
                                if (str4.equals("return") || str4.equals("continue")) {
                                    return qt2VarT12;
                                }
                            }
                        }
                        return qt2.O;
                    }
                    if (iOrdinal2 == 61) {
                        gu2.W("TERNARY", arrayList, 3);
                        qt2 qt2Var5 = (qt2) arrayList.get(0);
                        f91 f91Var7 = (f91) ep1Var.c;
                        f91 f91Var8 = (f91) ep1Var.c;
                        return f91Var7.t(ep1Var, qt2Var5).zze().booleanValue() ? f91Var8.t(ep1Var, (qt2) arrayList.get(1)) : f91Var8.t(ep1Var, (qt2) arrayList.get(2));
                    }
                    switch (iOrdinal2) {
                        case 11:
                            return ep1Var.K().I(new lm2(arrayList));
                        case 12:
                            gu2.W("BREAK", arrayList, 0);
                            return qt2.R;
                        case 13:
                            break;
                        default:
                            b(str);
                            throw null;
                    }
                }
                if (arrayList.isEmpty()) {
                    return qt2.O;
                }
                qt2 qt2VarT13 = ((f91) ep1Var.c).t(ep1Var, (qt2) arrayList.get(0));
                return qt2VarT13 instanceof lm2 ? ep1Var.I((lm2) qt2VarT13) : qt2.O;
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                av2 av2Var3 = av2.ADD;
                int iOrdinal3 = gu2.f0(str).ordinal();
                if (iOrdinal3 == 1) {
                    gu2.W("AND", arrayList, 2);
                    qt2 qt2VarT14 = ((f91) ep1Var.c).t(ep1Var, (qt2) arrayList.get(0));
                    if (qt2VarT14.zze().booleanValue()) {
                        return ((f91) ep1Var.c).t(ep1Var, (qt2) arrayList.get(1));
                    }
                    return qt2VarT14;
                }
                if (iOrdinal3 == 47) {
                    gu2.W("NOT", arrayList, 1);
                    return new jn2(Boolean.valueOf(!((f91) ep1Var.c).t(ep1Var, (qt2) arrayList.get(0)).zze().booleanValue()));
                }
                if (iOrdinal3 != 50) {
                    b(str);
                    throw null;
                }
                gu2.W("OR", arrayList, 2);
                qt2 qt2VarT15 = ((f91) ep1Var.c).t(ep1Var, (qt2) arrayList.get(0));
                if (qt2VarT15.zze().booleanValue()) {
                    return qt2VarT15;
                }
                return ((f91) ep1Var.c).t(ep1Var, (qt2) arrayList.get(1));
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                av2 av2Var4 = av2.ADD;
                int iOrdinal4 = gu2.f0(str).ordinal();
                if (iOrdinal4 == 65) {
                    gu2.W("WHILE", arrayList, 4);
                    qt2 qt2Var6 = (qt2) arrayList.get(0);
                    qt2 qt2Var7 = (qt2) arrayList.get(1);
                    qt2 qt2Var8 = (qt2) arrayList.get(2);
                    qt2 qt2Var9 = (qt2) arrayList.get(3);
                    f91 f91Var9 = (f91) ep1Var.c;
                    f91 f91Var10 = (f91) ep1Var.c;
                    qt2 qt2VarT16 = f91Var9.t(ep1Var, qt2Var9);
                    if (f91Var10.t(ep1Var, qt2Var8).zze().booleanValue()) {
                        qt2 qt2VarI2 = ep1Var.I((lm2) qt2VarT16);
                        if (qt2VarI2 instanceof go2) {
                            go2 go2Var2 = (go2) qt2VarI2;
                            String str5 = go2Var2.b;
                            if ("break".equals(str5)) {
                                return qt2.O;
                            }
                            if ("return".equals(str5)) {
                                return go2Var2;
                            }
                        }
                    }
                    while (f91Var10.t(ep1Var, qt2Var6).zze().booleanValue()) {
                        qt2 qt2VarI3 = ep1Var.I((lm2) qt2VarT16);
                        if (qt2VarI3 instanceof go2) {
                            go2 go2Var3 = (go2) qt2VarI3;
                            String str6 = go2Var3.b;
                            if ("break".equals(str6)) {
                                return qt2.O;
                            }
                            if ("return".equals(str6)) {
                                return go2Var3;
                            }
                        }
                        ep1Var.B(qt2Var7);
                    }
                    return qt2.O;
                }
                switch (iOrdinal4) {
                    case 26:
                        gu2.W("FOR_IN", arrayList, 3);
                        if (!(arrayList.get(0) instanceof vt2)) {
                            e.g("Variable name in FOR_IN must be a string");
                            return null;
                        }
                        String strZzc2 = ((qt2) arrayList.get(0)).zzc();
                        qt2 qt2VarT17 = ((f91) ep1Var.c).t(ep1Var, (qt2) arrayList.get(1));
                        qt2 qt2VarT18 = ((f91) ep1Var.c).t(ep1Var, (qt2) arrayList.get(2));
                        Iterator itZzf = qt2VarT17.zzf();
                        if (itZzf != null) {
                            while (itZzf.hasNext()) {
                                ep1Var.P(strZzc2, (qt2) itZzf.next());
                                qt2 qt2VarI4 = ep1Var.I((lm2) qt2VarT18);
                                if (qt2VarI4 instanceof go2) {
                                    go2Var = (go2) qt2VarI4;
                                    String str7 = go2Var.b;
                                    if ("break".equals(str7)) {
                                        xt2Var = qt2.O;
                                    } else if ("return".equals(str7)) {
                                        return go2Var;
                                    }
                                }
                            }
                            xt2Var = qt2.O;
                        } else {
                            xt2Var = qt2.O;
                        }
                        return xt2Var;
                    case 27:
                        gu2.W("FOR_IN_CONST", arrayList, 3);
                        if (arrayList.get(0) instanceof vt2) {
                            return g(new dc2(ep1Var, ((qt2) arrayList.get(0)).zzc()), ((f91) ep1Var.c).t(ep1Var, (qt2) arrayList.get(1)).zzf(), ((f91) ep1Var.c).t(ep1Var, (qt2) arrayList.get(2)));
                        }
                        e.g("Variable name in FOR_IN_CONST must be a string");
                        return null;
                    case 28:
                        gu2.W("FOR_IN_LET", arrayList, 3);
                        if (!(arrayList.get(0) instanceof vt2)) {
                            e.g("Variable name in FOR_IN_LET must be a string");
                            return null;
                        }
                        String strZzc3 = ((qt2) arrayList.get(0)).zzc();
                        qt2 qt2VarT19 = ((f91) ep1Var.c).t(ep1Var, (qt2) arrayList.get(1));
                        qt2 qt2VarT20 = ((f91) ep1Var.c).t(ep1Var, (qt2) arrayList.get(2));
                        Iterator itZzf2 = qt2VarT19.zzf();
                        if (itZzf2 != null) {
                            while (itZzf2.hasNext()) {
                                qt2 qt2Var10 = (qt2) itZzf2.next();
                                ep1 ep1VarK = ep1Var.K();
                                ep1VarK.P(strZzc3, qt2Var10);
                                qt2 qt2VarI5 = ep1VarK.I((lm2) qt2VarT20);
                                if (qt2VarI5 instanceof go2) {
                                    go2Var = (go2) qt2VarI5;
                                    String str8 = go2Var.b;
                                    if ("break".equals(str8)) {
                                        xt2Var = qt2.O;
                                    } else if ("return".equals(str8)) {
                                        return go2Var;
                                    }
                                }
                            }
                            xt2Var = qt2.O;
                        } else {
                            xt2Var = qt2.O;
                        }
                        return xt2Var;
                    case 29:
                        gu2.W("FOR_LET", arrayList, 4);
                        qt2 qt2Var11 = (qt2) arrayList.get(0);
                        f91 f91Var11 = (f91) ep1Var.c;
                        f91 f91Var12 = (f91) ep1Var.c;
                        qt2 qt2VarT21 = f91Var11.t(ep1Var, qt2Var11);
                        if (!(qt2VarT21 instanceof lm2)) {
                            e.g("Initializer variables in FOR_LET must be an ArrayList");
                            return null;
                        }
                        lm2 lm2Var4 = (lm2) qt2VarT21;
                        qt2 qt2Var12 = (qt2) arrayList.get(1);
                        qt2 qt2Var13 = (qt2) arrayList.get(2);
                        qt2 qt2VarT22 = f91Var12.t(ep1Var, (qt2) arrayList.get(3));
                        ep1 ep1VarK2 = ep1Var.K();
                        for (int i3 = 0; i3 < lm2Var4.i(); i3++) {
                            String strZzc4 = lm2Var4.k(i3).zzc();
                            ep1VarK2.O(strZzc4, ep1Var.Q(strZzc4));
                        }
                        while (f91Var12.t(ep1Var, qt2Var12).zze().booleanValue()) {
                            qt2 qt2VarI6 = ep1Var.I((lm2) qt2VarT22);
                            if (qt2VarI6 instanceof go2) {
                                go2 go2Var4 = (go2) qt2VarI6;
                                String str9 = go2Var4.b;
                                if ("break".equals(str9)) {
                                    return qt2.O;
                                }
                                if ("return".equals(str9)) {
                                    return go2Var4;
                                }
                            }
                            ep1 ep1VarK3 = ep1Var.K();
                            for (int i4 = 0; i4 < lm2Var4.i(); i4++) {
                                String strZzc5 = lm2Var4.k(i4).zzc();
                                ep1VarK3.O(strZzc5, ep1VarK2.Q(strZzc5));
                            }
                            ep1VarK3.B(qt2Var13);
                            ep1VarK2 = ep1VarK3;
                        }
                        return qt2.O;
                    case 30:
                        gu2.W("FOR_OF", arrayList, 3);
                        if (arrayList.get(0) instanceof vt2) {
                            return e(new hd2(10, ep1Var, ((qt2) arrayList.get(0)).zzc()), ((f91) ep1Var.c).t(ep1Var, (qt2) arrayList.get(1)), ((f91) ep1Var.c).t(ep1Var, (qt2) arrayList.get(2)));
                        }
                        e.g("Variable name in FOR_OF must be a string");
                        return null;
                    case 31:
                        gu2.W("FOR_OF_CONST", arrayList, 3);
                        if (arrayList.get(0) instanceof vt2) {
                            return e(new dc2(ep1Var, ((qt2) arrayList.get(0)).zzc()), ((f91) ep1Var.c).t(ep1Var, (qt2) arrayList.get(1)), ((f91) ep1Var.c).t(ep1Var, (qt2) arrayList.get(2)));
                        }
                        e.g("Variable name in FOR_OF_CONST must be a string");
                        return null;
                    case 32:
                        gu2.W("FOR_OF_LET", arrayList, 3);
                        if (arrayList.get(0) instanceof vt2) {
                            return e(new rc2(10, (Object) ep1Var, ((qt2) arrayList.get(0)).zzc()), ((f91) ep1Var.c).t(ep1Var, (qt2) arrayList.get(1)), ((f91) ep1Var.c).t(ep1Var, (qt2) arrayList.get(2)));
                        }
                        e.g("Variable name in FOR_OF_LET must be a string");
                        return null;
                    default:
                        b(str);
                        throw null;
                }
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                av2 av2Var5 = av2.ADD;
                int iOrdinal5 = gu2.f0(str).ordinal();
                if (iOrdinal5 == 0) {
                    gu2.W("ADD", arrayList, 2);
                    qt2 qt2VarT23 = ((f91) ep1Var.c).t(ep1Var, (qt2) arrayList.get(0));
                    qt2 qt2VarT24 = ((f91) ep1Var.c).t(ep1Var, (qt2) arrayList.get(1));
                    vt2Var = ((qt2VarT23 instanceof qr2) || (qt2VarT23 instanceof vt2) || (qt2VarT24 instanceof qr2) || (qt2VarT24 instanceof vt2)) ? new vt2(String.valueOf(qt2VarT23.zzc()).concat(String.valueOf(qt2VarT24.zzc()))) : new ep2(Double.valueOf(qt2VarT24.zzd().doubleValue() + qt2VarT23.zzd().doubleValue()));
                } else if (iOrdinal5 == 21) {
                    gu2.W("DIVIDE", arrayList, 2);
                    vt2Var = new ep2(Double.valueOf(((f91) ep1Var.c).t(ep1Var, (qt2) arrayList.get(0)).zzd().doubleValue() / ((f91) ep1Var.c).t(ep1Var, (qt2) arrayList.get(1)).zzd().doubleValue()));
                } else {
                    if (iOrdinal5 == 59) {
                        gu2.W("SUBTRACT", arrayList, 2);
                        return new ep2(Double.valueOf(((f91) ep1Var.c).t(ep1Var, (qt2) arrayList.get(0)).zzd().doubleValue() + (-((f91) ep1Var.c).t(ep1Var, (qt2) arrayList.get(1)).zzd().doubleValue())));
                    }
                    if (iOrdinal5 == 52 || iOrdinal5 == 53) {
                        gu2.W(str, arrayList, 2);
                        qt2 qt2VarT25 = ((f91) ep1Var.c).t(ep1Var, (qt2) arrayList.get(0));
                        ep1Var.B((qt2) arrayList.get(1));
                        return qt2VarT25;
                    }
                    if (iOrdinal5 == 55 || iOrdinal5 == 56) {
                        gu2.W(str, arrayList, 1);
                        return ((f91) ep1Var.c).t(ep1Var, (qt2) arrayList.get(0));
                    }
                    switch (iOrdinal5) {
                        case 44:
                            gu2.W("MODULUS", arrayList, 2);
                            vt2Var = new ep2(Double.valueOf(((f91) ep1Var.c).t(ep1Var, (qt2) arrayList.get(0)).zzd().doubleValue() % ((f91) ep1Var.c).t(ep1Var, (qt2) arrayList.get(1)).zzd().doubleValue()));
                            break;
                        case 45:
                            gu2.W("MULTIPLY", arrayList, 2);
                            return new ep2(Double.valueOf(((f91) ep1Var.c).t(ep1Var, (qt2) arrayList.get(1)).zzd().doubleValue() * ((f91) ep1Var.c).t(ep1Var, (qt2) arrayList.get(0)).zzd().doubleValue()));
                        case 46:
                            gu2.W("NEGATE", arrayList, 1);
                            return new ep2(Double.valueOf(-((f91) ep1Var.c).t(ep1Var, (qt2) arrayList.get(0)).zzd().doubleValue()));
                        default:
                            b(str);
                            throw null;
                    }
                }
                return vt2Var;
            case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                if (str == null || str.isEmpty() || !ep1Var.N(str)) {
                    e.g(ts.j("Command not found: ", str));
                    return null;
                }
                qt2 qt2VarQ = ep1Var.Q(str);
                if (qt2VarQ instanceof dq2) {
                    return ((dq2) qt2VarQ).g(ep1Var, arrayList);
                }
                e.g(ts.k("Function ", str, " is not defined"));
                return null;
            default:
                av2 av2Var6 = av2.ADD;
                int iOrdinal6 = gu2.f0(str).ordinal();
                if (iOrdinal6 == 3) {
                    gu2.W("ASSIGN", arrayList, 2);
                    qt2 qt2VarT26 = ((f91) ep1Var.c).t(ep1Var, (qt2) arrayList.get(0));
                    if (!(qt2VarT26 instanceof vt2)) {
                        e.g(ts.j("Expected string for assign var. got ", qt2VarT26.getClass().getCanonicalName()));
                        return null;
                    }
                    String str10 = ((vt2) qt2VarT26).a;
                    if (!ep1Var.N(str10)) {
                        e.g(ts.j("Attempting to assign undefined value ", str10));
                        return null;
                    }
                    qt2 qt2VarT27 = ((f91) ep1Var.c).t(ep1Var, (qt2) arrayList.get(1));
                    ep1Var.O(str10, qt2VarT27);
                    return qt2VarT27;
                }
                if (iOrdinal6 == 14) {
                    gu2.Y("CONST", arrayList, 2);
                    if (arrayList.size() % 2 != 0) {
                        e.g(ck1.r(arrayList.size(), "CONST requires an even number of arguments, found "));
                        return null;
                    }
                    while (i < arrayList.size() - 1) {
                        qt2 qt2VarT28 = ((f91) ep1Var.c).t(ep1Var, (qt2) arrayList.get(i));
                        if (!(qt2VarT28 instanceof vt2)) {
                            e.g(ts.j("Expected string for const name. got ", qt2VarT28.getClass().getCanonicalName()));
                            return null;
                        }
                        String str11 = ((vt2) qt2VarT28).a;
                        ep1Var.P(str11, ((f91) ep1Var.c).t(ep1Var, (qt2) arrayList.get(i + 1)));
                        ((HashMap) ep1Var.e).put(str11, Boolean.TRUE);
                        i += 2;
                    }
                    return qt2.O;
                }
                if (iOrdinal6 == 24) {
                    gu2.Y("EXPRESSION_LIST", arrayList, 1);
                    lm2Var = qt2.O;
                    while (i < arrayList.size()) {
                        qt2 qt2VarT29 = ((f91) ep1Var.c).t(ep1Var, (qt2) arrayList.get(i));
                        if (qt2VarT29 instanceof go2) {
                            uq1.q("ControlValue cannot be in an expression list");
                            return null;
                        }
                        i++;
                        lm2Var = qt2VarT29;
                    }
                } else {
                    if (iOrdinal6 == 33) {
                        gu2.W("GET", arrayList, 1);
                        qt2 qt2VarT30 = ((f91) ep1Var.c).t(ep1Var, (qt2) arrayList.get(0));
                        if (qt2VarT30 instanceof vt2) {
                            return ep1Var.Q(((vt2) qt2VarT30).a);
                        }
                        e.g(ts.j("Expected string for get var. got ", qt2VarT30.getClass().getCanonicalName()));
                        return null;
                    }
                    if (iOrdinal6 == 49) {
                        gu2.W("NULL", arrayList, 0);
                        return qt2.P;
                    }
                    if (iOrdinal6 == 58) {
                        gu2.W("SET_PROPERTY", arrayList, 3);
                        qt2 qt2Var14 = (qt2) arrayList.get(0);
                        f91 f91Var13 = (f91) ep1Var.c;
                        f91 f91Var14 = (f91) ep1Var.c;
                        qt2 qt2VarT31 = f91Var13.t(ep1Var, qt2Var14);
                        qt2 qt2VarT32 = f91Var14.t(ep1Var, (qt2) arrayList.get(1));
                        qt2 qt2VarT33 = f91Var14.t(ep1Var, (qt2) arrayList.get(2));
                        if (qt2VarT31 == qt2.O || qt2VarT31 == qt2.P) {
                            sm0.j("Can't set property ", qt2VarT32.zzc(), " of ", qt2VarT31.zzc());
                            return null;
                        }
                        if ((qt2VarT31 instanceof lm2) && (qt2VarT32 instanceof ep2)) {
                            ((lm2) qt2VarT31).l(((ep2) qt2VarT32).a.intValue(), qt2VarT33);
                        } else if (qt2VarT31 instanceof qr2) {
                            ((qr2) qt2VarT31).a(qt2VarT32.zzc(), qt2VarT33);
                        }
                        return qt2VarT33;
                    }
                    if (iOrdinal6 != 17) {
                        if (iOrdinal6 != 18) {
                            if (iOrdinal6 == 35 || iOrdinal6 == 36) {
                                gu2.W("GET_PROPERTY", arrayList, 2);
                                qt2 qt2VarT34 = ((f91) ep1Var.c).t(ep1Var, (qt2) arrayList.get(0));
                                qt2 qt2VarT35 = ((f91) ep1Var.c).t(ep1Var, (qt2) arrayList.get(1));
                                if ((qt2VarT34 instanceof lm2) && gu2.e0(qt2VarT35)) {
                                    return ((lm2) qt2VarT34).k(qt2VarT35.zzd().intValue());
                                }
                                if (qt2VarT34 instanceof qr2) {
                                    return ((qr2) qt2VarT34).d(qt2VarT35.zzc());
                                }
                                if (qt2VarT34 instanceof vt2) {
                                    if ("length".equals(qt2VarT35.zzc())) {
                                        return new ep2(Double.valueOf(((vt2) qt2VarT34).a.length()));
                                    }
                                    if (gu2.e0(qt2VarT35)) {
                                        double dDoubleValue = qt2VarT35.zzd().doubleValue();
                                        String str12 = ((vt2) qt2VarT34).a;
                                        if (dDoubleValue < str12.length()) {
                                            return new vt2(String.valueOf(str12.charAt(qt2VarT35.zzd().intValue())));
                                        }
                                    }
                                }
                                return qt2.O;
                            }
                            switch (iOrdinal6) {
                                case 62:
                                    gu2.W("TYPEOF", arrayList, 1);
                                    qt2 qt2VarT36 = ((f91) ep1Var.c).t(ep1Var, (qt2) arrayList.get(0));
                                    if (qt2VarT36 instanceof xt2) {
                                        str2 = "undefined";
                                    } else if (qt2VarT36 instanceof jn2) {
                                        str2 = "boolean";
                                    } else if (qt2VarT36 instanceof ep2) {
                                        str2 = "number";
                                    } else if (qt2VarT36 instanceof vt2) {
                                        str2 = "string";
                                    } else if (qt2VarT36 instanceof et2) {
                                        str2 = "function";
                                    } else {
                                        if ((qt2VarT36 instanceof rt2) || (qt2VarT36 instanceof go2)) {
                                            throw new IllegalArgumentException(String.format("Unsupported value type %s in typeof", qt2VarT36));
                                        }
                                        str2 = "object";
                                    }
                                    return new vt2(str2);
                                case 63:
                                    gu2.W("UNDEFINED", arrayList, 0);
                                    return qt2.O;
                                case 64:
                                    gu2.Y("VAR", arrayList, 1);
                                    int size = arrayList.size();
                                    while (i < size) {
                                        Object obj = arrayList.get(i);
                                        i++;
                                        qt2 qt2VarT37 = ((f91) ep1Var.c).t(ep1Var, (qt2) obj);
                                        if (!(qt2VarT37 instanceof vt2)) {
                                            e.g(ts.j("Expected string for var name. got ", qt2VarT37.getClass().getCanonicalName()));
                                            return null;
                                        }
                                        ep1Var.P(((vt2) qt2VarT37).a, qt2.O);
                                    }
                                    return qt2.O;
                                default:
                                    b(str);
                                    throw null;
                            }
                        }
                        if (arrayList.isEmpty()) {
                            return new hs2();
                        }
                        if (arrayList.size() % 2 != 0) {
                            e.g(ck1.r(arrayList.size(), "CREATE_OBJECT requires an even number of arguments, found "));
                            return null;
                        }
                        lm2Var = new hs2();
                        while (i < arrayList.size() - 1) {
                            qt2 qt2VarT38 = ((f91) ep1Var.c).t(ep1Var, (qt2) arrayList.get(i));
                            qt2 qt2VarT39 = ((f91) ep1Var.c).t(ep1Var, (qt2) arrayList.get(i + 1));
                            if ((qt2VarT38 instanceof go2) || (qt2VarT39 instanceof go2)) {
                                uq1.q("Failed to evaluate map entry");
                                return null;
                            }
                            lm2Var.a(qt2VarT38.zzc(), qt2VarT39);
                            i += 2;
                        }
                    } else {
                        if (arrayList.isEmpty()) {
                            return new lm2();
                        }
                        lm2Var = new lm2();
                        int size2 = arrayList.size();
                        int i5 = 0;
                        while (i5 < size2) {
                            Object obj2 = arrayList.get(i5);
                            i5++;
                            qt2 qt2VarT40 = ((f91) ep1Var.c).t(ep1Var, (qt2) obj2);
                            if (qt2VarT40 instanceof go2) {
                                uq1.q("Failed to evaluate array element");
                                return null;
                            }
                            lm2Var.l(i, qt2VarT40);
                            i++;
                        }
                    }
                }
                return lm2Var;
        }
    }

    public final void b(String str) {
        if (!this.a.contains(gu2.f0(str))) {
            throw new IllegalArgumentException("Command not supported");
        }
        throw new UnsupportedOperationException("Command not implemented: ".concat(String.valueOf(str)));
    }
}
