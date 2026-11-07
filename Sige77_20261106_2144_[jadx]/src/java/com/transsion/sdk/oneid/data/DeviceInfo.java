package com.transsion.sdk.oneid.data;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.hjq.toast.BuildConfig;
import defpackage.am2;
import java.io.Serializable;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public class DeviceInfo extends OneBaseInfo implements Serializable {
    public String battery;
    public String brand;
    public String model;
    public String plat;
    public String ram;
    public String rom;
    public String screen_dpi;
    public String screen_h;
    public String screen_w;

    public DeviceInfo(Context context) {
        String strA;
        double dDoubleValue;
        long totalSpace;
        long j;
        long j2;
        long j3;
        String strA2 = "0";
        this.brand = BuildConfig.FLAVOR;
        this.model = BuildConfig.FLAVOR;
        this.plat = BuildConfig.FLAVOR;
        this.rom = BuildConfig.FLAVOR;
        this.ram = BuildConfig.FLAVOR;
        this.battery = BuildConfig.FLAVOR;
        this.screen_h = BuildConfig.FLAVOR;
        this.screen_w = BuildConfig.FLAVOR;
        this.screen_dpi = BuildConfig.FLAVOR;
        this.brand = Build.BRAND;
        this.model = Build.MODEL;
        try {
            try {
                this.plat = am2.c(context, "ro.board.platform");
                while (true) {
                    j3 = j * j2;
                    if (j3 >= totalSpace) {
                        break;
                    }
                    j <<= 1;
                    if (j > 512) {
                        j2 *= 1000;
                        j = 1;
                    }
                }
            } catch (Exception unused) {
                this.plat = Build.HARDWARE;
            }
            totalSpace = Environment.getDataDirectory().getTotalSpace() + Environment.getRootDirectory().getTotalSpace();
            j = 1;
            j2 = 1;
            strA = am2.a(j3);
        } catch (Exception e) {
            e.printStackTrace();
            strA = "0";
        }
        this.rom = strA;
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            strA2 = am2.a(memoryInfo.totalMem);
        } catch (Throwable unused2) {
        }
        this.ram = strA2;
        try {
            dDoubleValue = ((Double) Class.forName("com.android.internal.os.PowerProfile").getMethod("getBatteryCapacity", null).invoke(Class.forName("com.android.internal.os.PowerProfile").getConstructor(Context.class).newInstance(context), null)).doubleValue();
        } catch (Throwable unused3) {
            dDoubleValue = 0.0d;
        }
        this.battery = String.valueOf(dDoubleValue);
        try {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            DisplayMetrics displayMetrics = new DisplayMetrics();
            windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
            this.screen_w = BuildConfig.FLAVOR + Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels);
            this.screen_h = BuildConfig.FLAVOR + Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels);
            this.screen_dpi = BuildConfig.FLAVOR + displayMetrics.densityDpi;
        } catch (Exception unused4) {
        }
    }
}
