package prod.apptest.com.webview.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import com.hjq.toast.BuildConfig;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public class NetUtils {
    public static String getOriginUrl(String str) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        String str2 = BuildConfig.FLAVOR;
        if (zIsEmpty) {
            return BuildConfig.FLAVOR;
        }
        try {
            URL url = new URL(str);
            int port = url.getPort();
            StringBuilder sb = new StringBuilder();
            sb.append(url.getProtocol());
            sb.append("://");
            sb.append(url.getHost());
            if (port != -1) {
                str2 = ":" + port;
            }
            sb.append(str2);
            return sb.toString();
        } catch (Exception unused) {
            return str;
        }
    }

    public static boolean isConnected(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public static Map<String, String> multimapToSingle(Map<String, List<String>> map) {
        StringBuilder sb = new StringBuilder();
        HashMap map2 = new HashMap();
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            List<String> value = entry.getValue();
            sb.delete(0, sb.length());
            if (value != null && value.size() > 0) {
                Iterator<String> it = value.iterator();
                while (it.hasNext()) {
                    sb.append(it.next());
                    sb.append(";");
                }
            }
            if (sb.length() > 0) {
                sb.deleteCharAt(sb.length() - 1);
            }
            map2.put(entry.getKey(), sb.toString());
        }
        return map2;
    }
}
