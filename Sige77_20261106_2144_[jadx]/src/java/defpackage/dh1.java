package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.support.v4.os.ResultReceiver;
import com.facebook.login.WebViewLoginMethodHandler;
import com.facebook.share.internal.ShareFeedContent;
import com.facebook.share.model.CameraEffectArguments;
import com.facebook.share.model.CameraEffectTextures;
import com.facebook.share.model.ShareCameraEffectContent;
import com.facebook.share.model.ShareHashtag;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareMediaContent;
import com.facebook.share.model.ShareMessengerURLActionButton;
import com.facebook.share.model.SharePhoto;
import com.facebook.share.model.SharePhotoContent;
import com.facebook.share.model.ShareStoryContent;
import com.facebook.share.model.ShareVideo;
import com.facebook.share.model.ShareVideoContent;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.common.internal.zaaa;
import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;
import com.google.android.gms.common.server.FavaDiagnosticsEntity;
import com.google.android.gms.identitycredentials.RegisterExportResponse;
import com.google.android.gms.identitycredentials.RegistrationRequest;
import com.google.android.gms.identitycredentials.RegistrationResponse;
import com.google.android.gms.identitycredentials.SignalCredentialStateRequest;
import com.google.android.gms.identitycredentials.SignalCredentialStateResponse;
import com.google.android.material.datepicker.SingleDateSelector;
import com.google.firebase.Timestamp;
import com.google.firebase.messaging.RemoteMessage;
import com.hjq.toast.BuildConfig;
import com.transsion.athena.data.TrackData;
import com.transsion.athena.data.TrackDataWrapper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class dh1 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ dh1(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iG = 0;
        int iG2 = 0;
        int iG3 = 0;
        int iG4 = 0;
        boolean zC = false;
        int iG5 = 0;
        int iG6 = 0;
        Bundle bundleF = null;
        ArrayList arrayListQ = null;
        String strM = null;
        String strM2 = null;
        jn0 jn0Var = null;
        switch (this.a) {
            case 0:
                int iT = aj0.T(parcel);
                while (parcel.dataPosition() < iT) {
                    aj0.P(parcel, parcel.readInt());
                }
                aj0.s(parcel, iT);
                return new RegisterExportResponse();
            case 1:
                int iT2 = aj0.T(parcel);
                List listO = Collections.EMPTY_LIST;
                String strM3 = BuildConfig.FLAVOR;
                String strM4 = strM3;
                String strM5 = strM4;
                String strM6 = strM5;
                byte[] bArrG = null;
                byte[] bArrG2 = null;
                while (parcel.dataPosition() < iT2) {
                    int i = parcel.readInt();
                    switch ((char) i) {
                        case 1:
                            bArrG = aj0.g(parcel, i);
                            break;
                        case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                            bArrG2 = aj0.g(parcel, i);
                            break;
                        case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                            strM3 = aj0.m(parcel, i);
                            break;
                        case oc1.LONG_FIELD_NUMBER /* 4 */:
                            strM4 = aj0.m(parcel, i);
                            break;
                        case oc1.STRING_FIELD_NUMBER /* 5 */:
                            listO = aj0.o(parcel, i);
                            break;
                        case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                            strM5 = aj0.m(parcel, i);
                            break;
                        case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                            strM6 = aj0.m(parcel, i);
                            break;
                        default:
                            aj0.P(parcel, i);
                            break;
                    }
                }
                aj0.s(parcel, iT2);
                return new RegistrationRequest(bArrG, bArrG2, strM3, strM4, listO, strM5, strM6);
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                int iT3 = aj0.T(parcel);
                while (parcel.dataPosition() < iT3) {
                    aj0.P(parcel, parcel.readInt());
                }
                aj0.s(parcel, iT3);
                return new RegistrationResponse();
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                int iT4 = aj0.T(parcel);
                while (parcel.dataPosition() < iT4) {
                    int i2 = parcel.readInt();
                    if (((char) i2) != 2) {
                        aj0.P(parcel, i2);
                    } else {
                        bundleF = aj0.f(parcel, i2);
                    }
                }
                aj0.s(parcel, iT4);
                return new RemoteMessage(bundleF);
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                ResultReceiver resultReceiver = new ResultReceiver();
                IBinder strongBinder = parcel.readStrongBinder();
                int i3 = tj1.b;
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface(jn0.g);
                    if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof jn0)) {
                        in0 in0Var = new in0();
                        in0Var.a = strongBinder;
                        jn0Var = in0Var;
                    } else {
                        jn0Var = (jn0) iInterfaceQueryLocalInterface;
                    }
                }
                resultReceiver.a = jn0Var;
                return resultReceiver;
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                parcel.getClass();
                ShareCameraEffectContent shareCameraEffectContent = new ShareCameraEffectContent(parcel);
                shareCameraEffectContent.i = parcel.readString();
                ox1 ox1Var = new ox1();
                CameraEffectArguments parcelable = parcel.readParcelable(CameraEffectArguments.class.getClassLoader());
                if (parcelable != null) {
                    ((Bundle) ox1Var.a).putAll(parcelable.a);
                }
                shareCameraEffectContent.v = new CameraEffectArguments(ox1Var);
                ri2 ri2Var = new ri2(6);
                CameraEffectTextures parcelable2 = parcel.readParcelable(CameraEffectTextures.class.getClassLoader());
                if (parcelable2 != null) {
                    ((Bundle) ri2Var.a).putAll(parcelable2.a);
                }
                shareCameraEffectContent.w = new CameraEffectTextures(ri2Var);
                return shareCameraEffectContent;
            case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                parcel.getClass();
                return new ShareFeedContent(parcel);
            case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                parcel.getClass();
                return new ShareHashtag(parcel);
            case oc1.BYTES_FIELD_NUMBER /* 8 */:
                parcel.getClass();
                return new ShareLinkContent(parcel);
            case 9:
                parcel.getClass();
                return new ShareMediaContent(parcel);
            case 10:
                parcel.getClass();
                return new ShareMessengerURLActionButton(parcel);
            case 11:
                parcel.getClass();
                return new SharePhoto(parcel);
            case 12:
                parcel.getClass();
                return new SharePhotoContent(parcel);
            case 13:
                parcel.getClass();
                return new ShareStoryContent(parcel);
            case 14:
                parcel.getClass();
                return new ShareVideo(parcel);
            case 15:
                parcel.getClass();
                return new ShareVideoContent(parcel);
            case 16:
                int iT5 = aj0.T(parcel);
                String strM7 = null;
                Bundle bundleF2 = null;
                while (parcel.dataPosition() < iT5) {
                    int i4 = parcel.readInt();
                    char c = (char) i4;
                    if (c == 1) {
                        strM2 = aj0.m(parcel, i4);
                    } else if (c == 2) {
                        strM7 = aj0.m(parcel, i4);
                    } else if (c != 3) {
                        aj0.P(parcel, i4);
                    } else {
                        bundleF2 = aj0.f(parcel, i4);
                    }
                }
                aj0.s(parcel, iT5);
                return new SignalCredentialStateRequest(strM2, strM7, bundleF2);
            case 17:
                int iT6 = aj0.T(parcel);
                while (parcel.dataPosition() < iT6) {
                    aj0.P(parcel, parcel.readInt());
                }
                aj0.s(parcel, iT6);
                return new SignalCredentialStateResponse();
            case 18:
                SingleDateSelector singleDateSelector = new SingleDateSelector();
                singleDateSelector.a = (Long) parcel.readValue(Long.class.getClassLoader());
                return singleDateSelector;
            case 19:
                parcel.getClass();
                return new Timestamp(parcel.readInt(), parcel.readLong());
            case 20:
                TrackData trackData = new TrackData();
                trackData.b = 0;
                trackData.c = 1.0f;
                try {
                    trackData.b = parcel.readInt();
                    trackData.a = new JSONObject(parcel.readString());
                    trackData.c = parcel.readFloat();
                    break;
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                return trackData;
            case 21:
                TrackDataWrapper trackDataWrapper = new TrackDataWrapper();
                trackDataWrapper.a = parcel.readString();
                trackDataWrapper.b = (TrackData) parcel.readParcelable(TrackData.class.getClassLoader());
                trackDataWrapper.c = parcel.readLong();
                return trackDataWrapper;
            case 22:
                parcel.getClass();
                return new WebViewLoginMethodHandler(parcel);
            case 23:
                int iT7 = aj0.T(parcel);
                Bundle bundleF3 = null;
                int iG7 = 0;
                while (parcel.dataPosition() < iT7) {
                    int i5 = parcel.readInt();
                    char c2 = (char) i5;
                    if (c2 == 1) {
                        iG = aj0.G(parcel, i5);
                    } else if (c2 == 2) {
                        iG7 = aj0.G(parcel, i5);
                    } else if (c2 != 3) {
                        aj0.P(parcel, i5);
                    } else {
                        bundleF3 = aj0.f(parcel, i5);
                    }
                }
                aj0.s(parcel, iT7);
                return new GoogleSignInOptionsExtensionParcelable(iG, iG7, bundleF3);
            case 24:
                int iT8 = aj0.T(parcel);
                ParcelFileDescriptor parcelFileDescriptor = null;
                int iG8 = 0;
                while (parcel.dataPosition() < iT8) {
                    int i6 = parcel.readInt();
                    char c3 = (char) i6;
                    if (c3 == 1) {
                        iG6 = aj0.G(parcel, i6);
                    } else if (c3 == 2) {
                        parcelFileDescriptor = (ParcelFileDescriptor) aj0.k(parcel, i6, ParcelFileDescriptor.CREATOR);
                    } else if (c3 != 3) {
                        aj0.P(parcel, i6);
                    } else {
                        iG8 = aj0.G(parcel, i6);
                    }
                }
                aj0.s(parcel, iT8);
                return new BitmapTeleporter(iG6, parcelFileDescriptor, iG8);
            case 25:
                int iT9 = aj0.T(parcel);
                while (parcel.dataPosition() < iT9) {
                    int i7 = parcel.readInt();
                    char c4 = (char) i7;
                    if (c4 == 1) {
                        iG5 = aj0.G(parcel, i7);
                    } else if (c4 != 2) {
                        aj0.P(parcel, i7);
                    } else {
                        strM = aj0.m(parcel, i7);
                    }
                }
                aj0.s(parcel, iT9);
                return new ClientIdentity(iG5, strM);
            case 26:
                int iT10 = aj0.T(parcel);
                int iG9 = 0;
                while (parcel.dataPosition() < iT10) {
                    int i8 = parcel.readInt();
                    char c5 = (char) i8;
                    if (c5 == 1) {
                        zC = aj0.C(parcel, i8);
                    } else if (c5 != 2) {
                        aj0.P(parcel, i8);
                    } else {
                        iG9 = aj0.G(parcel, i8);
                    }
                }
                aj0.s(parcel, iT10);
                return new ModuleAvailabilityResponse(iG9, zC);
            case 27:
                int iT11 = aj0.T(parcel);
                String strM8 = null;
                int iG10 = 0;
                while (parcel.dataPosition() < iT11) {
                    int i9 = parcel.readInt();
                    char c6 = (char) i9;
                    if (c6 == 1) {
                        iG4 = aj0.G(parcel, i9);
                    } else if (c6 == 2) {
                        strM8 = aj0.m(parcel, i9);
                    } else if (c6 != 3) {
                        aj0.P(parcel, i9);
                    } else {
                        iG10 = aj0.G(parcel, i9);
                    }
                }
                aj0.s(parcel, iT11);
                return new FavaDiagnosticsEntity(iG4, iG10, strM8);
            case 28:
                int iT12 = aj0.T(parcel);
                int iG11 = 0;
                Scope[] scopeArr = null;
                int iG12 = 0;
                while (parcel.dataPosition() < iT12) {
                    int i10 = parcel.readInt();
                    char c7 = (char) i10;
                    if (c7 == 1) {
                        iG3 = aj0.G(parcel, i10);
                    } else if (c7 == 2) {
                        iG12 = aj0.G(parcel, i10);
                    } else if (c7 == 3) {
                        iG11 = aj0.G(parcel, i10);
                    } else if (c7 != 4) {
                        aj0.P(parcel, i10);
                    } else {
                        scopeArr = (Scope[]) aj0.p(parcel, i10, Scope.CREATOR);
                    }
                }
                aj0.s(parcel, iT12);
                return new zaaa(iG3, iG12, iG11, scopeArr);
            default:
                int iT13 = aj0.T(parcel);
                while (parcel.dataPosition() < iT13) {
                    int i11 = parcel.readInt();
                    char c8 = (char) i11;
                    if (c8 == 1) {
                        iG2 = aj0.G(parcel, i11);
                    } else if (c8 != 2) {
                        aj0.P(parcel, i11);
                    } else {
                        arrayListQ = aj0.q(parcel, i11, MethodInvocation.CREATOR);
                    }
                }
                aj0.s(parcel, iT13);
                return new TelemetryData(iG2, arrayListQ);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new RegisterExportResponse[i];
            case 1:
                return new RegistrationRequest[i];
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                return new RegistrationResponse[i];
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                return new RemoteMessage[i];
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                return new ResultReceiver[i];
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                return new ShareCameraEffectContent[i];
            case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                return new ShareFeedContent[i];
            case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                return new ShareHashtag[i];
            case oc1.BYTES_FIELD_NUMBER /* 8 */:
                return new ShareLinkContent[i];
            case 9:
                return new ShareMediaContent[i];
            case 10:
                return new ShareMessengerURLActionButton[i];
            case 11:
                return new SharePhoto[i];
            case 12:
                return new SharePhotoContent[i];
            case 13:
                return new ShareStoryContent[i];
            case 14:
                return new ShareVideo[i];
            case 15:
                return new ShareVideoContent[i];
            case 16:
                return new SignalCredentialStateRequest[i];
            case 17:
                return new SignalCredentialStateResponse[i];
            case 18:
                return new SingleDateSelector[i];
            case 19:
                return new Timestamp[i];
            case 20:
                return new TrackData[i];
            case 21:
                return new TrackDataWrapper[i];
            case 22:
                return new WebViewLoginMethodHandler[i];
            case 23:
                return new GoogleSignInOptionsExtensionParcelable[i];
            case 24:
                return new BitmapTeleporter[i];
            case 25:
                return new ClientIdentity[i];
            case 26:
                return new ModuleAvailabilityResponse[i];
            case 27:
                return new FavaDiagnosticsEntity[i];
            case 28:
                return new zaaa[i];
            default:
                return new TelemetryData[i];
        }
    }
}
