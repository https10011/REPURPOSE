package com.linecorp.linesdk;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dm1;
import defpackage.dy;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public class LineCredential implements Parcelable {
    public static final Parcelable.Creator<LineCredential> CREATOR = new dy(24);
    public final LineAccessToken a;
    public final List b;

    public LineCredential(Parcel parcel) {
        this.a = (LineAccessToken) parcel.readParcelable(LineAccessToken.class.getClassLoader());
        ArrayList arrayList = new ArrayList(8);
        parcel.readStringList(arrayList);
        this.b = dm1.b(arrayList);
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
        LineCredential lineCredential = (LineCredential) obj;
        if (this.a.equals(lineCredential.a)) {
            return this.b.equals(lineCredential.b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "LineCredential{accessToken=#####, scopes=" + this.b + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeStringList(dm1.a(this.b));
    }

    public LineCredential(LineAccessToken lineAccessToken, List list) {
        this.a = lineAccessToken;
        this.b = list;
    }
}
