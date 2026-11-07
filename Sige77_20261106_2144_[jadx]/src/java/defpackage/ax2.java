package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.measurement.zzdb;
import com.google.android.gms.internal.measurement.zzdd;
import java.util.HashMap;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class ax2 extends dv2 implements bx2 {
    public static bx2 asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        return iInterfaceQueryLocalInterface instanceof bx2 ? (bx2) iInterfaceQueryLocalInterface : new zw2(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService", 4);
    }

    @Override // defpackage.dv2
    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        boolean z = false;
        hx2 ex2Var = null;
        px2 kx2Var = null;
        hx2 ex2Var2 = null;
        hx2 ex2Var3 = null;
        hx2 ex2Var4 = null;
        hx2 ex2Var5 = null;
        ux2 rx2Var = null;
        ux2 rx2Var2 = null;
        ux2 rx2Var3 = null;
        hx2 ex2Var6 = null;
        hx2 ex2Var7 = null;
        hx2 ex2Var8 = null;
        hx2 ex2Var9 = null;
        hx2 ex2Var10 = null;
        hx2 ex2Var11 = null;
        fy2 vx2Var = null;
        hx2 ex2Var12 = null;
        hx2 ex2Var13 = null;
        hx2 ex2Var14 = null;
        hx2 ex2Var15 = null;
        hx2 ex2Var16 = null;
        switch (i) {
            case 1:
                en0 en0VarH = e81.H(parcel.readStrongBinder());
                zzdb zzdbVar = (zzdb) fv2.a(parcel, zzdb.CREATOR);
                long j = parcel.readLong();
                fv2.d(parcel);
                initialize(en0VarH, zzdbVar, j);
                break;
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                String string = parcel.readString();
                String string2 = parcel.readString();
                Bundle bundle = (Bundle) fv2.a(parcel, Bundle.CREATOR);
                boolean z2 = parcel.readInt() != 0;
                boolean z3 = parcel.readInt() != 0;
                long j2 = parcel.readLong();
                fv2.d(parcel);
                logEvent(string, string2, bundle, z2, z3, j2);
                break;
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                Bundle bundle2 = (Bundle) fv2.a(parcel, Bundle.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    ex2Var = iInterfaceQueryLocalInterface instanceof hx2 ? (hx2) iInterfaceQueryLocalInterface : new ex2(strongBinder);
                }
                hx2 hx2Var = ex2Var;
                long j3 = parcel.readLong();
                fv2.d(parcel);
                logEventAndBundle(string3, string4, bundle2, hx2Var, j3);
                break;
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                en0 en0VarH2 = e81.H(parcel.readStrongBinder());
                ClassLoader classLoader = fv2.a;
                boolean z4 = parcel.readInt() != 0;
                long j4 = parcel.readLong();
                fv2.d(parcel);
                setUserProperty(string5, string6, en0VarH2, z4, j4);
                break;
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                ClassLoader classLoader2 = fv2.a;
                boolean z5 = parcel.readInt() != 0;
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    ex2Var16 = iInterfaceQueryLocalInterface2 instanceof hx2 ? (hx2) iInterfaceQueryLocalInterface2 : new ex2(strongBinder2);
                }
                fv2.d(parcel);
                getUserProperties(string7, string8, z5, ex2Var16);
                break;
            case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                String string9 = parcel.readString();
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    ex2Var15 = iInterfaceQueryLocalInterface3 instanceof hx2 ? (hx2) iInterfaceQueryLocalInterface3 : new ex2(strongBinder3);
                }
                fv2.d(parcel);
                getMaxUserProperties(string9, ex2Var15);
                break;
            case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                String string10 = parcel.readString();
                long j5 = parcel.readLong();
                fv2.d(parcel);
                setUserId(string10, j5);
                break;
            case oc1.BYTES_FIELD_NUMBER /* 8 */:
                Bundle bundle3 = (Bundle) fv2.a(parcel, Bundle.CREATOR);
                long j6 = parcel.readLong();
                fv2.d(parcel);
                setConditionalUserProperty(bundle3, j6);
                break;
            case 9:
                String string11 = parcel.readString();
                String string12 = parcel.readString();
                Bundle bundle4 = (Bundle) fv2.a(parcel, Bundle.CREATOR);
                fv2.d(parcel);
                clearConditionalUserProperty(string11, string12, bundle4);
                break;
            case 10:
                String string13 = parcel.readString();
                String string14 = parcel.readString();
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    ex2Var14 = iInterfaceQueryLocalInterface4 instanceof hx2 ? (hx2) iInterfaceQueryLocalInterface4 : new ex2(strongBinder4);
                }
                fv2.d(parcel);
                getConditionalUserProperties(string13, string14, ex2Var14);
                break;
            case 11:
                ClassLoader classLoader3 = fv2.a;
                boolean z6 = parcel.readInt() != 0;
                long j7 = parcel.readLong();
                fv2.d(parcel);
                setMeasurementEnabled(z6, j7);
                break;
            case 12:
                long j8 = parcel.readLong();
                fv2.d(parcel);
                resetAnalyticsData(j8);
                break;
            case 13:
                long j9 = parcel.readLong();
                fv2.d(parcel);
                setMinimumSessionDuration(j9);
                break;
            case 14:
                long j10 = parcel.readLong();
                fv2.d(parcel);
                setSessionTimeoutDuration(j10);
                break;
            case 15:
                en0 en0VarH3 = e81.H(parcel.readStrongBinder());
                String string15 = parcel.readString();
                String string16 = parcel.readString();
                long j11 = parcel.readLong();
                fv2.d(parcel);
                setCurrentScreen(en0VarH3, string15, string16, j11);
                break;
            case 16:
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    ex2Var13 = iInterfaceQueryLocalInterface5 instanceof hx2 ? (hx2) iInterfaceQueryLocalInterface5 : new ex2(strongBinder5);
                }
                fv2.d(parcel);
                getCurrentScreenName(ex2Var13);
                break;
            case 17:
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    ex2Var12 = iInterfaceQueryLocalInterface6 instanceof hx2 ? (hx2) iInterfaceQueryLocalInterface6 : new ex2(strongBinder6);
                }
                fv2.d(parcel);
                getCurrentScreenClass(ex2Var12);
                break;
            case 18:
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.measurement.api.internal.IStringProvider");
                    vx2Var = iInterfaceQueryLocalInterface7 instanceof fy2 ? (fy2) iInterfaceQueryLocalInterface7 : new vx2(strongBinder7, "com.google.android.gms.measurement.api.internal.IStringProvider", 4);
                }
                fv2.d(parcel);
                setInstanceIdProvider(vx2Var);
                break;
            case 19:
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    ex2Var11 = iInterfaceQueryLocalInterface8 instanceof hx2 ? (hx2) iInterfaceQueryLocalInterface8 : new ex2(strongBinder8);
                }
                fv2.d(parcel);
                getCachedAppInstanceId(ex2Var11);
                break;
            case 20:
                IBinder strongBinder9 = parcel.readStrongBinder();
                if (strongBinder9 != null) {
                    IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    ex2Var10 = iInterfaceQueryLocalInterface9 instanceof hx2 ? (hx2) iInterfaceQueryLocalInterface9 : new ex2(strongBinder9);
                }
                fv2.d(parcel);
                getAppInstanceId(ex2Var10);
                break;
            case 21:
                IBinder strongBinder10 = parcel.readStrongBinder();
                if (strongBinder10 != null) {
                    IInterface iInterfaceQueryLocalInterface10 = strongBinder10.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    ex2Var9 = iInterfaceQueryLocalInterface10 instanceof hx2 ? (hx2) iInterfaceQueryLocalInterface10 : new ex2(strongBinder10);
                }
                fv2.d(parcel);
                getGmpAppId(ex2Var9);
                break;
            case 22:
                IBinder strongBinder11 = parcel.readStrongBinder();
                if (strongBinder11 != null) {
                    IInterface iInterfaceQueryLocalInterface11 = strongBinder11.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    ex2Var8 = iInterfaceQueryLocalInterface11 instanceof hx2 ? (hx2) iInterfaceQueryLocalInterface11 : new ex2(strongBinder11);
                }
                fv2.d(parcel);
                generateEventId(ex2Var8);
                break;
            case 23:
                String string17 = parcel.readString();
                long j12 = parcel.readLong();
                fv2.d(parcel);
                beginAdUnitExposure(string17, j12);
                break;
            case 24:
                String string18 = parcel.readString();
                long j13 = parcel.readLong();
                fv2.d(parcel);
                endAdUnitExposure(string18, j13);
                break;
            case 25:
                en0 en0VarH4 = e81.H(parcel.readStrongBinder());
                long j14 = parcel.readLong();
                fv2.d(parcel);
                onActivityStarted(en0VarH4, j14);
                break;
            case 26:
                en0 en0VarH5 = e81.H(parcel.readStrongBinder());
                long j15 = parcel.readLong();
                fv2.d(parcel);
                onActivityStopped(en0VarH5, j15);
                break;
            case 27:
                en0 en0VarH6 = e81.H(parcel.readStrongBinder());
                Bundle bundle5 = (Bundle) fv2.a(parcel, Bundle.CREATOR);
                long j16 = parcel.readLong();
                fv2.d(parcel);
                onActivityCreated(en0VarH6, bundle5, j16);
                break;
            case 28:
                en0 en0VarH7 = e81.H(parcel.readStrongBinder());
                long j17 = parcel.readLong();
                fv2.d(parcel);
                onActivityDestroyed(en0VarH7, j17);
                break;
            case 29:
                en0 en0VarH8 = e81.H(parcel.readStrongBinder());
                long j18 = parcel.readLong();
                fv2.d(parcel);
                onActivityPaused(en0VarH8, j18);
                break;
            case 30:
                en0 en0VarH9 = e81.H(parcel.readStrongBinder());
                long j19 = parcel.readLong();
                fv2.d(parcel);
                onActivityResumed(en0VarH9, j19);
                break;
            case 31:
                en0 en0VarH10 = e81.H(parcel.readStrongBinder());
                IBinder strongBinder12 = parcel.readStrongBinder();
                if (strongBinder12 != null) {
                    IInterface iInterfaceQueryLocalInterface12 = strongBinder12.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    ex2Var7 = iInterfaceQueryLocalInterface12 instanceof hx2 ? (hx2) iInterfaceQueryLocalInterface12 : new ex2(strongBinder12);
                }
                long j20 = parcel.readLong();
                fv2.d(parcel);
                onActivitySaveInstanceState(en0VarH10, ex2Var7, j20);
                break;
            case 32:
                Bundle bundle6 = (Bundle) fv2.a(parcel, Bundle.CREATOR);
                IBinder strongBinder13 = parcel.readStrongBinder();
                if (strongBinder13 != null) {
                    IInterface iInterfaceQueryLocalInterface13 = strongBinder13.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    ex2Var6 = iInterfaceQueryLocalInterface13 instanceof hx2 ? (hx2) iInterfaceQueryLocalInterface13 : new ex2(strongBinder13);
                }
                long j21 = parcel.readLong();
                fv2.d(parcel);
                performAction(bundle6, ex2Var6, j21);
                break;
            case 33:
                int i2 = parcel.readInt();
                String string19 = parcel.readString();
                en0 en0VarH11 = e81.H(parcel.readStrongBinder());
                en0 en0VarH12 = e81.H(parcel.readStrongBinder());
                en0 en0VarH13 = e81.H(parcel.readStrongBinder());
                fv2.d(parcel);
                logHealthData(i2, string19, en0VarH11, en0VarH12, en0VarH13);
                break;
            case 34:
                IBinder strongBinder14 = parcel.readStrongBinder();
                if (strongBinder14 != null) {
                    IInterface iInterfaceQueryLocalInterface14 = strongBinder14.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    rx2Var3 = iInterfaceQueryLocalInterface14 instanceof ux2 ? (ux2) iInterfaceQueryLocalInterface14 : new rx2(strongBinder14);
                }
                fv2.d(parcel);
                setEventInterceptor(rx2Var3);
                break;
            case 35:
                IBinder strongBinder15 = parcel.readStrongBinder();
                if (strongBinder15 != null) {
                    IInterface iInterfaceQueryLocalInterface15 = strongBinder15.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    rx2Var2 = iInterfaceQueryLocalInterface15 instanceof ux2 ? (ux2) iInterfaceQueryLocalInterface15 : new rx2(strongBinder15);
                }
                fv2.d(parcel);
                registerOnMeasurementEventListener(rx2Var2);
                break;
            case 36:
                IBinder strongBinder16 = parcel.readStrongBinder();
                if (strongBinder16 != null) {
                    IInterface iInterfaceQueryLocalInterface16 = strongBinder16.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    rx2Var = iInterfaceQueryLocalInterface16 instanceof ux2 ? (ux2) iInterfaceQueryLocalInterface16 : new rx2(strongBinder16);
                }
                fv2.d(parcel);
                unregisterOnMeasurementEventListener(rx2Var);
                break;
            case 37:
                HashMap hashMap = parcel.readHashMap(fv2.a);
                fv2.d(parcel);
                initForTests(hashMap);
                break;
            case 38:
                IBinder strongBinder17 = parcel.readStrongBinder();
                if (strongBinder17 != null) {
                    IInterface iInterfaceQueryLocalInterface17 = strongBinder17.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    ex2Var5 = iInterfaceQueryLocalInterface17 instanceof hx2 ? (hx2) iInterfaceQueryLocalInterface17 : new ex2(strongBinder17);
                }
                int i3 = parcel.readInt();
                fv2.d(parcel);
                getTestFlag(ex2Var5, i3);
                break;
            case 39:
                ClassLoader classLoader4 = fv2.a;
                boolean z7 = parcel.readInt() != 0;
                fv2.d(parcel);
                setDataCollectionEnabled(z7);
                break;
            case 40:
                IBinder strongBinder18 = parcel.readStrongBinder();
                if (strongBinder18 != null) {
                    IInterface iInterfaceQueryLocalInterface18 = strongBinder18.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    ex2Var4 = iInterfaceQueryLocalInterface18 instanceof hx2 ? (hx2) iInterfaceQueryLocalInterface18 : new ex2(strongBinder18);
                }
                fv2.d(parcel);
                isDataCollectionEnabled(ex2Var4);
                break;
            case 41:
            case 47:
            case 49:
            default:
                return false;
            case 42:
                Bundle bundle7 = (Bundle) fv2.a(parcel, Bundle.CREATOR);
                fv2.d(parcel);
                setDefaultEventParameters(bundle7);
                break;
            case 43:
                long j22 = parcel.readLong();
                fv2.d(parcel);
                clearMeasurementEnabled(j22);
                break;
            case 44:
                Bundle bundle8 = (Bundle) fv2.a(parcel, Bundle.CREATOR);
                long j23 = parcel.readLong();
                fv2.d(parcel);
                setConsent(bundle8, j23);
                break;
            case 45:
                Bundle bundle9 = (Bundle) fv2.a(parcel, Bundle.CREATOR);
                long j24 = parcel.readLong();
                fv2.d(parcel);
                setConsentThirdParty(bundle9, j24);
                break;
            case 46:
                IBinder strongBinder19 = parcel.readStrongBinder();
                if (strongBinder19 != null) {
                    IInterface iInterfaceQueryLocalInterface19 = strongBinder19.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    ex2Var3 = iInterfaceQueryLocalInterface19 instanceof hx2 ? (hx2) iInterfaceQueryLocalInterface19 : new ex2(strongBinder19);
                }
                fv2.d(parcel);
                getSessionId(ex2Var3);
                break;
            case 48:
                Intent intent = (Intent) fv2.a(parcel, Intent.CREATOR);
                fv2.d(parcel);
                setSgtmDebugInfo(intent);
                break;
            case 50:
                zzdd zzddVar = (zzdd) fv2.a(parcel, zzdd.CREATOR);
                String string20 = parcel.readString();
                String string21 = parcel.readString();
                long j25 = parcel.readLong();
                fv2.d(parcel);
                setCurrentScreenByScionActivityInfo(zzddVar, string20, string21, j25);
                break;
            case 51:
                zzdd zzddVar2 = (zzdd) fv2.a(parcel, zzdd.CREATOR);
                long j26 = parcel.readLong();
                fv2.d(parcel);
                onActivityStartedByScionActivityInfo(zzddVar2, j26);
                break;
            case 52:
                zzdd zzddVar3 = (zzdd) fv2.a(parcel, zzdd.CREATOR);
                long j27 = parcel.readLong();
                fv2.d(parcel);
                onActivityStoppedByScionActivityInfo(zzddVar3, j27);
                break;
            case 53:
                zzdd zzddVar4 = (zzdd) fv2.a(parcel, zzdd.CREATOR);
                Bundle bundle10 = (Bundle) fv2.a(parcel, Bundle.CREATOR);
                long j28 = parcel.readLong();
                fv2.d(parcel);
                onActivityCreatedByScionActivityInfo(zzddVar4, bundle10, j28);
                break;
            case 54:
                zzdd zzddVar5 = (zzdd) fv2.a(parcel, zzdd.CREATOR);
                long j29 = parcel.readLong();
                fv2.d(parcel);
                onActivityDestroyedByScionActivityInfo(zzddVar5, j29);
                break;
            case 55:
                zzdd zzddVar6 = (zzdd) fv2.a(parcel, zzdd.CREATOR);
                long j30 = parcel.readLong();
                fv2.d(parcel);
                onActivityPausedByScionActivityInfo(zzddVar6, j30);
                break;
            case 56:
                zzdd zzddVar7 = (zzdd) fv2.a(parcel, zzdd.CREATOR);
                long j31 = parcel.readLong();
                fv2.d(parcel);
                onActivityResumedByScionActivityInfo(zzddVar7, j31);
                break;
            case 57:
                zzdd zzddVar8 = (zzdd) fv2.a(parcel, zzdd.CREATOR);
                IBinder strongBinder20 = parcel.readStrongBinder();
                if (strongBinder20 != null) {
                    IInterface iInterfaceQueryLocalInterface20 = strongBinder20.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    ex2Var2 = iInterfaceQueryLocalInterface20 instanceof hx2 ? (hx2) iInterfaceQueryLocalInterface20 : new ex2(strongBinder20);
                }
                long j32 = parcel.readLong();
                fv2.d(parcel);
                onActivitySaveInstanceStateByScionActivityInfo(zzddVar8, ex2Var2, j32);
                break;
            case 58:
                IBinder strongBinder21 = parcel.readStrongBinder();
                if (strongBinder21 != null) {
                    IInterface iInterfaceQueryLocalInterface21 = strongBinder21.queryLocalInterface("com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback");
                    kx2Var = iInterfaceQueryLocalInterface21 instanceof px2 ? (px2) iInterfaceQueryLocalInterface21 : new kx2(strongBinder21, "com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback", 4);
                }
                fv2.d(parcel);
                retrieveAndUploadBatches(kx2Var);
                break;
            case 59:
                String string22 = parcel.readString();
                String string23 = parcel.readString();
                Bundle bundle11 = (Bundle) fv2.a(parcel, Bundle.CREATOR);
                if (parcel.readInt() != 0) {
                    z = true;
                }
                boolean z8 = parcel.readInt() != 0;
                long j33 = parcel.readLong();
                long j34 = parcel.readLong();
                fv2.d(parcel);
                logEventWithElapsedTime(string22, string23, bundle11, z, z8, j33, j34);
                break;
            case 60:
                en0 en0VarH14 = e81.H(parcel.readStrongBinder());
                zzdb zzdbVar2 = (zzdb) fv2.a(parcel, zzdb.CREATOR);
                long j35 = parcel.readLong();
                long j36 = parcel.readLong();
                fv2.d(parcel);
                initializeWithElapsedTime(en0VarH14, zzdbVar2, j35, j36);
                break;
            case 61:
                long j37 = parcel.readLong();
                long j38 = parcel.readLong();
                fv2.d(parcel);
                resetAnalyticsDataWithElapsedTime(j37, j38);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
