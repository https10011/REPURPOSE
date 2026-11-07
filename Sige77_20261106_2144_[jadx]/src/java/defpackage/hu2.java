package defpackage;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.AccountChangeEvent;
import com.google.android.gms.auth.AccountChangeEventsRequest;
import com.google.android.gms.auth.AccountChangeEventsResponse;
import com.google.android.gms.auth.api.proxy.ProxyResponse;
import com.google.android.gms.auth.blockstore.DeleteBytesRequest;
import com.google.android.gms.auth.blockstore.RetrieveBytesRequest;
import com.google.android.gms.cloudmessaging.zzd;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.ComplianceOptions;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsCredPropsOutputs;
import com.google.android.gms.fido.fido2.api.common.FidoAppIdExtension;
import com.google.android.gms.fido.fido2.api.common.GoogleThirdPartyPaymentExtension;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethodExtension;
import com.google.android.gms.fido.fido2.api.common.UserVerificationRequirement;
import com.google.android.gms.fido.fido2.api.common.UvmEntries;
import com.google.android.gms.fido.fido2.api.common.UvmEntry;
import com.google.android.gms.fido.fido2.api.common.zzab;
import com.google.android.gms.fido.fido2.api.common.zzad;
import com.google.android.gms.fido.fido2.api.common.zzag;
import com.google.android.gms.fido.fido2.api.common.zzai;
import com.google.android.gms.fido.fido2.api.common.zzak;
import com.google.android.gms.fido.fido2.api.common.zzaw;
import com.google.android.gms.fido.fido2.api.common.zzf;
import com.google.android.gms.fido.fido2.api.common.zzh;
import com.google.android.gms.fido.fido2.api.common.zzs;
import com.google.android.gms.fido.fido2.api.common.zzu;
import com.google.android.gms.fido.fido2.api.common.zzz;
import com.google.android.gms.fido.u2f.api.common.ChannelIdValue;
import com.google.android.gms.fido.u2f.api.common.ErrorCode;
import com.google.android.gms.fido.u2f.api.common.ErrorResponseData;
import com.google.android.gms.internal.auth.zzaz;
import com.google.android.gms.internal.auth.zzbb;
import com.google.android.gms.internal.auth.zzbw;
import com.google.android.gms.internal.firebase-auth-api.zzaij;
import com.google.android.gms.internal.measurement.zzdb;
import com.google.android.gms.internal.measurement.zzdd;
import com.google.android.gms.measurement.internal.zzbf;
import com.google.android.gms.measurement.internal.zzbh;
import com.google.firebase.auth.ActionCodeSettings;
import com.google.firebase.auth.PhoneAuthProvider;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import com.google.firebase.auth.TotpMultiFactorInfo;
import com.google.firebase.auth.internal.zzbl;
import com.google.firebase.auth.zzc;
import java.util.ArrayList;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class hu2 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public static void a(zzbh zzbhVar, Parcel parcel, int i) {
        String str = zzbhVar.a;
        int iO = bj0.O(parcel, 20293);
        bj0.F(parcel, 2, str, false);
        bj0.E(parcel, 3, zzbhVar.b, i, false);
        bj0.F(parcel, 4, zzbhVar.c, false);
        long j = zzbhVar.d;
        bj0.N(parcel, 5, 8);
        parcel.writeLong(j);
        long j2 = zzbhVar.e;
        bj0.N(parcel, 6, 8);
        parcel.writeLong(j2);
        bj0.P(parcel, iO);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iG = 0;
        int iG2 = 0;
        int iG3 = 0;
        int iG4 = 0;
        int iG5 = 0;
        boolean zC = false;
        int iG6 = 0;
        int iG7 = 0;
        int iG8 = 0;
        boolean zC2 = false;
        boolean zC3 = false;
        int iG9 = 0;
        String strM = null;
        String strM2 = null;
        String strM3 = null;
        String strM4 = null;
        ArrayList arrayListO = null;
        ArrayList arrayListQ = null;
        String strM5 = null;
        ArrayList arrayListQ2 = null;
        Bundle bundleF = null;
        ArrayList arrayListQ3 = null;
        String strM6 = null;
        String strM7 = null;
        ArrayList arrayListO2 = null;
        String strM8 = null;
        switch (this.a) {
            case 0:
                try {
                    return AttestationConveyancePreference.a(parcel.readString());
                } catch (lc e) {
                    sm0.n(e);
                    return null;
                }
            case 1:
                int iT = aj0.T(parcel);
                String strM9 = null;
                while (parcel.dataPosition() < iT) {
                    int i = parcel.readInt();
                    char c = (char) i;
                    if (c == 2) {
                        iG = aj0.G(parcel, i);
                    } else if (c == 3) {
                        strM = aj0.m(parcel, i);
                    } else if (c != 4) {
                        aj0.P(parcel, i);
                    } else {
                        strM9 = aj0.m(parcel, i);
                    }
                }
                aj0.s(parcel, iT);
                return new ChannelIdValue(iG, strM, strM9);
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                int iT2 = aj0.T(parcel);
                int iG10 = 0;
                Account account = null;
                while (parcel.dataPosition() < iT2) {
                    int i2 = parcel.readInt();
                    char c2 = (char) i2;
                    if (c2 == 1) {
                        iG9 = aj0.G(parcel, i2);
                    } else if (c2 == 2) {
                        iG10 = aj0.G(parcel, i2);
                    } else if (c2 == 3) {
                        strM8 = aj0.m(parcel, i2);
                    } else if (c2 != 4) {
                        aj0.P(parcel, i2);
                    } else {
                        account = (Account) aj0.k(parcel, i2, Account.CREATOR);
                    }
                }
                aj0.s(parcel, iT2);
                return new AccountChangeEventsRequest(iG9, iG10, strM8, account);
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                int iT3 = aj0.T(parcel);
                boolean zC4 = false;
                boolean zC5 = false;
                int iG11 = 0;
                String strM10 = null;
                String strM11 = null;
                String strM12 = null;
                String strM13 = null;
                String strM14 = null;
                String strM15 = null;
                String strM16 = null;
                String strM17 = null;
                while (parcel.dataPosition() < iT3) {
                    int i3 = parcel.readInt();
                    switch ((char) i3) {
                        case 1:
                            strM10 = aj0.m(parcel, i3);
                            break;
                        case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                            strM11 = aj0.m(parcel, i3);
                            break;
                        case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                            strM12 = aj0.m(parcel, i3);
                            break;
                        case oc1.LONG_FIELD_NUMBER /* 4 */:
                            strM13 = aj0.m(parcel, i3);
                            break;
                        case oc1.STRING_FIELD_NUMBER /* 5 */:
                            zC4 = aj0.C(parcel, i3);
                            break;
                        case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                            strM14 = aj0.m(parcel, i3);
                            break;
                        case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                            zC5 = aj0.C(parcel, i3);
                            break;
                        case oc1.BYTES_FIELD_NUMBER /* 8 */:
                            strM15 = aj0.m(parcel, i3);
                            break;
                        case '\t':
                            iG11 = aj0.G(parcel, i3);
                            break;
                        case '\n':
                            strM16 = aj0.m(parcel, i3);
                            break;
                        case 11:
                            strM17 = aj0.m(parcel, i3);
                            break;
                        default:
                            aj0.P(parcel, i3);
                            break;
                    }
                }
                aj0.s(parcel, iT3);
                return new ActionCodeSettings(strM10, strM11, strM12, strM13, zC4, strM14, zC5, strM15, iG11, strM16, strM17);
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                int iT4 = aj0.T(parcel);
                int iG12 = 0;
                int iG13 = 0;
                int iG14 = 0;
                PendingIntent pendingIntent = null;
                Bundle bundleF2 = null;
                byte[] bArrG = null;
                while (parcel.dataPosition() < iT4) {
                    int i4 = parcel.readInt();
                    char c3 = (char) i4;
                    if (c3 == 1) {
                        iG13 = aj0.G(parcel, i4);
                    } else if (c3 == 2) {
                        pendingIntent = (PendingIntent) aj0.k(parcel, i4, PendingIntent.CREATOR);
                    } else if (c3 == 3) {
                        iG14 = aj0.G(parcel, i4);
                    } else if (c3 == 4) {
                        bundleF2 = aj0.f(parcel, i4);
                    } else if (c3 == 5) {
                        bArrG = aj0.g(parcel, i4);
                    } else if (c3 != 1000) {
                        aj0.P(parcel, i4);
                    } else {
                        iG12 = aj0.G(parcel, i4);
                    }
                }
                aj0.s(parcel, iT4);
                return new ProxyResponse(iG12, iG13, pendingIntent, iG14, bundleF2, bArrG);
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                int iT5 = aj0.T(parcel);
                while (parcel.dataPosition() < iT5) {
                    int i5 = parcel.readInt();
                    char c4 = (char) i5;
                    if (c4 == 1) {
                        arrayListO2 = aj0.o(parcel, i5);
                    } else if (c4 != 2) {
                        aj0.P(parcel, i5);
                    } else {
                        zC3 = aj0.C(parcel, i5);
                    }
                }
                aj0.s(parcel, iT5);
                return new DeleteBytesRequest(arrayListO2, zC3);
            case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                return new zzd(parcel.readStrongBinder());
            case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                int iT6 = aj0.T(parcel);
                long jI = -1;
                int iG15 = 0;
                boolean zC6 = false;
                String strM18 = null;
                while (parcel.dataPosition() < iT6) {
                    int i6 = parcel.readInt();
                    char c5 = (char) i6;
                    if (c5 == 1) {
                        strM18 = aj0.m(parcel, i6);
                    } else if (c5 == 2) {
                        iG15 = aj0.G(parcel, i6);
                    } else if (c5 == 3) {
                        jI = aj0.I(parcel, i6);
                    } else if (c5 != 4) {
                        aj0.P(parcel, i6);
                    } else {
                        zC6 = aj0.C(parcel, i6);
                    }
                }
                aj0.s(parcel, iT6);
                return new Feature(strM18, iG15, jI, zC6);
            case oc1.BYTES_FIELD_NUMBER /* 8 */:
                int iT7 = aj0.T(parcel);
                byte[] bArrG2 = null;
                while (parcel.dataPosition() < iT7) {
                    int i7 = parcel.readInt();
                    char c6 = (char) i7;
                    if (c6 == 1) {
                        aj0.G(parcel, i7);
                    } else if (c6 == 2) {
                        strM7 = aj0.m(parcel, i7);
                    } else if (c6 != 3) {
                        aj0.P(parcel, i7);
                    } else {
                        bArrG2 = aj0.g(parcel, i7);
                    }
                }
                aj0.s(parcel, iT7);
                return new zzaz(bArrG2, strM7);
            case 9:
                int iT8 = aj0.T(parcel);
                while (parcel.dataPosition() < iT8) {
                    int i8 = parcel.readInt();
                    if (((char) i8) != 1) {
                        aj0.P(parcel, i8);
                    } else {
                        zC2 = aj0.C(parcel, i8);
                    }
                }
                aj0.s(parcel, iT8);
                return new UserVerificationMethodExtension(zC2);
            case 10:
                try {
                    return UserVerificationRequirement.a(parcel.readString());
                } catch (su2 e2) {
                    sm0.n(e2);
                    return null;
                }
            case 11:
                int iT9 = aj0.T(parcel);
                PendingIntent pendingIntent2 = null;
                while (parcel.dataPosition() < iT9) {
                    int i9 = parcel.readInt();
                    char c7 = (char) i9;
                    if (c7 == 1) {
                        aj0.G(parcel, i9);
                    } else if (c7 == 2) {
                        strM6 = aj0.m(parcel, i9);
                    } else if (c7 != 3) {
                        aj0.P(parcel, i9);
                    } else {
                        pendingIntent2 = (PendingIntent) aj0.k(parcel, i9, PendingIntent.CREATOR);
                    }
                }
                aj0.s(parcel, iT9);
                return new zzbb(strM6, pendingIntent2);
            case 12:
                int iT10 = aj0.T(parcel);
                while (parcel.dataPosition() < iT10) {
                    int i10 = parcel.readInt();
                    if (((char) i10) != 1) {
                        aj0.P(parcel, i10);
                    } else {
                        arrayListQ3 = aj0.q(parcel, i10, UvmEntry.CREATOR);
                    }
                }
                aj0.s(parcel, iT10);
                return new UvmEntries(arrayListQ3);
            case 13:
                int iT11 = aj0.T(parcel);
                short s = 0;
                short s2 = 0;
                while (parcel.dataPosition() < iT11) {
                    int i11 = parcel.readInt();
                    char c8 = (char) i11;
                    if (c8 == 1) {
                        iG8 = aj0.G(parcel, i11);
                    } else if (c8 == 2) {
                        aj0.X(parcel, i11, 4);
                        s = (short) parcel.readInt();
                    } else if (c8 != 3) {
                        aj0.P(parcel, i11);
                    } else {
                        aj0.X(parcel, i11, 4);
                        s2 = (short) parcel.readInt();
                    }
                }
                aj0.s(parcel, iT11);
                return new UvmEntry(iG8, s, s2);
            case 14:
                int iT12 = aj0.T(parcel);
                while (parcel.dataPosition() < iT12) {
                    int i12 = parcel.readInt();
                    if (((char) i12) != 2) {
                        aj0.P(parcel, i12);
                    } else {
                        bundleF = aj0.f(parcel, i12);
                    }
                }
                aj0.s(parcel, iT12);
                return new zzbf(bundleF);
            case 15:
                int iT13 = aj0.T(parcel);
                long jI2 = 0;
                long jI3 = 0;
                String strM19 = null;
                zzbf zzbfVar = null;
                String strM20 = null;
                while (parcel.dataPosition() < iT13) {
                    int i13 = parcel.readInt();
                    char c9 = (char) i13;
                    if (c9 == 2) {
                        strM19 = aj0.m(parcel, i13);
                    } else if (c9 == 3) {
                        zzbfVar = (zzbf) aj0.k(parcel, i13, zzbf.CREATOR);
                    } else if (c9 == 4) {
                        strM20 = aj0.m(parcel, i13);
                    } else if (c9 == 5) {
                        jI2 = aj0.I(parcel, i13);
                    } else if (c9 != 6) {
                        aj0.P(parcel, i13);
                    } else {
                        jI3 = aj0.I(parcel, i13);
                    }
                }
                aj0.s(parcel, iT13);
                return new zzbh(strM19, zzbfVar, strM20, jI2, jI3);
            case 16:
                int iT14 = aj0.T(parcel);
                ArrayList arrayListQ4 = null;
                while (parcel.dataPosition() < iT14) {
                    int i14 = parcel.readInt();
                    char c10 = (char) i14;
                    if (c10 == 1) {
                        arrayListQ2 = aj0.q(parcel, i14, PhoneMultiFactorInfo.CREATOR);
                    } else if (c10 != 2) {
                        aj0.P(parcel, i14);
                    } else {
                        arrayListQ4 = aj0.q(parcel, i14, TotpMultiFactorInfo.CREATOR);
                    }
                }
                aj0.s(parcel, iT14);
                return new zzbl(arrayListQ2, arrayListQ4);
            case 17:
                int iT15 = aj0.T(parcel);
                while (parcel.dataPosition() < iT15) {
                    int i15 = parcel.readInt();
                    char c11 = (char) i15;
                    if (c11 == 1) {
                        iG7 = aj0.G(parcel, i15);
                    } else if (c11 != 2) {
                        aj0.P(parcel, i15);
                    } else {
                        strM5 = aj0.m(parcel, i15);
                    }
                }
                aj0.s(parcel, iT15);
                return new zzbw(iG7, strM5);
            case 18:
                int iT16 = aj0.T(parcel);
                while (parcel.dataPosition() < iT16) {
                    int i16 = parcel.readInt();
                    char c12 = (char) i16;
                    if (c12 == 1) {
                        iG6 = aj0.G(parcel, i16);
                    } else if (c12 != 2) {
                        aj0.P(parcel, i16);
                    } else {
                        arrayListQ = aj0.q(parcel, i16, AccountChangeEvent.CREATOR);
                    }
                }
                aj0.s(parcel, iT16);
                return new AccountChangeEventsResponse(iG6, arrayListQ);
            case 19:
                int iT17 = aj0.T(parcel);
                while (parcel.dataPosition() < iT17) {
                    int i17 = parcel.readInt();
                    char c13 = (char) i17;
                    if (c13 == 1) {
                        arrayListO = aj0.o(parcel, i17);
                    } else if (c13 != 2) {
                        aj0.P(parcel, i17);
                    } else {
                        zC = aj0.C(parcel, i17);
                    }
                }
                aj0.s(parcel, iT17);
                return new RetrieveBytesRequest(arrayListO, zC);
            case 20:
                int iT18 = aj0.T(parcel);
                int iG16 = 0;
                int iG17 = 0;
                boolean zC7 = true;
                while (parcel.dataPosition() < iT18) {
                    int i18 = parcel.readInt();
                    char c14 = (char) i18;
                    if (c14 == 1) {
                        iG5 = aj0.G(parcel, i18);
                    } else if (c14 == 2) {
                        iG16 = aj0.G(parcel, i18);
                    } else if (c14 == 3) {
                        iG17 = aj0.G(parcel, i18);
                    } else if (c14 != 4) {
                        aj0.P(parcel, i18);
                    } else {
                        zC7 = aj0.C(parcel, i18);
                    }
                }
                aj0.s(parcel, iT18);
                return new ComplianceOptions(iG5, iG16, iG17, zC7);
            case 21:
                int iT19 = aj0.T(parcel);
                UvmEntries uvmEntries = null;
                zzf zzfVar = null;
                AuthenticationExtensionsCredPropsOutputs authenticationExtensionsCredPropsOutputs = null;
                zzh zzhVar = null;
                String strM21 = null;
                while (parcel.dataPosition() < iT19) {
                    int i19 = parcel.readInt();
                    char c15 = (char) i19;
                    if (c15 == 1) {
                        uvmEntries = (UvmEntries) aj0.k(parcel, i19, UvmEntries.CREATOR);
                    } else if (c15 == 2) {
                        zzfVar = (zzf) aj0.k(parcel, i19, zzf.CREATOR);
                    } else if (c15 == 3) {
                        authenticationExtensionsCredPropsOutputs = (AuthenticationExtensionsCredPropsOutputs) aj0.k(parcel, i19, AuthenticationExtensionsCredPropsOutputs.CREATOR);
                    } else if (c15 == 4) {
                        zzhVar = (zzh) aj0.k(parcel, i19, zzh.CREATOR);
                    } else if (c15 != 5) {
                        aj0.P(parcel, i19);
                    } else {
                        strM21 = aj0.m(parcel, i19);
                    }
                }
                aj0.s(parcel, iT19);
                return new AuthenticationExtensionsClientOutputs(uvmEntries, zzfVar, authenticationExtensionsCredPropsOutputs, zzhVar, strM21);
            case 22:
                int i20 = parcel.readInt();
                for (ErrorCode errorCode : ErrorCode.values()) {
                    if (i20 == errorCode.a) {
                        return errorCode;
                    }
                }
                return ErrorCode.b;
            case 23:
                int iT20 = aj0.T(parcel);
                while (parcel.dataPosition() < iT20) {
                    aj0.P(parcel, parcel.readInt());
                }
                aj0.s(parcel, iT20);
                return new PhoneAuthProvider.ForceResendingToken();
            case 24:
                int iT21 = aj0.T(parcel);
                while (parcel.dataPosition() < iT21) {
                    int i21 = parcel.readInt();
                    char c16 = (char) i21;
                    if (c16 == 1) {
                        iG4 = aj0.G(parcel, i21);
                    } else if (c16 != 2) {
                        aj0.P(parcel, i21);
                    } else {
                        strM4 = aj0.m(parcel, i21);
                    }
                }
                aj0.s(parcel, iT21);
                return new Scope(iG4, strM4);
            case 25:
                int iT22 = aj0.T(parcel);
                FidoAppIdExtension fidoAppIdExtension = null;
                zzs zzsVar = null;
                UserVerificationMethodExtension userVerificationMethodExtension = null;
                zzz zzzVar = null;
                zzab zzabVar = null;
                zzad zzadVar = null;
                zzu zzuVar = null;
                zzag zzagVar = null;
                GoogleThirdPartyPaymentExtension googleThirdPartyPaymentExtension = null;
                zzak zzakVar = null;
                zzaw zzawVar = null;
                zzai zzaiVar = null;
                while (parcel.dataPosition() < iT22) {
                    int i22 = parcel.readInt();
                    switch ((char) i22) {
                        case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                            fidoAppIdExtension = (FidoAppIdExtension) aj0.k(parcel, i22, FidoAppIdExtension.CREATOR);
                            break;
                        case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                            zzsVar = (zzs) aj0.k(parcel, i22, zzs.CREATOR);
                            break;
                        case oc1.LONG_FIELD_NUMBER /* 4 */:
                            userVerificationMethodExtension = (UserVerificationMethodExtension) aj0.k(parcel, i22, UserVerificationMethodExtension.CREATOR);
                            break;
                        case oc1.STRING_FIELD_NUMBER /* 5 */:
                            zzzVar = (zzz) aj0.k(parcel, i22, zzz.CREATOR);
                            break;
                        case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                            zzabVar = (zzab) aj0.k(parcel, i22, zzab.CREATOR);
                            break;
                        case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                            zzadVar = (zzad) aj0.k(parcel, i22, zzad.CREATOR);
                            break;
                        case oc1.BYTES_FIELD_NUMBER /* 8 */:
                            zzuVar = (zzu) aj0.k(parcel, i22, zzu.CREATOR);
                            break;
                        case '\t':
                            zzagVar = (zzag) aj0.k(parcel, i22, zzag.CREATOR);
                            break;
                        case '\n':
                            googleThirdPartyPaymentExtension = (GoogleThirdPartyPaymentExtension) aj0.k(parcel, i22, GoogleThirdPartyPaymentExtension.CREATOR);
                            break;
                        case 11:
                            zzakVar = (zzak) aj0.k(parcel, i22, zzak.CREATOR);
                            break;
                        case '\f':
                            zzawVar = (zzaw) aj0.k(parcel, i22, zzaw.CREATOR);
                            break;
                        case '\r':
                            zzaiVar = (zzai) aj0.k(parcel, i22, zzai.CREATOR);
                            break;
                        default:
                            aj0.P(parcel, i22);
                            break;
                    }
                }
                aj0.s(parcel, iT22);
                return new AuthenticationExtensions(fidoAppIdExtension, zzsVar, userVerificationMethodExtension, zzzVar, zzabVar, zzadVar, zzuVar, zzagVar, googleThirdPartyPaymentExtension, zzakVar, zzawVar, zzaiVar);
            case 26:
                int iT23 = aj0.T(parcel);
                while (parcel.dataPosition() < iT23) {
                    int i23 = parcel.readInt();
                    char c17 = (char) i23;
                    if (c17 == 2) {
                        iG3 = aj0.G(parcel, i23);
                    } else if (c17 != 3) {
                        aj0.P(parcel, i23);
                    } else {
                        strM3 = aj0.m(parcel, i23);
                    }
                }
                aj0.s(parcel, iT23);
                return new ErrorResponseData(iG3, strM3);
            case 27:
                int iT24 = aj0.T(parcel);
                long jI4 = 0;
                long jI5 = 0;
                boolean zC8 = false;
                Bundle bundleF3 = null;
                String strM22 = null;
                while (parcel.dataPosition() < iT24) {
                    int i24 = parcel.readInt();
                    char c18 = (char) i24;
                    if (c18 == 1) {
                        jI4 = aj0.I(parcel, i24);
                    } else if (c18 == 2) {
                        jI5 = aj0.I(parcel, i24);
                    } else if (c18 == 3) {
                        zC8 = aj0.C(parcel, i24);
                    } else if (c18 == 7) {
                        bundleF3 = aj0.f(parcel, i24);
                    } else if (c18 != '\b') {
                        aj0.P(parcel, i24);
                    } else {
                        strM22 = aj0.m(parcel, i24);
                    }
                }
                aj0.s(parcel, iT24);
                return new zzdb(jI4, jI5, zC8, bundleF3, strM22);
            case 28:
                int iT25 = aj0.T(parcel);
                Intent intent = null;
                while (parcel.dataPosition() < iT25) {
                    int i25 = parcel.readInt();
                    char c19 = (char) i25;
                    if (c19 == 1) {
                        iG2 = aj0.G(parcel, i25);
                    } else if (c19 == 2) {
                        strM2 = aj0.m(parcel, i25);
                    } else if (c19 != 3) {
                        aj0.P(parcel, i25);
                    } else {
                        intent = (Intent) aj0.k(parcel, i25, Intent.CREATOR);
                    }
                }
                aj0.s(parcel, iT25);
                return new zzdd(iG2, strM2, intent);
            default:
                int iT26 = aj0.T(parcel);
                String strM23 = null;
                String strM24 = null;
                String strM25 = null;
                zzaij zzaijVar = null;
                String strM26 = null;
                String strM27 = null;
                String strM28 = null;
                while (parcel.dataPosition() < iT26) {
                    int i26 = parcel.readInt();
                    switch ((char) i26) {
                        case 1:
                            strM23 = aj0.m(parcel, i26);
                            break;
                        case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                            strM24 = aj0.m(parcel, i26);
                            break;
                        case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                            strM25 = aj0.m(parcel, i26);
                            break;
                        case oc1.LONG_FIELD_NUMBER /* 4 */:
                            zzaijVar = (zzaij) aj0.k(parcel, i26, zzaij.CREATOR);
                            break;
                        case oc1.STRING_FIELD_NUMBER /* 5 */:
                            strM26 = aj0.m(parcel, i26);
                            break;
                        case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                            strM27 = aj0.m(parcel, i26);
                            break;
                        case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                            strM28 = aj0.m(parcel, i26);
                            break;
                        default:
                            aj0.P(parcel, i26);
                            break;
                    }
                }
                aj0.s(parcel, iT26);
                return new zzc(strM23, strM24, strM25, zzaijVar, strM26, strM27, strM28);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new AttestationConveyancePreference[i];
            case 1:
                return new ChannelIdValue[i];
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                return new AccountChangeEventsRequest[i];
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                return new ActionCodeSettings[i];
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                return new ProxyResponse[i];
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                return new DeleteBytesRequest[i];
            case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                return new zzd[i];
            case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                return new Feature[i];
            case oc1.BYTES_FIELD_NUMBER /* 8 */:
                return new zzaz[i];
            case 9:
                return new UserVerificationMethodExtension[i];
            case 10:
                return new UserVerificationRequirement[i];
            case 11:
                return new zzbb[i];
            case 12:
                return new UvmEntries[i];
            case 13:
                return new UvmEntry[i];
            case 14:
                return new zzbf[i];
            case 15:
                return new zzbh[i];
            case 16:
                return new zzbl[i];
            case 17:
                return new zzbw[i];
            case 18:
                return new AccountChangeEventsResponse[i];
            case 19:
                return new RetrieveBytesRequest[i];
            case 20:
                return new ComplianceOptions[i];
            case 21:
                return new AuthenticationExtensionsClientOutputs[i];
            case 22:
                return new ErrorCode[i];
            case 23:
                return new PhoneAuthProvider.ForceResendingToken[i];
            case 24:
                return new Scope[i];
            case 25:
                return new AuthenticationExtensions[i];
            case 26:
                return new ErrorResponseData[i];
            case 27:
                return new zzdb[i];
            case 28:
                return new zzdd[i];
            default:
                return new zzc[i];
        }
    }
}
