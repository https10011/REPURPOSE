package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class zp2 implements an2 {
    public String a;
    public String b;
    public long c;

    @Override // defpackage.an2
    public final an2 zza(String str) throws sk2 {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.a = ku1.a(jSONObject.optString("idToken", null));
            ku1.a(jSONObject.optString("displayName", null));
            ku1.a(jSONObject.optString("email", null));
            this.b = ku1.a(jSONObject.optString("refreshToken", null));
            this.c = jSONObject.optLong("expiresIn", 0L);
            return this;
        } catch (NullPointerException | JSONException e) {
            throw am2.d0(e, "zp2", str);
        }
    }
}
