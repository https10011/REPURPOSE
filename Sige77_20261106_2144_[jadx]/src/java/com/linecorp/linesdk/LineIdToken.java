package com.linecorp.linesdk;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dy;
import defpackage.ts;
import defpackage.y21;
import java.util.Date;
import java.util.List;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public class LineIdToken implements Parcelable {
    public static final Parcelable.Creator<LineIdToken> CREATOR = new dy(27);
    public final String W;
    public final String X;
    public final String Y;
    public final String Z;
    public final String a;
    public final String a0;
    public final String b;
    public final String b0;
    public final String c;
    public final Address c0;
    public final String d;
    public final String d0;
    public final Date e;
    public final String e0;
    public final Date f;
    public final String f0;
    public final String g0;
    public final String h0;
    public final Date i;
    public final String v;
    public final List w;

    public LineIdToken(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readString();
        this.e = y21.o(parcel);
        this.f = y21.o(parcel);
        this.i = y21.o(parcel);
        this.v = parcel.readString();
        this.w = parcel.createStringArrayList();
        this.W = parcel.readString();
        this.X = parcel.readString();
        this.Y = parcel.readString();
        this.Z = parcel.readString();
        this.a0 = parcel.readString();
        this.b0 = parcel.readString();
        this.c0 = (Address) parcel.readParcelable(Address.class.getClassLoader());
        this.d0 = parcel.readString();
        this.e0 = parcel.readString();
        this.f0 = parcel.readString();
        this.g0 = parcel.readString();
        this.h0 = parcel.readString();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            LineIdToken lineIdToken = (LineIdToken) obj;
            if (!this.a.equals(lineIdToken.a) || !this.b.equals(lineIdToken.b) || !this.c.equals(lineIdToken.c) || !this.d.equals(lineIdToken.d) || !this.e.equals(lineIdToken.e) || !this.f.equals(lineIdToken.f)) {
                return false;
            }
            Date date = lineIdToken.i;
            Date date2 = this.i;
            if (date2 == null ? date != null : !date2.equals(date)) {
                return false;
            }
            String str = lineIdToken.v;
            String str2 = this.v;
            if (str2 == null ? str != null : !str2.equals(str)) {
                return false;
            }
            List list = lineIdToken.w;
            List list2 = this.w;
            if (list2 == null ? list != null : !list2.equals(list)) {
                return false;
            }
            String str3 = lineIdToken.W;
            String str4 = this.W;
            if (str4 == null ? str3 != null : !str4.equals(str3)) {
                return false;
            }
            String str5 = lineIdToken.X;
            String str6 = this.X;
            if (str6 == null ? str5 != null : !str6.equals(str5)) {
                return false;
            }
            String str7 = lineIdToken.Y;
            String str8 = this.Y;
            if (str8 == null ? str7 != null : !str8.equals(str7)) {
                return false;
            }
            String str9 = lineIdToken.Z;
            String str10 = this.Z;
            if (str10 == null ? str9 != null : !str10.equals(str9)) {
                return false;
            }
            String str11 = lineIdToken.a0;
            String str12 = this.a0;
            if (str12 == null ? str11 != null : !str12.equals(str11)) {
                return false;
            }
            String str13 = lineIdToken.b0;
            String str14 = this.b0;
            if (str14 == null ? str13 != null : !str14.equals(str13)) {
                return false;
            }
            Address address = lineIdToken.c0;
            Address address2 = this.c0;
            if (address2 == null ? address != null : !address2.equals(address)) {
                return false;
            }
            String str15 = lineIdToken.d0;
            String str16 = this.d0;
            if (str16 == null ? str15 != null : !str16.equals(str15)) {
                return false;
            }
            String str17 = lineIdToken.e0;
            String str18 = this.e0;
            if (str18 == null ? str17 != null : !str18.equals(str17)) {
                return false;
            }
            String str19 = lineIdToken.f0;
            String str20 = this.f0;
            if (str20 == null ? str19 != null : !str20.equals(str19)) {
                return false;
            }
            String str21 = lineIdToken.g0;
            String str22 = this.g0;
            if (str22 == null ? str21 != null : !str22.equals(str21)) {
                return false;
            }
            String str23 = lineIdToken.h0;
            String str24 = this.h0;
            if (str24 != null) {
                return str24.equals(str23);
            }
            if (str23 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f.hashCode() + ((this.e.hashCode() + ts.f(ts.f(ts.f(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d)) * 31)) * 31;
        Date date = this.i;
        int iHashCode2 = (iHashCode + (date != null ? date.hashCode() : 0)) * 31;
        String str = this.v;
        int iHashCode3 = (iHashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        List list = this.w;
        int iHashCode4 = (iHashCode3 + (list != null ? list.hashCode() : 0)) * 31;
        String str2 = this.W;
        int iHashCode5 = (iHashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.X;
        int iHashCode6 = (iHashCode5 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.Y;
        int iHashCode7 = (iHashCode6 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.Z;
        int iHashCode8 = (iHashCode7 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.a0;
        int iHashCode9 = (iHashCode8 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.b0;
        int iHashCode10 = (iHashCode9 + (str7 != null ? str7.hashCode() : 0)) * 31;
        Address address = this.c0;
        int iHashCode11 = (iHashCode10 + (address != null ? address.hashCode() : 0)) * 31;
        String str8 = this.d0;
        int iHashCode12 = (iHashCode11 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.e0;
        int iHashCode13 = (iHashCode12 + (str9 != null ? str9.hashCode() : 0)) * 31;
        String str10 = this.f0;
        int iHashCode14 = (iHashCode13 + (str10 != null ? str10.hashCode() : 0)) * 31;
        String str11 = this.g0;
        int iHashCode15 = (iHashCode14 + (str11 != null ? str11.hashCode() : 0)) * 31;
        String str12 = this.h0;
        return iHashCode15 + (str12 != null ? str12.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LineIdToken{rawString='");
        sb.append(this.a);
        sb.append("', issuer='");
        sb.append(this.b);
        sb.append("', subject='");
        sb.append(this.c);
        sb.append("', audience='");
        sb.append(this.d);
        sb.append("', expiresAt=");
        sb.append(this.e);
        sb.append(", issuedAt=");
        sb.append(this.f);
        sb.append(", authTime=");
        sb.append(this.i);
        sb.append(", nonce='");
        sb.append(this.v);
        sb.append("', amr=");
        sb.append(this.w);
        sb.append(", name='");
        sb.append(this.W);
        sb.append("', picture='");
        sb.append(this.X);
        sb.append("', phoneNumber='");
        sb.append(this.Y);
        sb.append("', email='");
        sb.append(this.Z);
        sb.append("', gender='");
        sb.append(this.a0);
        sb.append("', birthdate='");
        sb.append(this.b0);
        sb.append("', address=");
        sb.append(this.c0);
        sb.append(", givenName='");
        sb.append(this.d0);
        sb.append("', givenNamePronunciation='");
        sb.append(this.e0);
        sb.append("', middleName='");
        sb.append(this.f0);
        sb.append("', familyName='");
        sb.append(this.g0);
        sb.append("', familyNamePronunciation='");
        return ts.l(sb, this.h0, "'}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        Date date = this.e;
        parcel.writeLong(date != null ? date.getTime() : -1L);
        Date date2 = this.f;
        parcel.writeLong(date2 != null ? date2.getTime() : -1L);
        Date date3 = this.i;
        parcel.writeLong(date3 != null ? date3.getTime() : -1L);
        parcel.writeString(this.v);
        parcel.writeStringList(this.w);
        parcel.writeString(this.W);
        parcel.writeString(this.X);
        parcel.writeString(this.Y);
        parcel.writeString(this.Z);
        parcel.writeString(this.a0);
        parcel.writeString(this.b0);
        parcel.writeParcelable(this.c0, i);
        parcel.writeString(this.d0);
        parcel.writeString(this.e0);
        parcel.writeString(this.f0);
        parcel.writeString(this.g0);
        parcel.writeString(this.h0);
    }

    public static class Address implements Parcelable {
        public static final Parcelable.Creator<Address> CREATOR = new a();
        public final String a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;

        public Address(Parcel parcel) {
            this.a = parcel.readString();
            this.b = parcel.readString();
            this.c = parcel.readString();
            this.d = parcel.readString();
            this.e = parcel.readString();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                Address address = (Address) obj;
                String str = address.a;
                String str2 = this.a;
                if (str2 == null ? str != null : !str2.equals(str)) {
                    return false;
                }
                String str3 = address.b;
                String str4 = this.b;
                if (str4 == null ? str3 != null : !str4.equals(str3)) {
                    return false;
                }
                String str5 = address.c;
                String str6 = this.c;
                if (str6 == null ? str5 != null : !str6.equals(str5)) {
                    return false;
                }
                String str7 = address.d;
                String str8 = this.d;
                if (str8 == null ? str7 != null : !str8.equals(str7)) {
                    return false;
                }
                String str9 = address.e;
                String str10 = this.e;
                if (str10 != null) {
                    return str10.equals(str9);
                }
                if (str9 == null) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            String str = this.a;
            int iHashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.b;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.c;
            int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.d;
            int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
            String str5 = this.e;
            return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Address{streetAddress='");
            sb.append(this.a);
            sb.append("', locality='");
            sb.append(this.b);
            sb.append("', region='");
            sb.append(this.c);
            sb.append("', postalCode='");
            sb.append(this.d);
            sb.append("', country='");
            return ts.l(sb, this.e, "'}");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.a);
            parcel.writeString(this.b);
            parcel.writeString(this.c);
            parcel.writeString(this.d);
            parcel.writeString(this.e);
        }

        public Address(b bVar) {
            this.a = bVar.a;
            this.b = bVar.b;
            this.c = bVar.c;
            this.d = bVar.d;
            this.e = bVar.e;
        }
    }

    public LineIdToken(c cVar) {
        this.a = cVar.a;
        this.b = cVar.b;
        this.c = cVar.c;
        this.d = cVar.d;
        this.e = cVar.e;
        this.f = cVar.f;
        this.i = cVar.g;
        this.v = cVar.h;
        this.w = cVar.i;
        this.W = cVar.j;
        this.X = cVar.k;
        this.Y = cVar.l;
        this.Z = cVar.m;
        this.a0 = cVar.n;
        this.b0 = cVar.o;
        this.c0 = cVar.p;
        this.d0 = cVar.q;
        this.e0 = cVar.r;
        this.f0 = cVar.s;
        this.g0 = cVar.t;
        this.h0 = cVar.u;
    }
}
