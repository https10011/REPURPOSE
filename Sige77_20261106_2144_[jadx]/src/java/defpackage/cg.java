package defpackage;

import android.os.Environment;
import com.appsflyer.internal.d;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final /* synthetic */ class cg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yg b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    public /* synthetic */ cg(yg ygVar, String str, String str2, int i) {
        this.a = i;
        this.b = ygVar;
        this.c = str;
        this.d = str2;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00b2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x00b4 A[Catch: IOException -> 0x00b0, TryCatch #5 {IOException -> 0x00b0, blocks: (B:50:0x00ac, B:54:0x00b4, B:56:0x00b9), top: B:65:0x00ac }] */
    /* JADX WARN: Code duplicated, block: B:56:0x00b9 A[Catch: IOException -> 0x00b0, TRY_LEAVE, TryCatch #5 {IOException -> 0x00b0, blocks: (B:50:0x00ac, B:54:0x00b4, B:56:0x00b9), top: B:65:0x00ac }] */
    /* JADX WARN: Code duplicated, block: B:65:0x00ac A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v1, types: [android.app.Activity, yg] */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        FileOutputStream fileOutputStream;
        HttpURLConnection httpURLConnection;
        int i = this.a;
        String str = this.d;
        String str2 = this.c;
        ?? r7 = this.b;
        switch (i) {
            case 0:
                int i2 = yg.MODE_SONIC_WITH_OFFLINE_CACHE;
                r7.o0.loadUrl(d.a("javascript:window.", str2, "('", str, "')"));
                return;
            default:
                int i3 = yg.MODE_SONIC_WITH_OFFLINE_CACHE;
                InputStream inputStream = null;
                try {
                    try {
                        httpURLConnection = (HttpURLConnection) new URL(str2).openConnection();
                        try {
                            httpURLConnection.setRequestMethod("GET");
                            httpURLConnection.connect();
                            if (httpURLConnection.getResponseCode() == 200) {
                                InputStream inputStream2 = httpURLConnection.getInputStream();
                                try {
                                    File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), "GenericFiles");
                                    if (!file.exists()) {
                                        file.mkdirs();
                                    }
                                    fileOutputStream = new FileOutputStream(new File(file, str));
                                    try {
                                        byte[] bArr = new byte[4096];
                                        while (inputStream2.read(bArr) != -1) {
                                            fileOutputStream.write(bArr);
                                        }
                                        fileOutputStream.flush();
                                        r7.runOnUiThread(new sf(r7, 17));
                                        inputStream2.close();
                                        fileOutputStream.close();
                                    } catch (Exception unused) {
                                        inputStream = inputStream2;
                                        try {
                                            r7.runOnUiThread(new sf(r7, 18));
                                            if (inputStream != null) {
                                                inputStream.close();
                                            }
                                            if (fileOutputStream != null) {
                                                fileOutputStream.close();
                                            }
                                            if (httpURLConnection == null) {
                                                return;
                                            }
                                        } catch (Throwable th) {
                                            th = th;
                                            if (inputStream != null) {
                                                try {
                                                    inputStream.close();
                                                    if (fileOutputStream != null) {
                                                        fileOutputStream.close();
                                                    }
                                                    if (httpURLConnection != null) {
                                                        httpURLConnection.disconnect();
                                                    }
                                                } catch (IOException e) {
                                                    e.printStackTrace();
                                                    throw th;
                                                }
                                                break;
                                            } else {
                                                if (fileOutputStream != null) {
                                                    fileOutputStream.close();
                                                }
                                                if (httpURLConnection != null) {
                                                    httpURLConnection.disconnect();
                                                }
                                                break;
                                            }
                                            throw th;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        inputStream = inputStream2;
                                        if (inputStream != null) {
                                            inputStream.close();
                                            if (fileOutputStream != null) {
                                                fileOutputStream.close();
                                            }
                                            if (httpURLConnection != null) {
                                                httpURLConnection.disconnect();
                                            }
                                            break;
                                        } else {
                                            if (fileOutputStream != null) {
                                                fileOutputStream.close();
                                            }
                                            if (httpURLConnection != null) {
                                                httpURLConnection.disconnect();
                                            }
                                            break;
                                        }
                                        throw th;
                                    }
                                } catch (Exception unused2) {
                                    fileOutputStream = null;
                                } catch (Throwable th3) {
                                    th = th3;
                                    fileOutputStream = null;
                                }
                            }
                        } catch (Exception unused3) {
                            fileOutputStream = null;
                        } catch (Throwable th4) {
                            th = th4;
                            fileOutputStream = null;
                        }
                    } catch (IOException e2) {
                        e2.printStackTrace();
                        return;
                    }
                } catch (Exception unused4) {
                    fileOutputStream = null;
                    httpURLConnection = null;
                } catch (Throwable th5) {
                    th = th5;
                    fileOutputStream = null;
                    httpURLConnection = null;
                }
                httpURLConnection.disconnect();
                return;
        }
    }
}
