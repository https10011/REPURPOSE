package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class j51 {
    public static final j51 a = new j51();
    public static final ConcurrentHashMap b = new ConcurrentHashMap();
    public static final List c = jo.d("other", "fb_mobile_complete_registration", "fb_mobile_add_to_cart", "fb_mobile_purchase", "fb_mobile_initiated_checkout");
    public static final List d = jo.d("none", "address", "health");

    public static final File d() {
        if (!mt.a.contains(j51.class)) {
            try {
                i51 i51Var = (i51) b.get(y00.c(2));
                if (i51Var != null) {
                    return i51Var.f;
                }
            } catch (Throwable th) {
                mt.a(j51.class, th);
                return null;
            }
        }
        return null;
    }

    public static final String[] f(int i, float[][] fArr, String[] strArr) {
        a51 a51Var;
        if (!mt.a.contains(j51.class)) {
            try {
                if (i == 0) {
                    throw null;
                }
                i51 i51Var = (i51) b.get(y00.c(i));
                if (i51Var != null && (a51Var = i51Var.g) != null) {
                    float[] fArr2 = i51Var.e;
                    int length = strArr.length;
                    int length2 = fArr[0].length;
                    d11 d11Var = new d11(new int[]{length, length2});
                    for (int i2 = 0; i2 < length; i2++) {
                        System.arraycopy(fArr[i2], 0, d11Var.c, i2 * length2, length2);
                    }
                    d11 d11VarA = a51Var.a(d11Var, strArr, y00.b(i));
                    if (d11VarA != null && fArr2 != null && d11VarA.c.length != 0 && fArr2.length != 0) {
                        int iV = ts.v(i);
                        j51 j51Var = a;
                        if (iV == 0) {
                            return j51Var.g(d11VarA, fArr2);
                        }
                        if (iV == 1) {
                            return j51Var.h(d11VarA, fArr2);
                        }
                        throw new e71();
                    }
                }
            } catch (Throwable th) {
                mt.a(j51.class, th);
                return null;
            }
        }
        return null;
    }

    public final void a(JSONObject jSONObject) {
        if (mt.a.contains(this)) {
            return;
        }
        try {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                try {
                    i51 i51VarG = ye1.g(jSONObject.getJSONObject(itKeys.next()));
                    if (i51VarG != null) {
                        b.put(i51VarG.a, i51VarG);
                    }
                } catch (JSONException unused) {
                    return;
                }
            }
        } catch (Throwable th) {
            mt.a(this, th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0081 A[Catch: all -> 0x008e, TryCatch #2 {all -> 0x008e, blocks: (B:5:0x000a, B:6:0x001d, B:8:0x0023, B:10:0x0041, B:12:0x0051, B:24:0x0081, B:23:0x007d, B:28:0x0091, B:30:0x009c, B:32:0x00ac, B:35:0x00be, B:37:0x00c4, B:15:0x005a, B:19:0x006c), top: B:43:0x000a, inners: #1 }] */
    public final void b() {
        Locale locale;
        if (mt.a.contains(this)) {
            return;
        }
        try {
            ArrayList arrayList = new ArrayList();
            int iMax = 0;
            String str = null;
            for (Map.Entry entry : b.entrySet()) {
                String str2 = (String) entry.getKey();
                i51 i51Var = (i51) entry.getValue();
                if (Intrinsics.areEqual(str2, y00.c(2))) {
                    str = i51Var.b;
                    int iMax2 = Math.max(iMax, i51Var.d);
                    if (fa0.b(da0.SuggestedEvents) && !mt.a.contains(this)) {
                        try {
                            try {
                                locale = i90.a().getResources().getConfiguration().locale;
                            } catch (Exception unused) {
                                locale = null;
                            }
                            if (locale != null) {
                                String language = locale.getLanguage();
                                language.getClass();
                                if (StringsKt.t(language, "en")) {
                                    i51Var.h = new g(18);
                                    arrayList.add(i51Var);
                                }
                            } else {
                                i51Var.h = new g(18);
                                arrayList.add(i51Var);
                            }
                        } catch (Throwable th) {
                            mt.a(this, th);
                        }
                    }
                    iMax = iMax2;
                }
                if (Intrinsics.areEqual(str2, y00.c(1))) {
                    str = i51Var.b;
                    iMax = Math.max(iMax, i51Var.d);
                    if (fa0.b(da0.IntelligentIntegrity)) {
                        i51Var.h = new g(19);
                        arrayList.add(i51Var);
                    }
                }
            }
            if (str == null || iMax <= 0 || arrayList.isEmpty()) {
                return;
            }
            ye1.i(new i51("MTML", str, null, iMax, null), arrayList);
        } catch (Throwable th2) {
            mt.a(this, th2);
        }
    }

    public final JSONObject c() {
        if (!mt.a.contains(this)) {
            try {
                Bundle bundle = new Bundle();
                bundle.putString("fields", TextUtils.join(",", new String[]{"use_case", "version_id", "asset_uri", "rules_uri", "thresholds"}));
                String str = mk0.j;
                mk0 mk0VarO = vl0.o(null, "app/model_asset", null);
                mk0VarO.d = bundle;
                JSONObject jSONObject = mk0VarO.c().b;
                if (jSONObject != null) {
                    return e(jSONObject);
                }
            } catch (Throwable th) {
                mt.a(this, th);
                return null;
            }
        }
        return null;
    }

    public final JSONObject e(JSONObject jSONObject) {
        if (mt.a.contains(this)) {
            return null;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            try {
                JSONArray jSONArray = jSONObject.getJSONArray("data");
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put("version_id", jSONObject3.getString("version_id"));
                    jSONObject4.put("use_case", jSONObject3.getString("use_case"));
                    jSONObject4.put("thresholds", jSONObject3.getJSONArray("thresholds"));
                    jSONObject4.put("asset_uri", jSONObject3.getString("asset_uri"));
                    if (jSONObject3.has("rules_uri")) {
                        jSONObject4.put("rules_uri", jSONObject3.getString("rules_uri"));
                    }
                    jSONObject2.put(jSONObject3.getString("use_case"), jSONObject4);
                }
                return jSONObject2;
            } catch (JSONException unused) {
                return new JSONObject();
            }
        } catch (Throwable th) {
            mt.a(this, th);
            return null;
        }
    }

    public final String[] g(d11 d11Var, float[] fArr) {
        if (!mt.a.contains(this)) {
            try {
                int[] iArr = d11Var.a;
                int i = iArr[0];
                int i2 = iArr[1];
                float[] fArr2 = d11Var.c;
                if (i2 == fArr.length) {
                    IntRange intRangeB = hf1.b(0, i);
                    ArrayList arrayList = new ArrayList(ko.h(intRangeB));
                    Iterator it = intRangeB.iterator();
                    while (((zq0) it).c) {
                        int iNextInt = ((wq0) it).nextInt();
                        Object obj = "none";
                        int length = fArr.length;
                        int i3 = 0;
                        int i4 = 0;
                        while (i3 < length) {
                            int i5 = i4 + 1;
                            if (fArr2[(iNextInt * i2) + i4] >= fArr[i3]) {
                                obj = d.get(i4);
                            }
                            i3++;
                            i4 = i5;
                        }
                        arrayList.add((String) obj);
                    }
                    return (String[]) arrayList.toArray(new String[0]);
                }
            } catch (Throwable th) {
                mt.a(this, th);
                return null;
            }
        }
        return null;
    }

    public final String[] h(d11 d11Var, float[] fArr) {
        if (!mt.a.contains(this)) {
            try {
                int[] iArr = d11Var.a;
                int i = iArr[0];
                int i2 = iArr[1];
                float[] fArr2 = d11Var.c;
                if (i2 == fArr.length) {
                    IntRange intRangeB = hf1.b(0, i);
                    ArrayList arrayList = new ArrayList(ko.h(intRangeB));
                    Iterator it = intRangeB.iterator();
                    while (((zq0) it).c) {
                        int iNextInt = ((wq0) it).nextInt();
                        Object obj = "other";
                        int length = fArr.length;
                        int i3 = 0;
                        int i4 = 0;
                        while (i3 < length) {
                            int i5 = i4 + 1;
                            if (fArr2[(iNextInt * i2) + i4] >= fArr[i3]) {
                                obj = c.get(i4);
                            }
                            i3++;
                            i4 = i5;
                        }
                        arrayList.add((String) obj);
                    }
                    return (String[]) arrayList.toArray(new String[0]);
                }
            } catch (Throwable th) {
                mt.a(this, th);
                return null;
            }
        }
        return null;
    }
}
