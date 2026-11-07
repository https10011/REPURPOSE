package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class lo1 {
    public static boolean b;
    public static final lo1 a = new lo1();
    public static HashSet c = new HashSet();
    public static HashMap d = new HashMap();

    public static final void b(String str, Bundle bundle) {
        if (mt.a.contains(lo1.class)) {
            return;
        }
        try {
            str.getClass();
            if (b && bundle != null) {
                if (!c.isEmpty() || d.containsKey(str)) {
                    JSONArray jSONArray = new JSONArray();
                    try {
                        HashSet hashSet = (HashSet) d.get(str);
                        ArrayList arrayList = new ArrayList(bundle.keySet());
                        int size = arrayList.size();
                        int i = 0;
                        while (i < size) {
                            Object obj = arrayList.get(i);
                            i++;
                            String str2 = (String) obj;
                            lo1 lo1Var = a;
                            str2.getClass();
                            if (!mt.a.contains(lo1Var)) {
                                try {
                                    if (c.contains(str2) || (hashSet != null && !hashSet.isEmpty() && hashSet.contains(str2))) {
                                        bundle.remove(str2);
                                        jSONArray.put(str2);
                                    }
                                } catch (Throwable th) {
                                    mt.a(lo1Var, th);
                                }
                            }
                        }
                    } catch (Exception unused) {
                    }
                    if (jSONArray.length() > 0) {
                        bundle.putString("_filteredKey", jSONArray.toString());
                    }
                }
            }
        } catch (Throwable th2) {
            mt.a(lo1.class, th2);
        }
    }

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
                c = new HashSet();
                d = new HashMap();
                JSONArray jSONArray = ja0VarK.q;
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
                        if (jSONArray2 != null && (hashSetE = h42.e(jSONArray2)) != null) {
                            if (string.equals("_MTSDK_Default_")) {
                                c = hashSetE;
                            } else {
                                d.put(string, hashSetE);
                            }
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
