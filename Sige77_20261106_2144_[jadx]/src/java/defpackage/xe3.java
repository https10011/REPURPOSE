package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.util.Log;
import android.util.SparseArray;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class xe3 implements ServiceConnection {
    public int a = 0;
    public final Messenger b;
    public f91 c;
    public final ArrayDeque d;
    public final SparseArray e;
    public final /* synthetic */ ll3 f;

    public xe3(ll3 ll3Var) {
        this.f = ll3Var;
        th2 th2Var = new th2(Looper.getMainLooper(), new qi0(this, 2));
        Looper.getMainLooper();
        this.b = new Messenger(th2Var);
        this.d = new ArrayDeque();
        this.e = new SparseArray();
    }

    public final synchronized void a(String str) {
        b(str, null);
    }

    public final synchronized void b(String str, SecurityException securityException) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Disconnected: ".concat(String.valueOf(str)));
            }
            int i = this.a;
            if (i == 0) {
                throw new IllegalStateException();
            }
            if (i != 1 && i != 2) {
                if (i != 3) {
                    return;
                }
                this.a = 4;
                return;
            }
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Unbinding service");
            }
            this.a = 4;
            yq.b().c((Context) this.f.b, this);
            nc0 nc0Var = new nc0(str, securityException);
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                ((xg3) it.next()).b(nc0Var);
            }
            this.d.clear();
            int i2 = 0;
            while (true) {
                int size = this.e.size();
                SparseArray sparseArray = this.e;
                if (i2 >= size) {
                    sparseArray.clear();
                    return;
                } else {
                    ((xg3) sparseArray.valueAt(i2)).b(nc0Var);
                    i2++;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c() {
        try {
            if (this.a == 2 && this.d.isEmpty() && this.e.size() == 0) {
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
                }
                this.a = 3;
                yq.b().c((Context) this.f.b, this);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean d(xg3 xg3Var) {
        int i = this.a;
        int i2 = 1;
        if (i != 0) {
            if (i == 1) {
                this.d.add(xg3Var);
                return true;
            }
            int i3 = 0;
            if (i != 2) {
                return false;
            }
            this.d.add(xg3Var);
            ((ScheduledExecutorService) this.f.c).execute(new d73(this, i3));
            return true;
        }
        this.d.add(xg3Var);
        if (this.a != 0) {
            throw new IllegalStateException();
        }
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Starting bind to GmsCore");
        }
        this.a = 1;
        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent.setPackage("com.google.android.gms");
        try {
            if (yq.b().a((Context) this.f.b, intent, this, 1)) {
                ((ScheduledExecutorService) this.f.c).schedule(new d73(this, i2), 30L, TimeUnit.SECONDS);
            } else {
                a("Unable to bind to service");
            }
        } catch (SecurityException e) {
            b("Unable to bind to service", e);
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        ((ScheduledExecutorService) this.f.c).execute(new bh0(26, this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        int i = 2;
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        ((ScheduledExecutorService) this.f.c).execute(new d73(this, i));
    }
}
