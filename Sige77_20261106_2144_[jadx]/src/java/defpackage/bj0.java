package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.telephony.TelephonyManager;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.view.inputmethod.EditorInfo;
import androidx.lifecycle.SavedStateHandleAttacher;
import com.hjq.toast.BuildConfig;
import java.io.File;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.ClassBasedDeclarationContainer;
import kotlin.jvm.internal.Reflection;
import kotlin.text.Charsets;
import kotlin.text.Regex;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class bj0 {
    public static final xn b;
    public static final ba0 c;
    public static final vi d;
    public static boolean f = false;
    public static int g = 0;
    public static int h = -1;
    public static nb2 i;
    public static final String[] a = new String[0];
    public static final Object e = new Object();

    static {
        int i2 = 9;
        b = new xn(i2);
        c = new ba0(i2);
        d = new vi(i2);
    }

    public static void A(Parcel parcel, int i2, IBinder iBinder) {
        if (iBinder == null) {
            return;
        }
        int iO = O(parcel, i2);
        parcel.writeStrongBinder(iBinder);
        P(parcel, iO);
    }

    public static void B(Parcel parcel, int i2, int[] iArr) {
        if (iArr == null) {
            return;
        }
        int iO = O(parcel, i2);
        parcel.writeIntArray(iArr);
        P(parcel, iO);
    }

    public static void C(Parcel parcel, int i2, Integer num) {
        if (num == null) {
            return;
        }
        N(parcel, i2, 4);
        parcel.writeInt(num.intValue());
    }

    public static void D(Parcel parcel, int i2, Long l) {
        if (l == null) {
            return;
        }
        N(parcel, i2, 8);
        parcel.writeLong(l.longValue());
    }

    public static void E(Parcel parcel, int i2, Parcelable parcelable, int i3, boolean z) {
        if (parcelable == null) {
            if (z) {
                N(parcel, i2, 0);
            }
        } else {
            int iO = O(parcel, i2);
            parcelable.writeToParcel(parcel, i3);
            P(parcel, iO);
        }
    }

    public static void F(Parcel parcel, int i2, String str, boolean z) {
        if (str == null) {
            if (z) {
                N(parcel, i2, 0);
            }
        } else {
            int iO = O(parcel, i2);
            parcel.writeString(str);
            P(parcel, iO);
        }
    }

    public static void G(Parcel parcel, int i2, String[] strArr) {
        if (strArr == null) {
            return;
        }
        int iO = O(parcel, i2);
        parcel.writeStringArray(strArr);
        P(parcel, iO);
    }

    public static void H(Parcel parcel, int i2, List list) {
        if (list == null) {
            return;
        }
        int iO = O(parcel, i2);
        parcel.writeStringList(list);
        P(parcel, iO);
    }

    public static void I(Parcel parcel, int i2, Parcelable[] parcelableArr, int i3) {
        if (parcelableArr == null) {
            return;
        }
        int iO = O(parcel, i2);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int iDataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int iDataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, i3);
                int iDataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(iDataPosition);
                parcel.writeInt(iDataPosition3 - iDataPosition2);
                parcel.setDataPosition(iDataPosition3);
            }
        }
        P(parcel, iO);
    }

    public static void J(Parcel parcel, int i2, List list, boolean z) {
        if (list == null) {
            if (z) {
                N(parcel, i2, 0);
                return;
            }
            return;
        }
        int iO = O(parcel, i2);
        int size = list.size();
        parcel.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            Parcelable parcelable = (Parcelable) list.get(i3);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int iDataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int iDataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, 0);
                int iDataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(iDataPosition);
                parcel.writeInt(iDataPosition3 - iDataPosition2);
                parcel.setDataPosition(iDataPosition3);
            }
        }
        P(parcel, iO);
    }

    public static int K(int i2) {
        int[] iArr = {1, 2, 3};
        for (int i3 = 0; i3 < 3; i3++) {
            int i4 = iArr[i3];
            int i5 = i4 - 1;
            if (i4 == 0) {
                throw null;
            }
            if (i5 == i2) {
                return i4;
            }
        }
        return 1;
    }

    public static final File L(Uri uri) throws tn {
        if (!uri.getScheme().equals("file")) {
            throw new tn("Scheme must be 'file'");
        }
        if (!TextUtils.isEmpty(uri.getQuery())) {
            throw new tn("Did not expect uri to have query");
        }
        if (TextUtils.isEmpty(uri.getAuthority())) {
            return new File(uri.getPath());
        }
        throw new tn("Did not expect uri to have authority");
    }

    public static String M() {
        Locale locale = Locale.getDefault();
        StringBuilder sb = new StringBuilder();
        String language = locale.getLanguage();
        if (language != null) {
            sb.append(language);
            String country = locale.getCountry();
            if (country != null) {
                sb.append("-");
                sb.append(country);
            }
        }
        Locale locale2 = Locale.US;
        if (!locale.equals(locale2)) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            String language2 = locale2.getLanguage();
            if (language2 != null) {
                sb.append(language2);
                String country2 = locale2.getCountry();
                if (country2 != null) {
                    sb.append("-");
                    sb.append(country2);
                }
            }
        }
        return sb.toString();
    }

    public static void N(Parcel parcel, int i2, int i3) {
        parcel.writeInt(i2 | (i3 << 16));
    }

    public static int O(Parcel parcel, int i2) {
        parcel.writeInt(i2 | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static void P(Parcel parcel, int i2) {
        int iDataPosition = parcel.dataPosition();
        parcel.setDataPosition(i2 - 4);
        parcel.writeInt(iDataPosition - i2);
        parcel.setDataPosition(iDataPosition);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0029  */
    public static int a(Context context) {
        int subtype;
        String subtypeName;
        ConnectivityManager connectivityManager;
        NetworkInfo activeNetworkInfo;
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (telephonyManager == null) {
            subtype = 0;
        } else if (Build.VERSION.SDK_INT < 30) {
            subtype = telephonyManager.getNetworkType();
        } else if (sp0.d(context, "android.permission.READ_PHONE_STATE") == 0 || telephonyManager.hasCarrierPrivileges()) {
            subtype = telephonyManager.getDataNetworkType();
        } else {
            subtype = 0;
        }
        if (subtype != 0 || (connectivityManager = (ConnectivityManager) context.getApplicationContext().getSystemService("connectivity")) == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
            subtypeName = BuildConfig.FLAVOR;
        } else {
            subtype = activeNetworkInfo.getSubtype();
            subtypeName = activeNetworkInfo.getSubtypeName();
        }
        switch (subtype) {
            case 1:
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
            case oc1.LONG_FIELD_NUMBER /* 4 */:
            case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
            case 11:
            case 16:
                return 2;
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
            case oc1.STRING_FIELD_NUMBER /* 5 */:
            case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
            case oc1.BYTES_FIELD_NUMBER /* 8 */:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
            case 17:
                return 3;
            case 13:
            case 18:
            case 19:
                return 4;
            case 20:
                return 5;
            default:
                if (TextUtils.isEmpty(subtypeName)) {
                    return 99;
                }
                return (subtypeName.equalsIgnoreCase("TD-SCDMA") || subtypeName.equalsIgnoreCase("WCDMA") || subtypeName.equalsIgnoreCase("CDMA2000")) ? 3 : 0;
        }
    }

    public static int b(Context context) {
        NetworkCapabilities networkCapabilities;
        NetworkCapabilities networkCapabilities2;
        NetworkCapabilities networkCapabilities3;
        int i2 = h;
        if (i2 != -1 && i2 != 0 && i2 != 99) {
            return i2;
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (!c(connectivityManager)) {
                h = 99;
                return 99;
            }
            Network activeNetwork = connectivityManager.getActiveNetwork();
            boolean zHasTransport = false;
            if ((activeNetwork == null || (networkCapabilities3 = connectivityManager.getNetworkCapabilities(activeNetwork)) == null) ? false : networkCapabilities3.hasTransport(1)) {
                h = 1;
            } else {
                Network activeNetwork2 = connectivityManager.getActiveNetwork();
                if ((activeNetwork2 == null || (networkCapabilities2 = connectivityManager.getNetworkCapabilities(activeNetwork2)) == null) ? false : networkCapabilities2.hasTransport(3)) {
                    h = 6;
                } else {
                    Network activeNetwork3 = connectivityManager.getActiveNetwork();
                    if (activeNetwork3 != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork3)) != null) {
                        zHasTransport = networkCapabilities.hasTransport(0);
                    }
                    if (zHasTransport) {
                        h = a(context);
                    } else {
                        h = 100;
                    }
                }
            }
            return h;
        } catch (Exception unused) {
            return 99;
        }
    }

    public static boolean c(ConnectivityManager connectivityManager) {
        Network activeNetwork;
        NetworkCapabilities networkCapabilities;
        if (connectivityManager == null || (activeNetwork = connectivityManager.getActiveNetwork()) == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null) {
            return false;
        }
        return networkCapabilities.hasTransport(1) || networkCapabilities.hasTransport(0) || networkCapabilities.hasTransport(3) || networkCapabilities.hasTransport(4) || networkCapabilities.hasCapability(16);
    }

    public static boolean d(Context context) {
        try {
            return c((ConnectivityManager) context.getSystemService("connectivity"));
        } catch (Exception e2) {
            b81 b81Var = cc2.a;
            cc2.c(Log.getStackTraceString(e2));
            return false;
        }
    }

    public static final ol1 e(c61 c61Var) {
        LinkedHashMap linkedHashMap = c61Var.a;
        vl1 vl1Var = (vl1) linkedHashMap.get(b);
        if (vl1Var == null) {
            e.g("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
            return null;
        }
        q62 q62Var = (q62) linkedHashMap.get(c);
        if (q62Var == null) {
            e.g("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
            return null;
        }
        Bundle bundle = (Bundle) linkedHashMap.get(d);
        String str = (String) linkedHashMap.get(br0.f);
        if (str == null) {
            e.g("CreationExtras must have a value by `VIEW_MODEL_KEY`");
            return null;
        }
        tl1 tl1VarB = vl1Var.getSavedStateRegistry().b();
        pl1 pl1Var = tl1VarB instanceof pl1 ? (pl1) tl1VarB : null;
        if (pl1Var == null) {
            uq1.q("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
            return null;
        }
        ql1 ql1VarN = n(q62Var);
        ol1 ol1Var = (ol1) ql1VarN.d.get(str);
        if (ol1Var != null) {
            return ol1Var;
        }
        Class[] clsArr = ol1.f;
        pl1Var.b();
        Bundle bundle2 = pl1Var.c;
        Bundle bundle3 = bundle2 != null ? bundle2.getBundle(str) : null;
        Bundle bundle4 = pl1Var.c;
        if (bundle4 != null) {
            bundle4.remove(str);
        }
        Bundle bundle5 = pl1Var.c;
        if (bundle5 != null && bundle5.isEmpty()) {
            pl1Var.c = null;
        }
        ol1 ol1VarR = rq0.r(bundle3, bundle);
        ql1VarN.d.put(str, ol1VarR);
        return ol1VarR;
    }

    public static void f(StringBuilder sb, Object obj, HashMap map) {
        if (obj == null) {
            sb.append("null");
            return;
        }
        if (!obj.getClass().isArray()) {
            try {
                sb.append(obj.toString());
                return;
            } catch (Throwable unused) {
                sb.append("[FAILED toString()]");
                return;
            }
        }
        int i2 = 0;
        if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            sb.append('[');
            int length = zArr.length;
            while (i2 < length) {
                sb.append(zArr[i2]);
                if (i2 != length - 1) {
                    sb.append(", ");
                }
                i2++;
            }
            sb.append(']');
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            sb.append('[');
            int length2 = bArr.length;
            while (i2 < length2) {
                sb.append((int) bArr[i2]);
                if (i2 != length2 - 1) {
                    sb.append(", ");
                }
                i2++;
            }
            sb.append(']');
            return;
        }
        if (obj instanceof char[]) {
            char[] cArr = (char[]) obj;
            sb.append('[');
            int length3 = cArr.length;
            while (i2 < length3) {
                sb.append(cArr[i2]);
                if (i2 != length3 - 1) {
                    sb.append(", ");
                }
                i2++;
            }
            sb.append(']');
            return;
        }
        if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            sb.append('[');
            int length4 = sArr.length;
            while (i2 < length4) {
                sb.append((int) sArr[i2]);
                if (i2 != length4 - 1) {
                    sb.append(", ");
                }
                i2++;
            }
            sb.append(']');
            return;
        }
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            sb.append('[');
            int length5 = iArr.length;
            while (i2 < length5) {
                sb.append(iArr[i2]);
                if (i2 != length5 - 1) {
                    sb.append(", ");
                }
                i2++;
            }
            sb.append(']');
            return;
        }
        if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            sb.append('[');
            int length6 = jArr.length;
            while (i2 < length6) {
                sb.append(jArr[i2]);
                if (i2 != length6 - 1) {
                    sb.append(", ");
                }
                i2++;
            }
            sb.append(']');
            return;
        }
        if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            sb.append('[');
            int length7 = fArr.length;
            while (i2 < length7) {
                sb.append(fArr[i2]);
                if (i2 != length7 - 1) {
                    sb.append(", ");
                }
                i2++;
            }
            sb.append(']');
            return;
        }
        if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            sb.append('[');
            int length8 = dArr.length;
            while (i2 < length8) {
                sb.append(dArr[i2]);
                if (i2 != length8 - 1) {
                    sb.append(", ");
                }
                i2++;
            }
            sb.append(']');
            return;
        }
        Object[] objArr = (Object[]) obj;
        sb.append('[');
        if (map.containsKey(objArr)) {
            sb.append("...");
        } else {
            map.put(objArr, null);
            int length9 = objArr.length;
            while (i2 < length9) {
                f(sb, objArr[i2], map);
                if (i2 != length9 - 1) {
                    sb.append(", ");
                }
                i2++;
            }
            map.remove(objArr);
        }
        sb.append(']');
    }

    public static void g(ArrayList arrayList) {
        HashMap map = new HashMap(arrayList.size());
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            aq aqVar = (aq) obj;
            vv vvVar = new vv(aqVar);
            for (je1 je1Var : aqVar.b) {
                boolean z = aqVar.e == 0;
                wv wvVar = new wv(je1Var, !z);
                if (!map.containsKey(wvVar)) {
                    map.put(wvVar, new HashSet());
                }
                Set set = (Set) map.get(wvVar);
                if (!set.isEmpty() && z) {
                    uq1.e(je1Var, ".", "Multiple components provide ");
                    return;
                }
                set.add(vvVar);
            }
        }
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            for (vv vvVar2 : (Set) it.next()) {
                for (u00 u00Var : vvVar2.a.c) {
                    if (u00Var.c == 0) {
                        Set<vv> set2 = (Set) map.get(new wv(u00Var.a, u00Var.b == 2));
                        if (set2 != null) {
                            for (vv vvVar3 : set2) {
                                vvVar2.b.add(vvVar3);
                                vvVar3.c.add(vvVar2);
                            }
                        }
                    }
                }
            }
        }
        HashSet<vv> hashSet = new HashSet();
        Iterator it2 = map.values().iterator();
        while (it2.hasNext()) {
            hashSet.addAll((Set) it2.next());
        }
        HashSet hashSet2 = new HashSet();
        for (vv vvVar4 : hashSet) {
            if (vvVar4.c.isEmpty()) {
                hashSet2.add(vvVar4);
            }
        }
        while (!hashSet2.isEmpty()) {
            vv vvVar5 = (vv) hashSet2.iterator().next();
            hashSet2.remove(vvVar5);
            i2++;
            for (vv vvVar6 : vvVar5.b) {
                vvVar6.c.remove(vvVar5);
                if (vvVar6.c.isEmpty()) {
                    hashSet2.add(vvVar6);
                }
            }
        }
        if (i2 == arrayList.size()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        for (vv vvVar7 : hashSet) {
            if (!vvVar7.c.isEmpty() && !vvVar7.b.isEmpty()) {
                arrayList2.add(vvVar7.a);
            }
        }
        throw new w00("Dependency cycle detected: " + Arrays.toString(arrayList2.toArray()), 1);
    }

    public static final void h(vl1 vl1Var) {
        lw0 lw0Var = vl1Var.getLifecycle().c;
        if (lw0Var != lw0.b && lw0Var != lw0.c) {
            e.g("Failed requirement.");
        } else if (vl1Var.getSavedStateRegistry().b() == null) {
            pl1 pl1Var = new pl1(vl1Var.getSavedStateRegistry(), (q62) vl1Var);
            vl1Var.getSavedStateRegistry().c("androidx.lifecycle.internal.SavedStateHandlesProvider", pl1Var);
            vl1Var.getLifecycle().a(new SavedStateHandleAttacher(pl1Var));
        }
    }

    public static int i(int i2) {
        int i3 = i2 & 65535;
        int i4 = (i3 | (i3 << 8)) & 16711935;
        int i5 = (i4 | (i4 << 4)) & 252645135;
        int i6 = (i5 | (i5 << 2)) & 858993459;
        return (i6 | (i6 << 1)) & 1431655765;
    }

    public static long j(int i2) {
        int i3 = ((i2 >>> 8) ^ i2) & 65280;
        int i4 = i2 ^ (i3 ^ (i3 << 8));
        int i5 = ((i4 >>> 4) ^ i4) & 15728880;
        int i6 = i4 ^ (i5 ^ (i5 << 4));
        int i7 = ((i6 >>> 2) ^ i6) & 202116108;
        int i8 = i6 ^ (i7 ^ (i7 << 2));
        int i9 = ((i8 >>> 1) ^ i8) & 572662306;
        int i10 = i8 ^ (i9 ^ (i9 << 1));
        return ((((long) (i10 >>> 1)) & 1431655765) << 32) | (1431655765 & ((long) i10));
    }

    public static void k(int i2, long j, long[] jArr) {
        long j2 = ((j >>> 16) ^ j) & 4294901760L;
        long j3 = j ^ (j2 ^ (j2 << 16));
        long j4 = ((j3 >>> 8) ^ j3) & 280375465148160L;
        long j5 = j3 ^ (j4 ^ (j4 << 8));
        long j6 = ((j5 >>> 4) ^ j5) & 67555025218437360L;
        long j7 = j5 ^ (j6 ^ (j6 << 4));
        long j8 = ((j7 >>> 2) ^ j7) & 868082074056920076L;
        long j9 = j7 ^ (j8 ^ (j8 << 2));
        long j10 = ((j9 >>> 1) ^ j9) & 2459565876494606882L;
        long j11 = j9 ^ (j10 ^ (j10 << 1));
        jArr[i2] = j11 & 6148914691236517205L;
        jArr[i2 + 1] = (j11 >>> 1) & 6148914691236517205L;
    }

    public static int l(int i2) {
        int i3 = i2 & 255;
        int i4 = (i3 | (i3 << 4)) & 3855;
        int i5 = (i4 | (i4 << 2)) & 13107;
        return (i5 | (i5 << 1)) & 21845;
    }

    public static final String m(String str) {
        if (!p(str)) {
            throw new d90("Invalid Code Verifier.");
        }
        try {
            byte[] bytes = str.getBytes(Charsets.d);
            bytes.getClass();
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(bytes, 0, bytes.length);
            String strEncodeToString = Base64.encodeToString(messageDigest.digest(), 11);
            strEncodeToString.getClass();
            return strEncodeToString;
        } catch (Exception e2) {
            throw new d90(e2);
        }
    }

    public static final ql1 n(q62 q62Var) {
        ArrayList arrayList = new ArrayList();
        sm smVar = sm.e;
        ClassBasedDeclarationContainer orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ql1.class);
        orCreateKotlinClass.getClass();
        smVar.getClass();
        Class jClass = orCreateKotlinClass.getJClass();
        jClass.getClass();
        arrayList.add(new m62(jClass, smVar));
        m62[] m62VarArr = (m62[]) arrayList.toArray(new m62[0]);
        return (ql1) new p11(q62Var, new fq0((m62[]) Arrays.copyOf(m62VarArr, m62VarArr.length))).d(ql1.class, "androidx.lifecycle.internal.SavedStateHandlesVM");
    }

    public static final boolean p(String str) {
        if (str.length() != 0 && str.length() >= 43 && str.length() <= 128) {
            return new Regex("^[-._~A-Za-z0-9]+$").c(str);
        }
        return false;
    }

    public static void r(EditorInfo editorInfo, CharSequence charSequence, int i2, int i3) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i2);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i3);
    }

    public static final void t(Function2 function2, e0 e0Var, e0 e0Var2) {
        try {
            fs fsVarB = sr0.b(sr0.a(e0Var, e0Var2, function2));
            pj1 pj1Var = rj1.b;
            yi0.o(fsVarB, Unit.a);
        } catch (Throwable th) {
            pj1 pj1Var2 = rj1.b;
            e0Var2.resumeWith(new qj1(th));
            throw th;
        }
    }

    public static long u(long j) {
        long j2 = ((j >>> 1) ^ j) & 2459565876494606882L;
        long j3 = j ^ (j2 ^ (j2 << 1));
        long j4 = ((j3 >>> 2) ^ j3) & 868082074056920076L;
        long j5 = j3 ^ (j4 ^ (j4 << 2));
        long j6 = ((j5 >>> 4) ^ j5) & 67555025218437360L;
        long j7 = j5 ^ (j6 ^ (j6 << 4));
        long j8 = ((j7 >>> 8) ^ j7) & 280375465148160L;
        long j9 = j7 ^ (j8 ^ (j8 << 8));
        long j10 = ((j9 >>> 16) ^ j9) & 4294901760L;
        return j9 ^ (j10 ^ (j10 << 16));
    }

    public static void v(Parcel parcel, int i2, Boolean bool) {
        if (bool == null) {
            return;
        }
        N(parcel, i2, 4);
        parcel.writeInt(bool.booleanValue() ? 1 : 0);
    }

    public static void w(Parcel parcel, int i2, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        int iO = O(parcel, i2);
        parcel.writeBundle(bundle);
        P(parcel, iO);
    }

    public static void x(Parcel parcel, int i2, byte[] bArr, boolean z) {
        if (bArr == null) {
            if (z) {
                N(parcel, i2, 0);
            }
        } else {
            int iO = O(parcel, i2);
            parcel.writeByteArray(bArr);
            P(parcel, iO);
        }
    }

    public static void y(Parcel parcel, int i2, byte[][] bArr) {
        if (bArr == null) {
            return;
        }
        int iO = O(parcel, i2);
        parcel.writeInt(bArr.length);
        for (byte[] bArr2 : bArr) {
            parcel.writeByteArray(bArr2);
        }
        P(parcel, iO);
    }

    public static void z(Parcel parcel, int i2, Double d2) {
        if (d2 == null) {
            return;
        }
        N(parcel, i2, 8);
        parcel.writeDouble(d2.doubleValue());
    }

    public abstract float o(zp1 zp1Var);

    public abstract long q();

    public abstract void s(zp1 zp1Var, float f2);
}
