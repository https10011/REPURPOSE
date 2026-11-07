package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.ext.SdkExtensions;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.measurement.internal.zzah;
import com.google.android.gms.measurement.internal.zzbf;
import com.google.android.gms.measurement.internal.zzbh;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class qf3 extends i73 {
    public SecureRandom c;
    public final AtomicLong d;
    public int e;
    public v21 f;
    public Boolean i;
    public Integer v;
    public static final String[] w = {"firebase_", "google_", "ga_"};
    public static final String[] W = {"_err"};

    public qf3(y53 y53Var) {
        super(y53Var);
        this.v = null;
        this.d = new AtomicLong(0L);
    }

    public static void A0(ja3 ja3Var, Bundle bundle, boolean z) {
        if (bundle != null && ja3Var != null) {
            if (!bundle.containsKey("_sc") || z) {
                String str = ja3Var.a;
                if (str != null) {
                    bundle.putString("_sn", str);
                } else {
                    bundle.remove("_sn");
                }
                String str2 = ja3Var.b;
                if (str2 != null) {
                    bundle.putString("_sc", str2);
                } else {
                    bundle.remove("_sc");
                }
                bundle.putLong("_si", ja3Var.c);
                return;
            }
            z = false;
        }
        if (bundle != null && ja3Var == null && z) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    public static boolean E0(String str) {
        gu2.l(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    public static boolean G0(Intent intent) {
        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
        if ("android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra)) {
            return true;
        }
        if (TextUtils.isEmpty(stringExtra)) {
            return false;
        }
        try {
            String host = new URL(stringExtra).getHost();
            if (TextUtils.isEmpty(host)) {
                return false;
            }
            return host.matches("^(www\\.)?google(\\.com?)?(\\.[a-z]{2}t?)?$");
        } catch (MalformedURLException unused) {
            return false;
        }
    }

    public static String L(int i, String str, boolean z) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) <= i) {
            return str;
        }
        if (z) {
            return str.substring(0, str.offsetByCodePoints(0, i)).concat("...");
        }
        return null;
    }

    public static boolean Q0(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    public static void W(pf3 pf3Var, String str, int i, String str2, String str3, int i2) {
        Bundle bundle = new Bundle();
        c0(i, bundle);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i == 6 || i == 7 || i == 2) {
            bundle.putLong("_el", i2);
        }
        pf3Var.b(str, "_err", bundle);
    }

    public static MessageDigest X() {
        for (int i = 0; i < 2; i++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                if (messageDigest != null) {
                    return messageDigest;
                }
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }

    public static long Y(byte[] bArr) {
        gu2.o(bArr);
        int length = bArr.length;
        long j = 0;
        if (length <= 0) {
            uq1.n();
            return 0L;
        }
        int i = 0;
        for (int i2 = length - 1; i2 >= 0 && i2 >= bArr.length - 8; i2--) {
            j += (((long) bArr[i2]) & 255) << i;
            i += 8;
        }
        return j;
    }

    public static boolean Z(Context context) {
        ServiceInfo serviceInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            return (packageManager == null || (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementJobService"), 0)) == null || !serviceInfo.enabled) ? false : true;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public static final boolean c0(int i, Bundle bundle) {
        if (bundle == null || bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", i);
        return true;
    }

    public static boolean f0(String str, String[] strArr) {
        gu2.o(strArr);
        for (String str2 : strArr) {
            if (Objects.equals(str, str2)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean g0(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.equals("*") || Arrays.asList(str.split(",")).contains(str2);
    }

    public static boolean i0(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    public static byte[] n0(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(parcelObtain, 0);
            return parcelObtain.marshall();
        } finally {
            parcelObtain.recycle();
        }
    }

    public static ArrayList y0(List list) {
        if (list == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzah zzahVar = (zzah) it.next();
            Bundle bundle = new Bundle();
            bundle.putString("app_id", zzahVar.a);
            bundle.putString("origin", zzahVar.b);
            bundle.putLong("creation_timestamp", zzahVar.d);
            bundle.putString("name", zzahVar.c.b);
            Object objZza = zzahVar.c.zza();
            gu2.o(objZza);
            d42.I(bundle, objZza);
            bundle.putBoolean("active", zzahVar.e);
            String str = zzahVar.f;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            zzbh zzbhVar = zzahVar.i;
            if (zzbhVar != null) {
                bundle.putString("timed_out_event_name", zzbhVar.a);
                zzbf zzbfVar = zzbhVar.b;
                if (zzbfVar != null) {
                    bundle.putBundle("timed_out_event_params", zzbfVar.U());
                }
            }
            bundle.putLong("trigger_timeout", zzahVar.v);
            zzbh zzbhVar2 = zzahVar.w;
            if (zzbhVar2 != null) {
                bundle.putString("triggered_event_name", zzbhVar2.a);
                zzbf zzbfVar2 = zzbhVar2.b;
                if (zzbfVar2 != null) {
                    bundle.putBundle("triggered_event_params", zzbfVar2.U());
                }
            }
            bundle.putLong("triggered_timestamp", zzahVar.c.c);
            bundle.putLong("time_to_live", zzahVar.W);
            zzbh zzbhVar3 = zzahVar.X;
            if (zzbhVar3 != null) {
                bundle.putString("expired_event_name", zzbhVar3.a);
                zzbf zzbfVar3 = zzbhVar3.b;
                if (zzbfVar3 != null) {
                    bundle.putBundle("expired_event_params", zzbfVar3.U());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public static boolean z0(Context context) {
        ActivityInfo receiverInfo;
        gu2.o(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            return (packageManager == null || (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) == null || !receiverInfo.enabled) ? false : true;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public final String B0() {
        byte[] bArr = new byte[16];
        D0().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    public final long C0() {
        long andIncrement;
        long j;
        AtomicLong atomicLong = this.d;
        if (atomicLong.get() != 0) {
            AtomicLong atomicLong2 = this.d;
            synchronized (atomicLong2) {
                atomicLong2.compareAndSet(-1L, 1L);
                andIncrement = atomicLong2.getAndIncrement();
            }
            return andIncrement;
        }
        synchronized (atomicLong) {
            long jNanoTime = System.nanoTime();
            ((y53) this.a).X.getClass();
            long jNextLong = new Random(jNanoTime ^ System.currentTimeMillis()).nextLong();
            int i = this.e + 1;
            this.e = i;
            j = jNextLong + ((long) i);
        }
        return j;
    }

    public final SecureRandom D0() {
        D();
        if (this.c == null) {
            this.c = new SecureRandom();
        }
        return this.c;
    }

    @Override // defpackage.i73
    public final boolean F() {
        return true;
    }

    public final Bundle F0(Uri uri) {
        String queryParameter;
        String queryParameter2;
        String queryParameter3;
        String queryParameter4;
        String queryParameter5;
        String queryParameter6;
        String queryParameter7;
        String queryParameter8;
        String queryParameter9;
        y53 y53Var = (y53) this.a;
        if (uri != null) {
            try {
                if (uri.isHierarchical()) {
                    queryParameter2 = uri.getQueryParameter("utm_campaign");
                    queryParameter3 = uri.getQueryParameter("utm_source");
                    queryParameter4 = uri.getQueryParameter("utm_medium");
                    queryParameter5 = uri.getQueryParameter("gclid");
                    queryParameter6 = uri.getQueryParameter("gbraid");
                    queryParameter7 = uri.getQueryParameter("utm_id");
                    queryParameter8 = uri.getQueryParameter("dclid");
                    queryParameter9 = uri.getQueryParameter("srsltid");
                    queryParameter = uri.getQueryParameter("sfmc_id");
                } else {
                    queryParameter = null;
                    queryParameter2 = null;
                    queryParameter3 = null;
                    queryParameter4 = null;
                    queryParameter5 = null;
                    queryParameter6 = null;
                    queryParameter7 = null;
                    queryParameter8 = null;
                    queryParameter9 = null;
                }
                if (!TextUtils.isEmpty(queryParameter2) || !TextUtils.isEmpty(queryParameter3) || !TextUtils.isEmpty(queryParameter4) || !TextUtils.isEmpty(queryParameter5) || !TextUtils.isEmpty(queryParameter6) || !TextUtils.isEmpty(queryParameter7) || !TextUtils.isEmpty(queryParameter8) || !TextUtils.isEmpty(queryParameter9) || !TextUtils.isEmpty(queryParameter)) {
                    Bundle bundle = new Bundle();
                    if (!TextUtils.isEmpty(queryParameter2)) {
                        bundle.putString("campaign", queryParameter2);
                    }
                    if (!TextUtils.isEmpty(queryParameter3)) {
                        bundle.putString("source", queryParameter3);
                    }
                    if (!TextUtils.isEmpty(queryParameter4)) {
                        bundle.putString("medium", queryParameter4);
                    }
                    if (!TextUtils.isEmpty(queryParameter5)) {
                        bundle.putString("gclid", queryParameter5);
                    }
                    if (!TextUtils.isEmpty(queryParameter6)) {
                        bundle.putString("gbraid", queryParameter6);
                    }
                    String queryParameter10 = uri.getQueryParameter("gad_source");
                    if (!TextUtils.isEmpty(queryParameter10)) {
                        bundle.putString("gad_source", queryParameter10);
                    }
                    String queryParameter11 = uri.getQueryParameter("utm_term");
                    if (!TextUtils.isEmpty(queryParameter11)) {
                        bundle.putString("term", queryParameter11);
                    }
                    String queryParameter12 = uri.getQueryParameter("utm_content");
                    if (!TextUtils.isEmpty(queryParameter12)) {
                        bundle.putString("content", queryParameter12);
                    }
                    String queryParameter13 = uri.getQueryParameter("aclid");
                    if (!TextUtils.isEmpty(queryParameter13)) {
                        bundle.putString("aclid", queryParameter13);
                    }
                    String queryParameter14 = uri.getQueryParameter("cp1");
                    if (!TextUtils.isEmpty(queryParameter14)) {
                        bundle.putString("cp1", queryParameter14);
                    }
                    String queryParameter15 = uri.getQueryParameter("anid");
                    if (!TextUtils.isEmpty(queryParameter15)) {
                        bundle.putString("anid", queryParameter15);
                    }
                    if (!TextUtils.isEmpty(queryParameter7)) {
                        bundle.putString("campaign_id", queryParameter7);
                    }
                    if (!TextUtils.isEmpty(queryParameter8)) {
                        bundle.putString("dclid", queryParameter8);
                    }
                    String queryParameter16 = uri.getQueryParameter("utm_source_platform");
                    if (!TextUtils.isEmpty(queryParameter16)) {
                        bundle.putString("source_platform", queryParameter16);
                    }
                    String queryParameter17 = uri.getQueryParameter("utm_creative_format");
                    if (!TextUtils.isEmpty(queryParameter17)) {
                        bundle.putString("creative_format", queryParameter17);
                    }
                    String queryParameter18 = uri.getQueryParameter("utm_marketing_tactic");
                    if (!TextUtils.isEmpty(queryParameter18)) {
                        bundle.putString("marketing_tactic", queryParameter18);
                    }
                    if (!TextUtils.isEmpty(queryParameter9)) {
                        bundle.putString("srsltid", queryParameter9);
                    }
                    if (!TextUtils.isEmpty(queryParameter)) {
                        bundle.putString("sfmc_id", queryParameter);
                    }
                    for (String str : uri.getQueryParameterNames()) {
                        if (str.startsWith("gad_")) {
                            String queryParameter19 = uri.getQueryParameter(str);
                            if (!TextUtils.isEmpty(queryParameter19)) {
                                bundle.putString(str, queryParameter19);
                            }
                        }
                    }
                    if (y53Var.d.P(null, h13.a1)) {
                        String string = new Uri.Builder().scheme(uri.getScheme()).authority(uri.getAuthority()).path(uri.getPath()).build().toString();
                        y53Var.d.getClass();
                        int iMax = Math.max(500, 256);
                        if (string.length() > iMax) {
                            string = L(iMax - 3, string, true);
                        }
                        if (!TextUtils.isEmpty(string)) {
                            bundle.putString("deep_link_url", string);
                        }
                    }
                    return bundle;
                }
            } catch (UnsupportedOperationException e) {
                c33 c33Var = y53Var.f;
                y53.l(c33Var);
                c33Var.w.b(e, "Install referrer url isn't a hierarchical URI");
                return null;
            }
        }
        return null;
    }

    public final boolean H0(String str, String str2) {
        y53 y53Var = (y53) this.a;
        if (str2 == null) {
            c33 c33Var = y53Var.f;
            y53.l(c33Var);
            c33Var.v.b(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.length() == 0) {
            c33 c33Var2 = y53Var.f;
            y53.l(c33Var2);
            c33Var2.v.b(str, "Name is required and can't be empty. Type");
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt)) {
            c33 c33Var3 = y53Var.f;
            y53.l(c33Var3);
            c33Var3.v.c(str, str2, "Name must start with a letter. Type, name");
            return false;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                c33 c33Var4 = y53Var.f;
                y53.l(c33Var4);
                c33Var4.v.c(str, str2, "Name must consist of letters, digits or _ (underscores). Type, name");
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    public final boolean I(String str, String str2, int i, Object obj) {
        if (obj == null || (obj instanceof Long) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Boolean) || (obj instanceof Double)) {
            return true;
        }
        if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
            return false;
        }
        String string = obj.toString();
        if (string.codePointCount(0, string.length()) <= i) {
            return true;
        }
        c33 c33Var = ((y53) this.a).f;
        y53.l(c33Var);
        c33Var.X.d("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(string.length()));
        return false;
    }

    public final boolean I0(String str, String str2) {
        y53 y53Var = (y53) this.a;
        if (str2 == null) {
            c33 c33Var = y53Var.f;
            y53.l(c33Var);
            c33Var.v.b(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.length() == 0) {
            c33 c33Var2 = y53Var.f;
            y53.l(c33Var2);
            c33Var2.v.b(str, "Name is required and can't be empty. Type");
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt)) {
            if (iCodePointAt != 95) {
                c33 c33Var3 = y53Var.f;
                y53.l(c33Var3);
                c33Var3.v.c(str, str2, "Name must start with a letter or _ (underscore). Type, name");
                return false;
            }
            iCodePointAt = 95;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                c33 c33Var4 = y53Var.f;
                y53.l(c33Var4);
                c33Var4.v.c(str, str2, "Name must consist of letters, digits or _ (underscores). Type, name");
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    public final void J(String str, String str2, Bundle bundle, List list, boolean z) {
        int iO0;
        int iM;
        list = list;
        if (bundle == null) {
            return;
        }
        y53 y53Var = (y53) this.a;
        is2 is2Var = y53Var.d;
        c33 c33Var = y53Var.f;
        p23 p23Var = y53Var.W;
        qf3 qf3Var = ((y53) is2Var.a).w;
        y53.j(qf3Var);
        int i = true != qf3Var.o0(231100000) ? 0 : 35;
        int i2 = 0;
        boolean z2 = false;
        for (String str3 : new TreeSet(bundle.keySet())) {
            if (list == null || !list.contains(str3)) {
                iO0 = !z ? O0(str3) : 0;
                if (iO0 == 0) {
                    iO0 = P0(str3);
                }
            } else {
                iO0 = 0;
            }
            if (iO0 != 0) {
                S(bundle, iO0, str3, iO0 == 3 ? str3 : null);
                bundle.remove(str3);
            } else {
                if (Q0(bundle.get(str3))) {
                    y53.l(c33Var);
                    c33Var.X.d("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str, str2, str3);
                    iM = 22;
                } else {
                    iM = M(str, str3, bundle.get(str3), bundle, list, z, false);
                }
                if (iM != 0 && !"_ev".equals(str3)) {
                    S(bundle, iM, str3, bundle.get(str3));
                    bundle.remove(str3);
                } else if (E0(str3) && !f0(str3, g93.h)) {
                    i2++;
                    if (!o0(231100000)) {
                        y53.l(c33Var);
                        c33Var.v.c(p23Var.a(str), p23Var.e(bundle), "Item array not supported on client's version of Google Play Services (Android Only)");
                        c0(23, bundle);
                        bundle.remove(str3);
                    } else if (i2 > i) {
                        if (!z2) {
                            y53.l(c33Var);
                            z23 z23Var = c33Var.v;
                            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 55);
                            sb.append("Item can't contain more than ");
                            sb.append(i);
                            sb.append(" item-scoped custom params");
                            z23Var.c(p23Var.a(str), p23Var.e(bundle), sb.toString());
                        }
                        c0(28, bundle);
                        bundle.remove(str3);
                        z2 = true;
                    }
                }
            }
        }
    }

    public final boolean J0(String str, String[] strArr, String[] strArr2, String str2) {
        y53 y53Var = (y53) this.a;
        if (str2 == null) {
            c33 c33Var = y53Var.f;
            y53.l(c33Var);
            c33Var.v.b(str, "Name is required and can't be null. Type");
            return false;
        }
        for (int i = 0; i < 3; i++) {
            if (str2.startsWith(w[i])) {
                c33 c33Var2 = y53Var.f;
                y53.l(c33Var2);
                c33Var2.v.c(str, str2, "Name starts with reserved prefix. Type, name");
                return false;
            }
        }
        if (strArr == null || !f0(str2, strArr)) {
            return true;
        }
        if (strArr2 != null && f0(str2, strArr2)) {
            return true;
        }
        c33 c33Var3 = y53Var.f;
        y53.l(c33Var3);
        c33Var3.v.c(str, str2, "Name is reserved. Type, name");
        return false;
    }

    public final boolean K(String str) {
        y53 y53Var = (y53) this.a;
        if (TextUtils.isEmpty(str)) {
            c33 c33Var = y53Var.f;
            y53.l(c33Var);
            c33Var.v.a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            return false;
        }
        gu2.o(str);
        if (str.matches("^1:\\d+:android:[a-f0-9]+$")) {
            return true;
        }
        c33 c33Var2 = y53Var.f;
        y53.l(c33Var2);
        c33Var2.v.b(c33.M(str), "Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id");
        return false;
    }

    public final boolean K0(int i, String str, String str2) {
        y53 y53Var = (y53) this.a;
        if (str2 == null) {
            c33 c33Var = y53Var.f;
            y53.l(c33Var);
            c33Var.v.b(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.codePointCount(0, str2.length()) <= i) {
            return true;
        }
        c33 c33Var2 = y53Var.f;
        y53.l(c33Var2);
        c33Var2.v.d("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i), str2);
        return false;
    }

    public final int L0(String str) {
        if (!I0("event", str)) {
            return 2;
        }
        if (J0("event", gu2.g, ((y53) this.a).d.P(null, h13.f1) ? gu2.i : gu2.h, str)) {
            return !K0(40, "event", str) ? 2 : 0;
        }
        return 13;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x009c  */
    public final int M(String str, String str2, Object obj, Bundle bundle, List list, boolean z, boolean z2) {
        int i;
        int size;
        y53 y53Var = (y53) this.a;
        D();
        int i2 = 0;
        if (!Q0(obj)) {
            i = 0;
        } else {
            if (!z2) {
                return 21;
            }
            if (!f0(str2, g93.g)) {
                return 20;
            }
            lc3 lc3VarO = y53Var.o();
            lc3VarO.D();
            lc3VarO.F();
            if (lc3VarO.L()) {
                qf3 qf3Var = ((y53) lc3VarO.a).w;
                y53.j(qf3Var);
                if (qf3Var.p0() < 200900) {
                    return 25;
                }
            }
            boolean z3 = obj instanceof Parcelable[];
            if (z3) {
                size = ((Parcelable[]) obj).length;
            } else if (obj instanceof ArrayList) {
                size = ((ArrayList) obj).size();
            } else {
                i = 0;
            }
            if (size > 200) {
                c33 c33Var = y53Var.f;
                y53.l(c33Var);
                c33Var.X.d("Parameter array is too long; discarded. Value kind, name, array length", "param", str2, Integer.valueOf(size));
                i = 17;
                if (z3) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    if (parcelableArr.length > 200) {
                        bundle.putParcelableArray(str2, (Parcelable[]) Arrays.copyOf(parcelableArr, 200));
                    }
                } else if (obj instanceof ArrayList) {
                    ArrayList arrayList = (ArrayList) obj;
                    if (arrayList.size() > 200) {
                        bundle.putParcelableArrayList(str2, new ArrayList<>(arrayList.subList(0, 200)));
                    }
                }
            } else {
                i = 0;
            }
        }
        int iMax = 500;
        if (i0(str) || i0(str2)) {
            y53Var.d.getClass();
            iMax = Math.max(500, 256);
        } else {
            y53Var.d.getClass();
        }
        if (!I("param", str2, iMax, obj)) {
            if (!z2) {
                return 4;
            }
            if (obj instanceof Bundle) {
                J(str, str2, (Bundle) obj, list, z);
                return i;
            }
            if (obj instanceof Parcelable[]) {
                Parcelable[] parcelableArr2 = (Parcelable[]) obj;
                int length = parcelableArr2.length;
                while (i2 < length) {
                    Parcelable parcelable = parcelableArr2[i2];
                    if (!(parcelable instanceof Bundle)) {
                        c33 c33Var2 = y53Var.f;
                        y53.l(c33Var2);
                        c33Var2.X.c(parcelable.getClass(), str2, "All Parcelable[] elements must be of type Bundle. Value type, name");
                        return 4;
                    }
                    J(str, str2, (Bundle) parcelable, list, z);
                    i2++;
                }
            } else {
                if (!(obj instanceof ArrayList)) {
                    return 4;
                }
                ArrayList arrayList2 = (ArrayList) obj;
                int size2 = arrayList2.size();
                while (i2 < size2) {
                    Object obj2 = arrayList2.get(i2);
                    if (!(obj2 instanceof Bundle)) {
                        c33 c33Var3 = y53Var.f;
                        y53.l(c33Var3);
                        c33Var3.X.c(obj2 != null ? obj2.getClass() : "null", str2, "All ArrayList elements must be of type Bundle. Value type, name");
                        return 4;
                    }
                    J(str, str2, (Bundle) obj2, list, z);
                    i2++;
                }
            }
        }
        return i;
    }

    public final boolean M0(String str) {
        return ((y53) this.a).d.P(null, h13.f1) ? f0(str, gu2.k) : f0(str, gu2.j);
    }

    public final Object N(Object obj, String str) {
        y53 y53Var = (y53) this.a;
        int iMax = 500;
        if ("_ev".equals(str)) {
            y53Var.d.getClass();
            return d0(Math.max(500, 256), obj, true, true);
        }
        if (i0(str)) {
            y53Var.d.getClass();
            iMax = Math.max(500, 256);
        } else {
            y53Var.d.getClass();
        }
        return d0(iMax, obj, false, true);
    }

    public final int N0(String str) {
        if (!I0("user property", str)) {
            return 6;
        }
        if (!J0("user property", r93.i, null, str)) {
            return 15;
        }
        ((y53) this.a).getClass();
        return !K0(24, "user property", str) ? 6 : 0;
    }

    public final Bundle O(String str, Bundle bundle, List list, boolean z) {
        int iO0;
        boolean zF0 = f0(str, gu2.m);
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = new Bundle(bundle);
        y53 y53Var = (y53) this.a;
        is2 is2Var = y53Var.d;
        p23 p23Var = y53Var.W;
        qf3 qf3Var = ((y53) is2Var.a).w;
        y53.j(qf3Var);
        int i = qf3Var.o0(201500000) ? 100 : 25;
        int i2 = 0;
        boolean z2 = false;
        for (String str2 : new TreeSet(bundle.keySet())) {
            if (list == 0 || !list.contains(str2)) {
                iO0 = !z ? O0(str2) : 0;
                if (iO0 == 0) {
                    iO0 = P0(str2);
                }
            } else {
                iO0 = 0;
            }
            if (iO0 != 0) {
                S(bundle2, iO0, str2, iO0 == 3 ? str2 : null);
                bundle2.remove(str2);
            } else {
                int iM = M(str, str2, bundle.get(str2), bundle2, list, z, zF0);
                if (iM == 17) {
                    S(bundle2, 17, str2, Boolean.FALSE);
                } else if (iM != 0 && !"_ev".equals(str2)) {
                    S(bundle2, iM, iM == 21 ? str : str2, bundle.get(str2));
                    bundle2.remove(str2);
                }
                if (E0(str2)) {
                    i2++;
                    if (i2 > i) {
                        if (!z2) {
                            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 37);
                            sb.append("Event can't contain more than ");
                            sb.append(i);
                            sb.append(" params");
                            String string = sb.toString();
                            c33 c33Var = y53Var.f;
                            y53.l(c33Var);
                            c33Var.v.c(p23Var.a(str), p23Var.e(bundle), string);
                        }
                        c0(5, bundle2);
                        bundle2.remove(str2);
                        z2 = true;
                    }
                }
            }
        }
        return bundle2;
    }

    public final int O0(String str) {
        if (!H0("event param", str)) {
            return 3;
        }
        if (!J0("event param", null, null, str)) {
            return 14;
        }
        ((y53) this.a).getClass();
        return !K0(40, "event param", str) ? 3 : 0;
    }

    public final void P(f33 f33Var, int i) {
        Bundle bundle = f33Var.e;
        int i2 = 0;
        boolean z = false;
        for (String str : new TreeSet(bundle.keySet())) {
            if (E0(str) && (i2 = i2 + 1) > i) {
                if (!z) {
                    StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 37);
                    sb.append("Event can't contain more than ");
                    sb.append(i);
                    sb.append(" params");
                    String string = sb.toString();
                    y53 y53Var = (y53) this.a;
                    c33 c33Var = y53Var.f;
                    p23 p23Var = y53Var.W;
                    y53.l(c33Var);
                    c33Var.v.c(p23Var.a(f33Var.a), p23Var.e(bundle), string);
                    c0(5, bundle);
                }
                bundle.remove(str);
                z = true;
            }
        }
    }

    public final int P0(String str) {
        if (!I0("event param", str)) {
            return 3;
        }
        if (!J0("event param", null, null, str)) {
            return 14;
        }
        ((y53) this.a).getClass();
        return !K0(40, "event param", str) ? 3 : 0;
    }

    public final void Q(Parcelable[] parcelableArr, int i) {
        gu2.o(parcelableArr);
        for (Parcelable parcelable : parcelableArr) {
            Bundle bundle = (Bundle) parcelable;
            int i2 = 0;
            boolean z = false;
            for (String str : new TreeSet(bundle.keySet())) {
                if (E0(str) && !f0(str, g93.h) && (i2 = i2 + 1) > i) {
                    if (!z) {
                        y53 y53Var = (y53) this.a;
                        c33 c33Var = y53Var.f;
                        p23 p23Var = y53Var.W;
                        y53.l(c33Var);
                        z23 z23Var = c33Var.v;
                        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 60);
                        sb.append("Param can't contain more than ");
                        sb.append(i);
                        sb.append(" item-scoped custom parameters");
                        z23Var.c(p23Var.b(str), p23Var.e(bundle), sb.toString());
                    }
                    c0(28, bundle);
                    bundle.remove(str);
                    z = true;
                }
            }
        }
    }

    public final void R(Bundle bundle, Bundle bundle2) {
        if (bundle2 == null) {
            return;
        }
        for (String str : bundle2.keySet()) {
            if (!bundle.containsKey(str)) {
                qf3 qf3Var = ((y53) this.a).w;
                y53.j(qf3Var);
                qf3Var.V(bundle, str, bundle2.get(str));
            }
        }
    }

    public final void S(Bundle bundle, int i, String str, Object obj) {
        if (c0(i, bundle)) {
            ((y53) this.a).getClass();
            bundle.putString("_ev", L(40, str, true));
            if (obj != null) {
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", obj.toString().length());
                }
            }
        }
    }

    public final int T(Object obj, String str) {
        return "_ldl".equals(str) ? I("user property referrer", str, e0(str), obj) : I("user property", str, e0(str), obj) ? 0 : 7;
    }

    public final Object U(Object obj, String str) {
        return "_ldl".equals(str) ? d0(e0(str), obj, true, false) : d0(e0(str), obj, false, false);
    }

    public final void V(Bundle bundle, String str, Object obj) {
        if (bundle == null) {
            return;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
            return;
        }
        if (obj instanceof String) {
            bundle.putString(str, String.valueOf(obj));
            return;
        }
        if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
            return;
        }
        if (obj instanceof Bundle[]) {
            bundle.putParcelableArray(str, (Bundle[]) obj);
            return;
        }
        if (str != null) {
            String simpleName = obj != null ? obj.getClass().getSimpleName() : null;
            y53 y53Var = (y53) this.a;
            c33 c33Var = y53Var.f;
            y53.l(c33Var);
            c33Var.X.c(y53Var.W.b(str), simpleName, "Not putting event parameter. Invalid value type. name, type");
        }
    }

    public final v21 a0() {
        x21 u21Var;
        Object objInvoke;
        if (this.f == null) {
            Context context = ((y53) this.a).a;
            context.getClass();
            StringBuilder sb = new StringBuilder("AdServicesInfo.version=");
            int i = Build.VERSION.SDK_INT;
            r5 r5Var = r5.a;
            sb.append(i >= 33 ? r5Var.a() : 0);
            Log.d("MeasurementManager", sb.toString());
            if ((i >= 33 ? r5Var.a() : 0) >= 5) {
                Object systemService = context.getSystemService((Class<Object>) vi0.s());
                systemService.getClass();
                u21Var = new u21(vi0.r(systemService));
            } else {
                q5 q5Var = q5.a;
                if (((i == 31 || i == 32) ? q5Var.a() : 0) >= 9) {
                    try {
                        objInvoke = new ux(context, 2).invoke(context);
                    } catch (NoClassDefFoundError unused) {
                        StringBuilder sb2 = new StringBuilder("Unable to find adservices code, check manifest for uses-library tag, versionS=");
                        int i2 = Build.VERSION.SDK_INT;
                        sb2.append((i2 == 31 || i2 == 32) ? q5Var.a() : 0);
                        Log.d("MeasurementManager", sb2.toString());
                        objInvoke = null;
                    }
                    u21Var = (x21) objInvoke;
                } else {
                    u21Var = null;
                }
            }
            this.f = u21Var != null ? new v21(u21Var) : null;
        }
        return this.f;
    }

    public final long b0() {
        long j;
        Object e;
        Integer num;
        D();
        y53 y53Var = (y53) this.a;
        e23 e23VarQ = y53Var.q();
        c33 c33Var = y53Var.f;
        Integer num2 = null;
        if (!g0((String) h13.q0.a(null), e23VarQ.K())) {
            return 0L;
        }
        int i = Build.VERSION.SDK_INT;
        boolean zBooleanValue = false;
        if (i < 30) {
            j = 4;
        } else if (SdkExtensions.getExtensionVersion(30) < 4) {
            j = 8;
        } else {
            j = ((i < 30 || SdkExtensions.getExtensionVersion(30) <= 3) ? 0 : SdkExtensions.getExtensionVersion(1000000)) < ((Integer) h13.k0.a(null)).intValue() ? 16L : 0L;
        }
        if (!h0("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")) {
            j |= 2;
        }
        if (j == 0) {
            if (this.i != null) {
                zBooleanValue = this.i.booleanValue();
            } else {
                v21 v21VarA0 = a0();
                if (v21VarA0 != null) {
                    try {
                        num = (Integer) v21VarA0.b().get(10000L, TimeUnit.MILLISECONDS);
                        if (num != null) {
                            try {
                                if (num.intValue() == 1) {
                                    zBooleanValue = true;
                                }
                            } catch (InterruptedException e2) {
                                e = e2;
                                num2 = num;
                                y53.l(c33Var);
                                c33Var.w.b(e, "Measurement manager api exception");
                                this.i = Boolean.FALSE;
                                num = num2;
                            } catch (CancellationException e3) {
                                e = e3;
                                num2 = num;
                                y53.l(c33Var);
                                c33Var.w.b(e, "Measurement manager api exception");
                                this.i = Boolean.FALSE;
                                num = num2;
                            } catch (ExecutionException e4) {
                                e = e4;
                                num2 = num;
                                y53.l(c33Var);
                                c33Var.w.b(e, "Measurement manager api exception");
                                this.i = Boolean.FALSE;
                                num = num2;
                            } catch (TimeoutException e5) {
                                e = e5;
                                num2 = num;
                                y53.l(c33Var);
                                c33Var.w.b(e, "Measurement manager api exception");
                                this.i = Boolean.FALSE;
                                num = num2;
                            }
                        }
                        this.i = Boolean.valueOf(zBooleanValue);
                    } catch (InterruptedException | CancellationException | ExecutionException | TimeoutException e6) {
                        e = e6;
                    }
                    y53.l(c33Var);
                    c33Var.a0.b(num, "Measurement manager api status result");
                    zBooleanValue = this.i.booleanValue();
                }
            }
            if (!zBooleanValue) {
                j = 64;
            }
        }
        if (j == 0) {
            return 1L;
        }
        return j;
    }

    public final Object d0(int i, Object obj, boolean z, boolean z2) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf(((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf(((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(true != ((Boolean) obj).booleanValue() ? 0L : 1L);
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
            return L(i, obj.toString(), z);
        }
        if (!z2) {
            return null;
        }
        if (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[])) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Parcelable parcelable : (Parcelable[]) obj) {
            if (parcelable instanceof Bundle) {
                Bundle bundleK0 = k0((Bundle) parcelable);
                if (!bundleK0.isEmpty()) {
                    arrayList.add(bundleK0);
                }
            }
        }
        return arrayList.toArray(new Bundle[arrayList.size()]);
    }

    public final int e0(String str) {
        y53 y53Var = (y53) this.a;
        if ("_ldl".equals(str)) {
            y53Var.getClass();
            return 2048;
        }
        if ("_id".equals(str)) {
            y53Var.getClass();
            return 256;
        }
        if ("_lgclid".equals(str)) {
            y53Var.getClass();
            return 100;
        }
        y53Var.getClass();
        return 36;
    }

    public final boolean h0(String str) {
        D();
        y53 y53Var = (y53) this.a;
        if (la2.a(y53Var.a).b.checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        c33 c33Var = y53Var.f;
        y53.l(c33Var);
        c33Var.Z.b(str, "Permission not granted");
        return false;
    }

    public final boolean j0(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            return true;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return ((y53) this.a).d.I("debug.firebase.analytics.app").equals(str);
    }

    public final Bundle k0(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object objN = N(bundle.get(str), str);
                if (objN == null) {
                    y53 y53Var = (y53) this.a;
                    c33 c33Var = y53Var.f;
                    y53.l(c33Var);
                    c33Var.X.b(y53Var.W.b(str), "Param value can't be null");
                } else {
                    V(bundle2, str, objN);
                }
            }
        }
        return bundle2;
    }

    public final zzbh l0(String str, Bundle bundle, String str2, long j, long j2, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (L0(str) != 0) {
            y53 y53Var = (y53) this.a;
            c33 c33Var = y53Var.f;
            y53.l(c33Var);
            c33Var.f.b(y53Var.W.c(str), "Invalid conditional property event name");
            sm0.a();
            return null;
        }
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        bundle2.putString("_o", str2);
        Bundle bundleO = O(str, bundle2, Collections.singletonList("_o"), true);
        if (z) {
            bundleO = k0(bundleO);
        }
        gu2.o(bundleO);
        return new zzbh(str, new zzbf(bundleO), str2, j, j2);
    }

    public final boolean m0(Context context, String str) {
        Signature[] signatureArr;
        y53 y53Var = (y53) this.a;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo packageInfoB = la2.a(context).b(64, str);
            if (packageInfoB == null || (signatureArr = packageInfoB.signatures) == null || signatureArr.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (PackageManager.NameNotFoundException e) {
            c33 c33Var = y53Var.f;
            y53.l(c33Var);
            c33Var.f.b(e, "Package name not found");
            return true;
        } catch (CertificateException e2) {
            c33 c33Var2 = y53Var.f;
            y53.l(c33Var2);
            c33Var2.f.b(e2, "Error obtaining certificate");
            return true;
        }
    }

    public final boolean o0(int i) {
        Boolean bool = ((y53) this.a).o().e;
        if (p0() < i / 1000) {
            return (bool == null || bool.booleanValue()) ? false : true;
        }
        return true;
    }

    public final int p0() {
        if (this.v == null) {
            y53 y53Var = (y53) this.a;
            rj0 rj0Var = rj0.b;
            Context context = y53Var.a;
            rj0Var.getClass();
            int i = xj0.e;
            int i2 = 0;
            try {
                i2 = context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            }
            this.v = Integer.valueOf(i2 / 1000);
        }
        return this.v.intValue();
    }

    public final void q0(Bundle bundle, long j) {
        long j2 = bundle.getLong("_et");
        if (j2 != 0) {
            c33 c33Var = ((y53) this.a).f;
            y53.l(c33Var);
            c33Var.w.b(Long.valueOf(j2), "Params already contained engagement");
        } else {
            j2 = 0;
        }
        bundle.putLong("_et", j + j2);
    }

    public final void r0(String str, hx2 hx2Var) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            hx2Var.k(bundle);
        } catch (RemoteException e) {
            c33 c33Var = ((y53) this.a).f;
            y53.l(c33Var);
            c33Var.w.b(e, "Error returning string value to wrapper");
        }
    }

    public final void s0(hx2 hx2Var, long j) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j);
        try {
            hx2Var.k(bundle);
        } catch (RemoteException e) {
            c33 c33Var = ((y53) this.a).f;
            y53.l(c33Var);
            c33Var.w.b(e, "Error returning long value to wrapper");
        }
    }

    public final void t0(hx2 hx2Var, int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i);
        try {
            hx2Var.k(bundle);
        } catch (RemoteException e) {
            c33 c33Var = ((y53) this.a).f;
            y53.l(c33Var);
            c33Var.w.b(e, "Error returning int value to wrapper");
        }
    }

    public final void u0(hx2 hx2Var, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            hx2Var.k(bundle);
        } catch (RemoteException e) {
            c33 c33Var = ((y53) this.a).f;
            y53.l(c33Var);
            c33Var.w.b(e, "Error returning byte array to wrapper");
        }
    }

    public final void v0(hx2 hx2Var, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z);
        try {
            hx2Var.k(bundle);
        } catch (RemoteException e) {
            c33 c33Var = ((y53) this.a).f;
            y53.l(c33Var);
            c33Var.w.b(e, "Error returning boolean value to wrapper");
        }
    }

    public final void w0(hx2 hx2Var, Bundle bundle) {
        try {
            hx2Var.k(bundle);
        } catch (RemoteException e) {
            c33 c33Var = ((y53) this.a).f;
            y53.l(c33Var);
            c33Var.w.b(e, "Error returning bundle value to wrapper");
        }
    }

    public final void x0(hx2 hx2Var, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            hx2Var.k(bundle);
        } catch (RemoteException e) {
            c33 c33Var = ((y53) this.a).f;
            y53.l(c33Var);
            c33Var.w.b(e, "Error returning bundle list to wrapper");
        }
    }
}
