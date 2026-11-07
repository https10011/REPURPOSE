package defpackage;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException;
import com.google.android.gms.common.GooglePlayServicesMissingManifestValueException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class mg2 extends pw0 implements DialogInterface.OnCancelListener {
    public volatile boolean a;
    public final AtomicReference b;
    public final th2 c;
    public final qj0 d;
    public final ob e;
    public final uj0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mg2(tw0 tw0Var, uj0 uj0Var) {
        super(tw0Var);
        qj0 qj0Var = qj0.e;
        this.b = new AtomicReference(null);
        this.c = new th2(Looper.getMainLooper(), 0);
        this.d = qj0Var;
        this.e = new ob(0);
        this.f = uj0Var;
        this.mLifecycleFragment.a("ConnectionlessLifecycleHelper", this);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.gms.common.GooglePlayServicesMissingManifestValueException */
    @Override // defpackage.pw0
    public final void onActivityResult(int i, int i2, Intent intent) throws GooglePlayServicesMissingManifestValueException, GooglePlayServicesIncorrectManifestValueException {
        AtomicReference atomicReference = this.b;
        sh2 sh2Var = (sh2) atomicReference.get();
        uj0 uj0Var = this.f;
        if (i != 1) {
            if (i == 2) {
                int iC = this.d.c(getActivity(), rj0.a);
                if (iC == 0) {
                    atomicReference.set(null);
                    th2 th2Var = uj0Var.n;
                    th2Var.sendMessage(th2Var.obtainMessage(3));
                    return;
                } else {
                    if (sh2Var == null) {
                        return;
                    }
                    if (sh2Var.b.b == 18 && iC == 18) {
                        return;
                    }
                }
            }
        } else if (i2 == -1) {
            atomicReference.set(null);
            th2 th2Var2 = uj0Var.n;
            th2Var2.sendMessage(th2Var2.obtainMessage(3));
            return;
        } else if (i2 == 0) {
            if (sh2Var != null) {
                ConnectionResult connectionResult = new ConnectionResult(intent != null ? intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13) : 13, (PendingIntent) null, sh2Var.b.toString());
                int i3 = sh2Var.a;
                atomicReference.set(null);
                uj0Var.i(connectionResult, i3);
                return;
            }
            return;
        }
        if (sh2Var != null) {
            ConnectionResult connectionResult2 = sh2Var.b;
            int i4 = sh2Var.a;
            atomicReference.set(null);
            uj0Var.i(connectionResult2, i4);
        }
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        ConnectionResult connectionResult = new ConnectionResult(13, (PendingIntent) null, (String) null);
        AtomicReference atomicReference = this.b;
        sh2 sh2Var = (sh2) atomicReference.get();
        int i = sh2Var == null ? -1 : sh2Var.a;
        atomicReference.set(null);
        this.f.i(connectionResult, i);
    }

    @Override // defpackage.pw0
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.b.set(bundle.getBoolean("resolving_error", false) ? new sh2(new ConnectionResult(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution"), (String) null), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    @Override // defpackage.pw0
    public final void onResume() {
        super.onResume();
        if (this.e.isEmpty()) {
            return;
        }
        this.f.f(this);
    }

    @Override // defpackage.pw0
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        sh2 sh2Var = (sh2) this.b.get();
        if (sh2Var == null) {
            return;
        }
        ConnectionResult connectionResult = sh2Var.b;
        bundle.putBoolean("resolving_error", true);
        bundle.putInt("failed_client_id", sh2Var.a);
        bundle.putInt("failed_status", connectionResult.b);
        bundle.putParcelable("failed_resolution", connectionResult.c);
    }

    @Override // defpackage.pw0
    public final void onStart() {
        super.onStart();
        this.a = true;
        if (this.e.isEmpty()) {
            return;
        }
        this.f.f(this);
    }

    @Override // defpackage.pw0
    public final void onStop() {
        this.a = false;
        uj0 uj0Var = this.f;
        uj0Var.getClass();
        synchronized (uj0.r) {
            try {
                if (uj0Var.k == this) {
                    uj0Var.k = null;
                    uj0Var.l.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
