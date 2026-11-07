package defpackage;

import com.hjq.toast.BuildConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class vt2 implements Iterable, qt2 {
    public final String a;

    public vt2(String str) {
        if (str != null) {
            this.a = str;
        } else {
            e.g("StringValue cannot be null.");
            throw null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:104:0x02e4 A[PHI: r8
      0x02e4: PHI (r8v6 boolean) = (r8v12 boolean), (r8v13 boolean), (r8v16 boolean) binds: [B:100:0x02d0, B:101:0x02d2, B:103:0x02e2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.qt2
    public final qt2 c(String str, ep1 ep1Var, ArrayList arrayList) {
        String str2;
        int i;
        int i2;
        int i3;
        boolean zIsEmpty;
        ep1 ep1Var2;
        if ("charAt".equals(str) || "concat".equals(str) || "hasOwnProperty".equals(str) || "indexOf".equals(str) || "lastIndexOf".equals(str) || "match".equals(str) || "replace".equals(str) || "search".equals(str) || "slice".equals(str) || "split".equals(str) || "substring".equals(str) || "toLowerCase".equals(str) || "toLocaleLowerCase".equals(str) || "toString".equals(str) || "toUpperCase".equals(str) || "toLocaleUpperCase".equals(str)) {
            str2 = "trim";
        } else {
            str2 = "trim";
            if (!str2.equals(str)) {
                e.g(str.concat(" is not a String function"));
                return null;
            }
        }
        int iHashCode = str.hashCode();
        String strZzc = "undefined";
        String str3 = this.a;
        z = false;
        boolean z = false;
        switch (iHashCode) {
            case -1789698943:
                if (str.equals("hasOwnProperty")) {
                    gu2.W("hasOwnProperty", arrayList, 1);
                    qt2 qt2VarT = ((f91) ep1Var.c).t(ep1Var, (qt2) arrayList.get(0));
                    boolean zEquals = "length".equals(qt2VarT.zzc());
                    jn2 jn2Var = qt2.T;
                    if (zEquals) {
                        return jn2Var;
                    }
                    double dDoubleValue = qt2VarT.zzd().doubleValue();
                    return (dDoubleValue != Math.floor(dDoubleValue) || (i = (int) dDoubleValue) < 0 || i >= str3.length()) ? qt2.U : jn2Var;
                }
                e.g("Command not supported");
                return null;
            case -1776922004:
                if (str.equals("toString")) {
                    gu2.W("toString", arrayList, 0);
                    return this;
                }
                e.g("Command not supported");
                return null;
            case -1464939364:
                if (str.equals("toLocaleLowerCase")) {
                    gu2.W("toLocaleLowerCase", arrayList, 0);
                    return new vt2(str3.toLowerCase());
                }
                e.g("Command not supported");
                return null;
            case -1361633751:
                if (str.equals("charAt")) {
                    gu2.b0(1, "charAt", arrayList);
                    int iI0 = arrayList.isEmpty() ? 0 : (int) gu2.i0(((f91) ep1Var.c).t(ep1Var, (qt2) arrayList.get(0)).zzd().doubleValue());
                    return (iI0 < 0 || iI0 >= str3.length()) ? qt2.V : new vt2(String.valueOf(str3.charAt(iI0)));
                }
                e.g("Command not supported");
                return null;
            case -1354795244:
                if (str.equals("concat")) {
                    if (!arrayList.isEmpty()) {
                        StringBuilder sb = new StringBuilder(str3);
                        for (int i4 = 0; i4 < arrayList.size(); i4++) {
                            sb.append(((f91) ep1Var.c).t(ep1Var, (qt2) arrayList.get(i4)).zzc());
                        }
                        return new vt2(sb.toString());
                    }
                    return this;
                }
                e.g("Command not supported");
                return null;
            case -1137582698:
                if (str.equals("toLowerCase")) {
                    gu2.W("toLowerCase", arrayList, 0);
                    return new vt2(str3.toLowerCase(Locale.ENGLISH));
                }
                e.g("Command not supported");
                return null;
            case -906336856:
                if (str.equals("search")) {
                    gu2.b0(1, "search", arrayList);
                    Matcher matcher = Pattern.compile(arrayList.isEmpty() ? "undefined" : ((f91) ep1Var.c).t(ep1Var, (qt2) arrayList.get(0)).zzc()).matcher(str3);
                    return matcher.find() ? new ep2(Double.valueOf(matcher.start())) : new ep2(Double.valueOf(-1.0d));
                }
                e.g("Command not supported");
                return null;
            case -726908483:
                if (str.equals("toLocaleUpperCase")) {
                    gu2.W("toLocaleUpperCase", arrayList, 0);
                    return new vt2(str3.toUpperCase());
                }
                e.g("Command not supported");
                return null;
            case -467511597:
                if (str.equals("lastIndexOf")) {
                    gu2.b0(2, "lastIndexOf", arrayList);
                    String strZzc2 = arrayList.size() > 0 ? ((f91) ep1Var.c).t(ep1Var, (qt2) arrayList.get(0)).zzc() : "undefined";
                    double dDoubleValue2 = arrayList.size() < 2 ? Double.NaN : ((f91) ep1Var.c).t(ep1Var, (qt2) arrayList.get(1)).zzd().doubleValue();
                    return new ep2(Double.valueOf(str3.lastIndexOf(strZzc2, (int) (Double.isNaN(dDoubleValue2) ? Double.POSITIVE_INFINITY : gu2.i0(dDoubleValue2)))));
                }
                e.g("Command not supported");
                return null;
            case -399551817:
                if (str.equals("toUpperCase")) {
                    gu2.W("toUpperCase", arrayList, 0);
                    return new vt2(str3.toUpperCase(Locale.ENGLISH));
                }
                e.g("Command not supported");
                return null;
            case 3568674:
                if (str.equals(str2)) {
                    gu2.W("toUpperCase", arrayList, 0);
                    return new vt2(str3.trim());
                }
                e.g("Command not supported");
                return null;
            case 103668165:
                if (str.equals("match")) {
                    gu2.b0(1, "match", arrayList);
                    Matcher matcher2 = Pattern.compile(arrayList.size() <= 0 ? BuildConfig.FLAVOR : ((f91) ep1Var.c).t(ep1Var, (qt2) arrayList.get(0)).zzc()).matcher(str3);
                    return matcher2.find() ? new lm2(Arrays.asList(new vt2(matcher2.group()))) : qt2.P;
                }
                e.g("Command not supported");
                return null;
            case 109526418:
                if (str.equals("slice")) {
                    gu2.b0(2, "slice", arrayList);
                    double dI0 = gu2.i0(!arrayList.isEmpty() ? ((f91) ep1Var.c).t(ep1Var, (qt2) arrayList.get(0)).zzd().doubleValue() : 0.0d);
                    double dMax = dI0 < 0.0d ? Math.max(((double) str3.length()) + dI0, 0.0d) : Math.min(dI0, str3.length());
                    double dI1 = gu2.i0(arrayList.size() > 1 ? ((f91) ep1Var.c).t(ep1Var, (qt2) arrayList.get(1)).zzd().doubleValue() : str3.length());
                    int i5 = (int) dMax;
                    return new vt2(str3.substring(i5, Math.max(0, ((int) (dI1 < 0.0d ? Math.max(((double) str3.length()) + dI1, 0.0d) : Math.min(dI1, str3.length()))) - i5) + i5));
                }
                e.g("Command not supported");
                return null;
            case 109648666:
                if (str.equals("split")) {
                    gu2.b0(2, "split", arrayList);
                    if (str3.length() == 0) {
                        return new lm2(Arrays.asList(this));
                    }
                    ArrayList arrayList2 = new ArrayList();
                    if (arrayList.isEmpty()) {
                        arrayList2.add(this);
                    } else {
                        String strZzc3 = ((f91) ep1Var.c).t(ep1Var, (qt2) arrayList.get(0)).zzc();
                        long jH0 = arrayList.size() > 1 ? ((long) gu2.h0(((f91) ep1Var.c).t(ep1Var, (qt2) arrayList.get(1)).zzd().doubleValue())) & 4294967295L : 2147483647L;
                        if (jH0 == 0) {
                            return new lm2();
                        }
                        String[] strArrSplit = str3.split(Pattern.quote(strZzc3), ((int) jH0) + 1);
                        int length = strArrSplit.length;
                        if (!strZzc3.isEmpty() || length <= 0) {
                            i3 = zIsEmpty;
                            z = zIsEmpty;
                            i2 = length;
                            i3 = z;
                        } else {
                            zIsEmpty = strArrSplit[0].isEmpty();
                            i2 = length - 1;
                            if (!strArrSplit[i2].isEmpty()) {
                                i3 = zIsEmpty;
                                z = zIsEmpty;
                                i2 = length;
                                i3 = z;
                            }
                        }
                        i3 = zIsEmpty;
                        z = zIsEmpty;
                        if (length > jH0) {
                            i2--;
                        }
                        while (i3 < i2) {
                            arrayList2.add(new vt2(strArrSplit[i3]));
                            i3++;
                        }
                    }
                    return new lm2(arrayList2);
                }
                e.g("Command not supported");
                return null;
            case 530542161:
                if (str.equals("substring")) {
                    gu2.b0(2, "substring", arrayList);
                    int iI1 = !arrayList.isEmpty() ? (int) gu2.i0(((f91) ep1Var.c).t(ep1Var, (qt2) arrayList.get(0)).zzd().doubleValue()) : 0;
                    int iI2 = arrayList.size() > 1 ? (int) gu2.i0(((f91) ep1Var.c).t(ep1Var, (qt2) arrayList.get(1)).zzd().doubleValue()) : str3.length();
                    int iMin = Math.min(Math.max(iI1, 0), str3.length());
                    int iMin2 = Math.min(Math.max(iI2, 0), str3.length());
                    return new vt2(str3.substring(Math.min(iMin, iMin2), Math.max(iMin, iMin2)));
                }
                e.g("Command not supported");
                return null;
            case 1094496948:
                if (str.equals("replace")) {
                    gu2.b0(2, "replace", arrayList);
                    boolean zIsEmpty2 = arrayList.isEmpty();
                    qt2 qt2VarG = qt2.O;
                    if (!zIsEmpty2) {
                        strZzc = ((f91) ep1Var.c).t(ep1Var, (qt2) arrayList.get(0)).zzc();
                        if (arrayList.size() > 1) {
                            qt2VarG = ((f91) ep1Var.c).t(ep1Var, (qt2) arrayList.get(1));
                        }
                    }
                    String str4 = strZzc;
                    int iIndexOf = str3.indexOf(str4);
                    if (iIndexOf >= 0) {
                        if (qt2VarG instanceof dq2) {
                            qt2VarG = ((dq2) qt2VarG).g(ep1Var, Arrays.asList(new vt2(str4), new ep2(Double.valueOf(iIndexOf)), this));
                        }
                        String strSubstring = str3.substring(0, iIndexOf);
                        String strZzc4 = qt2VarG.zzc();
                        String strSubstring2 = str3.substring(str4.length() + iIndexOf);
                        return new vt2(y00.l(new StringBuilder(strSubstring.length() + String.valueOf(strZzc4).length() + strSubstring2.length()), strSubstring, strZzc4, strSubstring2));
                    }
                    return this;
                }
                e.g("Command not supported");
                return null;
            case 1943291465:
                if (str.equals("indexOf")) {
                    gu2.b0(2, "indexOf", arrayList);
                    if (arrayList.size() <= 0) {
                        ep1Var2 = ep1Var;
                    } else {
                        ep1Var2 = ep1Var;
                        strZzc = ((f91) ep1Var2.c).t(ep1Var2, (qt2) arrayList.get(0)).zzc();
                    }
                    return new ep2(Double.valueOf(str3.indexOf(strZzc, (int) gu2.i0(arrayList.size() < 2 ? 0.0d : ((f91) ep1Var2.c).t(ep1Var2, (qt2) arrayList.get(1)).zzd().doubleValue()))));
                }
                e.g("Command not supported");
                return null;
            default:
                e.g("Command not supported");
                return null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof vt2) {
            return this.a.equals(((vt2) obj).a);
        }
        return false;
    }

    @Override // defpackage.qt2
    public final qt2 f() {
        return new vt2(this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new st2(this, 1);
    }

    public final String toString() {
        String str = this.a;
        return y00.l(new StringBuilder(str.length() + 2), "\"", str, "\"");
    }

    @Override // defpackage.qt2
    public final String zzc() {
        return this.a;
    }

    @Override // defpackage.qt2
    public final Double zzd() {
        String str = this.a;
        if (str.isEmpty()) {
            return Double.valueOf(0.0d);
        }
        try {
            return Double.valueOf(str);
        } catch (NumberFormatException unused) {
            return Double.valueOf(Double.NaN);
        }
    }

    @Override // defpackage.qt2
    public final Boolean zze() {
        return Boolean.valueOf(!this.a.isEmpty());
    }

    @Override // defpackage.qt2
    public final Iterator zzf() {
        return new st2(this, 0);
    }
}
