package defpackage;

import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class wj2 extends lo2 {
    public static final Set f;
    public static final ud2 i;
    public static final uj2 v;
    public final String b;
    public final Level c;
    public final Set d;
    public final ud2 e;

    static {
        Set setUnmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(aq3.a, dr3.a, er3.a)));
        f = setUnmodifiableSet;
        ep1 ep1VarB = jw.B(setUnmodifiableSet);
        ud2 ud2Var = new ud2();
        HashMap map = new HashMap();
        ud2Var.d = map;
        HashMap map2 = new HashMap();
        ud2Var.a = map2;
        map.putAll((HashMap) ep1VarB.b);
        map2.putAll((HashMap) ep1VarB.c);
        ud2Var.b = (or3) ep1VarB.d;
        ud2Var.c = (pr3) ep1VarB.e;
        i = ud2Var;
        v = new uj2(Level.ALL, setUnmodifiableSet, ud2Var);
    }

    public /* synthetic */ wj2(String str, Level level, Set set, ud2 ud2Var) {
        super(str);
        this.b = jw.D(str);
        this.c = level;
        this.d = set;
        this.e = ud2Var;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x019c  */
    /* JADX WARN: Code duplicated, block: B:105:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:106:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:109:0x01b8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:110:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:114:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:115:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:118:0x01da  */
    /* JADX WARN: Code duplicated, block: B:120:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:138:0x0235  */
    /* JADX WARN: Code duplicated, block: B:141:0x0240  */
    /* JADX WARN: Code duplicated, block: B:146:0x025f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:153:0x026e  */
    /* JADX WARN: Code duplicated, block: B:155:0x0278  */
    /* JADX WARN: Code duplicated, block: B:157:0x027b  */
    /* JADX WARN: Code duplicated, block: B:163:0x0285  */
    /* JADX WARN: Code duplicated, block: B:168:0x028f  */
    /* JADX WARN: Code duplicated, block: B:170:0x0293  */
    /* JADX WARN: Code duplicated, block: B:172:0x029b  */
    /* JADX WARN: Code duplicated, block: B:176:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:178:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:196:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:198:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:200:0x0307  */
    /* JADX WARN: Code duplicated, block: B:203:0x0314  */
    /* JADX WARN: Code duplicated, block: B:206:0x0333  */
    /* JADX WARN: Code duplicated, block: B:208:0x0337  */
    /* JADX WARN: Code duplicated, block: B:209:0x033b  */
    /* JADX WARN: Code duplicated, block: B:210:0x0341  */
    /* JADX WARN: Code duplicated, block: B:218:0x036a  */
    /* JADX WARN: Code duplicated, block: B:220:0x0375  */
    /* JADX WARN: Code duplicated, block: B:222:0x037d A[LOOP:4: B:139:0x0237->B:222:0x037d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:229:0x0395 A[LOOP:2: B:99:0x0196->B:229:0x0395, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:236:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:255:0x041d  */
    /* JADX WARN: Code duplicated, block: B:257:0x0423  */
    /* JADX WARN: Code duplicated, block: B:259:0x0429  */
    /* JADX WARN: Code duplicated, block: B:261:0x0431  */
    /* JADX WARN: Code duplicated, block: B:262:0x0434  */
    /* JADX WARN: Code duplicated, block: B:264:0x0437  */
    /* JADX WARN: Code duplicated, block: B:266:0x043b  */
    /* JADX WARN: Code duplicated, block: B:269:0x0458  */
    /* JADX WARN: Code duplicated, block: B:289:0x049b  */
    /* JADX WARN: Code duplicated, block: B:291:0x049f  */
    /* JADX WARN: Code duplicated, block: B:293:0x04a3  */
    /* JADX WARN: Code duplicated, block: B:295:0x03bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:296:0x03b0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:297:0x0122 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:298:0x0160 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:299:0x0159 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:300:0x014c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:301:0x0188 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:302:0x017c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:303:0x03a3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:306:0x0390 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:308:0x02b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:311:0x0365 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:312:0x035e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:313:0x0357 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:314:0x0389 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:315:0x0382 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:321:0x01ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:322:0x01ee A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:326:0x0239 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:327:0x024a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x0095  */
    /* JADX WARN: Code duplicated, block: B:42:0x009e  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:49:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:53:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:59:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:62:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:65:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:67:0x0111  */
    /* JADX WARN: Code duplicated, block: B:69:0x011a A[LOOP:1: B:63:0x00f6->B:69:0x011a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:74:0x012f  */
    /* JADX WARN: Code duplicated, block: B:76:0x0133  */
    /* JADX WARN: Code duplicated, block: B:78:0x0139  */
    /* JADX WARN: Code duplicated, block: B:80:0x0141  */
    /* JADX WARN: Code duplicated, block: B:87:0x0167  */
    /* JADX WARN: Code duplicated, block: B:89:0x016c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:90:0x016e  */
    /* JADX WARN: Code duplicated, block: B:92:0x0174  */
    /* JADX WARN: Code duplicated, block: B:97:0x018f  */
    public static void F(qp3 qp3Var, String str, Level level, Set set, ud2 ud2Var) {
        ij2 wr3Var;
        StringBuilder sb;
        iq3 iq3Var;
        mj2 mj2Var;
        ij2 ij2Var;
        Level level2;
        boolean z;
        Object[] objArr;
        lr3 lr3Var;
        o50 o50Var;
        boolean z2;
        String str2;
        Object[] objArr2;
        String str3;
        StringBuilder sb2;
        String str4;
        int iB;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        Level level3;
        char cCharAt;
        int i10;
        char c;
        String str5;
        int i11;
        int i12;
        char cCharAt2;
        int i13;
        boolean z3;
        int i14;
        ij2 ij2Var2;
        int i15;
        jr3 jr3Var;
        int i16;
        char cCharAt3;
        String str6;
        int i17;
        jr3 jr3Var2;
        int i18;
        char cCharAt4;
        char c2;
        int i19;
        fr3 fr3Var;
        int i20;
        int i21;
        fk2 fk2Var;
        sn gk2Var;
        sn ik2Var;
        int i22;
        Object[] objArr3;
        int i23;
        Object obj;
        int i24;
        int i25;
        boolean z4;
        int i26;
        int i27;
        String string;
        g93 g93VarC = qp3Var.c();
        Level level4 = qp3Var.a;
        Boolean bool = (Boolean) g93VarC.Q(er3.a);
        if (bool == null || !bool.booleanValue()) {
            ((oj2) jj2.a).getClass();
            g93 g93VarC2 = tj2.b.c();
            g93 g93VarC3 = qp3Var.c();
            int iJ = g93VarC3.J();
            if (iJ == 0) {
                wr3Var = ij2.a;
            } else {
                wr3Var = iJ <= 28 ? new wr3(g93VarC2, g93VarC3) : new xr3(g93VarC2, g93VarC3);
            }
            boolean z5 = level4.intValue() < level.intValue();
            if (z5) {
                sb = new StringBuilder();
                iq3Var = qp3Var.d;
                if (iq3Var != null) {
                    uq1.q("cannot request log site information prior to postProcess()");
                    return;
                }
                if (yv2.Z(2, iq3Var, sb)) {
                    sb.append(" ");
                }
                if (z5) {
                    mj2Var = qp3Var.f;
                    if (mj2Var != null) {
                        if (mj2Var != null) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        str2 = "cannot get arguments unless a template context exists";
                        if (!z2) {
                            uq1.q("cannot get arguments unless a template context exists");
                            return;
                        }
                        objArr2 = qp3Var.g;
                        str3 = "cannot get arguments before calling log()";
                        if (objArr2 == null) {
                            uq1.q("cannot get arguments before calling log()");
                            return;
                        }
                        o50Var = new o50(mj2Var, objArr2, sb);
                        sb2 = (StringBuilder) o50Var.g;
                        mj2 mj2Var2 = (mj2) o50Var.e;
                        jk2 jk2Var = mj2Var2.a;
                        str4 = mj2Var2.b;
                        jk2Var.getClass();
                        iB = kk2.b(0, str4);
                        i2 = -1;
                        i3 = 0;
                        while (true) {
                            i4 = 3;
                            if (iB < 0) {
                                ij2Var = wr3Var;
                                level2 = level4;
                                String str7 = str2;
                                String str8 = str3;
                                i5 = o50Var.b;
                                if (((i5 + 1) & i5) == 0) {
                                }
                                throw new xp(String.format("unreferenced arguments [first missing index=%d]", Integer.valueOf(Integer.numberOfTrailingZeros(~i5))), 8);
                            }
                            i6 = iB + 1;
                            i7 = i6;
                            i8 = 0;
                            while (true) {
                                if (i7 >= str4.length()) {
                                    throw new xp(xp.c("unterminated parameter", iB, -1, str4), 8);
                                }
                                i9 = i7 + 1;
                                level3 = level4;
                                cCharAt = str4.charAt(i7);
                                i10 = i7;
                                c = (char) (cCharAt - '0');
                                str5 = str2;
                                if (c < '\n') {
                                    i27 = (i8 * 10) + c;
                                    if (i27 >= 1000000) {
                                        throw xp.a("index too large", iB, i9, str4);
                                    }
                                    i8 = i27;
                                    i7 = i9;
                                    level4 = level3;
                                    str2 = str5;
                                }
                            }
                            if (cCharAt != '$') {
                                i11 = -1;
                                if (cCharAt != '<') {
                                    i2 = i3;
                                    i3++;
                                } else {
                                    if (i2 == -1) {
                                        throw xp.a("invalid relative parameter", iB, i9, str4);
                                    }
                                    if (i9 == str4.length()) {
                                        throw new xp(xp.c("unterminated parameter", iB, -1, str4), 8);
                                    }
                                    str4.charAt(i9);
                                    i6 = i9;
                                    i9 = i10 + 2;
                                }
                            } else {
                                if (i10 - i6 == 0) {
                                    throw xp.a("missing index", iB, i9, str4);
                                }
                                if (str4.charAt(i6) == '0') {
                                    throw xp.a("index has leading zero", iB, i9, str4);
                                }
                                i26 = i8 - 1;
                                if (i9 == str4.length()) {
                                    throw new xp(xp.c("unterminated parameter", iB, -1, str4), 8);
                                }
                                str4.charAt(i9);
                                i6 = i9;
                                i2 = i26;
                                i9 = i10 + 2;
                                i11 = -1;
                            }
                            i12 = i9 + i11;
                            while (true) {
                                if (i12 >= str4.length()) {
                                    throw new xp(xp.c("unterminated parameter", iB, -1, str4), 8);
                                }
                                if (((char) ((str4.charAt(i12) & (-33)) - 65)) < 26) {
                                    break;
                                }
                                i12++;
                                str3 = str3;
                                i4 = 3;
                            }
                            cCharAt2 = str4.charAt(i12);
                            i13 = cCharAt2 & ' ';
                            if (i13 == 0) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            jr3 jr3Var3 = jr3.e;
                            if (i6 == i12) {
                                if (true != z3) {
                                    i14 = 0;
                                } else {
                                    i14 = 128;
                                }
                                while (true) {
                                    if (i6 != i12) {
                                        ij2Var2 = wr3Var;
                                        i15 = i13;
                                        jr3Var = new jr3(i14, -1, -1);
                                        str6 = str3;
                                    } else {
                                        i16 = i6 + 1;
                                        i15 = i13;
                                        cCharAt3 = str4.charAt(i6);
                                        str6 = str3;
                                        if (cCharAt3 >= ' ') {
                                        }
                                        ij2Var2 = wr3Var;
                                        if (cCharAt3 > '9') {
                                            throw xp.b(i6, "invalid flag", str4);
                                        }
                                        i17 = cCharAt3 - '0';
                                        while (true) {
                                            if (i16 == i12) {
                                                jr3Var2 = new jr3(i14, i17, -1);
                                                jr3Var = jr3Var2;
                                                break;
                                            }
                                            i18 = i16 + 1;
                                            cCharAt4 = str4.charAt(i16);
                                            if (cCharAt4 == '.') {
                                                jr3Var = new jr3(i14, i17, jr3.e(i18, i12, str4));
                                                break;
                                            }
                                            c2 = (char) (cCharAt4 - '0');
                                            if (c2 >= '\n') {
                                                throw xp.b(i16, "invalid width character", str4);
                                            }
                                            i17 = (i17 * 10) + c2;
                                            if (i17 > 999999) {
                                                throw xp.a("width too large", i6, i12, str4);
                                            }
                                            i16 = i18;
                                            i4 = 3;
                                        }
                                    }
                                    i14 |= i19;
                                    i6 = i16;
                                    wr3Var = ij2Var2;
                                    i13 = i15;
                                    str3 = str6;
                                }
                            } else {
                                if (true != z3) {
                                    i14 = 0;
                                } else {
                                    i14 = 128;
                                }
                                while (true) {
                                    if (i6 != i12) {
                                        ij2Var2 = wr3Var;
                                        i15 = i13;
                                        jr3Var = new jr3(i14, -1, -1);
                                        str6 = str3;
                                    } else {
                                        i16 = i6 + 1;
                                        i15 = i13;
                                        cCharAt3 = str4.charAt(i6);
                                        str6 = str3;
                                        if (cCharAt3 >= ' ') {
                                        }
                                        ij2Var2 = wr3Var;
                                        if (cCharAt3 > '9') {
                                            throw xp.b(i6, "invalid flag", str4);
                                        }
                                        i17 = cCharAt3 - '0';
                                        while (true) {
                                            if (i16 == i12) {
                                                jr3Var2 = new jr3(i14, i17, -1);
                                                jr3Var = jr3Var2;
                                                break;
                                            }
                                            i18 = i16 + 1;
                                            cCharAt4 = str4.charAt(i16);
                                            if (cCharAt4 == '.') {
                                                jr3Var = new jr3(i14, i17, jr3.e(i18, i12, str4));
                                                break;
                                            }
                                            c2 = (char) (cCharAt4 - '0');
                                            if (c2 >= '\n') {
                                                throw xp.b(i16, "invalid width character", str4);
                                            }
                                            i17 = (i17 * 10) + c2;
                                            if (i17 > 999999) {
                                                throw xp.a("width too large", i6, i12, str4);
                                            }
                                            i16 = i18;
                                            i4 = 3;
                                        }
                                    }
                                    i14 |= i19;
                                    i6 = i16;
                                    wr3Var = ij2Var2;
                                    i13 = i15;
                                    str3 = str6;
                                }
                            }
                            fr3Var = fr3.f[(cCharAt2 | ' ') - 97];
                            if (i15 == 0) {
                                fr3Var = null;
                            }
                            i20 = i12 + 1;
                            if (fr3Var != null) {
                                jr3Var.getClass();
                                i24 = fr3Var.c;
                                i25 = fr3Var.b;
                                if (i25 == 1) {
                                    z4 = true;
                                } else {
                                    if (i25 != 2) {
                                    }
                                    z4 = false;
                                }
                                if (jr3Var.b(i24, z4)) {
                                    throw xp.a("invalid format specifier", iB, i20, str4);
                                }
                                if (i2 < 10) {
                                    Map map = hk2.e;
                                    if (jr3Var.a()) {
                                        sn[] snVarArr = (hk2[]) hk2.e.get(fr3Var);
                                        qt.J(snVarArr, "default parameter");
                                        gk2Var = snVarArr[i2];
                                    }
                                }
                                ik2Var = new hk2(i2, fr3Var, jr3Var);
                                gk2Var = ik2Var;
                            } else {
                                if (cCharAt2 != 't') {
                                }
                                if (jr3Var.b(160, false)) {
                                    throw xp.a("invalid format specification", iB, i20, str4);
                                }
                                i21 = i12 + 2;
                                if (i21 <= str4.length()) {
                                    throw xp.b(iB, "truncated format specifier", str4);
                                }
                                fk2Var = (fk2) fk2.b.get(Character.valueOf(str4.charAt(i20)));
                                if (fk2Var != null) {
                                    throw xp.b(i20, "illegal date/time conversion", str4);
                                }
                                gk2Var = new gk2(jr3Var, i2, fk2Var);
                                i20 = i21;
                            }
                            i22 = gk2Var.b;
                            if (i22 < 32) {
                                o50Var.b |= 1 << i22;
                            }
                            o50Var.c = Math.max(o50Var.c, i22);
                            kk2.a(o50Var.d, iB, str4, sb2);
                            objArr3 = (Object[]) o50Var.f;
                            i23 = gk2Var.b;
                            if (i23 < objArr3.length) {
                                obj = objArr3[i23];
                                if (obj != null) {
                                    gk2Var.I(o50Var, obj);
                                } else {
                                    sb2.append("null");
                                }
                            } else {
                                sb2.append("[ERROR: MISSING LOG ARGUMENT]");
                            }
                            o50Var.d = i20;
                            iB = kk2.b(i20, str4);
                            wr3Var = ij2Var2;
                            level4 = level3;
                            str2 = str5;
                            str3 = str6;
                        }
                    } else {
                        ij2Var = wr3Var;
                        level2 = level4;
                        if (mj2Var == null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!z) {
                            uq1.q("cannot get literal argument if a template context exists");
                            return;
                        }
                        objArr = qp3Var.g;
                        if (objArr == null) {
                            uq1.q("cannot get literal argument before calling log()");
                            return;
                        }
                        sb.append(mr3.a(objArr[0]));
                    }
                    int i28 = lj2.a;
                    lr3Var = new lr3(sb);
                    ij2Var.a(ud2Var, lr3Var);
                    if (lr3Var.b) {
                        sb.append(" ]");
                    }
                } else {
                    mj2Var = qp3Var.f;
                    if (mj2Var != null) {
                        if (mj2Var != null) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        str2 = "cannot get arguments unless a template context exists";
                        if (!z2) {
                            uq1.q("cannot get arguments unless a template context exists");
                            return;
                        }
                        objArr2 = qp3Var.g;
                        str3 = "cannot get arguments before calling log()";
                        if (objArr2 == null) {
                            uq1.q("cannot get arguments before calling log()");
                            return;
                        }
                        o50Var = new o50(mj2Var, objArr2, sb);
                        sb2 = (StringBuilder) o50Var.g;
                        mj2 mj2Var3 = (mj2) o50Var.e;
                        jk2 jk2Var2 = mj2Var3.a;
                        str4 = mj2Var3.b;
                        jk2Var2.getClass();
                        iB = kk2.b(0, str4);
                        i2 = -1;
                        i3 = 0;
                        while (true) {
                            i4 = 3;
                            if (iB < 0) {
                                ij2Var = wr3Var;
                                level2 = level4;
                                String str9 = str2;
                                String str10 = str3;
                                i5 = o50Var.b;
                                if (((i5 + 1) & i5) == 0) {
                                }
                                throw new xp(String.format("unreferenced arguments [first missing index=%d]", Integer.valueOf(Integer.numberOfTrailingZeros(~i5))), 8);
                            }
                            i6 = iB + 1;
                            i7 = i6;
                            i8 = 0;
                            while (true) {
                                if (i7 >= str4.length()) {
                                    throw new xp(xp.c("unterminated parameter", iB, -1, str4), 8);
                                }
                                i9 = i7 + 1;
                                level3 = level4;
                                cCharAt = str4.charAt(i7);
                                i10 = i7;
                                c = (char) (cCharAt - '0');
                                str5 = str2;
                                if (c < '\n') {
                                    i27 = (i8 * 10) + c;
                                    if (i27 >= 1000000) {
                                        throw xp.a("index too large", iB, i9, str4);
                                    }
                                    i8 = i27;
                                    i7 = i9;
                                    level4 = level3;
                                    str2 = str5;
                                }
                            }
                            if (cCharAt != '$') {
                                i11 = -1;
                                if (cCharAt != '<') {
                                    i2 = i3;
                                    i3++;
                                } else {
                                    if (i2 == -1) {
                                        throw xp.a("invalid relative parameter", iB, i9, str4);
                                    }
                                    if (i9 == str4.length()) {
                                        throw new xp(xp.c("unterminated parameter", iB, -1, str4), 8);
                                    }
                                    str4.charAt(i9);
                                    i6 = i9;
                                    i9 = i10 + 2;
                                }
                            } else {
                                if (i10 - i6 == 0) {
                                    throw xp.a("missing index", iB, i9, str4);
                                }
                                if (str4.charAt(i6) == '0') {
                                    throw xp.a("index has leading zero", iB, i9, str4);
                                }
                                i26 = i8 - 1;
                                if (i9 == str4.length()) {
                                    throw new xp(xp.c("unterminated parameter", iB, -1, str4), 8);
                                }
                                str4.charAt(i9);
                                i6 = i9;
                                i2 = i26;
                                i9 = i10 + 2;
                                i11 = -1;
                            }
                            i12 = i9 + i11;
                            while (true) {
                                if (i12 >= str4.length()) {
                                    throw new xp(xp.c("unterminated parameter", iB, -1, str4), 8);
                                }
                                if (((char) ((str4.charAt(i12) & (-33)) - 65)) < 26) {
                                    break;
                                }
                                i12++;
                                str3 = str3;
                                i4 = 3;
                            }
                            cCharAt2 = str4.charAt(i12);
                            i13 = cCharAt2 & ' ';
                            if (i13 == 0) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            jr3 jr3Var4 = jr3.e;
                            if (i6 == i12) {
                                if (true != z3) {
                                    i14 = 0;
                                } else {
                                    i14 = 128;
                                }
                                while (true) {
                                    if (i6 != i12) {
                                        ij2Var2 = wr3Var;
                                        i15 = i13;
                                        jr3Var = new jr3(i14, -1, -1);
                                        str6 = str3;
                                    } else {
                                        i16 = i6 + 1;
                                        i15 = i13;
                                        cCharAt3 = str4.charAt(i6);
                                        str6 = str3;
                                        if (cCharAt3 >= ' ') {
                                        }
                                        ij2Var2 = wr3Var;
                                        if (cCharAt3 > '9') {
                                            throw xp.b(i6, "invalid flag", str4);
                                        }
                                        i17 = cCharAt3 - '0';
                                        while (true) {
                                            if (i16 == i12) {
                                                jr3Var2 = new jr3(i14, i17, -1);
                                                jr3Var = jr3Var2;
                                                break;
                                            }
                                            i18 = i16 + 1;
                                            cCharAt4 = str4.charAt(i16);
                                            if (cCharAt4 == '.') {
                                                jr3Var = new jr3(i14, i17, jr3.e(i18, i12, str4));
                                                break;
                                            }
                                            c2 = (char) (cCharAt4 - '0');
                                            if (c2 >= '\n') {
                                                throw xp.b(i16, "invalid width character", str4);
                                            }
                                            i17 = (i17 * 10) + c2;
                                            if (i17 > 999999) {
                                                throw xp.a("width too large", i6, i12, str4);
                                            }
                                            i16 = i18;
                                            i4 = 3;
                                        }
                                    }
                                    i14 |= i19;
                                    i6 = i16;
                                    wr3Var = ij2Var2;
                                    i13 = i15;
                                    str3 = str6;
                                }
                            } else {
                                if (true != z3) {
                                    i14 = 0;
                                } else {
                                    i14 = 128;
                                }
                                while (true) {
                                    if (i6 != i12) {
                                        ij2Var2 = wr3Var;
                                        i15 = i13;
                                        jr3Var = new jr3(i14, -1, -1);
                                        str6 = str3;
                                    } else {
                                        i16 = i6 + 1;
                                        i15 = i13;
                                        cCharAt3 = str4.charAt(i6);
                                        str6 = str3;
                                        if (cCharAt3 >= ' ') {
                                        }
                                        ij2Var2 = wr3Var;
                                        if (cCharAt3 > '9') {
                                            throw xp.b(i6, "invalid flag", str4);
                                        }
                                        i17 = cCharAt3 - '0';
                                        while (true) {
                                            if (i16 == i12) {
                                                jr3Var2 = new jr3(i14, i17, -1);
                                                jr3Var = jr3Var2;
                                                break;
                                            }
                                            i18 = i16 + 1;
                                            cCharAt4 = str4.charAt(i16);
                                            if (cCharAt4 == '.') {
                                                jr3Var = new jr3(i14, i17, jr3.e(i18, i12, str4));
                                                break;
                                            }
                                            c2 = (char) (cCharAt4 - '0');
                                            if (c2 >= '\n') {
                                                throw xp.b(i16, "invalid width character", str4);
                                            }
                                            i17 = (i17 * 10) + c2;
                                            if (i17 > 999999) {
                                                throw xp.a("width too large", i6, i12, str4);
                                            }
                                            i16 = i18;
                                            i4 = 3;
                                        }
                                    }
                                    i14 |= i19;
                                    i6 = i16;
                                    wr3Var = ij2Var2;
                                    i13 = i15;
                                    str3 = str6;
                                }
                            }
                            fr3Var = fr3.f[(cCharAt2 | ' ') - 97];
                            if (i15 == 0) {
                                fr3Var = null;
                            }
                            i20 = i12 + 1;
                            if (fr3Var != null) {
                                jr3Var.getClass();
                                i24 = fr3Var.c;
                                i25 = fr3Var.b;
                                if (i25 == 1) {
                                    z4 = true;
                                } else {
                                    if (i25 != 2) {
                                    }
                                    z4 = false;
                                }
                                if (jr3Var.b(i24, z4)) {
                                    throw xp.a("invalid format specifier", iB, i20, str4);
                                }
                                if (i2 < 10) {
                                    Map map2 = hk2.e;
                                    if (jr3Var.a()) {
                                        sn[] snVarArr2 = (hk2[]) hk2.e.get(fr3Var);
                                        qt.J(snVarArr2, "default parameter");
                                        gk2Var = snVarArr2[i2];
                                    }
                                }
                                ik2Var = new hk2(i2, fr3Var, jr3Var);
                                gk2Var = ik2Var;
                            } else {
                                if (cCharAt2 != 't') {
                                }
                                if (jr3Var.b(160, false)) {
                                    throw xp.a("invalid format specification", iB, i20, str4);
                                }
                                i21 = i12 + 2;
                                if (i21 <= str4.length()) {
                                    throw xp.b(iB, "truncated format specifier", str4);
                                }
                                fk2Var = (fk2) fk2.b.get(Character.valueOf(str4.charAt(i20)));
                                if (fk2Var != null) {
                                    throw xp.b(i20, "illegal date/time conversion", str4);
                                }
                                gk2Var = new gk2(jr3Var, i2, fk2Var);
                                i20 = i21;
                            }
                            i22 = gk2Var.b;
                            if (i22 < 32) {
                                o50Var.b |= 1 << i22;
                            }
                            o50Var.c = Math.max(o50Var.c, i22);
                            kk2.a(o50Var.d, iB, str4, sb2);
                            objArr3 = (Object[]) o50Var.f;
                            i23 = gk2Var.b;
                            if (i23 < objArr3.length) {
                                obj = objArr3[i23];
                                if (obj != null) {
                                    gk2Var.I(o50Var, obj);
                                } else {
                                    sb2.append("null");
                                }
                            } else {
                                sb2.append("[ERROR: MISSING LOG ARGUMENT]");
                            }
                            o50Var.d = i20;
                            iB = kk2.b(i20, str4);
                            wr3Var = ij2Var2;
                            level4 = level3;
                            str2 = str5;
                            str3 = str6;
                        }
                    } else {
                        ij2Var = wr3Var;
                        level2 = level4;
                        if (mj2Var == null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!z) {
                            uq1.q("cannot get literal argument if a template context exists");
                            return;
                        }
                        objArr = qp3Var.g;
                        if (objArr == null) {
                            uq1.q("cannot get literal argument before calling log()");
                            return;
                        }
                        sb.append(mr3.a(objArr[0]));
                    }
                    int i29 = lj2.a;
                    lr3Var = new lr3(sb);
                    ij2Var.a(ud2Var, lr3Var);
                    if (lr3Var.b) {
                        sb.append(" ]");
                    }
                }
                string = sb.toString();
            } else {
                int i30 = lj2.a;
                if (qp3Var.f == null && wr3Var.b() <= set.size() && set.containsAll(wr3Var.c())) {
                    if (!(qp3Var.f == null)) {
                        uq1.q("cannot get literal argument if a template context exists");
                        return;
                    }
                    Object[] objArr4 = qp3Var.g;
                    if (objArr4 == null) {
                        uq1.q("cannot get literal argument before calling log()");
                        return;
                    } else {
                        string = mr3.a(objArr4[0]);
                        level2 = level4;
                    }
                } else {
                    sb = new StringBuilder();
                    iq3Var = qp3Var.d;
                    if (iq3Var != null) {
                        uq1.q("cannot request log site information prior to postProcess()");
                        return;
                    }
                    if (yv2.Z(2, iq3Var, sb)) {
                        sb.append(" ");
                    }
                    if (z5 || qp3Var.f == null) {
                        mj2Var = qp3Var.f;
                        if (mj2Var != null) {
                            if (mj2Var != null) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            str2 = "cannot get arguments unless a template context exists";
                            if (!z2) {
                                uq1.q("cannot get arguments unless a template context exists");
                                return;
                            }
                            objArr2 = qp3Var.g;
                            str3 = "cannot get arguments before calling log()";
                            if (objArr2 == null) {
                                uq1.q("cannot get arguments before calling log()");
                                return;
                            }
                            o50Var = new o50(mj2Var, objArr2, sb);
                            sb2 = (StringBuilder) o50Var.g;
                            mj2 mj2Var4 = (mj2) o50Var.e;
                            jk2 jk2Var3 = mj2Var4.a;
                            str4 = mj2Var4.b;
                            jk2Var3.getClass();
                            iB = kk2.b(0, str4);
                            i2 = -1;
                            i3 = 0;
                            while (true) {
                                i4 = 3;
                                if (iB < 0) {
                                    ij2Var = wr3Var;
                                    level2 = level4;
                                    String str11 = str2;
                                    String str12 = str3;
                                    i5 = o50Var.b;
                                    if (((i5 + 1) & i5) == 0 || (o50Var.c > 31 && i5 != -1)) {
                                        throw new xp(String.format("unreferenced arguments [first missing index=%d]", Integer.valueOf(Integer.numberOfTrailingZeros(~i5))), 8);
                                    }
                                    kk2.a(o50Var.d, str4.length(), str4, sb2);
                                    if (!(qp3Var.f != null)) {
                                        uq1.q(str11);
                                        return;
                                    }
                                    Object[] objArr5 = qp3Var.g;
                                    if (objArr5 == null) {
                                        uq1.q(str12);
                                        return;
                                    } else {
                                        if (objArr5.length <= o50Var.c + 1) {
                                            break;
                                        }
                                        sb2.append(" [ERROR: UNUSED LOG ARGUMENTS]");
                                        break;
                                    }
                                }
                                i6 = iB + 1;
                                i7 = i6;
                                i8 = 0;
                                while (true) {
                                    if (i7 >= str4.length()) {
                                        throw new xp(xp.c("unterminated parameter", iB, -1, str4), 8);
                                    }
                                    i9 = i7 + 1;
                                    level3 = level4;
                                    cCharAt = str4.charAt(i7);
                                    i10 = i7;
                                    c = (char) (cCharAt - '0');
                                    str5 = str2;
                                    if (c < '\n') {
                                        i27 = (i8 * 10) + c;
                                        if (i27 >= 1000000) {
                                            throw xp.a("index too large", iB, i9, str4);
                                        }
                                        i8 = i27;
                                        i7 = i9;
                                        level4 = level3;
                                        str2 = str5;
                                    }
                                }
                                if (cCharAt != '$') {
                                    i11 = -1;
                                    if (cCharAt != '<') {
                                        i2 = i3;
                                        i3++;
                                    } else {
                                        if (i2 == -1) {
                                            throw xp.a("invalid relative parameter", iB, i9, str4);
                                        }
                                        if (i9 == str4.length()) {
                                            throw new xp(xp.c("unterminated parameter", iB, -1, str4), 8);
                                        }
                                        str4.charAt(i9);
                                        i6 = i9;
                                        i9 = i10 + 2;
                                    }
                                } else {
                                    if (i10 - i6 == 0) {
                                        throw xp.a("missing index", iB, i9, str4);
                                    }
                                    if (str4.charAt(i6) == '0') {
                                        throw xp.a("index has leading zero", iB, i9, str4);
                                    }
                                    i26 = i8 - 1;
                                    if (i9 == str4.length()) {
                                        throw new xp(xp.c("unterminated parameter", iB, -1, str4), 8);
                                    }
                                    str4.charAt(i9);
                                    i6 = i9;
                                    i2 = i26;
                                    i9 = i10 + 2;
                                    i11 = -1;
                                }
                                i12 = i9 + i11;
                                while (true) {
                                    if (i12 >= str4.length()) {
                                        throw new xp(xp.c("unterminated parameter", iB, -1, str4), 8);
                                    }
                                    if (((char) ((str4.charAt(i12) & (-33)) - 65)) < 26) {
                                        break;
                                    }
                                    i12++;
                                    str3 = str3;
                                    i4 = 3;
                                }
                                cCharAt2 = str4.charAt(i12);
                                i13 = cCharAt2 & ' ';
                                if (i13 == 0) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                jr3 jr3Var5 = jr3.e;
                                if (i6 == i12 || z3) {
                                    if (true != z3) {
                                        i14 = 0;
                                    } else {
                                        i14 = 128;
                                    }
                                    while (true) {
                                        if (i6 != i12) {
                                            i16 = i6 + 1;
                                            i15 = i13;
                                            cCharAt3 = str4.charAt(i6);
                                            str6 = str3;
                                            if (cCharAt3 >= ' ' || cCharAt3 > '0') {
                                                ij2Var2 = wr3Var;
                                                if (cCharAt3 > '9') {
                                                    throw xp.b(i6, "invalid flag", str4);
                                                }
                                                i17 = cCharAt3 - '0';
                                                while (true) {
                                                    if (i16 == i12) {
                                                        jr3Var2 = new jr3(i14, i17, -1);
                                                    } else {
                                                        i18 = i16 + 1;
                                                        cCharAt4 = str4.charAt(i16);
                                                        if (cCharAt4 == '.') {
                                                            jr3Var = new jr3(i14, i17, jr3.e(i18, i12, str4));
                                                            break;
                                                        }
                                                        c2 = (char) (cCharAt4 - '0');
                                                        if (c2 >= '\n') {
                                                            throw xp.b(i16, "invalid width character", str4);
                                                        }
                                                        i17 = (i17 * 10) + c2;
                                                        if (i17 > 999999) {
                                                            throw xp.a("width too large", i6, i12, str4);
                                                        }
                                                        i16 = i18;
                                                        i4 = 3;
                                                    }
                                                }
                                            } else {
                                                ij2Var2 = wr3Var;
                                                int i31 = ((int) ((jr3.d >>> ((cCharAt3 - ' ') * 3)) & 7)) - 1;
                                                if (i31 >= 0) {
                                                    i19 = 1 << i31;
                                                    if ((i14 & i19) != 0) {
                                                        throw xp.b(i6, "repeated flag", str4);
                                                    }
                                                    i14 |= i19;
                                                    i6 = i16;
                                                    wr3Var = ij2Var2;
                                                    i13 = i15;
                                                    str3 = str6;
                                                } else {
                                                    if (cCharAt3 != '.') {
                                                        throw xp.b(i6, "invalid flag", str4);
                                                    }
                                                    jr3Var2 = new jr3(i14, -1, jr3.e(i16, i12, str4));
                                                }
                                            }
                                            jr3Var = jr3Var2;
                                            break;
                                        } else {
                                            ij2Var2 = wr3Var;
                                            i15 = i13;
                                            jr3Var = new jr3(i14, -1, -1);
                                        }
                                        fr3Var = fr3.f[(cCharAt2 | ' ') - 97];
                                        if (i15 == 0 && (fr3Var == null || (fr3Var.c & 128) == 0)) {
                                            fr3Var = null;
                                        }
                                        i20 = i12 + 1;
                                        if (fr3Var != null) {
                                            jr3Var.getClass();
                                            i24 = fr3Var.c;
                                            i25 = fr3Var.b;
                                            if (i25 == 1) {
                                                z4 = true;
                                            } else if (i25 != 2 || i25 == i4 || i25 == 4) {
                                                z4 = false;
                                            } else {
                                                if (i25 != 5) {
                                                    throw null;
                                                }
                                                z4 = true;
                                            }
                                            if (jr3Var.b(i24, z4)) {
                                                throw xp.a("invalid format specifier", iB, i20, str4);
                                            }
                                            if (i2 < 10) {
                                                Map map3 = hk2.e;
                                                if (jr3Var.a()) {
                                                    sn[] snVarArr3 = (hk2[]) hk2.e.get(fr3Var);
                                                    qt.J(snVarArr3, "default parameter");
                                                    gk2Var = snVarArr3[i2];
                                                }
                                            }
                                            ik2Var = new hk2(i2, fr3Var, jr3Var);
                                            gk2Var = ik2Var;
                                        } else if (cCharAt2 != 't' || cCharAt2 == 'T') {
                                            if (jr3Var.b(160, false)) {
                                                throw xp.a("invalid format specification", iB, i20, str4);
                                            }
                                            i21 = i12 + 2;
                                            if (i21 <= str4.length()) {
                                                throw xp.b(iB, "truncated format specifier", str4);
                                            }
                                            fk2Var = (fk2) fk2.b.get(Character.valueOf(str4.charAt(i20)));
                                            if (fk2Var != null) {
                                                throw xp.b(i20, "illegal date/time conversion", str4);
                                            }
                                            gk2Var = new gk2(jr3Var, i2, fk2Var);
                                            i20 = i21;
                                        } else {
                                            if (cCharAt2 != 'h' && cCharAt2 != 'H') {
                                                throw xp.a("invalid format specification", iB, i20, str4);
                                            }
                                            if (!jr3Var.b(160, false)) {
                                                throw xp.a("invalid format specification", iB, i20, str4);
                                            }
                                            ik2Var = new ik2(jr3Var, i2);
                                            gk2Var = ik2Var;
                                        }
                                        i22 = gk2Var.b;
                                        if (i22 < 32) {
                                            o50Var.b |= 1 << i22;
                                        }
                                        o50Var.c = Math.max(o50Var.c, i22);
                                        kk2.a(o50Var.d, iB, str4, sb2);
                                        objArr3 = (Object[]) o50Var.f;
                                        i23 = gk2Var.b;
                                        if (i23 < objArr3.length) {
                                            obj = objArr3[i23];
                                            if (obj != null) {
                                                gk2Var.I(o50Var, obj);
                                            } else {
                                                sb2.append("null");
                                            }
                                        } else {
                                            sb2.append("[ERROR: MISSING LOG ARGUMENT]");
                                        }
                                        o50Var.d = i20;
                                        iB = kk2.b(i20, str4);
                                        wr3Var = ij2Var2;
                                        level4 = level3;
                                        str2 = str5;
                                        str3 = str6;
                                    }
                                } else {
                                    jr3Var = jr3.e;
                                    ij2Var2 = wr3Var;
                                    i15 = i13;
                                }
                                str6 = str3;
                                fr3Var = fr3.f[(cCharAt2 | ' ') - 97];
                                if (i15 == 0) {
                                    fr3Var = null;
                                }
                                i20 = i12 + 1;
                                if (fr3Var != null) {
                                    jr3Var.getClass();
                                    i24 = fr3Var.c;
                                    i25 = fr3Var.b;
                                    if (i25 == 1) {
                                        z4 = true;
                                    } else {
                                        if (i25 != 2) {
                                        }
                                        z4 = false;
                                    }
                                    if (jr3Var.b(i24, z4)) {
                                        throw xp.a("invalid format specifier", iB, i20, str4);
                                    }
                                    if (i2 < 10) {
                                        Map map4 = hk2.e;
                                        if (jr3Var.a()) {
                                            sn[] snVarArr4 = (hk2[]) hk2.e.get(fr3Var);
                                            qt.J(snVarArr4, "default parameter");
                                            gk2Var = snVarArr4[i2];
                                        }
                                    }
                                    ik2Var = new hk2(i2, fr3Var, jr3Var);
                                    gk2Var = ik2Var;
                                } else {
                                    if (cCharAt2 != 't') {
                                    }
                                    if (jr3Var.b(160, false)) {
                                        throw xp.a("invalid format specification", iB, i20, str4);
                                    }
                                    i21 = i12 + 2;
                                    if (i21 <= str4.length()) {
                                        throw xp.b(iB, "truncated format specifier", str4);
                                    }
                                    fk2Var = (fk2) fk2.b.get(Character.valueOf(str4.charAt(i20)));
                                    if (fk2Var != null) {
                                        throw xp.b(i20, "illegal date/time conversion", str4);
                                    }
                                    gk2Var = new gk2(jr3Var, i2, fk2Var);
                                    i20 = i21;
                                }
                                i22 = gk2Var.b;
                                if (i22 < 32) {
                                    o50Var.b |= 1 << i22;
                                }
                                o50Var.c = Math.max(o50Var.c, i22);
                                kk2.a(o50Var.d, iB, str4, sb2);
                                objArr3 = (Object[]) o50Var.f;
                                i23 = gk2Var.b;
                                if (i23 < objArr3.length) {
                                    obj = objArr3[i23];
                                    if (obj != null) {
                                        gk2Var.I(o50Var, obj);
                                    } else {
                                        sb2.append("null");
                                    }
                                } else {
                                    sb2.append("[ERROR: MISSING LOG ARGUMENT]");
                                }
                                o50Var.d = i20;
                                iB = kk2.b(i20, str4);
                                wr3Var = ij2Var2;
                                level4 = level3;
                                str2 = str5;
                                str3 = str6;
                            }
                        } else {
                            ij2Var = wr3Var;
                            level2 = level4;
                            if (mj2Var == null) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (!z) {
                                uq1.q("cannot get literal argument if a template context exists");
                                return;
                            }
                            objArr = qp3Var.g;
                            if (objArr == null) {
                                uq1.q("cannot get literal argument before calling log()");
                                return;
                            }
                            sb.append(mr3.a(objArr[0]));
                        }
                        int i210 = lj2.a;
                        lr3Var = new lr3(sb);
                        ij2Var.a(ud2Var, lr3Var);
                        if (lr3Var.b) {
                            sb.append(" ]");
                        }
                    } else {
                        sb.append("(REDACTED) ");
                        sb.append(qp3Var.f.b);
                        level2 = level4;
                    }
                    string = sb.toString();
                }
            }
            Throwable th = (Throwable) qp3Var.c().Q(aq3.a);
            int iF = jw.F(level2);
            if (iF == 2) {
                Log.v(str, string, th);
                return;
            }
            if (iF == 3) {
                Log.d(str, string, th);
                return;
            }
            if (iF == 4) {
                Log.i(str, string, th);
            } else if (iF != 5) {
                Log.e(str, string, th);
            } else {
                Log.w(str, string, th);
            }
        }
    }

    @Override // defpackage.lo2
    public final boolean w(Level level) {
        int iF = jw.F(level);
        return Log.isLoggable(this.b, iF) || Log.isLoggable("all", iF);
    }

    @Override // defpackage.lo2
    public final void y(qp3 qp3Var) {
        F(qp3Var, this.b, this.c, this.d, this.e);
    }
}
