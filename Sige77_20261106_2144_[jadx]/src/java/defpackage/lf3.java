package defpackage;

import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.zzbf;
import com.google.android.gms.measurement.internal.zzbh;
import com.google.android.gms.measurement.internal.zzoh;
import com.hjq.toast.BuildConfig;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.security.MessageDigest;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class lf3 extends ne3 {
    public long d;
    public long e;

    public static zzbh I(fj2 fj2Var) {
        Object obj;
        Bundle bundleJ = J(fj2Var.c, true);
        String string = (!bundleJ.containsKey("_o") || (obj = bundleJ.get("_o")) == null) ? "app" : obj.toString();
        String strH = ia.H(fj2Var.a, gu2.g, gu2.l);
        if (strH == null) {
            strH = fj2Var.a;
        }
        return new zzbh(strH, new zzbf(bundleJ), string, fj2Var.b, 0L);
    }

    public static Bundle J(Map map, boolean z) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (!(obj instanceof ArrayList)) {
                bundle.putString(str, obj.toString());
            } else if (z) {
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    arrayList2.add(J((Map) arrayList.get(i), false));
                }
                bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
            }
        }
        return bundle;
    }

    public static final void M(b53 b53Var, String str, Long l) {
        List listJ = b53Var.j();
        int i = 0;
        while (true) {
            if (i >= listJ.size()) {
                i = -1;
                break;
            } else if (str.equals(((l53) listJ.get(i)).u())) {
                break;
            } else {
                i++;
            }
        }
        j53 j53VarF = l53.F();
        j53VarF.j(str);
        j53VarF.l(l.longValue());
        if (i < 0) {
            b53Var.n(j53VarF);
        } else {
            b53Var.d();
            ((d53) b53Var.b).K(i, (l53) j53VarF.g());
        }
    }

    public static final Bundle N(List list) {
        Bundle bundle = new Bundle();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            l53 l53Var = (l53) it.next();
            String strU = l53Var.u();
            if (l53Var.B()) {
                bundle.putDouble(strU, l53Var.C());
            } else if (l53Var.z()) {
                bundle.putFloat(strU, l53Var.A());
            } else if (l53Var.v()) {
                bundle.putString(strU, l53Var.w());
            } else if (l53Var.x()) {
                bundle.putLong(strU, l53Var.y());
            }
        }
        return bundle;
    }

    public static final l53 O(String str, d53 d53Var) {
        for (l53 l53Var : d53Var.v()) {
            if (l53Var.u().equals(str)) {
                return l53Var;
            }
        }
        return null;
    }

    public static final String P(String str, Map map) {
        if (map == null) {
            return null;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (str.equalsIgnoreCase((String) entry.getKey())) {
                if (entry.getValue() == null || ((List) entry.getValue()).isEmpty()) {
                    return null;
                }
                return (String) ((List) entry.getValue()).get(0);
            }
        }
        return null;
    }

    public static final Serializable Q(String str, d53 d53Var) {
        l53 l53VarO = O(str, d53Var);
        if (l53VarO == null) {
            return null;
        }
        return W(l53VarO);
    }

    public static final void T(int i, StringBuilder sb) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
    }

    public static final void U(Uri.Builder builder, String str, String str2, HashSet hashSet) {
        if (hashSet.contains(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        builder.appendQueryParameter(str, str2);
    }

    public static final String V(boolean z, boolean z2, boolean z3) {
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append("Dynamic ");
        }
        if (z2) {
            sb.append("Sequence ");
        }
        if (z3) {
            sb.append("Session-Scoped ");
        }
        return sb.toString();
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [android.os.Bundle[], java.io.Serializable] */
    public static final Serializable W(l53 l53Var) {
        if (l53Var.v()) {
            return l53Var.w();
        }
        if (l53Var.x()) {
            return Long.valueOf(l53Var.y());
        }
        if (l53Var.B()) {
            return Double.valueOf(l53Var.C());
        }
        if (l53Var.E() > 0) {
            return r0(l53Var.D());
        }
        return null;
    }

    public static final void X(Uri.Builder builder, String[] strArr, Bundle bundle, HashSet hashSet) {
        for (String str : strArr) {
            String[] strArrSplit = str.split(",");
            String str2 = strArrSplit[0];
            String str3 = strArrSplit[strArrSplit.length - 1];
            String string = bundle.getString(str2);
            if (string != null) {
                U(builder, str3, string, hashSet);
            }
        }
    }

    public static final void Y(StringBuilder sb, String str, i63 i63Var) {
        if (i63Var == null) {
            return;
        }
        T(3, sb);
        sb.append(str);
        sb.append(" {\n");
        if (i63Var.w() != 0) {
            T(4, sb);
            sb.append("results: ");
            int i = 0;
            for (Long l : i63Var.v()) {
                int i2 = i + 1;
                if (i != 0) {
                    sb.append(", ");
                }
                sb.append(l);
                i = i2;
            }
            sb.append('\n');
        }
        if (i63Var.u() != 0) {
            T(4, sb);
            sb.append("status: ");
            int i3 = 0;
            for (Long l2 : i63Var.t()) {
                int i4 = i3 + 1;
                if (i3 != 0) {
                    sb.append(", ");
                }
                sb.append(l2);
                i3 = i4;
            }
            sb.append('\n');
        }
        if (i63Var.y() != 0) {
            T(4, sb);
            sb.append("dynamic_filter_timestamps: {");
            int i5 = 0;
            for (z43 z43Var : i63Var.x()) {
                int i6 = i5 + 1;
                if (i5 != 0) {
                    sb.append(", ");
                }
                sb.append(z43Var.t() ? Integer.valueOf(z43Var.u()) : null);
                sb.append(":");
                sb.append(z43Var.v() ? Long.valueOf(z43Var.w()) : null);
                i5 = i6;
            }
            sb.append("}\n");
        }
        if (i63Var.A() != 0) {
            T(4, sb);
            sb.append("sequence_filter_timestamps: {");
            int i7 = 0;
            for (m63 m63Var : i63Var.z()) {
                int i8 = i7 + 1;
                if (i7 != 0) {
                    sb.append(", ");
                }
                sb.append(m63Var.t() ? Integer.valueOf(m63Var.u()) : null);
                sb.append(": [");
                Iterator it = m63Var.v().iterator();
                int i9 = 0;
                while (it.hasNext()) {
                    long jLongValue = ((Long) it.next()).longValue();
                    int i10 = i9 + 1;
                    if (i9 != 0) {
                        sb.append(", ");
                    }
                    sb.append(jLongValue);
                    i9 = i10;
                }
                sb.append("]");
                i7 = i8;
            }
            sb.append("}\n");
        }
        T(3, sb);
        sb.append("}\n");
    }

    public static final void Z(StringBuilder sb, int i, String str, Object obj) {
        if (obj == null) {
            return;
        }
        T(i + 1, sb);
        sb.append(str);
        sb.append(": ");
        sb.append(obj);
        sb.append('\n');
    }

    public static final void a0(StringBuilder sb, int i, String str, u03 u03Var) {
        String str2;
        if (u03Var == null) {
            return;
        }
        T(i, sb);
        sb.append(str);
        sb.append(" {\n");
        if (u03Var.t()) {
            int iD = u03Var.D();
            if (iD == 1) {
                str2 = "UNKNOWN_COMPARISON_TYPE";
            } else if (iD == 2) {
                str2 = "LESS_THAN";
            } else if (iD != 3) {
                str2 = iD != 4 ? "BETWEEN" : "EQUAL";
            } else {
                str2 = "GREATER_THAN";
            }
            Z(sb, i, "comparison_type", str2);
        }
        if (u03Var.u()) {
            Z(sb, i, "match_as_float", Boolean.valueOf(u03Var.v()));
        }
        if (u03Var.w()) {
            Z(sb, i, "comparison_value", u03Var.x());
        }
        if (u03Var.y()) {
            Z(sb, i, "min_comparison_value", u03Var.z());
        }
        if (u03Var.A()) {
            Z(sb, i, "max_comparison_value", u03Var.B());
        }
        T(i, sb);
        sb.append("}\n");
    }

    public static boolean i0(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    public static boolean j0(tm2 tm2Var, int i) {
        if (i < tm2Var.size() * 64) {
            return ((1 << (i % 64)) & ((Long) tm2Var.get(i / 64)).longValue()) != 0;
        }
        return false;
    }

    public static ArrayList k0(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            long j = 0;
            for (int i2 = 0; i2 < 64; i2++) {
                int i3 = (i * 64) + i2;
                if (i3 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i3)) {
                    j |= 1 << i2;
                }
            }
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    public static bm2 p0(bm2 bm2Var, byte[] bArr) throws xm2 {
        vl2 vl2VarA = vl2.a();
        if (vl2VarA != null) {
            bm2Var.getClass();
            bm2Var.i(bArr, bArr.length, vl2VarA);
            return bm2Var;
        }
        bm2Var.getClass();
        int length = bArr.length;
        int i = yk2.a;
        bm2Var.i(bArr, length, vl2.c);
        return bm2Var;
    }

    public static int q0(String str, x53 x53Var) {
        for (int i = 0; i < ((a63) x53Var.b).a2(); i++) {
            if (str.equals(((a63) x53Var.b).b2(i).v())) {
                return i;
            }
        }
        return -1;
    }

    public static Bundle[] r0(um2 um2Var) {
        ArrayList arrayList = new ArrayList();
        Iterator it = um2Var.iterator();
        while (it.hasNext()) {
            l53 l53Var = (l53) it.next();
            if (l53Var != null) {
                Bundle bundle = new Bundle();
                for (l53 l53Var2 : l53Var.D()) {
                    if (l53Var2.v()) {
                        bundle.putString(l53Var2.u(), l53Var2.w());
                    } else if (l53Var2.x()) {
                        bundle.putLong(l53Var2.u(), l53Var2.y());
                    } else if (l53Var2.B()) {
                        bundle.putDouble(l53Var2.u(), l53Var2.C());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    public static HashMap s0(Bundle bundle, boolean z) {
        HashMap map = new HashMap();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            boolean z2 = obj instanceof Parcelable[];
            if (z2 || (obj instanceof ArrayList) || (obj instanceof Bundle)) {
                if (z) {
                    ArrayList arrayList = new ArrayList();
                    if (z2) {
                        for (Parcelable parcelable : (Parcelable[]) obj) {
                            if (parcelable instanceof Bundle) {
                                arrayList.add(s0((Bundle) parcelable, false));
                            }
                        }
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList2 = (ArrayList) obj;
                        int size = arrayList2.size();
                        for (int i = 0; i < size; i++) {
                            Object obj2 = arrayList2.get(i);
                            if (obj2 instanceof Bundle) {
                                arrayList.add(s0((Bundle) obj2, false));
                            }
                        }
                    } else if (obj instanceof Bundle) {
                        arrayList.add(s0((Bundle) obj, false));
                    }
                    map.put(str, arrayList);
                }
            } else if (obj != null) {
                map.put(str, obj);
            }
        }
        return map;
    }

    public final void K(Map map) {
        long epochMilli;
        y53 y53Var = (y53) this.a;
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            String strP = P("Date", map);
            if (TextUtils.isEmpty(strP)) {
                return;
            }
            if (i >= 26) {
                try {
                    epochMilli = ZonedDateTime.parse(strP, DateTimeFormatter.RFC_1123_DATE_TIME).toInstant().toEpochMilli();
                } catch (DateTimeParseException unused) {
                    c33 c33Var = y53Var.f;
                    y53.l(c33Var);
                    c33Var.w.b(strP, "Unable to parse header time, time");
                    epochMilli = 0;
                }
            } else {
                epochMilli = 0;
            }
            if (epochMilli > 0) {
                y53Var.X.getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                D();
                if (this.e == 0) {
                    this.d = jElapsedRealtime;
                    this.e = epochMilli;
                }
            }
        }
    }

    public final long L(long j) {
        D();
        long j2 = this.e;
        if (j2 == 0 || j == 0) {
            return 0L;
        }
        return (j2 - this.d) + j;
    }

    public final void R(StringBuilder sb, int i, um2 um2Var) {
        if (um2Var == null) {
            return;
        }
        int i2 = i + 1;
        Iterator it = um2Var.iterator();
        while (it.hasNext()) {
            l53 l53Var = (l53) it.next();
            if (l53Var != null) {
                T(i2, sb);
                sb.append("param {\n");
                Z(sb, i2, "name", l53Var.t() ? ((y53) this.a).W.b(l53Var.u()) : null);
                Z(sb, i2, "string_value", l53Var.v() ? l53Var.w() : null);
                Z(sb, i2, "int_value", l53Var.x() ? Long.valueOf(l53Var.y()) : null);
                Z(sb, i2, "double_value", l53Var.B() ? Double.valueOf(l53Var.C()) : null);
                if (l53Var.E() > 0) {
                    R(sb, i2, l53Var.D());
                }
                T(i2, sb);
                sb.append("}\n");
            }
        }
    }

    public final void S(StringBuilder sb, int i, q03 q03Var) {
        String str;
        if (q03Var == null) {
            return;
        }
        T(i, sb);
        sb.append("filter {\n");
        if (q03Var.x()) {
            Z(sb, i, "complement", Boolean.valueOf(q03Var.y()));
        }
        if (q03Var.z()) {
            Z(sb, i, "param_name", ((y53) this.a).W.b(q03Var.A()));
        }
        if (q03Var.t()) {
            int i2 = i + 1;
            z03 z03VarU = q03Var.u();
            if (z03VarU != null) {
                T(i2, sb);
                sb.append("string_filter {\n");
                if (z03VarU.t()) {
                    switch (z03VarU.B()) {
                        case 1:
                            str = "UNKNOWN_MATCH_TYPE";
                            break;
                        case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                            str = "REGEXP";
                            break;
                        case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                            str = "BEGINS_WITH";
                            break;
                        case oc1.LONG_FIELD_NUMBER /* 4 */:
                            str = "ENDS_WITH";
                            break;
                        case oc1.STRING_FIELD_NUMBER /* 5 */:
                            str = "PARTIAL";
                            break;
                        case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                            str = "EXACT";
                            break;
                        default:
                            str = "IN_LIST";
                            break;
                    }
                    Z(sb, i2, "match_type", str);
                }
                if (z03VarU.u()) {
                    Z(sb, i2, "expression", z03VarU.v());
                }
                if (z03VarU.w()) {
                    Z(sb, i2, "case_sensitive", Boolean.valueOf(z03VarU.x()));
                }
                if (z03VarU.z() > 0) {
                    T(i + 2, sb);
                    sb.append("expression_list {\n");
                    for (String str2 : z03VarU.y()) {
                        T(i + 3, sb);
                        sb.append(str2);
                        sb.append("\n");
                    }
                    sb.append("}\n");
                }
                T(i2, sb);
                sb.append("}\n");
            }
        }
        if (q03Var.v()) {
            a0(sb, i + 1, "number_filter", q03Var.w());
        }
        T(i, sb);
        sb.append("}\n");
    }

    public final void b0(s63 s63Var, Object obj) {
        gu2.o(obj);
        s63Var.d();
        ((u63) s63Var.b).I();
        s63Var.d();
        ((u63) s63Var.b).K();
        s63Var.d();
        ((u63) s63Var.b).M();
        if (obj instanceof String) {
            s63Var.d();
            ((u63) s63Var.b).H((String) obj);
        } else if (obj instanceof Long) {
            long jLongValue = ((Long) obj).longValue();
            s63Var.d();
            ((u63) s63Var.b).J(jLongValue);
        } else if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            s63Var.d();
            ((u63) s63Var.b).L(dDoubleValue);
        } else {
            c33 c33Var = ((y53) this.a).f;
            y53.l(c33Var);
            c33Var.f.b(obj, "Ignoring invalid (type) user attribute value");
        }
    }

    public final void c0(j53 j53Var, Object obj) {
        j53Var.d();
        ((l53) j53Var.b).I();
        j53Var.d();
        ((l53) j53Var.b).K();
        j53Var.d();
        ((l53) j53Var.b).M();
        j53Var.d();
        ((l53) j53Var.b).P();
        if (obj instanceof String) {
            j53Var.k((String) obj);
            return;
        }
        if (obj instanceof Long) {
            j53Var.l(((Long) obj).longValue());
            return;
        }
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            j53Var.d();
            ((l53) j53Var.b).L(dDoubleValue);
            return;
        }
        if (!(obj instanceof Bundle[])) {
            c33 c33Var = ((y53) this.a).f;
            y53.l(c33Var);
            c33Var.f.b(obj, "Ignoring invalid (type) event param value");
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : (Bundle[]) obj) {
            if (bundle != null) {
                j53 j53VarF = l53.F();
                for (String str : bundle.keySet()) {
                    j53 j53VarF2 = l53.F();
                    j53VarF2.j(str);
                    Object obj2 = bundle.get(str);
                    if (obj2 instanceof Long) {
                        j53VarF2.l(((Long) obj2).longValue());
                    } else if (obj2 instanceof String) {
                        j53VarF2.k((String) obj2);
                    } else if (obj2 instanceof Double) {
                        double dDoubleValue2 = ((Double) obj2).doubleValue();
                        j53VarF2.d();
                        ((l53) j53VarF2.b).L(dDoubleValue2);
                    }
                    j53VarF.d();
                    ((l53) j53VarF.b).N((l53) j53VarF2.g());
                }
                if (((l53) j53VarF.b).E() > 0) {
                    arrayList.add((l53) j53VarF.g());
                }
            }
        }
        j53Var.d();
        ((l53) j53Var.b).O(arrayList);
    }

    public final zzoh d0(String str, x53 x53Var, b53 b53Var, String str2) {
        int iIndexOf;
        hq2.a();
        y53 y53Var = (y53) this.a;
        is2 is2Var = y53Var.d;
        if (!is2Var.P(str, h13.O0)) {
            return null;
        }
        y53Var.X.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        HashSet hashSet = new HashSet(Arrays.asList(is2Var.L(str, h13.t0).split(",")));
        if3 if3Var = this.b;
        se3 se3Var = if3Var.W;
        f53 f53Var = if3Var.a;
        f53 f53Var2 = se3Var.b.a;
        if3.T(f53Var2);
        String strR = f53Var2.R(str);
        Uri.Builder builder = new Uri.Builder();
        is2 is2Var2 = ((y53) se3Var.a).d;
        builder.scheme(is2Var2.L(str, h13.m0));
        if (TextUtils.isEmpty(strR)) {
            builder.authority(is2Var2.L(str, h13.n0));
        } else {
            String strL = is2Var2.L(str, h13.n0);
            StringBuilder sb = new StringBuilder(String.valueOf(strR).length() + 1 + String.valueOf(strL).length());
            sb.append(strR);
            sb.append(".");
            sb.append(strL);
            builder.authority(sb.toString());
        }
        builder.path(is2Var2.L(str, h13.o0));
        U(builder, "gmp_app_id", ((a63) x53Var.b).I(), hashSet);
        is2Var.K();
        U(builder, "gmp_version", String.valueOf(161000L), hashSet);
        String strC = ((a63) x53Var.b).C();
        f13 f13Var = h13.R0;
        if (is2Var.P(str, f13Var)) {
            if3.T(f53Var);
            if (f53Var.Y(str)) {
                strC = BuildConfig.FLAVOR;
            }
        }
        U(builder, "app_instance_id", strC, hashSet);
        U(builder, "rdid", ((a63) x53Var.b).z(), hashSet);
        U(builder, "bundle_id", x53Var.q(), hashSet);
        String strP = b53Var.p();
        String strH = ia.H(strP, gu2.l, gu2.g);
        if (true != TextUtils.isEmpty(strH)) {
            strP = strH;
        }
        U(builder, "app_event_name", strP, hashSet);
        U(builder, "app_version", String.valueOf(((a63) x53Var.b).O()), hashSet);
        String strN2 = ((a63) x53Var.b).n2();
        if (is2Var.P(str, f13Var)) {
            if3.T(f53Var);
            if (f53Var.X(str) && !TextUtils.isEmpty(strN2) && (iIndexOf = strN2.indexOf(".")) != -1) {
                strN2 = strN2.substring(0, iIndexOf);
            }
        }
        U(builder, "os_version", strN2, hashSet);
        U(builder, "timestamp", String.valueOf(b53Var.r()), hashSet);
        if (((a63) x53Var.b).B()) {
            U(builder, "lat", "1", hashSet);
        }
        U(builder, "privacy_sandbox_version", String.valueOf(((a63) x53Var.b).K0()), hashSet);
        U(builder, "trigger_uri_source", "1", hashSet);
        U(builder, "trigger_uri_timestamp", String.valueOf(jCurrentTimeMillis), hashSet);
        U(builder, "request_uuid", str2, hashSet);
        List<l53> listJ = b53Var.j();
        Bundle bundle = new Bundle();
        for (l53 l53Var : listJ) {
            String strU = l53Var.u();
            if (l53Var.B()) {
                bundle.putString(strU, String.valueOf(l53Var.C()));
            } else if (l53Var.z()) {
                bundle.putString(strU, String.valueOf(l53Var.A()));
            } else if (l53Var.v()) {
                bundle.putString(strU, l53Var.w());
            } else if (l53Var.x()) {
                bundle.putString(strU, String.valueOf(l53Var.y()));
            }
        }
        X(builder, is2Var.L(str, h13.s0).split("\\|"), bundle, hashSet);
        List<u63> listUnmodifiableList = Collections.unmodifiableList(((a63) x53Var.b).Z1());
        Bundle bundle2 = new Bundle();
        for (u63 u63Var : listUnmodifiableList) {
            String strV = u63Var.v();
            if (u63Var.C()) {
                bundle2.putString(strV, String.valueOf(u63Var.D()));
            } else if (u63Var.A()) {
                bundle2.putString(strV, String.valueOf(u63Var.B()));
            } else if (u63Var.w()) {
                bundle2.putString(strV, u63Var.x());
            } else if (u63Var.y()) {
                bundle2.putString(strV, String.valueOf(u63Var.z()));
            }
        }
        X(builder, is2Var.L(str, h13.r0).split("\\|"), bundle2, hashSet);
        U(builder, "dma", true != ((a63) x53Var.b).H0() ? "0" : "1", hashSet);
        if (!((a63) x53Var.b).J0().isEmpty()) {
            U(builder, "dma_cps", ((a63) x53Var.b).J0(), hashSet);
        }
        if (((a63) x53Var.b).P0()) {
            s33 s33VarQ0 = ((a63) x53Var.b).Q0();
            if (!s33VarQ0.H().isEmpty()) {
                U(builder, "dl_gclid", s33VarQ0.H(), hashSet);
            }
            if (!s33VarQ0.J().isEmpty()) {
                U(builder, "dl_gbraid", s33VarQ0.J(), hashSet);
            }
            if (!s33VarQ0.L().isEmpty()) {
                U(builder, "dl_gs", s33VarQ0.L(), hashSet);
            }
            if (s33VarQ0.N() > 0) {
                U(builder, "dl_ss_ts", String.valueOf(s33VarQ0.N()), hashSet);
            }
            if (!s33VarQ0.P().isEmpty()) {
                U(builder, "mr_gclid", s33VarQ0.P(), hashSet);
            }
            if (!s33VarQ0.R().isEmpty()) {
                U(builder, "mr_gbraid", s33VarQ0.R(), hashSet);
            }
            if (!s33VarQ0.T().isEmpty()) {
                U(builder, "mr_gs", s33VarQ0.T(), hashSet);
            }
            if (s33VarQ0.V() > 0) {
                U(builder, "mr_click_ts", String.valueOf(s33VarQ0.V()), hashSet);
            }
        }
        return new zzoh(builder.build().toString(), jCurrentTimeMillis, 1);
    }

    public final d53 e0(ru2 ru2Var) {
        b53 b53VarJ = d53.J();
        long j = ru2Var.f;
        b53VarJ.d();
        ((d53) b53VarJ.b).R(j);
        long j2 = ru2Var.e;
        b53VarJ.d();
        ((d53) b53VarJ.b).t(j2);
        zzbf zzbfVar = ru2Var.g;
        Objects.requireNonNull(zzbfVar);
        Bundle bundle = zzbfVar.a;
        for (String str : bundle.keySet()) {
            j53 j53VarF = l53.F();
            j53VarF.j(str);
            Object obj = bundle.get(str);
            gu2.o(obj);
            c0(j53VarF, obj);
            b53VarJ.n(j53VarF);
        }
        String str2 = ru2Var.c;
        if (!TextUtils.isEmpty(str2) && bundle.get("_o") == null) {
            j53 j53VarF2 = l53.F();
            j53VarF2.j("_o");
            j53VarF2.k(str2);
            b53VarJ.m((l53) j53VarF2.g());
        }
        return (d53) b53VarJ.g();
    }

    public final String f0(w53 w53Var) {
        String str;
        String str2;
        String str3;
        a43 a43VarM0;
        StringBuilder sbM = ts.m("\nbatch {\n");
        if (w53Var.y()) {
            Z(sbM, 0, "upload_subdomain", w53Var.z());
        }
        if (w53Var.w()) {
            Z(sbM, 0, "sgtm_join_id", w53Var.x());
        }
        for (a63 a63Var : w53Var.t()) {
            if (a63Var != null) {
                T(1, sbM);
                sbM.append("bundle {\n");
                if (a63Var.T()) {
                    Z(sbM, 1, "protocol_version", Integer.valueOf(a63Var.T0()));
                }
                y53 y53Var = (y53) this.a;
                is2 is2Var = y53Var.d;
                p23 p23Var = y53Var.W;
                if (is2Var.P(a63Var.t(), h13.M0) && a63Var.z0()) {
                    Z(sbM, 1, "session_stitching_token", a63Var.A0());
                }
                Z(sbM, 1, "platform", a63Var.m2());
                if (a63Var.v()) {
                    Z(sbM, 1, "gmp_version", Long.valueOf(a63Var.w()));
                }
                if (a63Var.x()) {
                    Z(sbM, 1, "uploading_gmp_version", Long.valueOf(a63Var.y()));
                }
                if (a63Var.v0()) {
                    Z(sbM, 1, "dynamite_version", Long.valueOf(a63Var.w0()));
                }
                if (a63Var.P()) {
                    Z(sbM, 1, "config_version", Long.valueOf(a63Var.Q()));
                }
                Z(sbM, 1, "gmp_app_id", a63Var.I());
                Z(sbM, 1, "app_id", a63Var.t());
                Z(sbM, 1, "app_version", a63Var.u());
                if (a63Var.N()) {
                    Z(sbM, 1, "app_version_major", Integer.valueOf(a63Var.O()));
                }
                Z(sbM, 1, "firebase_instance_id", a63Var.M());
                if (a63Var.D()) {
                    Z(sbM, 1, "dev_cert_hash", Long.valueOf(a63Var.E()));
                }
                Z(sbM, 1, "app_store", a63Var.s2());
                if (a63Var.c2()) {
                    Z(sbM, 1, "upload_timestamp_millis", Long.valueOf(a63Var.d2()));
                }
                if (a63Var.e2()) {
                    Z(sbM, 1, "start_timestamp_millis", Long.valueOf(a63Var.f2()));
                }
                if (a63Var.g2()) {
                    Z(sbM, 1, "end_timestamp_millis", Long.valueOf(a63Var.h2()));
                }
                if (a63Var.i2()) {
                    Z(sbM, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(a63Var.j2()));
                }
                if (a63Var.k2()) {
                    Z(sbM, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(a63Var.l2()));
                }
                Z(sbM, 1, "app_instance_id", a63Var.C());
                Z(sbM, 1, "resettable_device_id", a63Var.z());
                Z(sbM, 1, "ds_id", a63Var.S());
                if (a63Var.A()) {
                    Z(sbM, 1, "limited_ad_tracking", Boolean.valueOf(a63Var.B()));
                }
                Z(sbM, 1, "os_version", a63Var.n2());
                Z(sbM, 1, "device_model", a63Var.o2());
                Z(sbM, 1, "user_default_language", a63Var.p2());
                if (a63Var.q2()) {
                    Z(sbM, 1, "time_zone_offset_minutes", Integer.valueOf(a63Var.r2()));
                }
                if (a63Var.F()) {
                    Z(sbM, 1, "bundle_sequential_index", Integer.valueOf(a63Var.G()));
                }
                if (a63Var.N0()) {
                    Z(sbM, 1, "delivery_index", Integer.valueOf(a63Var.O0()));
                }
                if (a63Var.J()) {
                    Z(sbM, 1, "service_upload", Boolean.valueOf(a63Var.K()));
                }
                Z(sbM, 1, "health_monitor", a63Var.H());
                if (a63Var.t0()) {
                    Z(sbM, 1, "retry_counter", Integer.valueOf(a63Var.u0()));
                }
                if (a63Var.x0()) {
                    Z(sbM, 1, "consent_signals", a63Var.y0());
                }
                if (a63Var.G0()) {
                    Z(sbM, 1, "is_dma_region", Boolean.valueOf(a63Var.H0()));
                }
                if (a63Var.I0()) {
                    Z(sbM, 1, "core_platform_services", a63Var.J0());
                }
                if (a63Var.E0()) {
                    Z(sbM, 1, "consent_diagnostics", a63Var.F0());
                }
                if (a63Var.B0()) {
                    Z(sbM, 1, "target_os_version", Long.valueOf(a63Var.C0()));
                }
                hq2.a();
                if (is2Var.P(a63Var.t(), h13.O0)) {
                    Z(sbM, 1, "ad_services_version", Integer.valueOf(a63Var.K0()));
                    if (a63Var.L0() && (a43VarM0 = a63Var.M0()) != null) {
                        T(2, sbM);
                        sbM.append("attribution_eligibility_status {\n");
                        Z(sbM, 2, "eligible", Boolean.valueOf(a43VarM0.t()));
                        Z(sbM, 2, "no_access_adservices_attribution_permission", Boolean.valueOf(a43VarM0.u()));
                        Z(sbM, 2, "pre_r", Boolean.valueOf(a43VarM0.v()));
                        Z(sbM, 2, "r_extensions_too_old", Boolean.valueOf(a43VarM0.w()));
                        Z(sbM, 2, "adservices_extension_too_old", Boolean.valueOf(a43VarM0.x()));
                        Z(sbM, 2, "ad_storage_not_allowed", Boolean.valueOf(a43VarM0.y()));
                        Z(sbM, 2, "measurement_manager_disabled", Boolean.valueOf(a43VarM0.z()));
                        T(2, sbM);
                        sbM.append("}\n");
                    }
                }
                if (a63Var.P0()) {
                    s33 s33VarQ0 = a63Var.Q0();
                    T(2, sbM);
                    sbM.append("ad_campaign_info {\n");
                    if (s33VarQ0.G()) {
                        Z(sbM, 2, "deep_link_gclid", s33VarQ0.H());
                    }
                    if (s33VarQ0.I()) {
                        Z(sbM, 2, "deep_link_gbraid", s33VarQ0.J());
                    }
                    if (s33VarQ0.K()) {
                        Z(sbM, 2, "deep_link_gad_source", s33VarQ0.L());
                    }
                    if (s33VarQ0.W()) {
                        Z(sbM, 2, "deep_link_url", s33VarQ0.X());
                    }
                    if (s33VarQ0.M()) {
                        Z(sbM, 2, "deep_link_session_millis", Long.valueOf(s33VarQ0.N()));
                    }
                    if (s33VarQ0.O()) {
                        Z(sbM, 2, "market_referrer_gclid", s33VarQ0.P());
                    }
                    if (s33VarQ0.Q()) {
                        Z(sbM, 2, "market_referrer_gbraid", s33VarQ0.R());
                    }
                    if (s33VarQ0.S()) {
                        Z(sbM, 2, "market_referrer_gad_source", s33VarQ0.T());
                    }
                    if (s33VarQ0.U()) {
                        Z(sbM, 2, "market_referrer_click_millis", Long.valueOf(s33VarQ0.V()));
                    }
                    T(2, sbM);
                    sbM.append("}\n");
                }
                if (a63Var.U()) {
                    Z(sbM, 1, "batching_timestamp_millis", Long.valueOf(a63Var.V()));
                }
                if (a63Var.R0()) {
                    r63 r63VarS0 = a63Var.S0();
                    T(2, sbM);
                    sbM.append("sgtm_diagnostics {\n");
                    int iX = r63VarS0.x();
                    if (iX == 1) {
                        str2 = "UPLOAD_TYPE_UNKNOWN";
                    } else if (iX == 2) {
                        str2 = "GA_UPLOAD";
                    } else if (iX != 3) {
                        str2 = iX != 4 ? "SDK_SERVICE_UPLOAD" : "PACKAGE_SERVICE_UPLOAD";
                    } else {
                        str2 = "SDK_CLIENT_UPLOAD";
                    }
                    Z(sbM, 2, "upload_type", str2);
                    Z(sbM, 2, "client_upload_eligibility", ck1.y(r63VarS0.t()));
                    int iY = r63VarS0.y();
                    if (iY == 1) {
                        str3 = "SERVICE_UPLOAD_ELIGIBILITY_UNKNOWN";
                    } else if (iY == 2) {
                        str3 = "SERVICE_UPLOAD_ELIGIBLE";
                    } else if (iY == 3) {
                        str3 = "NOT_IN_ROLLOUT";
                    } else if (iY != 4) {
                        str3 = iY != 5 ? "NON_PLAY_MISSING_SGTM_SERVER_URL" : "MISSING_SGTM_PROXY_INFO";
                    } else {
                        str3 = "MISSING_SGTM_SETTINGS";
                    }
                    Z(sbM, 2, "service_upload_eligibility", str3);
                    T(2, sbM);
                    sbM.append("}\n");
                }
                if (a63Var.W()) {
                    u43 u43VarX = a63Var.X();
                    T(2, sbM);
                    sbM.append("consent_info_extra {\n");
                    for (o43 o43Var : u43VarX.t()) {
                        T(3, sbM);
                        sbM.append("limited_data_modes {\n");
                        int iU = o43Var.u();
                        if (iU == 1) {
                            str = "CONSENT_TYPE_UNSPECIFIED";
                        } else if (iU == 2) {
                            str = "AD_STORAGE";
                        } else if (iU != 3) {
                            str = iU != 4 ? "AD_PERSONALIZATION" : "AD_USER_DATA";
                        } else {
                            str = "ANALYTICS_STORAGE";
                        }
                        Z(sbM, 3, "type", str);
                        int iV = o43Var.v();
                        Z(sbM, 3, "mode", iV != 1 ? iV != 2 ? "NO_DATA_MODE" : "LIMITED_MODE" : "NOT_LIMITED");
                        T(3, sbM);
                        sbM.append("}\n");
                    }
                    T(2, sbM);
                    sbM.append("}\n");
                }
                um2<u63> um2VarZ1 = a63Var.Z1();
                if (um2VarZ1 != null) {
                    for (u63 u63Var : um2VarZ1) {
                        if (u63Var != null) {
                            T(2, sbM);
                            sbM.append("user_property {\n");
                            Z(sbM, 2, "set_timestamp_millis", u63Var.t() ? Long.valueOf(u63Var.u()) : null);
                            Z(sbM, 2, "name", p23Var.c(u63Var.v()));
                            Z(sbM, 2, "string_value", u63Var.x());
                            Z(sbM, 2, "int_value", u63Var.y() ? Long.valueOf(u63Var.z()) : null);
                            Z(sbM, 2, "double_value", u63Var.C() ? Double.valueOf(u63Var.D()) : null);
                            T(2, sbM);
                            sbM.append("}\n");
                        }
                    }
                }
                um2<e43> um2VarL = a63Var.L();
                if (um2VarL != null) {
                    for (e43 e43Var : um2VarL) {
                        if (e43Var != null) {
                            T(2, sbM);
                            sbM.append("audience_membership {\n");
                            if (e43Var.t()) {
                                Z(sbM, 2, "audience_id", Integer.valueOf(e43Var.u()));
                            }
                            if (e43Var.y()) {
                                Z(sbM, 2, "new_audience", Boolean.valueOf(e43Var.z()));
                            }
                            Y(sbM, "current_data", e43Var.v());
                            if (e43Var.w()) {
                                Y(sbM, "previous_data", e43Var.x());
                            }
                            T(2, sbM);
                            sbM.append("}\n");
                        }
                    }
                }
                List<d53> listT1 = a63Var.T1();
                if (listT1 != null) {
                    for (d53 d53Var : listT1) {
                        if (d53Var != null) {
                            T(2, sbM);
                            sbM.append("event {\n");
                            Z(sbM, 2, "name", p23Var.a(d53Var.y()));
                            if (d53Var.z()) {
                                Z(sbM, 2, "timestamp_millis", Long.valueOf(d53Var.A()));
                            }
                            if (is2Var.P(null, h13.e1) && d53Var.F()) {
                                Z(sbM, 2, "corrected_timestamp_millis", Long.valueOf(d53Var.G()));
                            }
                            if (d53Var.B()) {
                                Z(sbM, 2, "previous_timestamp_millis", Long.valueOf(d53Var.C()));
                            }
                            if (d53Var.D()) {
                                Z(sbM, 2, "count", Integer.valueOf(d53Var.E()));
                            }
                            if (d53Var.w() != 0) {
                                R(sbM, 2, (um2) d53Var.v());
                            }
                            T(2, sbM);
                            sbM.append("}\n");
                        }
                    }
                }
                T(1, sbM);
                sbM.append("}\n");
            }
        }
        sbM.append("} // End-of-batch\n");
        return sbM.toString();
    }

    public final String g0(w03 w03Var) {
        StringBuilder sbM = ts.m("\nproperty_filter {\n");
        if (w03Var.t()) {
            Z(sbM, 0, "filter_id", Integer.valueOf(w03Var.u()));
        }
        Z(sbM, 0, "property_name", ((y53) this.a).W.c(w03Var.v()));
        String strV = V(w03Var.x(), w03Var.y(), w03Var.A());
        if (!strV.isEmpty()) {
            Z(sbM, 0, "filter_type", strV);
        }
        S(sbM, 1, w03Var.w());
        sbM.append("}\n");
        return sbM.toString();
    }

    public final Parcelable h0(byte[] bArr, Parcelable.Creator creator) {
        Parcelable parcelable = null;
        if (bArr == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.unmarshall(bArr, 0, bArr.length);
            parcelObtain.setDataPosition(0);
            parcelable = (Parcelable) creator.createFromParcel(parcelObtain);
        } catch (ml1 unused) {
            c33 c33Var = ((y53) this.a).f;
            y53.l(c33Var);
            c33Var.f.a("Failed to load parcelable from buffer");
        } finally {
            parcelObtain.recycle();
        }
        return parcelable;
    }

    public final List l0(tm2 tm2Var, List list) {
        int i;
        y53 y53Var = (y53) this.a;
        ArrayList arrayList = new ArrayList(tm2Var);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num.intValue() < 0) {
                c33 c33Var = y53Var.f;
                y53.l(c33Var);
                c33Var.w.b(num, "Ignoring negative bit index to be cleared");
            } else {
                int iIntValue = num.intValue() / 64;
                if (iIntValue >= arrayList.size()) {
                    c33 c33Var2 = y53Var.f;
                    y53.l(c33Var2);
                    c33Var2.w.c(num, Integer.valueOf(arrayList.size()), "Ignoring bit index greater than bitSet size");
                } else {
                    arrayList.set(iIntValue, Long.valueOf(((Long) arrayList.get(iIntValue)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i2 = size2;
            i = size;
            size = i2;
            if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i);
    }

    public final boolean m0(long j, long j2) {
        if (j == 0 || j2 <= 0) {
            return true;
        }
        ((y53) this.a).X.getClass();
        return Math.abs(System.currentTimeMillis() - j) > j2;
    }

    public final long n0(byte[] bArr) {
        gu2.o(bArr);
        y53 y53Var = (y53) this.a;
        qf3 qf3Var = y53Var.w;
        y53.j(qf3Var);
        qf3Var.D();
        MessageDigest messageDigestX = qf3.X();
        if (messageDigestX != null) {
            return qf3.Y(messageDigestX.digest(bArr));
        }
        c33 c33Var = y53Var.f;
        y53.l(c33Var);
        c33Var.f.a("Failed to get MD5");
        return 0L;
    }

    public final byte[] o0(byte[] bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            c33 c33Var = ((y53) this.a).f;
            y53.l(c33Var);
            c33Var.f.b(e, "Failed to gzip content");
            throw e;
        }
    }

    @Override // defpackage.ne3
    public final void H() {
    }
}
