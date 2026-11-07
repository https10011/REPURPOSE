package defpackage;

import java.util.HashMap;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class ng1 {
    public static boolean b;
    public static final ng1 a = new ng1();
    public static HashMap c = new HashMap();

    public final void a() {
        HashSet hashSetE;
        if (mt.a.contains(this)) {
            return;
        }
        try {
            ja0 ja0VarK = ma0.k(i90.b(), false);
            if (ja0VarK == null) {
                return;
            }
            try {
                c = new HashMap();
                JSONArray jSONArray = ja0VarK.p;
                if (jSONArray == null || jSONArray.length() == 0) {
                    return;
                }
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    boolean zHas = jSONObject.has("key");
                    boolean zHas2 = jSONObject.has("value");
                    if (zHas && zHas2) {
                        String string = jSONObject.getString("key");
                        JSONArray jSONArray2 = jSONObject.getJSONArray("value");
                        if (string != null && (hashSetE = h42.e(jSONArray2)) != null) {
                            c.put(string, hashSetE);
                        }
                    }
                }
            } catch (Exception unused) {
            }
        } catch (Throwable th) {
            mt.a(this, th);
        }
    }
}
