package defpackage;

import android.app.PendingIntent;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.firebase-auth-api.zzaij;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.internal.zzad;
import com.google.firebase.auth.internal.zzx;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class el2 extends en2 {
    public final /* synthetic */ int n;
    public final zzaij o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public el2(AuthCredential authCredential, String str, int i) {
        super(2);
        this.n = i;
        switch (i) {
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                super(2);
                gu2.p(authCredential, "credential cannot be null");
                this.o = jw.C(authCredential, str);
                break;
            default:
                gu2.p(authCredential, "credential cannot be null");
                zzaij zzaijVarC = jw.C(authCredential, str);
                zzaijVarC.W = false;
                this.o = zzaijVarC;
                break;
        }
    }

    @Override // defpackage.en2
    public final String a() {
        switch (this.n) {
            case 0:
                return "linkFederatedCredential";
            case 1:
                return "reauthenticateWithCredentialWithData";
            default:
                return "signInWithCredential";
        }
    }

    @Override // defpackage.en2
    public final void d(TaskCompletionSource taskCompletionSource, gm2 gm2Var) {
        int i = this.n;
        kj0 kj0Var = this.b;
        zzaij zzaijVar = this.o;
        int i2 = 9;
        switch (i) {
            case 0:
                this.g = new yd2(i2, this, taskCompletionSource);
                String strE0 = this.d.e0();
                gm2Var.getClass();
                gu2.l(strE0);
                gu2.o(zzaijVar);
                gu2.o(kj0Var);
                ox1 ox1Var = gm2Var.a;
                rd2 rd2Var = new rd2(kj0Var, gm2.b);
                ox1Var.getClass();
                gu2.l(strE0);
                ox1Var.A(strE0, new p11(ox1Var, zzaijVar, rd2Var));
                break;
            case 1:
                this.g = new yd2(i2, this, taskCompletionSource);
                gm2Var.a(zzaijVar, kj0Var);
                break;
            default:
                this.g = new yd2(i2, this, taskCompletionSource);
                gm2Var.a(zzaijVar, kj0Var);
                break;
        }
    }

    @Override // defpackage.en2
    public final void e() {
        switch (this.n) {
            case 0:
                FirebaseUser firebaseUserN = md2.n(this.c, this.i);
                this.e.b(this.h, firebaseUserN);
                f(new zzx(firebaseUserN));
                break;
            case 1:
                FirebaseUser firebaseUserN2 = md2.n(this.c, this.i);
                if (!this.d.U().equalsIgnoreCase(((zzad) firebaseUserN2).b.a)) {
                    c(new Status(17024, (String) null, (PendingIntent) null, (ConnectionResult) null));
                } else {
                    this.e.b(this.h, firebaseUserN2);
                    f(new zzx(firebaseUserN2));
                }
                break;
            default:
                FirebaseUser firebaseUserN3 = md2.n(this.c, this.i);
                this.e.b(this.h, firebaseUserN3);
                f(new zzx(firebaseUserN3));
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public el2(AuthCredential authCredential) {
        super(2);
        this.n = 0;
        gu2.p(authCredential, "credential cannot be null");
        this.o = jw.C(authCredential, null);
    }
}
