package defpackage;

import android.text.TextUtils;
import com.google.android.gms.internal.firebase-auth-api.zzaij;
import com.google.firebase.auth.zzc;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class mq2 implements an2 {
    public String W;
    public String X;
    public String Y;
    public String Z;
    public boolean a;
    public String a0;
    public String b;
    public ArrayList b0;
    public String c;
    public String c0;
    public long d;
    public String e;
    public String f;
    public String i;
    public boolean v;
    public String w;

    public final zzc a() {
        if (TextUtils.isEmpty(this.w) && TextUtils.isEmpty(this.W)) {
            return null;
        }
        String str = this.f;
        String str2 = this.W;
        String str3 = this.w;
        String str4 = this.Z;
        String str5 = this.X;
        gu2.m(str, "Must specify a non-empty providerId");
        if (!TextUtils.isEmpty(str2) || !TextUtils.isEmpty(str3)) {
            return new zzc(str, str2, str3, (zzaij) null, str4, str5, (String) null);
        }
        e.g("Must specify an idToken or an accessToken.");
        return null;
    }

    @Override // defpackage.an2
    public final an2 zza(String str) throws sk2 {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.a = jSONObject.optBoolean("needConfirmation", false);
            jSONObject.optBoolean("needEmail", false);
            this.b = ku1.a(jSONObject.optString("idToken", null));
            this.c = ku1.a(jSONObject.optString("refreshToken", null));
            this.d = jSONObject.optLong("expiresIn", 0L);
            ku1.a(jSONObject.optString("localId", null));
            this.e = ku1.a(jSONObject.optString("email", null));
            ku1.a(jSONObject.optString("displayName", null));
            ku1.a(jSONObject.optString("photoUrl", null));
            this.f = ku1.a(jSONObject.optString("providerId", null));
            this.i = ku1.a(jSONObject.optString("rawUserInfo", null));
            this.v = jSONObject.optBoolean("isNewUser", false);
            this.w = jSONObject.optString("oauthAccessToken", null);
            this.W = jSONObject.optString("oauthIdToken", null);
            this.Y = ku1.a(jSONObject.optString("errorMessage", null));
            this.Z = ku1.a(jSONObject.optString("pendingToken", null));
            this.a0 = ku1.a(jSONObject.optString("tenantId", null));
            this.b0 = qp2.a(jSONObject.optJSONArray("mfaInfo"));
            this.c0 = ku1.a(jSONObject.optString("mfaPendingCredential", null));
            this.X = ku1.a(jSONObject.optString("oauthTokenSecret", null));
            return this;
        } catch (NullPointerException | JSONException e) {
            throw am2.d0(e, "mq2", str);
        }
    }
}
