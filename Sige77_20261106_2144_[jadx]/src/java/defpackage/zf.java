package defpackage;

import android.media.MediaScannerConnection;
import android.os.Build;
import android.os.Environment;
import android.util.Base64;
import android.webkit.URLUtil;
import com.hjq.toast.BuildConfig;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final /* synthetic */ class zf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yg b;
    public final /* synthetic */ String c;

    public /* synthetic */ zf(yg ygVar, String str, int i) {
        this.a = i;
        this.b = ygVar;
        this.c = str;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [android.app.Activity, android.content.Context, yg] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        String str = this.c;
        ?? r5 = this.b;
        switch (i) {
            case 0:
                int i2 = yg.MODE_SONIC_WITH_OFFLINE_CACHE;
                if (Build.VERSION.SDK_INT < 29 && sp0.d(r5, "android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                    sp0.A(r5, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 1001);
                    return;
                }
                try {
                    String str2 = new String(Base64.decode(str.replaceFirst("^data:text/plain;base64,", BuildConfig.FLAVOR), 0), StandardCharsets.UTF_8);
                    String str3 = "text_" + new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.getDefault()).format(new Date()) + ".txt";
                    File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
                    if (!externalStoragePublicDirectory.exists()) {
                        externalStoragePublicDirectory.mkdirs();
                    }
                    File file = new File(externalStoragePublicDirectory, str3);
                    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
                    try {
                        bufferedWriter.write(str2);
                        bufferedWriter.close();
                        MediaScannerConnection.scanFile(r5, new String[]{file.getAbsolutePath()}, new String[]{"text/plain"}, null);
                        r5.runOnUiThread(new sf(r5, 1));
                        file.getAbsolutePath();
                        return;
                    } catch (Throwable th) {
                        try {
                            bufferedWriter.close();
                            break;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (Exception e) {
                    kv.o("DownloadTextFileFailed", e);
                    r5.runOnUiThread(new sf(r5, 2));
                    return;
                }
            case 1:
                int i3 = yg.MODE_SONIC_WITH_OFFLINE_CACHE;
                r5.t(str);
                return;
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                int i4 = yg.MODE_SONIC_WITH_OFFLINE_CACHE;
                r5.t(str);
                return;
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                int i5 = yg.MODE_SONIC_WITH_OFFLINE_CACHE;
                r5.url2bitmap(str);
                return;
            default:
                int i6 = yg.MODE_SONIC_WITH_OFFLINE_CACHE;
                if (URLUtil.isValidUrl(str)) {
                    r5.url2bitmap(str);
                    return;
                } else {
                    r5.t(str);
                    return;
                }
        }
    }
}
