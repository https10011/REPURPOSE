package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.text.TextUtils;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialParameters;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRpEntity;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity;
import com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement;
import com.google.android.gms.fido.fido2.api.common.TokenBinding;
import com.google.android.gms.fido.fido2.api.common.zzai;
import com.google.android.gms.fido.fido2.api.common.zzak;
import com.google.android.gms.fido.fido2.api.common.zzaw;
import com.google.android.gms.internal.auth.zzaq;
import com.google.android.gms.internal.auth.zzav;
import com.google.android.gms.internal.auth.zzax;
import com.google.android.gms.internal.firebase-auth-api.zzaih;
import com.google.android.gms.internal.firebase-auth-api.zzaij;
import com.google.firebase.auth.GithubAuthCredential;
import com.google.firebase.auth.GoogleAuthCredential;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import com.google.firebase.auth.PlayGamesAuthCredential;
import com.google.firebase.auth.TotpMultiFactorInfo;
import com.google.firebase.auth.TwitterAuthCredential;
import com.google.firebase.auth.UserProfileChangeRequest;
import com.google.firebase.auth.internal.zzad;
import com.google.firebase.auth.internal.zzaj;
import com.google.firebase.auth.internal.zzao;
import com.google.firebase.auth.zzc;
import com.hjq.toast.BuildConfig;
import java.util.ArrayList;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class nq2 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        boolean zC = false;
        int iG = 0;
        boolean zC2 = false;
        int iG2 = 0;
        int iG3 = 0;
        String strM = null;
        String strM2 = null;
        String strM3 = null;
        String strM4 = null;
        String strM5 = null;
        String strM6 = null;
        String strM7 = null;
        byte[] bArrG = null;
        String strM8 = null;
        String strM9 = null;
        String strM10 = null;
        String strM11 = null;
        String strM12 = null;
        Bundle bundleF = null;
        String strM13 = null;
        String strM14 = null;
        byte[][] bArrH = null;
        String strM15 = null;
        String strM16 = null;
        switch (this.a) {
            case 0:
                int iT = aj0.T(parcel);
                boolean zC3 = false;
                boolean zC4 = false;
                String strM17 = null;
                String strM18 = null;
                String strM19 = null;
                String strM20 = null;
                String strM21 = null;
                String strM22 = null;
                String strM23 = null;
                String strM24 = null;
                String strM25 = null;
                String strM26 = null;
                String strM27 = null;
                String strM28 = null;
                while (parcel.dataPosition() < iT) {
                    int i = parcel.readInt();
                    String str = strM26;
                    switch ((char) i) {
                        case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                            strM = aj0.m(parcel, i);
                            break;
                        case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                            strM17 = aj0.m(parcel, i);
                            break;
                        case oc1.LONG_FIELD_NUMBER /* 4 */:
                            strM18 = aj0.m(parcel, i);
                            break;
                        case oc1.STRING_FIELD_NUMBER /* 5 */:
                            strM19 = aj0.m(parcel, i);
                            break;
                        case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                            strM20 = aj0.m(parcel, i);
                            break;
                        case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                            strM21 = aj0.m(parcel, i);
                            break;
                        case oc1.BYTES_FIELD_NUMBER /* 8 */:
                            strM22 = aj0.m(parcel, i);
                            break;
                        case '\t':
                            strM23 = aj0.m(parcel, i);
                            break;
                        case '\n':
                            zC = aj0.C(parcel, i);
                            break;
                        case 11:
                            zC3 = aj0.C(parcel, i);
                            break;
                        case '\f':
                            strM24 = aj0.m(parcel, i);
                            break;
                        case '\r':
                            strM25 = aj0.m(parcel, i);
                            break;
                        case 14:
                            strM26 = aj0.m(parcel, i);
                            continue;
                        case 15:
                            strM27 = aj0.m(parcel, i);
                            break;
                        case 16:
                            zC4 = aj0.C(parcel, i);
                            break;
                        case 17:
                            strM28 = aj0.m(parcel, i);
                            break;
                        default:
                            aj0.P(parcel, i);
                            break;
                    }
                    strM26 = str;
                }
                aj0.s(parcel, iT);
                zzaij zzaijVar = new zzaij();
                zzaijVar.a = strM;
                zzaijVar.b = strM17;
                zzaijVar.c = strM18;
                zzaijVar.d = strM19;
                zzaijVar.e = strM20;
                zzaijVar.f = strM21;
                zzaijVar.i = strM22;
                zzaijVar.v = strM23;
                zzaijVar.w = zC;
                zzaijVar.W = zC3;
                zzaijVar.X = strM24;
                zzaijVar.Y = strM25;
                zzaijVar.Z = strM26;
                zzaijVar.a0 = strM27;
                zzaijVar.b0 = zC4;
                zzaijVar.c0 = strM28;
                return zzaijVar;
            case 1:
                int iT2 = aj0.T(parcel);
                byte[] bArrG2 = null;
                byte[] bArrG3 = null;
                byte[] bArrG4 = null;
                while (parcel.dataPosition() < iT2) {
                    int i2 = parcel.readInt();
                    char c = (char) i2;
                    if (c == 1) {
                        bArrG2 = aj0.g(parcel, i2);
                    } else if (c == 2) {
                        bArrG3 = aj0.g(parcel, i2);
                    } else if (c == 3) {
                        bArrG4 = aj0.g(parcel, i2);
                    } else if (c != 4) {
                        aj0.P(parcel, i2);
                    } else {
                        iG3 = aj0.G(parcel, i2);
                    }
                }
                aj0.s(parcel, iT2);
                return new zzai(bArrG2 == null ? null : d33.h(bArrG2, bArrG2.length), bArrG3 == null ? null : d33.h(bArrG3, bArrG3.length), bArrG4 != null ? d33.h(bArrG4, bArrG4.length) : null, iG3);
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                int iT3 = aj0.T(parcel);
                while (parcel.dataPosition() < iT3) {
                    int i3 = parcel.readInt();
                    if (((char) i3) != 1) {
                        aj0.P(parcel, i3);
                    } else {
                        iG2 = aj0.G(parcel, i3);
                    }
                }
                aj0.s(parcel, iT3);
                return new com.google.android.gms.common.internal.zzai(iG2);
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                int iT4 = aj0.T(parcel);
                while (parcel.dataPosition() < iT4) {
                    int i4 = parcel.readInt();
                    if (((char) i4) != 1) {
                        aj0.P(parcel, i4);
                    } else {
                        strM16 = aj0.m(parcel, i4);
                    }
                }
                aj0.s(parcel, iT4);
                return new GithubAuthCredential(strM16);
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                int iT5 = aj0.T(parcel);
                String strM29 = null;
                while (parcel.dataPosition() < iT5) {
                    int i5 = parcel.readInt();
                    char c2 = (char) i5;
                    if (c2 == 1) {
                        strM15 = aj0.m(parcel, i5);
                    } else if (c2 != 2) {
                        aj0.P(parcel, i5);
                    } else {
                        strM29 = aj0.m(parcel, i5);
                    }
                }
                aj0.s(parcel, iT5);
                return new GoogleAuthCredential(strM15, strM29);
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                int iT6 = aj0.T(parcel);
                ArrayList arrayListQ = null;
                zzao zzaoVar = null;
                String strM30 = null;
                zzc zzcVar = null;
                zzad zzadVar = null;
                ArrayList arrayListQ2 = null;
                while (parcel.dataPosition() < iT6) {
                    int i6 = parcel.readInt();
                    switch ((char) i6) {
                        case 1:
                            arrayListQ = aj0.q(parcel, i6, PhoneMultiFactorInfo.CREATOR);
                            break;
                        case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                            zzaoVar = (zzao) aj0.k(parcel, i6, zzao.CREATOR);
                            break;
                        case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                            strM30 = aj0.m(parcel, i6);
                            break;
                        case oc1.LONG_FIELD_NUMBER /* 4 */:
                            zzcVar = (zzc) aj0.k(parcel, i6, zzc.CREATOR);
                            break;
                        case oc1.STRING_FIELD_NUMBER /* 5 */:
                            zzadVar = (zzad) aj0.k(parcel, i6, zzad.CREATOR);
                            break;
                        case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                            arrayListQ2 = aj0.q(parcel, i6, TotpMultiFactorInfo.CREATOR);
                            break;
                        default:
                            aj0.P(parcel, i6);
                            break;
                    }
                }
                aj0.s(parcel, iT6);
                return new zzaj(arrayListQ, zzaoVar, strM30, zzcVar, zzadVar, arrayListQ2);
            case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                int iT7 = aj0.T(parcel);
                while (parcel.dataPosition() < iT7) {
                    int i7 = parcel.readInt();
                    if (((char) i7) != 1) {
                        aj0.P(parcel, i7);
                    } else {
                        bArrH = aj0.h(parcel, i7);
                    }
                }
                aj0.s(parcel, iT7);
                return new zzak(bArrH);
            case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                int iT8 = aj0.T(parcel);
                String strM31 = null;
                String strM32 = null;
                while (parcel.dataPosition() < iT8) {
                    int i8 = parcel.readInt();
                    char c3 = (char) i8;
                    if (c3 == 1) {
                        strM14 = aj0.m(parcel, i8);
                    } else if (c3 == 2) {
                        strM31 = aj0.m(parcel, i8);
                    } else if (c3 != 3) {
                        aj0.P(parcel, i8);
                    } else {
                        strM32 = aj0.m(parcel, i8);
                    }
                }
                aj0.s(parcel, iT8);
                return new com.google.firebase.auth.zzao(strM14, strM31, strM32);
            case oc1.BYTES_FIELD_NUMBER /* 8 */:
                int iT9 = aj0.T(parcel);
                String strM33 = null;
                ArrayList arrayListQ3 = null;
                ArrayList arrayListQ4 = null;
                zzad zzadVar2 = null;
                while (parcel.dataPosition() < iT9) {
                    int i9 = parcel.readInt();
                    char c4 = (char) i9;
                    if (c4 == 1) {
                        strM13 = aj0.m(parcel, i9);
                    } else if (c4 == 2) {
                        strM33 = aj0.m(parcel, i9);
                    } else if (c4 == 3) {
                        arrayListQ3 = aj0.q(parcel, i9, PhoneMultiFactorInfo.CREATOR);
                    } else if (c4 == 4) {
                        arrayListQ4 = aj0.q(parcel, i9, TotpMultiFactorInfo.CREATOR);
                    } else if (c4 != 5) {
                        aj0.P(parcel, i9);
                    } else {
                        zzadVar2 = (zzad) aj0.k(parcel, i9, zzad.CREATOR);
                    }
                }
                aj0.s(parcel, iT9);
                zzao zzaoVar2 = new zzao();
                zzaoVar2.a = strM13;
                zzaoVar2.b = strM33;
                zzaoVar2.c = arrayListQ3;
                zzaoVar2.d = arrayListQ4;
                zzaoVar2.e = zzadVar2;
                return zzaoVar2;
            case 9:
                int iT10 = aj0.T(parcel);
                PublicKeyCredentialRpEntity publicKeyCredentialRpEntity = null;
                PublicKeyCredentialUserEntity publicKeyCredentialUserEntity = null;
                byte[] bArrG5 = null;
                ArrayList arrayListQ5 = null;
                Double dE = null;
                ArrayList arrayListQ6 = null;
                AuthenticatorSelectionCriteria authenticatorSelectionCriteria = null;
                Integer numH = null;
                TokenBinding tokenBinding = null;
                String strM34 = null;
                AuthenticationExtensions authenticationExtensions = null;
                String strM35 = null;
                ResultReceiver resultReceiver = null;
                while (parcel.dataPosition() < iT10) {
                    int i10 = parcel.readInt();
                    switch ((char) i10) {
                        case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                            publicKeyCredentialRpEntity = (PublicKeyCredentialRpEntity) aj0.k(parcel, i10, PublicKeyCredentialRpEntity.CREATOR);
                            break;
                        case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                            publicKeyCredentialUserEntity = (PublicKeyCredentialUserEntity) aj0.k(parcel, i10, PublicKeyCredentialUserEntity.CREATOR);
                            break;
                        case oc1.LONG_FIELD_NUMBER /* 4 */:
                            bArrG5 = aj0.g(parcel, i10);
                            break;
                        case oc1.STRING_FIELD_NUMBER /* 5 */:
                            arrayListQ5 = aj0.q(parcel, i10, PublicKeyCredentialParameters.CREATOR);
                            break;
                        case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                            dE = aj0.E(parcel, i10);
                            break;
                        case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                            arrayListQ6 = aj0.q(parcel, i10, PublicKeyCredentialDescriptor.CREATOR);
                            break;
                        case oc1.BYTES_FIELD_NUMBER /* 8 */:
                            authenticatorSelectionCriteria = (AuthenticatorSelectionCriteria) aj0.k(parcel, i10, AuthenticatorSelectionCriteria.CREATOR);
                            break;
                        case '\t':
                            numH = aj0.H(parcel, i10);
                            break;
                        case '\n':
                            tokenBinding = (TokenBinding) aj0.k(parcel, i10, TokenBinding.CREATOR);
                            break;
                        case 11:
                            strM34 = aj0.m(parcel, i10);
                            break;
                        case '\f':
                            authenticationExtensions = (AuthenticationExtensions) aj0.k(parcel, i10, AuthenticationExtensions.CREATOR);
                            break;
                        case '\r':
                            strM35 = aj0.m(parcel, i10);
                            break;
                        case 14:
                            resultReceiver = (ResultReceiver) aj0.k(parcel, i10, ResultReceiver.CREATOR);
                            break;
                        default:
                            aj0.P(parcel, i10);
                            break;
                    }
                }
                aj0.s(parcel, iT10);
                return new PublicKeyCredentialCreationOptions(publicKeyCredentialRpEntity, publicKeyCredentialUserEntity, bArrG5, arrayListQ5, dE, arrayListQ6, authenticatorSelectionCriteria, numH, tokenBinding, strM34, authenticationExtensions, strM35, resultReceiver);
            case 10:
                int iT11 = aj0.T(parcel);
                String strM36 = null;
                String strM37 = null;
                byte[] bArrG6 = null;
                AuthenticatorAttestationResponse authenticatorAttestationResponse = null;
                AuthenticatorAssertionResponse authenticatorAssertionResponse = null;
                AuthenticatorErrorResponse authenticatorErrorResponse = null;
                AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs = null;
                String strM38 = null;
                while (parcel.dataPosition() < iT11) {
                    int i11 = parcel.readInt();
                    switch ((char) i11) {
                        case 1:
                            strM36 = aj0.m(parcel, i11);
                            break;
                        case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                            strM37 = aj0.m(parcel, i11);
                            break;
                        case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                            bArrG6 = aj0.g(parcel, i11);
                            break;
                        case oc1.LONG_FIELD_NUMBER /* 4 */:
                            authenticatorAttestationResponse = (AuthenticatorAttestationResponse) aj0.k(parcel, i11, AuthenticatorAttestationResponse.CREATOR);
                            break;
                        case oc1.STRING_FIELD_NUMBER /* 5 */:
                            authenticatorAssertionResponse = (AuthenticatorAssertionResponse) aj0.k(parcel, i11, AuthenticatorAssertionResponse.CREATOR);
                            break;
                        case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                            authenticatorErrorResponse = (AuthenticatorErrorResponse) aj0.k(parcel, i11, AuthenticatorErrorResponse.CREATOR);
                            break;
                        case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                            authenticationExtensionsClientOutputs = (AuthenticationExtensionsClientOutputs) aj0.k(parcel, i11, AuthenticationExtensionsClientOutputs.CREATOR);
                            break;
                        case oc1.BYTES_FIELD_NUMBER /* 8 */:
                            strM38 = aj0.m(parcel, i11);
                            break;
                        case '\t':
                            aj0.m(parcel, i11);
                            break;
                        default:
                            aj0.P(parcel, i11);
                            break;
                    }
                }
                aj0.s(parcel, iT11);
                return new PublicKeyCredential(strM36, strM37, bArrG6, authenticatorAttestationResponse, authenticatorAssertionResponse, authenticatorErrorResponse, authenticationExtensionsClientOutputs, strM38);
            case 11:
                int iT12 = aj0.T(parcel);
                while (parcel.dataPosition() < iT12) {
                    int i12 = parcel.readInt();
                    if (((char) i12) != 1) {
                        aj0.P(parcel, i12);
                    } else {
                        bundleF = aj0.f(parcel, i12);
                    }
                }
                aj0.s(parcel, iT12);
                return new com.google.android.gms.measurement.internal.zzao(bundleF);
            case 12:
                int iT13 = aj0.T(parcel);
                boolean zC5 = false;
                String strM39 = null;
                String strM40 = null;
                String strM41 = null;
                String strM42 = null;
                while (parcel.dataPosition() < iT13) {
                    int i13 = parcel.readInt();
                    char c5 = (char) i13;
                    if (c5 == 1) {
                        strM39 = aj0.m(parcel, i13);
                    } else if (c5 == 2) {
                        strM40 = aj0.m(parcel, i13);
                    } else if (c5 == 4) {
                        strM41 = aj0.m(parcel, i13);
                    } else if (c5 == 5) {
                        zC5 = aj0.C(parcel, i13);
                    } else if (c5 != 6) {
                        aj0.P(parcel, i13);
                    } else {
                        strM42 = aj0.m(parcel, i13);
                    }
                }
                aj0.s(parcel, iT13);
                return new PhoneAuthCredential(zC5, strM39, strM40, strM41, strM42);
            case 13:
                int iT14 = aj0.T(parcel);
                byte[] bArrG7 = null;
                ArrayList arrayListQ7 = null;
                while (parcel.dataPosition() < iT14) {
                    int i14 = parcel.readInt();
                    char c6 = (char) i14;
                    if (c6 == 2) {
                        strM12 = aj0.m(parcel, i14);
                    } else if (c6 == 3) {
                        bArrG7 = aj0.g(parcel, i14);
                    } else if (c6 != 4) {
                        aj0.P(parcel, i14);
                    } else {
                        arrayListQ7 = aj0.q(parcel, i14, Transport.CREATOR);
                    }
                }
                aj0.s(parcel, iT14);
                return new PublicKeyCredentialDescriptor(strM12, bArrG7, arrayListQ7);
            case 14:
                int iT15 = aj0.T(parcel);
                Integer numH2 = null;
                while (parcel.dataPosition() < iT15) {
                    int i15 = parcel.readInt();
                    char c7 = (char) i15;
                    if (c7 == 2) {
                        strM11 = aj0.m(parcel, i15);
                    } else if (c7 != 3) {
                        aj0.P(parcel, i15);
                    } else {
                        numH2 = aj0.H(parcel, i15);
                    }
                }
                aj0.s(parcel, iT15);
                return new PublicKeyCredentialParameters(strM11, numH2.intValue());
            case 15:
                int iT16 = aj0.T(parcel);
                while (parcel.dataPosition() < iT16) {
                    int i16 = parcel.readInt();
                    char c8 = (char) i16;
                    if (c8 == 1) {
                        aj0.G(parcel, i16);
                    } else if (c8 != 2) {
                        aj0.P(parcel, i16);
                    } else {
                        strM10 = aj0.m(parcel, i16);
                    }
                }
                aj0.s(parcel, iT16);
                return new zzaq(strM10);
            case 16:
                int iT17 = aj0.T(parcel);
                long jI = 0;
                String strM43 = null;
                String strM44 = null;
                String strM45 = null;
                while (parcel.dataPosition() < iT17) {
                    int i17 = parcel.readInt();
                    char c9 = (char) i17;
                    if (c9 == 1) {
                        strM43 = aj0.m(parcel, i17);
                    } else if (c9 == 2) {
                        strM44 = aj0.m(parcel, i17);
                    } else if (c9 == 3) {
                        jI = aj0.I(parcel, i17);
                    } else if (c9 != 4) {
                        aj0.P(parcel, i17);
                    } else {
                        strM45 = aj0.m(parcel, i17);
                    }
                }
                aj0.s(parcel, iT17);
                return new PhoneMultiFactorInfo(jI, strM43, strM44, strM45);
            case 17:
                int iT18 = aj0.T(parcel);
                byte[] bArrG8 = null;
                Double dE2 = null;
                String strM46 = null;
                ArrayList arrayListQ8 = null;
                Integer numH3 = null;
                TokenBinding tokenBinding2 = null;
                String strM47 = null;
                AuthenticationExtensions authenticationExtensions2 = null;
                Long lJ = null;
                String strM48 = null;
                ResultReceiver resultReceiver2 = null;
                while (parcel.dataPosition() < iT18) {
                    int i18 = parcel.readInt();
                    switch ((char) i18) {
                        case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                            bArrG8 = aj0.g(parcel, i18);
                            break;
                        case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                            dE2 = aj0.E(parcel, i18);
                            break;
                        case oc1.LONG_FIELD_NUMBER /* 4 */:
                            strM46 = aj0.m(parcel, i18);
                            break;
                        case oc1.STRING_FIELD_NUMBER /* 5 */:
                            arrayListQ8 = aj0.q(parcel, i18, PublicKeyCredentialDescriptor.CREATOR);
                            break;
                        case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                            numH3 = aj0.H(parcel, i18);
                            break;
                        case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                            tokenBinding2 = (TokenBinding) aj0.k(parcel, i18, TokenBinding.CREATOR);
                            break;
                        case oc1.BYTES_FIELD_NUMBER /* 8 */:
                            strM47 = aj0.m(parcel, i18);
                            break;
                        case '\t':
                            authenticationExtensions2 = (AuthenticationExtensions) aj0.k(parcel, i18, AuthenticationExtensions.CREATOR);
                            break;
                        case '\n':
                            lJ = aj0.J(parcel, i18);
                            break;
                        case 11:
                            strM48 = aj0.m(parcel, i18);
                            break;
                        case '\f':
                            resultReceiver2 = (ResultReceiver) aj0.k(parcel, i18, ResultReceiver.CREATOR);
                            break;
                        default:
                            aj0.P(parcel, i18);
                            break;
                    }
                }
                aj0.s(parcel, iT18);
                return new PublicKeyCredentialRequestOptions(bArrG8, dE2, strM46, arrayListQ8, numH3, tokenBinding2, strM47, authenticationExtensions2, lJ, strM48, resultReceiver2);
            case 18:
                int iT19 = aj0.T(parcel);
                while (parcel.dataPosition() < iT19) {
                    int i19 = parcel.readInt();
                    if (((char) i19) != 1) {
                        aj0.P(parcel, i19);
                    } else {
                        strM9 = aj0.m(parcel, i19);
                    }
                }
                aj0.s(parcel, iT19);
                return new PlayGamesAuthCredential(strM9);
            case 19:
                int iT20 = aj0.T(parcel);
                String strM49 = null;
                String strM50 = null;
                while (parcel.dataPosition() < iT20) {
                    int i20 = parcel.readInt();
                    char c10 = (char) i20;
                    if (c10 == 2) {
                        strM8 = aj0.m(parcel, i20);
                    } else if (c10 == 3) {
                        strM49 = aj0.m(parcel, i20);
                    } else if (c10 != 4) {
                        aj0.P(parcel, i20);
                    } else {
                        strM50 = aj0.m(parcel, i20);
                    }
                }
                aj0.s(parcel, iT20);
                return new PublicKeyCredentialRpEntity(strM8, strM49, strM50);
            case 20:
                try {
                    return PublicKeyCredentialType.a(parcel.readString());
                } catch (ce1 e) {
                    sm0.n(e);
                    return null;
                }
            case 21:
                int iT21 = aj0.T(parcel);
                long jI2 = 0;
                String strM51 = null;
                String strM52 = null;
                zzaih zzaihVar = null;
                while (parcel.dataPosition() < iT21) {
                    int i21 = parcel.readInt();
                    char c11 = (char) i21;
                    if (c11 == 1) {
                        strM51 = aj0.m(parcel, i21);
                    } else if (c11 == 2) {
                        strM52 = aj0.m(parcel, i21);
                    } else if (c11 == 3) {
                        jI2 = aj0.I(parcel, i21);
                    } else if (c11 != 4) {
                        aj0.P(parcel, i21);
                    } else {
                        zzaihVar = (zzaih) aj0.k(parcel, i21, zzaih.CREATOR);
                    }
                }
                aj0.s(parcel, iT21);
                return new TotpMultiFactorInfo(strM51, strM52, jI2, zzaihVar);
            case 22:
                int iT22 = aj0.T(parcel);
                String strM53 = null;
                String strM54 = null;
                String strM55 = null;
                while (parcel.dataPosition() < iT22) {
                    int i22 = parcel.readInt();
                    char c12 = (char) i22;
                    if (c12 == 2) {
                        bArrG = aj0.g(parcel, i22);
                    } else if (c12 == 3) {
                        strM53 = aj0.m(parcel, i22);
                    } else if (c12 == 4) {
                        strM54 = aj0.m(parcel, i22);
                    } else if (c12 != 5) {
                        aj0.P(parcel, i22);
                    } else {
                        strM55 = aj0.m(parcel, i22);
                    }
                }
                aj0.s(parcel, iT22);
                return new PublicKeyCredentialUserEntity(strM53, strM54, strM55, bArrG);
            case 23:
                int iT23 = aj0.T(parcel);
                String strM56 = null;
                while (parcel.dataPosition() < iT23) {
                    int i23 = parcel.readInt();
                    char c13 = (char) i23;
                    if (c13 == 1) {
                        strM7 = aj0.m(parcel, i23);
                    } else if (c13 != 2) {
                        aj0.P(parcel, i23);
                    } else {
                        strM56 = aj0.m(parcel, i23);
                    }
                }
                aj0.s(parcel, iT23);
                return new TwitterAuthCredential(strM7, strM56);
            case 24:
                String string = parcel.readString();
                if (string == null) {
                    string = BuildConfig.FLAVOR;
                }
                try {
                    return ResidentKeyRequirement.a(string);
                } catch (li1 e2) {
                    sm0.n(e2);
                    return null;
                }
            case 25:
                int iT24 = aj0.T(parcel);
                boolean zC6 = false;
                String strM57 = null;
                while (parcel.dataPosition() < iT24) {
                    int i24 = parcel.readInt();
                    char c14 = (char) i24;
                    if (c14 == 2) {
                        strM6 = aj0.m(parcel, i24);
                    } else if (c14 == 3) {
                        strM57 = aj0.m(parcel, i24);
                    } else if (c14 == 4) {
                        zC2 = aj0.C(parcel, i24);
                    } else if (c14 != 5) {
                        aj0.P(parcel, i24);
                    } else {
                        zC6 = aj0.C(parcel, i24);
                    }
                }
                aj0.s(parcel, iT24);
                UserProfileChangeRequest userProfileChangeRequest = new UserProfileChangeRequest();
                userProfileChangeRequest.a = strM6;
                userProfileChangeRequest.b = strM57;
                userProfileChangeRequest.c = zC2;
                userProfileChangeRequest.d = zC6;
                if (!TextUtils.isEmpty(strM57)) {
                    Uri.parse(strM57);
                }
                return userProfileChangeRequest;
            case 26:
                int iT25 = aj0.T(parcel);
                while (parcel.dataPosition() < iT25) {
                    int i25 = parcel.readInt();
                    char c15 = (char) i25;
                    if (c15 == 1) {
                        aj0.G(parcel, i25);
                    } else if (c15 == 2) {
                        strM5 = aj0.m(parcel, i25);
                    } else if (c15 != 3) {
                        aj0.P(parcel, i25);
                    } else {
                        iG = aj0.G(parcel, i25);
                    }
                }
                aj0.s(parcel, iT25);
                return new zzav(strM5, iG);
            case 27:
                int iT26 = aj0.T(parcel);
                while (parcel.dataPosition() < iT26) {
                    int i26 = parcel.readInt();
                    if (((char) i26) != 1) {
                        aj0.P(parcel, i26);
                    } else {
                        strM4 = aj0.m(parcel, i26);
                    }
                }
                aj0.s(parcel, iT26);
                return new zzaw(strM4);
            case 28:
                int iT27 = aj0.T(parcel);
                while (parcel.dataPosition() < iT27) {
                    int i27 = parcel.readInt();
                    char c16 = (char) i27;
                    if (c16 == 1) {
                        aj0.G(parcel, i27);
                    } else if (c16 != 2) {
                        aj0.P(parcel, i27);
                    } else {
                        strM3 = aj0.m(parcel, i27);
                    }
                }
                aj0.s(parcel, iT27);
                return new zzax(strM3);
            default:
                int iT28 = aj0.T(parcel);
                String strM58 = null;
                while (parcel.dataPosition() < iT28) {
                    int i28 = parcel.readInt();
                    char c17 = (char) i28;
                    if (c17 == 2) {
                        strM2 = aj0.m(parcel, i28);
                    } else if (c17 != 3) {
                        aj0.P(parcel, i28);
                    } else {
                        strM58 = aj0.m(parcel, i28);
                    }
                }
                aj0.s(parcel, iT28);
                return new TokenBinding(strM2, strM58);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new zzaij[i];
            case 1:
                return new zzai[i];
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                return new com.google.android.gms.common.internal.zzai[i];
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                return new GithubAuthCredential[i];
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                return new GoogleAuthCredential[i];
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                return new zzaj[i];
            case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                return new zzak[i];
            case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                return new com.google.firebase.auth.zzao[i];
            case oc1.BYTES_FIELD_NUMBER /* 8 */:
                return new zzao[i];
            case 9:
                return new PublicKeyCredentialCreationOptions[i];
            case 10:
                return new PublicKeyCredential[i];
            case 11:
                return new com.google.android.gms.measurement.internal.zzao[i];
            case 12:
                return new PhoneAuthCredential[i];
            case 13:
                return new PublicKeyCredentialDescriptor[i];
            case 14:
                return new PublicKeyCredentialParameters[i];
            case 15:
                return new zzaq[i];
            case 16:
                return new PhoneMultiFactorInfo[i];
            case 17:
                return new PublicKeyCredentialRequestOptions[i];
            case 18:
                return new PlayGamesAuthCredential[i];
            case 19:
                return new PublicKeyCredentialRpEntity[i];
            case 20:
                return new PublicKeyCredentialType[i];
            case 21:
                return new TotpMultiFactorInfo[i];
            case 22:
                return new PublicKeyCredentialUserEntity[i];
            case 23:
                return new TwitterAuthCredential[i];
            case 24:
                return new ResidentKeyRequirement[i];
            case 25:
                return new UserProfileChangeRequest[i];
            case 26:
                return new zzav[i];
            case 27:
                return new zzaw[i];
            case 28:
                return new zzax[i];
            default:
                return new TokenBinding[i];
        }
    }
}
