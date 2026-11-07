package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class m33 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final URL b;
    public final byte[] c;
    public final String d;
    public final Map e;
    public final Object f;
    public final /* synthetic */ lo2 i;

    public m33(o33 o33Var, String str, URL url, byte[] bArr, Map map, h33 h33Var) {
        Objects.requireNonNull(o33Var);
        this.i = o33Var;
        gu2.l(str);
        gu2.o(url);
        this.b = url;
        this.c = bArr;
        this.f = h33Var;
        this.d = str;
        this.e = map;
    }

    public void a(final int i, final IOException iOException, final byte[] bArr, final Map map) {
        t53 t53Var = ((y53) ((da3) this.i).a).i;
        y53.l(t53Var);
        t53Var.N(new Runnable() { // from class: ca3
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                ((ba3) this.a.f).a(i, iOException, bArr);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:164:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:174:0x0302  */
    /* JADX WARN: Code duplicated, block: B:177:0x02af A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:179:0x02ed A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:181:0x0167 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:183:0x0143 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x0158  */
    /* JADX WARN: Code duplicated, block: B:91:0x017c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r24v0, types: [m33] */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.util.Map] */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        Throwable th;
        int responseCode;
        HttpURLConnection httpURLConnection;
        IOException iOException;
        Map map;
        x23 x23Var;
        t53 t53Var;
        InputStream inputStream;
        Throwable th2;
        OutputStream outputStream;
        HttpURLConnection httpURLConnection2;
        ?? r7;
        IOException iOException2;
        OutputStream outputStream2;
        ?? r6;
        String str;
        Object obj;
        String str2;
        InputStream inputStream2;
        Object obj2 = this.f;
        int i = this.a;
        String str3 = "Content-Encoding";
        byte[] bArr = this.c;
        Map map2 = this.e;
        URL url = this.b;
        lo2 lo2Var = this.i;
        int responseCode2 = 0;
        String str4 = this.d;
        switch (i) {
            case 0:
                OutputStream outputStream3 = null;
                Map map3 = null;
                outputStream = null;
                outputStream3 = null;
                outputStream = null;
                outputStream3 = null;
                OutputStream outputStream4 = null;
                o33 o33Var = (o33) lo2Var;
                y53 y53Var = (y53) o33Var.a;
                y53 y53Var2 = (y53) o33Var.a;
                t53 t53Var2 = y53Var.i;
                y53.l(t53Var2);
                t53Var2.I();
                try {
                    URLConnection uRLConnectionOpenConnection = url.openConnection();
                    if (!(uRLConnectionOpenConnection instanceof HttpURLConnection)) {
                        throw new IOException("Failed to obtain HTTP connection");
                    }
                    httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                    httpURLConnection.setDefaultUseCaches(false);
                    y53Var2.getClass();
                    httpURLConnection.setConnectTimeout(60000);
                    httpURLConnection.setReadTimeout(61000);
                    httpURLConnection.setInstanceFollowRedirects(false);
                    httpURLConnection.setDoInput(true);
                    if (map2 != null) {
                        try {
                            for (Map.Entry entry : map2.entrySet()) {
                                httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                            }
                        } catch (IOException e) {
                            iOException = e;
                            responseCode = 0;
                            map = null;
                            if (outputStream4 != null) {
                                try {
                                    outputStream4.close();
                                } catch (IOException e2) {
                                    c33 c33Var = y53Var2.f;
                                    y53.l(c33Var);
                                    c33Var.f.c(c33.M(str4), e2, "Error closing HTTP compressed POST connection output stream. appId");
                                }
                                break;
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            t53Var = y53Var2.i;
                            y53.l(t53Var);
                            x23Var = new x23(this.d, (h33) obj2, responseCode, iOException, (byte[]) null, map);
                            t53Var.N(x23Var);
                            return;
                        } catch (Throwable th3) {
                            th = th3;
                            responseCode = 0;
                            th = th;
                            if (outputStream3 != null) {
                                try {
                                    outputStream3.close();
                                } catch (IOException e3) {
                                    c33 c33Var2 = y53Var2.f;
                                    y53.l(c33Var2);
                                    c33Var2.f.c(c33.M(str4), e3, "Error closing HTTP compressed POST connection output stream. appId");
                                }
                                break;
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            t53 t53Var3 = y53Var2.i;
                            y53.l(t53Var3);
                            t53Var3.N(new x23(this.d, (h33) obj2, responseCode, (IOException) null, (byte[]) null, map3));
                            throw th;
                        }
                    }
                    if (bArr != null) {
                        lf3 lf3Var = o33Var.b.i;
                        if3.T(lf3Var);
                        byte[] bArrO0 = lf3Var.o0(bArr);
                        c33 c33Var3 = y53Var2.f;
                        y53.l(c33Var3);
                        z23 z23Var = c33Var3.a0;
                        int length = bArrO0.length;
                        z23Var.b(Integer.valueOf(length), "Uploading data. size");
                        httpURLConnection.setDoOutput(true);
                        httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
                        httpURLConnection.setFixedLengthStreamingMode(length);
                        httpURLConnection.connect();
                        OutputStream outputStream5 = httpURLConnection.getOutputStream();
                        try {
                            outputStream5.write(bArrO0);
                            outputStream5.close();
                        } catch (IOException e4) {
                            iOException = e4;
                            responseCode = 0;
                            map = null;
                            outputStream4 = outputStream5;
                            if (outputStream4 != null) {
                                outputStream4.close();
                                break;
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            t53Var = y53Var2.i;
                            y53.l(t53Var);
                            x23Var = new x23(this.d, (h33) obj2, responseCode, iOException, (byte[]) null, map);
                            t53Var.N(x23Var);
                            return;
                        } catch (Throwable th4) {
                            th = th4;
                            responseCode = 0;
                            outputStream3 = outputStream5;
                            httpURLConnection = httpURLConnection;
                            th = th;
                            if (outputStream3 != null) {
                                outputStream3.close();
                                break;
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            t53 t53Var4 = y53Var2.i;
                            y53.l(t53Var4);
                            t53Var4.N(new x23(this.d, (h33) obj2, responseCode, (IOException) null, (byte[]) null, map3));
                            throw th;
                        }
                    }
                    responseCode = httpURLConnection.getResponseCode();
                    try {
                        try {
                            Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                            try {
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                inputStream = httpURLConnection.getInputStream();
                                try {
                                    byte[] bArr2 = new byte[1024];
                                    while (true) {
                                        int i2 = inputStream.read(bArr2);
                                        if (i2 <= 0) {
                                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                                            inputStream.close();
                                            httpURLConnection.disconnect();
                                            t53Var = y53Var2.i;
                                            y53.l(t53Var);
                                            x23Var = new x23(this.d, (h33) obj2, responseCode, (IOException) null, byteArray, headerFields);
                                            t53Var.N(x23Var);
                                            return;
                                        }
                                        byteArrayOutputStream.write(bArr2, 0, i2);
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    if (inputStream != null) {
                                        inputStream.close();
                                    }
                                    throw th;
                                }
                            } catch (Throwable th6) {
                                th = th6;
                                inputStream = null;
                            }
                        } catch (IOException e5) {
                            iOException = e5;
                            if (outputStream4 != null) {
                                outputStream4.close();
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            t53Var = y53Var2.i;
                            y53.l(t53Var);
                            x23Var = new x23(this.d, (h33) obj2, responseCode, iOException, (byte[]) null, map);
                            break;
                        } catch (Throwable th7) {
                            th = th7;
                            httpURLConnection = httpURLConnection;
                            th = th;
                            if (outputStream3 != null) {
                                outputStream3.close();
                                break;
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            t53 t53Var5 = y53Var2.i;
                            y53.l(t53Var5);
                            t53Var5.N(new x23(this.d, (h33) obj2, responseCode, (IOException) null, (byte[]) null, map3));
                            throw th;
                        }
                    } catch (IOException e6) {
                        iOException = e6;
                        map = null;
                        if (outputStream4 != null) {
                            outputStream4.close();
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        t53Var = y53Var2.i;
                        y53.l(t53Var);
                        x23Var = new x23(this.d, (h33) obj2, responseCode, iOException, (byte[]) null, map);
                        break;
                    } catch (Throwable th8) {
                        th = th8;
                        th = th;
                        if (outputStream3 != null) {
                            outputStream3.close();
                            break;
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        t53 t53Var6 = y53Var2.i;
                        y53.l(t53Var6);
                        t53Var6.N(new x23(this.d, (h33) obj2, responseCode, (IOException) null, (byte[]) null, map3));
                        throw th;
                    }
                } catch (IOException e7) {
                    iOException = e7;
                    responseCode = 0;
                    httpURLConnection = null;
                    map = null;
                } catch (Throwable th9) {
                    th = th9;
                    responseCode = 0;
                    httpURLConnection = null;
                    map3 = null;
                }
                break;
            default:
                da3 da3Var = (da3) lo2Var;
                y53 y53Var3 = (y53) da3Var.a;
                y53 y53Var4 = (y53) da3Var.a;
                t53 t53Var7 = y53Var3.i;
                y53.l(t53Var7);
                t53Var7.I();
                try {
                    URLConnection uRLConnectionOpenConnection2 = url.openConnection();
                    if (!(uRLConnectionOpenConnection2 instanceof HttpURLConnection)) {
                        throw new IOException("Failed to obtain HTTP connection");
                    }
                    httpURLConnection2 = (HttpURLConnection) uRLConnectionOpenConnection2;
                    httpURLConnection2.setDefaultUseCaches(false);
                    y53Var4.getClass();
                    httpURLConnection2.setConnectTimeout(60000);
                    httpURLConnection2.setReadTimeout(61000);
                    httpURLConnection2.setInstanceFollowRedirects(false);
                    httpURLConnection2.setDoInput(true);
                    if (map2 != null) {
                        try {
                            try {
                                for (Map.Entry entry2 : map2.entrySet()) {
                                    httpURLConnection2.addRequestProperty((String) entry2.getKey(), (String) entry2.getValue());
                                }
                            } catch (Throwable th10) {
                                th = th10;
                                outputStream = null;
                                obj = null;
                                th2 = th;
                                r7 = obj;
                                if (outputStream != null) {
                                    try {
                                        outputStream.close();
                                    } catch (IOException e8) {
                                        c33 c33Var4 = y53Var4.f;
                                        y53.l(c33Var4);
                                        c33Var4.f.c(c33.M(str4), e8, "Error closing HTTP compressed POST connection output stream. appId");
                                    }
                                    break;
                                }
                                if (httpURLConnection2 != null) {
                                    httpURLConnection2.disconnect();
                                }
                                a(responseCode2, null, null, r7);
                                throw th2;
                            }
                        } catch (IOException e9) {
                            e = e9;
                            str = null;
                            iOException2 = e;
                            outputStream2 = null;
                            r6 = str;
                            if (outputStream2 != null) {
                                try {
                                    outputStream2.close();
                                } catch (IOException e10) {
                                    c33 c33Var5 = y53Var4.f;
                                    y53.l(c33Var5);
                                    c33Var5.f.c(c33.M(str4), e10, "Error closing HTTP compressed POST connection output stream. appId");
                                }
                                break;
                            }
                            if (httpURLConnection2 != null) {
                                httpURLConnection2.disconnect();
                            }
                            a(responseCode2, iOException2, null, r6);
                            return;
                        }
                    }
                    if (bArr != null) {
                        try {
                            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream2);
                            gZIPOutputStream.write(bArr);
                            gZIPOutputStream.close();
                            byteArrayOutputStream2.close();
                            byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
                            c33 c33Var6 = y53Var4.f;
                            y53.l(c33Var6);
                            z23 z23Var2 = c33Var6.a0;
                            int length2 = byteArray2.length;
                            z23Var2.b(Integer.valueOf(length2), "Uploading data. size");
                            httpURLConnection2.setDoOutput(true);
                            httpURLConnection2.addRequestProperty("Content-Encoding", "gzip");
                            httpURLConnection2.setFixedLengthStreamingMode(length2);
                            httpURLConnection2.connect();
                            outputStream = httpURLConnection2.getOutputStream();
                            try {
                                outputStream.write(byteArray2);
                                outputStream.close();
                            } catch (IOException e11) {
                                iOException2 = e11;
                                outputStream2 = outputStream;
                                httpURLConnection2 = httpURLConnection2;
                                r6 = 0;
                                if (outputStream2 != null) {
                                    outputStream2.close();
                                    break;
                                }
                                if (httpURLConnection2 != null) {
                                    httpURLConnection2.disconnect();
                                }
                                a(responseCode2, iOException2, null, r6);
                                return;
                            } catch (Throwable th11) {
                                th = th11;
                                httpURLConnection2 = httpURLConnection2;
                                obj = null;
                                th2 = th;
                                r7 = obj;
                                if (outputStream != null) {
                                    outputStream.close();
                                    break;
                                }
                                if (httpURLConnection2 != null) {
                                    httpURLConnection2.disconnect();
                                }
                                a(responseCode2, null, null, r7);
                                throw th2;
                            }
                        } catch (IOException e12) {
                            c33 c33Var7 = y53Var4.f;
                            y53.l(c33Var7);
                            c33Var7.f.b(e12, "Failed to gzip post request content");
                            throw e12;
                        }
                    }
                    responseCode2 = httpURLConnection2.getResponseCode();
                    try {
                        try {
                            Map<String, List<String>> headerFields2 = httpURLConnection2.getHeaderFields();
                            try {
                                ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                                inputStream2 = httpURLConnection2.getInputStream();
                                try {
                                    byte[] bArr3 = new byte[1024];
                                    while (true) {
                                        int i3 = inputStream2.read(bArr3);
                                        if (i3 <= 0) {
                                            byte[] byteArray3 = byteArrayOutputStream3.toByteArray();
                                            inputStream2.close();
                                            httpURLConnection2.disconnect();
                                            a(responseCode2, null, byteArray3, headerFields2);
                                            return;
                                        }
                                        byteArrayOutputStream3.write(bArr3, 0, i3);
                                    }
                                } catch (Throwable th12) {
                                    th = th12;
                                    if (inputStream2 != null) {
                                        inputStream2.close();
                                    }
                                    throw th;
                                }
                            } catch (Throwable th13) {
                                th = th13;
                                inputStream2 = null;
                            }
                        } catch (IOException e13) {
                            e = e13;
                            str2 = null;
                            str = str2;
                            iOException2 = e;
                            outputStream2 = null;
                            r6 = str;
                            if (outputStream2 != null) {
                                outputStream2.close();
                                break;
                            }
                            if (httpURLConnection2 != null) {
                                httpURLConnection2.disconnect();
                            }
                            a(responseCode2, iOException2, null, r6);
                            return;
                        } catch (Throwable th14) {
                            th = th14;
                            responseCode2 = responseCode2;
                            outputStream = null;
                            obj = null;
                            th2 = th;
                            r7 = obj;
                            if (outputStream != null) {
                                outputStream.close();
                                break;
                            }
                            if (httpURLConnection2 != null) {
                                httpURLConnection2.disconnect();
                            }
                            a(responseCode2, null, null, r7);
                            throw th2;
                        }
                    } catch (IOException e14) {
                        e = e14;
                        str2 = str3;
                        str = str2;
                        iOException2 = e;
                        outputStream2 = null;
                        r6 = str;
                        if (outputStream2 != null) {
                            outputStream2.close();
                            break;
                        }
                        if (httpURLConnection2 != null) {
                            httpURLConnection2.disconnect();
                        }
                        a(responseCode2, iOException2, null, r6);
                        return;
                    } catch (Throwable th15) {
                        th = th15;
                        responseCode2 = responseCode2;
                        obj = "Content-Encoding";
                        outputStream = null;
                        httpURLConnection2 = httpURLConnection2;
                        th2 = th;
                        r7 = obj;
                        if (outputStream != null) {
                            outputStream.close();
                            break;
                        }
                        if (httpURLConnection2 != null) {
                            httpURLConnection2.disconnect();
                        }
                        a(responseCode2, null, null, r7);
                        throw th2;
                    }
                } catch (IOException e15) {
                    iOException2 = e15;
                    outputStream2 = null;
                    httpURLConnection2 = null;
                } catch (Throwable th16) {
                    th2 = th16;
                    outputStream = null;
                    httpURLConnection2 = null;
                    r7 = 0;
                }
                break;
        }
    }

    public m33(da3 da3Var, String str, URL url, byte[] bArr, HashMap map, ba3 ba3Var) {
        Objects.requireNonNull(da3Var);
        this.i = da3Var;
        gu2.l(str);
        this.b = url;
        this.c = bArr;
        this.f = ba3Var;
        this.d = str;
        this.e = map;
    }
}
