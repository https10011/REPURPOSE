package com.transsion.athena.data;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import defpackage.b81;
import defpackage.cc2;
import defpackage.f81;
import defpackage.nj2;
import defpackage.qc2;
import defpackage.ze2;
import java.util.ArrayList;
import org.json.JSONObject;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public class AppIdData implements Parcelable {
    public static final Parcelable.Creator<AppIdData> CREATOR = new f81(5);
    public int a;
    public String b;
    public String c;
    public int d;
    public ArrayList e = new ArrayList();
    public String f;

    public static AppIdData a(Context context, int i) {
        AppIdData appIdData = new AppIdData();
        appIdData.a = i;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("pkgName", nj2.B(context));
            jSONObject.put("versionSDK", "1.2.0.0-snowball");
            jSONObject.put("channel", ze2.p);
            jSONObject.put("installer", nj2.w(context));
            jSONObject.put("versionName", nj2.J(context));
            jSONObject.put("versionCode", String.valueOf(nj2.C(context)));
            appIdData.b = jSONObject.toString();
            return appIdData;
        } catch (Exception e) {
            b81 b81Var = cc2.a;
            cc2.c(Log.getStackTraceString(e));
            return appIdData;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            sb.append(((qc2) obj).toString());
        }
        return "AppIdData{appid=" + this.a + ", baseInfo='" + this.b + "', packetUid='" + this.c + "', retryTimes=" + this.d + ", serverUrl='" + this.f + "', tidEventSets='" + ((Object) sb) + "'}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeString(this.b);
    }
}
