package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class q70 {
    public static boolean b;
    public static final q70 a = new q70();
    public static final ArrayList c = new ArrayList();
    public static final HashSet d = new HashSet();

    public static final void b(ArrayList arrayList) {
        if (mt.a.contains(q70.class)) {
            return;
        }
        try {
            arrayList.getClass();
            if (b) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (d.contains(((z9) it.next()).e)) {
                        it.remove();
                    }
                }
            }
        } catch (Throwable th) {
            mt.a(q70.class, th);
        }
    }

    public final synchronized void a() {
        if (mt.a.contains(this)) {
            return;
        }
        try {
            ja0 ja0VarK = ma0.k(i90.b(), false);
            if (ja0VarK == null) {
                return;
            }
            String str = ja0VarK.l;
            if (str != null && str.length() > 0) {
                JSONObject jSONObject = new JSONObject(str);
                c.clear();
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                    if (jSONObject2 != null) {
                        if (jSONObject2.optBoolean("is_deprecated_event")) {
                            HashSet hashSet = d;
                            next.getClass();
                            hashSet.add(next);
                        } else {
                            JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray("deprecated_param");
                            next.getClass();
                            ArrayList arrayList = new ArrayList();
                            p70 p70Var = new p70();
                            p70Var.a = next;
                            p70Var.b = arrayList;
                            if (jSONArrayOptJSONArray != null) {
                                p70Var.b = h42.f(jSONArrayOptJSONArray);
                            }
                            c.add(p70Var);
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
