package defpackage;

import android.adservices.common.AdData;
import android.adservices.common.AdSelectionSignals;
import android.adservices.common.AdTechIdentifier;
import android.adservices.customaudience.CustomAudience;
import android.adservices.customaudience.CustomAudienceManager;
import android.adservices.customaudience.JoinCustomAudienceRequest;
import android.adservices.customaudience.TrustedBiddingData;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import com.hjq.toast.BuildConfig;
import java.util.concurrent.Executors;
import kotlin.Unit;
import kotlin.collections.a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class ia1 {
    public static final ia1 a = new ia1();
    public static final String b = "Fledge: ".concat(ia1.class.getSimpleName());
    public static boolean c;
    public static boolean d;
    public static CustomAudienceManager e;
    public static fk0 f;
    public static String g;

    public static final void a() {
        String string;
        if (mt.a.contains(ia1.class)) {
            return;
        }
        try {
            d = true;
            Context contextA = i90.a();
            f = new fk0(contextA);
            g = "https://www." + i90.s + "/privacy_sandbox/pa/logic";
            fk0 fk0Var = null;
            try {
                CustomAudienceManager customAudienceManager = CustomAudienceManager.get(contextA);
                e = customAudienceManager;
                if (customAudienceManager != null) {
                    c = true;
                }
                string = null;
            } catch (Error e2) {
                string = e2.toString();
                Log.w(b, "Failed to get CustomAudienceManager: " + e2);
            } catch (Exception e3) {
                string = e3.toString();
                Log.w(b, "Failed to get CustomAudienceManager: " + e3);
            }
            if (c) {
                return;
            }
            fk0 fk0Var2 = f;
            if (fk0Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("gpsDebugLogger");
            } else {
                fk0Var = fk0Var2;
            }
            Bundle bundle = new Bundle();
            bundle.putString("gps_pa_failed_reason", string);
            Unit unit = Unit.a;
            fk0Var.a("gps_pa_failed", bundle);
        } catch (Throwable th) {
            mt.a(ia1.class, th);
        }
    }

    public final void b(String str, String str2) {
        String str3 = b;
        if (mt.a.contains(this)) {
            return;
        }
        try {
            String strC = c(str, str2);
            if (strC == null) {
                return;
            }
            fk0 fk0Var = null;
            try {
                dk0 dk0Var = new dk0(1);
                vi0.t();
                AdData.Builder builderB = vi0.b();
                StringBuilder sb = new StringBuilder();
                String str4 = g;
                if (str4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("baseUri");
                    str4 = null;
                }
                sb.append(str4);
                sb.append("/ad");
                Uri uri = Uri.parse(sb.toString());
                uri.getClass();
                AdData adDataBuild = builderB.setRenderUri(uri).setMetadata("{'isRealAd': false}").build();
                adDataBuild.getClass();
                ha1.m();
                TrustedBiddingData.Builder builderM = vi0.m();
                StringBuilder sb2 = new StringBuilder();
                String str5 = g;
                if (str5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("baseUri");
                    str5 = null;
                }
                sb2.append(str5);
                sb2.append("?trusted_bidding");
                Uri uri2 = Uri.parse(sb2.toString());
                uri2.getClass();
                TrustedBiddingData trustedBiddingDataBuild = builderM.setTrustedBiddingUri(uri2).setTrustedBiddingKeys(a.a(BuildConfig.FLAVOR)).build();
                trustedBiddingDataBuild.getClass();
                ha1.o();
                CustomAudience.Builder buyer = vi0.g().setName(strC).setBuyer(AdTechIdentifier.fromString("facebook.com"));
                StringBuilder sb3 = new StringBuilder();
                String str6 = g;
                if (str6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("baseUri");
                    str6 = null;
                }
                sb3.append(str6);
                sb3.append("?daily&app_id=");
                sb3.append(str);
                Uri uri3 = Uri.parse(sb3.toString());
                uri3.getClass();
                CustomAudience.Builder dailyUpdateUri = buyer.setDailyUpdateUri(uri3);
                StringBuilder sb4 = new StringBuilder();
                String str7 = g;
                if (str7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("baseUri");
                    str7 = null;
                }
                sb4.append(str7);
                sb4.append("?bidding");
                Uri uri4 = Uri.parse(sb4.toString());
                uri4.getClass();
                CustomAudience customAudienceBuild = dailyUpdateUri.setBiddingLogicUri(uri4).setTrustedBiddingData(trustedBiddingDataBuild).setUserBiddingSignals(AdSelectionSignals.fromString("{}")).setAds(a.a(adDataBuild)).build();
                customAudienceBuild.getClass();
                ha1.p();
                JoinCustomAudienceRequest joinCustomAudienceRequestBuild = vi0.l().setCustomAudience(customAudienceBuild).build();
                joinCustomAudienceRequestBuild.getClass();
                CustomAudienceManager customAudienceManager = e;
                if (customAudienceManager != null) {
                    customAudienceManager.joinCustomAudience(joinCustomAudienceRequestBuild, Executors.newSingleThreadExecutor(), dk0Var);
                }
            } catch (Error e2) {
                Log.w(str3, "Failed to join Custom Audience: " + e2);
                fk0 fk0Var2 = f;
                if (fk0Var2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("gpsDebugLogger");
                } else {
                    fk0Var = fk0Var2;
                }
                Bundle bundle = new Bundle();
                bundle.putString("gps_pa_failed_reason", e2.toString());
                Unit unit = Unit.a;
                fk0Var.a("gps_pa_failed", bundle);
            } catch (Exception e3) {
                Log.w(str3, "Failed to join Custom Audience: " + e3);
                fk0 fk0Var3 = f;
                if (fk0Var3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("gpsDebugLogger");
                } else {
                    fk0Var = fk0Var3;
                }
                Bundle bundle2 = new Bundle();
                bundle2.putString("gps_pa_failed_reason", e3.toString());
                Unit unit2 = Unit.a;
                fk0Var.a("gps_pa_failed", bundle2);
            }
        } catch (Throwable th) {
            mt.a(this, th);
        }
    }

    public final String c(String str, String str2) {
        if (!mt.a.contains(this) && str2 != null) {
            try {
                if (!Intrinsics.areEqual(str2, "_removed_") && !StringsKt.t(str2, "gps")) {
                    return str + '@' + str2 + '@' + (System.currentTimeMillis() / 1000) + "@1";
                }
            } catch (Throwable th) {
                mt.a(this, th);
                return null;
            }
        }
        return null;
    }
}
