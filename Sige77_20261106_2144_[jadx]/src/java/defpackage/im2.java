package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.auth.FirebaseAuth;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class im2 extends AsyncTask {
    public static final h01 g = new h01("FirebaseAuth", "GetAuthDomainTask");
    public final String a;
    public final String b;
    public final WeakReference c;
    public final Uri.Builder d;
    public final String e;
    public final hc0 f;

    public im2(String str, String str2, Intent intent, hc0 hc0Var, nm2 nm2Var) {
        gu2.l(str);
        this.a = str;
        this.f = hc0Var;
        gu2.l(str2);
        gu2.o(intent);
        String stringExtra = intent.getStringExtra("com.google.firebase.auth.KEY_API_KEY");
        gu2.l(stringExtra);
        Uri.Builder builderBuildUpon = Uri.parse(nm2Var.zza(stringExtra)).buildUpon();
        Uri.Builder builderAppendQueryParameter = builderBuildUpon.appendPath("getProjectConfig").appendQueryParameter("key", stringExtra).appendQueryParameter("androidPackageName", str);
        gu2.o(str2);
        builderAppendQueryParameter.appendQueryParameter("sha1Cert", str2);
        this.b = builderBuildUpon.build().toString();
        this.c = new WeakReference(nm2Var);
        this.d = nm2Var.b(intent, str, str2);
        this.e = intent.getStringExtra("com.google.firebase.auth.KEY_CUSTOM_AUTH_DOMAIN");
    }

    public static String a(HttpURLConnection httpURLConnection) {
        try {
            if (httpURLConnection.getResponseCode() < 400) {
                return null;
            }
            InputStream errorStream = httpURLConnection.getErrorStream();
            return errorStream == null ? "WEB_INTERNAL_ERROR:Could not retrieve the authDomain for this project but did not receive an error response from the network request. Please try again." : aj0.V(new String(d(errorStream)));
        } catch (IOException e) {
            h01 h01Var = g;
            Log.w(h01Var.a, h01Var.i("Error parsing error message from response body in getErrorMessageFromBody. ".concat(String.valueOf(e)), new Object[0]));
            return null;
        }
    }

    public static boolean c(String str) {
        try {
            String host = new URI("https://" + str).getHost();
            return host != null && (host.endsWith("firebaseapp.com") || host.endsWith("web.app"));
        } catch (URISyntaxException e) {
            g.h("Error parsing URL for auth domain check: " + str + ". " + e.getMessage(), new Object[0]);
        }
    }

    public static byte[] d(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byte[] bArr = new byte[128];
            while (true) {
                int i = inputStream.read(bArr);
                if (i == -1) {
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, i);
            }
        } finally {
            byteArrayOutputStream.close();
        }
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void onPostExecute(pm2 pm2Var) {
        String str;
        String str2;
        Uri.Builder builder;
        nm2 nm2Var = (nm2) this.c.get();
        if (pm2Var != null) {
            str = pm2Var.a;
            str2 = pm2Var.b;
        } else {
            str = null;
            str2 = null;
        }
        if (nm2Var == null) {
            g.h("An error has occurred: the handler reference has returned null.", new Object[0]);
        } else if (TextUtils.isEmpty(str) || (builder = this.d) == null) {
            nm2Var.a(kv.m0(str2));
        } else {
            builder.authority(str);
            nm2Var.c(builder.build(), this.a, FirebaseAuth.getInstance(this.f).p);
        }
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        String str = this.e;
        h01 h01Var = g;
        try {
            URL url = new URL(this.b);
            nm2 nm2Var = (nm2) this.c.get();
            HttpURLConnection httpURLConnectionD = nm2Var.d(url);
            httpURLConnectionD.addRequestProperty("Content-Type", "application/json; charset=UTF-8");
            httpURLConnectionD.setConnectTimeout(60000);
            new ep1(nm2Var.zza(), this.f, jf2.d().f()).H(httpURLConnectionD);
            int responseCode = httpURLConnectionD.getResponseCode();
            if (responseCode != 200) {
                String strA = a(httpURLConnectionD);
                h01Var.h("Error getting project config. Failed with " + strA + " " + responseCode, new Object[0]);
                pm2 pm2Var = new pm2();
                pm2Var.b = strA;
                return pm2Var;
            }
            lk0 lk0Var = new lk0();
            lk0Var.zza(new String(d(httpURLConnectionD.getInputStream())));
            boolean zIsEmpty = TextUtils.isEmpty(str);
            ArrayList arrayList = lk0Var.a;
            if (!zIsEmpty) {
                if (arrayList.contains(str)) {
                    pm2 pm2Var2 = new pm2();
                    pm2Var2.a = str;
                    return pm2Var2;
                }
                pm2 pm2Var3 = new pm2();
                pm2Var3.b = "UNAUTHORIZED_DOMAIN";
                return pm2Var3;
            }
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                String str2 = (String) obj;
                if (c(str2)) {
                    pm2 pm2Var4 = new pm2();
                    pm2Var4.a = str2;
                    return pm2Var4;
                }
            }
            return null;
        } catch (IOException e) {
            h01Var.h(ts.j("IOException occurred: ", e.getMessage()), new Object[0]);
            return null;
        } catch (NullPointerException e2) {
            h01Var.h(ts.j("Null pointer encountered: ", e2.getMessage()), new Object[0]);
            return null;
        } catch (sk2 e3) {
            h01Var.h(ts.j("ConversionException encountered: ", e3.getMessage()), new Object[0]);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final /* synthetic */ void onCancelled(Object obj) {
        onPostExecute(null);
    }
}
