package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import java.io.Serializable;
import java.util.Objects;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class mc implements ServiceConnection {
    public final /* synthetic */ int a;
    public final Serializable b;
    public final Object c;

    public mc() {
        this.a = 0;
        this.b = new AtomicBoolean(false);
        this.c = new LinkedBlockingDeque();
    }

    public IBinder a() throws InterruptedException {
        if (!((AtomicBoolean) this.b).compareAndSet(false, true)) {
            uq1.q("Binder already consumed");
            return null;
        }
        Object objTake = ((LinkedBlockingDeque) this.c).take();
        objTake.getClass();
        return (IBinder) objTake;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        switch (this.a) {
            case 0:
                if (iBinder != null) {
                    try {
                        ((LinkedBlockingDeque) this.c).put(iBinder);
                    } catch (InterruptedException unused) {
                        i90 i90Var = i90.a;
                        return;
                    }
                }
                break;
            default:
                gk1 gk1Var = (gk1) this.c;
                if (iBinder == null) {
                    c33 c33Var = ((y53) gk1Var.b).f;
                    y53.l(c33Var);
                    c33Var.w.a("Install Referrer connection returned with null binder");
                } else {
                    try {
                        int i = kv2.a;
                        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
                        nv2 iv2Var = iInterfaceQueryLocalInterface instanceof nv2 ? (nv2) iInterfaceQueryLocalInterface : new iv2(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService", 4);
                        y53 y53Var = (y53) gk1Var.b;
                        c33 c33Var2 = y53Var.f;
                        y53.l(c33Var2);
                        c33Var2.a0.a("Install Referrer Service connected");
                        t53 t53Var = y53Var.i;
                        y53.l(t53Var);
                        t53Var.N(new bh0(this, iv2Var, this));
                    } catch (RuntimeException e) {
                        c33 c33Var3 = ((y53) gk1Var.b).f;
                        y53.l(c33Var3);
                        c33Var3.w.b(e, "Exception occurred while calling Install Referrer API");
                        return;
                    }
                }
                break;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        switch (this.a) {
            case 0:
                break;
            default:
                c33 c33Var = ((y53) ((gk1) this.c).b).f;
                y53.l(c33Var);
                c33Var.a0.a("Install Referrer Service disconnected");
                break;
        }
    }

    public mc(gk1 gk1Var, String str) {
        this.a = 1;
        Objects.requireNonNull(gk1Var);
        this.c = gk1Var;
        this.b = str;
    }

    private final void b(ComponentName componentName) {
    }
}
