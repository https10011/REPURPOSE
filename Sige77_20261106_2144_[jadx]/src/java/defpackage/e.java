package defpackage;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final /* synthetic */ class e implements ca0, v71 {
    public final /* synthetic */ int a;

    public /* synthetic */ e(int i) {
        this.a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void a(int i, int i2, String str) {
        throw new IllegalArgumentException((str + i + ((char) i2)).toString());
    }

    public static /* synthetic */ void b(Object obj) {
        throw new AssertionError(obj);
    }

    public static /* synthetic */ void c(String str) {
        throw new IndexOutOfBoundsException(str);
    }

    public static /* synthetic */ void d(Object obj) {
        throw new IllegalArgumentException(obj.toString());
    }

    public static /* synthetic */ void g(String str) {
        throw new IllegalArgumentException(str);
    }

    @Override // defpackage.v71
    public Object e() {
        switch (this.a) {
            case 23:
                return new ArrayList();
            case 24:
                return new ConcurrentHashMap();
            case 25:
                return new ConcurrentSkipListMap();
            case 26:
                return new LinkedHashSet();
            case 27:
                return new TreeSet();
            case 28:
                return new ArrayDeque();
            default:
                return new fy0(true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ca0
    public void f(boolean z) {
        HashSet hashSet;
        HashSet hashSetE;
        Object[] objArr = 0;
        switch (this.a) {
            case 1:
                if (z) {
                    zn znVar = zn.a;
                    if (!mt.a.contains(zn.class)) {
                        try {
                            zn.f.set(true);
                        } catch (Throwable th) {
                            mt.a(zn.class, th);
                            return;
                        }
                        break;
                    }
                } else {
                    zn znVar2 = zn.a;
                    if (!mt.a.contains(zn.class)) {
                        try {
                            zn.f.set(false);
                        } catch (Throwable th2) {
                            mt.a(zn.class, th2);
                            return;
                        }
                        break;
                    }
                }
                break;
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
            default:
                if (z) {
                    q70 q70Var = q70.a;
                    if (!mt.a.contains(q70.class)) {
                        try {
                            q70.b = true;
                            q70.a.a();
                        } catch (Throwable th3) {
                            mt.a(q70.class, th3);
                        }
                        break;
                    }
                }
                break;
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                if (z) {
                    r41 r41Var = r41.b;
                    if (!mt.a.contains(r41.class)) {
                        try {
                            try {
                                i90.c().execute(new g(16));
                            } catch (Exception unused) {
                                i90 i90Var = i90.a;
                                return;
                            }
                        } catch (Throwable th4) {
                            mt.a(r41.class, th4);
                            return;
                        }
                        break;
                    }
                }
                break;
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                if (z) {
                    ve veVar = ve.a;
                    Set set = mt.a;
                    if (!set.contains(ve.class)) {
                        try {
                            if (!ve.b) {
                                ve veVar2 = ve.a;
                                if (!set.contains(veVar2)) {
                                    try {
                                        ja0 ja0VarK = ma0.k(i90.b(), false);
                                        if (ja0VarK != null) {
                                            JSONArray jSONArray = ja0VarK.s;
                                            HashSet hashSet2 = null;
                                            if (!set.contains(veVar2)) {
                                                try {
                                                    try {
                                                        hashSet = h42.e(jSONArray);
                                                        if (hashSet == null) {
                                                            hashSet = new HashSet();
                                                        }
                                                    } catch (Exception unused2) {
                                                        hashSet = new HashSet();
                                                    }
                                                    hashSet2 = hashSet;
                                                } catch (Throwable th5) {
                                                    mt.a(veVar2, th5);
                                                }
                                            }
                                            ve.c = hashSet2;
                                            break;
                                        }
                                    } catch (Throwable th6) {
                                        mt.a(veVar2, th6);
                                    }
                                }
                                ve.b = !ve.c.isEmpty();
                            }
                        } catch (Throwable th7) {
                            mt.a(ve.class, th7);
                            return;
                        }
                        break;
                    }
                }
                break;
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                if (z) {
                    pp0 pp0Var = pp0.a;
                    if (!mt.a.contains(pp0.class)) {
                        try {
                            if (ie.c()) {
                                pp0.e.set(true);
                                pp0.d();
                            } else {
                                op0.z();
                            }
                        } catch (Throwable th8) {
                            mt.a(pp0.class, th8);
                            return;
                        }
                        break;
                    }
                }
                break;
            case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                if (z) {
                    xt1 xt1Var = xt1.a;
                    Set set2 = mt.a;
                    if (!set2.contains(xt1.class)) {
                        try {
                            if (!xt1.b) {
                                xt1 xt1Var2 = xt1.a;
                                if (!set2.contains(xt1Var2)) {
                                    try {
                                        ja0 ja0VarK2 = ma0.k(i90.b(), false);
                                        if (ja0VarK2 != null) {
                                            xt1Var2.a(ja0VarK2.r);
                                            break;
                                        }
                                    } catch (Throwable th9) {
                                        mt.a(xt1Var2, th9);
                                    }
                                }
                                xt1.b = (xt1.c.isEmpty() && xt1.d.isEmpty()) ? false : true;
                            }
                        } catch (Throwable th10) {
                            mt.a(xt1.class, th10);
                            return;
                        }
                        break;
                    }
                }
                break;
            case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                if (z) {
                    nd1 nd1Var = nd1.a;
                    if (!mt.a.contains(nd1.class)) {
                        try {
                            nd1.b = true;
                            nd1.a.a();
                        } catch (Throwable th11) {
                            mt.a(nd1.class, th11);
                            return;
                        }
                        break;
                    }
                }
                break;
            case oc1.BYTES_FIELD_NUMBER /* 8 */:
                if (z) {
                    Set set3 = mt.a;
                    if (!set3.contains(c11.class)) {
                        try {
                            c11 c11Var = c11.b;
                            if (!set3.contains(c11Var)) {
                                try {
                                    ja0 ja0VarK3 = ma0.k(i90.b(), false);
                                    if (ja0VarK3 != null) {
                                        c11.d = ja0VarK3.n;
                                        break;
                                    }
                                } catch (Throwable th12) {
                                    mt.a(c11Var, th12);
                                }
                            }
                            if (c11.d != null) {
                                c11.c = true;
                            }
                        } catch (Throwable th13) {
                            mt.a(c11.class, th13);
                            return;
                        }
                        break;
                    }
                }
                break;
            case 9:
                if (z) {
                    vh vhVar = vh.a;
                    Set set4 = mt.a;
                    if (!set4.contains(vh.class)) {
                        try {
                            vh vhVar2 = vh.a;
                            if (!set4.contains(vhVar2)) {
                                try {
                                    ja0 ja0VarK4 = ma0.k(i90.b(), false);
                                    if (ja0VarK4 != null && (hashSetE = h42.e(ja0VarK4.o)) != null) {
                                        vh.c = hashSetE;
                                    }
                                } catch (Throwable th14) {
                                    mt.a(vhVar2, th14);
                                }
                            }
                            HashSet hashSet3 = vh.c;
                            if (hashSet3 != null && !hashSet3.isEmpty()) {
                                vh.b = true;
                            }
                        } catch (Throwable th15) {
                            mt.a(vh.class, th15);
                            return;
                        }
                        break;
                    }
                }
                break;
            case 10:
                if (z) {
                    ng1 ng1Var = ng1.a;
                    if (!mt.a.contains(ng1.class)) {
                        try {
                            ng1.a.a();
                            if (!ng1.c.isEmpty()) {
                                ng1.b = true;
                            }
                        } catch (Throwable th16) {
                            mt.a(ng1.class, th16);
                            return;
                        }
                        break;
                    }
                }
                break;
            case 11:
                if (z) {
                    lo1 lo1Var = lo1.a;
                    if (!mt.a.contains(lo1.class)) {
                        try {
                            lo1.a.a();
                            if (lo1.c.isEmpty() && lo1.d.isEmpty()) {
                                lo1.b = false;
                            } else {
                                lo1.b = true;
                            }
                        } catch (Throwable th17) {
                            mt.a(lo1.class, th17);
                            return;
                        }
                        break;
                    }
                }
                break;
            case 12:
                if (z) {
                    boolean z2 = ia.a;
                    try {
                        mk0 mk0Var = new mk0(null, i90.b().concat("/cloudbridge_settings"), null, nm0.a, new ha(objArr == true ? 1 : 0));
                        gp1 gp1Var = i01.c;
                        synchronized (i90.b) {
                        }
                        mk0Var.d();
                    } catch (JSONException e) {
                        gp1 gp1Var2 = i01.c;
                        a80.b(e);
                        synchronized (i90.b) {
                            return;
                        }
                    }
                }
                break;
            case 13:
                if (z) {
                    ek0 ek0Var = ek0.a;
                    if (!mt.a.contains(ek0.class)) {
                        try {
                            ek0.c = true;
                            ek0.d = new fk0(i90.a());
                            ek0.e = "https://www." + i90.s + "/privacy_sandbox/mobile/register/trigger";
                        } catch (Throwable th18) {
                            mt.a(ek0.class, th18);
                            return;
                        }
                        break;
                    }
                }
                break;
            case 14:
                if (z) {
                    ia1.a();
                }
                break;
            case 15:
                if (z) {
                    AtomicBoolean atomicBoolean = gk0.a;
                    if (!mt.a.contains(gk0.class)) {
                        try {
                            gk0.a.set(true);
                        } catch (Throwable th19) {
                            mt.a(gk0.class, th19);
                            return;
                        }
                        break;
                    }
                }
                break;
            case 16:
                if (z) {
                    oj1 oj1Var = oj1.a;
                    if (!mt.a.contains(oj1.class)) {
                        try {
                            oj1.b = true;
                            oj1.a.b();
                        } catch (Throwable th20) {
                            mt.a(oj1.class, th20);
                            return;
                        }
                        break;
                    }
                }
                break;
            case 17:
                if (z) {
                    j51 j51Var = j51.a;
                    if (!mt.a.contains(j51.class)) {
                        try {
                            try {
                                i90.c().execute(new g(17));
                            } catch (Exception unused3) {
                                return;
                            }
                        } catch (Throwable th21) {
                            mt.a(j51.class, th21);
                            return;
                        }
                        break;
                    }
                }
                break;
        }
    }
}
