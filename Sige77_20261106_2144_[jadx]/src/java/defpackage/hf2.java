package defpackage;

import android.util.Log;
import android.util.Pair;
import com.hjq.toast.BuildConfig;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class hf2 {
    public JSONObject e;
    public String j;
    public String n;
    public long a = 86400000;
    public long b = 150000;
    public boolean c = true;
    public String d = BuildConfig.FLAVOR;
    public long f = 0;
    public long g = -1;
    public int h = 0;
    public boolean i = false;
    public final ArrayList k = new ArrayList();
    public final ArrayList l = new ArrayList();
    public Pair m = new Pair(3, 6);
    public int o = 6;
    public int p = 10;

    public static hf2 a(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                hf2 hf2Var = new hf2();
                hf2Var.a = jSONObject.getLong("pd");
                hf2Var.b = jSONObject.getLong("th");
                hf2Var.c = jSONObject.getBoolean("once");
                if (jSONObject.has("url")) {
                    hf2Var.d = jSONObject.getString("url");
                }
                if (jSONObject.has("tidUrls")) {
                    hf2Var.e = jSONObject.getJSONObject("tidUrls");
                }
                hf2Var.f = jSONObject.getLong("version");
                hf2Var.g = jSONObject.getLong("npt");
                hf2Var.h = jSONObject.getInt("rt");
                hf2Var.i = jSONObject.getBoolean("dd");
                hf2Var.j = jSONObject.optString("ddv", null);
                if (jSONObject.has("p")) {
                    hf2Var.b(jSONObject.getJSONArray("p"));
                }
                if (jSONObject.has("delays")) {
                    String[] strArrSplit = jSONObject.getString("delays").split(",");
                    hf2Var.m = new Pair(Integer.valueOf(Integer.parseInt(strArrSplit[0])), Integer.valueOf(Integer.parseInt(strArrSplit[1])));
                }
                if (jSONObject.has("tz")) {
                    hf2Var.n = jSONObject.getString("tz");
                }
                int i = 6;
                int iOptInt = jSONObject.optInt("geo", 6);
                if (iOptInt > 0 && iOptInt < 12) {
                    i = iOptInt;
                }
                hf2Var.o = i;
                if (jSONObject.has("dlt")) {
                    hf2Var.p = jSONObject.getInt("dlt");
                }
                return hf2Var;
            } catch (Exception e) {
                cc2.c(Log.getStackTraceString(e));
            }
        }
        return null;
    }

    public final void b(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return;
        }
        ArrayList arrayList = this.k;
        arrayList.clear();
        ArrayList arrayList2 = this.l;
        arrayList2.clear();
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(jSONArray.getString(i));
            arrayList2.add(jSONArray.getString(i).getBytes());
        }
    }

    public final JSONObject c() {
        try {
            JSONArray jSONArray = new JSONArray();
            ArrayList arrayList = this.k;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                jSONArray.put((String) obj);
            }
            return new JSONObject().put("pd", this.a).put("dlt", this.p).put("th", this.b).put("once", this.c).put("url", this.d).put("tidUrls", this.e).put("version", this.f).put("npt", this.g).put("rt", this.h).put("dd", this.i).put("ddv", this.j).put("p", jSONArray).put("tz", this.n).put("geo", this.o).put("delays", this.m.first + "," + this.m.second);
        } catch (Exception e) {
            cc2.c(Log.getStackTraceString(e));
            return null;
        }
    }
}
