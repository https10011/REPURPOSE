package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.internal.measurement.zzdb;
import com.google.android.gms.internal.measurement.zzdd;
import java.util.Map;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public interface bx2 extends IInterface {
    void beginAdUnitExposure(String str, long j);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    void clearMeasurementEnabled(long j);

    void endAdUnitExposure(String str, long j);

    void generateEventId(hx2 hx2Var);

    void getAppInstanceId(hx2 hx2Var);

    void getCachedAppInstanceId(hx2 hx2Var);

    void getConditionalUserProperties(String str, String str2, hx2 hx2Var);

    void getCurrentScreenClass(hx2 hx2Var);

    void getCurrentScreenName(hx2 hx2Var);

    void getGmpAppId(hx2 hx2Var);

    void getMaxUserProperties(String str, hx2 hx2Var);

    void getSessionId(hx2 hx2Var);

    void getTestFlag(hx2 hx2Var, int i);

    void getUserProperties(String str, String str2, boolean z, hx2 hx2Var);

    void initForTests(Map map);

    void initialize(en0 en0Var, zzdb zzdbVar, long j);

    void initializeWithElapsedTime(en0 en0Var, zzdb zzdbVar, long j, long j2);

    void isDataCollectionEnabled(hx2 hx2Var);

    void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j);

    void logEventAndBundle(String str, String str2, Bundle bundle, hx2 hx2Var, long j);

    void logEventWithElapsedTime(String str, String str2, Bundle bundle, boolean z, boolean z2, long j, long j2);

    void logHealthData(int i, String str, en0 en0Var, en0 en0Var2, en0 en0Var3);

    void onActivityCreated(en0 en0Var, Bundle bundle, long j);

    void onActivityCreatedByScionActivityInfo(zzdd zzddVar, Bundle bundle, long j);

    void onActivityDestroyed(en0 en0Var, long j);

    void onActivityDestroyedByScionActivityInfo(zzdd zzddVar, long j);

    void onActivityPaused(en0 en0Var, long j);

    void onActivityPausedByScionActivityInfo(zzdd zzddVar, long j);

    void onActivityResumed(en0 en0Var, long j);

    void onActivityResumedByScionActivityInfo(zzdd zzddVar, long j);

    void onActivitySaveInstanceState(en0 en0Var, hx2 hx2Var, long j);

    void onActivitySaveInstanceStateByScionActivityInfo(zzdd zzddVar, hx2 hx2Var, long j);

    void onActivityStarted(en0 en0Var, long j);

    void onActivityStartedByScionActivityInfo(zzdd zzddVar, long j);

    void onActivityStopped(en0 en0Var, long j);

    void onActivityStoppedByScionActivityInfo(zzdd zzddVar, long j);

    void performAction(Bundle bundle, hx2 hx2Var, long j);

    void registerOnMeasurementEventListener(ux2 ux2Var);

    void resetAnalyticsData(long j);

    void resetAnalyticsDataWithElapsedTime(long j, long j2);

    void retrieveAndUploadBatches(px2 px2Var);

    void setConditionalUserProperty(Bundle bundle, long j);

    void setConsent(Bundle bundle, long j);

    void setConsentThirdParty(Bundle bundle, long j);

    void setCurrentScreen(en0 en0Var, String str, String str2, long j);

    void setCurrentScreenByScionActivityInfo(zzdd zzddVar, String str, String str2, long j);

    void setDataCollectionEnabled(boolean z);

    void setDefaultEventParameters(Bundle bundle);

    void setEventInterceptor(ux2 ux2Var);

    void setInstanceIdProvider(fy2 fy2Var);

    void setMeasurementEnabled(boolean z, long j);

    void setMinimumSessionDuration(long j);

    void setSessionTimeoutDuration(long j);

    void setSgtmDebugInfo(Intent intent);

    void setUserId(String str, long j);

    void setUserProperty(String str, String str2, en0 en0Var, boolean z, long j);

    void unregisterOnMeasurementEventListener(ux2 ux2Var);
}
