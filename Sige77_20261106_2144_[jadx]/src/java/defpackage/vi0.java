package defpackage;

import android.adservices.common.AdData;
import android.adservices.customaudience.CustomAudience;
import android.adservices.customaudience.JoinCustomAudienceRequest;
import android.adservices.customaudience.TrustedBiddingData;
import android.adservices.measurement.MeasurementManager;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public abstract /* synthetic */ class vi0 {
    public static /* synthetic */ AdData.Builder b() {
        return new AdData.Builder();
    }

    public static /* synthetic */ CustomAudience.Builder g() {
        return new CustomAudience.Builder();
    }

    public static /* synthetic */ JoinCustomAudienceRequest.Builder l() {
        return new JoinCustomAudienceRequest.Builder();
    }

    public static /* synthetic */ TrustedBiddingData.Builder m() {
        return new TrustedBiddingData.Builder();
    }

    public static /* bridge */ /* synthetic */ MeasurementManager r(Object obj) {
        return (MeasurementManager) obj;
    }

    public static /* bridge */ /* synthetic */ Class s() {
        return MeasurementManager.class;
    }

    public static /* synthetic */ void t() {
    }
}
