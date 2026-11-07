package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.net.Uri;
import android.util.SparseArray;
import com.hjq.toast.BuildConfig;
import com.linecorp.linesdk.LineApiError;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import javax.net.ssl.HttpsURLConnection;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class vl {
    public static final byte[] e = new byte[0];
    public final int a;
    public final int b;
    public final Object c;
    public final Object d;

    public vl(q60 q60Var, p11 p11Var) {
        this.c = new SparseArray();
        this.d = q60Var;
        TypedArray typedArray = (TypedArray) p11Var.c;
        this.a = typedArray.getResourceId(28, 0);
        this.b = typedArray.getResourceId(53, 0);
    }

    public static ix0 b(HttpURLConnection httpURLConnection, hj1 hj1Var, hj1 hj1Var2) throws IOException {
        InputStream inputStream = httpURLConnection.getResponseCode() < 400 ? httpURLConnection.getInputStream() : httpURLConnection.getErrorStream();
        List<String> list = httpURLConnection.getHeaderFields().get("Content-Encoding");
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).equalsIgnoreCase("gzip")) {
                    inputStream = new GZIPInputStream(inputStream);
                    break;
                }
            }
        }
        int responseCode = httpURLConnection.getResponseCode();
        try {
            if (responseCode == 200 || responseCode == 204) {
                return hj1Var == null ? ix0.d : ix0.b(hj1Var.c(inputStream));
            }
            return ix0.a(jx0.d, new LineApiError(responseCode, 3, (String) hj1Var2.c(inputStream)));
        } catch (IOException e2) {
            return ix0.a(jx0.f, new LineApiError(e2, 2));
        }
    }

    public static HttpURLConnection f(Uri uri) throws IOException {
        URLConnection uRLConnectionOpenConnection = new URL(uri.toString()).openConnection();
        if (uRLConnectionOpenConnection instanceof HttpsURLConnection) {
            return (HttpURLConnection) uRLConnectionOpenConnection;
        }
        ur.g(uri, "The scheme of the server url must be https.");
        return null;
    }

    public static void i(HttpURLConnection httpURLConnection, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
    }

    public ix0 a(Uri uri, Map map, Map map2, hj1 hj1Var) {
        Uri.Builder builderBuildUpon = uri.buildUpon();
        g93.f(builderBuildUpon, map2);
        HttpURLConnection httpURLConnectionE = null;
        try {
            try {
                httpURLConnectionE = e(builderBuildUpon.build());
                i(httpURLConnectionE, map);
                httpURLConnectionE.connect();
                ix0 ix0VarB = b(httpURLConnectionE, hj1Var, (r41) this.d);
                httpURLConnectionE.disconnect();
                return ix0VarB;
            } catch (IOException e2) {
                ix0 ix0VarA = ix0.a(jx0.c, new LineApiError(e2));
                if (httpURLConnectionE != null) {
                    httpURLConnectionE.disconnect();
                }
                return ix0VarA;
            }
        } catch (Throwable th) {
            if (httpURLConnectionE != null) {
                httpURLConnectionE.disconnect();
            }
            throw th;
        }
    }

    public void c(int i, int i2, int i3, int i4) {
        if (i < 0) {
            int i5 = this.a;
            i += i5;
            i2 += 4 - ((i5 + 4) % 8);
        }
        int i6 = this.b;
        if (i2 < 0) {
            i2 += i6;
            i += 4 - ((i6 + 4) % 8);
        }
        ((byte[]) this.d)[(i * i6) + i2] = (byte) ((((String) this.c).charAt(i3) & (1 << (8 - i4))) == 0 ? 0 : 1);
    }

    public HttpURLConnection d(Uri uri, int i) throws IOException {
        HttpURLConnection httpURLConnectionF = f(uri);
        httpURLConnectionF.setInstanceFollowRedirects(true);
        httpURLConnectionF.setRequestProperty("User-Agent", ((p11) this.c).j());
        httpURLConnectionF.setRequestProperty("Accept-Encoding", "gzip");
        httpURLConnectionF.setRequestProperty("Content-Type", "application/json");
        httpURLConnectionF.setRequestProperty("Content-Length", String.valueOf(i));
        httpURLConnectionF.setConnectTimeout(this.a);
        httpURLConnectionF.setReadTimeout(this.b);
        httpURLConnectionF.setRequestMethod("POST");
        httpURLConnectionF.setDoOutput(true);
        return httpURLConnectionF;
    }

    public HttpURLConnection e(Uri uri) throws IOException {
        HttpURLConnection httpURLConnectionF = f(uri);
        httpURLConnectionF.setInstanceFollowRedirects(true);
        httpURLConnectionF.setRequestProperty("User-Agent", ((p11) this.c).j());
        httpURLConnectionF.setRequestProperty("Accept-Encoding", "gzip");
        httpURLConnectionF.setConnectTimeout(this.a);
        httpURLConnectionF.setReadTimeout(this.b);
        httpURLConnectionF.setRequestMethod("GET");
        return httpURLConnectionF;
    }

    public HttpURLConnection g(Uri uri, int i) throws IOException {
        HttpURLConnection httpURLConnectionF = f(uri);
        httpURLConnectionF.setInstanceFollowRedirects(true);
        httpURLConnectionF.setRequestProperty("User-Agent", ((p11) this.c).j());
        httpURLConnectionF.setRequestProperty("Accept-Encoding", "gzip");
        httpURLConnectionF.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        httpURLConnectionF.setRequestProperty("Content-Length", String.valueOf(i));
        httpURLConnectionF.setConnectTimeout(this.a);
        httpURLConnectionF.setReadTimeout(this.b);
        httpURLConnectionF.setRequestMethod("POST");
        httpURLConnectionF.setDoOutput(true);
        return httpURLConnectionF;
    }

    public ix0 h(Uri uri, LinkedHashMap linkedHashMap, hj1 hj1Var) {
        byte[] bytes;
        Map map = Collections.EMPTY_MAP;
        HttpURLConnection httpURLConnectionG = null;
        if (linkedHashMap.isEmpty()) {
            bytes = e;
        } else {
            Uri.Builder builderBuildUpon = Uri.parse(BuildConfig.FLAVOR).buildUpon();
            g93.f(builderBuildUpon, linkedHashMap);
            try {
                bytes = builderBuildUpon.build().getEncodedQuery().getBytes("UTF-8");
            } catch (UnsupportedEncodingException e2) {
                sm0.n(e2);
                return null;
            }
        }
        try {
            try {
                httpURLConnectionG = g(uri, bytes.length);
                i(httpURLConnectionG, map);
                httpURLConnectionG.connect();
                OutputStream outputStream = httpURLConnectionG.getOutputStream();
                outputStream.write(bytes);
                outputStream.flush();
                ix0 ix0VarB = b(httpURLConnectionG, hj1Var, (r41) this.d);
                httpURLConnectionG.disconnect();
                return ix0VarB;
            } catch (IOException e3) {
                ix0 ix0VarA = ix0.a(jx0.c, new LineApiError(e3));
                if (httpURLConnectionG != null) {
                    httpURLConnectionG.disconnect();
                }
                return ix0VarA;
            }
        } catch (Throwable th) {
            if (httpURLConnectionG != null) {
                httpURLConnectionG.disconnect();
            }
            throw th;
        }
    }

    public void j(int i, int i2, int i3) {
        int i4 = i - 2;
        int i5 = i2 - 2;
        c(i4, i5, i3, 1);
        int i6 = i2 - 1;
        c(i4, i6, i3, 2);
        int i7 = i - 1;
        c(i7, i5, i3, 3);
        c(i7, i6, i3, 4);
        c(i7, i2, i3, 5);
        c(i, i5, i3, 6);
        c(i, i6, i3, 7);
        c(i, i2, i3, 8);
    }

    public vl(Context context) {
        this.c = new p11(context, 11);
        this.d = new r41(9);
        this.a = 90000;
        this.b = 90000;
    }

    public vl(String str, int i, int i2) {
        this.c = str;
        this.b = i;
        this.a = i2;
        byte[] bArr = new byte[i * i2];
        this.d = bArr;
        Arrays.fill(bArr, (byte) -1);
    }
}
