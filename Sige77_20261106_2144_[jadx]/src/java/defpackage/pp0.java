package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class pp0 {
    public static String d;
    public static final pp0 a = new pp0();
    public static final ConcurrentHashMap b = new ConcurrentHashMap();
    public static final ConcurrentHashMap c = new ConcurrentHashMap();
    public static final AtomicBoolean e = new AtomicBoolean(false);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v42 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [android.os.BaseBundle] */
    /* JADX WARN: Type inference failed for: r8v5, types: [android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r8v6, types: [android.os.BaseBundle] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    public static final synchronized Bundle c(List list, long j, boolean z, List list2) {
        Bundle bundle;
        Bundle bundle2;
        ?? r11;
        boolean z2;
        Bundle bundle3;
        ?? r7;
        ?? r0;
        Object obj;
        long jLongValue;
        Bundle bundle4 = null;
        bundle4 = null;
        if (mt.a.contains(pp0.class)) {
            return null;
        }
        try {
            list.getClass();
            list2.getClass();
            if (list2.isEmpty()) {
                return null;
            }
            if (list.size() != list2.size()) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int size = list.size();
            ?? bundle5 = 0;
            int i = 0;
            while (i < size) {
                ap0 ap0Var = (ap0) list.get(i);
                Pair pair = (Pair) list2.get(i);
                Bundle bundle6 = (Bundle) pair.a;
                v91 v91Var = (v91) pair.b;
                int i2 = i;
                ap0 ap0Var2 = new ap0(ap0Var.a, new BigDecimal(String.valueOf(ap0Var.b)).setScale(2, RoundingMode.HALF_UP).doubleValue(), ap0Var.c);
                List<Pair> list3 = z ? (List) b.get(ap0Var2) : (List) c.get(ap0Var2);
                List list4 = list3;
                if (list4 == null || list4.isEmpty()) {
                    Bundle bundle7 = bundle4;
                    Bundle bundle8 = bundle7;
                    Bundle bundle9 = bundle8;
                    r11 = bundle9;
                    z2 = false;
                    r0 = bundle8;
                    r7 = bundle9;
                    bundle3 = bundle7;
                } else {
                    Bundle bundle10 = bundle4;
                    Bundle bundle11 = bundle10;
                    ?? ValueOf = bundle11;
                    z2 = false;
                    Object objB = bundle10;
                    Bundle bundle12 = bundle4;
                    Object obj2 = bundle11;
                    for (Pair pair2 : list3) {
                        long jLongValue2 = ((Number) pair2.a).longValue();
                        Pair pair3 = (Pair) pair2.b;
                        Bundle bundle13 = (Bundle) pair3.a;
                        v91 v91Var2 = (v91) pair3.b;
                        long jAbs = Math.abs(j - jLongValue2);
                        List list5 = mp0.a;
                        ja0 ja0VarB = ma0.b(i90.b());
                        if (ja0VarB != null) {
                            bundle2 = bundle12;
                            try {
                                obj = ja0VarB.x;
                                bundle2 = bundle2;
                            } catch (Throwable th) {
                                th = th;
                                bundle = bundle2;
                            }
                        } else {
                            bundle2 = bundle12;
                        }
                        if (obj != null) {
                            obj = bundle12;
                            Long l = ja0VarB.x;
                            if (l != null && l.longValue() == 0) {
                                obj = bundle12;
                                jLongValue = mp0.c;
                            } else {
                                jLongValue = ja0VarB.x.longValue();
                            }
                        } else {
                            obj = bundle12;
                            jLongValue = mp0.c;
                        }
                        if (jAbs <= jLongValue && (ValueOf == 0 || jLongValue2 < ValueOf.longValue())) {
                            pp0 pp0Var = a;
                            boolean z3 = !z;
                            if (mt.a.contains(pp0.class)) {
                                objB = bundle2;
                            } else {
                                try {
                                    objB = pp0Var.b(bundle6, v91Var, bundle13, v91Var2, z3, false);
                                } catch (Throwable th2) {
                                    mt.a(pp0.class, th2);
                                    objB = bundle2;
                                }
                            }
                            String strB = a.b(bundle6, v91Var, bundle13, v91Var2, z3, true);
                            obj2 = obj2;
                            if (strB != null) {
                                obj2 = strB;
                            }
                            if (objB != null) {
                                ValueOf = Long.valueOf(jLongValue2);
                                arrayList.add(new Pair(ap0Var2, Long.valueOf(jLongValue2)));
                                z2 = true;
                            }
                        }
                        bundle12 = bundle2;
                        objB = objB;
                        obj2 = obj2;
                        ValueOf = ValueOf;
                    }
                    bundle3 = bundle12;
                    r0 = objB;
                    r7 = obj2;
                    r11 = ValueOf;
                }
                if (r7 != 0) {
                    if (bundle5 == 0) {
                        bundle5 = new Bundle();
                    }
                    bundle5.putString("fb_iap_test_dedup_result", "1");
                    bundle5.putString("fb_iap_test_dedup_key_used", r7);
                }
                if (z2) {
                    if (bundle5 == 0) {
                        bundle5 = new Bundle();
                    }
                    bundle5.putString("fb_iap_non_deduped_event_time", String.valueOf(r11 != 0 ? r11.longValue() / 1000 : 0L));
                    bundle5.putString("fb_iap_actual_dedup_result", "1");
                    bundle5.putString("fb_iap_actual_dedup_key_used", r0);
                }
                if (z && !z2) {
                    ConcurrentHashMap concurrentHashMap = c;
                    if (concurrentHashMap.get(ap0Var2) == null) {
                        concurrentHashMap.put(ap0Var2, new ArrayList());
                    }
                    List list6 = (List) concurrentHashMap.get(ap0Var2);
                    if (list6 != null) {
                        list6.add(new Pair(Long.valueOf(j), new Pair(bundle6, v91Var)));
                    }
                } else if (!z && !z2) {
                    ConcurrentHashMap concurrentHashMap2 = b;
                    if (concurrentHashMap2.get(ap0Var2) == null) {
                        concurrentHashMap2.put(ap0Var2, new ArrayList());
                    }
                    List list7 = (List) concurrentHashMap2.get(ap0Var2);
                    if (list7 != null) {
                        list7.add(new Pair(Long.valueOf(j), new Pair(bundle6, v91Var)));
                    }
                }
                i = i2 + 1;
                bundle4 = bundle3;
                bundle5 = bundle5;
            }
            bundle2 = bundle4;
            int size2 = arrayList.size();
            int i3 = 0;
            while (i3 < size2) {
                Object obj3 = arrayList.get(i3);
                i3++;
                Pair pair4 = (Pair) obj3;
                List list8 = z ? (List) b.get(pair4.a) : (List) c.get(pair4.a);
                if (list8 != null) {
                    Iterator it = list8.iterator();
                    int i4 = 0;
                    while (it.hasNext()) {
                        int i5 = i4 + 1;
                        if (((Number) ((Pair) it.next()).a).longValue() == ((Number) pair4.b).longValue()) {
                            list8.remove(i4);
                            break;
                        }
                        i4 = i5;
                    }
                    if (z) {
                        if (list8.isEmpty()) {
                            b.remove(pair4.a);
                        } else {
                            b.put(pair4.a, list8);
                        }
                    } else if (list8.isEmpty()) {
                        c.remove(pair4.a);
                    } else {
                        c.put(pair4.a, list8);
                    }
                }
            }
            return bundle5;
        } catch (Throwable th3) {
            th = th3;
            bundle = bundle4;
        }
        mt.a(pp0.class, th);
        return bundle;
    }

    public static final void d() {
        if (mt.a.contains(pp0.class)) {
            return;
        }
        try {
            if (e.get()) {
                int iA = a.a();
                int iV = ts.v(iA);
                if (iV == 1) {
                    cp0.b(2);
                    return;
                }
                if (iV != 2) {
                    if (iV == 3 && fa0.b(da0.IapLoggingLib5To7)) {
                        ep0.b(i90.a(), iA);
                        return;
                    }
                    return;
                }
                if (fa0.b(da0.IapLoggingLib2)) {
                    ep0.b(i90.a(), iA);
                } else {
                    cp0.b(3);
                }
            }
        } catch (Throwable th) {
            mt.a(pp0.class, th);
        }
    }

    public final int a() {
        Set set = mt.a;
        if (set.contains(this)) {
            return 0;
        }
        try {
            Context contextA = i90.a();
            ApplicationInfo applicationInfo = contextA.getPackageManager().getApplicationInfo(contextA.getPackageName(), 128);
            applicationInfo.getClass();
            String string = applicationInfo.metaData.getString("com.google.android.play.billingclient.version");
            if (string == null) {
                return 1;
            }
            List listB = StringsKt.B(string, new String[]{"."}, 3, 2);
            if (string.length() != 0) {
                String strConcat = "GPBL.".concat(string);
                if (!set.contains(pp0.class)) {
                    try {
                        d = strConcat;
                    } catch (Throwable th) {
                        mt.a(pp0.class, th);
                    }
                }
                Integer intOrNull = StringsKt.toIntOrNull((String) listB.get(0));
                if (intOrNull != null) {
                    int iIntValue = intOrNull.intValue();
                    if (iIntValue == 1) {
                        return 2;
                    }
                    return iIntValue < 5 ? 3 : 4;
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th2) {
            mt.a(this, th2);
            return 0;
        }
        return 4;
    }

    public final String b(Bundle bundle, v91 v91Var, Bundle bundle2, v91 v91Var2, boolean z, boolean z2) {
        if (!mt.a.contains(this)) {
            try {
                List<Pair> listC = z2 ? mp0.c(z) : mp0.b(z);
                if (listC != null) {
                    for (Pair pair : listC) {
                        Map map = v91.b;
                        Object objN = zi0.n((String) pair.a, bundle, v91Var);
                        String str = objN instanceof String ? (String) objN : null;
                        if (str != null && str.length() != 0) {
                            for (String str2 : (List) pair.b) {
                                Map map2 = v91.b;
                                Object objN2 = zi0.n(str2, bundle2, v91Var2);
                                String str3 = objN2 instanceof String ? (String) objN2 : null;
                                if (str3 != null && str3.length() != 0 && Intrinsics.areEqual(str3, str)) {
                                    return z ? (String) pair.a : str2;
                                }
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                mt.a(this, th);
                return null;
            }
        }
        return null;
    }
}
