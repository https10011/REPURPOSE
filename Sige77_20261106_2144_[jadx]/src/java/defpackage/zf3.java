package defpackage;

import android.os.Parcel;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class zf3 extends lb2 {
    public final en0 I(e81 e81Var, String str, int i, e81 e81Var2) {
        Parcel parcelF = F();
        xv2.b(parcelF, e81Var);
        parcelF.writeString(str);
        parcelF.writeInt(i);
        xv2.b(parcelF, e81Var2);
        Parcel parcelD = D(parcelF, 2);
        en0 en0VarH = e81.H(parcelD.readStrongBinder());
        parcelD.recycle();
        return en0VarH;
    }

    public final en0 J(e81 e81Var, String str, int i, e81 e81Var2) {
        Parcel parcelF = F();
        xv2.b(parcelF, e81Var);
        parcelF.writeString(str);
        parcelF.writeInt(i);
        xv2.b(parcelF, e81Var2);
        Parcel parcelD = D(parcelF, 3);
        en0 en0VarH = e81.H(parcelD.readStrongBinder());
        parcelD.recycle();
        return en0VarH;
    }
}
