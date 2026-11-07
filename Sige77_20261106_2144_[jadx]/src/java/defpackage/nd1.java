package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class nd1 {
    public static boolean b;
    public static HashSet d;
    public static final nd1 a = new nd1();
    public static final uv1 c = aw0.a(va.d);

    public static final void b(Bundle bundle) {
        if (mt.a.contains(nd1.class)) {
            return;
        }
        try {
            if (b && bundle != null && !bundle.isEmpty() && d != null) {
                ArrayList arrayList = new ArrayList();
                Set<String> setKeySet = bundle.keySet();
                setKeySet.getClass();
                for (String str : setKeySet) {
                    HashSet hashSet = d;
                    hashSet.getClass();
                    if (!hashSet.contains(str)) {
                        str.getClass();
                        arrayList.add(str);
                    }
                }
                int size = arrayList.size();
                boolean z = false;
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    String str2 = (String) obj;
                    if (bundle.containsKey(str2)) {
                        bundle.remove(str2);
                        z = true;
                    }
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("cd", z);
                bundle.putString("pm_metadata", jSONObject.toString());
                bundle.putString("pm", "1");
            }
        } catch (Throwable th) {
            mt.a(nd1.class, th);
        }
    }

    public final void a() {
        HashSet hashSet;
        Set set = mt.a;
        if (set.contains(this)) {
            return;
        }
        try {
            ja0 ja0VarK = ma0.k(i90.b(), false);
            if (ja0VarK == null) {
                return;
            }
            JSONArray jSONArray = ja0VarK.m;
            HashSet hashSet2 = null;
            if (set.contains(this) || jSONArray == null) {
                hashSet = null;
            } else {
                try {
                    if (jSONArray.length() != 0) {
                        hashSet = new HashSet();
                        int length = jSONArray.length();
                        for (int i = 0; i < length; i++) {
                            String string = jSONArray.getString(i);
                            string.getClass();
                            hashSet.add(string);
                        }
                    }
                } catch (Throwable th) {
                    mt.a(this, th);
                }
                hashSet = null;
            }
            if (hashSet == null) {
                if (!mt.a.contains(this)) {
                    try {
                        hashSet2 = (HashSet) c.getValue();
                    } catch (Throwable th2) {
                        mt.a(this, th2);
                    }
                }
                hashSet = hashSet2;
            }
            d = hashSet;
        } catch (Throwable th3) {
            mt.a(this, th3);
        }
    }

    public final boolean c(Bundle bundle) {
        if (mt.a.contains(this) || bundle == null) {
            return false;
        }
        try {
            return bundle.containsKey("pm") && Intrinsics.areEqual(bundle.get("pm"), "1");
        } catch (Throwable th) {
            mt.a(this, th);
            return false;
        }
    }
}
