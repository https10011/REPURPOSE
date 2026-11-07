package prod.apptest.com.webview.config;

import android.text.TextUtils;
import com.hjq.toast.BuildConfig;
import java.util.HashSet;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public class CacheExtensionConfig {
    private static HashSet<String> STATIC = new HashSet<String>() { // from class: prod.apptest.com.webview.config.CacheExtensionConfig.1
        {
            add("html");
            add("htm");
            add("js");
            add("ico");
            add("css");
            add("png");
            add("jpg");
            add("jpeg");
            add("gif");
            add("bmp");
            add("ttf");
            add("woff");
            add("woff2");
            add("otf");
            add("eot");
            add("svg");
            add("xml");
            add("swf");
            add("txt");
            add("text");
            add("conf");
            add("webp");
        }
    };
    private static HashSet<String> NO_CACH = new HashSet<String>() { // from class: prod.apptest.com.webview.config.CacheExtensionConfig.2
        {
            add("mp4");
            add("mp3");
            add("ogg");
            add("avi");
            add("wmv");
            add("flv");
            add("rmvb");
            add("3gp");
        }
    };
    private HashSet<String> statics = new HashSet<>(STATIC);
    private HashSet<String> no_cache = new HashSet<>(NO_CACH);

    private static void add(HashSet<String> hashSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        hashSet.add(str.replace(".", BuildConfig.FLAVOR).toLowerCase().trim());
    }

    public static void addGlobalExtension(String str) {
        add(STATIC, str);
    }

    private static void remove(HashSet<String> hashSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        hashSet.remove(str.replace(".", BuildConfig.FLAVOR).toLowerCase().trim());
    }

    public static void removeGlobalExtension(String str) {
        remove(STATIC, str);
    }

    public CacheExtensionConfig addExtension(String str) {
        add(this.statics, str);
        return this;
    }

    public boolean canCache(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String strTrim = str.toLowerCase().trim();
        if (STATIC.contains(strTrim)) {
            return true;
        }
        return this.statics.contains(strTrim);
    }

    public void clearAll() {
        clearDiskExtension();
    }

    public void clearDiskExtension() {
        this.statics.clear();
    }

    public boolean isHtml(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.toLowerCase().contains("html") || str.toLowerCase().contains("htm");
    }

    public boolean isMedia(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (NO_CACH.contains(str)) {
            return true;
        }
        return this.no_cache.contains(str.toLowerCase().trim());
    }

    public CacheExtensionConfig removeExtension(String str) {
        remove(this.statics, str);
        return this;
    }
}
