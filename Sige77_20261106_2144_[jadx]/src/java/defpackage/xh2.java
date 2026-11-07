package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class xh2 extends pg2 {
    public final /* synthetic */ TaskCompletionSource b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xh2(yh2 yh2Var, TaskCompletionSource taskCompletionSource) {
        super("com.google.android.gms.common.api.internal.IStatusCallback", 0);
        this.b = taskCompletionSource;
    }

    @Override // defpackage.pg2
    public final boolean E(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        Status statusA = yg2.a(parcel, Status.CREATOR);
        yg2.b(parcel);
        qt.w(statusA, null, this.b);
        return true;
    }
}
