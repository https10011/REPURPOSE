package defpackage;

import android.content.Context;
import android.credentials.CredentialManager;
import android.credentials.GetCredentialException;
import android.credentials.GetCredentialRequest;
import android.credentials.GetCredentialResponse;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.OutcomeReceiver;
import java.util.concurrent.Executor;
import kotlin.Unit;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class pu implements du {
    public final CredentialManager a;

    /* JADX WARN: Multi-variable type inference failed */
    public pu(yg ygVar) {
        this.a = nu.c(ygVar.getSystemService("credential"));
    }

    @Override // defpackage.du
    public final boolean isAvailableOnDevice() {
        return Build.VERSION.SDK_INT >= 34 && this.a != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.du
    public final void onGetCredential(Context context, ei0 ei0Var, CancellationSignal cancellationSignal, Executor executor, cu cuVar) {
        gg ggVar = (gg) cuVar;
        CredentialManager credentialManager = this.a;
        if (credentialManager == null) {
            ggVar.a(new zh0("Your device doesn't support credential manager", 5));
            Unit unit = Unit.a;
            return;
        }
        ou ouVar = new ou(ggVar, this);
        nu.q();
        Bundle bundle = new Bundle();
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IDENTITY_DOC_UI", false);
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", false);
        bundle.putParcelable("androidx.credentials.BUNDLE_KEY_PREFER_UI_BRANDING_COMPONENT_NAME", null);
        GetCredentialRequest.Builder builderI = nu.i(bundle);
        for (gi0 gi0Var : ei0Var.a) {
            nu.z();
            gi0Var.getClass();
            builderI.addCredentialOption(nu.f(gi0Var.a, gi0Var.b).setIsSystemProviderRequired(true).setAllowedProviders(gi0Var.c).build());
        }
        GetCredentialRequest getCredentialRequestBuild = builderI.build();
        getCredentialRequestBuild.getClass();
        credentialManager.getCredential((Context) ((yg) context), getCredentialRequestBuild, cancellationSignal, executor, (OutcomeReceiver<GetCredentialResponse, GetCredentialException>) ouVar);
    }
}
