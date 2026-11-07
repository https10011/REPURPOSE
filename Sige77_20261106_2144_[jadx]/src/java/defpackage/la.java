package defpackage;

import java.util.ArrayList;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class la {
    public static final Map a = w11.d(new Pair(fa.ANON_ID, new ka(1, 1)), new Pair(fa.APP_USER_ID, new ka(1, 2)), new Pair(fa.ADVERTISER_ID, new ka(1, 3)), new Pair(fa.PAGE_ID, new ka(1, 4)), new Pair(fa.PAGE_SCOPED_USER_ID, new ka(1, 5)), new Pair(fa.ADV_TE, new ka(2, 7)), new Pair(fa.APP_TE, new ka(2, 8)), new Pair(fa.CONSIDER_VIEWS, new ka(2, 9)), new Pair(fa.DEVICE_TOKEN, new ka(2, 10)), new Pair(fa.EXT_INFO, new ka(2, 11)), new Pair(fa.INCLUDE_DWELL_DATA, new ka(2, 12)), new Pair(fa.INCLUDE_VIDEO_DATA, new ka(2, 13)), new Pair(fa.INSTALL_REFERRER, new ka(2, 14)), new Pair(fa.INSTALLER_PACKAGE, new ka(2, 15)), new Pair(fa.RECEIPT_DATA, new ka(2, 16)), new Pair(fa.URL_SCHEMES, new ka(2, 17)), new Pair(fa.USER_DATA, new ka(1, 0)));
    public static final Map b = w11.d(new Pair(fv.EVENT_TIME, new ja(0, 2)), new Pair(fv.EVENT_NAME, new ja(0, 3)), new Pair(fv.VALUE_TO_SUM, new ja(3, 1)), new Pair(fv.CONTENT_IDS, new ja(3, 4)), new Pair(fv.CONTENTS, new ja(3, 5)), new Pair(fv.CONTENT_TYPE, new ja(3, 6)), new Pair(fv.CURRENCY, new ja(3, 17)), new Pair(fv.DESCRIPTION, new ja(3, 7)), new Pair(fv.LEVEL, new ja(3, 8)), new Pair(fv.MAX_RATING_VALUE, new ja(3, 9)), new Pair(fv.NUM_ITEMS, new ja(3, 10)), new Pair(fv.PAYMENT_INFO_AVAILABLE, new ja(3, 11)), new Pair(fv.REGISTRATION_METHOD, new ja(3, 12)), new Pair(fv.SEARCH_STRING, new ja(3, 13)), new Pair(fv.SUCCESS, new ja(3, 14)), new Pair(fv.ORDER_ID, new ja(3, 15)), new Pair(fv.AD_TYPE, new ja(3, 16)));
    public static final Map c = w11.d(new Pair("fb_mobile_achievement_unlocked", js.UNLOCKED_ACHIEVEMENT), new Pair("fb_mobile_activate_app", js.ACTIVATED_APP), new Pair("fb_mobile_add_payment_info", js.ADDED_PAYMENT_INFO), new Pair("fb_mobile_add_to_cart", js.ADDED_TO_CART), new Pair("fb_mobile_add_to_wishlist", js.ADDED_TO_WISHLIST), new Pair("fb_mobile_complete_registration", js.COMPLETED_REGISTRATION), new Pair("fb_mobile_content_view", js.VIEWED_CONTENT), new Pair("fb_mobile_initiated_checkout", js.INITIATED_CHECKOUT), new Pair("fb_mobile_level_achieved", js.ACHIEVED_LEVEL), new Pair("fb_mobile_purchase", js.PURCHASED), new Pair("fb_mobile_rate", js.RATED), new Pair("fb_mobile_search", js.SEARCHED), new Pair("fb_mobile_spent_credits", js.SPENT_CREDITS), new Pair("fb_mobile_tutorial_completion", js.COMPLETED_TUTORIAL));

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.util.HashMap] */
    public static final Object a(Object obj, String str) {
        int i;
        obj.getClass();
        int i2 = 0;
        if (Intrinsics.areEqual(str, "extInfo") || Intrinsics.areEqual(str, "url_schemes") || Intrinsics.areEqual(str, "fb_content_id") || Intrinsics.areEqual(str, "fb_content") || Intrinsics.areEqual(str, "data_processing_options")) {
            i = 1;
        } else if (Intrinsics.areEqual(str, "advertiser_tracking_enabled") || Intrinsics.areEqual(str, "application_tracking_enabled")) {
            i = 2;
        } else {
            i = Intrinsics.areEqual(str, "_logTime") ? 3 : 0;
        }
        String str2 = obj instanceof String ? (String) obj : null;
        if (i == 0 || str2 == null) {
            return obj;
        }
        int iV = ts.v(i);
        if (iV != 0) {
            if (iV != 1) {
                if (iV == 2) {
                    return StringsKt.toIntOrNull(obj.toString());
                }
                throw new e71();
            }
            Integer intOrNull = StringsKt.toIntOrNull(str2.toString());
            if (intOrNull != null) {
                return Boolean.valueOf(intOrNull.intValue() != 0);
            }
            return null;
        }
        try {
            ArrayList arrayListF = h42.f(new JSONArray(str2));
            ArrayList arrayList = new ArrayList();
            int size = arrayListF.size();
            while (i2 < size) {
                Object obj2 = arrayListF.get(i2);
                i2++;
                ?? F = (String) obj2;
                try {
                    try {
                        F = h42.g(new JSONObject((String) F));
                    } catch (JSONException unused) {
                        F = h42.f(new JSONArray((String) F));
                    }
                } catch (JSONException unused2) {
                }
                arrayList.add(F);
            }
            return arrayList;
        } catch (JSONException unused3) {
            gp1 gp1Var = i01.c;
            synchronized (i90.b) {
                return Unit.a;
            }
        }
    }
}
