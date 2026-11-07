package defpackage;

import android.app.Activity;
import android.graphics.Bitmap;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.view.ViewTreeObserver;
import com.facebook.AccessToken;
import com.facebook.GraphRequest;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.hjq.toast.BuildConfig;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Provider;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.zip.GZIPOutputStream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.d;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class vl0 implements hj1, SuccessContinuation, g52, hv2, ed3, pa3 {
    public final /* synthetic */ int a;
    public static final Object b = new Object();
    public static final /* synthetic */ vl0 c = new vl0(2);
    public static final /* synthetic */ vl0 d = new vl0(11);
    public static final /* synthetic */ vl0 e = new vl0(12);
    public static final /* synthetic */ vl0 f = new vl0(13);
    public static final /* synthetic */ vl0 i = new vl0(14);
    public static final /* synthetic */ vl0 v = new vl0(15);
    public static final /* synthetic */ vl0 w = new vl0(16);
    public static final /* synthetic */ vl0 W = new vl0(17);
    public static final /* synthetic */ vl0 X = new vl0(18);

    public /* synthetic */ vl0(int i2) {
        this.a = i2;
    }

    public static final boolean d(jb1 jb1Var) {
        jb1 jb1Var2 = xi1.f;
        rj rjVarP = jb1Var.a;
        int iK = rj.k(rjVarP, d.a);
        if (iK == -1) {
            iK = rj.k(jb1Var.a, d.b);
        }
        if (iK != -1) {
            rjVarP = rj.p(rjVarP, iK + 1, 0, 2);
        } else if (jb1Var.e() != null && rjVarP.d() == 2) {
            rjVarP = rj.d;
        }
        return !d.d(rjVarP.r(), ".class", true);
    }

    public static final String f(Object obj) {
        String str = mk0.j;
        if (obj instanceof String) {
            return (String) obj;
        }
        if ((obj instanceof Boolean) || (obj instanceof Number)) {
            return obj.toString();
        }
        if (!(obj instanceof Date)) {
            e.g("Unsupported parameter type.");
            return null;
        }
        String str2 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format((Date) obj);
        str2.getClass();
        return str2;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0045  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final void h(HashMap map, String str, String str2) {
        HashMap map2 = x41.e;
        switch (str.hashCode()) {
            case 3585:
                if (str.equals("r3")) {
                    str2 = (!d.j(str2, "m", false) && !d.j(str2, "b", false) && !d.j(str2, "ge", false)) ? "f" : "m";
                }
                break;
            case 3586:
                if (str.equals("r4")) {
                    str2 = new Regex("[^a-z]+").replace(str2, BuildConfig.FLAVOR);
                }
                break;
            case 3587:
                if (str.equals("r5")) {
                    str2 = new Regex("[^a-z]+").replace(str2, BuildConfig.FLAVOR);
                }
                break;
            case 3588:
                if (str.equals("r6") && StringsKt.t(str2, "-")) {
                    str2 = ((String[]) new Regex("-").d(str2).toArray(new String[0]))[0];
                }
                break;
        }
        map.put(str, str2);
    }

    public static HttpURLConnection i(URL url) throws IOException {
        URLConnection uRLConnectionOpenConnection = url.openConnection();
        uRLConnectionOpenConnection.getClass();
        HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
        if (mk0.l == null) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            mk0.l = String.format("%s.%s", Arrays.copyOf(new Object[]{"FBAndroidSDK", "18.2.3"}, 2));
        }
        httpURLConnection.setRequestProperty("User-Agent", mk0.l);
        httpURLConnection.setRequestProperty("Accept-Language", Locale.getDefault().toString());
        httpURLConnection.setChunkedStreamingMode(0);
        return httpURLConnection;
    }

    public static ByteArrayInputStream j(String str) {
        if (!str.startsWith("data:image")) {
            e.g("Not a valid image data URL.");
            return null;
        }
        int iIndexOf = str.indexOf(44);
        if (iIndexOf == -1) {
            e.g("Missing comma in data URL.");
            return null;
        }
        if (str.substring(0, iIndexOf).endsWith(";base64")) {
            return new ByteArrayInputStream(Base64.decode(str.substring(iIndexOf + 1), 0));
        }
        e.g("Not a base64 image data URL.");
        return null;
    }

    public static ArrayList k(ok0 ok0Var) {
        Exception exc;
        HttpURLConnection httpURLConnectionX;
        ArrayList arrayListL;
        ok0Var.getClass();
        dw0.s(ok0Var);
        HttpURLConnection httpURLConnection = null;
        try {
            httpURLConnectionX = x(ok0Var);
            exc = null;
        } catch (Exception e2) {
            exc = e2;
            httpURLConnectionX = null;
        } catch (Throwable th) {
            th = th;
            h42.j(httpURLConnection);
            throw th;
        }
        try {
            if (httpURLConnectionX != null) {
                arrayListL = l(ok0Var, httpURLConnectionX);
            } else {
                ArrayList arrayListH = z32.h(ok0Var.c, null, new d90(exc));
                t(ok0Var, arrayListH);
                arrayListL = arrayListH;
            }
            h42.j(httpURLConnectionX);
            return arrayListL;
        } catch (Throwable th2) {
            th = th2;
            httpURLConnection = httpURLConnectionX;
            h42.j(httpURLConnection);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0028 A[EXC_TOP_SPLITTER, PHI: r0 r1
      0x0028: PHI (r0v1 java.io.InputStream) = (r0v0 java.io.InputStream), (r0v0 java.io.InputStream), (r0v15 java.io.InputStream) binds: [B:26:0x004a, B:31:0x0055, B:16:0x0026] A[DONT_GENERATE, DONT_INLINE]
      0x0028: PHI (r1v4 java.util.ArrayList) = (r1v1 java.util.ArrayList), (r1v3 java.util.ArrayList), (r1v12 java.util.ArrayList) binds: [B:26:0x004a, B:31:0x0055, B:16:0x0026] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    public static ArrayList l(ok0 ok0Var, HttpURLConnection httpURLConnection) {
        ArrayList arrayListH;
        ok0Var.getClass();
        InputStream errorStream = null;
        try {
            try {
                if (!i90.g()) {
                    Log.e("pk0", "GraphRequest can't be used when Facebook SDK isn't fully initialized");
                    throw new d90("GraphRequest can't be used when Facebook SDK isn't fully initialized");
                }
                errorStream = httpURLConnection.getResponseCode() >= 400 ? httpURLConnection.getErrorStream() : httpURLConnection.getInputStream();
                arrayListH = z32.j(errorStream, httpURLConnection, ok0Var);
                if (errorStream != null) {
                    try {
                        errorStream.close();
                    } catch (IOException unused) {
                    }
                }
                httpURLConnection.disconnect();
                int size = ok0Var.c.size();
                if (size != arrayListH.size()) {
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    throw new d90(String.format(Locale.US, "Received %d responses while expecting %d", Arrays.copyOf(new Object[]{Integer.valueOf(arrayListH.size()), Integer.valueOf(size)}, 2)));
                }
                t(ok0Var, arrayListH);
                co coVarN = co.v.n();
                AccessToken accessToken = (AccessToken) coVarN.c;
                if (accessToken != null) {
                    long time = new Date().getTime();
                    if (accessToken.f.a && time - ((Date) coVarN.e).getTime() > 3600000 && time - accessToken.i.getTime() > 86400000) {
                        if (Intrinsics.areEqual(Looper.getMainLooper(), Looper.myLooper())) {
                            coVarN.D();
                        } else {
                            new Handler(Looper.getMainLooper()).post(new y1(coVarN, 0));
                        }
                    }
                }
                return arrayListH;
            } catch (d90 e2) {
                gp1 gp1Var = i01.c;
                synchronized (i90.b) {
                    arrayListH = z32.h(ok0Var, httpURLConnection, e2);
                    if (0 != 0) {
                        errorStream.close();
                    }
                }
            } catch (Exception e3) {
                gp1 gp1Var2 = i01.c;
                synchronized (i90.b) {
                    arrayListH = z32.h(ok0Var, httpURLConnection, new d90(e3));
                    if (0 != 0) {
                        errorStream.close();
                    }
                }
            }
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    errorStream.close();
                } catch (IOException unused2) {
                }
            }
            throw th;
        }
    }

    public static boolean m(Object obj) {
        return (obj instanceof Bitmap) || (obj instanceof byte[]) || (obj instanceof Uri) || (obj instanceof ParcelFileDescriptor) || (obj instanceof GraphRequest.ParcelableResourceWithMimeType);
    }

    public static boolean n(Object obj) {
        return (obj instanceof String) || (obj instanceof Boolean) || (obj instanceof Number) || (obj instanceof Date);
    }

    public static mk0 o(AccessToken accessToken, String str, ik0 ik0Var) {
        return new mk0(accessToken, str, null, null, ik0Var);
    }

    public static mk0 p(AccessToken accessToken, String str, JSONObject jSONObject, ik0 ik0Var) {
        mk0 mk0Var = new mk0(accessToken, str, null, nm0.b, ik0Var);
        mk0Var.c = jSONObject;
        return mk0Var;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0028  */
    public static void q(JSONObject jSONObject, String str, jk0 jk0Var) {
        String strGroup;
        boolean z;
        Matcher matcher = mk0.k.matcher(str);
        if (matcher.matches()) {
            strGroup = matcher.group(1);
            strGroup.getClass();
        } else {
            strGroup = str;
        }
        if (d.j(strGroup, "me/", false) || d.j(strGroup, "/me/", false)) {
            int iV = StringsKt.v(str, ":", 0, 6);
            int iV2 = StringsKt.v(str, "?", 0, 6);
            if (iV <= 3 || (iV2 != -1 && iV >= iV2)) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = false;
        }
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objOpt = jSONObject.opt(next);
            boolean z2 = z && d.e(next, "image");
            next.getClass();
            objOpt.getClass();
            r(next, objOpt, jk0Var, z2);
        }
    }

    public static void r(String str, Object obj, jk0 jk0Var, boolean z) {
        Class<?> cls = obj.getClass();
        if (!JSONObject.class.isAssignableFrom(cls)) {
            if (JSONArray.class.isAssignableFrom(cls)) {
                JSONArray jSONArray = (JSONArray) obj;
                int length = jSONArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    String str2 = String.format(Locale.ROOT, "%s[%d]", Arrays.copyOf(new Object[]{str, Integer.valueOf(i2)}, 2));
                    Object objOpt = jSONArray.opt(i2);
                    objOpt.getClass();
                    r(str2, objOpt, jk0Var, z);
                }
                return;
            }
            if (String.class.isAssignableFrom(cls) || Number.class.isAssignableFrom(cls) || Boolean.class.isAssignableFrom(cls)) {
                jk0Var.a(str, obj.toString());
                return;
            }
            if (!Date.class.isAssignableFrom(cls)) {
                String str3 = mk0.j;
                i90 i90Var = i90.a;
                return;
            } else {
                String str4 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format((Date) obj);
                str4.getClass();
                jk0Var.a(str, str4);
                return;
            }
        }
        JSONObject jSONObject = (JSONObject) obj;
        if (z) {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                String str5 = String.format("%s[%s]", Arrays.copyOf(new Object[]{str, next}, 2));
                Object objOpt2 = jSONObject.opt(next);
                objOpt2.getClass();
                r(str5, objOpt2, jk0Var, z);
            }
            return;
        }
        if (jSONObject.has("id")) {
            String strOptString = jSONObject.optString("id");
            strOptString.getClass();
            r(str, strOptString, jk0Var, z);
        } else if (jSONObject.has("url")) {
            String strOptString2 = jSONObject.optString("url");
            strOptString2.getClass();
            r(str, strOptString2, jk0Var, z);
        } else if (jSONObject.has("fbsdk:create_object")) {
            String string = jSONObject.toString();
            string.getClass();
            r(str, string, jk0Var, z);
        }
    }

    public static void s(ok0 ok0Var, i01 i01Var, int i2, URL url, FilterOutputStream filterOutputStream, boolean z) throws JSONException, IOException {
        String strB;
        kk0 kk0Var = new kk0(filterOutputStream, i01Var, z);
        if (i2 == 1) {
            mk0 mk0Var = (mk0) ok0Var.c.get(0);
            HashMap map = new HashMap();
            for (String str : mk0Var.d.keySet()) {
                Object obj = mk0Var.d.get(str);
                if (m(obj)) {
                    str.getClass();
                    map.put(str, new hk0(mk0Var, obj));
                }
            }
            synchronized (i90.b) {
            }
            Bundle bundle = mk0Var.d;
            for (String str2 : bundle.keySet()) {
                Object obj2 = bundle.get(str2);
                if (n(obj2)) {
                    str2.getClass();
                    kk0Var.h(str2, obj2, mk0Var);
                }
            }
            synchronized (i90.b) {
            }
            u(map, kk0Var);
            JSONObject jSONObject = mk0Var.c;
            if (jSONObject != null) {
                String path = url.getPath();
                path.getClass();
                q(jSONObject, path, kk0Var);
                return;
            }
            return;
        }
        ok0Var.getClass();
        Iterator<E> it = ok0Var.iterator();
        while (true) {
            if (it.hasNext()) {
                AccessToken accessToken = ((mk0) it.next()).a;
                if (accessToken != null) {
                    strB = accessToken.v;
                    break;
                }
            } else {
                String str3 = mk0.j;
                strB = i90.b();
                break;
            }
        }
        if (strB.length() == 0) {
            throw new d90("App ID was not specified at the request or Settings.");
        }
        kk0Var.a("batch_app_id", strB);
        HashMap map2 = new HashMap();
        JSONArray jSONArray = new JSONArray();
        Iterator it2 = ok0Var.iterator();
        while (it2.hasNext()) {
            mk0 mk0Var2 = (mk0) it2.next();
            mk0Var2.getClass();
            String str4 = mk0.j;
            JSONObject jSONObject2 = new JSONObject();
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String strH = mk0Var2.h(String.format("https://graph.%s", Arrays.copyOf(new Object[]{i90.e()}, 1)));
            mk0Var2.a();
            Uri uri = Uri.parse(mk0Var2.b(strH, true));
            String str5 = String.format("%s?%s", Arrays.copyOf(new Object[]{uri.getPath(), uri.getQuery()}, 2));
            jSONObject2.put("relative_url", str5);
            jSONObject2.put("method", mk0Var2.h);
            AccessToken accessToken2 = mk0Var2.a;
            if (accessToken2 != null) {
                i01.c.p(accessToken2.e);
            }
            ArrayList arrayList = new ArrayList();
            Iterator<String> it3 = mk0Var2.d.keySet().iterator();
            while (it3.hasNext()) {
                Object obj3 = mk0Var2.d.get(it3.next());
                if (m(obj3)) {
                    StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                    String str6 = String.format(Locale.ROOT, "%s%d", Arrays.copyOf(new Object[]{"file", Integer.valueOf(map2.size())}, 2));
                    arrayList.add(str6);
                    map2.put(str6, new hk0(mk0Var2, obj3));
                }
            }
            if (!arrayList.isEmpty()) {
                jSONObject2.put("attached_files", TextUtils.join(",", arrayList));
            }
            JSONObject jSONObject3 = mk0Var2.c;
            if (jSONObject3 != null) {
                ArrayList arrayList2 = new ArrayList();
                q(jSONObject3, str5, new lk0(arrayList2));
                jSONObject2.put("body", TextUtils.join("&", arrayList2));
            }
            jSONArray.put(jSONObject2);
        }
        String string = jSONArray.toString();
        string.getClass();
        kk0Var.a("batch", string);
        synchronized (i90.b) {
        }
        u(map2, kk0Var);
    }

    public static void t(ok0 ok0Var, ArrayList arrayList) {
        ok0Var.getClass();
        ArrayList arrayList2 = ok0Var.c;
        int size = arrayList2.size();
        ArrayList arrayList3 = new ArrayList();
        for (int i2 = 0; i2 < size; i2++) {
            mk0 mk0Var = (mk0) arrayList2.get(i2);
            if (mk0Var.g != null) {
                arrayList3.add(new Pair(mk0Var.g, arrayList.get(i2)));
            }
        }
        if (arrayList3.size() > 0) {
            x4 x4Var = new x4(28, arrayList3, ok0Var);
            Handler handler = ok0Var.a;
            if (handler != null) {
                handler.post(x4Var);
            } else {
                x4Var.run();
            }
        }
    }

    public static void u(HashMap map, kk0 kk0Var) throws IOException {
        for (Map.Entry entry : map.entrySet()) {
            String str = mk0.j;
            if (m(((hk0) entry.getValue()).b)) {
                kk0Var.h((String) entry.getKey(), ((hk0) entry.getValue()).b, ((hk0) entry.getValue()).a);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:63:0x0128  */
    /* JADX WARN: Code duplicated, block: B:82:? A[SYNTHETIC] */
    public static void v(ok0 ok0Var, HttpURLConnection httpURLConnection) throws Throwable {
        boolean z;
        Throwable th;
        FilterOutputStream filterOutputStream;
        FilterOutputStream gZIPOutputStream;
        int i2;
        nm0 nm0Var = nm0.b;
        ok0Var.getClass();
        i01 i01Var = new i01();
        int size = ok0Var.c.size();
        Iterator<E> it = ok0Var.iterator();
        loop0: while (true) {
            z = false;
            i2 = 0;
            if (!it.hasNext()) {
                z = true;
                break;
            }
            mk0 mk0Var = (mk0) it.next();
            Iterator<String> it2 = mk0Var.d.keySet().iterator();
            while (it2.hasNext()) {
                if (m(mk0Var.d.get(it2.next()))) {
                    break loop0;
                }
            }
        }
        nm0 nm0Var2 = size == 1 ? ((mk0) ok0Var.c.get(0)).h : null;
        if (nm0Var2 == null) {
            nm0Var2 = nm0Var;
        }
        httpURLConnection.setRequestMethod(nm0Var2.name());
        if (z) {
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        } else {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            httpURLConnection.setRequestProperty("Content-Type", String.format("multipart/form-data; boundary=%s", Arrays.copyOf(new Object[]{mk0.j}, 1)));
        }
        URL url = httpURLConnection.getURL();
        HashSet hashSet = i90.b;
        synchronized (hashSet) {
        }
        ok0Var.b.getClass();
        synchronized (hashSet) {
        }
        url.getClass();
        synchronized (hashSet) {
        }
        httpURLConnection.getRequestMethod().getClass();
        synchronized (hashSet) {
        }
        String requestProperty = httpURLConnection.getRequestProperty("User-Agent");
        requestProperty.getClass();
        i01Var.a(requestProperty, "User-Agent");
        String requestProperty2 = httpURLConnection.getRequestProperty("Content-Type");
        requestProperty2.getClass();
        i01Var.a(requestProperty2, "Content-Type");
        httpURLConnection.setConnectTimeout(z);
        httpURLConnection.setReadTimeout(z);
        if (nm0Var2 != nm0Var) {
            i01Var.b.getClass();
            i01Var.a.getClass();
            synchronized (hashSet) {
            }
            i01Var.b = new StringBuilder();
            return;
        }
        httpURLConnection.setDoOutput(true);
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
            if (z) {
                try {
                    gZIPOutputStream = new GZIPOutputStream(bufferedOutputStream);
                } catch (Throwable th2) {
                    th = th2;
                    filterOutputStream = bufferedOutputStream;
                    if (filterOutputStream != null) {
                        throw th;
                    }
                    filterOutputStream.close();
                    throw th;
                }
            } else {
                gZIPOutputStream = bufferedOutputStream;
            }
            try {
                ArrayList arrayList = ok0Var.d;
                int size2 = arrayList.size();
                while (i2 < size2) {
                    Object obj = arrayList.get(i2);
                    i2++;
                }
                Iterator<E> it3 = ok0Var.iterator();
                while (it3.hasNext()) {
                    ik0 ik0Var = ((mk0) it3.next()).g;
                }
                s(ok0Var, i01Var, size, url, gZIPOutputStream, z);
                gZIPOutputStream.close();
                i01Var.b.getClass();
                i01Var.a.getClass();
                synchronized (i90.b) {
                }
                i01Var.b = new StringBuilder();
            } catch (Throwable th3) {
                th = th3;
                filterOutputStream = gZIPOutputStream;
                if (filterOutputStream != null) {
                    throw th;
                }
                filterOutputStream.close();
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            filterOutputStream = null;
        }
    }

    public static void w(Activity activity) {
        View viewK;
        int iHashCode = activity.hashCode();
        HashMap map = null;
        if (!mt.a.contains(x41.class)) {
            try {
                map = x41.e;
            } catch (Throwable th) {
                mt.a(x41.class, th);
            }
        }
        Integer numValueOf = Integer.valueOf(iHashCode);
        Object x41Var = map.get(numValueOf);
        if (x41Var == null) {
            x41Var = new x41(activity);
            map.put(numValueOf, x41Var);
        }
        x41 x41Var2 = (x41) x41Var;
        Set set = mt.a;
        if (set.contains(x41.class)) {
            return;
        }
        try {
            if (set.contains(x41Var2)) {
                return;
            }
            try {
                if (!x41Var2.d.getAndSet(true) && (viewK = ga.k((Activity) x41Var2.c.get())) != null) {
                    ViewTreeObserver viewTreeObserver = viewK.getViewTreeObserver();
                    if (viewTreeObserver.isAlive()) {
                        viewTreeObserver.addOnGlobalFocusChangeListener(x41Var2);
                        return;
                    }
                    return;
                    mt.a(x41.class, th);
                }
            } catch (Throwable th2) {
                mt.a(x41Var2, th2);
            }
        } catch (Throwable th3) {
            mt.a(x41.class, th3);
        }
    }

    public static HttpURLConnection x(ok0 ok0Var) throws Throwable {
        URL url;
        ok0Var.getClass();
        Iterator<E> it = ok0Var.iterator();
        while (it.hasNext()) {
            mk0 mk0Var = (mk0) it.next();
            if (nm0.a == mk0Var.h && h42.x(mk0Var.d.getString("fields"))) {
                gp1 gp1Var = i01.c;
                synchronized (i90.b) {
                }
            }
        }
        try {
            if (ok0Var.c.size() == 1) {
                url = new URL(((mk0) ok0Var.c.get(0)).g());
            } else {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                url = new URL(String.format("https://graph.%s", Arrays.copyOf(new Object[]{i90.e()}, 1)));
            }
            HttpURLConnection httpURLConnectionI = null;
            try {
                httpURLConnectionI = i(url);
                v(ok0Var, httpURLConnectionI);
                return httpURLConnectionI;
            } catch (IOException e2) {
                h42.j(httpURLConnectionI);
                throw new d90("could not construct request body", e2);
            } catch (JSONException e3) {
                h42.j(httpURLConnectionI);
                throw new d90("could not construct request body", e3);
            }
        } catch (MalformedURLException e4) {
            throw new d90("could not construct URL for request", e4);
        }
    }

    public static Cipher y() {
        try {
            Cipher cipher = (Cipher) x63.a.get();
            if (cipher != null) {
                return cipher;
            }
            throw new GeneralSecurityException("AES GCM SIV cipher is invalid.");
        } catch (IllegalStateException e2) {
            throw new GeneralSecurityException("AES GCM SIV cipher is not available or is invalid.", e2);
        }
    }

    @Override // defpackage.pa3
    public byte[] a(byte[] bArr, byte[] bArr2, byte[] bArr3, int i2, byte[] bArr4) throws GeneralSecurityException {
        if (bArr.length != 32) {
            throw new InvalidAlgorithmParameterException("Unexpected key length: 32");
        }
        try {
            n43.a();
            Provider provider = n43.a().getProvider();
            if (!ck1.i(1)) {
                tv2.f("Can not use ChaCha20Poly1305 in FIPS-mode.");
                return null;
            }
            if (bArr.length != 32) {
                throw new InvalidKeyException("The key length in bytes must be 32.");
            }
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "ChaCha20");
            if (bArr3 == null) {
                uq1.h("ciphertext is null");
                return null;
            }
            if (bArr2.length != 12) {
                tv2.f("nonce length must be 12 bytes.");
                return null;
            }
            if (bArr3.length < i2 + 16) {
                tv2.f("ciphertext too short");
                return null;
            }
            IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr2);
            Cipher cipher = Cipher.getInstance("ChaCha20-Poly1305", provider);
            cipher.init(2, secretKeySpec, ivParameterSpec);
            if (bArr4.length != 0) {
                cipher.updateAAD(bArr4);
            }
            return cipher.doFinal(bArr3, i2, bArr3.length - i2);
        } catch (GeneralSecurityException unused) {
            return new r53(bArr, 0).s(ByteBuffer.wrap(Arrays.copyOfRange(bArr3, i2, bArr3.length)), bArr2, bArr4);
        }
    }

    @Override // defpackage.g52
    public void b(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
        mediaMetadataRetriever.setDataSource(new f52((ByteBuffer) obj));
    }

    @Override // defpackage.hj1
    public Object c(InputStream inputStream) {
        return b;
    }

    @Override // defpackage.g52
    public void e(MediaExtractor mediaExtractor, Object obj) throws IOException {
        mediaExtractor.setDataSource(new f52((ByteBuffer) obj));
    }

    @Override // defpackage.ed3
    public wf3 g(zi0 zi0Var) {
        switch (this.a) {
            case 19:
                gz2 gz2Var = (gz2) zi0Var;
                j33.c(gz2Var.f);
                sj3 sj3VarW = uj3.w();
                byte[] bArrB = ((tr3) gz2Var.g.a).b();
                nr2 nr2VarE = jr2.e(bArrB, 0, bArrB.length);
                sj3VarW.f();
                uj3.v((uj3) sj3VarW.b, nr2VarE);
                return wf3.d("type.googleapis.com/google.crypto.tink.AesGcmKey", ((uj3) sj3VarW.d()).b(), 2, j33.b(gz2Var.f.d), gz2Var.i);
            default:
                jg3 jg3Var = (jg3) zi0Var;
                ai3 ai3VarX = bi3.x();
                pg3 pg3Var = jg3Var.f;
                ji3 ji3VarV = li3.v();
                int i2 = pg3Var.b;
                ji3VarV.f();
                ((li3) ji3VarV.b).zze = i2;
                li3 li3Var = (li3) ji3VarV.d();
                ai3VarX.f();
                bi3.w((bi3) ai3VarX.b, li3Var);
                byte[] bArrB2 = ((tr3) jg3Var.g.a).b();
                nr2 nr2VarE2 = jr2.e(bArrB2, 0, bArrB2.length);
                ai3VarX.f();
                bi3.v((bi3) ai3VarX.b, nr2VarE2);
                return wf3.d("type.googleapis.com/google.crypto.tink.AesCmacKey", ((bi3) ai3VarX.d()).b(), 2, hh3.b(jg3Var.f.c), jg3Var.h);
        }
    }

    public Task then(Object obj) {
        Bundle bundle = (Bundle) obj;
        int i2 = mk1.h;
        return (bundle == null || !bundle.containsKey("google.messenger")) ? Tasks.forResult(bundle) : Tasks.forResult((Object) null);
    }

    @Override // defpackage.hv2
    /* JADX INFO: renamed from: zza, reason: collision with other method in class */
    public Object mo5zza() {
        switch (this.a) {
            case 11:
                List list = h13.a;
                vo2.b.get();
                return (Long) xo2.a.z("measurement.app_uninstalled_additional_ad_id_cache_time", 3600000L, 1).get();
            case 12:
                List list2 = h13.a;
                vo2.b.get();
                return (Long) xo2.a.z("measurement.monitoring.sample_period_millis", 86400000L, 29).get();
            case 13:
                List list3 = h13.a;
                vo2.b.get();
                return (Long) xo2.a.z("measurement.upload.debug_upload_interval", 1000L, 9).get();
            case 14:
                List list4 = h13.a;
                fq2.b.get();
                return (Boolean) gq2.a.r(0, "measurement.test.boolean_flag", false).get();
            case 15:
                List list5 = h13.a;
                vo2.b.get();
                return (String) xo2.a.E(56, "measurement.rb.attribution.uri_authority", "google-analytics.com").get();
            case 16:
                List list6 = h13.a;
                vo2.b.get();
                return (Long) xo2.a.z("45769094", 3600000L, 11).get();
            case 17:
                List list7 = h13.a;
                return (Boolean) ar2.a.get();
            default:
                return new Boolean(((Boolean) xp2.a.get()).booleanValue());
        }
    }

    @Override // defpackage.pa3
    public byte[] zzc() {
        return lb3.k;
    }

    @Override // defpackage.pa3, defpackage.ea3
    public int zza() {
        return 32;
    }
}
