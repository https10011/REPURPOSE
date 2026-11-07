package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.SignInCredential;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class yh2 extends pj0 {
    public static final yd2 m = new yd2("Auth.Api.Identity.SignIn.API", new hr0(6), new c11(3));
    public final String l;

    public yh2(Context context, ui2 ui2Var) {
        super(context, null, m, ui2Var, oj0.c);
        this.l = ai2.a();
    }

    public static SignInCredential c(Intent intent) throws i7 {
        Status status = Status.i;
        if (intent == null) {
            throw new i7(status);
        }
        Parcelable.Creator creator = Status.CREATOR;
        byte[] byteArrayExtra = intent.getByteArrayExtra("status");
        Status status2 = (Status) (byteArrayExtra == null ? null : sp0.f(byteArrayExtra, creator));
        if (status2 == null) {
            throw new i7(Status.w);
        }
        if (!status2.R()) {
            throw new i7(status2);
        }
        Parcelable.Creator creator2 = SignInCredential.CREATOR;
        byte[] byteArrayExtra2 = intent.getByteArrayExtra("sign_in_credential");
        SignInCredential signInCredential = (SignInCredential) (byteArrayExtra2 != null ? sp0.f(byteArrayExtra2, creator2) : null);
        if (signInCredential != null) {
            return signInCredential;
        }
        throw new i7(status);
    }
}
