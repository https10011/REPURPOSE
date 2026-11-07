package defpackage;

import android.os.Bundle;
import com.hjq.toast.BuildConfig;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.jvm.internal.TypeIntrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class z9 implements Serializable {
    public static final HashSet f = new HashSet();
    public final JSONObject a;
    public final JSONObject b;
    public final boolean c;
    public final boolean d;
    public final String e;

    /* JADX WARN: Code duplicated, block: B:104:0x01e0 A[Catch: all -> 0x01c2, Exception -> 0x01f0, TRY_LEAVE, TryCatch #1 {Exception -> 0x01f0, blocks: (B:83:0x018e, B:84:0x019f, B:86:0x01a5, B:88:0x01b1, B:90:0x01bb, B:95:0x01c4, B:99:0x01ce, B:100:0x01d2, B:101:0x01d9, B:102:0x01da, B:104:0x01e0), top: B:169:0x018e }] */
    /* JADX WARN: Code duplicated, block: B:112:0x020a  */
    /* JADX WARN: Code duplicated, block: B:113:0x020b A[Catch: all -> 0x0237, TryCatch #6 {all -> 0x0237, blocks: (B:110:0x0200, B:113:0x020b, B:115:0x0220, B:117:0x0230, B:120:0x0239, B:122:0x023f, B:123:0x024c, B:125:0x0252, B:126:0x0268), top: B:176:0x0200 }] */
    /* JADX WARN: Code duplicated, block: B:115:0x0220 A[Catch: all -> 0x0237, TryCatch #6 {all -> 0x0237, blocks: (B:110:0x0200, B:113:0x020b, B:115:0x0220, B:117:0x0230, B:120:0x0239, B:122:0x023f, B:123:0x024c, B:125:0x0252, B:126:0x0268), top: B:176:0x0200 }] */
    /* JADX WARN: Code duplicated, block: B:125:0x0252 A[Catch: all -> 0x0237, JSONException -> 0x0275, LOOP:6: B:123:0x024c->B:125:0x0252, LOOP_END, TryCatch #5 {JSONException -> 0x0275, blocks: (B:122:0x023f, B:123:0x024c, B:125:0x0252, B:126:0x0268), top: B:174:0x023f }] */
    /* JADX WARN: Code duplicated, block: B:134:0x0290  */
    /* JADX WARN: Code duplicated, block: B:135:0x0291 A[Catch: all -> 0x02d4, TryCatch #4 {all -> 0x02d4, blocks: (B:132:0x0286, B:135:0x0291, B:137:0x02a8, B:140:0x02b9, B:142:0x02c0, B:144:0x02d0), top: B:172:0x0286 }] */
    /* JADX WARN: Code duplicated, block: B:137:0x02a8 A[Catch: all -> 0x02d4, TryCatch #4 {all -> 0x02d4, blocks: (B:132:0x0286, B:135:0x0291, B:137:0x02a8, B:140:0x02b9, B:142:0x02c0, B:144:0x02d0), top: B:172:0x0286 }] */
    /* JADX WARN: Code duplicated, block: B:142:0x02c0 A[Catch: all -> 0x02d4, TryCatch #4 {all -> 0x02d4, blocks: (B:132:0x0286, B:135:0x0291, B:137:0x02a8, B:140:0x02b9, B:142:0x02c0, B:144:0x02d0), top: B:172:0x0286 }] */
    /* JADX WARN: Code duplicated, block: B:151:0x02e6 A[LOOP:2: B:149:0x02e0->B:151:0x02e6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:153:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:156:0x0303  */
    /* JADX WARN: Code duplicated, block: B:159:0x030c  */
    /* JADX WARN: Code duplicated, block: B:160:0x0312  */
    /* JADX WARN: Code duplicated, block: B:162:0x031e A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:170:0x00c5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:171:0x0183 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:172:0x0286 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:174:0x023f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:176:0x0200 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:179:0x00d2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:195:0x02b9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:196:0x02b8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:200:0x02d0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:202:0x02be A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:205:0x0230 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:207:0x021e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:211:0x01d2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:31:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c9 A[Catch: all -> 0x0101, TRY_LEAVE, TryCatch #2 {all -> 0x0101, blocks: (B:38:0x00c5, B:40:0x00c9, B:52:0x00fb, B:43:0x00d2, B:44:0x00dc, B:46:0x00e2, B:48:0x00f2), top: B:170:0x00c5, inners: #8 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00e2 A[Catch: all -> 0x00fa, TryCatch #8 {all -> 0x00fa, blocks: (B:43:0x00d2, B:44:0x00dc, B:46:0x00e2, B:48:0x00f2), top: B:179:0x00d2, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x0103  */
    /* JADX WARN: Code duplicated, block: B:62:0x0123  */
    /* JADX WARN: Code duplicated, block: B:64:0x012a  */
    /* JADX WARN: Code duplicated, block: B:67:0x013f  */
    /* JADX WARN: Code duplicated, block: B:86:0x01a5 A[Catch: all -> 0x01c2, Exception -> 0x01f0, TryCatch #1 {Exception -> 0x01f0, blocks: (B:83:0x018e, B:84:0x019f, B:86:0x01a5, B:88:0x01b1, B:90:0x01bb, B:95:0x01c4, B:99:0x01ce, B:100:0x01d2, B:101:0x01d9, B:102:0x01da, B:104:0x01e0), top: B:169:0x018e }] */
    /* JADX WARN: Code duplicated, block: B:88:0x01b1 A[Catch: all -> 0x01c2, Exception -> 0x01f0, TryCatch #1 {Exception -> 0x01f0, blocks: (B:83:0x018e, B:84:0x019f, B:86:0x01a5, B:88:0x01b1, B:90:0x01bb, B:95:0x01c4, B:99:0x01ce, B:100:0x01d2, B:101:0x01d9, B:102:0x01da, B:104:0x01e0), top: B:169:0x018e }] */
    /* JADX WARN: Code duplicated, block: B:97:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:98:0x01cc  */
    public z9(String str, String str2, Double d, Bundle bundle, boolean z, boolean z2, UUID uuid, v91 v91Var) throws JSONException {
        JSONObject jSONObject;
        String str3;
        boolean zContains;
        String str4;
        HashMap map;
        JSONObject jSONObject2;
        Object obj;
        String str5;
        br0 br0Var;
        Map mapAsMutableMap;
        HashMap map2;
        ArrayList arrayList;
        int size;
        int i;
        JSONObject jSONObject3;
        String str6;
        String strA;
        Map mapAsMutableMap2;
        ArrayList arrayList2;
        ArrayList arrayList3;
        int size2;
        int i2;
        p70 p70Var;
        int size3;
        int i3;
        String str7;
        Object obj2;
        Set set;
        ng1 ng1Var;
        HashSet hashSet;
        str.getClass();
        str2.getClass();
        this.c = z;
        this.d = z2;
        this.e = str2;
        String str8 = null;
        if (v91Var != null) {
            try {
                LinkedHashMap linkedHashMap = v91Var.a;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(v11.a(linkedHashMap.size()));
                for (Object obj3 : linkedHashMap.entrySet()) {
                    ((w91) ((Map.Entry) obj3).getKey()).getClass();
                    linkedHashMap2.put("iap_parameters", ((Map.Entry) obj3).getValue());
                }
                jSONObject = new JSONObject(w11.h(linkedHashMap2));
            } catch (Exception unused) {
                jSONObject = null;
            }
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
        } else {
            jSONObject = new JSONObject();
        }
        this.b = jSONObject;
        x9.a(str2);
        JSONObject jSONObject4 = new JSONObject();
        oj1 oj1Var = oj1.a;
        Set set2 = mt.a;
        if (set2.contains(oj1.class)) {
            str3 = null;
        } else {
            try {
                if (oj1.b) {
                    oj1 oj1Var2 = oj1.a;
                    if (set2.contains(oj1Var2)) {
                        zContains = false;
                    } else {
                        try {
                            zContains = oj1.d.contains(str2);
                        } catch (Throwable th) {
                            mt.a(oj1Var2, th);
                            zContains = false;
                            if (zContains) {
                                str3 = "_removed_";
                            } else {
                                str3 = str2;
                            }
                            if (Intrinsics.areEqual(str3, str2)) {
                                ng1 ng1Var2 = ng1.a;
                                set = mt.a;
                                if (!set.contains(ng1.class)) {
                                    try {
                                        if (ng1.b) {
                                            ng1Var = ng1.a;
                                            if (!set.contains(ng1Var)) {
                                                try {
                                                    for (String str9 : ng1.c.keySet()) {
                                                        hashSet = (HashSet) ng1.c.get(str9);
                                                        if (hashSet == null) {
                                                        }
                                                    }
                                                } catch (Throwable th2) {
                                                    mt.a(ng1Var, th2);
                                                }
                                            }
                                            if (str8 == null) {
                                                str8 = str2;
                                            }
                                        } else {
                                            str8 = str2;
                                        }
                                    } catch (Throwable th3) {
                                        mt.a(ng1.class, th3);
                                    }
                                }
                                str3 = str8;
                            }
                            jSONObject4.put("_eventName", str3);
                            jSONObject4.put("_logTime", System.currentTimeMillis() / 1000);
                            jSONObject4.put("_ui", str);
                            if (uuid != null) {
                                jSONObject4.put("_session_id", uuid);
                            }
                            if (bundle != null) {
                                str4 = this.e;
                                map = new HashMap();
                                while (r0.hasNext()) {
                                    str.getClass();
                                    x9.a(str);
                                    obj2 = bundle.get(str);
                                    if (obj2 instanceof String) {
                                    }
                                    map.put(str, obj2.toString());
                                }
                                if (!mt.a.contains(br0.class)) {
                                    try {
                                        if (br0.c) {
                                            try {
                                                List<String> listB = CollectionsKt.B(map.keySet());
                                                jSONObject2 = new JSONObject();
                                                for (String str10 : listB) {
                                                    obj = map.get(str10);
                                                    if (obj != null) {
                                                        throw new IllegalStateException("Required value was null.");
                                                    }
                                                    str5 = (String) obj;
                                                    br0Var = br0.b;
                                                    if (!br0Var.k(str10)) {
                                                    }
                                                    map.remove(str10);
                                                    if (br0.d) {
                                                        str5 = BuildConfig.FLAVOR;
                                                    }
                                                    jSONObject2.put(str10, str5);
                                                }
                                                if (jSONObject2.length() != 0) {
                                                    String string = jSONObject2.toString();
                                                    string.getClass();
                                                    map.put("_onDeviceParams", string);
                                                }
                                            } catch (Exception unused2) {
                                            }
                                        }
                                    } catch (Throwable th4) {
                                        mt.a(br0.class, th4);
                                    }
                                }
                                mapAsMutableMap = TypeIntrinsics.asMutableMap(map);
                                oj1 oj1Var3 = oj1.a;
                                if (!mt.a.contains(oj1.class)) {
                                    try {
                                        mapAsMutableMap.getClass();
                                        str4.getClass();
                                        if (!oj1.b) {
                                            map2 = new HashMap();
                                            arrayList = new ArrayList(mapAsMutableMap.keySet());
                                            size = arrayList.size();
                                            i = 0;
                                            while (i < size) {
                                                Object obj4 = arrayList.get(i);
                                                i++;
                                                str6 = (String) obj4;
                                                strA = oj1.a.a(str4, str6);
                                                if (strA != null) {
                                                    map2.put(str6, strA);
                                                    mapAsMutableMap.remove(str6);
                                                }
                                            }
                                            if (!map2.isEmpty()) {
                                                try {
                                                    jSONObject3 = new JSONObject();
                                                    for (Map.Entry entry : map2.entrySet()) {
                                                        jSONObject3.put((String) entry.getKey(), (String) entry.getValue());
                                                    }
                                                    mapAsMutableMap.put("_restrictedParams", jSONObject3.toString());
                                                } catch (JSONException unused3) {
                                                }
                                            }
                                        }
                                    } catch (Throwable th5) {
                                        mt.a(oj1.class, th5);
                                    }
                                }
                                mapAsMutableMap2 = TypeIntrinsics.asMutableMap(map);
                                q70 q70Var = q70.a;
                                if (!mt.a.contains(q70.class)) {
                                    try {
                                        mapAsMutableMap2.getClass();
                                        str4.getClass();
                                        if (!q70.b) {
                                            arrayList2 = new ArrayList(mapAsMutableMap2.keySet());
                                            arrayList3 = new ArrayList(q70.c);
                                            size2 = arrayList3.size();
                                            i2 = 0;
                                            while (i2 < size2) {
                                                Object obj5 = arrayList3.get(i2);
                                                i2++;
                                                p70Var = (p70) obj5;
                                                if (!Intrinsics.areEqual(p70Var.a, str4)) {
                                                    size3 = arrayList2.size();
                                                    i3 = 0;
                                                    while (i3 < size3) {
                                                        Object obj6 = arrayList2.get(i3);
                                                        i3++;
                                                        str7 = (String) obj6;
                                                        if (p70Var.b.contains(str7)) {
                                                            mapAsMutableMap2.remove(str7);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } catch (Throwable th6) {
                                        mt.a(q70.class, th6);
                                    }
                                }
                                for (String str11 : map.keySet()) {
                                    jSONObject4.put(str11, map.get(str11));
                                }
                            }
                            if (d != null) {
                                jSONObject4.put("_valueToSum", d.doubleValue());
                            }
                            if (this.d) {
                                jSONObject4.put("_inBackground", "1");
                            }
                            if (this.c) {
                                jSONObject4.put("_implicitlyLogged", "1");
                            } else {
                                gp1 gp1Var = i01.c;
                                jSONObject4.toString().getClass();
                                synchronized (i90.b) {
                                }
                            }
                            this.a = jSONObject4;
                        }
                    }
                    if (zContains) {
                        str3 = "_removed_";
                    } else {
                        str3 = str2;
                    }
                } else {
                    str3 = str2;
                }
            } catch (Throwable th7) {
                mt.a(oj1.class, th7);
                str3 = null;
            }
        }
        if (Intrinsics.areEqual(str3, str2)) {
            ng1 ng1Var3 = ng1.a;
            set = mt.a;
            if (!set.contains(ng1.class)) {
                if (ng1.b) {
                    ng1Var = ng1.a;
                    if (!set.contains(ng1Var)) {
                        while (r0.hasNext()) {
                            hashSet = (HashSet) ng1.c.get(str9);
                            if (hashSet == null && hashSet.contains(str2)) {
                                str8 = str9;
                                break;
                            }
                        }
                    }
                    if (str8 == null) {
                        str8 = str2;
                    }
                } else {
                    str8 = str2;
                }
            }
            str3 = str8;
        }
        jSONObject4.put("_eventName", str3);
        jSONObject4.put("_logTime", System.currentTimeMillis() / 1000);
        jSONObject4.put("_ui", str);
        if (uuid != null) {
            jSONObject4.put("_session_id", uuid);
        }
        if (bundle != null) {
            str4 = this.e;
            map = new HashMap();
            for (String str12 : bundle.keySet()) {
                str12.getClass();
                x9.a(str12);
                obj2 = bundle.get(str12);
                if ((obj2 instanceof String) && !(obj2 instanceof Number)) {
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    throw new d90(String.format("Parameter value '%s' for key '%s' should be a string or a numeric type.", Arrays.copyOf(new Object[]{obj2, str12}, 2)));
                }
                map.put(str12, obj2.toString());
            }
            if (!mt.a.contains(br0.class)) {
                if (br0.c && !map.isEmpty()) {
                    List<String> listB2 = CollectionsKt.B(map.keySet());
                    jSONObject2 = new JSONObject();
                    while (r0.hasNext()) {
                        obj = map.get(str10);
                        if (obj != null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        str5 = (String) obj;
                        br0Var = br0.b;
                        if (!br0Var.k(str10) || br0Var.k(str5)) {
                            map.remove(str10);
                            if (br0.d) {
                                str5 = BuildConfig.FLAVOR;
                            }
                            jSONObject2.put(str10, str5);
                        }
                    }
                    if (jSONObject2.length() != 0) {
                        String string2 = jSONObject2.toString();
                        string2.getClass();
                        map.put("_onDeviceParams", string2);
                    }
                }
            }
            mapAsMutableMap = TypeIntrinsics.asMutableMap(map);
            oj1 oj1Var4 = oj1.a;
            if (!mt.a.contains(oj1.class)) {
                mapAsMutableMap.getClass();
                str4.getClass();
                if (!oj1.b) {
                    map2 = new HashMap();
                    arrayList = new ArrayList(mapAsMutableMap.keySet());
                    size = arrayList.size();
                    i = 0;
                    while (i < size) {
                        Object obj7 = arrayList.get(i);
                        i++;
                        str6 = (String) obj7;
                        strA = oj1.a.a(str4, str6);
                        if (strA != null) {
                            map2.put(str6, strA);
                            mapAsMutableMap.remove(str6);
                        }
                    }
                    if (!map2.isEmpty()) {
                        jSONObject3 = new JSONObject();
                        while (r3.hasNext()) {
                            jSONObject3.put((String) entry.getKey(), (String) entry.getValue());
                        }
                        mapAsMutableMap.put("_restrictedParams", jSONObject3.toString());
                    }
                }
            }
            mapAsMutableMap2 = TypeIntrinsics.asMutableMap(map);
            q70 q70Var2 = q70.a;
            if (!mt.a.contains(q70.class)) {
                mapAsMutableMap2.getClass();
                str4.getClass();
                if (!q70.b) {
                    arrayList2 = new ArrayList(mapAsMutableMap2.keySet());
                    arrayList3 = new ArrayList(q70.c);
                    size2 = arrayList3.size();
                    i2 = 0;
                    while (i2 < size2) {
                        Object obj8 = arrayList3.get(i2);
                        i2++;
                        p70Var = (p70) obj8;
                        if (!Intrinsics.areEqual(p70Var.a, str4)) {
                            size3 = arrayList2.size();
                            i3 = 0;
                            while (i3 < size3) {
                                Object obj9 = arrayList2.get(i3);
                                i3++;
                                str7 = (String) obj9;
                                if (p70Var.b.contains(str7)) {
                                    mapAsMutableMap2.remove(str7);
                                }
                            }
                        }
                    }
                }
            }
            while (r0.hasNext()) {
                jSONObject4.put(str11, map.get(str11));
            }
        }
        if (d != null) {
            jSONObject4.put("_valueToSum", d.doubleValue());
        }
        if (this.d) {
            jSONObject4.put("_inBackground", "1");
        }
        if (this.c) {
            jSONObject4.put("_implicitlyLogged", "1");
        } else {
            gp1 gp1Var2 = i01.c;
            jSONObject4.toString().getClass();
            synchronized (i90.b) {
            }
        }
        this.a = jSONObject4;
    }

    private final Object writeReplace() throws ObjectStreamException {
        String string = this.a.toString();
        string.getClass();
        String string2 = this.b.toString();
        string2.getClass();
        return new y9(string, string2, this.c, this.d);
    }

    public final String toString() {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        JSONObject jSONObject = this.a;
        return String.format("\"%s\", implicit: %b, json: %s", Arrays.copyOf(new Object[]{jSONObject.optString("_eventName"), Boolean.valueOf(this.c), jSONObject.toString()}, 3));
    }

    public z9(String str, String str2, boolean z, boolean z2) {
        JSONObject jSONObject = new JSONObject(str);
        this.a = jSONObject;
        this.b = new JSONObject(str2);
        this.c = z;
        String strOptString = jSONObject.optString("_eventName");
        strOptString.getClass();
        this.e = strOptString;
        this.d = z2;
    }
}
