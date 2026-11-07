package defpackage;

import android.os.CancellationSignal;
import android.util.Log;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import com.google.android.gms.tasks.OnFailureListener;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final /* synthetic */ class bi0 implements OnFailureListener {
    public final /* synthetic */ ei0 a;
    public final /* synthetic */ ci0 b;
    public final /* synthetic */ cu c;
    public final /* synthetic */ Executor d;
    public final /* synthetic */ CancellationSignal e;

    public /* synthetic */ bi0(ei0 ei0Var, ci0 ci0Var, cu cuVar, Executor executor, CancellationSignal cancellationSignal) {
        this.a = ei0Var;
        this.b = ci0Var;
        this.c = cuVar;
        this.d = executor;
        this.e = cancellationSignal;
    }

    public final void onFailure(Exception exc) {
        exc.getClass();
        CredentialProviderPlayServicesImpl.Companion.getClass();
        ei0 ei0Var = this.a;
        ei0Var.getClass();
        for (gi0 gi0Var : ei0Var.a) {
        }
        Log.w("GetCredentialController", "Pre-u credman get flow failed; retrying with gis flow");
        new hu(this.b.d).f(ei0Var, this.e, this.d, this.c);
    }
}
