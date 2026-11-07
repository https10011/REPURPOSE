package com.fm.openinstall;

import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Looper;
import android.text.TextUtils;
import defpackage.es1;
import defpackage.fc2;
import defpackage.g93;
import defpackage.h01;
import defpackage.hs1;
import defpackage.se2;
import defpackage.sp0;
import defpackage.yi0;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class OpenInstallHelper {
    private OpenInstallHelper() {
    }

    public static String checkGaid(Context context) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            if (g93.i) {
                g93.g("不能在UI线程调用", new Object[0]);
            }
            return null;
        }
        es1 es1VarA = sp0.a(context.getApplicationContext());
        if (es1VarA != null) {
            return es1VarA.b;
        }
        return null;
    }

    public static String checkOaid(Context context) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            fc2 fc2Var = new fc2();
            fc2Var.a(context.getApplicationContext());
            return fc2Var.a;
        }
        if (!g93.i) {
            return null;
        }
        g93.g("不能在UI线程调用", new Object[0]);
        return null;
    }

    public static boolean checkSimulator(Context context) {
        return hs1.a().d(context);
    }

    public static boolean isLauncherFromYYB(Activity activity, Intent intent) {
        Uri referrer;
        if (activity == null || intent == null || TextUtils.isEmpty(intent.getAction()) || intent.getCategories() == null || !intent.getAction().equals("android.intent.action.MAIN") || !intent.getCategories().contains("android.intent.category.LAUNCHER") || (referrer = activity.getReferrer()) == null) {
            return false;
        }
        String authority = referrer.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            return false;
        }
        boolean z = authority.equalsIgnoreCase(se2.l) || authority.equalsIgnoreCase(se2.m) || authority.equalsIgnoreCase(se2.k);
        if (authority.equalsIgnoreCase(se2.n) || authority.equalsIgnoreCase(se2.o) || authority.equalsIgnoreCase(se2.p)) {
            return true;
        }
        return z;
    }

    public static boolean isSchemeWakeup(Intent intent) {
        if (intent != null && intent.getData() != null && intent.getAction() != null) {
            String action = intent.getAction();
            String host = intent.getData().getHost();
            if (!TextUtils.isEmpty(host) && action.equals("android.intent.action.VIEW")) {
                String[] strArr = yi0.i;
                for (int i = 0; i < 2; i++) {
                    if (host.endsWith(strArr[i])) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean isTrackData(ClipData clipData) {
        h01 h01VarA = h01.a(clipData);
        if (h01VarA == null) {
            return false;
        }
        return h01VarA.c(1) || h01VarA.c(2);
    }
}
