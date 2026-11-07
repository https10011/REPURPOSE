package defpackage;

import android.app.PendingIntent;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.internal.zzad;
import com.google.firebase.auth.internal.zzx;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class ml2 extends en2 {
    public final /* synthetic */ int n;
    public final String o;
    public final String p;
    public final String q;
    public final String r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ml2(String str, String str2, String str3, String str4, int i) {
        super(2);
        this.n = i;
        switch (i) {
            case 1:
                super(2);
                gu2.m(str, "email cannot be null or empty");
                gu2.m(str2, "password cannot be null or empty");
                this.o = str;
                this.p = str2;
                this.q = str3;
                this.r = str4;
                break;
            default:
                gu2.m(str, "email cannot be null or empty");
                gu2.m(str2, "password cannot be null or empty");
                this.o = str;
                this.p = str2;
                this.q = str3;
                this.r = str4;
                break;
        }
    }

    @Override // defpackage.en2
    public final String a() {
        switch (this.n) {
            case 0:
                return "reauthenticateWithEmailPasswordWithData";
            default:
                return "signInWithEmailAndPassword";
        }
    }

    @Override // defpackage.en2
    public final void d(TaskCompletionSource taskCompletionSource, gm2 gm2Var) {
        switch (this.n) {
            case 0:
                this.g = new yd2(9, this, taskCompletionSource);
                gm2Var.d(this.o, this.p, this.q, this.r, this.b);
                break;
            default:
                this.g = new yd2(9, this, taskCompletionSource);
                gm2Var.d(this.o, this.p, this.q, this.r, this.b);
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
