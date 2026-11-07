package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.a;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class mp0 {
    public static final List a = a.a("fb_currency");
    public static final List b = a.a("_valueToSum");
    public static final long c = 60000;
    public static final List d = jo.d(new Pair("fb_iap_product_id", a.a("fb_iap_product_id")), new Pair("fb_iap_product_description", a.a("fb_iap_product_description")), new Pair("fb_iap_product_title", a.a("fb_iap_product_title")), new Pair("fb_iap_purchase_token", a.a("fb_iap_purchase_token")));

    public static Pair a(Bundle bundle, Bundle bundle2, v91 v91Var) {
        if (bundle == null) {
            return new Pair(bundle2, v91Var);
        }
        try {
            for (String str : bundle.keySet()) {
                String string = bundle.getString(str);
                if (string != null) {
                    Map map = v91.b;
                    str.getClass();
                    Pair pairB = zi0.b(str, string, bundle2, v91Var);
                    Bundle bundle3 = (Bundle) pairB.a;
                    v91Var = (v91) pairB.b;
                    bundle2 = bundle3;
                }
            }
        } catch (Exception unused) {
        }
        return new Pair(bundle2, v91Var);
    }

    public static List b(boolean z) {
        ja0 ja0VarB = ma0.b(i90.b());
        if ((ja0VarB != null ? ja0VarB.v : null) != null) {
            List<Pair> list = ja0VarB.v;
            if (!list.isEmpty()) {
                if (!z) {
                    return list;
                }
                ArrayList arrayList = new ArrayList();
                for (Pair pair : list) {
                    Iterator it = ((List) pair.b).iterator();
                    while (it.hasNext()) {
                        arrayList.add(new Pair((String) it.next(), a.a(pair.a)));
                    }
                }
                return arrayList;
            }
        }
        return d;
    }

    public static List c(boolean z) {
        ja0 ja0VarB = ma0.b(i90.b());
        if (ja0VarB == null) {
            return null;
        }
        List<Pair> list = ja0VarB.w;
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return null;
        }
        if (!z) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (Pair pair : list) {
            Iterator it = ((List) pair.b).iterator();
            while (it.hasNext()) {
                arrayList.add(new Pair((String) it.next(), a.a(pair.a)));
            }
        }
        return arrayList;
    }
}
