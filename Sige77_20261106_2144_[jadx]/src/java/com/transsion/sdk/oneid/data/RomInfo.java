package com.transsion.sdk.oneid.data;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.hjq.toast.BuildConfig;
import defpackage.am2;
import java.io.Serializable;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public class RomInfo extends OneBaseInfo implements Serializable {
    public String api;
    public String aver;
    public String build_id;
    public String build_spv;
    public String buildt;
    public String buildv;
    public String fp;
    public String gsmv;
    public String osver;

    public RomInfo(Context context) {
        this.aver = BuildConfig.FLAVOR;
        this.api = BuildConfig.FLAVOR;
        this.buildv = BuildConfig.FLAVOR;
        this.buildt = BuildConfig.FLAVOR;
        this.osver = BuildConfig.FLAVOR;
        this.build_id = BuildConfig.FLAVOR;
        this.build_spv = BuildConfig.FLAVOR;
        this.gsmv = BuildConfig.FLAVOR;
        this.fp = BuildConfig.FLAVOR;
        this.aver = Build.VERSION.RELEASE;
        this.api = BuildConfig.FLAVOR + Build.VERSION.SDK_INT;
        try {
            this.buildv = am2.c(context, "ro.product.build.id");
        } catch (Exception unused) {
        }
        try {
            this.buildt = am2.c(context, "ro.system.build.date.utc");
        } catch (Exception unused2) {
        }
        try {
            String strC = am2.c(context, "ro.tranos.version");
            this.osver = strC;
            if (TextUtils.isEmpty(strC)) {
                this.osver = am2.c(context, "ro.os_product.version");
            }
        } catch (Exception unused3) {
        }
        try {
            this.build_id = am2.c(context, "ro.system.build.id");
        } catch (Exception unused4) {
        }
        try {
            this.build_spv = am2.c(context, "ro.vendor.build.security_patch");
        } catch (Exception unused5) {
        }
        try {
            this.gsmv = am2.c(context, "gsm.version.baseband");
        } catch (Exception unused6) {
        }
        try {
            this.fp = am2.c(context, "ro.build.fingerprint");
        } catch (Exception unused7) {
        }
    }
}
