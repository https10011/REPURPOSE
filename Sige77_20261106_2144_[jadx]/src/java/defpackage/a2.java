package defpackage;

import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final /* synthetic */ class a2 implements ik0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a2(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.ik0
    public final void a(pk0 pk0Var) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                e2 e2Var = (e2) obj;
                pk0Var.getClass();
                JSONObject jSONObject3 = pk0Var.d;
                if (jSONObject3 != null) {
                    e2Var.c = jSONObject3.optString("access_token");
                    e2Var.a = jSONObject3.optInt("expires_at");
                    e2Var.b = jSONObject3.optInt("expires_in");
                    e2Var.e = Long.valueOf(jSONObject3.optLong("data_access_expiration_time"));
                    e2Var.d = jSONObject3.optString("graph_domain", null);
                    break;
                }
                break;
            case 1:
                ArrayList arrayList = (ArrayList) obj;
                pk0Var.getClass();
                try {
                    if (pk0Var.c == null && (jSONObject = pk0Var.d) != null && jSONObject.getBoolean("success")) {
                        int size = arrayList.size();
                        int i2 = 0;
                        while (i2 < size) {
                            Object obj2 = arrayList.get(i2);
                            i2++;
                            zi0.k(((k70) obj2).a);
                        }
                        break;
                    }
                } catch (JSONException unused) {
                    return;
                }
                break;
            default:
                uq0 uq0Var = (uq0) obj;
                pk0Var.getClass();
                try {
                    if (pk0Var.c == null && (jSONObject2 = pk0Var.d) != null && jSONObject2.getBoolean("success")) {
                        zi0.k(uq0Var.a);
                        break;
                    }
                } catch (JSONException unused2) {
                    return;
                }
                break;
        }
    }
}
