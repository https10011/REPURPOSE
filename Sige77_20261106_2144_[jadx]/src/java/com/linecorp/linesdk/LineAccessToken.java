package com.linecorp.linesdk;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dy;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public class LineAccessToken implements Parcelable {
    public static final Parcelable.Creator<LineAccessToken> CREATOR = new dy(20);
    public final String a;
    public final long b;
    public final long c;

    public LineAccessToken(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readLong();
        this.c = parcel.readLong();
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
        LineAccessToken lineAccessToken = (LineAccessToken) obj;
        if (this.b == lineAccessToken.b && this.c == lineAccessToken.c) {
            return this.a.equals(lineAccessToken.a);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        long j = this.b;
        int i = (iHashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.c;
        return i + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        return "LineAccessToken{accessToken='#####', expiresInMillis=" + this.b + ", issuedClientTimeMillis=" + this.c + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeLong(this.b);
        parcel.writeLong(this.c);
    }

    public LineAccessToken(String str, long j, long j2) {
        this.a = str;
        this.b = j;
        this.c = j2;
    }
}
