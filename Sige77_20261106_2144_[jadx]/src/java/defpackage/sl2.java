package defpackage;

import com.google.firebase.auth.FirebaseAuth;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class sl2 implements fr0 {
    public final hc0 a;
    public final zd1 b;
    public final zd1 c;
    public final Executor d;
    public final Executor e;
    public final Executor f;
    public final Executor g;
    public final ConcurrentHashMap h = new ConcurrentHashMap();

    public sl2(hc0 hc0Var, zd1 zd1Var, zd1 zd1Var2, Executor executor, Executor executor2, Executor executor3, ScheduledExecutorService scheduledExecutorService, Executor executor4) {
        this.a = hc0Var;
        this.b = zd1Var;
        this.c = zd1Var2;
        this.d = executor;
        this.e = executor2;
        this.f = executor3;
        this.g = executor4;
    }

    public final synchronized FirebaseAuth a() {
        if (this.h.containsKey("default")) {
            FirebaseAuth firebaseAuth = (FirebaseAuth) this.h.get("default");
            if (firebaseAuth != null) {
                return firebaseAuth;
            }
            this.h.remove("default");
        }
        if (!this.h.isEmpty()) {
            throw new IllegalStateException("FirebaseAuth instance has already been instantiated with different configuration.");
        }
        bk2 bk2Var = new bk2(this.a, this.b, this.e, this.f, this.g);
        this.h.put("default", bk2Var);
        return bk2Var;
    }
}
