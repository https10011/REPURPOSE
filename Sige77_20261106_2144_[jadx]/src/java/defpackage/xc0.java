package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.util.Arrays;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class xc0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public xc0(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        int i = ku1.a;
        gu2.q("ApplicationId must be set.", true ^ (str == null || str.trim().isEmpty()));
        this.b = str;
        this.a = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
    }

    public static xc0 a(Context context) {
        rc2 rc2Var = new rc2(context);
        String strZ = rc2Var.z("google_app_id");
        if (TextUtils.isEmpty(strZ)) {
            return null;
        }
        return new xc0(strZ, rc2Var.z("google_api_key"), rc2Var.z("firebase_database_url"), rc2Var.z("ga_trackingId"), rc2Var.z("gcm_defaultSenderId"), rc2Var.z("google_storage_bucket"), rc2Var.z("project_id"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof xc0)) {
            return false;
        }
        xc0 xc0Var = (xc0) obj;
        return jw.j(this.b, xc0Var.b) && jw.j(this.a, xc0Var.a) && jw.j(this.c, xc0Var.c) && jw.j(this.d, xc0Var.d) && jw.j(this.e, xc0Var.e) && jw.j(this.f, xc0Var.f) && jw.j(this.g, xc0Var.g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.a, this.c, this.d, this.e, this.f, this.g});
    }

    public final String toString() {
        hs1 hs1Var = new hs1(this);
        hs1Var.e(this.b, "applicationId");
        hs1Var.e(this.a, "apiKey");
        hs1Var.e(this.c, "databaseUrl");
        hs1Var.e(this.e, "gcmSenderId");
        hs1Var.e(this.f, "storageBucket");
        hs1Var.e(this.g, "projectId");
        return hs1Var.toString();
    }
}
