package defpackage;

import com.hjq.toast.BuildConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.a;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public class wb extends ub {
    public static boolean i(Object[] objArr, Object obj) {
        int i;
        objArr.getClass();
        objArr.getClass();
        if (obj == null) {
            int length = objArr.length;
            i = 0;
            while (i < length) {
                if (objArr[i] != null) {
                    i++;
                }
            }
            i = -1;
        } else {
            int length2 = objArr.length;
            for (int i2 = 0; i2 < length2; i2++) {
                if (Intrinsics.areEqual(obj, objArr[i2])) {
                    i = i2;
                }
            }
            i = -1;
        }
        return i >= 0;
    }

    public static ArrayList j(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static Object k(int i, Object[] objArr) {
        objArr.getClass();
        if (i < 0 || i >= objArr.length) {
            return null;
        }
        return objArr[i];
    }

    public static String l(String str, int i, Object[] objArr) {
        int i2 = i & 2;
        String str2 = BuildConfig.FLAVOR;
        String str3 = i2 != 0 ? BuildConfig.FLAVOR : "[";
        if ((i & 4) == 0) {
            str2 = "]";
        }
        objArr.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) str3);
        int i3 = 0;
        for (Object obj : objArr) {
            i3++;
            if (i3 > 1) {
                sb.append((CharSequence) str);
            }
            lu1.a(sb, obj, null);
        }
        sb.append((CharSequence) str2);
        return sb.toString();
    }

    public static final void m(Object[] objArr, HashSet hashSet) {
        objArr.getClass();
        for (Object obj : objArr) {
            hashSet.add(obj);
        }
    }

    public static List n(long[] jArr) {
        jArr.getClass();
        int length = jArr.length;
        if (length == 0) {
            return x50.a;
        }
        if (length == 1) {
            return a.a(Long.valueOf(jArr[0]));
        }
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j : jArr) {
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    public static List o(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        if (length != 0) {
            return length != 1 ? new ArrayList(new db(objArr, false)) : a.a(objArr[0]);
        }
        return x50.a;
    }

    public static Set p(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        if (length == 0) {
            return a60.a;
        }
        if (length != 1) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(v11.a(objArr.length));
            m(objArr, linkedHashSet);
            return linkedHashSet;
        }
        Set setSingleton = Collections.singleton(objArr[0]);
        setSingleton.getClass();
        return setSingleton;
    }
}
