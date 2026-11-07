package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class tq2 implements an2 {
    public String a;
    public String b;
    public long c;
    public boolean d;
    public String e;
    public String f;

    @Override // defpackage.an2
    public final an2 zza(String str) throws sk2 {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.a = ku1.a(jSONObject.optString("idToken", null));
            this.b = ku1.a(jSONObject.optString("refreshToken", null));
            this.c = jSONObject.optLong("expiresIn", 0L);
            ku1.a(jSONObject.optString("localId", null));
            this.d = jSONObject.optBoolean("isNewUser", false);
            this.e = ku1.a(jSONObject.optString("temporaryProof", null));
            this.f = ku1.a(jSONObject.optString("phoneNumber", null));
            return this;
        } catch (NullPointerException | JSONException e) {
            throw am2.d0(e, "tq2", str);
        }
    }
}
