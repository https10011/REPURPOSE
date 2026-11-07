package defpackage;

import android.app.PendingIntent;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.internal.zzad;
import com.google.firebase.auth.internal.zzx;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class ol2 extends en2 {
    public final /* synthetic */ int n;
    public final ik3 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ol2(PhoneAuthCredential phoneAuthCredential, int i) {
        super(2);
        this.n = i;
        switch (i) {
            case 1:
                super(2);
                this.o = new ik3(phoneAuthCredential);
                break;
            default:
                phoneAuthCredential.d = false;
                this.o = new ik3(phoneAuthCredential);
                break;
        }
    }

    @Override // defpackage.en2
    public final String a() {
        switch (this.n) {
            case 0:
                return "reauthenticateWithPhoneCredentialWithData";
            default:
                return "signInWithPhoneNumber";
        }
    }

    @Override // defpackage.en2
    public final void d(TaskCompletionSource taskCompletionSource, gm2 gm2Var) {
        int i = this.n;
        kj0 kj0Var = this.b;
        ik3 ik3Var = this.o;
        switch (i) {
            case 0:
                this.g = new yd2(9, this, taskCompletionSource);
                gm2Var.c(ik3Var, kj0Var);
                break;
            default:
                this.g = new yd2(9, this, taskCompletionSource);
                gm2Var.c(ik3Var, kj0Var);
                break;
        }
    }

    @Override // defpackage.en2
    public final void e() {
        switch (this.n) {
            case 0:
                FirebaseUser firebaseUserN = md2.n(this.c, this.i);
                if (!this.d.U().equalsIgnoreCase(((zzad) firebaseUserN).b.a)) {
                    c(new Status(17024, (String) null, (PendingIntent) null, (ConnectionResult) null));
                } else {
                    this.e.b(this.h, firebaseUserN);
                    f(new zzx(firebaseUserN));
                }
                break;
            default:
                FirebaseUser firebaseUserN2 = md2.n(this.c, this.i);
                this.e.b(this.h, firebaseUserN2);
                f(new zzx(firebaseUserN2));
                break;
        }
    }
}
