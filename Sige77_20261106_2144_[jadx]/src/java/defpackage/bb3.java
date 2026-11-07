package defpackage;

import android.os.Parcel;
import com.google.android.gms.measurement.internal.zzoh;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class bb3 extends dv2 implements v13 {
    public final /* synthetic */ AtomicReference a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bb3(lc3 lc3Var, AtomicReference atomicReference) {
        super("com.google.android.gms.measurement.internal.ITriggerUrisCallback");
        this.a = atomicReference;
    }

    @Override // defpackage.dv2
    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 2) {
            return false;
        }
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(zzoh.CREATOR);
        fv2.d(parcel);
        s(arrayListCreateTypedArrayList);
        return true;
    }

    @Override // defpackage.v13
    public final void s(List list) {
        AtomicReference atomicReference = this.a;
        synchronized (atomicReference) {
            atomicReference.set(list);
            atomicReference.notifyAll();
        }
    }
}
