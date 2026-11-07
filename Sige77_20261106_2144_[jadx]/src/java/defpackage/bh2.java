package defpackage;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zaw;
import com.google.android.gms.common.internal.zay;
import com.google.android.gms.signin.internal.zaa;
import com.google.android.gms.signin.internal.zag;
import com.google.android.gms.signin.internal.zai;
import com.google.android.gms.signin.internal.zak;
import java.util.Set;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class bh2 extends pg2 implements sj0, tj0 {
    public static final hr0 j = eh2.a;
    public final Context b;
    public final Handler c;
    public final hr0 d;
    public final Set e;
    public final uy1 f;
    public rq1 h;
    public tg2 i;

    public bh2(Context context, th2 th2Var, uy1 uy1Var) {
        super("com.google.android.gms.signin.internal.ISignInCallbacks", 0);
        this.b = context;
        this.c = th2Var;
        this.f = uy1Var;
        this.e = (Set) uy1Var.a;
        this.d = j;
    }

    @Override // defpackage.pg2
    public final boolean E(int i, Parcel parcel, Parcel parcel2) {
        boolean z = false;
        switch (i) {
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                yg2.a(parcel, ConnectionResult.CREATOR);
                yg2.a(parcel, zaa.CREATOR);
                yg2.b(parcel);
                break;
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                yg2.a(parcel, Status.CREATOR);
                yg2.b(parcel);
                break;
            case oc1.STRING_FIELD_NUMBER /* 5 */:
            default:
                return false;
            case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                yg2.a(parcel, Status.CREATOR);
                yg2.b(parcel);
                break;
            case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                yg2.a(parcel, Status.CREATOR);
                yg2.a(parcel, GoogleSignInAccount.CREATOR);
                yg2.b(parcel);
                break;
            case oc1.BYTES_FIELD_NUMBER /* 8 */:
                zak zakVarA = yg2.a(parcel, zak.CREATOR);
                yg2.b(parcel);
                this.c.post(new bh0(22, this, zakVarA, z));
                break;
            case 9:
                yg2.a(parcel, zag.CREATOR);
                yg2.b(parcel);
                break;
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // defpackage.tj0
    public final void a(ConnectionResult connectionResult) {
        this.i.a(connectionResult);
    }

    @Override // defpackage.sj0
    public final void d(int i) {
        tg2 tg2Var = this.i;
        rg2 rg2Var = (rg2) ((uj0) tg2Var.f).j.get((j7) tg2Var.c);
        if (rg2Var != null) {
            if (rg2Var.j) {
                rg2Var.n(new ConnectionResult(17, (PendingIntent) null, (String) null));
            } else {
                rg2Var.d(i);
            }
        }
    }

    @Override // defpackage.sj0
    public final void e() {
        rq1 rq1Var = this.h;
        rq1Var.getClass();
        boolean z = false;
        try {
            rq1Var.B.getClass();
            Account account = new Account("<<default account>>", "com.google");
            GoogleSignInAccount googleSignInAccountB = "<<default account>>".equals(account.name) ? yt1.a(rq1Var.c).b() : null;
            Integer num = rq1Var.D;
            gu2.o(num);
            zaw zawVar = new zaw(2, account, num.intValue(), googleSignInAccountB);
            hh2 hh2Var = (hh2) rq1Var.l();
            zai zaiVar = new zai(1, zawVar);
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInterfaceToken(hh2Var.c);
            int i = yg2.a;
            parcelObtain.writeInt(1);
            zaiVar.writeToParcel(parcelObtain, 0);
            parcelObtain.writeStrongBinder(this);
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                hh2Var.b.transact(12, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
            } finally {
                parcelObtain.recycle();
                parcelObtain2.recycle();
            }
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                this.c.post(new bh0(22, this, new zak(1, new ConnectionResult(8, (PendingIntent) null, (String) null), (zay) null), z));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }
}
