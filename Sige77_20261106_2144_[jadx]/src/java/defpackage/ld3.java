package defpackage;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.StrictMode;
import com.google.android.gms.common.ConnectionResult;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class ld3 implements ServiceConnection {
    public final HashMap a = new HashMap();
    public int b = 2;
    public boolean c;
    public IBinder d;
    public final yb3 e;
    public ComponentName f;
    public final /* synthetic */ yf3 i;

    public ld3(yf3 yf3Var, yb3 yb3Var) {
        this.i = yf3Var;
        this.e = yb3Var;
    }

    public final ConnectionResult a(String str, Executor executor) {
        try {
            Intent intentA = fp2.a(this.i.b, this.e);
            this.b = 3;
            StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
            if (Build.VERSION.SDK_INT >= 31) {
                StrictMode.setVmPolicy(gw2.a(new StrictMode.VmPolicy.Builder(vmPolicy)).build());
            }
            try {
                yf3 yf3Var = this.i;
                yq yqVar = yf3Var.d;
                Context context = yf3Var.b;
                yb3 yb3Var = this.e;
                boolean zD = yqVar.d(context, str, intentA, this, 4225, executor);
                this.c = zD;
                if (zD) {
                    yf3Var.c.sendMessageDelayed(yf3Var.c.obtainMessage(1, yb3Var), yf3Var.f);
                    return ConnectionResult.f;
                }
                this.b = 2;
                try {
                    yf3Var.d.c(yf3Var.b, this);
                } catch (IllegalArgumentException unused) {
                }
                return new ConnectionResult(16, (PendingIntent) null, (String) null);
            } finally {
                StrictMode.setVmPolicy(vmPolicy);
            }
        } catch (kn2 e) {
            return e.a;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        yf3 yf3Var = this.i;
        synchronized (yf3Var.a) {
            try {
                yf3Var.c.removeMessages(1, this.e);
                this.d = iBinder;
                this.f = componentName;
                Iterator it = this.a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.b = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        yf3 yf3Var = this.i;
        synchronized (yf3Var.a) {
            try {
                yf3Var.c.removeMessages(1, this.e);
                this.d = null;
                this.f = componentName;
                Iterator it = this.a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.b = 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
