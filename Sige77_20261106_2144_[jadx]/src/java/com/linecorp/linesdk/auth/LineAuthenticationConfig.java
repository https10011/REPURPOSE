package com.linecorp.linesdk.auth;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dy;
import defpackage.nx0;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public class LineAuthenticationConfig implements Parcelable {
    public static final Parcelable.Creator<LineAuthenticationConfig> CREATOR = new dy(22);
    public final String a;
    public final Uri b;
    public final Uri c;
    public final Uri d;
    public final boolean e;
    public final boolean f;

    public LineAuthenticationConfig(Parcel parcel) {
        this.a = parcel.readString();
        this.b = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.c = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.d = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        int i = parcel.readInt();
        this.e = (i & 1) > 0;
        this.f = (i & 2) > 0;
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
        LineAuthenticationConfig lineAuthenticationConfig = (LineAuthenticationConfig) obj;
        if (this.e == lineAuthenticationConfig.e && this.f == lineAuthenticationConfig.f && this.a.equals(lineAuthenticationConfig.a) && this.b.equals(lineAuthenticationConfig.b) && this.c.equals(lineAuthenticationConfig.c)) {
            return this.d.equals(lineAuthenticationConfig.d);
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31) + (this.e ? 1 : 0)) * 31) + (this.f ? 1 : 0);
    }

    public final String toString() {
        return "LineAuthenticationConfig{channelId='" + this.a + "', openidDiscoveryDocumentUrl=" + this.b + ", apiBaseUrl=" + this.c + ", webLoginPageUrl=" + this.d + ", isLineAppAuthenticationDisabled=" + this.e + ", isEncryptorPreparationDisabled=" + this.f + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeParcelable(this.b, i);
        parcel.writeParcelable(this.c, i);
        parcel.writeParcelable(this.d, i);
        parcel.writeInt((this.e ? 1 : 0) | (this.f ? 2 : 0));
    }

    public LineAuthenticationConfig(nx0 nx0Var) {
        this.a = (String) nx0Var.a;
        this.b = (Uri) nx0Var.c;
        this.c = (Uri) nx0Var.d;
        this.d = (Uri) nx0Var.e;
        this.e = nx0Var.b;
        this.f = false;
    }
}
