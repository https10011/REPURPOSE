package defpackage;

import android.net.Uri;
import com.linecorp.linesdk.LineFriendProfile;
import com.linecorp.linesdk.LineGroup;
import com.linecorp.linesdk.LineProfile;
import com.linecorp.linesdk.openchat.OpenChatRoomInfo;
import io.jsonwebtoken.JwsHeader;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class ks0 extends lo2 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ks0(int i) {
        super(2);
        this.b = i;
    }

    public static LineProfile F(JSONObject jSONObject) throws JSONException {
        String strOptString = jSONObject.optString("pictureUrl", null);
        return new LineProfile(strOptString == null ? null : Uri.parse(strOptString), jSONObject.getString("userId"), jSONObject.getString("displayName"), jSONObject.optString("statusMessage", null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [boolean, char] */
    /* JADX WARN: Type inference failed for: r10v1, types: [int] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r2v23, types: [org.json.JSONArray] */
    @Override // defpackage.lo2
    public final Object r(JSONObject jSONObject) throws JSONException {
        int i = 4;
        ?? r10 = 0;
        switch (this.b) {
            case 0:
                ArrayList arrayList = new ArrayList();
                JSONArray jSONArray = jSONObject.getJSONArray("keys");
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                    uy1 uy1Var = new uy1();
                    uy1Var.a = jSONObject2.getString("kty");
                    uy1Var.b = jSONObject2.getString(JwsHeader.ALGORITHM);
                    uy1Var.c = jSONObject2.getString("use");
                    uy1Var.d = jSONObject2.getString(JwsHeader.KEY_ID);
                    uy1Var.e = jSONObject2.getString("crv");
                    uy1Var.f = jSONObject2.getString("x");
                    uy1Var.i = jSONObject2.getString("y");
                    arrayList.add(new is0(uy1Var));
                }
                wa waVar = new wa(13, (boolean) r10);
                waVar.b = arrayList;
                return new js0(waVar);
            case 1:
                String string = jSONObject.getString("token_type");
                if ("Bearer".equals(string)) {
                    return new zg1(jSONObject.getString("access_token"), jSONObject.getLong("expires_in") * 1000, jSONObject.getString("refresh_token"), dm1.c(jSONObject.getString("scope")));
                }
                throw new JSONException(ts.j("Illegal token type. token_type=", string));
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                return new h2(jSONObject.getString("client_id"), jSONObject.getLong("expires_in") * 1000, dm1.c(jSONObject.getString("scope")));
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                uy1 uy1Var2 = new uy1();
                uy1Var2.a = jSONObject.getString("issuer");
                uy1Var2.b = jSONObject.getString("authorization_endpoint");
                uy1Var2.c = jSONObject.getString("token_endpoint");
                uy1Var2.d = jSONObject.getString("jwks_uri");
                uy1Var2.e = y21.u(jSONObject.getJSONArray("response_types_supported"));
                uy1Var2.f = y21.u(jSONObject.getJSONArray("subject_types_supported"));
                uy1Var2.i = y21.u(jSONObject.getJSONArray("id_token_signing_alg_values_supported"));
                return new u91(uy1Var2);
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                ArrayList arrayList2 = new ArrayList();
                ?? jSONArray2 = jSONObject.getJSONArray("friends");
                while (r10 < jSONArray2.length()) {
                    JSONObject jSONObject3 = jSONArray2.getJSONObject(r10);
                    LineProfile lineProfileF = F(jSONObject3);
                    arrayList2.add(new LineFriendProfile(lineProfileF.a, lineProfileF.b, lineProfileF.c, lineProfileF.d, jSONObject3.optString("displayNameOverridden", null)));
                    r10++;
                }
                String strOptString = jSONObject.optString("pageToken", null);
                rc2 rc2Var = new rc2(4);
                rc2Var.b = arrayList2;
                rc2Var.c = strOptString;
                return rc2Var;
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                boolean z = jSONObject.getBoolean("friendFlag");
                rx0 rx0Var = new rx0();
                rx0Var.a = z;
                return rx0Var;
            case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                ArrayList arrayList3 = new ArrayList();
                JSONArray jSONArray3 = jSONObject.getJSONArray("groups");
                for (int i3 = 0; i3 < jSONArray3.length(); i3++) {
                    JSONObject jSONObject4 = jSONArray3.getJSONObject(i3);
                    String strOptString2 = jSONObject4.optString("pictureUrl", null);
                    arrayList3.add(new LineGroup(strOptString2 == null ? null : Uri.parse(strOptString2), jSONObject4.getString("groupId"), jSONObject4.getString("groupName")));
                }
                String strOptString3 = jSONObject.optString("pageToken", null);
                hd2 hd2Var = new hd2(i);
                hd2Var.b = arrayList3;
                hd2Var.c = strOptString3;
                return hd2Var;
            case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                return d31.valueOf(jSONObject.getString("state").toUpperCase());
            case oc1.BYTES_FIELD_NUMBER /* 8 */:
                ArrayList arrayList4 = new ArrayList();
                if (jSONObject.has("results")) {
                    JSONArray jSONArray4 = jSONObject.getJSONArray("results");
                    for (int i4 = 0; i4 < jSONArray4.length(); i4++) {
                        JSONObject jSONObject5 = jSONArray4.getJSONObject(i4);
                        int i5 = jSONObject5.get("status").equals("OK".toLowerCase()) ? 1 : 2;
                        String string2 = jSONObject5.getString("to");
                        f6 f6Var = new f6((char) r10, 8);
                        f6Var.c = string2;
                        f6Var.b = i5;
                        arrayList4.add(f6Var);
                    }
                }
                return arrayList4;
            case 9:
                return Boolean.valueOf(jSONObject.getBoolean("agreed"));
            case 10:
                return new OpenChatRoomInfo(jSONObject.getString("openchatId"), jSONObject.getString("url"));
            case 11:
                return s91.valueOf(jSONObject.getString("type").toUpperCase());
            case 12:
                return t91.valueOf(jSONObject.getString("status").toUpperCase());
            default:
                return F(jSONObject);
        }
    }
}
