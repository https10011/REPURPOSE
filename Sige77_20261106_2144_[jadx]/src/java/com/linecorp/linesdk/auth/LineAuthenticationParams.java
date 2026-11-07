package com.linecorp.linesdk.auth;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dm1;
import defpackage.dy;
import defpackage.kj0;
import defpackage.ox0;
import defpackage.px0;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public class LineAuthenticationParams implements Parcelable {
    public static final Parcelable.Creator<LineAuthenticationParams> CREATOR = new dy(23);
    public final List a;
    public final String b;
    public final ox0 c;
    public final Locale d;
    public final String e;
    public final px0 f;

    public LineAuthenticationParams(Parcel parcel) {
        this.a = dm1.b(parcel.createStringArrayList());
        this.b = parcel.readString();
        String string = parcel.readString();
        this.c = (ox0) (string != null ? Enum.valueOf(ox0.class, string) : null);
        this.d = (Locale) parcel.readSerializable();
        this.e = parcel.readString();
        String string2 = parcel.readString();
        this.f = (px0) (string2 != null ? Enum.valueOf(px0.class, string2) : null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(dm1.a(this.a));
        parcel.writeString(this.b);
        ox0 ox0Var = this.c;
        parcel.writeString(ox0Var != null ? ox0Var.name() : null);
        parcel.writeSerializable(this.d);
        parcel.writeString(this.e);
        px0 px0Var = this.f;
        parcel.writeString(px0Var != null ? px0Var.name() : null);
    }

    public LineAuthenticationParams(kj0 kj0Var) {
        this.a = (List) kj0Var.b;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
    }
}
