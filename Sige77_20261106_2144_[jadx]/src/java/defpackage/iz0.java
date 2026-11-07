package defpackage;

import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class iz0 implements g81 {
    public final gk1 a;
    public boolean b = false;

    public iz0(hi2 hi2Var, gk1 gk1Var) {
        this.a = gk1Var;
    }

    @Override // defpackage.g81
    public final void a(Object obj) {
        this.b = true;
        SignInHubActivity signInHubActivity = (SignInHubActivity) this.a.b;
        signInHubActivity.setResult(signInHubActivity.p0, signInHubActivity.q0);
        signInHubActivity.finish();
    }

    public final String toString() {
        return this.a.toString();
    }
}
