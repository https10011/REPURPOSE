package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class gc3 implements ServiceConnection, ff, gf {
    public volatile boolean a;
    public volatile r23 b;
    public final /* synthetic */ lc3 c;

    public gc3(lc3 lc3Var) {
        this.c = lc3Var;
    }

    @Override // defpackage.gf
    public final void a(ConnectionResult connectionResult) {
        lc3 lc3Var = this.c;
        t53 t53Var = ((y53) lc3Var.a).i;
        y53.l(t53Var);
        t53Var.J();
        c33 c33Var = ((y53) lc3Var.a).f;
        if (c33Var == null || !c33Var.b) {
            c33Var = null;
        }
        if (c33Var != null) {
            c33Var.a0.b(connectionResult, "Service connection failed");
        }
        synchronized (this) {
            this.a = false;
            this.b = null;
        }
        t53 t53Var2 = ((y53) this.c.a).i;
        y53.l(t53Var2);
        t53Var2.N(new z83(8, this, connectionResult));
    }

    @Override // defpackage.ff
    public final void d(int i) {
        y53 y53Var = (y53) this.c.a;
        t53 t53Var = y53Var.i;
        y53.l(t53Var);
        t53Var.J();
        c33 c33Var = y53Var.f;
        y53.l(c33Var);
        c33Var.Z.a("Service connection suspended");
        t53 t53Var2 = y53Var.i;
        y53.l(t53Var2);
        t53Var2.N(new aj2(this, 4));
    }

    @Override // defpackage.ff
    public final void e() {
        t53 t53Var = ((y53) this.c.a).i;
        y53.l(t53Var);
        t53Var.J();
        synchronized (this) {
            try {
                gu2.o(this.b);
                n13 n13Var = (n13) this.b.l();
                t53 t53Var2 = ((y53) this.c.a).i;
                y53.l(t53Var2);
                t53Var2.N(new wb3(this, n13Var, 1));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.b = null;
                this.a = false;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        t53 t53Var = ((y53) this.c.a).i;
        y53.l(t53Var);
        t53Var.J();
        synchronized (this) {
            int i = 0;
            if (iBinder == null) {
                this.a = false;
                c33 c33Var = ((y53) this.c.a).f;
                y53.l(c33Var);
                c33Var.f.a("Service connected with null binder");
                return;
            }
            n13 i13Var = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    i13Var = iInterfaceQueryLocalInterface instanceof n13 ? (n13) iInterfaceQueryLocalInterface : new i13(iBinder);
                    c33 c33Var2 = ((y53) this.c.a).f;
                    y53.l(c33Var2);
                    c33Var2.a0.a("Bound to IMeasurementService interface");
                } else {
                    c33 c33Var3 = ((y53) this.c.a).f;
                    y53.l(c33Var3);
                    c33Var3.f.b(interfaceDescriptor, "Got binder with a wrong descriptor");
                }
            } catch (RemoteException unused) {
                c33 c33Var4 = ((y53) this.c.a).f;
                y53.l(c33Var4);
                c33Var4.f.a("Service connect failed to get IMeasurementService");
            }
            if (i13Var == null) {
                this.a = false;
                try {
                    yq yqVarB = yq.b();
                    lc3 lc3Var = this.c;
                    yqVarB.c(((y53) lc3Var.a).a, lc3Var.c);
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                t53 t53Var2 = ((y53) this.c.a).i;
                y53.l(t53Var2);
                t53Var2.N(new wb3(this, i13Var, i));
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        y53 y53Var = (y53) this.c.a;
        t53 t53Var = y53Var.i;
        y53.l(t53Var);
        t53Var.J();
        c33 c33Var = y53Var.f;
        y53.l(c33Var);
        c33Var.Z.a("Service disconnected");
        t53 t53Var2 = y53Var.i;
        y53.l(t53Var2);
        t53Var2.N(new z83(6, this, componentName));
    }
}
