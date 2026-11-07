package com.linecorp.linesdk;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dy;
import defpackage.ts;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public class LineGroup implements Parcelable {
    public static final Parcelable.Creator<LineGroup> CREATOR = new dy(26);
    public final String a;
    public final String b;
    public final Uri c;

    public LineGroup(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.c = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LineGroup lineGroup = (LineGroup) obj;
        if (!this.a.equals(lineGroup.a) || !this.b.equals(lineGroup.b)) {
            return false;
        }
        Uri uri = lineGroup.c;
        Uri uri2 = this.c;
        return uri2 == null ? uri == null : uri2.equals(uri);
    }

    public final int hashCode() {
        int iF = ts.f(this.a.hashCode() * 31, 31, this.b);
        Uri uri = this.c;
        return iF + (uri != null ? uri.hashCode() : 0);
    }

    public final String toString() {
        return "LineProfile{groupName='" + this.b + "', groupId='" + this.a + "', pictureUrl='" + this.c + "'}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeParcelable(this.c, i);
    }

    public LineGroup(Uri uri, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = uri;
    }
}
