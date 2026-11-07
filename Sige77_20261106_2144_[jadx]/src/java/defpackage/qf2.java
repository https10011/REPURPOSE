package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import com.hjq.toast.BuildConfig;
import java.security.MessageDigest;
import java.util.Locale;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class qf2 {
    public static qf2 m;
    public static final Object n = new Object();
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;
    public Object j;
    public Object k;
    public Object l;

    public qf2() {
        this.a = new lk1();
        this.b = new lk1();
        this.c = new lk1();
        this.d = new lk1();
        this.e = new y(0.0f);
        this.f = new y(0.0f);
        this.g = new y(0.0f);
        this.h = new y(0.0f);
        int i = 0;
        this.i = new w40(i);
        this.j = new w40(i);
        this.k = new w40(i);
        this.l = new w40(i);
    }

    public String a() {
        pv2 pv2Var = (pv2) this.b;
        String str = (String) this.i;
        if (str != null) {
            return str;
        }
        String strB = pv2Var.b("FM_android_id");
        if (TextUtils.isEmpty(strB)) {
            try {
                strB = Settings.Secure.getString(((Context) this.a).getContentResolver(), "android_id");
            } catch (Throwable unused) {
            }
        }
        if (TextUtils.isEmpty(strB) || strB.equalsIgnoreCase(se2.f) || strB.equalsIgnoreCase(se2.j)) {
            pv2Var.p("FM_android_id", se2.j);
            this.i = BuildConfig.FLAVOR;
        } else {
            pv2Var.p("FM_android_id", strB);
            this.i = strB;
        }
        return (String) this.i;
    }

    public String b() {
        pv2 pv2Var = (pv2) this.b;
        String str = (String) this.j;
        if (str != null) {
            return str;
        }
        String strB = pv2Var.b("FM_serial_number");
        if (TextUtils.isEmpty(strB)) {
            if (Build.VERSION.SDK_INT < 26) {
                strB = Build.SERIAL;
            } else {
                try {
                    strB = Build.getSerial();
                } catch (Throwable unused) {
                }
            }
        }
        if (TextUtils.isEmpty(strB) || strB.equalsIgnoreCase(se2.j)) {
            pv2Var.p("FM_serial_number", se2.j);
            this.j = BuildConfig.FLAVOR;
        } else {
            pv2Var.p("FM_serial_number", strB);
            this.j = strB;
        }
        return (String) this.j;
    }

    public op1 c() {
        op1 op1Var = new op1();
        op1Var.a = (d42) this.a;
        op1Var.b = (d42) this.b;
        op1Var.c = (d42) this.c;
        op1Var.d = (d42) this.d;
        op1Var.e = (ss) this.e;
        op1Var.f = (ss) this.f;
        op1Var.g = (ss) this.g;
        op1Var.h = (ss) this.h;
        op1Var.i = (w40) this.i;
        op1Var.j = (w40) this.j;
        op1Var.k = (w40) this.k;
        op1Var.l = (w40) this.l;
        return op1Var;
    }

    public String d() {
        Context context = (Context) this.a;
        String str = (String) this.k;
        if (str != null) {
            return str;
        }
        try {
            byte[] bArrDigest = MessageDigest.getInstance("SHA1").digest(context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures[0].toByteArray());
            StringBuilder sb = new StringBuilder();
            for (byte b : bArrDigest) {
                String upperCase = Integer.toHexString(b & 255).toUpperCase(Locale.US);
                if (upperCase.length() == 1) {
                    sb.append("0");
                }
                sb.append(upperCase);
                sb.append(":");
            }
            String string = sb.toString();
            this.k = string.substring(0, string.length() - 1);
        } catch (Throwable unused) {
        }
        return (String) this.k;
    }

    public qf2(Context context, pv2 pv2Var) {
        Integer numValueOf;
        this.a = context;
        this.b = pv2Var;
        this.c = context.getPackageName();
        this.d = Build.VERSION.RELEASE;
        try {
            numValueOf = Integer.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException unused) {
            numValueOf = null;
        }
        this.l = numValueOf;
        this.e = Build.MODEL;
        this.f = Build.ID;
        this.g = Build.DISPLAY;
        this.h = Build.BRAND;
    }
}
