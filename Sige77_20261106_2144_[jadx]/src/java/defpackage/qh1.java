package defpackage;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.material.tabs.TabLayout;
import com.google.firebase.analytics.connector.internal.AnalyticsConnectorRegistrar;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.crypto.Cipher;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public class qh1 implements nq, f60, o62, ef2, hv2, ff3, tb3, kr3 {
    public final /* synthetic */ int a;
    public static final qh1 b = new qh1(0);
    public static final qh1 c = new qh1(1);
    public static final /* synthetic */ qh1 d = new qh1(11);
    public static final /* synthetic */ qh1 e = new qh1(12);
    public static final /* synthetic */ qh1 f = new qh1(13);
    public static final /* synthetic */ qh1 i = new qh1(14);
    public static final /* synthetic */ qh1 v = new qh1(15);
    public static final /* synthetic */ qh1 w = new qh1(16);
    public static final /* synthetic */ qh1 W = new qh1(18);

    public /* synthetic */ qh1(int i2) {
        this.a = i2;
    }

    public static final void e(z9 z9Var, w1 w1Var) {
        String str = pa.c;
        ri2 ri2Var = da.a;
        if (!mt.a.contains(da.class)) {
            try {
                w1Var.getClass();
                da.b.execute(new x4(5, w1Var, z9Var));
            } catch (Throwable th) {
                mt.a(da.class, th);
            }
        }
        boolean z = false;
        int i2 = 1;
        if (fa0.b(da0.OnDevicePostInstallEventProcessing) && b91.a()) {
            String str2 = w1Var.a;
            Set set = mt.a;
            if (!set.contains(b91.class)) {
                try {
                    b91 b91Var = b91.a;
                    if (!set.contains(b91Var)) {
                        try {
                            boolean z2 = z9Var.c && b91.b.contains(z9Var.e);
                            if (!z9Var.c || z2) {
                                i90.c().execute(new ck0(str2, z9Var, i2));
                            }
                        } catch (Throwable th2) {
                            mt.a(b91Var, th2);
                        }
                    }
                } catch (Throwable th3) {
                    mt.a(b91.class, th3);
                }
            }
        }
        if (fa0.b(da0.GPSARATriggers)) {
            ek0.a.d(w1Var.a, z9Var);
        }
        if (fa0.b(da0.GPSPACAProcessing)) {
            ia1 ia1Var = ia1.a;
            String str3 = w1Var.a;
            if (!mt.a.contains(ia1Var)) {
                try {
                    if (!ia1.d) {
                        ia1.a();
                    }
                    if (ia1.c) {
                        String string = null;
                        try {
                            JSONObject jSONObject = z9Var.a;
                            if (jSONObject != null) {
                                string = jSONObject.getString("_eventName");
                            }
                        } catch (JSONException unused) {
                            Log.w(ia1.b, "Failed to get event name from event.");
                        }
                        ia1Var.b(str3, string);
                    }
                } catch (Throwable th4) {
                    mt.a(ia1Var, th4);
                }
            }
        }
        if (z9Var.c) {
            return;
        }
        if (!mt.a.contains(pa.class)) {
            try {
                z = pa.g;
            } catch (Throwable th5) {
                mt.a(pa.class, th5);
            }
        }
        if (z) {
            return;
        }
        if (!Intrinsics.areEqual(z9Var.e, "fb_mobile_activate_app")) {
            gp1 gp1Var = i01.c;
            synchronized (i90.b) {
            }
        } else {
            if (mt.a.contains(pa.class)) {
                return;
            }
            try {
                pa.g = true;
            } catch (Throwable th6) {
                mt.a(pa.class, th6);
            }
        }
    }

    public static Pair j(Bundle bundle, v91 v91Var, boolean z) {
        String str = ie.c() ? "1" : "0";
        Map map = v91.b;
        Pair pairB = zi0.b("is_implicit_purchase_logging_enabled", str, bundle, v91Var);
        Object objN = zi0.n("fb_iap_product_id", bundle, v91Var);
        String str2 = objN instanceof String ? (String) objN : null;
        if (!z) {
            if ((bundle != null ? bundle.getString("fb_content_id") : null) == null && str2 != null) {
                Pair pairB2 = zi0.b("fb_content_id", str2, bundle, v91Var);
                pairB = zi0.b("android_dynamic_ads_content_id", "client_manual", (Bundle) pairB2.a, (v91) pairB2.b);
            }
        }
        Pair pairB3 = zi0.b("is_autolog_app_events_enabled", x32.c() ? "1" : "0", (Bundle) pairB.a, (v91) pairB.b);
        return new Pair((Bundle) pairB3.a, (v91) pairB3.b);
    }

    public static final Bundle k(String str, List list, int i2) {
        String str2;
        if (!mt.a.contains(qh1.class)) {
            try {
                if (i2 == 0) {
                    throw null;
                }
                list.getClass();
                Bundle bundle = new Bundle();
                if (i2 == 1) {
                    str2 = "MOBILE_APP_INSTALL";
                } else {
                    if (i2 != 2) {
                        throw null;
                    }
                    str2 = "CUSTOM_APP_EVENTS";
                }
                bundle.putString("event", str2);
                bundle.putString("app_id", str);
                if (2 != i2) {
                    return bundle;
                }
                JSONArray jSONArrayL = b.l(str, list);
                if (jSONArrayL.length() != 0) {
                    bundle.putString("custom_events", jSONArrayL.toString());
                    return bundle;
                }
            } catch (Throwable th) {
                mt.a(qh1.class, th);
                return null;
            }
        }
        return null;
    }

    public static RectF m(TabLayout tabLayout, View view) {
        if (view == null) {
            return new RectF();
        }
        if (tabLayout.k0 || !(view instanceof hw1)) {
            return new RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
        hw1 hw1Var = (hw1) view;
        int iB = hw1Var.b();
        int iA = hw1Var.a();
        int iF = (int) qt.f(hw1Var.getContext(), 24);
        if (iB < iF) {
            iB = iF;
        }
        int right = (hw1Var.getRight() + hw1Var.getLeft()) / 2;
        int bottom = (hw1Var.getBottom() + hw1Var.getTop()) / 2;
        int i2 = iB / 2;
        return new RectF(right - i2, bottom - (iA / 2), i2 + right, (right / 2) + bottom);
    }

    public static int p() {
        int i2;
        synchronized (pa.c()) {
            i2 = !mt.a.contains(pa.class) ? 1 : 0;
        }
        return i2;
    }

    public static String q() {
        e eVar;
        if (mt.a.contains(pa.class)) {
            eVar = null;
        } else {
            try {
                eVar = pa.h;
            } catch (Throwable th) {
                mt.a(pa.class, th);
                eVar = null;
            }
        }
        eVar.getClass();
        if (!i90.a().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean("is_referrer_updated", false)) {
            InstallReferrerClient installReferrerClientBuild = InstallReferrerClient.newBuilder(i90.a()).build();
            try {
                installReferrerClientBuild.startConnection(new gk1(11, installReferrerClientBuild, eVar));
            } catch (Exception unused) {
            }
        }
        return i90.a().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getString("install_referrer", null);
    }

    public static void s() {
        synchronized (pa.c()) {
            if (pa.b() != null) {
                return;
            }
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
            if (!mt.a.contains(pa.class)) {
                try {
                    pa.d = scheduledThreadPoolExecutor;
                } catch (Throwable th) {
                    mt.a(pa.class, th);
                }
            }
            Unit unit = Unit.a;
            g gVar = new g(7);
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutorB = pa.b();
            if (scheduledThreadPoolExecutorB != null) {
                scheduledThreadPoolExecutorB.scheduleAtFixedRate(gVar, 0L, 86400L, TimeUnit.SECONDS);
            } else {
                uq1.q("Required value was null.");
            }
        }
    }

    public static void u(i60 i60Var, StringBuilder sb) {
        int iCharAt = (sb.charAt(1) * '(') + (sb.charAt(0) * 1600) + sb.charAt(2) + 1;
        i60Var.c.append(new String(new char[]{(char) (iCharAt / 256), (char) (iCharAt % 256)}));
        sb.delete(0, 3);
    }

    public static /* bridge */ ho2 v(Object obj) {
        dm2 dm2Var = (dm2) obj;
        ho2 ho2Var = dm2Var.zzc;
        if (ho2Var != ho2.f) {
            return ho2Var;
        }
        ho2 ho2VarA = ho2.a();
        dm2Var.zzc = ho2VarA;
        return ho2VarA;
    }

    public static boolean w(int i2, we weVar, Object obj) throws xm2 {
        ll2 ll2Var = (ll2) weVar.d;
        int i3 = weVar.a;
        int i4 = i3 >>> 3;
        int i5 = i3 & 7;
        if (i5 == 0) {
            weVar.V(0);
            ((ho2) obj).d(i4 << 3, Long.valueOf(ll2Var.r()));
            return true;
        }
        if (i5 == 1) {
            weVar.V(1);
            ((ho2) obj).d((i4 << 3) | 1, Long.valueOf(ll2Var.t()));
            return true;
        }
        if (i5 == 2) {
            ((ho2) obj).d((i4 << 3) | 2, weVar.E0());
            return true;
        }
        if (i5 != 3) {
            if (i5 == 4) {
                if (i2 != 0) {
                    return false;
                }
                tv2.i("Protocol message end-group tag did not match expected tag.");
                return false;
            }
            if (i5 != 5) {
                uq1.p();
                return false;
            }
            weVar.V(5);
            ((ho2) obj).d(5 | (i4 << 3), Integer.valueOf(ll2Var.u()));
            return true;
        }
        ho2 ho2VarA = ho2.a();
        int i6 = i4 << 3;
        int i7 = i2 + 1;
        if (i7 >= 100) {
            tv2.i("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return false;
        }
        while (weVar.g0() != Integer.MAX_VALUE && w(i7, weVar, ho2VarA)) {
        }
        if ((i6 | 4) != weVar.a) {
            tv2.i("Protocol message end-group tag did not match expected tag.");
            return false;
        }
        if (ho2VarA.e) {
            ho2VarA.e = false;
        }
        ((ho2) obj).d(i6 | 3, ho2VarA);
        return true;
    }

    @Override // defpackage.kr3
    public /* synthetic */ Object a(String str, Provider provider) {
        return provider == null ? Cipher.getInstance(str) : Cipher.getInstance(str, provider);
    }

    @Override // defpackage.o62
    public l62 b(Class cls) {
        return new jz0();
    }

    @Override // defpackage.ff3
    public vf3 c(dx2 dx2Var) throws GeneralSecurityException {
        int i2 = this.a;
        ip3 ip3Var = ip3.TINK;
        ip3 ip3Var2 = ip3.RAW;
        switch (i2) {
            case 17:
                c03 c03Var = (c03) dx2Var;
                vn3 vn3VarT = xn3.t();
                vn3VarT.i("type.googleapis.com/google.crypto.tink.KmsAeadKey");
                vo3 vo3VarT = wo3.t();
                String str = c03Var.a;
                vo3VarT.f();
                wo3.v((wo3) vo3VarT.b, str);
                vn3VarT.j(((wo3) vo3VarT.d()).b());
                vy2 vy2Var = c03Var.b;
                if (vy2.f != vy2Var) {
                    if (vy2.i != vy2Var) {
                        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(vy2Var)));
                    }
                    ip3Var = ip3Var2;
                }
                vn3VarT.h(ip3Var);
                return vf3.f((xn3) vn3VarT.d());
            case 18:
            default:
                v83 v83Var = (v83) dx2Var;
                vn3 vn3VarT2 = xn3.t();
                vn3VarT2.i("type.googleapis.com/google.crypto.tink.HpkePrivateKey");
                tm3 tm3VarV = um3.v();
                bn3 bn3VarD = y83.d(v83Var);
                tm3VarV.f();
                um3.u((um3) tm3VarV.b, bn3VarD);
                vn3VarT2.j(((um3) tm3VarV.d()).b());
                vn3VarT2.h((ip3) y83.g.E(v83Var.d));
                return vf3.f((xn3) vn3VarT2.d());
            case 19:
                fz2 fz2Var = (fz2) dx2Var;
                vn3 vn3VarT3 = xn3.t();
                vn3VarT3.i("type.googleapis.com/google.crypto.tink.AesEaxKey");
                lj3 lj3VarX = mj3.x();
                qj3 qj3VarC = t23.c(fz2Var);
                lj3VarX.f();
                mj3.w((mj3) lj3VarX.b, qj3VarC);
                int i3 = fz2Var.a;
                lj3VarX.f();
                ((mj3) lj3VarX.b).zzg = i3;
                vn3VarT3.j(((mj3) lj3VarX.d()).b());
                vn3VarT3.h(t23.b(fz2Var.d));
                return vf3.f((xn3) vn3VarT3.d());
            case 20:
                s13 s13Var = (s13) dx2Var;
                vn3 vn3VarT4 = xn3.t();
                vn3VarT4.i("type.googleapis.com/google.crypto.tink.XAesGcmKey");
                pp3 pp3VarW = rp3.w();
                up3 up3VarV = vp3.v();
                int i4 = s13Var.b;
                up3VarV.f();
                ((vp3) up3VarV.b).zze = i4;
                vp3 vp3Var = (vp3) up3VarV.d();
                pp3VarW.f();
                rp3.v((rp3) pp3VarW.b, vp3Var);
                vn3VarT4.j(((rp3) pp3VarW.d()).b());
                nz2 nz2Var = s13Var.a;
                if (nz2Var != nz2.f) {
                    if (nz2Var != nz2.i) {
                        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(nz2Var)));
                    }
                    ip3Var = ip3Var2;
                }
                vn3VarT4.h(ip3Var);
                return vf3.f((xn3) vn3VarT4.d());
        }
    }

    @Override // defpackage.nq
    public Object d(co coVar) {
        switch (this.a) {
            case 1:
                Object objG = coVar.g(new je1(dx0.class, Executor.class));
                objG.getClass();
                return new h80((Executor) objG);
            default:
                return AnalyticsConnectorRegistrar.zza(coVar);
        }
    }

    @Override // defpackage.ef2
    public void f(Object obj) {
        Bundle bundle = new Bundle();
        bundle.putString("v", (String) obj);
        gf2.b.a(new oc2("cleanupEvents_oom", bundle));
    }

    @Override // defpackage.tb3
    public byte[] g(byte[] bArr, byte[] bArr2) {
        return kv.q0(bArr, bArr2);
    }

    @Override // defpackage.f60
    public void i(i60 i60Var) {
        StringBuilder sb = new StringBuilder();
        while (i60Var.b()) {
            char cA = i60Var.a();
            i60Var.d++;
            int iN = n(cA, sb);
            int length = i60Var.c.length() + ((sb.length() / 3) << 1);
            i60Var.c(length);
            int i2 = i60Var.f.b - length;
            if (!i60Var.b()) {
                StringBuilder sb2 = new StringBuilder();
                if (sb.length() % 3 == 2 && (i2 < 2 || i2 > 2)) {
                    int length2 = sb.length();
                    sb.delete(length2 - iN, length2);
                    i60Var.d--;
                    iN = n(i60Var.a(), sb2);
                    i60Var.f = null;
                }
                while (sb.length() % 3 == 1 && ((iN <= 3 && i2 != 1) || iN > 3)) {
                    int length3 = sb.length();
                    sb.delete(length3 - iN, length3);
                    i60Var.d--;
                    iN = n(i60Var.a(), sb2);
                    i60Var.f = null;
                }
                break;
            }
            if (sb.length() % 3 == 0 && ga.u(i60Var.a, i60Var.d, o()) != o()) {
                i60Var.e = 0;
                break;
            }
        }
        r(i60Var, sb);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    public JSONArray l(String str, List list) {
        boolean z;
        Set set = mt.a;
        if (set.contains(this)) {
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray();
            ArrayList arrayListD = CollectionsKt.D(list);
            q70.b(arrayListD);
            int i2 = 0;
            if (set.contains(this)) {
                z = false;
            } else {
                try {
                    ja0 ja0VarK = ma0.k(str, false);
                    if (ja0VarK != null) {
                        z = ja0VarK.a;
                    } else {
                        z = false;
                    }
                } catch (Throwable th) {
                    mt.a(this, th);
                }
            }
            int size = arrayListD.size();
            while (i2 < size) {
                Object obj = arrayListD.get(i2);
                i2++;
                z9 z9Var = (z9) obj;
                boolean z2 = z9Var.c;
                if (!z2 || (z2 && z)) {
                    jSONArray.put(z9Var.a);
                }
            }
            return jSONArray;
        } catch (Throwable th2) {
            mt.a(this, th2);
            return null;
        }
    }

    public int n(char c2, StringBuilder sb) {
        if (c2 == ' ') {
            sb.append((char) 3);
            return 1;
        }
        if (c2 >= '0' && c2 <= '9') {
            sb.append((char) (c2 - ','));
            return 1;
        }
        if (c2 >= 'A' && c2 <= 'Z') {
            sb.append((char) (c2 - '3'));
            return 1;
        }
        if (c2 < ' ') {
            sb.append((char) 0);
            sb.append(c2);
            return 2;
        }
        if (c2 >= '!' && c2 <= '/') {
            sb.append((char) 1);
            sb.append((char) (c2 - '!'));
            return 2;
        }
        if (c2 >= ':' && c2 <= '@') {
            sb.append((char) 1);
            sb.append((char) (c2 - '+'));
            return 2;
        }
        if (c2 >= '[' && c2 <= '_') {
            sb.append((char) 1);
            sb.append((char) (c2 - 'E'));
            return 2;
        }
        if (c2 < '`' || c2 > 127) {
            sb.append("\u0001\u001e");
            return n((char) (c2 - 128), sb) + 2;
        }
        sb.append((char) 2);
        sb.append((char) (c2 - '`'));
        return 2;
    }

    public int o() {
        return 1;
    }

    public void r(i60 i60Var, StringBuilder sb) {
        int length = (sb.length() / 3) << 1;
        int length2 = sb.length() % 3;
        int length3 = i60Var.c.length() + length;
        i60Var.c(length3);
        int i2 = i60Var.f.b - length3;
        if (length2 == 2) {
            sb.append((char) 0);
            while (sb.length() >= 3) {
                u(i60Var, sb);
            }
            if (i60Var.b()) {
                i60Var.d((char) 254);
            }
        } else if (i2 == 1 && length2 == 1) {
            while (sb.length() >= 3) {
                u(i60Var, sb);
            }
            if (i60Var.b()) {
                i60Var.d((char) 254);
            }
            i60Var.d--;
        } else {
            if (length2 != 0) {
                uq1.q("Unexpected case. Please report!");
                return;
            }
            while (sb.length() >= 3) {
                u(i60Var, sb);
            }
            if (i2 > 0 || i60Var.b()) {
                i60Var.d((char) 254);
            }
        }
        i60Var.e = 0;
    }

    public void t(TabLayout tabLayout, View view, View view2, float f2, Drawable drawable) {
        RectF rectFM = m(tabLayout, view);
        RectF rectFM2 = m(tabLayout, view2);
        drawable.setBounds(d7.c(f2, (int) rectFM.left, (int) rectFM2.left), drawable.getBounds().top, d7.c(f2, (int) rectFM.right, (int) rectFM2.right), drawable.getBounds().bottom);
    }

    @Override // defpackage.hv2
    /* JADX INFO: renamed from: zza */
    public Object mo5zza() {
        switch (this.a) {
            case 12:
                List list = h13.a;
                vo2.b.get();
                return Integer.valueOf((int) ((Long) xo2.a.z("measurement.upload.max_realtime_events_per_day", 10L, 74).get()).longValue());
            case 13:
                List list2 = h13.a;
                vo2.b.get();
                return (Long) xo2.a.z("measurement.sgtm.upload.min_delay_after_background", 600000L, 48).get();
            case 14:
                List list3 = h13.a;
                vo2.b.get();
                return Integer.valueOf((int) ((Long) xo2.a.z("measurement.upload.retry_count", 6L, 76).get()).longValue());
            case 15:
                List list4 = h13.a;
                vo2.b.get();
                return Integer.valueOf((int) ((Long) xo2.a.z("measurement.max_bundles_per_iteration", 100L, 3).get()).longValue());
            case 16:
                List list5 = h13.a;
                vo2.b.get();
                return Integer.valueOf((int) ((Long) xo2.a.z("measurement.rb.attribution.client.min_time_after_boot_seconds", 90L, 55).get()).longValue());
            default:
                List list6 = h13.a;
                hq2.b.get();
                return (Boolean) iq2.a.r(2, "measurement.rb.attribution.service.trigger_uris_high_priority", true).get();
        }
    }
}
