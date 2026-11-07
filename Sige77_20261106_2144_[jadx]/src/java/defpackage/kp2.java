package defpackage;

import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class kp2 implements an2 {
    public String a;
    public ut2 b;

    public final boolean a() {
        gu2.l("EMAIL_PASSWORD_PROVIDER");
        ut2 ut2Var = this.b;
        String str = null;
        if (ut2Var != null && !ut2Var.isEmpty()) {
            ut2 ut2Var2 = this.b;
            int i = ut2Var2.i;
            int i2 = 0;
            while (i2 < i) {
                Object obj = ut2Var2.get(i2);
                i2++;
                do2 do2Var = (do2) obj;
                String str2 = do2Var.b;
                String str3 = do2Var.a;
                if (str2 != null && str3 != null && str3.equals("EMAIL_PASSWORD_PROVIDER")) {
                    str = str2;
                    break;
                }
            }
        }
        return str != null && (str.equals("ENFORCE") || str.equals("AUDIT"));
    }

    @Override // defpackage.an2
    public final an2 zza(String str) throws sk2 {
        ut2 ut2Var;
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.a = ku1.a(jSONObject.optString("recaptchaKey"));
            if (jSONObject.has("recaptchaEnforcementState")) {
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("recaptchaEnforcementState");
                if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() == 0) {
                    cr2 cr2Var = dp2.e;
                    ut2Var = ut2.v;
                } else {
                    cr2 cr2Var2 = dp2.e;
                    Object[] objArrCopyOf = new Object[4];
                    int i = 0;
                    int i2 = 0;
                    boolean z = false;
                    while (i < jSONArrayOptJSONArray.length()) {
                        JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i);
                        do2 do2Var = jSONObject2 == null ? new do2(null, null) : new do2(ku1.a(jSONObject2.optString("provider")), ku1.a(jSONObject2.optString("enforcementState")));
                        int iK = gb2.K(objArrCopyOf.length, i2 + 1);
                        if (iK > objArrCopyOf.length || z) {
                            objArrCopyOf = Arrays.copyOf(objArrCopyOf, iK);
                            z = false;
                        }
                        objArrCopyOf[i2] = do2Var;
                        i++;
                        i2++;
                    }
                    ut2Var = i2 == 0 ? ut2.v : new ut2(i2, objArrCopyOf);
                }
                this.b = ut2Var;
            }
            return this;
        } catch (NullPointerException e) {
            e = e;
            throw am2.d0(e, "kp2", str);
        } catch (JSONException e2) {
            e = e2;
            throw am2.d0(e, "kp2", str);
        }
    }
}
