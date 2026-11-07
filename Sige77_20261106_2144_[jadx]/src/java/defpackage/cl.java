package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class cl implements c02 {
    public final ox1 a;
    public final ConnectivityManager b;
    public final Context c;
    public final URL d;
    public final hn e;
    public final hn f;
    public final int g;

    public cl(Context context, hn hnVar, hn hnVar2) {
        tt0 tt0Var = new tt0();
        qc qcVar = qc.a;
        tt0Var.a(bh.class, qcVar);
        tt0Var.a(kd.class, qcVar);
        tc tcVar = tc.a;
        tt0Var.a(c01.class, tcVar);
        tt0Var.a(vd.class, tcVar);
        rc rcVar = rc.a;
        tt0Var.a(fn.class, rcVar);
        tt0Var.a(ld.class, rcVar);
        pc pcVar = pc.a;
        tt0Var.a(o6.class, pcVar);
        tt0Var.a(id.class, pcVar);
        sc scVar = sc.a;
        tt0Var.a(zz0.class, scVar);
        tt0Var.a(ud.class, scVar);
        uc ucVar = uc.a;
        tt0Var.a(y61.class, ucVar);
        tt0Var.a(xd.class, ucVar);
        tt0Var.d = true;
        this.a = new ox1(tt0Var);
        this.c = context;
        this.b = (ConnectivityManager) context.getSystemService("connectivity");
        this.d = b(sj.c);
        this.e = hnVar2;
        this.f = hnVar;
        this.g = 130000;
    }

    public static URL b(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(ts.j("Invalid url: ", str), e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:30:0x010b  */
    public final od a(od odVar) {
        int type;
        int subtype;
        HashMap map;
        NetworkInfo activeNetworkInfo = this.b.getActiveNetworkInfo();
        qp0 qp0VarC = odVar.c();
        int i = Build.VERSION.SDK_INT;
        HashMap map2 = (HashMap) qp0VarC.f;
        if (map2 == null) {
            uq1.q("Property \"autoMetadata\" has not been set");
            return null;
        }
        map2.put("sdk-version", String.valueOf(i));
        qp0VarC.a("model", Build.MODEL);
        qp0VarC.a("hardware", Build.HARDWARE);
        qp0VarC.a("device", Build.DEVICE);
        qp0VarC.a("product", Build.PRODUCT);
        qp0VarC.a("os-uild", Build.ID);
        qp0VarC.a("manufacturer", Build.MANUFACTURER);
        qp0VarC.a("fingerprint", Build.FINGERPRINT);
        Calendar.getInstance();
        long offset = TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
        HashMap map3 = (HashMap) qp0VarC.f;
        if (map3 == null) {
            uq1.q("Property \"autoMetadata\" has not been set");
            return null;
        }
        map3.put("tz-offset", String.valueOf(offset));
        int i2 = -1;
        if (activeNetworkInfo == null) {
            SparseArray sparseArray = x61.a;
            type = -1;
        } else {
            type = activeNetworkInfo.getType();
        }
        HashMap map4 = (HashMap) qp0VarC.f;
        if (map4 == null) {
            uq1.q("Property \"autoMetadata\" has not been set");
            return null;
        }
        map4.put("net-type", String.valueOf(type));
        if (activeNetworkInfo != null) {
            subtype = activeNetworkInfo.getSubtype();
            if (subtype == -1) {
                SparseArray sparseArray2 = w61.a;
                subtype = 100;
            } else if (((w61) w61.a.get(subtype)) == null) {
            }
            map = (HashMap) qp0VarC.f;
            if (map != null) {
                uq1.q("Property \"autoMetadata\" has not been set");
                return null;
            }
            map.put("mobile-subtype", String.valueOf(subtype));
            qp0VarC.a("country", Locale.getDefault().getCountry());
            qp0VarC.a("locale", Locale.getDefault().getLanguage());
            Context context = this.c;
            qp0VarC.a("mcc_mnc", ((TelephonyManager) context.getSystemService("phone")).getSimOperator());
            try {
                i2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException e) {
                d42.h(e, "CctTransportBackend", "Unable to find version code for package");
            }
            qp0VarC.a("application_build", Integer.toString(i2));
            return qp0VarC.c();
        }
        SparseArray sparseArray3 = w61.a;
        subtype = 0;
        map = (HashMap) qp0VarC.f;
        if (map != null) {
            uq1.q("Property \"autoMetadata\" has not been set");
            return null;
        }
        map.put("mobile-subtype", String.valueOf(subtype));
        qp0VarC.a("country", Locale.getDefault().getCountry());
        qp0VarC.a("locale", Locale.getDefault().getLanguage());
        Context context2 = this.c;
        qp0VarC.a("mcc_mnc", ((TelephonyManager) context2.getSystemService("phone")).getSimOperator());
        i2 = context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).versionCode;
        qp0VarC.a("application_build", Integer.toString(i2));
        return qp0VarC.c();
    }
}
