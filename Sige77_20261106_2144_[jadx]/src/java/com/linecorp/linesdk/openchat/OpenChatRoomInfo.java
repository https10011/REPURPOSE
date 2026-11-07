package com.linecorp.linesdk.openchat;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.l01;
import defpackage.oc1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/linecorp/linesdk/openchat/OpenChatRoomInfo;", "Landroid/os/Parcelable;", "line-sdk_release"}, k = 1, mv = {1, oc1.DOUBLE_FIELD_NUMBER, 1}, xi = 48)
public final class OpenChatRoomInfo implements Parcelable {
    public static final Parcelable.Creator<OpenChatRoomInfo> CREATOR = new l01(15);
    public final String a;
    public final String b;

    public OpenChatRoomInfo(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OpenChatRoomInfo)) {
            return false;
        }
        OpenChatRoomInfo openChatRoomInfo = (OpenChatRoomInfo) obj;
        return Intrinsics.areEqual(this.a, openChatRoomInfo.a) && Intrinsics.areEqual(this.b, openChatRoomInfo.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OpenChatRoomInfo(roomId=" + this.a + ", landingPageUrl=" + this.b + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeString(this.b);
    }
}
