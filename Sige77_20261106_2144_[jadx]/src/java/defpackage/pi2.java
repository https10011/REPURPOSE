package defpackage;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.AccountChangeEvent;
import com.google.android.gms.auth.api.identity.GetSignInIntentRequest;
import com.google.android.gms.auth.api.identity.RevokeAccessRequest;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenResult;
import com.google.android.gms.auth.api.identity.SavePasswordRequest;
import com.google.android.gms.auth.api.identity.SavePasswordResult;
import com.google.android.gms.auth.api.identity.SignInCredential;
import com.google.android.gms.auth.api.identity.SignInPassword;
import com.google.android.gms.auth.api.identity.zbf;
import com.google.android.gms.auth.api.proxy.ProxyRequest;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.stats.WakeLockEvent;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.fido.fido2.api.common.Attachment;
import com.google.android.gms.fido.fido2.api.common.GoogleThirdPartyPaymentExtension;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import com.google.android.gms.fido.fido2.api.common.zzab;
import com.google.android.gms.fido.fido2.api.common.zzag;
import com.google.android.gms.fido.fido2.api.common.zzz;
import com.google.android.gms.internal.firebase-auth-api.zzahd;
import com.google.android.gms.internal.firebase-auth-api.zzaih;
import com.google.android.gms.measurement.internal.zzaf;
import com.google.android.gms.measurement.internal.zzah;
import com.google.android.gms.measurement.internal.zzbh;
import com.google.android.gms.measurement.internal.zzpl;
import com.google.firebase.auth.internal.zzad;
import com.google.firebase.auth.internal.zzbl;
import com.google.firebase.auth.internal.zzv;
import com.google.firebase.auth.internal.zzx;
import com.google.firebase.auth.zzao;
import com.google.firebase.auth.zzc;
import java.util.ArrayList;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class pi2 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        long jI = 0;
        int iG = 0;
        boolean zC = false;
        boolean zC2 = false;
        boolean zC3 = false;
        boolean zC4 = false;
        zzahd zzahdVarQ = null;
        switch (this.a) {
            case 0:
                int iT = aj0.T(parcel);
                boolean zC5 = false;
                int iG2 = 0;
                String strM = null;
                String strM2 = null;
                String strM3 = null;
                String strM4 = null;
                ArrayList arrayListQ = null;
                while (parcel.dataPosition() < iT) {
                    int i = parcel.readInt();
                    switch ((char) i) {
                        case 1:
                            strM = aj0.m(parcel, i);
                            break;
                        case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                            strM2 = aj0.m(parcel, i);
                            break;
                        case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                            strM3 = aj0.m(parcel, i);
                            break;
                        case oc1.LONG_FIELD_NUMBER /* 4 */:
                            strM4 = aj0.m(parcel, i);
                            break;
                        case oc1.STRING_FIELD_NUMBER /* 5 */:
                            zC5 = aj0.C(parcel, i);
                            break;
                        case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                            iG2 = aj0.G(parcel, i);
                            break;
                        case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                            arrayListQ = aj0.q(parcel, i, zbf.CREATOR);
                            break;
                        default:
                            aj0.P(parcel, i);
                            break;
                    }
                }
                aj0.s(parcel, iT);
                return new GetSignInIntentRequest(strM, strM2, strM3, strM4, zC5, iG2, arrayListQ);
            case 1:
                int iT2 = aj0.T(parcel);
                Account account = null;
                String strM5 = null;
                while (parcel.dataPosition() < iT2) {
                    int i2 = parcel.readInt();
                    char c = (char) i2;
                    if (c == 1) {
                        zzahdVarQ = aj0.q(parcel, i2, Scope.CREATOR);
                    } else if (c == 2) {
                        account = (Account) aj0.k(parcel, i2, Account.CREATOR);
                    } else if (c != 3) {
                        aj0.P(parcel, i2);
                    } else {
                        strM5 = aj0.m(parcel, i2);
                    }
                }
                aj0.s(parcel, iT2);
                return new RevokeAccessRequest(zzahdVarQ, account, strM5);
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                int iT3 = aj0.T(parcel);
                int iG3 = 0;
                PendingIntent pendingIntent = null;
                String strM6 = null;
                String strM7 = null;
                ArrayList arrayListO = null;
                String strM8 = null;
                while (parcel.dataPosition() < iT3) {
                    int i3 = parcel.readInt();
                    switch ((char) i3) {
                        case 1:
                            pendingIntent = (PendingIntent) aj0.k(parcel, i3, PendingIntent.CREATOR);
                            break;
                        case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                            strM6 = aj0.m(parcel, i3);
                            break;
                        case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                            strM7 = aj0.m(parcel, i3);
                            break;
                        case oc1.LONG_FIELD_NUMBER /* 4 */:
                            arrayListO = aj0.o(parcel, i3);
                            break;
                        case oc1.STRING_FIELD_NUMBER /* 5 */:
                            strM8 = aj0.m(parcel, i3);
                            break;
                        case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                            iG3 = aj0.G(parcel, i3);
                            break;
                        default:
                            aj0.P(parcel, i3);
                            break;
                    }
                }
                aj0.s(parcel, iT3);
                return new SaveAccountLinkingTokenRequest(pendingIntent, strM6, strM7, arrayListO, strM8, iG3);
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                int iT4 = aj0.T(parcel);
                while (parcel.dataPosition() < iT4) {
                    int i4 = parcel.readInt();
                    if (((char) i4) != 1) {
                        aj0.P(parcel, i4);
                    } else {
                        zzahdVarQ = (PendingIntent) aj0.k(parcel, i4, PendingIntent.CREATOR);
                    }
                }
                aj0.s(parcel, iT4);
                return new SaveAccountLinkingTokenResult(zzahdVarQ);
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                int iT5 = aj0.T(parcel);
                String strM9 = null;
                while (parcel.dataPosition() < iT5) {
                    int i5 = parcel.readInt();
                    char c2 = (char) i5;
                    if (c2 == 1) {
                        zzahdVarQ = (SignInPassword) aj0.k(parcel, i5, SignInPassword.CREATOR);
                    } else if (c2 == 2) {
                        strM9 = aj0.m(parcel, i5);
                    } else if (c2 != 3) {
                        aj0.P(parcel, i5);
                    } else {
                        iG = aj0.G(parcel, i5);
                    }
                }
                aj0.s(parcel, iT5);
                return new SavePasswordRequest(zzahdVarQ, strM9, iG);
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                int iT6 = aj0.T(parcel);
                while (parcel.dataPosition() < iT6) {
                    int i6 = parcel.readInt();
                    if (((char) i6) != 1) {
                        aj0.P(parcel, i6);
                    } else {
                        zzahdVarQ = (PendingIntent) aj0.k(parcel, i6, PendingIntent.CREATOR);
                    }
                }
                aj0.s(parcel, iT6);
                return new SavePasswordResult(zzahdVarQ);
            case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                int iT7 = aj0.T(parcel);
                GoogleSignInOptions googleSignInOptions = null;
                while (parcel.dataPosition() < iT7) {
                    int i7 = parcel.readInt();
                    char c3 = (char) i7;
                    if (c3 == 2) {
                        zzahdVarQ = aj0.m(parcel, i7);
                    } else if (c3 != 5) {
                        aj0.P(parcel, i7);
                    } else {
                        googleSignInOptions = (GoogleSignInOptions) aj0.k(parcel, i7, GoogleSignInOptions.CREATOR);
                    }
                }
                aj0.s(parcel, iT7);
                return new SignInConfiguration(zzahdVarQ, googleSignInOptions);
            case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                int iT8 = aj0.T(parcel);
                String strM10 = null;
                String strM11 = null;
                String strM12 = null;
                String strM13 = null;
                Uri uri = null;
                String strM14 = null;
                String strM15 = null;
                String strM16 = null;
                PublicKeyCredential publicKeyCredential = null;
                while (parcel.dataPosition() < iT8) {
                    int i8 = parcel.readInt();
                    switch ((char) i8) {
                        case 1:
                            strM10 = aj0.m(parcel, i8);
                            break;
                        case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                            strM11 = aj0.m(parcel, i8);
                            break;
                        case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                            strM12 = aj0.m(parcel, i8);
                            break;
                        case oc1.LONG_FIELD_NUMBER /* 4 */:
                            strM13 = aj0.m(parcel, i8);
                            break;
                        case oc1.STRING_FIELD_NUMBER /* 5 */:
                            uri = (Uri) aj0.k(parcel, i8, Uri.CREATOR);
                            break;
                        case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                            strM14 = aj0.m(parcel, i8);
                            break;
                        case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                            strM15 = aj0.m(parcel, i8);
                            break;
                        case oc1.BYTES_FIELD_NUMBER /* 8 */:
                            strM16 = aj0.m(parcel, i8);
                            break;
                        case '\t':
                            publicKeyCredential = (PublicKeyCredential) aj0.k(parcel, i8, PublicKeyCredential.CREATOR);
                            break;
                        default:
                            aj0.P(parcel, i8);
                            break;
                    }
                }
                aj0.s(parcel, iT8);
                return new SignInCredential(strM10, strM11, strM12, strM13, uri, strM14, strM15, strM16, publicKeyCredential);
            case oc1.BYTES_FIELD_NUMBER /* 8 */:
                int iT9 = aj0.T(parcel);
                String strM17 = null;
                while (parcel.dataPosition() < iT9) {
                    int i9 = parcel.readInt();
                    char c4 = (char) i9;
                    if (c4 == 1) {
                        zzahdVarQ = aj0.m(parcel, i9);
                    } else if (c4 != 2) {
                        aj0.P(parcel, i9);
                    } else {
                        strM17 = aj0.m(parcel, i9);
                    }
                }
                aj0.s(parcel, iT9);
                return new SignInPassword(zzahdVarQ, strM17);
            case 9:
                try {
                    return Transport.a(parcel.readString());
                } catch (a02 e) {
                    sm0.n(e);
                    return null;
                }
            case 10:
                try {
                    return Attachment.a(parcel.readString());
                } catch (kc e2) {
                    sm0.n(e2);
                    return null;
                }
            case 11:
                int iT10 = aj0.T(parcel);
                long jI2 = 0;
                int iG4 = 0;
                int iG5 = 0;
                String strM18 = null;
                byte[] bArrG = null;
                Bundle bundleF = null;
                while (parcel.dataPosition() < iT10) {
                    int i10 = parcel.readInt();
                    char c5 = (char) i10;
                    if (c5 == 1) {
                        strM18 = aj0.m(parcel, i10);
                    } else if (c5 == 2) {
                        iG5 = aj0.G(parcel, i10);
                    } else if (c5 == 3) {
                        jI2 = aj0.I(parcel, i10);
                    } else if (c5 == 4) {
                        bArrG = aj0.g(parcel, i10);
                    } else if (c5 == 5) {
                        bundleF = aj0.f(parcel, i10);
                    } else if (c5 != 1000) {
                        aj0.P(parcel, i10);
                    } else {
                        iG4 = aj0.G(parcel, i10);
                    }
                }
                aj0.s(parcel, iT10);
                return new ProxyRequest(iG4, strM18, iG5, jI2, bArrG, bundleF);
            case 12:
                int iT11 = aj0.T(parcel);
                while (parcel.dataPosition() < iT11) {
                    int i11 = parcel.readInt();
                    if (((char) i11) != 1) {
                        aj0.P(parcel, i11);
                    } else {
                        zzahdVarQ = (Intent) aj0.k(parcel, i11, Intent.CREATOR);
                    }
                }
                aj0.s(parcel, iT11);
                return new CloudMessage(zzahdVarQ);
            case 13:
                int iT12 = aj0.T(parcel);
                int iG6 = 0;
                int iG7 = 0;
                PendingIntent pendingIntent2 = null;
                String strM19 = null;
                Integer numH = null;
                while (parcel.dataPosition() < iT12) {
                    int i12 = parcel.readInt();
                    char c6 = (char) i12;
                    if (c6 == 1) {
                        iG6 = aj0.G(parcel, i12);
                    } else if (c6 == 2) {
                        iG7 = aj0.G(parcel, i12);
                    } else if (c6 == 3) {
                        pendingIntent2 = (PendingIntent) aj0.k(parcel, i12, PendingIntent.CREATOR);
                    } else if (c6 == 4) {
                        strM19 = aj0.m(parcel, i12);
                    } else if (c6 != 5) {
                        aj0.P(parcel, i12);
                    } else {
                        numH = aj0.H(parcel, i12);
                    }
                }
                aj0.s(parcel, iT12);
                return new ConnectionResult(iG6, iG7, pendingIntent2, strM19, numH);
            case 14:
                int iT13 = aj0.T(parcel);
                float f = 0.0f;
                long jI3 = 0;
                long jI4 = 0;
                long jI5 = 0;
                int iG8 = 0;
                int iG9 = 0;
                int iG10 = 0;
                int iG11 = 0;
                boolean zC6 = false;
                String strM20 = null;
                ArrayList arrayListO2 = null;
                String strM21 = null;
                String strM22 = null;
                String strM23 = null;
                String strM24 = null;
                while (parcel.dataPosition() < iT13) {
                    int i13 = parcel.readInt();
                    switch ((char) i13) {
                        case 1:
                            iG8 = aj0.G(parcel, i13);
                            break;
                        case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                            jI3 = aj0.I(parcel, i13);
                            break;
                        case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                        case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                        case '\t':
                        default:
                            aj0.P(parcel, i13);
                            break;
                        case oc1.LONG_FIELD_NUMBER /* 4 */:
                            strM20 = aj0.m(parcel, i13);
                            break;
                        case oc1.STRING_FIELD_NUMBER /* 5 */:
                            iG10 = aj0.G(parcel, i13);
                            break;
                        case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                            arrayListO2 = aj0.o(parcel, i13);
                            break;
                        case oc1.BYTES_FIELD_NUMBER /* 8 */:
                            jI4 = aj0.I(parcel, i13);
                            break;
                        case '\n':
                            strM22 = aj0.m(parcel, i13);
                            break;
                        case 11:
                            iG9 = aj0.G(parcel, i13);
                            break;
                        case '\f':
                            strM21 = aj0.m(parcel, i13);
                            break;
                        case '\r':
                            strM23 = aj0.m(parcel, i13);
                            break;
                        case 14:
                            iG11 = aj0.G(parcel, i13);
                            break;
                        case 15:
                            aj0.X(parcel, i13, 4);
                            f = parcel.readFloat();
                            break;
                        case 16:
                            jI5 = aj0.I(parcel, i13);
                            break;
                        case 17:
                            strM24 = aj0.m(parcel, i13);
                            break;
                        case 18:
                            zC6 = aj0.C(parcel, i13);
                            break;
                    }
                }
                aj0.s(parcel, iT13);
                return new WakeLockEvent(iG8, jI3, iG9, strM20, iG10, arrayListO2, strM21, jI4, iG11, strM22, strM23, f, jI5, strM24, zC6);
            case 15:
                int iT14 = aj0.T(parcel);
                long jI6 = 0;
                int iG12 = 0;
                int iG13 = 0;
                int iG14 = 0;
                String strM25 = null;
                String strM26 = null;
                while (parcel.dataPosition() < iT14) {
                    int i14 = parcel.readInt();
                    switch ((char) i14) {
                        case 1:
                            iG12 = aj0.G(parcel, i14);
                            break;
                        case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                            jI6 = aj0.I(parcel, i14);
                            break;
                        case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                            strM25 = aj0.m(parcel, i14);
                            break;
                        case oc1.LONG_FIELD_NUMBER /* 4 */:
                            iG13 = aj0.G(parcel, i14);
                            break;
                        case oc1.STRING_FIELD_NUMBER /* 5 */:
                            iG14 = aj0.G(parcel, i14);
                            break;
                        case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                            strM26 = aj0.m(parcel, i14);
                            break;
                        default:
                            aj0.P(parcel, i14);
                            break;
                    }
                }
                aj0.s(parcel, iT14);
                return new AccountChangeEvent(iG12, jI6, strM25, iG13, iG14, strM26);
            case 16:
                int iT15 = aj0.T(parcel);
                while (parcel.dataPosition() < iT15) {
                    int i15 = parcel.readInt();
                    if (((char) i15) != 1) {
                        aj0.P(parcel, i15);
                    } else {
                        zC4 = aj0.C(parcel, i15);
                    }
                }
                aj0.s(parcel, iT15);
                return new zzz(zC4);
            case 17:
                int iT16 = aj0.T(parcel);
                zzv zzvVar = null;
                zzc zzcVar = null;
                while (parcel.dataPosition() < iT16) {
                    int i16 = parcel.readInt();
                    char c7 = (char) i16;
                    if (c7 == 1) {
                        zzahdVarQ = (zzad) aj0.k(parcel, i16, zzad.CREATOR);
                    } else if (c7 == 2) {
                        zzvVar = (zzv) aj0.k(parcel, i16, zzv.CREATOR);
                    } else if (c7 != 3) {
                        aj0.P(parcel, i16);
                    } else {
                        zzcVar = (zzc) aj0.k(parcel, i16, zzc.CREATOR);
                    }
                }
                aj0.s(parcel, iT16);
                zzx zzxVar = new zzx();
                zzxVar.a = zzahdVarQ;
                zzxVar.b = zzvVar;
                zzxVar.c = zzcVar;
                return zzxVar;
            case 18:
                int iT17 = aj0.T(parcel);
                while (parcel.dataPosition() < iT17) {
                    int i17 = parcel.readInt();
                    if (((char) i17) != 1) {
                        aj0.P(parcel, i17);
                    } else {
                        jI = aj0.I(parcel, i17);
                    }
                }
                aj0.s(parcel, iT17);
                return new zzab(jI);
            case 19:
                int iT18 = aj0.T(parcel);
                boolean zC7 = false;
                String strM27 = null;
                String strM28 = null;
                String strM29 = null;
                String strM30 = null;
                String strM31 = null;
                String strM32 = null;
                String strM33 = null;
                while (parcel.dataPosition() < iT18) {
                    int i18 = parcel.readInt();
                    switch ((char) i18) {
                        case 1:
                            strM27 = aj0.m(parcel, i18);
                            break;
                        case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                            strM28 = aj0.m(parcel, i18);
                            break;
                        case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                            strM31 = aj0.m(parcel, i18);
                            break;
                        case oc1.LONG_FIELD_NUMBER /* 4 */:
                            strM30 = aj0.m(parcel, i18);
                            break;
                        case oc1.STRING_FIELD_NUMBER /* 5 */:
                            strM29 = aj0.m(parcel, i18);
                            break;
                        case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                            strM32 = aj0.m(parcel, i18);
                            break;
                        case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                            zC7 = aj0.C(parcel, i18);
                            break;
                        case oc1.BYTES_FIELD_NUMBER /* 8 */:
                            strM33 = aj0.m(parcel, i18);
                            break;
                        default:
                            aj0.P(parcel, i18);
                            break;
                    }
                }
                aj0.s(parcel, iT18);
                return new com.google.firebase.auth.internal.zzz(strM27, strM28, strM29, strM30, strM31, strM32, zC7, strM33);
            case 20:
                int iT19 = aj0.T(parcel);
                while (parcel.dataPosition() < iT19) {
                    int i19 = parcel.readInt();
                    if (((char) i19) != 1) {
                        aj0.P(parcel, i19);
                    } else {
                        zC3 = aj0.C(parcel, i19);
                    }
                }
                aj0.s(parcel, iT19);
                return new com.google.android.gms.fido.fido2.api.common.zzad(zC3);
            case 21:
                int iT20 = aj0.T(parcel);
                while (parcel.dataPosition() < iT20) {
                    int i20 = parcel.readInt();
                    if (((char) i20) != 1) {
                        aj0.P(parcel, i20);
                    } else {
                        zC2 = aj0.C(parcel, i20);
                    }
                }
                aj0.s(parcel, iT20);
                return new GoogleThirdPartyPaymentExtension(zC2);
            case 22:
                int iT21 = aj0.T(parcel);
                long jI7 = 0;
                long jI8 = 0;
                int iG15 = 0;
                while (parcel.dataPosition() < iT21) {
                    int i21 = parcel.readInt();
                    char c8 = (char) i21;
                    if (c8 == 1) {
                        jI7 = aj0.I(parcel, i21);
                    } else if (c8 == 2) {
                        iG15 = aj0.G(parcel, i21);
                    } else if (c8 != 3) {
                        aj0.P(parcel, i21);
                    } else {
                        jI8 = aj0.I(parcel, i21);
                    }
                }
                aj0.s(parcel, iT21);
                return new zzaf(iG15, jI7, jI8);
            case 23:
                int iT22 = aj0.T(parcel);
                com.google.firebase.auth.internal.zzz zzzVar = null;
                String strM34 = null;
                String strM35 = null;
                ArrayList arrayListQ2 = null;
                ArrayList arrayListO3 = null;
                String strM36 = null;
                Boolean boolD = null;
                com.google.firebase.auth.internal.zzaf zzafVar = null;
                zzc zzcVar2 = null;
                zzbl zzblVar = null;
                ArrayList arrayListQ3 = null;
                while (parcel.dataPosition() < iT22) {
                    int i22 = parcel.readInt();
                    ArrayList arrayList = arrayListQ3;
                    switch ((char) i22) {
                        case 1:
                            zzahdVarQ = (zzahd) aj0.k(parcel, i22, zzahd.CREATOR);
                            break;
                        case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                            zzzVar = (com.google.firebase.auth.internal.zzz) aj0.k(parcel, i22, com.google.firebase.auth.internal.zzz.CREATOR);
                            break;
                        case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                            strM34 = aj0.m(parcel, i22);
                            break;
                        case oc1.LONG_FIELD_NUMBER /* 4 */:
                            strM35 = aj0.m(parcel, i22);
                            break;
                        case oc1.STRING_FIELD_NUMBER /* 5 */:
                            arrayListQ2 = aj0.q(parcel, i22, com.google.firebase.auth.internal.zzz.CREATOR);
                            break;
                        case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                            arrayListO3 = aj0.o(parcel, i22);
                            break;
                        case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                            strM36 = aj0.m(parcel, i22);
                            break;
                        case oc1.BYTES_FIELD_NUMBER /* 8 */:
                            boolD = aj0.D(parcel, i22);
                            break;
                        case '\t':
                            zzafVar = (com.google.firebase.auth.internal.zzaf) aj0.k(parcel, i22, com.google.firebase.auth.internal.zzaf.CREATOR);
                            break;
                        case '\n':
                            zC = aj0.C(parcel, i22);
                            break;
                        case 11:
                            zzcVar2 = (zzc) aj0.k(parcel, i22, zzc.CREATOR);
                            break;
                        case '\f':
                            zzblVar = (zzbl) aj0.k(parcel, i22, zzbl.CREATOR);
                            break;
                        case '\r':
                            arrayListQ3 = aj0.q(parcel, i22, zzao.CREATOR);
                            continue;
                        default:
                            aj0.P(parcel, i22);
                            break;
                    }
                    arrayListQ3 = arrayList;
                }
                aj0.s(parcel, iT22);
                zzad zzadVar = new zzad();
                zzadVar.a = zzahdVarQ;
                zzadVar.b = zzzVar;
                zzadVar.c = strM34;
                zzadVar.d = strM35;
                zzadVar.e = arrayListQ2;
                zzadVar.f = arrayListO3;
                zzadVar.i = strM36;
                zzadVar.v = boolD;
                zzadVar.w = zzafVar;
                zzadVar.W = zC;
                zzadVar.X = zzcVar2;
                zzadVar.Y = zzblVar;
                zzadVar.Z = arrayListQ3;
                return zzadVar;
            case 24:
                int iT23 = aj0.T(parcel);
                int iG16 = 0;
                boolean zC8 = false;
                boolean zC9 = false;
                int iG17 = 0;
                int iG18 = 0;
                while (parcel.dataPosition() < iT23) {
                    int i23 = parcel.readInt();
                    char c9 = (char) i23;
                    if (c9 == 1) {
                        iG16 = aj0.G(parcel, i23);
                    } else if (c9 == 2) {
                        zC8 = aj0.C(parcel, i23);
                    } else if (c9 == 3) {
                        zC9 = aj0.C(parcel, i23);
                    } else if (c9 == 4) {
                        iG17 = aj0.G(parcel, i23);
                    } else if (c9 != 5) {
                        aj0.P(parcel, i23);
                    } else {
                        iG18 = aj0.G(parcel, i23);
                    }
                }
                aj0.s(parcel, iT23);
                return new RootTelemetryConfiguration(iG16, zC8, zC9, iG17, iG18);
            case 25:
                int iT24 = aj0.T(parcel);
                while (parcel.dataPosition() < iT24) {
                    int i24 = parcel.readInt();
                    if (((char) i24) != 1) {
                        aj0.P(parcel, i24);
                    } else {
                        zzahdVarQ = aj0.m(parcel, i24);
                    }
                }
                aj0.s(parcel, iT24);
                return new zzag(zzahdVarQ);
            case 26:
                int iT25 = aj0.T(parcel);
                String strM37 = null;
                String strM38 = null;
                Long lJ = null;
                String strM39 = null;
                Long lJ2 = null;
                while (parcel.dataPosition() < iT25) {
                    int i25 = parcel.readInt();
                    char c10 = (char) i25;
                    if (c10 == 2) {
                        strM37 = aj0.m(parcel, i25);
                    } else if (c10 == 3) {
                        strM38 = aj0.m(parcel, i25);
                    } else if (c10 == 4) {
                        lJ = aj0.J(parcel, i25);
                    } else if (c10 == 5) {
                        strM39 = aj0.m(parcel, i25);
                    } else if (c10 != 6) {
                        aj0.P(parcel, i25);
                    } else {
                        lJ2 = aj0.J(parcel, i25);
                    }
                }
                aj0.s(parcel, iT25);
                return new zzahd(strM37, strM38, lJ, strM39, lJ2);
            case 27:
                int iT26 = aj0.T(parcel);
                long jI9 = 0;
                long jI10 = 0;
                long jI11 = 0;
                boolean zC10 = false;
                String strM40 = null;
                String strM41 = null;
                zzpl zzplVar = null;
                String strM42 = null;
                zzbh zzbhVar = null;
                zzbh zzbhVar2 = null;
                zzbh zzbhVar3 = null;
                while (parcel.dataPosition() < iT26) {
                    int i26 = parcel.readInt();
                    switch ((char) i26) {
                        case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                            strM40 = aj0.m(parcel, i26);
                            break;
                        case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                            strM41 = aj0.m(parcel, i26);
                            break;
                        case oc1.LONG_FIELD_NUMBER /* 4 */:
                            zzplVar = (zzpl) aj0.k(parcel, i26, zzpl.CREATOR);
                            break;
                        case oc1.STRING_FIELD_NUMBER /* 5 */:
                            jI9 = aj0.I(parcel, i26);
                            break;
                        case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                            zC10 = aj0.C(parcel, i26);
                            break;
                        case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                            strM42 = aj0.m(parcel, i26);
                            break;
                        case oc1.BYTES_FIELD_NUMBER /* 8 */:
                            zzbhVar = (zzbh) aj0.k(parcel, i26, zzbh.CREATOR);
                            break;
                        case '\t':
                            jI10 = aj0.I(parcel, i26);
                            break;
                        case '\n':
                            zzbhVar2 = (zzbh) aj0.k(parcel, i26, zzbh.CREATOR);
                            break;
                        case 11:
                            jI11 = aj0.I(parcel, i26);
                            break;
                        case '\f':
                            zzbhVar3 = (zzbh) aj0.k(parcel, i26, zzbh.CREATOR);
                            break;
                        default:
                            aj0.P(parcel, i26);
                            break;
                    }
                }
                aj0.s(parcel, iT26);
                return new zzah(strM40, strM41, zzplVar, jI9, zC10, strM42, zzbhVar, jI10, zzbhVar2, jI11, zzbhVar3);
            case 28:
                int iT27 = aj0.T(parcel);
                long jI12 = 0;
                while (parcel.dataPosition() < iT27) {
                    int i27 = parcel.readInt();
                    char c11 = (char) i27;
                    if (c11 == 1) {
                        jI = aj0.I(parcel, i27);
                    } else if (c11 != 2) {
                        aj0.P(parcel, i27);
                    } else {
                        jI12 = aj0.I(parcel, i27);
                    }
                }
                aj0.s(parcel, iT27);
                return new com.google.firebase.auth.internal.zzaf(jI, jI12);
            default:
                int iT28 = aj0.T(parcel);
                while (parcel.dataPosition() < iT28) {
                    aj0.P(parcel, parcel.readInt());
                }
                aj0.s(parcel, iT28);
                return new zzaih();
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new GetSignInIntentRequest[i];
            case 1:
                return new RevokeAccessRequest[i];
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                return new SaveAccountLinkingTokenRequest[i];
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                return new SaveAccountLinkingTokenResult[i];
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                return new SavePasswordRequest[i];
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                return new SavePasswordResult[i];
            case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                return new SignInConfiguration[i];
            case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                return new SignInCredential[i];
            case oc1.BYTES_FIELD_NUMBER /* 8 */:
                return new SignInPassword[i];
            case 9:
                return new Transport[i];
            case 10:
                return new Attachment[i];
            case 11:
                return new ProxyRequest[i];
            case 12:
                return new CloudMessage[i];
            case 13:
                return new ConnectionResult[i];
            case 14:
                return new WakeLockEvent[i];
            case 15:
                return new AccountChangeEvent[i];
            case 16:
                return new zzz[i];
            case 17:
                return new zzx[i];
            case 18:
                return new zzab[i];
            case 19:
                return new com.google.firebase.auth.internal.zzz[i];
            case 20:
                return new com.google.android.gms.fido.fido2.api.common.zzad[i];
            case 21:
                return new GoogleThirdPartyPaymentExtension[i];
            case 22:
                return new zzaf[i];
            case 23:
                return new zzad[i];
            case 24:
                return new RootTelemetryConfiguration[i];
            case 25:
                return new zzag[i];
            case 26:
                return new zzahd[i];
            case 27:
                return new zzah[i];
            case 28:
                return new com.google.firebase.auth.internal.zzaf[i];
            default:
                return new zzaih[i];
        }
    }
}
