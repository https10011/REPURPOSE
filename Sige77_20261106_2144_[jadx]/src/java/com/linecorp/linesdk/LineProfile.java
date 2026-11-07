package com.linecorp.linesdk;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dy;
import defpackage.ts;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public class LineProfile implements Parcelable {
    public static final Parcelable.Creator<LineProfile> CREATOR = new dy(29);
    public final String a;
    public final String b;
    public final Uri c;
    public final String d;

    public LineProfile(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.c = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.d = parcel.readString();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            LineProfile lineProfile = (LineProfile) obj;
            if (!this.a.equals(lineProfile.a) || !this.b.equals(lineProfile.b)) {
                return false;
            }
            Uri uri = lineProfile.c;
            Uri uri2 = this.c;
            if (uri2 == null ? uri != null : !uri2.equals(uri)) {
                return false;
            }
            String str = lineProfile.d;
            String str2 = this.d;
            if (str2 != null) {
                return str2.equals(str);
            }
            if (str == null) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iF = ts.f(this.a.hashCode() * 31, 31, this.b);
        Uri uri = this.c;
        int iHashCode = (iF + (uri != null ? uri.hashCode() : 0)) * 31;
        String str = this.d;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LineProfile{userId='");
        sb.append(this.a);
        sb.append("', displayName='");
        sb.append(this.b);
        sb.append("', pictureUrl=");
        sb.append(this.c);
        sb.append(", statusMessage='");
        return ts.l(sb, this.d, "'}");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeParcelable(this.c, i);
        parcel.writeString(this.d);
    }

    public LineProfile(Uri uri, String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = uri;
        this.d = str3;
    }
}
