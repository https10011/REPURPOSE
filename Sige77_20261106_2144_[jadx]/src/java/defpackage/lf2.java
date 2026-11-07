package defpackage;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class lf2 {
    public Boolean a;
    public Boolean b;
    public Boolean c;
    public Boolean d;
    public long e = 3600;
    public String f;

    public static lf2 b(String str) {
        lf2 lf2Var = new lf2();
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("wakeupStatsEnabled")) {
                    lf2Var.a = Boolean.valueOf(jSONObject.optBoolean("wakeupStatsEnabled", true));
                }
                if (jSONObject.has("aliveStatsEnabled")) {
                    lf2Var.d = Boolean.valueOf(jSONObject.optBoolean("aliveStatsEnabled", true));
                }
                if (jSONObject.has("registerStatsEnabled")) {
                    lf2Var.c = Boolean.valueOf(jSONObject.optBoolean("registerStatsEnabled", true));
                }
                if (jSONObject.has("eventStatsEnabled")) {
                    lf2Var.d = Boolean.valueOf(jSONObject.optBoolean("eventStatsEnabled", true));
                }
                if (jSONObject.has("reportPeriod")) {
                    lf2Var.e = jSONObject.optLong("reportPeriod");
                }
                if (jSONObject.has("installId")) {
                    lf2Var.f = jSONObject.optString("installId");
                }
            } catch (JSONException unused) {
            }
        }
        return lf2Var;
    }

    public static boolean c(Boolean bool) {
        if (bool == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public final void a(lf2 lf2Var) {
        this.a = lf2Var.a;
        Boolean bool = lf2Var.d;
        this.b = bool;
        this.c = lf2Var.c;
        this.d = bool;
        this.e = lf2Var.e;
        this.f = lf2Var.f;
    }

    public final String d() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("wakeupStatsEnabled", this.a);
            jSONObject.put("registerStatsEnabled", this.c);
            jSONObject.put("eventStatsEnabled", this.d);
            jSONObject.put("reportPeriod", this.e);
            jSONObject.put("installId", this.f);
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && lf2.class == obj.getClass()) {
            lf2 lf2Var = (lf2) obj;
            if (this.e != lf2Var.e) {
                return false;
            }
            Boolean bool = this.a;
            Boolean bool2 = lf2Var.a;
            if (bool == null ? bool2 != null : !bool.equals(bool2)) {
                return false;
            }
            Boolean bool3 = this.b;
            Boolean bool4 = lf2Var.b;
            if (bool3 == null ? bool4 != null : !bool3.equals(bool4)) {
                return false;
            }
            Boolean bool5 = this.c;
            Boolean bool6 = lf2Var.c;
            if (bool5 == null ? bool6 != null : !bool5.equals(bool6)) {
                return false;
            }
            Boolean bool7 = this.d;
            Boolean bool8 = lf2Var.d;
            if (bool7 == null ? bool8 != null : !bool7.equals(bool8)) {
                return false;
            }
            String str = this.f;
            String str2 = lf2Var.f;
            if (str != null) {
                return str.equals(str2);
            }
            if (str2 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Boolean bool = this.a;
        int iHashCode = (bool != null ? bool.hashCode() : 0) * 31;
        Boolean bool2 = this.b;
        int iHashCode2 = (iHashCode + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        Boolean bool3 = this.c;
        int iHashCode3 = (iHashCode2 + (bool3 != null ? bool3.hashCode() : 0)) * 31;
        Boolean bool4 = this.d;
        int iHashCode4 = (iHashCode3 + (bool4 != null ? bool4.hashCode() : 0)) * 31;
        long j = this.e;
        int i = (iHashCode4 + ((int) (j ^ (j >>> 32)))) * 31;
        String str = this.f;
        return i + (str != null ? str.hashCode() : 0);
    }
}
