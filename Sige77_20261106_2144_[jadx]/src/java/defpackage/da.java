package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.facebook.AccessToken;
import com.facebook.FacebookRequestError;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class da {
    public static ScheduledFuture c;
    public static volatile ri2 a = new ri2(4);
    public static final ScheduledExecutorService b = Executors.newSingleThreadScheduledExecutor();
    public static final g d = new g(5);

    public static final mk0 a(w1 w1Var, fp1 fp1Var, boolean z, f6 f6Var) {
        Set set = mt.a;
        if (!set.contains(da.class)) {
            try {
                String str = w1Var.a;
                ja0 ja0VarK = ma0.k(str, false);
                String str2 = mk0.j;
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                mk0 mk0VarP = vl0.p(null, String.format("%s/activities", Arrays.copyOf(new Object[]{str}, 1)), null, null);
                mk0VarP.i = true;
                Bundle bundle = mk0VarP.d;
                if (bundle == null) {
                    bundle = new Bundle();
                }
                String str3 = w1Var.b;
                if (str3 == null) {
                    Date date = AccessToken.Y;
                    AccessToken accessTokenT = aj0.t();
                    str3 = accessTokenT != null ? accessTokenT.e : null;
                }
                if (str3 != null) {
                    bundle.putString("access_token", str3);
                }
                synchronized (pa.c()) {
                    set.contains(pa.class);
                }
                String str4 = pa.c;
                String strQ = qh1.q();
                if (strQ != null) {
                    bundle.putString("install_referrer", strQ);
                }
                mk0VarP.d = bundle;
                int iD = fp1Var.d(mk0VarP, i90.a(), ja0VarK != null ? ja0VarK.a : false, z);
                if (iD != 0) {
                    f6Var.b += iD;
                    mk0VarP.j(new z1(1, w1Var, mk0VarP, fp1Var, f6Var));
                    return mk0VarP;
                }
            } catch (Throwable th) {
                mt.a(da.class, th);
                return null;
            }
        }
        return null;
    }

    public static final ArrayList b(ri2 ri2Var, f6 f6Var) {
        fp1 fp1Var;
        if (mt.a.contains(da.class)) {
            return null;
        }
        try {
            ri2Var.getClass();
            boolean zF = i90.f(i90.a());
            ArrayList arrayList = new ArrayList();
            for (w1 w1Var : ri2Var.q()) {
                synchronized (ri2Var) {
                    w1Var.getClass();
                    fp1Var = (fp1) ((HashMap) ri2Var.a).get(w1Var);
                }
                if (fp1Var == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                mk0 mk0VarA = a(w1Var, fp1Var, zF, f6Var);
                if (mk0VarA != null) {
                    arrayList.add(mk0VarA);
                    if (ia.a) {
                        HashSet hashSet = oa.a;
                        try {
                            i90.c().execute(new y1(mk0VarA, 3));
                        } catch (Exception unused) {
                        }
                    }
                }
            }
            return arrayList;
        } catch (Throwable th) {
            mt.a(da.class, th);
            return null;
        }
    }

    public static final void c(final int i) {
        if (mt.a.contains(da.class)) {
            return;
        }
        try {
            if (i == 0) {
                throw null;
            }
            b.execute(new Runnable() { // from class: ca
                @Override // java.lang.Runnable
                public final void run() {
                    if (mt.a.contains(da.class)) {
                        return;
                    }
                    int i2 = i;
                    try {
                        if (i2 == 0) {
                            throw null;
                        }
                        da.d(i2);
                    } catch (Throwable th) {
                        mt.a(da.class, th);
                    }
                }
            });
        } catch (Throwable th) {
            mt.a(da.class, th);
        }
    }

    public static final void d(int i) {
        if (mt.a.contains(da.class)) {
            return;
        }
        try {
            if (i == 0) {
                throw null;
            }
            a.a(ba.a());
            try {
                f6 f6VarF = f(i, a);
                if (f6VarF != null) {
                    Intent intent = new Intent("com.facebook.sdk.APP_EVENTS_FLUSHED");
                    intent.putExtra("com.facebook.sdk.APP_EVENTS_NUM_EVENTS_FLUSHED", f6VarF.b);
                    intent.putExtra("com.facebook.sdk.APP_EVENTS_FLUSH_RESULT", (xd0) f6VarF.c);
                    co.x(i90.a()).G(intent);
                }
            } catch (Exception e) {
                Log.w("da", "Caught unexpected exception while flushing app events: ", e);
            }
        } catch (Throwable th) {
            mt.a(da.class, th);
        }
    }

    public static final void e(w1 w1Var, mk0 mk0Var, pk0 pk0Var, fp1 fp1Var, f6 f6Var) {
        xd0 xd0Var;
        if (mt.a.contains(da.class)) {
            return;
        }
        try {
            pk0Var.getClass();
            FacebookRequestError facebookRequestError = pk0Var.c;
            xd0 xd0Var2 = xd0.a;
            if (facebookRequestError == null) {
                xd0Var = xd0Var2;
            } else if (facebookRequestError.b == -1) {
                xd0Var = xd0.c;
            } else {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String.format("Failed:\n  Response: %s\n  Error %s", Arrays.copyOf(new Object[]{pk0Var.toString(), facebookRequestError.toString()}, 2));
                xd0Var = xd0.b;
            }
            synchronized (i90.b) {
            }
            fp1Var.b(facebookRequestError != null);
            xd0 xd0Var3 = xd0.c;
            if (xd0Var == xd0Var3) {
                i90.c().execute(new x4(6, w1Var, fp1Var));
            }
            if (xd0Var == xd0Var2 || ((xd0) f6Var.c) == xd0Var3) {
                return;
            }
            f6Var.c = xd0Var;
        } catch (Throwable th) {
            mt.a(da.class, th);
        }
    }

    public static final f6 f(int i, ri2 ri2Var) {
        if (!mt.a.contains(da.class)) {
            try {
                if (i == 0) {
                    throw null;
                }
                ri2Var.getClass();
                int i2 = 0;
                f6 f6Var = new f6((char) 0, 5);
                f6Var.c = xd0.a;
                ArrayList arrayListB = b(ri2Var, f6Var);
                if (!arrayListB.isEmpty()) {
                    gp1 gp1Var = i01.c;
                    switch (i) {
                        case 1:
                        case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                        case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                        case oc1.LONG_FIELD_NUMBER /* 4 */:
                        case oc1.STRING_FIELD_NUMBER /* 5 */:
                        case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                            synchronized (i90.b) {
                            }
                            int size = arrayListB.size();
                            while (i2 < size) {
                                Object obj = arrayListB.get(i2);
                                i2++;
                                ((mk0) obj).c();
                            }
                            return f6Var;
                        default:
                            throw null;
                    }
                }
            } catch (Throwable th) {
                mt.a(da.class, th);
                return null;
            }
        }
        return null;
    }
}
