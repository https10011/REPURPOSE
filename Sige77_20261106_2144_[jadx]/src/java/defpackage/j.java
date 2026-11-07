package defpackage;

import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final /* synthetic */ class j implements ik0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;

    public /* synthetic */ j(int i, List list) {
        this.a = i;
        this.b = list;
    }

    @Override // defpackage.ik0
    public final void a(pk0 pk0Var) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        int i = this.a;
        List list = this.b;
        switch (i) {
            case 0:
                if (!mt.a.contains(k.class)) {
                    try {
                        pk0Var.getClass();
                        try {
                            if (pk0Var.c == null && (jSONObject = pk0Var.d) != null && jSONObject.getBoolean("success")) {
                                Iterator it = list.iterator();
                                while (it.hasNext()) {
                                    zi0.k(((uq0) it.next()).a);
                                }
                                break;
                            }
                        } catch (JSONException unused) {
                            return;
                        }
                    } catch (Throwable th) {
                        mt.a(k.class, th);
                        return;
                    }
                }
                break;
            default:
                pk0Var.getClass();
                try {
                    if (pk0Var.c == null && (jSONObject2 = pk0Var.d) != null && jSONObject2.getBoolean("success")) {
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            zi0.k(((uq0) it2.next()).a);
                        }
                        break;
                    }
                } catch (JSONException unused2) {
                    return;
                }
                break;
        }
    }
}
