package defpackage;

import android.credentials.CredentialManager;
import android.credentials.CredentialOption;
import android.credentials.GetCredentialException;
import android.credentials.GetCredentialRequest;
import android.credentials.GetCredentialResponse;
import android.graphics.Bitmap;
import android.graphics.Gainmap;
import android.os.Bundle;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract /* synthetic */ class nu {
    public static /* bridge */ /* synthetic */ CredentialManager c(Object obj) {
        return (CredentialManager) obj;
    }

    public static /* synthetic */ CredentialOption.Builder f(Bundle bundle, Bundle bundle2) {
        return new CredentialOption.Builder("com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_CREDENTIAL", bundle, bundle2);
    }

    public static /* bridge */ /* synthetic */ GetCredentialException h(Throwable th) {
        return (GetCredentialException) th;
    }

    public static /* synthetic */ GetCredentialRequest.Builder i(Bundle bundle) {
        return new GetCredentialRequest.Builder(bundle);
    }

    public static /* bridge */ /* synthetic */ GetCredentialResponse k(Object obj) {
        return (GetCredentialResponse) obj;
    }

    public static /* synthetic */ void q() {
    }

    public static /* synthetic */ Gainmap x(Bitmap bitmap) {
        return new Gainmap(bitmap);
    }

    public static /* synthetic */ void z() {
    }
}
