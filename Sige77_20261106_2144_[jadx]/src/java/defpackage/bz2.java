package defpackage;

import android.os.Parcel;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class bz2 extends dv2 implements px2 {
    public final /* synthetic */ z83 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bz2(qy2 qy2Var, z83 z83Var) {
        super("com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback");
        this.a = z83Var;
    }

    @Override // defpackage.dv2
    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 2) {
            return false;
        }
        zze();
        return true;
    }

    @Override // defpackage.px2
    public final void zze() {
        this.a.run();
    }
}
