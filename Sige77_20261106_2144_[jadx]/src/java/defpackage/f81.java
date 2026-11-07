package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import androidx.activity.result.ActivityResult;
import androidx.databinding.ObservableParcelable;
import com.facebook.AccessToken;
import com.facebook.AuthenticationToken;
import com.facebook.AuthenticationTokenClaims;
import com.facebook.AuthenticationTokenHeader;
import com.facebook.login.CustomTabLoginMethodHandler;
import com.facebook.share.model.AppGroupCreationContent;
import com.facebook.share.model.CameraEffectArguments;
import com.facebook.share.model.CameraEffectTextures;
import com.google.android.gms.auth.blockstore.restorecredential.ClearRestoreCredentialRequest;
import com.google.android.gms.auth.blockstore.restorecredential.CreateRestoreCredentialRequest;
import com.google.android.gms.auth.blockstore.restorecredential.CreateRestoreCredentialResponse;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.ComplianceOptions;
import com.google.android.gms.identitycredentials.CallingAppInfoParcelable;
import com.google.android.gms.identitycredentials.ClearCreationOptionsResponse;
import com.google.android.gms.identitycredentials.ClearCredentialStateRequest;
import com.google.android.gms.identitycredentials.ClearCredentialStateResponse;
import com.google.android.gms.identitycredentials.ClearExportRequest;
import com.google.android.gms.identitycredentials.ClearExportResponse;
import com.google.android.gms.identitycredentials.ClearRegistryResponse;
import com.google.android.gms.identitycredentials.CreateCredentialHandle;
import com.google.android.gms.identitycredentials.CreateCredentialRequest;
import com.google.android.gms.identitycredentials.CreateCredentialResponse;
import com.google.android.gms.identitycredentials.Credential;
import com.google.android.gms.identitycredentials.CredentialOption;
import com.google.android.gms.identitycredentials.CredentialTransferCapabilities;
import com.google.android.material.badge.BadgeState;
import com.google.android.material.datepicker.DateValidatorPointBackward;
import com.hjq.toast.BuildConfig;
import com.transsion.athena.data.AppIdData;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class f81 implements Parcelable.Creator {
    public static final f81 b = new f81(1);
    public final /* synthetic */ int a;

    public /* synthetic */ f81(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        ArrayList arrayList;
        boolean zC = false;
        boolean zC2 = false;
        boolean zC3 = false;
        boolean zC4 = false;
        boolean zC5 = false;
        ComplianceOptions complianceOptionsO = null;
        switch (this.a) {
            case 0:
                Parcelable parcelable = parcel.readParcelable(f81.class.getClassLoader());
                ObservableParcelable observableParcelable = new ObservableParcelable();
                observableParcelable.w = parcelable;
                return observableParcelable;
            case 1:
                int iDataPosition = parcel.dataPosition();
                if (parcel.readInt() != -204102970) {
                    parcel.setDataPosition(iDataPosition - 4);
                    return ApiMetadata.d;
                }
                int iT = aj0.T(parcel);
                while (parcel.dataPosition() < iT) {
                    int i = parcel.readInt();
                    char c = (char) i;
                    if (c == 1) {
                        complianceOptionsO = (ComplianceOptions) aj0.k(parcel, i, ComplianceOptions.CREATOR);
                    } else if (c != 2) {
                        aj0.P(parcel, i);
                    } else {
                        zC = aj0.C(parcel, i);
                    }
                }
                aj0.s(parcel, iT);
                return new ApiMetadata(complianceOptionsO, zC);
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                parcel.getClass();
                return new AccessToken(parcel);
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                return new ActivityResult(parcel);
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                parcel.getClass();
                return new AppGroupCreationContent(parcel);
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                AppIdData appIdData = new AppIdData();
                appIdData.e = new ArrayList();
                appIdData.a = parcel.readInt();
                appIdData.b = parcel.readString();
                return appIdData;
            case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                parcel.getClass();
                return new AuthenticationToken(parcel);
            case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                parcel.getClass();
                return new AuthenticationTokenClaims(parcel);
            case oc1.BYTES_FIELD_NUMBER /* 8 */:
                parcel.getClass();
                return new AuthenticationTokenHeader(parcel);
            case 9:
                BadgeState.State state = new BadgeState.State();
                state.w = 255;
                state.X = -2;
                state.Y = -2;
                state.Z = -2;
                state.f0 = Boolean.TRUE;
                state.a = parcel.readInt();
                state.b = (Integer) parcel.readSerializable();
                state.c = (Integer) parcel.readSerializable();
                state.d = (Integer) parcel.readSerializable();
                state.e = (Integer) parcel.readSerializable();
                state.f = (Integer) parcel.readSerializable();
                state.i = (Integer) parcel.readSerializable();
                state.v = (Integer) parcel.readSerializable();
                state.w = parcel.readInt();
                state.W = parcel.readString();
                state.X = parcel.readInt();
                state.Y = parcel.readInt();
                state.Z = parcel.readInt();
                state.b0 = parcel.readString();
                state.c0 = parcel.readString();
                state.d0 = parcel.readInt();
                state.e0 = (Integer) parcel.readSerializable();
                state.g0 = (Integer) parcel.readSerializable();
                state.h0 = (Integer) parcel.readSerializable();
                state.i0 = (Integer) parcel.readSerializable();
                state.j0 = (Integer) parcel.readSerializable();
                state.k0 = (Integer) parcel.readSerializable();
                state.l0 = (Integer) parcel.readSerializable();
                state.o0 = (Integer) parcel.readSerializable();
                state.m0 = (Integer) parcel.readSerializable();
                state.n0 = (Integer) parcel.readSerializable();
                state.f0 = (Boolean) parcel.readSerializable();
                state.a0 = (Locale) parcel.readSerializable();
                state.p0 = (Boolean) parcel.readSerializable();
                state.q0 = (Integer) parcel.readSerializable();
                return state;
            case 10:
                parcel.getClass();
                String string = parcel.readString();
                int i2 = parcel.readInt();
                if (i2 < 0) {
                    arrayList = null;
                } else if (i2 == 0) {
                    arrayList = new ArrayList();
                } else {
                    ArrayList arrayList2 = new ArrayList(i2);
                    for (int i3 = 0; i3 < i2; i3++) {
                        byte[] bArr = new byte[parcel.readInt()];
                        parcel.readByteArray(bArr);
                        arrayList2.add(bArr);
                    }
                    arrayList = arrayList2;
                }
                String string2 = parcel.readString();
                if (string == null || arrayList == null) {
                    return null;
                }
                return new CallingAppInfoParcelable(string, arrayList, string2);
            case 11:
                parcel.getClass();
                return new CameraEffectArguments(parcel);
            case 12:
                parcel.getClass();
                return new CameraEffectTextures(parcel);
            case 13:
                int iT2 = aj0.T(parcel);
                while (parcel.dataPosition() < iT2) {
                    int i4 = parcel.readInt();
                    if (((char) i4) != 1) {
                        aj0.P(parcel, i4);
                    } else {
                        zC5 = aj0.C(parcel, i4);
                    }
                }
                aj0.s(parcel, iT2);
                return new ClearCreationOptionsResponse(zC5);
            case 14:
                int iT3 = aj0.T(parcel);
                while (parcel.dataPosition() < iT3) {
                    aj0.P(parcel, parcel.readInt());
                }
                aj0.s(parcel, iT3);
                return new ClearCredentialStateRequest();
            case 15:
                int iT4 = aj0.T(parcel);
                while (parcel.dataPosition() < iT4) {
                    aj0.P(parcel, parcel.readInt());
                }
                aj0.s(parcel, iT4);
                return new ClearCredentialStateResponse();
            case 16:
                int iT5 = aj0.T(parcel);
                while (parcel.dataPosition() < iT5) {
                    int i5 = parcel.readInt();
                    char c2 = (char) i5;
                    if (c2 == 1) {
                        zC4 = aj0.C(parcel, i5);
                    } else if (c2 != 2) {
                        aj0.P(parcel, i5);
                    } else {
                        complianceOptionsO = aj0.o(parcel, i5);
                    }
                }
                aj0.s(parcel, iT5);
                return new ClearExportRequest(complianceOptionsO, zC4);
            case 17:
                int iT6 = aj0.T(parcel);
                while (parcel.dataPosition() < iT6) {
                    int i6 = parcel.readInt();
                    if (((char) i6) != 1) {
                        aj0.P(parcel, i6);
                    } else {
                        zC3 = aj0.C(parcel, i6);
                    }
                }
                aj0.s(parcel, iT6);
                return new ClearExportResponse(zC3);
            case 18:
                int iT7 = aj0.T(parcel);
                while (parcel.dataPosition() < iT7) {
                    int i7 = parcel.readInt();
                    if (((char) i7) != 1) {
                        aj0.P(parcel, i7);
                    } else {
                        zC2 = aj0.C(parcel, i7);
                    }
                }
                aj0.s(parcel, iT7);
                return new ClearRegistryResponse(zC2);
            case 19:
                int iT8 = aj0.T(parcel);
                while (parcel.dataPosition() < iT8) {
                    int i8 = parcel.readInt();
                    if (((char) i8) != 1) {
                        aj0.P(parcel, i8);
                    } else {
                        complianceOptionsO = aj0.f(parcel, i8);
                    }
                }
                aj0.s(parcel, iT8);
                return new ClearRestoreCredentialRequest(complianceOptionsO);
            case 20:
                int iT9 = aj0.T(parcel);
                CreateCredentialResponse createCredentialResponse = null;
                while (parcel.dataPosition() < iT9) {
                    int i9 = parcel.readInt();
                    char c3 = (char) i9;
                    if (c3 == 1) {
                        complianceOptionsO = (PendingIntent) aj0.k(parcel, i9, PendingIntent.CREATOR);
                    } else if (c3 != 2) {
                        aj0.P(parcel, i9);
                    } else {
                        createCredentialResponse = (CreateCredentialResponse) aj0.k(parcel, i9, CreateCredentialResponse.CREATOR);
                    }
                }
                aj0.s(parcel, iT9);
                return new CreateCredentialHandle(complianceOptionsO, createCredentialResponse);
            case 21:
                int iT10 = aj0.T(parcel);
                String strM = null;
                Bundle bundleF = null;
                Bundle bundleF2 = null;
                String strM2 = null;
                String strM3 = null;
                ResultReceiver resultReceiver = null;
                while (parcel.dataPosition() < iT10) {
                    int i10 = parcel.readInt();
                    switch ((char) i10) {
                        case 1:
                            strM = aj0.m(parcel, i10);
                            break;
                        case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                            bundleF = aj0.f(parcel, i10);
                            break;
                        case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                            bundleF2 = aj0.f(parcel, i10);
                            break;
                        case oc1.LONG_FIELD_NUMBER /* 4 */:
                            strM2 = aj0.m(parcel, i10);
                            break;
                        case oc1.STRING_FIELD_NUMBER /* 5 */:
                            strM3 = aj0.m(parcel, i10);
                            break;
                        case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                            resultReceiver = (ResultReceiver) aj0.k(parcel, i10, ResultReceiver.CREATOR);
                            break;
                        default:
                            aj0.P(parcel, i10);
                            break;
                    }
                }
                aj0.s(parcel, iT10);
                return new CreateCredentialRequest(strM, bundleF, bundleF2, strM2, strM3, resultReceiver);
            case 22:
                int iT11 = aj0.T(parcel);
                Bundle bundleF3 = null;
                while (parcel.dataPosition() < iT11) {
                    int i11 = parcel.readInt();
                    char c4 = (char) i11;
                    if (c4 == 1) {
                        complianceOptionsO = aj0.m(parcel, i11);
                    } else if (c4 != 2) {
                        aj0.P(parcel, i11);
                    } else {
                        bundleF3 = aj0.f(parcel, i11);
                    }
                }
                aj0.s(parcel, iT11);
                return new CreateCredentialResponse(complianceOptionsO, bundleF3);
            case 23:
                int iT12 = aj0.T(parcel);
                while (parcel.dataPosition() < iT12) {
                    int i12 = parcel.readInt();
                    if (((char) i12) != 1) {
                        aj0.P(parcel, i12);
                    } else {
                        complianceOptionsO = aj0.f(parcel, i12);
                    }
                }
                aj0.s(parcel, iT12);
                return new CreateRestoreCredentialRequest(complianceOptionsO);
            case 24:
                int iT13 = aj0.T(parcel);
                while (parcel.dataPosition() < iT13) {
                    int i13 = parcel.readInt();
                    if (((char) i13) != 1) {
                        aj0.P(parcel, i13);
                    } else {
                        complianceOptionsO = aj0.f(parcel, i13);
                    }
                }
                aj0.s(parcel, iT13);
                return new CreateRestoreCredentialResponse(complianceOptionsO);
            case 25:
                int iT14 = aj0.T(parcel);
                Bundle bundleF4 = null;
                while (parcel.dataPosition() < iT14) {
                    int i14 = parcel.readInt();
                    char c5 = (char) i14;
                    if (c5 == 1) {
                        complianceOptionsO = aj0.m(parcel, i14);
                    } else if (c5 != 2) {
                        aj0.P(parcel, i14);
                    } else {
                        bundleF4 = aj0.f(parcel, i14);
                    }
                }
                aj0.s(parcel, iT14);
                return new Credential(complianceOptionsO, bundleF4);
            case 26:
                int iT15 = aj0.T(parcel);
                String strM4 = BuildConfig.FLAVOR;
                String strM5 = strM4;
                String strM6 = strM5;
                Bundle bundleF5 = null;
                Bundle bundleF6 = null;
                String strM7 = null;
                while (parcel.dataPosition() < iT15) {
                    int i15 = parcel.readInt();
                    switch ((char) i15) {
                        case 1:
                            strM4 = aj0.m(parcel, i15);
                            break;
                        case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                            bundleF5 = aj0.f(parcel, i15);
                            break;
                        case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                            bundleF6 = aj0.f(parcel, i15);
                            break;
                        case oc1.LONG_FIELD_NUMBER /* 4 */:
                            strM7 = aj0.m(parcel, i15);
                            break;
                        case oc1.STRING_FIELD_NUMBER /* 5 */:
                            strM5 = aj0.m(parcel, i15);
                            break;
                        case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                            strM6 = aj0.m(parcel, i15);
                            break;
                        default:
                            aj0.P(parcel, i15);
                            break;
                    }
                }
                aj0.s(parcel, iT15);
                return new CredentialOption(strM4, bundleF5, bundleF6, strM7, strM5, strM6);
            case 27:
                int iT16 = aj0.T(parcel);
                while (parcel.dataPosition() < iT16) {
                    int i16 = parcel.readInt();
                    if (((char) i16) != 1) {
                        aj0.P(parcel, i16);
                    } else {
                        complianceOptionsO = aj0.f(parcel, i16);
                    }
                }
                aj0.s(parcel, iT16);
                return new CredentialTransferCapabilities(complianceOptionsO);
            case 28:
                parcel.getClass();
                return new CustomTabLoginMethodHandler(parcel);
            default:
                return new DateValidatorPointBackward(parcel.readLong());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new ObservableParcelable[i];
            case 1:
                return new ApiMetadata[i];
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                return new AccessToken[i];
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                return new ActivityResult[i];
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                return new AppGroupCreationContent[i];
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                return new AppIdData[i];
            case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                return new AuthenticationToken[i];
            case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                return new AuthenticationTokenClaims[i];
            case oc1.BYTES_FIELD_NUMBER /* 8 */:
                return new AuthenticationTokenHeader[i];
            case 9:
                return new BadgeState.State[i];
            case 10:
                return new CallingAppInfoParcelable[i];
            case 11:
                return new CameraEffectArguments[i];
            case 12:
                return new CameraEffectTextures[i];
            case 13:
                return new ClearCreationOptionsResponse[i];
            case 14:
                return new ClearCredentialStateRequest[i];
            case 15:
                return new ClearCredentialStateResponse[i];
            case 16:
                return new ClearExportRequest[i];
            case 17:
                return new ClearExportResponse[i];
            case 18:
                return new ClearRegistryResponse[i];
            case 19:
                return new ClearRestoreCredentialRequest[i];
            case 20:
                return new CreateCredentialHandle[i];
            case 21:
                return new CreateCredentialRequest[i];
            case 22:
                return new CreateCredentialResponse[i];
            case 23:
                return new CreateRestoreCredentialRequest[i];
            case 24:
                return new CreateRestoreCredentialResponse[i];
            case 25:
                return new Credential[i];
            case 26:
                return new CredentialOption[i];
            case 27:
                return new CredentialTransferCapabilities[i];
            case 28:
                return new CustomTabLoginMethodHandler[i];
            default:
                return new DateValidatorPointBackward[i];
        }
    }
}
