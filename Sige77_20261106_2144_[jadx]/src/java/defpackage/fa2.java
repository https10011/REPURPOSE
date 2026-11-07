package defpackage;

import android.os.Binder;
import android.os.Process;
import android.util.Log;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class fa2 extends Binder {
    public final kj0 a;

    public fa2(kj0 kj0Var) {
        this.a = kj0Var;
    }

    public final void a(ga2 ga2Var) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "service received new intent via bind strategy");
        }
        ((z60) this.a.b).b(ga2Var.a).addOnCompleteListener(new w21(), new ab(ga2Var, 21));
    }
}
