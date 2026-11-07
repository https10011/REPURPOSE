package defpackage;

import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.Pair;
import com.hjq.toast.BuildConfig;
import io.jsonwebtoken.Header;
import java.io.DataOutputStream;
import java.io.File;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.Locale;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import org.json.JSONObject;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class gg2 extends nc2 {
    public final long c;
    public final File d;
    public final ic e;

    public gg2(long j, File file, ic icVar) {
        this.c = j;
        this.d = file;
        this.e = icVar;
    }

    /* JADX WARN: Code duplicated, block: B:99:0x02e4  */
    @Override // defpackage.nc2
    public final void a() throws Throwable {
        String strJ;
        int length;
        HttpURLConnection httpURLConnection;
        HttpURLConnection httpURLConnection2;
        byte[] bArrM;
        SSLContext sSLContextA;
        long j = this.c;
        File file = this.d;
        if (file.exists() && file.isFile() && file.getName().contains("upload")) {
            try {
                strJ = !file.exists() ? BuildConfig.FLAVOR : new ox1(file.getPath()).j();
            } catch (Exception unused) {
            }
            length = strJ.split("\n").length;
        } else {
            strJ = null;
            length = 0;
        }
        if (TextUtils.isEmpty(strJ) || length <= 0) {
            return;
        }
        byte[] bytes = strJ.getBytes();
        ic icVar = this.e;
        pb2 pb2Var = new pb2("sdk_error");
        v61 v61Var = new v61(2, pb2Var);
        try {
            try {
                URL url = new URL(kv.y(icVar.a, true));
                httpURLConnection2 = (HttpURLConnection) url.openConnection();
                try {
                    if (httpURLConnection2 instanceof HttpsURLConnection) {
                        if (y21.h == null && (sSLContextA = fd2.a()) != null) {
                            y21.h = sSLContextA.getSocketFactory();
                        }
                        SSLSocketFactory sSLSocketFactory = y21.h;
                        if (sSLSocketFactory != null) {
                            ((HttpsURLConnection) httpURLConnection2).setSSLSocketFactory(sSLSocketFactory);
                            ((HttpsURLConnection) httpURLConnection2).setHostnameVerifier(fd2.a);
                        }
                    }
                    httpURLConnection2.setReadTimeout(20000);
                    httpURLConnection2.setConnectTimeout(30000);
                    httpURLConnection2.setDoOutput(true);
                    httpURLConnection2.setUseCaches(false);
                    httpURLConnection2.setRequestMethod("POST");
                    httpURLConnection2.setInstanceFollowRedirects(true);
                    if (icVar.b * 1024 <= bytes.length) {
                        httpURLConnection2.setRequestProperty("Accept-Encoding", "gzip, deflate");
                        httpURLConnection2.setRequestProperty(Header.COMPRESSION_ALGORITHM, "1");
                        bArrM = rq0.m(bytes);
                    } else {
                        httpURLConnection2.setRequestProperty("Accept-Encoding", "text/example");
                        httpURLConnection2.setRequestProperty(Header.COMPRESSION_ALGORITHM, "0");
                        bArrM = bytes;
                    }
                    httpURLConnection2.setRequestProperty("fixed", "1");
                    httpURLConnection2.setRequestProperty("record-id", j + BuildConfig.FLAVOR);
                    httpURLConnection2.setRequestProperty("count", length + BuildConfig.FLAVOR);
                    httpURLConnection2.setRequestProperty("ver", "1.2.0.0-snowball");
                    rx1 rx1VarE = ld2.f().e(j);
                    if (rx1VarE == null) {
                        cc2.a("requestByPost TidConfigBean " + j + " is missing, maybe cancelled");
                        pb2Var.d = "tid not found";
                        httpURLConnection2.disconnect();
                    } else {
                        rx1VarE.c.getClass();
                        byte[] bArr = (byte[]) ((Pair) icVar.c).second;
                        nl1 nl1Var = bArr == null ? null : new nl1(bArr);
                        if (nl1Var == null) {
                            pb2Var.d = "encrypt error";
                            httpURLConnection2.disconnect();
                        } else {
                            byte[] bytes2 = Base64.encodeToString(nl1Var.e(bArrM), 2).getBytes();
                            if (bytes2 == null) {
                                cc2.c("requestByPost buffer is null");
                                pb2Var.d = "base64 error";
                                httpURLConnection2.disconnect();
                            } else {
                                String strD = rq0.d(bytes2);
                                if (TextUtils.isEmpty(strD)) {
                                    httpURLConnection2.setRequestProperty("md5", "error");
                                } else {
                                    httpURLConnection2.setRequestProperty("md5", strD);
                                }
                                httpURLConnection2.setRequestProperty("encrypt-level", String.valueOf(3));
                                httpURLConnection2.setRequestProperty("encrypt-index", String.valueOf(((Integer) ((Pair) icVar.c).first).intValue() + 1));
                                cc2.e(url + " tid = " + j + " count = " + length);
                                httpURLConnection2.connect();
                                DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection2.getOutputStream());
                                dataOutputStream.write(bytes2);
                                dataOutputStream.flush();
                                dataOutputStream.close();
                                if (httpURLConnection2.getResponseCode() == 200) {
                                    String strA = rq0.a(httpURLConnection2.getInputStream());
                                    Locale locale = Locale.ENGLISH;
                                    cc2.e("post tid: " + j + " response: " + strA);
                                    if (TextUtils.isEmpty(strA)) {
                                        v61Var = new v61(-1, new pb2("rc_" + length));
                                        httpURLConnection2.disconnect();
                                    } else {
                                        int iOptInt = new JSONObject(strA).optInt("code");
                                        if (iOptInt == 0) {
                                            v61Var = new v61(0, new pb2());
                                            httpURLConnection2.disconnect();
                                        } else {
                                            v61Var = new v61(-1, new pb2("rc_" + iOptInt));
                                            httpURLConnection2.disconnect();
                                        }
                                    }
                                } else {
                                    v61Var = new v61(-1, new pb2("rc_" + rq0.a(httpURLConnection2.getErrorStream())));
                                    httpURLConnection2.disconnect();
                                }
                            }
                        }
                    }
                } catch (Exception e) {
                    e = e;
                    if (e instanceof UnknownHostException) {
                        cc2.c(e.getMessage());
                    } else {
                        cc2.c(Log.getStackTraceString(e));
                    }
                    if (httpURLConnection2 != null) {
                        httpURLConnection2.disconnect();
                    }
                    v61Var = new v61(-1, new pb2());
                }
            } catch (Throwable th) {
                th = th;
                if (0 != 0) {
                    httpURLConnection.disconnect();
                }
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            httpURLConnection2 = null;
        } catch (Throwable th2) {
            th = th2;
            httpURLConnection = null;
            if (0 != 0) {
                httpURLConnection.disconnect();
            }
            throw th;
        }
        if (v61Var.a != 0) {
            cc2.c("PostEventFileTask requestByPost error");
        } else {
            cc2.f("PostEventFileTask lines : %d, deleteFile : %s", Long.valueOf(j), Integer.valueOf(length), Boolean.valueOf(nj2.n(hc.h, file)));
        }
    }

    @Override // defpackage.nc2
    public final String c() {
        return "Upload-File";
    }
}
