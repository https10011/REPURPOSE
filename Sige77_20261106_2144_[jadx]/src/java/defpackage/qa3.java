package defpackage;

import android.accounts.Account;
import android.app.PendingIntent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.TokenData;
import com.google.android.gms.auth.api.accounttransfer.DeviceMetaData;
import com.google.android.gms.auth.api.accounttransfer.zzo;
import com.google.android.gms.auth.api.accounttransfer.zzs;
import com.google.android.gms.auth.api.accounttransfer.zzu;
import com.google.android.gms.auth.api.accounttransfer.zzw;
import com.google.android.gms.common.zzp;
import com.google.android.gms.common.zzr;
import com.google.android.gms.common.zzt;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria;
import com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialRequestOptions;
import com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier;
import com.google.android.gms.fido.fido2.api.common.ErrorCode;
import com.google.android.gms.fido.fido2.api.common.FidoAppIdExtension;
import com.google.android.gms.fido.fido2.api.common.FidoCredentialDetails;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions;
import com.google.android.gms.fido.fido2.api.common.zzq;
import com.google.android.gms.measurement.internal.zzoh;
import com.google.android.gms.measurement.internal.zzom;
import com.google.android.gms.measurement.internal.zzoo;
import com.google.android.gms.measurement.internal.zzoq;
import com.google.android.gms.measurement.internal.zzpl;
import com.google.firebase.auth.internal.zzv;
import com.hjq.toast.BuildConfig;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class qa3 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public static void a(zzpl zzplVar, Parcel parcel) {
        int i = zzplVar.a;
        int iO = bj0.O(parcel, 20293);
        bj0.N(parcel, 1, 4);
        parcel.writeInt(i);
        bj0.F(parcel, 2, zzplVar.b, false);
        long j = zzplVar.c;
        bj0.N(parcel, 3, 8);
        parcel.writeLong(j);
        bj0.D(parcel, 4, zzplVar.d);
        bj0.F(parcel, 6, zzplVar.e, false);
        bj0.F(parcel, 7, zzplVar.f, false);
        bj0.z(parcel, 8, zzplVar.i);
        bj0.P(parcel, iO);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        long jI = 0;
        int iG = 0;
        boolean zC = false;
        boolean zC2 = false;
        PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptionsM = null;
        switch (this.a) {
            case 0:
                int iT = aj0.T(parcel);
                Boolean boolD = null;
                String strM = null;
                String strM2 = null;
                while (parcel.dataPosition() < iT) {
                    int i = parcel.readInt();
                    char c = (char) i;
                    if (c == 2) {
                        publicKeyCredentialRequestOptionsM = aj0.m(parcel, i);
                    } else if (c == 3) {
                        boolD = aj0.D(parcel, i);
                    } else if (c == 4) {
                        strM = aj0.m(parcel, i);
                    } else if (c != 5) {
                        aj0.P(parcel, i);
                    } else {
                        strM2 = aj0.m(parcel, i);
                    }
                }
                aj0.s(parcel, iT);
                return new AuthenticatorSelectionCriteria(publicKeyCredentialRequestOptionsM, boolD, strM, strM2);
            case 1:
                int iT2 = aj0.T(parcel);
                int iG2 = 0;
                boolean zC3 = false;
                boolean zC4 = false;
                String strM3 = null;
                Long lJ = null;
                ArrayList arrayListO = null;
                String strM4 = null;
                while (parcel.dataPosition() < iT2) {
                    int i2 = parcel.readInt();
                    switch ((char) i2) {
                        case 1:
                            iG2 = aj0.G(parcel, i2);
                            break;
                        case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                            strM3 = aj0.m(parcel, i2);
                            break;
                        case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                            lJ = aj0.J(parcel, i2);
                            break;
                        case oc1.LONG_FIELD_NUMBER /* 4 */:
                            zC3 = aj0.C(parcel, i2);
                            break;
                        case oc1.STRING_FIELD_NUMBER /* 5 */:
                            zC4 = aj0.C(parcel, i2);
                            break;
                        case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                            arrayListO = aj0.o(parcel, i2);
                            break;
                        case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                            strM4 = aj0.m(parcel, i2);
                            break;
                        default:
                            aj0.P(parcel, i2);
                            break;
                    }
                }
                aj0.s(parcel, iT2);
                return new TokenData(iG2, strM3, lJ, zC3, zC4, arrayListO, strM4);
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                int iT3 = aj0.T(parcel);
                Uri uri = null;
                byte[] bArrG = null;
                while (parcel.dataPosition() < iT3) {
                    int i3 = parcel.readInt();
                    char c2 = (char) i3;
                    if (c2 == 2) {
                        publicKeyCredentialRequestOptionsM = (PublicKeyCredentialCreationOptions) aj0.k(parcel, i3, PublicKeyCredentialCreationOptions.CREATOR);
                    } else if (c2 == 3) {
                        uri = (Uri) aj0.k(parcel, i3, Uri.CREATOR);
                    } else if (c2 != 4) {
                        aj0.P(parcel, i3);
                    } else {
                        bArrG = aj0.g(parcel, i3);
                    }
                }
                aj0.s(parcel, iT3);
                return new BrowserPublicKeyCredentialCreationOptions(publicKeyCredentialRequestOptionsM, uri, bArrG);
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                int iT4 = aj0.T(parcel);
                Uri uri2 = null;
                byte[] bArrG2 = null;
                while (parcel.dataPosition() < iT4) {
                    int i4 = parcel.readInt();
                    char c3 = (char) i4;
                    if (c3 == 2) {
                        publicKeyCredentialRequestOptionsM = (PublicKeyCredentialRequestOptions) aj0.k(parcel, i4, PublicKeyCredentialRequestOptions.CREATOR);
                    } else if (c3 == 3) {
                        uri2 = (Uri) aj0.k(parcel, i4, Uri.CREATOR);
                    } else if (c3 != 4) {
                        aj0.P(parcel, i4);
                    } else {
                        bArrG2 = aj0.g(parcel, i4);
                    }
                }
                aj0.s(parcel, iT4);
                return new BrowserPublicKeyCredentialRequestOptions(publicKeyCredentialRequestOptionsM, uri2, bArrG2);
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                int iT5 = aj0.T(parcel);
                while (parcel.dataPosition() < iT5) {
                    int i5 = parcel.readInt();
                    char c4 = (char) i5;
                    if (c4 == 1) {
                        publicKeyCredentialRequestOptionsM = aj0.m(parcel, i5);
                    } else if (c4 == 2) {
                        jI = aj0.I(parcel, i5);
                    } else if (c4 != 3) {
                        aj0.P(parcel, i5);
                    } else {
                        iG = aj0.G(parcel, i5);
                    }
                }
                aj0.s(parcel, iT5);
                return new zzoh(publicKeyCredentialRequestOptionsM, jI, iG);
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                int iT6 = aj0.T(parcel);
                long jI2 = 0;
                long jI3 = 0;
                int iG3 = 0;
                byte[] bArrG3 = null;
                String strM5 = null;
                Bundle bundleF = null;
                String strM6 = null;
                while (parcel.dataPosition() < iT6) {
                    int i6 = parcel.readInt();
                    switch ((char) i6) {
                        case 1:
                            jI2 = aj0.I(parcel, i6);
                            break;
                        case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                            bArrG3 = aj0.g(parcel, i6);
                            break;
                        case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                            strM5 = aj0.m(parcel, i6);
                            break;
                        case oc1.LONG_FIELD_NUMBER /* 4 */:
                            bundleF = aj0.f(parcel, i6);
                            break;
                        case oc1.STRING_FIELD_NUMBER /* 5 */:
                            iG3 = aj0.G(parcel, i6);
                            break;
                        case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                            jI3 = aj0.I(parcel, i6);
                            break;
                        case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                            strM6 = aj0.m(parcel, i6);
                            break;
                        default:
                            aj0.P(parcel, i6);
                            break;
                    }
                }
                aj0.s(parcel, iT6);
                return new zzom(jI2, bArrG3, strM5, bundleF, iG3, jI3, strM6);
            case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                int iT7 = aj0.T(parcel);
                while (true) {
                    ArrayList arrayList = null;
                    while (true) {
                        if (parcel.dataPosition() >= iT7) {
                            aj0.s(parcel, iT7);
                            return new zzoo(arrayList);
                        }
                        int i7 = parcel.readInt();
                        if (((char) i7) != 1) {
                            aj0.P(parcel, i7);
                        } else {
                            int iK = aj0.K(parcel, i7);
                            int iDataPosition = parcel.dataPosition();
                            if (iK == 0) {
                            }
                            ArrayList arrayList2 = new ArrayList();
                            int i8 = parcel.readInt();
                            for (int i9 = 0; i9 < i8; i9++) {
                                arrayList2.add(Integer.valueOf(parcel.readInt()));
                            }
                            parcel.setDataPosition(iDataPosition + iK);
                            arrayList = arrayList2;
                        }
                        break;
                    }
                }
                break;
            case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                int iT8 = aj0.T(parcel);
                while (parcel.dataPosition() < iT8) {
                    int i10 = parcel.readInt();
                    if (((char) i10) != 1) {
                        aj0.P(parcel, i10);
                    } else {
                        publicKeyCredentialRequestOptionsM = aj0.q(parcel, i10, zzom.CREATOR);
                    }
                }
                aj0.s(parcel, iT8);
                return new zzoq(publicKeyCredentialRequestOptionsM);
            case oc1.BYTES_FIELD_NUMBER /* 8 */:
                try {
                    return COSEAlgorithmIdentifier.a(parcel.readInt());
                } catch (tj e) {
                    sm0.n(e);
                    return null;
                }
            case 9:
                int iT9 = aj0.T(parcel);
                HashSet hashSet = new HashSet();
                int iG4 = 0;
                int iG5 = 0;
                ArrayList arrayListQ = null;
                zzs zzsVar = null;
                while (parcel.dataPosition() < iT9) {
                    int i11 = parcel.readInt();
                    char c5 = (char) i11;
                    if (c5 == 1) {
                        iG4 = aj0.G(parcel, i11);
                        hashSet.add(1);
                    } else if (c5 == 2) {
                        arrayListQ = aj0.q(parcel, i11, zzu.CREATOR);
                        hashSet.add(2);
                    } else if (c5 == 3) {
                        iG5 = aj0.G(parcel, i11);
                        hashSet.add(3);
                    } else if (c5 != 4) {
                        aj0.P(parcel, i11);
                    } else {
                        zzsVar = (zzs) aj0.k(parcel, i11, zzs.CREATOR);
                        hashSet.add(4);
                    }
                }
                if (parcel.dataPosition() == iT9) {
                    return new zzo(hashSet, iG4, arrayListQ, iG5, zzsVar);
                }
                throw new ml1(ck1.r(iT9, "Overread allowed size end="), parcel);
            case 10:
                int iT10 = aj0.T(parcel);
                long jI4 = 0;
                int iG6 = 0;
                String strM7 = null;
                Long lJ2 = null;
                Float fValueOf = null;
                String strM8 = null;
                String strM9 = null;
                Double dE = null;
                while (parcel.dataPosition() < iT10) {
                    int i12 = parcel.readInt();
                    switch ((char) i12) {
                        case 1:
                            iG6 = aj0.G(parcel, i12);
                            break;
                        case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                            strM7 = aj0.m(parcel, i12);
                            break;
                        case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                            jI4 = aj0.I(parcel, i12);
                            break;
                        case oc1.LONG_FIELD_NUMBER /* 4 */:
                            lJ2 = aj0.J(parcel, i12);
                            break;
                        case oc1.STRING_FIELD_NUMBER /* 5 */:
                            int iK2 = aj0.K(parcel, i12);
                            if (iK2 == 0) {
                                fValueOf = null;
                            } else {
                                aj0.Z(parcel, iK2, 4);
                                fValueOf = Float.valueOf(parcel.readFloat());
                            }
                            break;
                        case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                            strM8 = aj0.m(parcel, i12);
                            break;
                        case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                            strM9 = aj0.m(parcel, i12);
                            break;
                        case oc1.BYTES_FIELD_NUMBER /* 8 */:
                            dE = aj0.E(parcel, i12);
                            break;
                        default:
                            aj0.P(parcel, i12);
                            break;
                    }
                }
                aj0.s(parcel, iT10);
                return new zzpl(iG6, strM7, jI4, lJ2, fValueOf, strM8, strM9, dE);
            case 11:
                int iT11 = aj0.T(parcel);
                boolean zC5 = false;
                boolean zC6 = false;
                boolean zC7 = false;
                boolean zC8 = false;
                boolean zC9 = false;
                String strM10 = null;
                IBinder iBinderF = null;
                while (parcel.dataPosition() < iT11) {
                    int i13 = parcel.readInt();
                    switch ((char) i13) {
                        case 1:
                            strM10 = aj0.m(parcel, i13);
                            break;
                        case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                            zC5 = aj0.C(parcel, i13);
                            break;
                        case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                            zC6 = aj0.C(parcel, i13);
                            break;
                        case oc1.LONG_FIELD_NUMBER /* 4 */:
                            iBinderF = aj0.F(parcel, i13);
                            break;
                        case oc1.STRING_FIELD_NUMBER /* 5 */:
                            zC7 = aj0.C(parcel, i13);
                            break;
                        case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                            zC8 = aj0.C(parcel, i13);
                            break;
                        case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                        default:
                            aj0.P(parcel, i13);
                            break;
                        case oc1.BYTES_FIELD_NUMBER /* 8 */:
                            zC9 = aj0.C(parcel, i13);
                            break;
                    }
                }
                aj0.s(parcel, iT11);
                return new zzp(strM10, zC5, zC6, iBinderF, zC7, zC8, zC9);
            case 12:
                int iT12 = aj0.T(parcel);
                long jI5 = 0;
                byte[] bArrG4 = null;
                byte[] bArrG5 = null;
                byte[] bArrG6 = null;
                while (parcel.dataPosition() < iT12) {
                    int i14 = parcel.readInt();
                    char c6 = (char) i14;
                    if (c6 == 1) {
                        jI5 = aj0.I(parcel, i14);
                    } else if (c6 == 2) {
                        bArrG4 = aj0.g(parcel, i14);
                    } else if (c6 == 3) {
                        bArrG5 = aj0.g(parcel, i14);
                    } else if (c6 != 4) {
                        aj0.P(parcel, i14);
                    } else {
                        bArrG6 = aj0.g(parcel, i14);
                    }
                }
                aj0.s(parcel, iT12);
                return new zzq(jI5, bArrG4, bArrG5, bArrG6);
            case 13:
                int iT13 = aj0.T(parcel);
                long jI6 = -1;
                int iG7 = 0;
                int iG8 = 0;
                boolean zC10 = false;
                String strM11 = null;
                while (parcel.dataPosition() < iT13) {
                    int i15 = parcel.readInt();
                    char c7 = (char) i15;
                    if (c7 == 1) {
                        zC10 = aj0.C(parcel, i15);
                    } else if (c7 == 2) {
                        strM11 = aj0.m(parcel, i15);
                    } else if (c7 == 3) {
                        iG7 = aj0.G(parcel, i15);
                    } else if (c7 == 4) {
                        iG8 = aj0.G(parcel, i15);
                    } else if (c7 != 5) {
                        aj0.P(parcel, i15);
                    } else {
                        jI6 = aj0.I(parcel, i15);
                    }
                }
                aj0.s(parcel, iT13);
                return new zzr(iG7, iG8, jI6, strM11, zC10);
            case 14:
                int iT14 = aj0.T(parcel);
                String strM12 = BuildConfig.FLAVOR;
                String strM13 = strM12;
                String strM14 = strM13;
                String strM15 = strM14;
                int iG9 = 100;
                long jI7 = 0;
                long jI8 = 0;
                long jI9 = 0;
                long jI10 = 0;
                long jI11 = 0;
                long jI12 = 0;
                long jI13 = 0;
                long jI14 = 0;
                long jI15 = -2147483648L;
                boolean zC11 = true;
                boolean zC12 = true;
                boolean zC13 = false;
                int iG10 = 0;
                boolean zC14 = false;
                boolean zC15 = false;
                int iG11 = 0;
                int iG12 = 0;
                String strM16 = null;
                String strM17 = null;
                String strM18 = null;
                String strM19 = null;
                String strM20 = null;
                String strM21 = null;
                Boolean boolD2 = null;
                ArrayList arrayListO2 = null;
                String strM22 = null;
                String strM23 = null;
                while (parcel.dataPosition() < iT14) {
                    int i16 = parcel.readInt();
                    switch ((char) i16) {
                        case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                            strM16 = aj0.m(parcel, i16);
                            break;
                        case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                            strM17 = aj0.m(parcel, i16);
                            break;
                        case oc1.LONG_FIELD_NUMBER /* 4 */:
                            strM18 = aj0.m(parcel, i16);
                            break;
                        case oc1.STRING_FIELD_NUMBER /* 5 */:
                            strM19 = aj0.m(parcel, i16);
                            break;
                        case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                            jI7 = aj0.I(parcel, i16);
                            break;
                        case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                            jI8 = aj0.I(parcel, i16);
                            break;
                        case oc1.BYTES_FIELD_NUMBER /* 8 */:
                            strM20 = aj0.m(parcel, i16);
                            break;
                        case '\t':
                            zC11 = aj0.C(parcel, i16);
                            break;
                        case '\n':
                            zC13 = aj0.C(parcel, i16);
                            break;
                        case 11:
                            jI15 = aj0.I(parcel, i16);
                            break;
                        case '\f':
                            strM21 = aj0.m(parcel, i16);
                            break;
                        case '\r':
                        case 17:
                        case 19:
                        case 20:
                        case 24:
                        case '!':
                        default:
                            aj0.P(parcel, i16);
                            break;
                        case 14:
                            jI9 = aj0.I(parcel, i16);
                            break;
                        case 15:
                            iG10 = aj0.G(parcel, i16);
                            break;
                        case 16:
                            zC12 = aj0.C(parcel, i16);
                            break;
                        case 18:
                            zC14 = aj0.C(parcel, i16);
                            break;
                        case 21:
                            boolD2 = aj0.D(parcel, i16);
                            break;
                        case 22:
                            jI10 = aj0.I(parcel, i16);
                            break;
                        case 23:
                            arrayListO2 = aj0.o(parcel, i16);
                            break;
                        case 25:
                            strM12 = aj0.m(parcel, i16);
                            break;
                        case 26:
                            strM13 = aj0.m(parcel, i16);
                            break;
                        case 27:
                            strM22 = aj0.m(parcel, i16);
                            break;
                        case 28:
                            zC15 = aj0.C(parcel, i16);
                            break;
                        case 29:
                            jI11 = aj0.I(parcel, i16);
                            break;
                        case 30:
                            iG9 = aj0.G(parcel, i16);
                            break;
                        case 31:
                            strM14 = aj0.m(parcel, i16);
                            break;
                        case ' ':
                            iG11 = aj0.G(parcel, i16);
                            break;
                        case '\"':
                            jI12 = aj0.I(parcel, i16);
                            break;
                        case '#':
                            strM23 = aj0.m(parcel, i16);
                            break;
                        case '$':
                            strM15 = aj0.m(parcel, i16);
                            break;
                        case '%':
                            jI13 = aj0.I(parcel, i16);
                            break;
                        case '&':
                            iG12 = aj0.G(parcel, i16);
                            break;
                        case '\'':
                            jI14 = aj0.I(parcel, i16);
                            break;
                    }
                }
                aj0.s(parcel, iT14);
                return new com.google.android.gms.measurement.internal.zzr(strM16, strM17, strM18, strM19, jI7, jI8, strM20, zC11, zC13, jI15, strM21, jI9, iG10, zC12, zC14, boolD2, jI10, arrayListO2, strM12, strM13, strM22, zC15, jI11, iG9, strM14, iG11, jI12, strM23, strM15, jI13, iG12, jI14);
            case 15:
                int iT15 = aj0.T(parcel);
                while (parcel.dataPosition() < iT15) {
                    int i17 = parcel.readInt();
                    if (((char) i17) != 1) {
                        aj0.P(parcel, i17);
                    } else {
                        publicKeyCredentialRequestOptionsM = aj0.q(parcel, i17, zzq.CREATOR);
                    }
                }
                aj0.s(parcel, iT15);
                return new com.google.android.gms.fido.fido2.api.common.zzs(publicKeyCredentialRequestOptionsM);
            case 16:
                int iT16 = aj0.T(parcel);
                int iG13 = 0;
                ArrayList arrayListO3 = null;
                ArrayList arrayListO4 = null;
                ArrayList arrayListO5 = null;
                ArrayList arrayListO6 = null;
                ArrayList arrayListO7 = null;
                while (parcel.dataPosition() < iT16) {
                    int i18 = parcel.readInt();
                    switch ((char) i18) {
                        case 1:
                            iG13 = aj0.G(parcel, i18);
                            break;
                        case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                            arrayListO3 = aj0.o(parcel, i18);
                            break;
                        case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                            arrayListO4 = aj0.o(parcel, i18);
                            break;
                        case oc1.LONG_FIELD_NUMBER /* 4 */:
                            arrayListO5 = aj0.o(parcel, i18);
                            break;
                        case oc1.STRING_FIELD_NUMBER /* 5 */:
                            arrayListO6 = aj0.o(parcel, i18);
                            break;
                        case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                            arrayListO7 = aj0.o(parcel, i18);
                            break;
                        default:
                            aj0.P(parcel, i18);
                            break;
                    }
                }
                aj0.s(parcel, iT16);
                return new zzs(iG13, arrayListO3, arrayListO4, arrayListO5, arrayListO6, arrayListO7);
            case 17:
                int iT17 = aj0.T(parcel);
                boolean zC16 = false;
                IBinder iBinderF2 = null;
                while (parcel.dataPosition() < iT17) {
                    int i19 = parcel.readInt();
                    char c8 = (char) i19;
                    if (c8 == 1) {
                        publicKeyCredentialRequestOptionsM = aj0.m(parcel, i19);
                    } else if (c8 == 2) {
                        iBinderF2 = aj0.F(parcel, i19);
                    } else if (c8 == 3) {
                        zC2 = aj0.C(parcel, i19);
                    } else if (c8 != 4) {
                        aj0.P(parcel, i19);
                    } else {
                        zC16 = aj0.C(parcel, i19);
                    }
                }
                aj0.s(parcel, iT17);
                return new zzt(publicKeyCredentialRequestOptionsM, iBinderF2, zC2, zC16);
            case 18:
                int iT18 = aj0.T(parcel);
                while (parcel.dataPosition() < iT18) {
                    int i20 = parcel.readInt();
                    if (((char) i20) != 1) {
                        aj0.P(parcel, i20);
                    } else {
                        aj0.C(parcel, i20);
                    }
                }
                aj0.s(parcel, iT18);
                return new com.google.android.gms.fido.fido2.api.common.zzu();
            case 19:
                int iT19 = aj0.T(parcel);
                HashSet hashSet2 = new HashSet();
                int iG14 = 0;
                zzw zzwVar = null;
                String strM24 = null;
                String strM25 = null;
                String strM26 = null;
                while (parcel.dataPosition() < iT19) {
                    int i21 = parcel.readInt();
                    char c9 = (char) i21;
                    if (c9 == 1) {
                        iG14 = aj0.G(parcel, i21);
                        hashSet2.add(1);
                    } else if (c9 == 2) {
                        zzwVar = (zzw) aj0.k(parcel, i21, zzw.CREATOR);
                        hashSet2.add(2);
                    } else if (c9 == 3) {
                        strM24 = aj0.m(parcel, i21);
                        hashSet2.add(3);
                    } else if (c9 == 4) {
                        strM25 = aj0.m(parcel, i21);
                        hashSet2.add(4);
                    } else if (c9 != 5) {
                        aj0.P(parcel, i21);
                    } else {
                        strM26 = aj0.m(parcel, i21);
                        hashSet2.add(5);
                    }
                }
                if (parcel.dataPosition() == iT19) {
                    return new zzu(hashSet2, iG14, zzwVar, strM24, strM25, strM26);
                }
                throw new ml1(ck1.r(iT19, "Overread allowed size end="), parcel);
            case 20:
                try {
                    return ErrorCode.a(parcel.readInt());
                } catch (h70 e2) {
                    sm0.s(e2);
                    return null;
                }
            case 21:
                int iT20 = aj0.T(parcel);
                while (parcel.dataPosition() < iT20) {
                    int i22 = parcel.readInt();
                    if (((char) i22) != 2) {
                        aj0.P(parcel, i22);
                    } else {
                        publicKeyCredentialRequestOptionsM = aj0.m(parcel, i22);
                    }
                }
                aj0.s(parcel, iT20);
                return new FidoAppIdExtension(publicKeyCredentialRequestOptionsM);
            case 22:
                int iT21 = aj0.T(parcel);
                HashSet hashSet3 = new HashSet();
                int iG15 = 0;
                int iG16 = 0;
                String strM27 = null;
                byte[] bArrG7 = null;
                PendingIntent pendingIntent = null;
                DeviceMetaData deviceMetaData = null;
                while (parcel.dataPosition() < iT21) {
                    int i23 = parcel.readInt();
                    switch ((char) i23) {
                        case 1:
                            iG15 = aj0.G(parcel, i23);
                            hashSet3.add(1);
                            break;
                        case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                            strM27 = aj0.m(parcel, i23);
                            hashSet3.add(2);
                            break;
                        case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                            iG16 = aj0.G(parcel, i23);
                            hashSet3.add(3);
                            break;
                        case oc1.LONG_FIELD_NUMBER /* 4 */:
                            bArrG7 = aj0.g(parcel, i23);
                            hashSet3.add(4);
                            break;
                        case oc1.STRING_FIELD_NUMBER /* 5 */:
                            pendingIntent = (PendingIntent) aj0.k(parcel, i23, PendingIntent.CREATOR);
                            hashSet3.add(5);
                            break;
                        case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                            deviceMetaData = (DeviceMetaData) aj0.k(parcel, i23, DeviceMetaData.CREATOR);
                            hashSet3.add(6);
                            break;
                        default:
                            aj0.P(parcel, i23);
                            break;
                    }
                }
                if (parcel.dataPosition() == iT21) {
                    return new zzw(hashSet3, iG15, strM27, iG16, bArrG7, pendingIntent, deviceMetaData);
                }
                throw new ml1(ck1.r(iT21, "Overread allowed size end="), parcel);
            case 23:
                int iT22 = aj0.T(parcel);
                long jI16 = 0;
                boolean zC17 = false;
                boolean zC18 = false;
                boolean zC19 = false;
                String strM28 = null;
                String strM29 = null;
                byte[] bArrG8 = null;
                byte[] bArrG9 = null;
                Account account = null;
                while (parcel.dataPosition() < iT22) {
                    int i24 = parcel.readInt();
                    switch ((char) i24) {
                        case 1:
                            strM28 = aj0.m(parcel, i24);
                            break;
                        case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                            strM29 = aj0.m(parcel, i24);
                            break;
                        case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                            bArrG8 = aj0.g(parcel, i24);
                            break;
                        case oc1.LONG_FIELD_NUMBER /* 4 */:
                            bArrG9 = aj0.g(parcel, i24);
                            break;
                        case oc1.STRING_FIELD_NUMBER /* 5 */:
                            zC17 = aj0.C(parcel, i24);
                            break;
                        case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                            zC18 = aj0.C(parcel, i24);
                            break;
                        case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                            jI16 = aj0.I(parcel, i24);
                            break;
                        case oc1.BYTES_FIELD_NUMBER /* 8 */:
                            account = (Account) aj0.k(parcel, i24, Account.CREATOR);
                            break;
                        case '\t':
                            zC19 = aj0.C(parcel, i24);
                            break;
                        default:
                            aj0.P(parcel, i24);
                            break;
                    }
                }
                aj0.s(parcel, iT22);
                return new FidoCredentialDetails(strM28, strM29, bArrG8, bArrG9, zC17, zC18, jI16, account, zC19);
            case 24:
                int iT23 = aj0.T(parcel);
                String strM30 = null;
                while (parcel.dataPosition() < iT23) {
                    int i25 = parcel.readInt();
                    char c10 = (char) i25;
                    if (c10 == 1) {
                        publicKeyCredentialRequestOptionsM = aj0.m(parcel, i25);
                    } else if (c10 == 2) {
                        strM30 = aj0.m(parcel, i25);
                    } else if (c10 != 3) {
                        aj0.P(parcel, i25);
                    } else {
                        zC = aj0.C(parcel, i25);
                    }
                }
                aj0.s(parcel, iT23);
                return new zzv(publicKeyCredentialRequestOptionsM, strM30, zC);
            default:
                int iT24 = aj0.T(parcel);
                long jI17 = 0;
                int iG17 = 0;
                boolean zC20 = false;
                boolean zC21 = false;
                while (parcel.dataPosition() < iT24) {
                    int i26 = parcel.readInt();
                    char c11 = (char) i26;
                    if (c11 == 1) {
                        iG17 = aj0.G(parcel, i26);
                    } else if (c11 == 2) {
                        zC20 = aj0.C(parcel, i26);
                    } else if (c11 == 3) {
                        jI17 = aj0.I(parcel, i26);
                    } else if (c11 != 4) {
                        aj0.P(parcel, i26);
                    } else {
                        zC21 = aj0.C(parcel, i26);
                    }
                }
                aj0.s(parcel, iT24);
                return new DeviceMetaData(iG17, zC20, jI17, zC21);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new AuthenticatorSelectionCriteria[i];
            case 1:
                return new TokenData[i];
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                return new BrowserPublicKeyCredentialCreationOptions[i];
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                return new BrowserPublicKeyCredentialRequestOptions[i];
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                return new zzoh[i];
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                return new zzom[i];
            case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                return new zzoo[i];
            case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                return new zzoq[i];
            case oc1.BYTES_FIELD_NUMBER /* 8 */:
                return new COSEAlgorithmIdentifier[i];
            case 9:
                return new zzo[i];
            case 10:
                return new zzpl[i];
            case 11:
                return new zzp[i];
            case 12:
                return new zzq[i];
            case 13:
                return new zzr[i];
            case 14:
                return new com.google.android.gms.measurement.internal.zzr[i];
            case 15:
                return new com.google.android.gms.fido.fido2.api.common.zzs[i];
            case 16:
                return new zzs[i];
            case 17:
                return new zzt[i];
            case 18:
                return new com.google.android.gms.fido.fido2.api.common.zzu[i];
            case 19:
                return new zzu[i];
            case 20:
                return new ErrorCode[i];
            case 21:
                return new FidoAppIdExtension[i];
            case 22:
                return new zzw[i];
            case 23:
                return new FidoCredentialDetails[i];
            case 24:
                return new zzv[i];
            default:
                return new DeviceMetaData[i];
        }
    }
}
