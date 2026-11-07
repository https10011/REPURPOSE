package defpackage;

import android.credentials.Credential;
import android.credentials.GetCredentialException;
import android.credentials.GetCredentialResponse;
import android.os.Bundle;
import android.os.OutcomeReceiver;
import android.util.Log;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class ou implements OutcomeReceiver {
    public final /* synthetic */ gg a;

    public ou(gg ggVar, pu puVar) {
        this.a = ggVar;
    }

    @Override // android.os.OutcomeReceiver
    public final void onError(Throwable th) {
        GetCredentialException getCredentialExceptionH = nu.h(th);
        getCredentialExceptionH.getClass();
        Log.i("CredManProvService", "GetCredentialResponse error returned from framework");
        String type = getCredentialExceptionH.getType();
        type.getClass();
        this.a.a(dw0.C(getCredentialExceptionH.getMessage(), type));
    }

    @Override // android.os.OutcomeReceiver
    public final void onResult(Object obj) {
        GetCredentialResponse getCredentialResponseK = nu.k(obj);
        getCredentialResponseK.getClass();
        Log.i("CredManProvService", "GetCredentialResponse returned from framework");
        Credential credential = getCredentialResponseK.getCredential();
        credential.getClass();
        String type = credential.getType();
        type.getClass();
        Bundle data = credential.getData();
        data.getClass();
        this.a.b(new fi0(yi0.h(type, data)));
    }
}
