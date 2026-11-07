package defpackage;

import com.google.firebase.auth.FirebaseAuth;
import java.util.Iterator;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class zm3 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ FirebaseAuth b;

    public zm3(FirebaseAuth firebaseAuth) {
        this.b = firebaseAuth;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        FirebaseAuth firebaseAuth = this.b;
        switch (i) {
            case 0:
                Iterator it = firebaseAuth.c.iterator();
                if (it.hasNext()) {
                    throw y00.i(it);
                }
                return;
            default:
                Iterator it2 = firebaseAuth.d.iterator();
                if (it2.hasNext()) {
                    throw y00.i(it2);
                }
                Iterator it3 = firebaseAuth.b.iterator();
                if (it3.hasNext()) {
                    throw y00.i(it3);
                }
                return;
        }
    }

    public zm3(FirebaseAuth firebaseAuth, kr0 kr0Var) {
        this.b = firebaseAuth;
    }
}
