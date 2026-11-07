package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class yf3 {
    public static final Object g = new Object();
    public static yf3 h;
    public static HandlerThread i;
    public final HashMap a = new HashMap();
    public final Context b;
    public volatile th2 c;
    public final yq d;
    public final long e;
    public final long f;

    public yf3(Context context, Looper looper) {
        qi0 qi0Var = new qi0(this, 3);
        this.b = context.getApplicationContext();
        th2 th2Var = new th2(looper, qi0Var);
        Looper.getMainLooper();
        this.c = th2Var;
        this.d = yq.b();
        this.e = 5000L;
        this.f = 300000L;
    }

    public static yf3 a(Context context) {
        synchronized (g) {
            try {
                if (h == null) {
                    h = new yf3(context.getApplicationContext(), context.getMainLooper());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return h;
    }

    public final ConnectionResult b(yb3 yb3Var, kz2 kz2Var, String str, Executor executor) {
        ConnectionResult connectionResultA;
        HashMap map = this.a;
        synchronized (map) {
            try {
                ld3 ld3Var = (ld3) map.get(yb3Var);
                if (executor == null) {
                    executor = null;
                }
                if (ld3Var == null) {
                    ld3Var = new ld3(this, yb3Var);
                    ld3Var.a.put(kz2Var, kz2Var);
                    connectionResultA = ld3Var.a(str, executor);
                    map.put(yb3Var, ld3Var);
                } else {
                    this.c.removeMessages(0, yb3Var);
                    if (ld3Var.a.containsKey(kz2Var)) {
                        String string = yb3Var.toString();
                        StringBuilder sb = new StringBuilder(string.length() + 81);
                        sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                        sb.append(string);
                        throw new IllegalStateException(sb.toString());
                    }
                    ld3Var.a.put(kz2Var, kz2Var);
                    int i2 = ld3Var.b;
                    if (i2 == 1) {
                        kz2Var.onServiceConnected(ld3Var.f, ld3Var.d);
                    } else if (i2 == 2) {
                        connectionResultA = ld3Var.a(str, executor);
                    }
                    connectionResultA = null;
                }
                if (ld3Var.c) {
                    return ConnectionResult.f;
                }
                if (connectionResultA == null) {
                    connectionResultA = new ConnectionResult(-1, (PendingIntent) null, (String) null);
                }
                return connectionResultA;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(String str, ServiceConnection serviceConnection, boolean z) {
        yb3 yb3Var = new yb3(str, z);
        gu2.p(serviceConnection, "ServiceConnection must not be null");
        HashMap map = this.a;
        synchronized (map) {
            try {
                ld3 ld3Var = (ld3) map.get(yb3Var);
                if (ld3Var == null) {
                    String string = yb3Var.toString();
                    StringBuilder sb = new StringBuilder(string.length() + 50);
                    sb.append("Nonexistent connection status for service config: ");
                    sb.append(string);
                    throw new IllegalStateException(sb.toString());
                }
                if (!ld3Var.a.containsKey(serviceConnection)) {
                    String string2 = yb3Var.toString();
                    StringBuilder sb2 = new StringBuilder(string2.length() + 76);
                    sb2.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                    sb2.append(string2);
                    throw new IllegalStateException(sb2.toString());
                }
                ld3Var.a.remove(serviceConnection);
                if (ld3Var.a.isEmpty()) {
                    this.c.sendMessageDelayed(this.c.obtainMessage(0, yb3Var), this.e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
