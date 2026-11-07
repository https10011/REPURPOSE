package defpackage;

import android.app.PendingIntent;
import android.os.DeadObjectException;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import java.util.Map;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class fh2 extends mh2 {
    public final oi2 b;

    public fh2(oi2 oi2Var) {
        super(1);
        this.b = oi2Var;
    }

    @Override // defpackage.mh2
    public final void a(Status status) {
        try {
            this.b.g(status);
        } catch (IllegalStateException e) {
            Log.w("ApiCallRunner", "Exception reporting failure", e);
        }
    }

    @Override // defpackage.mh2
    public final void b(Exception exc) {
        String simpleName = exc.getClass().getSimpleName();
        String localizedMessage = exc.getLocalizedMessage();
        try {
            this.b.g(new Status(10, y00.l(new StringBuilder(simpleName.length() + 2 + String.valueOf(localizedMessage).length()), simpleName, ": ", localizedMessage), (PendingIntent) null, (ConnectionResult) null));
        } catch (IllegalStateException e) {
            Log.w("ApiCallRunner", "Exception reporting failure", e);
        }
    }

    @Override // defpackage.mh2
    public final void c(md2 md2Var, boolean z) {
        Boolean boolValueOf = Boolean.valueOf(z);
        Map map = (Map) md2Var.a;
        oi2 oi2Var = this.b;
        map.put(oi2Var, boolValueOf);
        oi2Var.a(new uh2(md2Var, oi2Var));
    }

    @Override // defpackage.mh2
    public final void d(rg2 rg2Var) throws DeadObjectException {
        try {
            oi2 oi2Var = this.b;
            nj0 nj0Var = rg2Var.b;
            oi2Var.getClass();
            try {
                oi2Var.f(nj0Var);
            } catch (DeadObjectException e) {
                oi2Var.g(new Status(8, e.getLocalizedMessage(), (PendingIntent) null, (ConnectionResult) null));
                throw e;
            } catch (RemoteException e2) {
                oi2Var.g(new Status(8, e2.getLocalizedMessage(), (PendingIntent) null, (ConnectionResult) null));
            }
        } catch (RuntimeException e3) {
            b(e3);
        }
    }
}
