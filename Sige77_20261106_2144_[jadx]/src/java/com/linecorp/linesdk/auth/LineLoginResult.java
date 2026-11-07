package com.linecorp.linesdk.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.linecorp.linesdk.LineApiError;
import com.linecorp.linesdk.LineCredential;
import com.linecorp.linesdk.LineIdToken;
import com.linecorp.linesdk.LineProfile;
import defpackage.dy;
import defpackage.jx0;
import defpackage.qq;
import java.util.Objects;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public class LineLoginResult implements Parcelable {
    public static final Parcelable.Creator<LineLoginResult> CREATOR = new dy(28);
    public final jx0 a;
    public final String b;
    public final LineProfile c;
    public final LineIdToken d;
    public final Boolean e;
    public final LineCredential f;
    public final LineApiError i;

    public LineLoginResult(Parcel parcel) {
        String string = parcel.readString();
        this.a = (jx0) (string != null ? Enum.valueOf(jx0.class, string) : null);
        this.b = parcel.readString();
        this.c = (LineProfile) parcel.readParcelable(LineProfile.class.getClassLoader());
        this.d = (LineIdToken) parcel.readParcelable(LineIdToken.class.getClassLoader());
        this.e = (Boolean) parcel.readValue(Boolean.class.getClassLoader());
        this.f = (LineCredential) parcel.readParcelable(LineCredential.class.getClassLoader());
        this.i = (LineApiError) parcel.readParcelable(LineApiError.class.getClassLoader());
    }

    public static LineLoginResult a(jx0 jx0Var, LineApiError lineApiError) {
        qq qqVar = new qq();
        qqVar.a = jx0Var;
        qqVar.i = lineApiError;
        return new LineLoginResult(qqVar);
    }

    public static LineLoginResult b(String str) {
        return a(jx0.f, new LineApiError(str));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LineLoginResult)) {
            return false;
        }
        LineLoginResult lineLoginResult = (LineLoginResult) obj;
        if (this.a != lineLoginResult.a || !Objects.equals(this.b, lineLoginResult.b) || !Objects.equals(this.c, lineLoginResult.c) || !Objects.equals(this.d, lineLoginResult.d)) {
            return false;
        }
        Boolean bool = this.e;
        if (bool == null) {
            bool = Boolean.FALSE;
        }
        Boolean bool2 = lineLoginResult.e;
        if (bool2 == null) {
            bool2 = Boolean.FALSE;
        }
        return bool.equals(bool2) && Objects.equals(this.f, lineLoginResult.f) && this.i.equals(lineLoginResult.i);
    }

    public final int hashCode() {
        Boolean bool = this.e;
        if (bool == null) {
            bool = Boolean.FALSE;
        }
        LineCredential lineCredential = this.f;
        LineApiError lineApiError = this.i;
        return Objects.hash(this.a, this.b, this.c, this.d, bool, lineCredential, lineApiError);
    }

    public final String toString() {
        return "LineLoginResult{responseCode=" + this.a + ", nonce='" + this.b + "', lineProfile=" + this.c + ", lineIdToken=" + this.d + ", friendshipStatusChanged=" + this.e + ", lineCredential=" + this.f + ", errorData=" + this.i + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        jx0 jx0Var = this.a;
        parcel.writeString(jx0Var != null ? jx0Var.name() : null);
        parcel.writeString(this.b);
        parcel.writeParcelable(this.c, i);
        parcel.writeParcelable(this.d, i);
        parcel.writeValue(this.e);
        parcel.writeParcelable(this.f, i);
        parcel.writeParcelable(this.i, i);
    }

    public LineLoginResult(qq qqVar) {
        this.a = (jx0) qqVar.a;
        this.b = (String) qqVar.b;
        this.c = (LineProfile) qqVar.c;
        this.d = (LineIdToken) qqVar.d;
        this.e = (Boolean) qqVar.e;
        this.f = (LineCredential) qqVar.f;
        this.i = (LineApiError) qqVar.i;
    }
}
