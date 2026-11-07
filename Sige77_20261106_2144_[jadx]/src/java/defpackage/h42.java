package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.hardware.display.DisplayManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Parcel;
import android.os.StatFs;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.view.Display;
import android.webkit.CookieManager;
import com.facebook.AccessToken;
import com.facebook.FacebookRequestError;
import com.hjq.toast.BuildConfig;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URLDecoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class h42 {
    public static volatile int a = 0;
    public static volatile long b = -1;
    public static volatile long c = -1;
    public static volatile long d = -1;
    public static volatile String e = "";
    public static volatile String f = "";
    public static volatile String g = "NoCarrier";
    public static volatile String h = "";
    public static volatile Locale i;

    public static final HashMap A(String str) {
        if (str.length() == 0) {
            return new HashMap();
        }
        try {
            HashMap map = new HashMap();
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                next.getClass();
                String string = jSONObject.getString(next);
                string.getClass();
                map.put(next, string);
            }
            return map;
        } catch (JSONException unused) {
            return new HashMap();
        }
    }

    public static final String B(Map map) {
        map.getClass();
        boolean zIsEmpty = map.isEmpty();
        String string = BuildConfig.FLAVOR;
        if (zIsEmpty) {
            return BuildConfig.FLAVOR;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : map.entrySet()) {
                jSONObject.put((String) entry.getKey(), (String) entry.getValue());
            }
            string = jSONObject.toString();
        } catch (JSONException unused) {
        }
        string.getClass();
        return string;
    }

    public static final Bundle C(String str) {
        Bundle bundle = new Bundle();
        if (!x(str)) {
            if (str == null) {
                uq1.q("Required value was null.");
                return null;
            }
            for (String str2 : (String[]) StringsKt.B(str, new String[]{"&"}, 0, 6).toArray(new String[0])) {
                String[] strArr = (String[]) StringsKt.B(str2, new String[]{"="}, 0, 6).toArray(new String[0]);
                try {
                    if (strArr.length == 2) {
                        bundle.putString(URLDecoder.decode(strArr[0], "UTF-8"), URLDecoder.decode(strArr[1], "UTF-8"));
                    } else if (strArr.length == 1) {
                        bundle.putString(URLDecoder.decode(strArr[0], "UTF-8"), BuildConfig.FLAVOR);
                    }
                } catch (UnsupportedEncodingException unused) {
                    i90 i90Var = i90.a;
                }
            }
        }
        return bundle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void D(Bundle bundle, JSONArray jSONArray) {
        bundle.getClass();
        if (jSONArray instanceof boolean[]) {
            bundle.putBooleanArray("media", (boolean[]) jSONArray);
            return;
        }
        if (jSONArray instanceof double[]) {
            bundle.putDoubleArray("media", (double[]) jSONArray);
            return;
        }
        if (jSONArray instanceof int[]) {
            bundle.putIntArray("media", (int[]) jSONArray);
        } else if (jSONArray instanceof long[]) {
            bundle.putLongArray("media", (long[]) jSONArray);
        } else {
            bundle.putString("media", jSONArray.toString());
        }
    }

    public static final HashMap E(Parcel parcel) {
        int i2 = parcel.readInt();
        if (i2 < 0) {
            return null;
        }
        HashMap map = new HashMap();
        for (int i3 = 0; i3 < i2; i3++) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (string != null && string2 != null) {
                map.put(string, string2);
            }
        }
        return map;
    }

    public static final String F(InputStream inputStream) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(new BufferedInputStream(inputStream));
        try {
            StringBuilder sb = new StringBuilder();
            char[] cArr = new char[2048];
            while (true) {
                int i2 = inputStreamReader.read(cArr);
                if (i2 == -1) {
                    String string = sb.toString();
                    inputStreamReader.close();
                    return string;
                }
                sb.append(cArr, 0, i2);
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                nj2.q(inputStreamReader, th);
                throw th2;
            }
        }
    }

    public static final void G(JSONObject jSONObject, Context context) throws JSONException {
        Locale locale;
        int i2;
        int i3;
        context.getClass();
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("a2");
        int i4 = 0;
        if (b == -1 || System.currentTimeMillis() - b >= 1800000) {
            b = System.currentTimeMillis();
            try {
                TimeZone timeZone = TimeZone.getDefault();
                String displayName = timeZone.getDisplayName(timeZone.inDaylightTime(new Date()), 0);
                displayName.getClass();
                e = displayName;
                String id = timeZone.getID();
                id.getClass();
                f = id;
            } catch (AssertionError unused) {
            } catch (Exception unused2) {
                i90 i90Var = i90.a;
            }
            if (Intrinsics.areEqual(g, "NoCarrier")) {
                try {
                    Object systemService = context.getSystemService("phone");
                    systemService.getClass();
                    String networkOperatorName = ((TelephonyManager) systemService).getNetworkOperatorName();
                    networkOperatorName.getClass();
                    g = networkOperatorName;
                } catch (Exception unused3) {
                    i90 i90Var2 = i90.a;
                }
            }
            try {
                if (Intrinsics.areEqual("mounted", Environment.getExternalStorageState())) {
                    StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                    c = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
                }
                c = Math.round(c / 1.073741824E9d);
            } catch (Exception unused4) {
            }
            try {
                if (Intrinsics.areEqual("mounted", Environment.getExternalStorageState())) {
                    StatFs statFs2 = new StatFs(Environment.getExternalStorageDirectory().getPath());
                    d = ((long) statFs2.getAvailableBlocks()) * ((long) statFs2.getBlockSize());
                }
                d = Math.round(d / 1.073741824E9d);
            } catch (Exception unused5) {
            }
        }
        String packageName = context.getPackageName();
        int i5 = -1;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            if (packageInfo == null) {
                return;
            }
            i5 = packageInfo.versionCode;
            h = packageInfo.versionName;
        } catch (PackageManager.NameNotFoundException unused6) {
        }
        jSONArray.put(packageName);
        jSONArray.put(i5);
        jSONArray.put(h);
        jSONArray.put(Build.VERSION.RELEASE);
        jSONArray.put(Build.MODEL);
        try {
            locale = context.getResources().getConfiguration().getLocales().get(0);
        } catch (Exception unused7) {
            locale = Locale.getDefault();
        }
        i = locale;
        StringBuilder sb = new StringBuilder();
        Locale locale2 = i;
        String language = locale2 != null ? locale2.getLanguage() : null;
        String str = BuildConfig.FLAVOR;
        if (language == null) {
            language = BuildConfig.FLAVOR;
        }
        sb.append(language);
        sb.append('_');
        Locale locale3 = i;
        String country = locale3 != null ? locale3.getCountry() : null;
        if (country != null) {
            str = country;
        }
        sb.append(str);
        jSONArray.put(sb.toString());
        jSONArray.put(e);
        jSONArray.put(g);
        double d2 = 0.0d;
        try {
            Object systemService2 = context.getSystemService("display");
            DisplayManager displayManager = systemService2 instanceof DisplayManager ? (DisplayManager) systemService2 : null;
            Display display = displayManager != null ? displayManager.getDisplay(0) : null;
            if (display != null) {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                display.getMetrics(displayMetrics);
                int i6 = displayMetrics.widthPixels;
                try {
                    i4 = displayMetrics.heightPixels;
                    d2 = displayMetrics.density;
                } catch (Exception unused8) {
                }
                i2 = i4;
                i4 = i6;
            } else {
                i2 = 0;
            }
        } catch (Exception unused9) {
        }
        jSONArray.put(i4);
        jSONArray.put(i2);
        jSONArray.put(new DecimalFormat("#.##").format(d2));
        if (a > 0) {
            i3 = a;
        } else {
            try {
                File[] fileArrListFiles = new File("/sys/devices/system/cpu/").listFiles(new l70(4));
                if (fileArrListFiles != null) {
                    a = fileArrListFiles.length;
                }
            } catch (Exception unused10) {
                i90 i90Var3 = i90.a;
            }
            if (a <= 0) {
                a = Math.max(Runtime.getRuntime().availableProcessors(), 1);
            }
            i3 = a;
        }
        jSONArray.put(i3);
        jSONArray.put(c);
        jSONArray.put(d);
        jSONArray.put(f);
        jSONObject.put("extinfo", jSONArray.toString());
    }

    public static final String H(String str) {
        if (str == null) {
            return null;
        }
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        bytes.getClass();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.getClass();
            messageDigest.update(bytes);
            byte[] bArrDigest = messageDigest.digest();
            StringBuilder sb = new StringBuilder();
            bArrDigest.getClass();
            for (byte b2 : bArrDigest) {
                sb.append(Integer.toHexString((b2 >> 4) & 15));
                sb.append(Integer.toHexString(b2 & 15));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    public static final void I(Parcel parcel, Map map) {
        if (map == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            parcel.writeString(str);
            parcel.writeString(str2);
        }
    }

    public static final Uri a(String str, String str2, Bundle bundle) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https");
        builder.authority(str);
        builder.path(str2);
        if (bundle != null) {
            for (String str3 : bundle.keySet()) {
                Object obj = bundle.get(str3);
                if (obj instanceof String) {
                    builder.appendQueryParameter(str3, (String) obj);
                }
            }
        }
        Uri uriBuild = builder.build();
        uriBuild.getClass();
        return uriBuild;
    }

    public static void b(String str) {
        CookieManager cookieManager = CookieManager.getInstance();
        String cookie = cookieManager.getCookie(str);
        if (cookie == null) {
            return;
        }
        for (String str2 : (String[]) StringsKt.B(cookie, new String[]{";"}, 0, 6).toArray(new String[0])) {
            String[] strArr = (String[]) StringsKt.B(str2, new String[]{"="}, 0, 6).toArray(new String[0]);
            if (strArr.length > 0) {
                StringBuilder sb = new StringBuilder();
                String str3 = strArr[0];
                int length = str3.length() - 1;
                int i2 = 0;
                boolean z = false;
                while (i2 <= length) {
                    boolean z2 = Intrinsics.compare(str3.charAt(!z ? i2 : length), 32) <= 0;
                    if (z) {
                        if (!z2) {
                            break;
                        } else {
                            length--;
                        }
                    } else if (z2) {
                        i2++;
                    } else {
                        z = true;
                    }
                }
                sb.append(str3.subSequence(i2, length + 1).toString());
                sb.append("=;expires=Sat, 1 Jan 2000 00:00:01 UTC;");
                cookieManager.setCookie(str, sb.toString());
            }
        }
        cookieManager.flush();
    }

    public static final void c(Context context) {
        context.getClass();
        try {
            b("facebook.com");
            b(".facebook.com");
            b("https://facebook.com");
            b("https://.facebook.com");
        } catch (Exception unused) {
        }
    }

    public static final String d(String str) {
        return x(str) ? BuildConfig.FLAVOR : str;
    }

    public static final HashSet e(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        HashSet hashSet = new HashSet();
        int length = jSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            String string = jSONArray.getString(i2);
            string.getClass();
            hashSet.add(string);
        }
        return hashSet;
    }

    public static final ArrayList f(JSONArray jSONArray) {
        jSONArray.getClass();
        try {
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                String string = jSONArray.getString(i2);
                string.getClass();
                arrayList.add(string);
            }
            return arrayList;
        } catch (JSONException unused) {
            return new ArrayList();
        }
    }

    public static final HashMap g(JSONObject jSONObject) {
        jSONObject.getClass();
        HashMap map = new HashMap();
        JSONArray jSONArrayNames = jSONObject.names();
        if (jSONArrayNames != null) {
            int length = jSONArrayNames.length();
            for (int i2 = 0; i2 < length; i2++) {
                try {
                    String string = jSONArrayNames.getString(i2);
                    string.getClass();
                    Object objG = jSONObject.get(string);
                    if (objG instanceof JSONObject) {
                        objG = g((JSONObject) objG);
                    }
                    objG.getClass();
                    map.put(string, objG);
                } catch (JSONException unused) {
                    i90 i90Var = i90.a;
                }
            }
        }
        return map;
    }

    public static final HashMap h(JSONObject jSONObject) {
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strOptString = jSONObject.optString(next);
            if (strOptString != null) {
                next.getClass();
                map.put(next, strOptString);
            }
        }
        return map;
    }

    public static final int i(InputStream inputStream, FilterOutputStream filterOutputStream) {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        try {
            byte[] bArr = new byte[8192];
            int i2 = 0;
            while (true) {
                int i3 = bufferedInputStream.read(bArr);
                if (i3 == -1) {
                    Unit unit = Unit.a;
                    bufferedInputStream.close();
                    return i2;
                }
                filterOutputStream.write(bArr, 0, i3);
                i2 += i3;
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                nj2.q(bufferedInputStream, th);
                throw th2;
            }
        }
    }

    public static final void j(HttpURLConnection httpURLConnection) {
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    public static final String k(Context context) {
        if (context == null) {
            return "null";
        }
        return context == context.getApplicationContext() ? "unknown" : context.getClass().getSimpleName();
    }

    public static final String l(Context context) {
        context.getClass();
        try {
            i90 i90Var = i90.a;
            dw0.y();
            String str = i90.e;
            if (str != null) {
                return str;
            }
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            int i2 = applicationInfo.labelRes;
            if (i2 == 0) {
                return applicationInfo.nonLocalizedLabel.toString();
            }
            String string = context.getString(i2);
            string.getClass();
            return string;
        } catch (Exception unused) {
            return BuildConfig.FLAVOR;
        }
    }

    public static final Date m(Bundle bundle, String str, Date date) {
        long jLongValue;
        if (bundle == null) {
            return null;
        }
        Object obj = bundle.get(str);
        if (obj instanceof Long) {
            jLongValue = ((Number) obj).longValue();
        } else {
            if (!(obj instanceof String)) {
                return null;
            }
            try {
                jLongValue = Long.parseLong((String) obj);
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        if (jLongValue == 0) {
            return new Date(Long.MAX_VALUE);
        }
        return new Date((jLongValue * 1000) + date.getTime());
    }

    public static final JSONObject n() {
        if (mt.a.contains(h42.class)) {
            return null;
        }
        try {
            String string = i90.a().getSharedPreferences("com.facebook.sdk.DataProcessingOptions", 0).getString("data_processing_options", null);
            if (string != null) {
                try {
                    return new JSONObject(string);
                } catch (JSONException unused) {
                    i90 i90Var = i90.a;
                }
            }
            return null;
        } catch (Throwable th) {
            mt.a(h42.class, th);
            return null;
        }
    }

    public static final void o(final g42 g42Var, final String str) {
        String str2;
        str.getClass();
        JSONObject jSONObject = (JSONObject) fd1.a.get(str);
        if (jSONObject != null) {
            g42Var.e(jSONObject);
            return;
        }
        ik0 ik0Var = new ik0() { // from class: f42
            @Override // defpackage.ik0
            public final void a(pk0 pk0Var) {
                String str3 = str;
                str3.getClass();
                pk0Var.getClass();
                FacebookRequestError facebookRequestError = pk0Var.c;
                JSONObject jSONObject2 = pk0Var.d;
                g42 g42Var2 = g42Var;
                if (facebookRequestError != null) {
                    g42Var2.d(facebookRequestError.w);
                } else if (jSONObject2 == null) {
                    uq1.q("Required value was null.");
                } else {
                    fd1.a.put(str3, jSONObject2);
                    g42Var2.e(jSONObject2);
                }
            }
        };
        Bundle bundle = new Bundle();
        Date date = AccessToken.Y;
        AccessToken accessTokenT = aj0.t();
        if (accessTokenT == null || (str2 = accessTokenT.X) == null) {
            str2 = "facebook";
        }
        bundle.putString("fields", Intrinsics.areEqual(str2, "instagram") ? "id,name,profile_picture" : "id,name,first_name,middle_name,last_name");
        bundle.putString("access_token", str);
        mk0 mk0Var = new mk0(null, "me", null, null, new ha(1));
        mk0Var.d = bundle;
        mk0Var.h = nm0.a;
        mk0Var.j(ik0Var);
        mk0Var.d();
    }

    public static final Method p(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public static final Method q(String str, String str2, Class... clsArr) {
        try {
            return p(Class.forName(str), str2, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static final Object r(JSONObject jSONObject, String str, String str2) throws JSONException {
        jSONObject.getClass();
        Object objOpt = jSONObject.opt(str);
        if (objOpt != null && (objOpt instanceof String)) {
            objOpt = new JSONTokener((String) objOpt).nextValue();
        }
        if (objOpt == null || (objOpt instanceof JSONObject) || (objOpt instanceof JSONArray)) {
            return objOpt;
        }
        if (str2 == null) {
            throw new d90("Got an unexpected non-JSON object.");
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.putOpt(str2, objOpt);
        return jSONObject2;
    }

    public static final Object s(Object obj, Method method, Object... objArr) {
        try {
            return method.invoke(obj, Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public static final boolean t() {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            intent.setData(Uri.parse(String.format("fb%s://applinks", Arrays.copyOf(new Object[]{i90.b()}, 1))));
            Context contextA = i90.a();
            PackageManager packageManager = contextA.getPackageManager();
            String packageName = contextA.getPackageName();
            List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
            listQueryIntentActivities.getClass();
            Iterator<ResolveInfo> it = listQueryIntentActivities.iterator();
            while (it.hasNext()) {
                if (Intrinsics.areEqual(packageName, it.next().activityInfo.packageName)) {
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public static final boolean u(Context context) {
        context.getClass();
        if (Build.VERSION.SDK_INT >= 27) {
            return context.getPackageManager().hasSystemFeature("android.hardware.type.pc");
        }
        String str = Build.DEVICE;
        if (str == null) {
            return false;
        }
        str.getClass();
        return new Regex(".+_cheets|cheets_.+").c(str);
    }

    public static final boolean v() {
        if (!mt.a.contains(h42.class)) {
            try {
                JSONObject jSONObjectN = n();
                if (jSONObjectN != null) {
                    try {
                        JSONArray jSONArray = jSONObjectN.getJSONArray("data_processing_options");
                        int length = jSONArray.length();
                        for (int i2 = 0; i2 < length; i2++) {
                            String string = jSONArray.getString(i2);
                            string.getClass();
                            String lowerCase = string.toLowerCase();
                            lowerCase.getClass();
                            if (Intrinsics.areEqual(lowerCase, "ldu")) {
                                return true;
                            }
                        }
                    } catch (Exception unused) {
                        i90 i90Var = i90.a;
                    }
                }
            } catch (Throwable th) {
                mt.a(h42.class, th);
                return false;
            }
        }
        return false;
    }

    public static boolean w(Context context) {
        Method methodQ = q("com.google.android.gms.common.GooglePlayServicesUtil", "isGooglePlayServicesAvailable", Context.class);
        if (methodQ != null) {
            Object objS = s(null, methodQ, context);
            if ((objS instanceof Integer) && Intrinsics.areEqual(objS, 0)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean x(String str) {
        return str == null || str.length() == 0;
    }

    public static final boolean y(Uri uri) {
        if (uri != null) {
            return "http".equalsIgnoreCase(uri.getScheme()) || "https".equalsIgnoreCase(uri.getScheme()) || "fbstaging".equalsIgnoreCase(uri.getScheme());
        }
        return false;
    }

    public static final ArrayList z(JSONArray jSONArray) {
        jSONArray.getClass();
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            arrayList.add(jSONArray.getString(i2));
        }
        return arrayList;
    }
}
