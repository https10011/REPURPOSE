package com.linecorp.linesdk;

import android.os.Parcel;
import android.os.Parcelable;
import com.hjq.toast.BuildConfig;
import defpackage.dy;
import defpackage.ts;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Objects;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public class LineApiError implements Parcelable {
    public static final Parcelable.Creator<LineApiError> CREATOR = new dy(21);
    public static final LineApiError d = new LineApiError(-1, 3, BuildConfig.FLAVOR);
    public final int a;
    public final String b;
    public final int c;

    public LineApiError(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readString();
        int i = parcel.readInt();
        this.c = i == -1 ? 0 : ts.A(3)[i];
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LineApiError)) {
            return false;
        }
        LineApiError lineApiError = (LineApiError) obj;
        return this.a == lineApiError.a && Objects.equals(this.b, lineApiError.b) && this.c == lineApiError.c;
    }

    public final int hashCode() {
        Integer numValueOf = Integer.valueOf(this.a);
        int i = this.c;
        return Objects.hash(numValueOf, this.b, i == 0 ? null : Integer.valueOf(i - 1));
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("LineApiError{httpResponseCode=");
        sb.append(this.a);
        sb.append(", message='");
        sb.append(this.b);
        sb.append("', errorCode='");
        int i = this.c;
        if (i == 1) {
            str = "LOGIN_ACTIVITY_NOT_FOUND";
        } else if (i != 2) {
            str = i != 3 ? "null" : "NOT_DEFINED";
        } else {
            str = "HTTP_RESPONSE_PARSE_ERROR";
        }
        sb.append(str);
        sb.append("'}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeString(this.b);
        int i2 = this.c;
        parcel.writeInt(i2 == 0 ? -1 : ts.v(i2));
    }

    public LineApiError(int i, int i2, String str) {
        this.a = i;
        this.b = str;
        this.c = i2;
    }

    public LineApiError(Exception exc) {
        StringWriter stringWriter = new StringWriter();
        exc.printStackTrace(new PrintWriter(stringWriter));
        this(-1, 3, stringWriter.toString());
    }

    public LineApiError(Exception exc, int i) {
        StringWriter stringWriter = new StringWriter();
        exc.printStackTrace(new PrintWriter(stringWriter));
        this(-1, i, stringWriter.toString());
    }

    public LineApiError(String str) {
        this(-1, 3, str);
    }
}
