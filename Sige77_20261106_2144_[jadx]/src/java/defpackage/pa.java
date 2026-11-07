package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.facebook.AccessToken;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import kotlin.Pair;
import kotlin.collections.a;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class pa {
    public static final String c;
    public static ScheduledThreadPoolExecutor d;
    public static final Object e;
    public static volatile String f;
    public static boolean g;
    public static final e h;
    public final String a;
    public final w1 b;

    static {
        String canonicalName = pa.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "com.facebook.appevents.AppEventsLoggerImpl";
        }
        c = canonicalName;
        e = new Object();
        h = new e(2);
    }

    public pa(String str, String str2) {
        dw0.y();
        this.a = str;
        Date date = AccessToken.Y;
        AccessToken accessTokenT = aj0.t();
        if (accessTokenT == null || new Date().after(accessTokenT.a) || !(str2 == null || Intrinsics.areEqual(str2, accessTokenT.v))) {
            if (str2 == null) {
                if (i90.a() == null) {
                    uq1.h("Argument 'context' cannot be null");
                    throw null;
                }
                str2 = i90.b();
            }
            this.b = new w1(null, str2);
        } else {
            this.b = new w1(accessTokenT.e, i90.b());
        }
        qh1.s();
    }

    public static final String a() {
        if (mt.a.contains(pa.class)) {
            return null;
        }
        try {
            return f;
        } catch (Throwable th) {
            mt.a(pa.class, th);
            return null;
        }
    }

    public static final ScheduledThreadPoolExecutor b() {
        if (mt.a.contains(pa.class)) {
            return null;
        }
        try {
            return d;
        } catch (Throwable th) {
            mt.a(pa.class, th);
            return null;
        }
    }

    public static final Object c() {
        if (mt.a.contains(pa.class)) {
            return null;
        }
        try {
            return e;
        } catch (Throwable th) {
            mt.a(pa.class, th);
            return null;
        }
    }

    public static void f(pa paVar, String str, Double d2, Bundle bundle, boolean z, UUID uuid) {
        if (mt.a.contains(pa.class)) {
            return;
        }
        try {
            paVar.e(str, d2, bundle, z, uuid, null);
        } catch (Throwable th) {
            mt.a(pa.class, th);
        }
    }

    public final void d(String str, Bundle bundle) {
        pa paVar;
        if (mt.a.contains(this)) {
            return;
        }
        try {
            paVar = this;
            try {
                f(paVar, str, null, bundle, false, e5.b());
            } catch (Throwable th) {
                th = th;
                mt.a(paVar, th);
            }
        } catch (Throwable th2) {
            th = th2;
            paVar = this;
        }
    }

    /* JADX WARN: Code duplicated, block: B:78:0x011a  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void e(String str, Double d2, Bundle bundle, boolean z, UUID uuid, v91 v91Var) {
        v91 v91Var2;
        Bundle bundle2;
        boolean zContains;
        Double dValueOf;
        String string;
        if (mt.a.contains(this) || str == null) {
            return;
        }
        try {
            if (str.length() == 0) {
                return;
            }
            if (!z && ie.c() && (Intrinsics.areEqual(str, "fb_mobile_purchase") || Intrinsics.areEqual(str, "Subscribe") || Intrinsics.areEqual(str, "StartTrial"))) {
                Log.w(c, "You are logging purchase events while auto-logging of in-app purchase is enabled in the SDK. Make sure you don't log duplicate events");
                if ((fa0.b(da0.AndroidManualImplicitPurchaseDedupe) && Intrinsics.areEqual(str, "fb_mobile_purchase")) || (fa0.b(da0.AndroidManualImplicitSubsDedupe) && (Intrinsics.areEqual(str, "Subscribe") || Intrinsics.areEqual(str, "StartTrial")))) {
                    List list = mp0.a;
                    Currency currency = null;
                    if (d2 == null) {
                        ja0 ja0VarB = ma0.b(i90.b());
                        Iterator it = (((ja0VarB != null ? ja0VarB.u : null) == null || ja0VarB.u.isEmpty()) ? mp0.b : ja0VarB.u).iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                dValueOf = null;
                                break;
                            }
                            String str2 = (String) it.next();
                            if (bundle != null) {
                                try {
                                    dValueOf = Double.valueOf(bundle.getDouble(str2));
                                    break;
                                } catch (Exception unused) {
                                    continue;
                                }
                            }
                        }
                    } else {
                        dValueOf = d2;
                    }
                    List list2 = mp0.a;
                    ja0 ja0VarB2 = ma0.b(i90.b());
                    for (String str3 : ((ja0VarB2 != null ? ja0VarB2.t : null) == null || ja0VarB2.t.isEmpty()) ? mp0.a : ja0VarB2.t) {
                        if (bundle != null) {
                            try {
                                string = bundle.getString(str3);
                            } catch (Exception unused2) {
                                continue;
                            }
                        } else {
                            string = currency;
                        }
                        if (string != 0 && string.length() != 0) {
                            currency = Currency.getInstance(string);
                            break;
                        }
                    }
                    if (dValueOf == null || currency == null) {
                        v91Var2 = v91Var;
                        bundle2 = bundle;
                    } else {
                        Pair pairA = mp0.a(pp0.c(a.a(new ap0(str, dValueOf.doubleValue(), currency)), System.currentTimeMillis(), false, a.a(new Pair(bundle, v91Var))), bundle, v91Var);
                        bundle2 = (Bundle) pairA.a;
                        v91Var2 = (v91) pairA.b;
                    }
                } else {
                    v91Var2 = v91Var;
                    bundle2 = bundle;
                }
            } else {
                v91Var2 = v91Var;
                bundle2 = bundle;
            }
            if (ha0.b("app_events_killswitch", i90.b(), false)) {
                gp1 gp1Var = i01.c;
                synchronized (i90.b) {
                }
                return;
            }
            vh vhVar = vh.a;
            if (mt.a.contains(vh.class)) {
                zContains = false;
            } else {
                try {
                    if (vh.b) {
                        zContains = vh.c.contains(str);
                    }
                } catch (Throwable th) {
                    mt.a(vh.class, th);
                }
                zContains = false;
            }
            if (zContains) {
                return;
            }
            Pair pairJ = qh1.j(bundle2, v91Var2, z);
            Bundle bundle3 = (Bundle) pairJ.a;
            v91 v91Var3 = (v91) pairJ.b;
            try {
                try {
                    if (!nd1.a.c(bundle3)) {
                        lo1.b(str, bundle3);
                    }
                    ve.a(bundle3);
                    c11.n(str, bundle3);
                    xt1.c(bundle3);
                    nd1.b(bundle3);
                    qh1.e(new z9(this.a, str, d2, bundle3, z, e5.k == 0, uuid, v91Var3), this.b);
                } catch (JSONException e2) {
                    gp1 gp1Var2 = i01.c;
                    e2.toString();
                    synchronized (i90.b) {
                    }
                }
            } catch (d90 e3) {
                gp1 gp1Var3 = i01.c;
                e3.toString();
                synchronized (i90.b) {
                }
            }
        } catch (Throwable th2) {
            mt.a(this, th2);
        }
    }

    public final void g(String str, Bundle bundle) {
        pa paVar;
        if (mt.a.contains(this)) {
            return;
        }
        try {
            paVar = this;
            try {
                f(paVar, str, null, bundle, true, e5.b());
            } catch (Throwable th) {
                th = th;
                mt.a(paVar, th);
            }
        } catch (Throwable th2) {
            th = th2;
            paVar = this;
        }
    }

    public final void h(BigDecimal bigDecimal, Currency currency, Bundle bundle, v91 v91Var) {
        pa paVar;
        Throwable th;
        if (mt.a.contains(this)) {
            return;
        }
        if (currency == null) {
            try {
                gp1 gp1Var = i01.c;
                synchronized (i90.b) {
                }
                return;
            } catch (Throwable th2) {
                th = th2;
                paVar = this;
            }
        } else {
            try {
                bundle.putString("fb_currency", currency.getCurrencyCode());
                paVar = this;
                try {
                    paVar.e("fb_mobile_purchase", Double.valueOf(bigDecimal.doubleValue()), bundle, true, e5.b(), v91Var);
                    try {
                        if (qh1.p() != 2) {
                            da.c(6);
                            return;
                        }
                        return;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    th = th;
                }
            } catch (Throwable th5) {
                th = th5;
                paVar = this;
            }
        }
        mt.a(paVar, th);
    }

    public pa(Context context, String str) {
        this(h42.k(context), str);
    }
}
