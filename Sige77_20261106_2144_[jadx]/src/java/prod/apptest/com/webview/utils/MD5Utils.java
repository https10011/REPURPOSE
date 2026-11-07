package prod.apptest.com.webview.utils;

import com.hjq.toast.BuildConfig;
import java.security.MessageDigest;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public class MD5Utils {
    public static String bytesToHex(byte[] bArr, boolean z) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < bArr.length; i++) {
            int i2 = bArr[i];
            if (i2 < 0) {
                i2 += 256;
            }
            if (i2 < 16) {
                stringBuffer.append("0");
            }
            stringBuffer.append(Integer.toHexString(i2));
        }
        return z ? stringBuffer.toString().toUpperCase() : stringBuffer.toString().toLowerCase();
    }

    public static String getMD5(String str, boolean z) {
        try {
            return bytesToHex(MessageDigest.getInstance("MD5").digest(str.getBytes()), z);
        } catch (Exception e) {
            e.printStackTrace();
            return BuildConfig.FLAVOR;
        }
    }

    public static String getMD5(String str) {
        return getMD5(str, true);
    }
}
