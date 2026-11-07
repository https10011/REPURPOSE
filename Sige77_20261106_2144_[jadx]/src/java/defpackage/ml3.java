package defpackage;

import android.os.Parcel;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class ml3 extends lb2 implements ro3 {
    @Override // defpackage.ro3
    public final en0 zzd() {
        Parcel parcelD = D(F(), 1);
        en0 en0VarH = e81.H(parcelD.readStrongBinder());
        parcelD.recycle();
        return en0VarH;
    }

    @Override // defpackage.ro3
    public final int zze() {
        Parcel parcelD = D(F(), 2);
        int i = parcelD.readInt();
        parcelD.recycle();
        return i;
    }
}
