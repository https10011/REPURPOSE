package defpackage;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.EmailAuthCredential;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class hj2 extends yi0 {
    public final /* synthetic */ boolean d0;
    public final /* synthetic */ FirebaseUser e0;
    public final /* synthetic */ EmailAuthCredential f0;
    public final /* synthetic */ FirebaseAuth g0;

    public hj2(FirebaseAuth firebaseAuth, boolean z, FirebaseUser firebaseUser, EmailAuthCredential emailAuthCredential) {
        this.d0 = z;
        this.e0 = firebaseUser;
        this.f0 = emailAuthCredential;
        this.g0 = firebaseAuth;
    }

    @Override // defpackage.yi0
    public final Task t(String str) {
        if (TextUtils.isEmpty(str)) {
            Log.i("FirebaseAuth", "Email link login/reauth with empty reCAPTCHA token");
        } else {
            Log.i("FirebaseAuth", "Got reCAPTCHA token for login/reauth with email link");
        }
        boolean z = this.d0;
        EmailAuthCredential emailAuthCredential = this.f0;
        FirebaseAuth firebaseAuth = this.g0;
        if (!z) {
            md2 md2Var = firebaseAuth.e;
            hc0 hc0Var = firebaseAuth.a;
            jc0 jc0Var = new jc0(firebaseAuth);
            md2Var.getClass();
            jl2 jl2Var = new jl2(emailAuthCredential, str, 1);
            jl2Var.b(hc0Var);
            jl2Var.e = jc0Var;
            return md2Var.m(jl2Var);
        }
        md2 md2Var2 = firebaseAuth.e;
        hc0 hc0Var2 = firebaseAuth.a;
        FirebaseUser firebaseUser = this.e0;
        gu2.o(firebaseUser);
        ic0 ic0Var = new ic0(firebaseAuth, 0);
        md2Var2.getClass();
        jl2 jl2Var2 = new jl2(emailAuthCredential, str, 0);
        jl2Var2.b(hc0Var2);
        jl2Var2.d = firebaseUser;
        jl2Var2.e = ic0Var;
        jl2Var2.f = ic0Var;
        return md2Var2.m(jl2Var2);
    }
}
