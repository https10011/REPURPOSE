package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class cp0 {
    public static final AtomicBoolean a = new AtomicBoolean(false);
    public static Boolean b;
    public static Boolean c;
    public static bp0 d;
    public static d5 e;
    public static Intent f;
    public static Object g;
    public static int h;

    public static final void a(Context context, ArrayList arrayList, boolean z) {
        if (arrayList.isEmpty()) {
            return;
        }
        HashMap map = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            String str = (String) obj;
            try {
                String string = new JSONObject(str).getString("productId");
                string.getClass();
                str.getClass();
                map.put(string, str);
                arrayList2.add(string);
            } catch (JSONException e2) {
                Log.e("cp0", "Error parsing in-app purchase data.", e2);
            }
        }
        Object obj2 = g;
        np0 np0Var = np0.a;
        LinkedHashMap linkedHashMap = null;
        if (!mt.a.contains(np0.class)) {
            try {
                context.getClass();
                LinkedHashMap linkedHashMapJ = np0Var.j(arrayList2);
                ArrayList arrayList3 = new ArrayList();
                int size2 = arrayList2.size();
                int i2 = 0;
                while (i2 < size2) {
                    Object obj3 = arrayList2.get(i2);
                    i2++;
                    String str2 = (String) obj3;
                    if (!linkedHashMapJ.containsKey(str2)) {
                        arrayList3.add(str2);
                    }
                }
                linkedHashMapJ.putAll(np0Var.g(context, arrayList3, obj2, z));
                linkedHashMap = linkedHashMapJ;
            } catch (Throwable th) {
                mt.a(np0.class, th);
            }
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str3 = (String) entry.getKey();
            String str4 = (String) entry.getValue();
            String str5 = (String) map.get(str3);
            if (str5 != null) {
                ie.d(str5, str4, z, h, false);
            }
        }
    }

    public static final void b(int i) {
        bp0 bp0Var = null;
        if (i == 0) {
            throw null;
        }
        if (b == null) {
            Boolean boolValueOf = Boolean.valueOf(sp0.j("com.android.vending.billing.IInAppBillingService$Stub") != null);
            b = boolValueOf;
            if (!Intrinsics.areEqual(boolValueOf, Boolean.FALSE)) {
                c = Boolean.valueOf(sp0.j("com.android.billingclient.api.ProxyBillingActivity") != null);
                np0 np0Var = np0.a;
                if (!mt.a.contains(np0.class)) {
                    try {
                        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
                        SharedPreferences sharedPreferences = np0.e;
                        long j = sharedPreferences.getLong("LAST_CLEARED_TIME", 0L);
                        if (j == 0) {
                            sharedPreferences.edit().putLong("LAST_CLEARED_TIME", jCurrentTimeMillis).apply();
                        } else if (jCurrentTimeMillis - j > 604800) {
                            sharedPreferences.edit().clear().putLong("LAST_CLEARED_TIME", jCurrentTimeMillis).apply();
                        }
                    } catch (Throwable th) {
                        mt.a(np0.class, th);
                    }
                }
                Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND").setPackage("com.android.vending");
                intent.getClass();
                f = intent;
                d = new bp0();
                e = new d5(4);
            }
        }
        if (!Intrinsics.areEqual(b, Boolean.FALSE) && ie.c()) {
            h = i;
            if (a.compareAndSet(false, true)) {
                Context contextA = i90.a();
                if (contextA instanceof Application) {
                    Application application = (Application) contextA;
                    d5 d5Var = e;
                    if (d5Var == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("callbacks");
                        d5Var = null;
                    }
                    application.registerActivityLifecycleCallbacks(d5Var);
                    Intent intent2 = f;
                    if (intent2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("intent");
                        intent2 = null;
                    }
                    bp0 bp0Var2 = d;
                    if (bp0Var2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("serviceConnection");
                    } else {
                        bp0Var = bp0Var2;
                    }
                    contextA.bindService(intent2, bp0Var, 1);
                }
            }
        }
    }
}
