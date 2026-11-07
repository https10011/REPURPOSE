package defpackage;

import com.google.android.gms.internal.firebase-auth-api.zzahd;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import java.util.Objects;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class jc0 implements c73 {
    public final /* synthetic */ FirebaseAuth a;

    public jc0(FirebaseAuth firebaseAuth) {
        Objects.requireNonNull(firebaseAuth);
        this.a = firebaseAuth;
    }

    @Override // defpackage.c73
    public final void b(zzahd zzahdVar, FirebaseUser firebaseUser) {
        gu2.o(zzahdVar);
        gu2.o(firebaseUser);
        firebaseUser.Y(zzahdVar);
        FirebaseAuth firebaseAuth = this.a;
        firebaseAuth.getClass();
        FirebaseAuth.d(firebaseAuth, firebaseUser, zzahdVar, true, false);
    }
}
