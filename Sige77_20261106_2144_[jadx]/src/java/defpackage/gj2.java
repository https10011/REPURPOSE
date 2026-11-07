package defpackage;

import android.util.Log;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class gj2 {
    public final String a;
    public final int b;
    public Boolean c;
    public Boolean d;
    public Long e;
    public Long f;
    public final /* synthetic */ int g;
    public final /* synthetic */ rl2 h;
    public final dm2 i;

    public gj2(rl2 rl2Var, String str, int i, dm2 dm2Var, int i2) {
        this.g = i2;
        this.h = rl2Var;
        this.a = str;
        this.b = i;
        this.i = dm2Var;
    }

    public static Boolean c(Boolean bool, boolean z) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static Boolean d(String str, z03 z03Var, c33 c33Var) {
        List listY;
        gu2.o(z03Var);
        if (str != null && z03Var.t() && z03Var.B() != 1 && (z03Var.B() != 7 ? z03Var.u() : z03Var.z() != 0)) {
            int iB = z03Var.B();
            boolean zX = z03Var.x();
            String strV = (zX || iB == 2 || iB == 7) ? z03Var.v() : z03Var.v().toUpperCase(Locale.ENGLISH);
            if (z03Var.z() == 0) {
                listY = null;
            } else {
                listY = z03Var.y();
                if (!zX) {
                    ArrayList arrayList = new ArrayList(listY.size());
                    Iterator it = listY.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((String) it.next()).toUpperCase(Locale.ENGLISH));
                    }
                    listY = Collections.unmodifiableList(arrayList);
                }
            }
            String str2 = iB == 2 ? strV : null;
            if (iB != 7 ? strV != null : listY != null && !listY.isEmpty()) {
                if (!zX && iB != 2) {
                    str = str.toUpperCase(Locale.ENGLISH);
                }
                switch (iB - 1) {
                    case 1:
                        if (str2 != null) {
                            try {
                                return Boolean.valueOf(Pattern.compile(str2, true != zX ? 66 : 0).matcher(str).matches());
                            } catch (PatternSyntaxException unused) {
                                if (c33Var != null) {
                                    c33Var.w.b(str2, "Invalid regular expression in REGEXP audience filter. expression");
                                }
                            }
                        }
                        break;
                    case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                        return Boolean.valueOf(str.startsWith(strV));
                    case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                        return Boolean.valueOf(str.endsWith(strV));
                    case oc1.LONG_FIELD_NUMBER /* 4 */:
                        return Boolean.valueOf(str.contains(strV));
                    case oc1.STRING_FIELD_NUMBER /* 5 */:
                        return Boolean.valueOf(str.equals(strV));
                    case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                        if (listY != null) {
                            return Boolean.valueOf(listY.contains(str));
                        }
                        break;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x008a  */
    /* JADX WARN: Code duplicated, block: B:40:0x008d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0090  */
    /* JADX WARN: Code duplicated, block: B:45:0x0095 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:48:0x009d  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:54:0x00aa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:60:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:63:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:66:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:69:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:72:0x00f8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:77:0x0102  */
    /* JADX WARN: Code duplicated, block: B:80:0x0108 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:82:0x010b  */
    /* JADX WARN: Code duplicated, block: B:85:0x0112  */
    public static Boolean e(BigDecimal bigDecimal, u03 u03Var, double d) {
        BigDecimal bigDecimal2;
        BigDecimal bigDecimal3;
        BigDecimal bigDecimal4;
        int i;
        gu2.o(u03Var);
        if (u03Var.t()) {
            if (u03Var.D() != 1 && (u03Var.D() != 5 ? u03Var.w() : u03Var.y() && u03Var.A())) {
                int iD = u03Var.D();
                try {
                    if (u03Var.D() == 5) {
                        if (lf3.i0(u03Var.z()) && lf3.i0(u03Var.B())) {
                            BigDecimal bigDecimal5 = new BigDecimal(u03Var.z());
                            bigDecimal4 = new BigDecimal(u03Var.B());
                            bigDecimal3 = bigDecimal5;
                            bigDecimal2 = null;
                            if (iD == 5 ? bigDecimal2 != null : bigDecimal3 != null) {
                                i = iD - 1;
                                if (i != 1) {
                                    if (i != 2) {
                                        if (i != 3) {
                                            if (i == 4 && bigDecimal3 != null) {
                                                return Boolean.valueOf(bigDecimal.compareTo(bigDecimal3) < 0 && bigDecimal.compareTo(bigDecimal4) <= 0);
                                            }
                                        } else if (bigDecimal2 != null) {
                                            if (d != 0.0d) {
                                                return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2.subtract(new BigDecimal(d).multiply(new BigDecimal(2)))) <= 0 && bigDecimal.compareTo(bigDecimal2.add(new BigDecimal(d).multiply(new BigDecimal(2)))) < 0);
                                            }
                                            return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) == 0);
                                        }
                                    } else if (bigDecimal2 != null) {
                                        return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) > 0);
                                    }
                                } else if (bigDecimal2 != null) {
                                    return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) < 0);
                                }
                            }
                        }
                    } else if (lf3.i0(u03Var.x())) {
                        bigDecimal2 = new BigDecimal(u03Var.x());
                        bigDecimal3 = null;
                        bigDecimal4 = null;
                        if (iD == 5) {
                            i = iD - 1;
                            if (i != 1) {
                                if (i != 2) {
                                    if (i != 3) {
                                        if (i == 4) {
                                            return Boolean.valueOf(bigDecimal.compareTo(bigDecimal3) < 0 && bigDecimal.compareTo(bigDecimal4) <= 0);
                                        }
                                    } else if (bigDecimal2 != null) {
                                        if (d != 0.0d) {
                                            return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2.subtract(new BigDecimal(d).multiply(new BigDecimal(2)))) <= 0 && bigDecimal.compareTo(bigDecimal2.add(new BigDecimal(d).multiply(new BigDecimal(2)))) < 0);
                                        }
                                        return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) == 0);
                                    }
                                } else if (bigDecimal2 != null) {
                                    return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) > 0);
                                }
                            } else if (bigDecimal2 != null) {
                                return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) < 0);
                            }
                        } else {
                            i = iD - 1;
                            if (i != 1) {
                                if (i != 2) {
                                    if (i != 3) {
                                        if (i == 4) {
                                            return Boolean.valueOf(bigDecimal.compareTo(bigDecimal3) < 0 && bigDecimal.compareTo(bigDecimal4) <= 0);
                                        }
                                    } else if (bigDecimal2 != null) {
                                        if (d != 0.0d) {
                                            return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2.subtract(new BigDecimal(d).multiply(new BigDecimal(2)))) <= 0 && bigDecimal.compareTo(bigDecimal2.add(new BigDecimal(d).multiply(new BigDecimal(2)))) < 0);
                                        }
                                        return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) == 0);
                                    }
                                } else if (bigDecimal2 != null) {
                                    return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) > 0);
                                }
                            } else if (bigDecimal2 != null) {
                                return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) < 0);
                            }
                        }
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0279  */
    /* JADX WARN: Code duplicated, block: B:105:0x0299  */
    /* JADX WARN: Code duplicated, block: B:111:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:115:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:120:0x02de  */
    /* JADX WARN: Code duplicated, block: B:126:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:131:0x030a  */
    /* JADX WARN: Code duplicated, block: B:133:0x0310  */
    /* JADX WARN: Code duplicated, block: B:135:0x0324  */
    /* JADX WARN: Code duplicated, block: B:137:0x032a  */
    /* JADX WARN: Code duplicated, block: B:139:0x0332  */
    /* JADX WARN: Code duplicated, block: B:141:0x033c  */
    /* JADX WARN: Code duplicated, block: B:150:0x035f  */
    /* JADX WARN: Code duplicated, block: B:153:0x0368  */
    /* JADX WARN: Code duplicated, block: B:158:0x039f A[EDGE_INSN: B:158:0x039f->B:161:0x03c9 BREAK  A[LOOP:1: B:59:0x0189->B:64:0x01ac]] */
    /* JADX WARN: Code duplicated, block: B:159:0x03b2 A[EDGE_INSN: B:159:0x03b2->B:161:0x03c9 BREAK  A[LOOP:1: B:59:0x0189->B:64:0x01ac]] */
    /* JADX WARN: Code duplicated, block: B:199:0x0343 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:208:0x01b4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:209:0x019f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:210:0x023e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:211:0x01d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:212:0x01f7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:213:0x01de A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:214:0x0216 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:215:0x01fd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:216:0x0228 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:218:0x01c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:222:0x03c3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:223:0x026b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:224:0x0287 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:225:0x016d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:226:0x02bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:227:0x0306 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:228:0x02cc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:229:0x016d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:230:0x0302 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:231:0x0399 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:232:0x0384 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:233:0x036f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:234:0x03c9 A[EDGE_INSN: B:234:0x03c9->B:161:0x03c9 BREAK  A[LOOP:1: B:59:0x0189->B:64:0x01ac], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:235:0x0365 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:236:0x0281 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:237:0x02c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x017c  */
    /* JADX WARN: Code duplicated, block: B:61:0x018f  */
    /* JADX WARN: Code duplicated, block: B:64:0x01ac A[LOOP:1: B:59:0x0189->B:64:0x01ac, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:68:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:74:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:75:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:81:0x0207  */
    /* JADX WARN: Code duplicated, block: B:82:0x0210  */
    /* JADX WARN: Code duplicated, block: B:86:0x021c  */
    /* JADX WARN: Code duplicated, block: B:91:0x024c  */
    /* JADX WARN: Code duplicated, block: B:96:0x0260  */
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
    public boolean a(Long l, Long l2, d53 d53Var, long j, tu2 tu2Var, boolean z) {
        HashSet hashSet;
        Iterator it;
        mb mbVar;
        Iterator it2;
        Iterator it3;
        q03 q03Var;
        boolean z2;
        String strA;
        Object obj;
        Boolean boolE;
        Boolean boolE2;
        String str;
        u03 u03VarW;
        long j2;
        Boolean boolE3;
        l53 l53Var;
        Long lValueOf;
        Double dValueOf;
        q03 q03Var2;
        Boolean boolE4;
        int i;
        sp2.a();
        rl2 rl2Var = this.h;
        y53 y53Var = (y53) rl2Var.a;
        is2 is2Var = y53Var.d;
        c33 c33Var = y53Var.f;
        p23 p23Var = y53Var.W;
        f13 f13Var = h13.F0;
        String str2 = this.a;
        boolean zP = is2Var.P(str2, f13Var);
        n03 n03Var = (n03) this.i;
        long j3 = n03Var.E() ? tu2Var.e : j;
        y53.l(c33Var);
        z23 z23Var = c33Var.a0;
        z23 z23Var2 = c33Var.w;
        boolean zIsLoggable = Log.isLoggable(c33Var.O(), 2);
        int i2 = this.b;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        Boolean bool = null;
        if (zIsLoggable) {
            y53.l(c33Var);
            z23Var.d("Evaluating filter. audience, filter, event", Integer.valueOf(i2), n03Var.t() ? Integer.valueOf(n03Var.u()) : null, p23Var.a(n03Var.v()));
            y53.l(c33Var);
            lf3 lf3Var = rl2Var.b.i;
            if3.T(lf3Var);
            StringBuilder sb = new StringBuilder();
            sb.append("\nevent_filter {\n");
            if (n03Var.t()) {
                i = 0;
                lf3.Z(sb, 0, "filter_id", Integer.valueOf(n03Var.u()));
            } else {
                i = 0;
            }
            lf3.Z(sb, i, "event_name", ((y53) lf3Var.a).W.a(n03Var.v()));
            String strV = lf3.V(n03Var.B(), n03Var.C(), n03Var.E());
            if (!strV.isEmpty()) {
                lf3.Z(sb, 0, "filter_type", strV);
            }
            if (n03Var.z()) {
                lf3.a0(sb, 1, "event_count_filter", n03Var.A());
            }
            if (n03Var.x() > 0) {
                sb.append("  filters {\n");
                Iterator it4 = n03Var.w().iterator();
                while (it4.hasNext()) {
                    lf3Var.S(sb, 2, (q03) it4.next());
                }
            }
            lf3.T(1, sb);
            sb.append("}\n}\n");
            z23Var.b(sb.toString(), "Filter definition");
        }
        if (!n03Var.t() || n03Var.u() > 256) {
            y53.l(c33Var);
            z23Var2.c(c33.M(str2), String.valueOf(n03Var.t() ? Integer.valueOf(n03Var.u()) : null), "Invalid event filter ID. appId, id");
            return false;
        }
        boolean z3 = n03Var.B() || n03Var.C() || n03Var.E();
        if (z && !z3) {
            y53.l(c33Var);
            z23Var.c(Integer.valueOf(i2), n03Var.t() ? Integer.valueOf(n03Var.u()) : null, "Event filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID");
            return true;
        }
        String strY = d53Var.y();
        if (!n03Var.z()) {
            hashSet = new HashSet();
            it = n03Var.w().iterator();
            while (true) {
                if (it.hasNext()) {
                    mbVar = new mb(0);
                    it2 = d53Var.v().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            it3 = n03Var.w().iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    zP = zP;
                                    c33Var = c33Var;
                                    bool = Boolean.TRUE;
                                    break;
                                }
                                q03Var = (q03) it3.next();
                                if (q03Var.x()) {
                                    z2 = false;
                                } else {
                                    z2 = false;
                                }
                                strA = q03Var.A();
                                if (strA.isEmpty()) {
                                    obj = mbVar.get(strA);
                                    if (obj instanceof Long) {
                                        if (obj instanceof Double) {
                                            if (obj instanceof String) {
                                                zP = zP;
                                                c33Var = c33Var;
                                                if (obj == null) {
                                                    y53.l(c33Var);
                                                    z23Var2.c(p23Var.a(strY), p23Var.b(strA), "Unknown param type. event, param");
                                                    break;
                                                }
                                                y53.l(c33Var);
                                                z23Var.c(p23Var.a(strY), p23Var.b(strA), "Missing param for filter. event, param");
                                                bool = Boolean.FALSE;
                                                break;
                                            }
                                            if (q03Var.t()) {
                                                if (q03Var.v()) {
                                                    zP = zP;
                                                    c33Var = c33Var;
                                                    y53.l(c33Var);
                                                    z23Var2.c(p23Var.a(strY), p23Var.b(strA), "No filter for String param. event, param");
                                                    break;
                                                }
                                                str = (String) obj;
                                                if (lf3.i0(str)) {
                                                    zP = zP;
                                                    c33Var = c33Var;
                                                    y53.l(c33Var);
                                                    z23Var2.c(p23Var.a(strY), p23Var.b(strA), "Invalid param value for number filter. event, param");
                                                    break;
                                                }
                                                u03VarW = q03Var.w();
                                                if (lf3.i0(str)) {
                                                    zP = zP;
                                                    c33Var = c33Var;
                                                    j2 = 0;
                                                    boolE3 = e(new BigDecimal(str), u03VarW, 0.0d);
                                                } else {
                                                    boolE3 = null;
                                                }
                                                if (boolE3 != null) {
                                                    break;
                                                    break;
                                                }
                                                if (boolE3.booleanValue() == z2) {
                                                    bool = Boolean.FALSE;
                                                    break;
                                                }
                                                c33Var = c33Var;
                                                zP = zP;
                                            } else {
                                                z03 z03VarU = q03Var.u();
                                                y53.l(c33Var);
                                                boolE3 = d((String) obj, z03VarU, c33Var);
                                            }
                                            j2 = 0;
                                            if (boolE3 != null) {
                                                break;
                                                break;
                                            }
                                            if (boolE3.booleanValue() == z2) {
                                                bool = Boolean.FALSE;
                                                break;
                                            }
                                            c33Var = c33Var;
                                            zP = zP;
                                        } else if (q03Var.v()) {
                                            double dDoubleValue = ((Double) obj).doubleValue();
                                            boolE2 = e(new BigDecimal(dDoubleValue), q03Var.w(), Math.ulp(dDoubleValue));
                                            if (boolE2 != null) {
                                                if (boolE2.booleanValue() == z2) {
                                                    bool = Boolean.FALSE;
                                                }
                                            }
                                        } else {
                                            y53.l(c33Var);
                                            z23Var2.c(p23Var.a(strY), p23Var.b(strA), "No number filter for double param. event, param");
                                        }
                                    } else if (q03Var.v()) {
                                        boolE = e(new BigDecimal(((Long) obj).longValue()), q03Var.w(), 0.0d);
                                        if (boolE != null) {
                                            if (boolE.booleanValue() == z2) {
                                                bool = Boolean.FALSE;
                                            }
                                        }
                                    } else {
                                        y53.l(c33Var);
                                        z23Var2.c(p23Var.a(strY), p23Var.b(strA), "No number filter for long param. event, param");
                                    }
                                } else {
                                    y53.l(c33Var);
                                    z23Var2.b(p23Var.a(strY), "Event has empty param name. event");
                                }
                            }
                        } else {
                            l53Var = (l53) it2.next();
                            if (!hashSet.contains(l53Var.u())) {
                                if (l53Var.x()) {
                                    String strU = l53Var.u();
                                    if (l53Var.x()) {
                                        lValueOf = Long.valueOf(l53Var.y());
                                    } else {
                                        lValueOf = null;
                                    }
                                    mbVar.put(strU, lValueOf);
                                } else if (l53Var.B()) {
                                    String strU2 = l53Var.u();
                                    if (l53Var.B()) {
                                        dValueOf = Double.valueOf(l53Var.C());
                                    } else {
                                        dValueOf = null;
                                    }
                                    mbVar.put(strU2, dValueOf);
                                } else if (l53Var.v()) {
                                    mbVar.put(l53Var.u(), l53Var.w());
                                } else {
                                    y53.l(c33Var);
                                    z23Var2.c(p23Var.a(strY), p23Var.b(l53Var.u()), "Unknown value for param. event, param");
                                }
                            }
                        }
                    }
                } else {
                    q03Var2 = (q03) it.next();
                    if (q03Var2.A().isEmpty()) {
                        y53.l(c33Var);
                        z23Var2.b(p23Var.a(strY), "null or empty param name in filter. event");
                    } else {
                        hashSet.add(q03Var2.A());
                    }
                }
                zP = zP;
                c33Var = c33Var;
                break;
            }
        }
        try {
            boolE4 = e(new BigDecimal(j3), n03Var.A(), 0.0d);
        } catch (NumberFormatException unused) {
            boolE4 = null;
        }
        if (boolE4 != null) {
            if (boolE4.booleanValue()) {
                hashSet = new HashSet();
                it = n03Var.w().iterator();
                while (true) {
                    if (it.hasNext()) {
                        mbVar = new mb(0);
                        it2 = d53Var.v().iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                it3 = n03Var.w().iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        zP = zP;
                                        c33Var = c33Var;
                                        bool = Boolean.TRUE;
                                        break;
                                    }
                                    q03Var = (q03) it3.next();
                                    if (q03Var.x() || !q03Var.y()) {
                                        z2 = false;
                                    } else {
                                        z2 = true;
                                    }
                                    strA = q03Var.A();
                                    if (strA.isEmpty()) {
                                        obj = mbVar.get(strA);
                                        if (obj instanceof Long) {
                                            if (obj instanceof Double) {
                                                if (obj instanceof String) {
                                                    zP = zP;
                                                    c33Var = c33Var;
                                                    if (obj == null) {
                                                        y53.l(c33Var);
                                                        z23Var2.c(p23Var.a(strY), p23Var.b(strA), "Unknown param type. event, param");
                                                        break;
                                                    }
                                                    y53.l(c33Var);
                                                    z23Var.c(p23Var.a(strY), p23Var.b(strA), "Missing param for filter. event, param");
                                                    bool = Boolean.FALSE;
                                                    break;
                                                }
                                                if (q03Var.t()) {
                                                    if (q03Var.v()) {
                                                        zP = zP;
                                                        c33Var = c33Var;
                                                        y53.l(c33Var);
                                                        z23Var2.c(p23Var.a(strY), p23Var.b(strA), "No filter for String param. event, param");
                                                        break;
                                                    }
                                                    str = (String) obj;
                                                    if (lf3.i0(str)) {
                                                        zP = zP;
                                                        c33Var = c33Var;
                                                        y53.l(c33Var);
                                                        z23Var2.c(p23Var.a(strY), p23Var.b(strA), "Invalid param value for number filter. event, param");
                                                        break;
                                                    }
                                                    u03VarW = q03Var.w();
                                                    if (lf3.i0(str)) {
                                                        boolE3 = null;
                                                    } else {
                                                        try {
                                                            zP = zP;
                                                            c33Var = c33Var;
                                                            j2 = 0;
                                                            try {
                                                                boolE3 = e(new BigDecimal(str), u03VarW, 0.0d);
                                                            } catch (NumberFormatException unused2) {
                                                                boolE3 = null;
                                                            }
                                                        } catch (NumberFormatException unused3) {
                                                            zP = zP;
                                                            c33Var = c33Var;
                                                            j2 = 0;
                                                        }
                                                    }
                                                    if (boolE3 != null) {
                                                        break;
                                                    }
                                                    if (boolE3.booleanValue() == z2) {
                                                        bool = Boolean.FALSE;
                                                        break;
                                                    }
                                                    c33Var = c33Var;
                                                    zP = zP;
                                                } else {
                                                    z03 z03VarU2 = q03Var.u();
                                                    y53.l(c33Var);
                                                    boolE3 = d((String) obj, z03VarU2, c33Var);
                                                }
                                                j2 = 0;
                                                if (boolE3 != null) {
                                                    break;
                                                    break;
                                                }
                                                if (boolE3.booleanValue() == z2) {
                                                    bool = Boolean.FALSE;
                                                    break;
                                                }
                                                c33Var = c33Var;
                                                zP = zP;
                                            } else if (q03Var.v()) {
                                                y53.l(c33Var);
                                                z23Var2.c(p23Var.a(strY), p23Var.b(strA), "No number filter for double param. event, param");
                                            } else {
                                                double dDoubleValue2 = ((Double) obj).doubleValue();
                                                try {
                                                    boolE2 = e(new BigDecimal(dDoubleValue2), q03Var.w(), Math.ulp(dDoubleValue2));
                                                } catch (NumberFormatException unused4) {
                                                    boolE2 = null;
                                                }
                                                if (boolE2 != null) {
                                                    if (boolE2.booleanValue() == z2) {
                                                        bool = Boolean.FALSE;
                                                    }
                                                }
                                            }
                                        } else if (q03Var.v()) {
                                            y53.l(c33Var);
                                            z23Var2.c(p23Var.a(strY), p23Var.b(strA), "No number filter for long param. event, param");
                                        } else {
                                            try {
                                                boolE = e(new BigDecimal(((Long) obj).longValue()), q03Var.w(), 0.0d);
                                            } catch (NumberFormatException unused5) {
                                                boolE = null;
                                            }
                                            if (boolE != null) {
                                                if (boolE.booleanValue() == z2) {
                                                    bool = Boolean.FALSE;
                                                }
                                            }
                                        }
                                    } else {
                                        y53.l(c33Var);
                                        z23Var2.b(p23Var.a(strY), "Event has empty param name. event");
                                    }
                                }
                            } else {
                                l53Var = (l53) it2.next();
                                if (!hashSet.contains(l53Var.u())) {
                                    if (l53Var.x()) {
                                        String strU3 = l53Var.u();
                                        if (l53Var.x()) {
                                            lValueOf = Long.valueOf(l53Var.y());
                                        } else {
                                            lValueOf = null;
                                        }
                                        mbVar.put(strU3, lValueOf);
                                    } else if (l53Var.B()) {
                                        String strU4 = l53Var.u();
                                        if (l53Var.B()) {
                                            dValueOf = Double.valueOf(l53Var.C());
                                        } else {
                                            dValueOf = null;
                                        }
                                        mbVar.put(strU4, dValueOf);
                                    } else if (l53Var.v()) {
                                        mbVar.put(l53Var.u(), l53Var.w());
                                    } else {
                                        y53.l(c33Var);
                                        z23Var2.c(p23Var.a(strY), p23Var.b(l53Var.u()), "Unknown value for param. event, param");
                                    }
                                }
                            }
                        }
                    } else {
                        q03Var2 = (q03) it.next();
                        if (q03Var2.A().isEmpty()) {
                            y53.l(c33Var);
                            z23Var2.b(p23Var.a(strY), "null or empty param name in filter. event");
                        } else {
                            hashSet.add(q03Var2.A());
                        }
                    }
                }
            } else {
                bool = Boolean.FALSE;
            }
        }
        zP = zP;
        c33Var = c33Var;
        break;
        y53.l(c33Var);
        z23Var.b(bool == null ? "null" : bool, "Event filter result");
        if (bool == null) {
            return false;
        }
        Boolean bool2 = Boolean.TRUE;
        this.c = bool2;
        if (!bool.booleanValue()) {
            return true;
        }
        this.d = bool2;
        if (!z3 || !d53Var.z()) {
            return true;
        }
        Long lValueOf2 = Long.valueOf(d53Var.A());
        if (n03Var.C()) {
            if (zP && n03Var.z()) {
                lValueOf2 = l;
            }
            this.f = lValueOf2;
            return true;
        }
        if (zP && n03Var.z()) {
            lValueOf2 = l2;
        }
        this.e = lValueOf2;
        return true;
    }

    public boolean b(Long l, Long l2, u63 u63Var, boolean z) {
        boolean z2;
        Boolean boolC;
        Boolean boolE;
        Boolean boolE2;
        Boolean boolE3;
        sp2.a();
        y53 y53Var = (y53) this.h.a;
        is2 is2Var = y53Var.d;
        p23 p23Var = y53Var.W;
        c33 c33Var = y53Var.f;
        boolean zP = is2Var.P(this.a, h13.D0);
        w03 w03Var = (w03) this.i;
        boolean zX = w03Var.x();
        boolean zY = w03Var.y();
        boolean zA = w03Var.A();
        boolean z3 = zX || zY || zA;
        if (z && !z3) {
            y53.l(c33Var);
            c33Var.a0.c(Integer.valueOf(this.b), w03Var.t() ? Integer.valueOf(w03Var.u()) : null, "Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID");
            return true;
        }
        q03 q03VarW = w03Var.w();
        boolean zY2 = q03VarW.y();
        if (!u63Var.y()) {
            z2 = zA;
            if (!u63Var.C()) {
                if (!u63Var.w()) {
                    y53.l(c33Var);
                    c33Var.w.b(p23Var.c(u63Var.v()), "User property has no value, property");
                } else if (q03VarW.t()) {
                    String strX = u63Var.x();
                    z03 z03VarU = q03VarW.u();
                    y53.l(c33Var);
                    boolC = c(d(strX, z03VarU, c33Var), zY2);
                } else if (!q03VarW.v()) {
                    y53.l(c33Var);
                    c33Var.w.b(p23Var.c(u63Var.v()), "No string or number filter defined. property");
                } else if (lf3.i0(u63Var.x())) {
                    String strX2 = u63Var.x();
                    u03 u03VarW = q03VarW.w();
                    if (lf3.i0(strX2)) {
                        try {
                            boolE = e(new BigDecimal(strX2), u03VarW, 0.0d);
                        } catch (NumberFormatException unused) {
                            boolE = null;
                        }
                    } else {
                        boolE = null;
                    }
                    boolC = c(boolE, zY2);
                } else {
                    y53.l(c33Var);
                    c33Var.w.c(p23Var.c(u63Var.v()), u63Var.x(), "Invalid user property value for Numeric number filter. property, value");
                }
                boolC = null;
            } else if (q03VarW.v()) {
                double D = u63Var.D();
                try {
                    boolE2 = e(new BigDecimal(D), q03VarW.w(), Math.ulp(D));
                } catch (NumberFormatException unused2) {
                    boolE2 = null;
                }
                boolC = c(boolE2, zY2);
            } else {
                y53.l(c33Var);
                c33Var.w.b(p23Var.c(u63Var.v()), "No number filter for double property. property");
                boolC = null;
            }
        } else if (q03VarW.v()) {
            z2 = zA;
            try {
                boolE3 = e(new BigDecimal(u63Var.z()), q03VarW.w(), 0.0d);
            } catch (NumberFormatException unused3) {
                boolE3 = null;
            }
            boolC = c(boolE3, zY2);
        } else {
            y53.l(c33Var);
            c33Var.w.b(p23Var.c(u63Var.v()), "No number filter for long property. property");
            z2 = zA;
            boolC = null;
        }
        y53.l(c33Var);
        c33Var.a0.b(boolC == null ? "null" : boolC, "Property filter result");
        if (boolC == null) {
            return false;
        }
        this.c = Boolean.TRUE;
        if (!z2 || boolC.booleanValue()) {
            if (!z || w03Var.x()) {
                this.d = boolC;
            }
            if (boolC.booleanValue() && z3 && u63Var.t()) {
                long jU = u63Var.u();
                if (l != null) {
                    jU = l.longValue();
                }
                if (zP && w03Var.x() && !w03Var.y() && l2 != null) {
                    jU = l2.longValue();
                }
                if (w03Var.y()) {
                    this.f = Long.valueOf(jU);
                } else {
                    this.e = Long.valueOf(jU);
                }
            }
        }
        return true;
    }
}
