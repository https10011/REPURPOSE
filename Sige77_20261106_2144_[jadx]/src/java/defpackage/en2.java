package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.firebase-auth-api.zzahd;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.FirebaseUser;
import java.util.ArrayList;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class en2 {
    public final int a;
    public final kj0 b = new kj0(this, 26);
    public hc0 c;
    public FirebaseUser d;
    public c73 e;
    public cu2 f;
    public yd2 g;
    public zzahd h;
    public zo2 i;
    public AuthCredential j;
    public p11 k;
    public kp2 l;
    public boolean m;

    public en2(int i) {
        new ArrayList();
        this.a = i;
    }

    public abstract String a();

    public final void b(hc0 hc0Var) {
        gu2.p(hc0Var, "firebaseApp cannot be null");
        this.c = hc0Var;
    }

    public final void c(Status status) {
        this.m = true;
        this.g.v(null, status);
    }

    public abstract void d(TaskCompletionSource taskCompletionSource, gm2 gm2Var);

    public abstract void e();

    public final void f(Object obj) {
        this.m = true;
        this.g.v(obj, null);
    }
}
