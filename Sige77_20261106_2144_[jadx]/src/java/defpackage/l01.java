package defpackage;

import android.app.PendingIntent;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.ParcelableVolumeInfo;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.databinding.ObservableBoolean;
import androidx.databinding.ObservableByte;
import androidx.databinding.ObservableChar;
import androidx.databinding.ObservableDouble;
import androidx.databinding.ObservableFloat;
import androidx.databinding.ObservableInt;
import androidx.databinding.ObservableLong;
import androidx.databinding.ObservableShort;
import androidx.versionedparcelable.ParcelImpl;
import com.facebook.Profile;
import com.facebook.login.LoginClient;
import com.facebook.login.LoginMethodHandler;
import com.google.android.gms.identitycredentials.PendingGetCredentialHandle;
import com.google.android.gms.identitycredentials.PendingImportCredentialsHandle;
import com.google.android.gms.identitycredentials.RegisterCreationOptionsRequest;
import com.google.android.gms.identitycredentials.RegisterCreationOptionsResponse;
import com.google.android.gms.identitycredentials.RegisterExportRequest;
import com.google.android.material.datepicker.RangeDateSelector;
import com.google.android.material.internal.ParcelableSparseBooleanArray;
import com.google.android.material.internal.ParcelableSparseIntArray;
import com.hjq.toast.BuildConfig;
import com.linecorp.linesdk.internal.pkce.PKCECode;
import com.linecorp.linesdk.openchat.OpenChatRoomInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class l01 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        Uri mediaUri;
        Bundle bundle;
        byte[] bArrG = null;
        PendingIntent pendingIntent = null;
        PendingIntent pendingIntent2 = null;
        switch (this.a) {
            case 0:
                parcel.getClass();
                LoginClient loginClient = new LoginClient();
                loginClient.b = -1;
                Parcelable[] parcelableArray = parcel.readParcelableArray(LoginMethodHandler.class.getClassLoader());
                if (parcelableArray == null) {
                    parcelableArray = new Parcelable[0];
                }
                ArrayList arrayList = new ArrayList();
                for (Parcelable parcelable : parcelableArray) {
                    LoginMethodHandler loginMethodHandler = parcelable instanceof LoginMethodHandler ? (LoginMethodHandler) parcelable : null;
                    if (loginMethodHandler != null) {
                        loginMethodHandler.b = loginClient;
                    }
                    if (loginMethodHandler != null) {
                        arrayList.add(loginMethodHandler);
                    }
                }
                loginClient.a = (LoginMethodHandler[]) arrayList.toArray(new LoginMethodHandler[0]);
                loginClient.b = parcel.readInt();
                loginClient.i = parcel.readParcelable(LoginClient.Request.class.getClassLoader());
                HashMap mapE = h42.E(parcel);
                loginClient.v = mapE != null ? new LinkedHashMap(mapE) : null;
                HashMap mapE2 = h42.E(parcel);
                loginClient.w = mapE2 != null ? new LinkedHashMap(mapE2) : null;
                return loginClient;
            case 1:
                return new MediaBrowserCompat.MediaItem(parcel);
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                Object objCreateFromParcel = MediaDescription.CREATOR.createFromParcel(parcel);
                if (objCreateFromParcel == null) {
                    return null;
                }
                MediaDescription mediaDescription = (MediaDescription) objCreateFromParcel;
                String mediaId = mediaDescription.getMediaId();
                CharSequence title = mediaDescription.getTitle();
                CharSequence subtitle = mediaDescription.getSubtitle();
                CharSequence description = mediaDescription.getDescription();
                Bitmap iconBitmap = mediaDescription.getIconBitmap();
                Uri iconUri = mediaDescription.getIconUri();
                Bundle extras = mediaDescription.getExtras();
                if (extras != null) {
                    extras.setClassLoader(y21.class.getClassLoader());
                    mediaUri = (Uri) extras.getParcelable("android.support.v4.media.description.MEDIA_URI");
                } else {
                    mediaUri = null;
                }
                if (mediaUri == null) {
                    bundle = extras;
                } else if (extras.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") && extras.size() == 2) {
                    bundle = null;
                } else {
                    extras.remove("android.support.v4.media.description.MEDIA_URI");
                    extras.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
                    bundle = extras;
                }
                if (mediaUri == null) {
                    mediaUri = mediaDescription.getMediaUri();
                }
                MediaDescriptionCompat mediaDescriptionCompat = new MediaDescriptionCompat(mediaId, title, subtitle, description, iconBitmap, iconUri, bundle, mediaUri);
                mediaDescriptionCompat.w = objCreateFromParcel;
                return mediaDescriptionCompat;
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                return new MediaMetadataCompat(parcel);
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                return new MediaSessionCompat.QueueItem(parcel);
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                MediaSessionCompat.ResultReceiverWrapper resultReceiverWrapper = new MediaSessionCompat.ResultReceiverWrapper();
                resultReceiverWrapper.a = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
                return resultReceiverWrapper;
            case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                return new MediaSessionCompat.Token(parcel.readParcelable(null));
            case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                boolean z = parcel.readInt() == 1;
                ObservableBoolean observableBoolean = new ObservableBoolean();
                observableBoolean.w = z;
                return observableBoolean;
            case oc1.BYTES_FIELD_NUMBER /* 8 */:
                byte b = parcel.readByte();
                ObservableByte observableByte = new ObservableByte();
                observableByte.w = b;
                return observableByte;
            case 9:
                char c = (char) parcel.readInt();
                ObservableChar observableChar = new ObservableChar();
                observableChar.w = c;
                return observableChar;
            case 10:
                double d = parcel.readDouble();
                ObservableDouble observableDouble = new ObservableDouble();
                observableDouble.w = d;
                return observableDouble;
            case 11:
                float f = parcel.readFloat();
                ObservableFloat observableFloat = new ObservableFloat();
                observableFloat.w = f;
                return observableFloat;
            case 12:
                int i = parcel.readInt();
                ObservableInt observableInt = new ObservableInt();
                observableInt.w = i;
                return observableInt;
            case 13:
                long j = parcel.readLong();
                ObservableLong observableLong = new ObservableLong();
                observableLong.w = j;
                return observableLong;
            case 14:
                short s = (short) parcel.readInt();
                ObservableShort observableShort = new ObservableShort();
                observableShort.w = s;
                return observableShort;
            case 15:
                parcel.getClass();
                return new OpenChatRoomInfo(parcel.readString(), parcel.readString());
            case 16:
                return new PKCECode(parcel);
            case 17:
                return new ParcelImpl(parcel);
            case 18:
                int i2 = parcel.readInt();
                ParcelableSparseBooleanArray parcelableSparseBooleanArray = new ParcelableSparseBooleanArray(i2);
                int[] iArr = new int[i2];
                boolean[] zArr = new boolean[i2];
                parcel.readIntArray(iArr);
                parcel.readBooleanArray(zArr);
                for (int i3 = 0; i3 < i2; i3++) {
                    parcelableSparseBooleanArray.put(iArr[i3], zArr[i3]);
                }
                return parcelableSparseBooleanArray;
            case 19:
                int i4 = parcel.readInt();
                ParcelableSparseIntArray parcelableSparseIntArray = new ParcelableSparseIntArray(i4);
                int[] iArr2 = new int[i4];
                int[] iArr3 = new int[i4];
                parcel.readIntArray(iArr2);
                parcel.readIntArray(iArr3);
                for (int i5 = 0; i5 < i4; i5++) {
                    parcelableSparseIntArray.put(iArr2[i5], iArr3[i5]);
                }
                return parcelableSparseIntArray;
            case 20:
                ParcelableVolumeInfo parcelableVolumeInfo = new ParcelableVolumeInfo();
                parcelableVolumeInfo.a = parcel.readInt();
                parcelableVolumeInfo.c = parcel.readInt();
                parcelableVolumeInfo.d = parcel.readInt();
                parcelableVolumeInfo.e = parcel.readInt();
                parcelableVolumeInfo.b = parcel.readInt();
                return parcelableVolumeInfo;
            case 21:
                int iT = aj0.T(parcel);
                while (parcel.dataPosition() < iT) {
                    int i6 = parcel.readInt();
                    if (((char) i6) != 1) {
                        aj0.P(parcel, i6);
                    } else {
                        pendingIntent2 = (PendingIntent) aj0.k(parcel, i6, PendingIntent.CREATOR);
                    }
                }
                aj0.s(parcel, iT);
                return new PendingGetCredentialHandle(pendingIntent2);
            case 22:
                int iT2 = aj0.T(parcel);
                while (parcel.dataPosition() < iT2) {
                    int i7 = parcel.readInt();
                    if (((char) i7) != 1) {
                        aj0.P(parcel, i7);
                    } else {
                        pendingIntent = (PendingIntent) aj0.k(parcel, i7, PendingIntent.CREATOR);
                    }
                }
                aj0.s(parcel, iT2);
                return new PendingImportCredentialsHandle(pendingIntent);
            case 23:
                return new PlaybackStateCompat(parcel);
            case 24:
                parcel.getClass();
                return new Profile(parcel);
            case 25:
                RangeDateSelector rangeDateSelector = new RangeDateSelector();
                rangeDateSelector.b = null;
                rangeDateSelector.c = null;
                rangeDateSelector.d = null;
                rangeDateSelector.e = null;
                rangeDateSelector.b = (Long) parcel.readValue(Long.class.getClassLoader());
                rangeDateSelector.c = (Long) parcel.readValue(Long.class.getClassLoader());
                return rangeDateSelector;
            case 26:
                return new RatingCompat(parcel.readInt(), parcel.readFloat());
            case 27:
                int iT3 = aj0.T(parcel);
                String strM = BuildConfig.FLAVOR;
                byte[] bArrG2 = null;
                byte[] bArrG3 = null;
                String strM2 = null;
                String strM3 = null;
                while (parcel.dataPosition() < iT3) {
                    int i8 = parcel.readInt();
                    char c2 = (char) i8;
                    if (c2 == 1) {
                        bArrG2 = aj0.g(parcel, i8);
                    } else if (c2 == 2) {
                        bArrG3 = aj0.g(parcel, i8);
                    } else if (c2 == 3) {
                        strM2 = aj0.m(parcel, i8);
                    } else if (c2 == 4) {
                        strM3 = aj0.m(parcel, i8);
                    } else if (c2 != 5) {
                        aj0.P(parcel, i8);
                    } else {
                        strM = aj0.m(parcel, i8);
                    }
                }
                aj0.s(parcel, iT3);
                return new RegisterCreationOptionsRequest(bArrG2, bArrG3, strM2, strM3, strM);
            case 28:
                int iT4 = aj0.T(parcel);
                while (parcel.dataPosition() < iT4) {
                    aj0.P(parcel, parcel.readInt());
                }
                aj0.s(parcel, iT4);
                return new RegisterCreationOptionsResponse();
            default:
                int iT5 = aj0.T(parcel);
                byte[] bArrG4 = null;
                String strM4 = null;
                while (parcel.dataPosition() < iT5) {
                    int i9 = parcel.readInt();
                    char c3 = (char) i9;
                    if (c3 == 1) {
                        bArrG = aj0.g(parcel, i9);
                    } else if (c3 == 2) {
                        bArrG4 = aj0.g(parcel, i9);
                    } else if (c3 != 3) {
                        aj0.P(parcel, i9);
                    } else {
                        strM4 = aj0.m(parcel, i9);
                    }
                }
                aj0.s(parcel, iT5);
                return new RegisterExportRequest(bArrG, bArrG4, strM4);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new LoginClient[i];
            case 1:
                return new MediaBrowserCompat.MediaItem[i];
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                return new MediaDescriptionCompat[i];
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                return new MediaMetadataCompat[i];
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                return new MediaSessionCompat.QueueItem[i];
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                return new MediaSessionCompat.ResultReceiverWrapper[i];
            case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                return new MediaSessionCompat.Token[i];
            case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                return new ObservableBoolean[i];
            case oc1.BYTES_FIELD_NUMBER /* 8 */:
                return new ObservableByte[i];
            case 9:
                return new ObservableChar[i];
            case 10:
                return new ObservableDouble[i];
            case 11:
                return new ObservableFloat[i];
            case 12:
                return new ObservableInt[i];
            case 13:
                return new ObservableLong[i];
            case 14:
                return new ObservableShort[i];
            case 15:
                return new OpenChatRoomInfo[i];
            case 16:
                return new PKCECode[i];
            case 17:
                return new ParcelImpl[i];
            case 18:
                return new ParcelableSparseBooleanArray[i];
            case 19:
                return new ParcelableSparseIntArray[i];
            case 20:
                return new ParcelableVolumeInfo[i];
            case 21:
                return new PendingGetCredentialHandle[i];
            case 22:
                return new PendingImportCredentialsHandle[i];
            case 23:
                return new PlaybackStateCompat[i];
            case 24:
                return new Profile[i];
            case 25:
                return new RangeDateSelector[i];
            case 26:
                return new RatingCompat[i];
            case 27:
                return new RegisterCreationOptionsRequest[i];
            case 28:
                return new RegisterCreationOptionsResponse[i];
            default:
                return new RegisterExportRequest[i];
        }
    }
}
