package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import com.hjq.toast.BuildConfig;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class ue2 {
    public static final ue2 j = new ue2();
    public Context a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;

    public Boolean a() {
        boolean z;
        if (((Boolean) this.e) == null) {
            Object objA = r93.a(this.a, "com.openinstall.PB_ENABLED");
            if (objA != null) {
                try {
                    z = Boolean.parseBoolean(String.valueOf(objA));
                } catch (Exception unused) {
                    z = true;
                }
            } else {
                z = true;
            }
            this.e = Boolean.valueOf(z);
        }
        return (Boolean) this.e;
    }

    public void b(ge geVar, int i) {
        byte[] bArr;
        long j2;
        jd jdVar;
        String str;
        jd jdVar2;
        int i2;
        bl blVarD;
        String str2;
        Integer numValueOf;
        qq qqVar;
        final ue2 ue2Var = this;
        final ge geVar2 = geVar;
        byte[] bArr2 = geVar2.b;
        bl1 bl1Var = (bl1) ue2Var.f;
        c02 c02VarA = ((q41) ue2Var.b).a(geVar2.a);
        long jMax = 0;
        while (true) {
            final int i3 = 0;
            if (!((Boolean) bl1Var.l(new tv1(ue2Var) { // from class: o32
                public final /* synthetic */ ue2 b;

                {
                    this.b = ue2Var;
                }

                @Override // defpackage.tv1
                public final Object a() {
                    Boolean bool;
                    int i4 = i3;
                    ge geVar3 = geVar2;
                    ue2 ue2Var2 = this.b;
                    switch (i4) {
                        case 0:
                            bl1 bl1Var2 = (bl1) ue2Var2.c;
                            SQLiteDatabase sQLiteDatabaseA = bl1Var2.a();
                            sQLiteDatabaseA.beginTransaction();
                            try {
                                Long lB = bl1.b(sQLiteDatabaseA, geVar3);
                                if (lB == null) {
                                    bool = Boolean.FALSE;
                                } else {
                                    Cursor cursorRawQuery = bl1Var2.a().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lB.toString()});
                                    try {
                                        Boolean boolValueOf = Boolean.valueOf(cursorRawQuery.moveToNext());
                                        cursorRawQuery.close();
                                        bool = boolValueOf;
                                    } catch (Throwable th) {
                                        cursorRawQuery.close();
                                        throw th;
                                    }
                                }
                                sQLiteDatabaseA.setTransactionSuccessful();
                                sQLiteDatabaseA.endTransaction();
                                return bool;
                            } catch (Throwable th2) {
                                sQLiteDatabaseA.endTransaction();
                                throw th2;
                            }
                        default:
                            bl1 bl1Var3 = (bl1) ue2Var2.c;
                            bl1Var3.getClass();
                            return (Iterable) bl1Var3.e(new eg(13, bl1Var3, geVar3));
                    }
                }
            })).booleanValue()) {
                bl1Var.l(new xk1(ue2Var, jMax, geVar2));
                return;
            }
            final int i4 = 1;
            Iterable iterable = (Iterable) bl1Var.l(new tv1(ue2Var) { // from class: o32
                public final /* synthetic */ ue2 b;

                {
                    this.b = ue2Var;
                }

                @Override // defpackage.tv1
                public final Object a() {
                    Boolean bool;
                    int i5 = i4;
                    ge geVar3 = geVar2;
                    ue2 ue2Var2 = this.b;
                    switch (i5) {
                        case 0:
                            bl1 bl1Var2 = (bl1) ue2Var2.c;
                            SQLiteDatabase sQLiteDatabaseA = bl1Var2.a();
                            sQLiteDatabaseA.beginTransaction();
                            try {
                                Long lB = bl1.b(sQLiteDatabaseA, geVar3);
                                if (lB == null) {
                                    bool = Boolean.FALSE;
                                } else {
                                    Cursor cursorRawQuery = bl1Var2.a().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lB.toString()});
                                    try {
                                        Boolean boolValueOf = Boolean.valueOf(cursorRawQuery.moveToNext());
                                        cursorRawQuery.close();
                                        bool = boolValueOf;
                                    } catch (Throwable th) {
                                        cursorRawQuery.close();
                                        throw th;
                                    }
                                }
                                sQLiteDatabaseA.setTransactionSuccessful();
                                sQLiteDatabaseA.endTransaction();
                                return bool;
                            } catch (Throwable th2) {
                                sQLiteDatabaseA.endTransaction();
                                throw th2;
                            }
                        default:
                            bl1 bl1Var3 = (bl1) ue2Var2.c;
                            bl1Var3.getClass();
                            return (Iterable) bl1Var3.e(new eg(13, bl1Var3, geVar3));
                    }
                }
            });
            if (!iterable.iterator().hasNext()) {
                return;
            }
            if (c02VarA == null) {
                d42.g("Uploader", "Unknown backend for %s, deleting event batch for it...", geVar2);
                jdVar2 = new jd(3, -1L);
                bArr = bArr2;
                j2 = jMax;
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((yd) it.next()).c);
                }
                if (bArr2 != null) {
                    bl1 bl1Var2 = (bl1) ue2Var.i;
                    Objects.requireNonNull(bl1Var2);
                    gn gnVar = (gn) bl1Var.l(new m32(bl1Var2, i3));
                    qp0 qp0Var = new qp0();
                    qp0Var.f = new HashMap();
                    qp0Var.d = Long.valueOf(((hn) ue2Var.g).b());
                    qp0Var.e = Long.valueOf(((hn) ue2Var.h).b());
                    qp0Var.a = "GDT_CLIENT_METRICS";
                    k60 k60Var = new k60("proto");
                    gnVar.getClass();
                    p11 p11Var = pd1.a;
                    p11Var.getClass();
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        p11Var.b(gnVar, byteArrayOutputStream);
                    } catch (IOException unused) {
                    }
                    qp0Var.c = new d60(k60Var, byteArrayOutputStream.toByteArray());
                    arrayList.add(((cl) c02VarA).a(qp0Var.c()));
                }
                cl clVar = (cl) c02VarA;
                HashMap map = new HashMap();
                int size = arrayList.size();
                int i5 = 0;
                while (i5 < size) {
                    Object obj = arrayList.get(i5);
                    i5++;
                    od odVar = (od) obj;
                    String str3 = odVar.a;
                    if (map.containsKey(str3)) {
                        ((List) map.get(str3)).add(odVar);
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(odVar);
                        map.put(str3, arrayList2);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                for (Map.Entry entry : map.entrySet()) {
                    od odVar2 = (od) ((List) entry.getValue()).get(0);
                    he1 he1Var = he1.a;
                    long jB = clVar.f.b();
                    long jB2 = clVar.e.b();
                    ld ldVar = new ld(new id(Integer.valueOf(odVar2.b("sdk-version")), odVar2.a("model"), odVar2.a("hardware"), odVar2.a("device"), odVar2.a("product"), odVar2.a("os-uild"), odVar2.a("manufacturer"), odVar2.a("fingerprint"), odVar2.a("locale"), odVar2.a("country"), odVar2.a("mcc_mnc"), odVar2.a("application_build")));
                    try {
                        numValueOf = Integer.valueOf(Integer.parseInt((String) entry.getKey()));
                        str2 = null;
                    } catch (NumberFormatException unused2) {
                        str2 = (String) entry.getKey();
                        numValueOf = null;
                    }
                    ArrayList arrayList4 = new ArrayList();
                    for (od odVar3 : (List) entry.getValue()) {
                        byte[] bArr3 = bArr2;
                        d60 d60Var = odVar3.c;
                        k60 k60Var2 = d60Var.a;
                        byte[] bArr4 = d60Var.b;
                        long j3 = jMax;
                        if (k60Var2.equals(new k60("proto"))) {
                            qqVar = new qq();
                            qqVar.d = bArr4;
                        } else {
                            if (k60Var2.equals(new k60("json"))) {
                                String str4 = new String(bArr4, Charset.forName("UTF-8"));
                                qq qqVar2 = new qq();
                                qqVar2.e = str4;
                                qqVar = qqVar2;
                            } else {
                                String strS = d42.s("CctTransportBackend");
                                if (Log.isLoggable(strS, 5)) {
                                    Log.w(strS, "Received event of unsupported encoding " + k60Var2 + ". Skipping...");
                                }
                            }
                            bArr2 = bArr3;
                            jMax = j3;
                        }
                        qqVar.a = Long.valueOf(odVar3.d);
                        qqVar.c = Long.valueOf(odVar3.e);
                        String str5 = (String) odVar3.f.get("tz-offset");
                        qqVar.f = Long.valueOf(str5 == null ? 0L : Long.valueOf(str5).longValue());
                        qqVar.i = new xd((x61) x61.a.get(odVar3.b("net-type")), (w61) w61.a.get(odVar3.b("mobile-subtype")));
                        Integer num = odVar3.b;
                        if (num != null) {
                            qqVar.b = num;
                        }
                        String strConcat = ((Long) qqVar.a) == null ? " eventTimeMs" : BuildConfig.FLAVOR;
                        if (((Long) qqVar.c) == null) {
                            strConcat = strConcat.concat(" eventUptimeMs");
                        }
                        if (((Long) qqVar.f) == null) {
                            strConcat = strConcat.concat(" timezoneOffsetSeconds");
                        }
                        if (!strConcat.isEmpty()) {
                            uq1.q("Missing required properties:".concat(strConcat));
                            return;
                        } else {
                            arrayList4.add(new ud(((Long) qqVar.a).longValue(), (Integer) qqVar.b, ((Long) qqVar.c).longValue(), (byte[]) qqVar.d, (String) qqVar.e, ((Long) qqVar.f).longValue(), (xd) qqVar.i));
                            bArr2 = bArr3;
                            jMax = j3;
                        }
                    }
                    arrayList3.add(new vd(jB, jB2, ldVar, numValueOf, str2, arrayList4));
                    bArr2 = bArr2;
                }
                bArr = bArr2;
                j2 = jMax;
                kd kdVar = new kd(arrayList3);
                URL urlB = clVar.d;
                if (bArr != null) {
                    try {
                        sj sjVarA = sj.a(bArr);
                        str = sjVarA.b;
                        if (str == null) {
                            str = null;
                        }
                        urlB = cl.b(sjVarA.a);
                    } catch (IllegalArgumentException unused3) {
                        jdVar = new jd(3, -1L);
                    }
                } else {
                    str = null;
                }
                try {
                    int i6 = 10;
                    ac2 ac2Var = new ac2(urlB, kdVar, str, i6);
                    ab abVar = new ab(clVar, 2);
                    int i7 = 5;
                    do {
                        blVarD = abVar.d(ac2Var);
                        URL url = (URL) blVarD.c;
                        if (url != null) {
                            d42.g("CctTransportBackend", "Following redirect to: %s", url);
                            ac2Var = new ac2(url, (kd) ac2Var.c, (String) ac2Var.d, i6);
                        } else {
                            ac2Var = null;
                        }
                        if (ac2Var == null) {
                            break;
                        } else {
                            i7--;
                        }
                    } while (i7 >= 1);
                    int i8 = blVarD.b;
                    if (i8 == 200) {
                        jdVar2 = new jd(1, blVarD.a);
                    } else {
                        if (i8 >= 500 || i8 == 404) {
                            jdVar = new jd(2, -1L);
                        } else if (i8 == 400) {
                            try {
                                jdVar = new jd(4, -1L);
                            } catch (IOException e) {
                                e = e;
                                d42.h(e, "CctTransportBackend", "Could not make request to the backend");
                                i2 = 2;
                                jdVar2 = new jd(2, -1L);
                            }
                        } else {
                            jdVar = new jd(3, -1L);
                        }
                        jdVar2 = jdVar;
                    }
                } catch (IOException e2) {
                    e = e2;
                }
            }
            i2 = 2;
            int i9 = jdVar2.a;
            if (i9 == i2) {
                bl1Var.l(new i00(this, iterable, geVar, j2));
                ((ac2) this.d).N(geVar, i + 1, true);
                return;
            }
            ue2Var = this;
            geVar2 = geVar;
            jMax = j2;
            bl1Var.l(new eg(14, ue2Var, iterable));
            if (i9 == 1) {
                jMax = Math.max(jMax, jdVar2.b);
                if (bArr != null) {
                    bl1Var.l(new ab(ue2Var, 19));
                }
            } else if (i9 == 4) {
                HashMap map2 = new HashMap();
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    String str6 = ((yd) it2.next()).c.a;
                    if (map2.containsKey(str6)) {
                        map2.put(str6, Integer.valueOf(((Integer) map2.get(str6)).intValue() + 1));
                    } else {
                        map2.put(str6, 1);
                    }
                }
                bl1Var.l(new eg(15, ue2Var, map2));
            }
            bArr2 = bArr;
        }
    }
}
