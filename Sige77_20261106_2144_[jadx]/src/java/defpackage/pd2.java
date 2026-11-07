package defpackage;

import android.text.TextUtils;
import android.util.Log;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class pd2 {
    public int a;
    public long d;
    public int e;
    public String g;
    public String h;
    public int i;
    public int j;
    public String k;
    public long b = -1;
    public int c = 0;
    public final CopyOnWriteArrayList f = new CopyOnWriteArrayList();

    public static pd2 a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            pd2 pd2Var = new pd2();
            pd2Var.b = jSONObject.getLong("npt");
            pd2Var.c = jSONObject.getInt("rt");
            pd2Var.d = jSONObject.getLong("ver");
            pd2Var.e = jSONObject.optInt("dim");
            pd2Var.h = jSONObject.optString("url");
            pd2Var.k = jSONObject.optString("url_config");
            pd2Var.g = jSONObject.optString("opcode");
            pd2Var.i = jSONObject.optInt("interval");
            pd2Var.j = jSONObject.optInt("offline");
            return pd2Var;
        } catch (Exception e) {
            cc2.c(Log.getStackTraceString(e));
            return null;
        }
    }

    public final boolean b() {
        return this.j == 2;
    }

    public final void c(long j) {
        this.b = j;
        this.c = 0;
    }

    public final String d() {
        try {
            return new JSONObject().put("npt", this.b).put("rt", this.c).put("ver", this.d).put("dim", this.e).put("url", this.h).put("url_config", this.k).put("interval", this.i).put("offline", this.j).put("opcode", this.g).toString();
        } catch (Exception e) {
            cc2.c(Log.getStackTraceString(e));
            return null;
        }
    }
}
