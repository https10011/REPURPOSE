package com.linecorp.linesdk.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.linecorp.linesdk.internal.pkce.PKCECode;
import defpackage.ts;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class e implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        LineAuthenticationStatus lineAuthenticationStatus = new LineAuthenticationStatus();
        lineAuthenticationStatus.e = 1;
        lineAuthenticationStatus.a = (PKCECode) parcel.readParcelable(PKCECode.class.getClassLoader());
        lineAuthenticationStatus.b = parcel.readString();
        lineAuthenticationStatus.e = ts.A(4)[parcel.readByte()];
        lineAuthenticationStatus.c = parcel.readString();
        lineAuthenticationStatus.d = parcel.readString();
        return lineAuthenticationStatus;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new LineAuthenticationStatus[i];
    }
}
