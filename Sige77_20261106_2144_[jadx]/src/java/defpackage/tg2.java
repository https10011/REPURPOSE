package defpackage;

import android.text.TextUtils;
import com.google.android.gms.common.ConnectionResult;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class tg2 implements hf, zm2 {
    public boolean a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public void a(ConnectionResult connectionResult) {
        rg2 rg2Var = (rg2) ((uj0) this.f).j.get((j7) this.c);
        if (rg2Var != null) {
            rg2Var.n(connectionResult);
        }
    }

    @Override // defpackage.hf
    public void c(ConnectionResult connectionResult) {
        ((uj0) this.f).n.post(new bh0(20, this, connectionResult, false));
    }

    @Override // defpackage.zm2
    public String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (TextUtils.isEmpty((String) this.e)) {
            jSONObject.put("sessionInfo", (String) this.c);
            jSONObject.put("code", (String) this.d);
        } else {
            jSONObject.put("phoneNumber", (String) this.b);
            jSONObject.put("temporaryProof", (String) this.e);
        }
        String str = (String) this.f;
        if (str != null) {
            jSONObject.put("idToken", str);
        }
        if (!this.a) {
            jSONObject.put("operation", 2);
        }
        return jSONObject.toString();
    }
}
