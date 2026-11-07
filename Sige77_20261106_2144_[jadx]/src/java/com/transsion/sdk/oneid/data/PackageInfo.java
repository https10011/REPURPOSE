package com.transsion.sdk.oneid.data;

import android.content.Context;
import android.content.pm.Signature;
import android.provider.Settings;
import com.hjq.toast.BuildConfig;
import java.io.Serializable;
import java.security.MessageDigest;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public class PackageInfo extends OneBaseInfo implements Serializable {
    public String pkg;
    public String signatures;
    public String ssaid;

    public PackageInfo(Context context) {
        String lowerCase;
        this.pkg = BuildConfig.FLAVOR;
        this.signatures = BuildConfig.FLAVOR;
        this.ssaid = BuildConfig.FLAVOR;
        this.pkg = context.getPackageName();
        try {
            android.content.pm.PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 64);
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            Signature[] signatureArr = packageInfo.signatures;
            if (signatureArr == null || signatureArr.length <= 0) {
                lowerCase = BuildConfig.FLAVOR;
            } else {
                byte[] bArrDigest = messageDigest.digest(signatureArr[0].toByteArray());
                StringBuilder sb = new StringBuilder();
                for (byte b : bArrDigest) {
                    sb.append(Integer.toHexString((b & 255) | 256).substring(1, 3));
                }
                lowerCase = sb.toString().toLowerCase();
            }
        } catch (Exception unused) {
        }
        this.signatures = lowerCase;
        try {
            this.ssaid = Settings.Secure.getString(context.getContentResolver(), "android_id");
        } catch (Exception unused2) {
        }
        if (this.ssaid == null) {
            this.ssaid = BuildConfig.FLAVOR;
        }
    }
}
