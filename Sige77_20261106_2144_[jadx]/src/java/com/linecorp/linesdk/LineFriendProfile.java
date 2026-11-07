package com.linecorp.linesdk;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dy;
import defpackage.ts;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public class LineFriendProfile extends LineProfile {
    public static final Parcelable.Creator<LineFriendProfile> CREATOR = new dy(25);
    public final String e;

    public LineFriendProfile(Parcel parcel) {
        super(parcel);
        this.e = parcel.readString();
    }

    @Override // com.linecorp.linesdk.LineProfile
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LineFriendProfile) || !super.equals(obj)) {
            return false;
        }
        String str = ((LineFriendProfile) obj).e;
        String str2 = this.e;
        if (str2 != null) {
            return str2.equals(str);
        }
        return str == null;
    }

    @Override // com.linecorp.linesdk.LineProfile
    public final int hashCode() {
        int iHashCode = super.hashCode() * 31;
        String str = this.e;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // com.linecorp.linesdk.LineProfile
    public final String toString() {
        StringBuilder sb = new StringBuilder("LineFriendProfile{userId='");
        sb.append(this.a);
        sb.append("', displayName='");
        sb.append(this.b);
        sb.append("', pictureUrl=");
        sb.append(this.c);
        sb.append(", statusMessage='");
        sb.append(this.d);
        sb.append("', overriddenDisplayName='");
        return ts.l(sb, this.e, "'}");
    }

    @Override // com.linecorp.linesdk.LineProfile, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.e);
    }

    public LineFriendProfile(String str, String str2, Uri uri, String str3, String str4) {
        super(uri, str, str2, str3);
        this.e = str4;
    }
}
