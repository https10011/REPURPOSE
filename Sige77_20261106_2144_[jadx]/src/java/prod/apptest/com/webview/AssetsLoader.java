package prod.apptest.com.webview;

import android.content.Context;
import android.content.res.AssetManager;
import android.text.TextUtils;
import com.hjq.toast.BuildConfig;
import defpackage.ts;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.LinkedList;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
class AssetsLoader {
    private static volatile AssetsLoader assetsLoader;
    private CopyOnWriteArraySet<String> mAssetResSet;
    private Context mContext;
    private String mDir = BuildConfig.FLAVOR;
    private boolean mCleared = false;
    private boolean mIsSuffixMod = false;

    private void addAssetsFile(String str) {
        int iIndexOf;
        String str2 = this.mDir + File.separator;
        if (!TextUtils.isEmpty(this.mDir) && (iIndexOf = str.indexOf(str2)) >= 0) {
            str = str.substring(str2.length() + iIndexOf);
        }
        this.mAssetResSet.add(str);
    }

    public static AssetsLoader getInstance() {
        if (assetsLoader == null) {
            synchronized (AssetsLoader.class) {
                try {
                    if (assetsLoader == null) {
                        assetsLoader = new AssetsLoader();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return assetsLoader;
    }

    private String getUrlPath(String str) {
        try {
            String path = new URL(str).getPath();
            if (path.startsWith("/") && path.length() != 1) {
                return path.substring(1);
            }
            return path;
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return BuildConfig.FLAVOR;
        }
    }

    private AssetsLoader initResourceNoneRecursion(String str) {
        try {
            LinkedList linkedList = new LinkedList();
            for (String str2 : this.mContext.getAssets().list(str)) {
                String str3 = str + File.separator + str2;
                if (this.mContext.getAssets().list(str3).length == 0) {
                    addAssetsFile(str3);
                } else {
                    linkedList.add(str3);
                }
            }
            while (!linkedList.isEmpty() && !this.mCleared) {
                String str4 = (String) linkedList.removeFirst();
                String[] list = this.mContext.getAssets().list(str4);
                if (list.length == 0) {
                    addAssetsFile(str4);
                } else {
                    for (String str5 : list) {
                        AssetManager assets = this.mContext.getAssets();
                        StringBuilder sb = new StringBuilder();
                        sb.append(str4);
                        String str6 = File.separator;
                        sb.append(str6);
                        sb.append(str5);
                        if (assets.list(sb.toString()).length == 0) {
                            addAssetsFile(str4 + str6 + str5);
                        } else {
                            linkedList.add(str4 + str6 + str5);
                        }
                    }
                }
            }
        } catch (IOException unused) {
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initData$0() {
        initResourceNoneRecursion(this.mDir);
    }

    public void clear() {
        this.mCleared = true;
        CopyOnWriteArraySet<String> copyOnWriteArraySet = this.mAssetResSet;
        if (copyOnWriteArraySet == null || copyOnWriteArraySet.size() <= 0) {
            return;
        }
        this.mAssetResSet.clear();
    }

    public InputStream getAssetFileStream(String str) {
        try {
            return this.mContext.getAssets().open(str);
        } catch (IOException unused) {
            return null;
        }
    }

    public InputStream getResByUrl(String str) {
        String urlPath = getUrlPath(str);
        if (TextUtils.isEmpty(urlPath)) {
            return null;
        }
        if (!this.mIsSuffixMod) {
            if (TextUtils.isEmpty(this.mDir)) {
                return getAssetFileStream(urlPath);
            }
            StringBuilder sb = new StringBuilder();
            sb.append(this.mDir);
            return getAssetFileStream(ts.l(sb, File.separator, urlPath));
        }
        CopyOnWriteArraySet<String> copyOnWriteArraySet = this.mAssetResSet;
        if (copyOnWriteArraySet != null) {
            for (String str2 : copyOnWriteArraySet) {
                if (urlPath.endsWith(str2)) {
                    if (TextUtils.isEmpty(this.mDir)) {
                        return getAssetFileStream(str2);
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(this.mDir);
                    return getAssetFileStream(ts.l(sb2, File.separator, str2));
                }
            }
        }
        return null;
    }

    public AssetsLoader init(Context context) {
        this.mContext = context;
        this.mAssetResSet = new CopyOnWriteArraySet<>();
        this.mCleared = false;
        return this;
    }

    public AssetsLoader initData() {
        if (this.mIsSuffixMod && this.mAssetResSet.size() == 0) {
            new Thread(new Runnable() { // from class: prod.apptest.com.webview.a
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.lambda$initData$0();
                }
            }).start();
        }
        return this;
    }

    public AssetsLoader isAssetsSuffixMod(boolean z) {
        this.mIsSuffixMod = z;
        return this;
    }

    public AssetsLoader setDir(String str) {
        this.mDir = str;
        return this;
    }
}
