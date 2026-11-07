package defpackage;

import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.transsion.infra.gateway.core.bean.GatewaySignKey;
import com.transsion.infra.gateway.core.bean.RequestBean;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class if2 {
    public static SSLSocketFactory a;

    static {
        Pattern.compile("\\d+");
        a = null;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x02a3 A[Catch: all -> 0x02ab, TryCatch #7 {all -> 0x02ab, blocks: (B:99:0x029f, B:101:0x02a3, B:104:0x02ad), top: B:119:0x029f }] */
    /* JADX WARN: Code duplicated, block: B:104:0x02ad A[Catch: all -> 0x02ab, TRY_LEAVE, TryCatch #7 {all -> 0x02ab, blocks: (B:99:0x029f, B:101:0x02a3, B:104:0x02ad), top: B:119:0x029f }] */
    /* JADX WARN: Code duplicated, block: B:106:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:110:0x02bd  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [v61] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    public static v61 a(int i, String str, String str2) {
        v61 v61Var;
        ?? v61Var2;
        HttpURLConnection httpURLConnection;
        byte[] bArrDoFinal;
        v61 v61Var3;
        v61 v61Var4;
        GatewaySignKey gatewaySignKey;
        v61 v61Var5;
        v61 v61Var6;
        SSLContext sSLContextA;
        am2.g("Post url : " + str + "\nBody : " + str2);
        HttpURLConnection httpURLConnection2 = null;
        v61 v61Var7 = new v61(-1, null);
        try {
            String strA = gu2.a();
            try {
                try {
                    Cipher cipher = (Cipher) new gk1(strA.getBytes()).b;
                    if (cipher != null) {
                        try {
                            bArrDoFinal = cipher.doFinal(str2.getBytes("UTF-8"));
                        } catch (Exception e) {
                            am2.l(Log.getStackTraceString(e));
                            bArrDoFinal = null;
                        }
                    } else {
                        bArrDoFinal = null;
                    }
                    byte[] bArrDecode = Base64.decode("MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAoj6/eaT17WcI4r6GJxLVIDfQkYLRLGWyObKO1kj1FS+7NvAIIhNxjNpplefKGWSLOyuKdkLlH53q+HQeyo3ngDf3IPp8evvBfWaoCk1H33q35hm+W+XKsL5bMbzZhJDVEqYpebXRqL6Cz+79xyWPEHbp1l2G5FKQ76/tKAqZ+7LNeEBhgoX1duXcAXrSR7dOP6loh2DUwagVta/o2poAVzxKQKDJeJs0+VV741yJSjjVMGWAl0enK4MA0lvtmin6LVQMgNuHL5UXmdrbsEcbiVvE7z9Ol6MGDRzxyUBufklb3Orr9tbLNydKJ0mrdHZMcg8yGpuJMMOOs+CBiqA+MQIDAQAB", 2);
                    try {
                        byte[] bytes = strA.getBytes(Charset.forName("UTF-8"));
                        PublicKey publicKeyGeneratePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(bArrDecode));
                        Cipher cipher2 = Cipher.getInstance("RSA/ECB/PKCS1Padding");
                        cipher2.init(1, publicKeyGeneratePublic);
                        String str3 = Base64.encodeToString(bArrDoFinal, 2) + "," + Base64.encodeToString(cipher2.doFinal(bytes), 2);
                        URL url = new URL(str);
                        httpURLConnection = (HttpURLConnection) url.openConnection();
                        try {
                            try {
                                if (httpURLConnection instanceof HttpsURLConnection) {
                                    if (a == null && (sSLContextA = rf2.a()) != null) {
                                        a = sSLContextA.getSocketFactory();
                                    }
                                    SSLSocketFactory sSLSocketFactory = a;
                                    if (sSLSocketFactory != null) {
                                        ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(sSLSocketFactory);
                                        ((HttpsURLConnection) httpURLConnection).setHostnameVerifier(rf2.a);
                                    }
                                }
                                if (i > 0) {
                                    v61 v61Var8 = v61Var7;
                                    try {
                                        gatewaySignKey = new GatewaySignKey("76iRl07s0xSN9jqmEWAt79EBJZulIQIsV64FZr2O", 2, qq1.a);
                                        RequestBean requestBeanBuild = new RequestBean.Builder().method("POST").accept("*/*").contentType("application/json").url(str).key(gatewaySignKey).body(str3).build();
                                        StringBuilder sb = new StringBuilder("Gateway requestBean : ");
                                        sb.append(requestBeanBuild.toString());
                                        am2.g(sb.toString());
                                        String strS = am2.s(requestBeanBuild);
                                        am2.g("Gateway sign : " + strS);
                                        httpURLConnection.setRequestProperty("x-tr-signature", strS);
                                        v61Var2 = sb;
                                        v61Var4 = v61Var8;
                                    } catch (Exception e2) {
                                        e = e2;
                                        v61Var3 = v61Var8;
                                        httpURLConnection2 = httpURLConnection;
                                        v61Var = v61Var3;
                                        v61Var2 = v61Var;
                                        try {
                                            if (e instanceof UnknownHostException) {
                                                am2.l(e.getMessage());
                                            } else {
                                                am2.l(Log.getStackTraceString(e));
                                            }
                                            if (httpURLConnection2 != null) {
                                                httpURLConnection = httpURLConnection2;
                                                httpURLConnection.disconnect();
                                            }
                                            return v61Var2;
                                        } catch (Throwable th) {
                                            th = th;
                                            if (httpURLConnection2 != null) {
                                                httpURLConnection2.disconnect();
                                            }
                                            throw th;
                                        }
                                    }
                                } else {
                                    v61Var4 = v61Var7;
                                    gatewaySignKey = null;
                                    v61Var2 = v61Var7;
                                }
                                httpURLConnection.setRequestProperty("accept", "*/*");
                                httpURLConnection.setRequestProperty("Content-Type", "application/json");
                                httpURLConnection.setRequestProperty("Content-Length", String.valueOf(str3.length()));
                                httpURLConnection.setRequestProperty("appid", String.valueOf(i));
                                httpURLConnection.setRequestMethod("POST");
                                httpURLConnection.setReadTimeout(20000);
                                httpURLConnection.setConnectTimeout(30000);
                                httpURLConnection.setDoInput(true);
                                httpURLConnection.setDoOutput(true);
                                PrintWriter printWriter = new PrintWriter(httpURLConnection.getOutputStream());
                                printWriter.write(str3);
                                printWriter.flush();
                                printWriter.close();
                                int responseCode = httpURLConnection.getResponseCode();
                                am2.g("url:" + url + " code:" + responseCode);
                                try {
                                    if (responseCode != 200) {
                                        if ("429&503&504".contains(String.valueOf(responseCode))) {
                                            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream(), StandardCharsets.UTF_8));
                                            StringBuilder sb2 = new StringBuilder();
                                            while (true) {
                                                String line = bufferedReader.readLine();
                                                if (line == null) {
                                                    break;
                                                }
                                                sb2.append(line);
                                            }
                                            v61Var2 = new v61(4, sb2.toString());
                                        } else if (responseCode < 400 || gatewaySignKey == null) {
                                            v61Var2 = v61Var4;
                                        } else {
                                            am2.g("result from server : " + httpURLConnection.getResponseMessage());
                                            InputStream errorStream = httpURLConnection.getErrorStream();
                                            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(errorStream, StandardCharsets.UTF_8));
                                            StringBuilder sb3 = new StringBuilder();
                                            while (true) {
                                                String line2 = bufferedReader2.readLine();
                                                if (line2 == null) {
                                                    break;
                                                }
                                                sb3.append(line2);
                                            }
                                            String string = sb3.toString();
                                            v61 v61Var9 = am2.L(responseCode, string, gatewaySignKey) ? new v61(3, string) : v61Var4;
                                            bufferedReader2.close();
                                            errorStream.close();
                                            v61Var2 = v61Var9;
                                        }
                                        httpURLConnection.disconnect();
                                        return v61Var2;
                                    }
                                    InputStream inputStream = httpURLConnection.getInputStream();
                                    BufferedReader bufferedReader3 = new BufferedReader(new InputStreamReader(inputStream, Charset.forName("UTF-8")));
                                    StringBuilder sb4 = new StringBuilder();
                                    while (true) {
                                        String line3 = bufferedReader3.readLine();
                                        if (line3 == null) {
                                            break;
                                        }
                                        sb4.append(line3);
                                    }
                                    String string2 = sb4.toString();
                                    if (TextUtils.equals("{}", string2)) {
                                        v61Var6 = new v61(1, null);
                                    } else {
                                        if (TextUtils.isEmpty(string2)) {
                                            v61Var6 = new v61(-1, null);
                                        } else {
                                            v61Var5 = new v61(0, string2);
                                        }
                                        bufferedReader3.close();
                                        inputStream.close();
                                        v61Var2 = v61Var5;
                                    }
                                    v61Var5 = v61Var6;
                                    bufferedReader3.close();
                                    inputStream.close();
                                    v61Var2 = v61Var5;
                                } catch (Exception e3) {
                                    e = e3;
                                    httpURLConnection2 = httpURLConnection;
                                    v61Var2 = v61Var2;
                                    if (e instanceof UnknownHostException) {
                                        am2.l(e.getMessage());
                                    } else {
                                        am2.l(Log.getStackTraceString(e));
                                    }
                                    if (httpURLConnection2 != null) {
                                        httpURLConnection = httpURLConnection2;
                                    }
                                    return v61Var2;
                                }
                            } catch (Exception e4) {
                                e = e4;
                                v61Var3 = v61Var7;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            httpURLConnection2 = httpURLConnection;
                            if (httpURLConnection2 != null) {
                                httpURLConnection2.disconnect();
                            }
                            throw th;
                        }
                    } catch (Exception e5) {
                        e = e5;
                        v61Var = v61Var7;
                        httpURLConnection2 = null;
                        v61Var2 = v61Var;
                        if (e instanceof UnknownHostException) {
                            am2.l(e.getMessage());
                        } else {
                            am2.l(Log.getStackTraceString(e));
                        }
                        if (httpURLConnection2 != null) {
                            httpURLConnection = httpURLConnection2;
                            httpURLConnection.disconnect();
                        }
                        return v61Var2;
                    } catch (Throwable th3) {
                        th = th3;
                        httpURLConnection2 = null;
                        if (httpURLConnection2 != null) {
                            httpURLConnection2.disconnect();
                        }
                        throw th;
                    }
                } catch (Exception e6) {
                    e = e6;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Exception e7) {
            e = e7;
            v61Var = v61Var7;
        } catch (Throwable th5) {
            th = th5;
        }
        httpURLConnection.disconnect();
        return v61Var2;
    }
}
