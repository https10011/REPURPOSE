package defpackage;

import android.os.CancellationSignal;
import android.util.Log;
import android.view.View;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.fragment.app.e;
import com.google.android.gms.tasks.OnFailureListener;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final /* synthetic */ class uu implements OnFailureListener, qk {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ uu(Object obj, Object obj2, Object obj3, Object obj4) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
    }

    @Override // defpackage.qk
    public void onCancel() {
        View view = (View) this.a;
        a00 a00Var = (a00) this.b;
        wz wzVar = (wz) this.c;
        ms1 ms1Var = (ms1) this.d;
        view.clearAnimation();
        a00Var.a.endViewTransition(view);
        wzVar.h();
        if (e.H(2)) {
            Log.v("FragmentManager", "Animation from operation " + ms1Var + " has been cancelled.");
        }
    }

    public void onFailure(Exception exc) {
        CredentialProviderPlayServicesImpl.$r8$lambda$KPnyPsbzUo0kEQwputkdgA68I1Y((CredentialProviderPlayServicesImpl) this.a, (CancellationSignal) this.b, (Executor) this.c, (cu) this.d, exc);
    }
}
