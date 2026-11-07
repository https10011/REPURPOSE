package defpackage;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.material.datepicker.g;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.connection.RealCall;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class x20 implements Runnable {
    public final ProgressDialog a;
    public final Context b;
    public final String c;
    public final Handler d = new Handler(Looper.getMainLooper());

    public x20(ProgressDialog progressDialog, Context context, String str) {
        this.a = progressDialog;
        this.b = context.getApplicationContext();
        this.c = str;
    }

    public final void a() {
        this.d.post(new v20(this, 2));
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context = this.b;
        Handler handler = this.d;
        OkHttpClient okHttpClient = new OkHttpClient();
        Request.Builder builder = new Request.Builder();
        builder.b("GET", (RequestBody) null);
        builder.c(this.c);
        Request request = new Request(builder);
        final int i = 1;
        try {
            try {
                Response responseA = new RealCall(okHttpClient, request).a();
                try {
                    boolean z = responseA.d0;
                    ResponseBody responseBody = responseA.i;
                    if (!z || responseBody == null) {
                        handler.post(new yn(context.getResources().getString(2131886119), 1));
                        a();
                        responseA.close();
                        a();
                        return;
                    }
                    final long jA = responseBody.a();
                    long j = 0;
                    if (jA > 0) {
                        handler.post(new Runnable() { // from class: ay
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i2 = i;
                                long j2 = jA;
                                Object obj = this;
                                switch (i2) {
                                    case 0:
                                        g gVar = (g) obj;
                                        gVar.a.setError(String.format(gVar.e, sp0.m(j2).replace(' ', (char) 160)));
                                        gVar.a();
                                        break;
                                    default:
                                        ProgressDialog progressDialog = ((x20) obj).a;
                                        progressDialog.setIndeterminate(false);
                                        progressDialog.setMax((int) (j2 / 1048576));
                                        break;
                                }
                            }
                        });
                    } else {
                        handler.post(new v20(this, 0));
                    }
                    File file = new File(context.getExternalFilesDir(null), "update.apk");
                    InputStream inputStreamQ = responseBody.e().Q();
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        try {
                            byte[] bArr = new byte[8192];
                            while (true) {
                                int i2 = inputStreamQ.read(bArr);
                                if (i2 == -1) {
                                    fileOutputStream.getFD().sync();
                                    fileOutputStream.close();
                                    inputStreamQ.close();
                                    handler.post(new v20(this, 1));
                                    responseA.close();
                                    a();
                                    return;
                                }
                                fileOutputStream.write(bArr, 0, i2);
                                j += (long) i2;
                                if (jA > 0) {
                                    handler.post(new w20(this, (int) (j / 1048576), 0));
                                }
                                try {
                                    inputStreamQ.close();
                                } catch (Throwable th) {
                                    th.addSuppressed(th);
                                }
                                throw th;
                            }
                        } catch (Throwable th2) {
                            try {
                                fileOutputStream.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                            throw th2;
                        }
                    } catch (Throwable th4) {
                        inputStreamQ.close();
                        throw th4;
                    }
                } catch (Throwable th5) {
                    try {
                        responseA.close();
                    } catch (Throwable th6) {
                        th5.addSuppressed(th6);
                    }
                    throw th5;
                }
            } catch (IOException unused) {
                handler.post(new yn(context.getResources().getString(2131886119), 1));
                a();
            }
        } catch (Throwable th7) {
            a();
            throw th7;
        }
    }
}
