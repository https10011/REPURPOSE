package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class xt1 {
    public static boolean b;
    public static final xt1 a = new xt1();
    public static final HashMap c = new HashMap();
    public static final HashMap d = new HashMap();

    /* JADX WARN: Code duplicated, block: B:41:0x009e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:44:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a7 A[Catch: all -> 0x00cf, TryCatch #1 {all -> 0x00cf, blocks: (B:42:0x00a0, B:45:0x00a7, B:46:0x00ab, B:48:0x00b1), top: B:67:0x00a0, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00b1 A[Catch: all -> 0x00cf, TRY_LEAVE, TryCatch #1 {all -> 0x00cf, blocks: (B:42:0x00a0, B:45:0x00a7, B:46:0x00ab, B:48:0x00b1), top: B:67:0x00a0, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x00d5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x0025 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x00cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:? A[LOOP:1: B:46:0x00ab->B:84:?, LOOP_END, SYNTHETIC] */
    public static final void c(Bundle bundle) {
        int i;
        boolean z;
        Set<String> set;
        String lowerCase;
        String lowerCase2;
        xt1 xt1Var = a;
        HashMap map = d;
        if (mt.a.contains(xt1.class)) {
            return;
        }
        try {
            if (b && bundle != null) {
                ArrayList arrayList = new ArrayList();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    i = 0;
                    if (!it.hasNext()) {
                        break;
                    }
                    String next = it.next();
                    String strValueOf = String.valueOf(bundle.get(next));
                    HashMap map2 = c;
                    boolean z2 = map2.get(next) != null;
                    boolean z3 = map.get(next) != null;
                    if (z2 || z3) {
                        Set set2 = (Set) map2.get(next);
                        if (mt.a.contains(xt1Var) || set2 == null) {
                            z = false;
                            set = (Set) map.get(next);
                            if (!mt.a.contains(xt1Var)) {
                                if (!set.isEmpty()) {
                                    for (String str : set) {
                                        Locale locale = Locale.ROOT;
                                        lowerCase = str.toLowerCase(locale);
                                        lowerCase.getClass();
                                        lowerCase2 = strValueOf.toLowerCase(locale);
                                        lowerCase2.getClass();
                                        if (Intrinsics.areEqual(lowerCase, lowerCase2)) {
                                            i = 1;
                                            break;
                                        }
                                    }
                                }
                            }
                            if (z) {
                            }
                        } else {
                            try {
                                if (!set2.isEmpty()) {
                                    Iterator it2 = set2.iterator();
                                    while (true) {
                                        if (it2.hasNext()) {
                                            if (new Regex((String) it2.next()).c(strValueOf)) {
                                                z = true;
                                                break;
                                            }
                                        }
                                    }
                                    set = (Set) map.get(next);
                                    if (!mt.a.contains(xt1Var) && set != null) {
                                        try {
                                            if (!set.isEmpty()) {
                                                while (r9.hasNext()) {
                                                    Locale locale2 = Locale.ROOT;
                                                    lowerCase = str.toLowerCase(locale2);
                                                    lowerCase.getClass();
                                                    lowerCase2 = strValueOf.toLowerCase(locale2);
                                                    lowerCase2.getClass();
                                                    if (Intrinsics.areEqual(lowerCase, lowerCase2)) {
                                                        i = 1;
                                                        break;
                                                    }
                                                }
                                            }
                                        } catch (Throwable th) {
                                            mt.a(xt1Var, th);
                                        }
                                    }
                                    if (z && i == 0) {
                                        next.getClass();
                                        arrayList.add(next);
                                    }
                                }
                            } catch (Throwable th2) {
                                mt.a(xt1Var, th2);
                            }
                            z = false;
                            set = (Set) map.get(next);
                            if (!mt.a.contains(xt1Var)) {
                                if (!set.isEmpty()) {
                                    while (r9.hasNext()) {
                                        Locale locale3 = Locale.ROOT;
                                        lowerCase = str.toLowerCase(locale3);
                                        lowerCase.getClass();
                                        lowerCase2 = strValueOf.toLowerCase(locale3);
                                        lowerCase2.getClass();
                                        if (Intrinsics.areEqual(lowerCase, lowerCase2)) {
                                            i = 1;
                                            break;
                                        }
                                    }
                                }
                            }
                            if (z) {
                            }
                        }
                    }
                    mt.a(xt1.class, th);
                }
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    bundle.remove((String) obj);
                }
            }
        } catch (Throwable th3) {
            mt.a(xt1.class, th3);
        }
    }

    public final void a(JSONArray jSONArray) {
        HashMap map = c;
        HashMap map2 = d;
        if (mt.a.contains(this) || jSONArray == null) {
            return;
        }
        try {
            if (b) {
                return;
            }
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                String string = jSONObject.getString("key");
                if (string != null && string.length() != 0) {
                    try {
                        JSONArray jSONArray2 = jSONObject.getJSONArray("value");
                        int length2 = jSONArray2.length();
                        for (int i2 = 0; i2 < length2; i2++) {
                            boolean z = jSONArray2.getJSONObject(i2).getBoolean("require_exact_match");
                            HashSet hashSetB = b(jSONArray2.getJSONObject(i2).getJSONArray("potential_matches"));
                            if (z) {
                                HashSet hashSet = (HashSet) map2.get(string);
                                if (hashSet != null) {
                                    hashSet.addAll(hashSetB);
                                    hashSetB = hashSet;
                                }
                                map2.put(string, hashSetB);
                            } else {
                                HashSet hashSet2 = (HashSet) map.get(string);
                                if (hashSet2 != null) {
                                    hashSet2.addAll(hashSetB);
                                    hashSetB = hashSet2;
                                }
                                map.put(string, hashSetB);
                            }
                        }
                    } catch (Exception unused) {
                        map2.remove(string);
                        map.remove(string);
                    }
                }
            }
        } catch (Throwable th) {
            mt.a(this, th);
        }
    }

    public final HashSet b(JSONArray jSONArray) {
        try {
            if (mt.a.contains(this)) {
                return null;
            }
            try {
                HashSet hashSetE = h42.e(jSONArray);
                return hashSetE == null ? new HashSet() : hashSetE;
            } catch (Exception unused) {
                return new HashSet();
            }
        } catch (Throwable th) {
            mt.a(this, th);
            return null;
        }
    }
}
