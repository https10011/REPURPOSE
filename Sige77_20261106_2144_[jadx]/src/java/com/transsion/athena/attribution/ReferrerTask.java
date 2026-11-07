package com.transsion.athena.attribution;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.ReferrerDetails;
import defpackage.dw0;
import defpackage.hs1;
import defpackage.ic;
import defpackage.pv2;
import org.json.JSONObject;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public class ReferrerTask implements Runnable {
    public final Context a;
    public final int b;
    public InstallReferrerClient c;

    public ReferrerTask(Context context, int i) {
        this.a = context;
        this.b = i;
    }

    public static void a(ReferrerTask referrerTask, ReferrerDetails referrerDetails) {
        if (referrerDetails == null) {
            return;
        }
        String installReferrer = referrerDetails.getInstallReferrer();
        String installVersion = referrerDetails.getInstallVersion();
        long referrerClickTimestampSeconds = referrerDetails.getReferrerClickTimestampSeconds();
        long referrerClickTimestampServerSeconds = referrerDetails.getReferrerClickTimestampServerSeconds();
        long installBeginTimestampSeconds = referrerDetails.getInstallBeginTimestampSeconds();
        long installBeginTimestampServerSeconds = referrerDetails.getInstallBeginTimestampServerSeconds();
        boolean googlePlayInstantParam = referrerDetails.getGooglePlayInstantParam();
        Bundle bundle = new Bundle();
        bundle.putString("insref", installReferrer);
        bundle.putString("insver", installVersion);
        bundle.putLong("refcltmp", referrerClickTimestampSeconds);
        bundle.putLong("refclsvr", referrerClickTimestampServerSeconds);
        bundle.putLong("insbgtmp", installBeginTimestampSeconds);
        bundle.putLong("insbgsvr", installBeginTimestampServerSeconds);
        bundle.putBoolean("gpinsprm", googlePlayInstantParam);
        ic icVar = new ic("gp_referrer", referrerTask.b);
        icVar.d(bundle);
        icVar.c();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("insref", installReferrer);
            jSONObject.put("insver", installVersion);
            jSONObject.put("refcltmp", referrerClickTimestampSeconds);
            jSONObject.put("refclsvr", referrerClickTimestampServerSeconds);
            jSONObject.put("insbgtmp", installBeginTimestampSeconds);
            jSONObject.put("insbgsvr", installBeginTimestampServerSeconds);
            jSONObject.put("gpinsprm", googlePlayInstantParam);
            hs1.j(referrerTask.a).n("key_referrer_google_play", jSONObject.toString());
        } catch (Exception e) {
            dw0.v(e);
        }
    }

    public final void b() {
        Context context = this.a;
        hs1 hs1VarJ = hs1.j(context);
        StringBuilder sb = new StringBuilder("key_appid_gp_track_flag_");
        int i = this.b;
        sb.append(i);
        if (!TextUtils.isEmpty(hs1VarJ.k(sb.toString()))) {
            dw0.c("appId : " + i + " referrer has tracked !");
            return;
        }
        String strK = hs1.j(context).k("key_referrer_google_play");
        if (!TextUtils.isEmpty(strK)) {
            dw0.c("appId : " + i + " has cached GP referrer !");
            try {
                f(strK);
                d();
                return;
            } catch (Exception e) {
                dw0.v(e);
                return;
            }
        }
        try {
            if (this.c == null) {
                this.c = InstallReferrerClient.newBuilder(context).build();
            }
            dw0.c("appId : " + i + " referrerClient startConnection");
            this.c.startConnection(new pv2(this));
        } catch (Exception e2) {
            dw0.v(e2);
        }
    }

    public final void c() {
        Context context = this.a;
        if (TextUtils.isEmpty(hs1.j(context).k("key_appid_ps_track_flag_" + this.b))) {
            String strK = hs1.j(context).k("key_referrer_palm_store");
            if (!TextUtils.isEmpty(strK)) {
                try {
                    g(strK);
                    e();
                    return;
                } catch (Exception e) {
                    dw0.v(e);
                    return;
                }
            }
            try {
                Cursor cursorQuery = context.getContentResolver().query(Uri.parse("content://com.transsion.appmarket.data/info"), null, null, new String[]{context.getPackageName()}, null);
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            h(cursorQuery.getString(0), cursorQuery.getString(1), cursorQuery.getString(2), cursorQuery.getString(3));
                            e();
                        } else {
                            dw0.c(context.getPackageName() + " Referrer not found");
                        }
                    } catch (Throwable th) {
                        try {
                            cursorQuery.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            } catch (Exception e2) {
                dw0.v(e2);
            }
        }
    }

    public final void d() {
        hs1.j(this.a).n("key_appid_gp_track_flag_" + this.b, String.valueOf(System.currentTimeMillis()));
    }

    public final void e() {
        hs1.j(this.a).n("key_appid_ps_track_flag_" + this.b, String.valueOf(System.currentTimeMillis()));
    }

    public final void f(String str) {
        JSONObject jSONObject = new JSONObject(str);
        Bundle bundle = new Bundle();
        bundle.putString("insref", jSONObject.optString("insref"));
        bundle.putString("insver", jSONObject.optString("insver"));
        bundle.putLong("refcltmp", jSONObject.optLong("refcltmp"));
        bundle.putLong("refclsvr", jSONObject.optLong("refclsvr"));
        bundle.putLong("insbgtmp", jSONObject.optLong("insbgtmp"));
        bundle.putLong("insbgsvr", jSONObject.optLong("insbgsvr"));
        bundle.putBoolean("gpinsprm", jSONObject.optBoolean("gpinsprm"));
        ic icVar = new ic("gp_referrer", this.b);
        icVar.d(bundle);
        icVar.c();
    }

    public final void g(String str) {
        JSONObject jSONObject = new JSONObject(str);
        Bundle bundle = new Bundle();
        bundle.putString("insref", jSONObject.optString("insref"));
        bundle.putString("strclts", jSONObject.optString("strclts"));
        bundle.putString("strdwts", jSONObject.optString("strdwts"));
        bundle.putString("insfnsts", jSONObject.optString("insfnsts"));
        ic icVar = new ic("ps_referrer", this.b);
        icVar.d(bundle);
        icVar.c();
    }

    public final void h(String str, String str2, String str3, String str4) {
        Bundle bundle = new Bundle();
        bundle.putString("insref", str);
        bundle.putString("strclts", str2);
        bundle.putString("strdwts", str3);
        bundle.putString("insfnsts", str4);
        ic icVar = new ic("ps_referrer", this.b);
        icVar.d(bundle);
        icVar.c();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("insref", str);
            jSONObject.put("strclts", str2);
            jSONObject.put("strdwts", str3);
            jSONObject.put("insfnsts", str4);
            hs1.j(this.a).n("key_referrer_palm_store", jSONObject.toString());
        } catch (Exception e) {
            dw0.v(e);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        dw0.c("====================\\ ReferrerTask start \\================");
        try {
            b();
            c();
        } catch (Exception e) {
            dw0.v(e);
        }
        dw0.c("====================\\ ReferrerTask end \\================");
    }
}
