package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.internal.measurement.zzdb;
import com.google.android.gms.internal.measurement.zzdd;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class zw2 extends lb2 implements bx2 {
    @Override // defpackage.bx2
    public final void beginAdUnitExposure(String str, long j) {
        Parcel parcelF = F();
        parcelF.writeString(str);
        parcelF.writeLong(j);
        G(parcelF, 23);
    }

    @Override // defpackage.bx2
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        Parcel parcelF = F();
        parcelF.writeString(str);
        parcelF.writeString(str2);
        fv2.b(parcelF, bundle);
        G(parcelF, 9);
    }

    @Override // defpackage.bx2
    public final void endAdUnitExposure(String str, long j) {
        Parcel parcelF = F();
        parcelF.writeString(str);
        parcelF.writeLong(j);
        G(parcelF, 24);
    }

    @Override // defpackage.bx2
    public final void generateEventId(hx2 hx2Var) {
        Parcel parcelF = F();
        fv2.c(parcelF, hx2Var);
        G(parcelF, 22);
    }

    @Override // defpackage.bx2
    public final void getAppInstanceId(hx2 hx2Var) {
        Parcel parcelF = F();
        fv2.c(parcelF, hx2Var);
        G(parcelF, 20);
    }

    @Override // defpackage.bx2
    public final void getCachedAppInstanceId(hx2 hx2Var) {
        Parcel parcelF = F();
        fv2.c(parcelF, hx2Var);
        G(parcelF, 19);
    }

    @Override // defpackage.bx2
    public final void getConditionalUserProperties(String str, String str2, hx2 hx2Var) {
        Parcel parcelF = F();
        parcelF.writeString(str);
        parcelF.writeString(str2);
        fv2.c(parcelF, hx2Var);
        G(parcelF, 10);
    }

    @Override // defpackage.bx2
    public final void getCurrentScreenClass(hx2 hx2Var) {
        Parcel parcelF = F();
        fv2.c(parcelF, hx2Var);
        G(parcelF, 17);
    }

    @Override // defpackage.bx2
    public final void getCurrentScreenName(hx2 hx2Var) {
        Parcel parcelF = F();
        fv2.c(parcelF, hx2Var);
        G(parcelF, 16);
    }

    @Override // defpackage.bx2
    public final void getGmpAppId(hx2 hx2Var) {
        Parcel parcelF = F();
        fv2.c(parcelF, hx2Var);
        G(parcelF, 21);
    }

    @Override // defpackage.bx2
    public final void getMaxUserProperties(String str, hx2 hx2Var) {
        Parcel parcelF = F();
        parcelF.writeString(str);
        fv2.c(parcelF, hx2Var);
        G(parcelF, 6);
    }

    @Override // defpackage.bx2
    public final void getSessionId(hx2 hx2Var) {
        Parcel parcelF = F();
        fv2.c(parcelF, hx2Var);
        G(parcelF, 46);
    }

    @Override // defpackage.bx2
    public final void getUserProperties(String str, String str2, boolean z, hx2 hx2Var) {
        Parcel parcelF = F();
        parcelF.writeString(str);
        parcelF.writeString(str2);
        ClassLoader classLoader = fv2.a;
        parcelF.writeInt(z ? 1 : 0);
        fv2.c(parcelF, hx2Var);
        G(parcelF, 5);
    }

    @Override // defpackage.bx2
    public final void initialize(en0 en0Var, zzdb zzdbVar, long j) {
        Parcel parcelF = F();
        fv2.c(parcelF, en0Var);
        fv2.b(parcelF, zzdbVar);
        parcelF.writeLong(j);
        G(parcelF, 1);
    }

    @Override // defpackage.bx2
    public final void initializeWithElapsedTime(en0 en0Var, zzdb zzdbVar, long j, long j2) {
        Parcel parcelF = F();
        fv2.c(parcelF, en0Var);
        fv2.b(parcelF, zzdbVar);
        parcelF.writeLong(j);
        parcelF.writeLong(j2);
        G(parcelF, 60);
    }

    @Override // defpackage.bx2
    public final void logEventWithElapsedTime(String str, String str2, Bundle bundle, boolean z, boolean z2, long j, long j2) {
        Parcel parcelF = F();
        parcelF.writeString(str);
        parcelF.writeString(str2);
        fv2.b(parcelF, bundle);
        parcelF.writeInt(z ? 1 : 0);
        parcelF.writeInt(1);
        parcelF.writeLong(j);
        parcelF.writeLong(j2);
        G(parcelF, 59);
    }

    @Override // defpackage.bx2
    public final void logHealthData(int i, String str, en0 en0Var, en0 en0Var2, en0 en0Var3) {
        Parcel parcelF = F();
        parcelF.writeInt(5);
        parcelF.writeString(str);
        fv2.c(parcelF, en0Var);
        fv2.c(parcelF, en0Var2);
        fv2.c(parcelF, en0Var3);
        G(parcelF, 33);
    }

    @Override // defpackage.bx2
    public final void onActivityCreatedByScionActivityInfo(zzdd zzddVar, Bundle bundle, long j) {
        Parcel parcelF = F();
        fv2.b(parcelF, zzddVar);
        fv2.b(parcelF, bundle);
        parcelF.writeLong(j);
        G(parcelF, 53);
    }

    @Override // defpackage.bx2
    public final void onActivityDestroyedByScionActivityInfo(zzdd zzddVar, long j) {
        Parcel parcelF = F();
        fv2.b(parcelF, zzddVar);
        parcelF.writeLong(j);
        G(parcelF, 54);
    }

    @Override // defpackage.bx2
    public final void onActivityPausedByScionActivityInfo(zzdd zzddVar, long j) {
        Parcel parcelF = F();
        fv2.b(parcelF, zzddVar);
        parcelF.writeLong(j);
        G(parcelF, 55);
    }

    @Override // defpackage.bx2
    public final void onActivityResumedByScionActivityInfo(zzdd zzddVar, long j) {
        Parcel parcelF = F();
        fv2.b(parcelF, zzddVar);
        parcelF.writeLong(j);
        G(parcelF, 56);
    }

    @Override // defpackage.bx2
    public final void onActivitySaveInstanceStateByScionActivityInfo(zzdd zzddVar, hx2 hx2Var, long j) {
        Parcel parcelF = F();
        fv2.b(parcelF, zzddVar);
        fv2.c(parcelF, hx2Var);
        parcelF.writeLong(j);
        G(parcelF, 57);
    }

    @Override // defpackage.bx2
    public final void onActivityStartedByScionActivityInfo(zzdd zzddVar, long j) {
        Parcel parcelF = F();
        fv2.b(parcelF, zzddVar);
        parcelF.writeLong(j);
        G(parcelF, 51);
    }

    @Override // defpackage.bx2
    public final void onActivityStoppedByScionActivityInfo(zzdd zzddVar, long j) {
        Parcel parcelF = F();
        fv2.b(parcelF, zzddVar);
        parcelF.writeLong(j);
        G(parcelF, 52);
    }

    @Override // defpackage.bx2
    public final void resetAnalyticsData(long j) {
        Parcel parcelF = F();
        parcelF.writeLong(j);
        G(parcelF, 12);
    }

    @Override // defpackage.bx2
    public final void resetAnalyticsDataWithElapsedTime(long j, long j2) {
        Parcel parcelF = F();
        parcelF.writeLong(j);
        parcelF.writeLong(j2);
        G(parcelF, 61);
    }

    @Override // defpackage.bx2
    public final void retrieveAndUploadBatches(px2 px2Var) {
        Parcel parcelF = F();
        fv2.c(parcelF, px2Var);
        G(parcelF, 58);
    }

    @Override // defpackage.bx2
    public final void setConditionalUserProperty(Bundle bundle, long j) {
        Parcel parcelF = F();
        fv2.b(parcelF, bundle);
        parcelF.writeLong(j);
        G(parcelF, 8);
    }

    @Override // defpackage.bx2
    public final void setConsentThirdParty(Bundle bundle, long j) {
        Parcel parcelF = F();
        fv2.b(parcelF, bundle);
        parcelF.writeLong(j);
        G(parcelF, 45);
    }

    @Override // defpackage.bx2
    public final void setCurrentScreenByScionActivityInfo(zzdd zzddVar, String str, String str2, long j) {
        Parcel parcelF = F();
        fv2.b(parcelF, zzddVar);
        parcelF.writeString(str);
        parcelF.writeString(str2);
        parcelF.writeLong(j);
        G(parcelF, 50);
    }

    @Override // defpackage.bx2
    public final void setDataCollectionEnabled(boolean z) {
        throw null;
    }

    @Override // defpackage.bx2
    public final void setDefaultEventParameters(Bundle bundle) {
        Parcel parcelF = F();
        fv2.b(parcelF, bundle);
        G(parcelF, 42);
    }

    @Override // defpackage.bx2
    public final void setMeasurementEnabled(boolean z, long j) {
        Parcel parcelF = F();
        ClassLoader classLoader = fv2.a;
        parcelF.writeInt(z ? 1 : 0);
        parcelF.writeLong(j);
        G(parcelF, 11);
    }

    @Override // defpackage.bx2
    public final void setSessionTimeoutDuration(long j) {
        Parcel parcelF = F();
        parcelF.writeLong(j);
        G(parcelF, 14);
    }

    @Override // defpackage.bx2
    public final void setUserId(String str, long j) {
        Parcel parcelF = F();
        parcelF.writeString(str);
        parcelF.writeLong(j);
        G(parcelF, 7);
    }

    @Override // defpackage.bx2
    public final void setUserProperty(String str, String str2, en0 en0Var, boolean z, long j) {
        Parcel parcelF = F();
        parcelF.writeString(str);
        parcelF.writeString(str2);
        fv2.c(parcelF, en0Var);
        parcelF.writeInt(z ? 1 : 0);
        parcelF.writeLong(j);
        G(parcelF, 4);
    }
}
