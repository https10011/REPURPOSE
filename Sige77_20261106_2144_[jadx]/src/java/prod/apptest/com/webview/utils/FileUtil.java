package prod.apptest.com.webview.utils;

import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public class FileUtil {
    public static void copy(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[512];
        while (true) {
            int i = inputStream.read(bArr);
            if (i == -1) {
                inputStream.close();
                outputStream.close();
                return;
            }
            outputStream.write(bArr, 0, i);
        }
    }

    public static void deleteDirs(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        File file = new File(str);
        if (file.exists()) {
            for (File file2 : file.listFiles()) {
                if (file2.isDirectory()) {
                    deleteDirs(file2.getAbsolutePath(), z);
                } else {
                    file2.delete();
                }
            }
            if (z) {
                file.delete();
            }
        }
    }
}
