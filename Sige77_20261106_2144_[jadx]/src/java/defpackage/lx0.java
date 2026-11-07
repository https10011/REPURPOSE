package defpackage;

import android.text.TextUtils;
import android.util.Log;
import com.linecorp.linesdk.LineIdToken;
import io.jsonwebtoken.Jwts;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class lx0 extends lo2 {
    public final /* synthetic */ mx0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lx0(mx0 mx0Var) {
        super(2);
        this.b = mx0Var;
    }

    public final LineIdToken F(String str) throws Exception {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ri2 ri2Var = this.b.d;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return mn0.a(str, Jwts.parser().setAllowedClockSkewSeconds(864000000L).setSigningKeyResolver(ri2Var).parseClaimsJws(str).getBody());
        } catch (Exception e) {
            Log.e("IdTokenParser", "failed to parse IdToken: " + str, e);
            throw e;
        }
    }

    @Override // defpackage.lo2
    public final Object r(JSONObject jSONObject) throws JSONException {
        String string = jSONObject.getString("token_type");
        if (!"Bearer".equals(string)) {
            throw new JSONException(ts.j("Illegal token type. token_type=", string));
        }
        try {
            return new zr0(new er0(1000 * jSONObject.getLong("expires_in"), System.currentTimeMillis(), jSONObject.getString("access_token"), jSONObject.getString("refresh_token")), dm1.c(jSONObject.getString("scope")), F(jSONObject.optString("id_token")));
        } catch (Exception e) {
            throw new JSONException(e.getMessage());
        }
    }
}
