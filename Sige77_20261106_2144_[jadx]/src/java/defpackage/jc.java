package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.transsion.athena.data.TrackData;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class jc extends Binder implements jd2 {
    public static final /* synthetic */ int a = 0;

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel2.writeString("com.transsion.athena.IAthenaTrackInterface");
            return true;
        }
        parcel.enforceInterface("com.transsion.athena.IAthenaTrackInterface");
        r(parcel.readString(), parcel.readInt() != 0 ? TrackData.CREATOR.createFromParcel(parcel) : null, parcel.readLong());
        parcel2.writeNoException();
        return true;
    }

    @Override // defpackage.jd2
    public final void r(String str, TrackData trackData, long j) {
        cc2.b("AthenaTrackService receive appId : %d, eventName : %s", Long.valueOf(j), str);
        hc.g(j).i(str, trackData, j);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
