package defpackage;

import android.accounts.Account;
import android.app.PendingIntent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.blockstore.StoreBytesData;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.BinderWrapper;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.zzj;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsCredPropsOutputs;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse;
import com.google.android.gms.fido.fido2.api.common.zzf;
import com.google.android.gms.fido.fido2.api.common.zzh;
import com.google.android.gms.fido.u2f.api.common.ChannelIdValue;
import com.google.android.gms.fido.u2f.api.common.KeyHandle;
import com.google.android.gms.fido.u2f.api.common.ProtocolVersion;
import com.google.android.gms.fido.u2f.api.common.RegisterRequest;
import com.google.android.gms.fido.u2f.api.common.RegisterRequestParams;
import com.google.android.gms.fido.u2f.api.common.RegisterResponseData;
import com.google.android.gms.fido.u2f.api.common.RegisteredKey;
import com.google.android.gms.fido.u2f.api.common.SignRequestParams;
import com.google.android.gms.fido.u2f.api.common.SignResponseData;
import com.google.android.gms.internal.measurement.zzjf;
import com.google.android.gms.internal.measurement.zzjh;
import com.google.android.gms.internal.measurement.zzjj;
import com.google.android.gms.internal.measurement.zzjl;
import com.google.android.gms.internal.measurement.zzjo;
import com.google.android.gms.internal.measurement.zzjq;
import com.google.android.gms.internal.measurement.zzjs;
import com.google.android.gms.internal.measurement.zzju;
import com.google.firebase.auth.EmailAuthCredential;
import com.google.firebase.auth.FacebookAuthCredential;
import java.util.ArrayList;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class jz2 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public static void a(GetServiceRequest getServiceRequest, Parcel parcel, int i) {
        int iO = bj0.O(parcel, 20293);
        int i2 = getServiceRequest.a;
        bj0.N(parcel, 1, 4);
        parcel.writeInt(i2);
        int i3 = getServiceRequest.b;
        bj0.N(parcel, 2, 4);
        parcel.writeInt(i3);
        int i4 = getServiceRequest.c;
        bj0.N(parcel, 3, 4);
        parcel.writeInt(i4);
        bj0.F(parcel, 4, getServiceRequest.d, false);
        bj0.A(parcel, 5, getServiceRequest.e);
        bj0.I(parcel, 6, getServiceRequest.f, i);
        bj0.w(parcel, 7, getServiceRequest.i);
        bj0.E(parcel, 8, getServiceRequest.v, i, false);
        bj0.I(parcel, 10, getServiceRequest.w, i);
        bj0.I(parcel, 11, getServiceRequest.W, i);
        boolean z = getServiceRequest.X;
        bj0.N(parcel, 12, 4);
        parcel.writeInt(z ? 1 : 0);
        int i5 = getServiceRequest.Y;
        bj0.N(parcel, 13, 4);
        parcel.writeInt(i5);
        boolean z2 = getServiceRequest.Z;
        bj0.N(parcel, 14, 4);
        parcel.writeInt(z2 ? 1 : 0);
        bj0.F(parcel, 15, getServiceRequest.a0, false);
        bj0.P(parcel, iO);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iG = 0;
        int iG2 = 0;
        int iG3 = 0;
        int iG4 = 0;
        boolean zC = false;
        int iG5 = 0;
        boolean zC2 = false;
        int iG6 = 0;
        boolean zC3 = false;
        int iG7 = 0;
        boolean zC4 = false;
        String strM = null;
        byte[] bArrG = null;
        String strM2 = null;
        byte[] bArrG2 = null;
        Bundle bundleF = null;
        ArrayList arrayListQ = null;
        String strM3 = null;
        byte[] bArrG3 = null;
        zzjo[] zzjoVarArr = null;
        KeyHandle keyHandle = null;
        byte[] bArrG4 = null;
        String strM4 = null;
        String strM5 = null;
        byte[] bArrG5 = null;
        byte[] bArrG6 = null;
        switch (this.a) {
            case 0:
                int iT = aj0.T(parcel);
                PendingIntent pendingIntent = null;
                ConnectionResult connectionResult = null;
                while (parcel.dataPosition() < iT) {
                    int i = parcel.readInt();
                    char c = (char) i;
                    if (c == 1) {
                        iG = aj0.G(parcel, i);
                    } else if (c == 2) {
                        strM = aj0.m(parcel, i);
                    } else if (c == 3) {
                        pendingIntent = (PendingIntent) aj0.k(parcel, i, PendingIntent.CREATOR);
                    } else if (c != 4) {
                        aj0.P(parcel, i);
                    } else {
                        connectionResult = (ConnectionResult) aj0.k(parcel, i, ConnectionResult.CREATOR);
                    }
                }
                aj0.s(parcel, iT);
                return new Status(iG, strM, pendingIntent, connectionResult);
            case 1:
                int iT2 = aj0.T(parcel);
                while (parcel.dataPosition() < iT2) {
                    int i2 = parcel.readInt();
                    if (((char) i2) != 1) {
                        aj0.P(parcel, i2);
                    } else {
                        zC4 = aj0.C(parcel, i2);
                    }
                }
                aj0.s(parcel, iT2);
                return new AuthenticationExtensionsCredPropsOutputs(zC4);
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                int iT3 = aj0.T(parcel);
                String strM6 = null;
                ArrayList arrayListQ2 = null;
                while (parcel.dataPosition() < iT3) {
                    int i3 = parcel.readInt();
                    char c2 = (char) i3;
                    if (c2 == 1) {
                        iG7 = aj0.G(parcel, i3);
                    } else if (c2 == 2) {
                        bArrG6 = aj0.g(parcel, i3);
                    } else if (c2 == 3) {
                        strM6 = aj0.m(parcel, i3);
                    } else if (c2 != 4) {
                        aj0.P(parcel, i3);
                    } else {
                        arrayListQ2 = aj0.q(parcel, i3, Transport.CREATOR);
                    }
                }
                aj0.s(parcel, iT3);
                return new KeyHandle(iG7, bArrG6, strM6, arrayListQ2);
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                int iT4 = aj0.T(parcel);
                String strM7 = "com.google.android.gms.auth.blockstore.DEFAULT_BYTES_DATA_KEY";
                while (parcel.dataPosition() < iT4) {
                    int i4 = parcel.readInt();
                    char c3 = (char) i4;
                    if (c3 == 1) {
                        bArrG5 = aj0.g(parcel, i4);
                    } else if (c3 == 2) {
                        zC3 = aj0.C(parcel, i4);
                    } else if (c3 != 3) {
                        aj0.P(parcel, i4);
                    } else {
                        strM7 = aj0.m(parcel, i4);
                    }
                }
                aj0.s(parcel, iT4);
                return new StoreBytesData(strM7, zC3, bArrG5);
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                try {
                    return ProtocolVersion.a(parcel.readString());
                } catch (xd1 e) {
                    sm0.n(e);
                    return null;
                }
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                int iT5 = aj0.T(parcel);
                boolean zC5 = false;
                String strM8 = null;
                String strM9 = null;
                String strM10 = null;
                String strM11 = null;
                while (parcel.dataPosition() < iT5) {
                    int i5 = parcel.readInt();
                    char c4 = (char) i5;
                    if (c4 == 1) {
                        strM8 = aj0.m(parcel, i5);
                    } else if (c4 == 2) {
                        strM9 = aj0.m(parcel, i5);
                    } else if (c4 == 3) {
                        strM10 = aj0.m(parcel, i5);
                    } else if (c4 == 4) {
                        strM11 = aj0.m(parcel, i5);
                    } else if (c4 != 5) {
                        aj0.P(parcel, i5);
                    } else {
                        zC5 = aj0.C(parcel, i5);
                    }
                }
                aj0.s(parcel, iT5);
                return new EmailAuthCredential(zC5, strM8, strM9, strM10, strM11);
            case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                int iT6 = aj0.T(parcel);
                byte[] bArrG7 = null;
                byte[] bArrG8 = null;
                while (parcel.dataPosition() < iT6) {
                    int i6 = parcel.readInt();
                    char c5 = (char) i6;
                    if (c5 == 1) {
                        bArrG7 = aj0.g(parcel, i6);
                    } else if (c5 != 2) {
                        aj0.P(parcel, i6);
                    } else {
                        bArrG8 = aj0.g(parcel, i6);
                    }
                }
                aj0.s(parcel, iT6);
                return new zzf(bArrG7 == null ? null : d33.h(bArrG7, bArrG7.length), bArrG8 != null ? d33.h(bArrG8, bArrG8.length) : null);
            case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                int iT7 = aj0.T(parcel);
                byte[] bArrG9 = null;
                String strM12 = null;
                while (parcel.dataPosition() < iT7) {
                    int i7 = parcel.readInt();
                    char c6 = (char) i7;
                    if (c6 == 1) {
                        iG6 = aj0.G(parcel, i7);
                    } else if (c6 == 2) {
                        strM5 = aj0.m(parcel, i7);
                    } else if (c6 == 3) {
                        bArrG9 = aj0.g(parcel, i7);
                    } else if (c6 != 4) {
                        aj0.P(parcel, i7);
                    } else {
                        strM12 = aj0.m(parcel, i7);
                    }
                }
                aj0.s(parcel, iT7);
                return new RegisterRequest(iG6, strM5, bArrG9, strM12);
            case oc1.BYTES_FIELD_NUMBER /* 8 */:
                int iT8 = aj0.T(parcel);
                while (parcel.dataPosition() < iT8) {
                    int i8 = parcel.readInt();
                    if (((char) i8) != 1) {
                        aj0.P(parcel, i8);
                    } else {
                        strM4 = aj0.m(parcel, i8);
                    }
                }
                aj0.s(parcel, iT8);
                return new FacebookAuthCredential(strM4);
            case 9:
                return new BinderWrapper(parcel);
            case 10:
                int iT9 = aj0.T(parcel);
                Integer numH = null;
                Double dE = null;
                Uri uri = null;
                ArrayList arrayListQ3 = null;
                ArrayList arrayListQ4 = null;
                ChannelIdValue channelIdValue = null;
                String strM13 = null;
                while (parcel.dataPosition() < iT9) {
                    int i9 = parcel.readInt();
                    switch ((char) i9) {
                        case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                            numH = aj0.H(parcel, i9);
                            break;
                        case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                            dE = aj0.E(parcel, i9);
                            break;
                        case oc1.LONG_FIELD_NUMBER /* 4 */:
                            uri = (Uri) aj0.k(parcel, i9, Uri.CREATOR);
                            break;
                        case oc1.STRING_FIELD_NUMBER /* 5 */:
                            arrayListQ3 = aj0.q(parcel, i9, RegisterRequest.CREATOR);
                            break;
                        case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                            arrayListQ4 = aj0.q(parcel, i9, RegisteredKey.CREATOR);
                            break;
                        case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                            channelIdValue = (ChannelIdValue) aj0.k(parcel, i9, ChannelIdValue.CREATOR);
                            break;
                        case oc1.BYTES_FIELD_NUMBER /* 8 */:
                            strM13 = aj0.m(parcel, i9);
                            break;
                        default:
                            aj0.P(parcel, i9);
                            break;
                    }
                }
                aj0.s(parcel, iT9);
                return new RegisterRequestParams(numH, dE, uri, arrayListQ3, arrayListQ4, channelIdValue, strM13);
            case 11:
                int iT10 = aj0.T(parcel);
                byte[] bArrG10 = null;
                while (parcel.dataPosition() < iT10) {
                    int i10 = parcel.readInt();
                    char c7 = (char) i10;
                    if (c7 == 1) {
                        zC2 = aj0.C(parcel, i10);
                    } else if (c7 != 2) {
                        aj0.P(parcel, i10);
                    } else {
                        bArrG10 = aj0.g(parcel, i10);
                    }
                }
                aj0.s(parcel, iT10);
                return new zzh(zC2, bArrG10 != null ? d33.h(bArrG10, bArrG10.length) : null);
            case 12:
                int iT11 = aj0.T(parcel);
                String strM14 = null;
                String strM15 = null;
                while (parcel.dataPosition() < iT11) {
                    int i11 = parcel.readInt();
                    char c8 = (char) i11;
                    if (c8 == 2) {
                        bArrG4 = aj0.g(parcel, i11);
                    } else if (c8 == 3) {
                        strM14 = aj0.m(parcel, i11);
                    } else if (c8 != 4) {
                        aj0.P(parcel, i11);
                    } else {
                        strM15 = aj0.m(parcel, i11);
                    }
                }
                aj0.s(parcel, iT11);
                return new RegisterResponseData(strM14, strM15, bArrG4);
            case 13:
                int iT12 = aj0.T(parcel);
                byte[] bArrG11 = null;
                byte[] bArrG12 = null;
                byte[] bArrG13 = null;
                byte[] bArrG14 = null;
                byte[] bArrG15 = null;
                while (parcel.dataPosition() < iT12) {
                    int i12 = parcel.readInt();
                    char c9 = (char) i12;
                    if (c9 == 2) {
                        bArrG11 = aj0.g(parcel, i12);
                    } else if (c9 == 3) {
                        bArrG12 = aj0.g(parcel, i12);
                    } else if (c9 == 4) {
                        bArrG13 = aj0.g(parcel, i12);
                    } else if (c9 == 5) {
                        bArrG14 = aj0.g(parcel, i12);
                    } else if (c9 != 6) {
                        aj0.P(parcel, i12);
                    } else {
                        bArrG15 = aj0.g(parcel, i12);
                    }
                }
                aj0.s(parcel, iT12);
                return new AuthenticatorAssertionResponse(bArrG11, bArrG12, bArrG13, bArrG14, bArrG15);
            case 14:
                int iT13 = aj0.T(parcel);
                String strM16 = null;
                String strM17 = null;
                while (parcel.dataPosition() < iT13) {
                    int i13 = parcel.readInt();
                    char c10 = (char) i13;
                    if (c10 == 2) {
                        keyHandle = (KeyHandle) aj0.k(parcel, i13, KeyHandle.CREATOR);
                    } else if (c10 == 3) {
                        strM16 = aj0.m(parcel, i13);
                    } else if (c10 != 4) {
                        aj0.P(parcel, i13);
                    } else {
                        strM17 = aj0.m(parcel, i13);
                    }
                }
                aj0.s(parcel, iT13);
                return new RegisteredKey(keyHandle, strM16, strM17);
            case 15:
                int iT14 = aj0.T(parcel);
                String[] strArrN = null;
                while (parcel.dataPosition() < iT14) {
                    int i14 = parcel.readInt();
                    char c11 = (char) i14;
                    if (c11 == 2) {
                        iG5 = aj0.G(parcel, i14);
                    } else if (c11 == 3) {
                        zzjoVarArr = (zzjo[]) aj0.p(parcel, i14, zzjo.CREATOR);
                    } else if (c11 != 4) {
                        aj0.P(parcel, i14);
                    } else {
                        strArrN = aj0.n(parcel, i14);
                    }
                }
                aj0.s(parcel, iT14);
                return new zzjf(iG5, zzjoVarArr, strArrN);
            case 16:
                int iT15 = aj0.T(parcel);
                long jI = 0;
                boolean zC6 = false;
                String strM18 = null;
                String strM19 = null;
                zzjf[] zzjfVarArr = null;
                byte[] bArrG16 = null;
                while (parcel.dataPosition() < iT15) {
                    int i15 = parcel.readInt();
                    switch ((char) i15) {
                        case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                            strM18 = aj0.m(parcel, i15);
                            break;
                        case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                            strM19 = aj0.m(parcel, i15);
                            break;
                        case oc1.LONG_FIELD_NUMBER /* 4 */:
                            zzjfVarArr = (zzjf[]) aj0.p(parcel, i15, zzjf.CREATOR);
                            break;
                        case oc1.STRING_FIELD_NUMBER /* 5 */:
                            zC6 = aj0.C(parcel, i15);
                            break;
                        case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                            bArrG16 = aj0.g(parcel, i15);
                            break;
                        case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                            jI = aj0.I(parcel, i15);
                            break;
                        default:
                            aj0.P(parcel, i15);
                            break;
                    }
                }
                aj0.s(parcel, iT15);
                return new zzjh(strM18, strM19, zzjfVarArr, zC6, bArrG16, jI);
            case 17:
                int iT16 = aj0.T(parcel);
                while (parcel.dataPosition() < iT16) {
                    int i16 = parcel.readInt();
                    if (((char) i16) != 2) {
                        aj0.P(parcel, i16);
                    } else {
                        bArrG3 = aj0.g(parcel, i16);
                    }
                }
                aj0.s(parcel, iT16);
                return new zzjj(bArrG3);
            case 18:
                int iT17 = aj0.T(parcel);
                String strM20 = null;
                byte[] bArrG17 = null;
                byte[][] bArrH = null;
                byte[][] bArrH2 = null;
                byte[][] bArrH3 = null;
                byte[][] bArrH4 = null;
                int[] iArrJ = null;
                byte[][] bArrH5 = null;
                int[] iArrJ2 = null;
                byte[][] bArrH6 = null;
                while (parcel.dataPosition() < iT17) {
                    int i17 = parcel.readInt();
                    switch ((char) i17) {
                        case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                            strM20 = aj0.m(parcel, i17);
                            break;
                        case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                            bArrG17 = aj0.g(parcel, i17);
                            break;
                        case oc1.LONG_FIELD_NUMBER /* 4 */:
                            bArrH = aj0.h(parcel, i17);
                            break;
                        case oc1.STRING_FIELD_NUMBER /* 5 */:
                            bArrH2 = aj0.h(parcel, i17);
                            break;
                        case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                            bArrH3 = aj0.h(parcel, i17);
                            break;
                        case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                            bArrH4 = aj0.h(parcel, i17);
                            break;
                        case oc1.BYTES_FIELD_NUMBER /* 8 */:
                            iArrJ = aj0.j(parcel, i17);
                            break;
                        case '\t':
                            bArrH5 = aj0.h(parcel, i17);
                            break;
                        case '\n':
                            iArrJ2 = aj0.j(parcel, i17);
                            break;
                        case 11:
                            bArrH6 = aj0.h(parcel, i17);
                            break;
                        default:
                            aj0.P(parcel, i17);
                            break;
                    }
                }
                aj0.s(parcel, iT17);
                return new zzjl(strM20, bArrG17, bArrH, bArrH2, bArrH3, bArrH4, iArrJ, bArrH5, iArrJ2, bArrH6);
            case 19:
                int iT18 = aj0.T(parcel);
                long jI2 = 0;
                double d = 0.0d;
                boolean zC7 = false;
                int iG8 = 0;
                int iG9 = 0;
                int iG10 = 0;
                String strM21 = null;
                String strM22 = null;
                byte[] bArrG18 = null;
                while (parcel.dataPosition() < iT18) {
                    int i18 = parcel.readInt();
                    switch ((char) i18) {
                        case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                            strM21 = aj0.m(parcel, i18);
                            break;
                        case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                            jI2 = aj0.I(parcel, i18);
                            break;
                        case oc1.LONG_FIELD_NUMBER /* 4 */:
                            zC7 = aj0.C(parcel, i18);
                            break;
                        case oc1.STRING_FIELD_NUMBER /* 5 */:
                            aj0.X(parcel, i18, 8);
                            d = parcel.readDouble();
                            break;
                        case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                            strM22 = aj0.m(parcel, i18);
                            break;
                        case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                            bArrG18 = aj0.g(parcel, i18);
                            break;
                        case oc1.BYTES_FIELD_NUMBER /* 8 */:
                            iG8 = aj0.G(parcel, i18);
                            break;
                        case '\t':
                            iG9 = aj0.G(parcel, i18);
                            break;
                        case '\n':
                            iG10 = aj0.G(parcel, i18);
                            break;
                        default:
                            aj0.P(parcel, i18);
                            break;
                    }
                }
                aj0.s(parcel, iT18);
                return new zzjo(strM21, jI2, zC7, d, strM22, bArrG18, iG8, iG9, iG10);
            case 20:
                int iT19 = aj0.T(parcel);
                String strM23 = null;
                zzjo zzjoVar = null;
                while (parcel.dataPosition() < iT19) {
                    int i19 = parcel.readInt();
                    char c12 = (char) i19;
                    if (c12 == 2) {
                        strM3 = aj0.m(parcel, i19);
                    } else if (c12 == 3) {
                        strM23 = aj0.m(parcel, i19);
                    } else if (c12 == 4) {
                        zzjoVar = (zzjo) aj0.k(parcel, i19, zzjo.CREATOR);
                    } else if (c12 != 5) {
                        aj0.P(parcel, i19);
                    } else {
                        zC = aj0.C(parcel, i19);
                    }
                }
                aj0.s(parcel, iT19);
                return new zzjq(strM3, strM23, zzjoVar, zC);
            case 21:
                int iT20 = aj0.T(parcel);
                while (parcel.dataPosition() < iT20) {
                    int i20 = parcel.readInt();
                    if (((char) i20) != 2) {
                        aj0.P(parcel, i20);
                    } else {
                        arrayListQ = aj0.q(parcel, i20, zzjq.CREATOR);
                    }
                }
                aj0.s(parcel, iT20);
                return new zzjs(arrayListQ);
            case 22:
                int iT21 = aj0.T(parcel);
                int iG11 = 0;
                while (parcel.dataPosition() < iT21) {
                    int i21 = parcel.readInt();
                    char c13 = (char) i21;
                    if (c13 == 1) {
                        iG4 = aj0.G(parcel, i21);
                    } else if (c13 != 2) {
                        aj0.P(parcel, i21);
                    } else {
                        iG11 = aj0.G(parcel, i21);
                    }
                }
                aj0.s(parcel, iT21);
                return new zzju(iG4, iG11);
            case 23:
                int iT22 = aj0.T(parcel);
                Feature[] featureArr = null;
                ConnectionTelemetryConfiguration connectionTelemetryConfiguration = null;
                while (parcel.dataPosition() < iT22) {
                    int i22 = parcel.readInt();
                    char c14 = (char) i22;
                    if (c14 == 1) {
                        bundleF = aj0.f(parcel, i22);
                    } else if (c14 == 2) {
                        featureArr = (Feature[]) aj0.p(parcel, i22, Feature.CREATOR);
                    } else if (c14 == 3) {
                        iG3 = aj0.G(parcel, i22);
                    } else if (c14 != 4) {
                        aj0.P(parcel, i22);
                    } else {
                        connectionTelemetryConfiguration = (ConnectionTelemetryConfiguration) aj0.k(parcel, i22, ConnectionTelemetryConfiguration.CREATOR);
                    }
                }
                aj0.s(parcel, iT22);
                zzj zzjVar = new zzj();
                zzjVar.a = bundleF;
                zzjVar.b = featureArr;
                zzjVar.c = iG3;
                zzjVar.d = connectionTelemetryConfiguration;
                return zzjVar;
            case 24:
                int iT23 = aj0.T(parcel);
                byte[] bArrG19 = null;
                byte[] bArrG20 = null;
                String[] strArrN2 = null;
                while (parcel.dataPosition() < iT23) {
                    int i23 = parcel.readInt();
                    char c15 = (char) i23;
                    if (c15 == 2) {
                        bArrG2 = aj0.g(parcel, i23);
                    } else if (c15 == 3) {
                        bArrG19 = aj0.g(parcel, i23);
                    } else if (c15 == 4) {
                        bArrG20 = aj0.g(parcel, i23);
                    } else if (c15 != 5) {
                        aj0.P(parcel, i23);
                    } else {
                        strArrN2 = aj0.n(parcel, i23);
                    }
                }
                aj0.s(parcel, iT23);
                return new AuthenticatorAttestationResponse(bArrG2, bArrG19, bArrG20, strArrN2);
            case 25:
                int iT24 = aj0.T(parcel);
                Integer numH2 = null;
                Double dE2 = null;
                Uri uri2 = null;
                byte[] bArrG21 = null;
                ArrayList arrayListQ5 = null;
                ChannelIdValue channelIdValue2 = null;
                String strM24 = null;
                while (parcel.dataPosition() < iT24) {
                    int i24 = parcel.readInt();
                    switch ((char) i24) {
                        case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                            numH2 = aj0.H(parcel, i24);
                            break;
                        case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                            dE2 = aj0.E(parcel, i24);
                            break;
                        case oc1.LONG_FIELD_NUMBER /* 4 */:
                            uri2 = (Uri) aj0.k(parcel, i24, Uri.CREATOR);
                            break;
                        case oc1.STRING_FIELD_NUMBER /* 5 */:
                            bArrG21 = aj0.g(parcel, i24);
                            break;
                        case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                            arrayListQ5 = aj0.q(parcel, i24, RegisteredKey.CREATOR);
                            break;
                        case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                            channelIdValue2 = (ChannelIdValue) aj0.k(parcel, i24, ChannelIdValue.CREATOR);
                            break;
                        case oc1.BYTES_FIELD_NUMBER /* 8 */:
                            strM24 = aj0.m(parcel, i24);
                            break;
                        default:
                            aj0.P(parcel, i24);
                            break;
                    }
                }
                aj0.s(parcel, iT24);
                return new SignRequestParams(numH2, dE2, uri2, bArrG21, arrayListQ5, channelIdValue2, strM24);
            case 26:
                int iT25 = aj0.T(parcel);
                boolean zC8 = false;
                boolean zC9 = false;
                int iG12 = 0;
                RootTelemetryConfiguration rootTelemetryConfiguration = null;
                int[] iArrJ3 = null;
                int[] iArrJ4 = null;
                while (parcel.dataPosition() < iT25) {
                    int i25 = parcel.readInt();
                    switch ((char) i25) {
                        case 1:
                            rootTelemetryConfiguration = (RootTelemetryConfiguration) aj0.k(parcel, i25, RootTelemetryConfiguration.CREATOR);
                            break;
                        case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                            zC8 = aj0.C(parcel, i25);
                            break;
                        case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                            zC9 = aj0.C(parcel, i25);
                            break;
                        case oc1.LONG_FIELD_NUMBER /* 4 */:
                            iArrJ3 = aj0.j(parcel, i25);
                            break;
                        case oc1.STRING_FIELD_NUMBER /* 5 */:
                            iG12 = aj0.G(parcel, i25);
                            break;
                        case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                            iArrJ4 = aj0.j(parcel, i25);
                            break;
                        default:
                            aj0.P(parcel, i25);
                            break;
                    }
                }
                aj0.s(parcel, iT25);
                return new ConnectionTelemetryConfiguration(rootTelemetryConfiguration, zC8, zC9, iArrJ3, iG12, iArrJ4);
            case 27:
                int iT26 = aj0.T(parcel);
                int iG13 = 0;
                while (parcel.dataPosition() < iT26) {
                    int i26 = parcel.readInt();
                    char c16 = (char) i26;
                    if (c16 == 2) {
                        iG2 = aj0.G(parcel, i26);
                    } else if (c16 == 3) {
                        strM2 = aj0.m(parcel, i26);
                    } else if (c16 != 4) {
                        aj0.P(parcel, i26);
                    } else {
                        iG13 = aj0.G(parcel, i26);
                    }
                }
                aj0.s(parcel, iT26);
                return new AuthenticatorErrorResponse(iG2, iG13, strM2);
            case 28:
                int iT27 = aj0.T(parcel);
                String strM25 = null;
                byte[] bArrG22 = null;
                byte[] bArrG23 = null;
                while (parcel.dataPosition() < iT27) {
                    int i27 = parcel.readInt();
                    char c17 = (char) i27;
                    if (c17 == 2) {
                        bArrG = aj0.g(parcel, i27);
                    } else if (c17 == 3) {
                        strM25 = aj0.m(parcel, i27);
                    } else if (c17 == 4) {
                        bArrG22 = aj0.g(parcel, i27);
                    } else if (c17 != 5) {
                        aj0.P(parcel, i27);
                    } else {
                        bArrG23 = aj0.g(parcel, i27);
                    }
                }
                aj0.s(parcel, iT27);
                return new SignResponseData(bArrG, strM25, bArrG22, bArrG23);
            default:
                int iT28 = aj0.T(parcel);
                Bundle bundle = new Bundle();
                Scope[] scopeArr = GetServiceRequest.b0;
                Feature[] featureArr2 = GetServiceRequest.c0;
                Feature[] featureArr3 = featureArr2;
                int iG14 = 0;
                int iG15 = 0;
                int iG16 = 0;
                boolean zC10 = false;
                int iG17 = 0;
                boolean zC11 = false;
                String strM26 = null;
                IBinder iBinderF = null;
                Account account = null;
                String strM27 = null;
                while (parcel.dataPosition() < iT28) {
                    int i28 = parcel.readInt();
                    switch ((char) i28) {
                        case 1:
                            iG14 = aj0.G(parcel, i28);
                            break;
                        case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                            iG15 = aj0.G(parcel, i28);
                            break;
                        case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                            iG16 = aj0.G(parcel, i28);
                            break;
                        case oc1.LONG_FIELD_NUMBER /* 4 */:
                            strM26 = aj0.m(parcel, i28);
                            break;
                        case oc1.STRING_FIELD_NUMBER /* 5 */:
                            iBinderF = aj0.F(parcel, i28);
                            break;
                        case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                            scopeArr = (Scope[]) aj0.p(parcel, i28, Scope.CREATOR);
                            break;
                        case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                            bundle = aj0.f(parcel, i28);
                            break;
                        case oc1.BYTES_FIELD_NUMBER /* 8 */:
                            account = (Account) aj0.k(parcel, i28, Account.CREATOR);
                            break;
                        case '\t':
                        default:
                            aj0.P(parcel, i28);
                            break;
                        case '\n':
                            featureArr2 = (Feature[]) aj0.p(parcel, i28, Feature.CREATOR);
                            break;
                        case 11:
                            featureArr3 = (Feature[]) aj0.p(parcel, i28, Feature.CREATOR);
                            break;
                        case '\f':
                            zC10 = aj0.C(parcel, i28);
                            break;
                        case '\r':
                            iG17 = aj0.G(parcel, i28);
                            break;
                        case 14:
                            zC11 = aj0.C(parcel, i28);
                            break;
                        case 15:
                            strM27 = aj0.m(parcel, i28);
                            break;
                    }
                }
                aj0.s(parcel, iT28);
                return new GetServiceRequest(iG14, iG15, iG16, strM26, iBinderF, scopeArr, bundle, account, featureArr2, featureArr3, zC10, iG17, zC11, strM27);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new Status[i];
            case 1:
                return new AuthenticationExtensionsCredPropsOutputs[i];
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                return new KeyHandle[i];
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                return new StoreBytesData[i];
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                return new ProtocolVersion[i];
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                return new EmailAuthCredential[i];
            case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                return new zzf[i];
            case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                return new RegisterRequest[i];
            case oc1.BYTES_FIELD_NUMBER /* 8 */:
                return new FacebookAuthCredential[i];
            case 9:
                return new BinderWrapper[i];
            case 10:
                return new RegisterRequestParams[i];
            case 11:
                return new zzh[i];
            case 12:
                return new RegisterResponseData[i];
            case 13:
                return new AuthenticatorAssertionResponse[i];
            case 14:
                return new RegisteredKey[i];
            case 15:
                return new zzjf[i];
            case 16:
                return new zzjh[i];
            case 17:
                return new zzjj[i];
            case 18:
                return new zzjl[i];
            case 19:
                return new zzjo[i];
            case 20:
                return new zzjq[i];
            case 21:
                return new zzjs[i];
            case 22:
                return new zzju[i];
            case 23:
                return new zzj[i];
            case 24:
                return new AuthenticatorAttestationResponse[i];
            case 25:
                return new SignRequestParams[i];
            case 26:
                return new ConnectionTelemetryConfiguration[i];
            case 27:
                return new AuthenticatorErrorResponse[i];
            case 28:
                return new SignResponseData[i];
            default:
                return new GetServiceRequest[i];
        }
    }
}
