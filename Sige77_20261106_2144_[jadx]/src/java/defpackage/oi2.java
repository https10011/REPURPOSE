package defpackage;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class oi2 extends BasePendingResult {
    public final /* synthetic */ int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oi2(ug2 ug2Var, int i) {
        super(ug2Var);
        this.k = i;
        gu2.p(ug2Var, "GoogleApiClient must not be null");
        gu2.p(oc.a, "Api must not be null");
    }

    public final /* bridge */ /* synthetic */ sj1 b(Status status) {
        int i = this.k;
        return status;
    }

    public final void f(nj0 nj0Var) {
        switch (this.k) {
            case 0:
                li2 li2Var = (li2) nj0Var;
                si2 si2Var = (si2) li2Var.l();
                ni2 ni2Var = new ni2(this, 0);
                GoogleSignInOptions googleSignInOptions = li2Var.A;
                Parcel parcelD = si2Var.d();
                int i = ii2.a;
                parcelD.writeStrongBinder(ni2Var);
                ii2.b(parcelD, googleSignInOptions);
                si2Var.e(parcelD, 102);
                break;
            default:
                li2 li2Var2 = (li2) nj0Var;
                si2 si2Var2 = (si2) li2Var2.l();
                ni2 ni2Var2 = new ni2(this, 1);
                GoogleSignInOptions googleSignInOptions2 = li2Var2.A;
                Parcel parcelD2 = si2Var2.d();
                int i2 = ii2.a;
                parcelD2.writeStrongBinder(ni2Var2);
                ii2.b(parcelD2, googleSignInOptions2);
                si2Var2.e(parcelD2, 103);
                break;
        }
    }

    public final void g(Status status) {
        gu2.h("Failed result must not be success", !status.R());
        e(b(status));
    }
}
