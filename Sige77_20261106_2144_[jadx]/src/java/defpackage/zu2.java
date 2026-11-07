package defpackage;

import android.text.TextUtils;
import android.util.Log;
import io.jsonwebtoken.JwtParser;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public abstract class zu2 {
    public static final h01 a = new h01("JSONParser", new String[0]);

    public static mb a(JSONObject jSONObject) throws JSONException {
        mb mbVar = new mb(0);
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objA = jSONObject.get(next);
            if (objA instanceof JSONArray) {
                objA = b((JSONArray) objA);
            } else if (objA instanceof JSONObject) {
                objA = a((JSONObject) objA);
            }
            mbVar.put(next, objA);
        }
        return mbVar;
    }

    public static ArrayList b(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            Object objA = jSONArray.get(i);
            if (objA instanceof JSONArray) {
                objA = b((JSONArray) objA);
            } else if (objA instanceof JSONObject) {
                objA = a((JSONObject) objA);
            }
            arrayList.add(objA);
        }
        return arrayList;
    }

    public static Map c(String str) {
        gu2.l(str);
        p33 p33Var = new p33(JwtParser.SEPARATOR_CHAR);
        m83 m83Var = new m83();
        m83Var.a = p33Var;
        List listU = new ox1(m83Var).u(str);
        if (listU.size() < 2) {
            a.h("Invalid idToken ".concat(str), new Object[0]);
            return new HashMap();
        }
        mb mbVarD = d(new String(ga.h((String) listU.get(1)), StandardCharsets.UTF_8));
        return mbVarD == null ? new HashMap() : mbVarD;
    }

    public static mb d(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject != JSONObject.NULL) {
                return a(jSONObject);
            }
            return null;
        } catch (Exception e) {
            Log.d("JSONParser", "Failed to parse JSONObject into Map.");
            throw new vr3(e);
        }
    }
}
