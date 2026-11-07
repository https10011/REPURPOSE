package defpackage;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class ak2 extends yi0 {
    public final /* synthetic */ String d0;
    public final /* synthetic */ boolean e0;
    public final /* synthetic */ FirebaseUser f0;
    public final /* synthetic */ String g0;
    public final /* synthetic */ String h0;
    public final /* synthetic */ FirebaseAuth i0;

    public ak2(FirebaseAuth firebaseAuth, String str, boolean z, FirebaseUser firebaseUser, String str2, String str3) {
        this.d0 = str;
        this.e0 = z;
        this.f0 = firebaseUser;
        this.g0 = str2;
        this.h0 = str3;
        this.i0 = firebaseAuth;
    }

    @Override // defpackage.yi0
    public final Task t(String str) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        String str2 = this.d0;
        if (zIsEmpty) {
            Log.i("FirebaseAuth", "Logging in as " + str2 + " with empty reCAPTCHA token");
        } else {
            Log.i("FirebaseAuth", "Got reCAPTCHA token for login with email " + str2);
        }
        boolean z = this.e0;
        String str3 = this.h0;
        String str4 = this.g0;
        FirebaseAuth firebaseAuth = this.i0;
        if (!z) {
            md2 md2Var = firebaseAuth.e;
            hc0 hc0Var = firebaseAuth.a;
            jc0 jc0Var = new jc0(firebaseAuth);
            md2Var.getClass();
            ml2 ml2Var = new ml2(str2, str4, str3, str, 1);
            ml2Var.b(hc0Var);
            ml2Var.e = jc0Var;
            return md2Var.m(ml2Var);
        }
        md2 md2Var2 = firebaseAuth.e;
        hc0 hc0Var2 = firebaseAuth.a;
        FirebaseUser firebaseUser = this.f0;
        gu2.o(firebaseUser);
        ic0 ic0Var = new ic0(firebaseAuth, 0);
        md2Var2.getClass();
        ml2 ml2Var2 = new ml2(str2, str4, str3, str, 0);
        ml2Var2.b(hc0Var2);
        ml2Var2.d = firebaseUser;
        ml2Var2.e = ic0Var;
        ml2Var2.f = ic0Var;
        return md2Var2.m(ml2Var2);
    }
}
