package com.transsion.sdk.oneid.data;

import android.content.Context;
import android.text.TextUtils;
import com.hjq.toast.BuildConfig;
import defpackage.yd2;
import java.io.Serializable;
import org.json.JSONObject;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public class UserIdInfo extends OneBaseInfo implements Serializable {
    public String account_id;
    public String account_type;
    public String tripartite_id;
    public String tripartite_type;

    public UserIdInfo(Context context) {
        this.account_id = BuildConfig.FLAVOR;
        this.account_type = BuildConfig.FLAVOR;
        this.tripartite_id = BuildConfig.FLAVOR;
        this.tripartite_type = BuildConfig.FLAVOR;
        try {
            String strE = yd2.a(context).e("user_id");
            if (TextUtils.isEmpty(strE)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(strE);
            this.account_type = jSONObject.optString("account_type");
            this.account_id = jSONObject.optString("account_id");
            this.tripartite_type = jSONObject.optString("tripartite_type");
            this.tripartite_id = jSONObject.optString("tripartite_id");
        } catch (Exception unused) {
        }
    }

    public void setAccount(String str, String str2) {
        this.account_type = str;
        this.account_id = str2;
    }

    public void setAccount_id(String str) {
        this.account_id = str;
    }

    public void setAccount_type(String str) {
        this.account_type = str;
    }

    public void setTripartite(String str, String str2) {
        this.tripartite_type = str;
        this.tripartite_id = str2;
    }

    public void setTripartite_id(String str) {
        this.tripartite_id = str;
    }

    public void setTripartite_type(String str) {
        this.tripartite_type = str;
    }
}
