package defpackage;

import com.google.firebase.auth.zzao;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class wo2 implements an2 {
    public wa a;

    @Override // defpackage.an2
    public final an2 zza(String str) throws sk2 {
        wa waVar;
        zo2 zo2Var;
        try {
            JSONObject jSONObject = new JSONObject(str);
            boolean z = false;
            if (jSONObject.has("users")) {
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("users");
                if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() == 0) {
                    waVar = new wa(new ArrayList());
                } else {
                    ArrayList arrayList = new ArrayList(jSONArrayOptJSONArray.length());
                    int i = 0;
                    while (i < jSONArrayOptJSONArray.length()) {
                        JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i);
                        if (jSONObject2 == null) {
                            zo2Var = new zo2();
                            zo2Var.f = new ri2(24);
                            cr2 cr2Var = dp2.e;
                            zo2Var.m = ut2.v;
                        } else {
                            String strA = ku1.a(jSONObject2.optString("localId", null));
                            String strA2 = ku1.a(jSONObject2.optString("email", null));
                            boolean zOptBoolean = jSONObject2.optBoolean("emailVerified", z);
                            String strA3 = ku1.a(jSONObject2.optString("displayName", null));
                            String strA4 = ku1.a(jSONObject2.optString("photoUrl", null));
                            ri2 ri2VarX = ri2.x(jSONObject2.optJSONArray("providerUserInfo"));
                            ku1.a(jSONObject2.optString("rawPassword", null));
                            zo2Var = new zo2(strA, strA2, zOptBoolean, strA3, strA4, ri2VarX, ku1.a(jSONObject2.optString("phoneNumber", null)), jSONObject2.optLong("createdAt", 0L), jSONObject2.optLong("lastLoginAt", 0L), qp2.a(jSONObject2.optJSONArray("mfaInfo")), zzao.S(jSONObject2.optJSONArray("passkeyInfo")));
                        }
                        arrayList.add(zo2Var);
                        i++;
                        jSONArrayOptJSONArray = jSONArrayOptJSONArray;
                        z = false;
                    }
                    waVar = new wa(arrayList);
                }
            } else {
                waVar = new wa(25, z);
                waVar.b = new ArrayList();
            }
            this.a = waVar;
            return this;
        } catch (NullPointerException e) {
            e = e;
            throw am2.d0(e, "wo2", str);
        } catch (JSONException e2) {
            e = e2;
            throw am2.d0(e, "wo2", str);
        }
    }
}
