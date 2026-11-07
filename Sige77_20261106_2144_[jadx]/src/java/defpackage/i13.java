package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.measurement.internal.zzaf;
import com.google.android.gms.measurement.internal.zzah;
import com.google.android.gms.measurement.internal.zzao;
import com.google.android.gms.measurement.internal.zzbh;
import com.google.android.gms.measurement.internal.zzoo;
import com.google.android.gms.measurement.internal.zzpl;
import com.google.android.gms.measurement.internal.zzr;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class i13 extends lb2 implements n13 {
    public i13(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService", 4);
    }

    @Override // defpackage.n13
    public final void A(zzr zzrVar) {
        Parcel parcelF = F();
        fv2.b(parcelF, zzrVar);
        G(parcelF, 20);
    }

    @Override // defpackage.n13
    public final void B(zzr zzrVar) {
        Parcel parcelF = F();
        fv2.b(parcelF, zzrVar);
        G(parcelF, 6);
    }

    @Override // defpackage.n13
    public final void C(zzr zzrVar) {
        Parcel parcelF = F();
        fv2.b(parcelF, zzrVar);
        G(parcelF, 26);
    }

    @Override // defpackage.n13
    public final void b(zzr zzrVar, zzaf zzafVar) {
        Parcel parcelF = F();
        fv2.b(parcelF, zzrVar);
        fv2.b(parcelF, zzafVar);
        G(parcelF, 30);
    }

    @Override // defpackage.n13
    public final List c(String str, String str2, String str3, boolean z) {
        Parcel parcelF = F();
        parcelF.writeString(null);
        parcelF.writeString(str2);
        parcelF.writeString(str3);
        ClassLoader classLoader = fv2.a;
        parcelF.writeInt(z ? 1 : 0);
        Parcel parcelE = E(parcelF, 15);
        ArrayList arrayListCreateTypedArrayList = parcelE.createTypedArrayList(zzpl.CREATOR);
        parcelE.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // defpackage.n13
    public final void f(zzah zzahVar, zzr zzrVar) {
        Parcel parcelF = F();
        fv2.b(parcelF, zzahVar);
        fv2.b(parcelF, zzrVar);
        G(parcelF, 12);
    }

    @Override // defpackage.n13
    public final void g(zzpl zzplVar, zzr zzrVar) {
        Parcel parcelF = F();
        fv2.b(parcelF, zzplVar);
        fv2.b(parcelF, zzrVar);
        G(parcelF, 2);
    }

    @Override // defpackage.n13
    public final void h(zzr zzrVar, zzoo zzooVar, c23 c23Var) {
        Parcel parcelF = F();
        fv2.b(parcelF, zzrVar);
        fv2.b(parcelF, zzooVar);
        fv2.c(parcelF, c23Var);
        G(parcelF, 29);
    }

    @Override // defpackage.n13
    public final zzao i(zzr zzrVar) {
        Parcel parcelF = F();
        fv2.b(parcelF, zzrVar);
        Parcel parcelE = E(parcelF, 21);
        zzao zzaoVarA = fv2.a(parcelE, zzao.CREATOR);
        parcelE.recycle();
        return zzaoVarA;
    }

    @Override // defpackage.n13
    public final void j(Bundle bundle, zzr zzrVar) {
        Parcel parcelF = F();
        fv2.b(parcelF, bundle);
        fv2.b(parcelF, zzrVar);
        G(parcelF, 19);
    }

    @Override // defpackage.n13
    public final void l(long j, String str, String str2, String str3) {
        Parcel parcelF = F();
        parcelF.writeLong(j);
        parcelF.writeString(str);
        parcelF.writeString(str2);
        parcelF.writeString(str3);
        G(parcelF, 10);
    }

    @Override // defpackage.n13
    public final void m(zzr zzrVar) {
        Parcel parcelF = F();
        fv2.b(parcelF, zzrVar);
        G(parcelF, 18);
    }

    @Override // defpackage.n13
    public final void n(zzr zzrVar) {
        Parcel parcelF = F();
        fv2.b(parcelF, zzrVar);
        G(parcelF, 4);
    }

    @Override // defpackage.n13
    public final List p(String str, String str2, String str3) {
        Parcel parcelF = F();
        parcelF.writeString(null);
        parcelF.writeString(str2);
        parcelF.writeString(str3);
        Parcel parcelE = E(parcelF, 17);
        ArrayList arrayListCreateTypedArrayList = parcelE.createTypedArrayList(zzah.CREATOR);
        parcelE.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // defpackage.n13
    public final void q(zzr zzrVar) {
        Parcel parcelF = F();
        fv2.b(parcelF, zzrVar);
        G(parcelF, 27);
    }

    @Override // defpackage.n13
    public final List t(String str, String str2, boolean z, zzr zzrVar) {
        Parcel parcelF = F();
        parcelF.writeString(str);
        parcelF.writeString(str2);
        ClassLoader classLoader = fv2.a;
        parcelF.writeInt(z ? 1 : 0);
        fv2.b(parcelF, zzrVar);
        Parcel parcelE = E(parcelF, 14);
        ArrayList arrayListCreateTypedArrayList = parcelE.createTypedArrayList(zzpl.CREATOR);
        parcelE.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // defpackage.n13
    public final byte[] u(zzbh zzbhVar, String str) {
        Parcel parcelF = F();
        fv2.b(parcelF, zzbhVar);
        parcelF.writeString(str);
        Parcel parcelE = E(parcelF, 9);
        byte[] bArrCreateByteArray = parcelE.createByteArray();
        parcelE.recycle();
        return bArrCreateByteArray;
    }

    @Override // defpackage.n13
    public final void v(zzr zzrVar) {
        Parcel parcelF = F();
        fv2.b(parcelF, zzrVar);
        G(parcelF, 25);
    }

    @Override // defpackage.n13
    public final void w(zzbh zzbhVar, zzr zzrVar) {
        Parcel parcelF = F();
        fv2.b(parcelF, zzbhVar);
        fv2.b(parcelF, zzrVar);
        G(parcelF, 1);
    }

    @Override // defpackage.n13
    public final String x(zzr zzrVar) {
        Parcel parcelF = F();
        fv2.b(parcelF, zzrVar);
        Parcel parcelE = E(parcelF, 11);
        String string = parcelE.readString();
        parcelE.recycle();
        return string;
    }

    @Override // defpackage.n13
    public final List y(String str, String str2, zzr zzrVar) {
        Parcel parcelF = F();
        parcelF.writeString(str);
        parcelF.writeString(str2);
        fv2.b(parcelF, zzrVar);
        Parcel parcelE = E(parcelF, 16);
        ArrayList arrayListCreateTypedArrayList = parcelE.createTypedArrayList(zzah.CREATOR);
        parcelE.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // defpackage.n13
    public final void z(zzr zzrVar, Bundle bundle, v13 v13Var) {
        Parcel parcelF = F();
        fv2.b(parcelF, zzrVar);
        fv2.b(parcelF, bundle);
        fv2.c(parcelF, v13Var);
        G(parcelF, 31);
    }
}
