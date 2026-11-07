package defpackage;

import android.content.SharedPreferences;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.firebase-auth-api.zzahd;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import java.util.Objects;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class ic0 implements cu2, c73 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FirebaseAuth b;

    public ic0(FirebaseAuth firebaseAuth, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = firebaseAuth;
                break;
            default:
                Objects.requireNonNull(firebaseAuth);
                this.b = firebaseAuth;
                break;
        }
    }

    @Override // defpackage.cu2
    public final void a(Status status) {
        int i = this.a;
        FirebaseAuth firebaseAuth = this.b;
        switch (i) {
            case 0:
                int i2 = status.a;
                if (i2 == 17011 || i2 == 17021 || i2 == 17005 || i2 == 17091) {
                    ud2 ud2Var = firebaseAuth.n;
                    gu2.o(ud2Var);
                    SharedPreferences sharedPreferences = (SharedPreferences) ud2Var.c;
                    FirebaseUser firebaseUser = firebaseAuth.f;
                    if (firebaseUser != null) {
                        sharedPreferences.edit().remove(ts.j("com.google.firebase.auth.GET_TOKEN_RESPONSE.", firebaseUser.U())).apply();
                        firebaseAuth.f = null;
                    }
                    sharedPreferences.edit().remove("com.google.firebase.auth.FIREBASE_USER").apply();
                    FirebaseAuth.e(firebaseAuth, (FirebaseUser) null);
                    FirebaseAuth.c(firebaseAuth, (FirebaseUser) null);
                    ox1 ox1Var = firebaseAuth.q;
                    if (ox1Var != null) {
                        wt2 wt2Var = (wt2) ox1Var.a;
                        wt2Var.c.removeCallbacks(wt2Var.d);
                    }
                }
                break;
            default:
                int i3 = status.a;
                if (i3 == 17011 || i3 == 17021 || i3 == 17005) {
                    ud2 ud2Var2 = firebaseAuth.n;
                    gu2.o(ud2Var2);
                    SharedPreferences sharedPreferences2 = (SharedPreferences) ud2Var2.c;
                    FirebaseUser firebaseUser2 = firebaseAuth.f;
                    if (firebaseUser2 != null) {
                        sharedPreferences2.edit().remove(ts.j("com.google.firebase.auth.GET_TOKEN_RESPONSE.", firebaseUser2.U())).apply();
                        firebaseAuth.f = null;
                    }
                    sharedPreferences2.edit().remove("com.google.firebase.auth.FIREBASE_USER").apply();
                    FirebaseAuth.e(firebaseAuth, (FirebaseUser) null);
                    FirebaseAuth.c(firebaseAuth, (FirebaseUser) null);
                    ox1 ox1Var2 = firebaseAuth.q;
                    if (ox1Var2 != null) {
                        wt2 wt2Var2 = (wt2) ox1Var2.a;
                        wt2Var2.c.removeCallbacks(wt2Var2.d);
                    }
                }
                break;
        }
    }

    @Override // defpackage.c73
    public final void b(zzahd zzahdVar, FirebaseUser firebaseUser) {
        int i = this.a;
        FirebaseAuth firebaseAuth = this.b;
        switch (i) {
            case 0:
                gu2.o(zzahdVar);
                gu2.o(firebaseUser);
                firebaseUser.Y(zzahdVar);
                firebaseAuth.getClass();
                FirebaseAuth.d(firebaseAuth, firebaseUser, zzahdVar, true, true);
                break;
            default:
                firebaseAuth.getClass();
                FirebaseAuth.d(firebaseAuth, firebaseUser, zzahdVar, true, true);
                break;
        }
    }
}
