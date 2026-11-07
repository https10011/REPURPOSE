package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.converter.zaa;
import com.google.android.gms.common.server.response.FastJsonResponse;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class oh2 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iT = aj0.T(parcel);
        String strM = null;
        String strM2 = null;
        zaa zaaVar = null;
        int iG = 0;
        int iG2 = 0;
        boolean zC = false;
        int iG3 = 0;
        boolean zC2 = false;
        int iG4 = 0;
        while (parcel.dataPosition() < iT) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 1:
                    iG = aj0.G(parcel, i);
                    break;
                case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                    iG2 = aj0.G(parcel, i);
                    break;
                case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                    zC = aj0.C(parcel, i);
                    break;
                case oc1.LONG_FIELD_NUMBER /* 4 */:
                    iG3 = aj0.G(parcel, i);
                    break;
                case oc1.STRING_FIELD_NUMBER /* 5 */:
                    zC2 = aj0.C(parcel, i);
                    break;
                case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                    strM = aj0.m(parcel, i);
                    break;
                case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                    iG4 = aj0.G(parcel, i);
                    break;
                case oc1.BYTES_FIELD_NUMBER /* 8 */:
                    strM2 = aj0.m(parcel, i);
                    break;
                case '\t':
                    zaaVar = (zaa) aj0.k(parcel, i, zaa.CREATOR);
                    break;
                default:
                    aj0.P(parcel, i);
                    break;
            }
        }
        aj0.s(parcel, iT);
        return new FastJsonResponse.Field(iG, iG2, zC, iG3, zC2, strM, iG4, strM2, zaaVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new FastJsonResponse.Field[i];
    }
}
