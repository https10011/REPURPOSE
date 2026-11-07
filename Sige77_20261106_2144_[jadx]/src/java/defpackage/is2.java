package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.hjq.toast.BuildConfig;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class is2 extends lo2 {
    public Boolean b;
    public String c;
    public rr2 d;
    public Boolean e;

    public final boolean F(String str) {
        y53.j(((y53) this.a).w);
        if (qf3.g0((String) h13.g1.a(null), str) || qf3.g0((String) h13.h1.a(null), str) || qf3.g0((String) h13.i1.a(null), str)) {
            return true;
        }
        return "1".equals(this.d.a(str, "gaia_collection_enabled"));
    }

    public final boolean G(String str) {
        return "1".equals(this.d.a(str, "measurement.event_sampling_enabled"));
    }

    public final boolean H() {
        if (this.b == null) {
            Boolean boolR = R("app_measurement_lite");
            this.b = boolR;
            if (boolR == null) {
                this.b = Boolean.FALSE;
            }
        }
        return this.b.booleanValue() || !((y53) this.a).b;
    }

    public final String I(String str) {
        y53 y53Var = (y53) this.a;
        try {
            String str2 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, BuildConfig.FLAVOR);
            gu2.o(str2);
            return str2;
        } catch (ClassNotFoundException e) {
            c33 c33Var = y53Var.f;
            y53.l(c33Var);
            c33Var.f.b(e, "Could not find SystemProperties class");
            return BuildConfig.FLAVOR;
        } catch (IllegalAccessException e2) {
            c33 c33Var2 = y53Var.f;
            y53.l(c33Var2);
            c33Var2.f.b(e2, "Could not access SystemProperties.get()");
            return BuildConfig.FLAVOR;
        } catch (NoSuchMethodException e3) {
            c33 c33Var3 = y53Var.f;
            y53.l(c33Var3);
            c33Var3.f.b(e3, "Could not find SystemProperties.get() method");
            return BuildConfig.FLAVOR;
        } catch (InvocationTargetException e4) {
            c33 c33Var4 = y53Var.f;
            y53.l(c33Var4);
            c33Var4.f.b(e4, "SystemProperties.get() threw an exception");
            return BuildConfig.FLAVOR;
        }
    }

    public final int J(String str, boolean z) {
        return Math.max(z ? Math.max(Math.min(N(str, h13.g0), 500), 100) : 500, 256);
    }

    public final void K() {
        ((y53) this.a).getClass();
    }

    public final String L(String str, f13 f13Var) {
        return TextUtils.isEmpty(str) ? (String) f13Var.a(null) : (String) f13Var.a(this.d.a(str, f13Var.a));
    }

    public final long M(String str, f13 f13Var) {
        if (TextUtils.isEmpty(str)) {
            return ((Long) f13Var.a(null)).longValue();
        }
        String strA = this.d.a(str, f13Var.a);
        if (TextUtils.isEmpty(strA)) {
            return ((Long) f13Var.a(null)).longValue();
        }
        try {
            return ((Long) f13Var.a(Long.valueOf(Long.parseLong(strA)))).longValue();
        } catch (NumberFormatException unused) {
            return ((Long) f13Var.a(null)).longValue();
        }
    }

    public final int N(String str, f13 f13Var) {
        if (TextUtils.isEmpty(str)) {
            return ((Integer) f13Var.a(null)).intValue();
        }
        String strA = this.d.a(str, f13Var.a);
        if (TextUtils.isEmpty(strA)) {
            return ((Integer) f13Var.a(null)).intValue();
        }
        try {
            return ((Integer) f13Var.a(Integer.valueOf(Integer.parseInt(strA)))).intValue();
        } catch (NumberFormatException unused) {
            return ((Integer) f13Var.a(null)).intValue();
        }
    }

    public final double O(String str, f13 f13Var) {
        if (TextUtils.isEmpty(str)) {
            return ((Double) f13Var.a(null)).doubleValue();
        }
        String strA = this.d.a(str, f13Var.a);
        if (TextUtils.isEmpty(strA)) {
            return ((Double) f13Var.a(null)).doubleValue();
        }
        try {
            return ((Double) f13Var.a(Double.valueOf(Double.parseDouble(strA)))).doubleValue();
        } catch (NumberFormatException unused) {
            return ((Double) f13Var.a(null)).doubleValue();
        }
    }

    public final boolean P(String str, f13 f13Var) {
        if (TextUtils.isEmpty(str)) {
            return ((Boolean) f13Var.a(null)).booleanValue();
        }
        String strA = this.d.a(str, f13Var.a);
        return TextUtils.isEmpty(strA) ? ((Boolean) f13Var.a(null)).booleanValue() : ((Boolean) f13Var.a(Boolean.valueOf("1".equals(strA)))).booleanValue();
    }

    public final Bundle Q() {
        y53 y53Var = (y53) this.a;
        try {
            Context context = y53Var.a;
            Context context2 = y53Var.a;
            c33 c33Var = y53Var.f;
            if (context.getPackageManager() == null) {
                y53.l(c33Var);
                c33Var.f.a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo applicationInfoA = la2.a(context2).a(128, context2.getPackageName());
            if (applicationInfoA != null) {
                return applicationInfoA.metaData;
            }
            y53.l(c33Var);
            c33Var.f.a("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            c33 c33Var2 = y53Var.f;
            y53.l(c33Var2);
            c33Var2.f.b(e, "Failed to load metadata: Package name not found");
            return null;
        }
    }

    public final Boolean R(String str) {
        gu2.l(str);
        Bundle bundleQ = Q();
        if (bundleQ != null) {
            if (bundleQ.containsKey(str)) {
                return Boolean.valueOf(bundleQ.getBoolean(str));
            }
            return null;
        }
        c33 c33Var = ((y53) this.a).f;
        y53.l(c33Var);
        c33Var.f.a("Failed to load metadata: Metadata bundle is null");
        return null;
    }

    public final boolean S() {
        ((y53) this.a).getClass();
        Boolean boolR = R("firebase_analytics_collection_deactivated");
        return boolR != null && boolR.booleanValue();
    }

    public final boolean T() {
        Boolean boolR = R("google_analytics_automatic_screen_reporting_enabled");
        return boolR == null || boolR.booleanValue();
    }

    public final l73 U(String str, boolean z) {
        Object obj;
        gu2.l(str);
        y53 y53Var = (y53) this.a;
        Bundle bundleQ = Q();
        if (bundleQ == null) {
            c33 c33Var = y53Var.f;
            y53.l(c33Var);
            c33Var.f.a("Failed to load metadata: Metadata bundle is null");
            obj = null;
        } else {
            obj = bundleQ.get(str);
        }
        l73 l73Var = l73.UNINITIALIZED;
        if (obj == null) {
            return l73Var;
        }
        if (Boolean.TRUE.equals(obj)) {
            return l73.GRANTED;
        }
        if (Boolean.FALSE.equals(obj)) {
            return l73.DENIED;
        }
        if (z && "eu_consent_policy".equals(obj)) {
            return l73.POLICY;
        }
        c33 c33Var2 = y53Var.f;
        y53.l(c33Var2);
        c33Var2.w.b(str, "Invalid manifest metadata for");
        return l73Var;
    }
}
