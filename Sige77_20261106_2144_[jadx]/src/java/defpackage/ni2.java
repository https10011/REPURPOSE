package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class ni2 extends pg2 implements IInterface {
    public final /* synthetic */ int b;
    public final /* synthetic */ oi2 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ni2(oi2 oi2Var, int i) {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks", 1);
        this.b = i;
        this.c = oi2Var;
    }

    @Override // defpackage.pg2
    public final boolean F(int i, Parcel parcel, Parcel parcel2) {
        oi2 oi2Var = this.c;
        int i2 = this.b;
        switch (i) {
            case 101:
                ii2.a(parcel, GoogleSignInAccount.CREATOR);
                ii2.a(parcel, Status.CREATOR);
                ii2.c(parcel);
                uq1.k();
                return false;
            case 102:
                Status statusA = ii2.a(parcel, Status.CREATOR);
                ii2.c(parcel);
                switch (i2) {
                    case 0:
                        oi2Var.e(statusA);
                        break;
                    default:
                        throw new UnsupportedOperationException();
                }
                break;
            case 103:
                Status statusA2 = ii2.a(parcel, Status.CREATOR);
                ii2.c(parcel);
                switch (i2) {
                    case 1:
                        oi2Var.e(statusA2);
                        break;
                    default:
                        throw new UnsupportedOperationException();
                }
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
