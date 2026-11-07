package defpackage;

import android.os.Parcel;
import com.google.android.gms.measurement.internal.zzoq;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class db3 extends dv2 implements c23 {
    public final /* synthetic */ AtomicReference a;
    public final /* synthetic */ lc3 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public db3(lc3 lc3Var, AtomicReference atomicReference) {
        super("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
        this.a = atomicReference;
        this.b = lc3Var;
    }

    @Override // defpackage.dv2
    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 2) {
            return false;
        }
        zzoq zzoqVar = (zzoq) fv2.a(parcel, zzoq.CREATOR);
        fv2.d(parcel);
        o(zzoqVar);
        return true;
    }

    @Override // defpackage.c23
    public final void o(zzoq zzoqVar) {
        AtomicReference atomicReference = this.a;
        synchronized (atomicReference) {
            c33 c33Var = ((y53) this.b.a).f;
            y53.l(c33Var);
            c33Var.a0.b(Integer.valueOf(zzoqVar.a.size()), "[sgtm] Got upload batches from service. count");
            atomicReference.set(zzoqVar);
            atomicReference.notifyAll();
        }
    }
}
