package defpackage;

import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class qq2 implements an2 {
    public String a;
    public String b;
    public long c;
    public ArrayList d;
    public String e;

    @Override // defpackage.an2
    public final an2 zza(String str) throws sk2 {
        try {
            JSONObject jSONObject = new JSONObject(str);
            ku1.a(jSONObject.optString("localId", null));
            ku1.a(jSONObject.optString("email", null));
            ku1.a(jSONObject.optString("displayName", null));
            this.a = ku1.a(jSONObject.optString("idToken", null));
            ku1.a(jSONObject.optString("photoUrl", null));
            this.b = ku1.a(jSONObject.optString("refreshToken", null));
            this.c = jSONObject.optLong("expiresIn", 0L);
            this.d = qp2.a(jSONObject.optJSONArray("mfaInfo"));
            this.e = jSONObject.optString("mfaPendingCredential", null);
            return this;
        } catch (NullPointerException | JSONException e) {
            throw am2.d0(e, "qq2", str);
        }
    }
}
