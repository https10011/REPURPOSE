package defpackage;

import android.os.Parcel;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class ye3 extends lb2 {
    public final en0 I(e81 e81Var, String str, int i) {
        Parcel parcelF = F();
        xv2.b(parcelF, e81Var);
        parcelF.writeString(str);
        parcelF.writeInt(i);
        Parcel parcelD = D(parcelF, 2);
        en0 en0VarH = e81.H(parcelD.readStrongBinder());
        parcelD.recycle();
        return en0VarH;
    }

    public final en0 J(e81 e81Var, String str, int i) {
        Parcel parcelF = F();
        xv2.b(parcelF, e81Var);
        parcelF.writeString(str);
        parcelF.writeInt(i);
        Parcel parcelD = D(parcelF, 4);
        en0 en0VarH = e81.H(parcelD.readStrongBinder());
        parcelD.recycle();
        return en0VarH;
    }

    public final en0 K(e81 e81Var, String str, boolean z, long j) {
        Parcel parcelF = F();
        xv2.b(parcelF, e81Var);
        parcelF.writeString(str);
        parcelF.writeInt(z ? 1 : 0);
        parcelF.writeLong(j);
        Parcel parcelD = D(parcelF, 7);
        en0 en0VarH = e81.H(parcelD.readStrongBinder());
        parcelD.recycle();
        return en0VarH;
    }

    public final en0 L(e81 e81Var, String str, int i, e81 e81Var2) {
        Parcel parcelF = F();
        xv2.b(parcelF, e81Var);
        parcelF.writeString(str);
        parcelF.writeInt(i);
        xv2.b(parcelF, e81Var2);
        Parcel parcelD = D(parcelF, 8);
        en0 en0VarH = e81.H(parcelD.readStrongBinder());
        parcelD.recycle();
        return en0VarH;
    }
}
