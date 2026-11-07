package defpackage;

import android.os.Handler;
import android.os.Message;
import android.util.Log;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class sd2 extends nc2 {
    public static final String[] d = {"https://time1.google.com", "https://time.cloudflare.com", "https://www.pool.ntp.org"};
    public int c;

    /* JADX WARN: Code duplicated, block: B:41:0x00a5 A[LOOP:0: B:3:0x0010->B:41:0x00a5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:52:0x00a0 A[SYNTHETIC] */
    @Override // defpackage.nc2
    public final void a() throws Throwable {
        Exception e;
        HttpURLConnection httpURLConnection;
        v61 v61Var;
        SSLContext sSLContextA;
        Handler handler = this.a;
        Message messageObtainMessage = handler.obtainMessage(503);
        messageObtainMessage.obj = 0L;
        while (true) {
            int i = this.c;
            if (i >= 3) {
                break;
            }
            HttpURLConnection httpURLConnection2 = null;
            try {
                httpURLConnection = (HttpURLConnection) new URL(d[i]).openConnection();
                try {
                    try {
                        if (httpURLConnection instanceof HttpsURLConnection) {
                            if (y21.h == null && (sSLContextA = fd2.a()) != null) {
                                y21.h = sSLContextA.getSocketFactory();
                            }
                            SSLSocketFactory sSLSocketFactory = y21.h;
                            if (sSLSocketFactory != null) {
                                ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(sSLSocketFactory);
                                ((HttpsURLConnection) httpURLConnection).setHostnameVerifier(fd2.a);
                            }
                        }
                        httpURLConnection.setReadTimeout(10000);
                        httpURLConnection.setConnectTimeout(10000);
                        int responseCode = httpURLConnection.getResponseCode();
                        if (responseCode < 200 || responseCode >= 400) {
                            httpURLConnection.disconnect();
                            v61Var = new v61(-1, 0L);
                        } else {
                            v61Var = new v61(0, Long.valueOf(httpURLConnection.getDate()));
                            httpURLConnection.disconnect();
                        }
                    } catch (Exception e2) {
                        e = e2;
                        if (e instanceof UnknownHostException) {
                            cc2.c(e.getMessage());
                        } else {
                            cc2.c(Log.getStackTraceString(e));
                        }
                        if (httpURLConnection != null) {
                        }
                        v61Var = new v61(-1, 0L);
                        if (v61Var.a == 0) {
                            messageObtainMessage.obj = v61Var.b;
                            handler.sendMessageAtFrontOfQueue(messageObtainMessage);
                        }
                        this.c++;
                    }
                } catch (Throwable th) {
                    th = th;
                    httpURLConnection2 = httpURLConnection;
                    if (httpURLConnection2 != null) {
                        httpURLConnection2.disconnect();
                    }
                    throw th;
                }
            } catch (Exception e3) {
                e = e3;
                httpURLConnection = null;
            } catch (Throwable th2) {
                th = th2;
            }
            if (v61Var.a == 0) {
                messageObtainMessage.obj = v61Var.b;
                break;
            }
            this.c++;
        }
        handler.sendMessageAtFrontOfQueue(messageObtainMessage);
    }

    @Override // defpackage.nc2
    public final String c() {
        return "Retrieve-Time";
    }
}
