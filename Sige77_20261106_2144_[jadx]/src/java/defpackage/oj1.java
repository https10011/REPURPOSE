package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class oj1 {
    public static boolean b;
    public static final oj1 a = new oj1();
    public static final ArrayList c = new ArrayList();
    public static final CopyOnWriteArraySet d = new CopyOnWriteArraySet();

    public final String a(String str, String str2) {
        try {
            if (!mt.a.contains(this)) {
                try {
                    ArrayList arrayList = new ArrayList(c);
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        nj1 nj1Var = (nj1) obj;
                        if (nj1Var != null && Intrinsics.areEqual(str, nj1Var.a)) {
                            for (String str3 : nj1Var.b.keySet()) {
                                if (Intrinsics.areEqual(str2, str3)) {
                                    return (String) nj1Var.b.get(str3);
                                }
                            }
                        }
                    }
                } catch (Exception e) {
                    Log.w("oj1", "getMatchedRuleType failed", e);
                }
            }
            return null;
        } catch (Throwable th) {
            mt.a(this, th);
            return null;
        }
    }

    public final void b() {
        String str;
        CopyOnWriteArraySet copyOnWriteArraySet = d;
        ArrayList arrayList = c;
        if (mt.a.contains(this)) {
            return;
        }
        try {
            ja0 ja0VarK = ma0.k(i90.b(), false);
            if (ja0VarK != null && (str = ja0VarK.l) != null && str.length() != 0) {
                JSONObject jSONObject = new JSONObject(str);
                arrayList.clear();
                copyOnWriteArraySet.clear();
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                    if (jSONObject2 != null) {
                        JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("restrictive_param");
                        next.getClass();
                        HashMap map = new HashMap();
                        nj1 nj1Var = new nj1();
                        nj1Var.a = next;
                        nj1Var.b = map;
                        if (jSONObjectOptJSONObject != null) {
                            nj1Var.b = h42.h(jSONObjectOptJSONObject);
                            arrayList.add(nj1Var);
                        }
                        if (jSONObject2.has("process_event_name")) {
                            copyOnWriteArraySet.add(next);
                        }
                    }
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            mt.a(this, th);
        }
    }
}
