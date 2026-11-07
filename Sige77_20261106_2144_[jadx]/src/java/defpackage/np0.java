package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.IBinder;
import com.hjq.toast.BuildConfig;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class np0 {
    public static final np0 a = new np0();
    public static final HashMap b = new HashMap();
    public static final HashMap c = new HashMap();
    public static final String d = i90.a().getPackageName();
    public static final SharedPreferences e = i90.a().getSharedPreferences("com.facebook.internal.SKU_DETAILS", 0);
    public static final SharedPreferences f = i90.a().getSharedPreferences("com.facebook.internal.PURCHASE", 0);

    public static final ArrayList f(Context context, Object obj) {
        if (mt.a.contains(np0.class)) {
            return null;
        }
        try {
            context.getClass();
            np0 np0Var = a;
            return np0Var.a(np0Var.e(context, obj, "inapp"));
        } catch (Throwable th) {
            mt.a(np0.class, th);
            return null;
        }
    }

    public final ArrayList a(ArrayList arrayList) {
        ArrayList arrayList2;
        SharedPreferences sharedPreferences = f;
        ArrayList arrayList3 = null;
        if (mt.a.contains(this)) {
            return null;
        }
        try {
            ArrayList arrayList4 = new ArrayList();
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                String str = (String) obj;
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    String string = jSONObject.getString("productId");
                    long j = jSONObject.getLong("purchaseTime");
                    arrayList2 = arrayList3;
                    try {
                        try {
                            String string2 = jSONObject.getString("purchaseToken");
                            if (jCurrentTimeMillis - (j / 1000) <= 86400 && !Intrinsics.areEqual(sharedPreferences.getString(string, BuildConfig.FLAVOR), string2)) {
                                editorEdit.putString(string, string2);
                                arrayList4.add(str);
                            }
                        } catch (JSONException unused) {
                        }
                    } catch (Throwable th) {
                        th = th;
                        mt.a(this, th);
                        return arrayList2;
                    }
                } catch (JSONException unused2) {
                    arrayList2 = arrayList3;
                }
                arrayList3 = arrayList2;
            }
            arrayList2 = arrayList3;
            editorEdit.apply();
            return arrayList4;
        } catch (Throwable th2) {
            th = th2;
            arrayList2 = arrayList3;
        }
    }

    public final Class b(Context context, String str) {
        Class<?> clsLoadClass;
        HashMap map = c;
        Set set = mt.a;
        if (set.contains(this)) {
            return null;
        }
        try {
            Class cls = (Class) map.get(str);
            if (cls != null) {
                return cls;
            }
            if (set.contains(sp0.class)) {
                clsLoadClass = null;
            } else {
                try {
                    context.getClass();
                    try {
                        clsLoadClass = context.getClassLoader().loadClass(str);
                    } catch (ClassNotFoundException unused) {
                        clsLoadClass = null;
                    }
                } catch (Throwable th) {
                    mt.a(sp0.class, th);
                }
            }
            if (clsLoadClass != null) {
                map.put(str, clsLoadClass);
            }
            return clsLoadClass;
        } catch (Throwable th2) {
            mt.a(this, th2);
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:32:0x0070  */
    public final Method c(Class cls, String str) {
        Class[] clsArr;
        if (mt.a.contains(this)) {
            return null;
        }
        try {
            HashMap map = b;
            Method method = (Method) map.get(str);
            if (method != null) {
                return method;
            }
            Class cls2 = Integer.TYPE;
            switch (str) {
                case "getPurchases":
                    cls2.getClass();
                    clsArr = new Class[]{cls2, String.class, String.class, String.class};
                    break;
                case "isBillingSupported":
                    cls2.getClass();
                    clsArr = new Class[]{cls2, String.class, String.class};
                    break;
                case "asInterface":
                    clsArr = new Class[]{IBinder.class};
                    break;
                case "getPurchaseHistory":
                    cls2.getClass();
                    clsArr = new Class[]{cls2, String.class, String.class, String.class, Bundle.class};
                    break;
                case "getSkuDetails":
                    cls2.getClass();
                    clsArr = new Class[]{cls2, String.class, String.class, Bundle.class};
                    break;
                default:
                    clsArr = null;
                    break;
            }
            Method methodN = clsArr == null ? sp0.n(cls, str, null) : sp0.n(cls, str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            if (methodN != null) {
                map.put(str, methodN);
            }
            return methodN;
        } catch (Throwable th) {
            mt.a(this, th);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0053  */
    public final ArrayList d(Context context, Object obj) {
        ArrayList arrayList;
        ArrayList<String> stringArrayList;
        ArrayList arrayList2 = null;
        if (mt.a.contains(this)) {
            return null;
        }
        try {
            ArrayList arrayList3 = new ArrayList();
            Context context2 = context;
            Object obj2 = obj;
            if (i(context2, obj2, "inapp")) {
                Object string = null;
                int i = 0;
                boolean z = false;
                while (true) {
                    Object objH = h(context2, "com.android.vending.billing.IInAppBillingService", "getPurchaseHistory", obj2, new Object[]{6, d, "inapp", string, new Bundle()});
                    if (objH != null) {
                        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
                        Bundle bundle = (Bundle) objH;
                        if (bundle.getInt("RESPONSE_CODE") != 0 || (stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST")) == null) {
                            arrayList = arrayList2;
                            string = arrayList;
                        } else {
                            int size = stringArrayList.size();
                            int i2 = 0;
                            while (true) {
                                if (i2 >= size) {
                                    arrayList = arrayList2;
                                    break;
                                }
                                String str = stringArrayList.get(i2);
                                i2++;
                                String str2 = str;
                                arrayList = arrayList2;
                                try {
                                    try {
                                        if (jCurrentTimeMillis - (new JSONObject(str2).getLong("purchaseTime") / 1000) > 1200) {
                                            z = true;
                                            break;
                                        }
                                        arrayList3.add(str2);
                                        i++;
                                    } catch (JSONException unused) {
                                    }
                                    arrayList2 = arrayList;
                                } catch (Throwable th) {
                                    th = th;
                                    mt.a(this, th);
                                    return arrayList;
                                }
                            }
                            string = bundle.getString("INAPP_CONTINUATION_TOKEN");
                        }
                    } else {
                        arrayList = arrayList2;
                        string = arrayList;
                    }
                    if (i >= 30 || string == null || z) {
                        break;
                    }
                    context2 = context;
                    obj2 = obj;
                    arrayList2 = arrayList;
                }
            }
            return arrayList3;
        } catch (Throwable th2) {
            th = th2;
            arrayList = arrayList2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0057  */
    public final ArrayList e(Context context, Object obj, String str) {
        np0 np0Var;
        if (mt.a.contains(this)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            if (obj != null && i(context, obj, str)) {
                int size = 0;
                String string = null;
                while (true) {
                    np0Var = this;
                    Context context2 = context;
                    Object obj2 = obj;
                    try {
                        Object objH = np0Var.h(context2, "com.android.vending.billing.IInAppBillingService", "getPurchases", obj2, new Object[]{3, d, str, string});
                        if (objH == null) {
                            string = null;
                            if (size >= 30) {
                                break;
                            }
                            break;
                            break;
                        }
                        Bundle bundle = (Bundle) objH;
                        if (bundle.getInt("RESPONSE_CODE") == 0) {
                            ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                            if (stringArrayList == null) {
                                break;
                            }
                            size += stringArrayList.size();
                            arrayList.addAll(stringArrayList);
                            string = bundle.getString("INAPP_CONTINUATION_TOKEN");
                        } else {
                            string = null;
                        }
                        if (size >= 30 || string == null) {
                            break;
                        }
                        this = np0Var;
                        context = context2;
                        obj = obj2;
                    } catch (Throwable th) {
                        th = th;
                        mt.a(np0Var, th);
                        return null;
                    }
                }
            }
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            np0Var = this;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 3 */
    public final LinkedHashMap g(Context context, ArrayList arrayList, Object obj, boolean z) {
        np0 np0Var;
        if (mt.a.contains(this)) {
            return null;
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (obj != null && !arrayList.isEmpty()) {
                Bundle bundle = new Bundle();
                bundle.putStringArrayList("ITEM_ID_LIST", arrayList);
                np0Var = this;
                try {
                    Object objH = np0Var.h(context, "com.android.vending.billing.IInAppBillingService", "getSkuDetails", obj, new Object[]{3, d, z ? "subs" : "inapp", bundle});
                    if (objH != null) {
                        Bundle bundle2 = (Bundle) objH;
                        if (bundle2.getInt("RESPONSE_CODE") == 0) {
                            ArrayList<String> stringArrayList = bundle2.getStringArrayList("DETAILS_LIST");
                            if (stringArrayList != null && arrayList.size() == stringArrayList.size()) {
                                int size = arrayList.size();
                                for (int i = 0; i < size; i++) {
                                    Object obj2 = arrayList.get(i);
                                    obj2.getClass();
                                    String str = stringArrayList.get(i);
                                    str.getClass();
                                    linkedHashMap.put(obj2, str);
                                }
                            }
                            np0Var.k(linkedHashMap);
                            return linkedHashMap;
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    mt.a(np0Var, th);
                    return null;
                }
            }
            return linkedHashMap;
        } catch (Throwable th2) {
            th = th2;
            np0Var = this;
            mt.a(np0Var, th);
            return null;
        }
    }

    public final Object h(Context context, String str, String str2, Object obj, Object[] objArr) {
        Method methodC;
        if (!mt.a.contains(this)) {
            try {
                Class clsB = b(context, str);
                if (clsB != null && (methodC = c(clsB, str2)) != null) {
                    return sp0.s(clsB, methodC, obj, Arrays.copyOf(objArr, objArr.length));
                }
            } catch (Throwable th) {
                mt.a(this, th);
                return null;
            }
        }
        return null;
    }

    public final boolean i(Context context, Object obj, String str) {
        np0 np0Var;
        if (!mt.a.contains(this) && obj != null) {
            try {
                np0Var = this;
                try {
                    Object objH = np0Var.h(context, "com.android.vending.billing.IInAppBillingService", "isBillingSupported", obj, new Object[]{3, d, str});
                    if (objH != null && ((Integer) objH).intValue() == 0) {
                        return true;
                    }
                } catch (Throwable th) {
                    th = th;
                    mt.a(np0Var, th);
                    return false;
                }
            } catch (Throwable th2) {
                th = th2;
                np0Var = this;
            }
        }
        return false;
    }

    public final LinkedHashMap j(ArrayList arrayList) {
        if (mt.a.contains(this)) {
            return null;
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                String str = (String) obj;
                String string = e.getString(str, null);
                if (string != null) {
                    List listB = StringsKt.B(string, new String[]{";"}, 2, 2);
                    if (jCurrentTimeMillis - Long.parseLong((String) listB.get(0)) < 43200) {
                        str.getClass();
                        linkedHashMap.put(str, listB.get(1));
                    } else {
                        continue;
                    }
                }
            }
            return linkedHashMap;
        } catch (Throwable th) {
            mt.a(this, th);
            return null;
        }
    }

    public final void k(LinkedHashMap linkedHashMap) {
        if (mt.a.contains(this)) {
            return;
        }
        try {
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            SharedPreferences.Editor editorEdit = e.edit();
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                editorEdit.putString((String) entry.getKey(), jCurrentTimeMillis + ';' + ((String) entry.getValue()));
            }
            editorEdit.apply();
        } catch (Throwable th) {
            mt.a(this, th);
        }
    }
}
