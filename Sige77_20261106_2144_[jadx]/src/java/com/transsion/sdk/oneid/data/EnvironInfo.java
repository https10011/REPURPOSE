package com.transsion.sdk.oneid.data;

import android.content.Context;
import com.hjq.toast.BuildConfig;
import java.io.Serializable;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public class EnvironInfo extends OneBaseInfo implements Serializable {
    public String lang;
    public String tz;

    public EnvironInfo(Context context) {
        this.tz = BuildConfig.FLAVOR;
        this.lang = BuildConfig.FLAVOR;
        try {
            this.tz = TimeZone.getDefault().getDisplayName(false, 0);
        } catch (AssertionError unused) {
            this.tz = "GMT+00:00";
        }
        if ("GMT".equals(this.tz)) {
            this.tz = "GMT+00:00";
        }
        this.lang = Locale.getDefault().getLanguage();
    }
}
