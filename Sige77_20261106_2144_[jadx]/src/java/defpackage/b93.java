package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.Feature;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class b93 extends nj0 {
    @Override // defpackage.jf
    public final IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.phenotype.internal.IPhenotypeService");
        return iInterfaceQueryLocalInterface instanceof a93 ? (a93) iInterfaceQueryLocalInterface : new a93(iBinder, "com.google.android.gms.phenotype.internal.IPhenotypeService", 4);
    }

    @Override // defpackage.jf
    public final Feature[] f() {
        return yv2.n;
    }

    @Override // defpackage.jf
    public final int i() {
        return 9410000;
    }

    @Override // defpackage.jf
    public final String m() {
        return "com.google.android.gms.phenotype.internal.IPhenotypeService";
    }

    @Override // defpackage.jf
    public final String n() {
        return "com.google.android.gms.phenotype.service.START";
    }
}
