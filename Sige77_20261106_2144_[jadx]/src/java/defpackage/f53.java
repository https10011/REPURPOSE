package defpackage;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.hjq.toast.IToastStrategy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class f53 extends ne3 implements rr2 {
    public final mb W;
    public final q43 X;
    public final ox1 Y;
    public final mb Z;
    public final mb a0;
    public final mb b0;
    public final mb d;
    public final mb e;
    public final mb f;
    public final mb i;
    public final mb v;
    public final mb w;

    public f53(if3 if3Var) {
        super(if3Var);
        this.d = new mb(0);
        this.e = new mb(0);
        this.f = new mb(0);
        this.i = new mb(0);
        this.v = new mb(0);
        this.w = new mb(0);
        this.Z = new mb(0);
        this.a0 = new mb(0);
        this.b0 = new mb(0);
        this.W = new mb(0);
        this.X = new q43(this);
        this.Y = new ox1(this);
    }

    public static final mb O(l23 l23Var) {
        mb mbVar = new mb(0);
        for (a33 a33Var : l23Var.x()) {
            mbVar.put(a33Var.t(), a33Var.u());
        }
        return mbVar;
    }

    public static final n73 P(int i) {
        int i2 = i - 1;
        if (i2 == 1) {
            return n73.AD_STORAGE;
        }
        if (i2 == 2) {
            return n73.ANALYTICS_STORAGE;
        }
        if (i2 == 3) {
            return n73.AD_USER_DATA;
        }
        if (i2 != 4) {
            return null;
        }
        return n73.AD_PERSONALIZATION;
    }

    public final l73 I(String str, n73 n73Var) {
        D();
        K(str);
        x13 x13VarA0 = a0(str);
        if (x13VarA0 != null) {
            for (c13 c13Var : x13VarA0.y()) {
                if (P(c13Var.t()) == n73Var) {
                    int iU = c13Var.u() - 1;
                    if (iU == 1) {
                        return l73.GRANTED;
                    }
                    if (iU != 2) {
                        break;
                    }
                    return l73.DENIED;
                }
            }
        }
        return l73.UNINITIALIZED;
    }

    public final boolean J(String str) {
        D();
        K(str);
        x13 x13VarA0 = a0(str);
        if (x13VarA0 == null) {
            return false;
        }
        for (c13 c13Var : x13VarA0.t()) {
            if (c13Var.t() == 3 && c13Var.v() == 3) {
                return true;
            }
        }
        return false;
    }

    public final void K(String str) {
        F();
        D();
        gu2.l(str);
        mb mbVar = this.w;
        if (mbVar.get(str) == null) {
            bu2 bu2Var = this.b.c;
            if3.T(bu2Var);
            p11 p11VarM0 = bu2Var.M0(str);
            mb mbVar2 = this.b0;
            mb mbVar3 = this.a0;
            mb mbVar4 = this.Z;
            mb mbVar5 = this.d;
            if (p11VarM0 != null) {
                i23 i23Var = (i23) N((byte[]) p11VarM0.b, str).k();
                L(str, i23Var);
                mbVar5.put(str, O((l23) i23Var.g()));
                mbVar.put(str, (l23) i23Var.g());
                M(str, (l23) i23Var.g());
                mbVar4.put(str, ((l23) i23Var.b).E());
                mbVar3.put(str, (String) p11VarM0.c);
                mbVar2.put(str, (String) p11VarM0.d);
                return;
            }
            mbVar5.put(str, null);
            this.f.put(str, null);
            this.e.put(str, null);
            this.i.put(str, null);
            this.v.put(str, null);
            mbVar.put(str, null);
            mbVar4.put(str, null);
            mbVar3.put(str, null);
            mbVar2.put(str, null);
            this.W.put(str, null);
        }
    }

    public final void L(String str, i23 i23Var) {
        ArrayList arrayList;
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        mb mbVar = new mb(0);
        mb mbVar2 = new mb(0);
        mb mbVar3 = new mb(0);
        Iterator it = Collections.unmodifiableList(((l23) i23Var.b).D()).iterator();
        while (it.hasNext()) {
            hashSet.add(((b23) it.next()).t());
        }
        y53 y53Var = (y53) this.a;
        is2 is2Var = y53Var.d;
        c33 c33Var = y53Var.f;
        f13 f13Var = h13.V0;
        if (is2Var.P(null, f13Var)) {
            arrayList2.addAll(Collections.unmodifiableList(((l23) i23Var.b).J()));
        }
        while (i < ((l23) i23Var.b).y()) {
            d23 d23Var = (d23) ((l23) i23Var.b).z(i).k();
            if (d23Var.j().isEmpty()) {
                y53.l(c33Var);
                c33Var.w.a("EventConfig contained null event name");
                arrayList = arrayList2;
            } else {
                String strJ = d23Var.j();
                arrayList = arrayList2;
                String strH = ia.H(d23Var.j(), gu2.g, gu2.l);
                if (!TextUtils.isEmpty(strH)) {
                    d23Var.d();
                    ((g23) d23Var.b).A(strH);
                    i23Var.d();
                    ((l23) i23Var.b).M(i, (g23) d23Var.g());
                }
                if (((g23) d23Var.b).u() && ((g23) d23Var.b).v()) {
                    mbVar.put(strJ, Boolean.TRUE);
                }
                if (((g23) d23Var.b).w() && ((g23) d23Var.b).x()) {
                    mbVar2.put(d23Var.j(), Boolean.TRUE);
                }
                if (((g23) d23Var.b).y()) {
                    if (((g23) d23Var.b).z() < 2 || ((g23) d23Var.b).z() > 65535) {
                        y53.l(c33Var);
                        c33Var.w.c(d23Var.j(), Integer.valueOf(((g23) d23Var.b).z()), "Invalid sampling rate. Event name, sample rate");
                    } else {
                        mbVar3.put(d23Var.j(), Integer.valueOf(((g23) d23Var.b).z()));
                    }
                }
            }
            i++;
            arrayList2 = arrayList;
        }
        ArrayList arrayList3 = arrayList2;
        this.e.put(str, hashSet);
        if (y53Var.d.P(null, f13Var)) {
            this.v.put(str, arrayList3);
        }
        this.f.put(str, mbVar);
        this.i.put(str, mbVar2);
        this.W.put(str, mbVar3);
    }

    public final void M(String str, l23 l23Var) {
        if (l23Var.C() == 0) {
            q43 q43Var = this.X;
            q43Var.getClass();
            str.getClass();
            synchronized (q43Var.c) {
                try {
                    pv2 pv2Var = q43Var.b;
                    pv2Var.getClass();
                    if (((LinkedHashMap) pv2Var.a).remove(str) != null) {
                        q43Var.d--;
                    }
                    Unit unit = Unit.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        y53 y53Var = (y53) this.a;
        c33 c33Var = y53Var.f;
        y53.l(c33Var);
        c33Var.a0.b(Integer.valueOf(l23Var.C()), "EES programs found");
        int i = 0;
        e73 e73Var = (e73) l23Var.B().get(0);
        try {
            aw2 aw2Var = new aw2();
            ((xw) aw2Var.a.d).a.put("internal.remoteConfig", new x43(this, str, 2));
            ((xw) aw2Var.a.d).a.put("internal.appMetadata", new x43(this, str, i));
            ((xw) aw2Var.a.d).a.put("internal.logger", new a20(this, 4));
            aw2Var.b(e73Var);
            this.X.c(str, aw2Var);
            c33 c33Var2 = y53Var.f;
            y53.l(c33Var2);
            c33Var2.a0.c(str, Integer.valueOf(e73Var.u().u()), "EES program loaded for appId, activities");
            for (z63 z63Var : e73Var.u().t()) {
                c33 c33Var3 = y53Var.f;
                y53.l(c33Var3);
                c33Var3.a0.b(z63Var.t(), "EES program activity");
            }
        } catch (ey2 unused) {
            c33 c33Var4 = ((y53) this.a).f;
            y53.l(c33Var4);
            c33Var4.f.b(str, "Failed to load EES program. appId");
        }
    }

    public final l23 N(byte[] bArr, String str) {
        y53 y53Var = (y53) this.a;
        if (bArr == null) {
            return l23.L();
        }
        try {
            l23 l23Var = (l23) ((i23) lf3.p0(l23.K(), bArr)).g();
            c33 c33Var = y53Var.f;
            y53.l(c33Var);
            c33Var.a0.c(l23Var.t() ? Long.valueOf(l23Var.u()) : null, l23Var.v() ? l23Var.w() : null, "Parsed config. version, gmp_app_id");
            return l23Var;
        } catch (RuntimeException e) {
            c33 c33Var2 = y53Var.f;
            y53.l(c33Var2);
            c33Var2.w.c(c33.M(str), e, "Unable to merge remote config. appId");
            return l23.L();
        } catch (xm2 e2) {
            c33 c33Var3 = y53Var.f;
            y53.l(c33Var3);
            c33Var3.w.c(c33.M(str), e2, "Unable to merge remote config. appId");
            return l23.L();
        }
    }

    public final l23 Q(String str) {
        F();
        D();
        gu2.l(str);
        K(str);
        return (l23) this.w.get(str);
    }

    public final String R(String str) {
        D();
        K(str);
        return (String) this.Z.get(str);
    }

    public final void S(String str, String str2, String str3, byte[] bArr) throws Throwable {
        SQLiteDatabase sQLiteDatabase;
        i23 i23Var;
        byte[] bArrA;
        int i;
        int i2;
        boolean z;
        F();
        D();
        gu2.l(str);
        i23 i23Var2 = (i23) N(bArr, str).k();
        L(str, i23Var2);
        M(str, (l23) i23Var2.g());
        l23 l23Var = (l23) i23Var2.g();
        mb mbVar = this.w;
        mbVar.put(str, l23Var);
        this.Z.put(str, ((l23) i23Var2.b).E());
        this.a0.put(str, str2);
        this.b0.put(str, str3);
        this.d.put(str, O((l23) i23Var2.g()));
        if3 if3Var = this.b;
        bu2 bu2Var = if3Var.c;
        if3.T(bu2Var);
        ArrayList arrayList = new ArrayList(Collections.unmodifiableList(((l23) i23Var2.b).A()));
        y53 y53Var = (y53) bu2Var.a;
        int i3 = 0;
        while (i3 < arrayList.size()) {
            j03 j03Var = (j03) ((k03) arrayList.get(i3)).k();
            mb mbVar2 = mbVar;
            if (((k03) j03Var.b).z() != 0) {
                int i4 = 0;
                while (i4 < ((k03) j03Var.b).z()) {
                    l03 l03Var = (l03) ((k03) j03Var.b).A(i4).k();
                    l03 l03Var2 = (l03) l03Var.clone();
                    if3 if3Var2 = if3Var;
                    i23 i23Var3 = i23Var2;
                    String strH = ia.H(((n03) l03Var.b).v(), gu2.g, gu2.l);
                    if (strH != null) {
                        l03Var2.d();
                        ((n03) l03Var2.b).G(strH);
                        z = true;
                    } else {
                        z = false;
                    }
                    int i5 = 0;
                    while (i5 < ((n03) l03Var.b).x()) {
                        q03 q03VarY = ((n03) l03Var.b).y(i5);
                        boolean z2 = z;
                        l03 l03Var3 = l03Var;
                        String strH2 = ia.H(q03VarY.A(), g93.e, g93.f);
                        if (strH2 != null) {
                            o03 o03Var = (o03) q03VarY.k();
                            o03Var.d();
                            ((q03) o03Var.b).C(strH2);
                            q03 q03Var = (q03) o03Var.g();
                            l03Var2.d();
                            ((n03) l03Var2.b).H(i5, q03Var);
                            z = true;
                        } else {
                            z = z2;
                        }
                        i5++;
                        l03Var = l03Var3;
                    }
                    if (z) {
                        j03Var.d();
                        ((k03) j03Var.b).C(i4, (n03) l03Var2.g());
                        arrayList.set(i3, (k03) j03Var.g());
                    }
                    i4++;
                    if3Var = if3Var2;
                    i23Var2 = i23Var3;
                }
            }
            i23 i23Var4 = i23Var2;
            if3 if3Var3 = if3Var;
            if (((k03) j03Var.b).w() != 0) {
                for (int i6 = 0; i6 < ((k03) j03Var.b).w(); i6++) {
                    w03 w03VarX = ((k03) j03Var.b).x(i6);
                    String strH3 = ia.H(w03VarX.v(), r93.i, r93.j);
                    if (strH3 != null) {
                        v03 v03Var = (v03) w03VarX.k();
                        v03Var.d();
                        ((w03) v03Var.b).C(strH3);
                        j03Var.d();
                        ((k03) j03Var.b).B(i6, (w03) v03Var.g());
                        arrayList.set(i3, (k03) j03Var.g());
                    }
                }
            }
            i3++;
            mbVar = mbVar2;
            if3Var = if3Var3;
            i23Var2 = i23Var4;
        }
        i23 i23Var5 = i23Var2;
        mb mbVar3 = mbVar;
        if3 if3Var4 = if3Var;
        bu2Var.F();
        bu2Var.D();
        gu2.l(str);
        SQLiteDatabase sQLiteDatabaseV0 = bu2Var.v0();
        sQLiteDatabaseV0.beginTransaction();
        try {
            bu2Var.F();
            bu2Var.D();
            gu2.l(str);
            SQLiteDatabase sQLiteDatabaseV1 = bu2Var.v0();
            sQLiteDatabaseV1.delete("property_filters", "app_id=?", new String[]{str});
            sQLiteDatabaseV1.delete("event_filters", "app_id=?", new String[]{str});
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                int i8 = i7 + 1;
                k03 k03Var = (k03) arrayList.get(i7);
                bu2Var.F();
                bu2Var.D();
                gu2.l(str);
                gu2.o(k03Var);
                if (k03Var.t()) {
                    int iU = k03Var.u();
                    Iterator it = k03Var.y().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            Iterator it2 = k03Var.v().iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    Iterator it3 = k03Var.y().iterator();
                                    while (true) {
                                        boolean zHasNext = it3.hasNext();
                                        Iterator it4 = it3;
                                        String str4 = "filter_id";
                                        sQLiteDatabase = sQLiteDatabaseV0;
                                        i = size;
                                        String str5 = "app_id";
                                        if (!zHasNext) {
                                            i2 = i8;
                                            Iterator it5 = k03Var.v().iterator();
                                            while (it5.hasNext()) {
                                                w03 w03Var = (w03) it5.next();
                                                bu2Var.F();
                                                bu2Var.D();
                                                gu2.l(str);
                                                gu2.o(w03Var);
                                                if (w03Var.v().isEmpty()) {
                                                    c33 c33Var = y53Var.f;
                                                    y53.l(c33Var);
                                                    c33Var.w.d("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", c33.M(str), Integer.valueOf(iU), String.valueOf(w03Var.t() ? Integer.valueOf(w03Var.u()) : null));
                                                } else {
                                                    byte[] bArrA2 = w03Var.a();
                                                    Iterator it6 = it5;
                                                    ContentValues contentValues = new ContentValues();
                                                    contentValues.put(str5, str);
                                                    String str6 = str5;
                                                    contentValues.put("audience_id", Integer.valueOf(iU));
                                                    contentValues.put(str4, w03Var.t() ? Integer.valueOf(w03Var.u()) : null);
                                                    String str7 = str4;
                                                    contentValues.put("property_name", w03Var.v());
                                                    contentValues.put("session_scoped", w03Var.z() ? Boolean.valueOf(w03Var.A()) : null);
                                                    contentValues.put("data", bArrA2);
                                                    try {
                                                        if (bu2Var.v0().insertWithOnConflict("property_filters", null, contentValues, 5) == -1) {
                                                            c33 c33Var2 = y53Var.f;
                                                            y53.l(c33Var2);
                                                            c33Var2.f.b(c33.M(str), "Failed to insert property filter (got -1). appId");
                                                        } else {
                                                            it5 = it6;
                                                            str5 = str6;
                                                            str4 = str7;
                                                        }
                                                    } catch (SQLiteException e) {
                                                        c33 c33Var3 = y53Var.f;
                                                        y53.l(c33Var3);
                                                        c33Var3.f.c(c33.M(str), e, "Error storing property filter. appId");
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        try {
                                            n03 n03Var = (n03) it4.next();
                                            bu2Var.F();
                                            bu2Var.D();
                                            gu2.l(str);
                                            gu2.o(n03Var);
                                            if (n03Var.v().isEmpty()) {
                                                c33 c33Var4 = y53Var.f;
                                                y53.l(c33Var4);
                                                c33Var4.w.d("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", c33.M(str), Integer.valueOf(iU), String.valueOf(n03Var.t() ? Integer.valueOf(n03Var.u()) : null));
                                                i2 = i8;
                                            } else {
                                                k03 k03Var2 = k03Var;
                                                byte[] bArrA3 = n03Var.a();
                                                i2 = i8;
                                                ContentValues contentValues2 = new ContentValues();
                                                contentValues2.put("app_id", str);
                                                contentValues2.put("audience_id", Integer.valueOf(iU));
                                                contentValues2.put("filter_id", n03Var.t() ? Integer.valueOf(n03Var.u()) : null);
                                                contentValues2.put("event_name", n03Var.v());
                                                contentValues2.put("session_scoped", n03Var.D() ? Boolean.valueOf(n03Var.E()) : null);
                                                contentValues2.put("data", bArrA3);
                                                try {
                                                    if (bu2Var.v0().insertWithOnConflict("event_filters", null, contentValues2, 5) == -1) {
                                                        c33 c33Var5 = y53Var.f;
                                                        y53.l(c33Var5);
                                                        c33Var5.f.b(c33.M(str), "Failed to insert event filter (got -1). appId");
                                                    }
                                                    it3 = it4;
                                                    sQLiteDatabaseV0 = sQLiteDatabase;
                                                    size = i;
                                                    k03Var = k03Var2;
                                                    i8 = i2;
                                                } catch (SQLiteException e2) {
                                                    c33 c33Var6 = y53Var.f;
                                                    y53.l(c33Var6);
                                                    c33Var6.f.c(c33.M(str), e2, "Error storing event filter. appId");
                                                }
                                            }
                                        } catch (Throwable th) {
                                            th = th;
                                            sQLiteDatabase.endTransaction();
                                            throw th;
                                        }
                                        bu2Var.F();
                                        bu2Var.D();
                                        gu2.l(str);
                                        SQLiteDatabase sQLiteDatabaseV2 = bu2Var.v0();
                                        sQLiteDatabaseV2.delete("property_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(iU)});
                                        sQLiteDatabaseV2.delete("event_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(iU)});
                                        break;
                                    }
                                    sQLiteDatabaseV0 = sQLiteDatabase;
                                    size = i;
                                    i7 = i2;
                                    break;
                                }
                                if (!((w03) it2.next()).t()) {
                                    c33 c33Var7 = y53Var.f;
                                    y53.l(c33Var7);
                                    c33Var7.w.c(c33.M(str), Integer.valueOf(iU), "Property filter with no ID. Audience definition ignored. appId, audienceId");
                                }
                            }
                        } else if (!((n03) it.next()).t()) {
                            c33 c33Var8 = y53Var.f;
                            y53.l(c33Var8);
                            c33Var8.w.c(c33.M(str), Integer.valueOf(iU), "Event filter with no ID. Audience definition ignored. appId, audienceId");
                        }
                    }
                } else {
                    c33 c33Var9 = y53Var.f;
                    y53.l(c33Var9);
                    c33Var9.w.b(c33.M(str), "Audience with no ID. appId");
                }
                i7 = i8;
            }
            sQLiteDatabase = sQLiteDatabaseV0;
            ArrayList arrayList2 = new ArrayList();
            int size2 = arrayList.size();
            int i9 = 0;
            while (i9 < size2) {
                Object obj = arrayList.get(i9);
                i9++;
                k03 k03Var3 = (k03) obj;
                arrayList2.add(k03Var3.t() ? Integer.valueOf(k03Var3.u()) : null);
            }
            gu2.l(str);
            bu2Var.F();
            bu2Var.D();
            SQLiteDatabase sQLiteDatabaseV3 = bu2Var.v0();
            try {
                long jA0 = bu2Var.a0("select count(1) from audience_filter_values where app_id=?", new String[]{str});
                int iMax = Math.max(0, Math.min(IToastStrategy.SHORT_DURATION_TIMEOUT, y53Var.d.N(str, h13.U)));
                if (jA0 > iMax) {
                    ArrayList arrayList3 = new ArrayList();
                    int i10 = 0;
                    while (true) {
                        if (i10 >= arrayList2.size()) {
                            String strJoin = TextUtils.join(",", arrayList3);
                            StringBuilder sb = new StringBuilder(String.valueOf(strJoin).length() + 2);
                            sb.append("(");
                            sb.append(strJoin);
                            sb.append(")");
                            String string = sb.toString();
                            StringBuilder sb2 = new StringBuilder(string.length() + 140);
                            sb2.append("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ");
                            sb2.append(string);
                            sb2.append(" order by rowid desc limit -1 offset ?)");
                            sQLiteDatabaseV3.delete("audience_filter_values", sb2.toString(), new String[]{str, Integer.toString(iMax)});
                            break;
                        }
                        Integer num = (Integer) arrayList2.get(i10);
                        if (num == null) {
                            break;
                        }
                        arrayList3.add(Integer.toString(num.intValue()));
                        i10++;
                    }
                }
            } catch (SQLiteException e3) {
                c33 c33Var10 = y53Var.f;
                y53.l(c33Var10);
                c33Var10.f.c(c33.M(str), e3, "Database error querying filters. appId");
            }
            sQLiteDatabase.setTransactionSuccessful();
            sQLiteDatabase.endTransaction();
            try {
                i23Var5.d();
                i23Var = i23Var5;
                try {
                    ((l23) i23Var.b).N();
                    bArrA = ((l23) i23Var.g()).a();
                } catch (RuntimeException e4) {
                    e = e4;
                    c33 c33Var11 = ((y53) this.a).f;
                    y53.l(c33Var11);
                    c33Var11.w.c(c33.M(str), e, "Unable to serialize reduced-size config. Storing full config instead. appId");
                    bArrA = bArr;
                }
            } catch (RuntimeException e5) {
                e = e5;
                i23Var = i23Var5;
            }
            bu2 bu2Var2 = if3Var4.c;
            if3.T(bu2Var2);
            y53 y53Var2 = (y53) bu2Var2.a;
            gu2.l(str);
            bu2Var2.D();
            bu2Var2.F();
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put("remote_config", bArrA);
            contentValues3.put("config_last_modified_time", str2);
            contentValues3.put("e_tag", str3);
            try {
                if (bu2Var2.v0().update("apps", contentValues3, "app_id = ?", new String[]{str}) == 0) {
                    c33 c33Var12 = y53Var2.f;
                    y53.l(c33Var12);
                    c33Var12.f.b(c33.M(str), "Failed to update remote config (got 0). appId");
                }
            } catch (SQLiteException e6) {
                c33 c33Var13 = y53Var2.f;
                y53.l(c33Var13);
                c33Var13.f.c(c33.M(str), e6, "Error storing remote config. appId");
            }
            i23Var.d();
            ((l23) i23Var.b).O();
            mbVar3.put(str, (l23) i23Var.g());
        } catch (Throwable th2) {
            th = th2;
            sQLiteDatabase = sQLiteDatabaseV0;
        }
    }

    public final boolean T(String str, String str2) {
        Boolean bool;
        D();
        K(str);
        if ("1".equals(a(str, "measurement.upload.blacklist_internal")) && qf3.i0(str2)) {
            return true;
        }
        if ("1".equals(a(str, "measurement.upload.blacklist_public")) && qf3.E0(str2)) {
            return true;
        }
        Map map = (Map) this.f.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final boolean U(String str, String str2) {
        Boolean bool;
        D();
        K(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        Map map = (Map) this.i.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final List V(String str) {
        D();
        K(str);
        return (List) this.v.get(str);
    }

    public final int W(String str, String str2) {
        Integer num;
        D();
        K(str);
        Map map = (Map) this.W.get(str);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    public final boolean X(String str) {
        D();
        K(str);
        mb mbVar = this.e;
        if (mbVar.get(str) != null) {
            return ((Set) mbVar.get(str)).contains("os_version") || ((Set) mbVar.get(str)).contains("device_info");
        }
        return false;
    }

    public final boolean Y(String str) {
        D();
        K(str);
        mb mbVar = this.e;
        return mbVar.get(str) != null && ((Set) mbVar.get(str)).contains("app_instance_id");
    }

    public final boolean Z(String str, n73 n73Var) {
        D();
        K(str);
        x13 x13VarA0 = a0(str);
        if (x13VarA0 == null) {
            return false;
        }
        for (c13 c13Var : x13VarA0.t()) {
            if (n73Var == P(c13Var.t())) {
                return c13Var.u() == 2;
            }
        }
        return false;
    }

    @Override // defpackage.rr2
    public final String a(String str, String str2) {
        D();
        K(str);
        Map map = (Map) this.d.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    public final x13 a0(String str) {
        D();
        K(str);
        l23 l23VarQ = Q(str);
        if (l23VarQ == null || !l23VarQ.F()) {
            return null;
        }
        return l23VarQ.G();
    }

    @Override // defpackage.ne3
    public final void H() {
    }
}
