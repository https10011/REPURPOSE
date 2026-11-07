package defpackage;

import android.os.Bundle;
import android.util.Log;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Currency;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.a;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class ie {
    public static final ox1 a = new ox1(i90.a());

    public static he a(String str, Bundle bundle, v91 v91Var, JSONObject jSONObject, JSONObject jSONObject2) {
        if (Intrinsics.areEqual(str, "subs")) {
            Map map = v91.b;
            String string = Boolean.toString(jSONObject.optBoolean("autoRenewing", false));
            string.getClass();
            zi0.a("fb_iap_subs_auto_renewing", string, bundle, v91Var);
            String strOptString = jSONObject2.optString("subscriptionPeriod");
            strOptString.getClass();
            zi0.a("fb_iap_subs_period", strOptString, bundle, v91Var);
            String strOptString2 = jSONObject2.optString("freeTrialPeriod");
            strOptString2.getClass();
            zi0.a("fb_free_trial_period", strOptString2, bundle, v91Var);
            String strOptString3 = jSONObject2.optString("introductoryPriceCycles");
            strOptString3.getClass();
            if (strOptString3.length() > 0) {
                zi0.a("fb_intro_price_cycles", strOptString3, bundle, v91Var);
            }
            String strOptString4 = jSONObject2.optString("introductoryPricePeriod");
            strOptString4.getClass();
            if (strOptString4.length() > 0) {
                zi0.a("fb_intro_period", strOptString4, bundle, v91Var);
            }
            String strOptString5 = jSONObject2.optString("introductoryPriceAmountMicros");
            strOptString5.getClass();
            if (strOptString5.length() > 0) {
                zi0.a("fb_intro_price_amount_micros", strOptString5, bundle, v91Var);
            }
        }
        BigDecimal bigDecimal = new BigDecimal(jSONObject2.getLong("price_amount_micros") / 1000000.0d);
        Currency currency = Currency.getInstance(jSONObject2.getString("price_currency_code"));
        currency.getClass();
        return new he(bigDecimal, currency, bundle, v91Var);
    }

    public static ArrayList b(String str, Bundle bundle, v91 v91Var, JSONObject jSONObject) throws JSONException {
        if (!Intrinsics.areEqual(str, "subs")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("oneTimePurchaseOfferDetails");
            if (jSONObject2 == null) {
                return null;
            }
            BigDecimal bigDecimal = new BigDecimal(jSONObject2.getLong("priceAmountMicros") / 1000000.0d);
            Currency currency = Currency.getInstance(jSONObject2.getString("priceCurrencyCode"));
            currency.getClass();
            return jo.e(new he(bigDecimal, currency, bundle, v91Var));
        }
        ArrayList arrayList = new ArrayList();
        String str2 = "subscriptionOfferDetails";
        JSONArray jSONArray = jSONObject.getJSONArray("subscriptionOfferDetails");
        if (jSONArray == null) {
            return null;
        }
        int length = jSONArray.length();
        int i = 0;
        while (i < length) {
            JSONObject jSONObject3 = jSONObject.getJSONArray(str2).getJSONObject(i);
            if (jSONObject3 == null) {
                return null;
            }
            Bundle bundle2 = new Bundle(bundle);
            v91 v91Var2 = new v91();
            LinkedHashMap linkedHashMap = v91Var.a;
            for (w91 w91Var : linkedHashMap.keySet()) {
                Map map = (Map) linkedHashMap.get(w91Var);
                if (map != null) {
                    for (String str3 : map.keySet()) {
                        String str4 = str2;
                        int i2 = length;
                        Object obj = map.get(str3);
                        if (obj != null) {
                            v91Var2.a(w91Var, str3, obj);
                        }
                        str2 = str4;
                        length = i2;
                    }
                }
            }
            String str5 = str2;
            int i3 = length;
            String string = jSONObject3.getString("basePlanId");
            Map map2 = v91.b;
            string.getClass();
            zi0.a("fb_iap_base_plan", string, bundle2, v91Var2);
            JSONArray jSONArray2 = jSONObject3.getJSONArray("pricingPhases");
            JSONObject jSONObject4 = jSONArray2.getJSONObject(jSONArray2.length() - 1);
            if (jSONObject4 == null) {
                return null;
            }
            String strOptString = jSONObject4.optString("billingPeriod");
            strOptString.getClass();
            zi0.a("fb_iap_subs_period", strOptString, bundle2, v91Var2);
            if (!jSONObject4.has("recurrenceMode") || jSONObject4.getInt("recurrenceMode") == 3) {
                zi0.a("fb_iap_subs_auto_renewing", "false", bundle2, v91Var2);
            } else {
                zi0.a("fb_iap_subs_auto_renewing", "true", bundle2, v91Var2);
            }
            BigDecimal bigDecimal2 = new BigDecimal(jSONObject4.getLong("priceAmountMicros") / 1000000.0d);
            Currency currency2 = Currency.getInstance(jSONObject4.getString("priceCurrencyCode"));
            currency2.getClass();
            arrayList.add(new he(bigDecimal2, currency2, bundle2, v91Var2));
            i++;
            str2 = str5;
            length = i3;
        }
        return arrayList;
    }

    public static final boolean c() {
        ja0 ja0VarB = ma0.b(i90.b());
        return ja0VarB != null && x32.c() && ja0VarB.f;
    }

    /* JADX WARN: Code duplicated, block: B:73:0x018c  */
    public static final void d(String str, String str2, boolean z, int i, boolean z2) {
        ArrayList arrayListE;
        String str3;
        String str4;
        String str5;
        str.getClass();
        str2.getClass();
        if (c()) {
            HashMap map = new HashMap();
            Bundle bundleC = null;
            try {
                JSONObject jSONObject = new JSONObject(str);
                JSONObject jSONObject2 = new JSONObject(str2);
                Bundle bundle = new Bundle(1);
                v91 v91Var = new v91();
                if (i != 0) {
                    if (i == 1) {
                        str5 = "none";
                    } else if (i == 2) {
                        str5 = "Android-GPBL-V1";
                    } else if (i == 3) {
                        str5 = "Android-GPBL-V2-V4";
                    } else {
                        if (i != 4) {
                            throw null;
                        }
                        str5 = "Android-GPBL-V5-V7";
                    }
                    zi0.a("fb_iap_sdk_supported_library_versions", str5, bundle, v91Var);
                }
                String string = jSONObject.getString("productId");
                string.getClass();
                zi0.a("fb_iap_product_id", string, bundle, v91Var);
                String string2 = jSONObject.getString("productId");
                string2.getClass();
                zi0.a("fb_content_id", string2, bundle, v91Var);
                zi0.a("android_dynamic_ads_content_id", "client_implicit", bundle, v91Var);
                String string3 = jSONObject.getString("purchaseTime");
                string3.getClass();
                zi0.a("fb_iap_purchase_time", string3, bundle, v91Var);
                String string4 = jSONObject.getString("purchaseToken");
                string4.getClass();
                zi0.a("fb_iap_purchase_token", string4, bundle, v91Var);
                String strOptString = jSONObject.optString("packageName");
                strOptString.getClass();
                zi0.a("fb_iap_package_name", strOptString, bundle, v91Var);
                String strOptString2 = jSONObject2.optString("title");
                strOptString2.getClass();
                zi0.a("fb_iap_product_title", strOptString2, bundle, v91Var);
                String strOptString3 = jSONObject2.optString("description");
                strOptString3.getClass();
                zi0.a("fb_iap_product_description", strOptString3, bundle, v91Var);
                String strOptString4 = jSONObject2.optString("type");
                strOptString4.getClass();
                zi0.a("fb_iap_product_type", strOptString4, bundle, v91Var);
                pp0 pp0Var = pp0.a;
                if (mt.a.contains(pp0.class)) {
                    str4 = null;
                } else {
                    try {
                        str4 = pp0.d;
                    } catch (Throwable th) {
                        mt.a(pp0.class, th);
                        str4 = null;
                    }
                }
                if (str4 != null) {
                    Map map2 = v91.b;
                    zi0.a("fb_iap_client_library_version", str4, bundle, v91Var);
                }
                for (Map.Entry entry : map.entrySet()) {
                    String str6 = (String) entry.getKey();
                    String str7 = (String) entry.getValue();
                    Map map3 = v91.b;
                    zi0.a(str6, str7, bundle, v91Var);
                }
                arrayListE = jSONObject2.has("price_amount_micros") ? jo.e(a(strOptString4, bundle, v91Var, jSONObject, jSONObject2)) : (jSONObject2.has("subscriptionOfferDetails") || jSONObject2.has("oneTimePurchaseOfferDetails")) ? b(strOptString4, bundle, v91Var, jSONObject2) : null;
            } catch (JSONException e) {
                Log.e("ie", "Error parsing in-app purchase/subscription data.", e);
            } catch (Exception e2) {
                Log.e("ie", "Failed to get purchase logging parameters,", e2);
            }
            if (arrayListE == null || arrayListE.isEmpty()) {
                return;
            }
            if (!z || !ha0.b("app_events_if_auto_log_subs", i90.b(), false)) {
                str3 = z2 ? "fb_mobile_purchase_restored" : "fb_mobile_purchase";
            } else if (z2) {
                str3 = "SubscriptionRestore";
            } else {
                np0 np0Var = np0.a;
                if (mt.a.contains(np0Var)) {
                    str3 = "Subscribe";
                } else {
                    try {
                        String strOptString5 = new JSONObject(str2).optString("freeTrialPeriod");
                        if (strOptString5 == null || strOptString5.length() <= 0) {
                            str3 = "Subscribe";
                        } else {
                            str3 = "StartTrial";
                        }
                    } catch (JSONException unused) {
                    } catch (Throwable th2) {
                        mt.a(np0Var, th2);
                    }
                }
            }
            String str8 = str3;
            if (z && fa0.b(da0.AndroidManualImplicitSubsDedupe)) {
                synchronized (ie.class) {
                    try {
                        ArrayList arrayList = new ArrayList();
                        int size = arrayListE.size();
                        int i2 = 0;
                        while (i2 < size) {
                            Object obj = arrayListE.get(i2);
                            i2++;
                            he heVar = (he) obj;
                            arrayList.add(new ap0(str8, heVar.a.doubleValue(), heVar.b));
                        }
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        ArrayList arrayList2 = new ArrayList(ko.h(arrayListE));
                        int size2 = arrayListE.size();
                        int i3 = 0;
                        while (i3 < size2) {
                            Object obj2 = arrayListE.get(i3);
                            i3++;
                            he heVar2 = (he) obj2;
                            arrayList2.add(new Pair(heVar2.c, heVar2.d));
                        }
                        bundleC = pp0.c(arrayList, jCurrentTimeMillis, true, arrayList2);
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            } else if (!z && fa0.b(da0.AndroidManualImplicitPurchaseDedupe)) {
                synchronized (ie.class) {
                    he heVar3 = (he) arrayListE.get(0);
                    bundleC = pp0.c(a.a(new ap0("fb_mobile_purchase", heVar3.a.doubleValue(), heVar3.b)), System.currentTimeMillis(), true, a.a(new Pair(heVar3.c, heVar3.d)));
                }
            }
            List list = mp0.a;
            mp0.a(bundleC, ((he) arrayListE.get(0)).c, ((he) arrayListE.get(0)).d);
            if (Intrinsics.areEqual(str8, "fb_mobile_purchase")) {
                ox1 ox1Var = a;
                BigDecimal bigDecimal = ((he) arrayListE.get(0)).a;
                Currency currency = ((he) arrayListE.get(0)).b;
                Bundle bundle2 = ((he) arrayListE.get(0)).c;
                v91 v91Var2 = ((he) arrayListE.get(0)).d;
                ox1Var.getClass();
                i90 i90Var = i90.a;
                if (x32.c()) {
                    pa paVar = (pa) ox1Var.a;
                    paVar.getClass();
                    if (mt.a.contains(paVar)) {
                        return;
                    }
                    try {
                        paVar.h(bigDecimal, currency, bundle2, v91Var2);
                        return;
                    } catch (Throwable th4) {
                        mt.a(paVar, th4);
                        return;
                    }
                }
                return;
            }
            ox1 ox1Var2 = a;
            BigDecimal bigDecimal2 = ((he) arrayListE.get(0)).a;
            Currency currency2 = ((he) arrayListE.get(0)).b;
            Bundle bundle3 = ((he) arrayListE.get(0)).c;
            v91 v91Var3 = ((he) arrayListE.get(0)).d;
            ox1Var2.getClass();
            i90 i90Var2 = i90.a;
            if (x32.c()) {
                pa paVar2 = (pa) ox1Var2.a;
                paVar2.getClass();
                if (mt.a.contains(paVar2) || currency2 == null) {
                    return;
                }
                try {
                    bundle3.putString("fb_currency", currency2.getCurrencyCode());
                    paVar2.e(str8, Double.valueOf(bigDecimal2.doubleValue()), bundle3, true, e5.b(), v91Var3);
                } catch (Throwable th5) {
                    mt.a(paVar2, th5);
                }
            }
        }
    }
}
