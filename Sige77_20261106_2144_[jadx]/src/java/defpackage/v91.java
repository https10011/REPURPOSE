package defpackage;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class v91 {
    public static final Map b = v11.b(new Pair(w91.a, new Pair(wb.p(new String[]{"fb_iap_package_name", "fb_iap_subs_auto_renewing", "fb_free_trial_period", "fb_intro_price_amount_micros", "fb_intro_price_cycles", "fb_iap_base_plan", "is_implicit_purchase_logging_enabled", "fb_iap_sdk_supported_library_versions", "is_autolog_app_events_enabled", "fb_iap_client_library_version", "fb_iap_subs_period", "fb_iap_purchase_token", "fb_iap_non_deduped_event_time", "fb_iap_actual_dedup_result", "fb_iap_actual_dedup_key_used", "fb_iap_test_dedup_result", "fb_iap_test_dedup_key_used"}), wb.p(new String[]{"fb_iap_product_id", "fb_iap_product_type", "fb_iap_purchase_time"}))));
    public final LinkedHashMap a = new LinkedHashMap();

    public final void a(w91 w91Var, String str, Object obj) {
        LinkedHashMap linkedHashMap = this.a;
        w91Var.getClass();
        str.getClass();
        obj.getClass();
        try {
            HashSet hashSet = z9.f;
            x9.a(str);
            if (!(obj instanceof String) && !(obj instanceof Number)) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                throw new d90(String.format("Parameter value '%s' for key '%s' should be a string or a numeric type.", Arrays.copyOf(new Object[]{obj, str}, 2)));
            }
            if (!linkedHashMap.containsKey(w91Var)) {
                linkedHashMap.put(w91Var, new LinkedHashMap());
            }
            Map map = (Map) linkedHashMap.get(w91Var);
            if (map != null) {
                map.put(str, obj);
            }
        } catch (Exception unused) {
        }
    }
}
