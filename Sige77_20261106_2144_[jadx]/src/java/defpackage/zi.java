package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public abstract class zi {
    public static final HashMap a;

    static {
        HashMap map = new HashMap();
        a = map;
        map.put(Boolean.class, new yi(0));
        map.put(Integer.class, new yi(1));
        map.put(Long.class, new yi(2));
        map.put(Double.class, new yi(3));
        map.put(String.class, new yi(4));
        map.put(String[].class, new yi(5));
        map.put(JSONArray.class, new yi(6));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Bundle a(JSONObject jSONObject) throws JSONException {
        Bundle bundle = new Bundle();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object obj = jSONObject.get(next);
            if (obj != JSONObject.NULL) {
                if (!(obj instanceof JSONObject)) {
                    yi yiVar = (yi) a.get(obj.getClass());
                    if (yiVar == null) {
                        uq1.l(obj.getClass(), "Unsupported type: ");
                        return null;
                    }
                    next.getClass();
                    int i = yiVar.a;
                    next.getClass();
                    switch (i) {
                        case 0:
                            bundle.putBoolean(next, ((Boolean) obj).booleanValue());
                            break;
                        case 1:
                            bundle.putInt(next, ((Integer) obj).intValue());
                            break;
                        case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                            bundle.putLong(next, ((Long) obj).longValue());
                            break;
                        case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                            bundle.putDouble(next, ((Double) obj).doubleValue());
                            break;
                        case oc1.LONG_FIELD_NUMBER /* 4 */:
                            bundle.putString(next, (String) obj);
                            break;
                        case oc1.STRING_FIELD_NUMBER /* 5 */:
                            throw new IllegalArgumentException("Unexpected type from JSON");
                        default:
                            JSONArray jSONArray = (JSONArray) obj;
                            ArrayList arrayList = new ArrayList();
                            if (jSONArray.length() != 0) {
                                int length = jSONArray.length();
                                int i2 = 0;
                                while (true) {
                                    if (i2 >= length) {
                                        bundle.putStringArrayList(next, arrayList);
                                    }
                                    Object obj2 = jSONArray.get(i2);
                                    if (!(obj2 instanceof String)) {
                                        uq1.l(obj2.getClass(), "Unexpected type in an array: ");
                                    }
                                    arrayList.add(obj2);
                                    i2++;
                                    break;
                                }
                            } else {
                                bundle.putStringArrayList(next, arrayList);
                            }
                            break;
                    }
                } else {
                    bundle.putBundle(next, a((JSONObject) obj));
                }
            }
        }
        return bundle;
    }
}
