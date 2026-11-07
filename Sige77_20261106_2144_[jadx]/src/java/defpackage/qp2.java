package defpackage;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.firebase-auth-api.zzaih;
import com.hjq.toast.BuildConfig;
import java.text.ParseException;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class qp2 {
    public final String a;
    public final String b;
    public final String c;
    public final long d;
    public final zzaih e;

    public qp2(String str, String str2, String str3, long j, zzaih zzaihVar) {
        if (!TextUtils.isEmpty(str) && zzaihVar != null) {
            Log.e("MfaInfo", "Cannot have both MFA phone_info and totp_info");
            e.g("Cannot have both MFA phone_info and totp_info");
            throw null;
        }
        this.a = str;
        gu2.l(str2);
        this.b = str2;
        this.c = str3;
        this.d = j;
        this.e = zzaihVar;
    }

    public static ArrayList a(JSONArray jSONArray) throws JSONException {
        long jW;
        if (jSONArray == null || jSONArray.length() == 0) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            String strA = ku1.a(jSONObject.optString("phoneInfo"));
            String strA2 = ku1.a(jSONObject.optString("mfaEnrollmentId"));
            String strA3 = ku1.a(jSONObject.optString("displayName"));
            String strOptString = jSONObject.optString("enrolledAt", BuildConfig.FLAVOR);
            try {
                ht2 ht2VarA = pt2.a(strOptString);
                pt2.b(ht2VarA);
                jW = ht2VarA.w();
            } catch (ParseException e) {
                Log.w("MfaInfo", "Could not parse timestamp as ISOString. Invalid ISOString \"" + strOptString + "\"", e);
                jW = 0;
            }
            qp2 qp2Var = new qp2(strA, strA2, strA3, jW, jSONObject.opt("totpInfo") != null ? new zzaih() : null);
            jSONObject.optString("unobfuscatedPhoneInfo");
            arrayList.add(qp2Var);
        }
        return arrayList;
    }
}
