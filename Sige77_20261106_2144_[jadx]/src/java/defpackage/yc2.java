package defpackage;

import android.os.Handler;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.Pair;
import com.appsflyer.a;
import com.hjq.toast.BuildConfig;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import org.json.JSONObject;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class yc2 extends nc2 {
    public final hf2 c;
    public final ox1 d;

    public yc2(Handler handler, hf2 hf2Var, ox1 ox1Var) {
        super(handler);
        this.c = hf2Var;
        this.d = ox1Var;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x02b9 A[Catch: Exception -> 0x02b0, TryCatch #0 {Exception -> 0x02b0, blocks: (B:89:0x0260, B:93:0x0289, B:97:0x0295, B:99:0x029d, B:102:0x02b3, B:104:0x02b9, B:105:0x02c0, B:107:0x02c6, B:108:0x02cc, B:110:0x02d2, B:111:0x02f9, B:113:0x02ff, B:114:0x0305, B:116:0x030b, B:117:0x0311, B:123:0x0320, B:92:0x0287), top: B:134:0x0260 }] */
    /* JADX WARN: Code duplicated, block: B:107:0x02c6 A[Catch: Exception -> 0x02b0, TryCatch #0 {Exception -> 0x02b0, blocks: (B:89:0x0260, B:93:0x0289, B:97:0x0295, B:99:0x029d, B:102:0x02b3, B:104:0x02b9, B:105:0x02c0, B:107:0x02c6, B:108:0x02cc, B:110:0x02d2, B:111:0x02f9, B:113:0x02ff, B:114:0x0305, B:116:0x030b, B:117:0x0311, B:123:0x0320, B:92:0x0287), top: B:134:0x0260 }] */
    /* JADX WARN: Code duplicated, block: B:110:0x02d2 A[Catch: Exception -> 0x02b0, TryCatch #0 {Exception -> 0x02b0, blocks: (B:89:0x0260, B:93:0x0289, B:97:0x0295, B:99:0x029d, B:102:0x02b3, B:104:0x02b9, B:105:0x02c0, B:107:0x02c6, B:108:0x02cc, B:110:0x02d2, B:111:0x02f9, B:113:0x02ff, B:114:0x0305, B:116:0x030b, B:117:0x0311, B:123:0x0320, B:92:0x0287), top: B:134:0x0260 }] */
    /* JADX WARN: Code duplicated, block: B:113:0x02ff A[Catch: Exception -> 0x02b0, TryCatch #0 {Exception -> 0x02b0, blocks: (B:89:0x0260, B:93:0x0289, B:97:0x0295, B:99:0x029d, B:102:0x02b3, B:104:0x02b9, B:105:0x02c0, B:107:0x02c6, B:108:0x02cc, B:110:0x02d2, B:111:0x02f9, B:113:0x02ff, B:114:0x0305, B:116:0x030b, B:117:0x0311, B:123:0x0320, B:92:0x0287), top: B:134:0x0260 }] */
    /* JADX WARN: Code duplicated, block: B:116:0x030b A[Catch: Exception -> 0x02b0, TryCatch #0 {Exception -> 0x02b0, blocks: (B:89:0x0260, B:93:0x0289, B:97:0x0295, B:99:0x029d, B:102:0x02b3, B:104:0x02b9, B:105:0x02c0, B:107:0x02c6, B:108:0x02cc, B:110:0x02d2, B:111:0x02f9, B:113:0x02ff, B:114:0x0305, B:116:0x030b, B:117:0x0311, B:123:0x0320, B:92:0x0287), top: B:134:0x0260 }] */
    /* JADX WARN: Code duplicated, block: B:119:0x031a  */
    /* JADX WARN: Code duplicated, block: B:129:0x0352  */
    /* JADX WARN: Code duplicated, block: B:150:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x020b  */
    /* JADX WARN: Code duplicated, block: B:79:0x0213  */
    /* JADX WARN: Code duplicated, block: B:84:0x0221  */
    /* JADX WARN: Code duplicated, block: B:86:0x0224  */
    /* JADX WARN: Code duplicated, block: B:87:0x022b  */
    /* JADX WARN: Code duplicated, block: B:88:0x0242  */
    /* JADX WARN: Code duplicated, block: B:91:0x0286  */
    /* JADX WARN: Code duplicated, block: B:92:0x0287 A[Catch: Exception -> 0x02b0, TryCatch #0 {Exception -> 0x02b0, blocks: (B:89:0x0260, B:93:0x0289, B:97:0x0295, B:99:0x029d, B:102:0x02b3, B:104:0x02b9, B:105:0x02c0, B:107:0x02c6, B:108:0x02cc, B:110:0x02d2, B:111:0x02f9, B:113:0x02ff, B:114:0x0305, B:116:0x030b, B:117:0x0311, B:123:0x0320, B:92:0x0287), top: B:134:0x0260 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x0292  */
    /* JADX WARN: Code duplicated, block: B:96:0x0294  */
    /* JADX WARN: Code duplicated, block: B:99:0x029d A[Catch: Exception -> 0x02b0, TryCatch #0 {Exception -> 0x02b0, blocks: (B:89:0x0260, B:93:0x0289, B:97:0x0295, B:99:0x029d, B:102:0x02b3, B:104:0x02b9, B:105:0x02c0, B:107:0x02c6, B:108:0x02cc, B:110:0x02d2, B:111:0x02f9, B:113:0x02ff, B:114:0x0305, B:116:0x030b, B:117:0x0311, B:123:0x0320, B:92:0x0287), top: B:134:0x0260 }] */
    @Override // defpackage.nc2
    public final void a() throws Throwable {
        int i;
        hf2 hf2Var;
        JSONObject jSONObject;
        long j;
        boolean z;
        int i2;
        int iOptInt;
        md2 md2Var;
        nd2 nd2Var;
        HttpURLConnection httpURLConnection;
        HttpURLConnection httpURLConnection2;
        byte[] bArrDoFinal;
        v61 v61Var;
        SSLContext sSLContextA;
        String str = ze2.a;
        String str2 = ze2.a(false) + ze2.f;
        hf2 hf2Var2 = this.c;
        long j2 = hf2Var2.f;
        HttpURLConnection httpURLConnection3 = null;
        v61 v61Var2 = new v61(-1, null);
        try {
            try {
                KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
                keyGenerator.init(128);
                String strO = rq0.o(keyGenerator.generateKey().getEncoded());
                nl1 nl1Var = new nl1(strO.getBytes());
                try {
                    Cipher cipher = (Cipher) nl1Var.b;
                    try {
                        if (cipher != null) {
                            try {
                                bArrDoFinal = cipher.doFinal(BuildConfig.FLAVOR.getBytes("UTF-8"));
                            } catch (Exception e) {
                                try {
                                    cc2.c(Log.getStackTraceString(e));
                                    bArrDoFinal = null;
                                } catch (Exception e2) {
                                    e = e2;
                                    httpURLConnection2 = null;
                                    httpURLConnection3 = httpURLConnection2;
                                    cc2.c(e.getMessage());
                                    if (httpURLConnection3 != null) {
                                        httpURLConnection3.disconnect();
                                    }
                                    i = v61Var2.a;
                                    if (i == -1) {
                                        String str3 = ze2.a;
                                    }
                                    if (i == 0) {
                                        String str4 = (String) v61Var2.b;
                                        cc2.f("<-- globalConfig:%s", str4);
                                        md2 md2Var2 = ld2.f().a;
                                        md2Var2.getClass();
                                        try {
                                            hf2Var = (hf2) ((f91) md2Var2.b).b;
                                            jSONObject = new JSONObject(str4);
                                            hf2Var.a = jSONObject.getLong("cv") * 3600000;
                                            j = jSONObject.getLong("threshold");
                                            if (j > 0) {
                                                hf2Var.b = j;
                                            }
                                            if (jSONObject.getInt("once") == 1) {
                                                z = true;
                                            } else {
                                                z = false;
                                            }
                                            hf2Var.c = z;
                                            if (jSONObject.has("networks")) {
                                                JSONObject jSONObject2 = jSONObject.getJSONObject("networks");
                                                hf2Var.d = jSONObject2.getString("url");
                                                hf2Var.e = jSONObject2.getJSONObject("tids");
                                            }
                                            if (jSONObject.has("p")) {
                                                hf2Var.b(jSONObject.getJSONArray("p"));
                                            }
                                            if (jSONObject.has("ver")) {
                                                hf2Var.f = jSONObject.getLong("ver");
                                            }
                                            if (jSONObject.has("delays")) {
                                                String[] strArrSplit = jSONObject.getString("delays").split(",");
                                                hf2Var.m = new Pair(Integer.valueOf(Integer.parseInt(strArrSplit[0])), Integer.valueOf(Integer.parseInt(strArrSplit[1])));
                                            }
                                            if (jSONObject.has("tz")) {
                                                hf2Var.n = jSONObject.getString("tz");
                                            }
                                            if (jSONObject.has("dlt")) {
                                                hf2Var.p = jSONObject.getInt("dlt");
                                            }
                                            i2 = 6;
                                            iOptInt = jSONObject.optInt("geo", 6);
                                            if (iOptInt > 0) {
                                                i2 = iOptInt;
                                            }
                                            hf2Var.o = i2;
                                        } catch (Exception e3) {
                                            cc2.c(Log.getStackTraceString(e3));
                                            oc2.a("updateGlobalConfig", e3);
                                        }
                                        hf2Var2.g = System.currentTimeMillis() + hf2Var2.a;
                                        hf2Var2.h = 0;
                                        this.a.postAtFrontOfQueue(new a(this, 1));
                                    } else if (i != 1) {
                                        hf2Var2.h++;
                                    } else {
                                        cc2.f("<-- globalConfig:%s", "NOT_MODIFIED");
                                        hf2Var2.g = System.currentTimeMillis() + hf2Var2.a;
                                        hf2Var2.h = 0;
                                    }
                                    md2Var = ld2.f().a;
                                    nd2Var = (nd2) md2Var.a;
                                    if (nd2Var != null) {
                                        nd2Var.c(((f91) md2Var.b).g());
                                    }
                                }
                            }
                        } else {
                            bArrDoFinal = null;
                        }
                        try {
                            byte[] bArrDecode = Base64.decode("MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEArNrm4jErOdstd1P5L1X/\nCGSS6NKf4glPrFbTM97aE9ZKGUiMALIV8W7FClAgLZdtTZkL5XEQdbX4RB/C6edc\nnN2ifla6sVu23y78FMiL6smp9ayE7Y3gSEfB3md4nvEUpyRUu4wYLIf9nVR36okK\nGCerxYdLtDbJ69Rux4lgE5C9a6qLfV6BzjJYONk/vQhGQYT6qes+TFtXV0hvF8UM\nDG+0GfA3MiQue/Ny8uIPBykDPS1dcIADzVos2fXs/o2aFTrkdVjiX8irwYBze69K\nzFx18H12iZ9gG1VztMbHetvImBoXeCOwjTc5RnGIz+Hya96pxJLK2DcSlAaHEs1H\nOQIDAQAB", 2);
                            byte[] bytes = strO.getBytes(Charset.forName("UTF-8"));
                            PublicKey publicKeyGeneratePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(bArrDecode));
                            Cipher cipher2 = Cipher.getInstance("RSA/ECB/PKCS1Padding");
                            cipher2.init(1, publicKeyGeneratePublic);
                            String str5 = Base64.encodeToString(bArrDoFinal, 2) + "," + Base64.encodeToString(cipher2.doFinal(bytes), 2);
                            URL url = new URL(kv.y(str2, true));
                            httpURLConnection3 = (HttpURLConnection) url.openConnection();
                            try {
                                if (httpURLConnection3 instanceof HttpsURLConnection) {
                                    if (y21.h == null && (sSLContextA = fd2.a()) != null) {
                                        y21.h = sSLContextA.getSocketFactory();
                                    }
                                    SSLSocketFactory sSLSocketFactory = y21.h;
                                    if (sSLSocketFactory != null) {
                                        ((HttpsURLConnection) httpURLConnection3).setSSLSocketFactory(sSLSocketFactory);
                                        ((HttpsURLConnection) httpURLConnection3).setHostnameVerifier(fd2.a);
                                    }
                                }
                                httpURLConnection3.setRequestProperty("accept", "*/*");
                                httpURLConnection3.setRequestProperty("Content-Length", String.valueOf(str5.length()));
                                httpURLConnection3.setRequestProperty("encrypt-level", "2");
                                httpURLConnection3.setRequestProperty("ver", String.valueOf(j2));
                                httpURLConnection3.setRequestProperty("vn", "1");
                                httpURLConnection3.setRequestMethod("POST");
                                httpURLConnection3.setReadTimeout(20000);
                                httpURLConnection3.setConnectTimeout(30000);
                                httpURLConnection3.setDoInput(true);
                                httpURLConnection3.setDoOutput(true);
                                PrintWriter printWriter = new PrintWriter(httpURLConnection3.getOutputStream());
                                printWriter.write(str5);
                                printWriter.flush();
                                printWriter.close();
                                int responseCode = httpURLConnection3.getResponseCode();
                                try {
                                    JSONObject jSONObject3 = new JSONObject();
                                    jSONObject3.put("url", url);
                                    jSONObject3.put("params", BuildConfig.FLAVOR);
                                    jSONObject3.put("version", j2);
                                    jSONObject3.put("code", responseCode);
                                    cc2.f("--> request config:%s", jSONObject3.toString());
                                } catch (Exception e4) {
                                    cc2.d("print request config exception:%s", e4.getMessage());
                                }
                                if (responseCode == 200) {
                                    String strA = rq0.a(httpURLConnection3.getInputStream());
                                    if (TextUtils.equals("{}", strA)) {
                                        v61Var = new v61(1, null);
                                    } else if (TextUtils.isEmpty(strA)) {
                                        v61Var = new v61(-1, null);
                                    } else {
                                        v61Var = new v61(0, str2.contains("secret") ? new String(nl1Var.d(Base64.decode(strA, 2)), StandardCharsets.UTF_8) : new String(rq0.s(nl1Var.d(Base64.decode(strA, 2))), StandardCharsets.UTF_8));
                                    }
                                    v61Var2 = v61Var;
                                } else {
                                    v61Var2 = new v61(-1, rq0.a(httpURLConnection3.getErrorStream()));
                                }
                                httpURLConnection3.disconnect();
                            } catch (Exception e5) {
                                e = e5;
                                cc2.c(e.getMessage());
                                if (httpURLConnection3 != null) {
                                    httpURLConnection3.disconnect();
                                }
                            }
                        } catch (Exception e6) {
                            e = e6;
                            httpURLConnection2 = null;
                            httpURLConnection3 = httpURLConnection2;
                            cc2.c(e.getMessage());
                            if (httpURLConnection3 != null) {
                                httpURLConnection3.disconnect();
                            }
                            i = v61Var2.a;
                            if (i == -1) {
                                String str6 = ze2.a;
                            }
                            if (i == 0) {
                                String str7 = (String) v61Var2.b;
                                cc2.f("<-- globalConfig:%s", str7);
                                md2 md2Var3 = ld2.f().a;
                                md2Var3.getClass();
                                hf2Var = (hf2) ((f91) md2Var3.b).b;
                                jSONObject = new JSONObject(str7);
                                hf2Var.a = jSONObject.getLong("cv") * 3600000;
                                j = jSONObject.getLong("threshold");
                                if (j > 0) {
                                    hf2Var.b = j;
                                }
                                if (jSONObject.getInt("once") == 1) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                hf2Var.c = z;
                                if (jSONObject.has("networks")) {
                                    JSONObject jSONObject4 = jSONObject.getJSONObject("networks");
                                    hf2Var.d = jSONObject4.getString("url");
                                    hf2Var.e = jSONObject4.getJSONObject("tids");
                                }
                                if (jSONObject.has("p")) {
                                    hf2Var.b(jSONObject.getJSONArray("p"));
                                }
                                if (jSONObject.has("ver")) {
                                    hf2Var.f = jSONObject.getLong("ver");
                                }
                                if (jSONObject.has("delays")) {
                                    String[] strArrSplit2 = jSONObject.getString("delays").split(",");
                                    hf2Var.m = new Pair(Integer.valueOf(Integer.parseInt(strArrSplit2[0])), Integer.valueOf(Integer.parseInt(strArrSplit2[1])));
                                }
                                if (jSONObject.has("tz")) {
                                    hf2Var.n = jSONObject.getString("tz");
                                }
                                if (jSONObject.has("dlt")) {
                                    hf2Var.p = jSONObject.getInt("dlt");
                                }
                                i2 = 6;
                                iOptInt = jSONObject.optInt("geo", 6);
                                if (iOptInt > 0) {
                                    i2 = iOptInt;
                                }
                                hf2Var.o = i2;
                                hf2Var2.g = System.currentTimeMillis() + hf2Var2.a;
                                hf2Var2.h = 0;
                                this.a.postAtFrontOfQueue(new a(this, 1));
                            } else if (i != 1) {
                                hf2Var2.h++;
                            } else {
                                cc2.f("<-- globalConfig:%s", "NOT_MODIFIED");
                                hf2Var2.g = System.currentTimeMillis() + hf2Var2.a;
                                hf2Var2.h = 0;
                            }
                            md2Var = ld2.f().a;
                            nd2Var = (nd2) md2Var.a;
                            if (nd2Var != null) {
                                nd2Var.c(((f91) md2Var.b).g());
                            }
                        } catch (Throwable th) {
                            th = th;
                            httpURLConnection = null;
                            httpURLConnection3 = httpURLConnection;
                            if (httpURLConnection3 != null) {
                                httpURLConnection3.disconnect();
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Exception e7) {
                    e = e7;
                    httpURLConnection2 = null;
                } catch (Throwable th3) {
                    th = th3;
                    httpURLConnection = null;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Exception e8) {
            e = e8;
        } catch (Throwable th5) {
            th = th5;
        }
        i = v61Var2.a;
        if (i == -1 && rq0.h(hf2Var2.l)) {
            String str8 = ze2.a;
        }
        if (i == 0) {
            String str9 = (String) v61Var2.b;
            cc2.f("<-- globalConfig:%s", str9);
            md2 md2Var4 = ld2.f().a;
            md2Var4.getClass();
            hf2Var = (hf2) ((f91) md2Var4.b).b;
            jSONObject = new JSONObject(str9);
            hf2Var.a = jSONObject.getLong("cv") * 3600000;
            j = jSONObject.getLong("threshold");
            if (j > 0) {
                hf2Var.b = j;
            }
            if (jSONObject.getInt("once") == 1) {
                z = true;
            } else {
                z = false;
            }
            hf2Var.c = z;
            if (jSONObject.has("networks")) {
                JSONObject jSONObject5 = jSONObject.getJSONObject("networks");
                hf2Var.d = jSONObject5.getString("url");
                hf2Var.e = jSONObject5.getJSONObject("tids");
            }
            if (jSONObject.has("p")) {
                hf2Var.b(jSONObject.getJSONArray("p"));
            }
            if (jSONObject.has("ver")) {
                hf2Var.f = jSONObject.getLong("ver");
            }
            if (jSONObject.has("delays")) {
                String[] strArrSplit3 = jSONObject.getString("delays").split(",");
                hf2Var.m = new Pair(Integer.valueOf(Integer.parseInt(strArrSplit3[0])), Integer.valueOf(Integer.parseInt(strArrSplit3[1])));
            }
            if (jSONObject.has("tz")) {
                hf2Var.n = jSONObject.getString("tz");
            }
            if (jSONObject.has("dlt")) {
                hf2Var.p = jSONObject.getInt("dlt");
            }
            i2 = 6;
            iOptInt = jSONObject.optInt("geo", 6);
            if (iOptInt > 0 && iOptInt < 12) {
                i2 = iOptInt;
            }
            hf2Var.o = i2;
            hf2Var2.g = System.currentTimeMillis() + hf2Var2.a;
            hf2Var2.h = 0;
            this.a.postAtFrontOfQueue(new a(this, 1));
        } else if (i != 1) {
            hf2Var2.h++;
        } else {
            cc2.f("<-- globalConfig:%s", "NOT_MODIFIED");
            hf2Var2.g = System.currentTimeMillis() + hf2Var2.a;
            hf2Var2.h = 0;
        }
        md2Var = ld2.f().a;
        nd2Var = (nd2) md2Var.a;
        if (nd2Var != null) {
            nd2Var.c(((f91) md2Var.b).g());
        }
    }

    @Override // defpackage.nc2
    public final String c() {
        return "Retrieve-Global-Config";
    }
}
