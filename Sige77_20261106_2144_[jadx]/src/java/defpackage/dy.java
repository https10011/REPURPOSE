package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import androidx.activity.result.IntentSenderRequest;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.login.DeviceAuthMethodHandler;
import com.facebook.login.GetTokenLoginMethodHandler;
import com.facebook.login.InstagramAppLoginMethodHandler;
import com.facebook.login.KatanaProxyLoginMethodHandler;
import com.facebook.share.model.GameRequestContent;
import com.google.android.gms.auth.blockstore.restorecredential.GetRestoreCredentialRequest;
import com.google.android.gms.auth.blockstore.restorecredential.GetRestoreCredentialResponse;
import com.google.android.gms.identitycredentials.Credential;
import com.google.android.gms.identitycredentials.CredentialOption;
import com.google.android.gms.identitycredentials.ExportCredentialsToDeviceSetupRequest;
import com.google.android.gms.identitycredentials.ExportCredentialsToDeviceSetupResponse;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import com.google.android.gms.identitycredentials.GetCredentialResponse;
import com.google.android.gms.identitycredentials.GetCredentialTransferCapabilitiesRequest;
import com.google.android.gms.identitycredentials.ImportCredentialsForDeviceSetupRequest;
import com.google.android.gms.identitycredentials.ImportCredentialsForDeviceSetupResponse;
import com.google.android.gms.identitycredentials.ImportCredentialsRequest;
import com.google.android.gms.identitycredentials.ImportCredentialsResponse;
import com.google.android.material.datepicker.DateValidatorPointForward;
import com.linecorp.linesdk.LineAccessToken;
import com.linecorp.linesdk.LineApiError;
import com.linecorp.linesdk.LineCredential;
import com.linecorp.linesdk.LineFriendProfile;
import com.linecorp.linesdk.LineGroup;
import com.linecorp.linesdk.LineIdToken;
import com.linecorp.linesdk.LineProfile;
import com.linecorp.linesdk.auth.LineAuthenticationConfig;
import com.linecorp.linesdk.auth.LineAuthenticationParams;
import com.linecorp.linesdk.auth.LineLoginResult;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class dy implements Parcelable.Creator {
    public final /* synthetic */ int a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        Credential credentialF = null;
        switch (this.a) {
            case 0:
                return new DateValidatorPointForward(parcel.readLong());
            case 1:
                parcel.getClass();
                return new DeviceAuthMethodHandler(parcel);
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                int iT = aj0.T(parcel);
                Bundle bundleF = null;
                while (parcel.dataPosition() < iT) {
                    int i = parcel.readInt();
                    char c = (char) i;
                    if (c == 1) {
                        credentialF = (Uri) aj0.k(parcel, i, Uri.CREATOR);
                    } else if (c != 2) {
                        aj0.P(parcel, i);
                    } else {
                        bundleF = aj0.f(parcel, i);
                    }
                }
                aj0.s(parcel, iT);
                return new ExportCredentialsToDeviceSetupRequest(credentialF, bundleF);
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                int iT2 = aj0.T(parcel);
                while (parcel.dataPosition() < iT2) {
                    int i2 = parcel.readInt();
                    if (((char) i2) != 1) {
                        aj0.P(parcel, i2);
                    } else {
                        credentialF = aj0.f(parcel, i2);
                    }
                }
                aj0.s(parcel, iT2);
                return new ExportCredentialsToDeviceSetupResponse(credentialF);
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                parcel.getClass();
                return new FacebookRequestError(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (Object) null, (d90) null, false);
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                parcel.getClass();
                return new GameRequestContent(parcel);
            case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                int iT3 = aj0.T(parcel);
                Bundle bundleF2 = null;
                String strM = null;
                ResultReceiver resultReceiver = null;
                while (parcel.dataPosition() < iT3) {
                    int i3 = parcel.readInt();
                    char c2 = (char) i3;
                    if (c2 == 1) {
                        credentialF = aj0.q(parcel, i3, CredentialOption.CREATOR);
                    } else if (c2 == 2) {
                        bundleF2 = aj0.f(parcel, i3);
                    } else if (c2 == 3) {
                        strM = aj0.m(parcel, i3);
                    } else if (c2 != 4) {
                        aj0.P(parcel, i3);
                    } else {
                        resultReceiver = (ResultReceiver) aj0.k(parcel, i3, ResultReceiver.CREATOR);
                    }
                }
                aj0.s(parcel, iT3);
                return new GetCredentialRequest(credentialF, bundleF2, strM, resultReceiver);
            case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                int iT4 = aj0.T(parcel);
                while (parcel.dataPosition() < iT4) {
                    int i4 = parcel.readInt();
                    if (((char) i4) != 1) {
                        aj0.P(parcel, i4);
                    } else {
                        credentialF = (Credential) aj0.k(parcel, i4, Credential.CREATOR);
                    }
                }
                aj0.s(parcel, iT4);
                return new GetCredentialResponse(credentialF);
            case oc1.BYTES_FIELD_NUMBER /* 8 */:
                int iT5 = aj0.T(parcel);
                while (parcel.dataPosition() < iT5) {
                    int i5 = parcel.readInt();
                    if (((char) i5) != 1) {
                        aj0.P(parcel, i5);
                    } else {
                        credentialF = aj0.f(parcel, i5);
                    }
                }
                aj0.s(parcel, iT5);
                return new GetCredentialTransferCapabilitiesRequest(credentialF);
            case 9:
                int iT6 = aj0.T(parcel);
                while (parcel.dataPosition() < iT6) {
                    int i6 = parcel.readInt();
                    if (((char) i6) != 1) {
                        aj0.P(parcel, i6);
                    } else {
                        credentialF = aj0.f(parcel, i6);
                    }
                }
                aj0.s(parcel, iT6);
                return new GetRestoreCredentialRequest(credentialF);
            case 10:
                int iT7 = aj0.T(parcel);
                while (parcel.dataPosition() < iT7) {
                    int i7 = parcel.readInt();
                    if (((char) i7) != 1) {
                        aj0.P(parcel, i7);
                    } else {
                        credentialF = aj0.f(parcel, i7);
                    }
                }
                aj0.s(parcel, iT7);
                return new GetRestoreCredentialResponse(credentialF);
            case 11:
                parcel.getClass();
                return new GetTokenLoginMethodHandler(parcel);
            case 12:
                parcel.getClass();
                return new GraphRequest.ParcelableResourceWithMimeType(parcel);
            case 13:
                int iT8 = aj0.T(parcel);
                Uri uri = null;
                Bundle bundleF3 = null;
                while (parcel.dataPosition() < iT8) {
                    int i8 = parcel.readInt();
                    char c3 = (char) i8;
                    if (c3 == 1) {
                        credentialF = aj0.m(parcel, i8);
                    } else if (c3 == 2) {
                        uri = (Uri) aj0.k(parcel, i8, Uri.CREATOR);
                    } else if (c3 != 3) {
                        aj0.P(parcel, i8);
                    } else {
                        bundleF3 = aj0.f(parcel, i8);
                    }
                }
                aj0.s(parcel, iT8);
                return new ImportCredentialsForDeviceSetupRequest(credentialF, uri, bundleF3);
            case 14:
                int iT9 = aj0.T(parcel);
                while (parcel.dataPosition() < iT9) {
                    int i9 = parcel.readInt();
                    if (((char) i9) != 1) {
                        aj0.P(parcel, i9);
                    } else {
                        credentialF = aj0.f(parcel, i9);
                    }
                }
                aj0.s(parcel, iT9);
                return new ImportCredentialsForDeviceSetupResponse(credentialF);
            case 15:
                int iT10 = aj0.T(parcel);
                Uri uri2 = null;
                while (parcel.dataPosition() < iT10) {
                    int i10 = parcel.readInt();
                    char c4 = (char) i10;
                    if (c4 == 1) {
                        credentialF = aj0.m(parcel, i10);
                    } else if (c4 != 2) {
                        aj0.P(parcel, i10);
                    } else {
                        uri2 = (Uri) aj0.k(parcel, i10, Uri.CREATOR);
                    }
                }
                aj0.s(parcel, iT10);
                return new ImportCredentialsRequest(uri2, credentialF);
            case 16:
                int iT11 = aj0.T(parcel);
                while (parcel.dataPosition() < iT11) {
                    int i11 = parcel.readInt();
                    if (((char) i11) != 1) {
                        aj0.P(parcel, i11);
                    } else {
                        credentialF = aj0.m(parcel, i11);
                    }
                }
                aj0.s(parcel, iT11);
                return new ImportCredentialsResponse(credentialF);
            case 17:
                parcel.getClass();
                return new InstagramAppLoginMethodHandler(parcel);
            case 18:
                parcel.getClass();
                Parcelable parcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
                parcelable.getClass();
                return new IntentSenderRequest((IntentSender) parcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
            case 19:
                parcel.getClass();
                return new KatanaProxyLoginMethodHandler(parcel);
            case 20:
                return new LineAccessToken(parcel);
            case 21:
                return new LineApiError(parcel);
            case 22:
                return new LineAuthenticationConfig(parcel);
            case 23:
                return new LineAuthenticationParams(parcel);
            case 24:
                return new LineCredential(parcel);
            case 25:
                return new LineFriendProfile(parcel);
            case 26:
                return new LineGroup(parcel);
            case 27:
                return new LineIdToken(parcel);
            case 28:
                return new LineLoginResult(parcel);
            default:
                return new LineProfile(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new DateValidatorPointForward[i];
            case 1:
                return new DeviceAuthMethodHandler[i];
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                return new ExportCredentialsToDeviceSetupRequest[i];
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                return new ExportCredentialsToDeviceSetupResponse[i];
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                return new FacebookRequestError[i];
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                return new GameRequestContent[i];
            case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                return new GetCredentialRequest[i];
            case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                return new GetCredentialResponse[i];
            case oc1.BYTES_FIELD_NUMBER /* 8 */:
                return new GetCredentialTransferCapabilitiesRequest[i];
            case 9:
                return new GetRestoreCredentialRequest[i];
            case 10:
                return new GetRestoreCredentialResponse[i];
            case 11:
                return new GetTokenLoginMethodHandler[i];
            case 12:
                return new GraphRequest.ParcelableResourceWithMimeType[i];
            case 13:
                return new ImportCredentialsForDeviceSetupRequest[i];
            case 14:
                return new ImportCredentialsForDeviceSetupResponse[i];
            case 15:
                return new ImportCredentialsRequest[i];
            case 16:
                return new ImportCredentialsResponse[i];
            case 17:
                return new InstagramAppLoginMethodHandler[i];
            case 18:
                return new IntentSenderRequest[i];
            case 19:
                return new KatanaProxyLoginMethodHandler[i];
            case 20:
                return new LineAccessToken[i];
            case 21:
                return new LineApiError[i];
            case 22:
                return new LineAuthenticationConfig[i];
            case 23:
                return new LineAuthenticationParams[i];
            case 24:
                return new LineCredential[i];
            case 25:
                return new LineFriendProfile[i];
            case 26:
                return new LineGroup[i];
            case 27:
                return new LineIdToken[i];
            case 28:
                return new LineLoginResult[i];
            default:
                return new LineProfile[i];
        }
    }
}
