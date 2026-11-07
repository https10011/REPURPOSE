package defpackage;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Intent;
import android.database.CursorWindow;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.AuthorizationRequest;
import com.google.android.gms.auth.api.identity.AuthorizationResult;
import com.google.android.gms.auth.api.identity.BeginSignInResult;
import com.google.android.gms.auth.api.identity.ClearTokenRequest;
import com.google.android.gms.auth.api.identity.GetPhoneNumberHintIntentRequest;
import com.google.android.gms.auth.api.identity.zbf;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.images.WebImage;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.zab;
import com.google.android.gms.common.internal.zaw;
import com.google.android.gms.common.internal.zay;
import com.google.android.gms.common.moduleinstall.ModuleInstallIntentResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallStatusUpdate;
import com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest;
import com.google.android.gms.common.server.converter.StringToIntConverter;
import com.google.android.gms.common.server.converter.zaa;
import com.google.android.gms.common.server.converter.zac;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.common.server.response.SafeParcelResponse;
import com.google.android.gms.common.server.response.zal;
import com.google.android.gms.common.server.response.zam;
import com.google.android.gms.common.server.response.zan;
import com.google.android.gms.signin.internal.zag;
import com.google.android.gms.signin.internal.zai;
import com.google.android.gms.signin.internal.zak;
import com.hjq.toast.BuildConfig;
import java.util.ArrayList;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class og2 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iG = 0;
        int iG2 = 0;
        boolean zC = false;
        int iG3 = 0;
        int iG4 = 0;
        int iG5 = 0;
        int iG6 = 0;
        int iG7 = 0;
        int iG8 = 0;
        int iG9 = 0;
        int iG10 = 0;
        int iG11 = 0;
        int iG12 = 0;
        boolean zC2 = false;
        int iG13 = 0;
        int iG14 = 0;
        GoogleSignInAccount googleSignInAccountQ = null;
        switch (this.a) {
            case 0:
                int iT = aj0.T(parcel);
                while (parcel.dataPosition() < iT) {
                    int i = parcel.readInt();
                    if (((char) i) != 1) {
                        aj0.P(parcel, i);
                    } else {
                        googleSignInAccountQ = (PendingIntent) aj0.k(parcel, i, PendingIntent.CREATOR);
                    }
                }
                aj0.s(parcel, iT);
                return new ModuleInstallIntentResponse(googleSignInAccountQ);
            case 1:
                int iT2 = aj0.T(parcel);
                while (parcel.dataPosition() < iT2) {
                    int i2 = parcel.readInt();
                    char c = (char) i2;
                    if (c == 1) {
                        iG = aj0.G(parcel, i2);
                    } else if (c != 2) {
                        aj0.P(parcel, i2);
                    } else {
                        googleSignInAccountQ = (StringToIntConverter) aj0.k(parcel, i2, StringToIntConverter.CREATOR);
                    }
                }
                aj0.s(parcel, iT2);
                return new zaa(iG, googleSignInAccountQ);
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                int iT3 = aj0.T(parcel);
                int iG15 = 0;
                while (parcel.dataPosition() < iT3) {
                    int i3 = parcel.readInt();
                    char c2 = (char) i3;
                    if (c2 == 1) {
                        iG14 = aj0.G(parcel, i3);
                    } else if (c2 == 2) {
                        iG15 = aj0.G(parcel, i3);
                    } else if (c2 != 3) {
                        aj0.P(parcel, i3);
                    } else {
                        googleSignInAccountQ = (Intent) aj0.k(parcel, i3, Intent.CREATOR);
                    }
                }
                aj0.s(parcel, iT3);
                return new com.google.android.gms.signin.internal.zaa(iG14, iG15, googleSignInAccountQ);
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                int iT4 = aj0.T(parcel);
                long jI = 0;
                String strM = null;
                String strM2 = null;
                String strM3 = null;
                String strM4 = null;
                Uri uri = null;
                String strM5 = null;
                String strM6 = null;
                ArrayList arrayListQ = null;
                String strM7 = null;
                String strM8 = null;
                while (parcel.dataPosition() < iT4) {
                    int i4 = parcel.readInt();
                    switch ((char) i4) {
                        case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                            strM = aj0.m(parcel, i4);
                            break;
                        case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                            strM2 = aj0.m(parcel, i4);
                            break;
                        case oc1.LONG_FIELD_NUMBER /* 4 */:
                            strM3 = aj0.m(parcel, i4);
                            break;
                        case oc1.STRING_FIELD_NUMBER /* 5 */:
                            strM4 = aj0.m(parcel, i4);
                            break;
                        case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                            uri = (Uri) aj0.k(parcel, i4, Uri.CREATOR);
                            break;
                        case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                            strM5 = aj0.m(parcel, i4);
                            break;
                        case oc1.BYTES_FIELD_NUMBER /* 8 */:
                            jI = aj0.I(parcel, i4);
                            break;
                        case '\t':
                            strM6 = aj0.m(parcel, i4);
                            break;
                        case '\n':
                            arrayListQ = aj0.q(parcel, i4, Scope.CREATOR);
                            break;
                        case 11:
                            strM7 = aj0.m(parcel, i4);
                            break;
                        case '\f':
                            strM8 = aj0.m(parcel, i4);
                            break;
                        default:
                            aj0.P(parcel, i4);
                            break;
                    }
                }
                aj0.s(parcel, iT4);
                return new GoogleSignInAccount(strM, strM2, strM3, strM4, uri, strM5, jI, strM6, arrayListQ, strM7, strM8);
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                int iT5 = aj0.T(parcel);
                long jI2 = 0;
                int iG16 = 0;
                int iG17 = 0;
                boolean zC3 = false;
                String strM9 = null;
                while (parcel.dataPosition() < iT5) {
                    int i5 = parcel.readInt();
                    char c3 = (char) i5;
                    if (c3 == 1) {
                        iG16 = aj0.G(parcel, i5);
                    } else if (c3 == 2) {
                        strM9 = aj0.m(parcel, i5);
                    } else if (c3 == 3) {
                        jI2 = aj0.I(parcel, i5);
                    } else if (c3 == 4) {
                        iG17 = aj0.G(parcel, i5);
                    } else if (c3 != 5) {
                        aj0.P(parcel, i5);
                    } else {
                        zC3 = aj0.C(parcel, i5);
                    }
                }
                aj0.s(parcel, iT5);
                return new zab(iG16, iG17, jI2, strM9, zC3);
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                int iT6 = aj0.T(parcel);
                boolean zC4 = false;
                while (parcel.dataPosition() < iT6) {
                    int i6 = parcel.readInt();
                    char c4 = (char) i6;
                    if (c4 == 1) {
                        iG13 = aj0.G(parcel, i6);
                    } else if (c4 != 2) {
                        aj0.P(parcel, i6);
                    } else {
                        zC4 = aj0.C(parcel, i6);
                    }
                }
                aj0.s(parcel, iT6);
                return new ModuleInstallResponse(iG13, zC4);
            case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                int iT7 = aj0.T(parcel);
                String strM10 = null;
                String strM11 = null;
                while (parcel.dataPosition() < iT7) {
                    int i7 = parcel.readInt();
                    char c5 = (char) i7;
                    if (c5 == 1) {
                        googleSignInAccountQ = aj0.q(parcel, i7, Feature.CREATOR);
                    } else if (c5 == 2) {
                        zC2 = aj0.C(parcel, i7);
                    } else if (c5 == 3) {
                        strM10 = aj0.m(parcel, i7);
                    } else if (c5 != 4) {
                        aj0.P(parcel, i7);
                    } else {
                        strM11 = aj0.m(parcel, i7);
                    }
                }
                aj0.s(parcel, iT7);
                return new ApiFeatureRequest(googleSignInAccountQ, zC2, strM10, strM11);
            case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                int iT8 = aj0.T(parcel);
                int iG18 = 0;
                int iG19 = 0;
                String[] strArrN = null;
                CursorWindow[] cursorWindowArr = null;
                Bundle bundleF = null;
                while (parcel.dataPosition() < iT8) {
                    int i8 = parcel.readInt();
                    char c6 = (char) i8;
                    if (c6 == 1) {
                        strArrN = aj0.n(parcel, i8);
                    } else if (c6 == 2) {
                        cursorWindowArr = (CursorWindow[]) aj0.p(parcel, i8, CursorWindow.CREATOR);
                    } else if (c6 == 3) {
                        iG19 = aj0.G(parcel, i8);
                    } else if (c6 == 4) {
                        bundleF = aj0.f(parcel, i8);
                    } else if (c6 != 1000) {
                        aj0.P(parcel, i8);
                    } else {
                        iG18 = aj0.G(parcel, i8);
                    }
                }
                aj0.s(parcel, iT8);
                DataHolder dataHolder = new DataHolder(iG18, strArrN, cursorWindowArr, iG19, bundleF);
                dataHolder.c = new Bundle();
                int i9 = 0;
                while (true) {
                    String[] strArr = dataHolder.b;
                    if (i9 >= strArr.length) {
                        CursorWindow[] cursorWindowArr2 = dataHolder.d;
                        dataHolder.i = new int[cursorWindowArr2.length];
                        int numRows = 0;
                        for (int i10 = 0; i10 < cursorWindowArr2.length; i10++) {
                            dataHolder.i[i10] = numRows;
                            numRows += cursorWindowArr2[i10].getNumRows() - (numRows - cursorWindowArr2[i10].getStartPosition());
                        }
                        return dataHolder;
                    }
                    dataHolder.c.putInt(strArr[i9], i9);
                    i9++;
                }
                break;
            case oc1.BYTES_FIELD_NUMBER /* 8 */:
                int iT9 = aj0.T(parcel);
                int iG20 = 0;
                int iG21 = 0;
                int iG22 = 0;
                Long lJ = null;
                Long lJ2 = null;
                while (parcel.dataPosition() < iT9) {
                    int i11 = parcel.readInt();
                    char c7 = (char) i11;
                    if (c7 == 1) {
                        iG20 = aj0.G(parcel, i11);
                    } else if (c7 == 2) {
                        iG21 = aj0.G(parcel, i11);
                    } else if (c7 == 3) {
                        lJ = aj0.J(parcel, i11);
                    } else if (c7 == 4) {
                        lJ2 = aj0.J(parcel, i11);
                    } else if (c7 != 5) {
                        aj0.P(parcel, i11);
                    } else {
                        iG22 = aj0.G(parcel, i11);
                    }
                }
                aj0.s(parcel, iT9);
                return new ModuleInstallStatusUpdate(iG20, iG21, lJ, lJ2, iG22);
            case 9:
                int iT10 = aj0.T(parcel);
                while (parcel.dataPosition() < iT10) {
                    int i12 = parcel.readInt();
                    char c8 = (char) i12;
                    if (c8 == 1) {
                        iG12 = aj0.G(parcel, i12);
                    } else if (c8 != 2) {
                        aj0.P(parcel, i12);
                    } else {
                        googleSignInAccountQ = aj0.q(parcel, i12, zac.CREATOR);
                    }
                }
                aj0.s(parcel, iT10);
                return new StringToIntConverter(iG12, googleSignInAccountQ);
            case 10:
                int iT11 = aj0.T(parcel);
                int iG23 = 0;
                boolean zC5 = false;
                boolean zC6 = false;
                boolean zC7 = false;
                ArrayList arrayListQ2 = null;
                Account account = null;
                String strM12 = null;
                String strM13 = null;
                String strM14 = null;
                while (parcel.dataPosition() < iT11) {
                    int i13 = parcel.readInt();
                    switch ((char) i13) {
                        case 1:
                            iG23 = aj0.G(parcel, i13);
                            break;
                        case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                            arrayListQ2 = aj0.q(parcel, i13, Scope.CREATOR);
                            break;
                        case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                            account = (Account) aj0.k(parcel, i13, Account.CREATOR);
                            break;
                        case oc1.LONG_FIELD_NUMBER /* 4 */:
                            zC5 = aj0.C(parcel, i13);
                            break;
                        case oc1.STRING_FIELD_NUMBER /* 5 */:
                            zC6 = aj0.C(parcel, i13);
                            break;
                        case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                            zC7 = aj0.C(parcel, i13);
                            break;
                        case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                            strM12 = aj0.m(parcel, i13);
                            break;
                        case oc1.BYTES_FIELD_NUMBER /* 8 */:
                            strM13 = aj0.m(parcel, i13);
                            break;
                        case '\t':
                            googleSignInAccountQ = aj0.q(parcel, i13, GoogleSignInOptionsExtensionParcelable.CREATOR);
                            break;
                        case '\n':
                            strM14 = aj0.m(parcel, i13);
                            break;
                        default:
                            aj0.P(parcel, i13);
                            break;
                    }
                }
                aj0.s(parcel, iT11);
                return new GoogleSignInOptions(iG23, arrayListQ2, account, zC5, zC6, zC7, strM12, strM13, GoogleSignInOptions.S(googleSignInAccountQ), strM14);
            case 11:
                int iT12 = aj0.T(parcel);
                int iG24 = 0;
                while (parcel.dataPosition() < iT12) {
                    int i14 = parcel.readInt();
                    char c9 = (char) i14;
                    if (c9 == 1) {
                        iG11 = aj0.G(parcel, i14);
                    } else if (c9 == 2) {
                        googleSignInAccountQ = aj0.m(parcel, i14);
                    } else if (c9 != 3) {
                        aj0.P(parcel, i14);
                    } else {
                        iG24 = aj0.G(parcel, i14);
                    }
                }
                aj0.s(parcel, iT12);
                return new zac(iG11, iG24, googleSignInAccountQ);
            case 12:
                int iT13 = aj0.T(parcel);
                int iG25 = 0;
                int iG26 = 0;
                while (parcel.dataPosition() < iT13) {
                    int i15 = parcel.readInt();
                    char c10 = (char) i15;
                    if (c10 == 1) {
                        iG10 = aj0.G(parcel, i15);
                    } else if (c10 == 2) {
                        googleSignInAccountQ = (Uri) aj0.k(parcel, i15, Uri.CREATOR);
                    } else if (c10 == 3) {
                        iG25 = aj0.G(parcel, i15);
                    } else if (c10 != 4) {
                        aj0.P(parcel, i15);
                    } else {
                        iG26 = aj0.G(parcel, i15);
                    }
                }
                aj0.s(parcel, iT13);
                return new WebImage(iG10, googleSignInAccountQ, iG25, iG26);
            case 13:
                int iT14 = aj0.T(parcel);
                String strM15 = null;
                while (parcel.dataPosition() < iT14) {
                    int i16 = parcel.readInt();
                    char c11 = (char) i16;
                    if (c11 == 1) {
                        googleSignInAccountQ = aj0.o(parcel, i16);
                    } else if (c11 != 2) {
                        aj0.P(parcel, i16);
                    } else {
                        strM15 = aj0.m(parcel, i16);
                    }
                }
                aj0.s(parcel, iT14);
                return new zag(googleSignInAccountQ, strM15);
            case 14:
                int iT15 = aj0.T(parcel);
                while (parcel.dataPosition() < iT15) {
                    int i17 = parcel.readInt();
                    char c12 = (char) i17;
                    if (c12 == 1) {
                        iG9 = aj0.G(parcel, i17);
                    } else if (c12 != 2) {
                        aj0.P(parcel, i17);
                    } else {
                        googleSignInAccountQ = (zaw) aj0.k(parcel, i17, zaw.CREATOR);
                    }
                }
                aj0.s(parcel, iT15);
                return new zai(iG9, googleSignInAccountQ);
            case 15:
                int iT16 = aj0.T(parcel);
                FastJsonResponse.Field field = null;
                while (parcel.dataPosition() < iT16) {
                    int i18 = parcel.readInt();
                    char c13 = (char) i18;
                    if (c13 == 1) {
                        iG8 = aj0.G(parcel, i18);
                    } else if (c13 == 2) {
                        googleSignInAccountQ = aj0.m(parcel, i18);
                    } else if (c13 != 3) {
                        aj0.P(parcel, i18);
                    } else {
                        field = (FastJsonResponse.Field) aj0.k(parcel, i18, FastJsonResponse.Field.CREATOR);
                    }
                }
                aj0.s(parcel, iT16);
                return new zam(iG8, googleSignInAccountQ, field);
            case 16:
                int iT17 = aj0.T(parcel);
                zay zayVar = null;
                while (parcel.dataPosition() < iT17) {
                    int i19 = parcel.readInt();
                    char c14 = (char) i19;
                    if (c14 == 1) {
                        iG7 = aj0.G(parcel, i19);
                    } else if (c14 == 2) {
                        googleSignInAccountQ = (ConnectionResult) aj0.k(parcel, i19, ConnectionResult.CREATOR);
                    } else if (c14 != 3) {
                        aj0.P(parcel, i19);
                    } else {
                        zayVar = (zay) aj0.k(parcel, i19, zay.CREATOR);
                    }
                }
                aj0.s(parcel, iT17);
                return new zak(iG7, googleSignInAccountQ, zayVar);
            case 17:
                int iT18 = aj0.T(parcel);
                String strM16 = null;
                while (parcel.dataPosition() < iT18) {
                    int i20 = parcel.readInt();
                    char c15 = (char) i20;
                    if (c15 == 1) {
                        iG6 = aj0.G(parcel, i20);
                    } else if (c15 == 2) {
                        googleSignInAccountQ = aj0.q(parcel, i20, zal.CREATOR);
                    } else if (c15 != 3) {
                        aj0.P(parcel, i20);
                    } else {
                        strM16 = aj0.m(parcel, i20);
                    }
                }
                aj0.s(parcel, iT18);
                return new zan(iG6, strM16, googleSignInAccountQ);
            case 18:
                int iT19 = aj0.T(parcel);
                ArrayList arrayListQ3 = null;
                while (parcel.dataPosition() < iT19) {
                    int i21 = parcel.readInt();
                    char c16 = (char) i21;
                    if (c16 == 1) {
                        iG5 = aj0.G(parcel, i21);
                    } else if (c16 == 2) {
                        googleSignInAccountQ = aj0.m(parcel, i21);
                    } else if (c16 != 3) {
                        aj0.P(parcel, i21);
                    } else {
                        arrayListQ3 = aj0.q(parcel, i21, zam.CREATOR);
                    }
                }
                aj0.s(parcel, iT19);
                return new zal(iG5, googleSignInAccountQ, arrayListQ3);
            case 19:
                int iT20 = aj0.T(parcel);
                long jI3 = 0;
                long jI4 = 0;
                int iG27 = -1;
                int iG28 = 0;
                int iG29 = 0;
                int iG30 = 0;
                int iG31 = 0;
                String strM17 = null;
                String strM18 = null;
                while (parcel.dataPosition() < iT20) {
                    int i22 = parcel.readInt();
                    switch ((char) i22) {
                        case 1:
                            iG28 = aj0.G(parcel, i22);
                            break;
                        case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                            iG29 = aj0.G(parcel, i22);
                            break;
                        case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                            iG30 = aj0.G(parcel, i22);
                            break;
                        case oc1.LONG_FIELD_NUMBER /* 4 */:
                            jI3 = aj0.I(parcel, i22);
                            break;
                        case oc1.STRING_FIELD_NUMBER /* 5 */:
                            jI4 = aj0.I(parcel, i22);
                            break;
                        case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                            strM17 = aj0.m(parcel, i22);
                            break;
                        case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                            strM18 = aj0.m(parcel, i22);
                            break;
                        case oc1.BYTES_FIELD_NUMBER /* 8 */:
                            iG31 = aj0.G(parcel, i22);
                            break;
                        case '\t':
                            iG27 = aj0.G(parcel, i22);
                            break;
                        default:
                            aj0.P(parcel, i22);
                            break;
                    }
                }
                aj0.s(parcel, iT20);
                return new MethodInvocation(iG28, iG29, iG30, jI3, jI4, strM17, strM18, iG31, iG27);
            case 20:
                int iT21 = aj0.T(parcel);
                Parcel parcel2 = null;
                zan zanVar = null;
                while (parcel.dataPosition() < iT21) {
                    int i23 = parcel.readInt();
                    char c17 = (char) i23;
                    if (c17 == 1) {
                        iG4 = aj0.G(parcel, i23);
                    } else if (c17 == 2) {
                        int iK = aj0.K(parcel, i23);
                        int iDataPosition = parcel.dataPosition();
                        if (iK == 0) {
                            parcel2 = null;
                        } else {
                            Parcel parcelObtain = Parcel.obtain();
                            parcelObtain.appendFrom(parcel, iDataPosition, iK);
                            parcel.setDataPosition(iDataPosition + iK);
                            parcel2 = parcelObtain;
                        }
                    } else if (c17 != 3) {
                        aj0.P(parcel, i23);
                    } else {
                        zanVar = (zan) aj0.k(parcel, i23, zan.CREATOR);
                    }
                }
                aj0.s(parcel, iT21);
                return new SafeParcelResponse(iG4, parcel2, zanVar);
            case 21:
                int iT22 = aj0.T(parcel);
                int iG32 = 0;
                GoogleSignInAccount googleSignInAccount = null;
                while (parcel.dataPosition() < iT22) {
                    int i24 = parcel.readInt();
                    char c18 = (char) i24;
                    if (c18 == 1) {
                        iG3 = aj0.G(parcel, i24);
                    } else if (c18 == 2) {
                        googleSignInAccountQ = (Account) aj0.k(parcel, i24, Account.CREATOR);
                    } else if (c18 == 3) {
                        iG32 = aj0.G(parcel, i24);
                    } else if (c18 != 4) {
                        aj0.P(parcel, i24);
                    } else {
                        googleSignInAccount = (GoogleSignInAccount) aj0.k(parcel, i24, GoogleSignInAccount.CREATOR);
                    }
                }
                aj0.s(parcel, iT22);
                return new zaw(iG3, googleSignInAccountQ, iG32, googleSignInAccount);
            case 22:
                int iT23 = aj0.T(parcel);
                int iG33 = 0;
                boolean zC8 = false;
                boolean zC9 = false;
                IBinder iBinderF = null;
                ConnectionResult connectionResult = null;
                while (parcel.dataPosition() < iT23) {
                    int i25 = parcel.readInt();
                    char c19 = (char) i25;
                    if (c19 == 1) {
                        iG33 = aj0.G(parcel, i25);
                    } else if (c19 == 2) {
                        iBinderF = aj0.F(parcel, i25);
                    } else if (c19 == 3) {
                        connectionResult = (ConnectionResult) aj0.k(parcel, i25, ConnectionResult.CREATOR);
                    } else if (c19 == 4) {
                        zC8 = aj0.C(parcel, i25);
                    } else if (c19 != 5) {
                        aj0.P(parcel, i25);
                    } else {
                        zC9 = aj0.C(parcel, i25);
                    }
                }
                aj0.s(parcel, iT23);
                return new zay(iG33, iBinderF, connectionResult, zC8, zC9);
            case 23:
                int iT24 = aj0.T(parcel);
                boolean zC10 = false;
                boolean zC11 = false;
                boolean zC12 = false;
                boolean zC13 = false;
                int iG34 = 0;
                ArrayList arrayListQ4 = null;
                String strM19 = null;
                Account account2 = null;
                String strM20 = null;
                String strM21 = null;
                Bundle bundleF2 = null;
                while (parcel.dataPosition() < iT24) {
                    int i26 = parcel.readInt();
                    switch ((char) i26) {
                        case 1:
                            arrayListQ4 = aj0.q(parcel, i26, Scope.CREATOR);
                            break;
                        case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                            strM19 = aj0.m(parcel, i26);
                            break;
                        case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                            zC10 = aj0.C(parcel, i26);
                            break;
                        case oc1.LONG_FIELD_NUMBER /* 4 */:
                            zC11 = aj0.C(parcel, i26);
                            break;
                        case oc1.STRING_FIELD_NUMBER /* 5 */:
                            account2 = (Account) aj0.k(parcel, i26, Account.CREATOR);
                            break;
                        case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                            strM20 = aj0.m(parcel, i26);
                            break;
                        case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                            strM21 = aj0.m(parcel, i26);
                            break;
                        case oc1.BYTES_FIELD_NUMBER /* 8 */:
                            zC12 = aj0.C(parcel, i26);
                            break;
                        case '\t':
                            bundleF2 = aj0.f(parcel, i26);
                            break;
                        case '\n':
                            zC13 = aj0.C(parcel, i26);
                            break;
                        case 11:
                            iG34 = aj0.G(parcel, i26);
                            break;
                        default:
                            aj0.P(parcel, i26);
                            break;
                    }
                }
                aj0.s(parcel, iT24);
                return new AuthorizationRequest(arrayListQ4, strM19, zC10, zC11, account2, strM20, strM21, zC12, bundleF2, zC13, iG34);
            case 24:
                int iT25 = aj0.T(parcel);
                String strM22 = BuildConfig.FLAVOR;
                String strM23 = BuildConfig.FLAVOR;
                while (parcel.dataPosition() < iT25) {
                    int i27 = parcel.readInt();
                    char c20 = (char) i27;
                    if (c20 == 4) {
                        strM22 = aj0.m(parcel, i27);
                    } else if (c20 == 7) {
                        googleSignInAccountQ = (GoogleSignInAccount) aj0.k(parcel, i27, GoogleSignInAccount.CREATOR);
                    } else if (c20 != '\b') {
                        aj0.P(parcel, i27);
                    } else {
                        strM23 = aj0.m(parcel, i27);
                    }
                }
                aj0.s(parcel, iT25);
                return new SignInAccount(strM22, googleSignInAccountQ, strM23);
            case 25:
                int iT26 = aj0.T(parcel);
                String strM24 = null;
                String strM25 = null;
                String strM26 = null;
                ArrayList arrayListO = null;
                GoogleSignInAccount googleSignInAccount2 = null;
                PendingIntent pendingIntent = null;
                Bundle bundleF3 = null;
                while (parcel.dataPosition() < iT26) {
                    int i28 = parcel.readInt();
                    switch ((char) i28) {
                        case 1:
                            strM24 = aj0.m(parcel, i28);
                            break;
                        case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                            strM25 = aj0.m(parcel, i28);
                            break;
                        case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                            strM26 = aj0.m(parcel, i28);
                            break;
                        case oc1.LONG_FIELD_NUMBER /* 4 */:
                            arrayListO = aj0.o(parcel, i28);
                            break;
                        case oc1.STRING_FIELD_NUMBER /* 5 */:
                            googleSignInAccount2 = (GoogleSignInAccount) aj0.k(parcel, i28, GoogleSignInAccount.CREATOR);
                            break;
                        case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                            pendingIntent = (PendingIntent) aj0.k(parcel, i28, PendingIntent.CREATOR);
                            break;
                        case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                            bundleF3 = aj0.f(parcel, i28);
                            break;
                        default:
                            aj0.P(parcel, i28);
                            break;
                    }
                }
                aj0.s(parcel, iT26);
                return new AuthorizationResult(strM24, strM25, strM26, arrayListO, googleSignInAccount2, pendingIntent, bundleF3);
            case 26:
                int iT27 = aj0.T(parcel);
                while (parcel.dataPosition() < iT27) {
                    int i29 = parcel.readInt();
                    if (((char) i29) != 1) {
                        aj0.P(parcel, i29);
                    } else {
                        googleSignInAccountQ = (PendingIntent) aj0.k(parcel, i29, PendingIntent.CREATOR);
                    }
                }
                aj0.s(parcel, iT27);
                return new BeginSignInResult(googleSignInAccountQ);
            case 27:
                int iT28 = aj0.T(parcel);
                while (parcel.dataPosition() < iT28) {
                    int i30 = parcel.readInt();
                    char c21 = (char) i30;
                    if (c21 == 1) {
                        googleSignInAccountQ = aj0.m(parcel, i30);
                    } else if (c21 != 2) {
                        aj0.P(parcel, i30);
                    } else {
                        zC = aj0.C(parcel, i30);
                    }
                }
                aj0.s(parcel, iT28);
                return new zbf(googleSignInAccountQ, zC);
            case 28:
                int iT29 = aj0.T(parcel);
                String strM27 = null;
                while (parcel.dataPosition() < iT29) {
                    int i31 = parcel.readInt();
                    char c22 = (char) i31;
                    if (c22 == 1) {
                        googleSignInAccountQ = aj0.m(parcel, i31);
                    } else if (c22 != 2) {
                        aj0.P(parcel, i31);
                    } else {
                        strM27 = aj0.m(parcel, i31);
                    }
                }
                aj0.s(parcel, iT29);
                return new ClearTokenRequest(googleSignInAccountQ, strM27);
            default:
                int iT30 = aj0.T(parcel);
                while (parcel.dataPosition() < iT30) {
                    int i32 = parcel.readInt();
                    if (((char) i32) != 1) {
                        aj0.P(parcel, i32);
                    } else {
                        iG2 = aj0.G(parcel, i32);
                    }
                }
                aj0.s(parcel, iT30);
                return new GetPhoneNumberHintIntentRequest(iG2);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new ModuleInstallIntentResponse[i];
            case 1:
                return new zaa[i];
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                return new com.google.android.gms.signin.internal.zaa[i];
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                return new GoogleSignInAccount[i];
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                return new zab[i];
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                return new ModuleInstallResponse[i];
            case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                return new ApiFeatureRequest[i];
            case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                return new DataHolder[i];
            case oc1.BYTES_FIELD_NUMBER /* 8 */:
                return new ModuleInstallStatusUpdate[i];
            case 9:
                return new StringToIntConverter[i];
            case 10:
                return new GoogleSignInOptions[i];
            case 11:
                return new zac[i];
            case 12:
                return new WebImage[i];
            case 13:
                return new zag[i];
            case 14:
                return new zai[i];
            case 15:
                return new zam[i];
            case 16:
                return new zak[i];
            case 17:
                return new zan[i];
            case 18:
                return new zal[i];
            case 19:
                return new MethodInvocation[i];
            case 20:
                return new SafeParcelResponse[i];
            case 21:
                return new zaw[i];
            case 22:
                return new zay[i];
            case 23:
                return new AuthorizationRequest[i];
            case 24:
                return new SignInAccount[i];
            case 25:
                return new AuthorizationResult[i];
            case 26:
                return new BeginSignInResult[i];
            case 27:
                return new zbf[i];
            case 28:
                return new ClearTokenRequest[i];
            default:
                return new GetPhoneNumberHintIntentRequest[i];
        }
    }
}
