package com.transsion.athena.data;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import defpackage.cc2;
import defpackage.dh1;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public class TrackData implements Parcelable {
    public static final Parcelable.Creator<TrackData> CREATOR = new dh1(20);
    public int b = 0;
    public float c = 1.0f;
    public JSONObject a = new JSONObject();

    public final void a(int i, int i2, String str) {
        JSONObject jSONObject = this.a;
        String strConcat = "_".concat(str);
        if (i2 != 0) {
            this.b = i2;
        }
        try {
            if (i2 == 0) {
                jSONObject.put(strConcat, i);
            } else if (i2 == 1) {
                jSONObject.put(strConcat.concat("&add"), i);
            } else {
                if (i2 != 2) {
                    return;
                }
                jSONObject.put(strConcat.concat("&append"), i);
            }
        } catch (Exception e) {
            cc2.c(Log.getStackTraceString(e));
        }
    }

    public final void b(int i, String str, String str2) {
        JSONObject jSONObject = this.a;
        String strConcat = "_".concat(str);
        if (i != 0) {
            this.b = i;
        }
        try {
            if (i == 0) {
                jSONObject.put(strConcat, str2);
            } else {
                if (i == 1) {
                    throw new IllegalArgumentException("json object can not set TRACK_ADD flag");
                }
                if (i != 2) {
                    return;
                }
                jSONObject.put(strConcat.concat("&append"), str2);
            }
        } catch (Exception e) {
            cc2.c(Log.getStackTraceString(e));
        }
    }

    public final void c(String str, int i, Bundle bundle) {
        JSONObject jSONObject = this.a;
        if (bundle == null) {
            return;
        }
        String strConcat = "_".concat(str);
        if (i != 0) {
            this.b = i;
        }
        Set<String> setKeySet = bundle.keySet();
        JSONObject jSONObject2 = new JSONObject();
        try {
            if (i == 0) {
                for (String str2 : setKeySet) {
                    if (bundle.get(str2) instanceof String) {
                        jSONObject2.put("_" + str2, (String) bundle.get(str2));
                    } else {
                        jSONObject2.put("_" + str2, bundle.get(str2));
                    }
                }
                jSONObject.put(strConcat, jSONObject2);
                return;
            }
            if (i == 1) {
                throw new IllegalArgumentException("json object can not set TRACK_ADD flag");
            }
            if (i != 2) {
                return;
            }
            for (String str3 : setKeySet) {
                if (bundle.get(str3) instanceof String) {
                    jSONObject2.put("_" + str3, (String) bundle.get(str3));
                } else {
                    jSONObject2.put("_" + str3, bundle.get(str3));
                }
            }
            jSONObject.put(strConcat + "&append", jSONObject2);
        } catch (Exception e) {
            cc2.c(Log.getStackTraceString(e));
        }
    }

    public final void d(String str, long j) {
        try {
            this.a.put("_".concat(str), j);
        } catch (Exception e) {
            cc2.c(Log.getStackTraceString(e));
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final void e(String str, String str2) {
        if (str2 == null) {
            str2 = "null";
        }
        b(0, str, str2);
    }

    public final int f() {
        try {
            return this.a.toString().getBytes().length + 4;
        } catch (Exception unused) {
            return 4;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeString(this.a.toString());
        parcel.writeFloat(this.c);
    }
}
