package prod.apptest.com.webview.utils;

import android.text.TextUtils;
import defpackage.fl0;
import defpackage.hi;
import defpackage.lq0;
import defpackage.mf1;
import defpackage.r41;
import defpackage.rj;
import defpackage.vx1;
import defpackage.y00;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public class OKHttpFile {
    private static final int ENTRY_BODY = 1;
    private static final int ENTRY_METADATA = 0;

    public static InputStream getCacheFile(File file, String str) {
        int i;
        boolean z;
        if (!TextUtils.isEmpty(str)) {
            String string = str.toString();
            rj rjVar = rj.d;
            String strE = r41.p(string).c("MD5").e();
            File file2 = new File(file.getAbsolutePath(), y00.k(strE, ".0"));
            File file3 = new File(file.getAbsolutePath(), y00.k(strE, ".1"));
            if (file2.exists() && file3.exists()) {
                try {
                    BufferedReader bufferedReader = new BufferedReader(new FileReader(file2), 1024);
                    while (true) {
                        String line = bufferedReader.readLine();
                        i = 1;
                        if (line == null) {
                            z = false;
                            break;
                        }
                        if (line.contains("Content-Encoding") && line.contains("gzip")) {
                            z = true;
                            break;
                        }
                    }
                    return !z ? new FileInputStream(file3) : new hi(new mf1(new fl0(new lq0(new FileInputStream(file3), vx1.d))), i);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }
}
