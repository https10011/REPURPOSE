package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import com.transsion.athena.data.TrackData;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class cd2 implements jd2 {
    public IBinder a;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }

    @Override // defpackage.jd2
    public final void r(String str, TrackData trackData, long j) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.transsion.athena.IAthenaTrackInterface");
            parcelObtain.writeString(str);
            parcelObtain.writeInt(1);
            trackData.writeToParcel(parcelObtain, 0);
            parcelObtain.writeLong(j);
            if (!this.a.transact(1, parcelObtain, parcelObtain2, 0)) {
                int i = jc.a;
            }
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
