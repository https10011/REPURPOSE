package defpackage;

import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.StringCompanionObject;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class lk0 implements jk0, an2, cv1 {
    public ArrayList a;

    public /* synthetic */ lk0(ArrayList arrayList) {
        this.a = arrayList;
    }

    @Override // defpackage.jk0
    public void a(String str, String str2) {
        str.getClass();
        str2.getClass();
        ArrayList arrayList = this.a;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        arrayList.add(String.format(Locale.US, "%s=%s", Arrays.copyOf(new Object[]{str, URLEncoder.encode(str2, "UTF-8")}, 2)));
    }

    public synchronized ArrayList b(Class cls, Class cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        ArrayList arrayList2 = this.a;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            ez1 ez1Var = (ez1) obj;
            if ((ez1Var.a.isAssignableFrom(cls) && cls2.isAssignableFrom(ez1Var.b)) && !arrayList.contains(ez1Var.b)) {
                arrayList.add(ez1Var.b);
            }
        }
        return arrayList;
    }

    @Override // defpackage.cv1
    public /* synthetic */ Object get() {
        Object obj = y93.j;
        return new nh3(this.a);
    }

    @Override // defpackage.an2
    public an2 zza(String str) throws sk2 {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.a = new ArrayList();
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("authorizedDomains");
            if (jSONArrayOptJSONArray != null) {
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    this.a.add(jSONArrayOptJSONArray.getString(i));
                }
            }
            return this;
        } catch (JSONException e) {
            throw am2.d0(e, "lk0", str);
        }
    }
}
